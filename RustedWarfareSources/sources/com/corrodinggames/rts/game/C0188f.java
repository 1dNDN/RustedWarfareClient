package com.corrodinggames.rts.game;

import android.graphics.Color;
import android.graphics.LightingColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import com.corrodinggames.rts.C0067R;
import com.corrodinggames.rts.game.units.AbstractC0244am;
import com.corrodinggames.rts.game.units.AbstractC0623y;
import com.corrodinggames.rts.game.units.C0619u;
import com.corrodinggames.rts.game.units.EnumC0246ao;
import com.corrodinggames.rts.game.units.InterfaceC0303as;
import com.corrodinggames.rts.game.units.custom.C0382aw;
import com.corrodinggames.rts.game.units.custom.C0413bn;
import com.corrodinggames.rts.game.units.custom.C0448g;
import com.corrodinggames.rts.game.units.custom.C0449h;
import com.corrodinggames.rts.game.units.custom.C0451j;
import com.corrodinggames.rts.game.units.custom.C0467y;
import com.corrodinggames.rts.game.units.custom.EnumC0347ae;
import com.corrodinggames.rts.game.units.custom.EnumC0383ax;
import com.corrodinggames.rts.game.units.p024d.AbstractC0488d;
import com.corrodinggames.rts.gameFramework.AbstractC0668az;
import com.corrodinggames.rts.gameFramework.AbstractC1120w;
import com.corrodinggames.rts.gameFramework.C0758f;
import com.corrodinggames.rts.gameFramework.LoggerMaybe;
import com.corrodinggames.rts.gameFramework.p030a.C0631e;
import com.corrodinggames.rts.gameFramework.p035d.C0745e;
import com.corrodinggames.rts.gameFramework.p035d.C0746f;
import com.corrodinggames.rts.gameFramework.p035d.C0747g;
import com.corrodinggames.rts.gameFramework.p035d.EnumC0744d;
import com.corrodinggames.rts.gameFramework.p035d.EnumC0748h;
import com.corrodinggames.rts.gameFramework.p041i.EnumC0878m;
import com.corrodinggames.rts.gameFramework.p041i.Reader;
import com.corrodinggames.rts.gameFramework.p041i.StreamWriter;
import com.corrodinggames.rts.gameFramework.p044l.C0930ag;
import com.corrodinggames.rts.gameFramework.p044l.C0934e;
import com.corrodinggames.rts.gameFramework.p044l.InterfaceC1027y;
import com.corrodinggames.rts.gameFramework.utility.C1080ai;
import com.corrodinggames.rts.gameFramework.utility.C1101m;
import com.corrodinggames.rts.gameFramework.utility.C1112u;
import com.corrodinggames.rts.gameFramework.utility.C1117y;
import com.corrodinggames.rts.gameFramework.utility.SlickToAndroidKeycodes;
import java.util.Iterator;

/* renamed from: com.corrodinggames.rts.game.f */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/f.class */
public class C0188f extends AbstractC0668az {

    /* renamed from: g */
    public C0189g f981g;

    /* renamed from: h */
    public float f982h;

    /* renamed from: i */
    public float f983i;

    /* renamed from: j */
    public AbstractC0244am f984j;

    /* renamed from: k */
    public short f985k;

    /* renamed from: l */
    public AbstractC0244am f986l;

    /* renamed from: m */
    public boolean f987m;

    /* renamed from: n */
    public float f988n;

    /* renamed from: o */
    public float f989o;

    /* renamed from: p */
    public float f990p;

    /* renamed from: q */
    public C0188f f991q;

    /* renamed from: r */
    public float f992r;

    /* renamed from: s */
    public float f993s;

    /* renamed from: t */
    public float f994t;

    /* renamed from: u */
    public float f995u;

    /* renamed from: v */
    public float f996v;

    /* renamed from: w */
    public float f997w;

    /* renamed from: x */
    public float f998x;

    /* renamed from: y */
    public float f999y;

    /* renamed from: z */
    public boolean f1000z;

    /* renamed from: A */
    public boolean f1001A;

    /* renamed from: B */
    public boolean f1002B;

    /* renamed from: C */
    public boolean f1003C;

    /* renamed from: D */
    public boolean f1004D;

    /* renamed from: E */
    public boolean f1005E;

    /* renamed from: F */
    public float f1006F;

    /* renamed from: G */
    public boolean f1007G;

    /* renamed from: H */
    public float f1008H;

    /* renamed from: I */
    public float f1009I;

    /* renamed from: J */
    public float f1010J;

    /* renamed from: K */
    public float f1011K;

    /* renamed from: L */
    public float f1012L;

    /* renamed from: M */
    public boolean f1013M;

    /* renamed from: N */
    public float f1014N;

    /* renamed from: O */
    public float[] f1015O;

    /* renamed from: P */
    public short f1016P;

    /* renamed from: Q */
    public short f1017Q;

    /* renamed from: R */
    public short f1018R;

    /* renamed from: S */
    public boolean f1019S;

    /* renamed from: T */
    public boolean f1020T;

    /* renamed from: U */
    public float f1021U;

    /* renamed from: V */
    public boolean f1022V;

    /* renamed from: W */
    public float f1023W;

    /* renamed from: X */
    public float f1024X;

    /* renamed from: Y */
    public float f1025Y;

    /* renamed from: Z */
    public float f1026Z;

    /* renamed from: aa */
    public boolean f1027aa;

    /* renamed from: ab */
    public boolean f1028ab;

    /* renamed from: ac */
    public boolean f1029ac;

    /* renamed from: ad */
    public boolean f1030ad;

    /* renamed from: ae */
    public boolean f1031ae;

    /* renamed from: af */
    public boolean f1032af;

    /* renamed from: ag */
    public float f1033ag;

    /* renamed from: ah */
    public float f1034ah;

    /* renamed from: ai */
    public float f1035ai;

    /* renamed from: aj */
    public float f1036aj;

    /* renamed from: ak */
    public float f1037ak;

    /* renamed from: al */
    public float f1038al;

    /* renamed from: am */
    public float f1039am;

    /* renamed from: an */
    public float f1040an;

    /* renamed from: ao */
    public boolean f1041ao;

    /* renamed from: ap */
    public C1101m f1042ap;

    /* renamed from: ar */
    public int f1043ar;

    /* renamed from: as */
    public boolean f1044as;

    /* renamed from: at */
    public boolean f1045at;

    /* renamed from: au */
    public AbstractC1120w f1046au;

    /* renamed from: av */
    public int f1047av;

    /* renamed from: aw */
    public float f1048aw;

    /* renamed from: ax */
    public float f1049ax;

    /* renamed from: ay */
    public float f1050ay;

    /* renamed from: az */
    public float f1051az;

    /* renamed from: aA */
    public float f1052aA;

    /* renamed from: aB */
    public boolean f1053aB;

    /* renamed from: aC */
    public boolean f1054aC;

    /* renamed from: aD */
    public int f1055aD;

    /* renamed from: aE */
    public C0449h f1056aE;

    /* renamed from: aF */
    public float f1057aF;

    /* renamed from: aG */
    public boolean f1058aG;

    /* renamed from: aH */
    public boolean f1059aH;

    /* renamed from: aI */
    public float f1060aI;

    /* renamed from: aJ */
    public float f1061aJ;

    /* renamed from: aK */
    public boolean f1062aK;

    /* renamed from: aL */
    public float f1063aL;

    /* renamed from: aM */
    public boolean f1064aM;

    /* renamed from: aN */
    public float f1065aN;

    /* renamed from: aO */
    public float f1066aO;

    /* renamed from: aP */
    public C0745e f1067aP;

    /* renamed from: aQ */
    public boolean f1068aQ;

    /* renamed from: aR */
    public boolean f1069aR;

    /* renamed from: bn */
    private boolean f1070bn;

    /* renamed from: aS */
    public boolean f1071aS;

    /* renamed from: aT */
    public float f1072aT;

    /* renamed from: aU */
    public boolean f1073aU;

    /* renamed from: aV */
    float f1074aV;

    /* renamed from: aW */
    float f1075aW;

    /* renamed from: aX */
    float f1076aX;

    /* renamed from: aY */
    public boolean f1077aY;

    /* renamed from: aZ */
    public boolean f1078aZ;

    /* renamed from: bi */
    public static final C1112u f1079bi;

    /* renamed from: bj */
    public C0930ag f1080bj;

    /* renamed from: bk */
    public static C0930ag f1081bk;

    /* renamed from: bl */
    public static int f1082bl;

    /* renamed from: a */
    public static final C1101m f1083a = new C1101m();

    /* renamed from: bm */
    private static final C0188f f1084bm = new C0188f(true);

    /* renamed from: b */
    static C0934e f1085b = null;

    /* renamed from: c */
    static C0934e f1086c = null;

    /* renamed from: d */
    static C0934e f1087d = null;

    /* renamed from: e */
    static final Rect f1088e = new Rect();

    /* renamed from: f */
    static final RectF f1089f = new RectF();

    /* renamed from: aq */
    static final int f1090aq = Color.m5435a(255, 255, 255, 255);

    /* renamed from: ba */
    public static final C0930ag f1091ba = new C0930ag();

    /* renamed from: bb */
    public static final Paint f1092bb = new Paint();

    /* renamed from: bd */
    public static final Paint f1093bd = new Paint();

    /* renamed from: be */
    public static final Paint f1094be = new Paint();

    /* renamed from: bf */
    public static final Paint f1095bf = new Paint();

    /* renamed from: bg */
    public static final Paint f1096bg = new Paint();

    /* renamed from: bh */
    public static final Paint f1097bh = new Paint();

    /* renamed from: bc */
    public static final Paint f1098bc = new C0930ag();

    static {
        f1098bc.m5398b(-16777216);
        f1098bc.m5393c(108);
        f1093bd.m5420a(80, 255, 0, 0);
        f1093bd.mo894a(true);
        f1093bd.m5423a(5.0f);
        f1094be.m5420a(30, 255, 0, 0);
        f1094be.mo894a(true);
        f1094be.m5423a(8.0f);
        f1095bf.m5420a(80, 128, 166, 255);
        f1095bf.mo894a(true);
        f1095bf.m5423a(5.0f);
        f1096bg.m5420a(150, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_WAKEUP, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_TV_SATELLITE_CS, 255);
        f1096bg.mo894a(true);
        f1096bg.m5423a(3.0f);
        f1097bh.m5420a(110, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_WAKEUP, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_TV_SATELLITE_CS, 255);
        f1097bh.mo894a(true);
        f1097bh.m5423a(8.0f);
        f1079bi = new C1112u();
        f1081bk = null;
        f1082bl = 0;
    }

