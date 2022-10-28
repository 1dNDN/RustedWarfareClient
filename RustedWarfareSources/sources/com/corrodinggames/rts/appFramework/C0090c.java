package com.corrodinggames.rts.appFramework;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.p003os.Handler;
import android.p003os.Looper;
import android.support.p004v4.app.ActivityCompat;
import android.support.p004v4.content.ContextCompat;
import android.widget.Toast;
import com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope;
import com.corrodinggames.rts.gameFramework.C0758f;
import com.corrodinggames.rts.gameFramework.LoggerMaybe;
import com.corrodinggames.rts.gameFramework.p036e.C0750a;
import com.corrodinggames.rts.gameFramework.p039g.C0820a;
import java.io.File;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: com.corrodinggames.rts.appFramework.c */
/* loaded from: game-lib.jar:com/corrodinggames/rts/appFramework/c.class */
public class C0090c {

    /* renamed from: a */
    static Handler f422a;

    /* renamed from: b */
    static volatile Context f423b;

    /* renamed from: c */
    public static final EnumC0095e f424c = EnumC0095e.dynamicDefault;

    /* renamed from: d */
    public static EnumC0095e f425d = f424c;

    /* renamed from: a */
    public static int m5235a(String str) {
        String[] split;
        String str2 = null;
        if (str != null) {
            str2 = C0758f.m2038k(str);
        }
        if (str2 != null) {
            Matcher matcher = Pattern.compile("^ *\\[([^\\]]*)\\].*").matcher(str2);
            if (matcher.matches()) {
                for (String str3 : matcher.group(1).split(";")) {
                    if (str3.startsWith("p") && str3.length() >= 2) {
                        String substring = str3.substring(1);
                        try {
                            return Integer.parseInt(substring);
                        } catch (NumberFormatException e) {
                            LoggerMaybe.LogDebug2("getNumberOfPlayersInMap: NumberFormatException:" + substring);
                            return -1;
                        }
                    }
                }
            }
        }
        LoggerMaybe.LogDebug2("getNumberOfPlayersInMap: fail to match:" + str2);
        return -1;
    }

    /* renamed from: b */
    public static String m5232b(String str) {
        if (str == null) {
            return null;
        }
        if (str.contains(File.separator)) {
            String[] split = str.split(Pattern.quote(File.separator));
            str = split[split.length - 1];
        }
        if (str.contains("/")) {
            String[] split2 = str.split("/");
            str = split2[split2.length - 1];
        }
        String str2 = null;
        if (0 == 0) {
            Matcher matcher = Pattern.compile("^l\\d*;\\[.*\\](.+)\\.tmx").matcher(str);
            if (matcher.matches()) {
                str2 = matcher.group(1);
                if (str2.length() >= 1) {
                    str2 = str2.substring(0, 1).toUpperCase() + str2.substring(1);
                }
            }
        }
        if (str2 == null) {
            Matcher matcher2 = Pattern.compile("^l\\d*;(.+)\\.tmx").matcher(str);
            if (matcher2.matches()) {
                str2 = matcher2.group(1);
                if (str2.length() >= 1) {
                    str2 = str2.substring(0, 1).toUpperCase() + str2.substring(1);
                }
            }
        }
        if (str2 == null) {
            Matcher matcher3 = Pattern.compile("^ *\\[.*\\](.+)\\.tmx").matcher(str);
            if (matcher3.matches()) {
                str2 = matcher3.group(1);
                if (str2.length() >= 1) {
                    str2 = str2.substring(0, 1).toUpperCase() + str2.substring(1);
                }
            }
        }
        if (str2 == null) {
            Matcher matcher4 = Pattern.compile("(.*)\\.tmx").matcher(str);
            if (matcher4.matches()) {
                str2 = matcher4.group(1);
                if (str2.length() >= 1) {
                    str2 = str2.substring(0, 1).toUpperCase() + str2.substring(1);
                }
            }
        }
        if (str2 == null) {
            str2 = str;
        }
        String replace = str2.replace('_', ' ');
        if (replace.endsWith(".rwsave")) {
            replace = replace.replace(".rwsave", VariableScope.nullOrMissingString);
        }
        return replace;
    }

