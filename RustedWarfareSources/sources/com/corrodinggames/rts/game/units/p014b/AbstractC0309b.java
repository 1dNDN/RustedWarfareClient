package com.corrodinggames.rts.game.units.p014b;

import com.corrodinggames.rts.C0067R;
import com.corrodinggames.rts.game.AbstractC0197n;
import com.corrodinggames.rts.game.units.AbstractC0621w;
import com.corrodinggames.rts.game.units.EnumC0233ab;
import com.corrodinggames.rts.game.units.EnumC0246ao;
import com.corrodinggames.rts.gameFramework.LoggerMaybe;
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

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y, com.corrodinggames.rts.game.units.AbstractC0244am, com.corrodinggames.rts.gameFramework.AbstractC0668az, com.corrodinggames.rts.gameFramework.AbstractC1120w, com.corrodinggames.rts.gameFramework.AbstractC0726bk
    /* renamed from: a */
    public void mo2292a(StreamWriter streamWriter) {
        streamWriter.mo1320a(this.f1841h);
        streamWriter.mo1314a(this.f1842i);
        super.mo2292a(streamWriter);
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y, com.corrodinggames.rts.game.units.AbstractC0244am, com.corrodinggames.rts.gameFramework.AbstractC0668az, com.corrodinggames.rts.gameFramework.AbstractC1120w
    /* renamed from: a */
    public void mo2291a(Reader reader) {
        this.f1841h = reader.m1285g();
        this.f1842i = reader.ReadBool();
        super.mo2291a(reader);
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: v */
    public C0934e mo2977v() {
        if (this.f1609bV.f1306k == -1) {
            return null;
        }
        return f1847n[this.f1609bV.m4650O()];
    }

    /* renamed from: K */
    public static void m4205K() {
        f1846m = LoggerMaybe.m1072A().f6113bO.mo221a(C0067R.drawable.unit_icon_air);
        f1847n = AbstractC0197n.m4627a(f1846m);
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: h */
    public EnumC0246ao mo2982h() {
        return EnumC0246ao.f1706d;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y, com.corrodinggames.rts.game.units.AbstractC0244am, com.corrodinggames.rts.gameFramework.AbstractC1120w
    /* renamed from: a */
    public void mo1718a(float f) {
        C0745e m2317b;
        super.mo1718a(f);
        if (this.f1607bT) {
            if (this.f6959en > 0.0f) {
                this.f1841h += 0.06f * f;
                this.f6959en -= this.f1841h * f;
                return;
            }
            if (this.f1844k == null) {
                this.f1844k = Boolean.valueOf(m4372cJ());
            }
            if (this.f1845l == null) {
                this.f1845l = Boolean.valueOf(m4373cI());
            }
            if (!this.f1842i) {
                this.f1842i = true;
                if (this.f1844k.booleanValue()) {
                    m2924a(EnumC0233ab.f1502a);
                    if (this.f1845l.booleanValue()) {
                        LoggerMaybe.m1072A().f6116bR.m2331a(this.f6957el, this.f6958em, 0.0f, 0, 0.0f, 0.0f, this.f1618ce);
                    }
                } else {
                    m2924a(EnumC0233ab.f1503b);
                }
                this.f1841h = 0.0f;
            } else if (this.f1844k.booleanValue()) {
                if (this.f6959en > -10.0f) {
                    this.f1841h += 8.0E-4f * f;
                    this.f6959en -= this.f1841h * f;
                    if (this.f1845l.booleanValue()) {
                        this.f1843j += f;
                        if (this.f1843j > 30.0f) {
                            this.f1843j = 0.0f;
                            if (mo3246p_() && (m2317b = LoggerMaybe.m1072A().f6116bR.m2317b(this.f6957el, this.f6958em, this.f6959en, this.f1618ce)) != null) {
                                m2317b.f4744Q = 0.0f;
                                m2317b.f4745R = -0.1f;
                            }
                        }
                    }
                }
            } else {
                this.f6959en = 0.0f;
            }
        }
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: e */
    public boolean mo2986e() {
        LoggerMaybe m1072A = LoggerMaybe.m1072A();
        if (this.f6959en > -1.0f) {
            for (int i = 0; i < 3; i++) {
                m1072A.f6116bR.m2306e(this.f6957el, this.f6958em, this.f6959en);
            }
        }
        return super.mo2986e();
    }
}
