using RustedWarfareLib.Packets;

namespace RustedWarfareLib;

public partial class Api
{
    private void SendPlayerInfo()
    {
        if (string.IsNullOrWhiteSpace(ClientUuid))
            ClientUuid = Guid.NewGuid().ToString();

        PlayerInfoPacket packet = new(NetworkServerId, ServerKey) {
            Nickname = Nickname,
            Password = Password,
            ClientUuid = ClientUuid
        };

        socket.Send(packet.ToBytesArray());
    }
}
