package com.corrodinggames.rts.gameFramework.utility;

import com.corrodinggames.rts.appFramework.C0090c;
import com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope;
import com.corrodinggames.rts.gameFramework.AbstractC0916l;
import com.corrodinggames.rts.gameFramework.C0727bl;
import com.corrodinggames.rts.gameFramework.C0758f;
import com.corrodinggames.rts.gameFramework.p036e.C0750a;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

/* renamed from: com.corrodinggames.rts.gameFramework.utility.ah */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/utility/ah.class */
public class C1079ah {

    /* renamed from: a */
    String f6844a = VariableScope.nullOrMissingString;

    /* renamed from: b */
    String f6845b;

    /* renamed from: c */
    ZipFile f6846c;

    /* renamed from: d */
    String[] f6847d;

    /* renamed from: e */
    boolean f6848e;

    public C1079ah(String str, String str2) {
        this.f6845b = str;
        AbstractC0916l.m957g("Opening new zip at: " + str2);
        AbstractC1076af m606b = C1075ae.m606b(str2);
        if (m606b != null) {
            AbstractC0916l.m963e("Temp file needed for zip with SAF interface");
            if (!AbstractC0916l.m996as()) {
                throw new IOException("Failed to open source zip with mapper: " + str2);
            }
            long m2370a = C0727bl.m2370a();
            C1098j mo599b = m606b.mo599b(str2, true);
            if (mo599b == null) {
                throw new IOException("Failed to open file of zip: " + str2);
            }
            this.f6846c = m584a(mo599b, (Charset) null);
            AbstractC0916l.m963e("Streamed zip open took:" + C0727bl.m2369a(C0727bl.m2368a(m2370a)));
        } else {
            this.f6846c = new ZipFile(str2);
        }
        try {
            m581b();
        } catch (IllegalArgumentException e) {
            C1077ag.m590h("Failed to open source zip with unicode encoding, attempting with ISO-8859-1");
            Charset forName = Charset.forName("ISO-8859-1");
            try {
                if (m606b != null) {
                    AbstractC0916l.m963e("Temp file needed for zip with SAF interface");
                    if (!AbstractC0916l.m996as()) {
                        throw new IOException("Failed to open source zip with mapper: " + str2);
                    }
                    long m2370a2 = C0727bl.m2370a();
                    this.f6846c = m584a(m606b.mo599b(str2, true), forName);
                    AbstractC0916l.m963e("Streamed zip open took:" + C0727bl.m2369a(C0727bl.m2368a(m2370a2)));
                } else {
                    this.f6846c = m582a(str2, forName);
                }
                m581b();
            } catch (RuntimeException e2) {
                e.printStackTrace();
                throw new IOException("Failed to open source zip with unicode and ISO-8859-1 encoding", e2);
            }
        }
    }

