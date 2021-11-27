using System;
using System.Collections.Generic;
using System.Linq;

using RustedWarfareLib.Models;

namespace RustedWarfareLib
{
    public abstract partial class Packet
    {
        protected Packet(PacketType type)
        {
            Payload = new List<byte>();
            Write(0);
            Type = type;
            Write((int)type);
        }

        protected Packet(List<byte> payload)
        {
            Payload = payload;

            ReadInt(); //length

            int type = ReadInt();
            if (!Enum.IsDefined(typeof(PacketType), type))
                Type = PacketType.PACKET_UNKNOWN;
            else
                Type = (PacketType)type;
        }

        public static PacketType GetType(byte[] bytes)
        {
            byte[] result = new byte[4];
            for (int i = 0; i < 4; i++) result[i] = bytes[i + 4];
            return (PacketType)BitConverter.ToInt32(result.Reverse().ToArray());
        }

        public abstract byte[] ToBytesArray();

        public List<byte> Payload { get; }

        public int Length => Payload.Count - 8;

        public PacketType Type { get; }

        private int offset;
    }
}