package com.corrodinggames.rts.gameFramework.p037f;

import com.corrodinggames.rts.game.units.AbstractC0244am;
import com.corrodinggames.rts.game.units.AbstractC0623y;
import com.corrodinggames.rts.gameFramework.AbstractC0726bk;
import com.corrodinggames.rts.gameFramework.AbstractC1120w;
import com.corrodinggames.rts.gameFramework.LoggerMaybe;
import com.corrodinggames.rts.gameFramework.p041i.Reader;
import com.corrodinggames.rts.gameFramework.p041i.StreamWriter;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: com.corrodinggames.rts.gameFramework.f.ac */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/f/ac.class */
public class C0784ac extends AbstractC0726bk {

    /* renamed from: i */
    private final C0760a f5066i;

    /* renamed from: a */
    public ArrayList f5067a = new ArrayList();

    /* renamed from: b */
    public float f5068b;

    /* renamed from: c */
    public long f5069c;

    /* renamed from: d */
    public float f5070d;

    /* renamed from: e */
    public float f5071e;

    /* renamed from: f */
    public float f5072f;

    /* renamed from: g */
    public boolean f5073g;

    /* renamed from: h */
    public boolean f5074h;

    public C0784ac(C0760a c0760a, boolean z) {
        this.f5066i = c0760a;
        this.f5073g = z;
    }

    /* renamed from: a */
    public void m1921a() {
        AbstractC0244am abstractC0244am = null;
        Iterator it = this.f5067a.iterator();
        while (it.hasNext()) {
            AbstractC0244am abstractC0244am2 = (AbstractC0244am) it.next();
            if (!abstractC0244am2.f1607bT && abstractC0244am2.f1651cL == null && this.f5066i.f4909a.m1778j(abstractC0244am2) && abstractC0244am2.m4354ce()) {
                abstractC0244am = abstractC0244am2;
            }
        }
        if (this.f5069c > LoggerMaybe.m1052U() - 700 && abstractC0244am != null) {
            this.f5066i.f4910b.m988b(abstractC0244am.f6957el, abstractC0244am.f6958em);
        }
        this.f5069c = LoggerMaybe.m1052U();
    }

    /* renamed from: b */
    public void m1918b() {
        this.f5067a.clear();
    }

    /* renamed from: c */
    public void m1917c() {
        Iterator it = AbstractC1120w.f6962eo.iterator();
        while (it.hasNext()) {
            AbstractC1120w abstractC1120w = (AbstractC1120w) it.next();
            if (abstractC1120w instanceof AbstractC0623y) {
                AbstractC0623y abstractC0623y = (AbstractC0623y) abstractC1120w;
                if (abstractC0623y.f1644cE && !this.f5067a.contains(abstractC0623y)) {
                    this.f5067a.add(abstractC0623y);
                }
            }
        }
    }

    /* renamed from: a */
    public void mo2292a(StreamWriter streamWriter) {
        m1916d();
        streamWriter.mo1320a(this.f5068b);
        streamWriter.mo1373a(this.f5069c);
        streamWriter.WriteInteger(this.f5067a.size());
        Iterator it = this.f5067a.iterator();
        while (it.hasNext()) {
            streamWriter.mo1318a((AbstractC0244am) it.next());
        }
        streamWriter.mo1355c(0);
    }

    /* renamed from: a */
    public void m1919a(Reader reader) {
        this.f5068b = reader.m1285g();
        this.f5069c = reader.m1283i();
        this.f5067a.clear();
        int ReadInt = reader.ReadInt();
        for (int i = 0; i < ReadInt; i++) {
            AbstractC0244am m1277o = reader.m1277o();
            if (m1277o != null) {
                this.f5067a.add(m1277o);
            }
        }
        reader.m1289d();
    }

    /* renamed from: d */
    public void m1916d() {
        if (this.f5067a.size() == 0) {
            return;
        }
        Iterator it = this.f5067a.iterator();
        while (it.hasNext()) {
            if (((AbstractC0244am) it.next()).f1607bT) {
                it.remove();
            }
        }
    }

    /* renamed from: e */
    public void m1915e() {
        if (this.f5067a.size() == 0) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = this.f5067a.iterator();
        while (it.hasNext()) {
            AbstractC0244am m442a = AbstractC1120w.m442a(((AbstractC0244am) it.next()).f6951ee, true);
            if (m442a != null && !m442a.f1607bT) {
                arrayList.add(m442a);
            }
        }
        this.f5067a = arrayList;
    }
}