    public C0188f(boolean z) {
        super(z);
        this.f981g = C0189g.f1099a;
        this.f985k = (short) -1;
        this.f992r = -1.0f;
        this.f993s = 0.1f;
        this.f998x = 2.0f;
        this.f999y = -1.0f;
        this.f1000z = true;
        this.f1008H = 1.0f;
        this.f1016P = (short) -1;
        this.f1017Q = (short) -1;
        this.f1018R = (short) 0;
        this.f1019S = true;
        this.f1022V = false;
        this.f1023W = 0.0f;
        this.f1024X = 0.0f;
        this.f1028ab = false;
        this.f1029ac = false;
        this.f1030ad = false;
        this.f1031ae = true;
        this.f1035ai = 1.0f;
        this.f1036aj = 1.0f;
        this.f1037ak = 1.0f;
        this.f1038al = 1.0f;
        this.f1039am = 1.0f;
        this.f1043ar = f1090aq;
        this.f1047av = -1;
        this.f1060aI = 40.0f;
        this.f1061aJ = 60.0f;
        this.f1062aK = false;
        this.f1063aL = 2.0f;
        this.f1069aR = true;
        this.f1072aT = 0.0f;
        if (!z) {
            f1083a.add(this);
        }
    }

    /* renamed from: a */
    public void mo2635a() {
        f1083a.remove(this);
        super.mo2635a();
    }

    /* renamed from: a */
    public static C0188f m4720a(C0188f c0188f) {
        C0188f c0188f2 = f1084bm;
        c0188f2.f1055aD = -1;
        if (c0188f == null) {
            c0188f2.f1039am = 1.0f;
            c0188f2.f1037ak = 1.0f;
            c0188f2.f1038al = 1.0f;
            c0188f2.f1040an = 0.0f;
        } else {
            c0188f2.f1039am = c0188f.f1039am;
            c0188f2.f1037ak = c0188f.f1037ak;
            c0188f2.f1038al = c0188f.f1038al;
            c0188f2.f1040an = c0188f.f1040an;
        }
        return c0188f2;
    }

    /* renamed from: a */
    public void m4717a(AbstractC0244am abstractC0244am, float f, float f2, float f3) {
        this.f984j = abstractC0244am;
        this.f6957el = f;
        this.f6958em = f2;
        this.f6959en = f3;
        this.f1070bn = false;
        this.f1022V = false;
    }

    /* renamed from: b */
    public void m4714b() {
        if (this.f1004D) {
            LoggerMaybe m1072A = LoggerMaybe.m1072A();
            C0745e m2307d = m1072A.f6116bR.m2307d(this.f6957el, this.f6958em, this.f6959en, 0);
            if (m2307d != null) {
                m2307d.f4735H = 0.7f;
                m2307d.f4734G = 2.1f;
                m2307d.f4792as = (short) 2;
                m2307d.f4750W = 90.0f;
                m2307d.f4751X = m2307d.f4750W;
            }
            m1072A.f6111bM.m2722a(C0631e.f4050p, 0.8f, this.f6957el, this.f6958em);
        }
        mo2635a();
    }

    /* renamed from: a */
    public void mo2292a(StreamWriter streamWriter) {
        streamWriter.mo1320a(this.f982h);
        streamWriter.mo1318a(this.f984j);
        streamWriter.mo1318a(this.f986l);
        streamWriter.mo1320a(this.f994t);
        streamWriter.WriteInteger(99);
        streamWriter.mo1314a(this.f1001A);
        streamWriter.mo1314a(this.f1002B);
        streamWriter.mo1314a(this.f1019S);
        streamWriter.mo1314a(this.f1020T);
        streamWriter.mo1320a(this.f1021U);
        streamWriter.mo1320a(this.f1025Y);
        streamWriter.mo1320a(this.f1026Z);
        streamWriter.WriteInteger(this.f1043ar);
        streamWriter.mo1314a(this.f1059aH);
        streamWriter.mo1320a(this.f1060aI);
        streamWriter.mo1320a(this.f1061aJ);
        streamWriter.mo1314a(this.f1062aK);
        streamWriter.mo1320a(this.f1063aL);
        streamWriter.mo1314a(this.f1064aM);
        streamWriter.mo1320a(this.f1065aN);
        streamWriter.mo1314a(this.f1068aQ);
        streamWriter.mo1314a(this.f1069aR);
        streamWriter.mo1314a(this.f1070bn);
        streamWriter.mo1314a(this.f1071aS);
        streamWriter.mo1314a(this.f1013M);
        streamWriter.mo1315a(this.f1016P);
        streamWriter.mo1320a(this.f992r);
        streamWriter.mo1320a(this.f993s);
        streamWriter.mo1314a(this.f1044as);
        streamWriter.mo1314a(this.f1045at);
        streamWriter.mo1320a(this.f1051az);
        streamWriter.mo1320a(this.f1052aA);
        streamWriter.mo1314a(this.f1053aB);
        streamWriter.mo1314a(this.f1054aC);
        streamWriter.mo1314a(false);
        streamWriter.mo1320a(0.0f);
        streamWriter.mo1320a(0.0f);
        streamWriter.mo1314a(this.f1005E);
        streamWriter.mo1320a(this.f1006F);
        streamWriter.mo1320a(this.f1010J);
        streamWriter.mo1320a(this.f1011K);
        streamWriter.mo1320a(this.f1012L);
        streamWriter.mo1314a(this.f987m);
        streamWriter.mo1320a(this.f988n);
        streamWriter.mo1320a(this.f989o);
        streamWriter.mo1314a(this.f1003C);
        streamWriter.mo1314a(this.f1004D);
        streamWriter.mo1367a(this.f991q);
        streamWriter.mo1320a(this.f1074aV);
        streamWriter.mo1320a(this.f1075aW);
        streamWriter.mo1320a(this.f1076aX);
        streamWriter.mo1314a(this.f1022V);
        streamWriter.mo1320a(this.f1023W);
        streamWriter.mo1320a(this.f1024X);
        streamWriter.mo1314a(this.f1073aU);
        streamWriter.mo1315a(this.f1018R);
        streamWriter.mo1314a(this.f1041ao);
        streamWriter.m1382a(this.f1042ap);
        streamWriter.mo1315a(this.f1017Q);
        streamWriter.mo1320a(this.f998x);
        streamWriter.mo1314a(this.f1027aa);
        streamWriter.mo1314a(this.f1030ad);
        streamWriter.mo1314a(this.f1007G);
        streamWriter.mo1320a(this.f1008H);
        streamWriter.mo1314a(this.f1031ae);
        streamWriter.mo1314a(this.f1058aG);
        streamWriter.mo1314a(this.f1000z);
        streamWriter.mo1320a(this.f999y);
        streamWriter.mo1320a(this.f1066aO);
        streamWriter.mo1320a(this.f983i);
        streamWriter.mo1314a(this.f1077aY);
        streamWriter.mo1314a(this.f1032af);
        streamWriter.mo1320a(this.f1033ag);
        streamWriter.mo1320a(this.f1034ah);
        streamWriter.mo1320a(this.f1035ai);
        streamWriter.mo1320a(this.f1036aj);
        streamWriter.WriteInteger(0);
        streamWriter.mo1320a(0.0f);
        streamWriter.mo1320a(0.0f);
        streamWriter.mo1370a((InterfaceC0303as) null);
        streamWriter.WriteInteger(0);
        streamWriter.mo1314a(false);
        C0448g.m3752a(this.f1056aE, streamWriter);
        streamWriter.mo1320a(this.f1037ak);
        streamWriter.mo1320a(this.f1038al);
        streamWriter.mo1314a(this.f1028ab);
        streamWriter.mo1314a(this.f1029ac);
        streamWriter.mo1320a(this.f1040an);
        streamWriter.mo1314a(false);
        C0189g.m4707a(this.f981g, streamWriter);
        boolean z = (this.f1046au == null || this.f1046au.f6952eg) ? false : true;
        streamWriter.mo1314a(z);
        if (z) {
            streamWriter.mo1367a(this.f1046au);
            streamWriter.mo1320a(this.f1048aw);
            streamWriter.mo1320a(this.f1049ax);
            streamWriter.mo1320a(this.f1050ay);
        }
        streamWriter.mo1315a(this.f985k);
        streamWriter.WriteInteger(this.f1055aD);
        streamWriter.mo1320a(this.f1039am);
        streamWriter.mo1320a(this.f990p);
        streamWriter.WriteInteger(this.f1047av);
        super.mo2292a(streamWriter);
    }

