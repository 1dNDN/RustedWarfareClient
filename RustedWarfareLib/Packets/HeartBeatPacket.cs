using RustedWarfareLib.Models;

namespace RustedWarfareLib.Packets;

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

    public long PingNumber { get; set; }

    private byte EndByte { get; } = 0;

    public override byte[] ToBytesArray()
    {
        Write(PingNumber);
        Write(EndByte);
        WriteLength();
        return Payload.ToArray();
    }
}