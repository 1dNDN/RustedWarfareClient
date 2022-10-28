package com.corrodinggames.rts.gameFramework;

import com.corrodinggames.rts.game.units.AbstractC0244am;
import com.corrodinggames.rts.game.units.AbstractC0623y;
import com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope;
import com.corrodinggames.rts.gameFramework.p041i.C0831ad;
import com.corrodinggames.rts.gameFramework.p041i.Reader;
import com.corrodinggames.rts.gameFramework.p041i.StreamWriter;
import com.corrodinggames.rts.gameFramework.utility.C1104o;
import com.corrodinggames.rts.gameFramework.utility.C1109s;

/* renamed from: com.corrodinggames.rts.gameFramework.w */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/w.class */
public abstract class AbstractC1120w extends AbstractC0726bk {

    /* renamed from: ee */
    public long f6951ee;

    /* renamed from: eg */
    public boolean f6953eg;

    /* renamed from: eh */
    public boolean f6954eh;

    /* renamed from: ei */
    public boolean f6955ei;

    /* renamed from: ej */
    public int f6956ej;

    /* renamed from: ek */
    public int f6957ek;

    /* renamed from: el */
    public float f6958el;

    /* renamed from: em */
    public float f6959em;

    /* renamed from: en */
    public float f6960en;

    /* renamed from: ef */
    public static C1121x f6952ef = new C1121x();

    /* renamed from: a */
    private static final C1104o f6961a = new C1104o();

    /* renamed from: eo */
    public static final C1109s f6962eo = new C1109s("fastGameObjectList");

    /* renamed from: a */
    public abstract void mo1762a(float f);

    /* renamed from: a */
    public abstract void mo3053a(float f, boolean z);

    /* renamed from: d */
    public abstract void m436d(float f);

    /* renamed from: e */
    public abstract void mo3151e(float f);

    /* renamed from: c */
    public abstract boolean mo3049c(float f);

    /* renamed from: f */
    public abstract boolean m432f(float f);

    /* renamed from: S */
    public void m447S(int i) {
        this.f6956ej = i;
    }

    /* renamed from: a */
    public void mo2441a(StreamWriter streamWriter) {
        streamWriter.mo1329a(this.f6953eg);
        streamWriter.mo1329a(this.f6954eh);
        streamWriter.WriteInteger(this.f6956ej);
    }

    /* renamed from: a */
    public void m440a(Reader reader) {
        this.f6953eg = reader.ReadBool();
        this.f6954eh = reader.ReadBool();
        this.f6956ej = reader.ReadInt();
    }

    public AbstractC1120w() {
        this(false);
    }

    public AbstractC1120w(boolean z) {
        this.f6953eg = false;
        this.f6954eh = false;
        this.f6956ej = 2;
        this.f6957ek = 0;
        this.f6960en = 0.0f;
        if (!z) {
            Core m1087A = Core.m1087A();
            if (this.f6951ee != 0) {
                throw new RuntimeException("ID for GameObject is already set at:" + this.f6951ee);
            }
            this.f6951ee = m1087A.f6122bX.m1458y();
            if (this.f6951ee == 0) {
                throw new RuntimeException("Adding object with id:0 class:" + getClass().getSimpleName());
            }
            f6961a.m520a(this);
            f6962eo.mo509a(this);
            return;
        }
        this.f6951ee = 0L;
    }

    /* renamed from: p */
    public void m431p(float f) {
    }

    /* renamed from: a */
    public boolean m439a(Core core) {
        return true;
    }

    /* renamed from: a */
    public void mo2689a() {
        if (this.f6951ee != 0) {
            f6961a.m517b(this);
            f6962eo.remove(this);
        }
        this.f6953eg = true;
    }

    /* renamed from: a */
    public static AbstractC1120w m443a(long j, Class cls, boolean z) {
        if (j == -1) {
            return null;
        }
        AbstractC1120w[] m514a = f6962eo.m514a();
        int size = f6962eo.size();
        for (int i = 0; i < size; i++) {
            AbstractC1120w abstractC1120w = m514a[i];
            if (abstractC1120w.f6951ee == j) {
                if (cls.isInstance(abstractC1120w)) {
                    return abstractC1120w;
                }
                String name = abstractC1120w.getClass().getName();
                String name2 = cls.getName();
                C0831ad.m1493g("object id:" + j + " was found, but with type " + name.replace("com.corrodinggames.rts.", VariableScope.nullOrMissingString) + " instead of " + name2.replace("com.corrodinggames.rts.", VariableScope.nullOrMissingString));
            }
        }
        if (!z) {
            C0831ad.m1493g("getFromId:" + j + " was not found");
            return null;
        }
        return null;
    }

    /* renamed from: a */
    public static AbstractC0244am m442a(long j, boolean z) {
        return (AbstractC0244am) m443a(j, AbstractC0244am.class, z);
    }

    /* renamed from: b */
    public static AbstractC0623y m438b(long j, boolean z) {
        return (AbstractC0623y) m443a(j, AbstractC0623y.class, z);
    }

    /* renamed from: dI */
    public static C1104o m435dI() {
        f6961a.m524a();
        return f6961a;
    }

    /* renamed from: dJ */
    public static void m434dJ() {
        f6961a.m524a();
        AbstractC0244am.m4760bG();
    }
}
