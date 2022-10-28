package com.corrodinggames.rts.gameFramework.p030a;

import android.content.Context;
import com.corrodinggames.rts.C0067R;
import com.corrodinggames.rts.gameFramework.C0758f;
import com.corrodinggames.rts.gameFramework.EnumC1065u;
import com.corrodinggames.rts.gameFramework.LoggerMaybe;
import com.corrodinggames.rts.gameFramework.utility.C1098j;
import java.util.ArrayList;

/* renamed from: com.corrodinggames.rts.gameFramework.a.e */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/a/e.class */
public class C0631e {

    /* renamed from: a */
    ArrayList f4035a = new ArrayList();

    /* renamed from: b */
    public boolean f4036b;

    /* renamed from: c */
    public static AbstractC0634h f4037c = new C0627a();

    /* renamed from: d */
    public static AbstractC0635i f4038d;

    /* renamed from: e */
    public static AbstractC0635i f4039e;

    /* renamed from: f */
    public static AbstractC0635i f4040f;

    /* renamed from: g */
    public static AbstractC0635i f4041g;

    /* renamed from: h */
    public static AbstractC0635i f4042h;

    /* renamed from: i */
    public static AbstractC0635i f4043i;

    /* renamed from: j */
    public static AbstractC0635i f4044j;

    /* renamed from: k */
    public static AbstractC0635i f4045k;

    /* renamed from: l */
    public static AbstractC0635i f4046l;

    /* renamed from: m */
    public static AbstractC0635i f4047m;

    /* renamed from: n */
    public static AbstractC0635i f4048n;

    /* renamed from: o */
    public static AbstractC0635i f4049o;

    /* renamed from: p */
    public static AbstractC0635i f4050p;

    /* renamed from: q */
    public static AbstractC0635i f4051q;

    /* renamed from: r */
    public static AbstractC0635i f4052r;

    /* renamed from: s */
    public static AbstractC0635i f4053s;

    /* renamed from: t */
    public static AbstractC0635i f4054t;

    /* renamed from: u */
    public static AbstractC0635i f4055u;

    /* renamed from: v */
    public static AbstractC0635i f4056v;

    /* renamed from: w */
    public static AbstractC0635i f4057w;

    /* renamed from: x */
    public static AbstractC0635i f4058x;

    /* renamed from: y */
    public static AbstractC0635i f4059y;

    /* renamed from: z */
    public static AbstractC0635i f4060z;

    /* renamed from: A */
    public static AbstractC0635i f4061A;

    /* renamed from: B */
    public static AbstractC0635i f4062B;

    /* renamed from: C */
    public static AbstractC0635i f4063C;

    /* renamed from: D */
    public static AbstractC0635i f4064D;

    /* renamed from: E */
    public static AbstractC0635i f4065E;

    /* renamed from: F */
    public static AbstractC0635i f4066F;

    /* renamed from: a */
    public boolean m2729a(AbstractC0635i abstractC0635i, float f) {
        if (this.f4035a.contains(abstractC0635i)) {
            return false;
        }
        this.f4035a.add(abstractC0635i);
        return true;
    }

    /* renamed from: a */
    public boolean m2732a() {
        LoggerMaybe m1079A = LoggerMaybe.m1079A();
        return m2731a(m1079A.f6115bQ.masterVolume * m1079A.f6115bQ.gameVolume);
    }

    /* renamed from: a */
    public boolean m2731a(float f) {
        LoggerMaybe m1079A = LoggerMaybe.m1079A();
        if (f < 0.01f || this.f4036b) {
            return false;
        }
        return m1079A.f6115bQ.enableSounds;
    }

    /* renamed from: b */
    public static void m2724b() {
    }

    /* renamed from: a */
    public void m2730a(Context context) {
        f4037c.mo85a(context);
        f4039e = f4037c.mo86a(C0067R.raw.attack);
        f4039e.f4070d = 0.2f;
        f4038d = f4037c.mo86a(C0067R.raw.attack2);
        f4040f = f4037c.mo86a(C0067R.raw.move);
        f4041g = f4037c.mo86a(C0067R.raw.click);
        f4042h = f4037c.mo86a(C0067R.raw.click_add);
        f4043i = f4037c.mo86a(C0067R.raw.click_remove);
        f4044j = f4037c.mo86a(C0067R.raw.warning);
        f4045k = f4037c.mo86a(C0067R.raw.message);
        f4047m = f4037c.mo86a(C0067R.raw.missile_fire);
        f4048n = f4037c.mo86a(C0067R.raw.missile_hit);
        f4049o = f4037c.mo86a(C0067R.raw.unit_explode);
        f4050p = f4037c.mo86a(C0067R.raw.buiding_explode);
        f4051q = f4037c.mo86a(C0067R.raw.tank_firing);
        f4052r = f4037c.mo86a(C0067R.raw.cannon_firing);
        f4053s = f4037c.mo86a(C0067R.raw.gun_fire);
        f4058x = f4037c.mo86a(C0067R.raw.lighting_burst);
        f4059y = f4037c.mo86a(C0067R.raw.plasma_fire);
        f4060z = f4037c.mo86a(C0067R.raw.plasma_fire2);
        f4054t = f4037c.mo86a(C0067R.raw.firing3);
        f4055u = f4037c.mo86a(C0067R.raw.firing4);
        f4056v = f4037c.mo86a(C0067R.raw.large_gun_fire1);
        f4057w = f4037c.mo86a(C0067R.raw.large_gun_fire2);
        f4061A = f4037c.mo86a(C0067R.raw.bug_die);
        f4062B = f4037c.mo86a(C0067R.raw.bug_attack);
        f4046l = f4037c.mo86a(C0067R.raw.interface_error);
        f4063C = f4037c.mo86a(C0067R.raw.nuke_explode);
        f4064D = f4037c.mo86a(C0067R.raw.nuke_launch);
        f4065E = f4037c.mo86a(C0067R.raw.laser_deflect);
        f4066F = f4037c.mo86a(C0067R.raw.laser_deflect2);
        f4037c.mo87a();
    }

