using RustedWarfareLib.Packets;

namespace RustedWarfareLib
{
    public partial class Api
    {
        private void SendPreregisterConnection()
        {
            PreregisterConnectionPacket packet = new();

            if (!string.IsNullOrWhiteSpace(Nickname))
                packet.Nickname = Nickname;
            
            socket.Send(packet.ToBytesArray());
        }
    }
}