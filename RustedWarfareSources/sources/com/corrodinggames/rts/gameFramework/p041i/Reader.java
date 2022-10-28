package com.corrodinggames.rts.gameFramework.p041i;

import android.graphics.PointF;
import com.corrodinggames.rts.game.AbstractC0197n;
import com.corrodinggames.rts.game.units.AbstractC0244am;
import com.corrodinggames.rts.game.units.AbstractC0249ar;
import com.corrodinggames.rts.game.units.AbstractC0623y;
import com.corrodinggames.rts.game.units.InterfaceC0303as;
import com.corrodinggames.rts.game.units.custom.C0448g;
import com.corrodinggames.rts.game.units.custom.C0453l;
import com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope;
import com.corrodinggames.rts.gameFramework.AbstractC1120w;
import com.corrodinggames.rts.gameFramework.LoggerMaybe;
import com.corrodinggames.rts.gameFramework.utility.C1101m;
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.LinkedList;

/* renamed from: com.corrodinggames.rts.gameFramework.i.k */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/i/k.class */
public class Reader {

    /* renamed from: a */
    ByteArrayInputStream f5861a;

    /* renamed from: d */
    private DataInputStream f5862d;

    /* renamed from: e */
    private DataInputStream f5863e;

    /* renamed from: f */
    private LinkedList f5864f = new LinkedList();

    /* renamed from: b */
    int f5865b = 999999;

    /* renamed from: c */
    int f5866c = 999999;

    /* renamed from: a */
    void m1314a() {
        this.f5863e = this.f5862d;
    }

    public Reader(Packet packet) {
        this.f5861a = new ByteArrayInputStream(packet.Data);
        this.f5862d = new DataInputStream(this.f5861a);
        m1314a();
    }

    public Reader(DataInputStream dataInputStream) {
        this.f5862d = dataInputStream;
        m1314a();
    }

    public Reader(String str) {
        this.f5861a = new ByteArrayInputStream(str.getBytes());
        this.f5862d = new DataInputStream(this.f5861a);
        m1314a();
    }

    public Reader(byte[] bArr) {
        this.f5861a = new ByteArrayInputStream(bArr);
        this.f5862d = new DataInputStream(this.f5861a);
        m1314a();
    }

    /* renamed from: a */
    public void m1313a(int i) {
        this.f5865b = i;
    }

    /* renamed from: b */
    public int m1305b() {
        return this.f5865b;
    }

    /* renamed from: b */
    public void m1304b(int i) {
        this.f5866c = i;
    }

    /* renamed from: c */
    public int m1301c() {
        return this.f5866c;
    }

    /* renamed from: d */
    public byte m1299d() {
        return this.f5863e.readByte();
    }

    /* renamed from: e */
    public boolean ReadBool() {
        return this.f5863e.readBoolean();
    }

    /* renamed from: f */
    public int ReadInt() {
        return this.f5863e.readInt();
    }

    /* renamed from: g */
    public float m1295g() {
        return this.f5863e.readFloat();
    }

    /* renamed from: h */
    public double m1294h() {
        return this.f5863e.readDouble();
    }

    /* renamed from: i */
    public long m1293i() {
        return this.f5863e.readLong();
    }

    /* renamed from: j */
    public String ReadString() {
        if (!ReadBool()) {
            return null;
        }
        return ReadUTF();
    }

    /* renamed from: k */
    public Integer ReadInt1() {
        if (!ReadBool()) {
            return null;
        }
        return Integer.valueOf(ReadInt());
    }

    /* renamed from: l */
    public String ReadUTF() {
        return this.f5863e.readUTF();
    }

    /* renamed from: m */
    public C0448g m1289m() {
        String readUTF = this.f5863e.readUTF();
        if (readUTF.equals(VariableScope.nullOrMissingString)) {
            return null;
        }
        return C0448g.m3891c(readUTF);
    }

    /* renamed from: n */
    public long m1288n() {
        return this.f5863e.readLong();
    }

    /* renamed from: a */
    public AbstractC1120w m1310a(Class cls) {
        return AbstractC1120w.m448a(this.f5863e.readLong(), cls, false);
    }

    /* renamed from: a */
    public void m1311a(C1101m c1101m, Class cls) {
        int ReadInt = ReadInt();
        for (int i = 0; i < ReadInt; i++) {
            AbstractC1120w m1310a = m1310a(cls);
            if (m1310a != null) {
                c1101m.add(m1310a);
            }
        }
    }

    /* renamed from: o */
    public AbstractC0244am m1287o() {
        return m1312a(EnumC0878m.f5871b);
    }

    /* renamed from: a */
    public AbstractC0244am m1312a(EnumC0878m enumC0878m) {
        return AbstractC1120w.m447a(this.f5863e.readLong(), enumC0878m == EnumC0878m.f5870a);
    }

    /* renamed from: p */
    public AbstractC0623y m1286p() {
        return AbstractC1120w.m443b(this.f5863e.readLong(), false);
    }

    /* renamed from: b */
    public Enum m1303b(Class cls) {
        int readInt = this.f5863e.readInt();
        if (readInt == -1) {
            return null;
        }
        Object[] enumConstants = cls.getEnumConstants();
        if (readInt < 0 || readInt >= enumConstants.length) {
            C0831ad.m1486g("readEnum:" + readInt + " is out of range for " + cls.toString());
            return null;
        }
        return (Enum) enumConstants[readInt];
    }

