using RustedWarfareLib.Models;

namespace RustedWarfareLib.Packets;

public class DisconnectPacket : Packet
{
    public DisconnectPacket() : this("exited")
    {
    }

    public DisconnectPacket(string message) : base(PacketType.PACKET_DISCONNECT)
    {
        Message = message;
    }

    public DisconnectPacket(List<byte> payload) : base(payload)
    {
        Message = ReadString();
    }

    private string Message { get; }

    public override byte[] ToBytesArray()
    {
        Write(Message);
        WriteLength();
        return Payload.ToArray();
    }
}