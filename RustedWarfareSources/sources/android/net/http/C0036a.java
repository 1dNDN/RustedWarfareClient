package android.net.http;

import org.apache.http.HttpRequest;
import org.apache.http.HttpRequestInterceptor;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.protocol.HttpContext;

/* renamed from: android.net.http.a */
/* loaded from: game-lib.jar:android/net/http/a.class */
class C0036a implements HttpRequestInterceptor {

    /* renamed from: a */
    final /* synthetic */ AndroidHttpClient f265a;

    private C0036a(AndroidHttpClient androidHttpClient) {
        this.f265a = androidHttpClient;
    }

    public void process(HttpRequest httpRequest, HttpContext httpContext) {
        boolean m4990a;
        C0037b m4997a = AndroidHttpClient.m4997a(this.f265a);
        if (m4997a != null) {
            m4990a = m4997a.m4990a();
            if (m4990a && (httpRequest instanceof HttpUriRequest)) {
                m4997a.m4987a(AndroidHttpClient.m4993a((HttpUriRequest) httpRequest, false));
            }
        }
    }
}
