namespace RustedWarfareClient.Models
{
    public class RegisterPacketTemplate
    {
        public int PayloadSize;
        public int Type;
        public string ServerId;
        public int ProtocolVersion;
        public int GameVersion;
        public int AnotherGameVersion;
        public string PkgName;
        public string ConnectUuid;
        public int Key;
    }
}