package com.corrodinggames.rts.game.units.p014b;

import com.corrodinggames.rts.C0067R;
import com.corrodinggames.rts.game.AbstractC0197n;
import com.corrodinggames.rts.game.units.AbstractC0621w;
import com.corrodinggames.rts.game.units.EnumC0233ab;
import com.corrodinggames.rts.game.units.EnumC0246ao;
import com.corrodinggames.rts.gameFramework.Core;
import com.corrodinggames.rts.gameFramework.p035d.C0745e;
import com.corrodinggames.rts.gameFramework.p041i.Reader;
import com.corrodinggames.rts.gameFramework.p041i.StreamWriter;
import com.corrodinggames.rts.gameFramework.p044l.C0934e;

/* renamed from: com.corrodinggames.rts.game.units.b.b */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/b/b.class */
public abstract class AbstractC0309b extends AbstractC0621w {

    /* renamed from: h */
    float f1841h;

    /* renamed from: i */
    boolean f1842i;

    /* renamed from: j */
    float f1843j;

    /* renamed from: k */
    Boolean f1844k;

    /* renamed from: l */
    Boolean f1845l;

    /* renamed from: m */
    public static C0934e f1846m = null;

    /* renamed from: n */
    public static C0934e[] f1847n = new C0934e[10];

    public AbstractC0309b(boolean z) {
        super(z);
        this.f1842i = false;
    }

    /* renamed from: a */
    public void mo2441a(StreamWriter streamWriter) {
        streamWriter.mo1335a(this.f1841h);
        streamWriter.mo1329a(this.f1842i);
        super.mo2441a(streamWriter);
    }

    /* renamed from: a */
    public void m4425a(Reader reader) {
        this.f1841h = reader.m1300g();
        this.f1842i = reader.ReadBool();
        super.m2961a(reader);
    }

    /* renamed from: v */
    public C0934e mo3034v() {
        if (this.f1609bV.f1306k == -1) {
            return null;
        }
        return f1847n[this.f1609bV.m5105O()];
    }

    /* renamed from: K */
    public static void m4426K() {
        f1846m = Core.m1087A().f6113bO.mo221a(C0067R.drawable.unit_icon_air);
        f1847n = AbstractC0197n.m5082a(f1846m);
    }

    /* renamed from: h */
    public EnumC0246ao mo3039h() {
        return EnumC0246ao.f1706d;
    }

    /* renamed from: a */
    public void mo1762a(float f) {
        C0745e m2369b;
        super.mo1762a(f);
        if (this.f1607bT) {
            if (this.f6960en > 0.0f) {
                this.f1841h += 0.06f * f;
                this.f6960en -= this.f1841h * f;
                return;
            }
            if (this.f1844k == null) {
                this.f1844k = Boolean.valueOf(m4724cJ());
            }
            if (this.f1845l == null) {
                this.f1845l = Boolean.valueOf(m4725cI());
            }
            if (!this.f1842i) {
                this.f1842i = true;
                if (this.f1844k.booleanValue()) {
                    m2981a(EnumC0233ab.f1502a);
                    if (this.f1845l.booleanValue()) {
                        Core.m1087A().f6116bR.m2383a(this.f6958el, this.f6959em, 0.0f, 0, 0.0f, 0.0f, this.f1618ce);
                    }
                } else {
                    m2981a(EnumC0233ab.f1503b);
                }
                this.f1841h = 0.0f;
            } else if (this.f1844k.booleanValue()) {
                if (this.f6960en > -10.0f) {
                    this.f1841h += 8.0E-4f * f;
                    this.f6960en -= this.f1841h * f;
                    if (this.f1845l.booleanValue()) {
                        this.f1843j += f;
                        if (this.f1843j > 30.0f) {
                            this.f1843j = 0.0f;
                            if (mo3348p_() && (m2369b = Core.m1087A().f6116bR.m2369b(this.f6958el, this.f6959em, this.f6960en, this.f1618ce)) != null) {
                                m2369b.f4760Q = 0.0f;
                                m2369b.f4761R = -0.1f;
                            }
                        }
                    }
                }
            } else {
                this.f6960en = 0.0f;
            }
        }
    }

    /* renamed from: e */
    public boolean mo3043e() {
        Core m1087A = Core.m1087A();
        if (this.f6960en > -1.0f) {
            for (int i = 0; i < 3; i++) {
                m1087A.f6116bR.m2358e(this.f6958el, this.f6959em, this.f6960en);
            }
        }
        return super.mo3043e();
    }
}
