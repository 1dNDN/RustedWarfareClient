using System.Collections.Generic;

using RustedWarfareLib.Models;

namespace RustedWarfareLib.Packets
{
    public class HeartBeatResponsePacket : Packet
    {
        public HeartBeatResponsePacket(long pingNumber) : base(PacketType.PACKET_HEART_BEAT_RESPONSE)
        {
            PingNumber = pingNumber;
        }

        public HeartBeatResponsePacket(List<byte> payload) : base(payload)
        {
            PingNumber = ReadLong();
            unknownByte = ReadByte();
            unknownByte2 = ReadByte();
        }

        public override byte[] ToBytesArray()
        {
            Write(PingNumber);
            Write(unknownByte);
            Write(unknownByte2);
            WriteLength();
            return Payload.ToArray();
        }
        
        public long PingNumber { get; set; }

        private byte unknownByte = 1;
        private byte unknownByte2 = 58;
    }
}
