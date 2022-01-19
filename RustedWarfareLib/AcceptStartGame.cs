using System.Collections.Generic;

using RustedWarfareLib.Packets;

namespace RustedWarfareLib
{
    public partial class Api
    {
        private void SendAcceptStartGame()
        {
            AcceptStartGamePacket packet = new();
            socket.Send(packet.ToBytesArray());
        }
    }
}
