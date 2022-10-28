package com.corrodinggames.rts.appFramework;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.ProgressDialog;
import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.p003os.Handler;
import android.p003os.Looper;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import com.corrodinggames.rts.C0067R;
import com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope;
import com.corrodinggames.rts.gameFramework.C0758f;
import com.corrodinggames.rts.gameFramework.EnumC1063s;
import com.corrodinggames.rts.gameFramework.LoggerMaybe;
import com.corrodinggames.rts.gameFramework.p039g.C0820a;
import com.corrodinggames.rts.gameFramework.p047n.C1058a;

/* renamed from: com.corrodinggames.rts.appFramework.g */
/* loaded from: game-lib.jar:com/corrodinggames/rts/appFramework/g.class */
public class ActivityC0097g extends ActivityC0089b {

    /* renamed from: c */
    InterfaceC0096f f439c;

    /* renamed from: e */
    ProgressDialog f441e;

    /* renamed from: d */
    final Handler f440d = new Handler(Looper.m5404b());

    /* renamed from: f */
    boolean f442f = true;

    /* renamed from: a */
    static /* synthetic */ void m5226a(ActivityC0097g activityC0097g, String str) {
        activityC0097g.m5221f(str);
    }

    /* renamed from: b */
    static /* synthetic */ void m5224b(ActivityC0097g activityC0097g, String str) {
        activityC0097g.m5222e(str);
    }

    /* renamed from: a */
    static /* synthetic */ void m5227a(ActivityC0097g activityC0097g) {
        activityC0097g.m5219n();
    }

