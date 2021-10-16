namespace RustedWarfareClient.Models
{
    public class PreregisterPacketTemplate
    {
        public string PackageName = "com.corrodinggames.rts";
        public int ProtocolVersion = 1;
        public int GameVersion = 151;
        public int AnotherGameVersion = 151;
        public string RelayID = "";
        public string Nickname = "";

        public PreregisterPacketTemplate()
        {
        }
        
        public PreregisterPacketTemplate(string relayId)
        {
            ProtocolVersion = 2;
            RelayID = relayId;
        }

        public PreregisterPacketTemplate(string relayId,string nickname)
        {
            ProtocolVersion = 3;
            RelayID = relayId;
            Nickname = nickname;
        }

        
    }

}