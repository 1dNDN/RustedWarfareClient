package com.corrodinggames.rts.game.units.custom.p020d;

import com.corrodinggames.rts.game.units.AbstractC0244am;
import com.corrodinggames.rts.game.units.AbstractC0623y;
import com.corrodinggames.rts.game.units.custom.C0412bm;
import com.corrodinggames.rts.game.units.custom.C0453l;
import com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean;
import com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBooleanLoader;
import com.corrodinggames.rts.game.units.custom.p021e.C0428a;
import com.corrodinggames.rts.gameFramework.AbstractC0916l;
import com.corrodinggames.rts.gameFramework.C0758f;
import com.corrodinggames.rts.gameFramework.utility.C1072ab;
import com.corrodinggames.rts.gameFramework.utility.C1101m;
import java.util.Iterator;

/* renamed from: com.corrodinggames.rts.game.units.custom.d.c */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/d/c.class */
public class C0425c extends AbstractC0423a {

    /* renamed from: a */
    public final C1101m f2712a = new C1101m();

    /* renamed from: b */
    boolean f2713b;

    /* renamed from: c */
    public int f2714c;

    /* renamed from: d */
    public int f2715d;

    /* renamed from: e */
    public int f2716e;

    /* renamed from: f */
    public int f2717f;

    /* renamed from: a */
    public static C0425c m3691a(C0453l c0453l, C1072ab c1072ab, String str, String str2, C0425c c0425c) {
        String m644b = c1072ab.m644b(str, str2, (String) null);
        if (m644b == null) {
            return c0425c;
        }
        try {
            return m3690a(c0453l, m644b);
        } catch (RuntimeException e) {
            e.printStackTrace();
            throw new C0412bm("[" + str + "]" + str2 + ": " + e.getMessage());
        }
    }

    /* renamed from: a */
    public static C0425c m3690a(C0453l c0453l, String str) {
        return m3689a(c0453l, str, false);
    }

    /* renamed from: a */
    public static C0425c m3689a(C0453l c0453l, String str, boolean z) {
        String trim;
        String substring;
        C0425c c0425c = new C0425c();
        Iterator it = C0758f.m2109a(str, ",", "|", false).iterator();
        while (it.hasNext()) {
            String str2 = (String) it.next();
            int m2080b = C0758f.m2080b(str2, "=", ":");
            if (m2080b == -1) {
                if (!z) {
                    throw new C0412bm("Unknown price format:" + str);
                }
                trim = "credits";
                substring = str2;
            } else {
                trim = str2.substring(0, m2080b).trim();
                substring = str2.substring(m2080b + 1);
            }
            if (trim.equals("hasFlag")) {
                c0425c.f2716e = C0424b.m3735a(c0425c.f2716e, substring);
            } else if (trim.equals("hasMissingFlag")) {
                c0425c.f2717f = C0424b.m3735a(c0425c.f2717f, substring);
            } else if (trim.equals("setFlag")) {
                c0425c.f2714c = C0424b.m3735a(c0425c.f2714c, substring);
            } else if (trim.equals("unsetFlag")) {
                c0425c.f2715d = C0424b.m3735a(c0425c.f2715d, substring);
            } else {
                C0428a m3400j = c0453l.m3400j(trim);
                if (m3400j == null) {
                    throw new C0412bm("Could not find resource type:" + trim + " from [" + str + "]");
                }
                LogicBoolean parseNumberBlock = LogicBooleanLoader.parseNumberBlock(c0453l, substring);
                if (parseNumberBlock == null) {
                    throw new C0412bm("Value missing for:" + trim + " from [" + str + "]");
                }
                if (!(parseNumberBlock instanceof LogicBoolean.StaticValueBoolean)) {
                    c0425c.f2713b = true;
                }
                c0425c.f2712a.add(new C0426d(m3400j, parseNumberBlock));
            }
        }
        return c0425c;
    }

    @Override // com.corrodinggames.rts.game.units.custom.p020d.AbstractC0423a
    /* renamed from: b */
    public boolean mo3687b(AbstractC0244am abstractC0244am) {
        return mo3686b(abstractC0244am, 1.0d);
    }

    @Override // com.corrodinggames.rts.game.units.custom.p020d.AbstractC0423a
    /* renamed from: b */
    public boolean mo3686b(AbstractC0244am abstractC0244am, double d) {
        double d2;
        if (!(abstractC0244am instanceof AbstractC0623y)) {
            return false;
        }
        AbstractC0623y abstractC0623y = (AbstractC0623y) abstractC0244am;
        int i = this.f2712a.f6894a;
        Object[] m534a = this.f2712a.m534a();
        for (int i2 = 0; i2 < i; i2++) {
            C0426d c0426d = (C0426d) m534a[i2];
            if (c0426d.f2720c != null) {
                d2 = c0426d.f2720c.readNumber(abstractC0623y) * d;
            } else {
                d2 = c0426d.f2719b * d;
            }
            if (d2 > 0.0d && c0426d.f2718a.mo3651a(abstractC0623y) < d2) {
                return false;
            }
        }
        if (!m3682g(abstractC0623y)) {
            return false;
        }
        return true;
    }