    /* renamed from: a */
    public AbstractC0635i m2726a(String str) {
        AbstractC0635i abstractC0635i = (AbstractC0635i) f4037c.f4067h.get(str);
        if (abstractC0635i == null) {
            throw new RuntimeException("Could not find sound:" + str);
        }
        return abstractC0635i;
    }

    /* renamed from: b */
    public void m2722b(AbstractC0635i abstractC0635i, float f) {
        LoggerMaybe m1079A = LoggerMaybe.m1079A();
        float f2 = f * m1079A.f6115bQ.masterVolume * m1079A.f6115bQ.interfaceVolume * abstractC0635i.f4070d;
        if (!m2731a(f2) || f2 < 0.01d || !m2729a(abstractC0635i, f2)) {
            return;
        }
        if (m1079A.f6081aq) {
            f2 /= 20.0f;
        }
        abstractC0635i.mo80a(f2, f2, 1, 0, 1.0f);
    }

    /* renamed from: c */
    public void m2720c(AbstractC0635i abstractC0635i, float f) {
        LoggerMaybe m1079A = LoggerMaybe.m1079A();
        float f2 = f * m1079A.f6115bQ.masterVolume * m1079A.f6115bQ.gameVolume * abstractC0635i.f4070d;
        if (m2731a(f2)) {
            if (m1079A.f6081aq) {
                f2 /= 20.0f;
            }
            if (!m2729a(abstractC0635i, f2)) {
                return;
            }
            abstractC0635i.mo80a(f2, f2, 1, 0, 1.0f);
        }
    }

    /* renamed from: a */
    public void m2728a(AbstractC0635i abstractC0635i, float f, float f2, float f3) {
        m2727a(abstractC0635i, f, 1.0f, f2, f3);
    }

    /* renamed from: a */
    public void m2727a(AbstractC0635i abstractC0635i, float f, float f2, float f3, float f4) {
        if (m2732a()) {
            LoggerMaybe m1079A = LoggerMaybe.m1079A();
            if (m1079A.f6081aq) {
                f /= 20.0f;
            }
            if (m1079A.f6126cb.m2413h() && m1079A.f6237bt > 1.5d) {
                f /= m1079A.f6237bt;
            }
            float m2160a = C0758f.m2160a((int) (m1079A.f6144cv + m1079A.f6156cH), (int) (m1079A.f6145cw + m1079A.f6157cI), f3, f4);
            float f5 = m1079A.f6156cH * 1.72f;
            if (m1079A.f6256cW < 0.5d) {
                f = f * 4.0f * m1079A.f6256cW * m1079A.f6256cW;
            }
            if (f <= 1.0f && !abstractC0635i.f4071f && m2160a > f5 * f5) {
                return;
            }
            float sqrt = (float) Math.sqrt(m2160a);
            float f6 = 1.0f;
            if (sqrt > m1079A.f6156cH) {
                f6 = 1.0f - ((sqrt - m1079A.f6156cH) / m1079A.f6156cH);
            }
            float f7 = f6 * f;
            if (f7 <= 0.05d && !abstractC0635i.f4071f) {
                return;
            }
            if (f7 > 1.0f) {
                f7 = 1.0f;
            }
            float f8 = f7 * m1079A.f6115bQ.masterVolume * m1079A.f6115bQ.gameVolume * abstractC0635i.f4070d;
            if (!m2729a(abstractC0635i, f8)) {
                return;
            }
            abstractC0635i.mo80a(f8, f8, 1, 0, f2);
        }
    }

    /* renamed from: a */
    public AbstractC0635i m2725a(String str, C1098j c1098j, boolean z) {
        try {
            return f4037c.mo84a(str, c1098j, z);
        } catch (OutOfMemoryError e) {
            LoggerMaybe.m1040a(EnumC1065u.f6750f, e);
            return C0632f.m2718b();
        }
    }

    /* renamed from: b */
    public AbstractC0635i m2721b(String str) {
        return C0632f.m2719a(str);
    }

    /* renamed from: b */
    public void m2723b(float f) {
        this.f4035a.clear();
    }
}
