using System;
using System.Collections.Generic;
using System.Linq;
using System.Net.Sockets;
using System.Text;

using RustedWarfareClient.Models;

using static RustedWarfareClient.PacketUtils;

namespace RustedWarfareClient
{
    internal class Program
    {
        public static void Main()
        {
            Socket socket = new(SocketType.Stream, ProtocolType.Tcp);
            socket.Connect("188.235.146.172", 5123);

            SendPreregisterConnection(socket, new PreregisterPacketTemplate("1dNDN"));
            var registered = ReceiveRegisterConnection(socket);

            socket.Close();
        }

        private static RegisterPacketTemplate ReceiveRegisterConnection(Socket socket)
        {
            List<byte> bytes = new();
            byte[] buffer = new byte[1024];
            do
            {
                socket.Receive(buffer, buffer.Length, 0);
                bytes.AddRange(buffer);
            } while (socket.Available > 0);

            int offset = 0;

            return new RegisterPacketTemplate {
                PayloadSize = ReadIntFromPacket(bytes, ref offset),
                Type = ReadIntFromPacket(bytes, ref offset),
                ServerId = ReadStringFromPacket(bytes, ref offset),
                ProtocolVersion = ReadIntFromPacket(bytes, ref offset),
                GameVersion = ReadIntFromPacket(bytes, ref offset),
                AnotherGameVersion = ReadIntFromPacket(bytes, ref offset),
                PkgName = ReadStringFromPacket(bytes, ref offset),
                ConnectUuid = ReadStringFromPacket(bytes, ref offset),
                Key = ReadIntFromPacket(bytes, ref offset)
            };
        }

        private static void SendPreregisterConnection(Socket socket, PreregisterPacketTemplate template )
        {
            List<byte> bytes = new();
            int countStringHeaderBytes = 0;

            WriteStringToPacket(ref bytes, template.PackageName, ref countStringHeaderBytes);
            WriteIntToPacket(ref bytes, template.ProtocolVersion);
            WriteIntToPacket(ref bytes, template.GameVersion);
            WriteIntToPacket(ref bytes, template.AnotherGameVersion);
            bytes.Add(0);
            WriteStringToPacket(ref bytes, template.Nickname, ref countStringHeaderBytes);

            socket.Send(CreatePacket(PacketType.PACKET_PREREGISTER_CONNECTION, bytes, countStringHeaderBytes));
        }
    }
}