package com.corrodinggames.rts.gameFramework;

/* renamed from: com.corrodinggames.rts.gameFramework.ah */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/ah.class */
public class C0643ah extends AbstractC0641af {

    /* renamed from: g */
    boolean f4160g;

    /* renamed from: i */
    float f4162i;

    /* renamed from: e */
    int f4158e = -1;

    /* renamed from: f */
    int f4159f = -1;

    /* renamed from: h */
    int f4161h = -1;

    /* renamed from: j */
    boolean f4163j = false;

    @Override // com.corrodinggames.rts.gameFramework.AbstractC0641af
    /* renamed from: a */
    public boolean mo2650a() {
        if (mo2648b()) {
            if (!this.f4155c) {
                this.f4155c = true;
                return true;
            }
            return false;
        } else if (this.f4155c) {
            this.f4155c = false;
            return false;
        } else {
            return false;
        }
    }

    @Override // com.corrodinggames.rts.gameFramework.AbstractC0641af
    /* renamed from: b */
    public boolean mo2648b() {
        return m2651e() > 0.5f;
    }

    /* renamed from: e */
    public float m2651e() {
        return m2652a(false);
    }

    /* renamed from: a */
    public float m2652a(boolean z) {
        float f;
        if (this.f4161h != -1) {
            f = C0638ac.f4083b.mo18a(this.f4161h, this.f4158e) ? 0.0f : 1.0f;
        } else {
            float mo16b = C0638ac.f4083b.mo16b(this.f4158e, this.f4159f);
            f = this.f4160g ? -mo16b : mo16b;
        }
        if (z) {
            return f;
        }
        if (!this.f4163j && Math.abs(f - this.f4162i) > 0.001f) {
            this.f4163j = true;
        }
        if (!this.f4163j) {
            return 0.0f;
        }
        return f;
    }

    @Override // com.corrodinggames.rts.gameFramework.AbstractC0641af
    /* renamed from: c */
    public String mo2647c() {
        return "controller";
    }

    @Override // com.corrodinggames.rts.gameFramework.AbstractC0641af
    /* renamed from: d */
    public boolean mo2646d() {
        return false;
    }
}
