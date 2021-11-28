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

        public string ServerUuid { get; private set; } = "";

        public string ClientUuid { get; set; } = "";
        
        public int PlayerPosition { get; private set; }

        public bool IsGameStarted { get; private set; }

        public int MaxPlayers { get; private set; }

        public int FogOfWar { get; private set; }

        public int Credits { get; private set; }

        public int AiDifficulty { get; private set; }

        public int UnitLimit { get; private set; }

        public int AnotherUnitLimit { get; private set; }

        public int StartingUnits { get; private set; }

        public float Income { get; private set; }

        public bool IsNoNuke { get; private set; }

        public bool IsSharedControl { get; private set; }

        public bool IsSuspended { get; private set; }
        
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