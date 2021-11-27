using System.Collections.Generic;

using RustedWarfareLib.Models;

namespace RustedWarfareLib.Packets
{
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
        }

        public override byte[] ToBytesArray()
        {
            Write(PackageName);
            Write(ProtocolVersion);
            Write(GameVersion);
            Write(AnotherGameVersion);
            if (ProtocolVersion >= 2) WriteIsString(RelayId);
            if (ProtocolVersion >= 3) Write(Nickname);
            WriteLength();
            return Payload.ToArray();
        }

        public string PackageName { get; set; } = "com.corrodinggames.rts";

        public int ProtocolVersion { get; set; } = 3;

        public int GameVersion { get; set; } = 151;

        public int AnotherGameVersion { get; set; } = 1;

        public string RelayId { get; set; } = "";

        public string Nickname { get; set; } = "Unnamed";
    }
}