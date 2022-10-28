package com.corrodinggames.rts.gameFramework.utility.p048a;

import android.content.Context;
import android.net.Uri;
import com.corrodinggames.rts.appFramework.C0090c;
import com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope;
import com.corrodinggames.rts.gameFramework.C0758f;
import com.corrodinggames.rts.gameFramework.utility.C1098j;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.corrodinggames.rts.gameFramework.utility.a.b */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/utility/a/b.class */
public class C1069b {

    /* renamed from: a */
    Uri f6801a;

    /* renamed from: b */
    Uri f6802b;

    /* renamed from: c */
    String f6803c;

    /* renamed from: d */
    boolean f6804d;

    /* renamed from: e */
    C1070c f6805e;

    /* renamed from: f */
    boolean f6806f = false;

    /* renamed from: g */
    int f6807g = 1;

    public C1069b(Uri uri, boolean z) {
        this.f6801a = uri;
        this.f6802b = C1068a.f6798a.buildDocumentUriUsingTree(uri);
        this.f6803c = C1068a.f6798a.getReadablePath(m699c(), uri);
        this.f6804d = z;
        C1068a.m712h("== new SafLink write:" + z + " ==");
        C1068a.m712h("root:" + this.f6801a);
        C1068a.m712h("rootDocument:" + this.f6802b);
        C1068a.m712h("shownUrl:" + this.f6803c);
        this.f6805e = new C1070c(this, VariableScope.nullOrMissingString, this.f6802b, true);
    }

    /* renamed from: a */
    public void m705a() {
        this.f6806f = true;
        this.f6807g++;
    }

    /* renamed from: b */
    public void m701b() {
        C1068a.m712h("== testRoot ==");
        C1068a.f6798a.listWithDetails(m699c(), this.f6802b);
    }

    /* renamed from: c */
    public Context m699c() {
        return C0090c.m4813a();
    }

