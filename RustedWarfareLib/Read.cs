using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace RustedWarfareLib
{
    public partial class Packet
    {
        public byte[] ReadBytes(int count)
        {
            byte[] result = new byte[count];
            for (int i = 0; i < count; i++) result[i] = Payload[i + offset];

            offset += count;
            return result;
        }

        private byte[] ReadNumber(int countBytes)
        {
            return ReadBytes(countBytes).Reverse().ToArray();
        }

        public bool ReadBool()
        {
            return ReadByte() != 0;
        }

        public byte ReadByte()
        {
            return ReadBytes(1).FirstOrDefault();
        }
        
        public short ReadShort()
        {
            return BitConverter.ToInt16(ReadNumber(2));
        }
        
        public int ReadInt()
        {
            return BitConverter.ToInt32(ReadNumber(4));
        }
        
        public long ReadLong()
        {
            return BitConverter.ToInt64(ReadNumber(8));
        }

        public string ReadString()
        {
            short charCount = ReadShort();
            byte[] stringbytes = ReadBytes(charCount);
            return Encoding.ASCII.GetString(stringbytes);
        }
    }
}