    /* renamed from: a */
    public void m585a() {
        if (!this.f6848e) {
            this.f6848e = true;
            if (this.f6846c != null) {
                try {
                    this.f6846c.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    /* renamed from: a */
    public static ZipFile m584a(InputStream inputStream, Charset charset) {
        File m2233a = C0750a.m2233a(C0090c.m4813a(), "safMod", "zip");
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(m2233a);
            C0758f.m2123a(inputStream, fileOutputStream);
            fileOutputStream.close();
            inputStream.close();
            if (charset == null) {
                ZipFile zipFile = new ZipFile(m2233a);
                m2233a.delete();
                return zipFile;
            }
            ZipFile m582a = m582a(m2233a.getAbsolutePath(), charset);
            m2233a.delete();
            return m582a;
        } catch (Throwable th) {
            m2233a.delete();
            throw th;
        }
    }

    /* renamed from: a */
    public static ZipFile m582a(String str, Charset charset) {
        Constructor constructor = null;
        try {
            constructor = ZipFile.class.getDeclaredConstructor(String.class, Charset.class);
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (SecurityException e2) {
            e2.printStackTrace();
        }
        if (constructor == null) {
            throw new IOException("Failed to open source zip with unicode encoding, and no method for ISO-8859-1");
        }
        try {
            return (ZipFile) constructor.newInstance(str, charset);
        } catch (IllegalAccessException e3) {
            throw new IOException(e3);
        } catch (IllegalArgumentException e4) {
            throw new IOException(e4);
        } catch (InstantiationException e5) {
            throw new IOException(e5);
        } catch (InvocationTargetException e6) {
            throw new IOException(e6);
        }
    }

    /* renamed from: b */
    public void m581b() {
        double m2368a;
        long m2370a = C0727bl.m2370a();
        ArrayList arrayList = new ArrayList();
        Enumeration<? extends ZipEntry> entries = this.f6846c.entries();
        while (entries.hasMoreElements()) {
            String name = entries.nextElement().getName();
            if (name == null) {
                throw new RuntimeException("filePath==null");
            }
            arrayList.add(name);
        }
        this.f6847d = (String[]) arrayList.toArray(new String[0]);
        this.f6844a = VariableScope.nullOrMissingString;
        String[] m577e = m577e(VariableScope.nullOrMissingString);
        if (m577e.length == 1 && m578d(m577e[0])) {
            this.f6844a = m577e[0] + "/";
            for (int i = 0; i < this.f6847d.length; i++) {
                if (this.f6847d[i].startsWith(this.f6844a)) {
                    this.f6847d[i] = this.f6847d[i].substring(this.f6844a.length());
                }
            }
        }
        if (C0727bl.m2368a(m2370a) > 3.0d) {
            AbstractC0916l.m963e("zip: buildCache for: " + this.f6845b + ", took:" + C0727bl.m2369a(m2368a));
        }
    }

    /* renamed from: a */
    public void m583a(String str) {
        AbstractC0916l.m963e("Zip: " + str);
    }

    /* renamed from: b */
    public boolean m580b(String str) {
        for (String str2 : this.f6847d) {
            if (str2.equals(str)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: c */
    public boolean m579c(String str) {
        for (String str2 : this.f6847d) {
            if (str2.equals(str)) {
                return true;
            }
        }
        for (String str3 : this.f6847d) {
            if (str3.equalsIgnoreCase(str)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: d */
    public boolean m578d(String str) {
        if (!str.endsWith("/")) {
            str = str + "/";
        }
        if (str.equals("/")) {
            return true;
        }
        for (String str2 : this.f6847d) {
            if (str2.contains(str)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: e */
    public String[] m577e(String str) {
        String[] strArr;
        if (str.equals(VariableScope.nullOrMissingString) || str.equals("/") || str.equals("\\")) {
            str = VariableScope.nullOrMissingString;
        } else if (!str.endsWith("/")) {
            str = str + "/";
        }
        ArrayList arrayList = new ArrayList();
        for (String str2 : this.f6847d) {
            if (str.equals(VariableScope.nullOrMissingString) || str2.startsWith(str)) {
                String substring = str2.substring(str.length());
                if (substring.length() != 0 && !substring.equals("..")) {
                    if (substring.contains("/")) {
                        String substring2 = substring.substring(0, substring.indexOf("/"));
                        if (!arrayList.contains(substring2)) {
                            arrayList.add(substring2);
                        }
                    } else {
                        arrayList.add(substring);
                    }
                }
            }
        }
        return (String[]) arrayList.toArray(new String[0]);
    }

    /* renamed from: f */
    public ZipEntry m576f(String str) {
        ZipEntry nextElement;
        String str2 = this.f6844a + str;
        ZipEntry zipEntry = null;
        IllegalArgumentException illegalArgumentException = null;
        try {
            zipEntry = this.f6846c.getEntry(str2);
        } catch (IllegalArgumentException e) {
            illegalArgumentException = e;
        }
        if (zipEntry == null && m580b(str) && !m578d(str)) {
            Enumeration<? extends ZipEntry> entries = this.f6846c.entries();
            while (entries.hasMoreElements()) {
                try {
                    nextElement = entries.nextElement();
                } catch (IllegalArgumentException e2) {
                    e2.printStackTrace();
                }
                if (nextElement.getName().equals(str2)) {
                    return nextElement;
                }
            }
            m583a("getEntry: Still did not find file after workaround");
        }
        if (illegalArgumentException != null) {
            throw new RuntimeException("Failed to decode data in zip: " + str + " (Check zip encoding, utf-8 is recommended)", illegalArgumentException);
        }
        return zipEntry;
    }

    /* renamed from: g */
    public String m575g(String str) {
        String[] strArr;
        String[] strArr2;
        String[] strArr3;
        String[] strArr4;
        String str2 = str;
        if (!str2.endsWith("/")) {
            str2 = str2 + "/";
        }
        for (String str3 : this.f6847d) {
            if (str3.equals(str)) {
                return str3;
            }
        }
        for (String str4 : this.f6847d) {
            if (str4.equals(str2)) {
                return str4;
            }
        }
        for (String str5 : this.f6847d) {
            if (str5.equalsIgnoreCase(str)) {
                return str5;
            }
        }
        for (String str6 : this.f6847d) {
            if (str6.equalsIgnoreCase(str2)) {
                return str6;
            }
        }
        return str;
    }

    /* renamed from: h */
    public long m574h(String str) {
        ZipEntry m576f = m576f(str);
        if (m576f == null) {
            m583a("getEntrySize: File not found: " + str);
            return -1L;
        }
        return m576f.getSize();
    }

    /* renamed from: i */
    public C1098j m573i(String str) {
        ZipEntry m576f = m576f(str);
        if (m576f == null) {
            m576f = m576f(m575g(str));
        }
        if (m576f == null) {
            return null;
        }
        try {
            try {
                return new C1098j(this.f6846c.getInputStream(m576f), this.f6845b + "/" + str);
            } catch (FileNotFoundException e) {
                e.printStackTrace();
                return null;
            }
        } catch (IOException e2) {
            e2.printStackTrace();
            return null;
        }
    }
}
