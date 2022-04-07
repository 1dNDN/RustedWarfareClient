using OpenTK.Mathematics;
using OpenTK.Windowing.Common;
using OpenTK.Windowing.Desktop;

namespace RustedWarfareClient
{
    internal static class Program
    {
        public static void Main()
        {
            Init();
            // Api api = new("127.0.0.1") {
            //     Nickname = "Бот ебучий"
            // };
            // api.Connect();
            // Console.WriteLine("Connected");
            //
            //
            // api.Disconnect();
            // Console.WriteLine("Disconnected");
        }

        private static void Init()
        {
            NativeWindowSettings nativeWindowSettings = new()
            {
                Size = new Vector2i(800, 600),
                Title = "RW Client",
                Flags = ContextFlags.ForwardCompatible,
            };

            using Vent window = new(GameWindowSettings.Default, nativeWindowSettings);
            window.Run();
        }
    }
}
