package com.corrodinggames.rts.p008a;

import com.corrodinggames.librocket.scripts.ScriptEngine;
import com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope;
import com.corrodinggames.rts.gameFramework.LoggerMaybe;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;

/* renamed from: com.corrodinggames.rts.a.a */
/* loaded from: game-lib.jar:com/corrodinggames/rts/a/a.class */
public class RunnableC0069a implements Runnable {

    /* renamed from: a */
    public ServerSocket f386a;

    /* renamed from: b */
    public boolean f387b = true;

    /* renamed from: c */
    public static boolean f388c = false;

    /* renamed from: d */
    public static boolean f389d = false;

    /* renamed from: e */
    static ArrayList f390e = new ArrayList();

    /* renamed from: a */
    public static boolean m5294a() {
        return f388c;
    }

    /* renamed from: a */
    public static void m5292a(String str) {
        f388c = true;
        f390e.add(str);
    }

    /* renamed from: b */
    public static void m5291b() {
        if (f390e.size() == 0) {
            return;
        }
        new Thread(new RunnableC00701()).start();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.corrodinggames.rts.a.a$1 */
    /* loaded from: game-lib.jar:com/corrodinggames/rts/a/a$1.class */
    public final class RunnableC00701 implements Runnable {
        RunnableC00701() {
        }

        public void run() {
            Iterator it = RunnableC0069a.f390e.iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                LoggerMaybe.LogDebug2("Running debug script:" + str);
                try {
                    FileReader fileReader = new FileReader(str);
                    BufferedReader bufferedReader = new BufferedReader(fileReader);
                    while (true) {
                        String readLine = bufferedReader.readLine();
                        if (readLine == null) {
                            break;
                        }
                        String trim = readLine.trim();
                        if (!trim.equals(VariableScope.nullOrMissingString) && !trim.startsWith("#")) {
                            LoggerMaybe.LogDebug2("Running: " + trim);
                            LoggerMaybe.LogDebug2("got: " + RunnableC0069a.m5290b("script " + trim).trim());
                        }
                    }
                    bufferedReader.close();
                    fileReader.close();
                    LoggerMaybe.LogDebug2("End of:" + str);
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }

    /* renamed from: a */
    public static void m5293a(int i, String str) {
        try {
            f388c = true;
            LoggerMaybe.f6204aT = true;
            RunnableC0069a runnableC0069a = new RunnableC0069a();
            if (i != -1) {
                runnableC0069a.f386a = new ServerSocket(i);
                new Thread(runnableC0069a).start();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private RunnableC0069a() {
    }

    public void run() {
        while (this.f387b) {
            try {
                Socket accept = this.f386a.accept();
                try {
                    accept.setTcpNoDelay(true);
                    new Thread(new RunnableC0086b(this, accept)).run();
                } catch (IOException e) {
                    LoggerMaybe.LogDebug2("Got IOException on debugSocket connection");
                    e.printStackTrace();
                    throw new RuntimeException(e);
                }
            } catch (IOException e2) {
                throw new RuntimeException(e2);
            }
        }
    }

    /* renamed from: b */
    public static String m5290b(String str) {
        String waitForCompletionOrCrash;
        String str2 = null;
        int indexOf = str.indexOf(" ");
        if (indexOf == -1) {
            indexOf = str.length();
        }
        String lowerCase = str.substring(0, indexOf).toLowerCase(Locale.ENGLISH);
        if (indexOf != -1 && str.length() >= indexOf + 1) {
            str2 = str.substring(indexOf + 1);
            str2.split(" ");
        }
        if (ScriptEngine.getInstance() == null) {
            LoggerMaybe.m990b("DebugSocketConnection: waiting for ScriptEngine to start....");
            int i = 0;
            while (true) {
                if (i >= 100) {
                    break;
                } else if (ScriptEngine.getInstance() != null) {
                    LoggerMaybe.m990b("started");
                    break;
                } else {
                    try {
                        Thread.sleep(100L);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    i++;
                }
            }
        }
        if (lowerCase.equalsIgnoreCase("ping")) {
            return "pong";
        }
        if (lowerCase.equalsIgnoreCase("crash")) {
            throw new RuntimeException("test crash");
        }
        if (lowerCase.equalsIgnoreCase("script")) {
            if (str2 == null) {
                return "argString==null";
            }
            String waitForCompletionOrCrash2 = ScriptEngine.getInstance().addScriptToQueue(str2).waitForCompletionOrCrash(false);
            if (waitForCompletionOrCrash2 == null) {
                return "done";
            }
            return waitForCompletionOrCrash2;
        } else if (lowerCase.equalsIgnoreCase("function") || lowerCase.equalsIgnoreCase("functionNoTimeout")) {
            if (str2 == null) {
                return "argString==null";
            }
            ScriptEngine scriptEngine = ScriptEngine.getInstance();
            C00712 c00712 = new C00712(scriptEngine, str2);
            ScriptEngine.Action addRunnableToQueue = scriptEngine.addRunnableToQueue(c00712);
            addRunnableToQueue.tryToCatchCrash = true;
            boolean z = false;
            if (lowerCase.equalsIgnoreCase("functionNoTimeout")) {
                z = true;
            }
            if (addRunnableToQueue.waitForCompletionOrCrash(z) == null) {
                return (c00712.f420c == null ? "ok\n<NULL>" : "ok\n" + VariableScope.nullOrMissingString + c00712.f420c) + "��";
            }
            return ("crash\n" + waitForCompletionOrCrash) + "��";
        } else {
            return "unknown command";
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.corrodinggames.rts.a.a$2 */
    /* loaded from: game-lib.jar:com/corrodinggames/rts/a/a$2.class */
    public final class C00712 extends AbstractRunnableC0087c {

        /* renamed from: a */
        final /* synthetic */ ScriptEngine f391a;

        /* renamed from: b */
        final /* synthetic */ String f392b;

        C00712(ScriptEngine scriptEngine, String str) {
            this.f391a = scriptEngine;
            this.f392b = str;
        }

        public void run() {
            try {
                ScriptEngine.inDebugScript = true;
                this.f420c = this.f391a.processArg(this.f392b);
                ScriptEngine.inDebugScript = false;
            } catch (Throwable th) {
                ScriptEngine.inDebugScript = false;
                throw th;
            }
        }
    }
}
