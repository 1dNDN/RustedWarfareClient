using System;
using System.Collections.Generic;
using System.Net.Sockets;
using System.Threading;

using RustedWarfareLib.Models;

namespace RustedWarfareLib
{
    public partial class Api
    {
        private readonly Socket socket; 
        public string Host { get; set; }

        public int Port { get; set; } = 5123;

        public string Nickname { get; set; } = "";

        public string Password { get; set; } = "";

        public string ServerUuid { get; set; } = "";

        public string ClientUuid { get; set; } = "";
        
        public int ServerKey { get; set; }

        private readonly CancellationTokenSource cancellationTokenSource;

        public Api(string host, int port) : this(host)
        {
            Port = port;
        }
        
        public Api(string host)
        {
            Host = host;
            socket = new Socket(SocketType.Stream, ProtocolType.Tcp);
            cancellationTokenSource = new CancellationTokenSource();
        }

        public void Connect()
        {
            socket.Connect(Host, Port);
            SendPreregisterConnection();
            
            ThreadPool.QueueUserWorkItem(ReceiveThread!, cancellationTokenSource.Token);
        }

        public void Disconnect()
        {
            cancellationTokenSource.Cancel();
            socket.Disconnect(true);
        }
    }
}