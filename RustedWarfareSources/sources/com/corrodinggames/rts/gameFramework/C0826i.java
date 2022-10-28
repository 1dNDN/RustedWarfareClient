package com.corrodinggames.rts.gameFramework;

import com.corrodinggames.rts.game.p012b.C0173b;
import com.corrodinggames.rts.gameFramework.p041i.C0879n;
import java.lang.Thread;

/* renamed from: com.corrodinggames.rts.gameFramework.i */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/i.class */
public class C0826i implements Thread.UncaughtExceptionHandler {

    /* renamed from: a */
    private Thread.UncaughtExceptionHandler f5469a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0826i(Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
        this.f5469a = uncaughtExceptionHandler;
    }

    public synchronized void uncaughtException(Thread thread, Throwable th) {
        Core core = null;
        try {
            Core.f6220dP = null;
            Core.f6221dQ = null;
            Core.f6178dO = null;
            System.gc();
            try {
                Core.LogDebug2("uncaughtException start");
                core = Core.m1087A();
                if (core != null && (th instanceof OutOfMemoryError)) {
                    Core.LogDebug2("Freeing memory");
                    try {
                        C0173b.f830al = null;
                        if (core.f6110bL != null) {
                            core.f6110bL = null;
                        }
                        if (core.f6112bN != null) {
                            core.f6112bN.m2701i();
                            core.f6112bN = null;
                        }
                        System.gc();
                        Core.LogDebug2("uncaughtException: Memory freed");
                    } catch (Throwable th2) {
                        Core.LogDebug2("exception freeing memory");
                        th2.printStackTrace();
                    }
                }
                Core.m1041a("gameEngine:uncaughtExceptionHandler", th);
                String m1039a = Core.m1039a(th);
                boolean z = false;
                boolean z2 = false;
                if (core != null) {
                    SettingsEngine settingsEngine = core.settingEngine;
                    if (settingsEngine != null) {
                        z = settingsEngine.sendReports;
                    } else {
                        Core.LogDebug2("CustomExceptionHandler: no settings");
                    }
                } else {
                    Core.LogDebug2("CustomExceptionHandler: no game");
                }
                if (Core.f6219dN) {
                    Core.LogDebug2("CustomExceptionHandler: a crash was already sent");
                    z = false;
                    z2 = true;
                }
                Core.f6219dN = true;
                if (z) {
                    try {
                        Core.LogDebug2("Starting errorReport");
                        C0879n.m1275a("uncaughtException", m1039a);
                        Core.LogDebug2("waiting");
                        Thread.sleep(800L);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                if (!z2 && core != null && core.f6279dG != null) {
                    core.f6279dG.mo107a(th);
                }
                Core.m978e("fatal", m1039a);
            } catch (Exception e2) {
                Core.LogDebug2("exception sending crash");
                e2.printStackTrace();
            }
            if (core != null) {
                if (core.f6279dG != null && core.f6279dG.m748a()) {
                    Core.LogDebug2("gameCrashesDontExit=true");
                    if (1 == 0) {
                        Core.LogDebug2("Crash was not handled, exiting");
                        Runtime.getRuntime().halt(1);
                        return;
                    }
                    return;
                } else if (core.f6122bX != null && core.f6122bX.lock1) {
                    Core.LogDebug2("Sending disconnect");
                    core.f6122bX.m1523c("Game crash");
                }
            }
            if (!Core.f6084az) {
                if (this.f5469a != null) {
                    Core.LogDebug2("CustomExceptionHandler: sending to: defaultUEH.uncaughtException");
                    this.f5469a.uncaughtException(thread, th);
                    Core.LogDebug2("CustomExceptionHandler: back from: defaultUEH.uncaughtException");
                } else {
                    Core.LogDebug2("CustomExceptionHandler: defaultUEH==null");
                    System.exit(2);
                }
            }
            Core.f6082av = th;
            if (1 == 0) {
                Core.LogDebug2("Crash was not handled, exiting");
                Runtime.getRuntime().halt(1);
            }
        } catch (Throwable th3) {
            try {
                Core.LogDebug2("Exception in uncaughtException");
                th3.printStackTrace();
                if (0 == 0) {
                    Core.LogDebug2("Crash was not handled, exiting");
                    Runtime.getRuntime().halt(1);
                }
            } catch (Throwable th4) {
                if (0 == 0) {
                    Core.LogDebug2("Crash was not handled, exiting");
                    Runtime.getRuntime().halt(1);
                }
                throw th4;
            }
        }
    }
}
