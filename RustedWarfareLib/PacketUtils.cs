using System;
using System.Collections.Generic;
using System.Linq;
using System.Numerics;
using System.Security.Cryptography;
using System.Text;

using RustedWarfareLib.Models;

namespace RustedWarfareLib
{
    public static class PacketUtils
    {
        public static byte[] CreatePacket(PacketType type, List<byte> payload)
        {
            payload.InsertRange(0, BitConverter.GetBytes((int)type).Reverse());
            payload.InsertRange(0, BitConverter.GetBytes(payload.Count - 4).Reverse());
            return payload.ToArray();
        }

        public static string ComputeSha256Hash(string rawData)
        {
            return ComputeSha256Hash(Encoding.UTF8.GetBytes(rawData));
        }

        public static string ComputeSha256Hash(byte[] rawData)
        {
            // Create a SHA256   
            using SHA256 sha256Hash = SHA256.Create();
            // ComputeHash - returns byte array  
            byte[] bytes = sha256Hash.ComputeHash(rawData);

            // Convert byte array to a string   
            StringBuilder builder = new();
            foreach (byte t in bytes)
                builder.Append(t.ToString("X2"));

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
                   $"m:{serverKey * 87 + 24}" +
                   $"0:{44000 * serverKey}" +
                   $"1:{serverKey}" +
                   $"2:{13000 * serverKey}" +
                   $"3:{28000 + serverKey}" +
                   $"4:{75000 * serverKey}" +
                   $"5:{160000 + serverKey}" +
                   $"6:{850000 * serverKey}" +
                   $"t1:{44000 * serverKey}" +
                   $"d:{5 * serverKey}";
        }
    }
}
