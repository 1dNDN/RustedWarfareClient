using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace RustedWarfareLib
{
    public partial class Packet
    {
        public void Write(IEnumerable<byte> bytes)
        {
            Payload.AddRange(bytes);
        }

        public void Write(bool value)
        {
            Write(value ? (byte)1 : (byte)0);
        }

        public void Write(byte value)
        {
            Payload.Add(value);
        }

        public void Write(short value)
        {
            Write(BitConverter.GetBytes(value).Reverse());
        }

        public void Write(int value)
        {
            Write(BitConverter.GetBytes(value).Reverse());
        }

        public void Write(long value)
        {
            Write(BitConverter.GetBytes(value).Reverse());
        }

        public void Write(float value)
        {
            Write(BitConverter.GetBytes(value).Reverse());
        }

        public void Write(string str)
        {
            if (string.IsNullOrWhiteSpace(str))
            {
                Write(false);
                return;
            }

            byte[] bytes = Encoding.UTF8.GetBytes(str);

            Write(BitConverter.GetBytes((short)bytes.Length).Reverse());
            Write(bytes);
        }

        public void WriteIsString(string str) //TODO
        {
            if (string.IsNullOrWhiteSpace(str))
            {
                // Write Boolean False
                Write(false);
                return;
            }

            // Write Boolean True
            Write(true);

            Write(BitConverter.GetBytes((short)str.Length).Reverse());
            Write(Encoding.ASCII.GetBytes(str));
        }

        public void WriteLength()
        {
            byte[] length = BitConverter.GetBytes(Length).Reverse().ToArray();
            for (int i = 0; i < 4; i++)
                Payload[i] = length[i];
        }
    }
}
