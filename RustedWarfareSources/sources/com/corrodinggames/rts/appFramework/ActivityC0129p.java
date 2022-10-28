package com.corrodinggames.rts.appFramework;

import android.p003os.Handler;
import com.corrodinggames.rts.gameFramework.Core;
import com.corrodinggames.rts.gameFramework.p041i.C0872g;
import com.corrodinggames.rts.gameFramework.p041i.C0879n;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

/* renamed from: com.corrodinggames.rts.appFramework.p */
/* loaded from: game-lib.jar:com/corrodinggames/rts/appFramework/p.class */
public class ActivityC0129p extends ActivityC0089b {

    /* renamed from: c */
    static ActivityC0129p f539c;

    /* renamed from: d */
    final Handler f540d;

    /* renamed from: e */
    private Runnable f541e;

    /* renamed from: l */
    public static void m5595l() {
        if (f539c != null) {
            f539c.f540d.m5821a(f539c.f541e);
        }
    }

    /* renamed from: m */
    public static ArrayList m5594m() {
        ArrayList arrayList;
        synchronized (C0879n.f5878f) {
            Core m1087A = Core.m1087A();
            arrayList = new ArrayList();
            Iterator it = m1087A.f6122bX.f5614by.iterator();
            while (it.hasNext()) {
                arrayList.add((C0872g) it.next());
            }
            Collections.sort(arrayList, new C01301());
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.corrodinggames.rts.appFramework.p$1 */
    /* loaded from: game-lib.jar:com/corrodinggames/rts/appFramework/p$1.class */
    public final class C01301 implements Comparator {
        C01301() {
        }

        /* renamed from: a */
        public int m5593a(C0872g c0872g) {
            if (c0872g.m1325d()) {
                return 0;
            }
            if (c0872g.f5846x && c0872g.f5841s.equals("chat")) {
                return 1;
            }
            if (c0872g.f5823a) {
                return 2;
            }
            if (c0872g.f5841s.equals("battleroom")) {
                if (c0872g.f5844v != -1 && c0872g.f5844v < c0872g.f5845w) {
                    if (c0872g.f5846x) {
                        if (c0872g.f5844v != 0) {
                            return 3;
                        }
                        return 4;
                    } else if (c0872g.f5830h && !c0872g.f5846x) {
                        return 7;
                    } else {
                        return 9;
                    }
                } else if (c0872g.f5846x) {
                    return 6;
                } else {
                    if (c0872g.f5830h && !c0872g.f5846x) {
                        return 8;
                    }
                    return 9;
                }
            }
            return 99;
        }

        /* renamed from: a */
        public int mo5141a(C0872g c0872g, C0872g c0872g2) {
            Integer valueOf = Integer.valueOf(m5593a(c0872g));
            Integer valueOf2 = Integer.valueOf(m5593a(c0872g2));
            if (!c0872g.m1322g()) {
                valueOf = Integer.valueOf(valueOf.intValue() + 20);
            }
            if (!c0872g2.m1322g()) {
                valueOf2 = Integer.valueOf(valueOf2.intValue() + 20);
            }
            int compareTo = valueOf.compareTo(valueOf2);
            if (compareTo != 0) {
                return compareTo;
            }
            return c0872g.f5839q.compareTo(c0872g2.f5839q);
        }
    }
}
