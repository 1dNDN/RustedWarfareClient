using System;
using System.Collections.Generic;

using RustedWarfareLib.Models;

namespace RustedWarfareLib.Packets
{
    public class RegisterConnectionPacket : Packet
    {
        public RegisterConnectionPacket(PacketType type) : base(type)
        {
        }

        public RegisterConnectionPacket(List<byte> payload) : base(payload)
        {
            ServerId = ReadString();
            ProtocolVersion = ReadInt();
            GameVersion = ReadInt();
            AnotherGameVersion = ReadInt();
            PkgName = ReadString();
            ServerUuid = ReadString();
            ServerKey = ReadInt();
        }

        public override byte[] ToBytesArray()
        {
            Write(ServerId);
            Write(ProtocolVersion);
            Write(GameVersion);
            Write(AnotherGameVersion);
            Write(PkgName);
            Write(ServerUuid);
            Write(ServerKey);
            WriteLength();
            return Payload.ToArray();
        }

        public string ServerId { get; set; } = "com.corrodinggames.rts";

        public int ProtocolVersion { get; set; } = 1;

        public int GameVersion { get; set; } = 151;

        public int AnotherGameVersion { get; set; } = 151;

        public string PkgName { get; set; } = "com.corrodinggames.rts.java";

        public string ServerUuid { get; set; } = "";

        public int ServerKey { get; set; }
    }
}