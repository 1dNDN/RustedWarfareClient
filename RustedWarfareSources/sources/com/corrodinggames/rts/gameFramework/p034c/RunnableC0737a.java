package com.corrodinggames.rts.gameFramework.p034c;

import com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope;
import com.corrodinggames.rts.gameFramework.LoggerMaybe;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Locale;

/* renamed from: com.corrodinggames.rts.gameFramework.c.a */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/c/a.class */
public class RunnableC0737a implements Runnable {

    /* renamed from: e */
    public static float f4629e;

    /* renamed from: h */
    public ServerSocket f4632h;

    /* renamed from: a */
    public static boolean f4625a = false;

    /* renamed from: b */
    public static boolean f4626b = false;

    /* renamed from: c */
    public static boolean f4627c = false;

    /* renamed from: d */
    public static boolean f4628d = false;

    /* renamed from: g */
    public static boolean f4631g = true;

    /* renamed from: j */
    static ArrayList f4634j = new ArrayList();

    /* renamed from: f */
    boolean f4630f = true;

    /* renamed from: i */
    public boolean f4633i = true;

    /* renamed from: a */
    public static void m2365a() {
        if (!f4625a) {
            return;
        }
        LoggerMaybe.LogDebug2("-----");
        LoggerMaybe.LogDebug2("-----");
        LoggerMaybe.LogDebug2("----- Debug Active ----");
        LoggerMaybe.LogDebug2("-----");
        LoggerMaybe.LogDebug2("-----");
        LoggerMaybe.f6206aV = true;
        LoggerMaybe.m1079A().m946r();
        new RunnableC0737a().m2362b();
    }

    /* renamed from: b */
    public void m2362b() {
        if (f4626b) {
            m2364a(5677, VariableScope.nullOrMissingString);
        }
        LoggerMaybe.m1079A().f6288ea.m735a(new RunnableC0739c(this));
    }

    /* renamed from: a */
    public void m2364a(int i, String str) {
        try {
            f4631g = true;
            LoggerMaybe.f6204aT = true;
            LoggerMaybe.LogDebug2(VariableScope.nullOrMissingString);
            LoggerMaybe.LogDebug2("----- createDebugSocket ----");
            LoggerMaybe.LogDebug2("port: " + i);
            LoggerMaybe.LogDebug2("password: " + str);
            LoggerMaybe.LogDebug2("------------------");
            LoggerMaybe.LogDebug2(VariableScope.nullOrMissingString);
            if (i != -1) {
                this.f4632h = new ServerSocket(i);
                new Thread(this).start();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private RunnableC0737a() {
    }

    public void run() {
        while (this.f4633i) {
            try {
                Socket accept = this.f4632h.accept();
                try {
                    accept.setTcpNoDelay(true);
                    new Thread(new RunnableC0738b(this, accept)).run();
                } catch (IOException e) {
                    LoggerMaybe.LogDebug2("Got IOException on debug connection");
                    e.printStackTrace();
                    throw new RuntimeException(e);
                }
            } catch (IOException e2) {
                throw new RuntimeException(e2);
            }
        }
    }

    /* renamed from: a */
    public static String m2363a(String str) {
        int indexOf = str.indexOf(" ");
        if (indexOf == -1) {
            indexOf = str.length();
        }
        String lowerCase = str.substring(0, indexOf).toLowerCase(Locale.ENGLISH);
        if (indexOf != -1 && str.length() >= indexOf + 1) {
            str.substring(indexOf + 1).split(" ");
        }
        if (lowerCase.equalsIgnoreCase("ping")) {
            return "pong";
        }
        if (lowerCase.equalsIgnoreCase("script") || lowerCase.equalsIgnoreCase("function") || lowerCase.equalsIgnoreCase("functionNoTimeout")) {
            return "todo";
        }
        return "unknown command";
    }
}
