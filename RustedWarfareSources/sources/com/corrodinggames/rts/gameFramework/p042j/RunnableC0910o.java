package com.corrodinggames.rts.gameFramework.p042j;

import android.graphics.Paint;
import android.os.Debug;
import android.util.Log;
import com.corrodinggames.rts.game.p012b.C0173b;
import com.corrodinggames.rts.game.units.EnumC0246ao;
import com.corrodinggames.rts.gameFramework.AbstractC0916l;
import com.corrodinggames.rts.gameFramework.C0758f;
import java.util.Iterator;
import java.util.LinkedList;

/* renamed from: com.corrodinggames.rts.gameFramework.j.o */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/j/o.class */
public final class RunnableC0910o implements Runnable {

    /* renamed from: C */
    private final C0907l f6044C;

    /* renamed from: b */
    public byte[] f6046b;

    /* renamed from: c */
    public byte[] f6047c;

    /* renamed from: d */
    public byte[] f6048d;

    /* renamed from: e */
    public short[] f6049e;

    /* renamed from: f */
    public byte[] f6050f;

    /* renamed from: D */
    private C0906k f6051D;

    /* renamed from: g */
    int f6052g;

    /* renamed from: h */
    int f6053h;

    /* renamed from: l */
    int[][] f6057l;

    /* renamed from: m */
    byte[][] f6058m;

    /* renamed from: n */
    C0904i f6059n;

    /* renamed from: t */
    static LinkedList f6065t = new LinkedList();

    /* renamed from: u */
    static int f6066u;

    /* renamed from: v */
    int f6067v;

    /* renamed from: w */
    Thread f6068w;

    /* renamed from: y */
    long f6070y;

    /* renamed from: z */
    long f6071z;

    /* renamed from: a */
    boolean f6045a = true;

    /* renamed from: i */
    int f6054i = 5;

    /* renamed from: j */
    int f6055j = 0;

    /* renamed from: k */
    int f6056k = 0;

    /* renamed from: o */
    final C0908m f6060o = new C0908m();

    /* renamed from: p */
    final C0908m f6061p = new C0908m();

    /* renamed from: q */
    final C0911p f6062q = new C0911p();

    /* renamed from: r */
    final C0911p f6063r = new C0911p();

    /* renamed from: s */
    volatile boolean f6064s = true;

    /* renamed from: x */
    Object f6069x = new Object();

    /* renamed from: A */
    Object f6072A = new Object();

    /* renamed from: B */
    Paint f6073B = new Paint();

    /* renamed from: a */
    public void m1108a(C0906k c0906k) {
        if (!this.f6064s) {
            throw new RuntimeException("setupNewPath: last path not yet finished");
        }
        this.f6064s = false;
        m1110a(c0906k.f5984o, c0906k);
        c0906k.f5991v = true;
        this.f6051D = c0906k;
    }

