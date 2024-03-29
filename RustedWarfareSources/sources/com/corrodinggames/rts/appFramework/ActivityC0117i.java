package com.corrodinggames.rts.appFramework;

import android.app.Activity;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import com.corrodinggames.rts.game.AbstractC0197n;
import com.corrodinggames.rts.game.C0187e;
import com.corrodinggames.rts.game.p010a.C0136a;
import com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope;
import com.corrodinggames.rts.gameFramework.Core;
import com.corrodinggames.rts.gameFramework.EnumC1063s;
import com.corrodinggames.rts.gameFramework.p036e.C0750a;
import com.corrodinggames.rts.gameFramework.p040h.C0824b;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: com.corrodinggames.rts.appFramework.i */
/* loaded from: game-lib.jar:com/corrodinggames/rts/appFramework/i.class */
public class ActivityC0117i extends ActivityC0089b {

    /* renamed from: c */
    boolean f474c;

    /* renamed from: d */
    String f475d;

    /* renamed from: b */
    public void mo5591b() {
        super.mo5591b();
        C0090c.m5647a((Activity) this, true);
    }

    /* renamed from: d */
    public static String m5623d(String str) {
        if (str == null) {
            return null;
        }
        if (str.contains("/MOD|")) {
            return str.substring(str.indexOf("/MOD|"));
        }
        if (str.contains("/NEW_PATH|")) {
            return str.substring(str.indexOf("/NEW_PATH|"));
        }
        String[] split = str.split("/");
        return split[split.length - 1];
    }

    /* renamed from: a */
    public static boolean m5625a(String str, String str2) {
        Matcher matcher = Pattern.compile(".*\\[(.*)\\].*").matcher(str);
        if (matcher.matches()) {
            if ((matcher.group(1).toLowerCase(Locale.ENGLISH) + "|").contains("demo|")) {
                return true;
            }
        }
        if (C0750a.m2271h(str2.replace(".tmx", VariableScope.nullOrMissingString) + "_demo")) {
            return true;
        }
        return false;
    }

    /* renamed from: e */
    public static String m5622e(String str) {
        return C0090c.m5639b(str);
    }

    /* renamed from: f */
    public static boolean m5621f(String str) {
        if (str.contains("skirmish/")) {
            return true;
        }
        return false;
    }

    /* renamed from: g */
    public static boolean m5620g(String str) {
        if (str.contains("SD/")) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static void m5624a(String str, boolean z, int i, int i2, boolean z2, boolean z3) {
        Core m1087A = Core.m1087A();
        m1087A.f6117bS.m1829g();
        if (z || z3) {
            int i3 = 0;
            m1087A.m1077K();
            synchronized (m1087A) {
                m1087A.f6166dl = null;
                m1087A.f6165dk = str;
                int i4 = AbstractC0197n.f1365c - 1;
                int m5642a = C0090c.m5642a(str);
                Core.LogDebug2("Max teams on map: " + str + " = " + m5642a);
                if (m5642a > 0 && m5642a - 1 < i4) {
                    i4 = m5642a - 1;
                }
                AbstractC0197n.m5116D();
                m1087A.f6099bs = new C0187e(0);
                m1087A.f6099bs.f1316u = "Player";
                int i5 = 0;
                while (i5 <= 1) {
                    for (int i6 = 1; i6 <= i4; i6++) {
                        boolean z4 = i6 % 2 == 0 || i5 == 1;
                        if (i3 < i2 && z4 && AbstractC0197n.m5017k(i6) == null) {
                            C0136a c0136a = new C0136a(i6);
                            c0136a.f1316u = "AI";
                            c0136a.f1312q = 0;
                            i3++;
                        }
                    }
                    i5++;
                }
                Core.LogDebug2("Allies: " + i3 + "/" + i2);
                int i7 = 0;
                int i8 = i - i2;
                int i9 = 0;
                while (i9 <= 1) {
                    for (int i10 = 1; i10 <= i4; i10++) {
                        boolean z5 = i10 % 2 == 1 || i9 == 1;
                        if (!z2) {
                            z5 = true;
                        }
                        if (i7 < i8 && z5 && AbstractC0197n.m5017k(i10) == null) {
                            C0136a c0136a2 = new C0136a(i10);
                            c0136a2.f1316u = "AI";
                            i7++;
                            if (z2) {
                                c0136a2.f1312q = 1;
                            }
                        }
                    }
                    i9++;
                }
                m1087A.f6122bX.m1557aq();
                if (!z3) {
                    m1087A.m1037a(false, EnumC1063s.f6740b);
                }
            }
            return;
        }
        m1087A.m1077K();
        synchronized (m1087A) {
            m1087A.f6166dl = null;
            m1087A.f6165dk = str;
        }
        if (!z3) {
            m1087A.m1037a(true, EnumC1063s.f6740b);
        }
    }

    public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        C0824b c0824b;
        super.onCreateContextMenu(contextMenu, view, contextMenuInfo);
        View view2 = ((AdapterView.AdapterContextMenuInfo) contextMenuInfo).targetView;
        String str = (String) view2.getTag();
        Core m1087A = Core.m1087A();
        String m5622e = m5622e(str);
        if (str != null) {
            c0824b = m1087A.f6124bZ.m1699g(str);
        } else {
            c0824b = null;
        }
        this.f475d = str;
        contextMenu.setHeaderTitle(m5622e);
        MenuItem add = contextMenu.add(0, view2.getId(), 0, "Export");
        if (c0824b != null) {
            add.setTitle("Export (Standalone maps only)");
            add.setEnabled(false);
        }
        MenuItem add2 = contextMenu.add(2, view2.getId(), 0, "Delete");
        if (c0824b != null) {
            add2.setTitle("Delete (Standalone maps only)");
            add2.setEnabled(false);
        }
        if (c0824b != null) {
            contextMenu.add(4, view2.getId(), 0, "From Mod: " + c0824b.m1686b()).setEnabled(false);
        }
        if (c0824b == null && this.f474c) {
            MenuItem add3 = contextMenu.add(3, view.getId(), 0, "Storage: " + C0750a.m2266m(str));
            if (add3 != null) {
                add3.setEnabled(false);
            }
        }
    }
}
