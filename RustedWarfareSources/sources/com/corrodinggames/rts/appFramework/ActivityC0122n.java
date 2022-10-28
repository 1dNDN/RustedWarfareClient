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
import com.corrodinggames.rts.gameFramework.EnumC1063s;
import com.corrodinggames.rts.gameFramework.LoggerMaybe;
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
    public static boolean m5196l() {
        if (f514c == null) {
            return false;
        }
        return f514c.f518g;
    }

    /* renamed from: m */
    public static void m5195m() {
        if (f514c != null) {
            f514c.f516e.m5414a(new RunnableC01231());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.corrodinggames.rts.appFramework.n$1 */
    /* loaded from: game-lib.jar:com/corrodinggames/rts/appFramework/n$1.class */
    public final class RunnableC01231 implements Runnable {
        RunnableC01231() {
        }

        public void run() {
            ActivityC0122n.this.m5194n();
        }
    }

    /* renamed from: d */
    public static void m5197d(String str) {
        ActivityC0122n activityC0122n = f514c;
        if (activityC0122n == null) {
            return;
        }
        Message m5418a = activityC0122n.f520k.m5418a();
        m5418a.m5392d().putString("text", str);
        activityC0122n.f520k.m5410c(m5418a);
    }

    /* renamed from: n */
    void m5194n() {
        if (!this.f515d) {
            LoggerMaybe.m990b("addMessageToChatLogInternal: !onCreateFinished");
            return;
        }
        LoggerMaybe m1079A = LoggerMaybe.m1079A();
        Spanned m1614b = m1079A.f6122bX.f5605aS.m1614b(true);
        if (this.f519h == null) {
            throw new RuntimeException("chatLog==null");
        }
        if (m1614b == null) {
            throw new RuntimeException("chatLogHTML==null");
        }
        try {
            this.f519h.clearFocus();
            this.f519h.setTextKeepState(m1614b);
        } catch (NullPointerException e) {
            LoggerMaybe.m1033a("chatLog.setText error", (Throwable) e);
            m1079A.m1037a("chatLog.setText error", 1);
        }
    }

    /* renamed from: a */
    public static void m5198a(String str, String str2) {
        if (f514c != null) {
            f514c.f516e.m5414a(new RunnableC01242(str2));
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
            ActivityC0122n.this.mo5212b();
            if (this.f527b != null) {
            }
        }
    }

    /* renamed from: o */
    public static void m5193o() {
        LoggerMaybe m1079A = LoggerMaybe.m1079A();
        if (m1079A.f6122bX != null) {
            m1079A.f6122bX.m1591O();
            m1079A.f6122bX.f5562d.mo406c();
        }
        if (LoggerMaybe.f6205aU) {
            return;
        }
        if (m1079A.f6122bX != null && m1079A.f6122bX.f5539bm) {
            return;
        }
        if (f514c != null) {
            f514c.f516e.m5414a(f514c.f521l);
        } else {
            LoggerMaybe.m990b("MultiplayerBattleroomActivity:updateUI() lastLoaded==null");
        }
    }

    /* renamed from: p */
    public static void m5192p() {
        if (f514c != null) {
            f514c.f516e.m5414a(f514c.f522m);
            f517f = false;
            return;
        }
        LoggerMaybe.m990b("MultiplayerBattleroomActivity:startGame() lastLoaded==null");
        LoggerMaybe.m1061S();
        f517f = true;
    }

    /* renamed from: q */
    public static void m5191q() {
        C0128o c0128o = new C0128o("Starting unit count");
        C0128o c0128o2 = new C0128o("Total unit HP");
        C0128o c0128o3 = new C0128o("Team Credits");
        Iterator it = AbstractC0197n.m4679c().iterator();
        while (it.hasNext()) {
            AbstractC0197n abstractC0197n = (AbstractC0197n) it.next();
            int i = 0;
            int i2 = 0;
            AbstractC0244am[] m503a = AbstractC0244am.f1590bD.m503a();
            int size = AbstractC0244am.f1590bD.size();
            for (int i3 = 0; i3 < size; i3++) {
                AbstractC0244am abstractC0244am = m503a[i3];
                if (abstractC0244am.f1609bV == abstractC0197n) {
                    i++;
                    i2 = (int) (i2 + abstractC0244am.f1632cs);
                }
            }
            if (i != 0) {
                c0128o.m5188a(abstractC0197n, i);
                c0128o2.m5188a(abstractC0197n, i2);
                c0128o3.m5188a(abstractC0197n, (int) abstractC0197n.f1310o);
            }
        }
        if (!c0128o.m5189a()) {
            c0128o2.m5189a();
        }
        c0128o3.m5189a();
    }

    /* renamed from: r */
    public static void m5190r() {
        LoggerMaybe m1079A = LoggerMaybe.m1079A();
        m1079A.f6166dl = null;
        if (m1079A.f6122bX.f5603aO.f5654a == EnumC0846ai.f5671c) {
            if (!m1079A.f6122bX.IsServer) {
                m1079A.f6125ca.m432a(m1079A.f6122bX.f5524aQ, true, false, false);
                m1079A.f6117bS.f5115e.m1752a(null, "Note: Game was started from a saved game.");
            } else {
                m1079A.f6125ca.m422c(m1079A.f6122bX.f5603aO.f5655b, true);
            }
            m5191q();
        } else if (m1079A.f6122bX.f5603aO.f5654a == EnumC0846ai.f5670b) {
            if (!m1079A.f6122bX.IsServer) {
                m1079A.f6165dk = VariableScope.nullOrMissingString;
                m1079A.f6166dl = m1079A.f6122bX.f5525aR;
                m1079A.m1029a(true, EnumC1063s.f6740b);
                m1079A.f6117bS.f5115e.m1752a(null, "Note: Game was started from a custom map on server.");
            } else {
                m1079A.f6165dk = m1079A.f6122bX.f5604aP;
                m1079A.m1029a(true, EnumC1063s.f6740b);
            }
            m5191q();
        } else {
            m1079A.f6165dk = m1079A.f6122bX.f5604aP;
            m1079A.m1029a(true, EnumC1063s.f6740b);
        }
    }

    /* renamed from: a */
    public static void m5199a(C0841ae c0841ae) {
        AlertDialog.Builder builder = new AlertDialog.Builder(LoggerMaybe.m1079A().m1025aC());
        String str = "Password Required";
        String str2 = "This server requires a password to join";
        if (c0841ae.f5641b != null) {
            str = "Server Question";
            str2 = C0820a.m1685c(c0841ae.f5641b);
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
            this.f529b.mo3109a(this.f528a.getText().toString());
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
            this.f530a.mo3110a();
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
            this.f531a.mo3110a();
            ActivityC0122n.f523i = null;
            ActivityC0122n.f524j = null;
        }
    }
}
