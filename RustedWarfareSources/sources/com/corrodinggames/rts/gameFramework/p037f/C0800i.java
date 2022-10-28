package com.corrodinggames.rts.gameFramework.p037f;

import android.graphics.Paint;
import android.graphics.Typeface;
import com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope;
import com.corrodinggames.rts.gameFramework.Core;
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
    Core f5270b;

    /* renamed from: c */
    Paint f5271c;

    /* renamed from: d */
    boolean f5272d;

    /* renamed from: e */
    ArrayList f5273e = new ArrayList();

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0800i(Core core, C0797f c0797f) {
        this.f5269a = c0797f;
        this.f5270b = core;
        m1796a();
    }

    /* renamed from: a */
    public void m1796a() {
        this.f5271c = new Paint();
        this.f5271c.m5933a(255, 255, 255, 255);
        this.f5271c.mo5914a(true);
        this.f5271c.m5901c(true);
        this.f5271c.mo5924a(Typeface.m5840a(Typeface.f246c, 1));
        this.f5270b.m1050a(this.f5271c, 16.0f);
    }

    /* renamed from: b */
    public synchronized void m1793b() {
        this.f5272d = false;
        this.f5273e.clear();
    }

    /* renamed from: c */
    public synchronized void m1792c() {
        Iterator it = this.f5273e.iterator();
        while (it.hasNext()) {
            C0801j c0801j = (C0801j) it.next();
            if (this.f5273e.size() > 15) {
                it.remove();
            }
        }
    }

    /* renamed from: a */
    public synchronized C0801j m1794a(String str, String str2) {
        Core m1087A = Core.m1087A();
        C0801j c0801j = new C0801j();
        c0801j.f5274a = str;
        c0801j.f5275b = str2;
        c0801j.f5276c = System.currentTimeMillis();
        c0801j.f5277d = new SimpleDateFormat("HH:mm:ss").format(new Date());
        if (str != null && !str.equals(VariableScope.nullOrMissingString) && !m1087A.settingEngine.showPlayerChatInGame) {
            if (!this.f5272d) {
                this.f5272d = true;
                m1794a(null, "[WARNING: A player send a chat message, but you have chat muted in your settings]");
            }
            return c0801j;
        }
        m1792c();
        this.f5273e.add(c0801j);
        return c0801j;
    }

    /* renamed from: a */
    public synchronized void m1795a(float f) {
        String str;
        Core m1087A = Core.m1087A();
        m1792c();
        int i = 95;
        int i2 = (int) (20.0f * m1087A.f6132ci);
        boolean m1061a = m1087A.m1061a();
        for (int size = this.f5273e.size() - 1; size >= 0; size--) {
            C0801j c0801j = (C0801j) this.f5273e.get(size);
            if (c0801j.m1790b()) {
                if (c0801j.f5274a == null || c0801j.f5274a.equals(VariableScope.nullOrMissingString)) {
                    str = c0801j.f5275b;
                } else {
                    str = c0801j.f5274a + ": " + c0801j.f5275b;
                }
                if (m1061a) {
                    str = c0801j.f5277d + ": " + str;
                }
                if (c0801j.f5278e > 0) {
                    int m1791a = c0801j.m1791a() / c0801j.f5278e;
                    if (m1791a < 0) {
                        m1791a = 0;
                    }
                    if (m1791a < str.length()) {
                        str = str.substring(0, m1791a);
                    }
                }
                this.f5271c.m5908b(c0801j.f5279f);
                m1087A.f6113bO.mo181a(str, 20, i, this.f5271c);
                i += i2;
            }
        }
    }
}