    /* renamed from: a */
    public void mo2291a(Reader reader) {
        this.f982h = reader.m1285g();
        this.f984j = reader.m1277o();
        this.f986l = reader.m1302a(EnumC0878m.f5870a);
        this.f994t = reader.m1285g();
        this.f998x = reader.ReadInt();
        this.f1001A = reader.ReadBool();
        this.f1002B = reader.ReadBool();
        this.f1019S = reader.ReadBool();
        this.f1020T = reader.ReadBool();
        this.f1021U = reader.m1285g();
        this.f1025Y = reader.m1285g();
        this.f1026Z = reader.m1285g();
        this.f1043ar = reader.ReadInt();
        this.f1059aH = reader.ReadBool();
        this.f1060aI = reader.m1285g();
        this.f1061aJ = reader.m1285g();
        this.f1062aK = reader.ReadBool();
        this.f1063aL = reader.m1285g();
        this.f1064aM = reader.ReadBool();
        this.f1065aN = reader.m1285g();
        this.f1068aQ = reader.ReadBool();
        this.f1069aR = reader.ReadBool();
        this.f1070bn = reader.ReadBool();
        if (reader.m1295b() >= 7) {
            this.f1071aS = reader.ReadBool();
        }
        if (reader.m1295b() >= 13) {
            this.f1013M = reader.ReadBool();
            this.f1016P = reader.m1270v();
        }
        if (reader.m1295b() >= 16) {
            this.f992r = reader.m1285g();
            this.f993s = reader.m1285g();
        }
        if (reader.m1295b() >= 17) {
            this.f1044as = reader.ReadBool();
            this.f1045at = reader.ReadBool();
            this.f1051az = reader.m1285g();
            this.f1052aA = reader.m1285g();
            this.f1053aB = reader.ReadBool();
            this.f1054aC = reader.ReadBool();
        }
        if (reader.m1295b() >= 18) {
            reader.ReadBool();
            reader.m1285g();
            reader.m1285g();
        }
        if (reader.m1295b() >= 28) {
            this.f1005E = reader.ReadBool();
            this.f1006F = reader.m1285g();
            this.f1010J = reader.m1285g();
            this.f1011K = reader.m1285g();
            this.f1012L = reader.m1285g();
        }
        if (reader.m1295b() >= 29) {
            this.f987m = reader.ReadBool();
            this.f988n = reader.m1285g();
            this.f989o = reader.m1285g();
            this.f1003C = reader.ReadBool();
            this.f1004D = reader.ReadBool();
            this.f991q = (C0188f) reader.m1300a(C0188f.class);
            this.f1074aV = reader.m1285g();
            this.f1075aW = reader.m1285g();
            this.f1076aX = reader.m1285g();
            this.f1022V = reader.ReadBool();
            this.f1023W = reader.m1285g();
            this.f1024X = reader.m1285g();
            this.f1073aU = reader.ReadBool();
            this.f1018R = reader.m1270v();
            this.f1041ao = reader.ReadBool();
            C1101m c1101m = new C1101m();
            reader.m1301a(c1101m, AbstractC0244am.class);
            if (c1101m.size() > 0) {
                this.f1042ap = c1101m;
            }
            this.f1017Q = reader.m1270v();
        }
        if (reader.m1295b() >= 35) {
            this.f998x = reader.m1285g();
            this.f1027aa = reader.ReadBool();
            this.f1030ad = reader.ReadBool();
            this.f1007G = reader.ReadBool();
        }
        if (reader.m1295b() >= 38) {
            this.f1008H = reader.m1285g();
        }
        if (reader.m1295b() >= 39) {
            this.f1031ae = reader.ReadBool();
        }
        if (reader.m1295b() >= 41) {
            this.f1058aG = reader.ReadBool();
        }
        if (reader.m1295b() >= 43) {
            this.f1000z = reader.ReadBool();
            this.f999y = reader.m1285g();
        }
        if (reader.m1295b() >= 44) {
            this.f1066aO = reader.m1285g();
        }
        if (reader.m1295b() >= 47) {
            this.f983i = reader.m1285g();
        }
        if (reader.m1295b() >= 48) {
            this.f1077aY = reader.ReadBool();
        }
        if (reader.m1295b() >= 59) {
            this.f1032af = reader.ReadBool();
            this.f1033ag = reader.m1285g();
            this.f1034ah = reader.m1285g();
            this.f1035ai = reader.m1285g();
        }
        if (reader.m1295b() >= 60) {
            this.f1036aj = reader.m1285g();
            reader.ReadInt();
            reader.m1285g();
            reader.m1285g();
        }
        if (reader.m1295b() >= 62) {
            reader.m1275q();
            reader.ReadInt();
            reader.ReadBool();
        }
        if (reader.m1295b() >= 63) {
            this.f1056aE = C0448g.m3751a(reader);
        }
        if (reader.m1295b() >= 64) {
            this.f1037ak = reader.m1285g();
            this.f1038al = reader.m1285g();
        }
        if (reader.m1295b() >= 66) {
            this.f1028ab = reader.ReadBool();
            this.f1029ac = reader.ReadBool();
        }
        if (reader.m1295b() >= 67 && reader.m1295b() < 78) {
            C0413bn.m3942a(reader, true);
        }
        if (reader.m1295b() >= 68) {
            this.f1040an = reader.m1285g();
        }
        if (reader.m1295b() >= 77) {
            reader.ReadBool();
        }
        if (reader.m1295b() >= 78) {
            this.f981g = C0189g.m4704a(reader);
        }
        if (reader.m1295b() >= 81 && reader.ReadBool()) {
            this.f1046au = reader.m1300a(AbstractC1120w.class);
            this.f1048aw = reader.m1285g();
            this.f1049ax = reader.m1285g();
            this.f1050ay = reader.m1285g();
        }
        if (reader.m1295b() >= 83) {
            this.f985k = reader.m1270v();
            this.f1055aD = reader.ReadInt();
        }
        if (reader.m1295b() >= 88) {
            this.f1039am = reader.m1285g();
        }
        if (reader.m1295b() >= 89) {
            this.f990p = reader.m1285g();
            this.f1047av = reader.ReadInt();
        }
        super.mo2291a(reader);
    }

    /* renamed from: c */
    public static void m4711c() {
        LoggerMaybe m1072A = LoggerMaybe.m1072A();
        f1085b = m1072A.f6113bO.mo221a(C0067R.drawable.projectiles);
        f1086c = m1072A.f6113bO.mo221a(C0067R.drawable.projectiles2);
        f1087d = m1072A.f6113bO.mo221a(C0067R.drawable.projectiles_large);
    }

    /* renamed from: d */
    public void m4710d() {
        this.f1071aS = true;
    }

    /* renamed from: a */
    public static C0188f m4718a(AbstractC0244am abstractC0244am, float f, float f2) {
        C0188f c0188f = new C0188f(false);
        c0188f.f984j = abstractC0244am;
        c0188f.f6957el = f;
        c0188f.f6958em = f2;
        c0188f.f1043ar = Color.m5435a(255, 100, 30, 30);
        c0188f.f6956ek = abstractC0244am.f6956ek + 1;
        c0188f.f6955ej = 4;
        return c0188f;
    }

    /* renamed from: a */
    public static C0188f m4716a(AbstractC0244am abstractC0244am, float f, float f2, float f3, int i) {
        C0188f m4718a = m4718a(abstractC0244am, f, f2);
        m4718a.f6959en = f3;
        m4718a.f985k = (short) i;
        m4718a.f1009I = C0758f.m2097b(abstractC0244am, 0.0f, 1.0f, abstractC0244am.f1588bB);
        abstractC0244am.f1588bB++;
        return m4718a;
    }

    /* renamed from: a */
    public void m4719a(AbstractC0244am abstractC0244am) {
        float f;
        if ((this.f1033ag == 0.0f && this.f1034ah == 0.0f) || abstractC0244am.m4402bI()) {
            return;
        }
        if (C0758f.m2157a(this.f1074aV, this.f1075aW, abstractC0244am.f6957el, abstractC0244am.f6958em) > 100.0f) {
            f = C0758f.m2071d(this.f1074aV, this.f1075aW, abstractC0244am.f6957el, abstractC0244am.f6958em);
        } else {
            f = this.f1051az;
        }
        float mo3075bN = this.f1034ah + (this.f1033ag / abstractC0244am.mo3075bN());
        abstractC0244am.f1614ca += C0758f.m2040i(f) * mo3075bN;
        abstractC0244am.f1615cb += C0758f.m2045h(f) * mo3075bN;
    }

    /* renamed from: a */
    public static void m4715a(AbstractC0244am abstractC0244am, AbstractC0244am abstractC0244am2, float f, C0188f c0188f, boolean z) {
        LoggerMaybe m1072A = LoggerMaybe.m1072A();
        if (m1072A.f6101bw && f > 0.0f) {
            f = 0.0f;
        }
        if (abstractC0244am2 != null && !abstractC0244am2.f1607bT) {
            if (c0188f != null && c0188f.f981g.f1151bc && abstractC0244am != null) {
                abstractC0244am2.m4318e(abstractC0244am.f1609bV);
            }
            if (c0188f != null) {
                if (c0188f.f1035ai != 1.0f && abstractC0244am2.m4402bI()) {
                    f *= c0188f.f1035ai;
                }
                if (c0188f.f1036aj != 1.0f && abstractC0244am2.mo2981i()) {
                    f *= c0188f.f1036aj;
                }
            }
            if (f < 0.0f) {
                abstractC0244am2.m4408b(abstractC0244am, -f, c0188f);
            } else {
                boolean z2 = !abstractC0244am2.f1607bT && abstractC0244am2.f1632cs > 0.0f;
                abstractC0244am2.mo2994a(abstractC0244am, f, c0188f);
                float f2 = f;
                if (abstractC0244am2.mo2997J()) {
                    f2 = 0.0f;
                }
                if (f2 > 0.0f) {
                    m1072A.f6123bY.m2395a(abstractC0244am, abstractC0244am2, f2);
                }
                if (abstractC0244am != null) {
                    abstractC0244am.f1659cT += f2;
                    if (z2 && (abstractC0244am2.f1607bT || abstractC0244am2.f1632cs < 0.0f)) {
                        abstractC0244am.f1658cS++;
                        abstractC0244am.m4423a(EnumC0347ae.f2175d, abstractC0244am2);
                    }
                }
            }
            if (c0188f != null && !abstractC0244am2.f1607bT) {
                float m4398bQ = abstractC0244am2.m4398bQ();
                if (m4398bQ != -1.0f) {
                    float m2071d = C0758f.m2071d(c0188f.f6957el, c0188f.f6958em, abstractC0244am2.f6957el, abstractC0244am2.f6958em);
                    float f3 = 100.0f / m4398bQ;
                    abstractC0244am2.f1614ca += C0758f.m2040i(m2071d) * f3;
                    abstractC0244am2.f1615cb += C0758f.m2045h(m2071d) * f3;
                }
            }
        }
    }

    /* renamed from: e */
    public float m4709e() {
        float f = 1.0f;
        if (this.f1010J < this.f1006F) {
            f = this.f1010J / this.f1006F;
        }
        return f;
    }

