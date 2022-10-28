package com.corrodinggames.rts.appFramework;

import android.p003os.Handler;
import com.corrodinggames.rts.gameFramework.LoggerMaybe;
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
    public static void m5187l() {
        if (f539c != null) {
            f539c.f540d.m5414a(f539c.f541e);
        }
    }

    /* renamed from: m */
    public static ArrayList m5186m() {
        ArrayList arrayList;
        synchronized (C0879n.f5878f) {
            LoggerMaybe m1079A = LoggerMaybe.m1079A();
            arrayList = new ArrayList();
            Iterator it = m1079A.f6122bX.f5614by.iterator();
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
        public int m5185a(C0872g c0872g) {
            if (c0872g.m1312d()) {
                return 0;
            }
            if (c0872g.f5843x && c0872g.f5840s.equals("chat")) {
                return 1;
            }
            if (c0872g.f5823a) {
                return 2;
            }
            if (c0872g.f5840s.equals("battleroom")) {
                if (c0872g.f5848v != -1 && c0872g.f5848v < c0872g.f5849w) {
                    if (c0872g.f5843x) {
                        if (c0872g.f5848v != 0) {
                            return 3;
                        }
                        return 4;
                    } else if (c0872g.f5830h && !c0872g.f5843x) {
                        return 7;
                    } else {
                        return 9;
                    }
                } else if (c0872g.f5843x) {
                    return 6;
                } else {
                    if (c0872g.f5830h && !c0872g.f5843x) {
                        return 8;
                    }
                    return 9;
                }
            }
            return 99;
        }

        /* renamed from: a */
        public int mo5184a(C0872g c0872g, C0872g c0872g2) {
            Integer valueOf = Integer.valueOf(m5185a(c0872g));
            Integer valueOf2 = Integer.valueOf(m5185a(c0872g2));
            if (!c0872g.m1309g()) {
                valueOf = Integer.valueOf(valueOf.intValue() + 20);
            }
            if (!c0872g2.m1309g()) {
                valueOf2 = Integer.valueOf(valueOf2.intValue() + 20);
            }
            int compareTo = valueOf.compareTo(valueOf2);
            if (compareTo != 0) {
                return compareTo;
            }
            return c0872g.f5838q.compareTo(c0872g2.f5838q);
        }
    }
}
