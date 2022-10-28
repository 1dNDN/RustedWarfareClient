package com.corrodinggames.rts.game.p010a.p011a;

import android.graphics.PointF;
import com.corrodinggames.rts.game.p010a.C0136a;
import com.corrodinggames.rts.game.p010a.C0161f;
import com.corrodinggames.rts.game.units.AbstractC0244am;
import com.corrodinggames.rts.game.units.AbstractC0623y;
import com.corrodinggames.rts.game.units.custom.C0448g;
import com.corrodinggames.rts.game.units.custom.p016a.EnumC0340e;
import com.corrodinggames.rts.game.units.p013a.AbstractC0224s;
import com.corrodinggames.rts.game.units.p024d.InterfaceC0501l;

/* renamed from: com.corrodinggames.rts.game.a.a.d */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/a/a/d.class */
public class C0156d extends AbstractC0155c {

    /* renamed from: b */
    public final boolean f641b = true;

    /* renamed from: c */
    static final C0448g f642c = C0448g.m3565c("nukeLauncher");

    @Override // com.corrodinggames.rts.game.p010a.p011a.AbstractC0150a
    /* renamed from: a */
    public EnumC0152b mo4671a() {
        return EnumC0152b.nuking;
    }

    @Override // com.corrodinggames.rts.game.p010a.p011a.AbstractC0155c
    /* renamed from: c */
    public boolean mo4668c(C0136a c0136a, AbstractC0623y abstractC0623y) {
        return m4670a(abstractC0623y);
    }

    /* renamed from: d */
    public PointF m4667d(C0136a c0136a, AbstractC0623y abstractC0623y) {
        return c0136a.m4705ap();
    }

    /* renamed from: e */
    public void m4666e(C0136a c0136a, AbstractC0623y abstractC0623y) {
        AbstractC0224s m4649a = C0161f.m4649a(c0136a, abstractC0623y, EnumC0340e.launch);
        if (m4649a != null) {
            if (m4649a.mo2985b(abstractC0623y) && m4649a.mo2987a((AbstractC0244am) abstractC0623y, false)) {
                PointF m4667d = m4667d(c0136a, abstractC0623y);
                if (m4667d != null) {
                    c0136a.m4269c("nuke: launching at:" + m4667d.f227a + ", " + m4667d.f228b);
                    c0136a.m4722a(abstractC0623y, m4649a, m4667d, (AbstractC0244am) null);
                    return;
                }
                c0136a.m4269c("nuke: no target");
                return;
            }
            c0136a.m4269c("nuke: not ready");
        }
    }

    /* renamed from: f */
    public void m4665f(C0136a c0136a, AbstractC0623y abstractC0623y) {
        AbstractC0224s m4649a;
        if ((abstractC0623y instanceof InterfaceC0501l) && ((InterfaceC0501l) abstractC0623y).mo3223dv() && (m4649a = C0161f.m4649a(c0136a, abstractC0623y, EnumC0340e.launchAmmo)) != null && c0136a.m4726a(m4649a.mo3957B(), abstractC0623y)) {
            c0136a.m4269c("ai nuke building");
            c0136a.m4723a(abstractC0623y, m4649a);
        }
    }

    /* renamed from: a */
    public boolean m4670a(AbstractC0623y abstractC0623y) {
        if (C0161f.m4647a(abstractC0623y, f642c)) {
            return true;
        }
        return false;
    }

    @Override // com.corrodinggames.rts.game.p010a.p011a.AbstractC0150a
    /* renamed from: b */
    public void mo4669b(float f, C0136a c0136a) {
        AbstractC0244am[] m498a = this.f640a.m498a();
        int size = this.f640a.size();
        for (int i = 0; i < size; i++) {
            AbstractC0623y abstractC0623y = (AbstractC0623y) m498a[i];
            m4665f(c0136a, abstractC0623y);
            m4666e(c0136a, abstractC0623y);
        }
    }
}
