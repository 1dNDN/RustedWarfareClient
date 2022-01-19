using System.Collections.Generic;

using RustedWarfareLib.Models;

namespace RustedWarfareLib.Packets
{
    public class StartGamePacket : Packet
    {
        public StartGamePacket() : base(PacketType.PACKET_START_GAME)
        {
        }

        public StartGamePacket(List<byte> payload) : base(payload)
        {
            ReadByte();
            MapType = ReadInt();
            if (MapType == 0)
            {
                MapName = ReadString();
            } else
            {
                ReadByte();
                CustomMapXml = ReadString();
                MapName = ReadString();
            }
        }

        public override byte[] ToBytesArray()
        {
            Write((byte)0);
            Write(MapType);
            if (MapType == 0)
            {
                Write(MapName);
            } else
            {
                Write((byte)0);
                Write(CustomMapXml);
                Write(MapName);
            }
            WriteLength();
            return Payload.ToArray();
        }
        
        public int MapType { get; set; }= 0;
        public string MapName { get; set; } = "";

        public string CustomMapXml { get; set; } = "";
    }
}
