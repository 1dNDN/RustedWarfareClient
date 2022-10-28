package com.corrodinggames.rts.appFramework;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.p003os.Handler;
import android.p003os.Message;
import android.text.Spanned;
import android.widget.EditText;
import android.widget.TextView;
import com.corrodinggames.rts.game.AbstractC0197n;
import com.corrodinggames.rts.game.units.AbstractC0244am;
import com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope;
import com.corrodinggames.rts.gameFramework.Core;
import com.corrodinggames.rts.gameFramework.EnumC1063s;
import com.corrodinggames.rts.gameFramework.p039g.C0820a;
import com.corrodinggames.rts.gameFramework.p041i.C0841ae;
import com.corrodinggames.rts.gameFramework.p041i.EnumC0846ai;
import java.util.Iterator;

/* renamed from: com.corrodinggames.rts.appFramework.n */
/* loaded from: game-lib.jar:com/corrodinggames/rts/appFramework/n.class */
public class ActivityC0122n extends ActivityC0089b {

    /* renamed from: c */
    public static ActivityC0122n f514c;

    /* renamed from: d */
    boolean f515d;

    /* renamed from: e */
    final Handler f516e;

    /* renamed from: f */
    public static boolean f517f = false;

    /* renamed from: g */
    public boolean f518g;

    /* renamed from: h */
    TextView f519h;

    /* renamed from: k */
    private Handler f520k;

    /* renamed from: l */
    private Runnable f521l;

    /* renamed from: m */
    private Runnable f522m;

    /* renamed from: i */
    static C0841ae f523i;

    /* renamed from: j */
    static AlertDialog f524j;

    /* renamed from: l */
    public static boolean m5604l() {
        if (f514c == null) {
            return false;
        }
        return f514c.f518g;
    }

