package com.corrodinggames.rts.gameFramework.p041i;

import android.text.Html;
import android.text.Spanned;
import com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope;
import com.corrodinggames.rts.gameFramework.C0758f;
import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;

/* renamed from: com.corrodinggames.rts.gameFramework.i.a */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/i/a.class */
public class C0827a {

    /* renamed from: a */
    private ConcurrentLinkedQueue f5470a = new ConcurrentLinkedQueue();

    /* renamed from: a */
    public String m1617a(String str) {
        return C0758f.m2041i(str);
    }

    /* renamed from: a */
    public void m1619a(int i, String str, String str2, Steam steam) {
        this.f5470a.add(new C0866b(this, i, str, str2.trim(), steam));
        if (this.f5470a.size() > 45) {
            this.f5470a.poll();
        }
    }

    /* renamed from: a */
    public int m1618a(Steam steam, int i) {
        int i2 = 0;
        Iterator it = this.f5470a.iterator();
        while (it.hasNext()) {
            C0866b c0866b = (C0866b) it.next();
            if (c0866b.f5762d == steam && C0758f.m2149a(c0866b.f5763e, System.nanoTime()) < i && !c0866b.f5761c.startsWith("-i ") && !c0866b.f5761c.startsWith("-qc ")) {
                i2++;
                if (c0866b.f5761c != null) {
                    if (C0758f.m2129a(c0866b.f5761c, '\n') >= 3) {
                        i2 += 2;
                    }
                    if (C0758f.m2129a(c0866b.f5761c, '\n') >= 6) {
                        i2 += 2;
                    }
                    if (C0758f.m2129a(c0866b.f5761c, '\n') >= 9) {
                        i2 += 2;
                    }
                }
            }
        }
        return i2;
    }

    /* renamed from: a */
    public String m1620a() {
        Iterator it;
        String str = VariableScope.nullOrMissingString;
        while (this.f5470a.iterator().hasNext()) {
            str = str + ((C0866b) it.next()).m1348a() + "\n";
        }
        return str;
    }

    /* renamed from: b */
    public ConcurrentLinkedQueue m1615b() {
        return this.f5470a;
    }

    /* renamed from: a */
    public String m1616a(boolean z) {
        Iterator it;
        Iterator it2;
        String str = VariableScope.nullOrMissingString;
        if (!z) {
            while (this.f5470a.iterator().hasNext()) {
                str = str + ((C0866b) it2.next()).m1347b() + "<br/>\n";
            }
        } else {
            while (this.f5470a.iterator().hasNext()) {
                str = ((C0866b) it.next()).m1347b() + "<br/>\n" + str;
            }
        }
        return "<pre>" + str + "</pre>";
    }

    /* renamed from: b */
    public Spanned m1614b(boolean z) {
        return Html.fromHtml(m1616a(z));
    }

    /* renamed from: c */
    public void m1613c() {
        this.f5470a.clear();
    }
}
