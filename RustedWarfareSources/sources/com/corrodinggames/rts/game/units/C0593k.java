package com.corrodinggames.rts.game.units;

import com.corrodinggames.rts.game.AbstractC0197n;
import com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope;
import com.corrodinggames.rts.game.units.p013a.AbstractC0229x;
import com.corrodinggames.rts.game.units.p013a.EnumC0225t;
import com.corrodinggames.rts.game.units.p013a.EnumC0226u;
import com.corrodinggames.rts.gameFramework.AbstractC0916l;
import com.corrodinggames.rts.gameFramework.p037f.C0797f;
import java.util.Iterator;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.corrodinggames.rts.game.units.k */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/k.class */
public class C0593k extends AbstractC0229x {

    /* renamed from: a */
    boolean f3852a;

    /* renamed from: b */
    boolean f3853b;

    public C0593k(boolean z, boolean z2) {
        super("changeTeam" + z + "d:" + z2);
        this.f3852a = z;
        this.f3853b = z2;
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
    /* renamed from: b */
    public String mo2986b() {
        if (this.f3853b) {
            return "Selected player";
        }
        if (this.f3852a) {
            return "<- Set player";
        }
        return "Set player ->";
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
    /* renamed from: d */
    public String mo3014d() {
        if (!this.f3853b) {
            if (this.f3852a) {
                return "<-";
            }
            return "->";
        }
        AbstractC0916l m1071A = AbstractC0916l.m1071A();
        AbstractC0197n abstractC0197n = null;
        Iterator it = m1071A.f6165bS.f5258bL.iterator();
        while (it.hasNext()) {
            AbstractC0244am abstractC0244am = (AbstractC0244am) it.next();
            if (abstractC0244am instanceof AbstractC0623y) {
                AbstractC0623y abstractC0623y = (AbstractC0623y) abstractC0244am;
                if (abstractC0623y.f1644cE && m1071A.f6165bS.m1765m(abstractC0623y)) {
                    abstractC0197n = abstractC0623y.f1609bV;
                }
            }
        }
        String str = VariableScope.nullOrMissingString;
        if (abstractC0197n != null) {
            str = str + "Team - " + (abstractC0197n.f1317k + 1) + VariableScope.nullOrMissingString;
        }
        return str;
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
    /* renamed from: a */
    public String mo2989a() {
        return "Change targeted player for editor";
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
    /* renamed from: l */
    public float mo3013l() {
        if (!C0797f.f5248bB) {
            return 0.8f;
        }
        return 0.5f;
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
    /* renamed from: m */
    public int mo3012m() {
        if (this.f3853b) {
            return 2;
        }
        return 4;
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0229x, com.corrodinggames.rts.game.units.p013a.AbstractC0224s
    /* renamed from: f */
    public EnumC0225t mo2980f() {
        if (this.f3853b) {
            return EnumC0225t.infoOnly;
        }
        return super.mo2980f();
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0229x, com.corrodinggames.rts.game.units.p013a.AbstractC0224s
    /* renamed from: e */
    public EnumC0226u mo2982e() {
        if (this.f3853b) {
            return EnumC0226u.infoOnly;
        }
        return super.mo2982e();
    }
}
