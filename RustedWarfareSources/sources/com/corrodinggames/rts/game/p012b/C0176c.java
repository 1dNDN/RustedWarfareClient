package com.corrodinggames.rts.game.p012b;

import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import com.corrodinggames.rts.game.C0195l;
import com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope;
import com.corrodinggames.rts.gameFramework.AbstractC0916l;
import com.corrodinggames.rts.gameFramework.AbstractC1120w;
import com.corrodinggames.rts.gameFramework.C0727bl;
import com.corrodinggames.rts.gameFramework.C0758f;
import com.corrodinggames.rts.gameFramework.EnumC1065u;
import com.corrodinggames.rts.gameFramework.p037f.C0797f;
import com.corrodinggames.rts.gameFramework.p044l.C0930ag;
import com.corrodinggames.rts.gameFramework.p044l.C0934e;
import com.corrodinggames.rts.gameFramework.p044l.C1028z;
import com.corrodinggames.rts.gameFramework.p044l.InterfaceC1027y;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: com.corrodinggames.rts.game.b.c */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/b/c.class */
public class C0176c {

    /* renamed from: f */
    int f860f;

    /* renamed from: g */
    int f861g;

    /* renamed from: h */
    int f862h;

    /* renamed from: i */
    int f863i;

    /* renamed from: j */
    int f864j;

    /* renamed from: k */
    int f865k;

    /* renamed from: l */
    float f866l;

    /* renamed from: n */
    boolean f868n;

    /* renamed from: a */
    int f855a = 7;

    /* renamed from: b */
    public C0934e f856b = null;

    /* renamed from: c */
    public InterfaceC1027y f857c = null;

    /* renamed from: d */
    C0177d[][] f858d = null;

    /* renamed from: e */
    public C0930ag f859e = new C0930ag();

    /* renamed from: m */
    float f867m = 1.0f;

    /* renamed from: o */
    Rect f869o = new Rect();

    /* renamed from: p */
    int f870p = 0;

    /* renamed from: a */
    public void m4467a() {
        AbstractC0916l m1071A = AbstractC0916l.m1071A();
        this.f867m = m4448g();
        if (this.f867m > 1.0f) {
        }
        this.f863i = (int) (this.f862h / this.f867m);
        this.f865k = (int) (this.f864j / this.f867m);
        this.f866l = 1.0f / this.f865k;
        this.f860f = m1071A.f6192ct - (this.f863i / 2);
        this.f861g = m1071A.f6193cu - (this.f863i / 2);
        float f = 1.0f / 20;
        this.f860f = ((int) (this.f860f * f)) * 20;
        this.f861g = ((int) (this.f861g * f)) * 20;
        for (int i = 0; i < this.f855a; i++) {
            for (int i2 = 0; i2 < this.f855a; i2++) {
                C0177d c0177d = this.f858d[i][i2];
                c0177d.f881k = true;
                c0177d.f884n = false;
            }
        }
    }

    /* renamed from: b */
    public void m4459b() {
        for (int i = 0; i < this.f855a; i++) {
            for (int i2 = 0; i2 < this.f855a; i2++) {
                C0177d c0177d = this.f858d[i][i2];
                c0177d.f879i = i;
                c0177d.f880j = i2;
            }
        }
    }

    /* renamed from: a */
    public void m4465a(int i) {
        C0177d[] c0177dArr = new C0177d[this.f855a];
        if (i > 0) {
            for (int i2 = 0; i2 < this.f855a; i2++) {
                c0177dArr[i2] = this.f858d[i2][0];
            }
            for (int i3 = 1; i3 < this.f855a; i3++) {
                for (int i4 = 0; i4 < this.f855a; i4++) {
                    this.f858d[i4][i3 - 1] = this.f858d[i4][i3];
                }
            }
            for (int i5 = 0; i5 < this.f855a; i5++) {
                this.f858d[i5][this.f855a - 1] = c0177dArr[i5];
            }
            for (int i6 = 0; i6 < this.f855a; i6++) {
                this.f858d[i6][this.f855a - 1].f881k = true;
            }
        } else {
            for (int i7 = 0; i7 < this.f855a; i7++) {
                c0177dArr[i7] = this.f858d[i7][this.f855a - 1];
            }
            for (int i8 = this.f855a - 2; i8 >= 0; i8--) {
                for (int i9 = 0; i9 < this.f855a; i9++) {
                    this.f858d[i9][i8 + 1] = this.f858d[i9][i8];
                }
            }
            for (int i10 = 0; i10 < this.f855a; i10++) {
                this.f858d[i10][0] = c0177dArr[i10];
            }
            for (int i11 = 0; i11 < this.f855a; i11++) {
                this.f858d[i11][0].f881k = true;
            }
        }
        m4459b();
    }

