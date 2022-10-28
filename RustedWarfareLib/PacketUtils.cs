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

        var t1 = (t1Ratio * serverKey).ToString("0.##############E0", formatInfo);
    
        int GetRatios(int num) =>
            num switch {
                0 => 4000,
                1 => 0,
                2 => 1000,
                3 => 2000,
                4 => 5000,
                5 => 10000,
                6 => 50000,
                7 => 100000,
                8 => 200000,
                _ => 999
            };

        return "c:" + serverKey
                    + "m:" + (serverKey * 87 + 24)
                    + "0:" + GetRatios(0) * 11 * serverKey + 
                    "1:" + (GetRatios(1) * 12 + serverKey) + 
                    "2:" + GetRatios(2) * 13 * serverKey + 
                    "3:" + (GetRatios(3) * 14 + serverKey) + 
                    "4:" + GetRatios(4) * 15 * serverKey + 
                    "5:" + (GetRatios(5) * 16 + serverKey) + 
                    "6:" + GetRatios(6) * 17 * serverKey + 
                    "7:" + GetRatios(7) * 18 * serverKey + 
                    "8:" + GetRatios(8) * 19 * serverKey + 
                    "t1:" + t1 +
                    $"d:{5 * serverKey}";
    }

    public static string ComputeColorForPacket(int color) =>
        $"#{16777215 & color:X6}";
}
