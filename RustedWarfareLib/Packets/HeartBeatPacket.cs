using System.Collections.Generic;

using RustedWarfareLib.Models;

namespace RustedWarfareLib.Packets
{
    public class HeartBeatPacket : Packet
    {
        public HeartBeatPacket() : base(PacketType.PACKET_HEART_BEAT)
        {
        }

        public HeartBeatPacket(List<byte> payload) : base(payload)
        {
            PingNumber = ReadLong();
            EndByte = ReadByte();
        }

        public override byte[] ToBytesArray()
        {
            Write(PingNumber);
            Write(EndByte);
            WriteLength();
            return Payload.ToArray();
        }

        public long PingNumber { get; set; }

        private byte EndByte { get; set; } = 0;
    }
}
