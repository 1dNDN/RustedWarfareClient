package android.p003os;

import android.util.Printer;

/* renamed from: android.os.Looper */
/* loaded from: game-lib.jar:android/os/Looper.class */
public final class Looper {

    /* renamed from: a */
    static final ThreadLocal f272a = new ThreadLocal();

    /* renamed from: d */
    private static Looper f273d;

    /* renamed from: b */
    final MessageQueue f274b;

    /* renamed from: c */
    final Thread f275c = Thread.currentThread();

    /* renamed from: e */
    private Printer f276e;

    /* renamed from: a */
    private static void m4973a(boolean z) {
        if (f272a.get() != null) {
            throw new RuntimeException("Only one Looper may be created per thread");
        }
        f272a.set(new Looper(z));
    }

    /* renamed from: a */
    public static void m4974a() {
        m4973a(false);
        synchronized (Looper.class) {
            if (f273d != null) {
                throw new IllegalStateException("The main Looper has already been prepared.");
            }
            f273d = m4970d();
        }
    }

    /* renamed from: b */
    public static Looper m4972b() {
        Looper looper;
        synchronized (Looper.class) {
            looper = f273d;
        }
        return looper;
    }

    /* renamed from: c */
    public static void m4971c() {
        Looper m4970d = m4970d();
        if (m4970d == null) {
            throw new RuntimeException("No Looper; Looper.prepare() wasn't called on this thread.");
        }
        MessageQueue messageQueue = m4970d.f274b;
        while (true) {
            Message m4954a = messageQueue.m4954a();
            if (m4954a == null) {
                return;
            }
            Printer printer = m4970d.f276e;
            if (printer != null) {
                printer.println(">>>>> Dispatching to " + m4954a.f286j + " " + m4954a.f287k + ": " + m4954a.f277a);
            }
            m4954a.f286j.m4981b(m4954a);
            if (printer != null) {
                printer.println("<<<<< Finished to " + m4954a.f286j + " " + m4954a.f287k);
            }
            m4954a.m4961c();
        }
    }

    /* renamed from: d */
    public static Looper m4970d() {
        return (Looper) f272a.get();
    }

    private Looper(boolean z) {
        this.f274b = new MessageQueue(z);
    }

    /* renamed from: e */
    public Thread m4969e() {
        return this.f275c;
    }

    public String toString() {
        return "Looper (" + this.f275c.getName() + ", tid " + this.f275c.getId() + ") {" + Integer.toHexString(System.identityHashCode(this)) + "}";
    }
}
