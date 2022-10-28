package com.corrodinggames.rts.game.units.p024d;

import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.Rect;
import com.corrodinggames.rts.game.AbstractC0197n;
import com.corrodinggames.rts.game.units.AbstractC0244am;
import com.corrodinggames.rts.game.units.InterfaceC0303as;
import com.corrodinggames.rts.game.units.custom.C0448g;
import com.corrodinggames.rts.game.units.custom.p020d.C0424b;
import com.corrodinggames.rts.game.units.p013a.AbstractC0224s;
import com.corrodinggames.rts.game.units.p013a.C0208c;
import com.corrodinggames.rts.gameFramework.Core;
import com.corrodinggames.rts.gameFramework.p041i.Reader;
import com.corrodinggames.rts.gameFramework.p041i.StreamWriter;
import com.corrodinggames.rts.gameFramework.utility.C1101m;

/* renamed from: com.corrodinggames.rts.game.units.d.i */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/d/i.class */
public abstract class AbstractC0498i extends AbstractC0488d implements InterfaceC0501l {

    /* renamed from: y */
    public static final Paint f3481y = new Paint();

    /* renamed from: z */
    C0500k f3482z;

    /* renamed from: A */
    Rect f3483A;

    /* renamed from: B */
    Rect f3484B;

    static {
        f3481y.m5933a(255, 0, 255, 0);
        f3481y.m5936a(1.5f);
        f3481y.mo5914a(true);
    }

    public AbstractC0498i(boolean z) {
        super(z);
        this.f3482z = m3471dr();
        this.f3483A = new Rect();
        this.f3484B = new Rect();
    }

    /* renamed from: a */
    public void mo2441a(StreamWriter streamWriter) {
        streamWriter.WriteInteger(this.f3430r);
        this.f3482z.m3452a(streamWriter);
        super.mo2441a(streamWriter);
    }

    /* renamed from: a */
    public void m3478a(Reader reader) {
        if (reader.m1310b() >= 69) {
            m3540R(reader.ReadInt());
        }
        this.f3482z.m3451a(reader);
        super.m3535a(reader);
    }

    /* renamed from: dr */
    public C0500k m3471dr() {
        return new C0500k(this);
    }

    /* renamed from: b */
    public void mo3436b(C0499j c0499j) {
    }

    /* renamed from: c */
    public boolean mo3435c(C0499j c0499j) {
        return true;
    }

    /* renamed from: a */
    public void mo3437a(C0499j c0499j) {
        float f;
        if (this.f3482z.f3500b != null) {
            f = this.f1621ch * 2.0f;
        } else {
            f = this.f1621ch * 3.0f;
        }
        AbstractC0244am m3453a = this.f3482z.m3453a(c0499j, f, false, 0.0f);
        if (m3453a != null) {
            if (m3453a.f6959em - m3453a.f1621ch < this.f6959em + m3470ds()) {
                m3453a.f6959em = this.f6959em + m3470ds() + m3453a.f1621ch;
            }
            AbstractC0197n.m5053c(m3453a);
        }
    }

    /* renamed from: ds */
    public int m3470ds() {
        return -100;
    }

    /* renamed from: f */
    public int mo3429f(boolean z) {
        return this.f3482z.m3464a(AbstractC0224s.f1462i, z, true);
    }

    /* renamed from: a */
    public final int mo3438a(C0208c c0208c, boolean z) {
        return this.f3482z.m3465a(c0208c, z);
    }

    /* renamed from: dt */
    public C0499j mo3434dt() {
        return this.f3482z.m3449b();
    }

    /* renamed from: bD */
    public C0424b m3475bD() {
        return this.f3482z.m3445c();
    }

    /* renamed from: du */
    public C1101m mo3433du() {
        return this.f3482z.f3501c;
    }

    /* renamed from: h */
    public int mo3428h(InterfaceC0303as interfaceC0303as) {
        return this.f3482z.m3457a(interfaceC0303as);
    }

    /* renamed from: dv */
    public boolean mo3432dv() {
        return this.f3482z.m3467a();
    }

    /* renamed from: dw */
    public void mo3431dw() {
        this.f3482z.f3503e = 1.0f;
    }

    /* renamed from: a */
    public void mo3439a(PointF pointF) {
        this.f3482z.f3500b = pointF;
    }

    /* renamed from: dx */
    public boolean mo3430dx() {
        return false;
    }

    /* renamed from: bU */
    public float m3474bU() {
        if (m4751bS() && !this.f3482z.m3467a()) {
            return this.f3482z.f3503e;
        }
        return super.m4749bU();
    }

    /* renamed from: e */
    public AbstractC0224s m3469e(InterfaceC0303as interfaceC0303as) {
        return this.f3482z.m3447b(interfaceC0303as);
    }

    /* renamed from: a */
    public void mo3173a(AbstractC0224s abstractC0224s, boolean z) {
        this.f3482z.m3461a(abstractC0224s, z, (PointF) null, (AbstractC0244am) null);
    }

    /* renamed from: b */
    public void m3476b(AbstractC0224s abstractC0224s, boolean z) {
        this.f3482z.m3462a(abstractC0224s, z);
    }

    /* renamed from: b */
    public void m3477b(AbstractC0224s abstractC0224s) {
        this.f3482z.m3463a(abstractC0224s);
    }

    /* renamed from: a */
    public void mo1762a(float f) {
        super.mo1762a(f);
        if (!m4751bS() || this.f1607bT) {
            return;
        }
        this.f3482z.m3466a(f);
    }

    /* renamed from: c */
    public boolean mo3049c(float f) {
        return super.mo3049c(f);
    }

    /* renamed from: bv */
    public void m3472bv() {
        AbstractC0197n.m5089a((AbstractC0244am) this);
        this.f3482z.m3450a(true);
        super.m2857bv();
    }

    /* renamed from: a */
    public void mo2689a() {
        AbstractC0197n.m5089a((AbstractC0244am) this);
        this.f3482z.m3450a(true);
        super.mo2689a();
    }

    /* renamed from: l */
    public boolean mo3036l() {
        return false;
    }

    /* renamed from: a */
    public void mo3051a(AbstractC0244am abstractC0244am, int i) {
        throw new RuntimeException("Unit cannot shoot");
    }

    /* renamed from: m */
    public float mo3035m() {
        return 0.0f;
    }

    /* renamed from: b */
    public float mo3050b(int i) {
        return 0.0f;
    }

    /* renamed from: c */
    public float mo3048c(int i) {
        return 0.0f;
    }

    /* renamed from: bZ */
    public void m3473bZ() {
        if (this.f3482z.f3500b != null) {
            Core m1087A = Core.m1087A();
            m1087A.f6113bO.mo225a((int) (this.f6958el - m1087A.f6144cv), (int) (this.f6959em - m1087A.f6145cw), (int) (this.f3482z.f3500b.f227a - m1087A.f6144cv), (int) (this.f3482z.f3500b.f228b - m1087A.f6145cw), f3481y);
        }
    }

    /* renamed from: a */
    public int m3479a(C0448g c0448g) {
        return this.f3482z.m3455a(c0448g);
    }
}
