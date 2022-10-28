package com.corrodinggames.rts.java;

import com.corrodinggames.rts.gameFramework.AbstractC0916l;
import java.awt.Toolkit;
import org.lwjgl.Sys;
import org.lwjgl.opengl.Display;
import org.lwjgl.opengl.DisplayMode;
import org.lwjgl.opengl.GL11;
import org.newdawn.slick.SlickException;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.corrodinggames.rts.java.j */
/* loaded from: game-lib.jar:com/corrodinggames/rts/java/j.class */
public class RunnableC1180j implements Runnable {

    /* renamed from: a */
    final /* synthetic */ Main f7229a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC1180j(Main main) {
        this.f7229a = main;
    }

    @Override // java.lang.Runnable
    public void run() {
        AbstractC0916l.m999ap();
        try {
            this.f7229a.f6980k.start();
        } catch (SlickException e) {
            if (!"Failed to initialise the LWJGL display".equals(e.getMessage())) {
                throw new RuntimeException((Throwable) e);
            }
            AbstractC0916l.m1025a("Error starting display", (Throwable) e);
            String str = "\nFailed to get opengl version";
            try {
                System.setProperty("org.lwjgl.opengl.Display.allowSoftwareOpenGL", "true");
                Display.setDisplayMode(new DisplayMode(100, 100));
                Display.create();
                String glGetString = GL11.glGetString(7938);
                Display.destroy();
                AbstractC0916l.m963e("OpenGL version: " + glGetString);
                str = "\nOpenGL version detected: " + glGetString;
                if (glGetString.startsWith("1.0") || glGetString.startsWith("1.1")) {
                    str = str + "\n---\nOpenGL 1.1 is over 20 years old you might be using a fallback microsoft driver. Try updating your graphics drivers from the manufacturer.";
                }
            } catch (Exception e2) {
                AbstractC0916l.m1025a("Failed to get opengl info", (Throwable) e2);
            }
            Toolkit.getDefaultToolkit();
            Sys.alert("Error", "Failed to create display." + str);
            System.exit(1);
        }
        AbstractC0916l.m963e("Game stopped running shutting down");
        AbstractC0916l.m1071A().f6173ca.m419b("lastgame", false);
        this.f7229a.m407a(true);
    }
}
