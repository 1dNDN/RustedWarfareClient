package com.corrodinggames.rts.gameFramework.p047n;

import com.corrodinggames.rts.gameFramework.Core;
import com.corrodinggames.rts.gameFramework.p040h.C0824b;

/* renamed from: com.corrodinggames.rts.gameFramework.n.a */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/n/a.class */
public class C1058a {

    /* renamed from: a */
    public static C1058a f6733a = new C1058a();

    /* renamed from: a */
    public static C1058a m747a() {
        return f6733a;
    }

    /* renamed from: b */
    public void mo289b() {
        Core.LogDebug2("SteamEngine - blank init");
    }

    /* renamed from: a */
    public void mo294a(float f) {
    }

    /* renamed from: c */
    public String mo285c() {
        return null;
    }

    /* renamed from: d */
    public void mo283d() {
        Core.LogDebug2("SteamEngine - disableSteam - already disabled");
    }

    /* renamed from: e */
    public boolean m746e() {
        return !mo282f();
    }

    /* renamed from: f */
    public boolean mo282f() {
        return true;
    }

    /* renamed from: g */
    public void mo281g() {
        Core.LogDebug2("disabledSteam - showInviteDialog");
        Core.m1087A().m969i("steam API not connected");
    }

    /* renamed from: h */
    public void m745h() {
        Core.LogDebug2("Steam: alertNotEnabled");
        Core m1087A = Core.m1087A();
        if (m1087A != null) {
            m1087A.m969i("steam API not connected");
        }
    }

    /* renamed from: i */
    public void mo280i() {
    }

    /* renamed from: j */
    public void mo279j() {
    }

    /* renamed from: k */
    public void mo278k() {
    }

    /* renamed from: l */
    public void mo277l() {
        Core.LogDebug2("disabledSteam - loadWorkshopMods");
    }

    /* renamed from: m */
    public void mo276m() {
        Core.LogDebug2("disabledSteam - showWorkshop");
    }

    /* renamed from: a */
    public void mo292a(C0824b c0824b) {
        Core.LogDebug2("disabledSteam - showWorkshopMod");
    }

    /* renamed from: b */
    public void mo287b(C0824b c0824b) {
        Core.LogDebug2("disabledSteam - publishWorkshopMod");
    }

    /* renamed from: a */
    public void mo291a(C0824b c0824b, boolean z, String str) {
        Core.LogDebug2("disabledSteam - uploadWorkshopMod");
    }
}
