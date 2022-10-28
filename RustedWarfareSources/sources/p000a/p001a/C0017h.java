package p000a.p001a;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.SocketAddress;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.nio.channels.SocketChannel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;
import p000a.p001a.p002a.AbstractC0008h;
import p000a.p001a.p002a.C0001a;
import p000a.p001a.p002a.C0002b;
import p000a.p001a.p002a.C0003c;
import p000a.p001a.p002a.C0004d;
import p000a.p001a.p002a.C0005e;
import p000a.p001a.p002a.C0006f;
import p000a.p001a.p002a.C0007g;
import p000a.p001a.p002a.RunnableC0009i;

/* renamed from: a.a.h */
/* loaded from: game-lib.jar:a/a/h.class */
public class C0017h extends Socket {

    /* renamed from: c */
    protected DatagramSocket f47c;

    /* renamed from: d */
    protected SocketAddress f48d;

    /* renamed from: e */
    protected C0025o f49e;

    /* renamed from: f */
    protected C0027q f50f;

    /* renamed from: a */
    private byte[] f51a;

    /* renamed from: b */
    private boolean f52b;

    /* renamed from: i */
    private boolean f53i;

    /* renamed from: j */
    private boolean f54j;

    /* renamed from: k */
    private boolean f55k;

    /* renamed from: l */
    private int f56l;

    /* renamed from: m */
    private int f57m;

    /* renamed from: n */
    private boolean f58n;

    /* renamed from: o */
    private boolean f59o;

    /* renamed from: p */
    private int f60p;

    /* renamed from: q */
    private Object f61q;

    /* renamed from: r */
    private Object f62r;

    /* renamed from: s */
    private ArrayList f63s;

    /* renamed from: t */
    private ArrayList f64t;

    /* renamed from: g */
    protected C0028r f65g;

    /* renamed from: u */
    private ArrayList f66u;

    /* renamed from: v */
    private ArrayList f67v;

    /* renamed from: w */
    private ArrayList f68w;

    /* renamed from: x */
    private Object f69x;

    /* renamed from: y */
    private C0019i f70y;

    /* renamed from: z */
    private Thread f71z;

    /* renamed from: A */
    private int f72A;

    /* renamed from: B */
    private int f73B;

    /* renamed from: C */
    private int f74C;

    /* renamed from: D */
    private int f75D;

    /* renamed from: h */
    public boolean f76h;

    /* renamed from: E */
    private RunnableC0009i f77E;

    /* renamed from: F */
    private RunnableC0009i f78F;

    /* renamed from: G */
    private RunnableC0009i f79G;

    /* renamed from: H */
    private RunnableC0009i f80H;

    /* renamed from: I */
    private static final boolean f81I = Boolean.getBoolean("net.rudp.debug");

    /* renamed from: j */
    public static /* synthetic */ void m5231j(C0017h c0017h) {
        c0017h.m5228m();
    }

    public C0017h() {
        this(new C0028r());
    }

    public C0017h(C0028r c0028r) {
        this(new DatagramSocket(), c0028r);
    }

    public C0017h(DatagramSocket datagramSocket) {
        this(datagramSocket, new C0028r());
    }

    protected C0017h(DatagramSocket datagramSocket, C0028r c0028r) {
        this.f52b = false;
        this.f53i = false;
        this.f54j = false;
        this.f55k = true;
        this.f56l = 0;
        this.f57m = 0;
        this.f58n = false;
        this.f59o = false;
        this.f60p = -1;
        this.f61q = new Object();
        this.f62r = new Object();
        this.f63s = new ArrayList();
        this.f64t = new ArrayList();
        this.f65g = C0028r.f100a;
        this.f66u = new ArrayList();
        this.f67v = new ArrayList();
        this.f68w = new ArrayList();
        this.f69x = new Object();
        this.f70y = new C0019i();
        this.f72A = 32;
        this.f73B = 32;
        this.f76h = false;
        this.f77E = new RunnableC0009i("rudp-NullSegmentTimer", new RunnableC0022l(this));
        this.f78F = new RunnableC0009i("rudp-RetransmissionTimer", new RunnableC0024n(this));
        this.f79G = new RunnableC0009i("rudp-CumulativeAckTimer", new RunnableC0020j(this));
        this.f80H = new RunnableC0009i("rudp-KeepAliveTimer", new RunnableC0021k(this));
        if (datagramSocket == null) {
            throw new NullPointerException("sock");
        }
        mo5262a(datagramSocket, c0028r);
    }

