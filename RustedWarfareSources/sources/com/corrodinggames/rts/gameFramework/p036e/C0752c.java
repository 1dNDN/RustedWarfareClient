package com.corrodinggames.rts.gameFramework.p036e;

import android.content.res.AssetManager;
import android.os.Environment;
import com.corrodinggames.rts.appFramework.C0090c;
import com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope;
import com.corrodinggames.rts.gameFramework.AbstractC0916l;
import com.corrodinggames.rts.gameFramework.C0758f;
import com.corrodinggames.rts.gameFramework.p040h.C0824b;
import com.corrodinggames.rts.gameFramework.utility.AbstractC1076af;
import com.corrodinggames.rts.gameFramework.utility.C1075ae;
import com.corrodinggames.rts.gameFramework.utility.C1098j;
import com.corrodinggames.rts.gameFramework.utility.p048a.C1068a;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Locale;

/* renamed from: com.corrodinggames.rts.gameFramework.e.c */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/e/c.class */
public class C0752c {

    /* renamed from: a */
    public String f4873a = "FileLoader: ";

    /* renamed from: b */
    public boolean f4874b = false;

    /* renamed from: c */
    public boolean f4875c = true;

    /* renamed from: d */
    public boolean f4876d = false;

    /* renamed from: e */
    String f4877e;

    /* renamed from: f */
    String f4878f;

    /* renamed from: a */
    public String mo2190a() {
        String str = this.f4877e;
        this.f4877e = null;
        return str;
    }

    /* renamed from: a */
    public void mo2189a(String str) {
        this.f4877e = str;
    }

    /* renamed from: a */
    public String mo2188a(String str, String str2) {
        File[] listFiles = new File(str).listFiles();
        if (listFiles == null) {
            AbstractC0916l.m963e(this.f4873a + "findFileExtension('" + str + "','" + str2 + "'): path is not a folder");
            return null;
        }
        for (File file : listFiles) {
            String name = file.getName();
            if (name.contains(".")) {
                name = name.substring(0, name.lastIndexOf(46));
            }
            if (name.equals(str2)) {
                return str + "/" + file.getName();
            }
        }
        AbstractC0916l.m963e(this.f4873a + "Could not find file with path: " + str + " file:" + str2);
        return null;
    }

    /* renamed from: b */
    public boolean mo2186b(String str) {
        if (AbstractC0916l.f6115aU || str.startsWith("/") || str.startsWith("/SD/")) {
            return false;
        }
        return true;
    }

