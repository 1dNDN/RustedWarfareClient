package android.content;

import android.content.pm.PackageManager;
import android.content.res.AssetManager;
import android.content.res.Resources;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

/* loaded from: game-lib.jar:android/content/Context.class */
public abstract class Context {
    /* renamed from: d */
    public abstract AssetManager mo5171d();

    /* renamed from: e */
    public abstract Resources mo5170e();

    /* renamed from: f */
    public abstract PackageManager mo5169f();

    /* renamed from: g */
    public abstract Context mo5168g();

    /* renamed from: h */
    public abstract String mo5167h();

    /* renamed from: a */
    public abstract SharedPreferences mo5175a(String str, int i);

    /* renamed from: a */
    public abstract FileInputStream mo5176a(String str);

    /* renamed from: b */
    public abstract FileOutputStream mo5173b(String str, int i);

    /* renamed from: b */
    public abstract File mo5174b(String str);

    /* renamed from: i */
    public abstract File mo5166i();

    /* renamed from: j */
    public abstract File mo5165j();

    /* renamed from: a */
    public abstract void mo5177a(Intent intent);

    /* renamed from: c */
    public abstract Object mo5172c(String str);
}
