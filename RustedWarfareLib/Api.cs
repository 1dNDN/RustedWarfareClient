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

        private void ReceiveThread(object obj)
        {
            CancellationToken token = (CancellationToken)obj;

            while (!token.IsCancellationRequested)
            {
                Thread.Sleep(10);
                
                List<byte> bytes = new();
                byte[] buffer = new byte[1024];
                
                while (socket.Available > 0)
                {
                    socket.Receive(buffer, buffer.Length, 0);
                    bytes.AddRange(buffer);
                }
                
                if(bytes.Count == 0)
                    continue;

                switch (Packet.GetType(bytes.ToArray()))
                {

                    case PacketType.PACKET_UNKNOWN: break;
                    case PacketType.PACKET_SERVER_DEBUG: break;
                    case PacketType.PACKET_REGISTER_CONNECTION: 
                        SendRegisterConnection(bytes);
                        SendPlayerInfo();
                        break;
                    case PacketType.PACKET_TEAM_LIST: break;
                    case PacketType.PACKET_HEART_BEAT: break;
                    case PacketType.PACKET_SEND_CHAT: break;
                    case PacketType.PACKET_SERVER_INFO: break;
                    case PacketType.PACKET_KICK: break;
                    case PacketType.PACKET_SYNCCHECKSUM_STATUS: break;
                    case PacketType.PACKET_A: break;
                    case PacketType.PACKET_PREREGISTER_CONNECTION: break;
                    case PacketType.PACKET_HEART_BEAT_RESPONSE: break;
                    case PacketType.PACKET_ADD_CHAT: break;
                    case PacketType.PACKET_PLAYER_INFO: break;
                    case PacketType.PACKET_DISCONNECT: break;
                    case PacketType.PACKET_ACCEPT_START_GAME: break;
                    case PacketType.PACKET_ACCEPT_BUTTON_GAME: break;
                    case PacketType.PACKET_TICK: break;
                    case PacketType.PACKET_SYNC: break;
                    case PacketType.PACKET_START_GAME: break;
                    case PacketType.PACKET_PASSWD_ERROR: break;
                    default: throw new ArgumentOutOfRangeException();
                }
            }
        }
    }
}