    /* renamed from: a */
    public void mo1718a(float f) {
        float m2071d;
        float m2157a;
        float f2;
        float f3;
        C0745e m2307d;
        C0745e m2307d2;
        C0467y m4706a;
        C0745e m2313b;
        float f4;
        float f5;
        float f6;
        float f7;
        LoggerMaybe m1072A = LoggerMaybe.m1072A();
        if (this.f1071aS) {
            mo2635a();
        }
        if (this.f986l == null && !this.f1054aC) {
            mo2635a();
            return;
        }
        if (this.f983i > 0.0f) {
            this.f983i = C0758f.m2159a(this.f983i, f);
            if (this.f983i > 0.0f) {
                return;
            }
        }
        C0189g c0189g = this.f981g;
        if (this.f983i == 0.0f) {
            this.f983i = -1.0f;
            if (c0189g.f1132al != null) {
                c0189g.f1132al.m3961a(this.f6957el, this.f6958em, this.f6959en, this.f1051az, this.f984j, null, false, this.f1055aD + 1, this, null);
            }
        }
        this.f982h = C0758f.m2159a(this.f982h, f);
        boolean z = false;
        if (this.f1058aG) {
            if (this.f986l == null) {
                z = true;
            } else if (this.f986l.f1607bT) {
                z = true;
            }
        }
        if (z) {
            m4723a(c0189g.f1192ax, c0189g.f1193ay, (C0449h) null);
        }
        if (c0189g.f1135az) {
            this.f1057aF = C0758f.m2159a(this.f1057aF, f);
            if (this.f1057aF == 0.0f) {
                this.f1057aF = c0189g.f1194aA;
                m4723a(c0189g.f1195aB, c0189g.f1196aC, c0189g.f1136aD);
            }
        }
        if (c0189g.f1119R != 0.0f || c0189g.f1120S != 0.0f) {
            float f8 = c0189g.f1119R;
            if (this.f986l != null) {
                f8 += this.f986l.f1621ch * c0189g.f1120S;
            }
            this.f1011K = C0758f.m2045h(((360.0f * this.f1009I) + (this.f1010J * 1.0f)) % 360.0f) * f8;
            this.f1012L = C0758f.m2045h(((360.0f * this.f1009I) + (this.f1010J * 1.5f)) % 360.0f) * f8;
        }
        if (this.f1005E && this.f986l != null) {
            this.f1011K = C0758f.m2045h((this.f1010J * 1.0f) % 360.0f) * this.f986l.f1621ch * 0.4f;
            this.f1012L = C0758f.m2045h((this.f1010J * 1.5f) % 360.0f) * this.f986l.f1621ch * 0.4f;
            float f9 = this.f986l.f6957el + this.f1011K;
            float f10 = this.f986l.f6958em + this.f1012L;
            if (this.f6954ei) {
                this.f1065aN += f;
                this.f1066aO += f;
                if (this.f1065aN > 11.0f) {
                    this.f1065aN = C0758f.m2084c(1.0f, 4.0f);
                    C0745e m2313b2 = m1072A.f6116bR.m2313b(f9, f10, this.f986l.f6959en, EnumC0744d.f4707a, false, EnumC0748h.f4833b);
                    if (m2313b2 != null) {
                        m2313b2.f4768ar = 0;
                        m2313b2.f4767aq = 0;
                        m2313b2.f4792as = (short) 2;
                        m2313b2.f4725s = true;
                        m2313b2.f4733F = 0.5f;
                        m2313b2.f4751X = 60.0f;
                        m2313b2.f4750W = 60.0f;
                        m2313b2.f4735H = 0.7f;
                        m2313b2.f4734G = 0.3f;
                        m2313b2.f4793at = false;
                        m2313b2.f4744Q = C0758f.m2084c(-0.3f, 0.3f);
                        m2313b2.f4745R = (-0.9f) + C0758f.m2084c(-0.3f, 0.3f);
                    }
                }
                if (this.f1066aO > 75.0f) {
                    this.f1066aO = C0758f.m2084c(1.0f, 20.0f);
                    m1072A.f6116bR.m2318b(f9, f10, this.f986l.f6959en);
                }
            }
        }
        float f11 = 5.0f;
        boolean z2 = false;
        boolean z3 = false;
        if (!this.f1054aC) {
            float f12 = this.f986l.f6957el + this.f1011K;
            float f13 = this.f986l.f6958em + this.f1012L;
            float f14 = this.f986l.f6959en;
            m2071d = C0758f.m2071d(this.f6957el, this.f6958em, f12, f13);
            m2157a = C0758f.m2157a(this.f6957el, this.f6958em, f12, f13);
            f2 = f14;
            f3 = f2 - this.f6959en;
            f11 = this.f986l.f1621ch;
            z2 = this.f986l instanceof AbstractC0488d;
            z3 = this.f986l.f1635cv > 10.0f + this.f1021U;
        } else {
            float f15 = this.f1051az;
            if (this.f991q != null) {
                float f16 = this.f991q.f6957el + this.f1011K;
                float f17 = this.f991q.f6958em + this.f1012L;
                float f18 = this.f991q.f6959en;
                m2071d = C0758f.m2071d(this.f6957el, this.f6958em, f16, f17);
                m2157a = C0758f.m2157a(this.f6957el, this.f6958em, f16, f17);
                f2 = f18;
                f3 = f2 - this.f6959en;
            } else if (this.f986l != null) {
                float f19 = this.f986l.f6957el + this.f1011K;
                float f20 = this.f986l.f6958em + this.f1012L;
                float f21 = this.f986l.f6959en;
                m2071d = C0758f.m2071d(this.f6957el, this.f6958em, f19, f20);
                m2157a = C0758f.m2157a(this.f6957el, this.f6958em, f19, f20);
                f2 = f21;
                f3 = f2 - this.f6959en;
                f11 = this.f986l.f1621ch;
                z2 = this.f986l instanceof AbstractC0488d;
                z3 = this.f986l.f1635cv > 10.0f + this.f1021U;
            } else if (this.f987m) {
                float f22 = this.f988n + this.f1011K;
                float f23 = this.f989o + this.f1012L;
                float f24 = this.f990p;
                m2071d = C0758f.m2071d(this.f6957el, this.f6958em, f22, f23);
                m2157a = C0758f.m2157a(this.f6957el, this.f6958em, f22, f23);
                f2 = f24;
                f3 = f2 - this.f6959en;
            } else {
                float f25 = this.f988n + this.f1011K;
                float f26 = this.f989o + this.f1012L;
                m2071d = C0758f.m2071d(this.f6957el, this.f6958em, f25, f26);
                m2157a = C0758f.m2157a(this.f6957el, this.f6958em, f25, f26);
                f2 = 0.0f;
                f3 = 0.0f - this.f6959en;
            }
        }
        float f27 = c0189g.f1174O;
        if (m2157a < 225.0f) {
            f27 = c0189g.f1175P;
        }
        if (f27 >= 0.0f) {
            this.f1051az += C0758f.m2083c(this.f1051az, m2071d, f27 * f);
            m2071d = this.f1051az;
        } else {
            this.f1051az = m2071d;
        }
        boolean z4 = false;
        boolean z5 = false;
        float f28 = m2071d;
        if (this.f1046au != null && !this.f1046au.f6952eg) {
            if (this.f1047av >= 0) {
                AbstractC0623y abstractC0623y = (AbstractC0623y) this.f1046au;
                if (this.f1047av >= abstractC0623y.mo3084bl()) {
                    this.f1047av = 0;
                }
                C1080ai m2968D = abstractC0623y.m2968D(this.f1047av);
                f5 = m2968D.f6849a;
                f6 = m2968D.f6850b;
                f7 = this.f984j.f6959en + m2968D.f6851c;
            } else {
                f5 = this.f1046au.f6957el;
                f6 = this.f1046au.f6958em;
                f7 = this.f1046au.f6959en;
            }
            float f29 = f5 - this.f1048aw;
            float f30 = f6 - this.f1049ax;
            float f31 = f7 - this.f1050ay;
            this.f6957el += f29;
            this.f6958em += f30;
            this.f6959en += f31;
            this.f1048aw = f5;
            this.f1049ax = f6;
            this.f1050ay = f7;
        }
        if (!this.f1001A) {
            this.f6957el += this.f995u * f;
            this.f6958em += this.f996v * f;
            if (this.f997w != 0.0f) {
                this.f6959en += this.f997w * f;
                f3 = f2 - this.f6959en;
            }
            if (this.f6959en > 0.0f) {
                if (c0189g.f1116G != 0.0f) {
                    this.f6959en -= c0189g.f1116G * f;
                    f3 = f2 - this.f6959en;
                }
                if (c0189g.f1117H != 0.0f) {
                    this.f997w -= c0189g.f1117H * f;
                }
            }
            if (!this.f1059aH || this.f1060aI < this.f6959en || this.f1062aK) {
                float f32 = this.f994t * f;
                z4 = true;
                if (m2157a < f32 * f32) {
                    f32 = C0758f.m2160a(m2157a);
                    m2157a = 0.0f;
                }
                this.f6957el += C0758f.m2040i(m2071d) * f32;
                this.f6958em += C0758f.m2045h(m2071d) * f32;
            }
            if (this.f1059aH) {
                if (this.f1063aL < 0.0f) {
                    f4 = this.f994t * f;
                    z4 = true;
                } else {
                    f4 = this.f1063aL * f;
                }
                if (!this.f1062aK) {
                    this.f6959en = C0758f.m2158a(this.f6959en, this.f1061aJ, f4);
                    if (this.f6959en < this.f1060aI) {
                        f28 = -90.0f;
                    }
                    if (this.f6959en >= this.f1061aJ) {
                        this.f1062aK = true;
                    }
                } else if (m2157a < 400.0f) {
                    this.f6959en = C0758f.m2158a(this.f6959en, f2, f4);
                    if (C0758f.m2085c(this.f6959en - f2) > 0.5f) {
                        f28 = 90.0f;
                        z5 = true;
                    }
                }
            } else {
                float f33 = f3;
                float f34 = this.f994t * f;
                z4 = true;
                if (f33 != 0.0f) {
                    if (m2157a > 0.1d) {
                        f34 = C0758f.m2107b((C0758f.m2085c(f33) / C0758f.m2160a(m2157a)) * this.f994t * f, this.f994t * f);
                    }
                    this.f6959en += C0758f.m2107b(f3, f34);
                    f3 = f2 - this.f6959en;
                }
            }
        }
        if (z4 && this.f992r > 0.0f) {
            this.f994t = C0758f.m2158a(this.f994t, this.f992r, this.f993s * f);
        }
        if (c0189g.f1133am != 0.0f) {
            float m2045h = C0758f.m2045h((((this.f1010J * 360.0f) / c0189g.f1183an) + (360.0f * this.f1009I)) % 360.0f) * c0189g.f1133am * f;
            this.f6957el += C0758f.m2040i(m2071d + 90.0f) * m2045h;
            this.f6958em += C0758f.m2045h(m2071d + 90.0f) * m2045h;
        }
        if (this.f6954ei && ((this.f1064aM || c0189g.f1128ah != null) && !this.f1070bn)) {
            this.f1065aN += f;
            if (this.f1065aN > c0189g.f1182ag) {
                this.f1065aN = 0.0f;
                boolean z6 = false;
                if (this.f1004D) {
                    z6 = true;
                }
                if (c0189g.f1128ah != null) {
                    c0189g.f1128ah.m3459a(this.f6957el, this.f6958em, this.f6959en, this.f1072aT, this);
                }
                if (this.f1064aM && (m2313b = m1072A.f6116bR.m2313b(this.f6957el, this.f6958em, this.f6959en, EnumC0744d.f4707a, z6, EnumC0748h.f4833b)) != null) {
                    if (this.f6959en >= 0.0f) {
                        m2313b.f4768ar = 0;
                        m2313b.f4767aq = 0;
                        m2313b.f4792as = (short) 2;
                        m2313b.f4725s = true;
                        m2313b.f4733F = 0.5f;
                        m2313b.f4750W = 70.0f;
                        m2313b.f4751X = m2313b.f4750W;
                        m2313b.f4793at = true;
                        if (z5) {
                            m2313b.f4793at = false;
                        }
                        m2313b.f4745R = 0.1f;
                        m2313b.f4726t = true;
                        m2313b.f4727u = 5.0f;
                        m2313b.f4735H = 0.5f;
                        m2313b.f4734G = 1.2f;
                        m2313b.f4752Z = C0758f.m2084c(-180.0f, 180.0f);
                        if (this.f1004D) {
                            m2313b.f4735H = 0.5f;
                            m2313b.f4734G = 2.1f;
                        }
                    } else {
                        m2313b.f4768ar = 9;
                        m2313b.f4767aq = 1;
                        m2313b.f4792as = (short) 1;
                        m2313b.f4725s = true;
                        m2313b.f4733F = 0.5f;
                        m2313b.f4751X = 60.0f;
                        m2313b.f4750W = 60.0f;
                        m2313b.f4745R = 0.1f;
                    }
                }
            }
        }
        if (!this.f1070bn) {
            boolean z7 = false;
            AbstractC0244am abstractC0244am = null;
            boolean z8 = false;
            float f35 = 6.0f;
            if (z2) {
                f35 = f11 * 0.8f;
                if (f35 < 6.0f) {
                    f35 = 6.0f;
                }
            }
            if (z3) {
                f35 = f11 * 1.1f;
            }
            float f36 = 3.0f;
            if (this.f997w != 0.0f || c0189g.f1116G != 0.0f) {
                f36 = 3.0f + C0758f.m2085c(this.f997w * f) + C0758f.m2085c(c0189g.f1116G * f);
            }
            if (m2157a < f35 * f35 && C0758f.m2085c(f3) < f36) {
                z7 = true;
                abstractC0244am = this.f986l;
            }
            if (this.f1001A) {
                z7 = true;
                abstractC0244am = this.f986l;
            }
            if (this.f1032af && this.f982h == 0.0f) {
                z7 = true;
            }
            if (this.f1044as) {
                float f37 = this.f1052aA + 50.0f;
                AbstractC0244am[] m498a = AbstractC0244am.f1590bD.m498a();
                int size = AbstractC0244am.f1590bD.size();
                for (int i = 0; i < size; i++) {
                    AbstractC0244am abstractC0244am2 = m498a[i];
                    if (abstractC0244am2.f6957el + f37 > this.f6957el && abstractC0244am2.f6957el - f37 < this.f6957el && abstractC0244am2.f6958em + f37 > this.f6958em && abstractC0244am2.f6958em - f37 < this.f6958em && abstractC0244am2.f1606bS && false == abstractC0244am2.mo2981i() && abstractC0244am2.f1651cL == null) {
                        float m2157a2 = C0758f.m2157a(this.f6957el, this.f6958em, abstractC0244am2.f6957el, abstractC0244am2.f6958em);
                        float f38 = this.f1052aA + abstractC0244am2.f1621ch;
                        if (m2157a2 < f38 * f38) {
                            z7 = true;
                            abstractC0244am = abstractC0244am2;
                        }
                    }
                }
            }
            if (this.f1045at) {
                m1072A.f6110bL.m4857a(this.f6957el, this.f6958em);
                if (m1072A.f6119bU.m1151a(EnumC0246ao.f1708f, m1072A.f6110bL.f801T, m1072A.f6110bL.f802U)) {
                    z7 = true;
                    z8 = true;
                }
            }
            if (this.f1054aC) {
            }
            if (this.f1077aY && (((this.f1059aH && z5 && this.f6959en < 30.0f) || z7) && this.f984j != null)) {
                this.f1077aY = false;
                C0619u c0619u = new C0619u(false);
                c0619u.f6957el = this.f6957el;
                c0619u.f6958em = this.f6958em;
                c0619u.m2838b(this.f984j.f1609bV);
                c0619u.f3883a = 15;
                c0619u.f3884b = 360.0f;
                AbstractC0197n.m4598c(c0619u);
            }
            if (z7) {
                this.f1070bn = true;
                this.f1074aV = this.f6957el;
                this.f1075aW = this.f6958em;
                this.f1076aX = this.f6959en;
                if (this.f1001A) {
                    if (this.f1054aC) {
                        this.f1074aV = this.f988n;
                        this.f1075aW = this.f989o;
                        this.f1076aX = 0.0f;
                    }
                    if (this.f986l != null) {
                        this.f1074aV = this.f986l.f6957el + this.f1011K;
                        this.f1075aW = this.f986l.f6958em + this.f1012L;
                        this.f1076aX = this.f986l.f6959en;
                    }
                }
                if (!this.f1002B && !this.f1013M && !c0189g.f1179X) {
                    this.f1019S = false;
                }
                boolean z9 = false;
                if (this.f986l != null) {
                    z9 = this.f986l.f1635cv > 10.0f;
                }
                C0467y c0467y = c0189g.f1146aX;
                if (z9) {
                    c0467y = c0189g.f1147aY;
                }
                if (this.f986l != null && (m4706a = c0189g.m4706a(this.f986l)) != null) {
                    c0467y = m4706a;
                }
                if (c0467y != null) {
                    c0467y.m3459a(this.f1074aV, this.f1075aW, this.f1076aX, this.f1072aT, this.f986l);
                }
                if (c0189g.f1130aj != null) {
                    c0189g.f1130aj.m3961a(this.f6957el, this.f6958em, this.f6959en, this.f1051az, this.f984j, null, false, this.f1055aD + 1, this, this.f986l);
                }
                if (c0189g.f1148aZ != null && this.f984j != null) {
                    c0189g.f1148aZ.m3946a(this.f1074aV, this.f1075aW, 0.0f, this.f1051az, this.f984j.f1609bV, false, this.f984j);
                }
                if (c0189g.f1149ba > 0 && this.f984j != null && (this.f984j instanceof C0451j)) {
                    C0451j c0451j = (C0451j) this.f984j;
                    for (int i2 = 0; i2 < c0189g.f1149ba; i2++) {
                        if (c0451j.f2867B != null && c0451j.f2867B.size() > 0) {
                            AbstractC0244am abstractC0244am3 = (AbstractC0244am) c0451j.f2867B.remove(c0451j.f2867B.size() - 1);
                            C1117y.m464a(abstractC0244am3, c0451j);
                            abstractC0244am3.f6957el = this.f1074aV;
                            abstractC0244am3.f6958em = this.f1075aW;
                            abstractC0244am3.f1618ce = this.f1051az;
                            abstractC0244am3.f1615cb = 0.0f;
                            abstractC0244am3.f1614ca = 0.0f;
                            abstractC0244am3.f1611bX = 0.0f;
                            abstractC0244am3.f1612bY = 0.0f;
                            if (abstractC0244am3 instanceof AbstractC0623y) {
                                AbstractC0623y abstractC0623y2 = (AbstractC0623y) abstractC0244am3;
                                abstractC0623y2.m2845az();
                                abstractC0623y2.m2767j(abstractC0244am3.f1618ce);
                                if (abstractC0244am3 instanceof C0451j) {
                                    ((C0451j) abstractC0244am3).m3614dD();
                                }
                            }
                            c0451j.m3733D(abstractC0244am3);
                        }
                    }
                }
                if (c0189g.f1150bb && this.f984j != null) {
                    this.f984j.m4313f(this.f1074aV, this.f1075aW);
                }
                if (!z8 && abstractC0244am != null) {
                    if (this.f1005E) {
                        this.f1070bn = false;
                        float m4709e = (this.f1021U / 60.0f) * f * m4709e();
                        if (this.f1026Z == 0.0f) {
                            m4719a(abstractC0244am);
                        }
                        m4715a(this.f984j, abstractC0244am, c0189g.m4705a(abstractC0244am, m4709e, true), this, false);
                    } else {
                        if (this.f1026Z == 0.0f) {
                            m4719a(abstractC0244am);
                        }
                        m4715a(this.f984j, abstractC0244am, c0189g.m4705a(abstractC0244am, this.f1021U, false), this, false);
                    }
                }
                if (this.f991q != null) {
                    if (c0189g.f1102d) {
                        this.f991q.f982h = 0.0f;
                    } else {
                        this.f991q.m4714b();
                    }
                    mo2635a();
                }
                if (!this.f1005E) {
                    boolean z10 = true;
                    if (this.f986l != null && this.f986l.f1635cv > 10.0f) {
                        z10 = false;
                        if (c0189g.f1147aY == null && (m2307d2 = m1072A.f6116bR.m2307d(this.f1074aV, this.f1075aW, this.f1076aX, -1127220)) != null) {
                            m2307d2.f4750W = 10.0f;
                            m2307d2.f4734G = 0.5f;
                            if (this.f1068aQ) {
                                m2307d2.f4750W = 25.0f;
                                m2307d2.f4734G = 1.0f;
                            }
                            m2307d2.f4792as = (short) 2;
                            m2307d2.f4751X = m2307d2.f4750W;
                        }
                    }
                    if (this.f1007G) {
                        z10 = false;
                        C0746f.m2288b(this.f6957el, this.f6958em).f4795a = 21.0f;
                    }
                    if (z10) {
                        if (!this.f1068aQ) {
                            if (c0189g.f1146aX == null) {
                                m1072A.f6116bR.m2311c(this.f1074aV, this.f1075aW, this.f1076aX);
                            }
                        } else if (c0189g.f1146aX == null) {
                            if (this.f1026Z > 10.0f && (m2307d = m1072A.f6116bR.m2307d(this.f1074aV, this.f1075aW, this.f1076aX, 0)) != null) {
                                m2307d.f4734G = this.f1026Z / 25.0f;
                                m2307d.f4733F = 0.7f;
                                if (this.f1076aX > 5.0f) {
                                    m2307d.f4792as = (short) 2;
                                }
                            }
                            m1072A.f6116bR.m2318b(this.f1074aV, this.f1075aW, this.f1076aX);
                            if (this.f1069aR && !this.f1004D) {
                                m1072A.f6111bM.m2721a(C0631e.f4048n, 0.5f, 1.0f + C0758f.m2084c(-0.06f, 0.06f), this.f1074aV, this.f1075aW);
                            }
                        }
                        if (this.f1004D && c0189g.f1146aX == null) {
                            m1072A.f6111bM.m2721a(C0631e.f4063C, 1.6f, 0.7f, this.f1074aV, this.f1075aW);
                            m1072A.f6116bR.m2312b(EnumC0748h.f4836e);
                            C0745e m2333a = m1072A.f6116bR.m2333a(this.f1074aV, this.f1075aW, this.f6959en, Color.m5435a(255, 255, 255, 255));
                            if (m2333a != null) {
                                m2333a.f4735H = 14.0f;
                                m2333a.f4734G = 8.0f;
                                m2333a.f4733F = 0.9f;
                                m2333a.f4750W = 35.0f;
                                m2333a.f4751X = m2333a.f4750W;
                                m2333a.f4725s = true;
                            }
                            m1072A.f6116bR.m2312b(EnumC0748h.f4836e);
                            C0745e m2309c = m1072A.f6116bR.m2309c(this.f1074aV, this.f1075aW, this.f1076aX, -1127220);
                            if (m2309c != null) {
                                m2309c.f4735H = 1.5f;
                                m2309c.f4734G = 3.0f;
                                m2309c.f4792as = (short) 2;
                                m2309c.f4750W = 20.0f;
                                m2309c.f4751X = m2309c.f4750W;
                                m2309c.f4749V = 0.0f;
                            }
                            m1072A.f6116bR.m2312b(EnumC0748h.f4836e);
                            C0745e m2309c2 = m1072A.f6116bR.m2309c(this.f1074aV, this.f1075aW, this.f1076aX, -1127220);
                            if (m2309c2 != null) {
                                m2309c2.f4735H = 0.2f;
                                m2309c2.f4734G = 5.0f;
                                m2309c2.f4792as = (short) 2;
                                m2309c2.f4750W = 65.0f;
                                m2309c2.f4751X = m2309c2.f4750W;
                                m2309c2.f4749V = 0.0f;
                            }
                            m1072A.f6116bR.m2312b(EnumC0748h.f4836e);
                            C0745e m2333a2 = m1072A.f6116bR.m2333a(this.f1074aV, this.f1075aW, this.f6959en, Color.m5435a(255, 255, 255, 255));
                            if (m2333a2 != null) {
                                m2333a2.f4735H = 3.0f;
                                m2333a2.f4734G = 6.0f;
                                m2333a2.f4733F = 0.9f;
                                m2333a2.f4750W = 290.0f;
                                m2333a2.f4751X = m2333a2.f4750W;
                            }
                            m1072A.f6116bR.m2312b(EnumC0748h.f4836e);
                            C0745e m2333a3 = m1072A.f6116bR.m2333a(this.f1074aV, this.f1075aW, this.f6959en, Color.m5435a(255, 255, 244, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_TV_DATA_SERVICE));
                            if (m2333a3 != null) {
                                m2333a3.f4735H = 2.0f;
                                m2333a3.f4734G = 6.0f;
                                m2333a3.f4733F = 0.5f;
                                m2333a3.f4750W = 370.0f;
                                m2333a3.f4751X = m2333a3.f4750W;
                                m2333a3.f4749V = 10.0f;
                            }
                            for (int i3 = 0; i3 < 1; i3++) {
                                m1072A.f6116bR.m2312b(EnumC0748h.f4836e);
                                C0745e m2333a4 = m1072A.f6116bR.m2333a(this.f1074aV, this.f1075aW, this.f6959en, Color.m5435a(255, 255, 244, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_TV_DATA_SERVICE));
                                if (m2333a4 != null) {
                                    m2333a4.f4735H = 0.2f;
                                    m2333a4.f4734G = 9.0f;
                                    m2333a4.f4733F = 0.7f;
                                    m2333a4.f4750W = 210.0f;
                                    m2333a4.f4751X = m2333a4.f4750W;
                                    m2333a4.f4749V = 20 + (i3 * 110);
                                }
                            }
                            m1072A.f6116bR.m2312b(EnumC0748h.f4836e);
                            C0745e m2333a5 = m1072A.f6116bR.m2333a(this.f1074aV, this.f1075aW, this.f6959en, Color.m5435a(255, 255, 255, 255));
                            if (m2333a5 != null) {
                                m2333a5.f4735H = 3.0f;
                                m2333a5.f4734G = 4.0f;
                                m2333a5.f4733F = 0.2f;
                                m2333a5.f4750W = 870.0f;
                                m2333a5.f4751X = m2333a5.f4750W;
                                m2333a5.f4725s = true;
                                m2333a5.f4749V = 70.0f;
                            }
                            m1072A.f6116bR.m2312b(EnumC0748h.f4836e);
                            C0745e m2333a6 = m1072A.f6116bR.m2333a(this.f1074aV, this.f1075aW, this.f6959en, Color.m5435a(255, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_3D_MODE, 255, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_TV_SATELLITE_CS));
                            if (m2333a6 != null) {
                                m2333a6.f4735H = 4.0f;
                                m2333a6.f4734G = 1.0f;
                                m2333a6.f4733F = 0.9f;
                                m2333a6.f4750W = 320.0f;
                                m2333a6.f4751X = m2333a6.f4750W;
                            }
                            m1072A.f6116bR.m2312b(EnumC0748h.f4836e);
                            C0745e m2333a7 = m1072A.f6116bR.m2333a(this.f1074aV, this.f1075aW, this.f6959en, Color.m5435a(255, 255, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_TV_ANTENNA_CABLE, 129));
                            if (m2333a7 != null) {
                                m2333a7.f4735H = 2.0f;
                                m2333a7.f4734G = 1.0f;
                                m2333a7.f4733F = 1.0f;
                                m2333a7.f4750W = 340.0f;
                                m2333a7.f4751X = m2333a7.f4750W;
                                m2333a7.f4726t = true;
                                m2333a7.f4727u = 20.0f;
                            }
                            m1072A.f6116bR.m2312b(EnumC0748h.f4836e);
                            C0745e m2333a8 = m1072A.f6116bR.m2333a(this.f1074aV, this.f1075aW, this.f6959en, Color.m5435a(245, 255, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_AVR_INPUT, 110));
                            if (m2333a8 != null) {
                                m2333a8.f4735H = 1.5f;
                                m2333a8.f4734G = 1.5f;
                                m2333a8.f4733F = 0.3f;
                                m2333a8.f4750W = 1340.0f;
                                m2333a8.f4751X = m2333a8.f4750W;
                                m2333a8.f4726t = true;
                                m2333a8.f4727u = 40.0f;
                                m2333a8.f4749V = 140.0f;
                            }
                            for (int i4 = 0; i4 < 4; i4++) {
                                m1072A.f6116bR.m2312b(EnumC0748h.f4836e);
                                C0745e m2333a9 = m1072A.f6116bR.m2333a(this.f1074aV, this.f1075aW, this.f6959en, Color.m5435a(SlickToAndroidKeycodes.AndroidCodes.KEYCODE_PAIRING, 255, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_TV_ANTENNA_CABLE, 129));
                                if (m2333a9 != null) {
                                    m2333a9.f4735H = 1.5f;
                                    m2333a9.f4734G = 1.4f;
                                    m2333a9.f4733F = 1.3f;
                                    m2333a9.f4750W = 340.0f;
                                    m2333a9.f4751X = m2333a9.f4750W;
                                    m2333a9.f4745R = -0.29f;
                                    m2333a9.f4726t = true;
                                    m2333a9.f4727u = 50.0f;
                                    m2333a9.f4749V = 30 + (i4 * 40);
                                }
                            }
                            for (int i5 = 0; i5 < 2; i5++) {
                                m1072A.f6116bR.m2312b(EnumC0748h.f4836e);
                                C0745e m2333a10 = m1072A.f6116bR.m2333a(this.f1074aV, this.f1075aW, this.f6959en, Color.m5435a(SlickToAndroidKeycodes.AndroidCodes.KEYCODE_PROG_YELLOW, 255, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_TV_ANTENNA_CABLE, 129));
                                if (m2333a10 != null) {
                                    m2333a10.f4735H = 1.3f;
                                    m2333a10.f4734G = 1.0f;
                                    m2333a10.f4733F = 1.0f;
                                    m2333a10.f4750W = 340.0f;
                                    m2333a10.f4751X = m2333a10.f4750W;
                                    m2333a10.f4745R = -0.14f;
                                    m2333a10.f4726t = true;
                                    m2333a10.f4727u = 50.0f;
                                    m2333a10.f4749V = 70 + (i5 * 70);
                                }
                            }
                            for (int i6 = 0; i6 < 4; i6++) {
                                m1072A.f6116bR.m2312b(EnumC0748h.f4836e);
                                C0745e m2333a11 = m1072A.f6116bR.m2333a(this.f1074aV, this.f1075aW - 30.0f, this.f6959en, -16711936);
                                if (m2333a11 != null) {
                                    m2333a11.f4735H = 1.5f;
                                    m2333a11.f4734G = 2.6f;
                                    m2333a11.f4733F = 1.3f;
                                    m2333a11.f4750W = 510.0f;
                                    m2333a11.f4751X = m2333a11.f4750W;
                                    m2333a11.f4745R = -0.2f;
                                    m2333a11.f4726t = true;
                                    m2333a11.f4727u = 50.0f;
                                    m2333a11.f4788C = null;
                                    m2333a11.f4730y = Color.m5435a(175, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_TV_TERRESTRIAL_ANALOG, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_TV_TERRESTRIAL_ANALOG, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_TV_TERRESTRIAL_ANALOG);
                                    m2333a11.f4749V = 20 + (i6 * 40);
                                }
                            }
                            for (int i7 = 0; i7 < 2; i7++) {
                                m1072A.f6116bR.m2312b(EnumC0748h.f4836e);
                                C0745e m2333a12 = m1072A.f6116bR.m2333a(this.f1074aV, this.f1075aW - 30.0f, this.f6959en, -16711936);
                                if (m2333a12 != null) {
                                    m2333a12.f4735H = 1.5f;
                                    m2333a12.f4734G = 3.8f;
                                    m2333a12.f4733F = 0.8f;
                                    m2333a12.f4750W = 590.0f;
                                    m2333a12.f4751X = m2333a12.f4750W;
                                    m2333a12.f4745R = -0.2f;
                                    m2333a12.f4726t = true;
                                    m2333a12.f4727u = 50.0f;
                                    m2333a12.f4788C = null;
                                    m2333a12.f4730y = Color.m5435a(105, 115, 115, 115);
                                    m2333a12.f4749V = 20 + (i7 * 40);
                                }
                            }
                            for (int i8 = 0; i8 < 1; i8++) {
                                C0746f m2296a = C0746f.m2296a(this.f1074aV + C0758f.m2155a(-10.0f, 10.0f, (int) this.f6951ee), this.f1075aW + C0758f.m2155a(-10.0f, 10.0f, ((int) this.f6951ee) + i8));
                                if (m2296a != null) {
                                    m2296a.f4810t = 200 + (i8 * 70);
                                    m2296a.f4795a = 980 + (i8 * 800);
                                }
                            }
                            if (!C1117y.m449d(this.f1074aV, this.f1075aW)) {
                                C0195l.m4671a(this.f1074aV, this.f1075aW, EnumC0196m.f1304b);
                            }
                            if (LoggerMaybe.m1020aA()) {
                                if (m1072A.f6116bR.f4688m == null) {
                                    m1072A.f6116bR.f4688m = m1072A.f6113bO.mo215a(C0067R.drawable.shockwave_normal_256, true);
                                }
                                m1072A.f6116bR.m2312b(EnumC0748h.f4836e);
                                C0745e m2333a13 = m1072A.f6116bR.m2333a(this.f1074aV, this.f1075aW, this.f6959en, -1);
                                if (m2333a13 != null && m1072A.f6116bR.f4688m != null) {
                                    m2333a13.f4782a = new C0382aw((EnumC0383ax) null);
                                    m2333a13.f4782a.imageStrip = new C0747g();
                                    m2333a13.f4782a.imageStrip.f4829k = true;
                                    m2333a13.f4782a.imageStrip.f4827i = m1072A.f6116bR.f4688m;
                                    m2333a13.f4782a.imageStrip.f4820b = m2333a13.f4782a.imageStrip.f4827i.mo386m();
                                    m2333a13.f4782a.imageStrip.f4821c = m2333a13.f4782a.imageStrip.f4827i.mo387l();
                                    m2333a13.f4792as = (short) 101;
                                    m2333a13.f4735H = 0.5f;
                                    m2333a13.f4734G = 3.5f;
                                    m2333a13.f4733F = 0.5f;
                                    m2333a13.f4750W = 60.0f;
                                    m2333a13.f4751X = m2333a13.f4750W;
                                    m2333a13.f4745R = -0.2f;
                                    m2333a13.f4726t = true;
                                    m2333a13.f4727u = 1.0f;
                                    m2333a13.f4788C = null;
                                    m2333a13.f4749V = 0.0f;
                                }
                            }
                        }
                    }
                }
            }
        }
        if (this.f1070bn && !this.f1022V) {
            this.f1023W = C0758f.m2159a(this.f1023W, f);
            if (this.f1041ao) {
                m4713b(1.0f - (this.f1023W / this.f1024X));
            }
            if (this.f1023W == 0.0f) {
                this.f1022V = true;
                m4713b(1.0f);
                if (!this.f1002B && !this.f1013M && !c0189g.f1179X) {
                    mo2635a();
                }
            }
        }
        this.f1010J += f;
        if (this.f982h == 0.0f && (!this.f1070bn || this.f1022V)) {
            if (c0189g.f1131ak != null) {
                c0189g.f1131ak.m3961a(this.f6957el, this.f6958em, this.f6959en, this.f1051az, this.f984j, null, false, this.f1055aD + 1, this, null);
            }
            mo2635a();
        }
        if (!this.f1073aU) {
            this.f1072aT = f28;
            this.f1073aU = true;
        }
        this.f1072aT += C0758f.m2083c(this.f1072aT, f28, 12.0f * f);
    }

