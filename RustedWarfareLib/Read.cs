using System.Text;

namespace RustedWarfareLib;

public partial class Packet
{
    public byte[] ReadBytes(int count)
    {
        var result = new byte[count];
        for (var i = 0; i < count; i++)
            result[i] = Payload[i + offset];

        offset += count;
        return result;
    }

    private byte[] ReadNumber(int countBytes) =>
        ReadBytes(countBytes).Reverse().ToArray();

    public bool ReadBool() =>
        ReadByte() != 0;

    public byte ReadByte() =>
        ReadBytes(1).FirstOrDefault();

    public short ReadShort() =>
        BitConverter.ToInt16(ReadNumber(2));

    public int ReadInt() =>
        BitConverter.ToInt32(ReadNumber(4));

    public long ReadLong() =>
        BitConverter.ToInt64(ReadNumber(8));

    public float ReadFloat() =>
        BitConverter.ToSingle(ReadNumber(4));

    public string ReadString()
    {
        var charCount = ReadShort();
        var stringbytes = ReadBytes(charCount);
        return Encoding.ASCII.GetString(stringbytes);
    }
}
