package com.corrodinggames.rts.game.p010a;

import android.graphics.PointF;
import com.corrodinggames.rts.game.units.AbstractC0244am;
import com.corrodinggames.rts.game.units.AbstractC0623y;
import com.corrodinggames.rts.game.units.EnumC0246ao;
import com.corrodinggames.rts.game.units.EnumC0249ar;
import com.corrodinggames.rts.game.units.InterfaceC0303as;
import com.corrodinggames.rts.game.units.p024d.AbstractC0488d;
import com.corrodinggames.rts.gameFramework.AbstractC0726bk;
import com.corrodinggames.rts.gameFramework.AbstractC1120w;
import com.corrodinggames.rts.gameFramework.C0758f;
import com.corrodinggames.rts.gameFramework.LoggerMaybe;
import com.corrodinggames.rts.gameFramework.p041i.Reader;
import com.corrodinggames.rts.gameFramework.p041i.StreamWriter;
import com.corrodinggames.rts.gameFramework.utility.C1117y;
import java.util.ArrayList;

/* renamed from: com.corrodinggames.rts.game.a.o */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/a/o.class */
public abstract class AbstractC0170o extends AbstractC0726bk {

    /* renamed from: Q */
    public int f759Q;

    /* renamed from: R */
    protected final C0136a f760R;

    /* renamed from: S */
    public float f761S;

    /* renamed from: T */
    public float f762T;

    /* renamed from: U */
    public float f763U;

    /* renamed from: V */
    public boolean f764V;

    /* renamed from: W */
    static final ArrayList f765W = new ArrayList();

    @Override // com.corrodinggames.rts.gameFramework.AbstractC0726bk
    /* renamed from: a */
    public void mo2292a(StreamWriter streamWriter) {
        streamWriter.mo1320a(this.f761S);
        streamWriter.mo1320a(this.f762T);
        streamWriter.mo1320a(this.f763U);
    }

    /* renamed from: a */
    public void mo4877a(Reader reader) {
        this.f761S = reader.m1285g();
        this.f762T = reader.m1285g();
        this.f763U = reader.m1285g();
    }

    public AbstractC0170o(C0136a c0136a) {
        c0136a.f569aH++;
        this.f759Q = c0136a.f569aH;
        this.f760R = c0136a;
        this.f760R.f599bl.add(this);
        this.f760R.f600bm.add(this);
    }

    public AbstractC0170o(C0136a c0136a, float f, float f2) {
        this(c0136a);
        this.f761S = f;
        this.f762T = f2;
    }

    /* renamed from: p */
    public void mo4871p() {
        this.f760R.f599bl.remove(this);
        this.f760R.f600bm.remove(this);
        this.f764V = true;
    }

