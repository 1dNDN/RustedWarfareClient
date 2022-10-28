using RustedWarfareLib.Models;

namespace RustedWarfareLib.Packets;

/*
 * Registering players with the server
 * Trigger conditions : 161
 * Send : Packet-110
 */
public class PlayerInfoPacket : Packet
{
    public PlayerInfoPacket(string serverUuid, int serverKey) : base(PacketType.PACKET_PLAYER_INFO)
    {
        NetworkServerId = serverUuid;
        ServerKey = serverKey;
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
        MagicValue = ReadInt();
        ReadString(); //token
    }

    public string ClientUuid { get; set; } = string.Empty;

    public string NetworkServerId { get; set; } = string.Empty;

    public int ServerKey { get; set; }

    public string PackageName { get; set; } = "com.corrodinggames.rts";

    public int ProtocolVersion { get; set; } = 4;

    public int GameVersion { get; set; } = 173;

    public int AnotherGameVersion { get; set; } = 160;

    public string Nickname { get; set; } = "Unnamed";

    public bool HavePassword => !string.IsNullOrWhiteSpace(Password);

    public string Password { get; set; } = string.Empty;

    public string AnotherPackageName { get; set; } = "com.corrodinggames.rts";

    public string UuidSum => PacketUtils.ComputeUuidForPacket(ClientUuid, NetworkServerId);

    public int MagicValue { get; set; } = 1008125362;

    public string Token => PacketUtils.ComputeKeyForPacket(ServerKey);

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
        Write(MagicValue);
        Write(Token);
        WriteLength();
        return Payload.ToArray();
    }
}
