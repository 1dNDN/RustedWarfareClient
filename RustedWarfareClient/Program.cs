using System;
using System.Collections.Generic;
using System.Linq;
using System.Net.Sockets;
using System.Text;

using RustedWarfareLib.Models;

using static RustedWarfareLib.Methods;

namespace RustedWarfareClient
{
    internal static class Program
    {
        public static void Main()
        {
            Socket socket = new(SocketType.Stream, ProtocolType.Tcp);
            socket.Connect("192.168.0.100", 5123);
            //socket.Connect("localhost", 5123);
            SendPreregisterConnection(socket, new PreregisterPacketTemplate());
            RegisterPacketTemplate? registered = ReceiveRegisterConnection(socket);
            SendPlayerInfo(socket, new SendPlayerTemplate("1dNDN", registered.ServerKey, registered.ServerUuid));
            byte[] bytes = new byte[4000];
            socket.Receive(bytes);
            
            Console.WriteLine(registered.ServerKey);
            socket.Close();
        }
    }
}