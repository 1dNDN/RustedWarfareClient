package com.corrodinggames.rts.game.units.custom;

import android.graphics.Color;
import android.graphics.LightingColorFilter;
import com.corrodinggames.rts.game.AbstractC0197n;
import com.corrodinggames.rts.game.C0188f;
import com.corrodinggames.rts.game.units.AbstractC0244am;
import com.corrodinggames.rts.gameFramework.AbstractC1120w;
import com.corrodinggames.rts.gameFramework.C0758f;
import com.corrodinggames.rts.gameFramework.Core;
import com.corrodinggames.rts.gameFramework.p035d.C0743c;
import com.corrodinggames.rts.gameFramework.p035d.C0745e;
import com.corrodinggames.rts.gameFramework.p035d.C0746f;
import com.corrodinggames.rts.gameFramework.p035d.C0747g;
import com.corrodinggames.rts.gameFramework.p035d.EnumC0744d;
import com.corrodinggames.rts.gameFramework.p035d.EnumC0748h;
import com.corrodinggames.rts.gameFramework.p044l.C0934e;
import com.corrodinggames.rts.gameFramework.utility.C1072ab;
import com.corrodinggames.rts.gameFramework.utility.C1117y;
import java.util.ArrayList;

/* renamed from: com.corrodinggames.rts.game.units.custom.aw */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/aw.class */
public class C0382aw {
    public static final C0382aw defaultEffectTemplate = new C0382aw("default");
    public String name;
    private EnumC0383ax builtInEffect;
    public C0747g imageStrip;
    public boolean createWhenOffscreen;
    public boolean createWhenZoomedOut;
    public boolean createWhenOverLiquid;
    public boolean createWhenOverLand;
    public float spawnChance;
    C0467y ifSpawnFailsEmitEffects;
    public float life;
    public float lifeRandom;
    public boolean showInFog;
    public float xOffsetRelative;
    public float yOffsetRelative;
    public float hOffset;
    public boolean alwayStartDirAtZero;
    public float pivotOffset;
    public float pivotOffsetRandom;
    public float dirOffset;
    public float xOffsetRelativeRandom;
    public float yOffsetRelativeRandom;
    public float hOffsetRandom;
    public float dirOffsetRandom;
    public float xOffsetAbsolute;
    public float yOffsetAbsolute;
    public float xOffsetAbsoluteRandom;
    public float yOffsetAbsoluteRandom;
    public float xSpeedRelative;
    public float ySpeedRelative;
    public float hSpeed;
    public float dirSpeed;
    public float xSpeedRelativeRandom;
    public float ySpeedRelativeRandom;
    public float hSpeedRandom;
    public float dirSpeedRandom;
    public float xSpeedAbsolute;
    public float ySpeedAbsolute;
    public float xSpeedAbsoluteRandom;
    public float ySpeedAbsoluteRandom;
    public EnumC0748h priority;
    public float scaleTo;
    public float scaleFrom;
    public float alpha;
    public int color;
    public LightingColorFilter cachedLightingColorFilter;
    public float teamColorRatio;
    public boolean shadow;
    public short drawLayer;
    public float fadeInTime;
    public boolean fadeOut;
    public float delayedStartTimer;
    public float delayedStartTimerRandom;
    public int frameIndex;
    public int frameIndexRandom;
    public int stripIndex;
    public boolean attachedToUnit;
    public boolean liveAfterAttachedDies;
    public boolean atmospheric;
    public boolean physics;
    public float physicsGravity;
    public int animateFrameStart;
    public int animateFrameEnd;
    public int animateFrameStartRandomAdd;
    public boolean animateFramePingPong;
    public boolean animateFrameLooping;
    public float animateFrameSpeed;
    public float animateFrameSpeedRandom;
    public C0467y alsoEmitEffects;
    public C0467y alsoEmitEffectsOnDeath;
    public C0467y trailEffect;
    public float trailEffectRate;
    public C0409bj alsoPlaySound;
    public static ArrayList fields;

