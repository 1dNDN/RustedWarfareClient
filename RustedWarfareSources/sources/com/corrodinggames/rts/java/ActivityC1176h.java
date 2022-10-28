package com.corrodinggames.rts.java;

import com.corrodinggames.librocket.AbstractC0043a;
import com.corrodinggames.librocket.scripts.ScriptEngine;
import com.corrodinggames.rts.appFramework.ActivityC0097g;
import com.corrodinggames.rts.gameFramework.AbstractC0916l;

/* renamed from: com.corrodinggames.rts.java.h */
/* loaded from: game-lib.jar:com/corrodinggames/rts/java/h.class */
public class ActivityC1176h extends ActivityC0097g {
    @Override // com.corrodinggames.rts.appFramework.ActivityC0097g
    /* renamed from: c */
    public void mo115c(int i) {
        AbstractC0916l.m963e("InGameActivityJava selectMenuOption: " + i);
        mo114d(i);
    }

    /* renamed from: e */
    private void m113e(String str) {
        ScriptEngine.getInstance().getRoot().makeSaveGamePopup(str);
    }

    /* renamed from: f */
    private void m112f(String str) {
        ScriptEngine.getInstance().getRoot().makeExportMapGamePopup(str);
    }

    @Override // com.corrodinggames.rts.appFramework.ActivityC0097g
    /* renamed from: d */
    public void mo114d(int i) {
        switch (i) {
            case 2:
                AbstractC0043a.m4910a().m4899d();
                return;
            case 3:
                AbstractC0916l.m963e("TODO");
                return;
            case 4:
                AbstractC0916l.m1071A().f6179cg = !AbstractC0916l.m1071A().f6179cg;
                return;
            case 5:
                AbstractC0916l.m963e("TODO");
                return;
            case 6:
                AbstractC0916l m1071A = AbstractC0916l.m1071A();
                m1071A.f6132bl = !m1071A.f6132bl;
                return;
            case 7:
            case 8:
            default:
                return;
            case 9:
                AbstractC0916l m1071A2 = AbstractC0916l.m1071A();
                if (!m1071A2.f6135bo) {
                    m1071A2.f6135bo = true;
                    return;
                } else {
                    m1071A2.f6135bo = false;
                    return;
                }
            case 10:
                ScriptEngine.getInstance().addScriptToQueue("mp.multiplayerExitPrompt();");
                return;
            case 11:
                AbstractC0916l m1071A3 = AbstractC0916l.m1071A();
                if (m1071A3.f6177ce != null && m1071A3.f6177ce.f6665h != null) {
                    m1071A3.m1028a("Briefing", m1071A3.f6177ce.f6665h);
                    return;
                }
                return;
            case 12:
                m113e(null);
                return;
            case 13:
                ScriptEngine.getInstance().addScriptToQueue("makeSendMessagePopup();");
                return;
            case 14:
                AbstractC0916l m1071A4 = AbstractC0916l.m1071A();
                if (m1071A4.f6170bX != null) {
                    m1071A4.f6170bX.m1590H();
                    return;
                }
                return;
            case 15:
                ScriptEngine.getInstance().addScriptToQueue("showMainMenu();");
                return;
            case 16:
                ScriptEngine.getInstance().addScriptToQueue("makeSendTeamMessagePopup();");
                return;
            case 17:
                ScriptEngine.getInstance().addScriptToQueue("mp.reinviteAsk();");
                return;
            case 18:
                m112f(null);
                return;
            case 19:
                ScriptEngine.getInstance().addScriptToQueue("mp.surrenderPrompt();");
                return;
            case 20:
                ScriptEngine.getInstance().addScriptToQueue("showMainMenu();");
                return;
            case 21:
                ScriptEngine.getInstance().addScriptToQueue("showBattleroom();");
                return;
            case 22:
                AbstractC0916l m1071A5 = AbstractC0916l.m1071A();
                m1071A5.f6218cT = true;
                m1071A5.f6165bS.f5126p = false;
                return;
        }
    }

    @Override // com.corrodinggames.rts.appFramework.ActivityC0097g
    /* renamed from: m */
    public void mo111m() {
        ScriptEngine.getInstance().addScriptToQueue("showMainMenu();");
    }
}
