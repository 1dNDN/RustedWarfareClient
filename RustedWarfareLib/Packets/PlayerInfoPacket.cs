using RustedWarfareLib.Models;

namespace RustedWarfareLib.Packets;

/*
 * Registering players with the server
 * Trigger conditions : 161
 * Send : Packet-110
 */
public class PlayerInfoPacket : Packet
{
    private string nickname = "Unnamed";

    public PlayerInfoPacket(string serverUuid, int serverKey, int color) : base(PacketType.PACKET_PLAYER_INFO)
    {
        NetworkServerId = serverUuid;
        ServerKey = serverKey;
        Color = color;
    }

    public PlayerInfoPacket(List<byte> payload) : base(payload)
    {
        PackageName = ReadString();
        ProtocolVersion = ReadInt();
        GameVersion = ReadInt();
        AnotherGameVersion = ReadInt();
        Nickname = ReadString();
        if (ReadBool()) //have password
            Password = ReadString();
        AnotherPackageName = ReadString();
        ReadString(); //uuid sum
        ClientUnitsChecksum = ReadInt();
        ReadString(); //token
        ReadString();
    }

    public string ClientUuid { get; set; } = string.Empty;

    public string NetworkServerId { get; set; } = string.Empty;

    public int ServerKey { get; set; }

    public int Color { get; set; }

    public string PackageName { get; set; } = "com.corrodinggames.rts";

    public int ProtocolVersion { get; set; } = 4;

    public int GameVersion { get; set; } = 173;

    public int AnotherGameVersion { get; set; } = 160;
    
    public string Nickname
    {
        get => nickname;
        set {
            const int maxLength = 20;
            nickname = value[..maxLength];

        }
    }

    public bool HavePassword => !string.IsNullOrWhiteSpace(Password);

    public string Password { get; set; } = string.Empty;

    public string AnotherPackageName { get; set; } = "com.corrodinggames.rts";

    public string UuidSum => PacketUtils.ComputeUuidForPacket(ClientUuid, NetworkServerId);

    public int ClientUnitsChecksum { get; set; } = 1008125362;

    public string IntegrityChecksum => PacketUtils.ComputeKeyForPacket(ServerKey);

    public string ColorHex => PacketUtils.ComputeColorForPacket(Color);

    public override byte[] ToBytesArray()
    {
        Write(PackageName);
        Write(ProtocolVersion);
        Write(GameVersion);
        Write(AnotherGameVersion);
        Write(Nickname);
        Write(HavePassword);
        if (HavePassword)
            Write(Password);
        Write(AnotherPackageName);
        Write(UuidSum);
        Write(ClientUnitsChecksum);
        Write(IntegrityChecksum);
        Write(ColorHex);
        WriteLength();
        return Payload.ToArray();
    }
}
