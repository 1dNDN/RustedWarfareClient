package com.corrodinggames.rts.gameFramework.p031b;

import com.corrodinggames.rts.gameFramework.AbstractC0916l;
import java.util.List;

/* renamed from: com.corrodinggames.rts.gameFramework.b.i */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/b/i.class */
public class C0698i extends C0691c {

    /* renamed from: a */
    protected List f4374a;

    /* renamed from: b */
    private final List f4375b;

    /* renamed from: c */
    private AbstractC0690b f4376c;

    /* renamed from: d */
    private AbstractC0690b f4377d;

    /* renamed from: a */
    private void m2517a(AbstractC0690b abstractC0690b) {
        m2518a();
        for (int i = 0; i < this.f4374a.size(); i++) {
            this.f4375b.add(new C0713x(abstractC0690b.mo2546b(), abstractC0690b.mo2545c(), false));
        }
    }

    /* renamed from: a */
    private void m2518a() {
        for (C0713x c0713x : this.f4375b) {
            c0713x.mo2540j();
        }
        this.f4375b.clear();
    }

    /* renamed from: a */
    public AbstractC0690b m2516a(AbstractC0690b abstractC0690b, InterfaceC0700k interfaceC0700k, InterfaceC0699j interfaceC0699j) {
        if (abstractC0690b instanceof C0713x) {
            if (!((C0713x) abstractC0690b).m2426k()) {
                return this.f4376c;
            }
        } else if (this.f4377d == abstractC0690b && this.f4376c != null) {
            return this.f4376c;
        }
        if (this.f4375b.size() != this.f4374a.size() || this.f4377d != abstractC0690b) {
            m2517a(abstractC0690b);
        }
        this.f4377d = abstractC0690b;
        C0713x c0713x = abstractC0690b;
        int i = 0;
        int size = this.f4375b.size();
        while (i < size) {
            C0713x c0713x2 = (C0713x) this.f4375b.get(i);
            InterfaceC0685af interfaceC0685af = (InterfaceC0685af) this.f4374a.get(i);
            interfaceC0700k.mo2463c(c0713x2);
            interfaceC0699j.mo2515a(c0713x, interfaceC0685af, i == 0);
            interfaceC0700k.mo2461d();
            c0713x = c0713x2;
            AbstractC0916l.m963e("FilterGroup: renderTarget");
            i++;
        }
        this.f4376c = c0713x;
        return c0713x;
    }
}
