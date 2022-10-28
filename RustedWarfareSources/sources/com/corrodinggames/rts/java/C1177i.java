package com.corrodinggames.rts.java;

import com.corrodinggames.librocket.scripts.ScriptEngine;
import com.corrodinggames.rts.game.C0191i;
import com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope;
import com.corrodinggames.rts.gameFramework.AbstractC0916l;
import com.corrodinggames.rts.gameFramework.AbstractC1057n;
import com.corrodinggames.rts.p008a.RunnableC0069a;
import java.awt.Toolkit;
import org.lwjgl.Sys;

/* renamed from: com.corrodinggames.rts.java.i */
/* loaded from: game-lib.jar:com/corrodinggames/rts/java/i.class */
public class C1177i extends AbstractC1057n {

    /* renamed from: a */
    Main f7223a;

    public C1177i(Main main) {
        this.f7223a = main;
    }

    @Override // com.corrodinggames.rts.gameFramework.AbstractC1057n
    /* renamed from: a */
    public void mo110a(final String str, int i) {
        AbstractC0916l.m963e("slick queuing-alert:" + str);
        ScriptEngine.getInstance().addRunnableToQueue(new Runnable() { // from class: com.corrodinggames.rts.java.i.1
            @Override // java.lang.Runnable
            public void run() {
                AbstractC0916l.m963e("slick post-alert:" + str);
                C1177i.this.f7223a.f6985p.m4877b(VariableScope.nullOrMissingString, str);
            }
        });
    }

    @Override // com.corrodinggames.rts.gameFramework.AbstractC1057n
    /* renamed from: a */
    public void mo109a(final String str, final String str2) {
        AbstractC0916l.m963e("slick queuing-messageBox:" + str2);
        ScriptEngine.getInstance().addRunnableToQueue(new Runnable() { // from class: com.corrodinggames.rts.java.i.2
            @Override // java.lang.Runnable
            public void run() {
                AbstractC0916l.m963e("slick messageBox:" + str2);
                C1177i.this.f7223a.f6985p.m4877b(str, str2);
            }
        });
    }

    @Override // com.corrodinggames.rts.gameFramework.AbstractC1057n
    /* renamed from: a */
    public void mo108a(String str, boolean z) {
        AbstractC0916l m1071A = AbstractC0916l.m1071A();
        if ((m1071A == null || !m1071A.f6130bj) && this.f7223a.f6979j != null) {
            this.f7223a.f6979j.m33a(str, z);
        }
    }

    @Override // com.corrodinggames.rts.gameFramework.AbstractC1057n
    /* renamed from: d */
    public void mo103d() {
        AbstractC0916l.m963e("refreshModDisplay");
        ScriptEngine.getInstance().addScriptToQueue("mods.refreshModList()");
    }

    @Override // com.corrodinggames.rts.gameFramework.AbstractC1057n
    /* renamed from: a */
    public void mo107a(Throwable th) {
        m106a(th, true);
    }

    /* renamed from: a */
    public void m106a(Throwable th, boolean z) {
        try {
            AbstractC0916l.m963e("----------- onGameCrash ----------");
            Toolkit.getDefaultToolkit();
            String str = AbstractC0916l.m980b(th) + "\nCheck logs for more details";
            AbstractC0916l.m963e("Error message: " + str);
            if (RunnableC0069a.m4862a()) {
                AbstractC0916l.m963e("onGameCrash: Not showing popup message due to active debugSocket");
                System.exit(1);
                return;
            }
            if (th != null && (th instanceof OutOfMemoryError) && !C0191i.f1218b) {
                str = str + " (You are also using the 32 bit version, switching to the 64 bit version might help with out of memory)";
            }
            Sys.alert("Crash", str);
            try {
                Thread.sleep(1000L);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            AbstractC0916l.m963e("onGameCrash: end");
        } catch (Throwable th2) {
            AbstractC0916l.m963e("exception showing message");
            th2.printStackTrace();
        }
    }

    @Override // com.corrodinggames.rts.gameFramework.AbstractC1057n
    /* renamed from: b */
    public boolean mo105b() {
        if (!AbstractC0916l.m1071A().m1064H() && !this.f7223a.f6985p.m4881b()) {
            return true;
        }
        return false;
    }

    @Override // com.corrodinggames.rts.gameFramework.AbstractC1057n
    /* renamed from: c */
    public boolean mo104c() {
        return RunnableC0069a.m4862a();
    }
}
