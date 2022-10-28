package android.content;

import android.content.pm.PackageManager;
import android.content.res.AssetManager;
import android.content.res.Resources;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

/* loaded from: game-lib.jar:android/content/ContextWrapper.class */
public class ContextWrapper extends Context {

    /* renamed from: a */
    Context f115a;

    public ContextWrapper(Context context) {
        this.f115a = context;
    }

    /* renamed from: k */
    public Context m5178k() {
        return this.f115a;
    }

    @Override // android.content.Context
    /* renamed from: d */
    public AssetManager mo5171d() {
        return this.f115a.mo5171d();
    }

    @Override // android.content.Context
    /* renamed from: e */
    public Resources mo5170e() {
        return this.f115a.mo5170e();
    }

    @Override // android.content.Context
    /* renamed from: f */
    public PackageManager mo5169f() {
        return this.f115a.mo5169f();
    }

    @Override // android.content.Context
    /* renamed from: g */
    public Context mo5168g() {
        return this.f115a.mo5168g();
    }

    @Override // android.content.Context
    /* renamed from: h */
    public String mo5167h() {
        return this.f115a.mo5167h();
    }

    @Override // android.content.Context
    /* renamed from: a */
    public SharedPreferences mo5175a(String str, int i) {
        return this.f115a.mo5175a(str, i);
    }

    @Override // android.content.Context
    /* renamed from: a */
    public FileInputStream mo5176a(String str) {
        return this.f115a.mo5176a(str);
    }

    @Override // android.content.Context
    /* renamed from: b */
    public FileOutputStream mo5173b(String str, int i) {
        return this.f115a.mo5173b(str, i);
    }

    @Override // android.content.Context
    /* renamed from: b */
    public File mo5174b(String str) {
        return this.f115a.mo5174b(str);
    }

    @Override // android.content.Context
    /* renamed from: i */
    public File mo5166i() {
        return this.f115a.mo5166i();
    }

    @Override // android.content.Context
    /* renamed from: j */
    public File mo5165j() {
        return this.f115a.mo5165j();
    }

    @Override // android.content.Context
    /* renamed from: a */
    public void mo5177a(Intent intent) {
        this.f115a.mo5177a(intent);
    }

    @Override // android.content.Context
    /* renamed from: c */
    public Object mo5172c(String str) {
        return this.f115a.mo5172c(str);
    }
}
