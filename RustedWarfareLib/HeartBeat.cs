using System.Collections.Generic;

using RustedWarfareLib.Packets;

namespace RustedWarfareLib
{
    public partial class Api
    {
        public long ReceiveHeartBeat(List<byte> bytes)
        {
            HeartBeatPacket packet = new HeartBeatPacket(bytes);
            return packet.PingNumber;
        }

        public void SendHeartBeatResponse(long pingNumber)
        {
            HeartBeatResponsePacket packet = new HeartBeatResponsePacket(pingNumber);
            socket.Send(packet.ToBytesArray());
        }
    }
}
