package com.corrodinggames.rts.gameFramework.p041i;

import android.graphics.PointF;
import com.corrodinggames.rts.game.AbstractC0197n;
import com.corrodinggames.rts.game.units.AbstractC0244am;
import com.corrodinggames.rts.game.units.AbstractC0623y;
import com.corrodinggames.rts.game.units.EnumC0249ar;
import com.corrodinggames.rts.game.units.InterfaceC0303as;
import com.corrodinggames.rts.game.units.custom.C0448g;
import com.corrodinggames.rts.game.units.custom.C0453l;
import com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope;
import com.corrodinggames.rts.gameFramework.AbstractC1120w;
import com.corrodinggames.rts.gameFramework.Core;
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
    void m1319a() {
        this.f5863e = this.f5862d;
    }

    public Reader(Packet packet) {
        this.f5861a = new ByteArrayInputStream(packet.Data);
        this.f5862d = new DataInputStream(this.f5861a);
        m1319a();
    }

    public Reader(DataInputStream dataInputStream) {
        this.f5862d = dataInputStream;
        m1319a();
    }

    public Reader(String str) {
        this.f5861a = new ByteArrayInputStream(str.getBytes());
        this.f5862d = new DataInputStream(this.f5861a);
        m1319a();
    }

    public Reader(byte[] bArr) {
        this.f5861a = new ByteArrayInputStream(bArr);
        this.f5862d = new DataInputStream(this.f5861a);
        m1319a();
    }

    /* renamed from: a */
    public void m1318a(int i) {
        this.f5865b = i;
    }

    /* renamed from: b */
    public int m1310b() {
        return this.f5865b;
    }

    /* renamed from: b */
    public void m1309b(int i) {
        this.f5866c = i;
    }

    /* renamed from: c */
    public int m1306c() {
        return this.f5866c;
    }

    /* renamed from: d */
    public byte m1304d() {
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
    public float m1300g() {
        return this.f5863e.readFloat();
    }

    /* renamed from: h */
    public double m1299h() {
        return this.f5863e.readDouble();
    }

    /* renamed from: i */
    public long m1298i() {
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
    public C0448g m1294m() {
        String readUTF = this.f5863e.readUTF();
        if (readUTF.equals(VariableScope.nullOrMissingString)) {
            return null;
        }
        return C0448g.m3953c(readUTF);
    }

    /* renamed from: n */
    public long m1293n() {
        return this.f5863e.readLong();
    }

    /* renamed from: a */
    public AbstractC1120w m1315a(Class cls) {
        return AbstractC1120w.m443a(this.f5863e.readLong(), cls, false);
    }

    /* renamed from: a */
    public void m1316a(C1101m c1101m, Class cls) {
        int ReadInt = ReadInt();
        for (int i = 0; i < ReadInt; i++) {
            AbstractC1120w m1315a = m1315a(cls);
            if (m1315a != null) {
                c1101m.add(m1315a);
            }
        }
    }

    /* renamed from: o */
    public AbstractC0244am m1292o() {
        return m1317a(EnumC0878m.f5871b);
    }

    /* renamed from: a */
    public AbstractC0244am m1317a(EnumC0878m enumC0878m) {
        return AbstractC1120w.m442a(this.f5863e.readLong(), enumC0878m == EnumC0878m.f5870a);
    }

    /* renamed from: p */
    public AbstractC0623y m1291p() {
        return AbstractC1120w.m438b(this.f5863e.readLong(), false);
    }

    /* renamed from: b */
    public Enum m1308b(Class cls) {
        int readInt = this.f5863e.readInt();
        if (readInt == -1) {
            return null;
        }
        Object[] enumConstants = cls.getEnumConstants();
        if (readInt < 0 || readInt >= enumConstants.length) {
            C0831ad.m1493g("readEnum:" + readInt + " is out of range for " + cls.toString());
            return null;
        }
        return (Enum) enumConstants[readInt];
    }

    /* renamed from: q */
    public InterfaceC0303as m1290q() {
        int readInt = this.f5863e.readInt();
        if (readInt == -1) {
            return null;
        }
        if (readInt == -2) {
            String ReadUTF = ReadUTF();
            C0453l m3673n = C0453l.m3673n(ReadUTF);
            if (m3673n == null) {
                C0831ad.m1493g("readUnitType: Could not find customUnitMetadata:" + ReadUTF);
            }
            InterfaceC0303as m3698c = C0453l.m3698c(m3673n);
            if (m3698c != null) {
                if (m3698c instanceof C0453l) {
                    m3673n = (C0453l) m3698c;
                } else {
                    Core.m998b("replacement not a custom unit:" + m3698c.mo4474i());
                }
            }
            return m3673n;
        }
        Object[] enumConstants = EnumC0249ar.class.getEnumConstants();
        if (readInt < 0 || readInt >= enumConstants.length) {
            C0831ad.m1493g("readUnitType:" + readInt + " is out of range for UnitType");
            return null;
        }
        return (EnumC0249ar) enumConstants[readInt];
    }

    /* renamed from: r */
    public AbstractC0197n m1289r() {
        byte readByte = this.f5863e.readByte();
        AbstractC0197n m5017k = AbstractC0197n.m5017k(readByte);
        if (m5017k == null) {
            throw new IOException("Error loading save data, could not find referenced team:" + ((int) readByte) + VariableScope.nullOrMissingString);
        }
        return m5017k;
    }

    /* renamed from: s */
    public AbstractC0197n m1288s() {
        return AbstractC0197n.m5017k(this.f5863e.readByte());
    }

    /* renamed from: t */
    public byte[] m1287t() {
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
    public Reader m1286u() {
        return new Reader(m1287t());
    }

    /* renamed from: v */
    public short m1285v() {
        return this.f5863e.readShort();
    }

    /* renamed from: a */
    public void m1314a(String str) {
        if (m1285v() != 12345) {
            C0831ad.m1493g("Mark wasn't read for:" + str);
            if (Core.m1087A().m1062Z()) {
                throw new RuntimeException("Mark wasn't read for:" + str);
            }
        }
    }

    /* renamed from: w */
    public InputStream m1284w() {
        return this.f5863e;
    }

    /* renamed from: b */
    public void m1307b(String str) {
        m1313a(str, false);
    }

    /* renamed from: x */
    public String m1283x() {
        return m1311a(false, false);
    }

    /* renamed from: a */
    public void m1313a(String str, boolean z) {
        m1312a(str, z, false);
    }

    /* renamed from: a */
    public void m1312a(String str, boolean z, boolean z2) {
        if (this.f5865b < 11) {
            Core.LogDebug2("Skipping start block:" + str);
            return;
        }
        String m1311a = m1311a(z, z2);
        if (!m1311a.equals(str)) {
            Core.m997b("InputNetStream:endBlock", "Name does not match: expected:" + str + " , got:" + m1311a);
        }
    }

    /* renamed from: c */
    public byte[] m1305c(String str) {
        String readUTF = this.f5863e.readUTF();
        if (!readUTF.equals(str)) {
            Core.m997b("getBlockRaw", "Name does not match: expected:" + str + " , got:" + readUTF);
        }
        return m1287t();
    }

    /* renamed from: a */
    public String m1311a(boolean z, boolean z2) {
        if (this.f5865b < 11) {
            Core.LogDebug2("Skipping start block: startBlockAndGetName()");
            return "<skipped>";
        }
        String readUTF = this.f5863e.readUTF();
        C0877l c0877l = new C0877l(m1287t(), z, z2);
        c0877l.f5867a = readUTF;
        this.f5864f.add(c0877l);
        this.f5863e = ((C0877l) this.f5864f.getLast()).f5869c;
        return readUTF;
    }

    /* renamed from: d */
    public void m1303d(String str) {
        if (this.f5865b < 11) {
            Core.LogDebug2("Skipping end block:" + str);
            return;
        }
        C0877l c0877l = (C0877l) this.f5864f.removeLast();
        if (!c0877l.f5867a.equals(str)) {
            Core.m997b("InputNetStream:endBlock", "Name does not match: expected" + str + " ," + c0877l.f5867a);
        }
        if (this.f5864f.isEmpty()) {
            this.f5863e = this.f5862d;
        } else {
            this.f5863e = ((C0877l) this.f5864f.getLast()).f5869c;
        }
    }

    /* renamed from: y */
    public PointF m1282y() {
        if (!ReadBool()) {
            return null;
        }
        PointF pointF = new PointF();
        pointF.f227a = m1300g();
        pointF.f228b = m1300g();
        return pointF;
    }
}