    /* renamed from: q */
    public InterfaceC0303as m1285q() {
        int readInt = this.f5863e.readInt();
        if (readInt == -1) {
            return null;
        }
        if (readInt == -2) {
            String ReadUTF = ReadUTF();
            C0453l m3615n = C0453l.m3615n(ReadUTF);
            if (m3615n == null) {
                C0831ad.m1486g("readUnitType: Could not find customUnitMetadata:" + ReadUTF);
            }
            InterfaceC0303as m3640c = C0453l.m3640c(m3615n);
            if (m3640c != null) {
                if (m3640c instanceof C0453l) {
                    m3615n = (C0453l) m3640c;
                } else {
                    LoggerMaybe.m993b("replacement not a custom unit:" + m3640c.mo3626i());
                }
            }
            return m3615n;
        }
        Object[] enumConstants = AbstractC0249ar.class.getEnumConstants();
        if (readInt < 0 || readInt >= enumConstants.length) {
            C0831ad.m1486g("readUnitType:" + readInt + " is out of range for UnitType");
            return null;
        }
        return (AbstractC0249ar) enumConstants[readInt];
    }

    /* renamed from: r */
    public AbstractC0197n m1284r() {
        byte readByte = this.f5863e.readByte();
        AbstractC0197n m4842k = AbstractC0197n.m4842k(readByte);
        if (m4842k == null) {
            throw new IOException("Error loading save data, could not find referenced team:" + ((int) readByte) + VariableScope.nullOrMissingString);
        }
        return m4842k;
    }

    /* renamed from: s */
    public AbstractC0197n m1283s() {
        return AbstractC0197n.m4842k(this.f5863e.readByte());
    }

    /* renamed from: t */
    public byte[] m1282t() {
        int read;
        int i = 0;
        int ReadInt = ReadInt();
        byte[] bArr = new byte[ReadInt];
        while (i < ReadInt && (read = this.f5863e.read(bArr, i, ReadInt - i)) != -1) {
            i += read;
        }
        return bArr;
    }

    /* renamed from: u */
    public Reader m1281u() {
        return new Reader(m1282t());
    }

    /* renamed from: v */
    public short m1280v() {
        return this.f5863e.readShort();
    }

    /* renamed from: a */
    public void m1309a(String str) {
        if (m1280v() != 12345) {
            C0831ad.m1486g("Mark wasn't read for:" + str);
            if (LoggerMaybe.m1082A().m1057Z()) {
                throw new RuntimeException("Mark wasn't read for:" + str);
            }
        }
    }

    /* renamed from: w */
    public InputStream m1279w() {
        return this.f5863e;
    }

    /* renamed from: b */
    public void m1302b(String str) {
        m1308a(str, false);
    }

    /* renamed from: x */
    public String m1278x() {
        return m1306a(false, false);
    }

    /* renamed from: a */
    public void m1308a(String str, boolean z) {
        m1307a(str, z, false);
    }

    /* renamed from: a */
    public void m1307a(String str, boolean z, boolean z2) {
        if (this.f5865b < 11) {
            LoggerMaybe.LogDebug2("Skipping start block:" + str);
            return;
        }
        String m1306a = m1306a(z, z2);
        if (!m1306a.equals(str)) {
            LoggerMaybe.m992b("InputNetStream:endBlock", "Name does not match: expected:" + str + " , got:" + m1306a);
        }
    }

    /* renamed from: c */
    public byte[] m1300c(String str) {
        String readUTF = this.f5863e.readUTF();
        if (!readUTF.equals(str)) {
            LoggerMaybe.m992b("getBlockRaw", "Name does not match: expected:" + str + " , got:" + readUTF);
        }
        return m1282t();
    }

    /* renamed from: a */
    public String m1306a(boolean z, boolean z2) {
        if (this.f5865b < 11) {
            LoggerMaybe.LogDebug2("Skipping start block: startBlockAndGetName()");
            return "<skipped>";
        }
        String readUTF = this.f5863e.readUTF();
        C0877l c0877l = new C0877l(m1282t(), z, z2);
        c0877l.f5867a = readUTF;
        this.f5864f.add(c0877l);
        this.f5863e = ((C0877l) this.f5864f.getLast()).f5869c;
        return readUTF;
    }

    /* renamed from: d */
    public void m1298d(String str) {
        if (this.f5865b < 11) {
            LoggerMaybe.LogDebug2("Skipping end block:" + str);
            return;
        }
        C0877l c0877l = (C0877l) this.f5864f.removeLast();
        if (!c0877l.f5867a.equals(str)) {
            LoggerMaybe.m992b("InputNetStream:endBlock", "Name does not match: expected" + str + " ," + c0877l.f5867a);
        }
        if (this.f5864f.isEmpty()) {
            this.f5863e = this.f5862d;
        } else {
            this.f5863e = ((C0877l) this.f5864f.getLast()).f5869c;
        }
    }

    /* renamed from: y */
    public PointF m1277y() {
        if (!ReadBool()) {
            return null;
        }
        PointF pointF = new PointF();
        pointF.f227a = m1295g();
        pointF.f228b = m1295g();
        return pointF;
    }
}
