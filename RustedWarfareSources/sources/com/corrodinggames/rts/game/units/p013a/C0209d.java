package com.corrodinggames.rts.game.units.p013a;

import com.corrodinggames.rts.game.units.AbstractC0244am;
import com.corrodinggames.rts.game.units.AbstractC0623y;
import com.corrodinggames.rts.game.units.EnumC0205a;
import com.corrodinggames.rts.game.units.EnumC0249ar;
import com.corrodinggames.rts.gameFramework.C0749e;
import com.corrodinggames.rts.gameFramework.Core;
import java.util.Iterator;

/* renamed from: com.corrodinggames.rts.game.units.a.d */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/a/d.class */
public class C0209d extends AbstractC0224s {

    /* renamed from: a */
    int f1430a;

    /* renamed from: b */
    EnumC0205a f1431b;

    public C0209d() {
        super("c_7");
    }

    /* renamed from: b */
    public int mo3083b(AbstractC0244am abstractC0244am, boolean z) {
        return -1;
    }

    /* renamed from: c */
    public int mo3082c() {
        return 0;
    }

    /* renamed from: n */
    public EnumC0249ar mo6163i() {
        return null;
    }

    /* renamed from: e */
    public EnumC0226u mo3081e() {
        return EnumC0226u.f1485k;
    }

    /* renamed from: f */
    public EnumC0225t mo3079f() {
        return EnumC0225t.f1465a;
    }

    /* renamed from: g */
    public boolean mo3078g() {
        return false;
    }

    /* renamed from: a */
    public String mo3088a() {
        return "Attack Mode";
    }

    /* renamed from: b */
    public String mo3085b() {
        EnumC0205a m4984q = m4984q();
        if (m4984q != null) {
            return m4984q.name();
        }
        return "NA";
    }

    /* renamed from: e_ */
    public boolean mo3080e_() {
        return false;
    }

    /* renamed from: c */
    public void m4986c(AbstractC0244am abstractC0244am) {
        Core m1087A = Core.m1087A();
        EnumC0205a m4987a = m4987a(m4983r());
        C0749e m2419b = m1087A.f6130cf.m2419b(abstractC0244am.f1609bV);
        Iterator it = AbstractC0244am.f1590bD.iterator();
        while (it.hasNext()) {
            AbstractC0244am abstractC0244am2 = (AbstractC0244am) it.next();
            if (abstractC0244am2 instanceof AbstractC0623y) {
                AbstractC0623y abstractC0623y = (AbstractC0623y) abstractC0244am2;
                if (abstractC0623y.f1644cE) {
                    m2419b.m2319a(abstractC0623y);
                }
            }
        }
        m2419b.m2322a(m4987a);
        this.f1430a = m1087A.f6117bS.f5155S;
        this.f1431b = m4987a;
    }

    /* renamed from: a */
    public EnumC0205a m4987a(EnumC0205a enumC0205a) {
        if (enumC0205a == EnumC0205a.f1419b) {
            return EnumC0205a.f1422e;
        }
        if (enumC0205a == EnumC0205a.f1419b) {
            return EnumC0205a.f1423f;
        }
        return EnumC0205a.f1419b;
    }

    /* renamed from: q */
    public EnumC0205a m4984q() {
        Core m1087A = Core.m1087A();
        EnumC0205a m4983r = m4983r();
        this.f1430a = m1087A.f6117bS.f5155S;
        this.f1431b = m4983r;
        return m4983r;
    }

    /* renamed from: r */
    public EnumC0205a m4983r() {
        if (this.f1430a == Core.m1087A().f6117bS.f5155S && this.f1431b != null) {
            return this.f1431b;
        }
        EnumC0205a enumC0205a = null;
        Iterator it = AbstractC0244am.f1590bD.iterator();
        while (it.hasNext()) {
            AbstractC0244am abstractC0244am = (AbstractC0244am) it.next();
            if (abstractC0244am instanceof AbstractC0623y) {
                AbstractC0623y abstractC0623y = (AbstractC0623y) abstractC0244am;
                if (abstractC0623y.f1644cE) {
                    if (enumC0205a == null || enumC0205a == abstractC0623y.f3894O) {
                        enumC0205a = abstractC0623y.f3894O;
                    } else {
                        enumC0205a = EnumC0205a.f1424g;
                    }
                }
            }
        }
        return enumC0205a;
    }

    /* renamed from: b */
    public boolean mo3084b(AbstractC0244am abstractC0244am) {
        return true;
    }

    /* renamed from: d */
    public String mo3129d() {
        return mo3085b();
    }

    /* renamed from: s */
    public boolean mo4924s() {
        return true;
    }
}
