namespace RustedWarfareClient.Models
{
    public class PreregisterPacketTemplate
    {
        public string PackageName = "com.corrodinggames.rts";
        public int ProtocolVersion = 1;
        public int GameVersion = 151;
        public int AnotherGameVersion = 151;
        public string Nickname;

        public PreregisterPacketTemplate()
        {
        }
/*
        public PreregisterPacketTemplate(string nickname)
        {
            ProtocolVersion = 3
            Nickname = nickname;
        }

        public PreregisterPacketTemplate(string nickname,string relayId)
        {
            ProtocolVersion = 2
            Nickname = nickname;
        }
*/    }

}