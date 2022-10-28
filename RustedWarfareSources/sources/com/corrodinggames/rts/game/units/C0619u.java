package com.corrodinggames.rts.game.units;

import com.corrodinggames.rts.gameFramework.Core;
import com.corrodinggames.rts.gameFramework.p041i.Reader;
import com.corrodinggames.rts.gameFramework.p041i.StreamWriter;

/* renamed from: com.corrodinggames.rts.game.units.u */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/u.class */
public class C0619u extends AbstractC0622x {

    /* renamed from: a */
    public int f3883a;

    /* renamed from: b */
    public float f3884b;

    /* renamed from: a */
    public void mo2441a(StreamWriter streamWriter) {
        streamWriter.m1401c(0);
        streamWriter.WriteInteger(this.f3883a);
        streamWriter.mo1335a(this.f3884b);
        super.mo2441a(streamWriter);
    }

    /* renamed from: a */
    public void m3069a(Reader reader) {
        reader.m1304d();
        this.f3883a = reader.ReadInt();
        this.f3884b = reader.m1300g();
        super.m2961a(reader);
    }

    /* renamed from: b */
    public EnumC0249ar mo1758r() {
        return EnumC0249ar.f1778R;
    }

    /* renamed from: c */
    public static void m3067c() {
        Core.m1087A();
    }

    public C0619u(boolean z) {
        super(z);
        this.f3883a = 14;
        this.f3884b = 60.0f;
    }

    /* renamed from: a */
    public void mo1762a(float f) {
        super.mo1762a(f);
        this.f3884b -= f;
        if (this.f3884b < 0.0f) {
            m4700ch();
        }
    }

    /* renamed from: s */
    public int m3066s() {
        return this.f3883a;
    }

    /* renamed from: t */
    public boolean mo1757t() {
        return true;
    }

    /* renamed from: u */
    public boolean mo1756u() {
        return true;
    }
}