    /* renamed from: c */
    public boolean mo2185c(String str) {
        if (str.startsWith("/") || str.startsWith("\\")) {
            return true;
        }
        if (AbstractC0916l.f6115aU) {
            if (str.startsWith("mods")) {
                return true;
            }
            if (AbstractC0916l.f6120aZ && str.startsWith("converted-sounds")) {
                return true;
            }
        }
        if (str.split("\\\\")[0].endsWith(":")) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    public String mo2184d(String str) {
        AbstractC0916l m1071A = AbstractC0916l.m1071A();
        if (str.contains("MOD|")) {
            String[] split = str.split("/");
            if (split.length >= 2) {
                String str2 = split[split.length - 1];
                boolean z = false;
                int length = split.length - 2;
                while (true) {
                    if (length < 0) {
                        break;
                    }
                    String str3 = split[length];
                    if (str3.startsWith("MOD|")) {
                        String substring = str3.substring("MOD|".length());
                        C0824b m1657c = m1071A.f6172bZ.m1657c(substring);
                        if (m1657c == null) {
                            AbstractC0916l.m963e(this.f4873a + "Failed to find mod with hash:" + substring);
                        } else {
                            str2 = C0758f.m2081b(m1657c.m1629g(), str2);
                            AbstractC0916l.m963e(this.f4873a + "Path changed to mod path:" + str2);
                            z = true;
                            break;
                        }
                    }
                    str2 = str3 + File.separator + str2;
                    length--;
                }
                if (z) {
                    str = str2;
                }
            }
            if (str.contains("MOD|")) {
                AbstractC0916l.m963e(this.f4873a + "Path still contains prefix: " + str);
            }
        }
        if (str.contains("NEW_PATH|")) {
            String[] split2 = str.split("/");
            if (split2.length >= 2) {
                String str4 = split2[split2.length - 1];
                boolean z2 = false;
                int length2 = split2.length - 2;
                while (true) {
                    if (length2 < 0) {
                        break;
                    }
                    String str5 = split2[length2];
                    if (str5.startsWith("NEW_PATH|") && str5.substring("NEW_PATH|".length()).equals("maps2")) {
                        str4 = "/SD/rustedWarfare/maps" + File.separator + str4;
                        AbstractC0916l.m963e(this.f4873a + "Path changed to maps2 path:" + str4);
                        z2 = true;
                        break;
                    }
                    str4 = str5 + File.separator + str4;
                    length2--;
                }
                if (z2) {
                    str = str4;
                }
            }
        }
        return str;
    }

    /* renamed from: e */
    public String mo2183e(String str) {
        if (str == null) {
            return "<null>";
        }
        String mo2182f = mo2182f(str);
        AbstractC1076af m606b = C1075ae.m606b(mo2182f);
        if (m606b != null) {
            return m606b.mo592f(mo2182f);
        }
        return mo2182f;
    }

    /* renamed from: f */
    public String mo2182f(String str) {
        String mo2184d = mo2184d(str);
        if (AbstractC0916l.f6115aU) {
            if (mo2184d.startsWith("/SD/rusted_warfare_maps")) {
                mo2184d = "/SD/mods/maps" + mo2184d.substring("/SD/rusted_warfare_maps".length());
                AbstractC0916l.m963e(this.f4873a + "convertAbstractPath: Changing to:" + mo2184d);
            }
            if (mo2184d.startsWith("/SD/rustedWarfare/maps")) {
                mo2184d = "/SD/mods/maps" + mo2184d.substring("/SD/rustedWarfare/maps".length());
                AbstractC0916l.m963e(this.f4873a + "convertAbstractPath2: Changing to:" + mo2184d);
            }
            if (mo2184d.startsWith("/SD/") || mo2184d.startsWith("\\SD\\")) {
                String substring = mo2184d.substring("/SD/".length());
                if (substring.startsWith("rustedWarfare/")) {
                    substring = substring.substring("rustedWarfare/".length());
                }
                return mo2171b() + substring;
            } else if (mo2185c(mo2184d)) {
                return mo2184d;
            } else {
                return "assets/" + mo2184d;
            }
        } else if (mo2184d.startsWith("/SD/")) {
            String substring2 = mo2184d.substring("/SD/".length());
            if (substring2.startsWith("rustedWarfare/")) {
                substring2 = substring2.substring("rustedWarfare/".length());
            }
            return mo2171b() + substring2;
        } else {
            return mo2184d;
        }
    }

    /* renamed from: f */
    private String m2196f() {
        if (this.f4878f == null) {
            this.f4878f = Environment.getExternalStorageDirectory() + VariableScope.nullOrMissingString;
        }
        return this.f4878f;
    }

    /* renamed from: g */
    public boolean mo2181g(String str) {
        String mo2182f = mo2182f(str);
        AbstractC1076af m608a = C1075ae.m608a(mo2182f);
        if (m608a != null) {
            return m608a.mo596d(mo2182f);
        }
        if (mo2186b(str)) {
            if (this.f4876d) {
                return false;
            }
            if (!AbstractC0916l.m1071A().f6157bK.m547a(mo2182f)) {
                AbstractC0916l.m963e(this.f4873a + "isDirectory: asset file doesn't exist:" + mo2182f);
                return false;
            } else if (C0758f.m2025k(str).contains(".")) {
                return false;
            } else {
                return true;
            }
        }
        File file = new File(mo2182f);
        if (!file.exists()) {
            AbstractC0916l.m963e(this.f4873a + "isDirectory: file doesn't exist:" + mo2182f);
            return false;
        }
        return file.isDirectory();
    }

    /* renamed from: h */
    public boolean mo2180h(String str) {
        String mo2182f = mo2182f(str);
        AbstractC1076af m608a = C1075ae.m608a(mo2182f);
        if (m608a != null) {
            boolean mo603a = m608a.mo603a(mo2182f);
            if (this.f4875c) {
                AbstractC0916l.m963e("fileExists: " + mo603a + " with reader: " + m608a + " convertedDir:" + mo2182f);
            }
            return mo603a;
        } else if (mo2186b(str)) {
            if (this.f4876d) {
                if (this.f4875c) {
                    AbstractC0916l.m963e("fileExists: false with disableAssets");
                    return false;
                }
                return false;
            }
            boolean m547a = AbstractC0916l.m1071A().f6157bK.m547a(mo2182f);
            if (this.f4875c) {
                AbstractC0916l.m963e("fileExists: " + m547a + " with abstractPathAsset convertedDir:" + mo2182f);
            }
            return m547a;
        } else {
            File file = new File(mo2182f);
            if (file == null || !file.exists()) {
                if (this.f4875c) {
                    AbstractC0916l.m963e("fileExists: false with normal file convertedDir:" + mo2182f);
                    return false;
                }
                return false;
            }
            return true;
        }
    }

    /* renamed from: a */
    public String[] mo2172a(String str, boolean z) {
        String[] list;
        String[] strArr;
        try {
            String mo2182f = mo2182f(str);
            AbstractC1076af m608a = C1075ae.m608a(mo2182f);
            if (m608a != null) {
                list = m608a.mo600b(mo2182f);
            } else if (mo2186b(str)) {
                if (this.f4876d) {
                    return null;
                }
                list = AbstractC0916l.m1071A().f6157bK.m545b(mo2182f);
            } else {
                File file = new File(mo2182f);
                if (file == null || !file.exists()) {
                    String str2 = "listDir: path doesn't exist:" + mo2182f;
                    AbstractC0916l.m982b(str2);
                    C0750a.m2221b(str2);
                    return null;
                }
                list = file.list();
                if (list == null) {
                    if (file != null && !file.isDirectory()) {
                        C0750a.m2221b("path is not a directory, .rwmod or .zip");
                        return null;
                    }
                    return null;
                }
            }
            if (list == null) {
                AbstractC0916l.m963e(this.f4873a + "listDir baseList==null:" + str + " (non folder?)");
                return null;
            }
            ArrayList arrayList = new ArrayList();
            if (z) {
                for (String str3 : list) {
                    if (str3.toLowerCase(Locale.ENGLISH).endsWith(".tmx")) {
                        arrayList.add(str3);
                    }
                }
            } else {
                for (String str4 : list) {
                    arrayList.add(str4);
                }
            }
            Collections.sort(arrayList);
            return (String[]) arrayList.toArray(new String[0]);
        } catch (OutOfMemoryError e) {
            C0750a.m2221b(e.getMessage());
            return null;
        }
    }

    /* renamed from: i */
    public File m2195i(String str) {
        if (str.contains("\\")) {
            str = str.replace('\\', '/');
        }
        File file = new File(str);
        if (file.exists()) {
            return file;
        }
        File parentFile = file.getParentFile();
        if (parentFile == null || !parentFile.isDirectory()) {
            parentFile = m2195i(parentFile.getAbsolutePath());
            if (parentFile == null || !parentFile.isDirectory()) {
                AbstractC0916l.m963e(this.f4873a + "createFileCaseInsensitive: did not find parent for: " + str);
                return null;
            }
        }
        File[] listFiles = parentFile.listFiles();
        if (listFiles == null) {
            AbstractC0916l.m963e(this.f4873a + "createFileCaseInsensitive: Failed to list files for: " + str + " in " + parentFile);
            return null;
        }
        for (File file2 : listFiles) {
            if (file2.getName().equalsIgnoreCase(file.getName())) {
                return file2;
            }
        }
        return null;
    }

    /* renamed from: j */
    public C1098j mo2179j(String str) {
        if (str.startsWith("assets/") || str.startsWith("assets\\")) {
            str = str.substring("assets/".length());
        }
        String str2 = str;
        String str3 = "assets/" + str;
        AssetManager mo5171d = C0090c.m4813a().mo5171d();
        if (AbstractC0916l.f6119aY) {
        }
        try {
            try {
                return new C1098j(mo5171d.m5159a(str2), str3, str2);
            } catch (FileNotFoundException e) {
                return null;
            }
        } catch (IOException e2) {
            AbstractC0916l.m963e(this.f4873a + "Could not find asset:" + str3);
            return null;
        }
    }

    /* renamed from: k */
    public C1098j mo2178k(String str) {
        C1098j c1098j;
        String mo2182f = mo2182f(str);
        AbstractC1076af m608a = C1075ae.m608a(mo2182f);
        if (m608a != null && !mo2182f.endsWith(".rwmod")) {
            return m608a.mo599b(mo2182f, true);
        }
        if (str.startsWith("/SD/") || str.startsWith("\\SD\\")) {
            String substring = str.substring("/SD/".length());
            String str2 = substring;
            if (str2.startsWith("rustedWarfare/")) {
                str2 = str2.substring("rustedWarfare/".length());
            }
            String str3 = mo2171b() + str2;
            if (this.f4874b) {
                AbstractC0916l.m963e(this.f4873a + "openAssetSteam converted:" + substring + " to: " + str3);
            }
            try {
                File m2195i = m2195i(str3);
                if (m2195i == null) {
                    return null;
                }
                c1098j = new C1098j(new FileInputStream(m2195i), m2195i.getAbsolutePath());
            } catch (FileNotFoundException e) {
                return null;
            }
        } else if (mo2185c(str)) {
            try {
                File m2195i2 = m2195i(str);
                if (m2195i2 == null) {
                    return null;
                }
                c1098j = new C1098j(new FileInputStream(m2195i2), m2195i2.getAbsolutePath());
            } catch (FileNotFoundException e2) {
                return null;
            }
        } else {
            c1098j = mo2179j(str);
        }
        return c1098j;
    }

    /* renamed from: b */
    public OutputStream m2198b(String str, boolean z) {
        String mo2182f = mo2182f(str);
        AbstractC1076af m608a = C1075ae.m608a(mo2182f);
        if (m608a != null && !mo2182f.endsWith(".rwmod")) {
            return m608a.mo597c(mo2182f, z);
        }
        return new FileOutputStream(mo2182f, z);
    }

    /* renamed from: l */
    public boolean m2194l(String str) {
        String mo2182f = mo2182f(str);
        AbstractC1076af m608a = C1075ae.m608a(mo2182f);
        if (m608a != null && !mo2182f.endsWith(".rwmod")) {
            boolean mo594e = m608a.mo594e(mo2182f);
            if (!mo594e) {
                AbstractC0916l.m963e("Failed to create directory: " + mo2182f + " using reader:" + m608a);
            }
            return mo594e;
        }
        boolean mkdirs = new File(mo2182f).mkdirs();
        if (!mkdirs) {
            AbstractC0916l.m963e("Failed to create directory: " + mo2182f);
        }
        return mkdirs;
    }

    /* renamed from: b */
    public String mo2171b() {
        if (AbstractC0916l.f6115aU) {
            return VariableScope.nullOrMissingString;
        }
        return m2196f() + "/rustedWarfare/";
    }

    /* renamed from: c */
    public String m2197c() {
        if (AbstractC0916l.m996as()) {
            String absolutePath = C0090c.m4813a().mo5166i().getAbsolutePath();
            if (!absolutePath.endsWith("/")) {
                absolutePath = absolutePath + "/";
            }
            return absolutePath;
        }
        String mo2171b = mo2171b();
        if (mo2171b.equals(VariableScope.nullOrMissingString)) {
            return "cache/";
        }
        return mo2171b + "/cache/";
    }

    /* renamed from: m */
    public long m2193m(String str) {
        String mo2182f = mo2182f(str);
        AbstractC1076af m608a = C1075ae.m608a(mo2182f);
        if (m608a != null) {
            return m608a.mo591g(mo2182f);
        }
        File file = new File(mo2182f);
        if (!file.exists()) {
        }
        return file.lastModified();
    }

    /* renamed from: a */
    public void m2201a(File file) {
        if (AbstractC0916l.m996as()) {
        }
    }

    /* renamed from: a */
    public File mo2187a(String str, String str2, boolean z) {
        File file = new File(mo2171b() + str2 + str);
        if (z) {
            File parentFile = file.getParentFile();
            if (!C0750a.m2209h(parentFile.getAbsolutePath())) {
                AbstractC0916l.m963e("Making missing parent dir: " + parentFile.getAbsolutePath());
                if (!C0750a.m2206k(parentFile.getAbsolutePath())) {
                    AbstractC0916l.m982b("getRWFile: Could not create parent directory");
                }
            }
            if (AbstractC0916l.m996as()) {
            }
        }
        return file;
    }

    /* renamed from: d */
    public String mo2170d() {
        return "external";
    }

    /* renamed from: n */
    public String mo2177n(String str) {
        return mo2170d();
    }

    /* renamed from: e */
    public boolean mo2169e() {
        return true;
    }

    /* renamed from: o */
    public String m2192o(String str) {
        int indexOf;
        int indexOf2;
        if (str == null) {
            return null;
        }
        if (str.indexOf("[INTERNAL-PATH]/") != -1) {
            String str2 = str.substring(0, indexOf) + str.substring(indexOf + "[INTERNAL-PATH]/".length());
            if (str2.contains("[INTERNAL-PATH]/") || str2.contains("[EXTERNAL-PATH]/")) {
                AbstractC0916l.m963e("fixPath: double tag for: " + str);
            }
            return str2;
        }
        if (str.indexOf("[EXTERNAL-PATH]/") != -1) {
            String str3 = str.substring(0, indexOf2) + str.substring(indexOf2 + "[EXTERNAL-PATH]/".length());
            if (str3.contains("[INTERNAL-PATH]/") || str3.contains("[EXTERNAL-PATH]/")) {
                AbstractC0916l.m963e("fixPath: double tag for: " + str);
            }
            return str3;
        }
        return str;
    }

    /* renamed from: p */
    public String mo2176p(String str) {
        return str;
    }

    /* renamed from: b */
    public boolean m2199b(File file) {
        AbstractC0916l.m963e("deleteFile: " + file.getAbsolutePath());
        AbstractC1076af m606b = C1075ae.m606b(file.getAbsolutePath());
        if (m606b != null) {
            AbstractC0916l.m963e("Mapped delete");
            return m606b.mo598c(file.getAbsolutePath());
        }
        AbstractC0916l.m963e("Native delete");
        return file.delete();
    }

    /* renamed from: a */
    public boolean m2200a(File file, File file2) {
        AbstractC0916l.m963e("renameFile: " + file.getAbsolutePath() + " to:" + file2.getAbsolutePath());
        AbstractC1076af m606b = C1075ae.m606b(file.getAbsolutePath());
        if (m606b != null) {
            try {
                boolean mo602a = m606b.mo602a(file.getAbsolutePath(), file2.getAbsolutePath());
                C1075ae.m605c(file2.getAbsolutePath());
                return mo602a;
            } catch (Exception e) {
                e.printStackTrace();
                return false;
            }
        }
        boolean renameTo = file.renameTo(file2);
        C1075ae.m605c(file2.getAbsolutePath());
        return renameTo;
    }

    /* renamed from: q */
    public boolean m2191q(String str) {
        AbstractC1076af m606b = C1075ae.m606b(mo2182f(str));
        if (m606b != null && (m606b instanceof C1068a)) {
            return true;
        }
        return false;
    }
}
