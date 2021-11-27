using System;
using System.Collections.Generic;
using System.Net.Sockets;

using RustedWarfareLib.Models;

using static RustedWarfareLib.PacketUtils;

namespace RustedWarfareLib
{
    public static class Methods
    {
        /**
         * Return ping packets to the server, so that the server normal display delay
         * Trigger conditions : Packet-108
         * Send : Packet-109
         */
        public static void SendReturnPingPacket(Socket socket, long time)
        {
            List<byte> bytes = new();

            //TODO Write Long
            /*
             * Long : [Packet-108] -> First eight valid bytes
             * Byte : 1
             * Byte : 60
             */
            bytes.Add(1);
            bytes.Add(60);


            socket.Send(CreatePacket(PacketType.PACKET_HEART_BEAT_RESPONSE, bytes));
        }
    }
}