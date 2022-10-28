package com.corrodinggames.rts.game;

import android.graphics.Paint;
import android.graphics.Rect;
import com.corrodinggames.rts.gameFramework.EnumC1065u;
import com.corrodinggames.rts.gameFramework.LoggerMaybe;
import com.corrodinggames.rts.gameFramework.p044l.C0928ae;
import com.corrodinggames.rts.gameFramework.p044l.C0930ag;
import com.corrodinggames.rts.gameFramework.p044l.C0934e;
import com.corrodinggames.rts.gameFramework.p044l.InterfaceC1027y;
import java.io.IOException;

/* renamed from: com.corrodinggames.rts.game.j */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/j.class */
public class C0193j {

    /* renamed from: a */
    public C0934e f1279a;

    /* renamed from: b */
    InterfaceC1027y f1280b;

    /* renamed from: c */
    C0930ag f1281c;

    /* renamed from: d */
    C0928ae f1282d;

    /* renamed from: e */
    Paint f1283e;

    /* renamed from: f */
    Rect f1284f;

    /* renamed from: g */
    boolean f1285g;

    public C0193j() {
        this.f1283e = new Paint();
        this.f1284f = new Rect(-101, 0, -1, 100);
        this.f1281c = new C0930ag();
    }

    public C0193j(String str) {
        this();
        try {
            this.f1282d = new C0928ae(str);
            this.f1281c.m901a(this.f1282d);
            if (this.f1282d.f6360o != 0) {
                this.f1285g = true;
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: a */
    public boolean m4754a() {
        if ((this.f1282d != null && this.f1282d.f6360o != 0) || this.f1285g) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public void m4753a(InterfaceC1027y interfaceC1027y) {
        m4752a(interfaceC1027y, interfaceC1027y.mo139m(), interfaceC1027y.mo138n(), 10);
    }

    /* renamed from: a */
    public void m4752a(InterfaceC1027y interfaceC1027y, int i, int i2, int i3) {
        if (this.f1285g) {
            return;
        }
        if (this.f1279a != null && (i > this.f1279a.mo390m() || i2 > this.f1279a.mo391l())) {
            this.f1279a.mo55o();
            this.f1279a = null;
            this.f1280b = null;
        }
        if (this.f1279a == null) {
            try {
                this.f1279a = interfaceC1027y.mo222a(i + i3, i2 + i3, true);
                this.f1280b = interfaceC1027y.mo5759a(this.f1279a);
            } catch (OutOfMemoryError e) {
                this.f1285g = true;
                LoggerMaybe.m1040a(EnumC1065u.f6746b, e);
                return;
            }
        }
        this.f1280b.mo224a(i, i2);
    }

    /* renamed from: b */
    public void m4751b() {
        LoggerMaybe m1079A = LoggerMaybe.m1079A();
        m1079A.f6113bO.mo167b(this.f1284f, this.f1283e);
        m1079A.f6113bO.mo165b(this.f1279a, 0.0f, 0.0f, this.f1281c);
    }
}
