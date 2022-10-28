package com.corrodinggames.librocket;

import android.app.Activity;
import com.corrodinggames.librocket.scripts.Root;
import com.corrodinggames.librocket.scripts.ScriptEngine;
import com.corrodinggames.rts.appFramework.ActivityC0117i;
import com.corrodinggames.rts.appFramework.InterfaceC0096f;
import com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope;
import com.corrodinggames.rts.gameFramework.LoggerMaybe;
import com.corrodinggames.rts.gameFramework.p039g.C0820a;
import com.corrodinggames.rts.gameFramework.p041i.C0841ae;
import com.corrodinggames.rts.gameFramework.utility.C1099k;
import com.corrodinggames.rts.gameFramework.utility.SlickToAndroidKeycodes;
import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.LinkedList;

/* renamed from: com.corrodinggames.librocket.a */
/* loaded from: game-lib.jar:com/corrodinggames/librocket/a.class */
public abstract class AbstractC0043a {

    /* renamed from: a */
    protected static AbstractC0043a f343a;

    /* renamed from: b */
    public AbstractC0048b f344b;

    /* renamed from: c */
    public InterfaceC0096f f345c;

    /* renamed from: d */
    boolean f346d = true;

    /* renamed from: f */
    public abstract void mo303f();

    /* renamed from: g */
    public abstract void mo302g();

    /* renamed from: h */
    public abstract int mo301h();

    /* renamed from: d */
    public abstract void mo304d(boolean z);

    /* renamed from: a */
    public static AbstractC0043a m5342a() {
        return f343a;
    }

    /* renamed from: a */
    public void m5340a(AbstractC0048b abstractC0048b, InterfaceC0096f interfaceC0096f) {
        this.f344b = abstractC0048b;
        this.f345c = interfaceC0096f;
    }

    /* renamed from: b */
    public void m5336b() {
        LoggerMaybe m1079A = LoggerMaybe.m1079A();
        if (m1079A != null) {
            m1079A.m1046a((Activity) null, this.f345c, true);
        } else {
            LoggerMaybe.LogDebug2("showMainMenu: game is null");
        }
        this.f344b.setDocument("mainMenu.rml");
    }

    /* renamed from: c */
    public void m5333c() {
    }

    /* renamed from: d */
    public void m5331d() {
        this.f344b.setDocument("settings.rml");
    }

    /* renamed from: a */
    public synchronized void m5337a(boolean z) {
        this.f346d = z;
        m5330e();
    }

    /* renamed from: e */
    public synchronized void m5330e() {
        LoggerMaybe m1079A = LoggerMaybe.m1079A();
        if (m1079A == null) {
            LoggerMaybe.m990b("Main::resumeGame(): game==null");
            return;
        }
        m1079A.f6107bD = true;
        m1079A.m1046a((Activity) null, this.f345c, this.f346d);
    }

    /* renamed from: b */
    public synchronized void m5334b(boolean z) {
        LoggerMaybe m1079A = LoggerMaybe.m1079A();
        if (!z) {
            LoggerMaybe.LogDebug2("endGame: queDisconnectAndWait");
            m1079A.f6122bX.m1420u();
            return;
        }
        LoggerMaybe.LogDebug2("endGame: network disconnect");
        m1079A.f6122bX.m1493b("shutdownServer");
    }

    /* renamed from: a */
    public synchronized void m5338a(String str) {
        m5334b(true);
        LoggerMaybe.m1079A();
        this.f346d = false;
        ActivityC0117i.m5217a(str, false, 8, 0, true, false);
        m5330e();
    }

    /* renamed from: c */
    public void m5332c(boolean z) {
        this.f346d = z;
    }

