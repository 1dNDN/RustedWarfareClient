namespace RustedWarfareClient.Models
{
    public class PreregisterPacketTemplate
    {
        public string PackageName = "com.corrodinggames.rts";
        public int ProtocolVersion = 3;
        public int GameVersion = 151;
        public int AnotherGameVersion = 2;
        public string Nickname;

        public PreregisterPacketTemplate(string nickname)
        {
            Nickname = nickname;
        }
    }
}