    /* renamed from: a */
    public void mo5262a(DatagramSocket datagramSocket, C0028r c0028r) {
        this.f47c = datagramSocket;
        this.f65g = c0028r;
        this.f74C = (this.f65g.m5203a() - 6) * 32;
        this.f75D = (this.f65g.m5203a() - 6) * 32;
        if (this.f71z == null) {
            this.f71z = new C0023m(this);
            this.f71z.start();
        }
    }

    @Override // java.net.Socket
    public void bind(SocketAddress socketAddress) {
        this.f47c.bind(socketAddress);
    }

    @Override // java.net.Socket
    public void connect(SocketAddress socketAddress) {
        connect(socketAddress, 0);
    }

    @Override // java.net.Socket
    public void connect(SocketAddress socketAddress, int i) {
        if (socketAddress == null) {
            throw new IllegalArgumentException("connect: The address can't be null");
        }
        if (i < 0) {
            throw new IllegalArgumentException("connect: timeout can't be negative");
        }
        if (isClosed()) {
            throw new SocketException("Socket is closed");
        }
        if (isConnected()) {
            throw new SocketException("already connected");
        }
        if (!(socketAddress instanceof InetSocketAddress)) {
            throw new IllegalArgumentException("Unsupported address type");
        }
        this.f48d = (InetSocketAddress) socketAddress;
        m5243f();
        this.f56l = 2;
        m5245e(new C0007g(this.f70y.m5221a(new Random(System.currentTimeMillis()).nextInt(255)), this.f65g.m5200b(), this.f65g.m5203a(), this.f65g.m5194h(), this.f65g.m5193i(), this.f65g.m5195g(), this.f65g.m5199c(), this.f65g.m5198d(), this.f65g.m5197e(), this.f65g.m5196f()));
        boolean z = false;
        synchronized (this) {
            if (!isConnected()) {
                try {
                    if (i == 0) {
                        wait();
                    } else {
                        long currentTimeMillis = System.currentTimeMillis();
                        wait(i);
                        if (System.currentTimeMillis() - currentTimeMillis >= i) {
                            z = true;
                        }
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
        if (this.f56l == 3) {
            return;
        }
        synchronized (this.f66u) {
            this.f66u.clear();
            this.f66u.notifyAll();
        }
        this.f70y.m5209l();
        this.f78F.m5289e();
        switch (this.f56l) {
            case 0:
            case 4:
                this.f56l = 0;
                throw new SocketException("Socket closed");
            case 1:
            case 3:
            default:
                return;
            case 2:
                m5230k();
                this.f56l = 0;
                if (z) {
                    throw new SocketTimeoutException();
                }
                throw new SocketException("Connection refused");
        }
    }

    @Override // java.net.Socket
    public SocketChannel getChannel() {
        return null;
    }

    @Override // java.net.Socket
    public InetAddress getInetAddress() {
        if (!isConnected()) {
            return null;
        }
        return ((InetSocketAddress) this.f48d).getAddress();
    }

    @Override // java.net.Socket
    public int getPort() {
        if (!isConnected()) {
            return 0;
        }
        return ((InetSocketAddress) this.f48d).getPort();
    }

    @Override // java.net.Socket
    public SocketAddress getRemoteSocketAddress() {
        if (!isConnected()) {
            return null;
        }
        return new InetSocketAddress(getInetAddress(), getPort());
    }

    /* renamed from: c */
    public SocketAddress m5253c() {
        return this.f48d;
    }

    @Override // java.net.Socket
    public InetAddress getLocalAddress() {
        return this.f47c.getLocalAddress();
    }

    @Override // java.net.Socket
    public int getLocalPort() {
        return this.f47c.getLocalPort();
    }

    @Override // java.net.Socket
    public SocketAddress getLocalSocketAddress() {
        return this.f47c.getLocalSocketAddress();
    }

    @Override // java.net.Socket
    public synchronized InputStream getInputStream() {
        if (isClosed()) {
            throw new SocketException("Socket is closed");
        }
        if (!isConnected()) {
            throw new SocketException("Socket is not connected");
        }
        if (isInputShutdown()) {
            throw new SocketException("Socket input is shutdown");
        }
        if (this.f49e == null) {
            this.f49e = new C0025o(this);
        }
        return this.f49e;
    }

    @Override // java.net.Socket
    public synchronized OutputStream getOutputStream() {
        if (isClosed()) {
            throw new SocketException("Socket is closed");
        }
        if (!isConnected()) {
            throw new SocketException("Socket is not connected");
        }
        if (isOutputShutdown()) {
            throw new SocketException("Socket output is shutdown");
        }
        if (this.f50f == null) {
            this.f50f = new C0027q(this);
        }
        return this.f50f;
    }

    /* renamed from: d */
    public void m5249d() {
        this.f52b = true;
        this.f56l = 0;
        this.f47c.close();
    }

    @Override // java.net.Socket, java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
        synchronized (this.f61q) {
            if (isClosed()) {
                return;
            }
            m5240g();
            switch (this.f56l) {
                case 0:
                    this.f47c.close();
                    break;
                case 1:
                case 3:
                case 4:
                    m5268a(new C0004d(this.f70y.m5222a()));
                    m5246e();
                    break;
                case 2:
                    synchronized (this) {
                        notify();
                    }
                    break;
            }
            if (this.f56l != 0) {
                this.f60p = this.f56l;
            }
            this.f52b = true;
            this.f56l = 0;
            m5229l();
            synchronized (this.f66u) {
                this.f66u.notify();
            }
            synchronized (this.f68w) {
                this.f68w.notify();
            }
        }
    }

    @Override // java.net.Socket
    public boolean isBound() {
        return this.f47c.isBound();
    }

    @Override // java.net.Socket
    public boolean isConnected() {
        return this.f53i;
    }

    @Override // java.net.Socket
    public boolean isClosed() {
        boolean z;
        synchronized (this.f61q) {
            z = this.f52b;
        }
        return z;
    }

    @Override // java.net.Socket
    public void setSoTimeout(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("timeout < 0");
        }
        this.f57m = i;
    }

    @Override // java.net.Socket
    public synchronized void setSendBufferSize(int i) {
        if (i <= 0) {
            throw new IllegalArgumentException("negative receive size");
        }
        if (isClosed()) {
            throw new SocketException("Socket is closed");
        }
        if (isConnected()) {
            return;
        }
        this.f74C = i;
    }

    @Override // java.net.Socket
    public synchronized int getSendBufferSize() {
        if (isClosed()) {
            throw new SocketException("Socket is closed");
        }
        return this.f74C;
    }

    @Override // java.net.Socket
    public synchronized void setReceiveBufferSize(int i) {
        if (i <= 0) {
            throw new IllegalArgumentException("negative send size");
        }
        if (isClosed()) {
            throw new SocketException("Socket is closed");
        }
        if (isConnected()) {
            return;
        }
        this.f75D = i;
    }

    @Override // java.net.Socket
    public synchronized int getReceiveBufferSize() {
        if (isClosed()) {
            throw new SocketException("Socket is closed");
        }
        return this.f75D;
    }

    @Override // java.net.Socket
    public void setTcpNoDelay(boolean z) {
    }

    @Override // java.net.Socket
    public boolean getTcpNoDelay() {
        return false;
    }

    @Override // java.net.Socket
    public synchronized void setKeepAlive(boolean z) {
        if (isClosed()) {
            throw new SocketException("Socket is closed");
        }
        if (!(this.f55k ^ z)) {
            return;
        }
        this.f55k = z;
        if (isConnected()) {
            if (this.f55k) {
                this.f80H.m5293a(this.f65g.m5195g() * 6, this.f65g.m5195g() * 6);
            } else {
                this.f80H.m5289e();
            }
        }
    }

    @Override // java.net.Socket
    public synchronized boolean getKeepAlive() {
        if (isClosed()) {
            throw new SocketException("Socket is closed");
        }
        return this.f55k;
    }

    @Override // java.net.Socket
    public void shutdownInput() {
        if (isClosed()) {
            throw new SocketException("Socket is closed");
        }
        if (!isConnected()) {
            throw new SocketException("Socket is not connected");
        }
        if (isInputShutdown()) {
            throw new SocketException("Socket input is already shutdown");
        }
        this.f58n = true;
        synchronized (this.f69x) {
            this.f69x.notify();
        }
    }

    @Override // java.net.Socket
    public void shutdownOutput() {
        if (isClosed()) {
            throw new SocketException("Socket is closed");
        }
        if (!isConnected()) {
            throw new SocketException("Socket is not connected");
        }
        if (isOutputShutdown()) {
            throw new SocketException("Socket output is already shutdown");
        }
        this.f59o = true;
        synchronized (this.f66u) {
            this.f66u.notifyAll();
        }
    }

    @Override // java.net.Socket
    public boolean isInputShutdown() {
        return this.f58n;
    }

    @Override // java.net.Socket
    public boolean isOutputShutdown() {
        return this.f59o;
    }

    /* renamed from: a */
    public void m5261a(byte[] bArr, int i, int i2) {
        m5260a(bArr, i, i2, false);
    }

    /* renamed from: a */
    public void m5260a(byte[] bArr, int i, int i2, boolean z) {
        if (isClosed()) {
            throw new SocketException("Socket is closed");
        }
        if (isOutputShutdown()) {
            throw new IOException("Socket output is shutdown");
        }
        if (!isConnected()) {
            throw new SocketException("Connection reset");
        }
        int i3 = 0;
        while (i3 < i2) {
            synchronized (this.f62r) {
                while (this.f54j) {
                    try {
                        this.f62r.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                int min = Math.min(this.f65g.m5203a() - 6, i2 - i3);
                C0002b c0002b = new C0002b(this.f70y.m5222a(), this.f70y.m5220b(), bArr, i + i3, min);
                m5245e(c0002b);
                if (z) {
                    m5268a(c0002b);
                }
                i3 += min;
            }
        }
    }

    /* renamed from: b */
    public int m5254b(byte[] bArr, int i, int i2) {
        int i3 = 0;
        synchronized (this.f69x) {
            while (true) {
                if (this.f68w.isEmpty()) {
                    if (isClosed()) {
                        throw new SocketException("Socket is closed");
                    }
                    if (isInputShutdown()) {
                        throw new EOFException();
                    }
                    if (!isConnected()) {
                        throw new SocketException("Connection reset");
                    }
                    try {
                        if (this.f57m == 0) {
                            this.f69x.wait();
                        } else {
                            long currentTimeMillis = System.currentTimeMillis();
                            this.f69x.wait(this.f57m);
                            if (System.currentTimeMillis() - currentTimeMillis >= this.f57m) {
                                throw new SocketTimeoutException();
                                break;
                            }
                        }
                    } catch (InterruptedException e) {
                        if (f81I) {
                            e.printStackTrace();
                        }
                    }
                } else {
                    Iterator it = this.f68w.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        AbstractC0008h abstractC0008h = (AbstractC0008h) it.next();
                        if (abstractC0008h instanceof C0006f) {
                            it.remove();
                            break;
                        } else if (abstractC0008h instanceof C0004d) {
                            if (i3 <= 0) {
                                it.remove();
                                return -1;
                            }
                        } else if (abstractC0008h instanceof C0002b) {
                            byte[] m5317c = ((C0002b) abstractC0008h).m5317c();
                            if (m5317c.length + i3 > i2) {
                                if (i3 <= 0) {
                                    throw new IOException("insufficient buffer space");
                                }
                            } else {
                                System.arraycopy(m5317c, 0, bArr, i + i3, m5317c.length);
                                i3 += m5317c.length;
                                it.remove();
                            }
                        }
                    }
                    if (i3 > 0) {
                        return i3;
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public void m5264a(InterfaceC0029s interfaceC0029s) {
        if (interfaceC0029s == null) {
            throw new NullPointerException("stateListener");
        }
        synchronized (this.f64t) {
            if (!this.f64t.contains(interfaceC0029s)) {
                this.f64t.add(interfaceC0029s);
            }
        }
    }

    /* renamed from: a */
    private void m5268a(AbstractC0008h abstractC0008h) {
        if ((abstractC0008h instanceof C0002b) || (abstractC0008h instanceof C0006f) || (abstractC0008h instanceof C0004d) || (abstractC0008h instanceof C0005e)) {
            m5236h(abstractC0008h);
        }
        if ((abstractC0008h instanceof C0002b) || (abstractC0008h instanceof C0006f) || (abstractC0008h instanceof C0004d)) {
            this.f77E.m5290d();
        }
        if (f81I) {
            mo5263a("sent " + abstractC0008h);
        }
        m5248d(abstractC0008h);
    }

    /* renamed from: i */
    public AbstractC0008h m5234i() {
        AbstractC0008h mo5273a = mo5273a();
        if (mo5273a != null) {
            if (f81I) {
                mo5263a("recv " + mo5273a);
            }
            if ((mo5273a instanceof C0002b) || (mo5273a instanceof C0005e) || (mo5273a instanceof C0006f) || (mo5273a instanceof C0004d) || (mo5273a instanceof C0007g)) {
                this.f70y.m5218c();
            }
            if (this.f55k) {
                this.f80H.m5290d();
            }
        }
        return mo5273a;
    }

    /* renamed from: e */
    public void m5245e(AbstractC0008h abstractC0008h) {
        synchronized (this.f66u) {
            while (true) {
                if (this.f66u.size() >= this.f72A || this.f70y.m5211j() > this.f65g.m5200b()) {
                    if (this.f52b) {
                        throw new SocketException("Socket is closed");
                    }
                    try {
                        this.f66u.wait(10000L);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                } else {
                    this.f70y.m5212i();
                    this.f66u.add(abstractC0008h);
                }
            }
        }
        if (this.f52b) {
            throw new SocketException("Socket is closed");
        }
        if (!(abstractC0008h instanceof C0003c) && !(abstractC0008h instanceof C0001a)) {
            synchronized (this.f78F) {
                if (this.f78F.m5291c()) {
                    this.f78F.m5293a(this.f65g.m5194h(), this.f65g.m5194h());
                }
            }
        }
        m5268a(abstractC0008h);
        if (abstractC0008h instanceof C0002b) {
            synchronized (this.f63s) {
                Iterator it = this.f63s.iterator();
                while (it.hasNext()) {
                    ((InterfaceC0026p) it.next()).m5207a();
                }
            }
        }
    }

    /* renamed from: f */
    public void m5242f(AbstractC0008h abstractC0008h) {
        if (this.f65g.m5199c() > 0) {
            abstractC0008h.m5301b(abstractC0008h.m5296o() + 1);
        }
        if (this.f65g.m5199c() != 0 && abstractC0008h.m5296o() > this.f65g.m5199c()) {
            m5228m();
            return;
        }
        m5268a(abstractC0008h);
        if (abstractC0008h instanceof C0002b) {
            synchronized (this.f63s) {
                Iterator it = this.f63s.iterator();
                while (it.hasNext()) {
                    ((InterfaceC0026p) it.next()).m5206b();
                }
            }
        }
    }

    /* renamed from: j */
    private void m5232j() {
        if (isConnected()) {
            this.f77E.m5289e();
            if (this.f55k) {
                this.f80H.m5289e();
            }
            synchronized (this.f62r) {
                this.f54j = false;
                this.f62r.notify();
            }
        } else {
            synchronized (this) {
                m5243f();
                this.f53i = true;
                this.f56l = 3;
                notify();
            }
            synchronized (this.f64t) {
                Iterator it = this.f64t.iterator();
                while (it.hasNext()) {
                    ((InterfaceC0029s) it.next()).mo5192a(this);
                }
            }
        }
        this.f77E.m5293a(0L, this.f65g.m5195g());
        if (this.f55k) {
            this.f80H.m5293a(this.f65g.m5195g() * 6, this.f65g.m5195g() * 6);
        }
    }

    /* renamed from: k */
    private void m5230k() {
        synchronized (this.f64t) {
            Iterator it = this.f64t.iterator();
            while (it.hasNext()) {
                ((InterfaceC0029s) it.next()).mo5191b(this);
            }
        }
    }

    /* renamed from: l */
    public void m5229l() {
        synchronized (this.f64t) {
            Iterator it = this.f64t.iterator();
            while (it.hasNext()) {
                ((InterfaceC0029s) it.next()).mo5190c(this);
            }
        }
    }

    /* renamed from: m */
    private void m5228m() {
        synchronized (this.f61q) {
            if (isClosed()) {
                return;
            }
            switch (this.f56l) {
                case 1:
                case 3:
                case 4:
                    this.f53i = false;
                    synchronized (this.f66u) {
                        this.f66u.notifyAll();
                    }
                    synchronized (this.f69x) {
                        this.f69x.notify();
                    }
                    m5246e();
                    break;
                case 2:
                    synchronized (this) {
                        notify();
                    }
                    break;
            }
            this.f56l = 0;
            this.f52b = true;
            synchronized (this.f64t) {
                Iterator it = this.f64t.iterator();
                while (it.hasNext()) {
                    ((InterfaceC0029s) it.next()).mo5189d(this);
                }
            }
        }
    }

    /* renamed from: n */
    private void m5227n() {
        synchronized (this.f64t) {
            Iterator it = this.f64t.iterator();
            while (it.hasNext()) {
                ((InterfaceC0029s) it.next()).mo5188e(this);
            }
        }
    }

    /* renamed from: a */
    public void m5269a(C0007g c0007g) {
        switch (this.f56l) {
            case 0:
                this.f56l = 1;
                this.f65g = new C0028r(this.f72A, this.f73B, c0007g.m5314e(), c0007g.m5315c(), c0007g.m5310i(), c0007g.m5309j(), c0007g.m5308k(), c0007g.m5307l(), c0007g.m5311h(), c0007g.m5313f(), c0007g.m5312g());
                this.f70y.m5219b(c0007g.m5298m());
                C0007g c0007g2 = new C0007g(this.f70y.m5221a(new Random(System.currentTimeMillis()).nextInt(255)), this.f65g.m5200b(), this.f65g.m5203a(), this.f65g.m5194h(), this.f65g.m5193i(), this.f65g.m5195g(), this.f65g.m5199c(), this.f65g.m5198d(), this.f65g.m5197e(), this.f65g.m5196f());
                c0007g2.m5305a(c0007g.m5298m());
                m5245e(c0007g2);
                return;
            case 1:
                synchronized (this.f66u) {
                    Iterator it = this.f66u.iterator();
                    while (it.hasNext()) {
                        try {
                            m5242f((AbstractC0008h) it.next());
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                }
                return;
            case 2:
                this.f70y.m5219b(c0007g.m5298m());
                this.f56l = 3;
                m5226o();
                m5232j();
                return;
            default:
                return;
        }
    }

    /* renamed from: a */
    public void m5270a(C0003c c0003c) {
        int[] m5316c = c0003c.m5316c();
        int n = c0003c.m5297n();
        int i = m5316c[m5316c.length - 1];
        synchronized (this.f66u) {
            Iterator it = this.f66u.iterator();
            while (it.hasNext()) {
                AbstractC0008h abstractC0008h = (AbstractC0008h) it.next();
                if (m5271a(abstractC0008h.m5298m(), n) <= 0) {
                    it.remove();
                } else {
                    int i2 = 0;
                    while (true) {
                        if (i2 >= m5316c.length) {
                            break;
                        } else if (m5271a(abstractC0008h.m5298m(), m5316c[i2]) != 0) {
                            i2++;
                        } else {
                            it.remove();
                            break;
                        }
                    }
                }
            }
            Iterator it2 = this.f66u.iterator();
            while (it2.hasNext()) {
                AbstractC0008h abstractC0008h2 = (AbstractC0008h) it2.next();
                if (m5271a(n, abstractC0008h2.m5298m()) < 0 && m5271a(i, abstractC0008h2.m5298m()) > 0) {
                    try {
                        m5242f(abstractC0008h2);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }
            this.f66u.notifyAll();
        }
    }

    /* renamed from: g */
    public void m5239g(AbstractC0008h abstractC0008h) {
        if (abstractC0008h instanceof C0006f) {
            synchronized (this.f62r) {
                this.f54j = true;
            }
            m5227n();
        }
        if (abstractC0008h instanceof C0004d) {
            switch (this.f56l) {
                case 0:
                    break;
                case 2:
                    synchronized (this) {
                        notify();
                    }
                    break;
                default:
                    this.f56l = 4;
                    break;
            }
        }
        boolean z = false;
        synchronized (this.f69x) {
            if (m5271a(abstractC0008h.m5298m(), this.f70y.m5220b()) > 0) {
                if (m5271a(abstractC0008h.m5298m(), m5258b(this.f70y.m5220b())) == 0) {
                    z = true;
                    if (this.f68w.size() == 0 || this.f68w.size() + this.f67v.size() < this.f73B) {
                        this.f70y.m5219b(abstractC0008h.m5298m());
                        if ((abstractC0008h instanceof C0002b) || (abstractC0008h instanceof C0006f) || (abstractC0008h instanceof C0004d)) {
                            this.f68w.add(abstractC0008h);
                        }
                        if (abstractC0008h instanceof C0002b) {
                            synchronized (this.f63s) {
                                Iterator it = this.f63s.iterator();
                                while (it.hasNext()) {
                                    ((InterfaceC0026p) it.next()).m5205c();
                                }
                            }
                        }
                        m5223r();
                    }
                } else if (this.f68w.size() + this.f67v.size() < this.f73B) {
                    boolean z2 = false;
                    for (int i = 0; i < this.f67v.size() && !z2; i++) {
                        int m5271a = m5271a(abstractC0008h.m5298m(), ((AbstractC0008h) this.f67v.get(i)).m5298m());
                        if (m5271a == 0) {
                            z2 = true;
                        } else if (m5271a < 0) {
                            this.f67v.add(i, abstractC0008h);
                            z2 = true;
                        }
                    }
                    if (!z2) {
                        this.f67v.add(abstractC0008h);
                    }
                    this.f70y.m5215f();
                    if (abstractC0008h instanceof C0002b) {
                        synchronized (this.f63s) {
                            Iterator it2 = this.f63s.iterator();
                            while (it2.hasNext()) {
                                ((InterfaceC0026p) it2.next()).m5204d();
                            }
                        }
                    }
                }
            }
            if (z && ((abstractC0008h instanceof C0006f) || (abstractC0008h instanceof C0005e) || (abstractC0008h instanceof C0004d))) {
                m5226o();
            } else if (this.f70y.m5214g() > 0 && (this.f65g.m5197e() == 0 || this.f70y.m5214g() > this.f65g.m5197e())) {
                m5225p();
            } else if (this.f70y.m5217d() > 0 && (this.f65g.m5198d() == 0 || this.f70y.m5217d() > this.f65g.m5198d())) {
                m5224q();
            } else {
                synchronized (this.f79G) {
                    if (this.f79G.m5291c()) {
                        this.f79G.m5294a(this.f65g.m5193i());
                    }
                }
            }
        }
    }

    /* renamed from: o */
    public void m5226o() {
        synchronized (this.f69x) {
            if (!this.f67v.isEmpty()) {
                m5225p();
            } else {
                m5224q();
            }
        }
    }

    /* renamed from: p */
    private void m5225p() {
        synchronized (this.f69x) {
            if (this.f67v.isEmpty()) {
                return;
            }
            this.f70y.m5216e();
            this.f70y.m5213h();
            int[] iArr = new int[this.f67v.size()];
            for (int i = 0; i < iArr.length; i++) {
                iArr[i] = ((AbstractC0008h) this.f67v.get(i)).m5298m();
            }
            try {
                int m5220b = this.f70y.m5220b();
                m5268a((AbstractC0008h) new C0003c(m5258b(m5220b), m5220b, iArr));
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: q */
    private void m5224q() {
        if (this.f70y.m5216e() == 0) {
            return;
        }
        try {
            int m5220b = this.f70y.m5220b();
            m5268a(new C0001a(m5258b(m5220b), m5220b));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /* renamed from: h */
    private void m5236h(AbstractC0008h abstractC0008h) {
        if (this.f70y.m5216e() == 0) {
            return;
        }
        abstractC0008h.m5305a(this.f70y.m5220b());
    }

    /* renamed from: b */
    public boolean m5257b(AbstractC0008h abstractC0008h) {
        int m5297n = abstractC0008h.m5297n();
        if (m5297n < 0) {
            return false;
        }
        Iterator it = this.f66u.iterator();
        while (it.hasNext()) {
            if (m5271a(((AbstractC0008h) it.next()).m5298m(), m5297n) <= 0) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: c */
    public void m5252c(AbstractC0008h abstractC0008h) {
        int m5297n = abstractC0008h.m5297n();
        if (m5297n < 0) {
            return;
        }
        this.f70y.m5210k();
        synchronized (this.f66u) {
            Iterator it = this.f66u.iterator();
            while (it.hasNext()) {
                if (m5271a(((AbstractC0008h) it.next()).m5298m(), m5297n) <= 0) {
                    it.remove();
                }
            }
            if (this.f56l == 1) {
                boolean z = false;
                if (!this.f66u.isEmpty()) {
                    Iterator it2 = this.f66u.iterator();
                    while (it2.hasNext()) {
                        if (((AbstractC0008h) it2.next()) instanceof C0007g) {
                            z = true;
                        }
                    }
                }
                if (z) {
                    mo5263a("Bad first ack: " + m5297n);
                    return;
                } else {
                    this.f56l = 3;
                    m5232j();
                }
            }
            if (this.f66u.isEmpty()) {
                this.f78F.m5289e();
            }
            this.f66u.notifyAll();
        }
    }

    /* renamed from: r */
    private void m5223r() {
        synchronized (this.f69x) {
            Iterator it = this.f67v.iterator();
            while (it.hasNext()) {
                AbstractC0008h abstractC0008h = (AbstractC0008h) it.next();
                if (m5271a(abstractC0008h.m5298m(), m5258b(this.f70y.m5220b())) == 0) {
                    this.f70y.m5219b(abstractC0008h.m5298m());
                    if ((abstractC0008h instanceof C0002b) || (abstractC0008h instanceof C0006f) || (abstractC0008h instanceof C0004d)) {
                        this.f68w.add(abstractC0008h);
                    }
                    it.remove();
                }
            }
            this.f69x.notify();
        }
    }

    /* renamed from: d */
    protected void m5248d(AbstractC0008h abstractC0008h) {
        try {
            this.f47c.send(new DatagramPacket(abstractC0008h.mo5299d(), abstractC0008h.mo5302b(), this.f48d));
        } catch (IOException e) {
            if (!isClosed()) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: a */
    protected AbstractC0008h mo5273a() {
        try {
            if (this.f51a == null) {
                this.f51a = new byte[65535];
            }
            DatagramPacket datagramPacket = new DatagramPacket(this.f51a, this.f51a.length);
            this.f47c.receive(datagramPacket);
            return AbstractC0008h.m5300b(datagramPacket.getData(), 0, datagramPacket.getLength());
        } catch (IOException e) {
            if (!isClosed()) {
                e.printStackTrace();
                return null;
            }
            return null;
        }
    }

    /* renamed from: b */
    protected void mo5259b() {
        this.f47c.close();
    }

    /* renamed from: e */
    protected void m5246e() {
        this.f77E.m5289e();
        this.f80H.m5289e();
        this.f56l = 4;
        Thread thread = new Thread() { // from class: a.a.h.1
            {
                C0017h.this = this;
            }

            @Override // java.lang.Thread, java.lang.Runnable
            public void run() {
                C0017h.this.f80H.m5288f();
                C0017h.this.f77E.m5288f();
                try {
                    Thread.sleep(C0017h.this.f65g.m5195g() * 2);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                C0017h.this.f78F.m5288f();
                C0017h.this.f79G.m5288f();
                C0017h.this.mo5259b();
                C0017h.this.m5229l();
            }
        };
        thread.setName("ReliableSocket-Closing");
        thread.setDaemon(true);
        thread.start();
    }

    /* renamed from: a */
    protected synchronized void mo5263a(String str) {
        System.out.println(getLocalPort() + ": " + str);
    }

    /* renamed from: b */
    public static int m5258b(int i) {
        return (i + 1) % 255;
    }

    /* renamed from: a */
    private int m5271a(int i, int i2) {
        if (i == i2) {
            return 0;
        }
        if (i >= i2 || i2 - i <= 127) {
            if (i > i2 && i - i2 < 127) {
                return 1;
            }
            return -1;
        }
        return 1;
    }

    /* renamed from: f */
    public synchronized void m5243f() {
        if (!this.f76h) {
            this.f76h = true;
            this.f77E.m5295a();
            this.f78F.m5295a();
            this.f79G.m5295a();
            this.f80H.m5295a();
        }
    }

    /* renamed from: g */
    public synchronized void m5240g() {
        if (this.f76h) {
            this.f76h = false;
            this.f78F.m5288f();
            this.f79G.m5288f();
            this.f80H.m5288f();
            this.f77E.m5288f();
        }
    }
}