    /* renamed from: c */
    public static String m5230c(String str) {
        return str.replace(".tmx", VariableScope.nullOrMissingString) + "_map.png";
    }

    /* renamed from: c */
    private static void m5231c(Activity activity) {
        if (Build.VERSION.SDK_INT >= 19) {
            activity.m5620a().getDecorView().setSystemUiVisibility(5894);
        }
    }

    /* renamed from: d */
    private static void m5229d(Activity activity) {
    }

    /* renamed from: a */
    public static void m5236a(Runnable runnable) {
        if (f422a == null) {
            f422a = new Handler(Looper.m5404b());
        }
        f422a.m5414a(runnable);
    }

    /* renamed from: a */
    public static Context m5245a() {
        if (f423b == null) {
            throw new RuntimeException("ApplicationContext==null");
        }
        return f423b;
    }

    /* renamed from: a */
    public static void m5244a(Activity activity) {
        if (f423b == null) {
            f423b = activity.mo5600g();
        }
    }

    /* renamed from: a */
    public static void m5238a(Context context) {
        if (f423b == null) {
            f423b = context.mo5600g();
        }
    }

    /* renamed from: a */
    public static void m5239a(Activity activity, boolean z, boolean z2) {
        m5244a(activity);
        if (z2) {
            LoggerMaybe m1079A = LoggerMaybe.m1079A();
            if (m1079A != null && m1079A.f6115bQ.immersiveFullScreen) {
                m5231c(activity);
            }
        } else {
            m5229d(activity);
        }
        LoggerMaybe m1079A2 = LoggerMaybe.m1079A();
        if (m1079A2 != null) {
            m1079A2.m1022aa();
        }
        if (z) {
            activity.m5620a().setBackgroundDrawable(null);
        }
    }

    /* renamed from: a */
    public static void m5240a(Activity activity, boolean z) {
        if (z) {
            activity.m5618a(0, 0);
        }
    }

