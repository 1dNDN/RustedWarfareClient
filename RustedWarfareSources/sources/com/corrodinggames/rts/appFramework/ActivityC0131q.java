package com.corrodinggames.rts.appFramework;

import android.app.Activity;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import com.corrodinggames.rts.gameFramework.LoggerMaybe;
import com.corrodinggames.rts.gameFramework.p036e.C0750a;
import java.util.ArrayList;
import java.util.Collections;

/* renamed from: com.corrodinggames.rts.appFramework.q */
/* loaded from: game-lib.jar:com/corrodinggames/rts/appFramework/q.class */
public class ActivityC0131q extends ActivityC0089b {

    /* renamed from: c */
    String[] f542c;

    /* renamed from: b */
    public void mo5212b() {
        super.mo5212b();
        C0090c.m5240a((Activity) this, true);
    }

    /* renamed from: l */
    public static String[] m5182l() {
        String[] m2223g = C0750a.m2223g("/SD/rustedWarfare/replays/");
        if (m2223g == null) {
            LoggerMaybe.LogDebug2("failed to find replay folder");
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (String str : m2223g) {
            if (!str.endsWith(".map")) {
                arrayList.add(str);
            }
        }
        Collections.sort(arrayList, new C0132r());
        return (String[]) arrayList.toArray(new String[0]);
    }

    public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        super.onCreateContextMenu(contextMenu, view, contextMenuInfo);
        contextMenu.setHeaderTitle(((Button) view).getText());
        contextMenu.add(0, view.getId(), 0, "Share");
        contextMenu.add(1, view.getId(), 0, "Rename");
        contextMenu.add(2, view.getId(), 0, "Delete");
        if (this.f542c != null && this.f542c.length > 0) {
            MenuItem add = contextMenu.add(3, view.getId(), 0, "Storage: " + C0750a.m2217m(this.f542c[view.getId()]));
            if (add != null) {
                add.setEnabled(false);
            }
        }
    }
}
