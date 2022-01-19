using System;
using System.Collections.Generic;

using RustedWarfareLib.Models;

namespace RustedWarfareLib.Packets
{
    public class ServerInfoPacket : Packet
    {
        public ServerInfoPacket() : base(PacketType.PACKET_SERVER_INFO)
        {
        }

        public ServerInfoPacket(List<byte> payload) : base(payload)
        {
            PackageName = ReadString();
            GameVersion = ReadInt();
            MapType = ReadInt();
            MapName = ReadString();
            Credits = ReadInt();
            FogOfWar = ReadInt();
            unknownFlag = ReadBool();
            unknownInt = ReadInt();
            unknownByte = ReadByte();
            unknownFlag2 = ReadBool();
            IsAdmin = ReadBool();
            UnitLimit = ReadInt();
            AnotherUnitLimit = ReadInt();
            StartingUnits = ReadInt();
            Income = ReadInt();
            IsNoNuke = ReadBool();
            unknownFlag3 = ReadBool();
            haveUnitFata = ReadBool();
            if (haveUnitFata)
            {
                UnitGzipHead = ReadString();
                int lengthUnitGzipBlob = ReadInt();
                UnitGzipBlob = ReadBytes(lengthUnitGzipBlob);
            }

            IsSharedControl = ReadBool();
            unknownFlag4 = ReadBool();
            unknownFlag5 = ReadBool();
            unknownFlag6 = ReadBool();
            unknownFlag7 = ReadBool();
        }

        public override byte[] ToBytesArray()
        {
            Write(PackageName);
            Write(GameVersion);
            Write(MapType);
            Write(MapName);
            Write(Credits);
            Write(FogOfWar);
            Write(unknownFlag);
            Write(unknownInt);
            Write(unknownByte);
            Write(unknownFlag2);
            Write(IsAdmin);
            Write(UnitLimit);
            Write(AnotherUnitLimit);
            Write(StartingUnits);
            Write(Income);
            Write(IsNoNuke);
            Write(unknownFlag3);
            Write(haveUnitFata);
            if (haveUnitFata)
            {
                Write(UnitGzipHead);
                Write(UnitGzipBlob.Length);
                Write(UnitGzipBlob);
            }

            Write(IsSharedControl);
            Write(unknownFlag4);
            Write(unknownFlag5);
            Write(unknownFlag6);
            Write(unknownFlag7);
            WriteLength();
            return Payload.ToArray();
        }

        public string PackageName { get; set; } = "com.corrodinggames.rts";

        public int GameVersion { get; set; } = 160;

        public int MapType { get; set; }

        public string MapName { get; set; } = "";
        
        public int Credits { get; set; }

        public int FogOfWar { get; set; } = 2;

        private readonly bool unknownFlag = true;

        private readonly int unknownInt = 1;

        private readonly byte unknownByte = 7;

        private readonly bool unknownFlag2;

        public bool IsAdmin { get; set; }

        public int UnitLimit { get; set; } = 1000;

        public int AnotherUnitLimit { get; set; } = 1000;

        public int StartingUnits { get; set; } = 1;

        public float Income { get; set; } = 1;

        public bool IsNoNuke { get; set; }

        private readonly bool unknownFlag3;
        private readonly bool haveUnitFata;

        private string UnitGzipHead { get; } = string.Empty;

        private byte[] UnitGzipBlob { get; } = Array.Empty<byte>();

        public bool IsSharedControl { get; set; }

        private readonly bool unknownFlag4;
        private readonly bool unknownFlag5;
        private readonly bool unknownFlag6 = true;
        private readonly bool unknownFlag7;
    }
}
