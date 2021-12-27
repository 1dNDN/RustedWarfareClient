using System.Collections.Generic;

using RustedWarfareLib.Models;

namespace RustedWarfareLib.Packets
{
    public class AddChatPacket : Packet
    {
        public AddChatPacket() : base(PacketType.PACKET_ADD_CHAT)
        {
        }

        public AddChatPacket(List<byte> payload) : base(payload)
        {
            Message = ReadString();
            UnknownByte = ReadByte();
        }

        public override byte[] ToBytesArray()
        {
            Write(Message);
            Write(UnknownByte);
            WriteLength();
            return Payload.ToArray();
        }
        
        public string Message { get; set; } = "";

        public byte UnknownByte = 0;
    }
}
