package com.corrodinggames.rts.gameFramework.p041i;

import com.corrodinggames.rts.appFramework.ActivityC0129p;
import com.corrodinggames.rts.game.AbstractC0197n;
import com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope;
import com.corrodinggames.rts.gameFramework.C0727bl;
import com.corrodinggames.rts.gameFramework.C0758f;
import com.corrodinggames.rts.gameFramework.Core;
import com.corrodinggames.rts.gameFramework.p036e.C0750a;
import com.corrodinggames.rts.gameFramework.p039g.C0820a;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorCompletionService;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.client.HttpClient;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.utils.URLEncodedUtils;
import org.apache.http.message.BasicNameValuePair;

/* renamed from: com.corrodinggames.rts.gameFramework.i.n */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/i/n.class */
public class C0879n {

    /* renamed from: e */
    static int f5877e;

    /* renamed from: g */
    public static String f5879g;

    /* renamed from: a */
    public static boolean f5873a = true;

    /* renamed from: b */
    public static boolean f5874b = true;

    /* renamed from: c */
    public static String[] f5875c = {"http://gs1.corrodinggames.com/masterserver/1.4", "http://gs4.corrodinggames.net/masterserver/1.4"};

    /* renamed from: d */
    public static C0885r f5876d = new C0885r();

    /* renamed from: f */
    public static Object f5878f = new Object();