    /* renamed from: d */
    public void m3685d(AbstractC0244am abstractC0244am) {
        double d;
        if (!(abstractC0244am instanceof AbstractC0623y)) {
            AbstractC0916l.m943n("DynamicResourcePrice doesn't work on: " + abstractC0244am.m4098cA());
            return;
        }
        AbstractC0623y abstractC0623y = (AbstractC0623y) abstractC0244am;
        int i = this.f2712a.f6894a;
        Object[] m534a = this.f2712a.m534a();
        for (int i2 = 0; i2 < i; i2++) {
            C0426d c0426d = (C0426d) m534a[i2];
            if (c0426d.f2720c != null) {
                d = c0426d.f2720c.readNumber(abstractC0623y);
            } else {
                d = c0426d.f2719b;
            }
            c0426d.f2718a.mo3650a(abstractC0623y, d);
        }
        m3683f(abstractC0623y);
        C0424b.m3702d(abstractC0623y);
    }

    @Override // com.corrodinggames.rts.game.units.custom.p020d.AbstractC0423a
    /* renamed from: a */
    public void mo3693a(AbstractC0244am abstractC0244am) {
        mo3692a(abstractC0244am, 1.0d);
    }

    @Override // com.corrodinggames.rts.game.units.custom.p020d.AbstractC0423a
    /* renamed from: a */
    public void mo3692a(AbstractC0244am abstractC0244am, double d) {
        double d2;
        if (!(abstractC0244am instanceof AbstractC0623y)) {
            AbstractC0916l.m943n("DynamicResourcePrice doesn't work on: " + abstractC0244am.m4098cA());
            return;
        }
        AbstractC0623y abstractC0623y = (AbstractC0623y) abstractC0244am;
        int i = this.f2712a.f6894a;
        Object[] m534a = this.f2712a.m534a();
        for (int i2 = 0; i2 < i; i2++) {
            C0426d c0426d = (C0426d) m534a[i2];
            if (c0426d.f2720c != null) {
                d2 = c0426d.f2720c.readNumber(abstractC0623y);
            } else {
                d2 = c0426d.f2719b;
            }
            c0426d.f2718a.mo3649b(abstractC0623y, (-d2) * d);
        }
        m3683f(abstractC0623y);
        C0424b.m3702d(abstractC0623y);
    }

    /* renamed from: e */
    public void m3684e(AbstractC0244am abstractC0244am) {
        double d;
        if (!(abstractC0244am instanceof AbstractC0623y)) {
            AbstractC0916l.m943n("DynamicResourcePrice doesn't work on: " + abstractC0244am.m4098cA());
            return;
        }
        AbstractC0916l.m963e("Refunding");
        AbstractC0623y abstractC0623y = (AbstractC0623y) abstractC0244am;
        int i = this.f2712a.f6894a;
        Object[] m534a = this.f2712a.m534a();
        for (int i2 = 0; i2 < i; i2++) {
            C0426d c0426d = (C0426d) m534a[i2];
            if (c0426d.f2720c != null) {
                d = c0426d.f2720c.readNumber(abstractC0623y);
            } else {
                d = c0426d.f2719b;
            }
            double d2 = d;
            AbstractC0916l.m963e("Refunding: " + d2 + " of " + c0426d.f2718a.m3655h());
            c0426d.f2718a.mo3649b(abstractC0623y, d2);
        }
        m3683f(abstractC0623y);
        C0424b.m3702d(abstractC0623y);
    }

    /* renamed from: f */
    public void m3683f(AbstractC0244am abstractC0244am) {
        if (this.f2715d != 0) {
            abstractC0244am.f1643cD &= this.f2715d ^ (-1);
        }
        if (this.f2714c != 0) {
            abstractC0244am.f1643cD |= this.f2714c;
        }
    }

    /* renamed from: g */
    public boolean m3682g(AbstractC0244am abstractC0244am) {
        if (this.f2716e != 0 && !m3694a(abstractC0244am.f1643cD, this.f2716e)) {
            return false;
        }
        if (this.f2717f != 0 && m3688b(abstractC0244am.f1643cD, this.f2717f)) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static boolean m3694a(int i, int i2) {
        return (i2 & i) == i2;
    }

    /* renamed from: b */
    public static boolean m3688b(int i, int i2) {
        return (i2 & i) != 0;
    }
}
