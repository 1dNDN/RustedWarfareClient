using RustedWarfareLib.Packets;

namespace RustedWarfareLib;

public partial class Api
{
    private void SendDisconnect()
    {
        DisconnectPacket packet = new();
        socket.Send(packet.ToBytesArray());
    }

    private void SendDisconnect(string message)
    {
        DisconnectPacket packet = new(message);
        socket.Send(packet.ToBytesArray());
    }
}