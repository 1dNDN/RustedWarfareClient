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
import com.corrodinggames.rts.gameFramework.LoggerMaybe;
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
        f3481y.m5420a(255, 0, 255, 0);
        f3481y.m5423a(1.5f);
        f3481y.mo894a(true);
    }

    public AbstractC0498i(boolean z) {
        super(z);
        this.f3482z = mo3299dr();
        this.f3483A = new Rect();
        this.f3484B = new Rect();
    }

    /* renamed from: a */
    public void mo2292a(StreamWriter streamWriter) {
        streamWriter.WriteInteger(this.f3430r);
        this.f3482z.m3327a(streamWriter);
        super.mo2292a(streamWriter);
    }

    /* renamed from: a */
    public void mo2291a(Reader reader) {
        if (reader.m1295b() >= 69) {
            mo3358R(reader.ReadInt());
        }
        this.f3482z.m3326a(reader);
        super.mo2291a(reader);
    }

    /* renamed from: dr */
    public C0500k mo3299dr() {
        return new C0500k(this);
    }

    /* renamed from: b */
    public void mo3312b(C0499j c0499j) {
    }

    /* renamed from: c */
    public boolean mo3311c(C0499j c0499j) {
        return true;
    }

    /* renamed from: a */
    public void mo3272a(C0499j c0499j) {
        float f;
        if (this.f3482z.f3500b != null) {
            f = this.f1621ch * 2.0f;
        } else {
            f = this.f1621ch * 3.0f;
        }
        AbstractC0244am m3328a = this.f3482z.m3328a(c0499j, f, false, 0.0f);
        if (m3328a != null) {
            if (m3328a.f6958em - m3328a.f1621ch < this.f6958em + mo3266ds()) {
                m3328a.f6958em = this.f6958em + mo3266ds() + m3328a.f1621ch;
            }
            AbstractC0197n.m4598c(m3328a);
        }
    }

    /* renamed from: ds */
    public int mo3266ds() {
        return -100;
    }

    /* renamed from: f */
    public int mo3305f(boolean z) {
        return this.f3482z.m3339a(AbstractC0224s.f1462i, z, true);
    }

    /* renamed from: a */
    public final int mo3313a(C0208c c0208c, boolean z) {
        return this.f3482z.m3340a(c0208c, z);
    }

    /* renamed from: dt */
    public C0499j mo3310dt() {
        return this.f3482z.m3324b();
    }

    /* renamed from: bD */
    public C0424b m3348bD() {
        return this.f3482z.m3320c();
    }

    /* renamed from: du */
    public C1101m mo3309du() {
        return this.f3482z.f3501c;
    }

    /* renamed from: h */
    public int mo3304h(InterfaceC0303as interfaceC0303as) {
        return this.f3482z.m3332a(interfaceC0303as);
    }

    /* renamed from: dv */
    public boolean mo3308dv() {
        return this.f3482z.m3342a();
    }

    /* renamed from: dw */
    public void mo3307dw() {
        this.f3482z.f3503e = 1.0f;
    }

    /* renamed from: a */
    public void mo3314a(PointF pointF) {
        this.f3482z.f3500b = pointF;
    }

    /* renamed from: dx */
    public boolean mo3306dx() {
        return false;
    }

    /* renamed from: bU */
    public float m3347bU() {
        if (m4396bS() && !this.f3482z.m3342a()) {
            return this.f3482z.f3503e;
        }
        return super.m4394bU();
    }

    /* renamed from: e */
    public AbstractC0224s m3344e(InterfaceC0303as interfaceC0303as) {
        return this.f3482z.m3322b(interfaceC0303as);
    }

    /* renamed from: a */
    public void mo3067a(AbstractC0224s abstractC0224s, boolean z) {
        this.f3482z.m3336a(abstractC0224s, z, (PointF) null, (AbstractC0244am) null);
    }

    /* renamed from: b */
    public void m3349b(AbstractC0224s abstractC0224s, boolean z) {
        this.f3482z.m3337a(abstractC0224s, z);
    }

    /* renamed from: b */
    public void m3350b(AbstractC0224s abstractC0224s) {
        this.f3482z.m3338a(abstractC0224s);
    }

    /* renamed from: a */
    public void mo1718a(float f) {
        super.mo1718a(f);
        if (!m4396bS() || this.f1607bT) {
            return;
        }
        this.f3482z.m3341a(f);
    }

    /* renamed from: c */
    public boolean mo2285c(float f) {
        return super.mo2285c(f);
    }

    /* renamed from: bv */
    public void m3345bv() {
        AbstractC0197n.m4634a((AbstractC0244am) this);
        this.f3482z.m3325a(true);
        super.m2801bv();
    }

    /* renamed from: a */
    public void mo2635a() {
        AbstractC0197n.m4634a((AbstractC0244am) this);
        this.f3482z.m3325a(true);
        super.mo2635a();
    }

    /* renamed from: l */
    public boolean mo2979l() {
        return false;
    }

    /* renamed from: a */
    public void mo2993a(AbstractC0244am abstractC0244am, int i) {
        throw new RuntimeException("Unit cannot shoot");
    }

    /* renamed from: m */
    public float mo2978m() {
        return 0.0f;
    }

    /* renamed from: b */
    public float mo2992b(int i) {
        return 0.0f;
    }

    /* renamed from: c */
    public float mo2991c(int i) {
        return 0.0f;
    }

    /* renamed from: bZ */
    public void m3346bZ() {
        if (this.f3482z.f3500b != null) {
            LoggerMaybe m1072A = LoggerMaybe.m1072A();
            m1072A.f6113bO.mo225a((int) (this.f6957el - m1072A.f6144cv), (int) (this.f6958em - m1072A.f6145cw), (int) (this.f3482z.f3500b.f227a - m1072A.f6144cv), (int) (this.f3482z.f3500b.f228b - m1072A.f6145cw), f3481y);
        }
    }

    /* renamed from: a */
    public int m3351a(C0448g c0448g) {
        return this.f3482z.m3330a(c0448g);
    }
}
