package com.corrodinggames.rts.game.units.p029h;

import com.corrodinggames.rts.C0067R;
import com.corrodinggames.rts.game.AbstractC0197n;
import com.corrodinggames.rts.game.units.AbstractC0621w;
import com.corrodinggames.rts.game.units.EnumC0246ao;
import com.corrodinggames.rts.gameFramework.C0758f;
import com.corrodinggames.rts.gameFramework.Core;
import com.corrodinggames.rts.gameFramework.p041i.Reader;
import com.corrodinggames.rts.gameFramework.p041i.StreamWriter;
import com.corrodinggames.rts.gameFramework.p044l.C0934e;

/* renamed from: com.corrodinggames.rts.game.units.h.f */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/h/f.class */
public abstract class AbstractC0590f extends AbstractC0621w {

    /* renamed from: m */
    float f3845m;

    /* renamed from: n */
    float f3846n;

    /* renamed from: o */
    boolean f3847o;

    /* renamed from: p */
    public static C0934e f3848p = null;

    /* renamed from: q */
    public static C0934e[] f3849q = new C0934e[10];

    public AbstractC0590f(boolean z) {
        super(z);
        this.f3847o = false;
    }

    /* renamed from: a */
    public void mo2441a(StreamWriter streamWriter) {
        streamWriter.mo1335a(this.f3846n);
        streamWriter.mo1329a(this.f3847o);
        super.mo2441a(streamWriter);
    }

    /* renamed from: a */
    public void m3133a(Reader reader) {
        this.f3846n = reader.m1300g();
        this.f3847o = reader.ReadBool();
        super.m2961a(reader);
    }

    /* renamed from: v */
    public C0934e mo3034v() {
        if (this.f1609bV.f1306k == -1) {
            return null;
        }
        return f3849q[this.f1609bV.m5105O()];
    }

    /* renamed from: L */
    public static void m3134L() {
        f3848p = Core.m1087A().f6113bO.mo221a(C0067R.drawable.unit_icon_water);
        f3849q = AbstractC0197n.m5082a(f3848p);
    }

    /* renamed from: h */
    public EnumC0246ao mo3039h() {
        return EnumC0246ao.f1707e;
    }

    /* renamed from: ct */
    public boolean m3132ct() {
        return true;
    }

    /* renamed from: f */
    public boolean m3131f() {
        return true;
    }

    /* renamed from: s */
    public void m3130s(float f) {
        if (this.f6960en != 0.0f) {
            this.f6960en = C0758f.m2210a(this.f6960en, 0.0f, 0.2f * f);
        }
    }

    /* renamed from: a */
    public void mo1762a(float f) {
        super.mo1762a(f);
        if (this.f1607bT) {
            if (this.f6960en > -10.0f) {
                this.f3846n += 0.002f * f;
                this.f6960en -= this.f3846n * f;
                return;
            }
            this.f6960en = -10.0f;
            if (!this.f3847o) {
                this.f3847o = true;
            }
        } else if (!m4751bS() || this.f1607bT) {
        } else {
            m3130s(f);
            if (m3131f()) {
                if (this.f1617cd != 0.0f) {
                    this.f3845m += f;
                }
                if (this.f3845m > 10.0f) {
                    this.f3845m = 0.0f;
                    if (mo3348p_()) {
                        Core m1087A = Core.m1087A();
                        float f2 = this.f1618ce + 180.0f;
                        if (this.f1617cd < 0.0f) {
                            f2 += 180.0f;
                        }
                        float f3 = this.f1621ch - 6.0f;
                        if (f3 < 4.0f) {
                            f3 = 4.0f;
                        }
                        m1087A.f6116bR.m2369b(this.f6958el + (C0758f.m2092i(f2) * f3), this.f6959em + (C0758f.m2097h(f2) * f3), 0.0f, f2);
                    }
                }
            }
        }
    }
}