    /* renamed from: a */
    public static void m1276a(String str) {
        if (f5874b) {
            Core.LogDebug2(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m1269a(List list, boolean z, AbstractC0886s abstractC0886s) {
        m1268a(list, z, abstractC0886s, f5875c);
    }

    /* renamed from: a */
    static void m1268a(List list, boolean z, AbstractC0886s abstractC0886s, String[] strArr) {
        abstractC0886s.f5892f = strArr.length;
        int i = 0;
        for (String str : strArr) {
            i++;
            new Thread(new RunnableC0888u(list, abstractC0886s, str, z, i)).start();
            if (f5873a) {
                Core.m997b("LoadFromMasterServer", i + ": Started RequestsParallelRunnable thread");
            }
        }
    }

    /* renamed from: a */
    public static String m1272a(List list, String str) {
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                NameValuePair nameValuePair = (NameValuePair) it.next();
                if (str.equals(nameValuePair.getName())) {
                    return nameValuePair.getValue();
                }
            }
            return null;
        }
        return null;
    }

    /* renamed from: a */
    public static BufferedReader m1274a(List list) {
        return m1267a(list, true, f5875c, 10, true);
    }

    /* renamed from: a */
    public static BufferedReader m1273a(List list, int i) {
        return m1267a(list, true, f5875c, i, true);
    }

    /* renamed from: a */
    public static BufferedReader m1267a(List list, boolean z, String[] strArr, int i, boolean z2) {
        Future poll;
        String m1272a = m1272a(list, "action");
        ExecutorService newFixedThreadPool = Executors.newFixedThreadPool(strArr.length);
        try {
            ExecutorCompletionService executorCompletionService = new ExecutorCompletionService(newFixedThreadPool);
            ArrayList arrayList = new ArrayList();
            for (String str : strArr) {
                arrayList.add(executorCompletionService.submit(new CallableC08801(str, list, z, z2)));
            }
            int length = strArr.length;
            C0887t c0887t = null;
            C0887t c0887t2 = null;
            C0887t c0887t3 = null;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    break;
                }
                try {
                    poll = executorCompletionService.poll(10L, TimeUnit.SECONDS);
                } catch (InterruptedException e) {
                } catch (ExecutionException e2) {
                    e2.printStackTrace();
                    if (e2.getCause() != null) {
                        e2.getCause().printStackTrace();
                    }
                }
                if (poll == null) {
                    Core.m998b("MULTI_MASTERSERVERS: poll timed out (" + m1272a + ")");
                    break;
                }
                C0887t c0887t4 = (C0887t) poll.get();
                if (c0887t4 != null) {
                    c0887t = c0887t4;
                    if (c0887t4.f5894b) {
                        if (c0887t4.f5895c) {
                            c0887t3 = c0887t4;
                        } else {
                            c0887t2 = c0887t4;
                            break;
                        }
                    }
                }
                i2++;
            }
            if (c0887t2 == null && c0887t3 != null) {
                Core.m998b("All masterserver results included an error message (" + m1272a + ")");
                c0887t2 = c0887t3;
            }
            if (c0887t2 == null) {
                Core.m998b("No valid result found on any masterserver (" + m1272a + ")");
                c0887t2 = c0887t;
            }
            if (c0887t2 != null) {
                BufferedReader bufferedReader = c0887t2.f5893a;
                newFixedThreadPool.shutdown();
                return bufferedReader;
            }
            throw new IOException("No results found (" + m1272a + ")");
        } catch (Throwable th) {
            newFixedThreadPool.shutdown();
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.corrodinggames.rts.gameFramework.i.n$1 */
    /* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/i/n$1.class */
    public final class CallableC08801 implements Callable {

        /* renamed from: a */
        final /* synthetic */ String f5880a;

        /* renamed from: b */
        final /* synthetic */ List f5881b;

        /* renamed from: c */
        final /* synthetic */ boolean f5882c;

        /* renamed from: d */
        final /* synthetic */ boolean f5883d;

        CallableC08801(String str, List list, boolean z, boolean z2) {
            this.f5880a = str;
            this.f5881b = list;
            this.f5882c = z;
            this.f5883d = z2;
        }

        /* renamed from: a */
        public C0887t mo1244a() {
            try {
                C0879n.m1276a("Running doSingleRequest:" + this.f5880a);
                return C0879n.m1270a(this.f5881b, this.f5880a, this.f5882c);
            } catch (Exception e) {
                Core.LogDebug2("Error on doSingleRequest:" + this.f5880a + " - " + e.getMessage());
                if (this.f5883d) {
                    e.printStackTrace();
                    return null;
                }
                return null;
            }
        }
    }

    /* renamed from: a */
    public static C0887t m1270a(List list, String str, boolean z) {
        HttpGet httpGet;
        String str2;
        Core m1087A;
        HttpResponse execute;
        String m1272a = m1272a(list, "action");
        long m2440a = C0727bl.m2440a();
        String str3 = str + "/interface";
        if (z) {
            HttpGet httpPost = new HttpPost(str3);
            httpPost.setEntity(new UrlEncodedFormEntity(list));
            httpGet = httpPost;
        } else {
            str3 = str3 + "?" + URLEncodedUtils.format(list, "utf-8");
            httpGet = new HttpGet(str3);
        }
        if (Core.m1008aw()) {
            str2 = "rw server";
        } else {
            str2 = "rw " + (Core.m1010au() ? "pc" : "android");
        }
        String m1728c = C0820a.m1728c();
        if (Core.m1087A() != null) {
            str2 = str2 + " " + m1087A.m988c(true) + " " + m1728c;
        }
        httpGet.setHeader("User-Agent", str2);
        httpGet.setHeader("Language", m1728c);
        HttpClient m1258a = f5876d.m1258a();
        try {
            execute = m1258a.execute(httpGet);
        } catch (NullPointerException e) {
            Core.m998b("doRequest: httpclient.execute threw NullPointerException, running workaround");
            m1258a = f5876d.m1257b();
            execute = m1258a.execute(httpGet);
        }
        float m2438a = C0727bl.m2438a(m2440a);
        HttpEntity entity = execute.getEntity();
        InputStream content = entity.getContent();
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[16384];
        while (true) {
            int read = content.read(bArr, 0, bArr.length);
            if (read == -1) {
                break;
            }
            byteArrayOutputStream.write(bArr, 0, read);
        }
        byteArrayOutputStream.flush();
        content.close();
        entity.consumeContent();
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        C0887t c0887t = new C0887t();
        String m1266a = m1266a(byteArray);
        c0887t.f5894b = m1266a.startsWith("CORRODINGGAMES");
        c0887t.f5895c = m1266a.contains("[FAILED]");
        if (!c0887t.f5894b || c0887t.f5895c) {
            String str4 = str3 + (m1272a != null ? "?action=" + m1272a : VariableScope.nullOrMissingString) + " (" + m2438a + "ms)";
            if (!"list".equals(m1272a)) {
                str4 = str4 + ":\n" + new String(byteArray);
            }
            Core.LogDebug2(str4);
        }
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(byteArray)));
        f5876d.mo101a(m1258a);
        c0887t.f5893a = bufferedReader;
        return c0887t;
    }

    /* renamed from: a */
    public static String m1266a(byte[] bArr) {
        int length = bArr.length;
        for (int i = 0; i < bArr.length; i++) {
            if (bArr[i] == 10 || bArr[i] == 13) {
                length = i;
                break;
            }
        }
        return new String(bArr, 0, length);
    }

    /* renamed from: b */
    public static C0872g m1264b(String str) {
        Core m1087A = Core.m1087A();
        if (str == null) {
            throw new IOException("findOrCreateServer id cannot be null");
        }
        Iterator it = m1087A.f6122bX.f5614by.iterator();
        while (it.hasNext()) {
            C0872g c0872g = (C0872g) it.next();
            if (str.equals(c0872g.f5824b)) {
                return c0872g;
            }
        }
        return null;
    }

    /* renamed from: c */
    public static C0872g m1261c(String str) {
        Core m1087A = Core.m1087A();
        if (str == null) {
            throw new IOException("findOrCreateServer id cannot be null");
        }
        C0872g m1264b = m1264b(str);
        if (m1264b != null) {
            return m1264b;
        }
        C0872g c0872g = new C0872g();
        c0872g.f5824b = str;
        c0872g.f5823a = false;
        c0872g.f5837o = m1087A.f6122bX.m1468p();
        return c0872g;
    }

    /* renamed from: a */
    public static void m1277a(Runnable runnable) {
        Core.m997b("LoadFromMasterServer", "Load requested");
        new Thread(new RunnableC0883q(runnable)).start();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m1279a(int i, int i2) {
        C0872g c0872g;
        Core m1087A = Core.m1087A();
        boolean z = false;
        synchronized (f5878f) {
            Iterator it = m1087A.f6122bX.f5614by.iterator();
            while (it.hasNext()) {
                if (((C0872g) it.next()).f5838p < i) {
                    Core.m997b("LoadFromMasterServer", i2 + ": Removing stale server with id:" + c0872g.f5824b);
                    it.remove();
                    z = true;
                }
            }
        }
        if (z) {
            ActivityC0129p.m5595l();
        }
    }

    /* renamed from: a */
    public static void m1281a() {
        Core.m997b("GetOwnInfoRunnable", "getOwnInfoFromMasterServer");
        C0857ap.f5721e = 6;
        new Thread(new RunnableC0882p()).start();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m1271a(List list, String str, String str2) {
        list.add(new BasicNameValuePair(str, str2));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static void m1263b(List list) {
        String str;
        Core m1087A = Core.m1087A();
        m1271a(list, "password_required", C0758f.m2168a(m1087A.f6122bX.f5481n != null));
        m1271a(list, "created_by", m1087A.f6122bX.f5487y);
        m1271a(list, "private_ip", m1087A.f6122bX.m1566ah());
        m1271a(list, "port_number", Integer.toString(m1087A.f6122bX.socketPort));
        if (m1087A.f6122bX.f5486u != null) {
            m1271a(list, "game_map", C0750a.m2265n(m1087A.f6122bX.f5486u));
        } else {
            m1271a(list, "game_map", C0750a.m2265n(m1087A.f6122bX.f5603aO.f5655b));
        }
        EnumC0846ai enumC0846ai = m1087A.f6122bX.f5603aO.f5654a;
        if (enumC0846ai == null) {
            enumC0846ai = EnumC0846ai.f5669a;
        }
        m1271a(list, "game_mode", enumC0846ai.name());
        if (!m1087A.f6122bX.f5566v) {
            if (m1087A.f6122bX.f5539bm) {
                str = "ingame";
            } else if (m1087A.f6122bX.f5603aO.f5668p) {
                str = "locked";
            } else {
                str = "battleroom";
            }
            m1271a(list, "game_status", str);
        } else {
            m1271a(list, "game_status", "chat");
        }
        m1271a(list, "player_count", Integer.toString(m1087A.f6122bX.m1644D()));
        String num = Integer.toString(AbstractC0197n.f1365c);
        if (m1087A.f6122bX.f5566v) {
        }
        m1271a(list, "max_player_count", num);
    }

    /* renamed from: b */
    public static void m1265b() {
        Core.m997b("StartCreateOnMasterServer", "Create requested");
        C0857ap.f5718b = 5;
        new Thread(new RunnableC0892y()).start();
    }

    /* renamed from: c */
    public static void m1262c() {
        new Thread(new RunnableC0828aa()).start();
    }

    /* renamed from: d */
    public static void m1260d() {
        Core.m997b("startRemoveOnMasterServer", "Remove requested");
        new Thread(new RunnableC0893z()).start();
    }

    /* renamed from: a */
    public static void m1275a(String str, String str2) {
        Core.m997b("startErrorReport", "ErrorReport requested");
        RunnableC0889v runnableC0889v = new RunnableC0889v();
        runnableC0889v.f5902b = str2;
        runnableC0889v.f5901a = str;
        new Thread(runnableC0889v).start();
    }

    /* renamed from: a */
    public static String m1280a(int i) {
        if (i == 0) {
            return VariableScope.nullOrMissingString;
        }
        if (i > 0) {
            if (i < 100000) {
                return C0758f.m2177a(C0758f.m2146b("x" + i), 10);
            }
            if (i < 200000) {
                return C0758f.m2177a(C0758f.m2146b("y" + i), 11);
            }
            if (i < 300000) {
                return C0758f.m2177a(C0758f.m2146b("z" + i), 12);
            }
            if (i < 1000000) {
                return C0758f.m2177a(C0758f.m2146b("xx" + i), 13) + "-" + Core.m1087A().f6122bX.m1497g(i - 300000);
            }
            if (i < 2000000) {
                return C0758f.m2177a(C0758f.m2146b("yy" + i), 14) + "-" + Core.m1087A().f6122bX.m1497g(i - 1000000);
            }
            return "NA";
        }
        return "NA";
    }

    /* renamed from: a */
    public static void m1278a(C0890w c0890w, String str, int i, String str2) {
        Core.LogDebug2("getGameServerInfoFromMasterServer");
        RunnableC0829ab runnableC0829ab = new RunnableC0829ab();
        runnableC0829ab.f5471a = c0890w;
        runnableC0829ab.f5472b = str;
        runnableC0829ab.f5473c = i;
        runnableC0829ab.f5474d = str2;
        new Thread(runnableC0829ab).start();
    }
}
