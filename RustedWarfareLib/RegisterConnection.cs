using System.Collections.Generic;

using RustedWarfareLib.Packets;

namespace RustedWarfareLib
{
    public partial class Api
    {
        private void SendRegisterConnection(List<byte> bytes)
        {
            RegisterConnectionPacket packet = new(bytes);

            ServerUuid = packet.ServerUuid;
            ServerKey = packet.ServerKey;
        }
    }
}
