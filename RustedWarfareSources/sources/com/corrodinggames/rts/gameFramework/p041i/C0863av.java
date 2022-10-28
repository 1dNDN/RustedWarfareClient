package com.corrodinggames.rts.gameFramework.p041i;

import android.graphics.PointF;
import com.corrodinggames.rts.game.AbstractC0197n;
import com.corrodinggames.rts.game.units.AbstractC0244am;
import com.corrodinggames.rts.game.units.AbstractC0249ar;
import com.corrodinggames.rts.game.units.AbstractC0623y;
import com.corrodinggames.rts.game.units.InterfaceC0303as;
import com.corrodinggames.rts.game.units.custom.C0453l;
import com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope;
import com.corrodinggames.rts.gameFramework.AbstractC1120w;
import com.corrodinggames.rts.gameFramework.LoggerMaybe;
import com.corrodinggames.rts.gameFramework.p036e.C0750a;
import com.corrodinggames.rts.gameFramework.utility.C1098j;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.LinkedList;
import java.util.ListIterator;

/* renamed from: com.corrodinggames.rts.gameFramework.i.av */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/i/av.class */
public class C0863av extends StreamWriter {

    /* renamed from: a */
    ByteArrayOutputStream f5748a;

    /* renamed from: e */
    PrintStream f5749e;

    /* renamed from: f */
    private PrintStream f5750f;

    /* renamed from: g */
    private LinkedList f5751g;

    /* renamed from: a */
    public void m1385a() {
        ListIterator listIterator = this.f5751g.listIterator(this.f5751g.size());
        while (listIterator.hasPrevious()) {
            ((C0864aw) listIterator.previous()).m1358a();
        }
        this.f5749e.flush();
        if (this.f5748a != null) {
            this.f5748a.flush();
        }
    }

    /* renamed from: b */
    void m1371b() {
        this.f5750f = this.f5749e;
    }

    public C0863av() {
        this.f5751g = new LinkedList();
        this.f5748a = new ByteArrayOutputStream();
        this.f5749e = new PrintStream(this.f5748a);
        m1371b();
    }

    public C0863av(PrintStream printStream) {
        this.f5751g = new LinkedList();
        this.f5749e = printStream;
        m1371b();
    }

    /* renamed from: b */
    public Packet m1370b(int i) {
        return m1384a(i, -1);
    }

