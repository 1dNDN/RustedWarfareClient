package com.corrodinggames.rts.game.units;

import com.corrodinggames.rts.gameFramework.LoggerMaybe;
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
    public void mo2292a(StreamWriter streamWriter) {
        streamWriter.mo1355c(0);
        streamWriter.WriteInteger(this.f3883a);
        streamWriter.mo1320a(this.f3884b);
        super.mo2292a(streamWriter);
    }

    /* renamed from: a */
    public void mo2291a(Reader reader) {
        reader.m1289d();
        this.f3883a = reader.ReadInt();
        this.f3884b = reader.m1285g();
        super.mo2291a(reader);
    }

    /* renamed from: b */
    public EnumC0249ar mo5649r() {
        return EnumC0249ar.f1778R;
    }

    /* renamed from: c */
    public static void m3008c() {
        LoggerMaybe.m1072A();
    }

    public C0619u(boolean z) {
        super(z);
        this.f3883a = 14;
        this.f3884b = 60.0f;
    }

    /* renamed from: a */
    public void mo1718a(float f) {
        super.mo1718a(f);
        this.f3884b -= f;
        if (this.f3884b < 0.0f) {
            m4351ch();
        }
    }

    /* renamed from: s */
    public int mo3169s() {
        return this.f3883a;
    }

    /* renamed from: t */
    public boolean mo1713t() {
        return true;
    }

    /* renamed from: u */
    public boolean mo1712u() {
        return true;
    }
}
