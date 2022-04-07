using RustedWarfareLib.Packets;

namespace RustedWarfareLib;

public partial class Api
{
    public void ReceiveStartGame(List<byte> bytes)
    {
        StartGamePacket packet = new(bytes);

        MapType = packet.MapType;
        MapName = packet.MapName;
    }
}