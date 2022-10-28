package com.corrodinggames.rts.gameFramework.p041i;

import android.net.http.AndroidHttpClient;
import com.corrodinggames.rts.gameFramework.AbstractC0916l;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;
import org.apache.http.client.HttpClient;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.params.HttpConnectionParams;
import org.apache.http.params.HttpParams;

/* renamed from: com.corrodinggames.rts.gameFramework.i.r */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/i/r.class */
public class C0885r {

    /* renamed from: a */
    ReentrantLock f5889a = new ReentrantLock();

    /* renamed from: a */
    public HttpClient m1237a() {
        return mo102a(30000, false);
    }

    /* renamed from: b */
    public HttpClient m1236b() {
        return mo102a(30000, true);
    }

    /* renamed from: a */
    public HttpClient mo102a(int i, boolean z) {
        DefaultHttpClient defaultHttpClient;
        boolean z2 = false;
        try {
            z2 = this.f5889a.tryLock(300L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        if (!z2) {
            try {
                AbstractC0916l.m981b("LoadFromMasterServer", "Could not get getNewHttpClient lock! another thread maybe stuck in getNewHttpClient!");
            } catch (Throwable th) {
                if (z2) {
                    this.f5889a.unlock();
                }
                throw th;
            }
        }
        if (!z) {
            defaultHttpClient = AndroidHttpClient.m4996a((String) null);
        } else {
            defaultHttpClient = new DefaultHttpClient();
        }
        HttpParams params = defaultHttpClient.getParams();
        HttpConnectionParams.setConnectionTimeout(params, i);
        HttpConnectionParams.setSoTimeout(params, 20000);
        if (z2) {
            this.f5889a.unlock();
        }
        return defaultHttpClient;
    }

    /* renamed from: a */
    public void mo101a(HttpClient httpClient) {
        if (httpClient instanceof AndroidHttpClient) {
            ((AndroidHttpClient) httpClient).m4998a();
        }
    }
}
