using System;
using System.Threading;

using RustedWarfareLib;

namespace RustedWarfareClient
{
    internal static class Program
    {
        public static void Main()
        {
            Api api = new("127.0.0.1") {
                Nickname = "1dndn"
            };
            api.Connect();
            Console.WriteLine("Connected");
            Thread.Sleep(5000);
            api.Disconnect();
            Console.WriteLine("Disconnected");
        }
    }
}
