package com.corrodinggames.rts.game.units;

import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import com.corrodinggames.rts.game.AbstractC0197n;
import com.corrodinggames.rts.game.C0195l;
import com.corrodinggames.rts.game.p010a.AbstractC0163h;
import com.corrodinggames.rts.game.p010a.C0164i;
import com.corrodinggames.rts.game.p012b.C0173b;
import com.corrodinggames.rts.game.p012b.C0180g;
import com.corrodinggames.rts.game.units.custom.C0348af;
import com.corrodinggames.rts.game.units.custom.C0402bc;
import com.corrodinggames.rts.game.units.custom.C0449h;
import com.corrodinggames.rts.game.units.custom.EnumC0347ae;
import com.corrodinggames.rts.game.units.custom.p018b.C0399m;
import com.corrodinggames.rts.game.units.custom.p020d.C0424b;
import com.corrodinggames.rts.game.units.p013a.AbstractC0224s;
import com.corrodinggames.rts.game.units.p013a.C0213h;
import com.corrodinggames.rts.game.units.p024d.AbstractC0488d;
import com.corrodinggames.rts.game.units.p024d.C0510r;
import com.corrodinggames.rts.game.units.p027f.AbstractC0545j;
import com.corrodinggames.rts.game.units.p028g.C0552c;
import com.corrodinggames.rts.gameFramework.AbstractC1120w;
import com.corrodinggames.rts.gameFramework.C0637ab;
import com.corrodinggames.rts.gameFramework.C0740d;
import com.corrodinggames.rts.gameFramework.C0758f;
import com.corrodinggames.rts.gameFramework.Core;
import com.corrodinggames.rts.gameFramework.EnumC0729bm;
import com.corrodinggames.rts.gameFramework.p030a.C0631e;
import com.corrodinggames.rts.gameFramework.p035d.C0741a;
import com.corrodinggames.rts.gameFramework.p035d.C0745e;
import com.corrodinggames.rts.gameFramework.p035d.C0746f;
import com.corrodinggames.rts.gameFramework.p035d.EnumC0744d;
import com.corrodinggames.rts.gameFramework.p035d.EnumC0748h;
import com.corrodinggames.rts.gameFramework.p041i.Reader;
import com.corrodinggames.rts.gameFramework.p041i.StreamWriter;
import com.corrodinggames.rts.gameFramework.p042j.AbstractC0898c;
import com.corrodinggames.rts.gameFramework.p042j.C0906k;
import com.corrodinggames.rts.gameFramework.p042j.C0907l;
import com.corrodinggames.rts.gameFramework.p042j.C0911p;
import com.corrodinggames.rts.gameFramework.p044l.C0930ag;
import com.corrodinggames.rts.gameFramework.p044l.C0934e;
import com.corrodinggames.rts.gameFramework.p044l.InterfaceC1027y;
import com.corrodinggames.rts.gameFramework.utility.C1080ai;
import com.corrodinggames.rts.gameFramework.utility.C1101m;
import com.corrodinggames.rts.gameFramework.utility.C1112u;
import com.corrodinggames.rts.gameFramework.utility.C1117y;
import com.corrodinggames.rts.gameFramework.utility.SlickToAndroidKeycodes;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

/* renamed from: com.corrodinggames.rts.game.units.y */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/y.class */
public abstract class AbstractC0623y extends AbstractC0318c {

    /* renamed from: L */
    protected C0934e f3885L;

    /* renamed from: M */
    protected C0934e f3886M;

    /* renamed from: a */
    private int f3887a;

    /* renamed from: b */
    private float f3888b;

    /* renamed from: c */
    private float f3889c;

    /* renamed from: d */
    private float f3890d;

    /* renamed from: e */
    private float f3891e;

    /* renamed from: f */
    private int f3892f;

    /* renamed from: g */
    private C0305au[] f3893g;

    /* renamed from: O */
    public EnumC0205a f3894O;

    /* renamed from: P */
    int f3895P;

    /* renamed from: Q */
    public AbstractC0244am f3896Q;

    /* renamed from: R */
    public float f3897R;

    /* renamed from: S */
    public float f3898S;

    /* renamed from: T */
    public float f3899T;

    /* renamed from: h */
    private boolean f3900h;

    /* renamed from: i */
    private int f3901i;

    /* renamed from: U */
    public float f3902U;

    /* renamed from: V */
    public float f3903V;

    /* renamed from: W */
    public float f3904W;

    /* renamed from: X */
    public float f3905X;

    /* renamed from: j */
    private boolean f3906j;

    /* renamed from: k */
    private boolean f3907k;

    /* renamed from: l */
    private float f3908l;

    /* renamed from: m */
    private float f3909m;

    /* renamed from: n */
    private int f3910n;

    /* renamed from: o */
    private float f3911o;

    /* renamed from: p */
    private float f3912p;

    /* renamed from: q */
    private byte f3913q;

    /* renamed from: r */
    private int f3914r;

    /* renamed from: s */
    private float f3915s;

    /* renamed from: t */
    private boolean f3916t;

    /* renamed from: Y */
    public AbstractC0244am f3917Y;

    /* renamed from: Z */
    public int f3918Z;

    /* renamed from: aa */
    public float f3919aa;

    /* renamed from: ab */
    public int f3920ab;

    /* renamed from: ac */
    public AbstractC0623y f3921ac;

    /* renamed from: ad */
    public boolean f3922ad;

    /* renamed from: ae */
    public boolean f3923ae;

    /* renamed from: af */
    public int f3924af;

    /* renamed from: ag */
    public short f3925ag;

    /* renamed from: ah */
    public float f3926ah;

    /* renamed from: ai */
    public boolean f3927ai;

    /* renamed from: aj */
    public float f3928aj;

    /* renamed from: ak */
    public float f3929ak;

    /* renamed from: al */
    public float f3930al;

    /* renamed from: am */
    public int f3931am;

    /* renamed from: an */
    public float f3932an;

    /* renamed from: ao */
    public boolean f3933ao;

    /* renamed from: ap */
    public float f3934ap;

    /* renamed from: aq */
    public boolean f3935aq;

    /* renamed from: ar */
    public boolean f3936ar;

    /* renamed from: at */
    public AbstractC0898c f3937at;

    /* renamed from: au */
    protected C0237af[] f3938au;

    /* renamed from: av */
    protected int f3939av;

    /* renamed from: u */
    private boolean f3940u;

    /* renamed from: v */
    private int f3941v;

    /* renamed from: w */
    private int f3942w;

    /* renamed from: aw */
    public boolean f3943aw;

    /* renamed from: ax */
    public boolean f3944ax;

    /* renamed from: ay */
    public float f3945ay;

    /* renamed from: az */
    public float f3946az;

    /* renamed from: aA */
    public AbstractC0163h f3947aA;

    /* renamed from: aB */
    public C0164i f3948aB;

    /* renamed from: aC */
    public boolean f3949aC;

    /* renamed from: aE */
    public static final C0930ag f3950aE;

    /* renamed from: aF */
    public static final PointF f3951aF;

    /* renamed from: x */
    private C0930ag f3952x;

    /* renamed from: y */
    private int f3953y;

    /* renamed from: z */
    private C0930ag f3954z;

    /* renamed from: A */
    private int f3955A;

    /* renamed from: B */
    private static final Paint f3956B;

    /* renamed from: C */
    private static int f3957C;

    /* renamed from: D */
    private static final C0930ag f3958D;

    /* renamed from: E */
    private static final C0930ag f3959E;

    /* renamed from: aG */
    public static AbstractC0545j f3960aG;

    /* renamed from: aH */
    public byte f3961aH;

    /* renamed from: aI */
    public AbstractC0244am[] f3962aI;

    /* renamed from: aJ */
    public float[] f3963aJ;

    /* renamed from: aK */
    public int f3964aK;

    /* renamed from: aL */
    public static final C1112u f3965aL;

    /* renamed from: aM */
    public boolean f3966aM;

    /* renamed from: aN */
    public boolean f3967aN;

    /* renamed from: aO */
    static final C0235ad f3968aO;

    /* renamed from: aP */
    public static C0236ae f3969aP;

    /* renamed from: aQ */
    public static C0236ae f3970aQ;

    /* renamed from: aR */
    public static C0239ah f3971aR;

    /* renamed from: aS */
    public static C0239ah f3972aS;

    /* renamed from: aT */
    C0906k f3973aT;

    /* renamed from: aU */
    static C1101m f3974aU;

    /* renamed from: aV */
    public static final C0237af f3975aV;

    /* renamed from: aW */
    protected static PorterDuffColorFilter f3976aW;

    /* renamed from: aX */
    protected static PorterDuffColorFilter f3977aX;

    /* renamed from: aY */
    protected static PorterDuffColorFilter f3978aY;

    /* renamed from: aZ */
    protected static PorterDuffColorFilter f3979aZ;

    /* renamed from: ba */
    protected static Paint f3980ba;

    /* renamed from: bb */
    protected static Paint f3981bb;

    /* renamed from: bc */
    protected static Paint f3982bc;

    /* renamed from: bd */
    static final PointF f3983bd;

    /* renamed from: be */
    protected static final C1080ai f3984be;

    /* renamed from: bf */
    protected static final PointF f3985bf;

    /* renamed from: bg */
    protected static final PointF f3986bg;

    /* renamed from: bh */
    protected static final C1080ai f3987bh;

    /* renamed from: bi */
    protected static final PointF f3988bi;

    /* renamed from: bj */
    static final Point f3989bj;

    /* renamed from: bk */
    static final Point f3990bk;

    /* renamed from: bl */
    static final PointF f3991bl;

    /* renamed from: bm */
    static final C0625z f3992bm;

    /* renamed from: bn */
    public static final C0234ac f3993bn;

    /* renamed from: bo */
    public C1101m f3994bo;

    /* renamed from: bp */
    static C1101m f3995bp;

    /* renamed from: K */
    public static boolean f3996K = false;

    /* renamed from: N */
    public static final C0305au[] f3997N = new C0305au[0];

    /* renamed from: as */
    public static final C0237af[] f3998as = new C0237af[0];

    /* renamed from: aD */
    public static final C0930ag f3999aD = new C0930ag();

    /* renamed from: d */
    public abstract C0934e mo3046d();

    /* renamed from: k */
    public abstract C0934e mo3037k();

    /* renamed from: d */
    public abstract C0934e mo3045d(int i);

    /* renamed from: I */
    public abstract boolean mo3057I();

    /* renamed from: m */
    public abstract float mo3035m();

    /* renamed from: b */
    public abstract float mo3050b(int i);

    /* renamed from: A */
    public abstract float mo3065A();

    /* renamed from: c */
    public abstract float mo3048c(int i);

    /* renamed from: z */
    public abstract float mo3033z();

    /* renamed from: a */
    public abstract void mo3051a(AbstractC0244am abstractC0244am, int i);

    /* renamed from: a */
    static /* synthetic */ void m2964a(AbstractC0623y abstractC0623y, AbstractC0244am abstractC0244am, float f, boolean z) {
        abstractC0623y.m2976a(abstractC0244am, f, z);
    }

    static {
        f3999aD.m5933a(128, 255, 255, 255);
        f3999aD.m903o();
        f3950aE = new C0930ag();
        f3950aE.m5925a(f3999aD);
        f3950aE.mo5914a(true);
        f3950aE.m5897d(true);
        f3950aE.m5905b(true);
        f3950aE.m903o();
        f3951aF = new PointF();
        f3956B = new Paint();
        f3958D = m2955a(false);
        f3959E = m2955a(true);
        f3960aG = new C06241();
        f3965aL = new C1112u();
        f3968aO = new C0235ad();
        f3969aP = new C0236ae(true);
        f3970aQ = new C0236ae(false);
        f3971aR = new C0239ah(true);
        f3972aS = new C0239ah(false);
        f3974aU = new C1101m();
        f3975aV = new C0237af();
        f3976aW = new PorterDuffColorFilter(Color.m5949a(200, 255, 200), PorterDuff.Mode.MULTIPLY);
        f3977aX = new PorterDuffColorFilter(Color.m5949a(70, 255, 70), PorterDuff.Mode.MULTIPLY);
        f3978aY = new PorterDuffColorFilter(Color.m5949a(255, 40, 40), PorterDuff.Mode.MULTIPLY);
        f3979aZ = new PorterDuffColorFilter(Color.m5949a(120, 120, 255), PorterDuff.Mode.MULTIPLY);
        f3980ba = C1117y.m458b();
        f3981bb = C1117y.m458b();
        f3982bc = C1117y.m458b();
        f3983bd = new PointF();
        f3984be = new C1080ai();
        f3985bf = new PointF();
        f3986bg = new PointF();
        f3987bh = new C1080ai();
        f3988bi = new PointF();
        f3989bj = new Point();
        f3990bk = new Point();
        f3991bl = new PointF();
        f3992bm = new C0625z();
        f3993bn = new C0234ac();
        f3995bp = new C1101m();
    }

    /* renamed from: b */
    public void m2900b(float f) {
        if (this.f3945ay < f) {
            this.f3945ay = f;
        }
    }

    /* renamed from: R */
    public Paint m3009R() {
        if (m2939aO()) {
            return f3950aE;
        }
        return f3999aD;
    }