    /* renamed from: b */
    public void m4458b(int i) {
        C0177d[] c0177dArr = new C0177d[this.f855a];
        if (i > 0) {
            for (int i2 = 0; i2 < this.f855a; i2++) {
                c0177dArr[i2] = this.f858d[0][i2];
            }
            for (int i3 = 1; i3 < this.f855a; i3++) {
                for (int i4 = 0; i4 < this.f855a; i4++) {
                    this.f858d[i3 - 1][i4] = this.f858d[i3][i4];
                }
            }
            for (int i5 = 0; i5 < this.f855a; i5++) {
                this.f858d[this.f855a - 1][i5] = c0177dArr[i5];
            }
            for (int i6 = 0; i6 < this.f855a; i6++) {
                this.f858d[this.f855a - 1][i6].f881k = true;
            }
        } else {
            for (int i7 = 0; i7 < this.f855a; i7++) {
                c0177dArr[i7] = this.f858d[this.f855a - 1][i7];
            }
            for (int i8 = this.f855a - 2; i8 >= 0; i8--) {
                for (int i9 = 0; i9 < this.f855a; i9++) {
                    this.f858d[i8 + 1][i9] = this.f858d[i8][i9];
                }
            }
            for (int i10 = 0; i10 < this.f855a; i10++) {
                this.f858d[0][i10] = c0177dArr[i10];
            }
            for (int i11 = 0; i11 < this.f855a; i11++) {
                this.f858d[0][i11].f881k = true;
            }
        }
        m4459b();
    }

    /* renamed from: a */
    public C0177d m4464a(int i, int i2) {
        if (i < 0 || i >= this.f855a || i2 < 0 || i2 >= this.f855a || this.f858d == null) {
            return null;
        }
        return this.f858d[i][i2];
    }

    /* renamed from: a */
    public void m4461a(int i, int i2, boolean z) {
        C0173b c0173b = AbstractC0916l.m1071A().f6158bL;
        int i3 = c0173b.f795n;
        int i4 = c0173b.f796o;
        int i5 = i * i3;
        int i6 = i2 * i4;
        m4463a((i5 - this.f860f) - i3, (i6 - this.f861g) - i4, 3 * i3, 3 * i4, z);
    }

    /* renamed from: c */
    public void m4455c() {
        if (this.f858d != null) {
            for (int i = 0; i < this.f855a; i++) {
                for (int i2 = 0; i2 < this.f855a; i2++) {
                    this.f858d[i][i2].f881k = true;
                }
            }
        }
    }

    /* renamed from: a */
    public void m4463a(int i, int i2, int i3, int i4, boolean z) {
        C0177d m4464a;
        C0177d m4464a2;
        C0177d m4464a3;
        int i5 = (int) (i * this.f866l);
        int i6 = (int) (i2 * this.f866l);
        C0177d m4464a4 = m4464a(i5, i6);
        if (m4464a4 != null) {
            if (z) {
                m4464a4.f882l = true;
            } else {
                m4464a4.f881k = true;
            }
            boolean z2 = false;
            boolean z3 = false;
            if (i + i3 >= (m4464a4.f879i * this.f865k) + this.f863i) {
                z2 = true;
            }
            if (i2 + i4 >= (m4464a4.f880j * this.f865k) + this.f863i) {
                z3 = true;
            }
            if (z2 && (m4464a3 = m4464a(i5 + 1, i6)) != null) {
                if (z) {
                    m4464a3.f882l = true;
                } else {
                    m4464a3.f881k = true;
                }
            }
            if (z3 && (m4464a2 = m4464a(i5, i6 + 1)) != null) {
                if (z) {
                    m4464a2.f882l = true;
                } else {
                    m4464a2.f881k = true;
                }
            }
            if (z2 && z3 && (m4464a = m4464a(i5 + 1, i6 + 1)) != null) {
                if (z) {
                    m4464a.f882l = true;
                } else {
                    m4464a.f881k = true;
                }
            }
        }
    }

