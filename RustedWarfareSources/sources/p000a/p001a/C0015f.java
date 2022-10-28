package p000a.p001a;

import java.util.ArrayList;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: a.a.f */
/* loaded from: game-lib.jar:a/a/f.class */
public class C0015f implements InterfaceC0029s {

    /* renamed from: a */
    final /* synthetic */ C0010b f44a;

    private C0015f(C0010b c0010b) {
        this.f44a = c0010b;
    }

    @Override // p000a.p001a.InterfaceC0029s
    /* renamed from: a */
    public void mo5192a(C0017h c0017h) {
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        ArrayList arrayList4;
        ArrayList arrayList5;
        if (c0017h instanceof C0014e) {
            arrayList = this.f44a.f33h;
            synchronized (arrayList) {
                while (true) {
                    arrayList2 = this.f44a.f33h;
                    if (arrayList2.size() > 50) {
                        try {
                            arrayList5 = this.f44a.f33h;
                            arrayList5.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    } else {
                        arrayList3 = this.f44a.f33h;
                        arrayList3.add((C0014e) c0017h);
                        arrayList4 = this.f44a.f33h;
                        arrayList4.notify();
                    }
                }
            }
        }
    }

    @Override // p000a.p001a.InterfaceC0029s
    /* renamed from: b */
    public void mo5191b(C0017h c0017h) {
    }

    @Override // p000a.p001a.InterfaceC0029s
    /* renamed from: c */
    public void mo5190c(C0017h c0017h) {
        if (c0017h instanceof C0014e) {
            this.f44a.m5280a(((C0014e) c0017h).m5253c());
        }
    }

    @Override // p000a.p001a.InterfaceC0029s
    /* renamed from: d */
    public void mo5189d(C0017h c0017h) {
        if (c0017h instanceof C0014e) {
            this.f44a.m5280a(((C0014e) c0017h).m5253c());
        }
    }

    @Override // p000a.p001a.InterfaceC0029s
    /* renamed from: e */
    public void mo5188e(C0017h c0017h) {
    }
}
