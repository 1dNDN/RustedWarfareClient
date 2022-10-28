package com.corrodinggames.rts.game;

import android.graphics.Color;
import com.corrodinggames.rts.game.units.AbstractC0244am;
import com.corrodinggames.rts.game.units.custom.C0405bf;
import com.corrodinggames.rts.game.units.custom.C0406bg;
import com.corrodinggames.rts.game.units.custom.C0413bn;
import com.corrodinggames.rts.game.units.custom.C0449h;
import com.corrodinggames.rts.game.units.custom.C0467y;
import com.corrodinggames.rts.gameFramework.Core;
import com.corrodinggames.rts.gameFramework.p041i.Reader;
import com.corrodinggames.rts.gameFramework.p041i.StreamWriter;
import com.corrodinggames.rts.gameFramework.p044l.C0934e;
import com.corrodinggames.rts.gameFramework.utility.C1101m;
import java.io.IOException;
import java.util.Iterator;

/* renamed from: com.corrodinggames.rts.game.g */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/g.class */
public class C0189g {

    /* renamed from: a */
    public static final C0189g f1099a = new C0189g();

    /* renamed from: b */
    public int f1100b;

    /* renamed from: c */
    public int f1101c;

    /* renamed from: d */
    public boolean f1102d;

    /* renamed from: e */
    public boolean f1103e;

    /* renamed from: f */
    public boolean f1104f;

    /* renamed from: g */
    public boolean f1105g;

    /* renamed from: h */
    public boolean f1106h;

    /* renamed from: u */
    public float f1107u;

    /* renamed from: v */
    public float f1108v;

    /* renamed from: y */
    public short f1109y;

    /* renamed from: A */
    public boolean f1110A;

    /* renamed from: B */
    public C0934e f1111B;

    /* renamed from: C */
    public C0934e f1112C;

    /* renamed from: D */
    public float f1113D;

    /* renamed from: E */
    public float f1114E;

    /* renamed from: F */
    public float f1115F;

    /* renamed from: G */
    public float f1116G;

    /* renamed from: H */
    public float f1117H;

    /* renamed from: Q */
    public float f1118Q;

    /* renamed from: R */
    public float f1119R;

    /* renamed from: S */
    public float f1120S;

    /* renamed from: T */
    public boolean f1121T;

    /* renamed from: Y */
    public C0934e f1122Y;

    /* renamed from: Z */
    public C0934e f1123Z;

    /* renamed from: aa */
    public boolean f1124aa;

    /* renamed from: ab */
    public C0934e f1125ab;

    /* renamed from: ac */
    public boolean f1126ac;

    /* renamed from: ad */
    public float f1127ad;

    /* renamed from: ah */
    public C0467y f1128ah;

    /* renamed from: ai */
    public C0467y f1129ai;

    /* renamed from: aj */
    public C0406bg f1130aj;

    /* renamed from: ak */
    public C0406bg f1131ak;

    /* renamed from: al */
    public C0406bg f1132al;

    /* renamed from: am */
    public float f1133am;

    /* renamed from: aq */
    public boolean f1134aq;

    /* renamed from: az */
    public boolean f1135az;

    /* renamed from: aD */
    public C0449h f1136aD;

    /* renamed from: aI */
    public boolean f1137aI;

    /* renamed from: aK */
    public float f1138aK;

    /* renamed from: aL */
    public float f1139aL;

    /* renamed from: aM */
    public float f1140aM;

    /* renamed from: aN */
    public boolean f1141aN;

    /* renamed from: aO */
    public boolean f1142aO;

    /* renamed from: aP */
    public float f1143aP;

    /* renamed from: aQ */
    public float f1144aQ;

    /* renamed from: aV */
    public float f1145aV;

    /* renamed from: aX */
    public C0467y f1146aX;

    /* renamed from: aY */
    public C0467y f1147aY;

    /* renamed from: aZ */
    public C0413bn f1148aZ;

    /* renamed from: ba */
    public int f1149ba;

    /* renamed from: bb */
    public boolean f1150bb;

    /* renamed from: bc */
    public boolean f1151bc;

    /* renamed from: bd */
    public C0449h f1152bd;

    /* renamed from: i */
    public int f1153i = 35;

    /* renamed from: j */
    public float f1154j = -1.0f;

    /* renamed from: k */
    public boolean f1155k = false;

    /* renamed from: l */
    public boolean f1156l = false;

    /* renamed from: m */
    public boolean f1157m = false;

    /* renamed from: n */
    public boolean f1158n = false;

    /* renamed from: o */
    public float f1159o = 1.0f;

    /* renamed from: p */
    public boolean f1160p = false;

    /* renamed from: q */
    public boolean f1161q = false;

    /* renamed from: r */
    public boolean f1162r = false;

    /* renamed from: s */
    public boolean f1163s = false;

    /* renamed from: t */
    public boolean f1164t = false;

    /* renamed from: w */
    public float f1165w = 5.0f;

    /* renamed from: x */
    public short f1166x = -1;

    /* renamed from: z */
    public short f1167z = -1;

    /* renamed from: I */
    public boolean f1168I = false;

