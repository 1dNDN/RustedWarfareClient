package com.corrodinggames.rts.gameFramework.p045m;

import com.corrodinggames.rts.game.AbstractC0197n;
import com.corrodinggames.rts.game.p010a.C0136a;
import com.corrodinggames.rts.game.units.AbstractC0244am;
import com.corrodinggames.rts.game.units.InterfaceC0303as;
import com.corrodinggames.rts.game.units.custom.C0453l;
import com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope;
import com.corrodinggames.rts.gameFramework.C0758f;
import com.corrodinggames.rts.gameFramework.LoggerMaybe;
import com.corrodinggames.rts.gameFramework.utility.C1101m;
import com.corrodinggames.rts.gameFramework.utility.SlickToAndroidKeycodes;
import java.util.Iterator;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.corrodinggames.rts.gameFramework.m.i */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/m/i.class */
public class C1052i {

    /* renamed from: a */
    boolean f6715a;

    /* renamed from: b */
    C1101m f6716b = new C1101m();

    /* renamed from: c */
    final /* synthetic */ C1049f f6717c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1052i(C1049f c1049f) {
        this.f6717c = c1049f;
    }

    /* renamed from: a */
    public void m744a(InterfaceC0303as interfaceC0303as, int i) {
        InterfaceC0303as m3522c = C0453l.m3522c(interfaceC0303as);
        if (m3522c != null) {
            interfaceC0303as = m3522c;
        }
        m743b(interfaceC0303as, i);
    }

    /* renamed from: b */
    public void m743b(InterfaceC0303as interfaceC0303as, int i) {
        Iterator it = this.f6716b.iterator();
        while (it.hasNext()) {
            C1053j c1053j = (C1053j) it.next();
            if (c1053j.f6718a == interfaceC0303as) {
                c1053j.f6719b += i;
                return;
            }
        }
        C1053j c1053j2 = new C1053j(this);
        c1053j2.f6718a = interfaceC0303as;
        c1053j2.f6719b = i;
        this.f6716b.add(c1053j2);
    }

    /* renamed from: a */
    public void m745a(float f, float f2) {
        LoggerMaybe m1079A = LoggerMaybe.m1079A();
        int i = 0;
        C0136a m4638k = AbstractC0197n.m4638k(1);
        if (m4638k == null) {
            LoggerMaybe.LogDebug2("Warning: Creating missing wave team AI");
            m4638k = new C0136a(1);
            m4638k.f1312q = 100;
            m4638k.f1344T = true;
        }
        Iterator it = this.f6716b.iterator();
        while (it.hasNext()) {
            C1053j c1053j = (C1053j) it.next();
            for (int i2 = 0; i2 < c1053j.f6719b; i2++) {
                AbstractC0244am mo4234a = c1053j.f6718a.mo4234a();
                mo4234a.f6957el = f + C0758f.m2152a(-85, 85, i + 0);
                mo4234a.f6958em = f2 + C0758f.m2152a(-85, 85, i + 1);
                mo4234a.f1618ce = C0758f.m2152a(-180, (int) SlickToAndroidKeycodes.AndroidCodes.KEYCODE_STB_INPUT, i + 2);
                i += 3;
                mo4234a.m4492b(m4638k);
                if (mo4234a.f6957el < 0.0f) {
                    mo4234a.f6957el = 0.0f;
                }
                if (mo4234a.f6958em < 0.0f) {
                    mo4234a.f6958em = 0.0f;
                }
                if (mo4234a.f6957el > m1079A.f6110bL.m4898i()) {
                    mo4234a.f6957el = m1079A.f6110bL.m4898i();
                }
                if (mo4234a.f6958em > m1079A.f6110bL.m4897j()) {
                    mo4234a.f6958em = m1079A.f6110bL.m4897j();
                }
                if (i2 == 0) {
                    m1079A.f6121bW.m1738a(mo4234a);
                }
            }
        }
    }

    public String toString() {
        if (this.f6716b.size() == 0) {
            return "No units";
        }
        String str = VariableScope.nullOrMissingString;
        boolean z = true;
        Iterator it = this.f6716b.iterator();
        while (it.hasNext()) {
            C1053j c1053j = (C1053j) it.next();
            if (!z) {
                str = str + ", ";
            }
            z = false;
            str = (str + c1053j.f6719b + "x ") + c1053j.f6718a.mo4227e();
        }
        return str;
    }
}
