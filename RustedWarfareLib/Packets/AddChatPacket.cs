using RustedWarfareLib.Models;

namespace RustedWarfareLib.Packets;

public class AddChatPacket : Packet
{
    public byte UnknownByte = 0;

    public AddChatPacket() : base(PacketType.PACKET_ADD_CHAT)
    {
    }

    public AddChatPacket(List<byte> payload) : base(payload)
    {
        Message = ReadString();
        UnknownByte = ReadByte();
    }

    public string Message { get; set; } = "";

    public override byte[] ToBytesArray()
    {
        Write(Message);
        Write(UnknownByte);
        WriteLength();
        return Payload.ToArray();
    }
}