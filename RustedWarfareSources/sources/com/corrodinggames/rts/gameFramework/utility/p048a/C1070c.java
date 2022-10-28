package com.corrodinggames.rts.gameFramework.utility.p048a;

import android.content.Context;
import android.net.Uri;
import com.corrodinggames.rts.appFramework.C0090c;
import com.corrodinggames.rts.appFramework.common.SAFInterface;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.corrodinggames.rts.gameFramework.utility.a.c */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/utility/a/c.class */
public class C1070c {

    /* renamed from: a */
    String f6808a;

    /* renamed from: b */
    Uri f6809b;

    /* renamed from: c */
    boolean f6810c;

    /* renamed from: d */
    HashMap f6811d;

    /* renamed from: e */
    HashMap f6812e;

    /* renamed from: f */
    boolean f6813f;

    /* renamed from: g */
    int f6814g;

    /* renamed from: h */
    final /* synthetic */ C1069b f6815h;

    public C1070c(C1069b c1069b, String str, Uri uri, boolean z) {
        this.f6815h = c1069b;
        this.f6808a = str;
        this.f6809b = uri;
        this.f6810c = z;
    }

    /* renamed from: a */
    public HashMap m688a() {
        if (this.f6811d == null || this.f6813f || this.f6814g != this.f6815h.f6807g) {
            synchronized (this) {
                if (this.f6811d == null || this.f6813f || this.f6814g != this.f6815h.f6807g) {
                    m687a(C0090c.m4813a());
                }
            }
        }
        return this.f6811d;
    }

    /* renamed from: a */
    public void m687a(Context context) {
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        if (this.f6810c) {
            Iterator it = C1068a.f6798a.listWithDetails(context, this.f6809b).iterator();
            while (it.hasNext()) {
                SAFInterface.FileRow fileRow = (SAFInterface.FileRow) it.next();
                Uri childUri = C1068a.f6798a.getChildUri(this.f6809b, fileRow.id);
                String str = fileRow.name;
                boolean z = fileRow.isDirectory;
                if (str.contains("/")) {
                    C1068a.m712h("Name contains symbols: " + str);
                    str = str.replace("/", "_");
                }
                C1070c c1070c = new C1070c(this.f6815h, this.f6808a + "/" + str, childUri, z);
                hashMap.put(str, c1070c);
                String lowerCase = str.toLowerCase(Locale.ROOT);
                if (hashMap2.get(lowerCase) == null) {
                    hashMap2.put(lowerCase, c1070c);
                }
            }
        }
        this.f6811d = hashMap;
        this.f6812e = hashMap2;
        this.f6813f = false;
        this.f6814g = this.f6815h.f6807g;
    }
}
