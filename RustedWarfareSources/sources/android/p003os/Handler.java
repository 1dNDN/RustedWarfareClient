package android.p003os;

import android.util.Log;

/* renamed from: android.os.Handler */
/* loaded from: game-lib.jar:android/os/Handler.class */
public class Handler {

    /* renamed from: a */
    final MessageQueue f268a;

    /* renamed from: b */
    final Looper f269b;

    /* renamed from: c */
    final Callback f270c;

    /* renamed from: d */
    final boolean f271d;

    /* renamed from: android.os.Handler$Callback */
    /* loaded from: game-lib.jar:android/os/Handler$Callback.class */
    public interface Callback {
        /* renamed from: a */
        boolean m4976a(Message message);
    }

    /* renamed from: a */
    public void m4985a(Message message) {
    }

    /* renamed from: b */
    public void m4981b(Message message) {
        if (message.f287k != null) {
            m4977d(message);
        } else if (this.f270c != null && this.f270c.m4976a(message)) {
        } else {
            m4985a(message);
        }
    }

    public Handler() {
        this(null, false);
    }

    public Handler(Looper looper) {
        this(looper, null, false);
    }

    public Handler(Callback callback, boolean z) {
        this.f269b = Looper.m4970d();
        if (this.f269b == null) {
            throw new RuntimeException("Can't create handler inside thread that has not called Looper.prepare()");
        }
        this.f268a = this.f269b.f274b;
        this.f270c = callback;
        this.f271d = z;
    }

    public Handler(Looper looper, Callback callback, boolean z) {
        this.f269b = looper;
        this.f268a = looper.f274b;
        this.f270c = callback;
        this.f271d = z;
    }

    /* renamed from: a */
    public final Message m4986a() {
        return Message.m4966a(this);
    }

    /* renamed from: a */
    public final boolean m4982a(Runnable runnable) {
        return m4984a(m4979b(runnable), 0L);
    }

    /* renamed from: c */
    public final boolean m4978c(Message message) {
        return m4984a(message, 0L);
    }

    /* renamed from: a */
    public final boolean m4984a(Message message, long j) {
        if (j < 0) {
            j = 0;
        }
        return m4980b(message, SystemClock.m4946a() + j);
    }

    /* renamed from: b */
    public boolean m4980b(Message message, long j) {
        MessageQueue messageQueue = this.f268a;
        if (messageQueue == null) {
            RuntimeException runtimeException = new RuntimeException(this + " sendMessageAtTime() called with no mQueue");
            Log.m4939a("Looper", runtimeException.getMessage(), runtimeException);
            return false;
        }
        return m4983a(messageQueue, message, j);
    }

    /* renamed from: a */
    private boolean m4983a(MessageQueue messageQueue, Message message, long j) {
        message.f286j = this;
        if (this.f271d) {
            message.m4963a(true);
        }
        return messageQueue.m4951a(message, j);
    }

    public String toString() {
        return "Handler (" + getClass().getName() + ") {" + Integer.toHexString(System.identityHashCode(this)) + "}";
    }

    /* renamed from: b */
    private static Message m4979b(Runnable runnable) {
        Message m4968a = Message.m4968a();
        m4968a.f287k = runnable;
        return m4968a;
    }

    /* renamed from: d */
    private static void m4977d(Message message) {
        message.f287k.run();
    }
}
