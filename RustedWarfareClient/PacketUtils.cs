using System;
using System.Collections.Generic;
using System.Linq;
using System.Numerics;
using System.Security.Cryptography;
using System.Text;

namespace RustedWarfareClient
{
    public static class PacketUtils
    {
        public static int ReadIntFromPacket(IReadOnlyList<byte> packet, ref int offset)
        {
            byte[] bytes = ReadBytesFromPacket(packet, 4, ref offset).Reverse().ToArray();
            return BitConverter.ToInt32(bytes);
        }

        public static byte[] ReadBytesFromPacket(IReadOnlyList<byte> packet, int count, ref int offset)
        {
            byte[] result = new byte[count];
            for (int i = 0; i < count; i++) result[i] = packet[i + offset];

            offset += count;
            return result;
        }

        public static short ReadInt16FromPacket(IReadOnlyList<byte> packet, ref int offset)
        {
            byte[] bytes = ReadBytesFromPacket(packet, 2, ref offset).Reverse().ToArray();
            return BitConverter.ToInt16(bytes);
        }
        
        public static short ReadLongFromPacket(IReadOnlyList<byte> packet, ref int offset)
        {
            byte[] bytes = ReadBytesFromPacket(packet, 2, ref offset).Reverse().ToArray();
            return BitConverter.ToInt16(bytes);
        }

        public static string ReadStringFromPacket(IReadOnlyList<byte> packet, ref int offset)
        {
            short charCount = ReadInt16FromPacket(packet, ref offset);
            byte[] stringbytes = ReadBytesFromPacket(packet, charCount, ref offset);
            return Encoding.ASCII.GetString(stringbytes);
        }

        public static byte[] CreatePacket(PacketType type, List<byte> payload)
        {
            payload.InsertRange(0, BitConverter.GetBytes((int)type).Reverse());
            payload.InsertRange(0, BitConverter.GetBytes(payload.Count - 4).Reverse());
            return payload.ToArray();
        }

        public static void WriteStringToPacket(ref List<byte> bytes, string str)
        {
            if (str.Length == 0)
            {
                bytes.Add(0);
                return;
            }

            bytes.AddRange(BitConverter.GetBytes((short)str.Length).Reverse());
            bytes.AddRange(Encoding.ASCII.GetBytes(str));
        }

        public static void WriteIsStringToPacket(ref List<byte> bytes, string str)
        {
            if (str.Length == 0 || str == "")
            {
                // Write Boolean False
                bytes.Add(0);
                return;
            }
            // Write Boolean True
            bytes.Add(1);
            
            bytes.AddRange(BitConverter.GetBytes((short)str.Length).Reverse());
            bytes.AddRange(Encoding.ASCII.GetBytes(str));
        }

        public static void WriteIntToPacket(ref List<byte> bytes, int number)
        {
            bytes.AddRange(BitConverter.GetBytes(number).Reverse());
        }

        public static string ComputeSha256Hash(string rawData)
        {
            // Create a SHA256   
            using SHA256 sha256Hash = SHA256.Create();
            // ComputeHash - returns byte array  
            byte[] bytes = sha256Hash.ComputeHash(Encoding.UTF8.GetBytes(rawData));

            // Convert byte array to a string   
            StringBuilder builder = new();
            for (int i = 0; i < bytes.Length; i++) builder.Append(bytes[i].ToString("X2"));
            return builder.ToString();
        }

        public static string ComputeSha256Hash(byte[] rawData)
        {
            // Create a SHA256   
            using SHA256 sha256Hash = SHA256.Create();
            // ComputeHash - returns byte array  
            byte[] bytes = sha256Hash.ComputeHash(rawData);

            // Convert byte array to a string   
            StringBuilder builder = new();
            for (int i = 0; i < bytes.Length; i++) builder.Append(bytes[i].ToString("X2"));
            return builder.ToString();
        }

        public static string ComputeUuidForPacket(string clientUuid, string serverUuid)
        {
            Guid clientGuid = Guid.Parse(clientUuid);
            Console.WriteLine(nameof(clientGuid) + " " + clientGuid);
            Guid serverGuid = Guid.Parse(serverUuid);
            Console.WriteLine(nameof(serverGuid) + " " + serverGuid);
            BigInteger clientNumGuid = new(clientGuid.ToByteArray());
            Console.WriteLine(nameof(clientNumGuid) + " " + clientNumGuid);
            BigInteger serverNumGuid = new(serverGuid.ToByteArray());
            Console.WriteLine(nameof(serverNumGuid) + " " + serverNumGuid);
            BigInteger sumGuid = clientNumGuid + serverNumGuid;
            Console.WriteLine(nameof(sumGuid) + " " + sumGuid);
            string sumGuidHash = ComputeSha256Hash(sumGuid.ToByteArray());
            Console.WriteLine(nameof(sumGuidHash) + " " + sumGuidHash);
            return sumGuidHash;
        }

        public static string ComputeKeyForPacket(int serverKey)
        {
            return $"c:{serverKey}" +
                   $"m:{(serverKey * 87 + 24)}" +
                   $"0:{44000 * serverKey}" +
                   $"1:{serverKey}" +
                   $"2:{13000 * serverKey}" +
                   $"3:{(28000 + serverKey)}" +
                   $"4:{75000 * serverKey}" +
                   $"5:{(160000 + serverKey)}" +
                   $"6:{850000 * serverKey}" +
                   $"t1:{44000 * serverKey}" +
                   $"d:{5 * serverKey}";
        }

        public enum PacketType
        {
            PACKET_SERVER_DEBUG = 2000,

            //Server Commands
            PACKET_REGISTER_CONNECTION = 161,
            PACKET_TEAM_LIST = 115,
            PACKET_HEART_BEAT = 108,
            PACKET_SEND_CHAT = 141,
            PACKET_SERVER_INFO = 106,
            PACKET_KICK = 150,
            PACKET_SYNCCHECKSUM_STATUS = 31,
            PACKET_A = 30,

            //Client Commands
            PACKET_PREREGISTER_CONNECTION = 160,
            PACKET_HEART_BEAT_RESPONSE = 109,
            PACKET_ADD_CHAT = 140,
            PACKET_PLAYER_INFO = 110,
            PACKET_DISCONNECT = 111,
            PACKET_ACCEPT_START_GAME = 112,
            PACKET_ACCEPT_BUTTON_GAME = 20,

            //Game Commands
            PACKET_ADD_GAMECOMMAND = 20,
            PACKET_TICK = 10,
            PACKET_SYNC = 35,
            PACKET_START_GAME = 120,
            PACKET_PASSWD_ERROR = 113
        }
    }
}