package com.corrodinggames.rts.gameFramework.p037f;

import android.graphics.Paint;
import android.graphics.Typeface;
import com.corrodinggames.rts.game.units.AbstractC0244am;
import com.corrodinggames.rts.gameFramework.LoggerMaybe;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/* renamed from: com.corrodinggames.rts.gameFramework.f.af */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/f/af.class */
public class C0787af {

    /* renamed from: a */
    private LoggerMaybe f5082a;

    /* renamed from: b */
    private Paint f5083b;

    /* renamed from: c */
    private ArrayList f5084c = new ArrayList();

    public C0787af(LoggerMaybe loggerMaybe) {
        this.f5082a = loggerMaybe;
        m1908a();
    }

    /* renamed from: a */
    public void m1908a() {
        this.f5083b = new Paint();
        this.f5083b.m5523a(255, 255, 255, 255);
        this.f5083b.mo900a(true);
        this.f5083b.m5494c(true);
        this.f5083b.mo902a(Typeface.m5433a(Typeface.f246c, 1));
        this.f5082a.m1042a(this.f5083b, 14.0f);
    }

    /* renamed from: b */
    public synchronized void m1902b() {
        this.f5084c.clear();
    }

    /* renamed from: a */
    public synchronized void m1906a(AbstractC0244am abstractC0244am) {
        C0789ah c0789ah = new C0789ah(abstractC0244am.f6957el, abstractC0244am.f6958em, abstractC0244am.mo5755r());
        c0789ah.f5088c = LoggerMaybe.m1059U();
        m1905a(c0789ah);
    }

    /* renamed from: b */
    public synchronized void m1901b(AbstractC0244am abstractC0244am) {
        C0791aj c0791aj = new C0791aj(abstractC0244am.f6957el, abstractC0244am.f6958em, abstractC0244am.mo5755r());
        c0791aj.f5088c = LoggerMaybe.m1059U();
        m1905a(c0791aj);
    }

    /* renamed from: c */
    public synchronized void m1899c(AbstractC0244am abstractC0244am) {
        C0790ai c0790ai = new C0790ai(abstractC0244am.f6957el, abstractC0244am.f6958em, abstractC0244am.m4485bI());
        c0790ai.f5088c = LoggerMaybe.m1059U();
        m1905a(c0790ai);
    }

    /* renamed from: a */
    public synchronized void m1904a(String str) {
        C0788ag c0788ag = new C0788ag(str);
        c0788ag.f5088c = LoggerMaybe.m1059U();
        m1905a(c0788ag);
    }

    /* renamed from: a */
    public synchronized void m1903a(String str, int i) {
        C0788ag c0788ag = new C0788ag(str);
        c0788ag.f5088c = LoggerMaybe.m1059U();
        c0788ag.f5089d = i;
        c0788ag.f5094i = true;
        m1905a(c0788ag);
    }

    /* renamed from: a */
    private void m1905a(AbstractC0792ak abstractC0792ak) {
        boolean z = false;
        Iterator it = this.f5084c.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            AbstractC0792ak abstractC0792ak2 = (AbstractC0792ak) it.next();
            if (abstractC0792ak2.mo1896a(abstractC0792ak)) {
                abstractC0792ak2.mo1894b(abstractC0792ak);
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
    public synchronized void m1907a(float f) {
        m1900c();
        LoggerMaybe m1079A = LoggerMaybe.m1079A();
        int i = (int) (m1079A.f6135cl - (130.0f * m1079A.f6132ci));
        int i2 = (int) (20.0f * m1079A.f6132ci);
        Iterator it = this.f5084c.iterator();
        while (it.hasNext()) {
            AbstractC0792ak abstractC0792ak = (AbstractC0792ak) it.next();
            String mo1897a = abstractC0792ak.mo1897a();
            if (m1079A.f6115bQ.showWarLogOnScreen || abstractC0792ak.f5094i) {
                if (abstractC0792ak.f5088c + abstractC0792ak.f5089d >= System.currentTimeMillis()) {
                    if (abstractC0792ak.f5093h) {
                        this.f5083b.m5523a(255, 160, 160, 160);
                    } else {
                        this.f5083b.m5523a(255, 255, 255, 255);
                    }
                    m1079A.f6113bO.mo186a(mo1897a, 20, i, this.f5083b);
                    i -= i2;
                } else {
                    return;
                }
            }
        }
    }

    /* renamed from: c */
    public synchronized void m1900c() {
        Iterator it = this.f5084c.iterator();
        while (it.hasNext()) {
            if (((AbstractC0792ak) it.next()).f5088c + 20000 < System.currentTimeMillis()) {
                it.remove();
            }
        }
    }

    /* renamed from: d */
    public synchronized void m1898d() {
        if (this.f5084c.isEmpty()) {
            return;
        }
        Iterator it = this.f5084c.iterator();
        while (it.hasNext()) {
            AbstractC0792ak abstractC0792ak = (AbstractC0792ak) it.next();
            if (!abstractC0792ak.f5093h) {
                abstractC0792ak.f5093h = true;
                this.f5082a.m995b(abstractC0792ak.f5090e, abstractC0792ak.f5091f);
                return;
            }
        }
    }
}
