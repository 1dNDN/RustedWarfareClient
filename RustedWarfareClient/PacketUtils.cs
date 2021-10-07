using System;
using System.Collections.Generic;
using System.Linq;
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
            for (int i = 0; i < count; i++)
            {
                result[i] = packet[i + offset];
            }

            offset += count;
            return result;
        }

        public static short ReadInt16FromPacket(IReadOnlyList<byte> packet, ref int offset)
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

        public static byte[] CreatePacket(PacketType type, List<byte> payload, int countStringHeaderBytes)
        {
            payload.InsertRange(0, BitConverter.GetBytes((int)type).Reverse());
            payload.InsertRange(0, BitConverter.GetBytes(payload.Count - countStringHeaderBytes).Reverse());
            return payload.ToArray();
        }

        public static void WriteStringToPacket(ref List<byte> bytes, string str, ref int countStringHeaderBytes)
        {
            countStringHeaderBytes += 2;
            bytes.AddRange(BitConverter.GetBytes((short)str.Length).Reverse());
            bytes.AddRange(Encoding.ASCII.GetBytes(str));
        }

        public static void WriteIntToPacket(ref List<byte> bytes, int number)
        {
            bytes.AddRange(BitConverter.GetBytes(number).Reverse());
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