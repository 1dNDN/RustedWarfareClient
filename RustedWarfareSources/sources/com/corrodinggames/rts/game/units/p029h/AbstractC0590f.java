package com.corrodinggames.rts.game.units.p029h;

import com.corrodinggames.rts.C0067R;
import com.corrodinggames.rts.game.AbstractC0197n;
import com.corrodinggames.rts.game.units.AbstractC0621w;
import com.corrodinggames.rts.game.units.EnumC0246ao;
import com.corrodinggames.rts.gameFramework.C0758f;
import com.corrodinggames.rts.gameFramework.LoggerMaybe;
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

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y, com.corrodinggames.rts.game.units.AbstractC0244am, com.corrodinggames.rts.gameFramework.AbstractC0668az, com.corrodinggames.rts.gameFramework.AbstractC1120w, com.corrodinggames.rts.gameFramework.AbstractC0726bk
    /* renamed from: a */
    public void mo2292a(StreamWriter streamWriter) {
        streamWriter.mo1320a(this.f3846n);
        streamWriter.mo1314a(this.f3847o);
        super.mo2292a(streamWriter);
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y, com.corrodinggames.rts.game.units.AbstractC0244am, com.corrodinggames.rts.gameFramework.AbstractC0668az, com.corrodinggames.rts.gameFramework.AbstractC1120w
    /* renamed from: a */
    public void mo2291a(Reader reader) {
        this.f3846n = reader.m1285g();
        this.f3847o = reader.ReadBool();
        super.mo2291a(reader);
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: v */
    public C0934e mo2977v() {
        if (this.f1609bV.f1306k == -1) {
            return null;
        }
        return f3849q[this.f1609bV.m4650O()];
    }

    /* renamed from: L */
    public static void m3058L() {
        f3848p = LoggerMaybe.m1072A().f6113bO.mo221a(C0067R.drawable.unit_icon_water);
        f3849q = AbstractC0197n.m4627a(f3848p);
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: h */
    public EnumC0246ao mo2982h() {
        return EnumC0246ao.f1707e;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: ct */
    public boolean mo3057ct() {
        return true;
    }

    /* renamed from: f */
    public boolean mo3056f() {
        return true;
    }

    /* renamed from: s */
    public void mo3055s(float f) {
        if (this.f6959en != 0.0f) {
            this.f6959en = C0758f.m2158a(this.f6959en, 0.0f, 0.2f * f);
        }
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y, com.corrodinggames.rts.game.units.AbstractC0244am, com.corrodinggames.rts.gameFramework.AbstractC1120w
    /* renamed from: a */
    public void mo1718a(float f) {
        super.mo1718a(f);
        if (this.f1607bT) {
            if (this.f6959en > -10.0f) {
                this.f3846n += 0.002f * f;
                this.f6959en -= this.f3846n * f;
                return;
            }
            this.f6959en = -10.0f;
            if (!this.f3847o) {
                this.f3847o = true;
            }
        } else if (!m4396bS() || this.f1607bT) {
        } else {
            mo3055s(f);
            if (mo3056f()) {
                if (this.f1617cd != 0.0f) {
                    this.f3845m += f;
                }
                if (this.f3845m > 10.0f) {
                    this.f3845m = 0.0f;
                    if (mo3246p_()) {
                        LoggerMaybe m1072A = LoggerMaybe.m1072A();
                        float f2 = this.f1618ce + 180.0f;
                        if (this.f1617cd < 0.0f) {
                            f2 += 180.0f;
                        }
                        float f3 = this.f1621ch - 6.0f;
                        if (f3 < 4.0f) {
                            f3 = 4.0f;
                        }
                        m1072A.f6116bR.m2317b(this.f6957el + (C0758f.m2040i(f2) * f3), this.f6958em + (C0758f.m2045h(f2) * f3), 0.0f, f2);
                    }
                }
            }
        }
    }
}
