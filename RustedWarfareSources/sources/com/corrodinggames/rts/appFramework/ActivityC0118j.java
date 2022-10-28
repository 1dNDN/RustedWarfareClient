package com.corrodinggames.rts.appFramework;

import android.app.Activity;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import com.corrodinggames.rts.gameFramework.p036e.C0750a;
import java.util.ArrayList;
import java.util.Collections;

/* renamed from: com.corrodinggames.rts.appFramework.j */
/* loaded from: game-lib.jar:com/corrodinggames/rts/appFramework/j.class */
public class ActivityC0118j extends ActivityC0089b {

    /* renamed from: c */
    String[] f476c;

    @Override // android.app.Activity
    /* renamed from: b */
    public void mo4752b() {
        super.mo4752b();
        C0090c.m4808a((Activity) this, true);
    }

    /* renamed from: l */
    public static String[] m4780l() {
        String[] m2226a = C0750a.m2226a("/SD/rustedWarfare/saves/", false);
        if (m2226a == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (String str : m2226a) {
            if (!str.endsWith(".map") && !str.endsWith(".tmp")) {
                arrayList.add(str);
            }
        }
        Collections.sort(arrayList, new C0119k());
        return (String[]) arrayList.toArray(new String[0]);
    }

    @Override // android.app.Activity, android.view.View.OnCreateContextMenuListener
    public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        super.onCreateContextMenu(contextMenu, view, contextMenuInfo);
        contextMenu.setHeaderTitle(((Button) view).getText());
        contextMenu.add(0, view.getId(), 0, "Share");
        contextMenu.add(1, view.getId(), 0, "Rename");
        contextMenu.add(2, view.getId(), 0, "Delete");
        if (this.f476c != null && this.f476c.length > 0) {
            MenuItem add = contextMenu.add(3, view.getId(), 0, "Storage: " + C0750a.m2204m(this.f476c[view.getId()]));
            if (add != null) {
                add.setEnabled(false);
            }
        }
    }
}
