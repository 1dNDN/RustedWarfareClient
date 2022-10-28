package com.corrodinggames.rts.gameFramework.p037f;

import android.graphics.Paint;
import android.graphics.Typeface;
import com.corrodinggames.rts.game.units.AbstractC0244am;
import com.corrodinggames.rts.gameFramework.Core;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/* renamed from: com.corrodinggames.rts.gameFramework.f.af */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/f/af.class */
public class C0787af {

    /* renamed from: a */
    private Core f5082a;

    /* renamed from: b */
    private Paint f5083b;

    /* renamed from: c */
    private ArrayList f5084c = new ArrayList();

    public C0787af(Core core) {
        this.f5082a = core;
        m1950a();
    }

    /* renamed from: a */
    public void m1950a() {
        this.f5083b = new Paint();
        this.f5083b.m5933a(255, 255, 255, 255);
        this.f5083b.mo5914a(true);
        this.f5083b.m5901c(true);
        this.f5083b.mo5924a(Typeface.m5840a(Typeface.f246c, 1));
        this.f5082a.m1050a(this.f5083b, 14.0f);
    }

    /* renamed from: b */
    public synchronized void m1944b() {
        this.f5084c.clear();
    }

    /* renamed from: a */
    public synchronized void m1948a(AbstractC0244am abstractC0244am) {
        C0789ah c0789ah = new C0789ah(abstractC0244am.f6958el, abstractC0244am.f6959em, abstractC0244am.mo1758r());
        c0789ah.f5088c = Core.m1067U();
        m1947a(c0789ah);
    }

    /* renamed from: b */
    public synchronized void m1943b(AbstractC0244am abstractC0244am) {
        C0791aj c0791aj = new C0791aj(abstractC0244am.f6958el, abstractC0244am.f6959em, abstractC0244am.mo1758r());
        c0791aj.f5088c = Core.m1067U();
        m1947a(c0791aj);
    }

    /* renamed from: c */
    public synchronized void m1941c(AbstractC0244am abstractC0244am) {
        C0790ai c0790ai = new C0790ai(abstractC0244am.f6958el, abstractC0244am.f6959em, abstractC0244am.m4758bI());
        c0790ai.f5088c = Core.m1067U();
        m1947a(c0790ai);
    }

    /* renamed from: a */
    public synchronized void m1946a(String str) {
        C0788ag c0788ag = new C0788ag(str);
        c0788ag.f5088c = Core.m1067U();
        m1947a(c0788ag);
    }

    /* renamed from: a */
    public synchronized void m1945a(String str, int i) {
        C0788ag c0788ag = new C0788ag(str);
        c0788ag.f5088c = Core.m1067U();
        c0788ag.f5089d = i;
        c0788ag.f5094i = true;
        m1947a(c0788ag);
    }

    /* renamed from: a */
    private void m1947a(AbstractC0792ak abstractC0792ak) {
        boolean z = false;
        Iterator it = this.f5084c.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            AbstractC0792ak abstractC0792ak2 = (AbstractC0792ak) it.next();
            if (abstractC0792ak2.mo1938a(abstractC0792ak)) {
                abstractC0792ak2.mo1936b(abstractC0792ak);
                z = true;
                break;
            }
        }
        if (z) {
            Collections.sort(this.f5084c);
        } else {
            this.f5084c.add(0, abstractC0792ak);
        }
    }

    /* renamed from: a */
    public synchronized void m1949a(float f) {
        m1942c();
        Core m1087A = Core.m1087A();
        int i = (int) (m1087A.f6135cl - (130.0f * m1087A.f6132ci));
        int i2 = (int) (20.0f * m1087A.f6132ci);
        Iterator it = this.f5084c.iterator();
        while (it.hasNext()) {
            AbstractC0792ak abstractC0792ak = (AbstractC0792ak) it.next();
            String mo1939a = abstractC0792ak.mo1939a();
            if (m1087A.settingEngine.showWarLogOnScreen || abstractC0792ak.f5094i) {
                if (abstractC0792ak.f5088c + abstractC0792ak.f5089d >= System.currentTimeMillis()) {
                    if (abstractC0792ak.f5093h) {
                        this.f5083b.m5933a(255, 160, 160, 160);
                    } else {
                        this.f5083b.m5933a(255, 255, 255, 255);
                    }
                    m1087A.f6113bO.mo181a(mo1939a, 20, i, this.f5083b);
                    i -= i2;
                } else {
                    return;
                }
            }
        }
    }

    /* renamed from: c */
    public synchronized void m1942c() {
        Iterator it = this.f5084c.iterator();
        while (it.hasNext()) {
            if (((AbstractC0792ak) it.next()).f5088c + 20000 < System.currentTimeMillis()) {
                it.remove();
            }
        }
    }

    /* renamed from: d */
    public synchronized void m1940d() {
        if (this.f5084c.isEmpty()) {
            return;
        }
        Iterator it = this.f5084c.iterator();
        while (it.hasNext()) {
            AbstractC0792ak abstractC0792ak = (AbstractC0792ak) it.next();
            if (!abstractC0792ak.f5093h) {
                abstractC0792ak.f5093h = true;
                this.f5082a.m1003b(abstractC0792ak.f5090e, abstractC0792ak.f5091f);
                return;
            }
        }
    }
}
