using RustedWarfareLib;

namespace RustedWarfareClient;

internal static class Program
{
    public static void Main()
    {
        Api api = new Api("localhost");

        api.Nickname = "Something";
        api.Connect();

        Console.ReadLine();
    }
}