    /* renamed from: a */
    public static boolean m5242a(Activity activity, Runnable runnable) {
        LoggerMaybe.m1079A();
        if (m5241a(activity, runnable, false)) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static boolean m5241a(Activity activity, Runnable runnable, boolean z) {
        LoggerMaybe m1079A = LoggerMaybe.m1079A();
        if ((!z && m1079A.f6115bQ.hasSelectedAStorageType) || Build.VERSION.SDK_INT < 19) {
            return false;
        }
        DialogInterface$OnClickListenerC00911 dialogInterface$OnClickListenerC00911 = new DialogInterface$OnClickListenerC00911(m1079A, runnable);
        DialogInterface$OnClickListenerC00922 dialogInterface$OnClickListenerC00922 = new DialogInterface$OnClickListenerC00922(activity, m1079A, runnable);
        String m1689a = C0820a.m1689a("menus.mods.androidStorageSetupTitle", new Object[0]);
        String m1689a2 = C0820a.m1689a("menus.mods.androidStorageSetupMessage", new Object[0]);
        String m1689a3 = C0820a.m1689a("menus.mods.androidStorageSetupInternal", new Object[0]);
        new AlertDialog.Builder(activity).setIcon(17301543).setTitle(m1689a).setMessage(m1689a2).setPositiveButton(m1689a3, dialogInterface$OnClickListenerC00911).setNeutralButton(C0820a.m1689a("menus.mods.androidStorageSetupExternal", new Object[0]), dialogInterface$OnClickListenerC00922).show();
        LoggerMaybe.LogDebug2("Showing storage setup");
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.corrodinggames.rts.appFramework.c$1 */
    /* loaded from: game-lib.jar:com/corrodinggames/rts/appFramework/c$1.class */
    public final class DialogInterface$OnClickListenerC00911 implements DialogInterface.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ LoggerMaybe f426a;

        /* renamed from: b */
        final /* synthetic */ Runnable f427b;

        DialogInterface$OnClickListenerC00911(LoggerMaybe loggerMaybe, Runnable runnable) {
            this.f426a = loggerMaybe;
            this.f427b = runnable;
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            this.f426a.f6115bQ.storageType = 1;
            this.f426a.f6115bQ.hasSelectedAStorageType = true;
            C0750a.m2237b();
            this.f426a.f6115bQ.save();
            if (this.f427b != null) {
                this.f427b.run();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.corrodinggames.rts.appFramework.c$2 */
    /* loaded from: game-lib.jar:com/corrodinggames/rts/appFramework/c$2.class */
    public final class DialogInterface$OnClickListenerC00922 implements DialogInterface.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ Activity f428a;

        /* renamed from: b */
        final /* synthetic */ LoggerMaybe f429b;

        /* renamed from: c */
        final /* synthetic */ Runnable f430c;

        DialogInterface$OnClickListenerC00922(Activity activity, LoggerMaybe loggerMaybe, Runnable runnable) {
            this.f428a = activity;
            this.f429b = loggerMaybe;
            this.f430c = runnable;
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            if (!C0750a.m2238a(true).f4871b) {
                LoggerMaybe.LogDebug2("Storage setup: Not using SAF, not showing setup folder popup");
                if (C0090c.m5234b(this.f428a)) {
                    this.f429b.f6115bQ.storageType = 2;
                    this.f429b.f6115bQ.hasSelectedAStorageType = true;
                    C0750a.m2237b();
                    this.f429b.f6115bQ.save();
                }
            } else if (this.f428a instanceof ActivityC0133s) {
                LoggerMaybe.LogDebug2("Storage setup: Already on settings page");
                ((ActivityC0133s) this.f428a).m5179l();
            } else {
                Intent intent = new Intent(this.f428a, ActivityC0133s.class);
                intent.putExtra("mode", "setupExternalFolder");
                C0090c.m5237a(intent);
                this.f428a.mo5609a(intent);
                if (this.f428a instanceof ActivityC0089b) {
                    if (this.f430c != null) {
                        ((ActivityC0089b) this.f428a).m5246a(new RunnableC00931());
                        return;
                    }
                    return;
                }
                LoggerMaybe.m990b("context not instance CommonActivity");
            }
        }

        /* renamed from: com.corrodinggames.rts.appFramework.c$2$1 */
        /* loaded from: game-lib.jar:com/corrodinggames/rts/appFramework/c$2$1.class */
        class RunnableC00931 implements Runnable {
            RunnableC00931() {
            }

            public void run() {
                if (DialogInterface$OnClickListenerC00922.this.f429b.f6115bQ.hasSelectedAStorageType) {
                    DialogInterface$OnClickListenerC00922.this.f430c.run();
                }
            }
        }
    }

    /* renamed from: b */
    public static boolean m5233b(Context context) {
        if (LoggerMaybe.f6205aU || !C0750a.m2225f() || Build.VERSION.SDK_INT < 23 || ContextCompat.m5376a(context, "android.permission.WRITE_EXTERNAL_STORAGE") == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public static boolean m5234b(Activity activity) {
        LoggerMaybe m1079A = LoggerMaybe.m1079A();
        if (!LoggerMaybe.f6205aU && C0750a.m2225f() && Build.VERSION.SDK_INT >= 23) {
            if (m1079A.m1025aC() == null) {
            }
            if (ContextCompat.m5376a(activity, "android.permission.WRITE_EXTERNAL_STORAGE") == 0) {
                m1079A.f6115bQ.hadStoragePermissionInPast = true;
                LoggerMaybe.LogDebug2("File Permission is granted");
                return true;
            }
            LoggerMaybe.LogDebug2("Permission is revoked");
            ActivityCompat.m5377a(activity, new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}, 1);
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static void m5237a(Intent intent) {
        intent.addFlags(65536);
    }

    /* renamed from: a */
    public static void m5243a(Activity activity, int i, boolean z, String str, Uri uri) {
        LoggerMaybe.LogDebug2("Show folder chooser. Write:" + z);
        Intent intent = new Intent("android.intent.action.OPEN_DOCUMENT_TREE");
        intent.addFlags(64);
        intent.addFlags(1);
        if (z) {
            intent.addFlags(2);
        }
        if (uri != null) {
            intent.putExtra("android.provider.extra.INITIAL_URI", uri);
        }
        intent.putExtra("android.content.extra.SHOW_ADVANCED", true);
        try {
            activity.m5616a(Intent.createChooser(intent, str), i);
        } catch (ActivityNotFoundException e) {
            Toast.makeText(activity, "Failed to open file list. Please install a File Manager.", 0).show();
        }
    }
}