    /* renamed from: a */
    public static void m2962a(AbstractC0623y abstractC0623y, AbstractC0623y abstractC0623y2) {
        try {
            StreamWriter streamWriter = new StreamWriter();
            int i = abstractC0623y.f3892f;
            for (int i2 = 0; i2 < i; i2++) {
                abstractC0623y.f3893g[i2].m4454a(streamWriter);
            }
            Reader reader = new Reader(streamWriter.m1399d());
            abstractC0623y2.f3892f = i;
            for (int i3 = 0; i3 < i; i3++) {
                int i4 = i3;
                abstractC0623y2.m2809m(i4);
                if (i4 >= abstractC0623y2.f3893g.length) {
                    Core.m998b("Too many waypoints:" + i3);
                    i4 = abstractC0623y2.f3893g.length - 1;
                }
                if (abstractC0623y2.f3893g[i4] == null) {
                    abstractC0623y2.f3893g[i4] = new C0305au();
                }
                abstractC0623y2.f3893g[i4].m4453a(reader);
                abstractC0623y2.f3893g[i4].m4448c();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: a */
    public void mo2441a(StreamWriter streamWriter) {
        streamWriter.mo1335a(this.f3888b);
        streamWriter.mo1335a(this.f3889c);
        streamWriter.mo1335a(this.f1649cJ[0].f1716e);
        streamWriter.WriteInteger(this.f3892f);
        int i = this.f3892f;
        streamWriter.WriteInteger(i);
        for (int i2 = 0; i2 < i; i2++) {
            this.f3893g[i2].m4454a(streamWriter);
        }
        streamWriter.m1411a(this.f3894O);
        AbstractC0244am abstractC0244am = this.f3896Q;
        if (abstractC0244am != null && abstractC0244am.f1607bT) {
            abstractC0244am = null;
        }
        streamWriter.mo1333a(abstractC0244am);
        streamWriter.mo1335a(this.f3897R);
        streamWriter.mo1335a(this.f3899T);
        streamWriter.mo1335a(this.f3902U);
        streamWriter.m1398d("pathing_active:");
        streamWriter.mo1329a(this.f3907k);
        streamWriter.mo1335a(this.f3908l);
        streamWriter.mo1335a(this.f3909m);
        streamWriter.mo1335a(this.f3915s);
        streamWriter.m1419a(this.f3921ac);
        streamWriter.mo1329a(this.f3922ad);
        streamWriter.mo1329a(this.f3923ae);
        streamWriter.mo1329a(this.f3927ai);
        streamWriter.mo1335a(this.f3928aj);
        streamWriter.mo1335a(this.f3929ak);
        streamWriter.mo1335a(this.f3930al);
        streamWriter.WriteInteger(this.f3931am);
        streamWriter.WriteInteger(this.f3920ab);
        streamWriter.m1398d("activePathCount:");
        streamWriter.WriteInteger(this.f3939av);
        for (int i3 = 0; i3 < this.f3939av; i3++) {
            this.f3938au[i3].m4836a(streamWriter);
        }
        streamWriter.WriteInteger(this.f3939av);
        streamWriter.WriteInteger(this.f3941v);
        if (streamWriter.m1395f()) {
        }
        streamWriter.m1401c(12);
        streamWriter.mo1335a(this.f3911o);
        streamWriter.mo1335a(this.f3912p);
        streamWriter.mo1335a(this.f3890d);
        streamWriter.mo1335a(this.f3891e);
        streamWriter.mo1329a(this.f3940u);
        streamWriter.mo1335a(this.f3926ah);
        streamWriter.WriteInteger(this.f3910n);
        streamWriter.mo1335a(this.f3903V);
        streamWriter.mo1335a(this.f3934ap);
        streamWriter.mo1329a(this.f3935aq);
        streamWriter.mo1329a(this.f3936ar);
        streamWriter.mo1330a(this.f3925ag);
        streamWriter.mo1335a(this.f3919aa);
        streamWriter.WriteInteger(this.f3942w);
        streamWriter.mo1335a(this.f3904W);
        streamWriter.mo1335a(this.f3945ay);
        streamWriter.mo1335a(this.f3946az);
        C0552c.m3232a(this, streamWriter);
        super.mo2441a(streamWriter);
    }

    /* renamed from: a */
    public void m2961a(Reader reader) {
        this.f3888b = reader.m1300g();
        this.f3889c = reader.m1300g();
        this.f1649cJ[0].f1716e = reader.m1300g();
        this.f3892f = reader.ReadInt();
        if (this.f3892f > 0) {
            m2809m(C0758f.m2132c(this.f3892f - 1, 29));
        }
        int i = 30;
        if (reader.m1310b() >= 42) {
            i = reader.ReadInt();
        }
        for (int i2 = 0; i2 < i; i2++) {
            int i3 = i2;
            m2809m(i3);
            if (i3 >= this.f3893g.length) {
                Core.m998b("Too many waypoints:" + i2);
                i3 = this.f3893g.length - 1;
            }
            if (this.f3893g[i3] == null) {
                this.f3893g[i3] = new C0305au();
            }
            this.f3893g[i3].m4453a(reader);
        }
        this.f3894O = (EnumC0205a) reader.m1308b(EnumC0205a.class);
        if (this.f3894O == EnumC0205a.f1418a) {
            if (!mo3057I()) {
                this.f3894O = EnumC0205a.f1419b;
            }
            if (reader.m1310b() < 74) {
                this.f3894O = EnumC0205a.f1419b;
            }
        }
        long m1293n = reader.m1293n();
        this.f3897R = reader.m1300g();
        this.f3899T = reader.m1300g();
        this.f3902U = reader.m1300g();
        this.f3907k = reader.ReadBool();
        this.f3908l = reader.m1300g();
        this.f3909m = reader.m1300g();
        this.f3915s = reader.m1300g();
        m2966a(reader.m1291p());
        this.f3922ad = reader.ReadBool();
        this.f3923ae = reader.ReadBool();
        this.f3927ai = reader.ReadBool();
        this.f3928aj = reader.m1300g();
        this.f3929ak = reader.m1300g();
        this.f3930al = reader.m1300g();
        this.f3931am = reader.ReadInt();
        if (reader.m1310b() >= 18) {
            this.f3920ab = reader.ReadInt();
        }
        if (reader.m1310b() >= 21) {
            int ReadInt = reader.ReadInt();
            for (int i4 = 0; i4 < ReadInt; i4++) {
                m2813l(i4);
                if (this.f3938au[i4] == null) {
                    this.f3938au[i4] = new C0237af();
                }
                this.f3938au[i4].m4835a(reader);
            }
        } else {
            for (int i5 = 0; i5 < 60; i5++) {
                m2813l(i5);
                if (this.f3938au[i5] == null) {
                    this.f3938au[i5] = new C0237af();
                }
                this.f3938au[i5].m4835a(reader);
            }
        }
        this.f3939av = reader.ReadInt();
        this.f3941v = reader.ReadInt();
        byte m1304d = reader.m1304d();
        if (m1304d >= 1) {
            this.f3911o = reader.m1300g();
            this.f3912p = reader.m1300g();
        }
        if (m1304d >= 2) {
            this.f3890d = reader.m1300g();
            this.f3891e = reader.m1300g();
        }
        if (m1304d >= 3) {
            this.f3940u = reader.ReadBool();
        }
        if (m1304d >= 4) {
            this.f3926ah = reader.m1300g();
            this.f3910n = reader.ReadInt();
        }
        if (m1304d >= 5) {
            this.f3903V = reader.m1300g();
        }
        if (m1304d >= 6) {
            this.f3934ap = reader.m1300g();
            this.f3935aq = reader.ReadBool();
            this.f3936ar = reader.ReadBool();
        }
        if (m1304d >= 7) {
            this.f3925ag = reader.m1285v();
        }
        if (m1304d >= 8) {
            this.f3919aa = reader.m1300g();
        }
        if (m1304d >= 9) {
            this.f3942w = reader.ReadInt();
        }
        if (m1304d >= 10) {
            this.f3904W = reader.m1300g();
        }
        if (m1304d >= 11) {
            this.f3945ay = reader.m1300g();
            this.f3946az = reader.m1300g();
        }
        if (m1304d >= 12) {
            C0552c.m3231a(this, reader);
        }
        super.m4779a(reader);
        if (!this.f1607bT) {
            this.f3896Q = AbstractC1120w.m442a(m1293n, false);
            for (int i6 = 0; i6 < this.f3892f; i6++) {
                if (this.f3893g[i6] == null) {
                    Core.LogDebug2("readIn: convertUnitIds is null: " + i6 + " waypointsCount:" + this.f3892f);
                } else {
                    this.f3893g[i6].m4448c();
                }
            }
        }
        m3008S();
        if (this.f1607bT) {
            this.f4232et = true;
        }
    }

    /* renamed from: b */
    public void m2894b(AbstractC0197n abstractC0197n) {
        super.m4768b(abstractC0197n);
        m3008S();
    }

    /* renamed from: S */
    public void m3008S() {
        this.f3885L = mo3046d();
        this.f3886M = mo3037k();
    }

    /* renamed from: h */
    public float m2827h(int i) {
        return 0.0f;
    }

    /* renamed from: i */
    public float m2823i(int i) {
        return 0.0f;
    }

    /* renamed from: T */
    public C0934e m3007T() {
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v28, types: [android.graphics.Paint] */
    /* JADX WARN: Type inference failed for: r0v33, types: [android.graphics.Paint] */
    /* JADX WARN: Type inference failed for: r0v34, types: [android.graphics.Paint] */
    /* JADX WARN: Type inference failed for: r0v35, types: [android.graphics.Paint] */
    /* JADX WARN: Type inference failed for: r0v36, types: [android.graphics.Paint] */
    /* renamed from: a */
    public Paint m2985a(int i, ColorFilter colorFilter, boolean z) {
        C0930ag c0930ag;
        int i2;
        if (i == -1 && colorFilter == null) {
            if (z) {
                return f3959E;
            }
            return f3958D;
        }
        if (this.f1627cn) {
            if (colorFilter == null) {
                c0930ag = f3956B;
                i2 = f3957C;
                f3957C = i;
            } else {
                c0930ag = f3956B;
                i2 = -1;
                if (colorFilter == f3978aY) {
                    c0930ag = f3981bb;
                }
                if (colorFilter == f3977aX) {
                    c0930ag = f3980ba;
                }
                if (colorFilter == f3979aZ) {
                    c0930ag = f3982bc;
                }
            }
        } else if (z) {
            if (this.f3954z == null) {
                this.f3954z = m2955a(true);
            }
            c0930ag = this.f3954z;
            i2 = this.f3955A;
            this.f3955A = i;
        } else {
            if (this.f3952x == null) {
                this.f3952x = m2955a(false);
            }
            c0930ag = this.f3952x;
            i2 = this.f3953y;
            this.f3953y = i;
        }
        if (i2 != i) {
            c0930ag.m5908b(i);
        }
        if (c0930ag.m5891h() != colorFilter) {
            c0930ag.m5930a(colorFilter);
        }
        return c0930ag;
    }

    /* renamed from: a */
    public static C0930ag m2955a(boolean z) {
        C0930ag c0930ag = new C0930ag();
        if (z) {
            c0930ag.mo5914a(true);
            c0930ag.m5897d(true);
            c0930ag.m5905b(true);
        } else {
            c0930ag.mo5914a(false);
            c0930ag.m5897d(false);
            c0930ag.m5905b(false);
        }
        return c0930ag;
    }

    public AbstractC0623y(boolean z) {
        super(z);
        this.f3892f = 0;
        this.f3893g = f3997N;
        this.f3894O = EnumC0205a.f1419b;
        this.f3895P = -9999;
        this.f3901i = -9999;
        this.f3908l = 3.0f;
        this.f3909m = 3.0f;
        this.f3927ai = false;
        this.f3928aj = 0.0f;
        this.f3929ak = 0.0f;
        this.f3930al = 0.0f;
        this.f3931am = 0;
        this.f3932an = 0.0f;
        this.f3934ap = -999.0f;
        this.f3935aq = false;
        this.f3936ar = false;
        this.f3938au = f3998as;
        this.f3939av = 0;
        this.f3941v = 0;
        this.f3943aw = true;
        this.f3952x = null;
        this.f3954z = null;
        this.f3961aH = (byte) 0;
        this.f3964aK = -9999;
        this.f3973aT = null;
    }

    /* renamed from: j */
    public final void m2820j(int i) {
        int mo3169bl = mo3169bl();
        for (int i2 = 0; i2 < mo3169bl; i2++) {
            this.f1649cJ[i2].m4637a(i);
        }
    }

    /* renamed from: a */
    public void m2957a(String str) {
        String str2;
        if (mo1758r() != null) {
            str2 = mo1758r().mo4474i();
        } else {
            str2 = "<NO UNIT TYPE>";
        }
        Core.LogDebug2("(Unit log:" + str2 + " id:" + this.f6951ee + "): " + str);
    }

    /* renamed from: U */
    public void m3006U() {
        String str;
        if (mo1758r() != null) {
            str = mo1758r().mo4474i();
        } else {
            str = "<NO UNIT TYPE>";
        }
        Core.LogDebug2("---- Debug for:" + str + " id:" + this.f6951ee + "---");
    }

    /* renamed from: a */
    public void mo1762a(float f) {
        float mo3062D;
        float f2;
        float f3;
        super.mo1762a(f);
        Core m1087A = Core.m1087A();
        if (this.f3944ax) {
            this.f3944ax = false;
        }
        if (this.f1623cj != 0.0f) {
            this.f1623cj = C0758f.m2211a(this.f1623cj, f);
        }
        if (!this.f1607bT && m4751bS()) {
            if (this.f3945ay > 0.0f) {
                this.f3945ay = C0758f.m2211a(this.f3945ay, f);
            }
            if (this.f3946az > 0.0f) {
                this.f3946az = C0758f.m2211a(this.f3946az, f);
            }
            if (this.f3994bo != null) {
                C0552c.m3234a(this, f);
            }
            float f4 = this.f6958el;
            float f5 = this.f6959em;
            int mo3169bl = mo3169bl();
            for (int i = 0; i < mo3169bl; i++) {
                C0247ap c0247ap = this.f1649cJ[i];
                if (c0247ap.f1715d == 0.0f) {
                    float mo3182C = mo3182C(i);
                    if (m2895b(i, f) && c0247ap.f1712a != mo3182C) {
                        if (C0758f.m2137c(C0758f.m2135c(c0247ap.f1712a, mo3182C, 360.0f)) < 0.5f) {
                            c0247ap.f1715d = 20.0f;
                            c0247ap.f1714c = 0.0f;
                        } else {
                            m2999a(f, mo3182C, i);
                        }
                    }
                } else {
                    c0247ap.f1715d = C0758f.m2211a(c0247ap.f1715d, f);
                }
            }
            if (!m2868bk()) {
                m2817k(f);
            }
            for (int i2 = 0; i2 < mo3169bl; i2++) {
                C0247ap c0247ap2 = this.f1649cJ[i2];
                if (c0247ap2.f1716e != 0.0f) {
                    c0247ap2.f1716e = C0758f.m2211a(c0247ap2.f1716e, f);
                }
            }
            boolean mo3320bi = mo3320bi();
            boolean z = (this.f1614ca == 0.0f && this.f1615cb == 0.0f) ? false : true;
            if ((this.f1617cd != 0.0f || z) && mo3057I()) {
                float f6 = this.f1618ce;
                float mo3033z = mo3033z();
                if (mo3319bj()) {
                    f6 = this.f1619cf;
                }
                if (!mo3320bi) {
                    float f7 = mo3033z * this.f1617cd * f;
                    f4 += C0758f.m2092i(f6) * f7;
                    f5 += C0758f.m2097h(f6) * f7 * m2928aZ();
                    if (z) {
                        f4 += this.f1614ca * f;
                        f5 += this.f1615cb * f * m2928aZ();
                        if (C0758f.m2209a(0.0f, 0.0f, this.f1614ca, this.f1615cb) > mo3033z * mo3033z) {
                            this.f1614ca = (float) (this.f1614ca - ((this.f1614ca * 0.05d) * f));
                            this.f1615cb = (float) (this.f1615cb - ((this.f1615cb * 0.05d) * f));
                        }
                        this.f1614ca = C0758f.m2210a(this.f1614ca, 0.0f, 0.5f * mo3033z * f);
                        this.f1615cb = C0758f.m2210a(this.f1615cb, 0.0f, 0.5f * mo3033z * f);
                    }
                } else {
                    if (this.f1617cd != 0.0f) {
                        mo3062D = mo3063C() * 1.41f;
                        f2 = C0758f.m2092i(f6) * mo3033z * this.f1617cd;
                        f3 = C0758f.m2097h(f6) * mo3033z * this.f1617cd;
                    } else {
                        mo3062D = mo3062D() * 1.41f;
                        f2 = 0.0f;
                        f3 = 0.0f;
                    }
                    float m2209a = C0758f.m2209a(this.f1614ca, this.f1615cb, f2, f3);
                    if (m2209a > mo3033z * mo3033z) {
                        this.f1614ca = (float) (this.f1614ca - ((this.f1614ca * 0.05d) * f));
                        this.f1615cb = (float) (this.f1615cb - ((this.f1615cb * 0.05d) * f));
                    }
                    float f8 = mo3062D * f;
                    if (m2209a < f8 * f8) {
                        this.f1614ca = f2;
                        this.f1615cb = f3;
                    } else {
                        float m2123d = C0758f.m2123d(this.f1614ca, this.f1615cb, f2, f3);
                        this.f1614ca += C0758f.m2092i(m2123d) * f8;
                        this.f1615cb += C0758f.m2097h(m2123d) * f8;
                    }
                    f4 += this.f1614ca * f;
                    f5 += this.f1615cb * f * m2928aZ();
                }
                this.f3944ax = true;
            }
            if (this.f1611bX != 0.0f || this.f1612bY != 0.0f) {
                this.f1611bX = C0758f.m2158b(this.f1611bX, -9.0f, 9.0f);
                this.f1612bY = C0758f.m2158b(this.f1612bY, -9.0f, 9.0f);
                f4 += this.f1611bX;
                f5 += this.f1612bY;
                this.f1612bY = 0.0f;
                this.f1611bX = 0.0f;
                this.f3944ax = true;
            }
            if (this.f3944ax && mo3057I() && this.f1652cM == null) {
                m2989a(f, m1087A, f4, f5);
            }
            if (this.f3943aw) {
                this.f3943aw = false;
                m2846c(false);
                this.f3944ax = true;
            }
        }
    }

    /* renamed from: a */
    private void m2989a(float f, Core core, float f2, float f3) {
        C0173b c0173b = core.f6110bL;
        float f4 = c0173b.f789r;
        float f5 = c0173b.f790s;
        float f6 = this.f6958el * f4;
        float f7 = this.f6959em * f5;
        float f8 = f2 * f4;
        float f9 = f3 * f5;
        PointF pointF = null;
        boolean z = false;
        int m2117e = C0758f.m2117e(f6);
        int m2117e2 = C0758f.m2117e(f7);
        int m2117e3 = C0758f.m2117e(f8);
        int m2117e4 = C0758f.m2117e(f9);
        if ((m2117e != m2117e3 || m2117e2 != m2117e4) && this.f1623cj == 0.0f && core.f6119bU.m1166a(mo3039h(), m2117e3, m2117e4)) {
            if (m2117e != m2117e3 && m2117e2 != m2117e4) {
                boolean m1166a = core.f6119bU.m1166a(mo3039h(), m2117e, m2117e4);
                boolean m1166a2 = core.f6119bU.m1166a(mo3039h(), m2117e3, m2117e2);
                if (m1166a && m1166a2) {
                    z = true;
                    f3951aF.m5879a(f6, f7);
                    pointF = f3951aF;
                }
                if (pointF == null && m1166a) {
                    pointF = C0248aq.m4633a(mo3039h(), f6, f7, f8, f9, m2117e, m2117e4, false);
                }
                if (pointF == null && m1166a2) {
                    pointF = C0248aq.m4633a(mo3039h(), f6, f7, f8, f9, m2117e3, m2117e2, false);
                }
            }
            if (pointF == null) {
                pointF = C0248aq.m4633a(mo3039h(), f6, f7, f8, f9, m2117e3, m2117e4, false);
            }
            if (pointF == null) {
                z = true;
                f3951aF.m5879a(f6, f7);
                pointF = f3951aF;
            }
        }
        boolean z2 = false;
        if (pointF != null) {
            boolean z3 = false;
            if (core.f6119bU.m1166a(mo3039h(), m2117e, m2117e2) && !core.f6119bU.m1153b(mo3039h(), m2117e3, m2117e4)) {
                z3 = true;
            }
            if (!z3) {
                f2 = pointF.f227a * c0173b.f785n;
                f3 = pointF.f228b * c0173b.f786o;
                z2 = true;
            } else {
                z = false;
            }
        }
        if (z2) {
            this.f3888b += f;
            this.f3887a = 0;
        } else if (this.f3888b != 0.0f && f > 0.0f) {
            this.f3887a++;
            if (this.f3887a >= 3) {
                this.f3888b = 0.0f;
            }
        }
        if (!z) {
            int m2117e5 = C0758f.m2117e(f2 * f4);
            int m2117e6 = C0758f.m2117e(f3 * f5);
            this.f6958el = f2;
            this.f6959em = f3;
            if (m2117e != m2117e5 || m2117e2 != m2117e6) {
                m2846c(true);
            }
        }
    }

    /* renamed from: b */
    public void m2899b(float f, float f2) {
        C0173b c0173b = Core.m1087A().f6110bL;
        float f3 = c0173b.f789r;
        float f4 = c0173b.f790s;
        int m2117e = C0758f.m2117e(this.f6958el * f3);
        int m2117e2 = C0758f.m2117e(this.f6959em * f4);
        int m2117e3 = C0758f.m2117e(f * f3);
        int m2117e4 = C0758f.m2117e(f2 * f4);
        this.f6958el = f;
        this.f6959em = f2;
        if (m2117e != m2117e3 || m2117e2 != m2117e4) {
            m2846c(true);
        }
    }

    /* renamed from: com.corrodinggames.rts.game.units.y$1 */
    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/y$1.class */
    final class C06241 extends AbstractC0545j {
        C06241() {
        }

        public void callback(AbstractC0623y abstractC0623y, float f, AbstractC0244am abstractC0244am) {
            AbstractC0623y.m2964a(abstractC0623y, abstractC0244am, f, true);
        }
    }

    /* renamed from: g */
    public static void m2833g(float f) {
        int i;
        float f2;
        Core m1087A = Core.m1087A();
        AbstractC0244am[] m498a = AbstractC0244am.f1590bD.m498a();
        int size = AbstractC0244am.f1590bD.size();
        m1087A.f6128cd.m2436a(EnumC0729bm.f4586j);
        int i2 = m1087A.f6102by;
        for (int i3 = 0; i3 < size; i3++) {
            if (m498a[i3] instanceof AbstractC0623y) {
                AbstractC0623y abstractC0623y = (AbstractC0623y) m498a[i3];
                if ((abstractC0623y.f3944ax || abstractC0623y.f1613bZ) && abstractC0623y.mo3057I() && abstractC0623y.f3964aK <= i2) {
                    abstractC0623y.f1613bZ = false;
                    abstractC0623y.f3944ax = true;
                    if (abstractC0623y.f1648cI) {
                        f2 = abstractC0623y.f1621ch + 7.0f;
                        if (abstractC0623y.f3961aH > 9) {
                            abstractC0623y.f3964aK = i2 + 200 + (i3 % 50);
                        } else {
                            abstractC0623y.f3964aK = i2 + 50 + (i3 % 50);
                        }
                    } else {
                        f2 = abstractC0623y.f1621ch + 5.0f;
                        abstractC0623y.f3964aK = i2 + 250 + (i3 % 50);
                    }
                    abstractC0623y.f3961aH = (byte) 0;
                    f3965aL.clear();
                    m1087A.f6127cc.m3249b(abstractC0623y.f6958el, abstractC0623y.f6959em, f2, f3965aL);
                    AbstractC0244am[] m498a2 = f3965aL.m498a();
                    int i4 = f3965aL.f6922b;
                    for (int i5 = 0; i5 < i4; i5++) {
                        abstractC0623y.m2976a(m498a2[i5], f, true);
                    }
                    if (abstractC0623y.f3961aH > 9 && abstractC0623y.f1585by > i2 - 400) {
                        abstractC0623y.f3964aK = m1087A.f6102by + 5 + (i3 % 5);
                        abstractC0623y.f1613bZ = true;
                    }
                }
            }
        }
        m1087A.f6128cd.m2431b(EnumC0729bm.f4586j);
        m1087A.f6128cd.m2436a(EnumC0729bm.f4587k);
        for (int i6 = 0; i6 < size; i6++) {
            if (m498a[i6] instanceof AbstractC0623y) {
                AbstractC0623y abstractC0623y2 = (AbstractC0623y) m498a[i6];
                if (abstractC0623y2.f3944ax && (i = abstractC0623y2.f3961aH) > 0 && abstractC0623y2.mo3057I()) {
                    if (!abstractC0623y2.f1613bZ) {
                        abstractC0623y2.f1613bZ = true;
                    }
                    for (int i7 = 0; i7 < i; i7++) {
                        abstractC0623y2.m2976a(abstractC0623y2.f3962aI[i7], f, false);
                    }
                }
            }
        }
        m1087A.f6128cd.m2431b(EnumC0729bm.f4587k);
    }

    /* renamed from: a */
    private void m2976a(AbstractC0244am abstractC0244am, float f, boolean z) {
        C0305au m2909ar;
        C0305au m2909ar2;
        if (abstractC0244am != this && abstractC0244am.f1606bS && this.f1606bS && mo3038i() == abstractC0244am.mo3038i() && mo3054Q() == abstractC0244am.mo3054Q() && abstractC0244am.f1651cL == null && this.f1651cL == null && this.f1603bP != abstractC0244am && abstractC0244am.f1603bP != this) {
            float f2 = this.f6958el + this.f1611bX;
            float f3 = this.f6959em + this.f1612bY;
            float f4 = abstractC0244am.f6958el + abstractC0244am.f1611bX;
            float f5 = abstractC0244am.f6959em + abstractC0244am.f1612bY;
            float m2209a = C0758f.m2209a(f2, f3, f4, f5);
            float f6 = this.f1621ch + abstractC0244am.f1621ch;
            if (z) {
                float f7 = m2209a;
                if (m2209a < f6 * f6) {
                    f7 = 0.0f;
                }
                if (abstractC0244am instanceof AbstractC0623y) {
                    AbstractC0623y abstractC0623y = (AbstractC0623y) abstractC0244am;
                    int i = abstractC0623y.f3961aH;
                    for (int i2 = 0; i2 < i; i2++) {
                        if (abstractC0623y.f3962aI[i2] == this) {
                            return;
                        }
                    }
                }
                if (this.f3962aI == null) {
                    this.f3962aI = new AbstractC0244am[10];
                    this.f3963aJ = new float[10];
                }
                AbstractC0244am[] abstractC0244amArr = this.f3962aI;
                byte b = -1;
                int i3 = 0;
                while (true) {
                    if (i3 < this.f3961aH) {
                        if (f7 >= this.f3963aJ[i3]) {
                            i3++;
                        } else {
                            b = i3;
                            break;
                        }
                    } else {
                        break;
                    }
                }
                if (b == -1) {
                    if (this.f3961aH < abstractC0244amArr.length) {
                        b = this.f3961aH;
                    } else {
                        return;
                    }
                }
                if (this.f3961aH < abstractC0244amArr.length) {
                    this.f3961aH = (byte) (this.f3961aH + 1);
                }
                for (int i4 = this.f3961aH - 1; i4 > b; i4--) {
                    abstractC0244amArr[i4] = abstractC0244amArr[i4 - 1];
                }
                abstractC0244amArr[b] = abstractC0244am;
                this.f3963aJ[b] = f7;
            } else if (m2209a < f6 * f6 && !abstractC0244am.m4786a(this, f) && !m4786a(abstractC0244am, f)) {
                float m2123d = C0758f.m2123d(f2, f3, f4, f5);
                float sqrt = (f6 - ((float) Math.sqrt(m2209a))) + 0.001f;
                if (sqrt <= 0.0f) {
                    return;
                }
                int s = m4646s(abstractC0244am);
                int m4646s = abstractC0244am.m4646s(this);
                int i5 = s > m4646s ? s : m4646s;
                if (i5 != 0) {
                    float f8 = (sqrt / i5) * f;
                    if (f8 > sqrt) {
                        f8 = sqrt;
                    }
                    sqrt = f8;
                }
                float f9 = sqrt * 0.95f;
                if (f9 > 1.0f) {
                    f9 *= 0.7f;
                }
                if (f9 > 3.0f) {
                    f9 = 3.0f + ((f9 - 3.0f) * 0.7f);
                }
                if (f9 > 6.0f) {
                    f9 = 6.0f + ((f9 - 6.0f) * 0.7f);
                }
                if (f9 > 10.0f) {
                    f9 = 10.0f + ((f9 - 10.0f) * 0.7f);
                }
                float f10 = 0.0f;
                float bN = mo3158bN();
                float mo3158bN = abstractC0244am.mo3158bN();
                if (this.f1609bV == abstractC0244am.f1609bV) {
                    boolean z2 = false;
                    float f11 = 1.7f;
                    if (abstractC0244am instanceof AbstractC0623y) {
                        AbstractC0623y abstractC0623y2 = (AbstractC0623y) abstractC0244am;
                        f11 = (this.f3903V > 200.0f || abstractC0623y2.f3903V > 200.0f) ? 5.0f : 5.0f;
                        if (this.f3921ac == abstractC0623y2) {
                            mo3158bN *= f11;
                            z2 = true;
                        }
                        if (abstractC0623y2.f3921ac == this) {
                            bN *= f11;
                            z2 = true;
                        }
                        if (!z2) {
                            if (this.f3922ad && abstractC0623y2.f3921ac != null) {
                                bN *= f11;
                            } else if (abstractC0623y2.f3922ad && this.f3921ac != null) {
                                mo3158bN *= f11;
                            } else if (this.f3889c == 0.0f && abstractC0623y2.f3889c != 0.0f) {
                                bN *= f11;
                            } else if (abstractC0623y2.f3889c == 0.0f && this.f3889c != 0.0f) {
                                mo3158bN *= f11;
                            }
                        }
                    }
                }
                if (abstractC0244am instanceof AbstractC0621w) {
                    f10 = bN / (bN + mo3158bN);
                }
                float f12 = 1.0f - f10;
                float m2092i = C0758f.m2092i(m2123d);
                float m2097h = C0758f.m2097h(m2123d);
                if (abstractC0244am instanceof AbstractC0621w) {
                    float f13 = f9 * f10;
                    abstractC0244am.f1611bX += m2092i * f13;
                    abstractC0244am.f1612bY += m2097h * f13;
                }
                float f14 = f9 * f12;
                this.f1611bX -= m2092i * f14;
                this.f1612bY -= m2097h * f14;
                Core m1087A = Core.m1087A();
                this.f3917Y = abstractC0244am;
                this.f3918Z = m1087A.f6239bx;
                if (abstractC0244am instanceof AbstractC0623y) {
                    AbstractC0623y abstractC0623y3 = (AbstractC0623y) abstractC0244am;
                    abstractC0623y3.f3917Y = this;
                    abstractC0623y3.f3918Z = m1087A.f6239bx;
                }
                if (abstractC0244am instanceof AbstractC0623y) {
                    AbstractC0623y abstractC0623y4 = (AbstractC0623y) abstractC0244am;
                    if (this.f3920ab != 0 && this.f3920ab == abstractC0623y4.f3920ab) {
                        if (m2909ar() == null && (m2909ar2 = abstractC0623y4.m2909ar()) != null && (m2909ar2.f1797a == EnumC0306av.f1811a || m2909ar2.f1797a == EnumC0306av.f1818h)) {
                            abstractC0623y4.m2902ay();
                        }
                        if (abstractC0623y4.m2909ar() == null && (m2909ar = abstractC0623y4.m2909ar()) != null) {
                            if (m2909ar.f1797a == EnumC0306av.f1811a || m2909ar.f1797a == EnumC0306av.f1818h) {
                                m2902ay();
                            }
                        }
                    }
                }
            }
        }
    }

    /* renamed from: V */
    public int m3005V() {
        return 1;
    }

    /* renamed from: a */
    public void mo3356a(int i) {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: W */
    public void m3004W() {
        Core m1087A = Core.m1087A();
        if (this.f1609bV == m1087A.f6099bs) {
            m1087A.f6117bS.f5116f.m1943b(this);
        }
    }

    /* renamed from: b */
    public float m2898b(float f, float f2, float f3) {
        if (mo3061E()) {
            if (m4758bI()) {
                return 0.0f;
            }
            return m2851c(f, C0758f.m2123d(this.f6958el, this.f6959em, f2, f3));
        } else if (mo3169bl() < 1) {
            return 0.0f;
        } else {
            int m2934aT = m2934aT();
            if (m2934aT == -1) {
                m2934aT = 0;
            }
            PointF mo3176G = mo3176G(m2934aT);
            float m2123d = C0758f.m2123d(mo3176G.f227a, mo3176G.f228b, f2, f3);
            this.f1649cJ[m2934aT].m4637a(70);
            return m2999a(f, m2123d, m2934aT);
        }
    }

    /* renamed from: c */
    public float m2851c(float f, float f2) {
        boolean z = false;
        boolean z2 = false;
        if (this.f1620cg && m2877bb()) {
            z = true;
            z2 = true;
        }
        return m2996a(f, f2, z, z2);
    }

    /* renamed from: h */
    public void m2829h(float f) {
        float m2135c = C0758f.m2135c(this.f1618ce, f, 360.0f);
        if (C0758f.m2137c(m2135c) > 0.01d) {
            mo3316i(m2135c);
        }
    }

    /* renamed from: a */
    public float m2996a(float f, float f2, boolean z, boolean z2) {
        this.f1619cf = f2;
        if (C0758f.m2137c(this.f1618ce - f2) < 0.01f) {
            if (z && this.f1620cg) {
                m2820j(25);
                this.f1620cg = false;
                return 0.0f;
            }
            return 0.0f;
        }
        float m2135c = C0758f.m2135c(this.f1618ce, f2, 360.0f);
        if (z) {
            if (z2 && C0758f.m2137c(m2135c) > 100.0f) {
                m2135c = C0758f.m2135c(this.f1618ce, f2 + 180.0f, 360.0f);
                if (!this.f1620cg) {
                    m2820j(25);
                    this.f1620cg = true;
                }
            } else if (this.f1620cg) {
                m2820j(25);
                this.f1620cg = false;
            }
        }
        if (C0758f.m2137c(m2135c) < 0.01f) {
            return 0.0f;
        }
        if (this.f3945ay <= 0.0f) {
            float mo3064B = mo3064B();
            if (mo3064B <= 0.0f) {
                float mo3065A = (m2135c > 0.0f ? 1.0f : -1.0f) * mo3065A() * f;
                if (C0758f.m2137c(mo3065A) > C0758f.m2137c(m2135c)) {
                    mo3065A = m2135c;
                }
                mo3316i(mo3065A);
            } else {
                float f3 = m2135c > 0.0f ? 1.0f : -1.0f;
                if (C0758f.m2137c(m2135c) < C0758f.m2137c(this.f1616cc) / mo3064B) {
                    this.f1616cc = C0758f.m2210a(this.f1616cc, f3 * mo3064B, mo3064B * f);
                } else {
                    this.f1616cc = C0758f.m2210a(this.f1616cc, f3 * mo3065A(), mo3064B * f);
                }
                float f4 = this.f1616cc * f;
                if (C0758f.m2137c(f4) > C0758f.m2137c(m2135c)) {
                    this.f1616cc = 0.0f;
                    f4 = m2135c;
                }
                mo3316i(f4);
            }
        }
        return m2135c;
    }

    /* renamed from: i */
    public void mo3316i(float f) {
        this.f1618ce += f;
        if (this.f1618ce > 180.0f) {
            this.f1618ce -= 360.0f;
        }
        if (this.f1618ce < -180.0f) {
            this.f1618ce += 360.0f;
        }
        if (mo4428bm()) {
            int mo3169bl = mo3169bl();
            for (int i = 0; i < mo3169bl; i++) {
                C0247ap c0247ap = this.f1649cJ[i];
                c0247ap.f1712a += f;
                if (c0247ap.f1712a > 180.0f) {
                    c0247ap.f1712a -= 360.0f;
                }
                if (c0247ap.f1712a < -180.0f) {
                    c0247ap.f1712a += 360.0f;
                }
            }
        }
    }

    /* renamed from: j */
    public void m2821j(float f) {
        int mo3169bl = mo3169bl();
        for (int i = 0; i < mo3169bl; i++) {
            this.f1649cJ[i].f1712a = f + m3029B(i);
        }
    }

    /* renamed from: a */
    public void m2987a(int i, float f) {
        this.f1649cJ[i].f1712a += f;
    }

    /* renamed from: a */
    public float m2999a(float f, float f2, int i) {
        float f3;
        C0247ap c0247ap = this.f1649cJ[i];
        float m2135c = C0758f.m2135c(c0247ap.f1712a, f2, 360.0f);
        if (m2135c == 0.0f) {
            return m2135c;
        }
        float mo3162w = mo3162w(i);
        if (mo3162w <= 0.0f) {
            float m2135c2 = C0758f.m2135c(c0247ap.f1712a, f2, mo3048c(i) * f);
            m2987a(i, m2135c2);
            f3 = m2135c - m2135c2;
        } else {
            float m2787y = m2787y(i);
            float f4 = m2135c > 0.0f ? 1.0f : -1.0f;
            float m2137c = C0758f.m2137c(c0247ap.f1714c) / m2787y;
            boolean z = ((m2135c > 0.0f ? 1 : (m2135c == 0.0f ? 0 : -1)) > 0) == ((c0247ap.f1714c > 0.0f ? 1 : (c0247ap.f1714c == 0.0f ? 0 : -1)) > 0);
            if (C0758f.m2137c(m2135c) < m2137c && z) {
                c0247ap.f1714c = C0758f.m2210a(c0247ap.f1714c, f4 * m2787y, m2787y * f);
            } else {
                c0247ap.f1714c = C0758f.m2210a(c0247ap.f1714c, f4 * mo3048c(i), mo3162w * f);
            }
            float f5 = c0247ap.f1714c * f;
            if (C0758f.m2137c(f5) > C0758f.m2137c(m2135c)) {
                c0247ap.f1714c = 0.0f;
                f5 = m2135c;
            }
            m2987a(i, f5);
            f3 = m2135c - f5;
        }
        return f3;
    }

    /* renamed from: X */
    public AbstractC0244am m3003X() {
        C0305au m2909ar;
        if (this.f3900h && (m2909ar = m2909ar()) != null) {
            if ((m2909ar.f1797a == EnumC0306av.f1814d || m2909ar.f1797a == EnumC0306av.f1817g) && m2909ar.f1804h != null && !m2909ar.f1804h.f1607bT) {
                return m2909ar.f1804h;
            }
            return null;
        }
        return null;
    }

    /* renamed from: Y */
    public boolean m3002Y() {
        C0305au m2909ar = m2909ar();
        if (m2909ar != null && m2909ar.f1797a == EnumC0306av.f1817g) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    private void m2991a(float f, C0305au c0305au, C0235ad c0235ad) {
        if (c0305au.f1799c == null) {
            m2902ay();
            c0305au = null;
        }
        if (c0305au != null) {
            if (c0305au.f1797a == EnumC0306av.f1826p) {
            }
            if (1 != 0) {
                AbstractC0224s a = m4788a(c0305au.f1799c);
                m3006U();
                if (a == null) {
                    m2957a("Failed to find action:" + c0305au.f1799c.m4992a());
                } else {
                    m4787a(a, false, new PointF(c0305au.f1801e, c0305au.f1802f), c0305au.f1804h);
                }
                m2902ay();
            }
        }
    }

    /* renamed from: b */
    private void m2897b(float f, C0305au c0305au, C0235ad c0235ad) {
        AbstractC0244am m4434i = c0305au.m4434i();
        if (m4434i != null) {
            this.f3896Q = m4434i;
            if (this.f3898S > 5.0f) {
                this.f3898S = 5.0f;
            }
        }
        m2902ay();
    }

    /* renamed from: c */
    private void m2850c(float f, C0305au c0305au, C0235ad c0235ad) {
        float f2;
        AbstractC0244am m3003X;
        C0305au m2912ao;
        C0305au m2912ao2;
        float m4438g = c0305au.m4438g();
        float m4436h = c0305au.m4436h();
        float m2209a = C0758f.m2209a(this.f6958el, this.f6959em, m4438g, m4436h);
        boolean z = c0305au.f1797a == EnumC0306av.f1821k || c0305au.f1797a == EnumC0306av.f1824n;
        boolean z2 = c0305au.f1797a == EnumC0306av.f1821k;
        AbstractC0244am abstractC0244am = c0305au.f1804h;
        if (z) {
            if (abstractC0244am == null || abstractC0244am.f1607bT) {
                m2902ay();
                c0305au = null;
            }
            if (c0305au != null && abstractC0244am != null && !abstractC0244am.m4702cf() && this.f1609bV.m5054c(abstractC0244am.f1609bV)) {
                m2902ay();
                c0305au = null;
            }
        }
        if (c0305au != null) {
            boolean z3 = false;
            float f3 = this.f1621ch;
            if (z) {
                f3 += abstractC0244am.f1621ch;
            }
            if (c0305au.f1797a == EnumC0306av.f1824n) {
                if (this.f1648cI) {
                    f2 = f3 + 30.0f;
                } else {
                    f2 = f3 + 50.0f;
                }
            } else if (this.f1648cI) {
                f2 = f3 + 80.0f;
            } else {
                f2 = f3 + 100.0f;
            }
            if (m2209a > f2 * f2) {
                this.f3907k = true;
                this.f3908l = m4438g;
                this.f3909m = m4436h;
                this.f3910n = 2;
                if (this.f3915s > 90.0f) {
                    this.f3915s = 90.0f;
                }
                this.f3914r = 18;
                if (this.f3921ac != null && !this.f3921ac.m4751bS()) {
                    c0235ad.f1521d = false;
                }
            } else {
                this.f3942w = 0;
            }
            c0235ad.f1521d = false;
            if (0 == 0 && this.f3896Q != null && !this.f3896Q.f1607bT) {
                boolean z4 = false;
                if (m2891b(this.f3896Q, false)) {
                    z4 = true;
                }
                if (z4) {
                    float m2209a2 = C0758f.m2209a(this.f6958el, this.f6959em, this.f3896Q.f6958el, this.f3896Q.f6959em);
                    float m2803o = m2803o(this.f3896Q);
                    boolean z5 = false;
                    boolean z6 = false;
                    if (m2209a2 < m2803o * m2803o) {
                        z6 = true;
                    }
                    if (z6 && !m2926aa()) {
                        z6 = false;
                    }
                    if (m2209a < 22500.0f) {
                        this.f3942w = 0;
                    }
                    if (!z6 && (this.f3942w == 1 || m2209a > 122500.0f)) {
                        z5 = true;
                        this.f3942w = 1;
                    }
                    if (m2209a > 302500.0f || (this.f3942w == 1 && m2209a > 202500.0f)) {
                        z5 = true;
                        this.f3942w = 1;
                    }
                    if (!z5) {
                        z3 = true;
                        this.f3942w = 0;
                        if (z6) {
                            this.f3907k = false;
                        } else {
                            if (this.f3915s > 90.0f) {
                                this.f3915s = 90.0f;
                            }
                            this.f3907k = true;
                            this.f3908l = this.f3896Q.f6958el;
                            this.f3909m = this.f3896Q.f6959em;
                            this.f3910n = 0;
                            this.f3906j = true;
                        }
                    }
                }
            }
            if (z2 && !z3) {
                AbstractC0244am m4648q = abstractC0244am.m4648q(2.0f);
                if (m4648q != null && !m2891b(m4648q, true)) {
                    m4648q = null;
                }
                if (m4648q == null && this.f3942w != 1) {
                    m4648q = m4648q(2.0f);
                    if (m4648q != null && !m2891b(m4648q, true)) {
                        m4648q = null;
                    }
                }
                if (m4648q != null) {
                    z3 = true;
                    if (this.f3915s > 90.0f) {
                        this.f3915s = 90.0f;
                    }
                    this.f3907k = true;
                    this.f3908l = m4648q.f6958el;
                    this.f3909m = m4648q.f6959em;
                    this.f3910n = 0;
                    this.f3906j = true;
                }
            }
            if (z2 && !z3 && mo3172a(abstractC0244am) && ((abstractC0244am.f1632cs < abstractC0244am.f1633ct || abstractC0244am.f1624ck < 1.0f) && mo3172a(abstractC0244am) && (m2912ao2 = m2912ao()) != null)) {
                m2912ao2.m4450b(abstractC0244am);
                m2912ao2.f1809m = true;
                z3 = true;
                if (this.f3915s > 20.0f) {
                    this.f3915s = 20.0f;
                }
            }
            if (z2 && !z3 && m2916ak() && (abstractC0244am instanceof AbstractC0623y) && (m3003X = ((AbstractC0623y) abstractC0244am).m3003X()) != null && mo3172a(m3003X) && (m2912ao = m2912ao()) != null) {
                m2912ao.m4450b(m3003X);
                m2912ao.f1809m = true;
                if (this.f3915s > 20.0f) {
                    this.f3915s = 20.0f;
                }
            }
        }
    }

    /* renamed from: d */
    private void m2842d(float f, C0305au c0305au, C0235ad c0235ad) {
        float m4438g = c0305au.m4438g();
        float m4436h = c0305au.m4436h();
        float m2209a = C0758f.m2209a(this.f6958el, this.f6959em, m4438g, m4436h);
        if (c0305au.f1804h == null || c0305au.f1804h.f1607bT) {
            m2902ay();
            c0305au = null;
        }
        if (c0305au != null) {
            boolean z = false;
            if (c0305au.f1804h.m4758bI()) {
                if (m2209a < 961.0f) {
                    this.f3905X += f;
                }
                if (this.f3905X > 240.0f) {
                    z = true;
                }
                float f2 = 21.0f;
                if (c0305au.f1804h.m4706cb().m5876a()) {
                    f2 = 11.0f;
                }
                if (this.f3888b > 0.0f) {
                    f2 = c0305au.f1804h.f1621ch + this.f1621ch + 31.0f;
                }
                if (m2209a < f2 * f2) {
                    z = true;
                }
            } else {
                float f3 = c0305au.f1804h.f1621ch + this.f1621ch + 5.0f;
                if (m2209a < f3 * f3) {
                    z = true;
                }
            }
            if (!z) {
                this.f3907k = true;
                this.f3908l = m4438g;
                this.f3909m = m4436h;
                this.f3910n = 0;
                if (c0305au.f1804h.m4758bI()) {
                    Rect m4706cb = c0305au.f1804h.m4706cb();
                    this.f3910n = C0758f.m2132c(m4706cb.m5868c() / 2, m4706cb.m5872b() / 2) + 1;
                }
                if (this.f3915s > 90.0f) {
                    this.f3915s = 90.0f;
                }
                this.f3914r = 18;
                if (m2209a < 48400.0f) {
                    c0235ad.f1521d = false;
                    if (this.f3915s > 0.0f && m2949aE() == null) {
                        this.f3906j = true;
                    }
                }
                if (this.f3921ac != null && !this.f3921ac.m4751bS()) {
                    c0235ad.f1521d = false;
                }
            }
            if (z) {
                m4783a(EnumC0347ae.f2180i, c0305au.f1804h);
                m2902ay();
            }
        }
    }

    /* renamed from: e */
    private void m2838e(float f, C0305au c0305au, C0235ad c0235ad) {
        float m4438g = c0305au.m4438g();
        float m4436h = c0305au.m4436h();
        float m2209a = C0758f.m2209a(this.f6958el, this.f6959em, m4438g, m4436h);
        if (c0305au.f1804h == null || c0305au.f1804h.f1607bT || !c0305au.f1804h.m4751bS()) {
            m2902ay();
            c0305au = null;
        }
        if (c0305au != null && !m4680d(c0305au.f1804h, false)) {
            m2902ay();
        }
        if (c0305au != null) {
            this.f1603bP = c0305au.f1804h;
            if (m2209a > 441.0f) {
                this.f3907k = true;
                this.f3908l = m4438g;
                this.f3909m = m4436h;
                if (this.f3915s > 90.0f) {
                    this.f3915s = 90.0f;
                }
                this.f3914r = 18;
                if (m2209a < 72900.0f) {
                    c0235ad.f1521d = false;
                    if (this.f3915s > 0.0f && this.f3973aT == null) {
                        this.f3906j = true;
                    }
                }
                if (this.f3921ac != null && !this.f3921ac.m4751bS()) {
                    c0235ad.f1521d = false;
                    return;
                }
                return;
            }
            m4662e(c0305au.f1804h, false);
            m2902ay();
        }
    }

    /* renamed from: a */
    private void m2990a(float f, C0305au c0305au, C0235ad c0235ad, boolean z) {
        C0305au m3383a;
        AbstractC0244am q;
        float m4438g = c0305au.m4438g();
        float m4436h = c0305au.m4436h();
        float m2209a = C0758f.m2209a(this.f6958el, this.f6959em, m4438g, m4436h);
        Core m1087A = Core.m1087A();
        if (!m2936aR()) {
            boolean z2 = false;
            C0399m dl = m4668dl();
            if (dl != null && dl.f2461H) {
                m2855bx();
                z2 = true;
            }
            if (!z2) {
                m2903ax();
                c0305au = null;
            }
        }
        float f2 = 7.0f;
        if (m2209a < 1681.0f) {
            this.f3905X += f;
        }
        if (this.f3905X > 240.0f) {
            f2 = 16.0f;
        }
        if (this.f3905X > 340.0f) {
            f2 = 36.0f;
        }
        if (c0305au != null && c0305au.f1797a == EnumC0306av.f1820j) {
            if (m2905av() != 1) {
                f2 = 20.0f;
                float f3 = 30.0f;
                if (!z || this.f3918Z == m1087A.f6239bx || this.f3918Z == m1087A.f6239bx - 1) {
                    f3 = 70.0f;
                }
                if (m2209a < f3 * f3) {
                    m2840d(c0305au);
                    m2903ax();
                    c0305au = null;
                }
            } else {
                f2 = 30.0f;
                if (!z || this.f3918Z == m1087A.f6239bx || this.f3918Z == m1087A.f6239bx - 1) {
                    f2 = 80.0f;
                }
            }
        }
        if (c0305au != null) {
            if (m2209a < f2 * f2) {
                if (c0305au.f1797a == EnumC0306av.f1820j) {
                    if (m2905av() == 1) {
                    }
                } else if (c0305au.f1797a == EnumC0306av.f1818h) {
                    boolean z3 = false;
                    if (this.f3896Q != null && !this.f3896Q.f1607bT && m2973a(this.f3896Q, false)) {
                        z3 = true;
                    }
                    if (!z3) {
                        m2903ax();
                        c0305au = null;
                    }
                } else {
                    m2903ax();
                    c0305au = null;
                }
            } else {
                this.f3907k = true;
                this.f3908l = m4438g;
                this.f3909m = m4436h;
                this.f3910n = 0;
                if (c0305au.f1797a == EnumC0306av.f1820j) {
                    this.f3916t = true;
                    m2952aB();
                }
            }
        }
        if (c0305au != null) {
            if (c0305au.f1797a == EnumC0306av.f1818h || c0305au.f1797a == EnumC0306av.f1820j) {
                if (this.f3896Q != null && !this.f3896Q.f1607bT && m2973a(this.f3896Q, false)) {
                    m2992a(f, this.f3896Q, c0235ad, true);
                }
                if (this.f3921ac != null && this.f3921ac.f3896Q != null) {
                    c0235ad.f1521d = false;
                }
            }
            if (c0305au.f1797a == EnumC0306av.f1820j) {
                if (this.f3896Q == null && (q = m4648q(3.0f)) != null && m2891b(q, true)) {
                    if (this.f3915s > 90.0f) {
                        this.f3915s = 90.0f;
                    }
                    this.f3907k = true;
                    this.f3908l = q.f6958el;
                    this.f3909m = q.f6959em;
                    this.f3910n = 0;
                    this.f3906j = true;
                }
                if (m2916ak() && m1087A.f6239bx % 10 == this.f6951ee % 10 && (m3383a = C0510r.m3383a(this, f, 150.0f, true)) != null) {
                    m3383a.f1809m = false;
                    m3383a.f1807k = 200.0f;
                    this.f3907k = false;
                    m2946aH();
                }
            }
        }
    }

    /* renamed from: f */
    private void m2836f(float f, C0305au c0305au, C0235ad c0235ad) {
        boolean z;
        float m4438g = c0305au.m4438g();
        float m4436h = c0305au.m4436h();
        float m2209a = C0758f.m2209a(this.f6958el, this.f6959em, m4438g, m4436h);
        Core m1087A = Core.m1087A();
        InterfaceC0303as interfaceC0303as = c0305au.f1798b;
        if (interfaceC0303as == null) {
            m2957a("activeBuildingType==null, removing waypoint");
            m2902ay();
            c0305au = null;
        }
        if (c0305au != null) {
            float f2 = mo3167f(interfaceC0303as);
            boolean z2 = false;
            if (f2 <= 30.0f) {
            }
            if (f2 <= 25.0f && this.f6960en > 4.0f) {
                z2 = true;
            }
            if (this.f3921ac != null) {
                C0305au m2909ar = this.f3921ac.m2909ar();
                if (m2909ar == null || m2909ar.f1797a != EnumC0306av.f1813c) {
                    c0235ad.f1521d = false;
                }
                if (m2909ar != null && !c0305au.m4449b(m2909ar)) {
                    c0235ad.f1521d = false;
                }
            }
            boolean z3 = false;
            if (!C1117y.m475a(this.f3895P, 200)) {
                z3 = true;
            }
            if (f2 > 800000.0f) {
                z = true;
            } else {
                z = m2209a <= f2 * f2;
            }
            if (!z || z2) {
                if (!m2936aR()) {
                    m2902ay();
                    return;
                }
                this.f3907k = true;
                this.f3908l = m4438g;
                this.f3909m = m4436h;
                if (f2 > 58.0f) {
                    this.f3910n = (int) ((f2 - 41.0f) / (m1087A.f6110bL.f785n * 1.414f));
                }
                if (this.f3915s > 90.0f) {
                    this.f3915s = 90.0f;
                }
                if (this.f3913q > 3) {
                    m2902ay();
                }
            } else if (!z3) {
                if (!m2789x() || C0758f.m2137c(m2898b(f, m4438g, m4436h)) <= 30.0f) {
                    C0625z m2968a = m2968a(c0305au, c0305au.f1798b, c0305au.f1800d, c0305au.f1801e, c0305au.f1802f);
                    AbstractC0244am abstractC0244am = null;
                    if (m2968a.f4000a != null) {
                        abstractC0244am = m2968a.f4000a;
                    } else if (m2968a.f4001b != null) {
                        abstractC0244am = m2968a.f4001b;
                    }
                    if (abstractC0244am != null) {
                        m2968a.f4003d.m4902a(this, abstractC0244am);
                        if (mo3172a(abstractC0244am)) {
                            if (m4765b(abstractC0244am) > 10000.0f) {
                                abstractC0244am.m4647r(1.0f);
                                m2903ax();
                            } else {
                                c0305au.m4442e();
                                c0305au.f1797a = EnumC0306av.f1814d;
                                c0305au.f1804h = abstractC0244am;
                                m2946aH();
                            }
                        } else {
                            m2902ay();
                        }
                        this.f3895P = -9999;
                        return;
                    }
                    if (c0305au.f1798b == null) {
                        Core.LogDebug2("active.build==null");
                    }
                    if (!m2968a.f4002c) {
                        m2902ay();
                    }
                }
            }
        }
    }

    /* renamed from: a */
    private void m2992a(float f, AbstractC0244am abstractC0244am, C0235ad c0235ad, boolean z) {
        EnumC0307b m2874be = m2874be();
        float f2 = abstractC0244am.f6958el;
        float f3 = abstractC0244am.f6959em;
        float m2209a = C0758f.m2209a(this.f6958el, this.f6959em, f2, f3);
        if (this.f3921ac != null) {
            if (m2209a < 490000.0f) {
                if (m2209a < 48400.0f) {
                    c0235ad.f1521d = false;
                }
                float m2209a2 = C0758f.m2209a(this.f3921ac.f6958el, this.f3921ac.f6959em, f2, f3);
                if (m2209a2 < 48400.0f) {
                    c0235ad.f1521d = false;
                }
                if (m2209a2 < 270400.0f && m2932aV()) {
                    c0235ad.f1521d = false;
                }
            }
            if (this.f3921ac.f3896Q == abstractC0244am) {
                c0235ad.f1521d = false;
            }
            if (c0235ad.f1521d) {
                this.f3926ah = 0.0f;
            } else {
                this.f3926ah += f;
            }
        } else {
            this.f3926ah = 500.0f;
        }
        float m2803o = m2803o(abstractC0244am);
        boolean z2 = true;
        if (m2209a < m2803o * m2803o) {
            if (this.f3896Q != abstractC0244am) {
                if (C0248aq.m4631a(this, abstractC0244am)) {
                    this.f3896Q = abstractC0244am;
                    this.f3897R = 10.0f;
                    m3011M(-1);
                }
            } else {
                this.f3897R = 10.0f;
            }
            float f4 = m2803o;
            if (!mo3061E()) {
                f4 -= 1.0f;
                if (m2932aV()) {
                    f4 -= 2.0f;
                }
                if (mo3042e(0) > 5.0f) {
                    f4 -= 3.0f;
                }
            }
            if (m2209a < f4 * f4 && m2874be() != EnumC0307b.f1832d) {
                if (abstractC0244am == null) {
                    z2 = false;
                } else if (m2822i(abstractC0244am)) {
                    z2 = false;
                    if (z) {
                        this.f3907k = false;
                    }
                } else if (!m2819j(abstractC0244am)) {
                    z2 = false;
                }
            }
        }
        if (z2) {
            this.f3907k = true;
            this.f3908l = f2;
            this.f3909m = f3;
            this.f3910n = 0;
            if (m2874be == EnumC0307b.f1832d) {
                m3000a(m2209a, f2, f3);
            }
            this.f3910n = m2798q(abstractC0244am);
            if (this.f3915s > 90.0f) {
                this.f3915s = 90.0f;
            }
            if (m2209a < 810000.0f) {
                if (m4690cr() || m2932aV()) {
                    this.f3906j = true;
                }
                if (!c0235ad.f1521d && this.f3926ah < 120.0f) {
                    this.f3915s = 0.1f;
                    this.f3906j = true;
                }
            }
        }
    }

    /* renamed from: g */
    private void m2832g(float f, C0305au c0305au, C0235ad c0235ad) {
        Core m1087A = Core.m1087A();
        if (m2874be() == EnumC0307b.f1832d) {
            if (c0305au != null && ((c0305au.f1804h == null || c0305au.f1804h.f1607bT || c0305au.f1804h.f1609bV == this.f1609bV) && !this.f3936ar)) {
                if (this.f3896Q != null && this.f3896Q.f1607bT) {
                    this.f3896Q = null;
                }
                m2959a(m1087A, f, m2885b(true) + 200.0f);
                if (this.f3896Q != null) {
                    c0305au.f1804h = this.f3896Q;
                    m2952aB();
                    m2946aH();
                } else {
                    this.f3936ar = true;
                    this.f3935aq = true;
                }
            }
            if (c0305au != null && (c0305au.f1804h == null || c0305au.f1804h.f1607bT || c0305au.f1804h.f1609bV == this.f1609bV)) {
                if (c0305au.f1804h == null) {
                    m2902ay();
                    c0305au = null;
                } else if (!this.f3935aq) {
                    m2902ay();
                    c0305au = null;
                }
            }
        } else if (c0305au.f1804h == null || c0305au.f1804h.f1607bT || c0305au.f1804h.f1609bV == this.f1609bV) {
            boolean z = true;
            if (m2905av() > 1) {
                z = false;
            }
            c0305au.f1804h = null;
            if (z) {
                if (this.f3896Q != null && this.f3896Q.f1607bT) {
                    this.f3896Q = null;
                }
                m2959a(m1087A, f, m2885b(true));
                if (this.f3896Q != null) {
                    c0305au.f1804h = this.f3896Q;
                    m2952aB();
                    m2946aH();
                }
            }
            if (c0305au.f1804h == null) {
                m2902ay();
                c0305au = null;
            }
        }
        if (c0305au != null && c0305au.f1804h != null && !c0305au.f1804h.f1607bT && !c0305au.f1804h.m4702cf() && this.f1609bV.m5054c(c0305au.f1804h.f1609bV) && !C0248aq.m4629b(this, c0305au.f1804h)) {
            m2902ay();
            return;
        }
        if (c0305au != null && !m2936aR() && !mo3036l()) {
            m2902ay();
            c0305au = null;
        }
        if (c0305au != null) {
            m2992a(f, c0305au.f1804h, c0235ad, false);
        }
    }

    /* renamed from: h */
    private void m2828h(float f, C0305au c0305au, C0235ad c0235ad) {
        float m4438g = c0305au.m4438g();
        float m4436h = c0305au.m4436h();
        float m2209a = C0758f.m2209a(this.f6958el, this.f6959em, m4438g, m4436h);
        if (c0305au.f1804h == null || c0305au.f1804h.f1607bT) {
            m2902ay();
            c0305au = null;
        }
        if (c0305au != null && !c0305au.f1804h.m4680d(this, false)) {
            m2902ay();
        }
        if (c0305au != null) {
            this.f1603bP = c0305au.f1804h;
            boolean z = false;
            if (c0305au.f1804h.m4758bI()) {
                if (m2209a < 961.0f) {
                    this.f3905X += f;
                }
                if (this.f3905X > 240.0f) {
                    z = true;
                }
                float f2 = 21.0f;
                if (c0305au.f1804h.m4706cb().m5876a()) {
                    f2 = 11.0f;
                }
                if (this.f3888b > 0.0f) {
                    f2 = c0305au.f1804h.f1621ch + 31.0f;
                }
                if (m2209a < f2 * f2) {
                    z = true;
                }
            } else if (m2209a < 441.0f) {
                z = true;
            }
            if (!z) {
                this.f3907k = true;
                this.f3908l = m4438g;
                this.f3909m = m4436h;
                if (this.f3915s > 90.0f) {
                    this.f3915s = 90.0f;
                }
                this.f3914r = 18;
                if (m2209a < 48400.0f) {
                    c0235ad.f1521d = false;
                    if (this.f3915s > 0.0f && this.f3973aT == null) {
                        this.f3906j = true;
                    }
                }
                if (this.f3921ac != null && !this.f3921ac.m4751bS()) {
                    c0235ad.f1521d = false;
                }
            }
            if (z) {
                c0305au.f1804h.m4662e(this, false);
                m2902ay();
            }
        }
    }

    /* renamed from: a_ */
    public float m2927a_(AbstractC0244am abstractC0244am) {
        float mo4486D = abstractC0244am.mo1758r().mo4486D();
        if (abstractC0244am.m4796V() == 2) {
            mo4486D *= 0.5f;
        }
        if (abstractC0244am.m4796V() == 3) {
            mo4486D *= 0.25f;
        }
        return mo4486D * m4765b(abstractC0244am);
    }

    /* renamed from: f */
    public float m2834f(AbstractC0244am abstractC0244am) {
        return 0.001f * 5.1f;
    }

    /* renamed from: g */
    public C0424b m2830g(AbstractC0244am abstractC0244am) {
        if (abstractC0244am.f1584bx != null) {
            return abstractC0244am.f1584bx;
        }
        return abstractC0244am.mo1758r().mo4488B();
    }

    /* renamed from: i */
    private void m2824i(float f, C0305au c0305au, C0235ad c0235ad) {
        int u;
        boolean x;
        Core m1087A = Core.m1087A();
        boolean z = false;
        boolean z2 = false;
        if (c0305au == null) {
            return;
        }
        float m4438g = c0305au.m4438g();
        float m4436h = c0305au.m4436h();
        float m2209a = C0758f.m2209a(this.f6958el, this.f6959em, m4438g, m4436h);
        if (c0305au != null && c0305au.f1797a == EnumC0306av.f1817g && c0305au.f1804h != null && c0305au.f1804h.mo3352g() > 0.0f) {
            z2 = true;
        }
        if (c0305au != null && (c0305au.f1804h == null || c0305au.f1804h.f1607bT || c0305au.f1804h.f1651cL != null)) {
            if (z2) {
                z = true;
            } else {
                m2903ax();
                c0305au = null;
            }
        }
        if (c0305au != null && !z && z2 && c0305au.f1804h != null) {
            boolean z3 = true;
            if (this.f3901i < m1087A.f6102by - 100) {
                z3 = false;
            }
            if (!mo3166g(c0305au.f1804h, z3)) {
                z = true;
            }
            if (!z) {
                this.f3901i = m1087A.f6102by;
            }
        }
        if (c0305au != null && z) {
            C0449h c0449h = null;
            if (c0305au.f1804h != null) {
                c0449h = c0305au.f1804h.m4717cQ();
            }
            AbstractC0244am m2965a = m2965a(this, c0305au.f1804h.f6958el, c0305au.f1804h.f6959em, m4716cR(), c0449h);
            if (m2965a != null) {
                c0305au.f1804h = m2965a;
                m4438g = c0305au.m4438g();
                m4436h = c0305au.m4436h();
                m2209a = C0758f.m2209a(this.f6958el, this.f6959em, m4438g, m4436h);
                m2952aB();
            } else {
                m2903ax();
                c0305au = null;
            }
        }
        if (c0305au != null) {
            if (c0305au.f1797a == EnumC0306av.f1814d) {
                if (!mo3172a(c0305au.f1804h)) {
                    m2902ay();
                    c0305au = null;
                }
            } else if (!z2 && !m2812l(c0305au.f1804h)) {
                m2902ay();
                c0305au = null;
            }
        }
        if (c0305au != null && c0305au.f1797a == EnumC0306av.f1814d && c0305au.f1804h != null && c0305au.f1804h.f1632cs >= c0305au.f1804h.f1633ct && c0305au.f1804h.f1624ck >= 1.0f) {
            m2903ax();
            c0305au = null;
        }
        if (c0305au != null && c0305au.f1804h == this) {
            m2902ay();
            c0305au = null;
        }
        if (c0305au != null && c0305au != null && c0305au.f1804h != null && c0305au.f1804h.mo3352g() != 0.0f) {
            boolean z4 = false;
            if (c0305au.f1797a == EnumC0306av.f1814d) {
                z4 = true;
            }
            if (z4) {
                m2902ay();
                c0305au = null;
            }
        }
        if (c0305au != null && c0305au.f1797a == EnumC0306av.f1817g && c0305au.f1804h.f1609bV != this.f1609bV && c0305au.f1804h.mo3352g() == 0.0f) {
            boolean z5 = true;
            if (m1087A.m1073O() && this.f1609bV.m5042d(c0305au.f1804h.f1609bV)) {
                z5 = false;
            }
            if (z5) {
                m2902ay();
                c0305au = null;
            }
        }
        if (c0305au != null) {
            if (c0305au.f1797a == EnumC0306av.f1817g) {
                u = mo3163v(c0305au.f1804h);
                x = m4644w(c0305au.f1804h);
            } else {
                u = mo3164u(c0305au.f1804h);
                x = m4643x(c0305au.f1804h);
            }
            if (this.f3921ac != null) {
                int i = u + 80;
                if (C0758f.m2209a(this.f3921ac.f6958el, this.f3921ac.f6959em, m4438g, m4436h) < i * i) {
                    c0235ad.f1521d = false;
                }
                C0305au m2909ar = this.f3921ac.m2909ar();
                if (m2909ar == null) {
                    c0235ad.f1521d = false;
                }
                if (m2909ar != null && !c0305au.m4449b(m2909ar)) {
                    c0235ad.f1521d = false;
                }
            }
            float f2 = u;
            if (this.f3900h) {
                f2 += 5.0f;
            }
            if (u <= 30) {
            }
            if (m2209a > f2 * f2) {
                if (!m2936aR() || c0305au.f1807k == 0.0f) {
                    m2902ay();
                    return;
                }
                boolean z6 = false;
                if (c0305au.f1807k >= 0.0f) {
                    if (c0305au.f1807k < C0758f.m2204a((int) m2209a) - f2) {
                        z6 = true;
                    }
                }
                if (z6) {
                    m2902ay();
                    return;
                }
                this.f3907k = true;
                this.f3908l = m4438g;
                this.f3909m = m4436h;
                if (u > 58) {
                    this.f3910n = (int) ((u - 41.0f) / (m1087A.f6110bL.f785n * 1.414f));
                } else {
                    this.f3910n = 0;
                }
                if (u < 30 || x) {
                    if (m2209a < 841.0f) {
                        this.f3906j = true;
                    }
                    float f3 = u + 14;
                    if (m2209a < f3 * f3 && this.f3915s > 0.0f && this.f3973aT == null) {
                        this.f3906j = true;
                    }
                }
                this.f3914r = this.f3910n;
                if (this.f3915s > 90.0f) {
                    this.f3915s = 90.0f;
                    return;
                }
                return;
            }
            int m2934aT = m2934aT();
            if (m2934aT == -1) {
                m2934aT = 0;
            }
            float f4 = 0.0f;
            if (m2789x()) {
                f4 = m2898b(f, m4438g, m4436h);
            }
            boolean z7 = false;
            if (C0758f.m2137c(f4) < 30.0f || !m2789x()) {
                this.f3900h = true;
                c0235ad.f1518a = true;
                C0247ap c0247ap = this.f1649cJ[m2934aT];
                if (c0247ap.f1717f < mo3042e(m2934aT)) {
                    c0247ap.f1717f += f;
                } else {
                    c0247ap.f1717f = mo3042e(m2934aT);
                    z7 = true;
                }
            }
            if (z7) {
                AbstractC0244am abstractC0244am = c0305au.f1804h;
                if (c0305au.f1797a != EnumC0306av.f1817g) {
                    if (abstractC0244am.f1624ck < 1.0f) {
                        m2881bC();
                        float m2927a_ = m2927a_(abstractC0244am);
                        float f5 = m2927a_ * f;
                        boolean z8 = false;
                        boolean z9 = false;
                        C0424b m2830g = m2830g(abstractC0244am);
                        if (m2830g != null) {
                            if (abstractC0244am.f1624ck + f5 > 1.0f) {
                                f5 = 1.0f - abstractC0244am.f1624ck;
                                z8 = true;
                            }
                            double d = (abstractC0244am.f1624ck + f5) - abstractC0244am.f1625cl;
                            double d2 = 0.0d;
                            if (z8) {
                                d2 = 1.0f - abstractC0244am.f1625cl;
                            } else if (d >= 0.0010000000474974513d) {
                                d2 = ((int) (d / 0.0010000000474974513d)) * 0.0010000000474974513d;
                            }
                            boolean z10 = false;
                            if (d2 > 0.0d && this.f1609bV.f1359al.m4035a(m2830g)) {
                                z10 = true;
                            }
                            if (!z10 && (d2 <= 0.0d || m2830g.m4127c(this, d2))) {
                                abstractC0244am.f1625cl = (float) (abstractC0244am.f1625cl + d2);
                            } else {
                                if (!z10) {
                                    this.f1609bV.f1359al.m4034a(m2830g, this, d2);
                                }
                                f5 = 0.0f;
                                z8 = false;
                                z9 = true;
                            }
                        }
                        if (!z9) {
                            m2977a(abstractC0244am, f, m2934aT);
                            float f6 = abstractC0244am.f1624ck + f5;
                            if (z8) {
                                f6 = 1.0f;
                            }
                            abstractC0244am.m4647r(f6);
                            if (f6 >= 1.0f && m2927a_ < 0.3d && abstractC0244am.f1609bV == m1087A.f6099bs) {
                                m1087A.f6117bS.f5116f.m1948a(abstractC0244am);
                            }
                            this.f3967aN = false;
                            return;
                        }
                        this.f3967aN = true;
                        return;
                    }
                    m2977a(abstractC0244am, f, m2934aT);
                    abstractC0244am.f1632cs += m4738c(abstractC0244am) * f;
                    if (abstractC0244am.f1632cs > abstractC0244am.f1633ct) {
                        abstractC0244am.f1632cs = abstractC0244am.f1633ct;
                        m2902ay();
                    }
                    this.f3967aN = false;
                    return;
                }
                m2893b(abstractC0244am, f, m2934aT);
                this.f3967aN = false;
                m2881bC();
                boolean z11 = false;
                boolean y = m4642y(abstractC0244am);
                float z12 = m4641z(abstractC0244am);
                boolean z13 = c0305au.f1804h.mo3352g() > 0.0f;
                C0424b m2830g2 = m2830g(abstractC0244am);
                if (z13 || m2830g2 != null) {
                }
                boolean z14 = false;
                if (!z13 && this.f3902U < 100.0f && !z13) {
                    if (abstractC0244am.f1624ck < 0.5d) {
                        if (m2830g2 == null) {
                            z14 = true;
                        }
                    } else if (abstractC0244am.f1632cs / abstractC0244am.f1633ct < 0.5d) {
                        z14 = true;
                    }
                }
                if (!z14) {
                    if (abstractC0244am.f1624ck < 1.0f) {
                        float m2834f = m2834f(abstractC0244am) * f;
                        if (m2834f >= abstractC0244am.f1624ck) {
                            m2834f = abstractC0244am.f1624ck;
                            abstractC0244am.f1624ck = 0.0f;
                        } else {
                            abstractC0244am.f1624ck -= m2834f;
                        }
                        abstractC0244am.f1625cl = abstractC0244am.f1624ck;
                        if (m2830g2 != null) {
                            m2830g2.m4122a((AbstractC0244am) this, m2834f, true);
                        }
                        if (abstractC0244am.f1624ck <= 0.0f) {
                            z11 = true;
                        }
                    } else {
                        float f7 = z12 * f;
                        if (f7 >= abstractC0244am.f1632cs) {
                            f7 = abstractC0244am.f1632cs;
                            abstractC0244am.f1632cs = -1.0f;
                        } else {
                            abstractC0244am.f1632cs -= f7;
                        }
                        abstractC0244am.f1679dn = 1000.0f;
                        if (y) {
                            float f8 = f7 / abstractC0244am.f1633ct;
                            C0424b m4722cL = abstractC0244am.m4722cL();
                            C0424b m4721cM = abstractC0244am.m4721cM();
                            if (m4721cM != null) {
                                m4722cL = m4721cM;
                            }
                            if (z13 || m2830g2 != null) {
                            }
                            if (m4722cL.m4126a() > 0) {
                                this.f3919aa += f8 * m4722cL.m4126a();
                                if (this.f3919aa > 1.0f) {
                                    this.f1609bV.f1310o += (int) this.f3919aa;
                                    this.f3919aa -= (int) this.f3919aa;
                                }
                                m4722cL.m4122a((AbstractC0244am) this, f8, false);
                            } else {
                                m4722cL.m4122a((AbstractC0244am) this, f8, true);
                            }
                        }
                        if (abstractC0244am.f1632cs <= 0.0f) {
                            z11 = true;
                        }
                    }
                }
                if (z11 && !abstractC0244am.f1607bT) {
                    if (!y) {
                        C0424b m4721cM2 = abstractC0244am.m4721cM();
                        if (m4721cM2 != null) {
                            Core.LogDebug2("refund: " + m4721cM2.m4107a(false, true, 10, true));
                            m4721cM2.m4122a((AbstractC0244am) this, 1.0d, true);
                        } else {
                            C0424b m4722cL2 = abstractC0244am.m4722cL();
                            if (abstractC0244am.f1583bw != null) {
                                m4722cL2 = abstractC0244am.f1583bw;
                                Core.LogDebug2("refund==null overridePriceBuildCost: " + m4722cL2.m4107a(false, true, 10, true));
                            }
                            m4722cL2.m4122a((AbstractC0244am) this, 0.800000011920929d, true);
                            if (abstractC0244am.f1624ck >= 1.0f && m2830g2 != null) {
                                m2830g2.m4122a((AbstractC0244am) this, 0.800000011920929d, true);
                            }
                        }
                    }
                    abstractC0244am.f1607bT = true;
                    abstractC0244am.f1608bU = m1087A.f6102by;
                    abstractC0244am.m4700ch();
                    if ((abstractC0244am instanceof AbstractC0623y) && abstractC0244am.m4758bI()) {
                        m1087A.f6119bU.m1165a((AbstractC0623y) abstractC0244am);
                    }
                }
            }
        }
    }

    /* renamed from: k */
    public void m2817k(float f) {
        Core m1087A = Core.m1087A();
        if (this.f1603bP != null) {
            this.f1603bP = null;
        }
        if (this.f1604bQ != null) {
            this.f1605bR = C0758f.m2211a(this.f1605bR, f);
            this.f1603bP = this.f1604bQ;
            if (this.f1605bR == 0.0f) {
                this.f1604bQ = null;
            }
        }
        if (this.f3915s != 0.0f) {
            this.f3915s = C0758f.m2211a(this.f3915s, f);
        }
        if (this.f1617cd != 0.0f) {
            this.f3889c = C0758f.m2211a(this.f3889c, f);
        }
        C0305au m2909ar = m2909ar();
        this.f3906j = false;
        boolean z = this.f3907k;
        this.f3907k = false;
        this.f3916t = false;
        this.f3914r = 150;
        if (m2909ar != null && m2909ar.f1808l > 0.0f && m2909ar.f1808l < this.f3902U) {
            m2903ax();
            m2909ar = null;
        }
        C0235ad c0235ad = f3968aO;
        c0235ad.m4838a();
        if (m2909ar != null) {
            this.f3902U += f;
            EnumC0306av enumC0306av = m2909ar.f1797a;
            if (enumC0306av == EnumC0306av.f1811a || enumC0306av == EnumC0306av.f1818h || enumC0306av == EnumC0306av.f1820j) {
                m2990a(f, m2909ar, c0235ad, z);
            } else if (enumC0306av == EnumC0306av.f1812b) {
                m2832g(f, m2909ar, c0235ad);
            } else if (enumC0306av == EnumC0306av.f1813c) {
                m2836f(f, m2909ar, c0235ad);
            } else if (enumC0306av == EnumC0306av.f1814d || enumC0306av == EnumC0306av.f1817g) {
                m2824i(f, m2909ar, c0235ad);
            } else if (enumC0306av == EnumC0306av.f1815e) {
                m2828h(f, m2909ar, c0235ad);
            } else if (enumC0306av == EnumC0306av.f1819i) {
                m2838e(f, m2909ar, c0235ad);
            } else if (enumC0306av == EnumC0306av.f1823m) {
                m2842d(f, m2909ar, c0235ad);
            } else if (enumC0306av == EnumC0306av.f1821k || enumC0306av == EnumC0306av.f1822l || enumC0306av == EnumC0306av.f1824n) {
                m2850c(f, m2909ar, c0235ad);
            } else if (enumC0306av == EnumC0306av.f1825o || enumC0306av == EnumC0306av.f1826p) {
                m2991a(f, m2909ar, c0235ad);
            } else if (enumC0306av == EnumC0306av.f1827q) {
                m2897b(f, m2909ar, c0235ad);
            }
            if (m2909ar != m2909ar()) {
                m2909ar = null;
            }
        }
        this.f3900h = c0235ad.f1518a;
        if (m2909ar != null && m2909ar.f1809m && this.f3892f > 1) {
            boolean z2 = true;
            C0305au m2816k = m2816k(1);
            if (m2816k != null && (m2816k.f1797a == EnumC0306av.f1821k || m2816k.f1797a == EnumC0306av.f1820j)) {
                z2 = false;
            }
            if (z2) {
                m2902ay();
                m2909ar = null;
            }
        }
        if (m2909ar == null) {
            this.f3907k = false;
        }
        if (this.f3907k) {
            C0399m dl = m4668dl();
            if (dl != null && dl.f2461H) {
                m2855bx();
            }
        } else if (this.f3913q != 0) {
            this.f3913q = (byte) 0;
        }
        m2886b(m1087A, f);
        m2958a(m1087A, f, m2909ar, c0235ad);
    }

    /* renamed from: a */
    private void m3000a(float f, float f2, float f3) {
        if (this.f3934ap < -900.0f) {
            this.f3934ap = C0758f.m2123d(this.f6958el, this.f6959em, f2, f3);
        }
        if (f < 10000.0f && mo3288bW()) {
            this.f3935aq = true;
        }
        if (this.f3935aq) {
            if (this.f1639cz < m2875bd() * 0.6d || (f < 40000.0f && this.f1639cz < m2875bd())) {
                this.f3908l += C0758f.m2092i(this.f3934ap + 180.0f) * 600.0f;
                this.f3909m += C0758f.m2097h(this.f3934ap + 180.0f) * 600.0f;
                return;
            }
            this.f3935aq = false;
            this.f3934ap = -999.0f;
            m2946aH();
        }
    }

    /* renamed from: a */
    private void m2994a(float f, C0237af c0237af, C0235ad c0235ad, C0305au c0305au) {
        C0237af m2804o;
        C0237af m2804o2;
        float f2;
        float f3;
        float f4;
        Core m1087A = Core.m1087A();
        AbstractC0623y abstractC0623y = this.f3921ac;
        float f5 = abstractC0623y.f6958el + this.f3928aj;
        float f6 = abstractC0623y.f6959em + this.f3929ak;
        int i = m1087A.f6102by - abstractC0623y.f3931am;
        float m2209a = C0758f.m2209a(this.f6958el, this.f6959em, f5, f6);
        if (i > 300 || this.f3888b > 1.0f) {
            this.f3890d += f;
        }
        boolean z = false;
        if (this.f3890d > 300.0f) {
            z = true;
        }
        if (i > 300 && m2209a > 250000.0f) {
            z = true;
        }
        if (this.f3888b > 1.0f) {
            if (this.f3889c != 0.0f) {
                z = true;
            }
            if (this.f3890d > 10.0f) {
                z = true;
            }
        }
        if (z) {
            this.f3889c = 90.0f;
        }
        if (this.f3889c == 0.0f) {
            m2946aH();
            c0235ad.f1522e = f5;
            c0235ad.f1523f = f6;
            C0237af c0237af2 = null;
            if (i < 3000 && 0 == 0 && abstractC0623y.f3941v > 2 && abstractC0623y.f3941v - abstractC0623y.f3939av <= 2) {
                c0237af2 = abstractC0623y.m2804o(2);
            }
            if (i < 1500 && c0237af2 == null && abstractC0623y.f3941v > 0 && abstractC0623y.f3939av + 0 >= abstractC0623y.f3941v) {
                C0237af m2804o3 = abstractC0623y.m2804o(0);
                c0237af2 = f3975aV;
                float m2123d = C0758f.m2123d(abstractC0623y.f6958el, abstractC0623y.f6959em, m2804o3.f1528a, m2804o3.f1529b);
                float f7 = 80.0f;
                if (i > 300) {
                    f7 = 80.0f - ((i - 300) * 0.06666667f);
                }
                c0237af2.f1528a = abstractC0623y.f6958el + (C0758f.m2092i(m2123d) * f7);
                c0237af2.f1529b = abstractC0623y.f6959em + (C0758f.m2097h(m2123d) * f7);
            }
            if (c0237af2 != null) {
                c0235ad.f1520c = true;
                c0235ad.f1522e = c0237af2.f1528a + this.f3928aj;
                c0235ad.f1523f = c0237af2.f1529b + this.f3929ak;
            } else if (abstractC0623y.f3941v >= 2 && abstractC0623y.f3939av >= 1) {
                if (abstractC0623y.f3939av >= 2) {
                    m2804o = abstractC0623y.m2804o(0);
                    m2804o2 = abstractC0623y.m2804o(1);
                } else {
                    m2804o = abstractC0623y.m2804o(0);
                    m2804o2 = abstractC0623y.m2804o(0);
                }
                if (m2804o != null && m2804o2 != null) {
                    float m2134c = 1.0f - ((C0758f.m2134c(abstractC0623y.f6958el, abstractC0623y.f6959em, m2804o.f1528a, m2804o.f1529b) - 15.0f) * 0.05f);
                    if (m2134c > 2.0f) {
                        m2134c = 2.0f;
                    }
                    if (m2134c < 0.0f) {
                        m2134c = 0.0f;
                    }
                    if (m2134c > 1.0f) {
                        if (abstractC0623y.f3939av >= 3) {
                            C0237af m2804o4 = abstractC0623y.m2804o(2);
                            float f8 = m2804o2.f1528a - m2804o.f1528a;
                            float f9 = m2804o2.f1529b - m2804o.f1529b;
                            f2 = f8 + ((m2804o4.f1528a - m2804o2.f1528a) * (m2134c - 1.0f));
                            f3 = f9 + ((m2804o4.f1529b - m2804o2.f1529b) * (m2134c - 1.0f));
                        } else {
                            f2 = m2804o2.f1528a - m2804o.f1528a;
                            f3 = m2804o2.f1529b - m2804o.f1529b;
                        }
                    } else {
                        f2 = (m2804o2.f1528a - m2804o.f1528a) * m2134c;
                        f3 = (m2804o2.f1529b - m2804o.f1529b) * m2134c;
                    }
                    c0235ad.f1522e = m2804o.f1528a + this.f3928aj + f2;
                    c0235ad.f1523f = m2804o.f1529b + this.f3929ak + f3;
                }
            }
            float f10 = 45.0f;
            if (this.f3888b <= 1.0f) {
                f10 = 60.0f;
            } else if (i < 500 && this.f3888b <= 1.0f) {
                f10 = 110.0f;
            }
            if (m2209a < f10 * f10) {
                this.f3890d = 0.0f;
            }
            boolean z2 = false;
            C0305au m2909ar = abstractC0623y.m2909ar();
            if (m2909ar == null || c0305au != null) {
            }
            if (m2909ar == null || 0 != 0) {
                this.f3891e += f;
                boolean z3 = false;
                if (c0305au != null && (c0305au.f1797a == EnumC0306av.f1811a || c0305au.f1797a == EnumC0306av.f1818h || c0305au.f1797a == EnumC0306av.f1820j)) {
                    z3 = true;
                }
                if (z3 && this.f3891e > 600.0f) {
                    f4 = 260.0f;
                } else if (z3 && this.f3891e > 360.0f) {
                    f4 = 140.0f;
                } else if (z3 && this.f3891e > 180.0f) {
                    f4 = 70.0f;
                } else if (z3 && this.f3891e > 120.0f) {
                    f4 = 50.0f;
                } else {
                    f4 = 16.0f;
                }
                if (m2209a < f4 * f4) {
                    z2 = true;
                }
                if (0 != 0) {
                    z2 = true;
                }
            }
            if (z2) {
                boolean z4 = false;
                if (m2909ar == null) {
                    z4 = true;
                }
                if (0 != 0) {
                    z4 = true;
                }
                if (z4 && C0758f.m2137c(m2851c(f, this.f3930al)) < 3.0f && c0305au != null) {
                    if (c0305au.f1797a == EnumC0306av.f1811a || c0305au.f1797a == EnumC0306av.f1818h) {
                        m2902ay();
                        if (abstractC0623y != null) {
                            boolean z5 = false;
                            C0305au m2909ar2 = m2909ar();
                            C0305au m2909ar3 = abstractC0623y.m2909ar();
                            if (m2909ar2 != null && m2909ar3 != null && m2909ar2.m4449b(m2909ar3)) {
                                z5 = true;
                            }
                            if (!z5) {
                                m2966a((AbstractC0623y) null);
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            } else if (0 == 0) {
                c0235ad.f1519b = true;
                return;
            } else {
                return;
            }
        }
        C0237af c0237af3 = null;
        if (0 == 0 && abstractC0623y.f3941v > 2 && 8 < abstractC0623y.f3939av) {
            c0237af3 = abstractC0623y.m2804o(8);
        }
        if (c0237af3 == null) {
            c0237af3 = f3975aV;
            c0237af3.f1528a = abstractC0623y.f6958el;
            c0237af3.f1529b = abstractC0623y.f6959em;
        }
        float m2209a2 = C0758f.m2209a(this.f6958el, this.f6959em, c0237af3.f1528a, c0237af3.f1529b);
        float f11 = this.f1621ch + abstractC0623y.f1621ch + 15.0f;
        float f12 = this.f1621ch + abstractC0623y.f1621ch + 100.0f;
        if (m2209a2 < f11 * f11) {
            this.f3890d = 0.0f;
            this.f3889c = 0.0f;
        } else if (m2209a2 < f12 * f12) {
        }
        if (this.f3973aT == null && c0237af != null && ((C0758f.m2137c(this.f3911o - c0237af3.f1528a) > 300.0f || C0758f.m2137c(this.f3912p - c0237af3.f1529b) > 300.0f) && this.f3915s > 30.0f)) {
            this.f3915s = 30.0f;
        }
        if (this.f3915s == 0.0f && this.f3973aT == null) {
            this.f3915s = 700.0f;
            m2998a(c0237af3.f1528a, c0237af3.f1529b, 0, false, false);
        }
        if (c0237af != null) {
            c0235ad.f1522e = c0237af.f1528a;
            c0235ad.f1523f = c0237af.f1529b;
            if (0 == 0) {
                c0235ad.f1519b = true;
            }
        }
    }

    /* renamed from: a */
    private void m2958a(Core core, float f, C0305au c0305au, C0235ad c0235ad) {
        C0305au m2909ar;
        boolean mo3057I = mo3057I();
        if (this.f3973aT != null) {
            m2887b(core);
        }
        if (this.f3921ac != null && (this.f3921ac.f1607bT || !this.f3921ac.m4751bS())) {
            m2966a((AbstractC0623y) null);
        }
        if (this.f3907k) {
            C0237af m2949aE = m2949aE();
            C0305au m2909ar2 = m2909ar();
            if (m2909ar2 == null) {
                c0235ad.f1521d = false;
            }
            if (f3996K) {
                c0235ad.f1521d = false;
            }
            if (this.f3922ad && this.f3924af > 0 && m2947aG()) {
                this.f3931am = core.f6102by;
            }
            if (m2909ar2 != null && this.f3921ac != null && c0235ad.f1521d && (m2909ar = this.f3921ac.m2909ar()) != null && !m2909ar.m4449b(m2909ar2)) {
                c0235ad.f1521d = false;
            }
            if (this.f3921ac != null && c0235ad.f1521d) {
                m2994a(f, m2949aE, c0235ad, c0305au);
            } else if (this.f1623cj != 0.0f) {
                c0235ad.f1522e = this.f3908l;
                c0235ad.f1523f = this.f3909m;
                c0235ad.f1519b = true;
            } else {
                boolean z = false;
                if (this.f3973aT == null) {
                    if (m2949aE == null) {
                        if (this.f3940u && this.f3915s < 450.0f && this.f3973aT == null) {
                            z = true;
                        }
                        if (this.f3915s == 0.0f) {
                            z = true;
                        }
                    }
                    if (this.f3915s == 0.0f && (m4690cr() || m2932aV())) {
                        float mo3035m = mo3035m() - 1.0f;
                        if (C0758f.m2137c(this.f3911o - this.f3908l) > mo3035m || C0758f.m2137c(this.f3912p - this.f3909m) > mo3035m) {
                            z = true;
                        }
                    }
                    if (c0305au != null && this.f3915s == 0.0f && ((c0305au.f1797a == EnumC0306av.f1815e || c0305au.f1797a == EnumC0306av.f1819i) && (C0758f.m2137c(this.f3911o - this.f3908l) > 12.0f || C0758f.m2137c(this.f3912p - this.f3909m) > 12.0f))) {
                        z = true;
                    }
                    if (c0305au != null) {
                        float f2 = this.f3914r;
                        if (C0758f.m2137c(this.f3911o - this.f3908l) > f2 || C0758f.m2137c(this.f3912p - this.f3909m) > f2) {
                            if (this.f3915s > 30.0f) {
                                this.f3915s = 30.0f;
                            }
                            if (this.f3915s == 0.0f) {
                                z = true;
                            }
                        }
                    }
                }
                if (z) {
                    this.f3915s = 500.0f;
                    m2998a(this.f3908l, this.f3909m, this.f3910n, this.f3922ad && this.f3925ag > 1, this.f3916t);
                }
                if (m2949aE != null && this.f3937at == null && this.f3939av >= 2 && mo3033z() > 5.0f) {
                    C0237af c0237af = this.f3938au[1];
                    float m2209a = C0758f.m2209a(this.f6958el, this.f6959em, m2949aE.f1528a, m2949aE.f1529b);
                    float m2209a2 = C0758f.m2209a(this.f6958el, this.f6959em, c0237af.f1528a, c0237af.f1529b);
                    if (m2209a < 36.0f) {
                        m2944aJ();
                        m2949aE = m2949aE();
                    } else if (m2209a2 < 361.0f) {
                        m2944aJ();
                        m2949aE = m2949aE();
                    }
                }
                if (m2949aE != null) {
                    c0235ad.f1522e = m2949aE.f1528a;
                    c0235ad.f1523f = m2949aE.f1529b;
                    c0235ad.f1519b = true;
                } else if (this.f3906j) {
                    c0235ad.f1522e = this.f3908l;
                    c0235ad.f1523f = this.f3909m;
                    c0235ad.f1519b = true;
                }
            }
        }
        m2995a(f, c0235ad, c0305au, mo3057I);
    }

    /* renamed from: a */
    private void m2995a(float f, C0235ad c0235ad, C0305au c0305au, boolean z) {
        float f2 = 0.0f;
        Core m1087A = Core.m1087A();
        if (this.f3907k && c0235ad.f1519b && z) {
            float f3 = c0235ad.f1522e;
            float f4 = c0235ad.f1523f;
            float mo3033z = mo3033z();
            float m2209a = C0758f.m2209a(this.f6958el, this.f6959em, f3, f4);
            float m2123d = C0758f.m2123d(this.f6958el, this.f6959em, f3, ((f4 - this.f6959em) * m2878ba()) + this.f6959em);
            boolean z2 = false;
            float mo3153bc = mo3153bc();
            if (mo3153bc > 0.95f) {
                z2 = true;
            } else if (mo3153bc > 0.87d) {
                if (this.f3925ag <= 1 && this.f3939av > 0 && this.f3939av <= 9 && this.f3922ad && m2209a < 250000.0f) {
                    z2 = true;
                }
            } else if (mo3153bc > 0.7d) {
                if (this.f3925ag <= 1 && this.f3939av > 0 && this.f3939av <= 4 && this.f3922ad && m2209a < 40000.0f) {
                    z2 = true;
                }
            } else if (mo3153bc > 0.4d && this.f3925ag <= 1 && this.f3939av > 0 && this.f3939av <= 2 && this.f3922ad && m2209a < 10000.0f) {
                z2 = true;
            }
            float f5 = 179.0f;
            if (this.f3896Q != null && mo3061E() && mo3319bj() && !m2932aV()) {
                this.f1619cf = m2123d;
            } else if (this.f3945ay <= 0.0f) {
                f5 = m2996a(f, m2123d, true, z2);
            }
            float f6 = 20.0f;
            if (m2209a > 361.0f) {
                f6 = 46.0f;
            }
            if (m2209a > 3600.0f) {
                f6 = 89.0f;
            }
            float mo3065A = mo3065A();
            if (mo3065A < 1.4d) {
                if (m2209a > 6400.0f) {
                    f6 *= 0.5f;
                } else {
                    f6 = 17.0f;
                }
            }
            if (mo3033z > 5.0f && this.f1617cd < 0.01d && this.f1617cd > -0.01d) {
                f6 = 1.0f;
            }
            if (mo3065A < 1.1d) {
                f6 *= 0.7f;
            }
            if (this.f1617cd > 0.4d && m2209a > 16900.0f) {
                f6 = 180.0f;
            }
            if (m2929aY() && this.f3941v == this.f3939av) {
                f6 = 1.0f;
            }
            if (mo3319bj()) {
                f6 = 181.0f;
            }
            boolean z3 = this.f3939av == 1;
            if ((!z3 || m2209a >= 4.0f * 4.0f) && C0758f.m2137c(f5) <= f6) {
                f2 = 1.0f;
                if (c0235ad.f1520c) {
                    if (m2209a < 2500.0f) {
                        f2 = 1.0f - 0.15f;
                    }
                    if (m2209a < 900.0f) {
                        f2 -= 0.15f;
                    }
                    if (m2209a < 225.0f) {
                        f2 -= 0.3f;
                    }
                } else if (this.f3921ac != null) {
                    if (m2209a > 400.0f) {
                        f2 = 1.0f + 0.2f;
                    }
                    if (m2209a < 49.0f) {
                        f2 -= 0.15f;
                    }
                    if (m2209a < 9.0f) {
                        f2 -= 0.15f;
                    }
                }
                if (m2209a < 9.0f) {
                    f2 = 0.0f;
                }
            }
            if (z3 && f2 != 0.0f) {
                if (m2209a < 324.0f && mo3062D() < 0.13f && mo3033z() > 1.0f) {
                    f2 = 0.5f * f2;
                }
                if (m2209a < 169.0f && mo3062D() < 0.15f && mo3033z() > 0.9f) {
                    f2 = 0.5f * f2;
                }
                if (mo3033z > 5.0f) {
                    if (m2209a < 324.0f && f2 > 0.5f) {
                        f2 = 0.5f;
                    }
                    if (m2209a < 81.0f && f2 > 0.25f) {
                        f2 = 0.25f;
                    }
                }
            }
            boolean z4 = false;
            if (!z3 && m2209a < 256.0f) {
                z4 = true;
            }
            if (z3 && m2209a < 4.0f * 4.0f) {
                z4 = true;
            }
            if ((this.f3918Z == m1087A.f6239bx || this.f3918Z == m1087A.f6239bx - 1) && this.f3917Y != null && this.f3917Y.m4739c(f3, f4, 2.0f)) {
                z4 = true;
            }
            if (f2 > 0.0f) {
                this.f3903V += f;
                if (this.f3903V > 200.0f && m2209a < 3600.0f && this.f3939av >= 2) {
                    float f7 = this.f3903V;
                    m2944aJ();
                    this.f3903V = f7;
                }
                if (this.f3903V > 600.0f && this.f3939av >= 2 && this.f3937at == null) {
                    m2946aH();
                }
                if (this.f3903V > 80.0f && this.f3888b > 30.0f) {
                    m2946aH();
                }
                if (this.f3903V > 40.0f && this.f3939av >= 2 && this.f3937at == null) {
                    C0237af c0237af = this.f3938au[1];
                    if (C0758f.m2209a(this.f6958el, this.f6959em, c0237af.f1528a, c0237af.f1529b) < m2209a) {
                        float f8 = this.f3903V;
                        m2944aJ();
                        this.f3903V = f8;
                    }
                }
            }
            if (z4) {
                m2944aJ();
                if (z3) {
                    this.f3890d = 0.0f;
                    this.f3889c = 0.0f;
                    if (!this.f3940u && this.f3921ac == null && c0305au != null && c0305au.f1797a == EnumC0306av.f1811a) {
                        m2903ax();
                    }
                }
            }
        }
        if (this.f1620cg && !mo3319bj()) {
            f2 = (-f2) * mo3153bc();
        }
        if (this.f3945ay > 0.0f) {
            f2 = 0.0f;
        }
        if (!mo3320bi()) {
            if (this.f1617cd < f2) {
                this.f1617cd = C0758f.m2210a(this.f1617cd, f2, mo3063C() * f);
            }
            if (this.f1617cd > f2) {
                this.f1617cd = C0758f.m2210a(this.f1617cd, f2, mo3062D() * f);
            }
        } else {
            this.f1617cd = f2;
        }
        this.f1648cI = c0235ad.f1519b && z;
    }

    @Deprecated
    /* renamed from: Z */
    public boolean m3001Z() {
        return this.f3896Q != null;
    }

    /* renamed from: aa */
    public boolean m2926aa() {
        if (this.f3896Q != null && !this.f3896Q.f1607bT) {
            int mo3169bl = mo3169bl();
            for (int i = 0; i < mo3169bl; i++) {
                if (this.f1649cJ[i].f1721j != null && m2797r(i)) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    /* renamed from: ab */
    public AbstractC0244am m2925ab() {
        if (this.f3896Q != null && !this.f3896Q.f1607bT) {
            return this.f3896Q;
        }
        C0305au m2909ar = m2909ar();
        if (m2909ar != null && m2909ar.f1804h != null && !m2909ar.f1804h.f1607bT) {
            return m2909ar.f1804h;
        }
        return null;
    }

    /* renamed from: a */
    private void m2959a(Core core, float f, float f2) {
        f3969aP.m4837a(f2);
        core.f6127cc.m3258a(this.f6958el, this.f6959em, f2, this, f, f3969aP);
        if (f3969aP.f1524a != 0) {
            if (this.f3896Q == null || !m2826h(this.f3896Q)) {
                f3970aQ.m4837a(f2);
                core.f6127cc.m3258a(this.f6958el, this.f6959em, f2, this, f, f3970aQ);
            }
        }
    }

    /* renamed from: ac */
    public boolean m2924ac() {
        return mo3169bl() > 1;
    }

    /* renamed from: a */
    private void m2960a(Core core, float f) {
        int mo3169bl = mo3169bl();
        if (!m2924ac()) {
            for (int i = 0; i < mo3169bl; i++) {
                this.f1649cJ[i].f1721j = this.f3896Q;
            }
            return;
        }
        boolean z = false;
        for (int i2 = 0; i2 < mo3169bl; i2++) {
            C0247ap c0247ap = this.f1649cJ[i2];
            if (m2791v(i2) == -1) {
                if (mo3332a(i2, this.f3896Q, false, false)) {
                    c0247ap.f1721j = this.f3896Q;
                } else {
                    z = true;
                    if (c0247ap.f1721j == this.f3896Q) {
                        c0247ap.f1721j = null;
                    }
                }
            }
        }
        if (z) {
            float m2885b = m2885b(false);
            f3972aS.m4834a(this);
            core.f6127cc.m3258a(this.f6958el, this.f6959em, m2885b, this, f, f3972aS);
        }
        for (int i3 = 0; i3 < mo3169bl; i3++) {
            int m2791v = m2791v(i3);
            if (m2791v != -1) {
                this.f1649cJ[i3].f1721j = this.f1649cJ[m2791v].f1721j;
            }
        }
    }

    /* renamed from: ad */
    public boolean m2923ad() {
        if (!mo3036l()) {
            return false;
        }
        C0399m dl = m4668dl();
        if (dl != null && !dl.f2485M) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    private void m2886b(Core core, float f) {
        int mo3169bl = mo3169bl();
        boolean z = false;
        if (m2923ad()) {
            boolean z2 = false;
            boolean z3 = false;
            if (this.f3896Q != null) {
                C0399m dl = m4668dl();
                if (dl != null && this.f1652cM != null && dl.f2463L && this.f1652cM.f3896Q == this.f3896Q) {
                    z2 = true;
                }
                if (!m2973a(this.f3896Q, false) && !z2 && 1 != 0) {
                    this.f3896Q = null;
                }
            }
            if (this.f3896Q != null && !z2) {
                z3 = !m2826h(this.f3896Q);
            }
            this.f3897R = C0758f.m2211a(this.f3897R, f);
            this.f3898S = C0758f.m2211a(this.f3898S, f);
            if ((this.f3896Q == null || z3) && this.f3897R == 0.0f && m2873bf()) {
                this.f3897R = 20.0f + (this.f6958el % 5.0f) + (this.f6959em % 5.0f);
                m2959a(core, f, m2885b(false));
                if (this.f3896Q != null) {
                    this.f3898S = 0.0f;
                }
            }
            if (this.f3896Q != null && this.f3898S == 0.0f) {
                this.f3898S = 20.0f + (this.f6958el % 5.0f) + (this.f6959em % 5.0f);
                m2960a(core, f);
            }
            for (int i = 0; i < mo3169bl; i++) {
                this.f1649cJ[i].f1718g = false;
            }
            if (this.f3896Q != null) {
                float m2209a = C0758f.m2209a(this.f6958el, this.f6959em, this.f3896Q.f6958el, this.f3896Q.f6959em);
                float m2803o = m2803o(this.f3896Q);
                if (m2209a < m2803o * m2803o || z2) {
                    int m2934aT = m2934aT();
                    for (int i2 = 0; i2 < mo3169bl; i2++) {
                        C0247ap c0247ap = this.f1649cJ[i2];
                        AbstractC0244am abstractC0244am = c0247ap.f1721j;
                        if (abstractC0244am != null) {
                            boolean z4 = abstractC0244am == this.f3896Q;
                            if (!z4 && !m2891b(abstractC0244am, true)) {
                                c0247ap.f1721j = null;
                            } else if (!mo3332a(i2, abstractC0244am, false, !z4)) {
                                c0247ap.f1721j = null;
                            } else {
                                PointF mo3176G = mo3176G(i2);
                                PointF m3013K = m3013K(i2);
                                m3013K.f227a += abstractC0244am.f6958el;
                                m3013K.f228b += abstractC0244am.f6959em;
                                float m2123d = C0758f.m2123d(mo3176G.f227a, mo3176G.f228b, m3013K.f227a, m3013K.f228b);
                                if (m2791v(i2) == -1 && i2 != m2934aT) {
                                    if (!mo3061E()) {
                                        c0247ap.m4637a(70);
                                        c0247ap.f1713b = c0247ap.f1712a;
                                        float f2 = 179.0f;
                                        if (!c0247ap.m4636b()) {
                                            f2 = m2999a(f, m2123d, i2);
                                        }
                                        if (C0758f.m2137c(f2) < m2788x(i2)) {
                                            c0247ap.f1718g = true;
                                        }
                                    } else {
                                        boolean z5 = false;
                                        C0305au m2909ar = m2909ar();
                                        if (m2909ar != null && (m2909ar.f1797a == EnumC0306av.f1813c || m2909ar.f1797a == EnumC0306av.f1814d || m2909ar.f1797a == EnumC0306av.f1817g)) {
                                            z5 = true;
                                        }
                                        if (!z5 && (!this.f3907k || mo3319bj())) {
                                            float m2851c = m2851c(f, m2123d);
                                            c0247ap.f1713b = c0247ap.f1712a;
                                            if (C0758f.m2137c(m2851c) < m2788x(i2)) {
                                                c0247ap.f1718g = true;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    for (int i3 = 0; i3 < mo3169bl; i3++) {
                        C0247ap c0247ap2 = this.f1649cJ[i3];
                        AbstractC0244am abstractC0244am2 = c0247ap2.f1721j;
                        if (abstractC0244am2 != null) {
                            if (m2792u(i3) && c0247ap2.f1716e == 0.0f) {
                                z = true;
                            }
                            if (m2792u(i3)) {
                                m2993a(f, abstractC0244am2, i3);
                            }
                        }
                    }
                } else if (!this.f3907k && m2913an()) {
                    this.f3906j = true;
                    this.f3907k = true;
                    this.f3908l = this.f3896Q.f6958el;
                    this.f3909m = this.f3896Q.f6959em;
                    this.f3910n = 0;
                }
            }
        }
        if (this.f3966aM && m3003X() != null) {
            z = true;
        }
        for (int i4 = 0; i4 < mo3169bl; i4++) {
            C0247ap c0247ap3 = this.f1649cJ[i4];
            if (!z && c0247ap3.f1717f != 0.0f) {
                c0247ap3.f1717f = C0758f.m2211a(c0247ap3.f1717f, mo3041f(i4) * f);
            }
        }
    }

    /* renamed from: b */
    public void m2892b(AbstractC0244am abstractC0244am, int i) {
    }

    /* renamed from: a */
    public boolean m2993a(float f, AbstractC0244am abstractC0244am, int i) {
        C0247ap c0247ap = this.f1649cJ[i];
        int m2791v = m2791v(i);
        if (m2791v != -1) {
            c0247ap.f1712a = this.f1649cJ[m2791v].f1712a;
        }
        boolean m2794s = m2794s(i);
        boolean z = false;
        if (m2794s) {
            if (c0247ap.f1717f < mo3042e(i)) {
                if (c0247ap.f1717f == 0.0f) {
                    m2892b(abstractC0244am, i);
                }
                c0247ap.f1717f += f;
            } else {
                c0247ap.f1717f = mo3042e(i);
            }
            z = true;
        }
        if (c0247ap.f1716e == 0.0f && m2797r(i)) {
            if (!mo3332a(i, abstractC0244am, false, false)) {
                c0247ap.f1716e = -10.0f;
                return false;
            }
            if (!m2794s) {
                if (c0247ap.f1717f < mo3042e(i)) {
                    if (c0247ap.f1717f == 0.0f) {
                        m2892b(abstractC0244am, i);
                    }
                    c0247ap.f1717f += f;
                } else {
                    z = true;
                }
            }
            if (z) {
                c0247ap.f1716e = mo3050b(i) + m2793t(i);
                if (!m2794s) {
                    c0247ap.f1717f = 0.0f;
                }
                mo3051a(abstractC0244am, i);
                m3011M(i);
                c0247ap.f1724m = !c0247ap.f1724m;
                return true;
            }
            return false;
        }
        return false;
    }

    /* renamed from: h */
    public boolean m2826h(AbstractC0244am abstractC0244am) {
        float m2209a = C0758f.m2209a(this.f6958el, this.f6959em, abstractC0244am.f6958el, abstractC0244am.f6959em);
        float m2803o = m2803o(abstractC0244am);
        if (m2209a < m2803o * m2803o) {
            return true;
        }
        return false;
    }

    /* renamed from: ae */
    public boolean mo3155ae() {
        return false;
    }

    /* renamed from: af */
    public boolean mo3160af() {
        return true;
    }

    /* renamed from: ag */
    public boolean mo4430ag() {
        return true;
    }

    /* renamed from: ah */
    public boolean m2919ah() {
        return true;
    }

    /* renamed from: i */
    public boolean m2822i(AbstractC0244am abstractC0244am) {
        int m2791v;
        int mo3169bl = mo3169bl();
        for (int i = 0; i < mo3169bl; i++) {
            if (m2797r(i) && mo3332a(i, abstractC0244am, false, false) && ((m2791v = m2791v(i)) == -1 || mo3332a(m2791v, abstractC0244am, false, false))) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: j */
    public boolean m2819j(AbstractC0244am abstractC0244am) {
        int m2791v;
        int mo3169bl = mo3169bl();
        for (int i = 0; i < mo3169bl; i++) {
            if (m2797r(i) && mo3332a(i, abstractC0244am, true, false) && ((m2791v = m2791v(i)) == -1 || mo3332a(m2791v, abstractC0244am, true, false))) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public boolean mo3332a(int i, AbstractC0244am abstractC0244am, boolean z, boolean z2) {
        if (!z && z2 && !m2826h(abstractC0244am)) {
            return false;
        }
        return true;
    }

    /* renamed from: k */
    public boolean m2815k(AbstractC0244am abstractC0244am) {
        if (abstractC0244am.mo3038i()) {
            return mo3160af();
        }
        if (abstractC0244am.mo3054Q()) {
            return mo3155ae();
        }
        if (!m2919ah() && !abstractC0244am.m4727cG()) {
            return false;
        }
        return mo4430ag();
    }

    /* renamed from: a */
    public boolean mo3172a(AbstractC0244am abstractC0244am) {
        return false;
    }

    /* renamed from: l */
    public boolean m2812l(AbstractC0244am abstractC0244am) {
        if (abstractC0244am.mo3352g() != 0.0f && m4652h(abstractC0244am, true)) {
            return true;
        }
        return mo3172a(abstractC0244am);
    }

    /* renamed from: a */
    public AbstractC0224s m2970a(InterfaceC0303as interfaceC0303as, boolean z) {
        return m2971a(interfaceC0303as, -1, z);
    }

    /* renamed from: ai */
    public boolean m2918ai() {
        Iterator it = mo3174N().iterator();
        while (it.hasNext()) {
            if (((AbstractC0224s) it.next()).mo3078g()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public AbstractC0224s m2971a(InterfaceC0303as interfaceC0303as, int i, boolean z) {
        InterfaceC0303as m4917E;
        ArrayList N = mo3174N();
        AbstractC0224s abstractC0224s = null;
        if (N.size() > 0) {
            Iterator it = N.iterator();
            while (it.hasNext()) {
                AbstractC0224s abstractC0224s2 = (AbstractC0224s) it.next();
                InterfaceC0303as mo4859y = abstractC0224s2.mo4859y();
                if (z && (m4917E = abstractC0224s2.m4917E()) != null) {
                    mo4859y = m4917E;
                }
                if (mo4859y == interfaceC0303as && (i == -1 || i == abstractC0224s2.mo4860t())) {
                    abstractC0224s = abstractC0224s2;
                    if (abstractC0224s2.mo3084b(this) && abstractC0224s2.mo3086a((AbstractC0244am) this, false)) {
                        return abstractC0224s2;
                    }
                }
            }
        }
        return abstractC0224s;
    }

    /* renamed from: b */
    public boolean m2890b(InterfaceC0303as interfaceC0303as, boolean z) {
        AbstractC0224s m2970a = m2970a(interfaceC0303as, z);
        if (m2970a == null || m2970a.mo4864g(this) || !m2970a.mo3084b(this)) {
            return false;
        }
        return true;
    }

    /* renamed from: aj */
    public boolean m2917aj() {
        return mo1758r().mo4470m();
    }

    /* renamed from: ak */
    public boolean m2916ak() {
        return mo1758r().mo4471l();
    }

    /* renamed from: m */
    public void m2808m(AbstractC0244am abstractC0244am) {
    }

    /* renamed from: al */
    public boolean m2915al() {
        return false;
    }

    /* renamed from: a */
    public final boolean m2973a(AbstractC0244am abstractC0244am, boolean z) {
        if (this.f1609bV == abstractC0244am.f1609bV || abstractC0244am.f1607bT || !this.f1609bV.m5054c(abstractC0244am.f1609bV) || this.f3894O == EnumC0205a.f1421d || this.f3894O == EnumC0205a.f1420c || abstractC0244am.f1651cL != null || !m2815k(abstractC0244am) || !abstractC0244am.mo3044d((AbstractC0244am) this)) {
            return false;
        }
        if (!z) {
            float m2209a = C0758f.m2209a(this.f6958el, this.f6959em, abstractC0244am.f6958el, abstractC0244am.f6959em);
            float m2885b = m2885b(false);
            if (m2209a < m2885b * m2885b) {
                return true;
            }
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public final boolean m2891b(AbstractC0244am abstractC0244am, boolean z) {
        if (abstractC0244am.m4689cs()) {
            return false;
        }
        return m2973a(abstractC0244am, z);
    }

    /* renamed from: am */
    public float m2914am() {
        return 0.0f;
    }

    /* renamed from: an */
    public boolean m2913an() {
        return this.f3894O == EnumC0205a.f1418a || this.f3894O == EnumC0205a.f1422e || this.f3894O == EnumC0205a.f1423f;
    }

    /* renamed from: b */
    public float m2885b(boolean z) {
        float m2914am;
        float mo3035m = mo3035m();
        C0305au m2909ar = m2909ar();
        if (m2909ar != null && (m2909ar.f1797a == EnumC0306av.f1818h || m2909ar.f1797a == EnumC0306av.f1820j || m2909ar.f1797a == EnumC0306av.f1821k)) {
            if (m2909ar.f1797a == EnumC0306av.f1820j) {
                mo3035m += 110.0f;
            } else if (m2909ar.f1797a == EnumC0306av.f1821k) {
                mo3035m += 90.0f;
            } else {
                mo3035m += 20.0f;
            }
            if (mo3035m < 190.0f) {
                mo3035m = 190.0f;
            }
        }
        if (this.f3894O == EnumC0205a.f1418a) {
            m2914am = mo3035m + 250.0f;
        } else if (this.f3894O == EnumC0205a.f1422e) {
            m2914am = mo3035m + 150.0f;
        } else if (this.f3894O == EnumC0205a.f1423f) {
            m2914am = mo3035m + 180.0f;
        } else {
            m2914am = mo3035m + m2914am();
            if (z) {
                m2914am += 110.0f;
            }
        }
        return m2914am;
    }

    /* renamed from: ao */
    public C0305au m2912ao() {
        m2809m(29);
        if (this.f3892f > 0) {
            m2889b(this.f3893g[0]);
        }
        C0305au c0305au = this.f3893g[29];
        for (int i = 29; i >= 1; i--) {
            this.f3893g[i] = this.f3893g[i - 1];
        }
        this.f3893g[0] = c0305au;
        if (this.f3892f < 29) {
            this.f3892f++;
        }
        if (this.f3893g[0] == null) {
            this.f3893g[0] = new C0305au();
        }
        C0305au c0305au2 = this.f3893g[0];
        c0305au2.m4442e();
        this.f3902U = 0.0f;
        this.f3905X = 0.0f;
        this.f3903V = 0.0f;
        m2847c(c0305au2);
        m2946aH();
        return c0305au2;
    }

    /* renamed from: a */
    public void m2969a(C0305au c0305au) {
    }

    /* renamed from: b */
    public final void m2889b(C0305au c0305au) {
        this.f3900h = false;
    }

    /* renamed from: c */
    public void m2847c(C0305au c0305au) {
        m2881bC();
        this.f3901i = -9999;
        if (this.f3896Q != null && this.f3896Q.m4689cs()) {
            this.f3896Q = null;
        }
    }

    /* renamed from: ap */
    public C0305au m2911ap() {
        m2809m(this.f3892f);
        if (this.f3893g[this.f3892f] == null) {
            this.f3893g[this.f3892f] = new C0305au();
        }
        C0305au c0305au = this.f3893g[this.f3892f];
        c0305au.m4442e();
        if (this.f3892f < 29) {
            this.f3892f++;
        }
        if (this.f3892f > 0) {
            m2847c(this.f3893g[0]);
        }
        return c0305au;
    }

    /* renamed from: d */
    public C0305au m2843d(float f, float f2) {
        C0305au m2911ap = m2911ap();
        m2911ap.m4458a(f, f2);
        return m2911ap;
    }

    /* renamed from: n */
    public C0305au m2805n(AbstractC0244am abstractC0244am) {
        C0305au m2911ap = m2911ap();
        m2911ap.m4456a(abstractC0244am);
        return m2911ap;
    }

    /* renamed from: e */
    public C0305au m2839e(float f, float f2) {
        C0305au m2911ap = m2911ap();
        m2911ap.m4451b(f, f2);
        return m2911ap;
    }

    /* renamed from: a */
    public boolean m2967a(C0305au c0305au, boolean z) {
        if (c0305au == null) {
            if (z) {
                Core.m998b("isValidNewWaypoint: Skipping null waypoint");
                return false;
            }
            return false;
        } else if (c0305au.m4444d() == EnumC0306av.f1813c) {
            if (c0305au.f1798b == null) {
                if (z) {
                    Core.m998b("isValidNewWaypoint: Skipping build waypoint with no buildType");
                    return false;
                }
                return false;
            }
            AbstractC0224s m2971a = m2971a(c0305au.f1798b, c0305au.f1800d, false);
            if (m2971a == null) {
                if (z) {
                    Core.m998b("Unit '" + mo1758r().mo4474i() + "' can not queue build:" + c0305au.f1798b.mo4474i());
                    return false;
                }
                return false;
            } else if (!c0305au.f1810n) {
                if (m2971a.mo4864g(this)) {
                    if (z) {
                        Core.m998b("Builder '" + mo1758r().mo4474i() + "' tried to queue a locked building:" + m2971a.m4909O());
                        return false;
                    }
                    return false;
                } else if (!m2971a.mo3084b(this)) {
                    if (z) {
                        Core.m998b("Builder '" + mo1758r().mo4474i() + "' tried to queue a unavailable building:" + m2971a.m4909O());
                        return false;
                    }
                    return false;
                } else {
                    return true;
                }
            } else {
                return true;
            }
        } else {
            return true;
        }
    }

    /* renamed from: d */
    public C0305au m2840d(C0305au c0305au) {
        C0305au m2911ap = m2911ap();
        m2911ap.m4445c(c0305au);
        return m2911ap;
    }

    /* renamed from: aq */
    public boolean m2910aq() {
        return m2909ar() == null;
    }

    /* renamed from: ar */
    public C0305au m2909ar() {
        if (this.f3892f == 0) {
            return null;
        }
        return this.f3893g[0];
    }

    /* renamed from: as */
    public C0305au m2908as() {
        if (this.f3892f <= 1) {
            return null;
        }
        return this.f3893g[1];
    }

    /* renamed from: at */
    public C0305au m2907at() {
        if (this.f3892f == 0) {
            return null;
        }
        return this.f3893g[this.f3892f - 1];
    }

    /* renamed from: au */
    public void m2906au() {
        if (this.f3892f == 0) {
            return;
        }
        if (this.f3892f == 1) {
            m2902ay();
        } else {
            this.f3892f--;
        }
    }

    /* renamed from: k */
    public C0305au m2816k(int i) {
        return this.f3893g[i];
    }

    /* renamed from: av */
    public int m2905av() {
        return this.f3892f;
    }

    /* renamed from: aw */
    public boolean m2904aw() {
        C0305au m2909ar = m2909ar();
        if (m2909ar != null && m2909ar.f1797a == EnumC0306av.f1812b) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public boolean m2972a(InterfaceC0303as interfaceC0303as, float f, float f2) {
        for (int i = 0; i < this.f3892f; i++) {
            C0305au c0305au = this.f3893g[i];
            if (c0305au.f1797a == EnumC0306av.f1813c && c0305au.f1798b == interfaceC0303as && C0758f.m2137c(c0305au.f1801e - f) < 10.0f && C0758f.m2137c(c0305au.f1802f - f2) < 10.0f) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: l */
    public void m2813l(int i) {
        if (i >= 120) {
            throw new RuntimeException("PathNode index:" + i + " too large");
        }
        if (this.f3938au == f3998as) {
            this.f3938au = new C0237af[120];
        }
    }

    /* renamed from: m */
    public void m2809m(int i) {
        if (i >= 30) {
            throw new RuntimeException("Waypoint index:" + i + " too large");
        }
        if (this.f3893g == f3997N) {
            this.f3893g = new C0305au[30];
        }
    }

    /* renamed from: n */
    public void m2806n(int i) {
        if (this.f3892f <= i) {
            throw new IndexOutOfBoundsException("completeWaypoint: waypointsCount:" + this.f3892f + ", waypointIndex:" + i);
        }
        if (i == 0) {
            m2902ay();
            return;
        }
        if (this.f3893g.length > 0) {
            C0305au c0305au = this.f3893g[i];
            for (int i2 = i; i2 < this.f3892f - 1; i2++) {
                this.f3893g[i2] = this.f3893g[i2 + 1];
            }
            this.f3893g[this.f3892f - 1] = c0305au;
        }
        this.f3892f--;
    }

    /* renamed from: ax */
    public void m2903ax() {
        m2951aC();
        m2902ay();
    }

    /* renamed from: ay */
    public void m2902ay() {
        this.f3902U = 0.0f;
        this.f3905X = 0.0f;
        this.f3903V = 0.0f;
        this.f3935aq = false;
        this.f3934ap = -999.0f;
        this.f3936ar = false;
        this.f3942w = 0;
        if (this.f3892f == 0) {
            m2946aH();
            this.f3891e = 0.0f;
            this.f3890d = 0.0f;
            this.f3889c = 0.0f;
        } else if (this.f3892f == 1) {
            m2889b(this.f3893g[0]);
            this.f3892f = 0;
            m2946aH();
            this.f3891e = 0.0f;
            this.f3890d = 0.0f;
            this.f3889c = 0.0f;
            m2847c((C0305au) null);
        } else {
            if (this.f3893g.length > 0) {
                C0305au c0305au = this.f3893g[0];
                m2889b(c0305au);
                for (int i = 0; i < this.f3892f - 1; i++) {
                    this.f3893g[i] = this.f3893g[i + 1];
                }
                this.f3893g[this.f3892f - 1] = c0305au;
            }
            this.f3892f--;
            if (this.f3892f > 0) {
                m2847c(this.f3893g[0]);
            } else {
                m2847c((C0305au) null);
            }
            m2946aH();
        }
    }

    /* renamed from: az */
    public void m2901az() {
        int i = this.f3892f;
        if (this.f3892f > 0) {
            m2889b(this.f3893g[0]);
        }
        this.f3902U = 0.0f;
        this.f3905X = 0.0f;
        this.f3935aq = false;
        this.f3934ap = -999.0f;
        this.f3936ar = false;
        this.f3892f = 0;
        m2946aH();
        m2950aD();
        m2966a((AbstractC0623y) null);
        this.f3891e = 0.0f;
        this.f3890d = 0.0f;
        this.f3889c = 0.0f;
        this.f3942w = 0;
        if (i > 0) {
            m2847c((C0305au) null);
        }
    }

    /* renamed from: aA */
    public void m2953aA() {
        for (int i = 0; i < this.f3892f; i++) {
            C0305au c0305au = this.f3893g[i];
            if (c0305au != null && c0305au.f1797a != EnumC0306av.f1813c && c0305au.f1797a != EnumC0306av.f1814d) {
                m2806n(i);
            }
        }
    }

    /* renamed from: a */
    public void m2966a(AbstractC0623y abstractC0623y) {
        if (this.f3921ac != null) {
            this.f3921ac.f3924af--;
        }
        this.f3921ac = abstractC0623y;
        if (abstractC0623y != null) {
            this.f3921ac.f3924af++;
        }
    }

    /* renamed from: aB */
    public void m2952aB() {
        m2966a((AbstractC0623y) null);
        this.f3922ad = false;
        this.f3927ai = false;
        this.f3928aj = 0.0f;
        this.f3929ak = 0.0f;
        this.f3920ab = 0;
        this.f3889c = 0.0f;
    }

    /* renamed from: aC */
    public void m2951aC() {
        if (this.f3924af == 0) {
            return;
        }
        C0305au m2908as = m2908as();
        AbstractC0244am[] m498a = AbstractC0244am.f1590bD.m498a();
        int size = AbstractC0244am.f1590bD.size();
        for (int i = 0; i < size; i++) {
            AbstractC0244am abstractC0244am = m498a[i];
            if (abstractC0244am instanceof AbstractC0623y) {
                AbstractC0623y abstractC0623y = (AbstractC0623y) abstractC0244am;
                if (abstractC0623y.f3921ac == this) {
                    boolean z = C0758f.m2209a(this.f6958el, this.f6959em, abstractC0623y.f6958el, abstractC0623y.f6959em) < 108900.0f;
                    boolean z2 = false;
                    boolean z3 = false;
                    C0305au m2908as2 = abstractC0623y.m2908as();
                    if (m2908as != null && m2908as2 != null) {
                        if (m2908as.m4449b(m2908as2)) {
                            z2 = true;
                        }
                    } else if (m2908as == null && m2908as2 == null) {
                        z3 = true;
                    }
                    if (z2 && z) {
                        abstractC0623y.m2902ay();
                    } else if (!z3) {
                        abstractC0623y.m2966a((AbstractC0623y) null);
                    }
                }
            }
        }
    }

    /* renamed from: aD */
    public void m2950aD() {
        C0305au m2909ar;
        C0637ab c0637ab;
        AbstractC0623y abstractC0623y = null;
        if (this.f3924af == 0) {
            return;
        }
        AbstractC0244am[] m498a = AbstractC0244am.f1590bD.m498a();
        int size = AbstractC0244am.f1590bD.size();
        for (int i = 0; i < size; i++) {
            AbstractC0244am abstractC0244am = m498a[i];
            if (abstractC0244am instanceof AbstractC0623y) {
                AbstractC0623y abstractC0623y2 = (AbstractC0623y) abstractC0244am;
                if (abstractC0623y2.f3921ac == this) {
                    abstractC0623y2.m2966a((AbstractC0623y) null);
                    abstractC0623y = abstractC0623y2;
                }
            }
        }
        if (this.f3924af != 0) {
            this.f3924af = 0;
        }
        if (abstractC0623y != null && (m2909ar = abstractC0623y.m2909ar()) != null && (c0637ab = m2909ar.f1805i) != null) {
            c0637ab.m2749c();
        }
    }

    /* renamed from: aE */
    public C0237af m2949aE() {
        if (this.f3939av == 0) {
            return null;
        }
        if (this.f3937at != null) {
            return this.f3937at.mo1206a(this);
        }
        return this.f3938au[0];
    }

    /* renamed from: aF */
    public C0237af m2948aF() {
        if (this.f3939av < 2) {
            return null;
        }
        if (this.f3937at != null) {
            return this.f3937at.mo1205b(this);
        }
        return this.f3938au[1];
    }

    /* renamed from: a */
    public void m2986a(int i, float f, float f2) {
        m2813l(i);
        if (this.f3938au[i] == null) {
            this.f3938au[i] = new C0237af();
        }
        this.f3938au[i].f1528a = f;
        this.f3938au[i].f1529b = f2;
    }

    /* renamed from: aG */
    public boolean m2947aG() {
        if (this.f3937at == null && this.f3939av >= 2) {
            if (mo3033z() > 0.5d) {
                if (this.f3903V > 150.0f || this.f3904W > 150.0f) {
                    return true;
                }
                return false;
            } else if (this.f3903V > 300.0f || this.f3904W > 300.0f) {
                return true;
            } else {
                return false;
            }
        }
        return false;
    }

    /* renamed from: aH */
    public void m2946aH() {
        this.f3939av = 0;
        this.f3940u = false;
        this.f3941v = 0;
        this.f3915s = 0.0f;
        this.f3903V = 0.0f;
        this.f3904W = 0.0f;
        this.f3913q = (byte) 0;
    }

    /* renamed from: aI */
    public void m2945aI() {
        m2946aH();
        this.f3938au = f3998as;
        this.f3961aH = (byte) 0;
        this.f3962aI = null;
        this.f3963aJ = null;
    }

    /* renamed from: aJ */
    public void m2944aJ() {
        this.f3904W = this.f3903V;
        this.f3903V = 0.0f;
        if (this.f3937at != null) {
            this.f3937at.mo1204c(this);
        } else if (this.f3939av != 0) {
            if (this.f3939av == 1) {
                this.f3939av = 0;
                return;
            }
            C0237af c0237af = this.f3938au[0];
            for (int i = 0; i < this.f3939av - 1; i++) {
                this.f3938au[i] = this.f3938au[i + 1];
            }
            this.f3938au[this.f3939av - 1] = c0237af;
            this.f3939av--;
        }
    }

    /* renamed from: aK */
    public boolean m2943aK() {
        Core m1087A = Core.m1087A();
        boolean z = false;
        if (m4690cr()) {
            z = true;
        }
        m1087A.f6110bL.m5344a(this.f6958el, this.f6959em);
        int i = m1087A.f6110bL.f801T;
        int i2 = m1087A.f6110bL.f802U;
        if (m1087A.f6119bU.m1166a(mo3039h(), i, i2) && !m1087A.f6119bU.m1153b(mo3039h(), i, i2)) {
            z = true;
        }
        return z;
    }

    /* renamed from: a */
    public void m2998a(float f, float f2, int i, boolean z, boolean z2) {
        Core m1087A = Core.m1087A();
        C0907l c0907l = m1087A.f6119bU;
        C0173b c0173b = m1087A.f6110bL;
        this.f1648cI = true;
        boolean z3 = false;
        boolean z4 = false;
        if (m4690cr()) {
            z3 = true;
        }
        c0173b.m5344a(this.f6958el, this.f6959em);
        int i2 = c0173b.f801T;
        int i3 = c0173b.f802U;
        if (c0907l.m1166a(mo3039h(), i2, i3) && !c0907l.m1153b(mo3039h(), i2, i3)) {
            z3 = true;
            z4 = true;
        }
        if (f != this.f3911o || this.f3912p != f2) {
            this.f3913q = (byte) 0;
        }
        this.f3911o = f;
        this.f3912p = f2;
        if (z3) {
            this.f3940u = false;
            this.f3939av = 0;
            this.f3937at = null;
            float m5345a = c0173b.m5345a(f);
            float m5310b = c0173b.m5310b(f2);
            if (z4) {
                float m2123d = C0758f.m2123d(this.f6958el, this.f6959em, m5345a, m5310b);
                float m2157b = C0758f.m2157b(this.f6958el, this.f6959em, m5345a, m5310b);
                if (m2157b > 60.0f) {
                    m2157b = 60.0f;
                    this.f3940u = true;
                    if (this.f3915s > 10.0f) {
                        this.f3915s = 10.0f;
                    }
                }
                m5345a = this.f6958el + (C0758f.m2092i(m2123d) * m2157b);
                m5310b = this.f6959em + (C0758f.m2097h(m2123d) * m2157b);
            }
            m2986a(this.f3939av, m5345a, m5310b);
            this.f3939av++;
            this.f3941v = this.f3939av;
            return;
        }
        int i4 = 0;
        if (z) {
            i4 = 3;
        }
        if (C0248aq.m4634a(mo3039h(), this.f6958el, this.f6959em, f, f2, 80, i4, 1)) {
            this.f3940u = false;
            this.f3939av = 0;
            this.f3937at = null;
            float m5345a2 = c0173b.m5345a(f);
            float m5310b2 = c0173b.m5310b(f2);
            float f3 = this.f6958el;
            float f4 = this.f6959em;
            float m2123d2 = C0758f.m2123d(this.f6958el, this.f6959em, m5345a2, m5310b2);
            float m2157b2 = C0758f.m2157b(this.f6958el, this.f6959em, m5345a2, m5310b2);
            float m2092i = C0758f.m2092i(m2123d2);
            float m2097h = C0758f.m2097h(m2123d2);
            int i5 = (int) ((m2157b2 * 0.05f) - 1.0f);
            int i6 = 1;
            if (i5 < 4) {
                i6 = 0;
            }
            int i7 = 0;
            while (true) {
                if (i7 >= i5) {
                    break;
                }
                f3 += m2092i * 20.0f;
                f4 += m2097h * 20.0f;
                if (i6 > 0) {
                    i6--;
                } else {
                    m2986a(this.f3939av, f3, f4);
                    this.f3939av++;
                    if (this.f3939av >= 119) {
                        this.f3940u = true;
                        break;
                    }
                }
                i7++;
            }
            if (!this.f3940u) {
                if (this.f3939av < 119) {
                    m2986a(this.f3939av, m5345a2, m5310b2);
                    this.f3939av++;
                } else {
                    this.f3940u = true;
                }
            }
            this.f3941v = this.f3939av;
            return;
        }
        C0637ab c0637ab = null;
        C0305au m2909ar = m2909ar();
        if (m2909ar != null) {
            c0637ab = m2909ar.f1805i;
            if (c0637ab == null) {
            }
        }
        if (c0637ab != null && c0637ab.f4080g != null) {
            C0740d c0740d = null;
            Iterator it = c0637ab.f4080g.iterator();
            while (it.hasNext()) {
                C0740d c0740d2 = (C0740d) it.next();
                if (c0740d2.f4638a != null && c0740d2.f4638a.mo1221a() != null && C0758f.m2137c(c0740d2.f4642e - f) <= 10.0f && C0758f.m2137c(c0740d2.f4643f - f2) <= 10.0f && c0740d2.f4644g + SlickToAndroidKeycodes.AndroidCodes.KEYCODE_STB_INPUT >= m1087A.f6239bx && c0740d2.f4645h == mo3039h() && C0758f.m2209a(this.f6958el, this.f6959em, c0740d2.f4640c, c0740d2.f4641d) < 3600.0f) {
                    c0740d = c0740d2;
                }
            }
            if (c0740d != null) {
                this.f3973aT = c0740d.f4638a;
                return;
            }
        }
        if (f3996K && i > 2) {
            i = 2;
        }
        this.f3973aT = m2997a(f, f2, i, z, true, z2);
    }

    /* renamed from: a */
    public C0906k m2997a(float f, float f2, int i, boolean z, boolean z2, boolean z3) {
        Core m1087A = Core.m1087A();
        C0907l c0907l = m1087A.f6119bU;
        C0173b c0173b = m1087A.f6110bL;
        C0906k m1157a = c0907l.m1157a(z2);
        c0173b.m5344a(this.f6958el, this.f6959em);
        boolean z4 = false;
        if (m2877bb() || this.f1620cg) {
            z4 = true;
        }
        m1157a.m1183a(mo3039h(), (short) c0173b.f801T, (short) c0173b.f802U, Float.valueOf(this.f1618ce), z4);
        c0173b.m5344a(f, f2);
        m1157a.m1178a((short) c0173b.f801T, (short) c0173b.f802U, (short) i);
        m1157a.f5985p = z;
        m1157a.f5986q = mo3330bh();
        m1157a.f5987r = z3;
        boolean z5 = this.f1648cI;
        this.f1648cI = true;
        if (z2 && m1157a.mo1216b()) {
            Iterator it = f3974aU.iterator();
            while (it.hasNext()) {
                C0906k c0906k = (C0906k) it.next();
                if (c0906k.f5976g + 60 < m1087A.f6239bx) {
                    it.remove();
                } else if (c0906k.mo1217a(m1157a)) {
                    return c0906k;
                }
            }
        }
        c0907l.m1160a(m1157a, z2);
        this.f1648cI = z5;
        if (z2 && m1157a.mo1216b()) {
            f3974aU.add(m1157a);
        }
        return m1157a;
    }

    /* renamed from: b */
    void m2887b(Core core) {
        if (this.f3973aT != null) {
            C0173b c0173b = core.f6110bL;
            LinkedList mo1221a = this.f3973aT.mo1221a();
            if (mo1221a != null) {
                this.f3937at = this.f3973aT.mo1218a(this);
                C0906k c0906k = this.f3973aT;
                this.f3939av = 0;
                this.f3940u = false;
                Iterator it = mo1221a.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    C0911p c0911p = (C0911p) it.next();
                    c0173b.m5340a((int) c0911p.f6074a, (int) c0911p.f6075b);
                    m2986a(this.f3939av, c0173b.f801T + c0173b.f787p, c0173b.f802U + c0173b.f788q);
                    this.f3939av++;
                    if (this.f3939av >= 120) {
                        this.f3940u = true;
                        break;
                    }
                }
                if (this.f3939av == 1) {
                    this.f3913q = (byte) (this.f3913q + 1);
                }
                boolean z = false;
                if (mo1221a.size() != 0) {
                    c0173b.m5344a(this.f3911o, this.f3912p);
                    if (!this.f3940u && ((C0911p) mo1221a.getLast()).f6074a == c0173b.f801T && ((C0911p) mo1221a.getLast()).f6075b == c0173b.f802U) {
                        z = true;
                    }
                }
                if (z) {
                    if (1 == 0) {
                        if (this.f3939av < 120) {
                            m2986a(this.f3939av, this.f3911o, this.f3912p);
                            this.f3939av++;
                        }
                    } else {
                        if (this.f3939av == 0) {
                            this.f3939av++;
                        }
                        m2986a(this.f3939av - 1, this.f3911o, this.f3912p);
                    }
                }
                this.f3973aT = null;
                if (this.f3939av > 120) {
                    Core.m998b("activePathCount>maxPathNodes: activePathCount:" + this.f3939av);
                    this.f3939av = 120;
                }
                this.f3941v = this.f3939av;
            }
        }
    }

    /* renamed from: aL */
    public long m2942aL() {
        C0237af c0237af;
        long j = 0;
        for (int i = 0; i < this.f3939av; i++) {
            if (this.f3938au[i] != null) {
                j = j + Float.floatToRawIntBits(c0237af.f1528a) + Float.floatToRawIntBits(c0237af.f1529b);
            }
        }
        return j;
    }

    /* renamed from: o */
    C0237af m2804o(int i) {
        if (this.f3937at != null) {
            if (i == 0) {
                return m2949aE();
            }
            return m2948aF();
        } else if (i >= this.f3939av) {
            return null;
        } else {
            return this.f3938au[i];
        }
    }

    /* renamed from: d */
    public void m2844d(float f) {
        super.m4682d(f);
    }

    /* renamed from: aM */
    public float m2941aM() {
        return 1.0f;
    }

    /* renamed from: l */
    public int m2814l(float f) {
        if (f < -0.3f) {
            int i = (int) (((1.0f - ((-f) / 10.0f)) * 130.0f) + 45.0f);
            if (i < 45) {
                i = 45;
            }
            return i;
        }
        return 255;
    }

    /* renamed from: aN */
    public Paint m2940aN() {
        int i;
        PorterDuffColorFilter porterDuffColorFilter = null;
        if (this.f6960en < -0.3f) {
            i = Color.m5948a(m2814l(this.f6960en), 255, 255, 255);
        } else {
            i = -1;
        }
        if (this.f1624ck < 1.0f && this.f1624ck < m2941aM()) {
            i = Color.m5948a((int) (20.0f + ((this.f1624ck / m2941aM()) * 220.0f)), 140, 255, 140);
            porterDuffColorFilter = f3976aW;
        }
        if (this.f1627cn) {
            if (this.f1630cq) {
                i = Color.m5948a(200, 20, 255, 20);
                porterDuffColorFilter = f3977aX;
            }
            if (this.f1631cr) {
                i = Color.m5948a(200, 255, 20, 20);
                porterDuffColorFilter = f3978aY;
            }
            if (this.f1628co) {
                i = Color.m5948a(50, 70, 70, 245);
                porterDuffColorFilter = f3979aZ;
                if (this.f1631cr) {
                    i = Color.m5948a(50, 255, 20, 20);
                    porterDuffColorFilter = f3978aY;
                }
            }
            if (this.f1629cp) {
                i = Color.m5948a(150, 100, 100, 100);
            }
        }
        return m2985a(i, porterDuffColorFilter, m2939aO());
    }

    /* renamed from: aO */
    public boolean m2939aO() {
        Core m1087A = Core.m1087A();
        boolean z = m1087A.settingEngine.renderAntiAlias;
        if (!m4671di()) {
            z = false;
            if (m1087A.f6256cW < 1.0f) {
                z = true;
            }
        }
        if (this.f1626cm) {
            z = EnumC0249ar.f1793ag;
        }
        return z;
    }

    /* renamed from: p */
    public float m2802p(int i) {
        return 1.0f;
    }

    /* renamed from: c */
    public boolean mo3049c(float f) {
        Core m1087A = Core.m1087A();
        InterfaceC1027y interfaceC1027y = m1087A.f6113bO;
        Paint m2940aN = m2940aN();
        float cC = m4731cC();
        if (this.f4232et) {
            PointF cW = m4711cW();
            float f2 = (this.f6958el + cW.f227a) - m1087A.f6144cv;
            float f3 = ((this.f6959em + cW.f228b) - m1087A.f6145cw) - this.f6960en;
            m2937aQ();
            if (cC != 1.0f) {
                interfaceC1027y.mo135k();
                interfaceC1027y.mo226a(cC, cC, f2, f3);
            }
            interfaceC1027y.mo199a(this.f3885L, f2, f3, mo3317d(false) - 90.0f, m2940aN);
            if (cC != 1.0f) {
                interfaceC1027y.mo134l();
                return true;
            }
            return true;
        }
        PointF cW2 = m4711cW();
        RectF cE = m4729cE();
        float f4 = cW2.f227a;
        float f5 = cW2.f228b - this.f6960en;
        cE.f234a += f4;
        cE.f235b += f5;
        cE.f236c += f4;
        cE.f237d += f5;
        Rect a_ = mo3282a_(false);
        float f6 = (cE.f234a + cE.f236c) * 0.5f;
        float f7 = (cE.f235b + cE.f237d) * 0.5f;
        interfaceC1027y.mo135k();
        m2937aQ();
        if (cC != 1.0f) {
            interfaceC1027y.mo226a(cC, cC, f6, f7);
        }
        interfaceC1027y.mo227a(mo3317d(false), f6, f7);
        interfaceC1027y.mo192a(this.f3885L, a_, cE, m2940aN);
        interfaceC1027y.mo134l();
        return true;
    }

    /* renamed from: F */
    public boolean mo3060F() {
        return this.f6960en > 0.0f && this.f1624ck >= 1.0f && !this.f1628co;
    }

    /* renamed from: aP */
    public PointF m2938aP() {
        f3983bd.m5879a(mo3059G(), mo3058H());
        return f3983bd;
    }

    /* renamed from: G */
    public float mo3059G() {
        return 0.0f;
    }

    /* renamed from: H */
    public float mo3058H() {
        return 0.0f;
    }

    /* renamed from: aQ */
    public boolean m2937aQ() {
        if (this.f3886M != null && mo3060F()) {
            Core m1087A = Core.m1087A();
            if (!m1087A.f6260dd && this.f1621ch < 18.0f && this.f6960en < 0.5d) {
                return true;
            }
            if (!m1087A.f6261de && this.f1621ch < 28.0f && this.f6960en < 5.0f) {
                return true;
            }
            PointF m2938aP = m2938aP();
            float f = (this.f6958el + m2938aP.f227a) - m1087A.f6144cv;
            float f2 = (this.f6959em + m2938aP.f228b) - m1087A.f6145cw;
            float cC = m4731cC();
            InterfaceC1027y interfaceC1027y = m1087A.f6113bO;
            if (cC != 1.0f) {
                interfaceC1027y.mo135k();
                interfaceC1027y.mo226a(cC, cC, f, f2);
            }
            if (m4728cF()) {
                Rect a_ = mo3282a_(true);
                RectF rectF = f1691dz;
                rectF.m5861a(f - this.f4230er, f2 - this.f4231es, f + this.f4230er, f2 + this.f4231es);
                interfaceC1027y.mo135k();
                interfaceC1027y.mo227a(mo3317d(true), f, f2);
                interfaceC1027y.mo192a(this.f3886M, a_, rectF, m3009R());
                interfaceC1027y.mo134l();
            } else {
                interfaceC1027y.mo199a(this.f3886M, f, f2, mo3317d(true) - 90.0f, m3009R());
            }
            if (cC != 1.0f) {
                interfaceC1027y.mo134l();
                return true;
            }
            return true;
        }
        return false;
    }

    /* renamed from: p_ */
    public boolean mo3348p_() {
        return RectF.m5858a(Core.m1087A().f6249cL, m4730cD());
    }

    /* renamed from: aR */
    public boolean m2936aR() {
        C0399m dl = m4668dl();
        if (dl != null && !dl.f2465O) {
            return false;
        }
        return mo3057I();
    }

    /* renamed from: aS */
    public boolean m2935aS() {
        return m2936aR();
    }

    /* renamed from: x */
    public boolean m2789x() {
        return true;
    }

    /* renamed from: aT */
    public int m2934aT() {
        return -1;
    }

    /* renamed from: o */
    public float m2803o(AbstractC0244am abstractC0244am) {
        if (m2932aV() && abstractC0244am != null) {
            return mo3035m() + this.f1621ch + abstractC0244am.f1621ch;
        }
        return mo3035m();
    }

    /* renamed from: p */
    public float m2801p(AbstractC0244am abstractC0244am) {
        if (m2932aV() && abstractC0244am != null) {
            return m2933aU() + this.f1621ch + abstractC0244am.f1621ch;
        }
        return m2933aU();
    }

    /* renamed from: aU */
    public float m2933aU() {
        return mo3035m();
    }

    /* renamed from: q */
    public int m2798q(AbstractC0244am abstractC0244am) {
        Core m1087A = Core.m1087A();
        int i = 0;
        float m2801p = m2801p(abstractC0244am);
        if (m2801p > 58.0f) {
            i = (int) ((m2801p - 41.0f) / (m1087A.f6110bL.f785n * 1.414f));
        }
        return i;
    }

    /* renamed from: aV */
    public boolean m2932aV() {
        return false;
    }

    /* renamed from: q */
    public float mo3150q(int i) {
        return 0.0f;
    }

    /* renamed from: aW */
    public void m2931aW() {
        int mo3169bl = mo3169bl();
        for (int i = 0; i < mo3169bl; i++) {
            if (i < this.f1649cJ.length) {
                C0247ap c0247ap = this.f1649cJ[i];
                if (c0247ap.f1716e > mo3050b(i)) {
                    c0247ap.f1716e = mo3050b(i);
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00d9 A[SYNTHETIC] */
    /* renamed from: aX */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.util.ArrayList m2930aX() {
        /*
            Method dump skipped, instructions count: 225
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.corrodinggames.rts.game.units.AbstractC0623y.m2930aX():java.util.ArrayList");
    }

    /* renamed from: r */
    public boolean m2797r(int i) {
        return true;
    }

    /* renamed from: e */
    public float mo3042e(int i) {
        return 0.0f;
    }

    /* renamed from: s */
    public boolean m2794s(int i) {
        return false;
    }

    /* renamed from: t */
    public float m2793t(int i) {
        return 0.0f;
    }

    /* renamed from: f */
    public float mo3041f(int i) {
        return 4.0f;
    }

    /* renamed from: u */
    public boolean m2792u(int i) {
        int m2791v = m2791v(i);
        if (m2791v == -1) {
            return this.f1649cJ[i].f1718g;
        }
        return this.f1649cJ[m2791v].f1718g;
    }

    /* renamed from: v */
    public int m2791v(int i) {
        return -1;
    }

    /* renamed from: B */
    public float mo3064B() {
        return -1.0f;
    }

    /* renamed from: w */
    public float mo3162w(int i) {
        return -1.0f;
    }

    /* renamed from: x */
    public float m2788x(int i) {
        return 5.0f;
    }

    /* renamed from: y */
    public float m2787y(int i) {
        return mo3162w(i);
    }

    /* renamed from: E */
    public boolean mo3061E() {
        return false;
    }

    /* renamed from: aY */
    public boolean m2929aY() {
        return false;
    }

    /* renamed from: aZ */
    public float m2928aZ() {
        return 1.0f;
    }

    /* renamed from: ba */
    public float m2878ba() {
        return 1.0f;
    }

    /* renamed from: bb */
    public boolean m2877bb() {
        return mo3153bc() > 0.95f;
    }

    /* renamed from: bc */
    public float mo3153bc() {
        return 0.6f;
    }

    /* renamed from: bd */
    public float m2875bd() {
        return 0.0f;
    }

    /* renamed from: be */
    public EnumC0307b m2874be() {
        return EnumC0307b.f1829a;
    }

    /* renamed from: bf */
    public boolean m2873bf() {
        return true;
    }

    /* renamed from: bg */
    public boolean m2872bg() {
        return true;
    }

    /* renamed from: bh */
    public int mo3330bh() {
        return 0;
    }

    /* renamed from: C */
    public float mo3063C() {
        return 99.0f;
    }

    /* renamed from: D */
    public float mo3062D() {
        return 99.0f;
    }

    /* renamed from: bi */
    public boolean mo3320bi() {
        return false;
    }

    /* renamed from: bj */
    public boolean mo3319bj() {
        return false;
    }

    /* renamed from: b */
    public boolean m2895b(int i, float f) {
        return true;
    }

    /* renamed from: bk */
    public boolean m2868bk() {
        return false;
    }

    /* renamed from: bl */
    public int mo3169bl() {
        return 1;
    }

    /* renamed from: bm */
    public boolean mo4428bm() {
        return true;
    }

    /* renamed from: g */
    public float mo3040g(int i) {
        return 0.0f;
    }

    /* renamed from: z */
    public float m2785z(int i) {
        return 99999.0f;
    }

    /* renamed from: A */
    public float m3031A(int i) {
        return -1.0f;
    }

    /* renamed from: B */
    public float m3029B(int i) {
        return 0.0f;
    }

    /* renamed from: C */
    public float mo3182C(int i) {
        if (this.f1620cg && m2877bb()) {
            return this.f1618ce + 180.0f;
        }
        return this.f1618ce;
    }

    /* renamed from: bn */
    public C1080ai m2865bn() {
        int m2934aT = m2934aT();
        if (m2934aT == -1) {
            return m3025D(0);
        }
        return m3025D(m2934aT);
    }

    /* renamed from: D */
    public C1080ai m3025D(int i) {
        f3984be.m572a(mo3156E(i));
        return f3984be;
    }

    /* renamed from: E */
    public PointF mo3156E(int i) {
        C0247ap c0247ap = this.f1649cJ[i];
        float mo3040g = mo3040g(i);
        float f = mo3061E() ? this.f1618ce : c0247ap.f1712a;
        PointF mo3176G = mo3176G(i);
        f3985bf.m5879a(mo3176G.f227a + (C0758f.m2092i(f) * mo3040g), mo3176G.f228b + (C0758f.m2097h(f) * mo3040g));
        return f3985bf;
    }

    /* renamed from: F */
    public C1080ai m3021F(int i) {
        f3987bh.m572a(mo3176G(i));
        f3987bh.f6851c = 0.0f;
        return f3987bh;
    }

    /* renamed from: G */
    public PointF mo3176G(int i) {
        C0247ap c0247ap = this.f1649cJ[i];
        float f = this.f6958el;
        float f2 = this.f6959em;
        float mo3181H = mo3181H(i);
        if (c0247ap.f1716e != 0.0f && mo3181H != 0.0f) {
            float mo3180I = mo3180I(i);
            float mo3179J = mo3179J(i);
            float f3 = 0.0f;
            float mo3050b = mo3050b(i) - c0247ap.f1716e;
            if (mo3050b < mo3180I) {
                f3 = (mo3050b / mo3180I) * mo3181H;
            } else if (mo3050b < mo3179J + mo3180I) {
                f3 = mo3181H - (((mo3050b - mo3180I) / mo3179J) * mo3181H);
            }
            if (f3 != 0.0f) {
                f += C0758f.m2092i(c0247ap.f1712a) * f3;
                f2 += C0758f.m2097h(c0247ap.f1712a) * f3;
            }
        }
        f3986bg.m5879a(f, f2);
        return f3986bg;
    }

    /* renamed from: H */
    public float mo3181H(int i) {
        return 0.0f;
    }

    /* renamed from: I */
    public float mo3180I(int i) {
        return 4.0f;
    }

    /* renamed from: J */
    public float mo3179J(int i) {
        return 6.0f;
    }

    /* renamed from: K */
    public PointF m3013K(int i) {
        PointF pointF = f3988bi;
        pointF.m5879a(0.0f, 0.0f);
        C0247ap c0247ap = this.f1649cJ[i];
        pointF.f227a += c0247ap.f1719h;
        pointF.f228b += c0247ap.f1720i;
        return pointF;
    }

    /* renamed from: L */
    public float m3012L(int i) {
        return 0.6f;
    }

    /* renamed from: M */
    public void m3011M(int i) {
        if (i == -1) {
            int mo3169bl = mo3169bl();
            for (int i2 = 0; i2 < mo3169bl; i2++) {
                m3011M(i2);
            }
            return;
        }
        C0247ap c0247ap = this.f1649cJ[i];
        c0247ap.f1719h = 0.0f;
        c0247ap.f1720i = 0.0f;
        if (this.f3896Q != null && m3012L(i) != 0.0f) {
            float m3012L = this.f3896Q.f1621ch * m3012L(i);
            c0247ap.f1719h += C0758f.m2188a((AbstractC1120w) this, (int) (-m3012L), (int) m3012L, 1 + i);
            c0247ap.f1720i += C0758f.m2188a((AbstractC1120w) this, (int) (-m3012L), (int) m3012L, 2 + i);
        }
    }

    /* renamed from: a */
    public void m2981a(EnumC0233ab enumC0233ab) {
        m2980a(enumC0233ab, true);
    }

    /* renamed from: a */
    public void m2980a(EnumC0233ab enumC0233ab, boolean z) {
        C0745e m2359d;
        Core m1087A = Core.m1087A();
        if (enumC0233ab == EnumC0233ab.f1509h) {
            m1087A.f6111bM.m2776a(C0631e.f4050p, 0.8f, this.f6958el, this.f6959em);
            m1087A.f6116bR.m2391a(this.f6958el, this.f6959em, this.f6960en);
            m1087A.f6116bR.m2364b(EnumC0748h.f4836e);
            C0745e m2361c = m1087A.f6116bR.m2361c(this.f6958el, this.f6959em, this.f6960en, -1127220);
            if (m2361c != null) {
                m2361c.f4751H = 0.2f;
                m2361c.f4750G = 2.0f;
                m2361c.f4788as = (short) 2;
                m2361c.f4766W = 45.0f;
                m2361c.f4767X = m2361c.f4766W;
                m2361c.f4765V = 0.0f;
            }
        } else if (enumC0233ab == EnumC0233ab.f1505d || enumC0233ab == EnumC0233ab.f1507f || enumC0233ab == EnumC0233ab.f1508g) {
            m1087A.f6111bM.m2776a(C0631e.f4050p, 0.8f, this.f6958el, this.f6959em);
            m1087A.f6116bR.m2391a(this.f6958el, this.f6959em, this.f6960en);
        } else if (enumC0233ab == EnumC0233ab.f1502a) {
            m1087A.f6111bM.m2775a(C0631e.f4049o, 0.4f, 1.0f + C0758f.m2136c(-0.07f, 0.07f), this.f6958el, this.f6959em);
            m1087A.f6116bR.m2370b(this.f6958el, this.f6959em, this.f6960en);
        } else if (enumC0233ab == EnumC0233ab.f1506e) {
            m1087A.f6111bM.m2775a(C0631e.f4049o, 0.8f, 1.0f + C0758f.m2136c(-0.07f, 0.07f), this.f6958el, this.f6959em);
            m1087A.f6116bR.m2370b(this.f6958el, this.f6959em, this.f6960en);
            m1087A.f6116bR.m2364b(EnumC0748h.f4836e);
            C0745e m2361c2 = m1087A.f6116bR.m2361c(this.f6958el, this.f6959em, this.f6960en, -1127220);
            if (m2361c2 != null) {
                m2361c2.f4751H = 0.2f;
                m2361c2.f4750G = 2.0f;
                m2361c2.f4788as = (short) 2;
                m2361c2.f4766W = 45.0f;
                m2361c2.f4767X = m2361c2.f4766W;
                m2361c2.f4765V = 0.0f;
            }
        } else {
            m1087A.f6111bM.m2775a(C0631e.f4049o, 0.8f, 1.0f + C0758f.m2136c(-0.07f, 0.07f), this.f6958el, this.f6959em);
            m1087A.f6116bR.m2370b(this.f6958el, this.f6959em, this.f6960en);
        }
        if (enumC0233ab != EnumC0233ab.f1502a) {
            if (enumC0233ab != EnumC0233ab.f1508g && (m2359d = m1087A.f6116bR.m2359d(this.f6958el, this.f6959em, this.f6960en, 0)) != null) {
                m2359d.f4749F = 0.9f;
            }
            if (z) {
                if (!mo4386bO()) {
                    m2864bo();
                }
                if (enumC0233ab != EnumC0233ab.f1508g && !m4724cJ()) {
                    C0746f.m2348a(this.f6958el, this.f6959em);
                    C0746f.m2340b(this.f6958el, this.f6959em);
                    m2862bq();
                }
            }
        }
    }

    /* renamed from: bo */
    public void m2864bo() {
        Core m1087A = Core.m1087A();
        float f = 1.0f;
        float f2 = 1.0f;
        int m2863bp = m2863bp();
        if (m2863bp >= 10) {
            f = 1.2f;
            f2 = 1.4f;
        }
        if (m2863bp >= 20) {
            f = 1.5f;
            f2 = 1.7f;
        }
        if (this.f6960en > -1.0f) {
            for (int i = 0; i < m2863bp; i++) {
                m1087A.f6116bR.m2368b(this.f6958el, this.f6959em, this.f6960en, f, f2);
            }
        }
    }

    /* renamed from: bp */
    public int m2863bp() {
        if (mo3327db()) {
            return 8;
        }
        if (m4758bI()) {
            return 7;
        }
        return 4;
    }

    /* renamed from: bq */
    public void m2862bq() {
        if (!m4724cJ()) {
            C0195l.m5131a(this.f6958el, this.f6959em);
        }
    }

    /* renamed from: s */
    public int m2795s() {
        return 15;
    }

    /* renamed from: c */
    public void m2846c(boolean z) {
        int m2795s;
        Core m1087A = Core.m1087A();
        if (this.f1651cL == null && this.f1652cM == null && (m2795s = m2795s()) > 0) {
            m1087A.f6110bL.m5343a(this.f6958el, this.f6959em, m2795s, this.f1609bV, z);
        }
    }

    /* renamed from: br */
    public void m2861br() {
        Core m1087A = Core.m1087A();
        RectF rectF = new RectF();
        rectF.m5860a(m4705cc());
        rectF.f235b *= m1087A.f6110bL.f786o;
        rectF.f237d *= m1087A.f6110bL.f786o;
        rectF.f234a *= m1087A.f6110bL.f785n;
        rectF.f236c *= m1087A.f6110bL.f785n;
        rectF.m5862a(this.f6958el, this.f6959em);
        rectF.m5862a(-m4710cX(), -m4709cY());
        rectF.f235b -= 10.0f;
        rectF.f237d += 10.0f;
        rectF.f234a -= 10.0f;
        rectF.f236c += 10.0f;
        Iterator it = AbstractC0244am.m4761bF().iterator();
        while (it.hasNext()) {
            AbstractC0244am abstractC0244am = (AbstractC0244am) it.next();
            if ((abstractC0244am instanceof AbstractC0244am) && abstractC0244am != this && abstractC0244am.m4791a(rectF)) {
                if ((abstractC0244am instanceof AbstractC0623y) && abstractC0244am.f1607bT) {
                    abstractC0244am.mo2689a();
                }
                if (abstractC0244am instanceof C0243al) {
                    ((C0243al) abstractC0244am).m4803f();
                }
            }
        }
    }

    /* renamed from: c */
    public boolean m2848c(AbstractC0197n abstractC0197n) {
        return m2884b(false, abstractC0197n) == null;
    }

    /* renamed from: a */
    public boolean m2954a(boolean z, AbstractC0197n abstractC0197n) {
        return m2884b(z, abstractC0197n) == null;
    }

    /* renamed from: b */
    public String m2884b(boolean z, AbstractC0197n abstractC0197n) {
        String m4180a;
        Core m1087A = Core.m1087A();
        C0402bc mo4466q = mo1758r().mo4466q();
        if (mo4466q != null && (m4180a = mo4466q.m4180a(this, this.f6958el, this.f6959em)) != null) {
            return m4180a;
        }
        if (mo1758r().mo4467p()) {
            m1087A.f6110bL.m5344a(this.f6958el, this.f6959em);
            C0180g m5290e = m1087A.f6110bL.m5290e(m1087A.f6110bL.f801T, m1087A.f6110bL.f802U);
            if (m5290e == null || !m5290e.f922i) {
                return "{2}";
            }
        }
        if (!z && m2974a((AbstractC0244am) null, abstractC0197n)) {
            return "{0}";
        }
        if (!mo1758r().mo4467p()) {
            Rect cc = m4705cc();
            Point a = m4790a(m1087A.f6110bL, f3989bj);
            int i = a.f224a;
            int i2 = a.f225b;
            InterfaceC0303as r = mo1758r();
            EnumC0246ao mo4468o = r.mo4468o();
            for (int i3 = i + cc.f230a; i3 <= i + cc.f232c; i3++) {
                for (int i4 = i2 + cc.f231b; i4 <= i2 + cc.f233d; i4++) {
                    String m3536a = AbstractC0488d.m3536a(this, r, mo4468o, i3, i4, false, abstractC0197n);
                    if (m3536a != null) {
                        return m3536a;
                    }
                }
            }
            return null;
        }
        return null;
    }

    /* renamed from: N */
    public void m3010N(int i) {
        Core m1087A = Core.m1087A();
        if (!mo1758r().mo4467p()) {
            Rect cc = m4705cc();
            Point a = m4790a(m1087A.f6110bL, f3990bk);
            int i2 = a.f224a;
            int i3 = a.f225b;
            mo1758r();
            int i4 = i2 + cc.f230a;
            int i5 = i3 + cc.f231b;
            int i6 = i2 + cc.f232c;
            int i7 = i3 + cc.f233d;
            if (i != -2) {
                m1087A.f6110bL.m5327a(this, i4, i5, i6, i7, (int) m1087A.f6144cv, (int) m1087A.f6145cw, m1087A.f6113bO, true, i);
            }
        }
    }

    /* renamed from: r */
    public boolean m2796r(AbstractC0244am abstractC0244am) {
        float m2209a = C0758f.m2209a(this.f6958el, this.f6959em, abstractC0244am.f6958el, abstractC0244am.f6959em);
        float f = 9.0f;
        if (!abstractC0244am.m4758bI()) {
            f = this.f1621ch + abstractC0244am.f1621ch;
            if (f < 11.0f) {
                f = 11.0f;
            }
        }
        if (m2209a < f * f) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public boolean m2974a(AbstractC0244am abstractC0244am, AbstractC0197n abstractC0197n) {
        boolean z = false;
        if (!m4758bI()) {
            z = true;
        }
        float f = this.f1621ch + C0348af.f2206p + 10.0f;
        float f2 = this.f6958el - f;
        float f3 = this.f6958el + f;
        float f4 = this.f6959em - f;
        float f5 = this.f6959em + f;
        AbstractC0244am[] m498a = AbstractC0244am.f1590bD.m498a();
        int size = AbstractC0244am.f1590bD.size();
        for (int i = 0; i < size; i++) {
            AbstractC0244am abstractC0244am2 = m498a[i];
            float f6 = abstractC0244am2.f6958el;
            float f7 = abstractC0244am2.f6959em;
            if (f2 <= f6 && f6 <= f3 && f4 <= f7 && f7 <= f5 && abstractC0244am2 != this && ((z || abstractC0244am2.m4758bI()) && !abstractC0244am2.f1607bT && m2796r(abstractC0244am2) && abstractC0244am2 != abstractC0244am && (abstractC0197n == null || abstractC0244am2.m4681d(abstractC0197n)))) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: bs */
    public AbstractC0623y m2860bs() {
        Iterator it = AbstractC0244am.f1590bD.iterator();
        while (it.hasNext()) {
            AbstractC0244am abstractC0244am = (AbstractC0244am) it.next();
            if (abstractC0244am != this && (abstractC0244am instanceof AbstractC0623y)) {
                AbstractC0623y abstractC0623y = (AbstractC0623y) abstractC0244am;
                if (!abstractC0623y.f1607bT && abstractC0623y.f1609bV == this.f1609bV && abstractC0623y.mo1758r() == mo1758r() && m4645t(abstractC0623y)) {
                    return abstractC0623y;
                }
            }
        }
        return null;
    }

    /* renamed from: a */
    public void mo2689a() {
        if (this.f1652cM != null) {
            m2855bx();
        }
        m2901az();
        m2945aI();
        super.mo2689a();
    }

    /* renamed from: bt */
    public void m2859bt() {
        m2966a((AbstractC0623y) null);
        this.f3896Q = null;
        m2901az();
        m2945aI();
    }

    /* renamed from: bu */
    public void m2858bu() {
        if (this.f1652cM != null) {
            m2855bx();
        }
        super.m4742bu();
    }

    /* renamed from: bv */
    public void m2857bv() {
        super.m4741bv();
    }

    /* renamed from: bw */
    public int m2856bw() {
        return (((((((((((0 * 31) + super.m4740bw()) * 31) + ((int) (mo3033z() * 100.0f))) * 31) + ((int) (mo3065A() * 100.0f))) * 31) + ((int) (mo3035m() * 100.0f))) * 31) + ((int) mo3050b(0))) * 31) + ((int) (mo3063C() * 100.0f));
    }

    /* renamed from: m */
    PointF m2810m(float f) {
        PointF m2807n = m2807n(f);
        f1694dC.m5879a(this.f6958el + m2807n.f227a, this.f6959em + m2807n.f228b);
        return f1694dC;
    }

    /* renamed from: n */
    public PointF m2807n(float f) {
        float f2 = 0.0f;
        float f3 = 0.0f;
        if (mo3057I() && this.f3888b == 0.0f) {
            if (mo3320bi()) {
                f2 = this.f1614ca * f;
                f3 = this.f1615cb * f;
            } else if (this.f1617cd != 0.0f) {
                float f4 = this.f1618ce;
                if (mo3319bj()) {
                    f4 = this.f1619cf;
                }
                float mo3033z = mo3033z() * this.f1617cd * f;
                f2 = C0758f.m2092i(f4) * mo3033z;
                f3 = C0758f.m2097h(f4) * mo3033z;
            }
        }
        f3991bl.m5879a(f2, f3);
        return f3991bl;
    }

    /* renamed from: a */
    public boolean m2979a(EnumC0238ag enumC0238ag) {
        return false;
    }

    /* renamed from: a */
    public void m2983a(AbstractC0224s abstractC0224s) {
    }

    /* renamed from: a */
    public boolean m2982a(AbstractC0224s abstractC0224s, float f, float f2) {
        return true;
    }

    /* renamed from: a */
    public void m2977a(AbstractC0244am abstractC0244am, float f, int i) {
        this.f3899T = C0758f.m2211a(this.f3899T, f);
        if (this.f3899T == 0.0f) {
            this.f3899T = 5.0f;
            if (mo3348p_()) {
                C1080ai m2865bn = m2865bn();
                C0745e m2365b = Core.m1087A().f6116bR.m2365b(m2865bn.f6849a, m2865bn.f6850b, this.f6960en + m2865bn.f6851c, EnumC0744d.f4707a, false, EnumC0748h.f4833b);
                if (m2365b != null) {
                    float m2123d = C0758f.m2123d(m2865bn.f6849a, m2865bn.f6850b, (float) (abstractC0244am.f6958el + (-8.0d) + (Math.random() * 16.0d)), (float) (abstractC0244am.f6959em + (-8.0d) + (Math.random() * 16.0d)));
                    m2365b.f4760Q = C0758f.m2092i(m2123d) * C0758f.m2136c(2.0f, 4.0f);
                    m2365b.f4761R = C0758f.m2097h(m2123d) * C0758f.m2136c(2.0f, 4.0f);
                    m2365b.f4786aq = 6;
                    m2365b.f4766W = 20.0f;
                    m2365b.f4767X = m2365b.f4766W;
                    m2365b.f4736s = true;
                    m2365b.f4749F = 0.8f;
                    m2365b.f4751H = 0.2f;
                    m2365b.f4750G = 1.0f;
                }
            }
        }
    }

    /* renamed from: b */
    public void m2893b(AbstractC0244am abstractC0244am, float f, int i) {
        this.f3899T = C0758f.m2211a(this.f3899T, f);
        if (this.f3899T == 0.0f) {
            this.f3899T = 5.0f;
            if (mo3348p_()) {
                PointF mo3156E = mo3156E(0);
                C0745e m2365b = Core.m1087A().f6116bR.m2365b(abstractC0244am.f6958el, abstractC0244am.f6959em, abstractC0244am.f6960en, EnumC0744d.f4707a, false, EnumC0748h.f4833b);
                if (m2365b != null) {
                    float m2123d = C0758f.m2123d(abstractC0244am.f6958el, abstractC0244am.f6959em - abstractC0244am.f6960en, (float) (mo3156E.f227a + (-8.0d) + (Math.random() * 16.0d)), (float) (mo3156E.f228b + (-8.0d) + (Math.random() * 16.0d)));
                    m2365b.f4760Q = C0758f.m2092i(m2123d) * C0758f.m2136c(2.0f, 4.0f);
                    m2365b.f4761R = C0758f.m2097h(m2123d) * C0758f.m2136c(2.0f, 4.0f);
                    m2365b.f4786aq = 5;
                    m2365b.f4766W = 20.0f;
                    m2365b.f4767X = m2365b.f4766W;
                    m2365b.f4736s = true;
                    m2365b.f4749F = 0.8f;
                    m2365b.f4751H = 0.2f;
                    m2365b.f4750G = 1.0f;
                }
            }
        }
    }

    /* renamed from: a */
    public C0625z m2968a(C0305au c0305au, InterfaceC0303as interfaceC0303as, int i, float f, float f2) {
        Core m1087A = Core.m1087A();
        AbstractC0224s m2971a = m2971a(interfaceC0303as, i, false);
        if (m2971a == null) {
            Core.m998b("Unit '" + mo1758r().mo4474i() + "' can not build:" + interfaceC0303as.mo4474i());
            return f3992bm.m2784a();
        }
        if (!c0305au.f1810n) {
            if (m2971a.mo4864g(this)) {
                Core.m998b("Builder '" + mo1758r().mo4474i() + "' tried to build a locked building:" + m2971a.m4909O());
                return f3992bm.m2784a();
            } else if (!m2971a.mo3084b(this) && !m2971a.m4872u(this)) {
                Core.m998b("Builder '" + mo1758r().mo4474i() + "' tried to build a unavailable building:" + m2971a.m4909O() + " (add isLocked:false to fix)");
                return f3992bm.m2784a();
            }
        }
        if (!interfaceC0303as.mo4472k() && !m2971a.mo4944x() && this.f1609bV.m5007u() >= this.f1609bV.m5006v()) {
            if (this.f1609bV == m1087A.f6099bs) {
                m1087A.f6117bS.m1850b(m1087A.f6117bS.f5114d.f4974an);
            }
            return f3992bm.m2784a();
        } else if (AbstractC0244am.m4785a(interfaceC0303as) == null) {
            String str = "{build is null}";
            if (c0305au.f1798b != null) {
                str = c0305au.f1798b.mo4474i();
            }
            Core.LogDebug2("Build unit type missing: " + str);
            return f3992bm.m2784a();
        } else {
            AbstractC0244am m3528g = AbstractC0488d.m3528g(interfaceC0303as);
            if (!C0424b.m4101b(interfaceC0303as.mo4465u(), m2971a.mo4866B()) || !C0424b.m4101b(interfaceC0303as.mo4488B(), m2971a.mo4862o_())) {
                m3528g.f1583bw = m2971a.mo4866B();
                m3528g.f1584bx = m2971a.mo4862o_();
            }
            if (m2971a instanceof C0213h) {
                m3528g.f1583bw = null;
                m3528g.f1584bx = null;
            }
            m3528g.f1624ck = 0.0f;
            m3528g.f1625cl = 0.0f;
            m1087A.f6110bL.m5309b((f - m3528g.m4710cX()) + 1.0f, (f2 - m3528g.m4709cY()) + 1.0f);
            m3528g.f6958el = m1087A.f6110bL.f801T + m3528g.m4710cX();
            m3528g.f6959em = m1087A.f6110bL.f802U + m3528g.m4709cY();
            m3528g.m4656f(this.f1609bV);
            m3528g.m4801B(this);
            if (i != 1 && (m3528g instanceof AbstractC0623y)) {
                ((AbstractC0623y) m3528g).mo3356a(i);
            }
            m3528g.m4719cO();
            if (m3528g instanceof AbstractC0623y) {
                AbstractC0623y abstractC0623y = (AbstractC0623y) m3528g;
                boolean z = false;
                AbstractC0623y abstractC0623y2 = null;
                if (m2915al()) {
                    abstractC0623y2 = this;
                } else if (!this.f1606bS && !m4758bI()) {
                    abstractC0623y2 = this;
                }
                if (abstractC0623y.m2974a(abstractC0623y2, (AbstractC0197n) null)) {
                    z = true;
                }
                if (!z && !abstractC0623y.m2954a(true, (AbstractC0197n) null)) {
                    z = true;
                }
                if (z) {
                    m3528g.mo2689a();
                    C0625z m2784a = f3992bm.m2784a();
                    AbstractC0623y m2860bs = ((AbstractC0623y) m3528g).m2860bs();
                    m2784a.f4001b = m2860bs;
                    m2784a.f4003d = m2971a;
                    if (m2860bs == null) {
                    }
                    return m2784a;
                }
            }
            C0424b mo4866B = m2971a.mo4866B();
            if (c0305au.f1810n) {
                mo4866B = C0424b.f2710a;
            }
            if (!mo4866B.m4128c(this)) {
                m3528g.mo2689a();
                C0625z m2784a2 = f3992bm.m2784a();
                this.f3895P = m1087A.f6102by;
                if (this.f3902U < 1000.0f) {
                    m2784a2.f4002c = true;
                    C0741a m2407a = C0741a.m2407a(this.f1609bV, m3528g.f6958el, m3528g.f6959em);
                    if (m2407a != null) {
                        m2407a.f4654i = true;
                    }
                }
                return m2784a2;
            }
            m2808m(m3528g);
            if (m3528g instanceof AbstractC0623y) {
                AbstractC0623y abstractC0623y3 = (AbstractC0623y) m3528g;
                abstractC0623y3.m2861br();
                if (m3528g.m4758bI()) {
                    m1087A.f6119bU.m1165a(abstractC0623y3);
                }
            }
            AbstractC0197n.m5053c(m3528g);
            C0625z m2784a3 = f3992bm.m2784a();
            m2784a3.f4000a = m3528g;
            m2784a3.f4003d = m2971a;
            return m2784a3;
        }
    }

    /* renamed from: a */
    public boolean m2963a(AbstractC0623y abstractC0623y, C0399m c0399m) {
        return false;
    }

    /* renamed from: b */
    public boolean m2888b(AbstractC0623y abstractC0623y) {
        return false;
    }

    /* renamed from: bx */
    public void m2855bx() {
        if (this.f1652cM == null) {
            return;
        }
        if (this.f1652cM.f1607bT) {
        }
        if (!this.f1652cM.m2888b(this)) {
            Core.m998b("Deattach failed, forcing deattach. Child:" + m4683cz() + " Parent:" + this.f1652cM.m4683cz());
            this.f1652cM = null;
            this.f1653cN = null;
        }
    }

    /* renamed from: a */
    public C0399m m2956a(short s) {
        return null;
    }

    /* renamed from: a */
    public static AbstractC0244am m2965a(AbstractC0623y abstractC0623y, float f, float f2, float f3, C0449h c0449h) {
        if (f3 <= 0.0f) {
            return null;
        }
        f3993bn.f1516f = true;
        f3993bn.f1517g = false;
        f3993bn.f1515e = null;
        f3993bn.f1514d = f3 * f3;
        f3993bn.f1513c = c0449h;
        f3993bn.f1511a = f;
        f3993bn.f1512b = f2;
        Core.m1087A().f6127cc.m3258a(f, f2, f3, abstractC0623y, 0.0f, f3993bn);
        return f3993bn.f1515e;
    }

    /* renamed from: by */
    public C0424b m2854by() {
        return C0424b.f2710a;
    }

    /* renamed from: bz */
    public C1101m m2853bz() {
        return f3995bp;
    }

    /* renamed from: bA */
    public boolean mo4819bA() {
        return false;
    }

    /* renamed from: bB */
    public int mo4818bB() {
        return 0;
    }

    /* renamed from: bC */
    public void m2881bC() {
        C0424b m4116a;
        C0424b m2879bE = m2879bE();
        C0424b m2880bD = m2880bD();
        if (m2879bE == null) {
            m4116a = m2880bD;
        } else if (m2880bD == null) {
            m4116a = m2879bE;
        } else {
            m4116a = C0424b.m4116a(m2879bE, m2880bD);
        }
        if (this.f1699dH == null && m4116a == null) {
            return;
        }
        if (this.f1699dH != null && m4116a != null && this.f1699dH.m4102b(m4116a)) {
            return;
        }
        AbstractC0197n.m5069b((AbstractC0244am) this);
        this.f1699dH = m4116a;
        AbstractC0197n.m5053c(this);
    }

    /* renamed from: bD */
    public C0424b m2880bD() {
        return null;
    }

    /* renamed from: bE */
    public C0424b m2879bE() {
        C0305au m2909ar;
        AbstractC0244am m3003X = m3003X();
        if (m3003X != null && (m2909ar = m2909ar()) != null) {
            if (m2909ar.f1797a == EnumC0306av.f1814d && m3003X.f1624ck < 1.0f) {
                C0424b m2830g = m2830g(m3003X);
                float m2927a_ = m2927a_(m3003X) * 60.0f;
                if (m2830g != null) {
                    return C0424b.m4117a(m2830g, -m2927a_);
                }
            }
            if (m2909ar.f1797a == EnumC0306av.f1817g) {
                if (m3003X.f1624ck < 1.0f) {
                    C0424b m2830g2 = m2830g(m3003X);
                    float m2834f = m2834f(m3003X) * 60.0f;
                    if (m2830g2 != null) {
                        return C0424b.m4117a(m2830g2, m2834f);
                    }
                    return null;
                } else if (m4642y(m3003X)) {
                    float z = m4641z(m3003X);
                    C0424b m4722cL = m3003X.m4722cL();
                    C0424b m4721cM = m3003X.m4721cM();
                    if (m4721cM != null) {
                        m4722cL = m4721cM;
                    }
                    return C0424b.m4117a(m4722cL, (z * 60.0f) / m3003X.f1633ct);
                } else {
                    return null;
                }
            }
            return null;
        }
        return null;
    }
}
