package com.corrodinggames.rts.java;

import com.corrodinggames.rts.gameFramework.AbstractC0916l;
import com.corrodinggames.rts.gameFramework.p041i.C0885r;
import java.io.IOException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;

/* renamed from: com.corrodinggames.rts.java.k */
/* loaded from: game-lib.jar:com/corrodinggames/rts/java/k.class */
public class C1181k extends C0885r {
    @Override // com.corrodinggames.rts.gameFramework.p041i.C0885r
    /* renamed from: a */
    public HttpClient mo102a(int i, boolean z) {
        RequestConfig.Builder connectionRequestTimeout = RequestConfig.custom().setConnectTimeout(i).setConnectionRequestTimeout(i);
        HttpClientBuilder create = HttpClientBuilder.create();
        create.setDefaultRequestConfig(connectionRequestTimeout.build());
        return create.build();
    }

    @Override // com.corrodinggames.rts.gameFramework.p041i.C0885r
    /* renamed from: a */
    public void mo101a(HttpClient httpClient) {
        if (httpClient instanceof CloseableHttpClient) {
            try {
                ((CloseableHttpClient) httpClient).close();
                return;
            } catch (IOException e) {
                e.printStackTrace();
                return;
            }
        }
        AbstractC0916l.m963e("closeHttpClient: Didn't close");
    }
}