    /* renamed from: b */
    public void m4713b(float f) {
        boolean z = false;
        if (this.f981g.f1104f) {
            return;
        }
        if (this.f981g.f1103e) {
            z = true;
        }
        if (!z) {
            if (this.f1025Y != 0.0f && this.f1026Z > 0.0f) {
                z = true;
            }
            if ((this.f1033ag != 0.0f || this.f1034ah != 0.0f) && this.f1026Z > 0.0f) {
                z = true;
            }
        }
        if (!z) {
            return;
        }
        float f2 = this.f1026Z * f;
        float f3 = f2;
        if (this.f981g.f1106h) {
            f3 += 150.0f;
        }
        LoggerMaybe m1072A = LoggerMaybe.m1072A();
        f1079bi.clear();
        m1072A.f6127cc.m3151b(this.f1074aV, this.f1075aW, f3, f1079bi);
        AbstractC0244am[] m498a = f1079bi.m498a();
        int size = f1079bi.size();
        for (int i = 0; i < size; i++) {
            m4712b(m498a[i], f, f2);
        }
        f1079bi.clear();
    }

    /* renamed from: b */
    public void m4712b(AbstractC0244am abstractC0244am, float f, float f2) {
        if (abstractC0244am.f1651cL != null) {
            return;
        }
        if (this.f1042ap != null && this.f1042ap.contains(abstractC0244am)) {
            return;
        }
        if (this.f984j != null) {
            AbstractC0197n abstractC0197n = this.f984j.f1609bV;
            AbstractC0197n abstractC0197n2 = abstractC0244am.f1609bV;
            if (abstractC0197n2 != abstractC0197n && abstractC0197n.m4587d(abstractC0197n2)) {
                return;
            }
            if (this.f1027aa && !abstractC0197n.m4599c(abstractC0197n2)) {
                return;
            }
            if (this.f1028ab && abstractC0197n.m4599c(abstractC0197n2)) {
                return;
            }
        }
        if (abstractC0244am.f6959en < -5.0f && this.f1076aX >= -2.0f && !this.f1029ac) {
            return;
        }
        if (this.f1031ae) {
            if (abstractC0244am.mo2981i() != (this.f1076aX >= 5.0f)) {
                return;
            }
        } else if (!this.f1030ad && abstractC0244am.mo2981i()) {
            return;
        }
        float m2157a = C0758f.m2157a(this.f1074aV, this.f1075aW, abstractC0244am.f6957el, abstractC0244am.f6958em);
        if (m2157a > f2 * f2 && !this.f981g.f1106h) {
            return;
        }
        float sqrt = (float) StrictMath.sqrt(m2157a);
        if (this.f981g.f1106h) {
            sqrt -= abstractC0244am.f1621ch;
            if (sqrt < 0.0f) {
                sqrt = 0.0f;
            }
        }
        if (sqrt > f2 || sqrt < this.f981g.f1154j) {
            return;
        }
        m4722a(f, abstractC0244am, sqrt);
    }

