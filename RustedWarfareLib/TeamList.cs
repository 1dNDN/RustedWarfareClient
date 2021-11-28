using System.Collections.Generic;

using RustedWarfareLib.Packets;

namespace RustedWarfareLib
{
    public partial class Api
    {
        private void ReceiveTeamList(List<byte> bytes)
        {
            TeamListPacket packet = new(bytes);

            PlayerPosition = packet.PlayerPosition;
            IsGameStarted = packet.IsGameStarted;
            MaxPlayers = packet.MaxPlayers;
            FogOfWar = packet.FogOfWar;
            Credits = packet.Credits;
            AiDifficulty = packet.AiDifficulty;
            UnitLimit = packet.UnitLimit;
            AnotherUnitLimit = packet.AnotherUnitLimit;
            StartingUnits = packet.StartingUnits;
            Income = packet.Income;
            IsNoNuke = packet.IsNoNuke;
            IsSharedControl = packet.IsSharedControl;
            IsSuspended = packet.IsSuspended;
        }
    }
}