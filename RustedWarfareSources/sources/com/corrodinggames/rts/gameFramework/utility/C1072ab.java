package com.corrodinggames.rts.gameFramework.utility;

import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.Rect;
import com.corrodinggames.rts.game.units.custom.C0351ai;
import com.corrodinggames.rts.game.units.custom.C0385az;
import com.corrodinggames.rts.game.units.custom.C0400ba;
import com.corrodinggames.rts.game.units.custom.C0412bm;
import com.corrodinggames.rts.game.units.custom.C0448g;
import com.corrodinggames.rts.game.units.custom.C0449h;
import com.corrodinggames.rts.game.units.custom.C0453l;
import com.corrodinggames.rts.game.units.custom.C0462t;
import com.corrodinggames.rts.game.units.custom.logicBooleans.BooleanParseException;
import com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean;
import com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBooleanLoader;
import com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope;
import com.corrodinggames.rts.game.units.custom.p021e.C0428a;
import com.corrodinggames.rts.gameFramework.C0758f;
import com.corrodinggames.rts.gameFramework.p039g.C0820a;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.Map;
import java.util.regex.Pattern;

/* renamed from: com.corrodinggames.rts.gameFramework.utility.ab */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/utility/ab.class */
public class C1072ab {

    /* renamed from: g */
    private static final Pattern f6822g = Pattern.compile("\\p{C}");

    /* renamed from: h */
    private static final Pattern f6823h = Pattern.compile("\\s*\\[([^]]*)\\]\\s*");

    /* renamed from: i */
    private static final Pattern f6824i = Pattern.compile("\\s*([^=:]*)(?:=|:)(.*)");

    /* renamed from: a */
    String f6826a;

    /* renamed from: k */
    private boolean f6831k;

    /* renamed from: f */
    public String f6832f;

    /* renamed from: j */
    private LinkedHashMap f6825j = new LinkedHashMap();

    /* renamed from: b */
    boolean f6827b = true;

    /* renamed from: c */
    LinkedHashSet f6828c = new LinkedHashSet();

    /* renamed from: d */
    public ArrayList f6829d = new ArrayList();

    /* renamed from: e */
    public ArrayList f6830e = new ArrayList();

    /* renamed from: a */
    public void m698a() {
        this.f6831k = true;
        this.f6827b = false;
    }

    /* renamed from: a */
    public void m682a(String str, String str2) {
        m669a(str, str2, "Unknown");
    }

    /* renamed from: a */
    public void m669a(String str, String str2, String str3) {
        if (this.f6827b) {
            this.f6828c.add(str + ":" + str2);
        }
    }

    /* renamed from: b */
    public void m662b() {
        if (!this.f6827b) {
            throw new RuntimeException("Not tracking reads");
        }
        for (String str : this.f6825j.keySet()) {
            if (str == null || !str.startsWith("template_")) {
                boolean z = false;
                String str2 = null;
                Map map = (Map) this.f6825j.get(str);
                for (String str3 : map.keySet()) {
                    if (str3 == null || (!str3.startsWith("@define ") && !str3.startsWith("@global "))) {
                        if (!this.f6828c.contains(str + ":" + str3)) {
                            if (!"IGNORE".equals((String) map.get(str3)) && str2 == null) {
                                if (str3 != null && str3.trim().equals(VariableScope.nullOrMissingString)) {
                                    str2 = this.f6826a + " Found line in [" + str + "] with no key name.";
                                } else {
                                    str2 = this.f6826a + ": The key '[" + str + "]" + str3 + "' was not used. (hint: make sure it's valid and in the right section)";
                                }
                            }
                        } else {
                            z = true;
                        }
                    }
                }
                if (str2 != null) {
                    if (z || this.f6825j.size() == 1) {
                        throw new RuntimeException(str2);
                    }
                    throw new RuntimeException(this.f6826a + ": No keys in section: [" + str + "] were used (is this section named correctly?)");
                }
            }
        }
    }