    /* renamed from: i */
    public boolean m5329i() {
        if (this.f344b != null && !this.f344b.m5313b()) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public void m5341a(int i, char c) {
        int m727b = SlickToAndroidKeycodes.m727b(i);
        if (m5329i()) {
            Integer m725c = SlickToAndroidKeycodes.m725c(i);
            Object m5310b = this.f344b.m5310b("event_onkeydown");
            if (m5310b != null) {
                ScriptEngine.getInstance().addScriptToQueue(m5310b + "(" + m727b + ");");
                if (this.f344b.m5308c() != null) {
                    return;
                }
            }
            if (c > 255) {
                ScriptEngine.getInstance().addRunnableToQueue(new RunnableC00441());
            }
            if (i == 30 && mo301h() == 1) {
                this.f344b.processKeyDown(93, 0);
                this.f344b.processKeyUp(93, 0);
                this.f344b.processKeyDown(91, 2);
                this.f344b.processKeyUp(91, 2);
                return;
            } else if (i == 46 && mo301h() == 1) {
                this.f344b.processKeyDown(14, 1);
                return;
            } else if (i == 47 && mo301h() == 1) {
                this.f344b.processKeyDown(33, 1);
                return;
            } else {
                if (m725c != null) {
                    this.f344b.processKeyDown(m725c.intValue(), mo301h());
                } else if (c != 0) {
                    if (Character.isISOControl(c)) {
                        if (c == '\b') {
                            LoggerMaybe.LogDebug2("backspace char pressed");
                            this.f344b.processKeyDown(69, 0);
                            this.f344b.processKeyUp(69, 0);
                        } else {
                            LoggerMaybe.LogDebug2("keyPressed skipping isISOControl:" + i + " c:" + ((int) c) + " c_print:" + c);
                        }
                    } else {
                        this.f344b.processTextInputChar(c);
                    }
                }
                if (i == 28 || i == 156) {
                    ScriptEngine.getInstance().addScriptToQueue("onEnter();");
                } else if (c == '\r') {
                    LoggerMaybe.LogDebug2("keyPressed: new line entered");
                    ScriptEngine.getInstance().addScriptToQueue("onEnter();");
                }
                if (i == 1) {
                    ScriptEngine.getInstance().addScriptToQueue("onEscape();");
                    return;
                }
                return;
            }
        }
        LoggerMaybe m1079A = LoggerMaybe.m1079A();
        if (m1079A != null) {
            m1079A.m992b(m727b, true);
            if (i == 1) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.corrodinggames.librocket.a$1 */
    /* loaded from: game-lib.jar:com/corrodinggames/librocket/a$1.class */
    public class RunnableC00441 implements Runnable {
        RunnableC00441() {
        }

        public void run() {
            AbstractC0043a.this.f344b.f358c.getRoot().event_unicodeEntered();
        }
    }

    /* renamed from: j */
    public LinkedList m5328j() {
        return null;
    }

    /* renamed from: b */
    public boolean m5335b(String str) {
        try {
            if (Desktop.isDesktopSupported() && Desktop.getDesktop().isSupported(Desktop.Action.BROWSE)) {
                try {
                    LoggerMaybe.LogDebug2("Opening link from desktop api");
                    Desktop.getDesktop().browse(new URI(str));
                    return true;
                } catch (IOException e) {
                    e.printStackTrace();
                } catch (URISyntaxException e2) {
                    e2.printStackTrace();
                }
            } else {
                String lowerCase = System.getProperty("os.name").toLowerCase();
                String[] strArr = null;
                if (lowerCase.contains("win")) {
                    strArr = new String[]{"rundll32", "url.dll,FileProtocolHandler", str};
                }
                if (lowerCase.contains("mac")) {
                    strArr = new String[]{"open", str};
                }
                if (lowerCase.contains("nix") || lowerCase.contains("nux")) {
                    strArr = new String[]{"xdg-open", str};
                }
                if (strArr != null) {
                    try {
                        Runtime.getRuntime().exec(strArr);
                        return true;
                    } catch (IOException e3) {
                        e3.printStackTrace();
                    }
                }
                return false;
            }
        } catch (RuntimeException e4) {
            e4.printStackTrace();
            return false;
        }
        e4.printStackTrace();
        return false;
    }

    /* renamed from: k */
    public void m5327k() {
    }

    /* renamed from: l */
    public void m5326l() {
    }

    /* renamed from: m */
    public void m5325m() {
    }

    /* renamed from: n */
    public void m5324n() {
        ScriptEngine scriptEngine;
        if (!LoggerMaybe.m1079A().f6122bX.f5539bm && (scriptEngine = ScriptEngine.getInstance()) != null) {
            scriptEngine.addScriptToQueue("mp.closeBattleroomIfOpen()");
        }
    }

    /* renamed from: a */
    public void m5339a(C0841ae c0841ae) {
        LoggerMaybe.m1079A();
        ScriptEngine scriptEngine = ScriptEngine.getInstance();
        if (scriptEngine != null) {
            scriptEngine.addRunnableToQueue(new RunnableC00452(scriptEngine, c0841ae));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.corrodinggames.librocket.a$2 */
    /* loaded from: game-lib.jar:com/corrodinggames/librocket/a$2.class */
    public class RunnableC00452 implements Runnable {

        /* renamed from: a */
        final C1099k f348a = new C1099k(false);

        /* renamed from: b */
        final /* synthetic */ ScriptEngine f349b;

        /* renamed from: c */
        final /* synthetic */ C0841ae f350c;

        RunnableC00452(ScriptEngine scriptEngine, C0841ae c0841ae) {
            this.f349b = scriptEngine;
            this.f350c = c0841ae;
        }

        public void run() {
            Root root = this.f349b.getRoot();
            C0051e c0051e = new C0051e(this.f350c.f5645f != null ? this.f350c.f5645f : "Join", new RunnableC00461(root));
            c0051e.f385c = true;
            RunnableC00472 runnableC00472 = new RunnableC00472(root);
            C0051e c0051e2 = new C0051e(this.f350c.f5646g != null ? this.f350c.f5646g : "Close", runnableC00472);
            String str = "Password Required";
            String str2 = "This server requires a password to join";
            if (this.f350c.f5641b != null) {
                str = "Server Question";
                str2 = C0820a.m1685c(this.f350c.f5641b);
            }
            if (this.f350c.f5644e != null) {
                str = this.f350c.f5644e;
            }
            C0050d c0050d = new C0050d();
            c0050d.f375b = str;
            c0050d.f376c = str2;
            c0050d.f377d = VariableScope.nullOrMissingString;
            c0050d.f378e = c0051e2;
            c0050d.f379f = c0051e;
            c0050d.f381h = false;
            c0050d.f382i = runnableC00472;
            AbstractC0043a.this.f344b.m5320a(c0050d);
        }

        /* renamed from: com.corrodinggames.librocket.a$2$1 */
        /* loaded from: game-lib.jar:com/corrodinggames/librocket/a$2$1.class */
        class RunnableC00461 implements Runnable {

            /* renamed from: a */
            final /* synthetic */ Root f352a;

            RunnableC00461(Root root) {
                this.f352a = root;
            }

            public void run() {
                if (RunnableC00452.this.f348a.f6887a) {
                    LoggerMaybe.m990b("AskPasswordCallBack already called");
                    return;
                }
                RunnableC00452.this.f348a.f6887a = true;
                String popupText = this.f352a.getPopupText();
                this.f352a.closeAlertOnly();
                RunnableC00452.this.f350c.mo3109a(popupText);
            }
        }

        /* renamed from: com.corrodinggames.librocket.a$2$2 */
        /* loaded from: game-lib.jar:com/corrodinggames/librocket/a$2$2.class */
        class RunnableC00472 implements Runnable {

            /* renamed from: a */
            final /* synthetic */ Root f354a;

            RunnableC00472(Root root) {
                this.f354a = root;
            }

            public void run() {
                if (RunnableC00452.this.f348a.f6887a) {
                    LoggerMaybe.m990b("AskPasswordCallBack already called");
                    return;
                }
                RunnableC00452.this.f348a.f6887a = true;
                this.f354a.closeAlertOnly();
                RunnableC00452.this.f350c.mo3110a();
            }
        }
    }
}
