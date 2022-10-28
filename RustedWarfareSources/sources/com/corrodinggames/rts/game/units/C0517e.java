package com.corrodinggames.rts.game.units;

import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import com.corrodinggames.rts.C0067R;
import com.corrodinggames.rts.game.units.p024d.AbstractC0488d;
import com.corrodinggames.rts.gameFramework.AbstractC0916l;
import com.corrodinggames.rts.gameFramework.p044l.C0934e;

/* renamed from: com.corrodinggames.rts.game.units.e */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/e.class */
public class C0517e extends AbstractC0488d {

    /* renamed from: b */
    float f3575b;

    /* renamed from: a */
    static C0934e f3574a = null;

    /* renamed from: c */
    static PorterDuffColorFilter f3576c = new PorterDuffColorFilter(Color.m5107a(200, 200, 200), PorterDuff.Mode.MULTIPLY);

    @Override // com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: b */
    public EnumC0249ar mo1708r() {
        return EnumC0249ar.crystalResource;
    }

    /* renamed from: c */
    public static void m3177c() {
        f3574a = AbstractC0916l.m1071A().f6161bO.mo221a(C0067R.drawable.crystal);
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: d */
    public C0934e mo2771d() {
        return f3574a;
    }

    @Override // com.corrodinggames.rts.game.units.p024d.AbstractC0488d, com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: e */
    public boolean mo2961e() {
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.p024d.AbstractC0488d, com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: a */
    public void mo2912a(int i) {
    }

    public C0517e(boolean z) {
        super(z);
        this.f3886L = f3574a;
        m2615b(f3574a);
        this.f1621ch = 11.0f;
        this.f1622ci = this.f1621ch + 1.0f;
        this.f1633ct = 600.0f;
        this.f1632cs = this.f1633ct;
        m447S(1);
        this.f3426n.m5035a(0, -1, 0, 0);
        this.f3427o.m5034a(this.f3426n);
    }

    @Override // com.corrodinggames.rts.game.units.p024d.AbstractC0488d
    /* renamed from: f */
    public Paint mo3176f() {
        return super.mo3176f();
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y, com.corrodinggames.rts.game.units.AbstractC0244am, com.corrodinggames.rts.gameFramework.AbstractC1120w
    /* renamed from: a */
    public void mo445a(float f) {
        super.mo445a(f);
        this.f3575b += 0.01f * f;
        if (this.f3575b > 1.0f) {
            this.f3575b -= 1.0f;
            if (this.f3575b > 1.0f) {
                this.f3575b = 0.0f;
            }
        }
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: g */
    public float mo3175g() {
        return 0.02f;
    }

    @Override // com.corrodinggames.rts.game.units.p024d.AbstractC0488d, com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: h */
    public EnumC0246ao mo2960h() {
        return EnumC0246ao.NONE;
    }

    @Override // com.corrodinggames.rts.game.units.p024d.AbstractC0488d, com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: i */
    public boolean mo2959i() {
        return false;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y, com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: p_ */
    public boolean mo2727p_() {
        AbstractC0916l m1071A = AbstractC0916l.m1071A();
        f1684ds.m5020a(m4096cD());
        return RectF.m5019a(m1071A.f6210cL, f1684ds);
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: k */
    public C0934e mo2745k() {
        return null;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: l */
    public boolean mo2958l() {
        return false;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: m */
    public float mo2738m() {
        return 0.0f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: b */
    public float mo2821b(int i) {
        return 0.0f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: c */
    public float mo2775c(int i) {
        return 0.0f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: a */
    public void mo2899a(AbstractC0244am abstractC0244am, int i) {
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: n */
    public void mo3174n() {
        super.mo3174n();
        this.f3575b = ((this.f6959em * 5.0f) + (this.f6958el * 3.0f)) % 1.0f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: o */
    public boolean mo3173o() {
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: p */
    public boolean mo3172p() {
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: q */
    public boolean mo3171q() {
        return true;
    }
}
