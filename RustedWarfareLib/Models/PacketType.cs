namespace RustedWarfareLib.Models
{
    public enum PacketType
    {
        PACKET_SERVER_DEBUG = 2000,

        //Server Commands
        PACKET_REGISTER_CONNECTION = 161,
        PACKET_TEAM_LIST = 115,
        PACKET_HEART_BEAT = 108,
        PACKET_SEND_CHAT = 141,
        PACKET_SERVER_INFO = 106,
        PACKET_KICK = 150,
        PACKET_SYNCCHECKSUM_STATUS = 31,
        PACKET_A = 30,

        //Client Commands
        PACKET_PREREGISTER_CONNECTION = 160,
        PACKET_HEART_BEAT_RESPONSE = 109,
        PACKET_ADD_CHAT = 140,
        PACKET_PLAYER_INFO = 110,
        PACKET_DISCONNECT = 111,
        PACKET_ACCEPT_START_GAME = 112,
        PACKET_ACCEPT_BUTTON_GAME = 20,

        //Game Commands
        PACKET_ADD_GAMECOMMAND = 20,
        PACKET_TICK = 10,
        PACKET_SYNC = 35,
        PACKET_START_GAME = 120,
        PACKET_PASSWD_ERROR = 113
    }
}