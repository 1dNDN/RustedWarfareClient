using RustedWarfareLib.Packets;

namespace RustedWarfareLib
{
    public partial class Api
    {
        public void SendMessageToChat(string message)
        {
            AddChatPacket packet = new AddChatPacket {
                Message = message
            };
            socket.Send(packet.ToBytesArray());
        }
    }
}
