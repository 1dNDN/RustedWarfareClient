package com.corrodinggames.rts.gameFramework.p030a;

import android.content.Context;
import com.corrodinggames.rts.C0067R;
import com.corrodinggames.rts.gameFramework.C0758f;
import com.corrodinggames.rts.gameFramework.utility.C1098j;

/* renamed from: com.corrodinggames.rts.gameFramework.a.f */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/a/f.class */
public class C0632f extends AbstractC0634h {
    @Override // com.corrodinggames.rts.gameFramework.p030a.AbstractC0634h
    /* renamed from: a */
    public void mo79a(Context context) {
    }

    @Override // com.corrodinggames.rts.gameFramework.p030a.AbstractC0634h
    /* renamed from: a */
    public AbstractC0635i mo80a(int i) {
        return new C0633g(C0758f.m2121a(C0067R.raw.class, i), this);
    }

    @Override // com.corrodinggames.rts.gameFramework.p030a.AbstractC0634h
    /* renamed from: a */
    public AbstractC0635i mo78a(String str, C1098j c1098j, boolean z) {
        return new C0633g(str, this);
    }

    /* renamed from: b */
    public static AbstractC0635i m2693b() {
        return new C0633g("Null (from out of memory)", null);
    }

    /* renamed from: a */
    public static AbstractC0635i m2694a(String str) {
        return new C0633g("Null sound - " + str, null);
    }
}
