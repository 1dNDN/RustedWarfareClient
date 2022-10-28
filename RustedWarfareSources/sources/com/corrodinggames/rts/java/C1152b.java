package com.corrodinggames.rts.java;

import com.corrodinggames.rts.gameFramework.AbstractC0916l;
import com.corrodinggames.rts.gameFramework.C0648am;
import org.lwjgl.opengl.Display;
import org.newdawn.slick.AppGameContainer;
import org.newdawn.slick.Game;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Music;

/* renamed from: com.corrodinggames.rts.java.b */
/* loaded from: game-lib.jar:com/corrodinggames/rts/java/b.class */
public class C1152b extends AppGameContainer {

    /* renamed from: a */
    boolean f7082a;

    /* renamed from: b */
    Object f7083b;

    /* renamed from: c */
    C1154c f7084c;

    public C1152b(Game game, int i, int i2, boolean z) {
        super(game, i, i2, z);
        this.f7082a = false;
        this.f7083b = new Object();
    }

    /* renamed from: a */
    public Graphics m302a() {
        Graphics graphics = getGraphics();
        this.input.poll(this.width, this.height);
        Music.poll(1);
        if (C0648am.f4164a != null) {
            C0648am.f4164a.mo98a(1);
        }
        GL.glClear(16640);
        GL.glLoadIdentity();
        graphics.resetTransform();
        graphics.resetFont();
        graphics.resetLineWidth();
        graphics.setAntiAlias(false);
        return graphics;
    }

    /* renamed from: a */
    public void m301a(Graphics graphics) {
        graphics.resetTransform();
        GL.flush();
        Display.update();
    }

    protected void gameLoop() {
        int delta = getDelta();
        if (!Display.isVisible() && this.updateOnlyOnVisible) {
            try {
                Thread.sleep(100L);
            } catch (Exception e) {
            }
        } else {
            updateAndRender(delta);
        }
        updateFPS();
        Display.update(false);
        if (!this.f7082a) {
            Display.processMessages();
        } else if (this.f7084c == null) {
            this.f7084c = new C1154c(this);
            this.f7084c.start();
        }
        if (Display.isCloseRequested() && this.game.closeRequested()) {
            this.running = false;
        }
    }

    protected void updateAndRender(int i) {
        if (this.smoothDeltas && getFPS() != 0) {
            i = 1000 / getFPS();
        }
        this.input.poll(this.width, this.height);
        Music.poll(i);
        if (C0648am.f4164a != null) {
            C0648am.f4164a.mo98a(i);
        }
        if (!this.paused) {
            this.storedDelta += i;
            if (this.storedDelta >= this.minimumLogicInterval) {
                if (this.maximumLogicInterval != 0) {
                    long j = this.storedDelta / this.maximumLogicInterval;
                    for (int i2 = 0; i2 < j; i2++) {
                        this.game.update(this, (int) this.maximumLogicInterval);
                    }
                    int i3 = (int) (this.storedDelta % this.maximumLogicInterval);
                    if (i3 > this.minimumLogicInterval) {
                        this.game.update(this, (int) (i3 % this.maximumLogicInterval));
                        this.storedDelta = 0L;
                    } else {
                        this.storedDelta = i3;
                    }
                } else {
                    this.game.update(this, (int) this.storedDelta);
                    this.storedDelta = 0L;
                }
            }
        } else {
            this.game.update(this, 0);
        }
        if (hasFocus() || getAlwaysRender()) {
            if (this.clearEachFrame) {
                GL.glClear(16640);
            }
            GL.glLoadIdentity();
            Graphics graphics = getGraphics();
            graphics.resetTransform();
            graphics.resetFont();
            graphics.resetLineWidth();
            graphics.setAntiAlias(false);
            this.game.render(this, graphics);
            graphics.resetTransform();
            if (isShowingFPS()) {
                getDefaultFont().drawString(10.0f, 10.0f, "FPS: " + this.recordedFPS);
            }
            GL.flush();
        }
        if (this.targetFPS != -1) {
            Display.sync(this.targetFPS);
        }
    }

    public void destroy() {
        try {
            Display.destroy();
        } catch (Exception e) {
            AbstractC0916l.m1025a("Error on Display.destroy in destroy", (Throwable) e);
        }
    }
}