    /* renamed from: c */
    public boolean m4875c(float f, float f2) {
        float m2157a = C0758f.m2157a(this.f761S, this.f762T, f, f2);
        float f3 = this.f763U;
        if (m2157a < f3 * f3) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public boolean m4876b(AbstractC0244am abstractC0244am) {
        float m2157a = C0758f.m2157a(this.f761S, this.f762T, abstractC0244am.f6957el, abstractC0244am.f6958em);
        float f = this.f763U + abstractC0244am.f1621ch;
        if (m2157a < f * f) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public boolean m4878a(AbstractC0244am abstractC0244am, float f) {
        float m2157a = C0758f.m2157a(this.f761S, this.f762T, abstractC0244am.f6957el, abstractC0244am.f6958em);
        float f2 = this.f763U + abstractC0244am.f1621ch + f;
        if (m2157a < f2 * f2) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public float m4874c(AbstractC0244am abstractC0244am) {
        return C0758f.m2157a(this.f761S, this.f762T, abstractC0244am.f6957el, abstractC0244am.f6958em);
    }

    /* renamed from: a */
    public float m4879a(C0164i c0164i) {
        return C0758f.m2157a(this.f761S, this.f762T, c0164i.f761S, c0164i.f762T);
    }

    /* renamed from: d */
    public float m4873d(float f, float f2) {
        return C0758f.m2157a(this.f761S, this.f762T, f, f2);
    }

    /* renamed from: w */
    public PointF m4870w() {
        PointF pointF = new PointF();
        float random = (float) (Math.random() * 360.0d);
        float random2 = (float) (Math.random() * this.f763U);
        pointF.m5369a(this.f761S + (C0758f.m2040i(random) * random2), this.f762T + (C0758f.m2045h(random) * random2));
        return pointF;
    }

    /* renamed from: e */
    public PointF m4872e(InterfaceC0303as interfaceC0303as) {
        int m450c;
        LoggerMaybe m1072A = LoggerMaybe.m1072A();
        PointF pointF = new PointF();
        float f = this.f763U;
        EnumC0246ao enumC0246ao = EnumC0246ao.f1704b;
        AbstractC1120w abstractC1120w = null;
        if (interfaceC0303as == EnumC0249ar.f1738d) {
            f = 600.0f;
            enumC0246ao = EnumC0246ao.f1707e;
        }
        for (int i = 0; i < 15; i++) {
            EnumC0249ar enumC0249ar = null;
            boolean z = false;
            boolean z2 = false;
            if (this instanceof C0164i) {
                C0164i c0164i = (C0164i) this;
                if (i < 6 && interfaceC0303as == EnumC0249ar.f1770J) {
                    enumC0249ar = EnumC0249ar.f1770J;
                }
                if (enumC0249ar != null) {
                    AbstractC0623y abstractC0623y = null;
                    if (abstractC1120w == null) {
                        abstractC1120w = AbstractC0244am.m4383c(interfaceC0303as);
                    }
                    if (abstractC1120w instanceof AbstractC0623y) {
                        abstractC0623y = (AbstractC0623y) abstractC1120w;
                    }
                    int m4915c = c0164i.m4915c(enumC0249ar);
                    if (abstractC0623y != null && m4915c > 1) {
                        int i2 = -1;
                        int m2151a = C0758f.m2151a(0, m4915c - 1);
                        AbstractC0244am[] m498a = AbstractC0244am.f1590bD.m498a();
                        int size = AbstractC0244am.f1590bD.size();
                        for (int i3 = 0; i3 < size; i3++) {
                            AbstractC0244am abstractC0244am = m498a[i3];
                            if (abstractC0244am.f1609bV == this.f760R && c0164i.m4934a(abstractC0244am) && abstractC0244am.m4396bS() && this.f760R.m5011i(abstractC0244am) && abstractC0244am.mo5649r() == enumC0249ar) {
                                i2++;
                                if (i2 == m2151a) {
                                    float f2 = abstractC0244am.f6957el;
                                    float f3 = abstractC0244am.f6958em;
                                    float f4 = f2;
                                    float f5 = f3;
                                    if (C0758f.m2151a(0, 1) == 0) {
                                        f5 += C0758f.m2084c(-150.0f, 150.0f);
                                    } else {
                                        f4 += C0758f.m2084c(-150.0f, 150.0f);
                                    }
                                    f765W.clear();
                                    m1072A.f6117bS.m1834a(abstractC0623y, f2, f3, f4, f5, false, f765W, (AbstractC0244am) null);
                                    if (f765W.size() > 0) {
                                        PointF pointF2 = (PointF) f765W.get(0);
                                        pointF.m5369a(pointF2.f227a, pointF2.f228b);
                                        z = true;
                                    } else {
                                        z2 = true;
                                    }
                                }
                            }
                        }
                    }
                }
            }
            if (!z2) {
                if (!z) {
                    float random = (float) (Math.random() * 360.0d);
                    float random2 = (float) (Math.random() * f);
                    pointF.m5369a(this.f761S + (C0758f.m2040i(random) * random2), this.f762T + (C0758f.m2045h(random) * random2));
                }
                m1072A.f6110bL.m4857a(pointF.f227a, pointF.f228b);
                int i4 = m1072A.f6110bL.f801T;
                int i5 = m1072A.f6110bL.f802U;
                if (m1072A.f6110bL.m4813c(i4, i5) && (((m450c = C1117y.m450c(i4, i5, enumC0246ao)) > 5 || m450c == 0) && AbstractC0488d.m3383a(interfaceC0303as, pointF.f227a, pointF.f228b, this.f760R))) {
                    return pointF;
                }
                if (interfaceC0303as == EnumC0249ar.f1738d) {
                    f += 100.0f;
                }
            }
        }
        return null;
    }
}
