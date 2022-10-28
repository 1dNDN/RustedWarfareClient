package com.corrodinggames.rts.gameFramework.p047n;

import com.corrodinggames.rts.gameFramework.LoggerMaybe;
import com.corrodinggames.rts.gameFramework.p040h.C0824b;

/* renamed from: com.corrodinggames.rts.gameFramework.n.a */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/n/a.class */
public class C1058a {

    /* renamed from: a */
    public static C1058a f6733a = new C1058a();

    /* renamed from: a */
    public static C1058a m739a() {
        return f6733a;
    }

    /* renamed from: b */
    public void mo293b() {
        LoggerMaybe.LogDebug2("SteamEngine - blank init");
    }

    /* renamed from: a */
    public void mo298a(float f) {
    }

    /* renamed from: c */
    public String mo289c() {
        return null;
    }

    /* renamed from: d */
    public void mo287d() {
        LoggerMaybe.LogDebug2("SteamEngine - disableSteam - already disabled");
    }

    /* renamed from: e */
    public boolean m738e() {
        return !mo286f();
    }

    /* renamed from: f */
    public boolean mo286f() {
        return true;
    }

    /* renamed from: g */
    public void mo285g() {
        LoggerMaybe.LogDebug2("disabledSteam - showInviteDialog");
        LoggerMaybe.m1079A().m961i("steam API not connected");
    }

    /* renamed from: h */
    public void m737h() {
        LoggerMaybe.LogDebug2("Steam: alertNotEnabled");
        LoggerMaybe m1079A = LoggerMaybe.m1079A();
        if (m1079A != null) {
            m1079A.m961i("steam API not connected");
        }
    }

    /* renamed from: i */
    public void mo284i() {
    }

    /* renamed from: j */
    public void mo283j() {
    }

    /* renamed from: k */
    public void mo282k() {
    }

    /* renamed from: l */
    public void mo281l() {
        LoggerMaybe.LogDebug2("disabledSteam - loadWorkshopMods");
    }

    /* renamed from: m */
    public void mo280m() {
        LoggerMaybe.LogDebug2("disabledSteam - showWorkshop");
    }

    /* renamed from: a */
    public void mo296a(C0824b c0824b) {
        LoggerMaybe.LogDebug2("disabledSteam - showWorkshopMod");
    }

    /* renamed from: b */
    public void mo291b(C0824b c0824b) {
        LoggerMaybe.LogDebug2("disabledSteam - publishWorkshopMod");
    }

    /* renamed from: a */
    public void mo295a(C0824b c0824b, boolean z, String str) {
        LoggerMaybe.LogDebug2("disabledSteam - uploadWorkshopMod");
    }
}