    /* renamed from: c */
    public int m655c() {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            for (String str : this.f6825j.keySet()) {
                Map map = (Map) this.f6825j.get(str);
                for (String str2 : map.keySet()) {
                    messageDigest.update((str + ":" + str2 + ":" + ((String) map.get(str2))).getBytes("UTF-8"));
                }
            }
            return new BigInteger(1, messageDigest.digest()).intValue();
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(e);
        } catch (NoSuchAlgorithmException e2) {
            throw new RuntimeException(e2);
        }
    }

    public C1072ab(String str) {
        this.f6826a = "ini";
        this.f6826a = str;
        this.f6832f = str;
        m687a(str);
    }

    public C1072ab(InputStream inputStream, String str) {
        this.f6826a = "ini";
        this.f6826a = str;
        m688a(inputStream);
    }

    /* renamed from: a */
    public void m687a(String str) {
        m689a(new BufferedReader(new FileReader(str)));
    }

    /* renamed from: a */
    public void m688a(InputStream inputStream) {
        m689a(new BufferedReader(new InputStreamReader(inputStream, "UTF-8")));
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0117 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x011a A[SYNTHETIC] */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void m689a(java.io.BufferedReader r7) {
        /*
            Method dump skipped, instructions count: 830
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.corrodinggames.rts.gameFramework.utility.C1072ab.m689a(java.io.BufferedReader):void");
    }

    /* renamed from: a */
    private String m664a(String str, String str2, boolean z, String str3) {
        String m665a = m665a(str, str2, z);
        if (m665a != null) {
            m669a(str, str2, str3);
        }
        return m665a;
    }

    /* renamed from: b */
    public String m659b(String str, String str2) {
        Map map = (Map) this.f6825j.get(str);
        if (map == null) {
            return null;
        }
        return (String) map.get(str2);
    }

    /* renamed from: a */
    private String m665a(String str, String str2, boolean z) {
        Map map = (Map) this.f6825j.get(str);
        if (map == null) {
            if (!z) {
                throw new RuntimeException("Could not find section: [" + str + "] in configuration file");
            }
            return null;
        }
        String str3 = (String) map.get(str2);
        if (str3 == null) {
            if (!z) {
                throw new RuntimeException("Could not find: " + str2 + " in configuration file under [" + str + "]");
            }
            return null;
        } else if (str3.equals("IGNORE")) {
            if (!z) {
                throw new RuntimeException("Key: " + str2 + " under [" + str + "], is set to IGNORE but is required and has no default");
            }
            return null;
        } else {
            return str3;
        }
    }

    /* renamed from: a */
    public String m667a(String str, String str2, String str3, String str4) {
        String m656b = m656b(str, str2, (String) null);
        String m656b2 = m656b(str, str3, (String) null);
        if (m656b == null || m656b2 == null) {
            return m656b != null ? m656b : m656b2 != null ? m656b2 : str4;
        }
        throw new RuntimeException("[" + str + "]Cannot set " + str2 + " and " + str3 + " at the same time");
    }

    /* renamed from: a */
    public Boolean m668a(String str, String str2, String str3, Boolean bool) {
        String m667a = m667a(str, str2, str3, (String) null);
        if (m667a == null) {
            return bool;
        }
        if (m667a.equalsIgnoreCase("true")) {
            return true;
        }
        if (m667a.equalsIgnoreCase("false")) {
            return false;
        }
        if (m667a.equalsIgnoreCase("1")) {
            return true;
        }
        if (m667a.equalsIgnoreCase("0")) {
            return false;
        }
        throw new RuntimeException(str2 + ": unexpected boolean value:'" + m667a + "' in section:" + str);
    }

    /* renamed from: a */
    public Boolean m675a(String str, String str2, Boolean bool) {
        String m656b = m656b(str, str2, (String) null);
        if (m656b == null) {
            return bool;
        }
        if (m656b.equalsIgnoreCase("true")) {
            return true;
        }
        if (m656b.equalsIgnoreCase("false")) {
            return false;
        }
        if (m656b.equalsIgnoreCase("1")) {
            return true;
        }
        if (m656b.equalsIgnoreCase("0")) {
            return false;
        }
        throw new RuntimeException(str2 + ": unexpected boolean value:'" + m656b + "' in section:" + str);
    }

    /* renamed from: c */
    public void m652c(String str, String str2) {
        throw new RuntimeException("Could not find " + str2 + " in configuration file in section:" + str);
    }

    /* renamed from: d */
    public boolean m647d(String str, String str2) {
        Boolean m675a = m675a(str, str2, (Boolean) null);
        if (m675a == null) {
            m652c(str, str2);
        }
        return m675a.booleanValue();
    }

    /* renamed from: e */
    public String m643e(String str, String str2) {
        String m656b = m656b(str, str2, (String) null);
        if (m656b == null) {
            m652c(str, str2);
        }
        return m656b;
    }

    /* renamed from: b */
    public String m656b(String str, String str2, String str3) {
        String m664a = m664a(str, str2, true, "string");
        if (m664a == null) {
            return str3;
        }
        if (m664a.contains("%{") && m664a.contains("}")) {
            throw new RuntimeException("[" + str + "]" + str2 + ": Doesn't support dynamic %{} sections");
        }
        return m664a;
    }

    /* renamed from: c */
    public String m650c(String str, String str2, String str3) {
        String m664a = m664a(str, str2, true, "string");
        if (m664a == null) {
            return str3;
        }
        return m664a;
    }

    /* renamed from: f */
    public String m640f(String str, String str2) {
        String m650c = m650c(str, str2, (String) null);
        if (m650c == null) {
            m652c(str, str2);
        }
        return m650c;
    }

    /* renamed from: b */
    public static String m660b(String str) {
        if (str == null) {
            return null;
        }
        return C0758f.m2172a(str, "\\n", "\n");
    }

    /* renamed from: a */
    public C0351ai m691a(C0453l c0453l, String str, String str2, String str3) {
        C0385az m666a = m666a(str, str2, str3, true);
        if (m666a == null) {
            return null;
        }
        try {
            return new C0351ai(c0453l, m666a);
        } catch (RuntimeException e) {
            e.printStackTrace();
            throw new C0412bm("[" + str + "]" + str2 + ": " + e.getMessage());
        }
    }

    /* renamed from: a */
    public C0385az m666a(String str, String str2, String str3, boolean z) {
        String m656b;
        String m643e;
        if (z) {
            m656b = m650c(str, str2, (String) null);
        } else {
            m656b = m656b(str, str2, (String) null);
        }
        if (m656b == null) {
            if (str3 == null) {
                return null;
            }
            m656b = str3;
        }
        String m660b = m660b(m656b);
        C0385az c0385az = new C0385az();
        if (m660b != null && m660b.startsWith("i:")) {
            c0385az.f2322e = m660b.substring("i:".length());
            c0385az.f2322e = c0385az.f2322e.trim();
            C0820a.m1731a(c0385az.f2322e, new Object[0]);
            return c0385az;
        }
        ArrayList arrayList = new ArrayList();
        C0400ba c0400ba = new C0400ba();
        c0400ba.f2486a = null;
        c0400ba.f2487b = m660b;
        arrayList.add(c0400ba);
        String str4 = str2 + "_";
        Iterator it = m629k(str, str4).iterator();
        while (it.hasNext()) {
            String str5 = (String) it.next();
            String lowerCase = str5.substring(str4.length()).toLowerCase(Locale.ROOT);
            if (z) {
                m643e = m640f(str, str5);
            } else {
                m643e = m643e(str, str5);
            }
            String m660b2 = m660b(m643e);
            C0400ba c0400ba2 = new C0400ba();
            c0400ba2.f2486a = lowerCase;
            c0400ba2.f2487b = m660b2;
            arrayList.add(c0400ba2);
        }
        c0385az.f2319b = (C0400ba[]) arrayList.toArray(new C0400ba[0]);
        c0385az.m4224b();
        return c0385az;
    }

    /* renamed from: a */
    public LogicBoolean m697a(C0453l c0453l, String str, String str2) {
        try {
            return LogicBoolean.create(c0453l, m643e(str, str2), null);
        } catch (RuntimeException e) {
            throw new RuntimeException("[" + str + "]" + str2 + ": " + e.getMessage(), e);
        }
    }

    /* renamed from: a */
    public LogicBoolean m694a(C0453l c0453l, String str, String str2, LogicBoolean logicBoolean) {
        try {
            return LogicBoolean.create(c0453l, m656b(str, str2, (String) null), logicBoolean);
        } catch (RuntimeException e) {
            throw new RuntimeException("[" + str + "]" + str2 + ": " + e.getMessage(), e);
        }
    }

    /* renamed from: b */
    public LogicBoolean m661b(C0453l c0453l, String str, String str2, LogicBoolean logicBoolean) {
        return m693a(c0453l, str, str2, logicBoolean, LogicBoolean.ReturnType.unit);
    }

    /* renamed from: c */
    public LogicBoolean m654c(C0453l c0453l, String str, String str2, LogicBoolean logicBoolean) {
        return m693a(c0453l, str, str2, logicBoolean, LogicBoolean.ReturnType.number);
    }

    /* renamed from: a */
    public LogicBoolean m693a(C0453l c0453l, String str, String str2, LogicBoolean logicBoolean, LogicBoolean.ReturnType returnType) {
        return m685a(m656b(str, str2, (String) null), c0453l, str, str2, logicBoolean, returnType);
    }

    /* renamed from: a */
    public static LogicBoolean m686a(String str, C0453l c0453l, String str2, String str3, LogicBoolean logicBoolean) {
        return m685a(str, c0453l, str2, str3, logicBoolean, LogicBoolean.ReturnType.unit);
    }

    /* renamed from: a */
    public static LogicBoolean m685a(String str, C0453l c0453l, String str2, String str3, LogicBoolean logicBoolean, LogicBoolean.ReturnType returnType) {
        if (str == null) {
            return logicBoolean;
        }
        try {
            if (returnType == LogicBoolean.ReturnType.number && C0758f.m2077u(str)) {
                return LogicBoolean.StaticValueBoolean.getStaticNumber(str);
            }
            if (str.toLowerCase(Locale.ROOT).startsWith("unitref ")) {
                str = str.substring("unitref ".length()).trim();
            }
            LogicBoolean parseBooleanBlock = LogicBooleanLoader.parseBooleanBlock(c0453l, str, false);
            if (parseBooleanBlock == null) {
                return null;
            }
            LogicBoolean.ReturnType returnType2 = parseBooleanBlock.getReturnType();
            if (returnType2 != returnType) {
                throw new RuntimeException("[" + str2 + "]" + str3 + ": Type mismatch. Expected type:" + returnType + " got:" + returnType2);
            }
            return parseBooleanBlock;
        } catch (RuntimeException e) {
            throw new RuntimeException("[" + str2 + "]" + str3 + ": " + e.getMessage(), e);
        }
    }

    /* renamed from: a */
    public C0448g m677a(String str, String str2, C0448g c0448g) {
        String m656b = m656b(str, str2, (String) null);
        if (m656b == null) {
            return c0448g;
        }
        if (m656b.trim().equals(VariableScope.nullOrMissingString)) {
            return c0448g;
        }
        if (m656b.contains(",")) {
            throw new C0412bm("[" + str + "]" + str2 + ": Expected single tag, got:" + m656b);
        }
        return C0448g.m3953c(m656b);
    }

    /* renamed from: a */
    public C0449h m695a(C0453l c0453l, String str, String str2, C0449h c0449h) {
        return C0448g.m3956a(m656b(str, str2, (String) null), c0449h);
    }

    /* renamed from: a */
    public C0462t m692a(C0453l c0453l, String str, String str2, C0462t c0462t) {
        String m656b = m656b(str, str2, (String) null);
        if (m656b == null) {
            return c0462t;
        }
        return c0453l.m3696c(m656b, str2, str);
    }

    /* renamed from: a */
    public C0428a m696a(C0453l c0453l, String str, String str2, C0428a c0428a, boolean z) {
        C0428a m4054a;
        String m656b = m656b(str, str2, (String) null);
        if (m656b == null) {
            return c0428a;
        }
        if (z && (m4054a = C0428a.m4054a(m656b)) != null) {
            return m4054a;
        }
        C0428a m3679k = c0453l.m3679k(m656b);
        if (m3679k == null) {
            throw new BooleanParseException("[" + str + "]" + str2 + ": Could not find custom resource type of:" + m656b);
        }
        return m3679k;
    }

    /* renamed from: a */
    public Integer m671a(String str, String str2, Integer num) {
        String m656b = m656b(str, str2, (String) null);
        if (m656b == null) {
            return num;
        }
        if (m656b.equals(VariableScope.nullOrMissingString)) {
            throw new RuntimeException("[" + str + "]" + str2 + ": Unknown color: ''");
        }
        try {
            return Integer.valueOf(Color.m5947a(m656b));
        } catch (IllegalArgumentException e) {
            throw new RuntimeException("[" + str + "]" + str2 + ": Unknown color:" + m656b);
        }
    }

    /* renamed from: g */
    public int m637g(String str, String str2) {
        String m664a = m664a(str, str2, false, "int");
        try {
            return Integer.parseInt(m664a);
        } catch (NumberFormatException e) {
            throw new RuntimeException("[" + str + "]" + str2 + ": Not a static integer: " + m664a);
        }
    }

    /* renamed from: a */
    public Short m670a(String str, String str2, Short sh) {
        String m664a = m664a(str, str2, true, "short");
        if (m664a == null) {
            return sh;
        }
        try {
            return Short.valueOf(Short.parseShort(m664a));
        } catch (NumberFormatException e) {
            throw new RuntimeException("[" + str + "]" + str2 + ": Not a static integer: " + m664a);
        }
    }

    /* renamed from: b */
    public Integer m657b(String str, String str2, Integer num) {
        String m664a = m664a(str, str2, true, "int");
        if (m664a == null) {
            return num;
        }
        try {
            return Integer.valueOf(Integer.parseInt(m664a));
        } catch (NumberFormatException e) {
            throw new RuntimeException("[" + str + "]" + str2 + ": Not a static integer: " + m664a);
        }
    }

    /* renamed from: a */
    public Float m673a(String str, String str2, Float f) {
        String m664a = m664a(str, str2, true, "float");
        if (m664a == null) {
            return f;
        }
        try {
            return Float.valueOf(Float.parseFloat(m664a));
        } catch (NumberFormatException e) {
            throw new RuntimeException("[" + str + "]" + str2 + ": Not a static float: " + m664a);
        }
    }

    /* renamed from: a */
    public PointF m679a(String str, String str2, PointF pointF) {
        String m664a = m664a(str, str2, true, "point");
        if (m664a == null) {
            return pointF;
        }
        if (m664a.equalsIgnoreCase("NONE")) {
            return null;
        }
        try {
            String[] split = m664a.split(",");
            if (split.length != 2) {
                throw new NumberFormatException("Got:" + split.length + " elements expected 2");
            }
            PointF pointF2 = new PointF();
            pointF2.f227a = Float.parseFloat(split[0]);
            pointF2.f228b = Float.parseFloat(split[1]);
            return pointF2;
        } catch (NumberFormatException e) {
            throw new RuntimeException("Failed to read point:" + m664a + " in key:" + str2 + " section:" + str + " expected format: x,y");
        }
    }

    /* renamed from: a */
    public C1080ai m676a(String str, String str2, C1080ai c1080ai) {
        String m664a = m664a(str, str2, true, "point3d");
        if (m664a == null) {
            return c1080ai;
        }
        if (m664a.equalsIgnoreCase("NONE")) {
            return null;
        }
        try {
            String[] split = m664a.split(",");
            if (split.length != 2 && split.length != 3) {
                throw new NumberFormatException("Got:" + split.length + " elements expected 2 or 3");
            }
            C1080ai c1080ai2 = new C1080ai();
            c1080ai2.f6849a = Float.parseFloat(split[0]);
            c1080ai2.f6850b = Float.parseFloat(split[1]);
            if (split.length > 2) {
                c1080ai2.f6851c = Float.parseFloat(split[2]);
            }
            return c1080ai2;
        } catch (NumberFormatException e) {
            throw new RuntimeException("Failed to read point:" + m664a + " in key:" + str2 + " section:" + str + " expected format: x,y,[height]");
        }
    }

    /* renamed from: h */
    public Float m635h(String str, String str2) {
        Float m658b = m658b(str, str2, (Float) null);
        if (m658b == null) {
            throw new RuntimeException("Could not find key:" + str2 + " in section:" + str);
        }
        return m658b;
    }

    /* renamed from: b */
    public Float m658b(String str, String str2, Float f) {
        return m672a(str, str2, f, false);
    }

    /* renamed from: c */
    public Float m651c(String str, String str2, Float f) {
        Float m672a = m672a(str, str2, (Float) null, false);
        if (m672a == null) {
            return f;
        }
        return Float.valueOf(m672a.floatValue() * 16.666666f);
    }

    /* renamed from: a */
    public Float m672a(String str, String str2, Float f, boolean z) {
        String m664a = m664a(str, str2, true, "time");
        if (m664a == null) {
            return f;
        }
        try {
            return Float.valueOf(m663a(m664a, z, str, str2));
        } catch (NumberFormatException e) {
            throw new RuntimeException("Failed to read time:" + m664a + " in key:" + str2 + " section:" + str + " expected a float with optional 's' or 'ms' postfix");
        }
    }

    /* renamed from: d */
    public Float m646d(String str, String str2, Float f) {
        return m672a(str, str2, f, true);
    }

    /* renamed from: a */
    public static float m663a(String str, boolean z, String str2, String str3) {
        float f;
        boolean z2 = false;
        if (str.endsWith("s")) {
            str = str.substring(0, str.length() - 1);
            f = 60.0f;
            z2 = true;
        } else {
            f = 1.0f;
        }
        try {
            float parseFloat = Float.parseFloat(str) * f;
            if (z) {
                if (z2) {
                    return 1.0f / parseFloat;
                }
                return parseFloat;
            }
            return parseFloat;
        } catch (NumberFormatException e) {
            throw new RuntimeException("[" + str2 + "]" + str3 + ": Failed to read time:" + str + " expected a float with optional 's' postfix");
        }
    }

    /* renamed from: i */
    public float m633i(String str, String str2) {
        String m664a = m664a(str, str2, false, "float");
        try {
            return Float.parseFloat(m664a);
        } catch (NumberFormatException e) {
            throw new RuntimeException("Failed to read float:" + m664a + " in key:" + str2 + " section:" + str);
        }
    }

    /* renamed from: j */
    public double m631j(String str, String str2) {
        String m664a = m664a(str, str2, false, "double");
        try {
            return Double.parseDouble(m664a);
        } catch (NumberFormatException e) {
            throw new RuntimeException("Failed to read float:" + m664a + " in key:" + str2 + " section:" + str);
        }
    }

    /* renamed from: a */
    public double m681a(String str, String str2, double d) {
        String m664a = m664a(str, str2, true, "double");
        if (m664a == null) {
            return d;
        }
        try {
            return Double.parseDouble(m664a);
        } catch (NumberFormatException e) {
            throw new RuntimeException("Failed to read float:" + m664a + " in key:" + str2 + " section:" + str);
        }
    }

    /* renamed from: a */
    public long m680a(String str, String str2, long j) {
        String m664a = m664a(str, str2, true, "long");
        if (m664a == null) {
            return j;
        }
        try {
            return Long.parseLong(m664a);
        } catch (NumberFormatException e) {
            throw new RuntimeException("[" + str + "]" + str2 + ": Failed to read long:" + m664a + " in key:" + str2 + " section:" + str);
        }
    }

    /* renamed from: d */
    public void m645d(String str, String str2, String str3) {
        if (this.f6831k) {
            throw new RuntimeException("locked changes");
        }
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.f6825j.get(str);
        if (linkedHashMap == null) {
            linkedHashMap = new LinkedHashMap();
            this.f6825j.put(str, linkedHashMap);
        }
        if (linkedHashMap.get(str2) == null) {
            linkedHashMap.put(str2, str3);
        }
    }

    /* renamed from: e */
    public void m642e(String str, String str2, String str3) {
        if (this.f6831k) {
            throw new RuntimeException("locked changes");
        }
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.f6825j.get(str);
        if (linkedHashMap == null) {
            linkedHashMap = new LinkedHashMap();
            this.f6825j.put(str, linkedHashMap);
        }
        linkedHashMap.put(str2, str3);
    }

    /* renamed from: a */
    public void m690a(C1072ab c1072ab) {
        if (this.f6831k) {
            throw new RuntimeException("locked changes");
        }
        for (String str : c1072ab.f6825j.keySet()) {
            LinkedHashMap linkedHashMap = (LinkedHashMap) c1072ab.f6825j.get(str);
            if (!m675a(str, "@copyFrom_skipThisSection", (Boolean) false).booleanValue()) {
                LinkedHashMap linkedHashMap2 = (LinkedHashMap) this.f6825j.get(str);
                if (linkedHashMap2 == null) {
                    linkedHashMap2 = new LinkedHashMap();
                    this.f6825j.put(str, linkedHashMap2);
                }
                for (String str2 : linkedHashMap.keySet()) {
                    if (linkedHashMap2.get(str2) == null) {
                        linkedHashMap2.put(str2, linkedHashMap.get(str2));
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public Rect m678a(String str, String str2, Rect rect) {
        String m656b = m656b(str, str2, (String) null);
        if (m656b == null) {
            return rect;
        }
        String[] split = m656b.split(",");
        if (split.length != 4) {
            throw new RuntimeException("[" + str + "]" + str2 + ": getRect: expected 4 ints, not:" + split.length);
        }
        try {
            return new Rect(Integer.valueOf(split[0].trim()).intValue(), Integer.valueOf(split[1].trim()).intValue(), Integer.valueOf(split[2].trim()).intValue(), Integer.valueOf(split[3].trim()).intValue());
        } catch (NumberFormatException e) {
            throw new RuntimeException("[" + str + "]" + str2 + ": getRect expected ints got: " + m656b);
        }
    }

    /* renamed from: a */
    public Enum m674a(String str, String str2, Enum r8, Class cls) {
        try {
            return m683a(m656b(str, str2, (String) null), r8, cls);
        } catch (C0412bm e) {
            throw new RuntimeException("[" + str + "]" + str2 + ": " + e.getMessage(), e);
        }
    }

    /* renamed from: a */
    public static Enum m683a(String str, Enum r4, Class cls) {
        if (str == null) {
            return r4;
        }
        String trim = str.trim();
        for (Object obj : cls.getEnumConstants()) {
            Enum r0 = (Enum) obj;
            if (r0.name().equalsIgnoreCase(trim)) {
                return r0;
            }
        }
        throw m684a(trim, cls);
    }

    /* renamed from: a */
    private static RuntimeException m684a(String str, Class cls) {
        String str2 = VariableScope.nullOrMissingString;
        for (Object obj : cls.getEnumConstants()) {
            Enum r0 = (Enum) obj;
            if (!str2.equals(VariableScope.nullOrMissingString)) {
                str2 = str2 + ",";
            }
            str2 = str2 + r0.name();
        }
        throw new C0412bm("Unknown value: " + str + " (Expected: " + C0758f.m2144b(str2, 100) + ")");
    }

    /* renamed from: c */
    public C1101m m653c(String str) {
        C1101m c1101m = new C1101m();
        for (String str2 : this.f6825j.keySet()) {
            if (((Map) this.f6825j.get(str2)).get(str) != null) {
                c1101m.add(str2);
            }
        }
        return c1101m;
    }

    /* renamed from: d */
    public C1101m m648d(String str) {
        C1101m c1101m = new C1101m();
        for (String str2 : this.f6825j.keySet()) {
            Map map = (Map) this.f6825j.get(str2);
            Iterator it = map.keySet().iterator();
            while (true) {
                if (it.hasNext()) {
                    String str3 = (String) it.next();
                    if (str3.startsWith(str) && !"IGNORE".equals(map.get(str3))) {
                        c1101m.add(str2);
                        break;
                    }
                }
            }
        }
        return c1101m;
    }

    /* renamed from: d */
    public LinkedHashMap m649d() {
        return this.f6825j;
    }

    /* renamed from: k */
    public C1101m m629k(String str, String str2) {
        C1101m c1101m = new C1101m();
        Map map = (Map) this.f6825j.get(str);
        if (map != null) {
            for (String str3 : map.keySet()) {
                if (str3.startsWith(str2) && !"IGNORE".equals(map.get(str3))) {
                    c1101m.add(str3);
                }
            }
        }
        return c1101m;
    }

    /* renamed from: f */
    public C1101m m639f(String str, String str2, String str3) {
        C1101m c1101m = new C1101m();
        Map map = (Map) this.f6825j.get(str);
        if (map != null) {
            for (String str4 : map.keySet()) {
                if (str4.startsWith(str2) || str4.startsWith(str3)) {
                    c1101m.add(str4);
                }
            }
        }
        return c1101m;
    }

    /* renamed from: l */
    public boolean m628l(String str, String str2) {
        Map map = (Map) this.f6825j.get(str);
        if (map != null) {
            for (String str3 : map.keySet()) {
                if (str3.startsWith(str2)) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    /* renamed from: e */
    public C1101m m644e(String str) {
        C1101m c1101m = new C1101m();
        for (String str2 : this.f6825j.keySet()) {
            if (str2.startsWith(str) && m638g(str2)) {
                c1101m.add(str2);
            }
        }
        return c1101m;
    }

    /* renamed from: m */
    public C1101m m627m(String str, String str2) {
        C1101m c1101m = new C1101m();
        for (String str3 : this.f6825j.keySet()) {
            if (str3.startsWith(str) || str3.startsWith(str2)) {
                if (m638g(str3)) {
                    c1101m.add(str3);
                }
            }
        }
        return c1101m;
    }

    /* renamed from: f */
    public boolean m641f(String str) {
        if (this.f6825j.get(str) != null) {
            return true;
        }
        return false;
    }

    /* renamed from: g */
    public boolean m638g(String str) {
        Map map = (Map) this.f6825j.get(str);
        if (map == null) {
            return false;
        }
        for (String str2 : map.keySet()) {
            if (str2 != null && !str2.startsWith("@")) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: n */
    public boolean m626n(String str, String str2) {
        if (m665a(str, str2, true) != null) {
            return true;
        }
        return false;
    }

    /* renamed from: g */
    public static boolean m636g(String str, String str2, String str3) {
        if (str3.equalsIgnoreCase("true")) {
            return true;
        }
        if (str3.equalsIgnoreCase("false")) {
            return false;
        }
        throw new RuntimeException("[" + str + "]" + str2 + ": Unexpected boolean value:'" + str3 + "'");
    }

    /* renamed from: h */
    public static float m634h(String str, String str2, String str3) {
        try {
            return Float.parseFloat(str3);
        } catch (NumberFormatException e) {
            throw new RuntimeException("[" + str + "]" + str2 + ": Failed to read float:" + str3);
        }
    }

    /* renamed from: i */
    public static int m632i(String str, String str2, String str3) {
        try {
            return Integer.parseInt(str3);
        } catch (NumberFormatException e) {
            throw new RuntimeException("[" + str + "]" + str2 + ": Failed to read int:" + str3);
        }
    }

    /* renamed from: j */
    public static C0448g m630j(String str, String str2, String str3) {
        String trim = str3.trim();
        if (trim.contains(",")) {
            throw new C0412bm("[" + str + "]" + str2 + ": Unexpected single tag, got:'" + trim + "'");
        }
        if (trim.contains("\"")) {
            throw new C0412bm("[" + str + "]" + str2 + ": tag cannot contain quote, got:'" + trim + "'");
        }
        if (trim.contains("'")) {
            throw new C0412bm("[" + str + "]" + str2 + ": tag cannot contain quote, got:'" + trim + "'");
        }
        if (trim.contains(" ")) {
            throw new C0412bm("[" + str + "]" + str2 + ": tag cannot contain space, got:'" + trim + "'");
        }
        return C0448g.m3953c(trim);
    }
}
