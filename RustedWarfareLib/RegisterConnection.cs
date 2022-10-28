using RustedWarfareLib.Packets;

namespace RustedWarfareLib;

public partial class Api
{
    private void SendRegisterConnection(List<byte> bytes)
    {
        RegisterConnectionPacket packet = new(bytes);

        NetworkServerId = packet.NetworkServerId;
        ServerKey = packet.ServerKey;
        Color = packet.Color;
    }
}
