package com.corrodinggames.rts.gameFramework.p044l;

import android.graphics.Paint;
import android.graphics.PorterDuff;
import com.corrodinggames.rts.gameFramework.AbstractC0916l;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* renamed from: com.corrodinggames.rts.gameFramework.l.f */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/l/f.class */
public class C0935f {

    /* renamed from: a */
    public C0934e f6412a;

    /* renamed from: b */
    public InterfaceC1027y f6413b;

    /* renamed from: c */
    public Paint f6414c;

    /* renamed from: e */
    boolean f6416e;

    /* renamed from: f */
    int f6417f;

    /* renamed from: d */
    int f6415d = 0;

    /* renamed from: g */
    boolean f6418g = false;

    /* renamed from: h */
    int f6419h = 0;

    /* renamed from: i */
    int f6420i = 0;

    /* renamed from: j */
    int f6421j = 0;

    /* renamed from: k */
    int f6422k = 1;

    /* renamed from: l */
    HashMap f6423l = new HashMap();

    /* renamed from: m */
    ArrayList f6424m = new ArrayList();

    public C0935f(int i, int i2) {
        m875a(i, i2);
    }

    /* renamed from: a */
    public void m875a(int i, int i2) {
        AbstractC0916l m1071A = AbstractC0916l.m1071A();
        AbstractC0916l.m963e("Creating BitmapOrTextureAlias: " + i + "x" + i2);
        this.f6412a = m1071A.f6161bO.mo218a(i, i2, true);
        this.f6413b = m1071A.f6161bO.mo160b(this.f6412a);
        this.f6414c = new C0930ag();
        this.f6414c.m5088a(new C1024v(EnumC1025w.copy));
    }

    /* renamed from: a */
    public void m873a(C0934e c0934e, int i, int i2) {
        this.f6413b.mo159b(c0934e, i, i2, this.f6414c);
        this.f6413b.mo130p();
    }

    /* renamed from: a */
    public void m876a() {
        this.f6413b.mo217a(0, PorterDuff.Mode.CLEAR);
    }

    /* renamed from: b */
    public void m872b() {
        this.f6415d = 0;
        this.f6416e = false;
        this.f6417f = 0;
        this.f6419h = 0;
        this.f6420i = 0;
        this.f6421j = 0;
        this.f6423l.clear();
        m876a();
    }

    /* renamed from: c */
    public void m870c() {
        this.f6417f++;
        if (this.f6416e && this.f6417f > 600) {
            this.f6418g = true;
            this.f6424m.clear();
        }
    }

    /* renamed from: d */
    public void m869d() {
        if (this.f6418g) {
            this.f6418g = false;
            m872b();
            Iterator it = this.f6424m.iterator();
            while (it.hasNext()) {
                m874a((C0934e) it.next());
            }
            this.f6424m.clear();
        }
    }

    /* renamed from: a */
    public C0936g m874a(C0934e c0934e) {
        C0936g c0936g = (C0936g) this.f6423l.get(c0934e);
        if (c0936g != null) {
            if (this.f6418g) {
                this.f6424m.add(c0934e);
            }
            if (c0936g.f6430f != c0934e.f6393e) {
                AbstractC0916l.m963e("BitmapOrTextureAlias: Image was updated: " + c0934e.mo64a());
                this.f6423l.remove(c0934e);
            } else {
                return c0936g;
            }
        }
        C0936g m871b = m871b(c0934e);
        if (m871b != null) {
            return m871b;
        }
        return null;
    }

    /* renamed from: b */
    public C0936g m871b(C0934e c0934e) {
        int mo386m = c0934e.mo386m();
        int mo387l = c0934e.mo387l();
        int mo386m2 = this.f6412a.mo386m();
        int mo387l2 = this.f6412a.mo387l();
        if (this.f6419h + mo386m > mo386m2) {
            this.f6419h = 0;
            this.f6420i += this.f6421j + this.f6422k;
            this.f6421j = 0;
        }
        if (this.f6420i + mo387l > mo387l2) {
            if (!this.f6416e) {
                this.f6416e = true;
                return null;
            }
            return null;
        }
        C0936g c0936g = new C0936g();
        c0936g.f6425a = this.f6412a;
        int i = this.f6419h;
        int i2 = this.f6420i;
        this.f6419h += mo386m + this.f6422k;
        if (this.f6421j < mo387l) {
            this.f6421j = mo387l;
        }
        m873a(c0934e, i, i2);
        c0936g.f6426b = i;
        c0936g.f6427c = i2;
        c0936g.f6428d = mo386m;
        c0936g.f6429e = mo387l;
        c0936g.f6430f = c0934e.f6393e;
        this.f6415d++;
        this.f6423l.put(c0934e, c0936g);
        return c0936g;
    }
}
