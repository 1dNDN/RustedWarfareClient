package com.corrodinggames.rts.gameFramework.utility;

import android.os.Debug;
import android.p003os.Handler;
import android.p003os.Looper;
import android.util.Log;
import com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope;

/* renamed from: com.corrodinggames.rts.gameFramework.utility.d */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/utility/d.class */
public class C1087d extends Thread {

    /* renamed from: a */
    private static final InterfaceC1091e f6858a = new InterfaceC1091e() { // from class: com.corrodinggames.rts.gameFramework.utility.d.1
        @Override // com.corrodinggames.rts.gameFramework.utility.InterfaceC1091e
        /* renamed from: a */
        public void mo563a(C1066a c1066a) {
            throw c1066a;
        }
    };

    /* renamed from: b */
    private static final InterfaceC1092f f6859b = new InterfaceC1092f() { // from class: com.corrodinggames.rts.gameFramework.utility.d.2
        @Override // com.corrodinggames.rts.gameFramework.utility.InterfaceC1092f
        /* renamed from: a */
        public void mo562a(InterruptedException interruptedException) {
            Log.m4935c("ANRWatchdog", "Interrupted: " + interruptedException.getMessage());
        }
    };

    /* renamed from: c */
    private InterfaceC1091e f6860c;

    /* renamed from: d */
    private InterfaceC1092f f6861d;

    /* renamed from: e */
    private final Handler f6862e;

    /* renamed from: f */
    private final int f6863f;

    /* renamed from: g */
    private String f6864g;

    /* renamed from: h */
    private boolean f6865h;

    /* renamed from: i */
    private boolean f6866i;

    /* renamed from: j */
    private volatile int f6867j;

    /* renamed from: k */
    private final Runnable f6868k;

    public C1087d() {
        this(5000);
    }

    public C1087d(int i) {
        this.f6860c = f6858a;
        this.f6861d = f6859b;
        this.f6862e = new Handler(Looper.m4972b());
        this.f6864g = VariableScope.nullOrMissingString;
        this.f6865h = false;
        this.f6866i = false;
        this.f6867j = 0;
        this.f6868k = new Runnable() { // from class: com.corrodinggames.rts.gameFramework.utility.d.3
            @Override // java.lang.Runnable
            public void run() {
                C1087d.this.f6867j = (C1087d.this.f6867j + 1) % Integer.MAX_VALUE;
            }
        };
        this.f6863f = i;
    }

    /* renamed from: a */
    public C1087d m564a(InterfaceC1091e interfaceC1091e) {
        if (interfaceC1091e == null) {
            this.f6860c = f6858a;
        } else {
            this.f6860c = interfaceC1091e;
        }
        return this;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        C1066a m719a;
        setName("|ANR-WatchDog|");
        int i = -1;
        while (!isInterrupted()) {
            int i2 = this.f6867j;
            this.f6862e.m4982a(this.f6868k);
            try {
                Thread.sleep(this.f6863f);
                if (this.f6867j == i2) {
                    if (!this.f6866i && Debug.isDebuggerConnected()) {
                        if (this.f6867j != i) {
                            Log.m4935c("ANRWatchdog", "An ANR was detected but ignored because the debugger is connected (you can prevent this with setIgnoreDebugger(true))");
                        }
                        i = this.f6867j;
                    } else {
                        if (this.f6864g != null) {
                            m719a = C1066a.m718a(this.f6864g, this.f6865h);
                        } else {
                            m719a = C1066a.m719a();
                        }
                        this.f6860c.mo563a(m719a);
                        return;
                    }
                }
            } catch (InterruptedException e) {
                this.f6861d.mo562a(e);
                return;
            }
        }
    }
}
