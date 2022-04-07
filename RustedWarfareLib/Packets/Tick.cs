using RustedWarfareLib.Models;

namespace RustedWarfareLib.Packets;

public class Tick : Packet
{
    public Tick() : base(PacketType.PACKET_TICK)
    {
    }

    public Tick(List<byte> payload) : base(payload)
    {
        TimeStamp = ReadInt();
        HavePayload = ReadInt();
        if (HavePayload == 1) { }
    }

    public int TimeStamp { get; set; } = 0;

    public int HavePayload { get; set; } = 0;

    public override byte[] ToBytesArray()
    {
        Write(TimeStamp);
        Write(HavePayload);


        WriteLength();
        return Payload.ToArray();
    }
}