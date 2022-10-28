using RustedWarfareLib.Models;

namespace RustedWarfareLib.Packets;

public class RegisterConnectionPacket : Packet
{
    public RegisterConnectionPacket() : base(PacketType.PACKET_REGISTER_CONNECTION)
    {
    }

    public RegisterConnectionPacket(List<byte> payload) : base(payload)
    {
        ServerId = ReadString();
        ProtocolVersion = ReadInt();
        GameVersion = ReadInt();
        AnotherGameVersion = ReadInt();
        PkgName = ReadString();
        NetworkServerId = ReadString();
        ServerKey = ReadInt();
        Color = ReadInt();
        Zero = ReadInt();
    }

    public string ServerId { get; set; } = "com.corrodinggames.rts";

    public int ProtocolVersion { get; set; } = 1;

    public int GameVersion { get; set; } = 173;

    public int AnotherGameVersion { get; set; } = 160;

    public string PkgName { get; set; } = "com.corrodinggames.rts.java";

    public string NetworkServerId { get; set; } = string.Empty;

    public int ServerKey { get; set; }
    
    public int Color { get; set; }
    
    private int Zero { get; set; }

    public override byte[] ToBytesArray()
    {
        Write(ServerId);
        Write(ProtocolVersion);
        Write(GameVersion);
        Write(AnotherGameVersion);
        Write(PkgName);
        Write(NetworkServerId);
        Write(ServerKey);
        Write(Color);
        Write(Zero);
        WriteLength();
        return Payload.ToArray();
    }
}
