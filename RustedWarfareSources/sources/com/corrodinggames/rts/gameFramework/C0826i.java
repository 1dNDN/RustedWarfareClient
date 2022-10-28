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
        LoggerMaybe loggerMaybe = null;
        try {
            LoggerMaybe.f6220dP = null;
            LoggerMaybe.f6221dQ = null;
            LoggerMaybe.f6178dO = null;
            System.gc();
            try {
                LoggerMaybe.LogDebug2("uncaughtException start");
                loggerMaybe = LoggerMaybe.m1079A();
                if (loggerMaybe != null && (th instanceof OutOfMemoryError)) {
                    LoggerMaybe.LogDebug2("Freeing memory");
                    try {
                        C0173b.f830al = null;
                        if (loggerMaybe.f6110bL != null) {
                            loggerMaybe.f6110bL = null;
                        }
                        if (loggerMaybe.f6112bN != null) {
                            loggerMaybe.f6112bN.m2653i();
                            loggerMaybe.f6112bN = null;
                        }
                        System.gc();
                        LoggerMaybe.LogDebug2("uncaughtException: Memory freed");
                    } catch (Throwable th2) {
                        LoggerMaybe.LogDebug2("exception freeing memory");
                        th2.printStackTrace();
                    }
                }
                LoggerMaybe.m1033a("gameEngine:uncaughtExceptionHandler", th);
                String m1031a = LoggerMaybe.m1031a(th);
                boolean z = false;
                boolean z2 = false;
                if (loggerMaybe != null) {
                    SettingsEngine settingsEngine = loggerMaybe.f6115bQ;
                    if (settingsEngine != null) {
                        z = settingsEngine.sendReports;
                    } else {
                        LoggerMaybe.LogDebug2("CustomExceptionHandler: no settings");
                    }
                } else {
                    LoggerMaybe.LogDebug2("CustomExceptionHandler: no game");
                }
                if (LoggerMaybe.f6219dN) {
                    LoggerMaybe.LogDebug2("CustomExceptionHandler: a crash was already sent");
                    z = false;
                    z2 = true;
                }
                LoggerMaybe.f6219dN = true;
                if (z) {
                    try {
                        LoggerMaybe.LogDebug2("Starting errorReport");
                        C0879n.m1262a("uncaughtException", m1031a);
                        LoggerMaybe.LogDebug2("waiting");
                        Thread.sleep(800L);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                if (!z2 && loggerMaybe != null && loggerMaybe.f6279dG != null) {
                    loggerMaybe.f6279dG.mo113a(th);
                }
                LoggerMaybe.m970e("fatal", m1031a);
            } catch (Exception e2) {
                LoggerMaybe.LogDebug2("exception sending crash");
                e2.printStackTrace();
            }
            if (loggerMaybe != null) {
                if (loggerMaybe.f6279dG != null && loggerMaybe.f6279dG.m740a()) {
                    LoggerMaybe.LogDebug2("gameCrashesDontExit=true");
                    if (1 == 0) {
                        LoggerMaybe.LogDebug2("Crash was not handled, exiting");
                        Runtime.getRuntime().halt(1);
                        return;
                    }
                    return;
                } else if (loggerMaybe.f6122bX != null && loggerMaybe.f6122bX.lock1) {
                    LoggerMaybe.LogDebug2("Sending disconnect");
                    loggerMaybe.f6122bX.m1481c("Game crash");
                }
            }
            if (!LoggerMaybe.f6084az) {
                if (this.f5469a != null) {
                    LoggerMaybe.LogDebug2("CustomExceptionHandler: sending to: defaultUEH.uncaughtException");
                    this.f5469a.uncaughtException(thread, th);
                    LoggerMaybe.LogDebug2("CustomExceptionHandler: back from: defaultUEH.uncaughtException");
                } else {
                    LoggerMaybe.LogDebug2("CustomExceptionHandler: defaultUEH==null");
                    System.exit(2);
                }
            }
            LoggerMaybe.f6082av = th;
            if (1 == 0) {
                LoggerMaybe.LogDebug2("Crash was not handled, exiting");
                Runtime.getRuntime().halt(1);
            }
        } catch (Throwable th3) {
            try {
                LoggerMaybe.LogDebug2("Exception in uncaughtException");
                th3.printStackTrace();
                if (0 == 0) {
                    LoggerMaybe.LogDebug2("Crash was not handled, exiting");
                    Runtime.getRuntime().halt(1);
                }
            } catch (Throwable th4) {
                if (0 == 0) {
                    LoggerMaybe.LogDebug2("Crash was not handled, exiting");
                    Runtime.getRuntime().halt(1);
                }
                throw th4;
            }
        }
    }
}
