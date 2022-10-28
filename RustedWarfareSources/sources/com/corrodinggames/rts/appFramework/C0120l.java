package com.corrodinggames.rts.appFramework;

import android.util.Log;
import android.view.MotionEvent;
import java.lang.reflect.Method;

/* renamed from: com.corrodinggames.rts.appFramework.l */
/* loaded from: game-lib.jar:com/corrodinggames/rts/appFramework/l.class */
public class C0120l {

    /* renamed from: a */
    public static final boolean f478a;

    /* renamed from: b */
    public static final boolean f479b;

    /* renamed from: c */
    private static Method f480c;

    /* renamed from: d */
    private static Method f481d;

    /* renamed from: e */
    private static Method f482e;

    /* renamed from: f */
    private static Method f483f;

    /* renamed from: g */
    private static Method f484g;

    /* renamed from: h */
    private static Method f485h;

    /* renamed from: i */
    private static Method f486i;

    /* renamed from: j */
    private static Method f487j;

    /* renamed from: k */
    private static Method f488k;

    /* renamed from: l */
    private static int f489l;

    /* renamed from: m */
    private static int f490m;

    /* renamed from: n */
    private static final float[] f491n;

    /* renamed from: o */
    private static final float[] f492o;

    /* renamed from: p */
    private static final float[] f493p;

    /* renamed from: q */
    private static final int[] f494q;

    /* renamed from: r */
    private static final int[] f495r;

    static {
        f489l = 6;
        f490m = 8;
        boolean z = false;
        try {
            f481d = MotionEvent.class.getMethod("getPointerCount", new Class[0]);
            f482e = MotionEvent.class.getMethod("findPointerIndex", Integer.TYPE);
            f483f = MotionEvent.class.getMethod("getPressure", Integer.TYPE);
            f484g = MotionEvent.class.getMethod("getHistoricalX", Integer.TYPE, Integer.TYPE);
            f485h = MotionEvent.class.getMethod("getHistoricalY", Integer.TYPE, Integer.TYPE);
            f486i = MotionEvent.class.getMethod("getHistoricalPressure", Integer.TYPE, Integer.TYPE);
            f487j = MotionEvent.class.getMethod("getX", Integer.TYPE);
            f488k = MotionEvent.class.getMethod("getY", Integer.TYPE);
            z = true;
        } catch (Exception e) {
            Log.m5216b("MultiTouchController", "static initializer failed", e);
        }
        f478a = z;
        if (f478a) {
            try {
                f489l = MotionEvent.class.getField("ACTION_POINTER_UP").getInt(null);
                f490m = MotionEvent.class.getField("ACTION_POINTER_INDEX_SHIFT").getInt(null);
            } catch (Exception e2) {
            }
        }
        boolean z2 = false;
        try {
            f480c = MotionEvent.class.getMethod("getButtonState", new Class[0]);
            z2 = true;
            Log.LogDebug("MultiTouchController", "--- Mouse API succeeded");
        } catch (Exception e3) {
            Log.m5216b("MultiTouchController", "static initializer for mouse failed", e3);
        }
        f479b = z2;
        f491n = new float[10];
        f492o = new float[10];
        f493p = new float[10];
        f494q = new int[10];
        f495r = new int[10];
    }
}