    /* renamed from: J */
    public boolean f1169J = false;

    /* renamed from: K */
    public float f1170K = -1.0f;

    /* renamed from: L */
    public boolean f1171L = false;

    /* renamed from: M */
    public boolean f1172M = false;

    /* renamed from: N */
    public boolean f1173N = false;

    /* renamed from: O */
    public float f1174O = -1.0f;

    /* renamed from: P */
    public float f1175P = -1.0f;

    /* renamed from: U */
    public boolean f1176U = false;

    /* renamed from: V */
    public boolean f1177V = false;

    /* renamed from: W */
    public boolean f1178W = false;

    /* renamed from: X */
    public boolean f1179X = false;

    /* renamed from: ae */
    public boolean f1180ae = false;

    /* renamed from: af */
    public boolean f1181af = false;

    /* renamed from: ag */
    public float f1182ag = 3.0f;

    /* renamed from: an */
    public float f1183an = 5.0f;

    /* renamed from: ao */
    public int f1184ao = -1;

    /* renamed from: ap */
    public float f1185ap = 0.5f;

    /* renamed from: ar */
    public boolean f1186ar = false;

    /* renamed from: as */
    public float f1187as = -1.0f;

    /* renamed from: at */
    public float f1188at = -1.0f;

    /* renamed from: au */
    public float f1189au = -1.0f;

    /* renamed from: av */
    public float f1190av = 0.1f;

    /* renamed from: aw */
    public boolean f1191aw = false;

    /* renamed from: ax */
    public float f1192ax = 120.0f;

    /* renamed from: ay */
    public float f1193ay = 15.0f;

    /* renamed from: aA */
    public float f1194aA = 5.0f;

    /* renamed from: aB */
    public float f1195aB = 120.0f;

    /* renamed from: aC */
    public float f1196aC = 15.0f;

    /* renamed from: aE */
    public int f1197aE = Color.m5948a(255, 255, 255, 255);

    /* renamed from: aF */
    public float f1198aF = 1.0f;

    /* renamed from: aG */
    public float f1199aG = 0.0f;

    /* renamed from: aH */
    public float f1200aH = 1.0f;

    /* renamed from: aJ */
    public boolean f1201aJ = true;

    /* renamed from: aR */
    public float f1202aR = 1.0f;

    /* renamed from: aS */
    public float f1203aS = 1.0f;

    /* renamed from: aT */
    public float f1204aT = 1.0f;

    /* renamed from: aU */
    public float f1205aU = 1.0f;

    /* renamed from: aW */
    public float f1206aW = -1.0f;

    /* renamed from: be */
    public C1101m f1207be = null;

    /* renamed from: bf */
    public C1101m f1208bf = null;

    /* renamed from: bg */
    public C1101m f1209bg = null;

    /* renamed from: a */
    public C0467y m5189a(AbstractC0244am abstractC0244am) {
        C1101m c1101m = this.f1209bg;
        if (c1101m != null && c1101m.f6894a > 0) {
            Iterator it = c1101m.iterator();
            while (it.hasNext()) {
                C0190h c0190h = (C0190h) it.next();
                if (c0190h.m5186a(abstractC0244am) && c0190h.f1216g != null) {
                    return c0190h.f1216g;
                }
            }
            return null;
        }
        return null;
    }

    /* renamed from: a */
    public float m5188a(AbstractC0244am abstractC0244am, float f, boolean z) {
        C1101m c1101m;
        float f2;
        if (!z) {
            c1101m = this.f1207be;
        } else {
            c1101m = this.f1208bf;
        }
        if (c1101m != null && c1101m.f6894a > 0) {
            Iterator it = c1101m.iterator();
            while (it.hasNext()) {
                C0190h c0190h = (C0190h) it.next();
                if (c0190h.m5186a(abstractC0244am)) {
                    if (!z) {
                        if (c0190h.f1214e != null) {
                            c0190h.f1214e.m4084h(abstractC0244am);
                        }
                        f2 = c0190h.f1212c;
                    } else {
                        if (c0190h.f1215f != null) {
                            c0190h.f1215f.m4084h(abstractC0244am);
                        }
                        f2 = c0190h.f1213d;
                    }
                    f *= f2;
                }
            }
        }
        return f;
    }

    /* renamed from: a */
    public static void m5190a(C0189g c0189g, StreamWriter streamWriter) {
        if (c0189g == f1099a) {
            streamWriter.m1401c(0);
        } else if (c0189g instanceof C0405bf) {
            streamWriter.m1401c(1);
            C0405bf.m4171a((C0405bf) c0189g, streamWriter);
        } else {
            Core.m973g("writeOutLink: Unhandled projectile type");
            streamWriter.m1401c(0);
        }
    }

    /* renamed from: a */
    public static C0189g m5187a(Reader reader) {
        byte m1304d = reader.m1304d();
        if (m1304d == 0) {
            return f1099a;
        }
        if (m1304d == 1) {
            C0189g m4170b = C0405bf.m4170b(reader);
            if (m4170b == null) {
                return f1099a;
            }
            return m4170b;
        }
        throw new IOException("Unknown projectile type:" + ((int) m1304d));
    }
}
