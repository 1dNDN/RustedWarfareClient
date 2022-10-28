using System.Globalization;
using System.Numerics;
using System.Security.Cryptography;
using System.Text;

using RustedWarfareLib.Models;

namespace RustedWarfareLib;

public static class PacketUtils
{
    public static byte[] CreatePacket(PacketType type, List<byte> payload)
    {
        payload.InsertRange(0, BitConverter.GetBytes((int)type).Reverse());
        payload.InsertRange(0, BitConverter.GetBytes(payload.Count - 4).Reverse());
        return payload.ToArray();
    }

    public static string ComputeSha256Hash(string rawData) =>
        ComputeSha256Hash(Encoding.UTF8.GetBytes(rawData));

    public static string ComputeSha256Hash(byte[] rawData)
    {
        // Create a SHA256   
        using var sha256Hash = SHA256.Create();
        // ComputeHash - returns byte array  
        var bytes = sha256Hash.ComputeHash(rawData);

        // Convert byte array to a string   
        StringBuilder builder = new();
        foreach (var t in bytes)
            builder.Append(t.ToString("X2"));

        return builder.ToString();
    }

    public static string ComputeUuidForPacket(string clientUuid, string serverUuid)
    {
        var clientGuid = Guid.Parse(clientUuid);
        var serverGuid = Guid.Parse(serverUuid);
        BigInteger clientNumGuid = new(clientGuid.ToByteArray());
        BigInteger serverNumGuid = new(serverGuid.ToByteArray());
        var sumGuid = clientNumGuid + serverNumGuid;
        var sumGuidHash = ComputeSha256Hash(sumGuid.ToByteArray());
        return sumGuidHash;
    }

    public static string ComputeKeyForPacket(int serverKey)
    {
        BigInteger t1Ratio = new(44000);
        NumberFormatInfo formatInfo = new() {
            NumberDecimalSeparator = "."
        };

        var t1 = (t1Ratio * serverKey).ToString("E", formatInfo);
        if (t1.Contains("E+00"))
            t1 = t1.Remove(t1.Length - 4, 3);
        else
        {
            t1 = (t1Ratio * serverKey).ToString("E7", formatInfo);
            t1 = t1.Remove(t1.Length - 4, 2);
        }

        return $"c:{serverKey}" +
               $"m:{serverKey * 87 + 24}" +
               $"0:{44000 * serverKey}" +
               $"1:{serverKey}" +
               $"2:{13000 * serverKey}" +
               $"3:{28000 + serverKey}" +
               $"4:{75000 * serverKey}" +
               $"5:{160000 + serverKey}" +
               $"6:{850000 * serverKey}" +
               $"t1:{t1}" +
               $"d:{5 * serverKey}";
    }

    public static string ComputeColorForPacket(int color) =>
        $"#{(16777215&color):X6}";
}
