package com.corrodinggames.rts.gameFramework.p042j;

import android.graphics.Point;
import com.corrodinggames.rts.game.p012b.C0173b;
import com.corrodinggames.rts.game.units.AbstractC0244am;
import com.corrodinggames.rts.game.units.C0237af;
import com.corrodinggames.rts.gameFramework.AbstractC0916l;

/* renamed from: com.corrodinggames.rts.gameFramework.j.h */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/j/h.class */
public class C0903h extends AbstractC0898c {

    /* renamed from: a */
    C0901f f5953a;

    /* renamed from: b */
    C0237af f5954b = new C0237af();

    /* renamed from: c */
    static Point f5955c = new Point();

    public C0903h(C0901f c0901f) {
        this.f5953a = c0901f;
    }

    @Override // com.corrodinggames.rts.gameFramework.p042j.AbstractC0898c
    /* renamed from: a */
    public C0237af mo1190a(AbstractC0244am abstractC0244am) {
        C0237af m1191a = m1191a(abstractC0244am.f6958el, abstractC0244am.f6959em);
        if (m1191a == null) {
            return null;
        }
        C0237af m1191a2 = m1191a(m1191a.f1528a, m1191a.f1529b);
        if (m1191a2 == null) {
            return m1191a;
        }
        C0237af m1191a3 = m1191a(m1191a2.f1528a, m1191a2.f1529b);
        if (m1191a3 == null) {
            return m1191a2;
        }
        return m1191a3;
    }

    @Override // com.corrodinggames.rts.gameFramework.p042j.AbstractC0898c
    /* renamed from: d */
    public void mo1187d(AbstractC0244am abstractC0244am) {
        if (this.f5953a != null) {
            this.f5953a.m1198d();
        }
        AbstractC0916l m1071A = AbstractC0916l.m1071A();
        float f = m1071A.f6194cv;
        float f2 = m1071A.f6195cw;
        C0237af m1186e = m1186e(abstractC0244am);
        if (m1186e != null) {
            float f3 = m1186e.f1528a;
            float f4 = m1186e.f1529b;
            C0901f.f5945c.m5069b(-16776961);
            m1071A.f6161bO.mo225a(abstractC0244am.f6958el - f, abstractC0244am.f6959em - f2, f3 - f, f4 - f2, C0901f.f5945c);
            C0237af mo1189b = mo1189b(abstractC0244am);
            if (mo1189b != null) {
                C0901f.f5945c.m5069b(-7829368);
                m1071A.f6161bO.mo225a(f3 - f, f4 - f2, mo1189b.f1528a - f, mo1189b.f1529b - f2, C0901f.f5945c);
            }
        }
        C0237af mo1190a = mo1190a(abstractC0244am);
        if (mo1190a != null) {
            float f5 = mo1190a.f1528a;
            float f6 = mo1190a.f1529b;
            C0901f.f5945c.m5069b(-256);
            m1071A.f6161bO.mo225a(abstractC0244am.f6958el - f, abstractC0244am.f6959em - f2, f5 - f, f6 - f2, C0901f.f5945c);
        }
    }

    /* renamed from: e */
    public C0237af m1186e(AbstractC0244am abstractC0244am) {
        return m1191a(abstractC0244am.f6958el, abstractC0244am.f6959em);
    }

    @Override // com.corrodinggames.rts.gameFramework.p042j.AbstractC0898c
    /* renamed from: b */
    public C0237af mo1189b(AbstractC0244am abstractC0244am) {
        C0237af m1191a = m1191a(abstractC0244am.f6958el, abstractC0244am.f6959em);
        if (m1191a == null) {
            return null;
        }
        return m1191a(m1191a.f1528a, m1191a.f1529b);
    }

    @Override // com.corrodinggames.rts.gameFramework.p042j.AbstractC0898c
    /* renamed from: c */
    public void mo1188c(AbstractC0244am abstractC0244am) {
    }

    /* renamed from: a */
    public C0237af m1191a(float f, float f2) {
        byte m1199a;
        if (this.f5953a.f5944b == null) {
            return null;
        }
        C0173b c0173b = AbstractC0916l.m1071A().f6158bL;
        int i = (int) (f * c0173b.f799r);
        int i2 = (int) (f2 * c0173b.f800s);
        if (!c0173b.m4490c(i, i2) || (m1199a = this.f5953a.m1199a(i, i2)) == 0) {
            return null;
        }
        C0901f.m1200a(m1199a, f5955c);
        int i3 = i - f5955c.f224a;
        int i4 = i2 - f5955c.f225b;
        this.f5954b.f1528a = (i3 * c0173b.f795n) + c0173b.f797p;
        this.f5954b.f1529b = (i4 * c0173b.f796o) + c0173b.f798q;
        return this.f5954b;
    }
}
