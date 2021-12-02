using System.Collections.Generic;

using RustedWarfareLib.Models;

namespace RustedWarfareLib.Packets
{
    public class TeamListPacket : Packet
    {
        public TeamListPacket() : base(PacketType.PACKET_TEAM_LIST)
        {
        }

        public TeamListPacket(List<byte> payload) : base(payload)
        {
            PlayerPosition = ReadInt();
            IsGameStarted = ReadBool();
            MaxPlayers = ReadInt();
            TeamGzipHead = ReadString();
            int lengthGzipBlob = ReadInt();
            TeamGzipBlob = ReadBytes(lengthGzipBlob);
            FogOfWar = ReadInt();
            Credits = ReadInt();
            unknownFlag = ReadBool();
            AiDifficulty = ReadInt();
            unknownByte = ReadByte();
            UnitLimit = ReadInt();
            AnotherUnitLimit = ReadInt();
            StartingUnits = ReadInt();
            Income = ReadFloat();
            IsNoNuke = ReadBool();
            unknownByte2 = ReadByte();
            unknownByte3 = ReadByte();
            IsSharedControl = ReadBool();
            IsSuspended = ReadBool();
        }

        public override byte[] ToBytesArray()
        {
            Write(PlayerPosition);
            Write(IsGameStarted);
            Write(MaxPlayers);
            Write(TeamGzipHead);
            Write(TeamGzipBlob.Length);
            Write(TeamGzipBlob);
            Write(FogOfWar);
            Write(Credits);
            Write(unknownFlag);
            Write(AiDifficulty);
            Write(unknownByte);
            Write(UnitLimit);
            Write(AnotherUnitLimit);
            Write(StartingUnits);
            Write(Income);
            Write(IsNoNuke);
            Write(unknownByte2);
            Write(unknownByte3);
            Write(IsSharedControl);
            Write(IsSuspended);
            WriteLength();
            return Payload.ToArray();
        }

        public int PlayerPosition { get; set; } = 1;

        public bool IsGameStarted { get; set; } = false;

        public int MaxPlayers { get; set; } = 10;

        private string TeamGzipHead { get; set; } = "";

        private byte[] TeamGzipBlob { get; set; } = System.Array.Empty<byte>();

        public int FogOfWar { get; set; } = 1;

        public int Credits { get; set; } = 0;

        private bool unknownFlag = true;

        public int AiDifficulty { get; set; } = 1;

        private byte unknownByte = 5;

        public int UnitLimit { get; set; } = 1000;

        public int AnotherUnitLimit { get; set; } = 1000;

        public int StartingUnits { get; set; } = 1;

        public float Income { get; set; } = 1.0F;

        public bool IsNoNuke { get; set; } = false;

        private byte unknownByte2 = 0;
        
        private byte unknownByte3 = 0;

        public bool IsSharedControl { get; set; } = false;

        public bool IsSuspended { get; set; } = false;
    }
}