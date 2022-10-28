package com.corrodinggames.rts.gameFramework;

import java.util.Comparator;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.corrodinggames.rts.gameFramework.x */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/x.class */
public class C1121x implements Comparator {
    @Override // java.util.Comparator
    /* renamed from: a */
    public int compare(AbstractC1120w abstractC1120w, AbstractC1120w abstractC1120w2) {
        if (abstractC1120w.f6956ej > abstractC1120w2.f6956ej) {
            return 1;
        }
        if (abstractC1120w.f6956ej < abstractC1120w2.f6956ej) {
            return -1;
        }
        if (abstractC1120w.f6957ek > abstractC1120w2.f6957ek) {
            return 1;
        }
        if (abstractC1120w.f6957ek < abstractC1120w2.f6957ek) {
            return -1;
        }
        if (abstractC1120w.f6959em > abstractC1120w2.f6959em) {
            return 1;
        }
        return abstractC1120w.f6959em < abstractC1120w2.f6959em ? -1 : 0;
    }
}
