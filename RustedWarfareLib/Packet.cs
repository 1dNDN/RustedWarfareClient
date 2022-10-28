using RustedWarfareLib.Models;

namespace RustedWarfareLib;

public abstract partial class Packet
{
    private int offset;

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

        var type = ReadInt();
        if (!Enum.IsDefined(typeof(PacketType), type))
            Type = PacketType.PACKET_UNKNOWN;
        else
            Type = (PacketType)type;
    }

    public List<byte> Payload { get; }

    public int Length => Payload.Count - 8;

    public PacketType Type { get; }

    public static PacketType GetType(byte[] bytes)
    {
        var result = new byte[4];
        for (var i = 0; i < 4; i++) result[i] = bytes[i + 4];
        return (PacketType)BitConverter.ToInt32(result.Reverse().ToArray());
    }

    public abstract byte[] ToBytesArray();
}
