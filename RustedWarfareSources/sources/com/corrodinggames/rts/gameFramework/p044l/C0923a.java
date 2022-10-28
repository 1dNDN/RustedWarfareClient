package com.corrodinggames.rts.gameFramework.p044l;

import android.graphics.BitmapFactory;
import android.opengl.GLSurfaceView;
import android.util.Log;
import com.corrodinggames.rts.gameFramework.LoggerMaybe;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;

/* renamed from: com.corrodinggames.rts.gameFramework.l.a */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/l/a.class */
public class C0923a implements GLSurfaceView.Renderer {

    /* renamed from: q */
    private static BitmapFactory.Options f6296q = new BitmapFactory.Options();

    /* renamed from: a */
    public boolean f6297a;

    /* renamed from: b */
    GL10 f6298b;

    /* renamed from: c */
    float f6299c;

    /* renamed from: d */
    float f6300d;

    /* renamed from: e */
    int f6301e;

    /* renamed from: f */
    int f6302f;

    /* renamed from: g */
    C0932c[] f6303g;

    /* renamed from: h */
    C0926ac f6304h;

    /* renamed from: i */
    int f6305i;

    /* renamed from: j */
    int f6306j;

    /* renamed from: k */
    int f6307k;

    /* renamed from: l */
    int f6308l;

    /* renamed from: m */
    int f6309m;

    /* renamed from: n */
    int f6310n;

    /* renamed from: o */
    String f6311o;

    /* renamed from: p */
    long f6312p;

    public void onDrawFrame(GL10 gl10) {
        if (this.f6301e == -1) {
            Log.m5365d("RustedWarfare", "---- render: no buffer is ready!");
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        this.f6312p = currentTimeMillis;
        this.f6308l += (int) (currentTimeMillis - this.f6312p);
        this.f6309m++;
        if (this.f6309m == 10) {
            this.f6310n = 10000 / this.f6308l;
            this.f6308l = 0;
            this.f6309m = 0;
            this.f6311o = this.f6310n + "fps";
            Log.m5365d("RustedWarfare", "render:" + this.f6311o + ", this renders has " + this.f6303g[this.f6301e].f6384b + " draws");
        }
        this.f6302f = this.f6301e;
        gl10.glClear(16640);
        gl10.glMatrixMode(5888);
        C0926ac.m922a(gl10, true, false);
        C0932c c0932c = this.f6303g[this.f6302f];
        this.f6305i = -1;
        this.f6306j = -1;
        this.f6307k = -1;
        for (int i = 0; i < c0932c.f6384b; i++) {
            c0932c.f6383a[i].m893a(gl10);
        }
        C0926ac.m923a(gl10);
        this.f6302f = -1;
    }

    public void onSurfaceChanged(GL10 gl10, int i, int i2) {
        Log.m5365d("RustedWarfare", "2d gl onSurfaceChanged:" + i + "," + i2);
        this.f6298b = gl10;
        this.f6299c = i2;
        this.f6300d = i;
        gl10.glViewport(0, 0, i, i2);
        gl10.glMatrixMode(5889);
        gl10.glLoadIdentity();
        gl10.glOrthof(0.0f, i, 0.0f, i2, 0.0f, 1.0f);
        gl10.glShadeModel(7424);
        gl10.glEnable(3042);
        gl10.glBlendFunc(770, 771);
        gl10.glColor4x(65536, 65536, 65536, 65536);
        gl10.glEnable(3553);
    }

    public void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
        Log.m5365d("RustedWarfare", "2d gl onSurfaceCreated");
        this.f6298b = gl10;
        gl10.glHint(3152, 4353);
        gl10.glClearColor(0.3f, 0.3f, 0.5f, 1.0f);
        gl10.glShadeModel(7424);
        gl10.glDisable(2929);
        gl10.glEnable(3553);
        gl10.glDisable(3024);
        gl10.glDisable(2896);
        gl10.glClear(16640);
        if (LoggerMaybe.m1079A() != null) {
        }
        this.f6297a = true;
    }
}