    /* renamed from: a */
    public boolean m704a(String str) {
        boolean z = false;
        if ("mod-info.txt".equals(str)) {
            z = true;
        }
        if (z) {
            return C1068a.f6798a.exists(m699c(), m695f(str));
        }
        if (m690k(str) == null) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public C1098j m700b(String str) {
        Uri m695f;
        boolean z = false;
        if ("mod-info.txt".equals(str)) {
            z = true;
        }
        if (!z) {
            C1070c m690k = m690k(str);
            if (m690k == null) {
                return null;
            }
            m695f = m690k.f6809b;
        } else {
            m695f = m695f(str);
        }
        if (m695f == null) {
            return null;
        }
        try {
            InputStream read = C1068a.f6798a.read(m699c(), m695f);
            if (read == null) {
                return null;
            }
            return new C1098j(read, this.f6801a + "/" + str);
        } catch (FileNotFoundException e) {
            C1068a.m710j("openAssetSteam: " + e.getMessage() + " (file: " + str + ")");
            return null;
        } catch (IllegalArgumentException e2) {
            C1068a.m710j("openAssetSteam: " + e2.getMessage() + " (file: " + str + ")");
            return null;
        }
    }

    /* renamed from: c */
    public long m698c(String str) {
        Uri m695f = m695f(str);
        if (m695f == null) {
            C1068a.m712h("getLastModified file missing: " + str);
            return 0L;
        }
        return C1068a.f6798a.getLastModified(m699c(), m695f);
    }

    /* renamed from: d */
    public long m697d(String str) {
        Uri m695f = m695f(str);
        if (m695f == null) {
            C1068a.m712h("getEntrySize file missing: " + str);
            return -1L;
        }
        return C1068a.f6798a.getFileSize(m699c(), m695f);
    }

    /* renamed from: a */
    public OutputStream m702a(String str, boolean z) {
        C1068a.m711i("writableOutputSteam:" + str);
        Uri m695f = m695f(str);
        if (m695f == null) {
            String name = new File(str).getName();
            Uri m692i = m692i(str);
            C1068a.m711i("writableOutputSteam creating: " + name + " in " + m692i);
            if (m692i == null) {
                C1068a.m710j("writableOutputSteam: Parent folder not found for: " + str);
                return null;
            }
            try {
                m695f = C1068a.f6798a.createFile(m699c(), m692i, VariableScope.nullOrMissingString, name);
                C1068a.m711i("newFileUri: " + m695f);
            } catch (FileNotFoundException e) {
                e.printStackTrace();
                return null;
            }
        }
        String str2 = "w";
        if (z) {
            str2 = "wa";
        }
        try {
            OutputStream write = C1068a.f6798a.write(m699c(), m695f, str2);
            m705a();
            return write;
        } catch (FileNotFoundException e2) {
            e2.printStackTrace();
            return null;
        }
    }

    /* renamed from: e */
    public boolean m696e(String str) {
        if (!this.f6804d) {
            C1068a.m710j("deleteFile: Not open as writable");
            return false;
        }
        Uri m695f = m695f(str);
        if (m695f == null) {
            C1068a.m710j("deleteFile: fileUri==null for:" + str);
            return false;
        } else if (C1068a.f6798a.isDirectory(m699c(), m695f)) {
            throw new RuntimeException("Attempted to delete folder at: " + str + " url:" + m695f);
        } else {
            try {
                boolean deleteFile = C1068a.f6798a.deleteFile(m699c(), m695f);
                m705a();
                return deleteFile;
            } catch (IOException e) {
                e.printStackTrace();
                return false;
            } catch (IllegalArgumentException e2) {
                e2.printStackTrace();
                return false;
            }
        }
    }

    /* renamed from: a */
    public boolean m703a(String str, String str2) {
        if (!this.f6804d) {
            C1068a.m710j("renameFile: Not open as writable");
            return false;
        }
        Uri m695f = m695f(str);
        if (m695f == null) {
            C1068a.m710j("renameFile: fileUri==null for:" + str);
            return false;
        }
        String m2025k = C0758f.m2025k(str2);
        C1068a.m711i("Rename: " + m695f + " to " + m2025k);
        try {
            Uri renameFile = C1068a.f6798a.renameFile(m699c(), m695f, m2025k);
            m705a();
            return renameFile != null;
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
    }

    /* renamed from: f */
    public Uri m695f(String str) {
        C1070c m690k = m690k(str);
        if (m690k == null) {
            return null;
        }
        return m690k.f6809b;
    }

    /* renamed from: g */
    public String[] m694g(String str) {
        C1070c m690k = m690k(str);
        if (m690k == null || !m690k.f6810c) {
            return null;
        }
        HashMap m688a = m690k.m688a();
        ArrayList arrayList = new ArrayList();
        for (String str2 : m688a.keySet()) {
            arrayList.add(str2);
        }
        return (String[]) arrayList.toArray(new String[0]);
    }

    /* renamed from: h */
    public boolean m693h(String str) {
        if (str.equals("/") || str.equals(VariableScope.nullOrMissingString)) {
            return true;
        }
        C1070c m690k = m690k(str);
        if (m690k == null) {
            return false;
        }
        return m690k.f6810c;
    }

    /* renamed from: i */
    public Uri m692i(String str) {
        String parent = new File(str).getParent();
        if (parent == null) {
            parent = VariableScope.nullOrMissingString;
        }
        Uri m695f = m695f(parent);
        if (m695f == null) {
            C1068a.m710j("createDirectory: Parent folder: " + parent + " not found");
        }
        return m695f;
    }

    /* renamed from: j */
    public boolean m691j(String str) {
        String name = new File(str).getName();
        Uri m692i = m692i(str);
        if (m692i == null) {
            return false;
        }
        Uri createDirectory = C1068a.f6798a.createDirectory(m699c(), m692i, name);
        m705a();
        return createDirectory != null;
    }

    /* renamed from: k */
    private C1070c m690k(String str) {
        return m689l(str);
    }

    /* renamed from: l */
    private C1070c m689l(String str) {
        String[] split = str.split("\\\\|\\/");
        C1070c c1070c = this.f6805e;
        for (String str2 : split) {
            if (!str2.trim().equals(VariableScope.nullOrMissingString)) {
                try {
                    C1070c c1070c2 = (C1070c) c1070c.m688a().get(str2);
                    if (c1070c2 != null) {
                        c1070c = c1070c2;
                    } else {
                        C1070c c1070c3 = (C1070c) c1070c.f6812e.get(str2.toLowerCase(Locale.ROOT));
                        if (c1070c3 != null) {
                            c1070c = c1070c3;
                        } else {
                            C1068a.m711i("child null for: " + str);
                            C1068a.m711i("element: " + str2);
                            return null;
                        }
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                    return null;
                }
            }
        }
        return c1070c;
    }
}
