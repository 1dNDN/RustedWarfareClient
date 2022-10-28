package com.corrodinggames.rts.gameFramework.p042j;

import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.Rect;
import com.corrodinggames.rts.game.p012b.C0173b;
import com.corrodinggames.rts.game.p012b.C0178e;
import com.corrodinggames.rts.game.units.AbstractC0244am;
import com.corrodinggames.rts.gameFramework.AbstractC0916l;
import java.util.LinkedList;

/* renamed from: com.corrodinggames.rts.gameFramework.j.f */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/j/f.class */
public class C0901f extends C0906k {

    /* renamed from: a */
    AbstractC0898c f5943a;

    /* renamed from: b */
    C0902g f5944b;

    /* renamed from: c */
    static Paint f5945c = new Paint();

    /* renamed from: d */
    static Point f5946d = new Point();

    public C0901f(C0907l c0907l, boolean z) {
        super(c0907l, z);
        this.f5943a = new C0903h(this);
    }

    @Override // com.corrodinggames.rts.gameFramework.p042j.C0906k
    /* renamed from: a */
    public AbstractC0898c mo1168a(AbstractC0244am abstractC0244am) {
        if (mo1169a() != null) {
            return this.f5943a;
        }
        return null;
    }

    @Override // com.corrodinggames.rts.gameFramework.p042j.C0906k
    /* renamed from: a */
    public LinkedList mo1169a() {
        return super.mo1169a();
    }

    @Override // com.corrodinggames.rts.gameFramework.p042j.C0906k
    /* renamed from: b */
    public boolean mo1161b() {
        return true;
    }

    @Override // com.corrodinggames.rts.gameFramework.p042j.C0906k
    /* renamed from: a */
    public boolean mo1164a(C0906k c0906k) {
        if (this == c0906k) {
            return true;
        }
        if (!(c0906k instanceof C0901f)) {
            return false;
        }
        C0901f c0901f = (C0901f) c0906k;
        if (this.f5981l != c0901f.f5981l || this.f5982m != c0901f.f5982m || this.f5984o != c0901f.f5984o) {
            return false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.corrodinggames.rts.gameFramework.p042j.C0906k
    /* renamed from: c */
    public boolean mo1160c() {
        return this.f5993x != null;
    }

    /* renamed from: a */
    public final byte m1199a(int i, int i2) {
        if (this.f5944b == null) {
            return (byte) -1;
        }
        return this.f5944b.m1197a(i, i2);
    }

    /* renamed from: a */
    public static final void m1200a(byte b, Point point) {
        int i = 0;
        int i2 = 0;
        byte b2 = (byte) (b - 1);
        if (b2 == 0) {
            i = 0 + 1;
        }
        if (b2 == 1) {
            i++;
            i2 = 0 + 1;
        }
        if (b2 == 2) {
            i2++;
        }
        if (b2 == 3) {
            i2++;
            i--;
        }
        if (b2 == 4) {
            i--;
        }
        if (b2 == 5) {
            i--;
            i2--;
        }
        if (b2 == 6) {
            i2--;
        }
        if (b2 == 7) {
            i2--;
            i++;
        }
        point.f224a = i;
        point.f225b = i2;
    }

    /* renamed from: d */
    public void m1198d() {
        int i;
        int i2;
        int i3;
        AbstractC0916l m1071A = AbstractC0916l.m1071A();
        C0173b c0173b = m1071A.f6158bL;
        Rect rect = new Rect();
        float f = m1071A.f6194cv;
        float f2 = m1071A.f6195cw;
        float f3 = m1071A.f6198cz;
        float f4 = m1071A.f6199cA;
        C0178e c0178e = m1071A.f6158bL.f802u;
        int i4 = (int) ((f * c0173b.f799r) - 1.0f);
        if (i4 < 0) {
            i4 = 0;
        }
        int i5 = (int) ((f2 * c0173b.f800s) - 1.0f);
        if (i5 < 0) {
            i5 = 0;
        }
        int i6 = (int) (((f + f3) * c0173b.f799r) + 1.0f);
        if (i6 > c0173b.f811C - 1) {
            i6 = c0173b.f811C - 1;
        }
        int i7 = (int) (((f2 + f4) * c0173b.f800s) + 1.0f);
        if (i7 > c0173b.f812D - 1) {
            i7 = c0173b.f812D - 1;
        }
        for (int i8 = i4; i8 < i6 + 1; i8++) {
            for (int i9 = i5; i9 < i7 + 1; i9++) {
                if (c0178e.m4442a(i8, i9) != null) {
                    int i10 = i8 * c0173b.f795n;
                    int i11 = i9 * c0173b.f796o;
                    rect.m5035a(i10, i11, i10 + c0173b.f795n, i11 + c0173b.f796o);
                    rect.m5036a((int) (-f), (int) (-f2));
                    boolean m5032b = rect.m5032b((int) (m1071A.f6165bS.f5129s / m1071A.f6221cW), (int) (m1071A.f6165bS.f5130t / m1071A.f6221cW));
                    int i12 = 0;
                    if (50 == -1) {
                        i = 255;
                    } else {
                        i = 50 * 2;
                    }
                    if (0 == -1) {
                        i2 = 255;
                    } else {
                        i2 = 0 * 2;
                    }
                    if (0 == -1) {
                        i3 = 255;
                    } else {
                        if (0 != 0) {
                            i12 = 0 + 30;
                        }
                        i3 = i12 * 2;
                    }
                    f5945c.m5091a(128, i, i2, i3);
                    m1200a(m1199a(i8, i9), f5946d);
                    float f5 = (i10 + c0173b.f797p) - f;
                    float f6 = (i11 + c0173b.f798q) - f2;
                    m1071A.f6161bO.mo225a(f5, f6, f5 + (f5946d.f224a * (c0173b.f795n - 3)) + 1.0f, f6 + (f5946d.f225b * (c0173b.f796o - 3)) + 1.0f, f5945c);
                    if (m5032b) {
                    }
                }
            }
        }
    }
}
