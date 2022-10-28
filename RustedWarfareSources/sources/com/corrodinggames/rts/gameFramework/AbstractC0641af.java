package com.corrodinggames.rts.gameFramework;

/* renamed from: com.corrodinggames.rts.gameFramework.af */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/af.class */
public abstract class AbstractC0641af {

    /* renamed from: a */
    public int f4153a = -1;

    /* renamed from: b */
    public int f4154b = 0;

    /* renamed from: c */
    protected boolean f4155c;

    /* renamed from: d */
    public boolean f4156d;

    /* renamed from: a */
    public abstract boolean mo2650a();

    /* renamed from: b */
    public abstract boolean mo2648b();

    /* renamed from: c */
    public abstract String mo2647c();

    /* renamed from: d */
    public abstract boolean mo2646d();

    /* renamed from: a */
    public boolean mo2649a(AbstractC0641af abstractC0641af) {
        if (this.f4154b != abstractC0641af.f4154b || this.f4153a != abstractC0641af.f4153a) {
            return false;
        }
        return true;
    }
}