    public C0382aw(EnumC0383ax enumC0383ax) {
        this.builtInEffect = null;
        this.spawnChance = 1.0f;
        this.life = 200.0f;
        this.priority = EnumC0748h.f4834c;
        this.scaleTo = 1.0f;
        this.scaleFrom = 1.0f;
        this.alpha = 1.0f;
        this.color = -1;
        this.teamColorRatio = 0.0f;
        this.drawLayer = (short) 2;
        this.physicsGravity = 1.0f;
        this.builtInEffect = enumC0383ax;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0382aw(String str) {
        this.builtInEffect = null;
        this.spawnChance = 1.0f;
        this.life = 200.0f;
        this.priority = EnumC0748h.f4834c;
        this.scaleTo = 1.0f;
        this.scaleFrom = 1.0f;
        this.alpha = 1.0f;
        this.color = -1;
        this.teamColorRatio = 0.0f;
        this.drawLayer = (short) 2;
        this.physicsGravity = 1.0f;
        this.name = str;
    }

    /* renamed from: a */
    public C0745e m4231a(float f, float f2, float f3, float f4, AbstractC1120w abstractC1120w, int i, short s) {
        AbstractC0244am abstractC0244am;
        C0745e c0745e;
        Core m1087A = Core.m1087A();
        if (this.spawnChance < 1.0f && C0758f.m2136c(0.0f, 1.0f) > this.spawnChance) {
            if (i < 5 && this.ifSpawnFailsEmitEffects != null) {
                this.ifSpawnFailsEmitEffects.m3636a(f, f2, f3, f4, abstractC1120w, i + 1, s);
                return null;
            }
            return null;
        } else if (this.builtInEffect != null) {
            if (this.builtInEffect == EnumC0383ax.f2262a) {
                c0745e = m1087A.f6116bR.m2390a(f, f2, f3, f4);
            } else if (this.builtInEffect == EnumC0383ax.f2263b) {
                c0745e = m1087A.f6116bR.m2367b(f, f2, f3, f4, 0);
                if (c0745e != null) {
                    c0745e.f4751H = 0.75f;
                    c0745e.f4750G = 0.75f;
                }
            } else if (this.builtInEffect == EnumC0383ax.f2264c) {
                c0745e = m1087A.f6116bR.m2367b(f, f2, f3, f4, 0);
            } else if (this.builtInEffect == EnumC0383ax.f2265d) {
                c0745e = m1087A.f6116bR.m2362c(f, f2, f3, f4, 0);
            } else if (this.builtInEffect == EnumC0383ax.f2266e) {
                c0745e = m1087A.f6116bR.m2359d(f, f2, f3, 0);
            } else if (this.builtInEffect == EnumC0383ax.f2267f) {
                m1087A.f6116bR.m2391a(f, f2, f3);
                c0745e = null;
            } else if (this.builtInEffect == EnumC0383ax.f2268g) {
                c0745e = m1087A.f6116bR.m2370b(f, f2, f3);
            } else if (this.builtInEffect == EnumC0383ax.f2269h) {
                C0746f.m2348a(f, f2).f4804j = -6684775;
                C0746f m2340b = C0746f.m2340b(f, f2);
                m2340b.f4795a = 500.0f;
                m2340b.f4804j = -6684775;
                m1087A.f6116bR.m2364b(EnumC0748h.f4836e);
                C0745e m2361c = m1087A.f6116bR.m2361c(f, f2, f3, -1127220);
                if (m2361c != null) {
                    m2361c.f4751H = 0.15f;
                    m2361c.f4750G = 1.0f;
                    m2361c.f4788as = (short) 2;
                    m2361c.f4766W = 35.0f;
                    m2361c.f4767X = m2361c.f4766W;
                    m2361c.f4765V = 0.0f;
                    m2361c.f4742y = -13378253;
                }
                c0745e = null;
            } else if (this.builtInEffect == EnumC0383ax.f2270i) {
                return null;
            } else {
                throw new RuntimeException("Unhandled built-in type:" + this.builtInEffect);
            }
            if (c0745e == null) {
                return null;
            }
            c0745e.f4788as = (short) 2;
            if (abstractC1120w != null) {
                C0743c.m2379a(c0745e, abstractC1120w);
            }
            return c0745e;
        } else if (!this.createWhenZoomedOut && !m1087A.f6258db) {
            return null;
        } else {
            if (!this.createWhenOverLiquid && C1117y.m449d(f, f2)) {
                return null;
            }
            if (!this.createWhenOverLand && !C1117y.m449d(f, f2)) {
                return null;
            }
            if (this.createWhenOffscreen) {
                m1087A.f6116bR.m2372b();
            } else {
                m1087A.f6116bR.m2394a();
            }
            boolean z = this.showInFog;
            boolean z2 = false;
            if (!z && this.attachedToUnit) {
                z2 = true;
                z = true;
            }
            C0745e m2365b = m1087A.f6116bR.m2365b(f, f2, f3, EnumC0744d.f4707a, z, this.priority);
            if (m2365b == null) {
                return null;
            }
            m2365b.f4718a = this;
            m2365b.f4745B = (short) (s + 1);
            if (z2 && !this.showInFog) {
                m2365b.f4722e = false;
            }
            m2365b.f4766W = this.life;
            m2365b.f4766W += m4233a(this.lifeRandom);
            m2365b.f4767X = m2365b.f4766W;
            m2365b.f4787ar = this.stripIndex;
            if (this.imageStrip != null) {
            }
            m2365b.f4786aq = this.frameIndex;
            if (this.frameIndexRandom != 0) {
                m2365b.f4786aq += C0758f.m2203a(-this.frameIndexRandom, this.frameIndexRandom);
                if (m2365b.f4786aq < 0) {
                    m2365b.f4786aq = 0;
                }
            }
            float m4233a = f4 + this.pivotOffset + m4233a(this.pivotOffsetRandom);
            if (this.alwayStartDirAtZero) {
                m2365b.f4769Z = 0.0f;
            } else {
                m2365b.f4769Z = m4233a;
            }
            m2365b.f4769Z += this.dirOffset;
            m2365b.f4769Z += m4233a(this.dirOffsetRandom);
            if (this.xOffsetAbsoluteRandom != 0.0f || this.yOffsetAbsoluteRandom != 0.0f || this.xOffsetAbsolute != 0.0f || this.yOffsetAbsolute != 0.0f) {
                float m4233a2 = this.xOffsetAbsolute + m4233a(this.xOffsetAbsoluteRandom);
                float m4233a3 = this.yOffsetAbsolute + m4233a(this.yOffsetAbsoluteRandom);
                m2365b.f4753J += m4233a2;
                m2365b.f4754K += m4233a3;
            }
            if (this.xOffsetRelativeRandom != 0.0f || this.yOffsetRelativeRandom != 0.0f || this.xOffsetRelative != 0.0f || this.yOffsetRelative != 0.0f) {
                float m2092i = C0758f.m2092i(m4233a);
                float m2097h = C0758f.m2097h(m4233a);
                float m4233a4 = this.xOffsetRelative + m4233a(this.xOffsetRelativeRandom);
                float m4233a5 = this.yOffsetRelative + m4233a(this.yOffsetRelativeRandom);
                m2365b.f4753J += (m2092i * m4233a5) - (m2097h * m4233a4);
                m2365b.f4754K += (m2097h * m4233a5) + (m2092i * m4233a4);
            }
            m2365b.f4755L += this.hOffset + m4232a(-this.hOffsetRandom, this.hOffsetRandom);
            m2365b.f4784ao = true;
            m2365b.f4736s = true;
            m2365b.f4788as = this.drawLayer;
            m2365b.f4751H = this.scaleFrom;
            m2365b.f4750G = this.scaleTo;
            m2365b.f4749F = this.alpha;
            m2365b.f4742y = this.color;
            m2365b.f4746C = this.cachedLightingColorFilter;
            if (this.teamColorRatio != 0.0f && abstractC1120w != null) {
                AbstractC0197n abstractC0197n = null;
                if (abstractC1120w instanceof AbstractC0244am) {
                    abstractC0197n = ((AbstractC0244am) abstractC1120w).f1609bV;
                }
                if ((abstractC1120w instanceof C0188f) && (abstractC0244am = ((C0188f) abstractC1120w).f984j) != null) {
                    abstractC0197n = abstractC0244am.f1609bV;
                }
                if (abstractC0197n != null) {
                    float f5 = 1.0f - this.teamColorRatio;
                    int m5950a = Color.m5950a(m2365b.f4742y);
                    int m5946b = (int) (Color.m5946b(m2365b.f4742y) * f5);
                    int m5945c = (int) (Color.m5945c(m2365b.f4742y) * f5);
                    int m5944d = (int) (Color.m5944d(m2365b.f4742y) * f5);
                    int m5112H = abstractC0197n.m5112H();
                    m2365b.f4742y = Color.m5948a(m5950a, C0758f.m2153b((int) (m5946b + (Color.m5946b(m5112H) * this.teamColorRatio)), 0, 255), C0758f.m2153b((int) (m5945c + (Color.m5945c(m5112H) * this.teamColorRatio)), 0, 255), C0758f.m2153b((int) (m5944d + (Color.m5944d(m5112H) * this.teamColorRatio)), 0, 255));
                    if (Core.m1012as()) {
                        m2365b.f4746C = new LightingColorFilter(m2365b.f4742y, 0);
                    }
                }
            }
            if (this.fadeInTime != 0.0f) {
                m2365b.f4737t = true;
                m2365b.f4738u = this.fadeInTime;
            }
            m2365b.f4789at = this.shadow;
            m2365b.f4736s = this.fadeOut;
            m2365b.f4765V = this.delayedStartTimer;
            m2365b.f4765V += m4232a(-this.delayedStartTimerRandom, this.delayedStartTimerRandom);
            m2365b.f4739v = this.atmospheric;
            m2365b.f4740w = this.physics;
            m2365b.f4741x = this.physicsGravity;
            m2365b.f4735r = this.priority;
            m2365b.f4760Q = this.xSpeedAbsolute + m4233a(this.xSpeedAbsoluteRandom);
            m2365b.f4761R = this.ySpeedAbsolute + m4233a(this.ySpeedAbsoluteRandom);
            if (this.xSpeedRelative != 0.0f || this.ySpeedRelative != 0.0f || this.xSpeedRelativeRandom != 0.0f || this.ySpeedRelativeRandom != 0.0f) {
                float m2092i2 = C0758f.m2092i(m4233a);
                float m2097h2 = C0758f.m2097h(m4233a);
                float m4233a6 = this.xSpeedRelative + m4233a(this.xSpeedRelativeRandom);
                float m4233a7 = this.ySpeedRelative + m4233a(this.ySpeedRelativeRandom);
                m2365b.f4760Q += (m2092i2 * m4233a7) - (m2097h2 * m4233a6);
                m2365b.f4761R += (m2097h2 * m4233a7) + (m2092i2 * m4233a6);
            }
            m2365b.f4762S = this.hSpeed + m4233a(this.hSpeedRandom);
            m2365b.f4770aa = this.dirSpeed + m4233a(this.dirSpeedRandom);
            if (this.animateFrameStart != this.animateFrameEnd) {
                m2365b.f4775af = true;
            }
            m2365b.f4776ag = this.animateFrameStart;
            if (this.animateFrameStartRandomAdd != 0) {
                m2365b.f4776ag += C0758f.m2203a(0, this.animateFrameStartRandomAdd);
            }
            m2365b.f4777ah = this.animateFrameEnd;
            m2365b.f4781al = this.animateFrameStart;
            m2365b.f4778ai = this.animateFramePingPong;
            m2365b.f4779aj = this.animateFrameLooping;
            m2365b.f4780ak = this.animateFrameSpeed;
            m2365b.f4780ak += m4233a(this.animateFrameSpeedRandom);
            if (abstractC1120w != null && this.attachedToUnit) {
                C0743c.m2379a(m2365b, abstractC1120w);
            }
            if (this.alsoPlaySound != null) {
                this.alsoPlaySound.m4161a(f, f2, 1.0f);
            }
            if (i < 5 && this.alsoEmitEffects != null) {
                this.alsoEmitEffects.m3636a(f, f2, f3, m4233a, abstractC1120w, i + 1, (short) 0);
            }
            return m2365b;
        }
    }

    /* renamed from: a */
    public final float m4233a(float f) {
        if (f == 0.0f) {
            return 0.0f;
        }
        return C0758f.m2136c(-f, f);
    }

    /* renamed from: a */
    public final float m4232a(float f, float f2) {
        if (f == f2) {
            return f;
        }
        return C0758f.m2136c(f, f2);
    }

    /* renamed from: a */
    public void m4230a(C0453l c0453l, C1072ab c1072ab, String str) {
        Core m1087A = Core.m1087A();
        this.createWhenOffscreen = c1072ab.m675a(str, "createWhenOffscreen", (Boolean) false).booleanValue();
        this.createWhenZoomedOut = c1072ab.m675a(str, "createWhenZoomedOut", (Boolean) true).booleanValue();
        this.createWhenOverLiquid = c1072ab.m675a(str, "createWhenOverLiquid", (Boolean) true).booleanValue();
        this.createWhenOverLand = c1072ab.m675a(str, "createWhenOverLand", (Boolean) true).booleanValue();
        if (!this.createWhenOverLiquid && !this.createWhenOverLand) {
            throw new RuntimeException(str + " effect cannot have both createWhenOverLiquid and createWhenOverLand set to false, it would never be created");
        }
        this.spawnChance = c1072ab.m673a(str, "spawnChance", Float.valueOf(1.0f)).floatValue();
        this.life = c1072ab.m673a(str, "life", Float.valueOf(200.0f)).floatValue();
        this.lifeRandom = c1072ab.m673a(str, "lifeRandom", Float.valueOf(0.0f)).floatValue();
        this.showInFog = c1072ab.m675a(str, "showInFog", (Boolean) false).booleanValue();
        this.xOffsetRelative = c1072ab.m673a(str, "xOffsetRelative", Float.valueOf(0.0f)).floatValue();
        this.yOffsetRelative = c1072ab.m673a(str, "yOffsetRelative", Float.valueOf(0.0f)).floatValue();
        this.hOffset = c1072ab.m673a(str, "hOffset", Float.valueOf(0.0f)).floatValue();
        this.alwayStartDirAtZero = c1072ab.m668a(str, "alwaysStartDirAtZero", "alwayStartDirAtZero", (Boolean) false).booleanValue();
        this.pivotOffset = c1072ab.m673a(str, "pivotOffset", Float.valueOf(0.0f)).floatValue();
        this.pivotOffsetRandom = c1072ab.m673a(str, "pivotOffsetRandom", Float.valueOf(0.0f)).floatValue();
        this.dirOffset = c1072ab.m673a(str, "dirOffset", Float.valueOf(0.0f)).floatValue();
        this.xOffsetRelativeRandom = c1072ab.m673a(str, "xOffsetRelativeRandom", Float.valueOf(0.0f)).floatValue();
        this.yOffsetRelativeRandom = c1072ab.m673a(str, "yOffsetRelativeRandom", Float.valueOf(0.0f)).floatValue();
        this.hOffsetRandom = c1072ab.m673a(str, "hOffsetRandom", Float.valueOf(0.0f)).floatValue();
        this.dirOffsetRandom = c1072ab.m673a(str, "dirOffsetRandom", Float.valueOf(0.0f)).floatValue();
        this.xOffsetAbsolute = c1072ab.m673a(str, "xOffsetAbsolute", Float.valueOf(0.0f)).floatValue();
        this.yOffsetAbsolute = c1072ab.m673a(str, "yOffsetAbsolute", Float.valueOf(0.0f)).floatValue();
        this.xOffsetAbsoluteRandom = c1072ab.m673a(str, "xOffsetAbsoluteRandom", Float.valueOf(0.0f)).floatValue();
        this.yOffsetAbsoluteRandom = c1072ab.m673a(str, "yOffsetAbsoluteRandom", Float.valueOf(0.0f)).floatValue();
        this.xSpeedRelative = c1072ab.m673a(str, "xSpeedRelative", Float.valueOf(0.0f)).floatValue();
        this.ySpeedRelative = c1072ab.m673a(str, "ySpeedRelative", Float.valueOf(0.0f)).floatValue();
        this.hSpeed = c1072ab.m673a(str, "hSpeed", Float.valueOf(0.0f)).floatValue();
        this.dirSpeed = c1072ab.m673a(str, "dirSpeed", Float.valueOf(0.0f)).floatValue();
        this.xSpeedRelativeRandom = c1072ab.m673a(str, "xSpeedRelativeRandom", Float.valueOf(0.0f)).floatValue();
        this.ySpeedRelativeRandom = c1072ab.m673a(str, "ySpeedRelativeRandom", Float.valueOf(0.0f)).floatValue();
        this.hSpeedRandom = c1072ab.m673a(str, "hSpeedRandom", Float.valueOf(0.0f)).floatValue();
        this.dirSpeedRandom = c1072ab.m673a(str, "dirSpeedRandom", Float.valueOf(0.0f)).floatValue();
        this.xSpeedAbsolute = c1072ab.m673a(str, "xSpeedAbsolute", Float.valueOf(0.0f)).floatValue();
        this.ySpeedAbsolute = c1072ab.m673a(str, "ySpeedAbsolute", Float.valueOf(0.0f)).floatValue();
        this.xSpeedAbsoluteRandom = c1072ab.m673a(str, "xSpeedAbsoluteRandom", Float.valueOf(0.0f)).floatValue();
        this.ySpeedAbsoluteRandom = c1072ab.m673a(str, "ySpeedAbsoluteRandom", Float.valueOf(0.0f)).floatValue();
        this.scaleTo = c1072ab.m673a(str, "scaleTo", Float.valueOf(this.scaleTo)).floatValue();
        this.scaleFrom = c1072ab.m673a(str, "scaleFrom", Float.valueOf(this.scaleFrom)).floatValue();
        this.alpha = c1072ab.m673a(str, "alpha", Float.valueOf(this.alpha)).floatValue();
        this.color = c1072ab.m671a(str, "color", Integer.valueOf(this.color)).intValue();
        if (Core.m1012as() && this.color != 0 && this.color != -1) {
            this.cachedLightingColorFilter = new LightingColorFilter(this.color, 0);
        }
        this.teamColorRatio = c1072ab.m673a(str, "teamColorRatio", Float.valueOf(this.teamColorRatio)).floatValue();
        if (this.teamColorRatio < 0.0f || this.teamColorRatio > 1.0f) {
            throw new RuntimeException(str + " teamColorRatio should be between 0-1 got:" + this.teamColorRatio);
        }
        this.shadow = c1072ab.m675a(str, "shadow", (Boolean) false).booleanValue();
        this.drawLayer = (short) 2;
        if (c1072ab.m675a(str, "drawUnderUnits", (Boolean) false).booleanValue()) {
            this.drawLayer = (short) 1;
        }
        String m656b = c1072ab.m656b(str, "drawType", (String) null);
        if (m656b != null && !m656b.equals("normal")) {
            if (m656b.equals("displacement")) {
                this.drawLayer = (short) 101;
            } else {
                throw new C0412bm("Unknown drawType: " + m656b);
            }
        }
        this.fadeInTime = c1072ab.m673a(str, "fadeInTime", Float.valueOf(0.0f)).floatValue();
        this.fadeOut = c1072ab.m675a(str, "fadeOut", (Boolean) true).booleanValue();
        this.delayedStartTimer = c1072ab.m658b(str, "delayedStartTimer", Float.valueOf(0.0f)).floatValue();
        this.delayedStartTimerRandom = c1072ab.m673a(str, "delayedStartTimerRandom", Float.valueOf(0.0f)).floatValue();
        this.frameIndex = c1072ab.m657b(str, "frameIndex", (Integer) 0).intValue();
        this.frameIndexRandom = c1072ab.m657b(str, "frameIndexRandom", (Integer) 0).intValue();
        String m656b2 = c1072ab.m656b(str, "stripIndex", "0");
        this.stripIndex = m1087A.f6116bR.m2375a(m656b2);
        if (this.stripIndex == -1) {
            throw new RuntimeException("Failed to find stripIndex with name:" + m656b2);
        }
        this.attachedToUnit = c1072ab.m675a(str, "attachedToUnit", (Boolean) true).booleanValue();
        this.liveAfterAttachedDies = c1072ab.m675a(str, "liveAfterAttachedDies", (Boolean) true).booleanValue();
        this.atmospheric = c1072ab.m675a(str, "atmospheric", (Boolean) false).booleanValue();
        this.physics = c1072ab.m675a(str, "physics", (Boolean) false).booleanValue();
        this.physicsGravity = c1072ab.m673a(str, "physicsGravity", Float.valueOf(1.0f)).floatValue();
        String m656b3 = c1072ab.m656b(str, "priority", (String) null);
        if (m656b3 != null) {
            try {
                this.priority = EnumC0748h.valueOf(m656b3);
            } catch (IllegalArgumentException e) {
                throw new RuntimeException("Unknown priority:" + m656b3);
            }
        }
        int intValue = c1072ab.m657b(str, "total_frames", (Integer) 1).intValue();
        if (intValue < 1) {
            throw new C0412bm("TOTAL_FRAMES cannot be: " + intValue + " (must be 1 or more)");
        }
        C0934e m3718a = c0453l.m3718a(c1072ab, str, "image");
        if (m3718a != null) {
            this.imageStrip = new C0747g();
            this.imageStrip.f4827i = m3718a;
            this.imageStrip.f4820b = this.imageStrip.f4827i.mo386m() / intValue;
            this.imageStrip.f4821c = this.imageStrip.f4827i.mo387l();
            this.imageStrip.f4820b = c1072ab.m657b(str, "frame_width", Integer.valueOf(this.imageStrip.f4820b)).intValue();
            this.imageStrip.f4821c = c1072ab.m657b(str, "frame_height", Integer.valueOf(this.imageStrip.f4821c)).intValue();
            if (intValue == 1 && this.imageStrip.f4820b >= this.imageStrip.f4827i.mo386m()) {
                this.imageStrip.f4829k = true;
            } else if (this.imageStrip.f4821c < this.imageStrip.f4827i.mo387l()) {
                this.imageStrip.f4826h = this.imageStrip.f4827i.mo386m() / this.imageStrip.f4820b;
                if (this.imageStrip.f4826h < 1) {
                    this.imageStrip.f4826h = 1;
                }
            }
            this.imageStrip.f4822d = 0;
            this.imageStrip.f4823e = 0;
            this.imageStrip.f4824f = this.imageStrip.f4820b;
            this.imageStrip.f4825g = this.imageStrip.f4821c;
            String m656b4 = c1072ab.m656b(str, "imageShadow", (String) null);
            if (m656b4 != null) {
                this.imageStrip.f4828j = C0348af.m4291a(c0453l.f2916E, m656b4, c0453l.f2932aa, c0453l, str, "imageShadow");
                this.shadow = true;
            }
            if (this.shadow && this.imageStrip.f4828j == null) {
                throw new C0412bm("imageShadow is required if image and shadow:true is used");
            }
        }
        this.animateFrameStart = c1072ab.m657b(str, "animateFrameStart", (Integer) 0).intValue();
        this.animateFrameStartRandomAdd = c1072ab.m657b(str, "animateFrameStartRandomAdd", (Integer) 0).intValue();
        this.animateFrameEnd = c1072ab.m657b(str, "animateFrameEnd", (Integer) 0).intValue();
        this.animateFramePingPong = c1072ab.m675a(str, "animateFramePingPong", (Boolean) false).booleanValue();
        this.animateFrameLooping = c1072ab.m675a(str, "animateFrameLooping", (Boolean) false).booleanValue();
        this.animateFrameSpeed = c1072ab.m658b(str, "animateFrameSpeed", Float.valueOf(0.5f)).floatValue();
        this.animateFrameSpeedRandom = c1072ab.m658b(str, "animateFrameSpeedRandom", Float.valueOf(0.0f)).floatValue();
        if (m3718a != null && ((this.imageStrip.f4820b >= this.imageStrip.f4827i.mo386m() || intValue != 1) && this.animateFrameEnd > intValue)) {
            throw new C0412bm("animateFrameEnd:" + this.animateFrameEnd + " cannot be larger than TOTAL_FRAMES: " + intValue + " (when using custom image)");
        }
        this.alsoEmitEffects = c0453l.m3697c(c1072ab.m656b(str, "alsoEmitEffects", (String) null));
        this.alsoEmitEffectsOnDeath = c0453l.m3697c(c1072ab.m656b(str, "alsoEmitEffectsOnDeath", (String) null));
        this.trailEffect = c0453l.m3697c(c1072ab.m656b(str, "trailEffect", (String) null));
        this.trailEffectRate = c1072ab.m658b(str, "trailEffectRate", Float.valueOf(6.0f)).floatValue();
        this.ifSpawnFailsEmitEffects = c0453l.m3697c(c1072ab.m656b(str, "ifSpawnFailsEmitEffects", (String) null));
        this.alsoPlaySound = C0409bj.m4158a(c0453l, c1072ab.m656b(str, "alsoPlaySound", (String) null), (C0409bj) null);
    }
}