    /* renamed from: a */
    public Packet m1384a(int i, int i2) {
        try {
            m1385a();
            Packet packet = new Packet(i);
            packet.Data = this.f5748a.toByteArray();
            packet.f5744d = i2;
            return packet;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: c */
    public String m1366c() {
        try {
            m1385a();
            return this.f5748a.toString();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: d */
    public byte[] m1363d() {
        try {
            m1385a();
            return this.f5748a.toByteArray();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: c */
    public void m1365c(int i) {
        this.f5750f.println(i);
    }

    /* renamed from: a */
    public void mo1324a(boolean z) {
        this.f5750f.println(z);
    }

    /* renamed from: a */
    public void mo1329a(int i) {
        this.f5750f.println("#int:");
        this.f5750f.println(i);
    }

    /* renamed from: a */
    public void mo1330a(float f) {
        this.f5750f.println("#writeFloat");
        this.f5750f.println(f);
    }

    /* renamed from: a */
    public void m1383a(long j) {
        this.f5750f.println("#writeLong");
        this.f5750f.println(j);
    }

    /* renamed from: b */
    public void m1367b(String str) {
        mo1324a(str != null);
        if (str != null) {
            m1364c(str);
        }
    }

    /* renamed from: c */
    public void m1364c(String str) {
        this.f5750f.println(str);
    }

    /* renamed from: a */
    public void m1377a(AbstractC1120w abstractC1120w) {
        this.f5750f.println("#writeGameObject:");
        if (abstractC1120w == null) {
            this.f5750f.println(-1);
        } else {
            this.f5750f.println(abstractC1120w.f6951ee);
        }
    }

    /* renamed from: b */
    public void m1368b(AbstractC1120w abstractC1120w) {
        this.f5750f.println("#writeExistingGameObject:");
        if (abstractC1120w != null && !abstractC1120w.f6952eg) {
            this.f5750f.println(abstractC1120w.f6951ee);
        } else {
            this.f5750f.println(-1);
        }
    }

    /* renamed from: b */
    public void m1369b(AbstractC0244am abstractC0244am) {
        if (abstractC0244am != null && !abstractC0244am.f6952eg && !abstractC0244am.f1607bT) {
            m1377a((AbstractC1120w) abstractC0244am);
        } else {
            m1377a((AbstractC1120w) null);
        }
    }

    /* renamed from: a */
    public void mo1328a(AbstractC0244am abstractC0244am) {
        if (abstractC0244am != null && !abstractC0244am.f6952eg) {
            m1377a((AbstractC1120w) abstractC0244am);
        } else {
            m1377a((AbstractC1120w) null);
        }
    }

    /* renamed from: a */
    public void m1379a(AbstractC0623y abstractC0623y) {
        if (abstractC0623y != null && !abstractC0623y.f6952eg) {
            m1377a((AbstractC1120w) abstractC0623y);
        } else {
            m1377a((AbstractC1120w) null);
        }
    }

    /* renamed from: a */
    public void m1382a(PointF pointF) {
        this.f5750f.println("#PointF:");
        mo1324a(pointF != null);
        if (pointF != null) {
            mo1330a(pointF.f227a);
            mo1330a(pointF.f228b);
        }
    }

    /* renamed from: a */
    public void m1373a(Enum r5) {
        if (r5 == null) {
            this.f5750f.println("#Enum: null");
            this.f5750f.println(-1);
            return;
        }
        this.f5750f.println("#Enum:" + r5.getClass().getSimpleName() + " : " + r5.toString());
        this.f5750f.println(r5.ordinal());
    }

    /* renamed from: a */
    public void m1380a(InterfaceC0303as interfaceC0303as) {
        this.f5750f.println("#unitType:");
        if (interfaceC0303as == null) {
            this.f5750f.println(-1);
        } else if (interfaceC0303as instanceof C0453l) {
            this.f5750f.println(-2);
            m1364c(((C0453l) interfaceC0303as).f2922L);
        } else {
            this.f5750f.println(((AbstractC0249ar) interfaceC0303as).ordinal());
        }
    }

    /* renamed from: a */
    public void m1378a(Steam steam) {
        if (steam == null) {
            this.f5750f.println(0);
        } else {
            this.f5750f.println(steam.f5766c);
        }
    }

    /* renamed from: a */
    public void m1381a(AbstractC0197n abstractC0197n) {
        this.f5750f.println("#team:");
        this.f5750f.println(abstractC0197n.f1306k);
    }

    /* renamed from: a */
    public void m1375a(File file) {
        C1098j m2281a = C0750a.m2281a(file);
        try {
            m1374a(m2281a, (int) file.length());
        } finally {
            m2281a.close();
        }
    }

    /* renamed from: a */
    public void m1374a(InputStream inputStream, int i) {
        int i2 = 0;
        mo1329a(i);
        byte[] bArr = new byte[16384];
        while (true) {
            int read = inputStream.read(bArr, 0, bArr.length);
            if (read != -1) {
                if (i2 + read > i) {
                    int i3 = i - i2;
                    if (i3 < 0) {
                        C0831ad.m1486g("writeStream: bytesTillFull is " + i3);
                        return;
                    } else {
                        this.f5750f.write(bArr, 0, i3);
                        return;
                    }
                }
                this.f5750f.write(bArr, 0, read);
                i2 += read;
            } else {
                return;
            }
        }
    }

    /* renamed from: a */
    public void m1376a(ByteArrayOutputStream byteArrayOutputStream) {
        mo1329a(byteArrayOutputStream.size());
        byteArrayOutputStream.writeTo(this.f5750f);
    }

    /* renamed from: a */
    public void m1372a(byte[] bArr) {
        mo1329a(bArr.length);
        this.f5750f.write(bArr);
    }

    /* renamed from: a */
    public void mo1325a(short s) {
        this.f5750f.println("#writeShort");
        this.f5750f.println((int) s);
    }

    /* renamed from: e */
    public void m1361e() {
        this.f5750f.println("#writeMark:");
        mo1325a((short) 12345);
    }

    /* renamed from: d */
    public void m1362d(String str) {
        this.f5750f.println("#writeIfDebugOnly: " + str);
    }

    /* renamed from: f */
    public boolean m1359f() {
        return true;
    }

    /* renamed from: e */
    public void m1360e(String str) {
        mo1326a(str, false);
    }

    /* renamed from: a */
    public void mo1326a(String str, boolean z) {
        C0864aw c0864aw = new C0864aw(z);
        c0864aw.f5753b = str;
        this.f5751g.add(c0864aw);
        this.f5750f = ((C0864aw) this.f5751g.getLast()).f5754d;
    }

    /* renamed from: a */
    public void mo1327a(String str) {
        C0864aw c0864aw = (C0864aw) this.f5751g.removeLast();
        if (!c0864aw.f5753b.equals(str)) {
            LoggerMaybe.m992b("OutputNetStream:endBlock", "Name does not match: expected" + str + " , got:" + c0864aw.f5753b);
        }
        c0864aw.m1358a();
        if (this.f5751g.isEmpty()) {
            this.f5750f = this.f5749e;
        } else {
            this.f5750f = ((C0864aw) this.f5751g.getLast()).f5754d;
        }
        String str2 = VariableScope.nullOrMissingString;
        String str3 = VariableScope.nullOrMissingString;
        for (int i = 0; i < this.f5751g.size(); i++) {
            str2 = str2 + ">";
            str3 = str3 + "<";
        }
        this.f5750f.println(str2 + ">>>> Start of block: " + c0864aw.f5753b);
        m1376a(c0864aw.f5756c);
        this.f5750f.println(str3 + "<<<< End of block: " + c0864aw.f5753b);
        c0864aw.m1357b();
    }
}
