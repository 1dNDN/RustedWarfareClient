using System;

namespace RustedWarfareLib.Models
{
    public class SendPlayerTemplate
    {
        public string PackageName = "com.corrodinggames.rts";
        public int ProtocolVersion = 4;
        public int GameVersion = 151;
        public int AnotherGameVersion = 2;
        public string Nickname;
        public string AnotherPackageName = "com.corrodinggames.rts.java";
        public int AnotherMagicValue = 1198432602;
        public int ServerKey;

        public SendPlayerTemplate(string nickname, int key, string serverUuid, string password = "", string uuid = "")
        {
            Nickname = nickname;
            ServerKey = key;
            ServerUuid = serverUuid;
            if (uuid == string.Empty)
                ClientUuid = Guid.NewGuid().ToString();
            else
                ClientUuid = uuid;
            Password = password;
            Token = PacketUtils.ComputeKeyForPacket(ServerKey);
        }

        public string Password;

        public string ClientUuid;
        public string ServerUuid;
        public string Token;
    }
}