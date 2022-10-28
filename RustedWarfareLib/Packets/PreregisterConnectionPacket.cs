using RustedWarfareLib.Models;

namespace RustedWarfareLib.Packets;

/*
 * Send initial packet to server, start handshake with server
 * Trigger conditions : Not
 * Send : Packet-160
 */
public class PreregisterConnectionPacket : Packet
{
    public PreregisterConnectionPacket() : base(PacketType.PACKET_PREREGISTER_CONNECTION)
    {
    }

    public PreregisterConnectionPacket(List<byte> payload) : base(payload)
    {
        PackageName = ReadString();
        ProtocolVersion = ReadInt();
        GameVersion = ReadInt();
        AnotherGameVersion = ReadInt();
        RelayId = ReadString();
        Nickname = ReadString();
        Locale = ReadString();
        SteamMisc = ReadString();
    }

    public string PackageName { get; set; } = "com.corrodinggames.rts";

    public int ProtocolVersion { get; set; } = 4;

    public int GameVersion { get; set; } = 173;

    public int AnotherGameVersion { get; set; } = 2;

    public string RelayId { get; set; } = string.Empty;

    public string Nickname { get; set; } = "Unnamed";

    public string Locale { get; set; } = "ru";

    public string SteamMisc { get; set; } = string.Empty;

    public override byte[] ToBytesArray()
    {
        Write(PackageName);
        Write(ProtocolVersion);
        Write(GameVersion);
        Write(AnotherGameVersion);
        if (ProtocolVersion >= 2) WriteIsString(RelayId);
        if (ProtocolVersion >= 3) Write(Nickname);
        WriteLength();
        Write(Locale);
        Write(SteamMisc);
        return Payload.ToArray();
    }
}