    /* renamed from: a */
    public void m1114a() {
        if (this.f6068w == null) {
            throw new RuntimeException("thread==null");
        }
        synchronized (this.f6069x) {
            this.f6069x.notifyAll();
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        AbstractC0916l.m999ap();
        while (this.f6045a) {
            synchronized (this.f6069x) {
                if (this.f6051D == null) {
                    try {
                        this.f6069x.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
            if (this.f6051D != null) {
                m1105b();
            }
        }
    }

    static {
        f6065t.add(new C0911p((short) -9, (short) -9));
        f6065t.add(new C0911p((short) -9, (short) -9));
        f6065t.add(new C0911p((short) -9, (short) -9));
        f6066u = 0;
    }

    /* renamed from: b */
    public void m1105b() {
        LinkedList m1100e;
        if (this.f6051D instanceof C0901f) {
            m1099f();
            m1100e = f6065t;
        } else {
            m1100e = m1100e();
        }
        synchronized (this.f6044C.f6031G) {
            this.f6051D.m1158f();
            this.f6046b = null;
            this.f6047c = null;
            this.f6048d = null;
            this.f6049e = null;
            this.f6050f = null;
            this.f6051D.m1163a(m1100e);
            this.f6051D = null;
            this.f6064s = true;
            this.f6044C.f6031G.notifyAll();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC0910o(C0907l c0907l) {
        this.f6044C = c0907l;
        int i = f6066u;
        f6066u = i + 1;
        this.f6067v = i;
    }

    /* renamed from: c */
    public synchronized void m1103c() {
        if (this.f6068w != null) {
            throw new RuntimeException("thread!=null");
        }
        this.f6068w = new Thread(this);
        this.f6068w.setName("PathSolver-" + this.f6067v);
        this.f6068w.setPriority(10);
        this.f6068w.setDaemon(true);
        this.f6068w.start();
    }

    /* renamed from: a */
    public void m1111a(C0173b c0173b) {
        this.f6052g = c0173b.f802u.f904n;
        this.f6053h = c0173b.f802u.f905o;
        this.f6057l = new int[2][this.f6052g * this.f6053h];
        this.f6058m = new byte[2][this.f6052g * this.f6053h];
        m1101d();
    }

    /* renamed from: d */
    public void m1101d() {
        int i = (this.f6052g * this.f6053h * 42) + 1;
        this.f6054i += i;
        if (this.f6054i > Integer.MAX_VALUE - i || this.f6054i < 0 || 0 != 0) {
            this.f6054i = 5;
            for (int i2 = 0; i2 < 2; i2++) {
                for (int i3 = 0; i3 < this.f6052g; i3++) {
                    for (int i4 = 0; i4 < this.f6053h; i4++) {
                        this.f6057l[i2][(i3 * this.f6053h) + i4] = -1;
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public final int m1112a(int i, int i2) {
        if (this.f6046b[(i * this.f6053h) + i2] == -1 || this.f6047c[(i * this.f6053h) + i2] == -1 || this.f6048d[(i * this.f6053h) + i2] == -1) {
            return -1;
        }
        return this.f6046b[(i * this.f6053h) + i2] + this.f6047c[(i * this.f6053h) + i2] + (this.f6048d[(i * this.f6053h) + i2] * 10);
    }

    /* renamed from: a */
    public void m1110a(EnumC0246ao enumC0246ao, C0906k c0906k) {
        if (enumC0246ao == null) {
            throw new RuntimeException("MovementType is null");
        }
        C0904i m1151a = this.f6044C.m1151a(enumC0246ao);
        if (m1151a == null) {
            throw new RuntimeException("Could not get costs for:" + enumC0246ao.toString());
        }
        this.f6059n = m1151a;
        this.f6046b = c0906k.f5994y;
        this.f6047c = c0906k.f5995z;
        this.f6048d = c0906k.f5996A;
        this.f6049e = c0906k.f5997B;
        this.f6050f = c0906k.f5998C;
        if (this.f6046b == null) {
            throw new RuntimeException("linkToPath failed mapCosts_mapCosts is null");
        }
        if (this.f6047c == null) {
            throw new RuntimeException("linkToPath failed mapCosts_buildingCosts is null");
        }
        if (this.f6048d == null) {
            throw new RuntimeException("linkToPath failed mapCosts_objectCosts is null");
        }
    }

    /* renamed from: a */
    public void m1109a(EnumC0246ao enumC0246ao, short s, short s2, Float f) {
        if (C0907l.f5999a) {
            Log.m4933d("RustedWarfare", "path start is:" + ((int) s) + "," + ((int) s2));
        }
        C0911p c0911p = new C0911p(s, s2);
        c0911p.m1092a(this, (byte) 0, this.f6054i);
        if (f == null) {
            c0911p.m1094a(this, (byte) 0, (byte) 0);
            c0911p.m1086b(this, (byte) 0, true);
        } else {
            c0911p.m1093a(this, (byte) 0, f.floatValue());
            c0911p.m1086b(this, (byte) 0, true);
        }
        c0911p.m1090a(this, (byte) 0, false);
    }

    /* renamed from: a */
    public void m1106a(short s, short s2, short s3) {
        if (C0907l.f5999a) {
            Log.m4933d("RustedWarfare", "path end is:" + ((int) s) + "," + ((int) s2) + " size:" + ((int) s3));
        }
        C0911p c0911p = new C0911p(s, s2);
        c0911p.m1094a(this, (byte) 1, (byte) 0);
        c0911p.m1086b(this, (byte) 1, true);
        c0911p.m1092a(this, (byte) 1, this.f6054i);
        c0911p.m1090a(this, (byte) 1, false);
    }

    /* renamed from: b */
    static int m1104b(int i, int i2) {
        if (i == i2) {
            return 0;
        }
        int i3 = i - i2;
        if (i3 < 0) {
            i3 = -i3;
        }
        if (i3 > 4) {
            i3 = 8 - i3;
        }
        if (i3 == 1) {
            return 4;
        }
        return i3 == 2 ? 21 : 25;
    }

    /* renamed from: c */
    static int m1102c(int i, int i2) {
        if (i == i2) {
            return 0;
        }
        int abs = Math.abs(i - i2);
        if (abs > 4) {
            abs = 8 - abs;
        }
        if (abs == 1) {
            return 4;
        }
        if (abs == 2) {
            return 21;
        }
        if (abs == 3) {
            return 4;
        }
        return (abs == 4 || abs == 5) ? 0 : 25;
    }

    /* JADX WARN: Code restructure failed: missing block: B:240:0x067e, code lost:
        r0.m1089a(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:241:0x0688, code lost:
        if (r0 != false) goto L417;
     */
    /* JADX WARN: Code restructure failed: missing block: B:243:0x068e, code lost:
        if (com.corrodinggames.rts.gameFramework.p042j.C0907l.f5999a == false) goto L362;
     */
    /* JADX WARN: Code restructure failed: missing block: B:244:0x0691, code lost:
        android.util.Log.m4933d("RustedWarfare", "Not closedOnOtherSide");
     */
    /* JADX WARN: Code restructure failed: missing block: B:245:0x0699, code lost:
        r27 = r0.f6074a;
        r28 = r0.f6075b;
        r25 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:246:0x06ad, code lost:
        r0 = r0.m1082f(r6, r33);
     */
    /* JADX WARN: Code restructure failed: missing block: B:247:0x06b9, code lost:
        if (r0 != null) goto L421;
     */
    /* JADX WARN: Code restructure failed: missing block: B:248:0x06bc, code lost:
        android.util.Log.m4933d("RustedWarfare", "findPath: otherConnection==null");
        android.util.Log.m4933d("RustedWarfare", "currentNode:" + ((int) r0.f6074a) + "," + ((int) r0.f6075b));
        android.util.Log.m4933d("RustedWarfare", "currentNode cost normal:" + r0.m1095a(r6, (byte) 0));
        android.util.Log.m4933d("RustedWarfare", "currentNode cost opposite:" + r0.m1095a(r6, (byte) 1));
        r0.clear();
     */
    /* JADX WARN: Code restructure failed: missing block: B:249:0x0733, code lost:
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:251:0x0736, code lost:
        if (r26 != false) goto L428;
     */
    /* JADX WARN: Code restructure failed: missing block: B:253:0x073c, code lost:
        if (com.corrodinggames.rts.gameFramework.p042j.C0907l.f5999a == false) goto L426;
     */
    /* JADX WARN: Code restructure failed: missing block: B:254:0x073f, code lost:
        android.util.Log.m4933d("RustedWarfare", "closing path runFromOppositeSide=false");
     */
    /* JADX WARN: Code restructure failed: missing block: B:255:0x0747, code lost:
        r29 = r0.f6074a;
        r30 = r0.f6075b;
        r27 = r0.f6074a;
        r28 = r0.f6075b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:257:0x0769, code lost:
        if (com.corrodinggames.rts.gameFramework.p042j.C0907l.f5999a == false) goto L431;
     */
    /* JADX WARN: Code restructure failed: missing block: B:258:0x076c, code lost:
        android.util.Log.m4933d("RustedWarfare", "closing path runFromOppositeSide=true");
     */
    /* JADX WARN: Code restructure failed: missing block: B:259:0x0774, code lost:
        r29 = r0.f6074a;
        r30 = r0.f6075b;
        r27 = r0.f6074a;
        r28 = r0.f6075b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:260:0x0790, code lost:
        r25 = true;
     */
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.util.LinkedList m1100e() {
        /*
            Method dump skipped, instructions count: 3104
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.corrodinggames.rts.gameFramework.p042j.RunnableC0910o.m1100e():java.util.LinkedList");
    }

    /* renamed from: a */
    public LinkedList m1113a(byte b, short s, short s2) {
        LinkedList linkedList = new LinkedList();
        C0911p c0911p = new C0911p(s, s2);
        linkedList.add(c0911p);
        while (true) {
            C0911p m1082f = c0911p.m1082f(this, b);
            if (m1082f != null) {
                linkedList.add(m1082f);
                c0911p = m1082f;
            } else {
                return linkedList;
            }
        }
    }

    /* renamed from: a */
    public LinkedList m1107a(LinkedList linkedList) {
        LinkedList linkedList2 = new LinkedList();
        Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            linkedList2.addFirst((C0911p) it.next());
        }
        return linkedList2;
    }

    /* renamed from: f */
    public void m1099f() {
        m1098g();
    }

    /* renamed from: g */
    public void m1098g() {
        byte b;
        byte b2;
        int m1096a;
        int i;
        C0901f c0901f = (C0901f) this.f6051D;
        C0902g c0902g = new C0902g(this.f6052g, this.f6053h);
        if (C0907l.f6010l && !AbstractC0916l.m1071A().f6154bH) {
            Debug.startMethodTracing("pathTrace", 110000000);
        }
        if (C0907l.f5999a) {
            Log.m4933d("RustedWarfare", "starting path for:" + this.f6059n.f5957a.toString());
        }
        C0911p c0911p = this.f6063r;
        C0911p c0911p2 = this.f6062q;
        int i2 = this.f6053h;
        int i3 = this.f6052g;
        this.f6070y = AbstractC0916l.m1051U();
        short s = c0901f.f5977h;
        short s2 = c0901f.f5978i;
        boolean z = c0901f.f5980k;
        m1101d();
        m1109a(c0901f.f5984o, c0901f.f5977h, c0901f.f5978i, c0901f.f5979j);
        short s3 = c0901f.f5981l;
        short s4 = c0901f.f5982m;
        short s5 = c0901f.f5983n;
        new LinkedList();
        if (this.f6059n.f5957a.equals(EnumC0246ao.NONE)) {
            if (C0907l.f5999a) {
                Log.m4933d("RustedWarfare", "no point pathing for none");
                return;
            }
            return;
        }
        int i4 = 0;
        short s6 = s3;
        short s7 = s4;
        short s8 = s5;
        if (this.f6049e != null) {
            short[] sArr = this.f6049e;
            short s9 = sArr[(s * i2) + s2];
            boolean z2 = true;
            if (s9 == -1) {
                z2 = false;
            } else {
                int i5 = s3 - s5;
                while (true) {
                    short s10 = (short) i5;
                    if (s10 > s3 + s5) {
                        break;
                    }
                    int i6 = s4 - s5;
                    while (true) {
                        short s11 = (short) i6;
                        if (s11 <= s4 + s5) {
                            if (s10 >= 0 && s10 < i3 && s11 >= 0 && s11 < i2 && s9 == sArr[(s10 * i2) + s11]) {
                                z2 = false;
                            }
                            i6 = s11 + 1;
                        }
                    }
                    i5 = s10 + 1;
                }
            }
            if (z2) {
                if (C0907l.f5999a) {
                    Log.m4933d("RustedWarfare", "end is blocked on isolated groups");
                }
                short s12 = s6;
                short s13 = s7;
                float f = -1.0f;
                int i7 = s3 - 25;
                while (true) {
                    short s14 = (short) i7;
                    if (s14 > s3 + 25) {
                        break;
                    }
                    int i8 = s4 - 25;
                    while (true) {
                        short s15 = (short) i8;
                        if (s15 <= s4 + 25) {
                            if (s14 >= 0 && s14 < i3 && s15 >= 0 && s15 < i2 && (s9 == sArr[(s14 * i2) + s15] || sArr[(s14 * i2) + s15] == 0)) {
                                float m2147a = C0758f.m2147a(s14, s15, s3, s4);
                                if (f == -1.0f || m2147a < f) {
                                    f = m2147a;
                                    s12 = s14;
                                    s13 = s15;
                                    s8 = 0;
                                }
                            }
                            i8 = s15 + 1;
                        }
                    }
                    i7 = s14 + 1;
                }
                if (f == -1.0f) {
                    short s16 = 0;
                    while (true) {
                        short s17 = s16;
                        if (s17 >= i3) {
                            break;
                        }
                        short s18 = 0;
                        while (true) {
                            short s19 = s18;
                            if (s19 < i2) {
                                if (s9 == sArr[(s17 * i2) + s19] || sArr[(s17 * i2) + s19] == 0) {
                                    float m2147a2 = C0758f.m2147a(s17, s19, s3, s4);
                                    if (f == -1.0f || m2147a2 < f) {
                                        f = m2147a2;
                                        s12 = s17;
                                        s13 = s19;
                                        s8 = 0;
                                    }
                                }
                                s18 = (short) (s19 + 1);
                            }
                        }
                        s16 = (short) (s17 + 1);
                    }
                }
                s6 = s12;
                s7 = s13;
                if (C0907l.f5999a) {
                    Log.m4933d("RustedWarfare", "fakeNode search was:" + (System.currentTimeMillis() - this.f6070y));
                }
            }
        }
        boolean z3 = true;
        int i9 = s6 - s8;
        loop6: while (true) {
            short s20 = (short) i9;
            if (s20 > s6 + s8) {
                break;
            }
            int i10 = s7 - s8;
            while (true) {
                short s21 = (short) i10;
                if (s21 <= s7 + s8) {
                    if (s20 < 0 || s20 >= i3 || s21 < 0 || s21 >= i2 || m1112a(s20, s21) == -1) {
                        i10 = s21 + 1;
                    } else {
                        z3 = false;
                        break loop6;
                    }
                }
            }
            i9 = s20 + 1;
        }
        if (z3) {
            short s22 = s6;
            short s23 = s7;
            float f2 = -1.0f;
            if (C0907l.f5999a) {
                Log.m4933d("RustedWarfare", "end is blocked on non isolated groups");
            }
            int i11 = s6 - 9;
            while (true) {
                short s24 = (short) i11;
                if (s24 > s6 + 9) {
                    break;
                }
                int i12 = s7 - 9;
                while (true) {
                    short s25 = (short) i12;
                    if (s25 <= s7 + 9) {
                        if (s24 >= 0 && s24 < i3 && s25 >= 0 && s25 < i2 && m1112a(s24, s25) != -1) {
                            float m2147a3 = C0758f.m2147a(s24, s25, s6, s7);
                            if (f2 == -1.0f || m2147a3 < f2) {
                                f2 = m2147a3;
                                s22 = s24;
                                s23 = s25;
                                s8 = 0;
                            }
                        }
                        i12 = s25 + 1;
                    }
                }
                i11 = s24 + 1;
            }
            if (f2 == -1.0f) {
                short s26 = 0;
                while (true) {
                    short s27 = s26;
                    if (s27 >= i3) {
                        break;
                    }
                    short s28 = 0;
                    while (true) {
                        short s29 = s28;
                        if (s29 < i2) {
                            if (m1112a(s27, s29) != -1) {
                                float m2147a4 = C0758f.m2147a(s27, s29, s6, s7);
                                if (f2 == -1.0f || m2147a4 < f2) {
                                    f2 = m2147a4;
                                    s22 = s27;
                                    s23 = s29;
                                    s8 = 0;
                                }
                            }
                            s28 = (short) (s29 + 1);
                        }
                    }
                    s26 = (short) (s27 + 1);
                }
            }
            s6 = s22;
            s7 = s23;
            if (C0907l.f5999a) {
                Log.m4933d("RustedWarfare", "fakeNode search was:" + (System.currentTimeMillis() - this.f6070y));
            }
        }
        if (C0907l.f5999a && (s6 != s3 || s7 != s4)) {
            Log.m4933d("RustedWarfare", "Moved end to fakeEndX:" + ((int) s6) + " fakeEndY:" + ((int) s7));
        }
        this.f6060o.m1122a(s6, s7);
        this.f6060o.m1121a(0, s, s2);
        this.f6061p.m1122a(s, s2);
        m1106a(s6, s7, s8);
        this.f6061p.m1121a(0, s6, s7);
        int i13 = 0;
        while (0 == 0) {
            i13++;
            if (c0901f.f5992w) {
                return;
            }
            i4++;
            C0908m c0908m = this.f6061p;
            C0909n m1118c = c0908m.m1118c();
            if (m1118c == null) {
                break;
            }
            C0911p m1097a = c0911p2.m1097a(m1118c);
            int m1095a = m1097a.m1095a(this, (byte) 1);
            byte m1196a = (byte) (c0902g.m1196a(m1097a) - 1);
            boolean m1193b = c0902g.m1193b(m1097a);
            c0902g.m1194a(m1097a, true);
            if (m1193b) {
                b = 0;
                b2 = 7;
            } else {
                byte b3 = 2;
                if (this.f6050f != null && this.f6050f[(m1097a.f6074a * i2) + m1097a.f6075b] > 1) {
                    b3 = 1;
                }
                b = (byte) (m1196a - b3);
                b2 = (byte) (m1196a + b3);
            }
            byte b4 = b;
            while (true) {
                byte b5 = b4;
                if (b5 <= b2) {
                    c0911p.m1089a(m1097a);
                    byte b6 = b5;
                    if (b6 > 7) {
                        b6 = (byte) (b6 - 8);
                    }
                    if (b6 < 0) {
                        b6 = (byte) (b6 + 8);
                    }
                    if (b6 == 0) {
                        c0911p.f6074a = (short) (c0911p.f6074a + 1);
                    }
                    if (b6 == 1) {
                        c0911p.f6074a = (short) (c0911p.f6074a + 1);
                        c0911p.f6075b = (short) (c0911p.f6075b + 1);
                    }
                    if (b6 == 2) {
                        c0911p.f6075b = (short) (c0911p.f6075b + 1);
                    }
                    if (b6 == 3) {
                        c0911p.f6075b = (short) (c0911p.f6075b + 1);
                        c0911p.f6074a = (short) (c0911p.f6074a - 1);
                    }
                    if (b6 == 4) {
                        c0911p.f6074a = (short) (c0911p.f6074a - 1);
                    }
                    if (b6 == 5) {
                        c0911p.f6074a = (short) (c0911p.f6074a - 1);
                        c0911p.f6075b = (short) (c0911p.f6075b - 1);
                    }
                    if (b6 == 6) {
                        c0911p.f6075b = (short) (c0911p.f6075b - 1);
                    }
                    if (b6 == 7) {
                        c0911p.f6075b = (short) (c0911p.f6075b - 1);
                        c0911p.f6074a = (short) (c0911p.f6074a + 1);
                    }
                    if (c0911p.f6074a >= 0 && c0911p.f6074a < i3 && c0911p.f6075b >= 0 && c0911p.f6075b < i2 && (m1096a = c0911p.m1096a(this)) != -1) {
                        int m1095a2 = c0911p.m1095a(this, (byte) 1);
                        if (!c0902g.m1192c(c0911p)) {
                            if (c0911p.f6074a != m1097a.f6074a && c0911p.f6075b != m1097a.f6075b) {
                                if (m1112a(c0911p.f6074a, m1097a.f6075b) != -1 && m1112a(m1097a.f6074a, c0911p.f6075b) != -1) {
                                    i = m1095a + 14 + m1096a + 1;
                                }
                            } else {
                                i = m1095a + 10 + m1096a + 1;
                            }
                            if (m1196a != b6 && !m1193b) {
                                i += m1104b(m1196a, b6);
                            }
                            if (this.f6050f != null) {
                                i += (4 - this.f6050f[(c0911p.f6074a * i2) + c0911p.f6075b]) * 7;
                            }
                            if (0 > 0 && this.f6050f != null && this.f6050f[(c0911p.f6074a * i2) + c0911p.f6075b] <= 0) {
                                i += 100;
                            }
                            if (m1095a2 < this.f6054i || i < m1095a2) {
                                c0902g.m1195a(c0911p, (byte) (b6 + 1));
                                c0902g.m1194a(c0911p, false);
                                c0911p.m1092a(this, (byte) 1, i);
                                c0908m.m1121a(i - this.f6054i, c0911p.f6074a, c0911p.f6075b);
                            }
                        }
                    }
                    b4 = (byte) (b5 + 1);
                }
            }
        }
        if (C0907l.f5999a) {
            Log.m4933d("RustedWarfare", "grid path finshed in :" + i13 + " ticks");
            Log.m4933d("RustedWarfare", "grid path done in:" + (System.currentTimeMillis() - this.f6070y));
        }
        System.currentTimeMillis();
        c0902g.f5949c = s6;
        c0902g.f5950d = s7;
        c0901f.f5944b = c0902g;
        C0907l.f6003e = c0901f;
        this.f6071z = AbstractC0916l.m1051U();
        if (C0907l.f5999a) {
            Log.m4933d("RustedWarfare", "path(" + c0901f.f5974e + ") finished in:" + (this.f6071z - this.f6070y));
        }
        if (C0907l.f6010l && !AbstractC0916l.m1071A().f6154bH) {
            Debug.stopMethodTracing();
            C0907l.f6010l = false;
        }
    }
}
