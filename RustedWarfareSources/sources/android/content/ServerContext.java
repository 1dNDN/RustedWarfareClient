package android.content;

import android.content.pm.PackageManager;
import android.content.res.AssetManager;
import android.content.res.Resources;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

/* loaded from: game-lib.jar:android/content/ServerContext.class */
public class ServerContext extends Context {

    /* renamed from: a */
    AssetManager f116a = new AssetManager();

    @Override // android.content.Context
    /* renamed from: d */
    public AssetManager mo5171d() {
        return this.f116a;
    }

    @Override // android.content.Context
    /* renamed from: e */
    public Resources mo5170e() {
        return null;
    }

    @Override // android.content.Context
    /* renamed from: f */
    public PackageManager mo5169f() {
        return null;
    }

    @Override // android.content.Context
    /* renamed from: g */
    public Context mo5168g() {
        return this;
    }

    @Override // android.content.Context
    /* renamed from: h */
    public String mo5167h() {
        return null;
    }

    @Override // android.content.Context
    /* renamed from: a */
    public SharedPreferences mo5175a(String str, int i) {
        return null;
    }

    @Override // android.content.Context
    /* renamed from: a */
    public FileInputStream mo5176a(String str) {
        return null;
    }

    @Override // android.content.Context
    /* renamed from: b */
    public FileOutputStream mo5173b(String str, int i) {
        return null;
    }

    @Override // android.content.Context
    /* renamed from: b */
    public File mo5174b(String str) {
        return null;
    }

    @Override // android.content.Context
    /* renamed from: i */
    public File mo5166i() {
        return null;
    }

    @Override // android.content.Context
    /* renamed from: j */
    public File mo5165j() {
        return null;
    }

    @Override // android.content.Context
    /* renamed from: a */
    public void mo5177a(Intent intent) {
    }

    @Override // android.content.Context
    /* renamed from: c */
    public Object mo5172c(String str) {
        return null;
    }
}
