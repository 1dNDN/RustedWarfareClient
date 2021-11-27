using System;
using System.Collections.Generic;
using System.Net.Sockets;

using RustedWarfareLib.Models;

using static RustedWarfareLib.PacketUtils;

namespace RustedWarfareLib
{
    public static class Methods
    {
        /**
         * Registering players with the server
         * Trigger conditions : 161
         * Send : Packet-110
         */
        public static void SendPlayerInfo(Socket socket, SendPlayerTemplate template)
        {
            List<byte> bytes = new();
            byte[] randomBytes = new byte[64];
            new Random().NextBytes(randomBytes);

            WriteString(ref bytes, template.PackageName);
            WriteIntToPacket(ref bytes, template.ProtocolVersion);
            WriteIntToPacket(ref bytes, template.GameVersion);
            WriteIntToPacket(ref bytes, template.GameVersion);
            WriteString(ref bytes, template.Nickname);

            if (template.Password == "") { bytes.Add(0); } else
            {
                bytes.Add(1);
                WriteString(ref bytes, ComputeSha256Hash(template.Password).ToUpper());
            }

            WriteString(ref bytes, template.AnotherPackageName);
            WriteString(ref bytes, ComputeUuidForPacket(template.ClientUuid, template.ServerUuid));
            WriteIntToPacket(ref bytes, template.AnotherMagicValue);
            WriteString(ref bytes, template.Token);
            Console.WriteLine(template.Token);
            socket.Send(CreatePacket(PacketType.PACKET_PLAYER_INFO, bytes));
        }

        public static RegisterPacketTemplate ReceiveRegisterConnection(Socket socket)
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
                ServerUuid = ReadStringFromPacket(bytes, ref offset),
                ServerKey = ReadIntFromPacket(bytes, ref offset)
            };
        }

        /**
         * Send initial packet to server, start handshake with server
         * Trigger conditions : Not
         * Send : Packet-160
         */
        public static void SendPreregisterConnection(Socket socket, PreregisterPacketTemplate template)
        {
            List<byte> bytes = new();

            WriteString(ref bytes, template.PackageName);
            WriteIntToPacket(ref bytes, template.ProtocolVersion);
            WriteIntToPacket(ref bytes, template.GameVersion);
            WriteIntToPacket(ref bytes, template.AnotherGameVersion);

            if (template.ProtocolVersion >= 2) WriteIsString(ref bytes, template.RelayID);
            if (template.ProtocolVersion >= 3) WriteString(ref bytes, template.Nickname);

            socket.Send(CreatePacket(PacketType.PACKET_PREREGISTER_CONNECTION, bytes));
        }

        /**
         * Return ping packets to the server, so that the server normal display delay
         * Trigger conditions : Packet-108
         * Send : Packet-109
         */
        public static void SendReturnPingPacket(Socket socket, long time)
        {
            List<byte> bytes = new();

            //TODO Write Long
            /*
             * Long : [Packet-108] -> First eight valid bytes
             * Byte : 1
             * Byte : 60
             */
            bytes.Add(1);
            bytes.Add(60);


            socket.Send(CreatePacket(PacketType.PACKET_HEART_BEAT_RESPONSE, bytes));
        }
    }
}