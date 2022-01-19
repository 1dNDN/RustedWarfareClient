using System.Collections.Generic;

using RustedWarfareLib.Models;

namespace RustedWarfareLib.Packets
{
    public class AcceptStartGamePacket : Packet
    {
        public AcceptStartGamePacket() : base(PacketType.PACKET_ACCEPT_START_GAME)
        {
        }

        public AcceptStartGamePacket(List<byte> payload) : base(payload)
        {
            Flag = ReadShort();
        }

        public override byte[] ToBytesArray()
        {
            Write(Flag);
            WriteLength();
            return Payload.ToArray();
        }

        public short Flag = 1;
    }
}