    /* renamed from: b */
    public void mo5212b() {
        LoggerMaybe.LogDebug2("IngameActivity: finish");
        super.mo5212b();
        C0090c.m5240a((Activity) this, true);
    }

    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        if (z) {
            C0090c.m5239a((Activity) this, false, true);
        }
        this.f439c.mo256a(z);
    }

    /* renamed from: a */
    public boolean mo5614a(Menu menu) {
        super.mo5614a(menu);
        menu.clear();
        LoggerMaybe m1079A = LoggerMaybe.m1079A();
        menu.add(0, 12, 0, C0820a.m1689a("menus.ingame.save", new Object[0])).setIcon(17301582);
        if (m1079A.f6100bv && !LoggerMaybe.f6210aZ) {
            menu.add(0, 18, 0, C0820a.m1689a("menus.ingame.exportMap", new Object[0])).setIcon(17301582);
        }
        menu.add(0, 2, 0, C0820a.m1689a("menus.ingame.settings", new Object[0])).setIcon(17301577);
        if (!m1079A.m1067M()) {
        }
        if (m1079A.f6126cb != null && m1079A.f6126cb.m2413h()) {
            menu.add(0, 22, 0, C0820a.m1689a("menus.ingame.hideInterface", new Object[0])).setIcon(17301584);
        }
        if (m1079A.m1067M()) {
            menu.add(0, 13, 0, C0820a.m1689a("menus.ingame.chat", new Object[0])).setIcon(17301584);
            menu.add(0, 14, 0, C0820a.m1689a("menus.ingame.players", new Object[0])).setIcon(17301661);
            if (m1079A.f6122bX.IsServer && C1058a.m739a().m738e()) {
                menu.add(0, 17, 0, C0820a.m1689a("menus.ingame.steam_reinvite", new Object[0])).setIcon(17301584);
            }
            boolean z = false;
            if (m1079A.f6099bs != null && m1079A.f6099bs.f1330F) {
                z = true;
            }
            if (!z && !m1079A.f6267dp) {
                menu.add(0, 19, 0, C0820a.m1689a("menus.ingame.surrender", new Object[0])).setIcon(17301552);
            }
            if (!m1079A.f6122bX.IsServer) {
                menu.add(0, 10, 0, C0820a.m1689a("menus.ingame.disconnect", new Object[0])).setIcon(17301552);
            } else {
                menu.add(0, 10, 0, C0820a.m1689a("menus.ingame.exitGame", new Object[0])).setIcon(17301552);
            }
        } else {
            if (m1079A.f6129ce != null && m1079A.f6129ce.f6665h != null) {
                menu.add(0, 11, 0, C0820a.m1689a("menus.ingame.briefing", new Object[0])).setIcon(17301659);
            }
            menu.add(0, 15, 0, C0820a.m1689a("menus.ingame.exitGame", new Object[0])).setIcon(17301552);
        }
        if (m1079A != null && m1079A.f6115bQ.allowGameRecording) {
            if (!m1079A.f6234bo) {
                menu.add(0, 9, 0, "Start Recording");
                return true;
            }
            menu.add(0, 9, 0, "Stop Recording");
            return true;
        }
        return true;
    }

    /* renamed from: c */
    public void mo121c(int i) {
        LoggerMaybe.LogDebug2("outer selectMenuOption: " + i);
        this.f440d.m5414a(new RunnableC00981(i));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.corrodinggames.rts.appFramework.g$1 */
    /* loaded from: game-lib.jar:com/corrodinggames/rts/appFramework/g$1.class */
    public class RunnableC00981 implements Runnable {

        /* renamed from: a */
        final /* synthetic */ int f443a;

        RunnableC00981(int i) {
            this.f443a = i;
        }

        public void run() {
            LoggerMaybe.LogDebug2("inner selectMenuOption: " + this.f443a);
            ActivityC0097g.this.mo120d(this.f443a);
        }
    }

    /* renamed from: d */
    public void mo120d(int i) {
        switch (i) {
            case 2:
                m5616a(new Intent(m5610k(), ActivityC0133s.class), 0);
                return;
            case 3:
                new AlertDialog.Builder(this).setIcon(17301543).setTitle("Skip?").setMessage("Are you sure you want to skip this level?").setPositiveButton("Yes", new DialogInterface$OnClickListenerC01159()).setNegativeButton("No", (DialogInterface.OnClickListener) null).show();
                return;
            case 4:
                LoggerMaybe.m1079A().f6245cg = !LoggerMaybe.m1079A().f6245cg;
                return;
            case 5:
                new AlertDialog.Builder(this).setIcon(17301543).setTitle("Restart?").setMessage("Are you sure you want to restart this level?").setPositiveButton("Yes", new DialogInterface$OnClickListenerC009910()).setNegativeButton("No", (DialogInterface.OnClickListener) null).show();
                return;
            case 6:
                LoggerMaybe m1079A = LoggerMaybe.m1079A();
                m1079A.f6231bl = !m1079A.f6231bl;
                return;
            case 7:
            case 8:
            case 17:
            default:
                return;
            case 9:
                LoggerMaybe m1079A2 = LoggerMaybe.m1079A();
                if (!m1079A2.f6234bo) {
                    m1079A2.f6234bo = true;
                    return;
                } else {
                    m1079A2.f6234bo = false;
                    return;
                }
            case 10:
                LoggerMaybe m1079A3 = LoggerMaybe.m1079A();
                String m1689a = C0820a.m1689a("menus.ingame.multiplayerClose.titleDisconnect", new Object[0]);
                String m1689a2 = C0820a.m1689a("menus.ingame.multiplayerClose.messageDisconnect", new Object[0]);
                String m1689a3 = C0820a.m1689a("menus.ingame.multiplayerClose.disconnectButton", new Object[0]);
                if (m1079A3.f6122bX.IsServer) {
                    m1689a = C0820a.m1689a("menus.ingame.multiplayerClose.title", new Object[0]);
                    m1689a2 = C0820a.m1689a("menus.ingame.multiplayerClose.messageEndGame", new Object[0]);
                    m1689a3 = C0820a.m1689a("menus.ingame.exitGame", new Object[0]);
                }
                AlertDialog.Builder negativeButton = new AlertDialog.Builder(this).setIcon(17301543).setTitle(m1689a).setMessage(m1689a2).setPositiveButton(m1689a3, new DialogInterface$OnClickListenerC010213()).setNegativeButton(C0820a.m1689a("menus.common.back", new Object[0]), (DialogInterface.OnClickListener) null);
                if (m1079A3.f6122bX.IsServer) {
                    negativeButton.setNeutralButton(C0820a.m1689a("menus.ingame.multiplayerClose.returnToBattleroom", new Object[0]), new DialogInterface$OnClickListenerC010314());
                }
                negativeButton.show();
                return;
            case 11:
                LoggerMaybe m1079A4 = LoggerMaybe.m1079A();
                if (m1079A4.f6129ce != null && m1079A4.f6129ce.f6665h != null) {
                    m1079A4.m1036a("Briefing", m1079A4.f6129ce.f6665h);
                    return;
                }
                return;
            case 12:
                RunnableC010011 runnableC010011 = new RunnableC010011(this);
                if (!C0090c.m5242a(this, runnableC010011)) {
                    runnableC010011.run();
                    return;
                }
                return;
            case 13:
                m5225a(false);
                return;
            case 14:
                LoggerMaybe m1079A5 = LoggerMaybe.m1079A();
                if (m1079A5.f6122bX != null) {
                    m1079A5.f6122bX.m1598H();
                    return;
                }
                return;
            case 15:
                new AlertDialog.Builder(this).setIcon(17301543).setTitle("Exit?").setMessage("Are you sure you want to exit this game?").setPositiveButton("Yes", new DialogInterface$OnClickListenerC010415()).setNegativeButton("No", (DialogInterface.OnClickListener) null).show();
                return;
            case 16:
                m5225a(true);
                return;
            case 18:
                if (C0090c.m5234b((Activity) this)) {
                    m5222e(null);
                    return;
                }
                return;
            case 19:
                new AlertDialog.Builder(this).setIcon(17301543).setTitle("Disconnect?").setMessage("Are you sure you want to surrender this game?").setPositiveButton("Surrender", new DialogInterface$OnClickListenerC010112()).setNegativeButton("No", (DialogInterface.OnClickListener) null).show();
                return;
            case 20:
                mo5212b();
                return;
            case 21:
                mo5212b();
                ActivityC0122n.m5193o();
                ActivityC0122n.m5195m();
                return;
            case 22:
                LoggerMaybe m1079A6 = LoggerMaybe.m1079A();
                m1079A6.f6161cT = true;
                m1079A6.f6117bS.f5126p = false;
                return;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.corrodinggames.rts.appFramework.g$9 */
    /* loaded from: game-lib.jar:com/corrodinggames/rts/appFramework/g$9.class */
    public class DialogInterface$OnClickListenerC01159 implements DialogInterface.OnClickListener {
        DialogInterface$OnClickListenerC01159() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            LoggerMaybe.m1079A().f6271dt = true;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.corrodinggames.rts.appFramework.g$10 */
    /* loaded from: game-lib.jar:com/corrodinggames/rts/appFramework/g$10.class */
    public class DialogInterface$OnClickListenerC009910 implements DialogInterface.OnClickListener {
        DialogInterface$OnClickListenerC009910() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            LoggerMaybe m1079A = LoggerMaybe.m1079A();
            m1079A.m1069K();
            m1079A.m1029a(true, EnumC1063s.f6740b);
            m1079A.m1071I();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.corrodinggames.rts.appFramework.g$11 */
    /* loaded from: game-lib.jar:com/corrodinggames/rts/appFramework/g$11.class */
    public class RunnableC010011 implements Runnable {

        /* renamed from: a */
        final /* synthetic */ Activity f446a;

        RunnableC010011(Activity activity) {
            this.f446a = activity;
        }

        public void run() {
            if (C0090c.m5234b(this.f446a)) {
                ActivityC0097g.m5226a(ActivityC0097g.this, (String) null);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.corrodinggames.rts.appFramework.g$12 */
    /* loaded from: game-lib.jar:com/corrodinggames/rts/appFramework/g$12.class */
    public class DialogInterface$OnClickListenerC010112 implements DialogInterface.OnClickListener {
        DialogInterface$OnClickListenerC010112() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            LoggerMaybe.m1079A().f6122bX.m1431m("-surrender");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.corrodinggames.rts.appFramework.g$13 */
    /* loaded from: game-lib.jar:com/corrodinggames/rts/appFramework/g$13.class */
    public class DialogInterface$OnClickListenerC010213 implements DialogInterface.OnClickListener {
        DialogInterface$OnClickListenerC010213() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            LoggerMaybe.m1079A().f6122bX.m1493b("exited");
            ActivityC0097g.this.mo5212b();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.corrodinggames.rts.appFramework.g$14 */
    /* loaded from: game-lib.jar:com/corrodinggames/rts/appFramework/g$14.class */
    public class DialogInterface$OnClickListenerC010314 implements DialogInterface.OnClickListener {
        DialogInterface$OnClickListenerC010314() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            LoggerMaybe.LogDebug2("Returning to battleroom clicked.");
            LoggerMaybe m1079A = LoggerMaybe.m1079A();
            m1079A.f6122bX.m1525ag();
            m1079A.f6117bS.f5126p = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.corrodinggames.rts.appFramework.g$15 */
    /* loaded from: game-lib.jar:com/corrodinggames/rts/appFramework/g$15.class */
    public class DialogInterface$OnClickListenerC010415 implements DialogInterface.OnClickListener {
        DialogInterface$OnClickListenerC010415() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            ActivityC0097g.this.mo5212b();
        }
    }

    /* renamed from: a */
    private void m5225a(boolean z) {
        LoggerMaybe m1079A = LoggerMaybe.m1079A();
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        if (!z) {
            builder.setTitle("Send Message");
        } else {
            builder.setTitle("Send Team Message");
        }
        View inflate = LayoutInflater.from(this).inflate(C0067R.layout.alert_chat, (ViewGroup) null);
        builder.setView(inflate);
        TextView textView = (TextView) inflate.findViewById(C0067R.C0068id.chat_messages);
        EditText editText = (EditText) inflate.findViewById(C0067R.C0068id.chat_text);
        textView.setText(m1079A.f6122bX.f5605aS.m1620a());
        editText.setText(VariableScope.nullOrMissingString);
        editText.requestFocus();
        builder.setPositiveButton(z ? "Send Team" : "Send", new DialogInterface$OnClickListenerC010516(editText, z));
        builder.setNeutralButton("Send & Ping Map", new DialogInterface$OnClickListenerC01062(editText, z));
        builder.setNegativeButton("Cancel", new DialogInterface$OnClickListenerC01073());
        builder.show();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.corrodinggames.rts.appFramework.g$16 */
    /* loaded from: game-lib.jar:com/corrodinggames/rts/appFramework/g$16.class */
    public class DialogInterface$OnClickListenerC010516 implements DialogInterface.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ EditText f452a;

        /* renamed from: b */
        final /* synthetic */ boolean f453b;

        DialogInterface$OnClickListenerC010516(EditText editText, boolean z) {
            this.f452a = editText;
            this.f453b = z;
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            String obj = this.f452a.getText().toString();
            LoggerMaybe m1079A = LoggerMaybe.m1079A();
            if (!obj.trim().equals(VariableScope.nullOrMissingString)) {
                if (this.f453b) {
                    m1079A.f6122bX.m1433l(obj);
                } else {
                    m1079A.f6122bX.m1431m(obj);
                }
            }
            m1079A.f6117bS.f5126p = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.corrodinggames.rts.appFramework.g$2 */
    /* loaded from: game-lib.jar:com/corrodinggames/rts/appFramework/g$2.class */
    public class DialogInterface$OnClickListenerC01062 implements DialogInterface.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ EditText f455a;

        /* renamed from: b */
        final /* synthetic */ boolean f456b;

        DialogInterface$OnClickListenerC01062(EditText editText, boolean z) {
            this.f455a = editText;
            this.f456b = z;
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            String obj = this.f455a.getText().toString();
            LoggerMaybe m1079A = LoggerMaybe.m1079A();
            if (!obj.trim().equals(VariableScope.nullOrMissingString)) {
                if (this.f456b) {
                    m1079A.f6122bX.m1433l(obj);
                } else {
                    m1079A.f6122bX.m1431m(obj);
                }
            }
            m1079A.f6117bS.f5126p = false;
            m1079A.f6117bS.m1872H();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.corrodinggames.rts.appFramework.g$3 */
    /* loaded from: game-lib.jar:com/corrodinggames/rts/appFramework/g$3.class */
    public class DialogInterface$OnClickListenerC01073 implements DialogInterface.OnClickListener {
        DialogInterface$OnClickListenerC01073() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
        }
    }

    /* renamed from: e */
    private void m5222e(String str) {
        LoggerMaybe m1079A = LoggerMaybe.m1079A();
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Export Map");
        builder.setMessage("Enter a name to export the map as");
        EditText editText = new EditText(this);
        if (str == null) {
            editText.setText(("New " + m1079A.m1012ak() + " (" + C0758f.m2130a("d MMM yyyy").replace(".", VariableScope.nullOrMissingString) + " " + C0758f.m2130a("HH.mm.ss") + ")").replace("  ", " "));
        } else {
            editText.setText(str);
        }
        builder.setView(editText);
        builder.setPositiveButton("Ok", new DialogInterface$OnClickListenerC01084(editText, m1079A));
        builder.setNegativeButton("Cancel", new DialogInterface$OnClickListenerC01105());
        builder.show();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.corrodinggames.rts.appFramework.g$4 */
    /* loaded from: game-lib.jar:com/corrodinggames/rts/appFramework/g$4.class */
    public class DialogInterface$OnClickListenerC01084 implements DialogInterface.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ EditText f459a;

        /* renamed from: b */
        final /* synthetic */ LoggerMaybe f460b;

        DialogInterface$OnClickListenerC01084(EditText editText, LoggerMaybe loggerMaybe) {
            this.f459a = editText;
            this.f460b = loggerMaybe;
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            String obj = this.f459a.getText().toString();
            if (obj.contains("/") || obj.contains("\\") || obj.contains(":") || obj.contains("*") || obj.contains("?") || obj.contains("\"") || obj.contains("<") || obj.contains(">")) {
                AlertDialog.Builder builder = new AlertDialog.Builder(ActivityC0097g.this);
                builder.setTitle("Bad Map Name");
                builder.setMessage("The characters /\\:*?\"<> are not allowed (fat32 formatting)");
                builder.setPositiveButton("Ok", new DialogInterface$OnClickListenerC01091(obj));
                builder.show();
                return;
            }
            this.f460b.f6110bL.m4936a(this.f460b.f6165dk, "/SD/rustedWarfare/maps/" + obj + ".tmx");
        }

        /* renamed from: com.corrodinggames.rts.appFramework.g$4$1 */
        /* loaded from: game-lib.jar:com/corrodinggames/rts/appFramework/g$4$1.class */
        class DialogInterface$OnClickListenerC01091 implements DialogInterface.OnClickListener {

            /* renamed from: a */
            final /* synthetic */ String f462a;

            DialogInterface$OnClickListenerC01091(String str) {
                this.f462a = str;
            }

            public void onClick(DialogInterface dialogInterface, int i) {
                ActivityC0097g.m5224b(ActivityC0097g.this, this.f462a);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.corrodinggames.rts.appFramework.g$5 */
    /* loaded from: game-lib.jar:com/corrodinggames/rts/appFramework/g$5.class */
    public class DialogInterface$OnClickListenerC01105 implements DialogInterface.OnClickListener {
        DialogInterface$OnClickListenerC01105() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
        }
    }

    /* renamed from: f */
    private void m5221f(String str) {
        LoggerMaybe m1079A = LoggerMaybe.m1079A();
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Save Game");
        builder.setMessage("Enter a name to save the game under");
        EditText editText = new EditText(this);
        if (str == null) {
            editText.setText(m1079A.m1012ak() + " (" + C0758f.m2130a("d MMM yyyy").replace(".", VariableScope.nullOrMissingString) + " " + C0758f.m2130a("HH.mm.ss") + ")");
        } else {
            editText.setText(str);
        }
        builder.setView(editText);
        builder.setPositiveButton("Ok", new DialogInterface$OnClickListenerC01116(editText));
        builder.setNegativeButton("Cancel", new DialogInterface$OnClickListenerC01137());
        builder.show();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.corrodinggames.rts.appFramework.g$6 */
    /* loaded from: game-lib.jar:com/corrodinggames/rts/appFramework/g$6.class */
    public class DialogInterface$OnClickListenerC01116 implements DialogInterface.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ EditText f465a;

        DialogInterface$OnClickListenerC01116(EditText editText) {
            this.f465a = editText;
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            String obj = this.f465a.getText().toString();
            if (obj.contains("/") || obj.contains("\\") || obj.contains(":") || obj.contains("*") || obj.contains("?") || obj.contains("\"") || obj.contains("<") || obj.contains(">")) {
                AlertDialog.Builder builder = new AlertDialog.Builder(ActivityC0097g.this);
                builder.setTitle("Bad Save Name");
                builder.setMessage("The characters /\\:*?\"<> are not allowed (fat32 formatting)");
                builder.setPositiveButton("Ok", new DialogInterface$OnClickListenerC01121(obj));
                builder.show();
                return;
            }
            ActivityC0097g.this.m5223d(obj);
        }

        /* renamed from: com.corrodinggames.rts.appFramework.g$6$1 */
        /* loaded from: game-lib.jar:com/corrodinggames/rts/appFramework/g$6$1.class */
        class DialogInterface$OnClickListenerC01121 implements DialogInterface.OnClickListener {

            /* renamed from: a */
            final /* synthetic */ String f467a;

            DialogInterface$OnClickListenerC01121(String str) {
                this.f467a = str;
            }

            public void onClick(DialogInterface dialogInterface, int i) {
                ActivityC0097g.m5226a(ActivityC0097g.this, this.f467a);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.corrodinggames.rts.appFramework.g$7 */
    /* loaded from: game-lib.jar:com/corrodinggames/rts/appFramework/g$7.class */
    public class DialogInterface$OnClickListenerC01137 implements DialogInterface.OnClickListener {
        DialogInterface$OnClickListenerC01137() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
        }
    }

    /* renamed from: d */
    public void m5223d(String str) {
        m5619a(0);
        RunnableC0116h runnableC0116h = new RunnableC0116h(this);
        runnableC0116h.f472a = str;
        new Thread(runnableC0116h).start();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.corrodinggames.rts.appFramework.g$8 */
    /* loaded from: game-lib.jar:com/corrodinggames/rts/appFramework/g$8.class */
    public class RunnableC01148 implements Runnable {
        RunnableC01148() {
        }

        public void run() {
            ActivityC0097g.m5227a(ActivityC0097g.this);
        }
    }

    /* renamed from: l */
    public void m5220l() {
        this.f440d.m5414a(new RunnableC01148());
    }

    /* renamed from: n */
    private void m5219n() {
        try {
            mo5609a(new Intent("android.intent.action.VIEW", Uri.parse("market://details?id=com.corrodinggames.rts")));
        } catch (ActivityNotFoundException e) {
            Toast.makeText(mo5600g(), "Failed to open Android Market", 0).show();
        }
    }

    /* renamed from: m */
    public void mo117m() {
    }
}