    /* renamed from: a */
    public void m4722a(float f, AbstractC0244am abstractC0244am, float f2) {
        float f3 = (float) ((1.0f - (f2 / this.f1026Z)) + 0.1d);
        if (f3 > 1.0f) {
            f3 = 1.0f;
        }
        if (this.f981g.f1105g) {
            f3 = 1.0f;
        }
        float f4 = f3 * this.f1025Y;
        m4719a(abstractC0244am);
        m4715a(this.f984j, abstractC0244am, this.f981g.m4705a(abstractC0244am, f4, true), this, true);
        if (this.f1041ao) {
            if (this.f1042ap == null) {
                this.f1042ap = new C1101m();
            }
            this.f1042ap.add(abstractC0244am);
        }
    }

    /* renamed from: a */
    public boolean mo2290a(LoggerMaybe loggerMaybe) {
        if (loggerMaybe.f6251cN.m5345b(this.f6957el, this.f6958em)) {
            return true;
        }
        if ((this.f1002B || this.f1005E || this.f981g.f1179X) && this.f986l != null && loggerMaybe.f6251cN.m5345b(this.f986l.f6957el, this.f986l.f6958em)) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public boolean mo2285c(float f) {
        float f2;
        float f3;
        float f4;
        if (!this.f1019S || this.f983i > 0.0f) {
            return false;
        }
        C0189g c0189g = this.f981g;
        LoggerMaybe m1072A = LoggerMaybe.m1072A();
        InterfaceC1027y interfaceC1027y = m1072A.f6113bO;
        float f5 = this.f6957el - m1072A.f6144cv;
        float f6 = this.f6958em - m1072A.f6145cw;
        if (this.f986l != null) {
            f2 = this.f986l.f6957el;
            f3 = this.f986l.f6958em;
            f4 = this.f986l.f6959en;
        } else {
            f2 = this.f988n;
            f3 = this.f989o;
            f4 = this.f990p;
        }
        if (!this.f1078aZ && !this.f1004D) {
            boolean z = false;
            if (this.f1001A) {
                if (this.f986l != null) {
                    if (!m1072A.f6110bL.m4855a(this.f986l.f6957el, this.f986l.f6958em, m1072A.f6099bs)) {
                        z = true;
                    }
                } else if (this.f987m && !m1072A.f6110bL.m4855a(this.f988n, this.f989o, m1072A.f6099bs)) {
                    z = true;
                }
            }
            if (!m1072A.f6110bL.m4855a(this.f6957el, this.f6958em, m1072A.f6099bs) && !z) {
                return false;
            }
            this.f1078aZ = true;
        }
        if (this.f1005E || c0189g.f1179X) {
            if (c0189g.f1122Y != null) {
                Paint m4708f = m4708f();
                float f7 = 0.0f;
                if (c0189g.f1127ad != 0.0f) {
                    f7 = 0.0f + (c0189g.f1127ad * this.f1010J);
                }
                float f8 = this.f6957el - m1072A.f6144cv;
                float f9 = (this.f6958em - m1072A.f6145cw) - this.f6959en;
                float f10 = (f2 - m1072A.f6144cv) + this.f1011K;
                float f11 = ((f3 - f4) - m1072A.f6145cw) + this.f1012L;
                float f12 = (f10 + f8) * 0.5f;
                float f13 = (f11 + f9) * 0.5f;
                float m2105b = C0758f.m2105b(f12, f13, f10, f11);
                float m2071d = C0758f.m2071d(f12, f13, f10, f11);
                interfaceC1027y.mo135k();
                f1089f.m5351a(f12 - c0189g.f1122Y.f6404r, f13 - m2105b, f12 + c0189g.f1122Y.f6404r, f13 + m2105b);
                interfaceC1027y.mo227a(m2071d + 90.0f, f12, f13);
                interfaceC1027y.mo191a(c0189g.f1122Y, f1089f, m4708f, 0.0f, f7, 0, 0);
                interfaceC1027y.mo134l();
                if (c0189g.f1123Z != null) {
                    if (c0189g.f1124aa) {
                        interfaceC1027y.mo135k();
                        interfaceC1027y.mo227a(m2071d + 90.0f, f8, f9);
                        interfaceC1027y.mo198a(c0189g.f1123Z, f8, f9, m4708f);
                        interfaceC1027y.mo134l();
                    } else {
                        interfaceC1027y.mo198a(c0189g.f1123Z, f8, f9, m4708f);
                    }
                }
                if (c0189g.f1125ab != null) {
                    if (c0189g.f1126ac) {
                        interfaceC1027y.mo135k();
                        interfaceC1027y.mo227a(m2071d + 90.0f, f10, f11);
                        interfaceC1027y.mo198a(c0189g.f1125ab, f10, f11, m4708f);
                        interfaceC1027y.mo134l();
                        return true;
                    }
                    interfaceC1027y.mo198a(c0189g.f1125ab, f10, f11, m4708f);
                    return true;
                }
                return true;
            }
            f1095bf.m5393c((int) (60.0f + (m4709e() * 60.0f)));
            float f14 = (f2 - m1072A.f6144cv) + this.f1011K;
            float f15 = ((f3 - f4) - m1072A.f6145cw) + this.f1012L;
            f1095bf.m5423a(6.0f);
            interfaceC1027y.mo225a(this.f6957el - m1072A.f6144cv, (this.f6958em - m1072A.f6145cw) - this.f6959en, f14, f15, f1095bf);
            f1095bf.m5423a(3.0f);
            interfaceC1027y.mo225a(this.f6957el - m1072A.f6144cv, (this.f6958em - m1072A.f6145cw) - this.f6959en, f14, f15, f1095bf);
            interfaceC1027y.mo223a(f14, f15, 8.0f, f1095bf);
            interfaceC1027y.mo223a(f14, f15, 5.0f, f1095bf);
            return true;
        } else if (this.f1002B) {
            float f16 = (f2 - m1072A.f6144cv) + this.f1011K;
            float f17 = ((f3 - f4) - m1072A.f6145cw) + this.f1012L;
            f1093bd.m5398b(this.f1043ar);
            f1094be.m5398b(this.f1043ar);
            f1094be.m5393c((int) (f1094be.m5384f() * 0.5f));
            interfaceC1027y.mo225a(this.f6957el - m1072A.f6144cv, (this.f6958em - m1072A.f6145cw) - this.f6959en, f16, f17, f1094be);
            interfaceC1027y.mo225a(this.f6957el - m1072A.f6144cv, (this.f6958em - m1072A.f6145cw) - this.f6959en, f16, f17, f1093bd);
            interfaceC1027y.mo223a(f16, f17, 5.0f, f1093bd);
            return true;
        } else if (this.f1013M) {
            this.f1014N = C0758f.m2159a(this.f1014N, f);
            if (this.f1015O == null) {
                this.f1015O = new float[20];
                this.f1014N = 0.0f;
            }
            if (this.f1014N == 0.0f) {
                this.f1014N = 4.0f;
                for (int i = 0; i < this.f1015O.length; i++) {
                    this.f1015O[i] = C0758f.m2084c(-10.0f, 10.0f);
                }
            }
            float f18 = this.f6957el - m1072A.f6144cv;
            float f19 = (this.f6958em - m1072A.f6145cw) - this.f6959en;
            float f20 = f2 - m1072A.f6144cv;
            float f21 = (f3 - f4) - m1072A.f6145cw;
            float m2082c = C0758f.m2082c(f18, f19, f20, f21);
            int length = this.f1015O.length;
            if (m2082c < 200.0f) {
                length = C0758f.m2102b(0, length - 5);
            } else if (m2082c < 100.0f) {
                length = C0758f.m2102b(0, length - 10);
            }
            float f22 = m2082c / (length - 1);
            float m2071d2 = C0758f.m2071d(f18, f19, f20, f21);
            float f23 = f18;
            float f24 = f19;
            float m2040i = C0758f.m2040i(m2071d2);
            float m2045h = C0758f.m2045h(m2071d2);
            for (int i2 = 0; i2 < length; i2++) {
                float f25 = this.f1015O[i2];
                float f26 = f18 + (m2040i * i2 * f22);
                float f27 = f19 + (m2045h * i2 * f22);
                if (i2 != length - 1) {
                    f26 -= m2045h * f25;
                    f27 += m2040i * f25;
                }
                interfaceC1027y.mo225a(f23, f24, f26, f27, f1096bg);
                f23 = f26;
                f24 = f27;
            }
            return true;
        } else if (this.f1016P != -1) {
            C0934e c0934e = f1085b;
            int i3 = 20;
            int i4 = 20;
            if (this.f1018R == 1) {
                c0934e = f1087d;
                i3 = 60;
                i4 = 60;
            } else if (this.f1018R == 2) {
                c0934e = f1086c;
                i3 = 20;
                i4 = 20;
            }
            if (c0189g.f1112C != null) {
                C1117y.m459a(c0189g.f1112C, f5, f6, 0.0f, this.f1072aT, this.f998x, f1098bc, c0189g.f1112C.f6402p, c0189g.f1112C.f6403q, 0);
            } else if (this.f1017Q != -1 && this.f1000z) {
                C1117y.m459a(c0934e, f5, f6, 0.0f, this.f1072aT, this.f998x, f1098bc, i3, i4, this.f1017Q);
            }
            if (c0189g.f1111B != null) {
                c0934e = c0189g.f1111B;
                i3 = c0189g.f1111B.f6402p;
                i4 = c0189g.f1111B.f6403q;
            }
            C1117y.m459a(c0934e, f5, f6, this.f6959en, this.f1072aT, this.f998x, m4708f(), i3, i4, this.f1016P);
            return true;
        } else {
            f1092bb.m5398b(this.f1043ar);
            if (this.f6959en > 0.0f && this.f1000z) {
                interfaceC1027y.mo223a(f5, f6, this.f998x, f1098bc);
            }
            interfaceC1027y.mo223a(f5, f6 - this.f6959en, this.f998x, f1092bb);
            if (this.f999y > 0.0f) {
                f1092bb.m5393c(f1092bb.m5384f() / 3);
                interfaceC1027y.mo223a(f5, f6 - this.f6959en, this.f999y, f1092bb);
                return true;
            }
            return true;
        }
    }

    /* renamed from: a */
    public void mo2294a(float f, boolean z) {
    }

    /* renamed from: d */
    public void mo2284d(float f) {
    }

    /* renamed from: e */
    public void mo2283e(float f) {
    }

    /* renamed from: f */
    public boolean mo2282f(float f) {
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [android.graphics.Paint] */
    /* renamed from: f */
    public Paint m4708f() {
        C0930ag c0930ag;
        if (this.f1043ar != f1090aq) {
            if (LoggerMaybe.m997as()) {
                c0930ag = m4721a(this.f1043ar);
            } else {
                c0930ag = f1092bb;
                c0930ag.m5398b(this.f1043ar);
            }
        } else {
            c0930ag = f1091ba;
        }
        return c0930ag;
    }

    /* renamed from: a */
    public C0930ag m4721a(int i) {
        if (this.f1080bj != null) {
            return this.f1080bj;
        }
        if (f1081bk != null && f1082bl == i) {
            this.f1080bj = f1081bk;
            return this.f1080bj;
        }
        C0930ag c0930ag = new C0930ag();
        c0930ag.m5417a(new LightingColorFilter(i, 0));
        c0930ag.m5398b(i);
        f1081bk = c0930ag;
        f1082bl = i;
        this.f1080bj = c0930ag;
        return this.f1080bj;
    }

    /* renamed from: a */
    public void m4723a(float f, float f2, C0449h c0449h) {
        LoggerMaybe m1072A = LoggerMaybe.m1072A();
        if (this.f984j == null) {
            LoggerMaybe.m983b("Projectile: cannot Retarget: source==null");
            return;
        }
        float m2040i = this.f6957el + (C0758f.m2040i(this.f1051az) * f2);
        float m2045h = this.f6958em + (C0758f.m2045h(this.f1051az) * f2);
        float f3 = f * f;
        float f4 = -1.0f;
        AbstractC0623y abstractC0623y = null;
        AbstractC0244am abstractC0244am = null;
        if (this.f984j instanceof AbstractC0623y) {
            abstractC0623y = (AbstractC0623y) this.f984j;
            abstractC0244am = abstractC0623y.m2869ab();
        }
        Iterator it = m1072A.f6127cc.m3161a(m2040i, m2045h, f).iterator();
        while (it.hasNext()) {
            AbstractC0244am abstractC0244am2 = (AbstractC0244am) it.next();
            if (this.f984j.f1609bV != abstractC0244am2.f1609bV) {
                boolean z = true;
                if (abstractC0623y != null) {
                    z = abstractC0623y.m2835b(abstractC0244am2, true);
                }
                if (z && this.f985k >= 0 && abstractC0623y != null && this.f985k < abstractC0623y.mo3084bl() && !abstractC0623y.mo3231a((int) this.f985k, abstractC0244am2, true, false)) {
                    z = false;
                }
                if (c0449h != null && !C0448g.m3753a(c0449h, abstractC0244am2.m4331dc())) {
                    z = false;
                }
                if (z) {
                    float m2157a = C0758f.m2157a(m2040i, m2045h, abstractC0244am2.f6957el, abstractC0244am2.f6958em);
                    boolean z2 = false;
                    if (f4 == -1.0f || m2157a < f4) {
                        z2 = true;
                    }
                    if (abstractC0244am == abstractC0244am2) {
                        z2 = true;
                    }
                    if (z2 && m2157a < f3) {
                        f4 = m2157a;
                        this.f986l = abstractC0244am2;
                    }
                }
            }
        }
    }
}
