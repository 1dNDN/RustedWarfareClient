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
import com.corrodinggames.rts.gameFramework.EnumC0729bm;
import com.corrodinggames.rts.gameFramework.LoggerMaybe;
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
    public abstract C0934e mo2989d();

    /* renamed from: k */
    public abstract C0934e mo2980k();

    /* renamed from: d */
    public abstract C0934e mo2988d(int i);

    /* renamed from: I */
    public abstract boolean mo2998I();

    /* renamed from: m */
    public abstract float mo2978m();

    /* renamed from: b */
    public abstract float mo2992b(int i);

    /* renamed from: A */
    public abstract float mo3006A();

    /* renamed from: c */
    public abstract float mo2991c(int i);

    /* renamed from: z */
    public abstract float mo2976z();

    /* renamed from: a */
    public abstract void mo2993a(AbstractC0244am abstractC0244am, int i);

    /* renamed from: a */
    static /* synthetic */ void m2907a(AbstractC0623y abstractC0623y, AbstractC0244am abstractC0244am, float f, boolean z) {
        abstractC0623y.m2919a(abstractC0244am, f, z);
    }

    static {
        f3999aD.m5420a(128, 255, 255, 255);
        f3999aD.m890o();
        f3950aE = new C0930ag();
        f3950aE.m5412a(f3999aD);
        f3950aE.mo894a(true);
        f3950aE.m5387d(true);
        f3950aE.m5395b(true);
        f3950aE.m890o();
        f3951aF = new PointF();
        f3956B = new Paint();
        f3958D = m2899a(false);
        f3959E = m2899a(true);
        f3960aG = new C06241();
        f3965aL = new C1112u();
        f3968aO = new C0235ad();
        f3969aP = new C0236ae(true);
        f3970aQ = new C0236ae(false);
        f3971aR = new C0239ah(true);
        f3972aS = new C0239ah(false);
        f3974aU = new C1101m();
        f3975aV = new C0237af();
        f3976aW = new PorterDuffColorFilter(Color.m5436a(200, 255, 200), PorterDuff.Mode.MULTIPLY);
        f3977aX = new PorterDuffColorFilter(Color.m5436a(70, 255, 70), PorterDuff.Mode.MULTIPLY);
        f3978aY = new PorterDuffColorFilter(Color.m5436a(255, 40, 40), PorterDuff.Mode.MULTIPLY);
        f3979aZ = new PorterDuffColorFilter(Color.m5436a(120, 120, 255), PorterDuff.Mode.MULTIPLY);
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
    public void m2844b(float f) {
        if (this.f3945ay < f) {
            this.f3945ay = f;
        }
    }

    /* renamed from: R */
    public Paint m2952R() {
        if (m2883aO()) {
            return f3950aE;
        }
        return f3999aD;
    }

    /* renamed from: a */
    public static void m2905a(AbstractC0623y abstractC0623y, AbstractC0623y abstractC0623y2) {
        try {
            StreamWriter streamWriter = new StreamWriter();
            int i = abstractC0623y.f3892f;
            for (int i2 = 0; i2 < i; i2++) {
                abstractC0623y.f3893g[i2].m4232a(streamWriter);
            }
            Reader reader = new Reader(streamWriter.mo1353d());
            abstractC0623y2.f3892f = i;
            for (int i3 = 0; i3 < i; i3++) {
                int i4 = i3;
                abstractC0623y2.m2755m(i4);
                if (i4 >= abstractC0623y2.f3893g.length) {
                    LoggerMaybe.m983b("Too many waypoints:" + i3);
                    i4 = abstractC0623y2.f3893g.length - 1;
                }
                if (abstractC0623y2.f3893g[i4] == null) {
                    abstractC0623y2.f3893g[i4] = new C0305au();
                }
                abstractC0623y2.f3893g[i4].m4231a(reader);
                abstractC0623y2.f3893g[i4].m4226c();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: a */
    public void mo2292a(StreamWriter streamWriter) {
        streamWriter.mo1320a(this.f3888b);
        streamWriter.mo1320a(this.f3889c);
        streamWriter.mo1320a(this.f1649cJ[0].f1716e);
        streamWriter.WriteInteger(this.f3892f);
        int i = this.f3892f;
        streamWriter.WriteInteger(i);
        for (int i2 = 0; i2 < i; i2++) {
            this.f3893g[i2].m4232a(streamWriter);
        }
        streamWriter.mo1363a(this.f3894O);
        AbstractC0244am abstractC0244am = this.f3896Q;
        if (abstractC0244am != null && abstractC0244am.f1607bT) {
            abstractC0244am = null;
        }
        streamWriter.mo1318a(abstractC0244am);
        streamWriter.mo1320a(this.f3897R);
        streamWriter.mo1320a(this.f3899T);
        streamWriter.mo1320a(this.f3902U);
        streamWriter.mo1352d("pathing_active:");
        streamWriter.mo1314a(this.f3907k);
        streamWriter.mo1320a(this.f3908l);
        streamWriter.mo1320a(this.f3909m);
        streamWriter.mo1320a(this.f3915s);
        streamWriter.mo1369a(this.f3921ac);
        streamWriter.mo1314a(this.f3922ad);
        streamWriter.mo1314a(this.f3923ae);
        streamWriter.mo1314a(this.f3927ai);
        streamWriter.mo1320a(this.f3928aj);
        streamWriter.mo1320a(this.f3929ak);
        streamWriter.mo1320a(this.f3930al);
        streamWriter.WriteInteger(this.f3931am);
        streamWriter.WriteInteger(this.f3920ab);
        streamWriter.mo1352d("activePathCount:");
        streamWriter.WriteInteger(this.f3939av);
        for (int i3 = 0; i3 < this.f3939av; i3++) {
            this.f3938au[i3].m4470a(streamWriter);
        }
        streamWriter.WriteInteger(this.f3939av);
        streamWriter.WriteInteger(this.f3941v);
        if (streamWriter.mo1349f()) {
        }
        streamWriter.mo1355c(12);
        streamWriter.mo1320a(this.f3911o);
        streamWriter.mo1320a(this.f3912p);
        streamWriter.mo1320a(this.f3890d);
        streamWriter.mo1320a(this.f3891e);
        streamWriter.mo1314a(this.f3940u);
        streamWriter.mo1320a(this.f3926ah);
        streamWriter.WriteInteger(this.f3910n);
        streamWriter.mo1320a(this.f3903V);
        streamWriter.mo1320a(this.f3934ap);
        streamWriter.mo1314a(this.f3935aq);
        streamWriter.mo1314a(this.f3936ar);
        streamWriter.mo1315a(this.f3925ag);
        streamWriter.mo1320a(this.f3919aa);
        streamWriter.WriteInteger(this.f3942w);
        streamWriter.mo1320a(this.f3904W);
        streamWriter.mo1320a(this.f3945ay);
        streamWriter.mo1320a(this.f3946az);
        C0552c.m3137a(this, streamWriter);
        super.mo2292a(streamWriter);
    }

    /* renamed from: a */
    public void mo2291a(Reader reader) {
        this.f3888b = reader.m1285g();
        this.f3889c = reader.m1285g();
        this.f1649cJ[0].f1716e = reader.m1285g();
        this.f3892f = reader.ReadInt();
        if (this.f3892f > 0) {
            m2755m(C0758f.m2080c(this.f3892f - 1, 29));
        }
        int i = 30;
        if (reader.m1295b() >= 42) {
            i = reader.ReadInt();
        }
        for (int i2 = 0; i2 < i; i2++) {
            int i3 = i2;
            m2755m(i3);
            if (i3 >= this.f3893g.length) {
                LoggerMaybe.m983b("Too many waypoints:" + i2);
                i3 = this.f3893g.length - 1;
            }
            if (this.f3893g[i3] == null) {
                this.f3893g[i3] = new C0305au();
            }
            this.f3893g[i3].m4231a(reader);
        }
        this.f3894O = (EnumC0205a) reader.m1293b(EnumC0205a.class);
        if (this.f3894O == EnumC0205a.outOfRange) {
            if (!mo2998I()) {
                this.f3894O = EnumC0205a.onlyInRange;
            }
            if (reader.m1295b() < 74) {
                this.f3894O = EnumC0205a.onlyInRange;
            }
        }
        long m1278n = reader.m1278n();
        this.f3897R = reader.m1285g();
        this.f3899T = reader.m1285g();
        this.f3902U = reader.m1285g();
        this.f3907k = reader.ReadBool();
        this.f3908l = reader.m1285g();
        this.f3909m = reader.m1285g();
        this.f3915s = reader.m1285g();
        m2909a(reader.m1276p());
        this.f3922ad = reader.ReadBool();
        this.f3923ae = reader.ReadBool();
        this.f3927ai = reader.ReadBool();
        this.f3928aj = reader.m1285g();
        this.f3929ak = reader.m1285g();
        this.f3930al = reader.m1285g();
        this.f3931am = reader.ReadInt();
        if (reader.m1295b() >= 18) {
            this.f3920ab = reader.ReadInt();
        }
        if (reader.m1295b() >= 21) {
            int ReadInt = reader.ReadInt();
            for (int i4 = 0; i4 < ReadInt; i4++) {
                m2759l(i4);
                if (this.f3938au[i4] == null) {
                    this.f3938au[i4] = new C0237af();
                }
                this.f3938au[i4].m4469a(reader);
            }
        } else {
            for (int i5 = 0; i5 < 60; i5++) {
                m2759l(i5);
                if (this.f3938au[i5] == null) {
                    this.f3938au[i5] = new C0237af();
                }
                this.f3938au[i5].m4469a(reader);
            }
        }
        this.f3939av = reader.ReadInt();
        this.f3941v = reader.ReadInt();
        byte m1289d = reader.m1289d();
        if (m1289d >= 1) {
            this.f3911o = reader.m1285g();
            this.f3912p = reader.m1285g();
        }
        if (m1289d >= 2) {
            this.f3890d = reader.m1285g();
            this.f3891e = reader.m1285g();
        }
        if (m1289d >= 3) {
            this.f3940u = reader.ReadBool();
        }
        if (m1289d >= 4) {
            this.f3926ah = reader.m1285g();
            this.f3910n = reader.ReadInt();
        }
        if (m1289d >= 5) {
            this.f3903V = reader.m1285g();
        }
        if (m1289d >= 6) {
            this.f3934ap = reader.m1285g();
            this.f3935aq = reader.ReadBool();
            this.f3936ar = reader.ReadBool();
        }
        if (m1289d >= 7) {
            this.f3925ag = reader.m1270v();
        }
        if (m1289d >= 8) {
            this.f3919aa = reader.m1285g();
        }
        if (m1289d >= 9) {
            this.f3942w = reader.ReadInt();
        }
        if (m1289d >= 10) {
            this.f3904W = reader.m1285g();
        }
        if (m1289d >= 11) {
            this.f3945ay = reader.m1285g();
            this.f3946az = reader.m1285g();
        }
        if (m1289d >= 12) {
            C0552c.m3136a(this, reader);
        }
        super.mo2291a(reader);
        if (!this.f1607bT) {
            this.f3896Q = AbstractC1120w.m442a(m1278n, false);
            for (int i6 = 0; i6 < this.f3892f; i6++) {
                if (this.f3893g[i6] == null) {
                    LoggerMaybe.LogDebug2("readIn: convertUnitIds is null: " + i6 + " waypointsCount:" + this.f3892f);
                } else {
                    this.f3893g[i6].m4226c();
                }
            }
        }
        mo3303S();
        if (this.f1607bT) {
            this.f4232et = true;
        }
    }

    /* renamed from: b */
    public void m2838b(AbstractC0197n abstractC0197n) {
        super.m4411b(abstractC0197n);
        mo3303S();
    }

    /* renamed from: S */
    public void mo3303S() {
        this.f3885L = mo2989d();
        this.f3886M = mo2980k();
    }

    /* renamed from: h */
    public float m2773h(int i) {
        return 0.0f;
    }

    /* renamed from: i */
    public float m2769i(int i) {
        return 0.0f;
    }

    /* renamed from: T */
    public C0934e mo3235T() {
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v28, types: [android.graphics.Paint] */
    /* JADX WARN: Type inference failed for: r0v33, types: [android.graphics.Paint] */
    /* JADX WARN: Type inference failed for: r0v34, types: [android.graphics.Paint] */
    /* JADX WARN: Type inference failed for: r0v35, types: [android.graphics.Paint] */
    /* JADX WARN: Type inference failed for: r0v36, types: [android.graphics.Paint] */
    /* renamed from: a */
    public Paint m2928a(int i, ColorFilter colorFilter, boolean z) {
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
                this.f3954z = m2899a(true);
            }
            c0930ag = this.f3954z;
            i2 = this.f3955A;
            this.f3955A = i;
        } else {
            if (this.f3952x == null) {
                this.f3952x = m2899a(false);
            }
            c0930ag = this.f3952x;
            i2 = this.f3953y;
            this.f3953y = i;
        }
        if (i2 != i) {
            c0930ag.m5398b(i);
        }
        if (c0930ag.m5381h() != colorFilter) {
            c0930ag.m5417a(colorFilter);
        }
        return c0930ag;
    }

    /* renamed from: a */
    public static C0930ag m2899a(boolean z) {
        C0930ag c0930ag = new C0930ag();
        if (z) {
            c0930ag.mo894a(true);
            c0930ag.m5387d(true);
            c0930ag.m5395b(true);
        } else {
            c0930ag.mo894a(false);
            c0930ag.m5387d(false);
            c0930ag.m5395b(false);
        }
        return c0930ag;
    }

    public AbstractC0623y(boolean z) {
        super(z);
        this.f3892f = 0;
        this.f3893g = f3997N;
        this.f3894O = EnumC0205a.onlyInRange;
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
    public final void m2766j(int i) {
        int mo3084bl = mo3084bl();
        for (int i2 = 0; i2 < mo3084bl; i2++) {
            this.f1649cJ[i2].m4293a(i);
        }
    }

    /* renamed from: a */
    public void m2901a(String str) {
        String str2;
        if (mo5649r() != null) {
            str2 = mo5649r().mo4252i();
        } else {
            str2 = "<NO UNIT TYPE>";
        }
        LoggerMaybe.LogDebug2("(Unit log:" + str2 + " id:" + this.f6951ee + "): " + str);
    }

    /* renamed from: U */
    public void m2949U() {
        String str;
        if (mo5649r() != null) {
            str = mo5649r().mo4252i();
        } else {
            str = "<NO UNIT TYPE>";
        }
        LoggerMaybe.LogDebug2("---- Debug for:" + str + " id:" + this.f6951ee + "---");
    }

    /* renamed from: a */
    public void mo1718a(float f) {
        float mo3003D;
        float f2;
        float f3;
        super.mo1718a(f);
        LoggerMaybe m1072A = LoggerMaybe.m1072A();
        if (this.f3944ax) {
            this.f3944ax = false;
        }
        if (this.f1623cj != 0.0f) {
            this.f1623cj = C0758f.m2159a(this.f1623cj, f);
        }
        if (!this.f1607bT && m4396bS()) {
            if (this.f3945ay > 0.0f) {
                this.f3945ay = C0758f.m2159a(this.f3945ay, f);
            }
            if (this.f3946az > 0.0f) {
                this.f3946az = C0758f.m2159a(this.f3946az, f);
            }
            if (this.f3994bo != null) {
                C0552c.m3139a(this, f);
            }
            float f4 = this.f6957el;
            float f5 = this.f6958em;
            int mo3084bl = mo3084bl();
            for (int i = 0; i < mo3084bl; i++) {
                C0247ap c0247ap = this.f1649cJ[i];
                if (c0247ap.f1715d == 0.0f) {
                    float mo3095C = mo3095C(i);
                    if (mo3295b(i, f) && c0247ap.f1712a != mo3095C) {
                        if (C0758f.m2085c(C0758f.m2083c(c0247ap.f1712a, mo3095C, 360.0f)) < 0.5f) {
                            c0247ap.f1715d = 20.0f;
                            c0247ap.f1714c = 0.0f;
                        } else {
                            m2942a(f, mo3095C, i);
                        }
                    }
                } else {
                    c0247ap.f1715d = C0758f.m2159a(c0247ap.f1715d, f);
                }
            }
            if (!m2812bk()) {
                m2763k(f);
            }
            for (int i2 = 0; i2 < mo3084bl; i2++) {
                C0247ap c0247ap2 = this.f1649cJ[i2];
                if (c0247ap2.f1716e != 0.0f) {
                    c0247ap2.f1716e = C0758f.m2159a(c0247ap2.f1716e, f);
                }
            }
            boolean mo3219bi = mo3219bi();
            boolean z = (this.f1614ca == 0.0f && this.f1615cb == 0.0f) ? false : true;
            if ((this.f1617cd != 0.0f || z) && mo2998I()) {
                float f6 = this.f1618ce;
                float mo2976z = mo2976z();
                if (mo3218bj()) {
                    f6 = this.f1619cf;
                }
                if (!mo3219bi) {
                    float f7 = mo2976z * this.f1617cd * f;
                    f4 += C0758f.m2040i(f6) * f7;
                    f5 += C0758f.m2045h(f6) * f7 * m2872aZ();
                    if (z) {
                        f4 += this.f1614ca * f;
                        f5 += this.f1615cb * f * m2872aZ();
                        if (C0758f.m2157a(0.0f, 0.0f, this.f1614ca, this.f1615cb) > mo2976z * mo2976z) {
                            this.f1614ca = (float) (this.f1614ca - ((this.f1614ca * 0.05d) * f));
                            this.f1615cb = (float) (this.f1615cb - ((this.f1615cb * 0.05d) * f));
                        }
                        this.f1614ca = C0758f.m2158a(this.f1614ca, 0.0f, 0.5f * mo2976z * f);
                        this.f1615cb = C0758f.m2158a(this.f1615cb, 0.0f, 0.5f * mo2976z * f);
                    }
                } else {
                    if (this.f1617cd != 0.0f) {
                        mo3003D = mo3004C() * 1.41f;
                        f2 = C0758f.m2040i(f6) * mo2976z * this.f1617cd;
                        f3 = C0758f.m2045h(f6) * mo2976z * this.f1617cd;
                    } else {
                        mo3003D = mo3003D() * 1.41f;
                        f2 = 0.0f;
                        f3 = 0.0f;
                    }
                    float m2157a = C0758f.m2157a(this.f1614ca, this.f1615cb, f2, f3);
                    if (m2157a > mo2976z * mo2976z) {
                        this.f1614ca = (float) (this.f1614ca - ((this.f1614ca * 0.05d) * f));
                        this.f1615cb = (float) (this.f1615cb - ((this.f1615cb * 0.05d) * f));
                    }
                    float f8 = mo3003D * f;
                    if (m2157a < f8 * f8) {
                        this.f1614ca = f2;
                        this.f1615cb = f3;
                    } else {
                        float m2071d = C0758f.m2071d(this.f1614ca, this.f1615cb, f2, f3);
                        this.f1614ca += C0758f.m2040i(m2071d) * f8;
                        this.f1615cb += C0758f.m2045h(m2071d) * f8;
                    }
                    f4 += this.f1614ca * f;
                    f5 += this.f1615cb * f * m2872aZ();
                }
                this.f3944ax = true;
            }
            if (this.f1611bX != 0.0f || this.f1612bY != 0.0f) {
                this.f1611bX = C0758f.m2106b(this.f1611bX, -9.0f, 9.0f);
                this.f1612bY = C0758f.m2106b(this.f1612bY, -9.0f, 9.0f);
                f4 += this.f1611bX;
                f5 += this.f1612bY;
                this.f1612bY = 0.0f;
                this.f1611bX = 0.0f;
                this.f3944ax = true;
            }
            if (this.f3944ax && mo2998I() && this.f1652cM == null) {
                m2932a(f, m1072A, f4, f5);
            }
            if (this.f3943aw) {
                this.f3943aw = false;
                m2791c(false);
                this.f3944ax = true;
            }
        }
    }

    /* renamed from: a */
    private void m2932a(float f, LoggerMaybe loggerMaybe, float f2, float f3) {
        C0173b c0173b = loggerMaybe.f6110bL;
        float f4 = c0173b.f789r;
        float f5 = c0173b.f790s;
        float f6 = this.f6957el * f4;
        float f7 = this.f6958em * f5;
        float f8 = f2 * f4;
        float f9 = f3 * f5;
        PointF pointF = null;
        boolean z = false;
        int m2065e = C0758f.m2065e(f6);
        int m2065e2 = C0758f.m2065e(f7);
        int m2065e3 = C0758f.m2065e(f8);
        int m2065e4 = C0758f.m2065e(f9);
        if ((m2065e != m2065e3 || m2065e2 != m2065e4) && this.f1623cj == 0.0f && loggerMaybe.f6119bU.m1151a(mo2982h(), m2065e3, m2065e4)) {
            if (m2065e != m2065e3 && m2065e2 != m2065e4) {
                boolean m1151a = loggerMaybe.f6119bU.m1151a(mo2982h(), m2065e, m2065e4);
                boolean m1151a2 = loggerMaybe.f6119bU.m1151a(mo2982h(), m2065e3, m2065e2);
                if (m1151a && m1151a2) {
                    z = true;
                    f3951aF.m5369a(f6, f7);
                    pointF = f3951aF;
                }
                if (pointF == null && m1151a) {
                    pointF = C0248aq.m4289a(mo2982h(), f6, f7, f8, f9, m2065e, m2065e4, false);
                }
                if (pointF == null && m1151a2) {
                    pointF = C0248aq.m4289a(mo2982h(), f6, f7, f8, f9, m2065e3, m2065e2, false);
                }
            }
            if (pointF == null) {
                pointF = C0248aq.m4289a(mo2982h(), f6, f7, f8, f9, m2065e3, m2065e4, false);
            }
            if (pointF == null) {
                z = true;
                f3951aF.m5369a(f6, f7);
                pointF = f3951aF;
            }
        }
        boolean z2 = false;
        if (pointF != null) {
            boolean z3 = false;
            if (loggerMaybe.f6119bU.m1151a(mo2982h(), m2065e, m2065e2) && !loggerMaybe.f6119bU.m1138b(mo2982h(), m2065e3, m2065e4)) {
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
            int m2065e5 = C0758f.m2065e(f2 * f4);
            int m2065e6 = C0758f.m2065e(f3 * f5);
            this.f6957el = f2;
            this.f6958em = f3;
            if (m2065e != m2065e5 || m2065e2 != m2065e6) {
                m2791c(true);
            }
        }
    }

    /* renamed from: b */
    public void m2843b(float f, float f2) {
        C0173b c0173b = LoggerMaybe.m1072A().f6110bL;
        float f3 = c0173b.f789r;
        float f4 = c0173b.f790s;
        int m2065e = C0758f.m2065e(this.f6957el * f3);
        int m2065e2 = C0758f.m2065e(this.f6958em * f4);
        int m2065e3 = C0758f.m2065e(f * f3);
        int m2065e4 = C0758f.m2065e(f2 * f4);
        this.f6957el = f;
        this.f6958em = f2;
        if (m2065e != m2065e3 || m2065e2 != m2065e4) {
            m2791c(true);
        }
    }

    /* renamed from: com.corrodinggames.rts.game.units.y$1 */
    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/y$1.class */
    final class C06241 extends AbstractC0545j {
        C06241() {
        }

        public void callback(AbstractC0623y abstractC0623y, float f, AbstractC0244am abstractC0244am) {
            AbstractC0623y.m2907a(abstractC0623y, abstractC0244am, f, true);
        }
    }

    /* renamed from: g */
    public static void m2779g(float f) {
        int i;
        float f2;
        LoggerMaybe m1072A = LoggerMaybe.m1072A();
        AbstractC0244am[] m498a = AbstractC0244am.f1590bD.m498a();
        int size = AbstractC0244am.f1590bD.size();
        m1072A.f6128cd.m2384a(EnumC0729bm.update_do_all_collisions);
        int i2 = m1072A.f6102by;
        for (int i3 = 0; i3 < size; i3++) {
            if (m498a[i3] instanceof AbstractC0623y) {
                AbstractC0623y abstractC0623y = (AbstractC0623y) m498a[i3];
                if ((abstractC0623y.f3944ax || abstractC0623y.f1613bZ) && abstractC0623y.mo2998I() && abstractC0623y.f3964aK <= i2) {
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
                    m1072A.f6127cc.m3151b(abstractC0623y.f6957el, abstractC0623y.f6958em, f2, f3965aL);
                    AbstractC0244am[] m498a2 = f3965aL.m498a();
                    int i4 = f3965aL.f6922b;
                    for (int i5 = 0; i5 < i4; i5++) {
                        abstractC0623y.m2919a(m498a2[i5], f, true);
                    }
                    if (abstractC0623y.f3961aH > 9 && abstractC0623y.f1585by > i2 - 400) {
                        abstractC0623y.f3964aK = m1072A.f6102by + 5 + (i3 % 5);
                        abstractC0623y.f1613bZ = true;
                    }
                }
            }
        }
        m1072A.f6128cd.m2379b(EnumC0729bm.update_do_all_collisions);
        m1072A.f6128cd.m2384a(EnumC0729bm.update_do_all_collisions2);
        for (int i6 = 0; i6 < size; i6++) {
            if (m498a[i6] instanceof AbstractC0623y) {
                AbstractC0623y abstractC0623y2 = (AbstractC0623y) m498a[i6];
                if (abstractC0623y2.f3944ax && (i = abstractC0623y2.f3961aH) > 0 && abstractC0623y2.mo2998I()) {
                    if (!abstractC0623y2.f1613bZ) {
                        abstractC0623y2.f1613bZ = true;
                    }
                    for (int i7 = 0; i7 < i; i7++) {
                        abstractC0623y2.m2919a(abstractC0623y2.f3962aI[i7], f, false);
                    }
                }
            }
        }
        m1072A.f6128cd.m2379b(EnumC0729bm.update_do_all_collisions2);
    }

    /* renamed from: a */
    private void m2919a(AbstractC0244am abstractC0244am, float f, boolean z) {
        C0305au m2853ar;
        C0305au m2853ar2;
        if (abstractC0244am != this && abstractC0244am.f1606bS && this.f1606bS && mo2981i() == abstractC0244am.mo2981i() && mo2995Q() == abstractC0244am.mo2995Q() && abstractC0244am.f1651cL == null && this.f1651cL == null && this.f1603bP != abstractC0244am && abstractC0244am.f1603bP != this) {
            float f2 = this.f6957el + this.f1611bX;
            float f3 = this.f6958em + this.f1612bY;
            float f4 = abstractC0244am.f6957el + abstractC0244am.f1611bX;
            float f5 = abstractC0244am.f6958em + abstractC0244am.f1612bY;
            float m2157a = C0758f.m2157a(f2, f3, f4, f5);
            float f6 = this.f1621ch + abstractC0244am.f1621ch;
            if (z) {
                float f7 = m2157a;
                if (m2157a < f6 * f6) {
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
            } else if (m2157a < f6 * f6 && !abstractC0244am.m4426a(this, f) && !m4426a(abstractC0244am, f)) {
                float m2071d = C0758f.m2071d(f2, f3, f4, f5);
                float sqrt = (f6 - ((float) Math.sqrt(m2157a))) + 0.001f;
                if (sqrt <= 0.0f) {
                    return;
                }
                int s = m4302s(abstractC0244am);
                int m4302s = abstractC0244am.m4302s(this);
                int i5 = s > m4302s ? s : m4302s;
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
                float bN = mo3075bN();
                float mo3075bN = abstractC0244am.mo3075bN();
                if (this.f1609bV == abstractC0244am.f1609bV) {
                    boolean z2 = false;
                    float f11 = 1.7f;
                    if (abstractC0244am instanceof AbstractC0623y) {
                        AbstractC0623y abstractC0623y2 = (AbstractC0623y) abstractC0244am;
                        f11 = (this.f3903V > 200.0f || abstractC0623y2.f3903V > 200.0f) ? 5.0f : 5.0f;
                        if (this.f3921ac == abstractC0623y2) {
                            mo3075bN *= f11;
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
                                mo3075bN *= f11;
                            } else if (this.f3889c == 0.0f && abstractC0623y2.f3889c != 0.0f) {
                                bN *= f11;
                            } else if (abstractC0623y2.f3889c == 0.0f && this.f3889c != 0.0f) {
                                mo3075bN *= f11;
                            }
                        }
                    }
                }
                if (abstractC0244am instanceof AbstractC0621w) {
                    f10 = bN / (bN + mo3075bN);
                }
                float f12 = 1.0f - f10;
                float m2040i = C0758f.m2040i(m2071d);
                float m2045h = C0758f.m2045h(m2071d);
                if (abstractC0244am instanceof AbstractC0621w) {
                    float f13 = f9 * f10;
                    abstractC0244am.f1611bX += m2040i * f13;
                    abstractC0244am.f1612bY += m2045h * f13;
                }
                float f14 = f9 * f12;
                this.f1611bX -= m2040i * f14;
                this.f1612bY -= m2045h * f14;
                LoggerMaybe m1072A = LoggerMaybe.m1072A();
                this.f3917Y = abstractC0244am;
                this.f3918Z = m1072A.f6239bx;
                if (abstractC0244am instanceof AbstractC0623y) {
                    AbstractC0623y abstractC0623y3 = (AbstractC0623y) abstractC0244am;
                    abstractC0623y3.f3917Y = this;
                    abstractC0623y3.f3918Z = m1072A.f6239bx;
                }
                if (abstractC0244am instanceof AbstractC0623y) {
                    AbstractC0623y abstractC0623y4 = (AbstractC0623y) abstractC0244am;
                    if (this.f3920ab != 0 && this.f3920ab == abstractC0623y4.f3920ab) {
                        if (m2853ar() == null && (m2853ar2 = abstractC0623y4.m2853ar()) != null && (m2853ar2.f1797a == EnumC0306av.move || m2853ar2.f1797a == EnumC0306av.attackMove)) {
                            abstractC0623y4.m2846ay();
                        }
                        if (abstractC0623y4.m2853ar() == null && (m2853ar = abstractC0623y4.m2853ar()) != null) {
                            if (m2853ar.f1797a == EnumC0306av.move || m2853ar.f1797a == EnumC0306av.attackMove) {
                                m2846ay();
                            }
                        }
                    }
                }
            }
        }
    }

    /* renamed from: V */
    public int mo3273V() {
        return 1;
    }

    /* renamed from: a */
    public void mo3174a(int i) {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: W */
    public void m2947W() {
        LoggerMaybe m1072A = LoggerMaybe.m1072A();
        if (this.f1609bV == m1072A.f6099bs) {
            m1072A.f6117bS.f5114f.m1899b(this);
        }
    }

    /* renamed from: b */
    public float m2842b(float f, float f2, float f3) {
        if (mo3002E()) {
            if (m4402bI()) {
                return 0.0f;
            }
            return m2796c(f, C0758f.m2071d(this.f6957el, this.f6958em, f2, f3));
        } else if (mo3084bl() < 1) {
            return 0.0f;
        } else {
            int m2878aT = m2878aT();
            if (m2878aT == -1) {
                m2878aT = 0;
            }
            PointF mo3089G = mo3089G(m2878aT);
            float m2071d = C0758f.m2071d(mo3089G.f227a, mo3089G.f228b, f2, f3);
            this.f1649cJ[m2878aT].m4293a(70);
            return m2942a(f, m2071d, m2878aT);
        }
    }

    /* renamed from: c */
    public float m2796c(float f, float f2) {
        boolean z = false;
        boolean z2 = false;
        if (this.f1620cg && m2821bb()) {
            z = true;
            z2 = true;
        }
        return m2939a(f, f2, z, z2);
    }

    /* renamed from: h */
    public void m2775h(float f) {
        float m2083c = C0758f.m2083c(this.f1618ce, f, 360.0f);
        if (C0758f.m2085c(m2083c) > 0.01d) {
            mo3215i(m2083c);
        }
    }

    /* renamed from: a */
    public float m2939a(float f, float f2, boolean z, boolean z2) {
        this.f1619cf = f2;
        if (C0758f.m2085c(this.f1618ce - f2) < 0.01f) {
            if (z && this.f1620cg) {
                m2766j(25);
                this.f1620cg = false;
                return 0.0f;
            }
            return 0.0f;
        }
        float m2083c = C0758f.m2083c(this.f1618ce, f2, 360.0f);
        if (z) {
            if (z2 && C0758f.m2085c(m2083c) > 100.0f) {
                m2083c = C0758f.m2083c(this.f1618ce, f2 + 180.0f, 360.0f);
                if (!this.f1620cg) {
                    m2766j(25);
                    this.f1620cg = true;
                }
            } else if (this.f1620cg) {
                m2766j(25);
                this.f1620cg = false;
            }
        }
        if (C0758f.m2085c(m2083c) < 0.01f) {
            return 0.0f;
        }
        if (this.f3945ay <= 0.0f) {
            float mo3005B = mo3005B();
            if (mo3005B <= 0.0f) {
                float mo3006A = (m2083c > 0.0f ? 1.0f : -1.0f) * mo3006A() * f;
                if (C0758f.m2085c(mo3006A) > C0758f.m2085c(m2083c)) {
                    mo3006A = m2083c;
                }
                mo3215i(mo3006A);
            } else {
                float f3 = m2083c > 0.0f ? 1.0f : -1.0f;
                if (C0758f.m2085c(m2083c) < C0758f.m2085c(this.f1616cc) / mo3005B) {
                    this.f1616cc = C0758f.m2158a(this.f1616cc, f3 * mo3005B, mo3005B * f);
                } else {
                    this.f1616cc = C0758f.m2158a(this.f1616cc, f3 * mo3006A(), mo3005B * f);
                }
                float f4 = this.f1616cc * f;
                if (C0758f.m2085c(f4) > C0758f.m2085c(m2083c)) {
                    this.f1616cc = 0.0f;
                    f4 = m2083c;
                }
                mo3215i(f4);
            }
        }
        return m2083c;
    }

    /* renamed from: i */
    public void mo3215i(float f) {
        this.f1618ce += f;
        if (this.f1618ce > 180.0f) {
            this.f1618ce -= 360.0f;
        }
        if (this.f1618ce < -180.0f) {
            this.f1618ce += 360.0f;
        }
        if (mo4207bm()) {
            int mo3084bl = mo3084bl();
            for (int i = 0; i < mo3084bl; i++) {
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
    public void m2767j(float f) {
        int mo3084bl = mo3084bl();
        for (int i = 0; i < mo3084bl; i++) {
            this.f1649cJ[i].f1712a = f + m2972B(i);
        }
    }

    /* renamed from: a */
    public void m2930a(int i, float f) {
        this.f1649cJ[i].f1712a += f;
    }

    /* renamed from: a */
    public float m2942a(float f, float f2, int i) {
        float f3;
        C0247ap c0247ap = this.f1649cJ[i];
        float m2083c = C0758f.m2083c(c0247ap.f1712a, f2, 360.0f);
        if (m2083c == 0.0f) {
            return m2083c;
        }
        float mo3059w = mo3059w(i);
        if (mo3059w <= 0.0f) {
            float m2083c2 = C0758f.m2083c(c0247ap.f1712a, f2, mo2991c(i) * f);
            m2930a(i, m2083c2);
            f3 = m2083c - m2083c2;
        } else {
            float mo4196y = mo4196y(i);
            float f4 = m2083c > 0.0f ? 1.0f : -1.0f;
            float m2085c = C0758f.m2085c(c0247ap.f1714c) / mo4196y;
            boolean z = ((m2083c > 0.0f ? 1 : (m2083c == 0.0f ? 0 : -1)) > 0) == ((c0247ap.f1714c > 0.0f ? 1 : (c0247ap.f1714c == 0.0f ? 0 : -1)) > 0);
            if (C0758f.m2085c(m2083c) < m2085c && z) {
                c0247ap.f1714c = C0758f.m2158a(c0247ap.f1714c, f4 * mo4196y, mo4196y * f);
            } else {
                c0247ap.f1714c = C0758f.m2158a(c0247ap.f1714c, f4 * mo2991c(i), mo3059w * f);
            }
            float f5 = c0247ap.f1714c * f;
            if (C0758f.m2085c(f5) > C0758f.m2085c(m2083c)) {
                c0247ap.f1714c = 0.0f;
                f5 = m2083c;
            }
            m2930a(i, f5);
            f3 = m2083c - f5;
        }
        return f3;
    }

    /* renamed from: X */
    public AbstractC0244am m2946X() {
        C0305au m2853ar;
        if (this.f3900h && (m2853ar = m2853ar()) != null) {
            if ((m2853ar.f1797a == EnumC0306av.repair || m2853ar.f1797a == EnumC0306av.reclaim) && m2853ar.f1801h != null && !m2853ar.f1801h.f1607bT) {
                return m2853ar.f1801h;
            }
            return null;
        }
        return null;
    }

    /* renamed from: Y */
    public boolean m2945Y() {
        C0305au m2853ar = m2853ar();
        if (m2853ar != null && m2853ar.f1797a == EnumC0306av.reclaim) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    private void m2934a(float f, C0305au c0305au, C0235ad c0235ad) {
        if (c0305au.f1799c == null) {
            m2846ay();
            c0305au = null;
        }
        if (c0305au != null) {
            if (c0305au.f1797a == EnumC0306av.triggerActionWhenInRange) {
            }
            if (1 != 0) {
                AbstractC0224s a = m4427a(c0305au.f1799c);
                m2949U();
                if (a == null) {
                    m2901a("Failed to find action:" + c0305au.f1799c.m4537a());
                } else {
                    mo3116a(a, false, new PointF(c0305au.f1806e, c0305au.f1807f), c0305au.f1801h);
                }
                m2846ay();
            }
        }
    }

    /* renamed from: b */
    private void m2841b(float f, C0305au c0305au, C0235ad c0235ad) {
        AbstractC0244am m4212i = c0305au.m4212i();
        if (m4212i != null) {
            this.f3896Q = m4212i;
            if (this.f3898S > 5.0f) {
                this.f3898S = 5.0f;
            }
        }
        m2846ay();
    }

    /* renamed from: c */
    private void m2795c(float f, C0305au c0305au, C0235ad c0235ad) {
        float f2;
        AbstractC0244am m2946X;
        C0305au m2856ao;
        C0305au m2856ao2;
        float m4216g = c0305au.m4216g();
        float m4214h = c0305au.m4214h();
        float m2157a = C0758f.m2157a(this.f6957el, this.f6958em, m4216g, m4214h);
        boolean z = c0305au.f1797a == EnumC0306av.guard || c0305au.f1797a == EnumC0306av.follow;
        boolean z2 = c0305au.f1797a == EnumC0306av.guard;
        AbstractC0244am abstractC0244am = c0305au.f1801h;
        if (z) {
            if (abstractC0244am == null || abstractC0244am.f1607bT) {
                m2846ay();
                c0305au = null;
            }
            if (c0305au != null && abstractC0244am != null && !abstractC0244am.m4353cf() && this.f1609bV.m4599c(abstractC0244am.f1609bV)) {
                m2846ay();
                c0305au = null;
            }
        }
        if (c0305au != null) {
            boolean z3 = false;
            float f3 = this.f1621ch;
            if (z) {
                f3 += abstractC0244am.f1621ch;
            }
            if (c0305au.f1797a == EnumC0306av.follow) {
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
            if (m2157a > f2 * f2) {
                this.f3907k = true;
                this.f3908l = m4216g;
                this.f3909m = m4214h;
                this.f3910n = 2;
                if (this.f3915s > 90.0f) {
                    this.f3915s = 90.0f;
                }
                this.f3914r = 18;
                if (this.f3921ac != null && !this.f3921ac.m4396bS()) {
                    c0235ad.f1521d = false;
                }
            } else {
                this.f3942w = 0;
            }
            c0235ad.f1521d = false;
            if (0 == 0 && this.f3896Q != null && !this.f3896Q.f1607bT) {
                boolean z4 = false;
                if (m2835b(this.f3896Q, false)) {
                    z4 = true;
                }
                if (z4) {
                    float m2157a2 = C0758f.m2157a(this.f6957el, this.f6958em, this.f3896Q.f6957el, this.f3896Q.f6958em);
                    float m2749o = m2749o(this.f3896Q);
                    boolean z5 = false;
                    boolean z6 = false;
                    if (m2157a2 < m2749o * m2749o) {
                        z6 = true;
                    }
                    if (z6 && !m2870aa()) {
                        z6 = false;
                    }
                    if (m2157a < 22500.0f) {
                        this.f3942w = 0;
                    }
                    if (!z6 && (this.f3942w == 1 || m2157a > 122500.0f)) {
                        z5 = true;
                        this.f3942w = 1;
                    }
                    if (m2157a > 302500.0f || (this.f3942w == 1 && m2157a > 202500.0f)) {
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
                            this.f3908l = this.f3896Q.f6957el;
                            this.f3909m = this.f3896Q.f6958em;
                            this.f3910n = 0;
                            this.f3906j = true;
                        }
                    }
                }
            }
            if (z2 && !z3) {
                AbstractC0244am m4304q = abstractC0244am.m4304q(2.0f);
                if (m4304q != null && !m2835b(m4304q, true)) {
                    m4304q = null;
                }
                if (m4304q == null && this.f3942w != 1) {
                    m4304q = m4304q(2.0f);
                    if (m4304q != null && !m2835b(m4304q, true)) {
                        m4304q = null;
                    }
                }
                if (m4304q != null) {
                    z3 = true;
                    if (this.f3915s > 90.0f) {
                        this.f3915s = 90.0f;
                    }
                    this.f3907k = true;
                    this.f3908l = m4304q.f6957el;
                    this.f3909m = m4304q.f6958em;
                    this.f3910n = 0;
                    this.f3906j = true;
                }
            }
            if (z2 && !z3 && mo3087a(abstractC0244am) && ((abstractC0244am.f1632cs < abstractC0244am.f1633ct || abstractC0244am.f1624ck < 1.0f) && mo3087a(abstractC0244am) && (m2856ao2 = m2856ao()) != null)) {
                m2856ao2.m4228b(abstractC0244am);
                m2856ao2.f1804m = true;
                z3 = true;
                if (this.f3915s > 20.0f) {
                    this.f3915s = 20.0f;
                }
            }
            if (z2 && !z3 && m2860ak() && (abstractC0244am instanceof AbstractC0623y) && (m2946X = ((AbstractC0623y) abstractC0244am).m2946X()) != null && mo3087a(m2946X) && (m2856ao = m2856ao()) != null) {
                m2856ao.m4228b(m2946X);
                m2856ao.f1804m = true;
                if (this.f3915s > 20.0f) {
                    this.f3915s = 20.0f;
                }
            }
        }
    }

    /* renamed from: d */
    private void m2788d(float f, C0305au c0305au, C0235ad c0235ad) {
        float m4216g = c0305au.m4216g();
        float m4214h = c0305au.m4214h();
        float m2157a = C0758f.m2157a(this.f6957el, this.f6958em, m4216g, m4214h);
        if (c0305au.f1801h == null || c0305au.f1801h.f1607bT) {
            m2846ay();
            c0305au = null;
        }
        if (c0305au != null) {
            boolean z = false;
            if (c0305au.f1801h.m4402bI()) {
                if (m2157a < 961.0f) {
                    this.f3905X += f;
                }
                if (this.f3905X > 240.0f) {
                    z = true;
                }
                float f2 = 21.0f;
                if (c0305au.f1801h.m4357cb().m5366a()) {
                    f2 = 11.0f;
                }
                if (this.f3888b > 0.0f) {
                    f2 = c0305au.f1801h.f1621ch + this.f1621ch + 31.0f;
                }
                if (m2157a < f2 * f2) {
                    z = true;
                }
            } else {
                float f3 = c0305au.f1801h.f1621ch + this.f1621ch + 5.0f;
                if (m2157a < f3 * f3) {
                    z = true;
                }
            }
            if (!z) {
                this.f3907k = true;
                this.f3908l = m4216g;
                this.f3909m = m4214h;
                this.f3910n = 0;
                if (c0305au.f1801h.m4402bI()) {
                    Rect m4357cb = c0305au.f1801h.m4357cb();
                    this.f3910n = C0758f.m2080c(m4357cb.m5358c() / 2, m4357cb.m5362b() / 2) + 1;
                }
                if (this.f3915s > 90.0f) {
                    this.f3915s = 90.0f;
                }
                this.f3914r = 18;
                if (m2157a < 48400.0f) {
                    c0235ad.f1521d = false;
                    if (this.f3915s > 0.0f && m2893aE() == null) {
                        this.f3906j = true;
                    }
                }
                if (this.f3921ac != null && !this.f3921ac.m4396bS()) {
                    c0235ad.f1521d = false;
                }
            }
            if (z) {
                m4423a(EnumC0347ae.f2180i, c0305au.f1801h);
                m2846ay();
            }
        }
    }

    /* renamed from: e */
    private void m2784e(float f, C0305au c0305au, C0235ad c0235ad) {
        float m4216g = c0305au.m4216g();
        float m4214h = c0305au.m4214h();
        float m2157a = C0758f.m2157a(this.f6957el, this.f6958em, m4216g, m4214h);
        if (c0305au.f1801h == null || c0305au.f1801h.f1607bT || !c0305au.f1801h.m4396bS()) {
            m2846ay();
            c0305au = null;
        }
        if (c0305au != null && !m4335d(c0305au.f1801h, false)) {
            m2846ay();
        }
        if (c0305au != null) {
            this.f1603bP = c0305au.f1801h;
            if (m2157a > 441.0f) {
                this.f3907k = true;
                this.f3908l = m4216g;
                this.f3909m = m4214h;
                if (this.f3915s > 90.0f) {
                    this.f3915s = 90.0f;
                }
                this.f3914r = 18;
                if (m2157a < 72900.0f) {
                    c0235ad.f1521d = false;
                    if (this.f3915s > 0.0f && this.f3973aT == null) {
                        this.f3906j = true;
                    }
                }
                if (this.f3921ac != null && !this.f3921ac.m4396bS()) {
                    c0235ad.f1521d = false;
                    return;
                }
                return;
            }
            m4317e(c0305au.f1801h, false);
            m2846ay();
        }
    }

    /* renamed from: a */
    private void m2933a(float f, C0305au c0305au, C0235ad c0235ad, boolean z) {
        C0305au m3277a;
        AbstractC0244am q;
        float m4216g = c0305au.m4216g();
        float m4214h = c0305au.m4214h();
        float m2157a = C0758f.m2157a(this.f6957el, this.f6958em, m4216g, m4214h);
        LoggerMaybe m1072A = LoggerMaybe.m1072A();
        if (!m2880aR()) {
            boolean z2 = false;
            C0399m dl = m4323dl();
            if (dl != null && dl.f2478H) {
                m2799bx();
                z2 = true;
            }
            if (!z2) {
                m2847ax();
                c0305au = null;
            }
        }
        float f2 = 7.0f;
        if (m2157a < 1681.0f) {
            this.f3905X += f;
        }
        if (this.f3905X > 240.0f) {
            f2 = 16.0f;
        }
        if (this.f3905X > 340.0f) {
            f2 = 36.0f;
        }
        if (c0305au != null && c0305au.f1797a == EnumC0306av.patrol) {
            if (m2849av() != 1) {
                f2 = 20.0f;
                float f3 = 30.0f;
                if (!z || this.f3918Z == m1072A.f6239bx || this.f3918Z == m1072A.f6239bx - 1) {
                    f3 = 70.0f;
                }
                if (m2157a < f3 * f3) {
                    m2786d(c0305au);
                    m2847ax();
                    c0305au = null;
                }
            } else {
                f2 = 30.0f;
                if (!z || this.f3918Z == m1072A.f6239bx || this.f3918Z == m1072A.f6239bx - 1) {
                    f2 = 80.0f;
                }
            }
        }
        if (c0305au != null) {
            if (m2157a < f2 * f2) {
                if (c0305au.f1797a == EnumC0306av.patrol) {
                    if (m2849av() == 1) {
                    }
                } else if (c0305au.f1797a == EnumC0306av.attackMove) {
                    boolean z3 = false;
                    if (this.f3896Q != null && !this.f3896Q.f1607bT && m2916a(this.f3896Q, false)) {
                        z3 = true;
                    }
                    if (!z3) {
                        m2847ax();
                        c0305au = null;
                    }
                } else {
                    m2847ax();
                    c0305au = null;
                }
            } else {
                this.f3907k = true;
                this.f3908l = m4216g;
                this.f3909m = m4214h;
                this.f3910n = 0;
                if (c0305au.f1797a == EnumC0306av.patrol) {
                    this.f3916t = true;
                    m2896aB();
                }
            }
        }
        if (c0305au != null) {
            if (c0305au.f1797a == EnumC0306av.attackMove || c0305au.f1797a == EnumC0306av.patrol) {
                if (this.f3896Q != null && !this.f3896Q.f1607bT && m2916a(this.f3896Q, false)) {
                    m2935a(f, this.f3896Q, c0235ad, true);
                }
                if (this.f3921ac != null && this.f3921ac.f3896Q != null) {
                    c0235ad.f1521d = false;
                }
            }
            if (c0305au.f1797a == EnumC0306av.patrol) {
                if (this.f3896Q == null && (q = m4304q(3.0f)) != null && m2835b(q, true)) {
                    if (this.f3915s > 90.0f) {
                        this.f3915s = 90.0f;
                    }
                    this.f3907k = true;
                    this.f3908l = q.f6957el;
                    this.f3909m = q.f6958em;
                    this.f3910n = 0;
                    this.f3906j = true;
                }
                if (m2860ak() && m1072A.f6239bx % 10 == this.f6951ee % 10 && (m3277a = C0510r.m3277a(this, f, 150.0f, true)) != null) {
                    m3277a.f1804m = false;
                    m3277a.f1809k = 200.0f;
                    this.f3907k = false;
                    m2890aH();
                }
            }
        }
    }

    /* renamed from: f */
    private void m2782f(float f, C0305au c0305au, C0235ad c0235ad) {
        boolean z;
        float m4216g = c0305au.m4216g();
        float m4214h = c0305au.m4214h();
        float m2157a = C0758f.m2157a(this.f6957el, this.f6958em, m4216g, m4214h);
        LoggerMaybe m1072A = LoggerMaybe.m1072A();
        InterfaceC0303as interfaceC0303as = c0305au.f1798b;
        if (interfaceC0303as == null) {
            m2901a("activeBuildingType==null, removing waypoint");
            m2846ay();
            c0305au = null;
        }
        if (c0305au != null) {
            float f2 = mo3082f(interfaceC0303as);
            boolean z2 = false;
            if (f2 <= 30.0f) {
            }
            if (f2 <= 25.0f && this.f6959en > 4.0f) {
                z2 = true;
            }
            if (this.f3921ac != null) {
                C0305au m2853ar = this.f3921ac.m2853ar();
                if (m2853ar == null || m2853ar.f1797a != EnumC0306av.build) {
                    c0235ad.f1521d = false;
                }
                if (m2853ar != null && !c0305au.m4227b(m2853ar)) {
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
                z = m2157a <= f2 * f2;
            }
            if (!z || z2) {
                if (!m2880aR()) {
                    m2846ay();
                    return;
                }
                this.f3907k = true;
                this.f3908l = m4216g;
                this.f3909m = m4214h;
                if (f2 > 58.0f) {
                    this.f3910n = (int) ((f2 - 41.0f) / (m1072A.f6110bL.f785n * 1.414f));
                }
                if (this.f3915s > 90.0f) {
                    this.f3915s = 90.0f;
                }
                if (this.f3913q > 3) {
                    m2846ay();
                }
            } else if (!z3) {
                if (!mo3109x() || C0758f.m2085c(m2842b(f, m4216g, m4214h)) <= 30.0f) {
                    C0625z m2911a = m2911a(c0305au, c0305au.f1798b, c0305au.f1800d, c0305au.f1806e, c0305au.f1807f);
                    AbstractC0244am abstractC0244am = null;
                    if (m2911a.f4000a != null) {
                        abstractC0244am = m2911a.f4000a;
                    } else if (m2911a.f4001b != null) {
                        abstractC0244am = m2911a.f4001b;
                    }
                    if (abstractC0244am != null) {
                        m2911a.f4003d.mo4503a(this, abstractC0244am);
                        if (mo3087a(abstractC0244am)) {
                            if (mo3113b(abstractC0244am) > 10000.0f) {
                                abstractC0244am.m4303r(1.0f);
                                m2847ax();
                            } else {
                                c0305au.m4220e();
                                c0305au.f1797a = EnumC0306av.repair;
                                c0305au.f1801h = abstractC0244am;
                                m2890aH();
                            }
                        } else {
                            m2846ay();
                        }
                        this.f3895P = -9999;
                        return;
                    }
                    if (c0305au.f1798b == null) {
                        LoggerMaybe.LogDebug2("active.build==null");
                    }
                    if (!m2911a.f4002c) {
                        m2846ay();
                    }
                }
            }
        }
    }

    /* renamed from: a */
    private void m2935a(float f, AbstractC0244am abstractC0244am, C0235ad c0235ad, boolean z) {
        EnumC0307b m2818be = m2818be();
        float f2 = abstractC0244am.f6957el;
        float f3 = abstractC0244am.f6958em;
        float m2157a = C0758f.m2157a(this.f6957el, this.f6958em, f2, f3);
        if (this.f3921ac != null) {
            if (m2157a < 490000.0f) {
                if (m2157a < 48400.0f) {
                    c0235ad.f1521d = false;
                }
                float m2157a2 = C0758f.m2157a(this.f3921ac.f6957el, this.f3921ac.f6958em, f2, f3);
                if (m2157a2 < 48400.0f) {
                    c0235ad.f1521d = false;
                }
                if (m2157a2 < 270400.0f && m2876aV()) {
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
        float m2749o = m2749o(abstractC0244am);
        boolean z2 = true;
        if (m2157a < m2749o * m2749o) {
            if (this.f3896Q != abstractC0244am) {
                if (C0248aq.m4287a(this, abstractC0244am)) {
                    this.f3896Q = abstractC0244am;
                    this.f3897R = 10.0f;
                    m2954M(-1);
                }
            } else {
                this.f3897R = 10.0f;
            }
            float f4 = m2749o;
            if (!mo3002E()) {
                f4 -= 1.0f;
                if (m2876aV()) {
                    f4 -= 2.0f;
                }
                if (mo2985e(0) > 5.0f) {
                    f4 -= 3.0f;
                }
            }
            if (m2157a < f4 * f4 && m2818be() != EnumC0307b.bomber) {
                if (abstractC0244am == null) {
                    z2 = false;
                } else if (m2768i(abstractC0244am)) {
                    z2 = false;
                    if (z) {
                        this.f3907k = false;
                    }
                } else if (!m2765j(abstractC0244am)) {
                    z2 = false;
                }
            }
        }
        if (z2) {
            this.f3907k = true;
            this.f3908l = f2;
            this.f3909m = f3;
            this.f3910n = 0;
            if (m2818be == EnumC0307b.bomber) {
                m2943a(m2157a, f2, f3);
            }
            this.f3910n = m2744q(abstractC0244am);
            if (this.f3915s > 90.0f) {
                this.f3915s = 90.0f;
            }
            if (m2157a < 810000.0f) {
                if (m4342cr() || m2876aV()) {
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
    private void m2778g(float f, C0305au c0305au, C0235ad c0235ad) {
        LoggerMaybe m1072A = LoggerMaybe.m1072A();
        if (m2818be() == EnumC0307b.bomber) {
            if (c0305au != null && ((c0305au.f1801h == null || c0305au.f1801h.f1607bT || c0305au.f1801h.f1609bV == this.f1609bV) && !this.f3936ar)) {
                if (this.f3896Q != null && this.f3896Q.f1607bT) {
                    this.f3896Q = null;
                }
                m2903a(m1072A, f, m2829b(true) + 200.0f);
                if (this.f3896Q != null) {
                    c0305au.f1801h = this.f3896Q;
                    m2896aB();
                    m2890aH();
                } else {
                    this.f3936ar = true;
                    this.f3935aq = true;
                }
            }
            if (c0305au != null && (c0305au.f1801h == null || c0305au.f1801h.f1607bT || c0305au.f1801h.f1609bV == this.f1609bV)) {
                if (c0305au.f1801h == null) {
                    m2846ay();
                    c0305au = null;
                } else if (!this.f3935aq) {
                    m2846ay();
                    c0305au = null;
                }
            }
        } else if (c0305au.f1801h == null || c0305au.f1801h.f1607bT || c0305au.f1801h.f1609bV == this.f1609bV) {
            boolean z = true;
            if (m2849av() > 1) {
                z = false;
            }
            c0305au.f1801h = null;
            if (z) {
                if (this.f3896Q != null && this.f3896Q.f1607bT) {
                    this.f3896Q = null;
                }
                m2903a(m1072A, f, m2829b(true));
                if (this.f3896Q != null) {
                    c0305au.f1801h = this.f3896Q;
                    m2896aB();
                    m2890aH();
                }
            }
            if (c0305au.f1801h == null) {
                m2846ay();
                c0305au = null;
            }
        }
        if (c0305au != null && c0305au.f1801h != null && !c0305au.f1801h.f1607bT && !c0305au.f1801h.m4353cf() && this.f1609bV.m4599c(c0305au.f1801h.f1609bV) && !C0248aq.m4285b(this, c0305au.f1801h)) {
            m2846ay();
            return;
        }
        if (c0305au != null && !m2880aR() && !mo2979l()) {
            m2846ay();
            c0305au = null;
        }
        if (c0305au != null) {
            m2935a(f, c0305au.f1801h, c0235ad, false);
        }
    }

    /* renamed from: h */
    private void m2774h(float f, C0305au c0305au, C0235ad c0235ad) {
        float m4216g = c0305au.m4216g();
        float m4214h = c0305au.m4214h();
        float m2157a = C0758f.m2157a(this.f6957el, this.f6958em, m4216g, m4214h);
        if (c0305au.f1801h == null || c0305au.f1801h.f1607bT) {
            m2846ay();
            c0305au = null;
        }
        if (c0305au != null && !c0305au.f1801h.m4335d(this, false)) {
            m2846ay();
        }
        if (c0305au != null) {
            this.f1603bP = c0305au.f1801h;
            boolean z = false;
            if (c0305au.f1801h.m4402bI()) {
                if (m2157a < 961.0f) {
                    this.f3905X += f;
                }
                if (this.f3905X > 240.0f) {
                    z = true;
                }
                float f2 = 21.0f;
                if (c0305au.f1801h.m4357cb().m5366a()) {
                    f2 = 11.0f;
                }
                if (this.f3888b > 0.0f) {
                    f2 = c0305au.f1801h.f1621ch + 31.0f;
                }
                if (m2157a < f2 * f2) {
                    z = true;
                }
            } else if (m2157a < 441.0f) {
                z = true;
            }
            if (!z) {
                this.f3907k = true;
                this.f3908l = m4216g;
                this.f3909m = m4214h;
                if (this.f3915s > 90.0f) {
                    this.f3915s = 90.0f;
                }
                this.f3914r = 18;
                if (m2157a < 48400.0f) {
                    c0235ad.f1521d = false;
                    if (this.f3915s > 0.0f && this.f3973aT == null) {
                        this.f3906j = true;
                    }
                }
                if (this.f3921ac != null && !this.f3921ac.m4396bS()) {
                    c0235ad.f1521d = false;
                }
            }
            if (z) {
                c0305au.f1801h.m4317e(this, false);
                m2846ay();
            }
        }
    }

    /* renamed from: a_ */
    public float m2871a_(AbstractC0244am abstractC0244am) {
        float mo4264D = abstractC0244am.mo5649r().mo4264D();
        if (abstractC0244am.mo3273V() == 2) {
            mo4264D *= 0.5f;
        }
        if (abstractC0244am.mo3273V() == 3) {
            mo4264D *= 0.25f;
        }
        return mo4264D * mo3113b(abstractC0244am);
    }

    /* renamed from: f */
    public float m2780f(AbstractC0244am abstractC0244am) {
        return 0.001f * 5.1f;
    }

    /* renamed from: g */
    public C0424b m2776g(AbstractC0244am abstractC0244am) {
        if (abstractC0244am.f1584bx != null) {
            return abstractC0244am.f1584bx;
        }
        return abstractC0244am.mo5649r().mo4266B();
    }

    /* renamed from: i */
    private void m2770i(float f, C0305au c0305au, C0235ad c0235ad) {
        int u;
        boolean x;
        LoggerMaybe m1072A = LoggerMaybe.m1072A();
        boolean z = false;
        boolean z2 = false;
        if (c0305au == null) {
            return;
        }
        float m4216g = c0305au.m4216g();
        float m4214h = c0305au.m4214h();
        float m2157a = C0758f.m2157a(this.f6957el, this.f6958em, m4216g, m4214h);
        if (c0305au != null && c0305au.f1797a == EnumC0306av.reclaim && c0305au.f1801h != null && c0305au.f1801h.mo3250g() > 0.0f) {
            z2 = true;
        }
        if (c0305au != null && (c0305au.f1801h == null || c0305au.f1801h.f1607bT || c0305au.f1801h.f1651cL != null)) {
            if (z2) {
                z = true;
            } else {
                m2847ax();
                c0305au = null;
            }
        }
        if (c0305au != null && !z && z2 && c0305au.f1801h != null) {
            boolean z3 = true;
            if (this.f3901i < m1072A.f6102by - 100) {
                z3 = false;
            }
            if (!mo3081g(c0305au.f1801h, z3)) {
                z = true;
            }
            if (!z) {
                this.f3901i = m1072A.f6102by;
            }
        }
        if (c0305au != null && z) {
            C0449h c0449h = null;
            if (c0305au.f1801h != null) {
                c0449h = c0305au.f1801h.m4365cQ();
            }
            AbstractC0244am m2908a = m2908a(this, c0305au.f1801h.f6957el, c0305au.f1801h.f6958em, m4364cR(), c0449h);
            if (m2908a != null) {
                c0305au.f1801h = m2908a;
                m4216g = c0305au.m4216g();
                m4214h = c0305au.m4214h();
                m2157a = C0758f.m2157a(this.f6957el, this.f6958em, m4216g, m4214h);
                m2896aB();
            } else {
                m2847ax();
                c0305au = null;
            }
        }
        if (c0305au != null) {
            if (c0305au.f1797a == EnumC0306av.repair) {
                if (!mo3087a(c0305au.f1801h)) {
                    m2846ay();
                    c0305au = null;
                }
            } else if (!z2 && !m2758l(c0305au.f1801h)) {
                m2846ay();
                c0305au = null;
            }
        }
        if (c0305au != null && c0305au.f1797a == EnumC0306av.repair && c0305au.f1801h != null && c0305au.f1801h.f1632cs >= c0305au.f1801h.f1633ct && c0305au.f1801h.f1624ck >= 1.0f) {
            m2847ax();
            c0305au = null;
        }
        if (c0305au != null && c0305au.f1801h == this) {
            m2846ay();
            c0305au = null;
        }
        if (c0305au != null && c0305au != null && c0305au.f1801h != null && c0305au.f1801h.mo3250g() != 0.0f) {
            boolean z4 = false;
            if (c0305au.f1797a == EnumC0306av.repair) {
                z4 = true;
            }
            if (z4) {
                m2846ay();
                c0305au = null;
            }
        }
        if (c0305au != null && c0305au.f1797a == EnumC0306av.reclaim && c0305au.f1801h.f1609bV != this.f1609bV && c0305au.f1801h.mo3250g() == 0.0f) {
            boolean z5 = true;
            if (m1072A.m1058O() && this.f1609bV.m4587d(c0305au.f1801h.f1609bV)) {
                z5 = false;
            }
            if (z5) {
                m2846ay();
                c0305au = null;
            }
        }
        if (c0305au != null) {
            if (c0305au.f1797a == EnumC0306av.reclaim) {
                u = mo3078v(c0305au.f1801h);
                x = m4300w(c0305au.f1801h);
            } else {
                u = mo3079u(c0305au.f1801h);
                x = m4299x(c0305au.f1801h);
            }
            if (this.f3921ac != null) {
                int i = u + 80;
                if (C0758f.m2157a(this.f3921ac.f6957el, this.f3921ac.f6958em, m4216g, m4214h) < i * i) {
                    c0235ad.f1521d = false;
                }
                C0305au m2853ar = this.f3921ac.m2853ar();
                if (m2853ar == null) {
                    c0235ad.f1521d = false;
                }
                if (m2853ar != null && !c0305au.m4227b(m2853ar)) {
                    c0235ad.f1521d = false;
                }
            }
            float f2 = u;
            if (this.f3900h) {
                f2 += 5.0f;
            }
            if (u <= 30) {
            }
            if (m2157a > f2 * f2) {
                if (!m2880aR() || c0305au.f1809k == 0.0f) {
                    m2846ay();
                    return;
                }
                boolean z6 = false;
                if (c0305au.f1809k >= 0.0f) {
                    if (c0305au.f1809k < C0758f.m2152a((int) m2157a) - f2) {
                        z6 = true;
                    }
                }
                if (z6) {
                    m2846ay();
                    return;
                }
                this.f3907k = true;
                this.f3908l = m4216g;
                this.f3909m = m4214h;
                if (u > 58) {
                    this.f3910n = (int) ((u - 41.0f) / (m1072A.f6110bL.f785n * 1.414f));
                } else {
                    this.f3910n = 0;
                }
                if (u < 30 || x) {
                    if (m2157a < 841.0f) {
                        this.f3906j = true;
                    }
                    float f3 = u + 14;
                    if (m2157a < f3 * f3 && this.f3915s > 0.0f && this.f3973aT == null) {
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
            int m2878aT = m2878aT();
            if (m2878aT == -1) {
                m2878aT = 0;
            }
            float f4 = 0.0f;
            if (mo3109x()) {
                f4 = m2842b(f, m4216g, m4214h);
            }
            boolean z7 = false;
            if (C0758f.m2085c(f4) < 30.0f || !mo3109x()) {
                this.f3900h = true;
                c0235ad.f1518a = true;
                C0247ap c0247ap = this.f1649cJ[m2878aT];
                if (c0247ap.f1717f < mo2985e(m2878aT)) {
                    c0247ap.f1717f += f;
                } else {
                    c0247ap.f1717f = mo2985e(m2878aT);
                    z7 = true;
                }
            }
            if (z7) {
                AbstractC0244am abstractC0244am = c0305au.f1801h;
                if (c0305au.f1797a != EnumC0306av.reclaim) {
                    if (abstractC0244am.f1624ck < 1.0f) {
                        m2825bC();
                        float m2871a_ = m2871a_(abstractC0244am);
                        float f5 = m2871a_ * f;
                        boolean z8 = false;
                        boolean z9 = false;
                        C0424b m2776g = m2776g(abstractC0244am);
                        if (m2776g != null) {
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
                            if (d2 > 0.0d && this.f1609bV.f1359al.m3828a(m2776g)) {
                                z10 = true;
                            }
                            if (!z10 && (d2 <= 0.0d || m2776g.m3920c(this, d2))) {
                                abstractC0244am.f1625cl = (float) (abstractC0244am.f1625cl + d2);
                            } else {
                                if (!z10) {
                                    this.f1609bV.f1359al.m3827a(m2776g, this, d2);
                                }
                                f5 = 0.0f;
                                z8 = false;
                                z9 = true;
                            }
                        }
                        if (!z9) {
                            m2920a(abstractC0244am, f, m2878aT);
                            float f6 = abstractC0244am.f1624ck + f5;
                            if (z8) {
                                f6 = 1.0f;
                            }
                            abstractC0244am.m4303r(f6);
                            if (f6 >= 1.0f && m2871a_ < 0.3d && abstractC0244am.f1609bV == m1072A.f6099bs) {
                                m1072A.f6117bS.f5114f.m1904a(abstractC0244am);
                            }
                            this.f3967aN = false;
                            return;
                        }
                        this.f3967aN = true;
                        return;
                    }
                    m2920a(abstractC0244am, f, m2878aT);
                    abstractC0244am.f1632cs += mo3112c(abstractC0244am) * f;
                    if (abstractC0244am.f1632cs > abstractC0244am.f1633ct) {
                        abstractC0244am.f1632cs = abstractC0244am.f1633ct;
                        m2846ay();
                    }
                    this.f3967aN = false;
                    return;
                }
                m2837b(abstractC0244am, f, m2878aT);
                this.f3967aN = false;
                m2825bC();
                boolean z11 = false;
                boolean y = m4298y(abstractC0244am);
                float z12 = m4297z(abstractC0244am);
                boolean z13 = c0305au.f1801h.mo3250g() > 0.0f;
                C0424b m2776g2 = m2776g(abstractC0244am);
                if (z13 || m2776g2 != null) {
                }
                boolean z14 = false;
                if (!z13 && this.f3902U < 100.0f && !z13) {
                    if (abstractC0244am.f1624ck < 0.5d) {
                        if (m2776g2 == null) {
                            z14 = true;
                        }
                    } else if (abstractC0244am.f1632cs / abstractC0244am.f1633ct < 0.5d) {
                        z14 = true;
                    }
                }
                if (!z14) {
                    if (abstractC0244am.f1624ck < 1.0f) {
                        float m2780f = m2780f(abstractC0244am) * f;
                        if (m2780f >= abstractC0244am.f1624ck) {
                            m2780f = abstractC0244am.f1624ck;
                            abstractC0244am.f1624ck = 0.0f;
                        } else {
                            abstractC0244am.f1624ck -= m2780f;
                        }
                        abstractC0244am.f1625cl = abstractC0244am.f1624ck;
                        if (m2776g2 != null) {
                            m2776g2.m3915a((AbstractC0244am) this, m2780f, true);
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
                            C0424b m4370cL = abstractC0244am.m4370cL();
                            C0424b m4369cM = abstractC0244am.m4369cM();
                            if (m4369cM != null) {
                                m4370cL = m4369cM;
                            }
                            if (z13 || m2776g2 != null) {
                            }
                            if (m4370cL.m3919a() > 0) {
                                this.f3919aa += f8 * m4370cL.m3919a();
                                if (this.f3919aa > 1.0f) {
                                    this.f1609bV.f1310o += (int) this.f3919aa;
                                    this.f3919aa -= (int) this.f3919aa;
                                }
                                m4370cL.m3915a((AbstractC0244am) this, f8, false);
                            } else {
                                m4370cL.m3915a((AbstractC0244am) this, f8, true);
                            }
                        }
                        if (abstractC0244am.f1632cs <= 0.0f) {
                            z11 = true;
                        }
                    }
                }
                if (z11 && !abstractC0244am.f1607bT) {
                    if (!y) {
                        C0424b m4369cM2 = abstractC0244am.m4369cM();
                        if (m4369cM2 != null) {
                            LoggerMaybe.LogDebug2("refund: " + m4369cM2.m3900a(false, true, 10, true));
                            m4369cM2.m3915a((AbstractC0244am) this, 1.0d, true);
                        } else {
                            C0424b m4370cL2 = abstractC0244am.m4370cL();
                            if (abstractC0244am.f1583bw != null) {
                                m4370cL2 = abstractC0244am.f1583bw;
                                LoggerMaybe.LogDebug2("refund==null overridePriceBuildCost: " + m4370cL2.m3900a(false, true, 10, true));
                            }
                            m4370cL2.m3915a((AbstractC0244am) this, 0.800000011920929d, true);
                            if (abstractC0244am.f1624ck >= 1.0f && m2776g2 != null) {
                                m2776g2.m3915a((AbstractC0244am) this, 0.800000011920929d, true);
                            }
                        }
                    }
                    abstractC0244am.f1607bT = true;
                    abstractC0244am.f1608bU = m1072A.f6102by;
                    abstractC0244am.m4351ch();
                    if ((abstractC0244am instanceof AbstractC0623y) && abstractC0244am.m4402bI()) {
                        m1072A.f6119bU.m1150a((AbstractC0623y) abstractC0244am);
                    }
                }
            }
        }
    }

    /* renamed from: k */
    public void m2763k(float f) {
        LoggerMaybe m1072A = LoggerMaybe.m1072A();
        if (this.f1603bP != null) {
            this.f1603bP = null;
        }
        if (this.f1604bQ != null) {
            this.f1605bR = C0758f.m2159a(this.f1605bR, f);
            this.f1603bP = this.f1604bQ;
            if (this.f1605bR == 0.0f) {
                this.f1604bQ = null;
            }
        }
        if (this.f3915s != 0.0f) {
            this.f3915s = C0758f.m2159a(this.f3915s, f);
        }
        if (this.f1617cd != 0.0f) {
            this.f3889c = C0758f.m2159a(this.f3889c, f);
        }
        C0305au m2853ar = m2853ar();
        this.f3906j = false;
        boolean z = this.f3907k;
        this.f3907k = false;
        this.f3916t = false;
        this.f3914r = 150;
        if (m2853ar != null && m2853ar.f1810l > 0.0f && m2853ar.f1810l < this.f3902U) {
            m2847ax();
            m2853ar = null;
        }
        C0235ad c0235ad = f3968aO;
        c0235ad.m4472a();
        if (m2853ar != null) {
            this.f3902U += f;
            EnumC0306av enumC0306av = m2853ar.f1797a;
            if (enumC0306av == EnumC0306av.move || enumC0306av == EnumC0306av.attackMove || enumC0306av == EnumC0306av.patrol) {
                m2933a(f, m2853ar, c0235ad, z);
            } else if (enumC0306av == EnumC0306av.attack) {
                m2778g(f, m2853ar, c0235ad);
            } else if (enumC0306av == EnumC0306av.build) {
                m2782f(f, m2853ar, c0235ad);
            } else if (enumC0306av == EnumC0306av.repair || enumC0306av == EnumC0306av.reclaim) {
                m2770i(f, m2853ar, c0235ad);
            } else if (enumC0306av == EnumC0306av.loadInto) {
                m2774h(f, m2853ar, c0235ad);
            } else if (enumC0306av == EnumC0306av.loadUp) {
                m2784e(f, m2853ar, c0235ad);
            } else if (enumC0306av == EnumC0306av.touchTarget) {
                m2788d(f, m2853ar, c0235ad);
            } else if (enumC0306av == EnumC0306av.guard || enumC0306av == EnumC0306av.guardAt || enumC0306av == EnumC0306av.follow) {
                m2795c(f, m2853ar, c0235ad);
            } else if (enumC0306av == EnumC0306av.triggerAction || enumC0306av == EnumC0306av.triggerActionWhenInRange) {
                m2934a(f, m2853ar, c0235ad);
            } else if (enumC0306av == EnumC0306av.setPassiveTarget) {
                m2841b(f, m2853ar, c0235ad);
            }
            if (m2853ar != m2853ar()) {
                m2853ar = null;
            }
        }
        this.f3900h = c0235ad.f1518a;
        if (m2853ar != null && m2853ar.f1804m && this.f3892f > 1) {
            boolean z2 = true;
            C0305au m2762k = m2762k(1);
            if (m2762k != null && (m2762k.f1797a == EnumC0306av.guard || m2762k.f1797a == EnumC0306av.patrol)) {
                z2 = false;
            }
            if (z2) {
                m2846ay();
                m2853ar = null;
            }
        }
        if (m2853ar == null) {
            this.f3907k = false;
        }
        if (this.f3907k) {
            C0399m dl = m4323dl();
            if (dl != null && dl.f2478H) {
                m2799bx();
            }
        } else if (this.f3913q != 0) {
            this.f3913q = (byte) 0;
        }
        m2830b(m1072A, f);
        m2902a(m1072A, f, m2853ar, c0235ad);
    }

    /* renamed from: a */
    private void m2943a(float f, float f2, float f3) {
        if (this.f3934ap < -900.0f) {
            this.f3934ap = C0758f.m2071d(this.f6957el, this.f6958em, f2, f3);
        }
        if (f < 10000.0f && mo3188bW()) {
            this.f3935aq = true;
        }
        if (this.f3935aq) {
            if (this.f1639cz < mo3294bd() * 0.6d || (f < 40000.0f && this.f1639cz < mo3294bd())) {
                this.f3908l += C0758f.m2040i(this.f3934ap + 180.0f) * 600.0f;
                this.f3909m += C0758f.m2045h(this.f3934ap + 180.0f) * 600.0f;
                return;
            }
            this.f3935aq = false;
            this.f3934ap = -999.0f;
            m2890aH();
        }
    }

    /* renamed from: a */
    private void m2937a(float f, C0237af c0237af, C0235ad c0235ad, C0305au c0305au) {
        C0237af m2750o;
        C0237af m2750o2;
        float f2;
        float f3;
        float f4;
        LoggerMaybe m1072A = LoggerMaybe.m1072A();
        AbstractC0623y abstractC0623y = this.f3921ac;
        float f5 = abstractC0623y.f6957el + this.f3928aj;
        float f6 = abstractC0623y.f6958em + this.f3929ak;
        int i = m1072A.f6102by - abstractC0623y.f3931am;
        float m2157a = C0758f.m2157a(this.f6957el, this.f6958em, f5, f6);
        if (i > 300 || this.f3888b > 1.0f) {
            this.f3890d += f;
        }
        boolean z = false;
        if (this.f3890d > 300.0f) {
            z = true;
        }
        if (i > 300 && m2157a > 250000.0f) {
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
            m2890aH();
            c0235ad.f1522e = f5;
            c0235ad.f1523f = f6;
            C0237af c0237af2 = null;
            if (i < 3000 && 0 == 0 && abstractC0623y.f3941v > 2 && abstractC0623y.f3941v - abstractC0623y.f3939av <= 2) {
                c0237af2 = abstractC0623y.m2750o(2);
            }
            if (i < 1500 && c0237af2 == null && abstractC0623y.f3941v > 0 && abstractC0623y.f3939av + 0 >= abstractC0623y.f3941v) {
                C0237af m2750o3 = abstractC0623y.m2750o(0);
                c0237af2 = f3975aV;
                float m2071d = C0758f.m2071d(abstractC0623y.f6957el, abstractC0623y.f6958em, m2750o3.f1528a, m2750o3.f1529b);
                float f7 = 80.0f;
                if (i > 300) {
                    f7 = 80.0f - ((i - 300) * 0.06666667f);
                }
                c0237af2.f1528a = abstractC0623y.f6957el + (C0758f.m2040i(m2071d) * f7);
                c0237af2.f1529b = abstractC0623y.f6958em + (C0758f.m2045h(m2071d) * f7);
            }
            if (c0237af2 != null) {
                c0235ad.f1520c = true;
                c0235ad.f1522e = c0237af2.f1528a + this.f3928aj;
                c0235ad.f1523f = c0237af2.f1529b + this.f3929ak;
            } else if (abstractC0623y.f3941v >= 2 && abstractC0623y.f3939av >= 1) {
                if (abstractC0623y.f3939av >= 2) {
                    m2750o = abstractC0623y.m2750o(0);
                    m2750o2 = abstractC0623y.m2750o(1);
                } else {
                    m2750o = abstractC0623y.m2750o(0);
                    m2750o2 = abstractC0623y.m2750o(0);
                }
                if (m2750o != null && m2750o2 != null) {
                    float m2082c = 1.0f - ((C0758f.m2082c(abstractC0623y.f6957el, abstractC0623y.f6958em, m2750o.f1528a, m2750o.f1529b) - 15.0f) * 0.05f);
                    if (m2082c > 2.0f) {
                        m2082c = 2.0f;
                    }
                    if (m2082c < 0.0f) {
                        m2082c = 0.0f;
                    }
                    if (m2082c > 1.0f) {
                        if (abstractC0623y.f3939av >= 3) {
                            C0237af m2750o4 = abstractC0623y.m2750o(2);
                            float f8 = m2750o2.f1528a - m2750o.f1528a;
                            float f9 = m2750o2.f1529b - m2750o.f1529b;
                            f2 = f8 + ((m2750o4.f1528a - m2750o2.f1528a) * (m2082c - 1.0f));
                            f3 = f9 + ((m2750o4.f1529b - m2750o2.f1529b) * (m2082c - 1.0f));
                        } else {
                            f2 = m2750o2.f1528a - m2750o.f1528a;
                            f3 = m2750o2.f1529b - m2750o.f1529b;
                        }
                    } else {
                        f2 = (m2750o2.f1528a - m2750o.f1528a) * m2082c;
                        f3 = (m2750o2.f1529b - m2750o.f1529b) * m2082c;
                    }
                    c0235ad.f1522e = m2750o.f1528a + this.f3928aj + f2;
                    c0235ad.f1523f = m2750o.f1529b + this.f3929ak + f3;
                }
            }
            float f10 = 45.0f;
            if (this.f3888b <= 1.0f) {
                f10 = 60.0f;
            } else if (i < 500 && this.f3888b <= 1.0f) {
                f10 = 110.0f;
            }
            if (m2157a < f10 * f10) {
                this.f3890d = 0.0f;
            }
            boolean z2 = false;
            C0305au m2853ar = abstractC0623y.m2853ar();
            if (m2853ar == null || c0305au != null) {
            }
            if (m2853ar == null || 0 != 0) {
                this.f3891e += f;
                boolean z3 = false;
                if (c0305au != null && (c0305au.f1797a == EnumC0306av.move || c0305au.f1797a == EnumC0306av.attackMove || c0305au.f1797a == EnumC0306av.patrol)) {
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
                if (m2157a < f4 * f4) {
                    z2 = true;
                }
                if (0 != 0) {
                    z2 = true;
                }
            }
            if (z2) {
                boolean z4 = false;
                if (m2853ar == null) {
                    z4 = true;
                }
                if (0 != 0) {
                    z4 = true;
                }
                if (z4 && C0758f.m2085c(m2796c(f, this.f3930al)) < 3.0f && c0305au != null) {
                    if (c0305au.f1797a == EnumC0306av.move || c0305au.f1797a == EnumC0306av.attackMove) {
                        m2846ay();
                        if (abstractC0623y != null) {
                            boolean z5 = false;
                            C0305au m2853ar2 = m2853ar();
                            C0305au m2853ar3 = abstractC0623y.m2853ar();
                            if (m2853ar2 != null && m2853ar3 != null && m2853ar2.m4227b(m2853ar3)) {
                                z5 = true;
                            }
                            if (!z5) {
                                m2909a((AbstractC0623y) null);
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
            c0237af3 = abstractC0623y.m2750o(8);
        }
        if (c0237af3 == null) {
            c0237af3 = f3975aV;
            c0237af3.f1528a = abstractC0623y.f6957el;
            c0237af3.f1529b = abstractC0623y.f6958em;
        }
        float m2157a2 = C0758f.m2157a(this.f6957el, this.f6958em, c0237af3.f1528a, c0237af3.f1529b);
        float f11 = this.f1621ch + abstractC0623y.f1621ch + 15.0f;
        float f12 = this.f1621ch + abstractC0623y.f1621ch + 100.0f;
        if (m2157a2 < f11 * f11) {
            this.f3890d = 0.0f;
            this.f3889c = 0.0f;
        } else if (m2157a2 < f12 * f12) {
        }
        if (this.f3973aT == null && c0237af != null && ((C0758f.m2085c(this.f3911o - c0237af3.f1528a) > 300.0f || C0758f.m2085c(this.f3912p - c0237af3.f1529b) > 300.0f) && this.f3915s > 30.0f)) {
            this.f3915s = 30.0f;
        }
        if (this.f3915s == 0.0f && this.f3973aT == null) {
            this.f3915s = 700.0f;
            m2941a(c0237af3.f1528a, c0237af3.f1529b, 0, false, false);
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
    private void m2902a(LoggerMaybe loggerMaybe, float f, C0305au c0305au, C0235ad c0235ad) {
        C0305au m2853ar;
        boolean mo2998I = mo2998I();
        if (this.f3973aT != null) {
            m2831b(loggerMaybe);
        }
        if (this.f3921ac != null && (this.f3921ac.f1607bT || !this.f3921ac.m4396bS())) {
            m2909a((AbstractC0623y) null);
        }
        if (this.f3907k) {
            C0237af m2893aE = m2893aE();
            C0305au m2853ar2 = m2853ar();
            if (m2853ar2 == null) {
                c0235ad.f1521d = false;
            }
            if (f3996K) {
                c0235ad.f1521d = false;
            }
            if (this.f3922ad && this.f3924af > 0 && m2891aG()) {
                this.f3931am = loggerMaybe.f6102by;
            }
            if (m2853ar2 != null && this.f3921ac != null && c0235ad.f1521d && (m2853ar = this.f3921ac.m2853ar()) != null && !m2853ar.m4227b(m2853ar2)) {
                c0235ad.f1521d = false;
            }
            if (this.f3921ac != null && c0235ad.f1521d) {
                m2937a(f, m2893aE, c0235ad, c0305au);
            } else if (this.f1623cj != 0.0f) {
                c0235ad.f1522e = this.f3908l;
                c0235ad.f1523f = this.f3909m;
                c0235ad.f1519b = true;
            } else {
                boolean z = false;
                if (this.f3973aT == null) {
                    if (m2893aE == null) {
                        if (this.f3940u && this.f3915s < 450.0f && this.f3973aT == null) {
                            z = true;
                        }
                        if (this.f3915s == 0.0f) {
                            z = true;
                        }
                    }
                    if (this.f3915s == 0.0f && (m4342cr() || m2876aV())) {
                        float mo2978m = mo2978m() - 1.0f;
                        if (C0758f.m2085c(this.f3911o - this.f3908l) > mo2978m || C0758f.m2085c(this.f3912p - this.f3909m) > mo2978m) {
                            z = true;
                        }
                    }
                    if (c0305au != null && this.f3915s == 0.0f && ((c0305au.f1797a == EnumC0306av.loadInto || c0305au.f1797a == EnumC0306av.loadUp) && (C0758f.m2085c(this.f3911o - this.f3908l) > 12.0f || C0758f.m2085c(this.f3912p - this.f3909m) > 12.0f))) {
                        z = true;
                    }
                    if (c0305au != null) {
                        float f2 = this.f3914r;
                        if (C0758f.m2085c(this.f3911o - this.f3908l) > f2 || C0758f.m2085c(this.f3912p - this.f3909m) > f2) {
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
                    m2941a(this.f3908l, this.f3909m, this.f3910n, this.f3922ad && this.f3925ag > 1, this.f3916t);
                }
                if (m2893aE != null && this.f3937at == null && this.f3939av >= 2 && mo2976z() > 5.0f) {
                    C0237af c0237af = this.f3938au[1];
                    float m2157a = C0758f.m2157a(this.f6957el, this.f6958em, m2893aE.f1528a, m2893aE.f1529b);
                    float m2157a2 = C0758f.m2157a(this.f6957el, this.f6958em, c0237af.f1528a, c0237af.f1529b);
                    if (m2157a < 36.0f) {
                        m2888aJ();
                        m2893aE = m2893aE();
                    } else if (m2157a2 < 361.0f) {
                        m2888aJ();
                        m2893aE = m2893aE();
                    }
                }
                if (m2893aE != null) {
                    c0235ad.f1522e = m2893aE.f1528a;
                    c0235ad.f1523f = m2893aE.f1529b;
                    c0235ad.f1519b = true;
                } else if (this.f3906j) {
                    c0235ad.f1522e = this.f3908l;
                    c0235ad.f1523f = this.f3909m;
                    c0235ad.f1519b = true;
                }
            }
        }
        m2938a(f, c0235ad, c0305au, mo2998I);
    }

    /* renamed from: a */
    private void m2938a(float f, C0235ad c0235ad, C0305au c0305au, boolean z) {
        float f2 = 0.0f;
        LoggerMaybe m1072A = LoggerMaybe.m1072A();
        if (this.f3907k && c0235ad.f1519b && z) {
            float f3 = c0235ad.f1522e;
            float f4 = c0235ad.f1523f;
            float mo2976z = mo2976z();
            float m2157a = C0758f.m2157a(this.f6957el, this.f6958em, f3, f4);
            float m2071d = C0758f.m2071d(this.f6957el, this.f6958em, f3, ((f4 - this.f6958em) * m2822ba()) + this.f6958em);
            boolean z2 = false;
            float mo3071bc = mo3071bc();
            if (mo3071bc > 0.95f) {
                z2 = true;
            } else if (mo3071bc > 0.87d) {
                if (this.f3925ag <= 1 && this.f3939av > 0 && this.f3939av <= 9 && this.f3922ad && m2157a < 250000.0f) {
                    z2 = true;
                }
            } else if (mo3071bc > 0.7d) {
                if (this.f3925ag <= 1 && this.f3939av > 0 && this.f3939av <= 4 && this.f3922ad && m2157a < 40000.0f) {
                    z2 = true;
                }
            } else if (mo3071bc > 0.4d && this.f3925ag <= 1 && this.f3939av > 0 && this.f3939av <= 2 && this.f3922ad && m2157a < 10000.0f) {
                z2 = true;
            }
            float f5 = 179.0f;
            if (this.f3896Q != null && mo3002E() && mo3218bj() && !m2876aV()) {
                this.f1619cf = m2071d;
            } else if (this.f3945ay <= 0.0f) {
                f5 = m2939a(f, m2071d, true, z2);
            }
            float f6 = 20.0f;
            if (m2157a > 361.0f) {
                f6 = 46.0f;
            }
            if (m2157a > 3600.0f) {
                f6 = 89.0f;
            }
            float mo3006A = mo3006A();
            if (mo3006A < 1.4d) {
                if (m2157a > 6400.0f) {
                    f6 *= 0.5f;
                } else {
                    f6 = 17.0f;
                }
            }
            if (mo2976z > 5.0f && this.f1617cd < 0.01d && this.f1617cd > -0.01d) {
                f6 = 1.0f;
            }
            if (mo3006A < 1.1d) {
                f6 *= 0.7f;
            }
            if (this.f1617cd > 0.4d && m2157a > 16900.0f) {
                f6 = 180.0f;
            }
            if (m2873aY() && this.f3941v == this.f3939av) {
                f6 = 1.0f;
            }
            if (mo3218bj()) {
                f6 = 181.0f;
            }
            boolean z3 = this.f3939av == 1;
            if ((!z3 || m2157a >= 4.0f * 4.0f) && C0758f.m2085c(f5) <= f6) {
                f2 = 1.0f;
                if (c0235ad.f1520c) {
                    if (m2157a < 2500.0f) {
                        f2 = 1.0f - 0.15f;
                    }
                    if (m2157a < 900.0f) {
                        f2 -= 0.15f;
                    }
                    if (m2157a < 225.0f) {
                        f2 -= 0.3f;
                    }
                } else if (this.f3921ac != null) {
                    if (m2157a > 400.0f) {
                        f2 = 1.0f + 0.2f;
                    }
                    if (m2157a < 49.0f) {
                        f2 -= 0.15f;
                    }
                    if (m2157a < 9.0f) {
                        f2 -= 0.15f;
                    }
                }
                if (m2157a < 9.0f) {
                    f2 = 0.0f;
                }
            }
            if (z3 && f2 != 0.0f) {
                if (m2157a < 324.0f && mo3003D() < 0.13f && mo2976z() > 1.0f) {
                    f2 = 0.5f * f2;
                }
                if (m2157a < 169.0f && mo3003D() < 0.15f && mo2976z() > 0.9f) {
                    f2 = 0.5f * f2;
                }
                if (mo2976z > 5.0f) {
                    if (m2157a < 324.0f && f2 > 0.5f) {
                        f2 = 0.5f;
                    }
                    if (m2157a < 81.0f && f2 > 0.25f) {
                        f2 = 0.25f;
                    }
                }
            }
            boolean z4 = false;
            if (!z3 && m2157a < 256.0f) {
                z4 = true;
            }
            if (z3 && m2157a < 4.0f * 4.0f) {
                z4 = true;
            }
            if ((this.f3918Z == m1072A.f6239bx || this.f3918Z == m1072A.f6239bx - 1) && this.f3917Y != null && this.f3917Y.m4385c(f3, f4, 2.0f)) {
                z4 = true;
            }
            if (f2 > 0.0f) {
                this.f3903V += f;
                if (this.f3903V > 200.0f && m2157a < 3600.0f && this.f3939av >= 2) {
                    float f7 = this.f3903V;
                    m2888aJ();
                    this.f3903V = f7;
                }
                if (this.f3903V > 600.0f && this.f3939av >= 2 && this.f3937at == null) {
                    m2890aH();
                }
                if (this.f3903V > 80.0f && this.f3888b > 30.0f) {
                    m2890aH();
                }
                if (this.f3903V > 40.0f && this.f3939av >= 2 && this.f3937at == null) {
                    C0237af c0237af = this.f3938au[1];
                    if (C0758f.m2157a(this.f6957el, this.f6958em, c0237af.f1528a, c0237af.f1529b) < m2157a) {
                        float f8 = this.f3903V;
                        m2888aJ();
                        this.f3903V = f8;
                    }
                }
            }
            if (z4) {
                m2888aJ();
                if (z3) {
                    this.f3890d = 0.0f;
                    this.f3889c = 0.0f;
                    if (!this.f3940u && this.f3921ac == null && c0305au != null && c0305au.f1797a == EnumC0306av.move) {
                        m2847ax();
                    }
                }
            }
        }
        if (this.f1620cg && !mo3218bj()) {
            f2 = (-f2) * mo3071bc();
        }
        if (this.f3945ay > 0.0f) {
            f2 = 0.0f;
        }
        if (!mo3219bi()) {
            if (this.f1617cd < f2) {
                this.f1617cd = C0758f.m2158a(this.f1617cd, f2, mo3004C() * f);
            }
            if (this.f1617cd > f2) {
                this.f1617cd = C0758f.m2158a(this.f1617cd, f2, mo3003D() * f);
            }
        } else {
            this.f1617cd = f2;
        }
        this.f1648cI = c0235ad.f1519b && z;
    }

    @Deprecated
    /* renamed from: Z */
    public boolean m2944Z() {
        return this.f3896Q != null;
    }

    /* renamed from: aa */
    public boolean m2870aa() {
        if (this.f3896Q != null && !this.f3896Q.f1607bT) {
            int mo3084bl = mo3084bl();
            for (int i = 0; i < mo3084bl; i++) {
                if (this.f1649cJ[i].f1721j != null && mo3448r(i)) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    /* renamed from: ab */
    public AbstractC0244am m2869ab() {
        if (this.f3896Q != null && !this.f3896Q.f1607bT) {
            return this.f3896Q;
        }
        C0305au m2853ar = m2853ar();
        if (m2853ar != null && m2853ar.f1801h != null && !m2853ar.f1801h.f1607bT) {
            return m2853ar.f1801h;
        }
        return null;
    }

    /* renamed from: a */
    private void m2903a(LoggerMaybe loggerMaybe, float f, float f2) {
        f3969aP.m4471a(f2);
        loggerMaybe.f6127cc.m3160a(this.f6957el, this.f6958em, f2, this, f, f3969aP);
        if (f3969aP.f1524a != 0) {
            if (this.f3896Q == null || !m2772h(this.f3896Q)) {
                f3970aQ.m4471a(f2);
                loggerMaybe.f6127cc.m3160a(this.f6957el, this.f6958em, f2, this, f, f3970aQ);
            }
        }
    }

    /* renamed from: ac */
    public boolean m2868ac() {
        return mo3084bl() > 1;
    }

    /* renamed from: a */
    private void m2904a(LoggerMaybe loggerMaybe, float f) {
        int mo3084bl = mo3084bl();
        if (!m2868ac()) {
            for (int i = 0; i < mo3084bl; i++) {
                this.f1649cJ[i].f1721j = this.f3896Q;
            }
            return;
        }
        boolean z = false;
        for (int i2 = 0; i2 < mo3084bl; i2++) {
            C0247ap c0247ap = this.f1649cJ[i2];
            if (mo3445v(i2) == -1) {
                if (mo3231a(i2, this.f3896Q, false, false)) {
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
            float m2829b = m2829b(false);
            f3972aS.m4468a(this);
            loggerMaybe.f6127cc.m3160a(this.f6957el, this.f6958em, m2829b, this, f, f3972aS);
        }
        for (int i3 = 0; i3 < mo3084bl; i3++) {
            int mo3445v = mo3445v(i3);
            if (mo3445v != -1) {
                this.f1649cJ[i3].f1721j = this.f1649cJ[mo3445v].f1721j;
            }
        }
    }

    /* renamed from: ad */
    public boolean m2867ad() {
        if (!mo2979l()) {
            return false;
        }
        C0399m dl = m4323dl();
        if (dl != null && !dl.f2483M) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    private void m2830b(LoggerMaybe loggerMaybe, float f) {
        int mo3084bl = mo3084bl();
        boolean z = false;
        if (m2867ad()) {
            boolean z2 = false;
            boolean z3 = false;
            if (this.f3896Q != null) {
                C0399m dl = m4323dl();
                if (dl != null && this.f1652cM != null && dl.f2482L && this.f1652cM.f3896Q == this.f3896Q) {
                    z2 = true;
                }
                if (!m2916a(this.f3896Q, false) && !z2 && 1 != 0) {
                    this.f3896Q = null;
                }
            }
            if (this.f3896Q != null && !z2) {
                z3 = !m2772h(this.f3896Q);
            }
            this.f3897R = C0758f.m2159a(this.f3897R, f);
            this.f3898S = C0758f.m2159a(this.f3898S, f);
            if ((this.f3896Q == null || z3) && this.f3897R == 0.0f && m2817bf()) {
                this.f3897R = 20.0f + (this.f6957el % 5.0f) + (this.f6958em % 5.0f);
                m2903a(loggerMaybe, f, m2829b(false));
                if (this.f3896Q != null) {
                    this.f3898S = 0.0f;
                }
            }
            if (this.f3896Q != null && this.f3898S == 0.0f) {
                this.f3898S = 20.0f + (this.f6957el % 5.0f) + (this.f6958em % 5.0f);
                m2904a(loggerMaybe, f);
            }
            for (int i = 0; i < mo3084bl; i++) {
                this.f1649cJ[i].f1718g = false;
            }
            if (this.f3896Q != null) {
                float m2157a = C0758f.m2157a(this.f6957el, this.f6958em, this.f3896Q.f6957el, this.f3896Q.f6958em);
                float m2749o = m2749o(this.f3896Q);
                if (m2157a < m2749o * m2749o || z2) {
                    int m2878aT = m2878aT();
                    for (int i2 = 0; i2 < mo3084bl; i2++) {
                        C0247ap c0247ap = this.f1649cJ[i2];
                        AbstractC0244am abstractC0244am = c0247ap.f1721j;
                        if (abstractC0244am != null) {
                            boolean z4 = abstractC0244am == this.f3896Q;
                            if (!z4 && !m2835b(abstractC0244am, true)) {
                                c0247ap.f1721j = null;
                            } else if (!mo3231a(i2, abstractC0244am, false, !z4)) {
                                c0247ap.f1721j = null;
                            } else {
                                PointF mo3089G = mo3089G(i2);
                                PointF mo3237K = mo3237K(i2);
                                mo3237K.f227a += abstractC0244am.f6957el;
                                mo3237K.f228b += abstractC0244am.f6958em;
                                float m2071d = C0758f.m2071d(mo3089G.f227a, mo3089G.f228b, mo3237K.f227a, mo3237K.f228b);
                                if (mo3445v(i2) == -1 && i2 != m2878aT) {
                                    if (!mo3002E()) {
                                        c0247ap.m4293a(70);
                                        c0247ap.f1713b = c0247ap.f1712a;
                                        float f2 = 179.0f;
                                        if (!c0247ap.m4292b()) {
                                            f2 = m2942a(f, m2071d, i2);
                                        }
                                        if (C0758f.m2085c(f2) < m2734x(i2)) {
                                            c0247ap.f1718g = true;
                                        }
                                    } else {
                                        boolean z5 = false;
                                        C0305au m2853ar = m2853ar();
                                        if (m2853ar != null && (m2853ar.f1797a == EnumC0306av.build || m2853ar.f1797a == EnumC0306av.repair || m2853ar.f1797a == EnumC0306av.reclaim)) {
                                            z5 = true;
                                        }
                                        if (!z5 && (!this.f3907k || mo3218bj())) {
                                            float m2796c = m2796c(f, m2071d);
                                            c0247ap.f1713b = c0247ap.f1712a;
                                            if (C0758f.m2085c(m2796c) < m2734x(i2)) {
                                                c0247ap.f1718g = true;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    for (int i3 = 0; i3 < mo3084bl; i3++) {
                        C0247ap c0247ap2 = this.f1649cJ[i3];
                        AbstractC0244am abstractC0244am2 = c0247ap2.f1721j;
                        if (abstractC0244am2 != null) {
                            if (mo3446u(i3) && c0247ap2.f1716e == 0.0f) {
                                z = true;
                            }
                            if (mo3446u(i3)) {
                                m2936a(f, abstractC0244am2, i3);
                            }
                        }
                    }
                } else if (!this.f3907k && m2857an()) {
                    this.f3906j = true;
                    this.f3907k = true;
                    this.f3908l = this.f3896Q.f6957el;
                    this.f3909m = this.f3896Q.f6958em;
                    this.f3910n = 0;
                }
            }
        }
        if (this.f3966aM && m2946X() != null) {
            z = true;
        }
        for (int i4 = 0; i4 < mo3084bl; i4++) {
            C0247ap c0247ap3 = this.f1649cJ[i4];
            if (!z && c0247ap3.f1717f != 0.0f) {
                c0247ap3.f1717f = C0758f.m2159a(c0247ap3.f1717f, mo2984f(i4) * f);
            }
        }
    }

    /* renamed from: b */
    public void m2836b(AbstractC0244am abstractC0244am, int i) {
    }

    /* renamed from: a */
    public boolean m2936a(float f, AbstractC0244am abstractC0244am, int i) {
        C0247ap c0247ap = this.f1649cJ[i];
        int mo3445v = mo3445v(i);
        if (mo3445v != -1) {
            c0247ap.f1712a = this.f1649cJ[mo3445v].f1712a;
        }
        boolean m2740s = m2740s(i);
        boolean z = false;
        if (m2740s) {
            if (c0247ap.f1717f < mo2985e(i)) {
                if (c0247ap.f1717f == 0.0f) {
                    m2836b(abstractC0244am, i);
                }
                c0247ap.f1717f += f;
            } else {
                c0247ap.f1717f = mo2985e(i);
            }
            z = true;
        }
        if (c0247ap.f1716e == 0.0f && mo3448r(i)) {
            if (!mo3231a(i, abstractC0244am, false, false)) {
                c0247ap.f1716e = -10.0f;
                return false;
            }
            if (!m2740s) {
                if (c0247ap.f1717f < mo2985e(i)) {
                    if (c0247ap.f1717f == 0.0f) {
                        m2836b(abstractC0244am, i);
                    }
                    c0247ap.f1717f += f;
                } else {
                    z = true;
                }
            }
            if (z) {
                c0247ap.f1716e = mo2992b(i) + m2739t(i);
                if (!m2740s) {
                    c0247ap.f1717f = 0.0f;
                }
                mo2993a(abstractC0244am, i);
                m2954M(i);
                c0247ap.f1724m = !c0247ap.f1724m;
                return true;
            }
            return false;
        }
        return false;
    }

    /* renamed from: h */
    public boolean m2772h(AbstractC0244am abstractC0244am) {
        float m2157a = C0758f.m2157a(this.f6957el, this.f6958em, abstractC0244am.f6957el, abstractC0244am.f6958em);
        float m2749o = m2749o(abstractC0244am);
        if (m2157a < m2749o * m2749o) {
            return true;
        }
        return false;
    }

    /* renamed from: ae */
    public boolean mo3066ae() {
        return false;
    }

    /* renamed from: af */
    public boolean mo3065af() {
        return true;
    }

    /* renamed from: ag */
    public boolean mo3064ag() {
        return true;
    }

    /* renamed from: ah */
    public boolean mo3063ah() {
        return true;
    }

    /* renamed from: i */
    public boolean m2768i(AbstractC0244am abstractC0244am) {
        int mo3445v;
        int mo3084bl = mo3084bl();
        for (int i = 0; i < mo3084bl; i++) {
            if (mo3448r(i) && mo3231a(i, abstractC0244am, false, false) && ((mo3445v = mo3445v(i)) == -1 || mo3231a(mo3445v, abstractC0244am, false, false))) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: j */
    public boolean m2765j(AbstractC0244am abstractC0244am) {
        int mo3445v;
        int mo3084bl = mo3084bl();
        for (int i = 0; i < mo3084bl; i++) {
            if (mo3448r(i) && mo3231a(i, abstractC0244am, true, false) && ((mo3445v = mo3445v(i)) == -1 || mo3231a(mo3445v, abstractC0244am, true, false))) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public boolean mo3231a(int i, AbstractC0244am abstractC0244am, boolean z, boolean z2) {
        if (!z && z2 && !m2772h(abstractC0244am)) {
            return false;
        }
        return true;
    }

    /* renamed from: k */
    public boolean m2761k(AbstractC0244am abstractC0244am) {
        if (abstractC0244am.mo2981i()) {
            return mo3065af();
        }
        if (abstractC0244am.mo2995Q()) {
            return mo3066ae();
        }
        if (!mo3063ah() && !abstractC0244am.m4375cG()) {
            return false;
        }
        return mo3064ag();
    }

    /* renamed from: a */
    public boolean mo3087a(AbstractC0244am abstractC0244am) {
        return false;
    }

    /* renamed from: l */
    public boolean m2758l(AbstractC0244am abstractC0244am) {
        if (abstractC0244am.mo3250g() != 0.0f && m4308h(abstractC0244am, true)) {
            return true;
        }
        return mo3087a(abstractC0244am);
    }

    /* renamed from: a */
    public AbstractC0224s m2913a(InterfaceC0303as interfaceC0303as, boolean z) {
        return m2914a(interfaceC0303as, -1, z);
    }

    /* renamed from: ai */
    public boolean m2862ai() {
        Iterator it = mo3068N().iterator();
        while (it.hasNext()) {
            if (((AbstractC0224s) it.next()).mo3019g()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public AbstractC0224s m2914a(InterfaceC0303as interfaceC0303as, int i, boolean z) {
        InterfaceC0303as mo4137E;
        ArrayList N = mo3068N();
        AbstractC0224s abstractC0224s = null;
        if (N.size() > 0) {
            Iterator it = N.iterator();
            while (it.hasNext()) {
                AbstractC0224s abstractC0224s2 = (AbstractC0224s) it.next();
                InterfaceC0303as mo4109y = abstractC0224s2.mo4109y();
                if (z && (mo4137E = abstractC0224s2.mo4137E()) != null) {
                    mo4109y = mo4137E;
                }
                if (mo4109y == interfaceC0303as && (i == -1 || i == abstractC0224s2.mo4485t())) {
                    abstractC0224s = abstractC0224s2;
                    if (abstractC0224s2.mo3025b(this) && abstractC0224s2.mo3027a((AbstractC0244am) this, false)) {
                        return abstractC0224s2;
                    }
                }
            }
        }
        return abstractC0224s;
    }

    /* renamed from: b */
    public boolean m2834b(InterfaceC0303as interfaceC0303as, boolean z) {
        AbstractC0224s m2913a = m2913a(interfaceC0303as, z);
        if (m2913a == null || m2913a.mo4123g(this) || !m2913a.mo3025b(this)) {
            return false;
        }
        return true;
    }

    /* renamed from: aj */
    public boolean m2861aj() {
        return mo5649r().mo4248m();
    }

    /* renamed from: ak */
    public boolean m2860ak() {
        return mo5649r().mo4249l();
    }

    /* renamed from: m */
    public void m2754m(AbstractC0244am abstractC0244am) {
    }

    /* renamed from: al */
    public boolean m2859al() {
        return false;
    }

    /* renamed from: a */
    public final boolean m2916a(AbstractC0244am abstractC0244am, boolean z) {
        if (this.f1609bV == abstractC0244am.f1609bV || abstractC0244am.f1607bT || !this.f1609bV.m4599c(abstractC0244am.f1609bV) || this.f3894O == EnumC0205a.holdFire || this.f3894O == EnumC0205a.returnFire || abstractC0244am.f1651cL != null || !m2761k(abstractC0244am) || !abstractC0244am.mo2987d((AbstractC0244am) this)) {
            return false;
        }
        if (!z) {
            float m2157a = C0758f.m2157a(this.f6957el, this.f6958em, abstractC0244am.f6957el, abstractC0244am.f6958em);
            float m2829b = m2829b(false);
            if (m2157a < m2829b * m2829b) {
                return true;
            }
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public final boolean m2835b(AbstractC0244am abstractC0244am, boolean z) {
        if (abstractC0244am.m4341cs()) {
            return false;
        }
        return m2916a(abstractC0244am, z);
    }

    /* renamed from: am */
    public float m2858am() {
        return 0.0f;
    }

    /* renamed from: an */
    public boolean m2857an() {
        return this.f3894O == EnumC0205a.outOfRange || this.f3894O == EnumC0205a.guardArea || this.f3894O == EnumC0205a.aggressive;
    }

    /* renamed from: b */
    public float m2829b(boolean z) {
        float m2858am;
        float mo2978m = mo2978m();
        C0305au m2853ar = m2853ar();
        if (m2853ar != null && (m2853ar.f1797a == EnumC0306av.attackMove || m2853ar.f1797a == EnumC0306av.patrol || m2853ar.f1797a == EnumC0306av.guard)) {
            if (m2853ar.f1797a == EnumC0306av.patrol) {
                mo2978m += 110.0f;
            } else if (m2853ar.f1797a == EnumC0306av.guard) {
                mo2978m += 90.0f;
            } else {
                mo2978m += 20.0f;
            }
            if (mo2978m < 190.0f) {
                mo2978m = 190.0f;
            }
        }
        if (this.f3894O == EnumC0205a.outOfRange) {
            m2858am = mo2978m + 250.0f;
        } else if (this.f3894O == EnumC0205a.guardArea) {
            m2858am = mo2978m + 150.0f;
        } else if (this.f3894O == EnumC0205a.aggressive) {
            m2858am = mo2978m + 180.0f;
        } else {
            m2858am = mo2978m + m2858am();
            if (z) {
                m2858am += 110.0f;
            }
        }
        return m2858am;
    }

    /* renamed from: ao */
    public C0305au m2856ao() {
        m2755m(29);
        if (this.f3892f > 0) {
            m2833b(this.f3893g[0]);
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
        c0305au2.m4220e();
        this.f3902U = 0.0f;
        this.f3905X = 0.0f;
        this.f3903V = 0.0f;
        m2792c(c0305au2);
        m2890aH();
        return c0305au2;
    }

    /* renamed from: a */
    public void m2912a(C0305au c0305au) {
    }

    /* renamed from: b */
    public final void m2833b(C0305au c0305au) {
        this.f3900h = false;
    }

    /* renamed from: c */
    public void m2792c(C0305au c0305au) {
        m2825bC();
        this.f3901i = -9999;
        if (this.f3896Q != null && this.f3896Q.m4341cs()) {
            this.f3896Q = null;
        }
    }

    /* renamed from: ap */
    public C0305au m2855ap() {
        m2755m(this.f3892f);
        if (this.f3893g[this.f3892f] == null) {
            this.f3893g[this.f3892f] = new C0305au();
        }
        C0305au c0305au = this.f3893g[this.f3892f];
        c0305au.m4220e();
        if (this.f3892f < 29) {
            this.f3892f++;
        }
        if (this.f3892f > 0) {
            m2792c(this.f3893g[0]);
        }
        return c0305au;
    }

    /* renamed from: d */
    public C0305au m2789d(float f, float f2) {
        C0305au m2855ap = m2855ap();
        m2855ap.m4236a(f, f2);
        return m2855ap;
    }

    /* renamed from: n */
    public C0305au m2751n(AbstractC0244am abstractC0244am) {
        C0305au m2855ap = m2855ap();
        m2855ap.m4234a(abstractC0244am);
        return m2855ap;
    }

    /* renamed from: e */
    public C0305au m2785e(float f, float f2) {
        C0305au m2855ap = m2855ap();
        m2855ap.m4229b(f, f2);
        return m2855ap;
    }

    /* renamed from: a */
    public boolean m2910a(C0305au c0305au, boolean z) {
        if (c0305au == null) {
            if (z) {
                LoggerMaybe.m983b("isValidNewWaypoint: Skipping null waypoint");
                return false;
            }
            return false;
        } else if (c0305au.m4222d() == EnumC0306av.build) {
            if (c0305au.f1798b == null) {
                if (z) {
                    LoggerMaybe.m983b("isValidNewWaypoint: Skipping build waypoint with no buildType");
                    return false;
                }
                return false;
            }
            AbstractC0224s m2914a = m2914a(c0305au.f1798b, c0305au.f1800d, false);
            if (m2914a == null) {
                if (z) {
                    LoggerMaybe.m983b("Unit '" + mo5649r().mo4252i() + "' can not queue build:" + c0305au.f1798b.mo4252i());
                    return false;
                }
                return false;
            } else if (!c0305au.f1805n) {
                if (m2914a.mo4123g(this)) {
                    if (z) {
                        LoggerMaybe.m983b("Builder '" + mo5649r().mo4252i() + "' tried to queue a locked building:" + m2914a.m4506O());
                        return false;
                    }
                    return false;
                } else if (!m2914a.mo3025b(this)) {
                    if (z) {
                        LoggerMaybe.m983b("Builder '" + mo5649r().mo4252i() + "' tried to queue a unavailable building:" + m2914a.m4506O());
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
    public C0305au m2786d(C0305au c0305au) {
        C0305au m2855ap = m2855ap();
        m2855ap.m4223c(c0305au);
        return m2855ap;
    }

    /* renamed from: aq */
    public boolean m2854aq() {
        return m2853ar() == null;
    }

    /* renamed from: ar */
    public C0305au m2853ar() {
        if (this.f3892f == 0) {
            return null;
        }
        return this.f3893g[0];
    }

    /* renamed from: as */
    public C0305au m2852as() {
        if (this.f3892f <= 1) {
            return null;
        }
        return this.f3893g[1];
    }

    /* renamed from: at */
    public C0305au m2851at() {
        if (this.f3892f == 0) {
            return null;
        }
        return this.f3893g[this.f3892f - 1];
    }

    /* renamed from: au */
    public void m2850au() {
        if (this.f3892f == 0) {
            return;
        }
        if (this.f3892f == 1) {
            m2846ay();
        } else {
            this.f3892f--;
        }
    }

    /* renamed from: k */
    public C0305au m2762k(int i) {
        return this.f3893g[i];
    }

    /* renamed from: av */
    public int m2849av() {
        return this.f3892f;
    }

    /* renamed from: aw */
    public boolean m2848aw() {
        C0305au m2853ar = m2853ar();
        if (m2853ar != null && m2853ar.f1797a == EnumC0306av.attack) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public boolean m2915a(InterfaceC0303as interfaceC0303as, float f, float f2) {
        for (int i = 0; i < this.f3892f; i++) {
            C0305au c0305au = this.f3893g[i];
            if (c0305au.f1797a == EnumC0306av.build && c0305au.f1798b == interfaceC0303as && C0758f.m2085c(c0305au.f1806e - f) < 10.0f && C0758f.m2085c(c0305au.f1807f - f2) < 10.0f) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: l */
    public void m2759l(int i) {
        if (i >= 120) {
            throw new RuntimeException("PathNode index:" + i + " too large");
        }
        if (this.f3938au == f3998as) {
            this.f3938au = new C0237af[120];
        }
    }

    /* renamed from: m */
    public void m2755m(int i) {
        if (i >= 30) {
            throw new RuntimeException("Waypoint index:" + i + " too large");
        }
        if (this.f3893g == f3997N) {
            this.f3893g = new C0305au[30];
        }
    }

    /* renamed from: n */
    public void m2752n(int i) {
        if (this.f3892f <= i) {
            throw new IndexOutOfBoundsException("completeWaypoint: waypointsCount:" + this.f3892f + ", waypointIndex:" + i);
        }
        if (i == 0) {
            m2846ay();
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
    public void m2847ax() {
        m2895aC();
        m2846ay();
    }

    /* renamed from: ay */
    public void m2846ay() {
        this.f3902U = 0.0f;
        this.f3905X = 0.0f;
        this.f3903V = 0.0f;
        this.f3935aq = false;
        this.f3934ap = -999.0f;
        this.f3936ar = false;
        this.f3942w = 0;
        if (this.f3892f == 0) {
            m2890aH();
            this.f3891e = 0.0f;
            this.f3890d = 0.0f;
            this.f3889c = 0.0f;
        } else if (this.f3892f == 1) {
            m2833b(this.f3893g[0]);
            this.f3892f = 0;
            m2890aH();
            this.f3891e = 0.0f;
            this.f3890d = 0.0f;
            this.f3889c = 0.0f;
            m2792c((C0305au) null);
        } else {
            if (this.f3893g.length > 0) {
                C0305au c0305au = this.f3893g[0];
                m2833b(c0305au);
                for (int i = 0; i < this.f3892f - 1; i++) {
                    this.f3893g[i] = this.f3893g[i + 1];
                }
                this.f3893g[this.f3892f - 1] = c0305au;
            }
            this.f3892f--;
            if (this.f3892f > 0) {
                m2792c(this.f3893g[0]);
            } else {
                m2792c((C0305au) null);
            }
            m2890aH();
        }
    }

    /* renamed from: az */
    public void m2845az() {
        int i = this.f3892f;
        if (this.f3892f > 0) {
            m2833b(this.f3893g[0]);
        }
        this.f3902U = 0.0f;
        this.f3905X = 0.0f;
        this.f3935aq = false;
        this.f3934ap = -999.0f;
        this.f3936ar = false;
        this.f3892f = 0;
        m2890aH();
        m2894aD();
        m2909a((AbstractC0623y) null);
        this.f3891e = 0.0f;
        this.f3890d = 0.0f;
        this.f3889c = 0.0f;
        this.f3942w = 0;
        if (i > 0) {
            m2792c((C0305au) null);
        }
    }

    /* renamed from: aA */
    public void m2897aA() {
        for (int i = 0; i < this.f3892f; i++) {
            C0305au c0305au = this.f3893g[i];
            if (c0305au != null && c0305au.f1797a != EnumC0306av.build && c0305au.f1797a != EnumC0306av.repair) {
                m2752n(i);
            }
        }
    }

    /* renamed from: a */
    public void m2909a(AbstractC0623y abstractC0623y) {
        if (this.f3921ac != null) {
            this.f3921ac.f3924af--;
        }
        this.f3921ac = abstractC0623y;
        if (abstractC0623y != null) {
            this.f3921ac.f3924af++;
        }
    }

    /* renamed from: aB */
    public void m2896aB() {
        m2909a((AbstractC0623y) null);
        this.f3922ad = false;
        this.f3927ai = false;
        this.f3928aj = 0.0f;
        this.f3929ak = 0.0f;
        this.f3920ab = 0;
        this.f3889c = 0.0f;
    }

    /* renamed from: aC */
    public void m2895aC() {
        if (this.f3924af == 0) {
            return;
        }
        C0305au m2852as = m2852as();
        AbstractC0244am[] m498a = AbstractC0244am.f1590bD.m498a();
        int size = AbstractC0244am.f1590bD.size();
        for (int i = 0; i < size; i++) {
            AbstractC0244am abstractC0244am = m498a[i];
            if (abstractC0244am instanceof AbstractC0623y) {
                AbstractC0623y abstractC0623y = (AbstractC0623y) abstractC0244am;
                if (abstractC0623y.f3921ac == this) {
                    boolean z = C0758f.m2157a(this.f6957el, this.f6958em, abstractC0623y.f6957el, abstractC0623y.f6958em) < 108900.0f;
                    boolean z2 = false;
                    boolean z3 = false;
                    C0305au m2852as2 = abstractC0623y.m2852as();
                    if (m2852as != null && m2852as2 != null) {
                        if (m2852as.m4227b(m2852as2)) {
                            z2 = true;
                        }
                    } else if (m2852as == null && m2852as2 == null) {
                        z3 = true;
                    }
                    if (z2 && z) {
                        abstractC0623y.m2846ay();
                    } else if (!z3) {
                        abstractC0623y.m2909a((AbstractC0623y) null);
                    }
                }
            }
        }
    }

    /* renamed from: aD */
    public void m2894aD() {
        C0305au m2853ar;
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
                    abstractC0623y2.m2909a((AbstractC0623y) null);
                    abstractC0623y = abstractC0623y2;
                }
            }
        }
        if (this.f3924af != 0) {
            this.f3924af = 0;
        }
        if (abstractC0623y != null && (m2853ar = abstractC0623y.m2853ar()) != null && (c0637ab = m2853ar.f1802i) != null) {
            c0637ab.m2695c();
        }
    }

    /* renamed from: aE */
    public C0237af m2893aE() {
        if (this.f3939av == 0) {
            return null;
        }
        if (this.f3937at != null) {
            return this.f3937at.mo1191a(this);
        }
        return this.f3938au[0];
    }

    /* renamed from: aF */
    public C0237af m2892aF() {
        if (this.f3939av < 2) {
            return null;
        }
        if (this.f3937at != null) {
            return this.f3937at.mo1190b(this);
        }
        return this.f3938au[1];
    }

    /* renamed from: a */
    public void m2929a(int i, float f, float f2) {
        m2759l(i);
        if (this.f3938au[i] == null) {
            this.f3938au[i] = new C0237af();
        }
        this.f3938au[i].f1528a = f;
        this.f3938au[i].f1529b = f2;
    }

    /* renamed from: aG */
    public boolean m2891aG() {
        if (this.f3937at == null && this.f3939av >= 2) {
            if (mo2976z() > 0.5d) {
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
    public void m2890aH() {
        this.f3939av = 0;
        this.f3940u = false;
        this.f3941v = 0;
        this.f3915s = 0.0f;
        this.f3903V = 0.0f;
        this.f3904W = 0.0f;
        this.f3913q = (byte) 0;
    }

    /* renamed from: aI */
    public void m2889aI() {
        m2890aH();
        this.f3938au = f3998as;
        this.f3961aH = (byte) 0;
        this.f3962aI = null;
        this.f3963aJ = null;
    }

    /* renamed from: aJ */
    public void m2888aJ() {
        this.f3904W = this.f3903V;
        this.f3903V = 0.0f;
        if (this.f3937at != null) {
            this.f3937at.mo1189c(this);
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
    public boolean m2887aK() {
        LoggerMaybe m1072A = LoggerMaybe.m1072A();
        boolean z = false;
        if (m4342cr()) {
            z = true;
        }
        m1072A.f6110bL.m4857a(this.f6957el, this.f6958em);
        int i = m1072A.f6110bL.f801T;
        int i2 = m1072A.f6110bL.f802U;
        if (m1072A.f6119bU.m1151a(mo2982h(), i, i2) && !m1072A.f6119bU.m1138b(mo2982h(), i, i2)) {
            z = true;
        }
        return z;
    }

    /* renamed from: a */
    public void m2941a(float f, float f2, int i, boolean z, boolean z2) {
        LoggerMaybe m1072A = LoggerMaybe.m1072A();
        C0907l c0907l = m1072A.f6119bU;
        C0173b c0173b = m1072A.f6110bL;
        this.f1648cI = true;
        boolean z3 = false;
        boolean z4 = false;
        if (m4342cr()) {
            z3 = true;
        }
        c0173b.m4857a(this.f6957el, this.f6958em);
        int i2 = c0173b.f801T;
        int i3 = c0173b.f802U;
        if (c0907l.m1151a(mo2982h(), i2, i3) && !c0907l.m1138b(mo2982h(), i2, i3)) {
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
            float m4858a = c0173b.m4858a(f);
            float m4823b = c0173b.m4823b(f2);
            if (z4) {
                float m2071d = C0758f.m2071d(this.f6957el, this.f6958em, m4858a, m4823b);
                float m2105b = C0758f.m2105b(this.f6957el, this.f6958em, m4858a, m4823b);
                if (m2105b > 60.0f) {
                    m2105b = 60.0f;
                    this.f3940u = true;
                    if (this.f3915s > 10.0f) {
                        this.f3915s = 10.0f;
                    }
                }
                m4858a = this.f6957el + (C0758f.m2040i(m2071d) * m2105b);
                m4823b = this.f6958em + (C0758f.m2045h(m2071d) * m2105b);
            }
            m2929a(this.f3939av, m4858a, m4823b);
            this.f3939av++;
            this.f3941v = this.f3939av;
            return;
        }
        int i4 = 0;
        if (z) {
            i4 = 3;
        }
        if (C0248aq.m4290a(mo2982h(), this.f6957el, this.f6958em, f, f2, 80, i4, 1)) {
            this.f3940u = false;
            this.f3939av = 0;
            this.f3937at = null;
            float m4858a2 = c0173b.m4858a(f);
            float m4823b2 = c0173b.m4823b(f2);
            float f3 = this.f6957el;
            float f4 = this.f6958em;
            float m2071d2 = C0758f.m2071d(this.f6957el, this.f6958em, m4858a2, m4823b2);
            float m2105b2 = C0758f.m2105b(this.f6957el, this.f6958em, m4858a2, m4823b2);
            float m2040i = C0758f.m2040i(m2071d2);
            float m2045h = C0758f.m2045h(m2071d2);
            int i5 = (int) ((m2105b2 * 0.05f) - 1.0f);
            int i6 = 1;
            if (i5 < 4) {
                i6 = 0;
            }
            int i7 = 0;
            while (true) {
                if (i7 >= i5) {
                    break;
                }
                f3 += m2040i * 20.0f;
                f4 += m2045h * 20.0f;
                if (i6 > 0) {
                    i6--;
                } else {
                    m2929a(this.f3939av, f3, f4);
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
                    m2929a(this.f3939av, m4858a2, m4823b2);
                    this.f3939av++;
                } else {
                    this.f3940u = true;
                }
            }
            this.f3941v = this.f3939av;
            return;
        }
        C0637ab c0637ab = null;
        C0305au m2853ar = m2853ar();
        if (m2853ar != null) {
            c0637ab = m2853ar.f1802i;
            if (c0637ab == null) {
            }
        }
        if (c0637ab != null && c0637ab.f4080g != null) {
            C0740d c0740d = null;
            Iterator it = c0637ab.f4080g.iterator();
            while (it.hasNext()) {
                C0740d c0740d2 = (C0740d) it.next();
                if (c0740d2.f4638a != null && c0740d2.f4638a.mo1206a() != null && C0758f.m2085c(c0740d2.f4642e - f) <= 10.0f && C0758f.m2085c(c0740d2.f4643f - f2) <= 10.0f && c0740d2.f4644g + SlickToAndroidKeycodes.AndroidCodes.KEYCODE_STB_INPUT >= m1072A.f6239bx && c0740d2.f4645h == mo2982h() && C0758f.m2157a(this.f6957el, this.f6958em, c0740d2.f4640c, c0740d2.f4641d) < 3600.0f) {
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
        this.f3973aT = m2940a(f, f2, i, z, true, z2);
    }

    /* renamed from: a */
    public C0906k m2940a(float f, float f2, int i, boolean z, boolean z2, boolean z3) {
        LoggerMaybe m1072A = LoggerMaybe.m1072A();
        C0907l c0907l = m1072A.f6119bU;
        C0173b c0173b = m1072A.f6110bL;
        C0906k m1142a = c0907l.m1142a(z2);
        c0173b.m4857a(this.f6957el, this.f6958em);
        boolean z4 = false;
        if (m2821bb() || this.f1620cg) {
            z4 = true;
        }
        m1142a.m1168a(mo2982h(), (short) c0173b.f801T, (short) c0173b.f802U, Float.valueOf(this.f1618ce), z4);
        c0173b.m4857a(f, f2);
        m1142a.m1163a((short) c0173b.f801T, (short) c0173b.f802U, (short) i);
        m1142a.f5985p = z;
        m1142a.f5986q = mo3229bh();
        m1142a.f5987r = z3;
        boolean z5 = this.f1648cI;
        this.f1648cI = true;
        if (z2 && m1142a.mo1201b()) {
            Iterator it = f3974aU.iterator();
            while (it.hasNext()) {
                C0906k c0906k = (C0906k) it.next();
                if (c0906k.f5976g + 60 < m1072A.f6239bx) {
                    it.remove();
                } else if (c0906k.mo1202a(m1142a)) {
                    return c0906k;
                }
            }
        }
        c0907l.m1145a(m1142a, z2);
        this.f1648cI = z5;
        if (z2 && m1142a.mo1201b()) {
            f3974aU.add(m1142a);
        }
        return m1142a;
    }

    /* renamed from: b */
    void m2831b(LoggerMaybe loggerMaybe) {
        if (this.f3973aT != null) {
            C0173b c0173b = loggerMaybe.f6110bL;
            LinkedList mo1206a = this.f3973aT.mo1206a();
            if (mo1206a != null) {
                this.f3937at = this.f3973aT.mo1203a(this);
                C0906k c0906k = this.f3973aT;
                this.f3939av = 0;
                this.f3940u = false;
                Iterator it = mo1206a.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    C0911p c0911p = (C0911p) it.next();
                    c0173b.m4853a((int) c0911p.f6074a, (int) c0911p.f6075b);
                    m2929a(this.f3939av, c0173b.f801T + c0173b.f787p, c0173b.f802U + c0173b.f788q);
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
                if (mo1206a.size() != 0) {
                    c0173b.m4857a(this.f3911o, this.f3912p);
                    if (!this.f3940u && ((C0911p) mo1206a.getLast()).f6074a == c0173b.f801T && ((C0911p) mo1206a.getLast()).f6075b == c0173b.f802U) {
                        z = true;
                    }
                }
                if (z) {
                    if (1 == 0) {
                        if (this.f3939av < 120) {
                            m2929a(this.f3939av, this.f3911o, this.f3912p);
                            this.f3939av++;
                        }
                    } else {
                        if (this.f3939av == 0) {
                            this.f3939av++;
                        }
                        m2929a(this.f3939av - 1, this.f3911o, this.f3912p);
                    }
                }
                this.f3973aT = null;
                if (this.f3939av > 120) {
                    LoggerMaybe.m983b("activePathCount>maxPathNodes: activePathCount:" + this.f3939av);
                    this.f3939av = 120;
                }
                this.f3941v = this.f3939av;
            }
        }
    }

    /* renamed from: aL */
    public long m2886aL() {
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
    C0237af m2750o(int i) {
        if (this.f3937at != null) {
            if (i == 0) {
                return m2893aE();
            }
            return m2892aF();
        } else if (i >= this.f3939av) {
            return null;
        } else {
            return this.f3938au[i];
        }
    }

    /* renamed from: d */
    public void mo2284d(float f) {
        super.mo2284d(f);
    }

    /* renamed from: aM */
    public float m2885aM() {
        return 1.0f;
    }

    /* renamed from: l */
    public int m2760l(float f) {
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
    public Paint m2884aN() {
        int i;
        PorterDuffColorFilter porterDuffColorFilter = null;
        if (this.f6959en < -0.3f) {
            i = Color.m5435a(m2760l(this.f6959en), 255, 255, 255);
        } else {
            i = -1;
        }
        if (this.f1624ck < 1.0f && this.f1624ck < m2885aM()) {
            i = Color.m5435a((int) (20.0f + ((this.f1624ck / m2885aM()) * 220.0f)), 140, 255, 140);
            porterDuffColorFilter = f3976aW;
        }
        if (this.f1627cn) {
            if (this.f1630cq) {
                i = Color.m5435a(200, 20, 255, 20);
                porterDuffColorFilter = f3977aX;
            }
            if (this.f1631cr) {
                i = Color.m5435a(200, 255, 20, 20);
                porterDuffColorFilter = f3978aY;
            }
            if (this.f1628co) {
                i = Color.m5435a(50, 70, 70, 245);
                porterDuffColorFilter = f3979aZ;
                if (this.f1631cr) {
                    i = Color.m5435a(50, 255, 20, 20);
                    porterDuffColorFilter = f3978aY;
                }
            }
            if (this.f1629cp) {
                i = Color.m5435a(150, 100, 100, 100);
            }
        }
        return m2928a(i, porterDuffColorFilter, m2883aO());
    }

    /* renamed from: aO */
    public boolean m2883aO() {
        LoggerMaybe m1072A = LoggerMaybe.m1072A();
        boolean z = m1072A.f6115bQ.renderAntiAlias;
        if (!m4326di()) {
            z = false;
            if (m1072A.f6256cW < 1.0f) {
                z = true;
            }
        }
        if (this.f1626cm) {
            z = EnumC0249ar.f1793ag;
        }
        return z;
    }

    /* renamed from: p */
    public float m2748p(int i) {
        return 1.0f;
    }

    /* renamed from: c */
    public boolean mo2285c(float f) {
        LoggerMaybe m1072A = LoggerMaybe.m1072A();
        InterfaceC1027y interfaceC1027y = m1072A.f6113bO;
        Paint m2884aN = m2884aN();
        float cC = m4378cC();
        if (this.f4232et) {
            PointF cW = m4359cW();
            float f2 = (this.f6957el + cW.f227a) - m1072A.f6144cv;
            float f3 = ((this.f6958em + cW.f228b) - m1072A.f6145cw) - this.f6959en;
            mo4201aQ();
            if (cC != 1.0f) {
                interfaceC1027y.mo135k();
                interfaceC1027y.mo226a(cC, cC, f2, f3);
            }
            interfaceC1027y.mo199a(this.f3885L, f2, f3, mo3216d(false) - 90.0f, m2884aN);
            if (cC != 1.0f) {
                interfaceC1027y.mo134l();
                return true;
            }
            return true;
        }
        PointF cW2 = m4359cW();
        RectF cE = mo3370cE();
        float f4 = cW2.f227a;
        float f5 = cW2.f228b - this.f6959en;
        cE.f234a += f4;
        cE.f235b += f5;
        cE.f236c += f4;
        cE.f237d += f5;
        Rect a_ = mo3182a_(false);
        float f6 = (cE.f234a + cE.f236c) * 0.5f;
        float f7 = (cE.f235b + cE.f237d) * 0.5f;
        interfaceC1027y.mo135k();
        mo4201aQ();
        if (cC != 1.0f) {
            interfaceC1027y.mo226a(cC, cC, f6, f7);
        }
        interfaceC1027y.mo227a(mo3216d(false), f6, f7);
        interfaceC1027y.mo192a(this.f3885L, a_, cE, m2884aN);
        interfaceC1027y.mo134l();
        return true;
    }

    /* renamed from: F */
    public boolean mo3001F() {
        return this.f6959en > 0.0f && this.f1624ck >= 1.0f && !this.f1628co;
    }

    /* renamed from: aP */
    public PointF m2882aP() {
        f3983bd.m5369a(mo3000G(), mo2999H());
        return f3983bd;
    }

    /* renamed from: G */
    public float mo3000G() {
        return 0.0f;
    }

    /* renamed from: H */
    public float mo2999H() {
        return 0.0f;
    }

    /* renamed from: aQ */
    public boolean mo4201aQ() {
        if (this.f3886M != null && mo3001F()) {
            LoggerMaybe m1072A = LoggerMaybe.m1072A();
            if (!m1072A.f6260dd && this.f1621ch < 18.0f && this.f6959en < 0.5d) {
                return true;
            }
            if (!m1072A.f6261de && this.f1621ch < 28.0f && this.f6959en < 5.0f) {
                return true;
            }
            PointF m2882aP = m2882aP();
            float f = (this.f6957el + m2882aP.f227a) - m1072A.f6144cv;
            float f2 = (this.f6958em + m2882aP.f228b) - m1072A.f6145cw;
            float cC = m4378cC();
            InterfaceC1027y interfaceC1027y = m1072A.f6113bO;
            if (cC != 1.0f) {
                interfaceC1027y.mo135k();
                interfaceC1027y.mo226a(cC, cC, f, f2);
            }
            if (m4376cF()) {
                Rect a_ = mo3182a_(true);
                RectF rectF = f1691dz;
                rectF.m5351a(f - this.f4230er, f2 - this.f4231es, f + this.f4230er, f2 + this.f4231es);
                interfaceC1027y.mo135k();
                interfaceC1027y.mo227a(mo3216d(true), f, f2);
                interfaceC1027y.mo192a(this.f3886M, a_, rectF, m2952R());
                interfaceC1027y.mo134l();
            } else {
                interfaceC1027y.mo199a(this.f3886M, f, f2, mo3216d(true) - 90.0f, m2952R());
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
    public boolean mo3246p_() {
        return RectF.m5348a(LoggerMaybe.m1072A().f6249cL, m4377cD());
    }

    /* renamed from: aR */
    public boolean m2880aR() {
        C0399m dl = m4323dl();
        if (dl != null && !dl.f2485O) {
            return false;
        }
        return mo2998I();
    }

    /* renamed from: aS */
    public boolean m2879aS() {
        return m2880aR();
    }

    /* renamed from: x */
    public boolean mo3109x() {
        return true;
    }

    /* renamed from: aT */
    public int m2878aT() {
        return -1;
    }

    /* renamed from: o */
    public float m2749o(AbstractC0244am abstractC0244am) {
        if (m2876aV() && abstractC0244am != null) {
            return mo2978m() + this.f1621ch + abstractC0244am.f1621ch;
        }
        return mo2978m();
    }

    /* renamed from: p */
    public float m2747p(AbstractC0244am abstractC0244am) {
        if (m2876aV() && abstractC0244am != null) {
            return m2877aU() + this.f1621ch + abstractC0244am.f1621ch;
        }
        return m2877aU();
    }

    /* renamed from: aU */
    public float m2877aU() {
        return mo2978m();
    }

    /* renamed from: q */
    public int m2744q(AbstractC0244am abstractC0244am) {
        LoggerMaybe m1072A = LoggerMaybe.m1072A();
        int i = 0;
        float m2747p = m2747p(abstractC0244am);
        if (m2747p > 58.0f) {
            i = (int) ((m2747p - 41.0f) / (m1072A.f6110bL.f785n * 1.414f));
        }
        return i;
    }

    /* renamed from: aV */
    public boolean m2876aV() {
        return false;
    }

    /* renamed from: q */
    public float mo3060q(int i) {
        return 0.0f;
    }

    /* renamed from: aW */
    public void m2875aW() {
        int mo3084bl = mo3084bl();
        for (int i = 0; i < mo3084bl; i++) {
            if (i < this.f1649cJ.length) {
                C0247ap c0247ap = this.f1649cJ[i];
                if (c0247ap.f1716e > mo2992b(i)) {
                    c0247ap.f1716e = mo2992b(i);
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
    public java.util.ArrayList m2874aX() {
        /*
            Method dump skipped, instructions count: 225
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.corrodinggames.rts.game.units.AbstractC0623y.m2874aX():java.util.ArrayList");
    }

    /* renamed from: r */
    public boolean mo3448r(int i) {
        return true;
    }

    /* renamed from: e */
    public float mo2985e(int i) {
        return 0.0f;
    }

    /* renamed from: s */
    public boolean m2740s(int i) {
        return false;
    }

    /* renamed from: t */
    public float m2739t(int i) {
        return 0.0f;
    }

    /* renamed from: f */
    public float mo2984f(int i) {
        return 4.0f;
    }

    /* renamed from: u */
    public boolean mo3446u(int i) {
        int mo3445v = mo3445v(i);
        if (mo3445v == -1) {
            return this.f1649cJ[i].f1718g;
        }
        return this.f1649cJ[mo3445v].f1718g;
    }

    /* renamed from: v */
    public int mo3445v(int i) {
        return -1;
    }

    /* renamed from: B */
    public float mo3005B() {
        return -1.0f;
    }

    /* renamed from: w */
    public float mo3059w(int i) {
        return -1.0f;
    }

    /* renamed from: x */
    public float m2734x(int i) {
        return 5.0f;
    }

    /* renamed from: y */
    public float mo4196y(int i) {
        return mo3059w(i);
    }

    /* renamed from: E */
    public boolean mo3002E() {
        return false;
    }

    /* renamed from: aY */
    public boolean m2873aY() {
        return false;
    }

    /* renamed from: aZ */
    public float m2872aZ() {
        return 1.0f;
    }

    /* renamed from: ba */
    public float m2822ba() {
        return 1.0f;
    }

    /* renamed from: bb */
    public boolean m2821bb() {
        return mo3071bc() > 0.95f;
    }

    /* renamed from: bc */
    public float mo3071bc() {
        return 0.6f;
    }

    /* renamed from: bd */
    public float mo3294bd() {
        return 0.0f;
    }

    /* renamed from: be */
    public EnumC0307b m2818be() {
        return EnumC0307b.normal;
    }

    /* renamed from: bf */
    public boolean m2817bf() {
        return true;
    }

    /* renamed from: bg */
    public boolean m2816bg() {
        return true;
    }

    /* renamed from: bh */
    public int mo3229bh() {
        return 0;
    }

    /* renamed from: C */
    public float mo3004C() {
        return 99.0f;
    }

    /* renamed from: D */
    public float mo3003D() {
        return 99.0f;
    }

    /* renamed from: bi */
    public boolean mo3219bi() {
        return false;
    }

    /* renamed from: bj */
    public boolean mo3218bj() {
        return false;
    }

    /* renamed from: b */
    public boolean mo3295b(int i, float f) {
        return true;
    }

    /* renamed from: bk */
    public boolean m2812bk() {
        return false;
    }

    /* renamed from: bl */
    public int mo3084bl() {
        return 1;
    }

    /* renamed from: bm */
    public boolean mo4207bm() {
        return true;
    }

    /* renamed from: g */
    public float mo2983g(int i) {
        return 0.0f;
    }

    /* renamed from: z */
    public float m2731z(int i) {
        return 99999.0f;
    }

    /* renamed from: A */
    public float m2974A(int i) {
        return -1.0f;
    }

    /* renamed from: B */
    public float m2972B(int i) {
        return 0.0f;
    }

    /* renamed from: C */
    public float mo3095C(int i) {
        if (this.f1620cg && m2821bb()) {
            return this.f1618ce + 180.0f;
        }
        return this.f1618ce;
    }

    /* renamed from: bn */
    public C1080ai m2809bn() {
        int m2878aT = m2878aT();
        if (m2878aT == -1) {
            return m2968D(0);
        }
        return m2968D(m2878aT);
    }

    /* renamed from: D */
    public C1080ai m2968D(int i) {
        f3984be.m572a(mo3073E(i));
        return f3984be;
    }

    /* renamed from: E */
    public PointF mo3073E(int i) {
        C0247ap c0247ap = this.f1649cJ[i];
        float mo2983g = mo2983g(i);
        float f = mo3002E() ? this.f1618ce : c0247ap.f1712a;
        PointF mo3089G = mo3089G(i);
        f3985bf.m5369a(mo3089G.f227a + (C0758f.m2040i(f) * mo2983g), mo3089G.f228b + (C0758f.m2045h(f) * mo2983g));
        return f3985bf;
    }

    /* renamed from: F */
    public C1080ai m2964F(int i) {
        f3987bh.m572a(mo3089G(i));
        f3987bh.f6851c = 0.0f;
        return f3987bh;
    }

    /* renamed from: G */
    public PointF mo3089G(int i) {
        C0247ap c0247ap = this.f1649cJ[i];
        float f = this.f6957el;
        float f2 = this.f6958em;
        float mo3094H = mo3094H(i);
        if (c0247ap.f1716e != 0.0f && mo3094H != 0.0f) {
            float mo3093I = mo3093I(i);
            float mo3092J = mo3092J(i);
            float f3 = 0.0f;
            float mo2992b = mo2992b(i) - c0247ap.f1716e;
            if (mo2992b < mo3093I) {
                f3 = (mo2992b / mo3093I) * mo3094H;
            } else if (mo2992b < mo3092J + mo3093I) {
                f3 = mo3094H - (((mo2992b - mo3093I) / mo3092J) * mo3094H);
            }
            if (f3 != 0.0f) {
                f += C0758f.m2040i(c0247ap.f1712a) * f3;
                f2 += C0758f.m2045h(c0247ap.f1712a) * f3;
            }
        }
        f3986bg.m5369a(f, f2);
        return f3986bg;
    }

    /* renamed from: H */
    public float mo3094H(int i) {
        return 0.0f;
    }

    /* renamed from: I */
    public float mo3093I(int i) {
        return 4.0f;
    }

    /* renamed from: J */
    public float mo3092J(int i) {
        return 6.0f;
    }

    /* renamed from: K */
    public PointF mo3237K(int i) {
        PointF pointF = f3988bi;
        pointF.m5369a(0.0f, 0.0f);
        C0247ap c0247ap = this.f1649cJ[i];
        pointF.f227a += c0247ap.f1719h;
        pointF.f228b += c0247ap.f1720i;
        return pointF;
    }

    /* renamed from: L */
    public float mo3236L(int i) {
        return 0.6f;
    }

    /* renamed from: M */
    public void m2954M(int i) {
        if (i == -1) {
            int mo3084bl = mo3084bl();
            for (int i2 = 0; i2 < mo3084bl; i2++) {
                m2954M(i2);
            }
            return;
        }
        C0247ap c0247ap = this.f1649cJ[i];
        c0247ap.f1719h = 0.0f;
        c0247ap.f1720i = 0.0f;
        if (this.f3896Q != null && mo3236L(i) != 0.0f) {
            float mo3236L = this.f3896Q.f1621ch * mo3236L(i);
            c0247ap.f1719h += C0758f.m2136a((AbstractC1120w) this, (int) (-mo3236L), (int) mo3236L, 1 + i);
            c0247ap.f1720i += C0758f.m2136a((AbstractC1120w) this, (int) (-mo3236L), (int) mo3236L, 2 + i);
        }
    }

    /* renamed from: a */
    public void m2924a(EnumC0233ab enumC0233ab) {
        m2923a(enumC0233ab, true);
    }

    /* renamed from: a */
    public void m2923a(EnumC0233ab enumC0233ab, boolean z) {
        C0745e m2307d;
        LoggerMaybe m1072A = LoggerMaybe.m1072A();
        if (enumC0233ab == EnumC0233ab.f1509h) {
            m1072A.f6111bM.m2722a(C0631e.f4050p, 0.8f, this.f6957el, this.f6958em);
            m1072A.f6116bR.m2339a(this.f6957el, this.f6958em, this.f6959en);
            m1072A.f6116bR.m2312b(EnumC0748h.f4836e);
            C0745e m2309c = m1072A.f6116bR.m2309c(this.f6957el, this.f6958em, this.f6959en, -1127220);
            if (m2309c != null) {
                m2309c.f4735H = 0.2f;
                m2309c.f4734G = 2.0f;
                m2309c.f4792as = (short) 2;
                m2309c.f4750W = 45.0f;
                m2309c.f4751X = m2309c.f4750W;
                m2309c.f4749V = 0.0f;
            }
        } else if (enumC0233ab == EnumC0233ab.f1505d || enumC0233ab == EnumC0233ab.f1507f || enumC0233ab == EnumC0233ab.f1508g) {
            m1072A.f6111bM.m2722a(C0631e.f4050p, 0.8f, this.f6957el, this.f6958em);
            m1072A.f6116bR.m2339a(this.f6957el, this.f6958em, this.f6959en);
        } else if (enumC0233ab == EnumC0233ab.f1502a) {
            m1072A.f6111bM.m2721a(C0631e.f4049o, 0.4f, 1.0f + C0758f.m2084c(-0.07f, 0.07f), this.f6957el, this.f6958em);
            m1072A.f6116bR.m2318b(this.f6957el, this.f6958em, this.f6959en);
        } else if (enumC0233ab == EnumC0233ab.f1506e) {
            m1072A.f6111bM.m2721a(C0631e.f4049o, 0.8f, 1.0f + C0758f.m2084c(-0.07f, 0.07f), this.f6957el, this.f6958em);
            m1072A.f6116bR.m2318b(this.f6957el, this.f6958em, this.f6959en);
            m1072A.f6116bR.m2312b(EnumC0748h.f4836e);
            C0745e m2309c2 = m1072A.f6116bR.m2309c(this.f6957el, this.f6958em, this.f6959en, -1127220);
            if (m2309c2 != null) {
                m2309c2.f4735H = 0.2f;
                m2309c2.f4734G = 2.0f;
                m2309c2.f4792as = (short) 2;
                m2309c2.f4750W = 45.0f;
                m2309c2.f4751X = m2309c2.f4750W;
                m2309c2.f4749V = 0.0f;
            }
        } else {
            m1072A.f6111bM.m2721a(C0631e.f4049o, 0.8f, 1.0f + C0758f.m2084c(-0.07f, 0.07f), this.f6957el, this.f6958em);
            m1072A.f6116bR.m2318b(this.f6957el, this.f6958em, this.f6959en);
        }
        if (enumC0233ab != EnumC0233ab.f1502a) {
            if (enumC0233ab != EnumC0233ab.f1508g && (m2307d = m1072A.f6116bR.m2307d(this.f6957el, this.f6958em, this.f6959en, 0)) != null) {
                m2307d.f4733F = 0.9f;
            }
            if (z) {
                if (!mo4171bO()) {
                    m2808bo();
                }
                if (enumC0233ab != EnumC0233ab.f1508g && !m4372cJ()) {
                    C0746f.m2296a(this.f6957el, this.f6958em);
                    C0746f.m2288b(this.f6957el, this.f6958em);
                    m2806bq();
                }
            }
        }
    }

    /* renamed from: bo */
    public void m2808bo() {
        LoggerMaybe m1072A = LoggerMaybe.m1072A();
        float f = 1.0f;
        float f2 = 1.0f;
        int mo3356bp = mo3356bp();
        if (mo3356bp >= 10) {
            f = 1.2f;
            f2 = 1.4f;
        }
        if (mo3356bp >= 20) {
            f = 1.5f;
            f2 = 1.7f;
        }
        if (this.f6959en > -1.0f) {
            for (int i = 0; i < mo3356bp; i++) {
                m1072A.f6116bR.m2316b(this.f6957el, this.f6958em, this.f6959en, f, f2);
            }
        }
    }

    /* renamed from: bp */
    public int mo3356bp() {
        if (mo3226db()) {
            return 8;
        }
        if (m4402bI()) {
            return 7;
        }
        return 4;
    }

    /* renamed from: bq */
    public void m2806bq() {
        if (!m4372cJ()) {
            C0195l.m4672a(this.f6957el, this.f6958em);
        }
    }

    /* renamed from: s */
    public int mo3169s() {
        return 15;
    }

    /* renamed from: c */
    public void m2791c(boolean z) {
        int mo3169s;
        LoggerMaybe m1072A = LoggerMaybe.m1072A();
        if (this.f1651cL == null && this.f1652cM == null && (mo3169s = mo3169s()) > 0) {
            m1072A.f6110bL.m4856a(this.f6957el, this.f6958em, mo3169s, this.f1609bV, z);
        }
    }

    /* renamed from: br */
    public void m2805br() {
        LoggerMaybe m1072A = LoggerMaybe.m1072A();
        RectF rectF = new RectF();
        rectF.m5350a(m4356cc());
        rectF.f235b *= m1072A.f6110bL.f786o;
        rectF.f237d *= m1072A.f6110bL.f786o;
        rectF.f234a *= m1072A.f6110bL.f785n;
        rectF.f236c *= m1072A.f6110bL.f785n;
        rectF.m5352a(this.f6957el, this.f6958em);
        rectF.m5352a(-mo3292cX(), -mo3291cY());
        rectF.f235b -= 10.0f;
        rectF.f237d += 10.0f;
        rectF.f234a -= 10.0f;
        rectF.f236c += 10.0f;
        Iterator it = AbstractC0244am.m4405bF().iterator();
        while (it.hasNext()) {
            AbstractC0244am abstractC0244am = (AbstractC0244am) it.next();
            if ((abstractC0244am instanceof AbstractC0244am) && abstractC0244am != this && abstractC0244am.m4430a(rectF)) {
                if ((abstractC0244am instanceof AbstractC0623y) && abstractC0244am.f1607bT) {
                    abstractC0244am.mo2635a();
                }
                if (abstractC0244am instanceof C0243al) {
                    ((C0243al) abstractC0244am).m4439f();
                }
            }
        }
    }

    /* renamed from: c */
    public boolean m2793c(AbstractC0197n abstractC0197n) {
        return m2828b(false, abstractC0197n) == null;
    }

    /* renamed from: a */
    public boolean m2898a(boolean z, AbstractC0197n abstractC0197n) {
        return m2828b(z, abstractC0197n) == null;
    }

    /* renamed from: b */
    public String m2828b(boolean z, AbstractC0197n abstractC0197n) {
        String m3973a;
        LoggerMaybe m1072A = LoggerMaybe.m1072A();
        C0402bc mo4244q = mo5649r().mo4244q();
        if (mo4244q != null && (m3973a = mo4244q.m3973a(this, this.f6957el, this.f6958em)) != null) {
            return m3973a;
        }
        if (mo5649r().mo4245p()) {
            m1072A.f6110bL.m4857a(this.f6957el, this.f6958em);
            C0180g m4803e = m1072A.f6110bL.m4803e(m1072A.f6110bL.f801T, m1072A.f6110bL.f802U);
            if (m4803e == null || !m4803e.f922i) {
                return "{2}";
            }
        }
        if (!z && m2917a((AbstractC0244am) null, abstractC0197n)) {
            return "{0}";
        }
        if (!mo5649r().mo4245p()) {
            Rect cc = m4356cc();
            Point a = m4429a(m1072A.f6110bL, f3989bj);
            int i = a.f224a;
            int i2 = a.f225b;
            InterfaceC0303as r = mo5649r();
            EnumC0246ao mo4246o = r.mo4246o();
            for (int i3 = i + cc.f230a; i3 <= i + cc.f232c; i3++) {
                for (int i4 = i2 + cc.f231b; i4 <= i2 + cc.f233d; i4++) {
                    String m3380a = AbstractC0488d.m3380a(this, r, mo4246o, i3, i4, false, abstractC0197n);
                    if (m3380a != null) {
                        return m3380a;
                    }
                }
            }
            return null;
        }
        return null;
    }

    /* renamed from: N */
    public void m2953N(int i) {
        LoggerMaybe m1072A = LoggerMaybe.m1072A();
        if (!mo5649r().mo4245p()) {
            Rect cc = m4356cc();
            Point a = m4429a(m1072A.f6110bL, f3990bk);
            int i2 = a.f224a;
            int i3 = a.f225b;
            mo5649r();
            int i4 = i2 + cc.f230a;
            int i5 = i3 + cc.f231b;
            int i6 = i2 + cc.f232c;
            int i7 = i3 + cc.f233d;
            if (i != -2) {
                m1072A.f6110bL.m4840a(this, i4, i5, i6, i7, (int) m1072A.f6144cv, (int) m1072A.f6145cw, m1072A.f6113bO, true, i);
            }
        }
    }

    /* renamed from: r */
    public boolean m2742r(AbstractC0244am abstractC0244am) {
        float m2157a = C0758f.m2157a(this.f6957el, this.f6958em, abstractC0244am.f6957el, abstractC0244am.f6958em);
        float f = 9.0f;
        if (!abstractC0244am.m4402bI()) {
            f = this.f1621ch + abstractC0244am.f1621ch;
            if (f < 11.0f) {
                f = 11.0f;
            }
        }
        if (m2157a < f * f) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public boolean m2917a(AbstractC0244am abstractC0244am, AbstractC0197n abstractC0197n) {
        boolean z = false;
        if (!m4402bI()) {
            z = true;
        }
        float f = this.f1621ch + C0348af.f2206p + 10.0f;
        float f2 = this.f6957el - f;
        float f3 = this.f6957el + f;
        float f4 = this.f6958em - f;
        float f5 = this.f6958em + f;
        AbstractC0244am[] m498a = AbstractC0244am.f1590bD.m498a();
        int size = AbstractC0244am.f1590bD.size();
        for (int i = 0; i < size; i++) {
            AbstractC0244am abstractC0244am2 = m498a[i];
            float f6 = abstractC0244am2.f6957el;
            float f7 = abstractC0244am2.f6958em;
            if (f2 <= f6 && f6 <= f3 && f4 <= f7 && f7 <= f5 && abstractC0244am2 != this && ((z || abstractC0244am2.m4402bI()) && !abstractC0244am2.f1607bT && m2742r(abstractC0244am2) && abstractC0244am2 != abstractC0244am && (abstractC0197n == null || abstractC0244am2.m4336d(abstractC0197n)))) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: bs */
    public AbstractC0623y m2804bs() {
        Iterator it = AbstractC0244am.f1590bD.iterator();
        while (it.hasNext()) {
            AbstractC0244am abstractC0244am = (AbstractC0244am) it.next();
            if (abstractC0244am != this && (abstractC0244am instanceof AbstractC0623y)) {
                AbstractC0623y abstractC0623y = (AbstractC0623y) abstractC0244am;
                if (!abstractC0623y.f1607bT && abstractC0623y.f1609bV == this.f1609bV && abstractC0623y.mo5649r() == mo5649r() && m4301t(abstractC0623y)) {
                    return abstractC0623y;
                }
            }
        }
        return null;
    }

    /* renamed from: a */
    public void mo2635a() {
        if (this.f1652cM != null) {
            m2799bx();
        }
        m2845az();
        m2889aI();
        super.mo2635a();
    }

    /* renamed from: bt */
    public void m2803bt() {
        m2909a((AbstractC0623y) null);
        this.f3896Q = null;
        m2845az();
        m2889aI();
    }

    /* renamed from: bu */
    public void m2802bu() {
        if (this.f1652cM != null) {
            m2799bx();
        }
        super.m4388bu();
    }

    /* renamed from: bv */
    public void m2801bv() {
        super.m4387bv();
    }

    /* renamed from: bw */
    public int m2800bw() {
        return (((((((((((0 * 31) + super.m4386bw()) * 31) + ((int) (mo2976z() * 100.0f))) * 31) + ((int) (mo3006A() * 100.0f))) * 31) + ((int) (mo2978m() * 100.0f))) * 31) + ((int) mo2992b(0))) * 31) + ((int) (mo3004C() * 100.0f));
    }

    /* renamed from: m */
    PointF m2756m(float f) {
        PointF m2753n = m2753n(f);
        f1694dC.m5369a(this.f6957el + m2753n.f227a, this.f6958em + m2753n.f228b);
        return f1694dC;
    }

    /* renamed from: n */
    public PointF m2753n(float f) {
        float f2 = 0.0f;
        float f3 = 0.0f;
        if (mo2998I() && this.f3888b == 0.0f) {
            if (mo3219bi()) {
                f2 = this.f1614ca * f;
                f3 = this.f1615cb * f;
            } else if (this.f1617cd != 0.0f) {
                float f4 = this.f1618ce;
                if (mo3218bj()) {
                    f4 = this.f1619cf;
                }
                float mo2976z = mo2976z() * this.f1617cd * f;
                f2 = C0758f.m2040i(f4) * mo2976z;
                f3 = C0758f.m2045h(f4) * mo2976z;
            }
        }
        f3991bl.m5369a(f2, f3);
        return f3991bl;
    }

    /* renamed from: a */
    public boolean m2922a(EnumC0238ag enumC0238ag) {
        return false;
    }

    /* renamed from: a */
    public void m2926a(AbstractC0224s abstractC0224s) {
    }

    /* renamed from: a */
    public boolean m2925a(AbstractC0224s abstractC0224s, float f, float f2) {
        return true;
    }

    /* renamed from: a */
    public void m2920a(AbstractC0244am abstractC0244am, float f, int i) {
        this.f3899T = C0758f.m2159a(this.f3899T, f);
        if (this.f3899T == 0.0f) {
            this.f3899T = 5.0f;
            if (mo3246p_()) {
                C1080ai m2809bn = m2809bn();
                C0745e m2313b = LoggerMaybe.m1072A().f6116bR.m2313b(m2809bn.f6849a, m2809bn.f6850b, this.f6959en + m2809bn.f6851c, EnumC0744d.f4707a, false, EnumC0748h.f4833b);
                if (m2313b != null) {
                    float m2071d = C0758f.m2071d(m2809bn.f6849a, m2809bn.f6850b, (float) (abstractC0244am.f6957el + (-8.0d) + (Math.random() * 16.0d)), (float) (abstractC0244am.f6958em + (-8.0d) + (Math.random() * 16.0d)));
                    m2313b.f4744Q = C0758f.m2040i(m2071d) * C0758f.m2084c(2.0f, 4.0f);
                    m2313b.f4745R = C0758f.m2045h(m2071d) * C0758f.m2084c(2.0f, 4.0f);
                    m2313b.f4767aq = 6;
                    m2313b.f4750W = 20.0f;
                    m2313b.f4751X = m2313b.f4750W;
                    m2313b.f4725s = true;
                    m2313b.f4733F = 0.8f;
                    m2313b.f4735H = 0.2f;
                    m2313b.f4734G = 1.0f;
                }
            }
        }
    }

    /* renamed from: b */
    public void m2837b(AbstractC0244am abstractC0244am, float f, int i) {
        this.f3899T = C0758f.m2159a(this.f3899T, f);
        if (this.f3899T == 0.0f) {
            this.f3899T = 5.0f;
            if (mo3246p_()) {
                PointF mo3073E = mo3073E(0);
                C0745e m2313b = LoggerMaybe.m1072A().f6116bR.m2313b(abstractC0244am.f6957el, abstractC0244am.f6958em, abstractC0244am.f6959en, EnumC0744d.f4707a, false, EnumC0748h.f4833b);
                if (m2313b != null) {
                    float m2071d = C0758f.m2071d(abstractC0244am.f6957el, abstractC0244am.f6958em - abstractC0244am.f6959en, (float) (mo3073E.f227a + (-8.0d) + (Math.random() * 16.0d)), (float) (mo3073E.f228b + (-8.0d) + (Math.random() * 16.0d)));
                    m2313b.f4744Q = C0758f.m2040i(m2071d) * C0758f.m2084c(2.0f, 4.0f);
                    m2313b.f4745R = C0758f.m2045h(m2071d) * C0758f.m2084c(2.0f, 4.0f);
                    m2313b.f4767aq = 5;
                    m2313b.f4750W = 20.0f;
                    m2313b.f4751X = m2313b.f4750W;
                    m2313b.f4725s = true;
                    m2313b.f4733F = 0.8f;
                    m2313b.f4735H = 0.2f;
                    m2313b.f4734G = 1.0f;
                }
            }
        }
    }

    /* renamed from: a */
    public C0625z m2911a(C0305au c0305au, InterfaceC0303as interfaceC0303as, int i, float f, float f2) {
        LoggerMaybe m1072A = LoggerMaybe.m1072A();
        AbstractC0224s m2914a = m2914a(interfaceC0303as, i, false);
        if (m2914a == null) {
            LoggerMaybe.m983b("Unit '" + mo5649r().mo4252i() + "' can not build:" + interfaceC0303as.mo4252i());
            return f3992bm.m2730a();
        }
        if (!c0305au.f1805n) {
            if (m2914a.mo4123g(this)) {
                LoggerMaybe.m983b("Builder '" + mo5649r().mo4252i() + "' tried to build a locked building:" + m2914a.m4506O());
                return f3992bm.m2730a();
            } else if (!m2914a.mo3025b(this) && !m2914a.m4491u(this)) {
                LoggerMaybe.m983b("Builder '" + mo5649r().mo4252i() + "' tried to build a unavailable building:" + m2914a.m4506O() + " (add isLocked:false to fix)");
                return f3992bm.m2730a();
            }
        }
        if (!interfaceC0303as.mo4250k() && !m2914a.mo4489x() && this.f1609bV.m4552u() >= this.f1609bV.m4551v()) {
            if (this.f1609bV == m1072A.f6099bs) {
                m1072A.f6117bS.m1806b(m1072A.f6117bS.f5112d.f4947an);
            }
            return f3992bm.m2730a();
        } else if (AbstractC0244am.m4425a(interfaceC0303as) == null) {
            String str = "{build is null}";
            if (c0305au.f1798b != null) {
                str = c0305au.f1798b.mo4252i();
            }
            LoggerMaybe.LogDebug2("Build unit type missing: " + str);
            return f3992bm.m2730a();
        } else {
            AbstractC0244am m3374g = AbstractC0488d.m3374g(interfaceC0303as);
            if (!C0424b.m3894b(interfaceC0303as.mo4243u(), m2914a.mo4138B()) || !C0424b.m3894b(interfaceC0303as.mo4266B(), m2914a.mo4115o_())) {
                m3374g.f1583bw = m2914a.mo4138B();
                m3374g.f1584bx = m2914a.mo4115o_();
            }
            if (m2914a instanceof C0213h) {
                m3374g.f1583bw = null;
                m3374g.f1584bx = null;
            }
            m3374g.f1624ck = 0.0f;
            m3374g.f1625cl = 0.0f;
            m1072A.f6110bL.m4822b((f - m3374g.mo3292cX()) + 1.0f, (f2 - m3374g.mo3291cY()) + 1.0f);
            m3374g.f6957el = m1072A.f6110bL.f801T + m3374g.mo3292cX();
            m3374g.f6958em = m1072A.f6110bL.f802U + m3374g.mo3291cY();
            m3374g.m4312f(this.f1609bV);
            m3374g.m4437B(this);
            if (i != 1 && (m3374g instanceof AbstractC0623y)) {
                ((AbstractC0623y) m3374g).mo3174a(i);
            }
            m3374g.m4367cO();
            if (m3374g instanceof AbstractC0623y) {
                AbstractC0623y abstractC0623y = (AbstractC0623y) m3374g;
                boolean z = false;
                AbstractC0623y abstractC0623y2 = null;
                if (m2859al()) {
                    abstractC0623y2 = this;
                } else if (!this.f1606bS && !m4402bI()) {
                    abstractC0623y2 = this;
                }
                if (abstractC0623y.m2917a(abstractC0623y2, (AbstractC0197n) null)) {
                    z = true;
                }
                if (!z && !abstractC0623y.m2898a(true, (AbstractC0197n) null)) {
                    z = true;
                }
                if (z) {
                    m3374g.mo2635a();
                    C0625z m2730a = f3992bm.m2730a();
                    AbstractC0623y m2804bs = ((AbstractC0623y) m3374g).m2804bs();
                    m2730a.f4001b = m2804bs;
                    m2730a.f4003d = m2914a;
                    if (m2804bs == null) {
                    }
                    return m2730a;
                }
            }
            C0424b mo4138B = m2914a.mo4138B();
            if (c0305au.f1805n) {
                mo4138B = C0424b.f2710a;
            }
            if (!mo4138B.m3921c(this)) {
                m3374g.mo2635a();
                C0625z m2730a2 = f3992bm.m2730a();
                this.f3895P = m1072A.f6102by;
                if (this.f3902U < 1000.0f) {
                    m2730a2.f4002c = true;
                    C0741a m2355a = C0741a.m2355a(this.f1609bV, m3374g.f6957el, m3374g.f6958em);
                    if (m2355a != null) {
                        m2355a.f4654i = true;
                    }
                }
                return m2730a2;
            }
            m2754m(m3374g);
            if (m3374g instanceof AbstractC0623y) {
                AbstractC0623y abstractC0623y3 = (AbstractC0623y) m3374g;
                abstractC0623y3.m2805br();
                if (m3374g.m4402bI()) {
                    m1072A.f6119bU.m1150a(abstractC0623y3);
                }
            }
            AbstractC0197n.m4598c(m3374g);
            C0625z m2730a3 = f3992bm.m2730a();
            m2730a3.f4000a = m3374g;
            m2730a3.f4003d = m2914a;
            return m2730a3;
        }
    }

    /* renamed from: a */
    public boolean m2906a(AbstractC0623y abstractC0623y, C0399m c0399m) {
        return false;
    }

    /* renamed from: b */
    public boolean m2832b(AbstractC0623y abstractC0623y) {
        return false;
    }

    /* renamed from: bx */
    public void m2799bx() {
        if (this.f1652cM == null) {
            return;
        }
        if (this.f1652cM.f1607bT) {
        }
        if (!this.f1652cM.m2832b(this)) {
            LoggerMaybe.m983b("Deattach failed, forcing deattach. Child:" + m4337cz() + " Parent:" + this.f1652cM.m4337cz());
            this.f1652cM = null;
            this.f1653cN = null;
        }
    }

    /* renamed from: a */
    public C0399m m2900a(short s) {
        return null;
    }

    /* renamed from: a */
    public static AbstractC0244am m2908a(AbstractC0623y abstractC0623y, float f, float f2, float f3, C0449h c0449h) {
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
        LoggerMaybe.m1072A().f6127cc.m3160a(f, f2, f3, abstractC0623y, 0.0f, f3993bn);
        return f3993bn.f1515e;
    }

    /* renamed from: by */
    public C0424b m2798by() {
        return C0424b.f2710a;
    }

    /* renamed from: bz */
    public C1101m m2797bz() {
        return f3995bp;
    }

    /* renamed from: bA */
    public boolean mo4454bA() {
        return false;
    }

    /* renamed from: bB */
    public int mo4453bB() {
        return 0;
    }

    /* renamed from: bC */
    public void m2825bC() {
        C0424b m3909a;
        C0424b m2823bE = m2823bE();
        C0424b m2824bD = m2824bD();
        if (m2823bE == null) {
            m3909a = m2824bD;
        } else if (m2824bD == null) {
            m3909a = m2823bE;
        } else {
            m3909a = C0424b.m3909a(m2823bE, m2824bD);
        }
        if (this.f1699dH == null && m3909a == null) {
            return;
        }
        if (this.f1699dH != null && m3909a != null && this.f1699dH.m3895b(m3909a)) {
            return;
        }
        AbstractC0197n.m4614b((AbstractC0244am) this);
        this.f1699dH = m3909a;
        AbstractC0197n.m4598c(this);
    }

    /* renamed from: bD */
    public C0424b m2824bD() {
        return null;
    }

    /* renamed from: bE */
    public C0424b m2823bE() {
        C0305au m2853ar;
        AbstractC0244am m2946X = m2946X();
        if (m2946X != null && (m2853ar = m2853ar()) != null) {
            if (m2853ar.f1797a == EnumC0306av.repair && m2946X.f1624ck < 1.0f) {
                C0424b m2776g = m2776g(m2946X);
                float m2871a_ = m2871a_(m2946X) * 60.0f;
                if (m2776g != null) {
                    return C0424b.m3910a(m2776g, -m2871a_);
                }
            }
            if (m2853ar.f1797a == EnumC0306av.reclaim) {
                if (m2946X.f1624ck < 1.0f) {
                    C0424b m2776g2 = m2776g(m2946X);
                    float m2780f = m2780f(m2946X) * 60.0f;
                    if (m2776g2 != null) {
                        return C0424b.m3910a(m2776g2, m2780f);
                    }
                    return null;
                } else if (m4298y(m2946X)) {
                    float z = m4297z(m2946X);
                    C0424b m4370cL = m2946X.m4370cL();
                    C0424b m4369cM = m2946X.m4369cM();
                    if (m4369cM != null) {
                        m4370cL = m4369cM;
                    }
                    return C0424b.m3910a(m4370cL, (z * 60.0f) / m2946X.f1633ct);
                } else {
                    return null;
                }
            }
            return null;
        }
        return null;
    }
}