    /* renamed from: a */
    public void m4460a(C0195l c0195l) {
        RectF m4343c = c0195l.m4343c();
        for (int i = 0; i < this.f855a; i++) {
            for (int i2 = 0; i2 < this.f855a; i2++) {
                if (this.f858d != null) {
                    C0177d c0177d = this.f858d[i][i2];
                    if (C0758f.m2132a(c0177d.m4446b(), m4343c)) {
                        boolean z = this.f867m != 1.0f;
                        if (z) {
                        }
                        c0195l.m4346a(c0177d.f871a, c0177d.m4445c(), c0177d.m4444d(), this.f867m);
                        c0177d.f874d.mo48p();
                        if (z) {
                        }
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public void m4462a(int i, int i2, InterfaceC1027y interfaceC1027y) {
        C0177d c0177d = this.f858d[i][i2];
        boolean z = this.f867m != 1.0f;
        if (z) {
        }
        Rect m4446b = c0177d.m4446b();
        C0758f.m2133a(m4446b, 95.0f);
        AbstractC1120w[] m514a = AbstractC1120w.f6962eo.m514a();
        int size = AbstractC1120w.f6962eo.size();
        for (int i3 = 0; i3 < size; i3++) {
            AbstractC1120w abstractC1120w = m514a[i3];
            if (abstractC1120w instanceof C0195l) {
                C0195l c0195l = (C0195l) abstractC1120w;
                if (m4446b.m5032b((int) c0195l.f6958el, (int) c0195l.f6959em)) {
                    c0195l.m4346a(interfaceC1027y, c0177d.m4445c(), c0177d.m4444d(), this.f867m);
                }
            }
        }
        if (z) {
        }
    }

    /* renamed from: b */
    public void m4456b(int i, int i2, InterfaceC1027y interfaceC1027y) {
        AbstractC0916l m1071A = AbstractC0916l.m1071A();
        C0173b c0173b = m1071A.f6158bL;
        if (m1071A.f6165bS.m1865E()) {
            int i3 = this.f860f + (i * this.f865k);
            int i4 = this.f861g + (i2 * this.f865k);
            int i5 = this.f863i;
            int i6 = this.f863i;
            int i7 = c0173b.f802u.f904n;
            int i8 = c0173b.f802u.f905o;
            if (((int) (i3 * c0173b.f799r)) < 0) {
            }
            if (((int) (i4 * c0173b.f800s)) < 0) {
            }
            if (((int) ((i3 + i5) * c0173b.f799r)) > i7 - 1) {
                int i9 = i7 - 1;
            }
            if (((int) ((i4 + i6) * c0173b.f800s)) > i8 - 1) {
                int i10 = i8 - 1;
            }
            if (this.f867m < 0.4d) {
                return;
            }
            boolean z = this.f867m != 1.0f;
            if (z) {
                interfaceC1027y.mo137i();
                interfaceC1027y.mo228a(this.f867m, this.f867m);
            }
            if (z) {
                interfaceC1027y.mo136j();
            }
        }
    }

    /* renamed from: b */
    public void m4457b(int i, int i2) {
        C0177d c0177d = C0173b.f846al.f858d[i][i2];
        AbstractC0916l m1071A = AbstractC0916l.m1071A();
        C0173b c0173b = m1071A.f6158bL;
        c0177d.f884n = true;
        this.f857c.mo166b(-16777216);
        C0934e c0934e = m1071A.f6169bW.f5315J;
        if (c0934e != null) {
            Rect rect = new Rect();
            RectF rectF = new RectF();
            rect.m5035a((int) (((this.f860f + (i * this.f865k)) / (c0173b.f795n * c0173b.f811C)) * c0934e.f6404p), (int) (((this.f861g + (i2 * this.f865k)) / (c0173b.f796o * c0173b.f812D)) * c0934e.f6405q), (int) (((this.f860f + ((i + 1) * this.f865k)) / (c0173b.f795n * c0173b.f811C)) * c0934e.f6404p), (int) (((this.f861g + ((i2 + 1) * this.f865k)) / (c0173b.f796o * c0173b.f812D)) * c0934e.f6405q));
            rectF.m5022a(0.0f, 0.0f, this.f862h, this.f862h);
            this.f857c.mo192a(c0934e, rect, rectF, this.f859e);
        }
        this.f857c.mo130p();
        if (AbstractC0916l.f6117aW) {
            c0177d.f871a.mo217a(0, PorterDuff.Mode.CLEAR);
        }
        c0177d.f871a.mo159b(this.f856b, 0.0f, 0.0f, (Paint) null);
        c0177d.f874d.mo48p();
    }

    /* renamed from: c */
    public void m4453c(int i, int i2) {
        m4452c(i, i2, this.f857c);
    }

    /* renamed from: c */
    public void m4452c(int i, int i2, InterfaceC1027y interfaceC1027y) {
        C0177d c0177d = C0173b.f846al.f858d[i][i2];
        AbstractC0916l m1071A = AbstractC0916l.m1071A();
        C0173b c0173b = m1071A.f6158bL;
        boolean z = false;
        if (m1071A.f6163bQ.renderFancyWater) {
            z = true;
        }
        if (AbstractC0916l.m1070B() || AbstractC0916l.m1069C()) {
            z = true;
        }
        if (z) {
            interfaceC1027y.mo217a(0, PorterDuff.Mode.CLEAR);
        } else {
            boolean z2 = false;
            if (AbstractC0916l.m1070B()) {
                z2 = true;
            }
            if (AbstractC0916l.f6118aX) {
                z2 = true;
            }
            if (C0797f.f5247bA) {
            }
            if (c0173b.f813E) {
            }
            if (z2) {
                interfaceC1027y.mo166b(-16777216);
            }
        }
        if (AbstractC0916l.f6118aX) {
            interfaceC1027y.mo217a(0, PorterDuff.Mode.CLEAR);
        }
        int i3 = this.f860f + (i * this.f865k);
        int i4 = this.f861g + (i2 * this.f865k);
        boolean z3 = false;
        boolean z4 = false;
        if (!c0173b.f802u.f913w) {
            z3 = true;
        }
        if (c0173b.f813E) {
            z4 = true;
        }
        if (C0173b.f785d) {
            z3 = false;
            z4 = false;
        }
        if (z3) {
            interfaceC1027y.mo172a(true);
        }
        c0173b.f802u.m4440a(interfaceC1027y, i3, i4, i3, i4, this.f863i, this.f863i, this.f867m, this.f867m, c0173b.f813E, false, false);
        if (c0173b.f803v != null) {
            if (z3 && c0173b.f803v.f913w) {
                interfaceC1027y.mo141f();
                AbstractC0916l.m963e("Ending blit early");
            }
            c0173b.f803v.m4440a(interfaceC1027y, i3, i4, i3, i4, this.f863i, this.f863i, this.f867m, this.f867m, c0173b.f813E, false, false);
        }
        if (c0173b.f804w != null) {
            if (z3 && c0173b.f804w.f913w) {
                interfaceC1027y.mo141f();
                AbstractC0916l.m963e("Ending blit early");
            }
            c0173b.f804w.m4440a(interfaceC1027y, i3, i4, i3, i4, this.f863i, this.f863i, this.f867m, this.f867m, c0173b.f813E, false, false);
        }
        Iterator it = c0173b.f807z.iterator();
        while (it.hasNext()) {
            C0178e c0178e = (C0178e) it.next();
            if (c0178e.f903m) {
                if (z3 && c0178e.f913w) {
                    interfaceC1027y.mo141f();
                    AbstractC0916l.m963e("Ending blit early");
                }
                c0178e.m4440a(interfaceC1027y, i3, i4, i3, i4, this.f863i, this.f863i, this.f867m, this.f867m, c0173b.f813E, false, false);
            }
        }
        m4462a(i, i2, interfaceC1027y);
        if (c0173b.f813E) {
            if (z4) {
                interfaceC1027y.mo172a(false);
            }
            c0173b.f802u.m4440a(interfaceC1027y, i3, i4, i3, i4, this.f863i, this.f863i, this.f867m, this.f867m, c0173b.f813E, true, true);
        }
        if (z3 || z4) {
            interfaceC1027y.mo141f();
        }
        if (m1071A.f6165bS.m1865E()) {
            m4456b(i, i2, interfaceC1027y);
        }
        c0177d.f881k = false;
        c0177d.f882l = false;
        c0177d.f883m = 0;
        c0177d.f884n = false;
        interfaceC1027y.mo130p();
        if (z || AbstractC0916l.f6117aW) {
            c0177d.f871a.mo217a(0, PorterDuff.Mode.CLEAR);
        }
        c0177d.f871a.mo159b(this.f856b, 0.0f, 0.0f, (Paint) null);
        c0177d.f874d.mo48p();
        if (C0173b.f784c) {
            c0177d.f871a.mo181a(VariableScope.nullOrMissingString + c0177d.f873c, 40.0f, 40.0f, C0173b.f789h);
        }
        c0177d.f873c++;
    }

    /* renamed from: d */
    public void m4451d() {
        if (AbstractC0916l.f6115aU && !AbstractC0916l.f6118aX && !AbstractC0916l.f6119aY) {
            return;
        }
        AbstractC0916l m1071A = AbstractC0916l.m1071A();
        int max = Math.max((int) m1071A.f6203cE, (int) m1071A.f6205cG) + 3;
        if (this.f858d != null && this.f862h * this.f855a < max + this.f862h + 1) {
            AbstractC0916l.m981b("map", "screen must have changed size, layerBufferSize too small at " + this.f855a + ", adding to LayerBitmapBuffer");
            AbstractC0916l.m981b("map", "new viewpoint:" + m1071A.f6203cE + ", " + m1071A.f6205cG);
            m4454c(this.f855a + 1);
        }
        if (this.f858d == null) {
            AbstractC0916l.m981b("map", "setupLayerBuffers for size:" + max);
            long nanoTime = System.nanoTime();
            if (AbstractC0916l.f6118aX || AbstractC0916l.f6119aY) {
                this.f862h = 1024;
                this.f855a = (int) ((max / this.f862h) + 1.5f);
            } else {
                max = Math.max(600, max);
                this.f862h = (max / (this.f855a - 2)) + 7 + 4;
                this.f862h = ((int) ((this.f862h * (1.0f / 20)) + 0.5f)) * 20;
            }
            if (this.f862h * this.f855a < max + this.f862h + 1) {
                AbstractC0916l.m982b("layerBufferSize is too small");
                AbstractC0916l.m982b("layerBufferCount:" + this.f855a);
                AbstractC0916l.m982b("(layerBufferSize*(layerBufferCount):" + (this.f862h * this.f855a));
                AbstractC0916l.m982b("longest+layerBufferSize+1:" + (max + this.f862h + 1));
                AbstractC0916l.m982b("longest:" + max);
                if (AbstractC0916l.f6118aX || AbstractC0916l.f6119aY) {
                    this.f855a++;
                } else {
                    this.f862h += 100;
                }
            }
            AbstractC0916l.m963e("layerBufferSize:" + this.f862h);
            this.f864j = this.f862h - 4;
            AbstractC0916l.m982b("layerBuffer:" + this.f855a + "x" + this.f855a + " = " + (this.f855a * this.f855a) + (C0173b.f817I ? " x2 for soft fade " : VariableScope.nullOrMissingString));
            this.f858d = new C0177d[this.f855a][this.f855a];
            boolean z = false;
            if (m1071A.f6163bQ.renderFancyWater) {
                z = true;
            }
            if (AbstractC0916l.m1070B() || AbstractC0916l.m1069C()) {
                z = true;
            }
            if (this.f862h <= 0) {
                AbstractC0916l.m982b("layerBuffer buffer size was too small at: " + this.f862h);
                this.f862h = 512;
            }
            if (z) {
                this.f856b = m1071A.f6161bO.mo218a(this.f862h, this.f862h, true);
            } else {
                this.f856b = m1071A.f6161bO.mo218a(this.f862h, this.f862h, false);
            }
            this.f856b.m880b(true);
            this.f857c = m1071A.f6161bO.mo160b(this.f856b);
            m4449f();
            AbstractC0916l.m963e("----- layerBuffers create in:" + ((System.nanoTime() - nanoTime) / 1000000.0d) + " ms");
        }
    }

    /* renamed from: c */
    public void m4454c(int i) {
        if (i < this.f855a) {
            AbstractC0916l.m957g("newLayerBufferCount:" + i);
            return;
        }
        C0177d[][] c0177dArr = new C0177d[i][i];
        for (int i2 = 0; i2 < this.f855a; i2++) {
            for (int i3 = 0; i3 < this.f855a; i3++) {
                c0177dArr[i2][i3] = this.f858d[i2][i3];
            }
        }
        this.f858d = c0177dArr;
        this.f855a = i;
        m4449f();
    }

    /* renamed from: e */
    public void m4450e() {
        C0173b.f817I = false;
        C0173b.f818J = true;
        for (int i = 0; i < this.f855a; i++) {
            for (int i2 = 0; i2 < this.f855a; i2++) {
                C0177d c0177d = this.f858d[i][i2];
                if (c0177d != null) {
                    if (c0177d.f876f != null) {
                        c0177d.f876f.mo129q();
                        c0177d.f876f = null;
                    }
                    if (c0177d.f875e != null) {
                        c0177d.f875e.mo49o();
                        c0177d.f875e = null;
                    }
                }
            }
        }
    }

    /* renamed from: f */
    public void m4449f() {
        AbstractC0916l m1071A = AbstractC0916l.m1071A();
        ArrayList arrayList = null;
        boolean z = false;
        for (int i = 0; i < this.f855a; i++) {
            for (int i2 = 0; i2 < this.f855a; i2++) {
                if (this.f858d[i][i2] == null) {
                    C0177d c0177d = new C0177d(this, i, i2);
                    c0177d.f872b = this.f870p;
                    this.f870p++;
                    this.f858d[i][i2] = c0177d;
                    if (this.f862h <= 0) {
                        AbstractC0916l.m982b("initMissingLayerBufferImages: layerBuffer buffer size was too small at: " + this.f862h);
                        this.f862h = 512;
                    }
                    if (z) {
                        c0177d.f874d = m1071A.f6161bO.mo128r();
                    } else if (m1071A.f6163bQ.renderFancyWater) {
                        c0177d.f874d = m1071A.f6161bO.mo218a(this.f862h, this.f862h, true);
                    } else {
                        c0177d.f874d = m1071A.f6161bO.mo218a(this.f862h, this.f862h, false);
                    }
                    c0177d.f874d.m880b(true);
                    if (c0177d.f874d.mo394A()) {
                        if (!z) {
                            AbstractC0916l.m982b("initMissingLayerBufferImages: Failed to create map buffer at :" + this.f862h + "px");
                        }
                        c0177d.f871a = new C1028z();
                    } else {
                        try {
                            c0177d.f871a = m1071A.f6161bO.mo160b(c0177d.f874d);
                        } catch (OutOfMemoryError e) {
                            if (!z) {
                                AbstractC0916l.m1032a(EnumC1065u.gameImageCreate, e);
                            }
                            z = true;
                            c0177d.f871a = new C1028z();
                        }
                    }
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(c0177d);
                }
            }
        }
        if (z && C0173b.f817I) {
            m4450e();
        }
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                C0177d c0177d2 = (C0177d) it.next();
                if (C0173b.f817I) {
                    try {
                        c0177d2.m4447a();
                    } catch (OutOfMemoryError e2) {
                        m4450e();
                        AbstractC0916l.m982b("Not enough free memory to enable smooth fog fading");
                        System.gc();
                    }
                }
            }
        }
        m4467a();
    }

    /* renamed from: g */
    public float m4448g() {
        AbstractC0916l m1071A = AbstractC0916l.m1071A();
        if (m1071A.f6221cW > 1.0f) {
            return 1.0f;
        }
        return m1071A.f6221cW;
    }

    /* renamed from: a */
    public void m4466a(float f) {
        AbstractC0916l m1071A = AbstractC0916l.m1071A();
        C0173b c0173b = m1071A.f6158bL;
        Long l = null;
        boolean z = false;
        float m4448g = m4448g();
        boolean z2 = false;
        float f2 = m4448g / this.f867m;
        if (C0758f.m2075c(f2 - 1.0f) < 0.01f) {
            f2 = 1.0f;
        }
        if (m4448g > 0.6d) {
            float f3 = 0.3f;
            if (AbstractC0916l.m994au()) {
                f3 = 0.1f;
            }
            if (m4448g - this.f867m > f3) {
                z2 = true;
            }
            if (m4448g == 1.0f && this.f867m != 1.0f) {
                z2 = true;
            }
        }
        if (f2 != 1.0f) {
            int i = 10;
            float f4 = 0.03f;
            if (m4448g < 0.3f) {
                i = 20;
                f4 = 0.09f;
            } else if (m4448g < 0.5f) {
                i = 20;
                f4 = 0.07f;
            }
            if (m4448g > 1.3f) {
                i = 7;
            }
            if (!AbstractC0916l.m994au()) {
                i += 10;
            }
            if (C0758f.m2075c(c0173b.f844aj - m4448g) > 0.03f) {
                c0173b.f844aj = m1071A.f6221cW;
                c0173b.f845ak = 0;
            } else {
                c0173b.f845ak++;
            }
            if (c0173b.f845ak < 3) {
                c0173b.f843ai = 0.0f;
            } else if (C0758f.m2075c(m4448g - this.f867m) > f4) {
                c0173b.f843ai += 1.0f;
            }
            if (c0173b.f843ai > i) {
                c0173b.f843ai = 0.0f;
                z2 = true;
            }
        }
        if (m1071A.f6192ct + m1071A.f6198cz + 4.0f > this.f860f + (this.f855a * this.f865k)) {
            this.f860f += this.f865k;
            m4458b(1);
        }
        if (m1071A.f6192ct - 1 < this.f860f) {
            this.f860f -= this.f865k;
            m4458b(-1);
        }
        if (m1071A.f6193cu + m1071A.f6199cA + 4.0f > this.f861g + (this.f855a * this.f865k)) {
            this.f861g += this.f865k;
            m4465a(1);
        }
        if (m1071A.f6193cu - 1 < this.f861g) {
            this.f861g -= this.f865k;
            m4465a(-1);
        }
        if (m1071A.f6192ct + m1071A.f6198cz + 4.0f > this.f860f + (this.f855a * this.f865k)) {
            z2 = true;
        }
        if (m1071A.f6192ct - 1 < this.f860f) {
            z2 = true;
        }
        if (m1071A.f6193cu + m1071A.f6199cA + 4.0f > this.f861g + (this.f855a * this.f865k)) {
            z2 = true;
        }
        if (m1071A.f6193cu - 1 < this.f861g) {
            z2 = true;
        }
        if (z2) {
            m4467a();
        }
        float f5 = m1071A.f6221cW / this.f867m;
        if (C0758f.m2075c(f5 - 1.0f) < 1.0E-4f) {
            f5 = 1.0f;
        }
        float f6 = (m1071A.f6203cE / f5) + 2.0f;
        float f7 = (m1071A.f6205cG / f5) + 2.0f;
        if (f5 != 1.0f) {
            m1071A.f6161bO.mo135k();
            m1071A.f6161bO.mo228a(f5, f5);
            c0173b.f849ao.m5034a(m1071A.f6208cJ);
            c0173b.f849ao.f232c = ((int) (c0173b.f849ao.f230a + (c0173b.f849ao.m5033b() / f5))) + 2;
            c0173b.f849ao.f233d = ((int) (c0173b.f849ao.f231b + (c0173b.f849ao.m5029c() / f5))) + 2;
            m1071A.f6161bO.mo208a(c0173b.f849ao);
        }
        float f8 = (this.f860f - m1071A.f6194cv) * this.f867m;
        float f9 = (this.f861g - m1071A.f6195cw) * this.f867m;
        float f10 = (int) f8;
        float f11 = (int) f9;
        int i2 = 0;
        boolean z3 = false;
        if (AbstractC0916l.m994au() && m1071A.f6221cW < 0.3d) {
            z3 = true;
        }
        this.f859e.mo893a(z3);
        this.f859e.m5058d(z3);
        this.f859e.m5066b(z3);
        boolean z4 = false;
        for (int i3 = 0; i3 < this.f855a; i3++) {
            try {
                for (int i4 = 0; i4 < this.f855a; i4++) {
                    C0177d c0177d = this.f858d[i3][i4];
                    int i5 = (int) (f10 + (i3 * this.f865k * this.f867m));
                    int i6 = (int) (f11 + (i4 * this.f865k * this.f867m));
                    if (c0177d.f882l && !this.f868n) {
                        c0177d.f883m++;
                    }
                    c0177d.f886p.m5035a(i5 + 1, i6 + 1, (i5 + this.f862h) - 2, (i6 + this.f862h) - 2);
                    if (c0177d.f886p.f230a <= f6 && c0177d.f886p.f231b <= f7) {
                        if (c0177d.f886p.f232c > f6) {
                            c0177d.f886p.f232c = (int) f6;
                        }
                        if (c0177d.f886p.f233d > f7) {
                            c0177d.f886p.f233d = (int) f7;
                        }
                        int i7 = (int) ((0.0f - m1071A.f6194cv) * this.f867m);
                        int i8 = (int) ((0.0f - m1071A.f6195cw) * this.f867m);
                        int m4471i = (int) ((c0173b.m4471i() - m1071A.f6194cv) * this.f867m);
                        int m4470j = (int) ((c0173b.m4470j() - m1071A.f6195cw) * this.f867m);
                        if (c0177d.f886p.f230a < i7) {
                            c0177d.f886p.f230a = i7;
                        }
                        if (c0177d.f886p.f231b < i8) {
                            c0177d.f886p.f231b = i8;
                        }
                        if (c0177d.f886p.f232c > m4471i) {
                            c0177d.f886p.f232c = m4471i;
                        }
                        if (c0177d.f886p.f233d > m4470j) {
                            c0177d.f886p.f233d = m4470j;
                        }
                        if (!c0177d.f886p.m5037a()) {
                            boolean z5 = false;
                            boolean z6 = true;
                            if (c0177d.f881k) {
                                z5 = true;
                                z6 = false;
                            }
                            if (c0177d.f882l) {
                                int i9 = 10;
                                if (i2 > 3) {
                                    i9 = 10 + 2;
                                }
                                if (i2 > 6) {
                                    i9 += 2;
                                }
                                if (c0177d.f883m > i9) {
                                    c0177d.f883m = 0;
                                    z5 = true;
                                    i2++;
                                }
                            }
                            if (z5) {
                                z = true;
                                boolean z7 = false;
                                long m2370a = C0727bl.m2370a();
                                if (l == null) {
                                    l = Long.valueOf(m2370a);
                                } else {
                                    int i10 = 200;
                                    if (this.f868n) {
                                        i10 = 30;
                                    }
                                    if (C0727bl.m2367a(l.longValue(), m2370a) > i10) {
                                        z7 = true;
                                        this.f868n = true;
                                    }
                                }
                                if (z7 && c0177d.f881k && !c0177d.f884n) {
                                    m4457b(i3, i4);
                                }
                                if (!z7) {
                                    if (C0173b.f817I) {
                                        if (c0177d.f875e != null && c0177d.f875e.f6404p != c0177d.f874d.f6404p) {
                                            AbstractC0916l.m963e("wrong sized fadeOutBitmap width:" + c0177d.f875e.f6404p + " vs " + c0177d.f874d.f6404p);
                                            c0177d.f875e.mo49o();
                                            c0177d.f875e = null;
                                        }
                                        if (c0177d.f875e == null) {
                                            try {
                                                c0177d.m4447a();
                                            } catch (OutOfMemoryError e) {
                                                e.printStackTrace();
                                                AbstractC0916l.m1032a(EnumC1065u.gameImageCreate, e);
                                                m4450e();
                                                AbstractC0916l.m982b("Not enough free memory to keep smooth fog fading");
                                                System.gc();
                                            }
                                            if (C0173b.f817I && c0177d.f875e == null) {
                                                m1071A.m953i("Disabling smooth fog fading due to error");
                                                m4450e();
                                                AbstractC0916l.m982b("fadeOutBitmap == null");
                                                System.gc();
                                            }
                                        }
                                    }
                                    if (C0173b.f817I) {
                                        if (c0177d.f877g > 0.0f) {
                                        }
                                        C0934e c0934e = c0177d.f874d;
                                        c0177d.f874d = c0177d.f875e;
                                        c0177d.f875e = c0934e;
                                        InterfaceC1027y interfaceC1027y = c0177d.f871a;
                                        c0177d.f871a = c0177d.f876f;
                                        c0177d.f876f = interfaceC1027y;
                                        if (z6) {
                                            c0177d.f877g = 1.0f;
                                        } else {
                                            c0177d.f877g = 0.0f;
                                        }
                                    } else {
                                        c0177d.f877g = 0.0f;
                                    }
                                    if (AbstractC0916l.m996as() && !z4) {
                                        C0173b.m4536a();
                                        z4 = true;
                                    }
                                    m1071A.f6161bO.mo137i();
                                    m4453c(i3, i4);
                                    m1071A.f6161bO.mo136j();
                                    if (C0173b.f782a) {
                                        C0727bl.m2365a("re-drawTile", m2370a);
                                    }
                                }
                            }
                            c0177d.f885o.m5034a(c0177d.f886p);
                            c0177d.f885o.m5036a(-i5, -i6);
                            c0177d.f887q.m5021a(c0177d.f886p);
                            c0177d.f887q.m5023a(-f10, -f11);
                            c0177d.f887q.m5023a(f8, f9);
                            if (c0177d.f877g > 0.0f) {
                                c0177d.f878h.mo893a(z3);
                                c0177d.f878h.m5064c((int) ((1.0f - c0177d.f877g) * 255.0f));
                                m1071A.f6161bO.mo192a(c0177d.f875e, c0177d.f885o, c0177d.f887q, this.f859e);
                                if (c0177d.f877g < 0.98d) {
                                    m1071A.f6161bO.mo192a(c0177d.f874d, c0177d.f885o, c0177d.f887q, c0177d.f878h);
                                }
                                c0177d.f877g -= 0.1f * f;
                            } else if (c0177d.f874d.mo394A()) {
                                m1071A.f6161bO.mo191a(c0177d.f874d, c0177d.f887q, this.f859e, 0.0f, 0.0f, 0, 0);
                            } else {
                                m1071A.f6161bO.mo192a(c0177d.f874d, c0177d.f885o, c0177d.f887q, this.f859e);
                            }
                        }
                    }
                }
            } finally {
                if (z4) {
                    C0173b.m4501b();
                }
            }
        }
        if (f5 != 1.0f) {
            m1071A.f6161bO.mo134l();
        }
        if (!z) {
            this.f868n = false;
        }
    }
}