    /* renamed from: m */
    public static void m5603m() {
        if (f514c != null) {
            f514c.f516e.m5821a(new RunnableC01231());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.corrodinggames.rts.appFramework.n$1 */
    /* loaded from: game-lib.jar:com/corrodinggames/rts/appFramework/n$1.class */
    public final class RunnableC01231 implements Runnable {
        RunnableC01231() {
        }

        public void run() {
            ActivityC0122n.this.m5602n();
        }
    }

    /* renamed from: d */
    public static void m5605d(String str) {
        ActivityC0122n activityC0122n = f514c;
        if (activityC0122n == null) {
            return;
        }
        Message m5825a = activityC0122n.f520k.m5825a();
        m5825a.m5799d().putString("text", str);
        activityC0122n.f520k.m5817c(m5825a);
    }

    /* renamed from: n */
    void m5602n() {
        if (!this.f515d) {
            Core.m998b("addMessageToChatLogInternal: !onCreateFinished");
            return;
        }
        Core m1087A = Core.m1087A();
        Spanned m1656b = m1087A.f6122bX.f5605aS.m1656b(true);
        if (this.f519h == null) {
            throw new RuntimeException("chatLog==null");
        }
        if (m1656b == null) {
            throw new RuntimeException("chatLogHTML==null");
        }
        try {
            this.f519h.clearFocus();
            this.f519h.setTextKeepState(m1656b);
        } catch (NullPointerException e) {
            Core.m1041a("chatLog.setText error", (Throwable) e);
            m1087A.m1045a("chatLog.setText error", 1);
        }
    }

    /* renamed from: a */
    public static void m5606a(String str, String str2) {
        if (f514c != null) {
            f514c.f516e.m5821a(new RunnableC01242(str2));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.corrodinggames.rts.appFramework.n$2 */
    /* loaded from: game-lib.jar:com/corrodinggames/rts/appFramework/n$2.class */
    public final class RunnableC01242 implements Runnable {

        /* renamed from: b */
        final /* synthetic */ String f527b;

        RunnableC01242(String str) {
            this.f527b = str;
        }

        public void run() {
            ActivityC0122n.this.mo5591b();
            if (this.f527b != null) {
            }
        }
    }

    /* renamed from: o */
    public static void m5601o() {
        Core m1087A = Core.m1087A();
        if (m1087A.f6122bX != null) {
            m1087A.f6122bX.m1633O();
            m1087A.f6122bX.f5562d.mo401c();
        }
        if (Core.f6205aU) {
            return;
        }
        if (m1087A.f6122bX != null && m1087A.f6122bX.f5539bm) {
            return;
        }
        if (f514c != null) {
            f514c.f516e.m5821a(f514c.f521l);
        } else {
            Core.m998b("MultiplayerBattleroomActivity:updateUI() lastLoaded==null");
        }
    }

    /* renamed from: p */
    public static void m5600p() {
        if (f514c != null) {
            f514c.f516e.m5821a(f514c.f522m);
            f517f = false;
            return;
        }
        Core.m998b("MultiplayerBattleroomActivity:startGame() lastLoaded==null");
        Core.m1069S();
        f517f = true;
    }

    /* renamed from: q */
    public static void m5599q() {
        C0128o c0128o = new C0128o("Starting unit count");
        C0128o c0128o2 = new C0128o("Total unit HP");
        C0128o c0128o3 = new C0128o("Team Credits");
        Iterator it = AbstractC0197n.m5058c().iterator();
        while (it.hasNext()) {
            AbstractC0197n abstractC0197n = (AbstractC0197n) it.next();
            int i = 0;
            int i2 = 0;
            AbstractC0244am[] m498a = AbstractC0244am.f1590bD.m498a();
            int size = AbstractC0244am.f1590bD.size();
            for (int i3 = 0; i3 < size; i3++) {
                AbstractC0244am abstractC0244am = m498a[i3];
                if (abstractC0244am.f1609bV == abstractC0197n) {
                    i++;
                    i2 = (int) (i2 + abstractC0244am.f1632cs);
                }
            }
            if (i != 0) {
                c0128o.m5596a(abstractC0197n, i);
                c0128o2.m5596a(abstractC0197n, i2);
                c0128o3.m5596a(abstractC0197n, (int) abstractC0197n.f1310o);
            }
        }
        if (!c0128o.m5597a()) {
            c0128o2.m5597a();
        }
        c0128o3.m5597a();
    }

    /* renamed from: r */
    public static void m5598r() {
        Core m1087A = Core.m1087A();
        m1087A.f6166dl = null;
        if (m1087A.f6122bX.f5603aO.f5654a == EnumC0846ai.f5671c) {
            if (!m1087A.f6122bX.IsServer) {
                m1087A.f6125ca.m427a(m1087A.f6122bX.f5524aQ, true, false, false);
                m1087A.f6117bS.f5115e.m1794a(null, "Note: Game was started from a saved game.");
            } else {
                m1087A.f6125ca.m417c(m1087A.f6122bX.f5603aO.f5655b, true);
            }
            m5599q();
        } else if (m1087A.f6122bX.f5603aO.f5654a == EnumC0846ai.f5670b) {
            if (!m1087A.f6122bX.IsServer) {
                m1087A.f6165dk = VariableScope.nullOrMissingString;
                m1087A.f6166dl = m1087A.f6122bX.f5525aR;
                m1087A.m1037a(true, EnumC1063s.f6740b);
                m1087A.f6117bS.f5115e.m1794a(null, "Note: Game was started from a custom map on server.");
            } else {
                m1087A.f6165dk = m1087A.f6122bX.f5604aP;
                m1087A.m1037a(true, EnumC1063s.f6740b);
            }
            m5599q();
        } else {
            m1087A.f6165dk = m1087A.f6122bX.f5604aP;
            m1087A.m1037a(true, EnumC1063s.f6740b);
        }
    }

    /* renamed from: a */
    public static void m5607a(C0841ae c0841ae) {
        AlertDialog.Builder builder = new AlertDialog.Builder(Core.m1087A().m1033aC());
        String str = "Password Required";
        String str2 = "This server requires a password to join";
        if (c0841ae.f5641b != null) {
            str = "Server Question";
            str2 = C0820a.m1727c(c0841ae.f5641b);
        }
        if (c0841ae.f5644e != null) {
            str = c0841ae.f5644e;
        }
        builder.setTitle(str);
        builder.setMessage(str2);
        EditText editText = new EditText(builder.getContext());
        builder.setView(editText);
        if (c0841ae.f5641b != null) {
            editText.setHint("Enter text...");
        } else {
            editText.setHint("Enter password...");
        }
        builder.setPositiveButton(c0841ae.f5645f != null ? c0841ae.f5645f : "Submit", new DialogInterface$OnClickListenerC01253(editText, c0841ae));
        builder.setNegativeButton(c0841ae.f5646g != null ? c0841ae.f5646g : "Disconnect", new DialogInterface$OnClickListenerC01264(c0841ae));
        builder.setOnCancelListener(new DialogInterface$OnCancelListenerC01275(c0841ae));
        AlertDialog alertDialog = f524j;
        if (alertDialog != null) {
            try {
                alertDialog.dismiss();
            } catch (IllegalArgumentException e) {
                e.printStackTrace();
            }
        }
        AlertDialog show = builder.show();
        f523i = c0841ae;
        f524j = show;
        editText.requestFocus();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.corrodinggames.rts.appFramework.n$3 */
    /* loaded from: game-lib.jar:com/corrodinggames/rts/appFramework/n$3.class */
    public final class DialogInterface$OnClickListenerC01253 implements DialogInterface.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ EditText f528a;

        /* renamed from: b */
        final /* synthetic */ C0841ae f529b;

        DialogInterface$OnClickListenerC01253(EditText editText, C0841ae c0841ae) {
            this.f528a = editText;
            this.f529b = c0841ae;
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            this.f529b.mo1455a(this.f528a.getText().toString());
            ActivityC0122n.f523i = null;
            ActivityC0122n.f524j = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.corrodinggames.rts.appFramework.n$4 */
    /* loaded from: game-lib.jar:com/corrodinggames/rts/appFramework/n$4.class */
    public final class DialogInterface$OnClickListenerC01264 implements DialogInterface.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C0841ae f530a;

        DialogInterface$OnClickListenerC01264(C0841ae c0841ae) {
            this.f530a = c0841ae;
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            this.f530a.mo1456a();
            ActivityC0122n.f523i = null;
            ActivityC0122n.f524j = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.corrodinggames.rts.appFramework.n$5 */
    /* loaded from: game-lib.jar:com/corrodinggames/rts/appFramework/n$5.class */
    public final class DialogInterface$OnCancelListenerC01275 implements DialogInterface.OnCancelListener {

        /* renamed from: a */
        final /* synthetic */ C0841ae f531a;

        DialogInterface$OnCancelListenerC01275(C0841ae c0841ae) {
            this.f531a = c0841ae;
        }

        public void onCancel(DialogInterface dialogInterface) {
            this.f531a.mo1456a();
            ActivityC0122n.f523i = null;
            ActivityC0122n.f524j = null;
        }
    }
}
