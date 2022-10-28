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
import com.corrodinggames.rts.gameFramework.LoggerMaybe;
import com.corrodinggames.rts.gameFramework.p036e.C0750a;
import com.corrodinggames.rts.gameFramework.utility.C1098j;
import com.corrodinggames.rts.gameFramework.utility.C1101m;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.zip.DataFormatException;

/* renamed from: com.corrodinggames.rts.gameFramework.i.ar */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/i/ar.class */
public class StreamWriter {

    /* renamed from: b */
    ByteArrayOutputStream byteArrayOutputStream;

    /* renamed from: c */
    DataOutputStream dataOutputStream;

    /* renamed from: a */
    private DataOutputStream f5731a;

    /* renamed from: e */
    private LinkedList list;

    /* renamed from: d */
    public int f5733d;

    /* renamed from: a */
    public void mo1375a() {
        ListIterator listIterator = this.list.listIterator(this.list.size());
        while (listIterator.hasPrevious()) {
            ((C0860as) listIterator.previous()).m1377a();
        }
        this.dataOutputStream.flush();
        if (this.byteArrayOutputStream != null) {
            this.byteArrayOutputStream.flush();
        }
    }

    /* renamed from: b */
    void mo1361b() {
        this.f5731a = this.dataOutputStream;
    }

    public StreamWriter(int i) {
        this();
        this.f5733d = i;
    }

    public StreamWriter() {
        this.list = new LinkedList();
        this.f5733d = 999999;
        this.byteArrayOutputStream = new ByteArrayOutputStream();
        this.dataOutputStream = new DataOutputStream(this.byteArrayOutputStream);
        mo1361b();
    }

    public StreamWriter(DataOutputStream dataOutputStream) {
        this.list = new LinkedList();
        this.f5733d = 999999;
        this.dataOutputStream = dataOutputStream;
        mo1361b();
    }

    /* renamed from: b */
    public Packet mo1360b(int msgId) {
        return mo1374a(msgId, -1);
    }

