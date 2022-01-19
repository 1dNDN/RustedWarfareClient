using System.Collections.Generic;

using RustedWarfareLib.Packets;

namespace RustedWarfareLib
{
    public partial class Api
    {
        private void ReceiveServerInfo(List<byte> bytes)
        {
            ServerInfoPacket packet = new(bytes);

            MapType = packet.MapType;
            MapName = packet.MapName;
            Credits = packet.Credits;
            FogOfWar = packet.FogOfWar;
            IsAdmin = packet.IsAdmin;
            UnitLimit = packet.UnitLimit;
            AnotherUnitLimit = packet.AnotherUnitLimit;
            StartingUnits = packet.StartingUnits;
            Income = packet.Income;
            IsNoNuke = packet.IsNoNuke;
            IsSharedControl = packet.IsSharedControl;
        }
    }
}
