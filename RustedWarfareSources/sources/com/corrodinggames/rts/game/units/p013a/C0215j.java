package com.corrodinggames.rts.game.units.p013a;

import android.graphics.Rect;
import com.corrodinggames.rts.game.units.AbstractC0244am;
import com.corrodinggames.rts.game.units.EnumC0249ar;
import com.corrodinggames.rts.gameFramework.p035d.C0743c;
import com.corrodinggames.rts.gameFramework.p044l.C0934e;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: com.corrodinggames.rts.game.units.a.j */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/a/j.class */
public class C0215j extends AbstractC0224s {

    /* renamed from: a */
    public EnumC0216k f1443a;

    /* renamed from: b */
    static ArrayList f1444b = new ArrayList();

    /* renamed from: c */
    static Rect f1445c;

    public C0215j() {
        this(EnumC0216k.normal);
    }

    public C0215j(EnumC0216k enumC0216k) {
        super("c_6_" + enumC0216k.name());
        this.f1443a = enumC0216k;
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
    /* renamed from: b */
    public int mo2984b(AbstractC0244am abstractC0244am, boolean z) {
        return -1;
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
    /* renamed from: c */
    public int mo2983c() {
        return 0;
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
    /* renamed from: w */
    public EnumC0249ar mo2977i() {
        return null;
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
    /* renamed from: e */
    public EnumC0226u mo2982e() {
        return EnumC0226u.pingMap;
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
    /* renamed from: f */
    public EnumC0225t mo2980f() {
        return EnumC0225t.none;
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
    /* renamed from: g */
    public boolean mo2979g() {
        return false;
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
    /* renamed from: a */
    public String mo2989a() {
        return "Ping Map" + this.f1443a.m4194a();
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
    /* renamed from: b */
    public String mo2986b() {
        return this.f1443a.m4193b();
    }

    /* renamed from: K */
    public String m4197K() {
        return this.f1443a.m4192c();
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
    /* renamed from: e_ */
    public boolean mo2981e_() {
        return false;
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
    /* renamed from: s */
    public boolean mo4154s() {
        return true;
    }

    static {
        for (EnumC0216k enumC0216k : EnumC0216k.values()) {
            f1444b.add(new C0215j(enumC0216k));
        }
        f1445c = new Rect();
    }

    /* renamed from: a */
    public static C0215j m4196a(C0208c c0208c) {
        Iterator it = f1444b.iterator();
        while (it.hasNext()) {
            AbstractC0224s abstractC0224s = (AbstractC0224s) it.next();
            if (abstractC0224s.m4174d(c0208c)) {
                return (C0215j) abstractC0224s;
            }
        }
        return null;
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
    /* renamed from: q */
    public ArrayList mo4171q(AbstractC0244am abstractC0244am) {
        return f1444b;
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
    /* renamed from: j */
    public C0934e mo3041j() {
        return C0743c.f4701s[9].f4827i;
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
    /* renamed from: v */
    public Rect mo4169v() {
        int ordinal = 7 + this.f1443a.ordinal();
        f1445c.m5035a(29 * ordinal, 0, (29 * ordinal) + 28, 28);
        return f1445c;
    }
}