    /* renamed from: a */
    public Packet mo1374a(int i, int i2) {
        try {
            mo1375a();
            Packet packet = new Packet(i);
            packet.Data = this.byteArrayOutputStream.toByteArray();
            packet.f5744d = i2;
            return packet;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: c */
    public String mo1356c() {
        try {
            mo1375a();
            return this.byteArrayOutputStream.toString();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: d */
    public byte[] mo1353d() {
        try {
            mo1375a();
            return this.byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: c */
    public void mo1355c(int i) {
        this.f5731a.writeByte(i);
    }

    /* renamed from: a */
    public void mo1314a(boolean z) {
        this.f5731a.writeBoolean(z);
    }

    /* renamed from: a */
    public void WriteInteger(int i) {
        this.f5731a.writeInt(i);
    }

    /* renamed from: a */
    public void mo1320a(float f) {
        this.f5731a.writeFloat(f);
    }

    /* renamed from: a */
    public void m1385a(double d) {
        this.f5731a.writeDouble(d);
    }

    /* renamed from: a */
    public void mo1373a(long j) {
        this.f5731a.writeLong(j);
    }

    /* renamed from: b */
    public void mo1357b(String str) {
        mo1314a(str != null);
        if (str != null) {
            WriteUTF(str);
        }
    }

    /* renamed from: a */
    public void m1381a(Integer num) {
        mo1314a(num != null);
        if (num != null) {
            WriteInteger(num.intValue());
        }
    }

    /* renamed from: c */
    public void WriteUTF(String str) {
        this.f5731a.writeUTF(str);
    }

    /* renamed from: a */
    public void m1384a(C0448g c0448g) {
        if (c0448g == null) {
            this.f5731a.writeUTF(VariableScope.nullOrMissingString);
        }
        this.f5731a.writeUTF(c0448g.toString());
    }

    /* renamed from: a */
    public void mo1367a(AbstractC1120w abstractC1120w) {
        if (abstractC1120w == null) {
            this.f5731a.writeLong(-1L);
        } else {
            this.f5731a.writeLong(abstractC1120w.f6951ee);
        }
    }

    /* renamed from: b */
    public void mo1358b(AbstractC1120w abstractC1120w) {
        if (abstractC1120w != null && !abstractC1120w.f6952eg) {
            this.f5731a.writeLong(abstractC1120w.f6951ee);
        } else {
            this.f5731a.writeLong(-1L);
        }
    }

    /* renamed from: a */
    public void m1382a(C1101m c1101m) {
        if (c1101m == null) {
            WriteInteger(0);
            return;
        }
        WriteInteger(c1101m.size());
        Iterator it = c1101m.iterator();
        while (it.hasNext()) {
            mo1358b((AbstractC1120w) it.next());
        }
    }

    /* renamed from: b */
    public void mo1359b(AbstractC0244am abstractC0244am) {
        if (abstractC0244am != null && !abstractC0244am.f6952eg && !abstractC0244am.f1607bT) {
            mo1367a((AbstractC1120w) abstractC0244am);
        } else {
            mo1367a((AbstractC1120w) null);
        }
    }

    /* renamed from: a */
    public void mo1318a(AbstractC0244am abstractC0244am) {
        if (abstractC0244am != null && !abstractC0244am.f6952eg) {
            mo1367a((AbstractC1120w) abstractC0244am);
        } else {
            mo1367a((AbstractC1120w) null);
        }
    }

    /* renamed from: a */
    public void mo1369a(AbstractC0623y abstractC0623y) {
        if (abstractC0623y != null && !abstractC0623y.f6952eg) {
            mo1367a((AbstractC1120w) abstractC0623y);
        } else {
            mo1367a((AbstractC1120w) null);
        }
    }

    /* renamed from: a */
    public void mo1372a(PointF pointF) {
        mo1314a(pointF != null);
        if (pointF != null) {
            mo1320a(pointF.f227a);
            mo1320a(pointF.f228b);
        }
    }

    /* renamed from: a */
    public void mo1363a(Enum r4) {
        if (r4 == null) {
            this.f5731a.writeInt(-1);
        } else {
            this.f5731a.writeInt(r4.ordinal());
        }
    }

    /* renamed from: a */
    public void mo1370a(InterfaceC0303as interfaceC0303as) {
        if (interfaceC0303as == null) {
            this.f5731a.writeInt(-1);
        } else if (interfaceC0303as instanceof C0453l) {
            this.f5731a.writeInt(-2);
            WriteUTF(((C0453l) interfaceC0303as).f2940L);
        } else {
            this.f5731a.writeInt(((EnumC0249ar) interfaceC0303as).ordinal());
        }
    }

    /* renamed from: a */
    public void mo1368a(Steam steam) {
        if (steam == null) {
            this.f5731a.writeInt(0);
        } else {
            this.f5731a.writeInt(steam.f5766c);
        }
    }

    /* renamed from: a */
    public void mo1371a(AbstractC0197n abstractC0197n) {
        this.f5731a.writeByte(abstractC0197n.f1306k);
    }

    /* renamed from: a */
    public void mo1365a(File file) {
        C1098j m2244a = C0750a.m2244a(file);
        if (m2244a == null) {
            throw new IOException("Failed to read save file data");
        }
        try {
            mo1364a(m2244a, (int) file.length());
            if (m2244a != null) {
                m2244a.close();
            }
        } catch (Throwable th) {
            if (m2244a != null) {
                m2244a.close();
            }
            throw th;
        }
    }

    /* renamed from: a */
    public void m1383a(Reader reader) {
        InputStream m1269w = reader.m1269w();
        try {
            m1269w.reset();
        } catch (IOException e) {
            e.printStackTrace();
        }
        mo1364a(m1269w, m1269w.available());
    }

    /* renamed from: a */
    public void mo1364a(InputStream inputStream, int i) {
        int i2 = 0;
        WriteInteger(i);
        byte[] bArr = new byte[16384];
        while (true) {
            int read = inputStream.read(bArr, 0, bArr.length);
            if (read != -1) {
                if (i2 + read > i) {
                    int i3 = i - i2;
                    if (i3 < 0) {
                        C0831ad.m1451g("writeStream: bytesTillFull is " + i3);
                        return;
                    } else {
                        this.f5731a.write(bArr, 0, i3);
                        return;
                    }
                }
                this.f5731a.write(bArr, 0, read);
                i2 += read;
            } else {
                return;
            }
        }
    }

    /* renamed from: a */
    public void mo1366a(ByteArrayOutputStream byteArrayOutputStream) {
        WriteInteger(byteArrayOutputStream.size());
        byteArrayOutputStream.writeTo(this.f5731a);
    }

    /* renamed from: a */
    public void mo1362a(byte[] bArr) {
        WriteInteger(bArr.length);
        this.f5731a.write(bArr);
    }

    /* renamed from: b */
    public void m1380b(byte[] bArr) {
        this.f5731a.write(bArr);
    }

    /* renamed from: a */
    public void mo1315a(short s) {
        this.f5731a.writeShort(s);
    }

    /* renamed from: e */
    public void mo1351e() {
        mo1315a((short) 12345);
    }

    /* renamed from: d */
    public void mo1352d(String str) {
    }

    /* renamed from: f */
    public boolean mo1349f() {
        return false;
    }

    /* renamed from: e */
    public void mo1350e(String str) {
        mo1316a(str, false);
    }

    /* renamed from: a */
    public void mo1316a(String str, boolean z) {
        C0860as c0860as = new C0860as(z);
        c0860as.f5736c = str;
        this.list.add(c0860as);
        this.f5731a = ((C0860as) this.list.getLast()).f5737e;
    }

    /* renamed from: a */
    public void mo1317a(String str) {
        C0860as c0860as = (C0860as) this.list.removeLast();
        if (!c0860as.f5736c.equals(str)) {
            LoggerMaybe.m982b("OutputNetStream:endBlock", "Name does not match: expected" + str + " , got:" + c0860as.f5736c);
        }
        c0860as.m1377a();
        if (this.list.isEmpty()) {
            this.f5731a = this.dataOutputStream;
        } else {
            this.f5731a = ((C0860as) this.list.getLast()).f5737e;
        }
        this.f5731a.writeUTF(c0860as.f5736c);
        mo1366a(c0860as.f5739d);
        try {
            c0860as.m1376b();
        } catch (Exception e) {
            if (e instanceof DataFormatException) {
                if (!LoggerMaybe.f6210aZ) {
                    LoggerMaybe.m983b("DataFormatException error calling streamBlock.close() (this is expected on android 4.4)");
                    return;
                }
                return;
            }
            LoggerMaybe.m983b("Error calling streamBlock.close() to clean up memory");
            e.printStackTrace();
        }
    }

    /* renamed from: g */
    public int m1379g() {
        return this.f5733d;
    }

    /* renamed from: h */
    public void m1378h() {
        this.dataOutputStream = null;
        this.f5731a = null;
        try {
            if (this.byteArrayOutputStream != null) {
                this.byteArrayOutputStream.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        this.byteArrayOutputStream = null;
    }
}
