using RustedWarfareLib.Packets;

namespace RustedWarfareLib;

public partial class Api
{
    public long ReceiveHeartBeat(List<byte> bytes)
    {
        HeartBeatPacket packet = new(bytes);
        return packet.PingNumber;
    }

    public void SendHeartBeatResponse(long pingNumber)
    {
        HeartBeatResponsePacket packet = new(pingNumber);
        socket.Send(packet.ToBytesArray());
    }
}