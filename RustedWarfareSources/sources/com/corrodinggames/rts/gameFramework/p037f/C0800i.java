package com.corrodinggames.rts.gameFramework.p037f;

import android.graphics.Paint;
import android.graphics.Typeface;
import com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope;
import com.corrodinggames.rts.gameFramework.LoggerMaybe;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;

/* renamed from: com.corrodinggames.rts.gameFramework.f.i */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/f/i.class */
public class C0800i {

    /* renamed from: a */
    C0797f f5269a;

    /* renamed from: b */
    LoggerMaybe f5270b;

    /* renamed from: c */
    Paint f5271c;

    /* renamed from: d */
    boolean f5272d;

    /* renamed from: e */
    ArrayList f5273e = new ArrayList();

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0800i(LoggerMaybe loggerMaybe, C0797f c0797f) {
        this.f5269a = c0797f;
        this.f5270b = loggerMaybe;
        m1754a();
    }

    /* renamed from: a */
    public void m1754a() {
        this.f5271c = new Paint();
        this.f5271c.m5523a(255, 255, 255, 255);
        this.f5271c.mo900a(true);
        this.f5271c.m5494c(true);
        this.f5271c.mo902a(Typeface.m5433a(Typeface.f246c, 1));
        this.f5270b.m1042a(this.f5271c, 16.0f);
    }

    /* renamed from: b */
    public synchronized void m1751b() {
        this.f5272d = false;
        this.f5273e.clear();
    }

    /* renamed from: c */
    public synchronized void m1750c() {
        Iterator it = this.f5273e.iterator();
        while (it.hasNext()) {
            C0801j c0801j = (C0801j) it.next();
            if (this.f5273e.size() > 15) {
                it.remove();
            }
        }
    }

    /* renamed from: a */
    public synchronized C0801j m1752a(String str, String str2) {
        LoggerMaybe m1079A = LoggerMaybe.m1079A();
        C0801j c0801j = new C0801j();
        c0801j.f5274a = str;
        c0801j.f5275b = str2;
        c0801j.f5276c = System.currentTimeMillis();
        c0801j.f5277d = new SimpleDateFormat("HH:mm:ss").format(new Date());
        if (str != null && !str.equals(VariableScope.nullOrMissingString) && !m1079A.f6115bQ.showPlayerChatInGame) {
            if (!this.f5272d) {
                this.f5272d = true;
                m1752a(null, "[WARNING: A player send a chat message, but you have chat muted in your settings]");
            }
            return c0801j;
        }
        m1750c();
        this.f5273e.add(c0801j);
        return c0801j;
    }

    /* renamed from: a */
    public synchronized void m1753a(float f) {
        String str;
        LoggerMaybe m1079A = LoggerMaybe.m1079A();
        m1750c();
        int i = 95;
        int i2 = (int) (20.0f * m1079A.f6132ci);
        boolean m1053a = m1079A.m1053a();
        for (int size = this.f5273e.size() - 1; size >= 0; size--) {
            C0801j c0801j = (C0801j) this.f5273e.get(size);
            if (c0801j.m1748b()) {
                if (c0801j.f5274a == null || c0801j.f5274a.equals(VariableScope.nullOrMissingString)) {
                    str = c0801j.f5275b;
                } else {
                    str = c0801j.f5274a + ": " + c0801j.f5275b;
                }
                if (m1053a) {
                    str = c0801j.f5277d + ": " + str;
                }
                if (c0801j.f5278e > 0) {
                    int m1749a = c0801j.m1749a() / c0801j.f5278e;
                    if (m1749a < 0) {
                        m1749a = 0;
                    }
                    if (m1749a < str.length()) {
                        str = str.substring(0, m1749a);
                    }
                }
                this.f5271c.m5501b(c0801j.f5279f);
                m1079A.f6113bO.mo186a(str, 20, i, this.f5271c);
                i += i2;
            }
        }
    }
}
