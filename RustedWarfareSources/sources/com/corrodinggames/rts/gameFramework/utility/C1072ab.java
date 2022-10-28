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
    String f6825a;

    /* renamed from: k */
    private boolean f6826k;

    /* renamed from: f */
    public String f6827f;

    /* renamed from: j */
    private LinkedHashMap f6828j = new LinkedHashMap();

    /* renamed from: b */
    boolean f6829b = true;

    /* renamed from: c */
    LinkedHashSet f6830c = new LinkedHashSet();

    /* renamed from: d */
    public ArrayList f6831d = new ArrayList();

    /* renamed from: e */
    public ArrayList f6832e = new ArrayList();

    /* renamed from: a */
    public void m691a() {
        this.f6826k = true;
        this.f6829b = false;
    }

    /* renamed from: a */
    public void m675a(String str, String str2) {
        m662a(str, str2, "Unknown");
    }

    /* renamed from: a */
    public void m662a(String str, String str2, String str3) {
        if (this.f6829b) {
            this.f6830c.add(str + ":" + str2);
        }
    }

    /* renamed from: b */
    public void m655b() {
        if (!this.f6829b) {
            throw new RuntimeException("Not tracking reads");
        }
        for (String str : this.f6828j.keySet()) {
            if (str == null || !str.startsWith("template_")) {
                boolean z = false;
                String str2 = null;
                Map map = (Map) this.f6828j.get(str);
                for (String str3 : map.keySet()) {
                    if (str3 == null || (!str3.startsWith("@define ") && !str3.startsWith("@global "))) {
                        if (!this.f6830c.contains(str + ":" + str3)) {
                            if (!"IGNORE".equals((String) map.get(str3)) && str2 == null) {
                                if (str3 != null && str3.trim().equals(VariableScope.nullOrMissingString)) {
                                    str2 = this.f6825a + " Found line in [" + str + "] with no key name.";
                                } else {
                                    str2 = this.f6825a + ": The key '[" + str + "]" + str3 + "' was not used. (hint: make sure it's valid and in the right section)";
                                }
                            }
                        } else {
                            z = true;
                        }
                    }
                }
                if (str2 != null) {
                    if (z || this.f6828j.size() == 1) {
                        throw new RuntimeException(str2);
                    }
                    throw new RuntimeException(this.f6825a + ": No keys in section: [" + str + "] were used (is this section named correctly?)");
                }
            }
        }
    }

    /* renamed from: c */
    public int m648c() {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            for (String str : this.f6828j.keySet()) {
                Map map = (Map) this.f6828j.get(str);
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
        this.f6825a = "ini";
        this.f6825a = str;
        this.f6827f = str;
        m680a(str);
    }

    public C1072ab(InputStream inputStream, String str) {
        this.f6825a = "ini";
        this.f6825a = str;
        m681a(inputStream);
    }

    /* renamed from: a */
    public void m680a(String str) {
        m682a(new BufferedReader(new FileReader(str)));
    }

    /* renamed from: a */
    public void m681a(InputStream inputStream) {
        m682a(new BufferedReader(new InputStreamReader(inputStream, "UTF-8")));
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0117 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x011a A[SYNTHETIC] */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void m682a(java.io.BufferedReader r7) {
        /*
            Method dump skipped, instructions count: 830
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.corrodinggames.rts.gameFramework.utility.C1072ab.m682a(java.io.BufferedReader):void");
    }

    /* renamed from: a */
    private String m657a(String str, String str2, boolean z, String str3) {
        String m658a = m658a(str, str2, z);
        if (m658a != null) {
            m662a(str, str2, str3);
        }
        return m658a;
    }

    /* renamed from: b */
    public String m652b(String str, String str2) {
        Map map = (Map) this.f6828j.get(str);
        if (map == null) {
            return null;
        }
        return (String) map.get(str2);
    }

    /* renamed from: a */
    private String m658a(String str, String str2, boolean z) {
        Map map = (Map) this.f6828j.get(str);
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
    public String m660a(String str, String str2, String str3, String str4) {
        String m649b = m649b(str, str2, (String) null);
        String m649b2 = m649b(str, str3, (String) null);
        if (m649b == null || m649b2 == null) {
            return m649b != null ? m649b : m649b2 != null ? m649b2 : str4;
        }
        throw new RuntimeException("[" + str + "]Cannot set " + str2 + " and " + str3 + " at the same time");
    }

    /* renamed from: a */
    public Boolean m661a(String str, String str2, String str3, Boolean bool) {
        String m660a = m660a(str, str2, str3, (String) null);
        if (m660a == null) {
            return bool;
        }
        if (m660a.equalsIgnoreCase("true")) {
            return true;
        }
        if (m660a.equalsIgnoreCase("false")) {
            return false;
        }
        if (m660a.equalsIgnoreCase("1")) {
            return true;
        }
        if (m660a.equalsIgnoreCase("0")) {
            return false;
        }
        throw new RuntimeException(str2 + ": unexpected boolean value:'" + m660a + "' in section:" + str);
    }

    /* renamed from: a */
    public Boolean m668a(String str, String str2, Boolean bool) {
        String m649b = m649b(str, str2, (String) null);
        if (m649b == null) {
            return bool;
        }
        if (m649b.equalsIgnoreCase("true")) {
            return true;
        }
        if (m649b.equalsIgnoreCase("false")) {
            return false;
        }
        if (m649b.equalsIgnoreCase("1")) {
            return true;
        }
        if (m649b.equalsIgnoreCase("0")) {
            return false;
        }
        throw new RuntimeException(str2 + ": unexpected boolean value:'" + m649b + "' in section:" + str);
    }

    /* renamed from: c */
    public void m645c(String str, String str2) {
        throw new RuntimeException("Could not find " + str2 + " in configuration file in section:" + str);
    }

    /* renamed from: d */
    public boolean m640d(String str, String str2) {
        Boolean m668a = m668a(str, str2, (Boolean) null);
        if (m668a == null) {
            m645c(str, str2);
        }
        return m668a.booleanValue();
    }

    /* renamed from: e */
    public String m636e(String str, String str2) {
        String m649b = m649b(str, str2, (String) null);
        if (m649b == null) {
            m645c(str, str2);
        }
        return m649b;
    }

    /* renamed from: b */
    public String m649b(String str, String str2, String str3) {
        String m657a = m657a(str, str2, true, "string");
        if (m657a == null) {
            return str3;
        }
        if (m657a.contains("%{") && m657a.contains("}")) {
            throw new RuntimeException("[" + str + "]" + str2 + ": Doesn't support dynamic %{} sections");
        }
        return m657a;
    }

    /* renamed from: c */
    public String m643c(String str, String str2, String str3) {
        String m657a = m657a(str, str2, true, "string");
        if (m657a == null) {
            return str3;
        }
        return m657a;
    }

    /* renamed from: f */
    public String m633f(String str, String str2) {
        String m643c = m643c(str, str2, (String) null);
        if (m643c == null) {
            m645c(str, str2);
        }
        return m643c;
    }

    /* renamed from: b */
    public static String m653b(String str) {
        if (str == null) {
            return null;
        }
        return C0758f.m2123a(str, "\\n", "\n");
    }

    /* renamed from: a */
    public C0351ai m684a(C0453l c0453l, String str, String str2, String str3) {
        C0385az m659a = m659a(str, str2, str3, true);
        if (m659a == null) {
            return null;
        }
        try {
            return new C0351ai(c0453l, m659a);
        } catch (RuntimeException e) {
            e.printStackTrace();
            throw new C0412bm("[" + str + "]" + str2 + ": " + e.getMessage());
        }
    }

    /* renamed from: a */
    public C0385az m659a(String str, String str2, String str3, boolean z) {
        String m649b;
        String m636e;
        if (z) {
            m649b = m643c(str, str2, (String) null);
        } else {
            m649b = m649b(str, str2, (String) null);
        }
        if (m649b == null) {
            if (str3 == null) {
                return null;
            }
            m649b = str3;
        }
        String m653b = m653b(m649b);
        C0385az c0385az = new C0385az();
        if (m653b != null && m653b.startsWith("i:")) {
            c0385az.f2322e = m653b.substring("i:".length());
            c0385az.f2322e = c0385az.f2322e.trim();
            C0820a.m1689a(c0385az.f2322e, new Object[0]);
            return c0385az;
        }
        ArrayList arrayList = new ArrayList();
        C0400ba c0400ba = new C0400ba();
        c0400ba.f2486a = null;
        c0400ba.f2487b = m653b;
        arrayList.add(c0400ba);
        String str4 = str2 + "_";
        Iterator it = m622k(str, str4).iterator();
        while (it.hasNext()) {
            String str5 = (String) it.next();
            String lowerCase = str5.substring(str4.length()).toLowerCase(Locale.ROOT);
            if (z) {
                m636e = m633f(str, str5);
            } else {
                m636e = m636e(str, str5);
            }
            String m653b2 = m653b(m636e);
            C0400ba c0400ba2 = new C0400ba();
            c0400ba2.f2486a = lowerCase;
            c0400ba2.f2487b = m653b2;
            arrayList.add(c0400ba2);
        }
        c0385az.f2319b = (C0400ba[]) arrayList.toArray(new C0400ba[0]);
        c0385az.m3994b();
        return c0385az;
    }

    /* renamed from: a */
    public LogicBoolean m690a(C0453l c0453l, String str, String str2) {
        try {
            return LogicBoolean.create(c0453l, m636e(str, str2), null);
        } catch (RuntimeException e) {
            throw new RuntimeException("[" + str + "]" + str2 + ": " + e.getMessage(), e);
        }
    }

    /* renamed from: a */
    public LogicBoolean m687a(C0453l c0453l, String str, String str2, LogicBoolean logicBoolean) {
        try {
            return LogicBoolean.create(c0453l, m649b(str, str2, (String) null), logicBoolean);
        } catch (RuntimeException e) {
            throw new RuntimeException("[" + str + "]" + str2 + ": " + e.getMessage(), e);
        }
    }

    /* renamed from: b */
    public LogicBoolean m654b(C0453l c0453l, String str, String str2, LogicBoolean logicBoolean) {
        return m686a(c0453l, str, str2, logicBoolean, LogicBoolean.ReturnType.unit);
    }

    /* renamed from: c */
    public LogicBoolean m647c(C0453l c0453l, String str, String str2, LogicBoolean logicBoolean) {
        return m686a(c0453l, str, str2, logicBoolean, LogicBoolean.ReturnType.number);
    }

    /* renamed from: a */
    public LogicBoolean m686a(C0453l c0453l, String str, String str2, LogicBoolean logicBoolean, LogicBoolean.ReturnType returnType) {
        return m678a(m649b(str, str2, (String) null), c0453l, str, str2, logicBoolean, returnType);
    }

    /* renamed from: a */
    public static LogicBoolean m679a(String str, C0453l c0453l, String str2, String str3, LogicBoolean logicBoolean) {
        return m678a(str, c0453l, str2, str3, logicBoolean, LogicBoolean.ReturnType.unit);
    }

    /* renamed from: a */
    public static LogicBoolean m678a(String str, C0453l c0453l, String str2, String str3, LogicBoolean logicBoolean, LogicBoolean.ReturnType returnType) {
        if (str == null) {
            return logicBoolean;
        }
        try {
            if (returnType == LogicBoolean.ReturnType.number && C0758f.m2028u(str)) {
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
    public C0448g m670a(String str, String str2, C0448g c0448g) {
        String m649b = m649b(str, str2, (String) null);
        if (m649b == null) {
            return c0448g;
        }
        if (m649b.trim().equals(VariableScope.nullOrMissingString)) {
            return c0448g;
        }
        if (m649b.contains(",")) {
            throw new C0412bm("[" + str + "]" + str2 + ": Expected single tag, got:" + m649b);
        }
        return C0448g.m3729c(m649b);
    }

    /* renamed from: a */
    public C0449h m688a(C0453l c0453l, String str, String str2, C0449h c0449h) {
        return C0448g.m3732a(m649b(str, str2, (String) null), c0449h);
    }

    /* renamed from: a */
    public C0462t m685a(C0453l c0453l, String str, String str2, C0462t c0462t) {
        String m649b = m649b(str, str2, (String) null);
        if (m649b == null) {
            return c0462t;
        }
        return c0453l.m3520c(m649b, str2, str);
    }

    /* renamed from: a */
    public C0428a m689a(C0453l c0453l, String str, String str2, C0428a c0428a, boolean z) {
        C0428a m3830a;
        String m649b = m649b(str, str2, (String) null);
        if (m649b == null) {
            return c0428a;
        }
        if (z && (m3830a = C0428a.m3830a(m649b)) != null) {
            return m3830a;
        }
        C0428a m3503k = c0453l.m3503k(m649b);
        if (m3503k == null) {
            throw new BooleanParseException("[" + str + "]" + str2 + ": Could not find custom resource type of:" + m649b);
        }
        return m3503k;
    }

    /* renamed from: a */
    public Integer m664a(String str, String str2, Integer num) {
        String m649b = m649b(str, str2, (String) null);
        if (m649b == null) {
            return num;
        }
        if (m649b.equals(VariableScope.nullOrMissingString)) {
            throw new RuntimeException("[" + str + "]" + str2 + ": Unknown color: ''");
        }
        try {
            return Integer.valueOf(Color.m5537a(m649b));
        } catch (IllegalArgumentException e) {
            throw new RuntimeException("[" + str + "]" + str2 + ": Unknown color:" + m649b);
        }
    }

    /* renamed from: g */
    public int m630g(String str, String str2) {
        String m657a = m657a(str, str2, false, "int");
        try {
            return Integer.parseInt(m657a);
        } catch (NumberFormatException e) {
            throw new RuntimeException("[" + str + "]" + str2 + ": Not a static integer: " + m657a);
        }
    }

    /* renamed from: a */
    public Short m663a(String str, String str2, Short sh) {
        String m657a = m657a(str, str2, true, "short");
        if (m657a == null) {
            return sh;
        }
        try {
            return Short.valueOf(Short.parseShort(m657a));
        } catch (NumberFormatException e) {
            throw new RuntimeException("[" + str + "]" + str2 + ": Not a static integer: " + m657a);
        }
    }

    /* renamed from: b */
    public Integer m650b(String str, String str2, Integer num) {
        String m657a = m657a(str, str2, true, "int");
        if (m657a == null) {
            return num;
        }
        try {
            return Integer.valueOf(Integer.parseInt(m657a));
        } catch (NumberFormatException e) {
            throw new RuntimeException("[" + str + "]" + str2 + ": Not a static integer: " + m657a);
        }
    }

    /* renamed from: a */
    public Float m666a(String str, String str2, Float f) {
        String m657a = m657a(str, str2, true, "float");
        if (m657a == null) {
            return f;
        }
        try {
            return Float.valueOf(Float.parseFloat(m657a));
        } catch (NumberFormatException e) {
            throw new RuntimeException("[" + str + "]" + str2 + ": Not a static float: " + m657a);
        }
    }

    /* renamed from: a */
    public PointF m672a(String str, String str2, PointF pointF) {
        String m657a = m657a(str, str2, true, "point");
        if (m657a == null) {
            return pointF;
        }
        if (m657a.equalsIgnoreCase("NONE")) {
            return null;
        }
        try {
            String[] split = m657a.split(",");
            if (split.length != 2) {
                throw new NumberFormatException("Got:" + split.length + " elements expected 2");
            }
            PointF pointF2 = new PointF();
            pointF2.f227a = Float.parseFloat(split[0]);
            pointF2.f228b = Float.parseFloat(split[1]);
            return pointF2;
        } catch (NumberFormatException e) {
            throw new RuntimeException("Failed to read point:" + m657a + " in key:" + str2 + " section:" + str + " expected format: x,y");
        }
    }

    /* renamed from: a */
    public C1080ai m669a(String str, String str2, C1080ai c1080ai) {
        String m657a = m657a(str, str2, true, "point3d");
        if (m657a == null) {
            return c1080ai;
        }
        if (m657a.equalsIgnoreCase("NONE")) {
            return null;
        }
        try {
            String[] split = m657a.split(",");
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
            throw new RuntimeException("Failed to read point:" + m657a + " in key:" + str2 + " section:" + str + " expected format: x,y,[height]");
        }
    }

    /* renamed from: h */
    public Float m628h(String str, String str2) {
        Float m651b = m651b(str, str2, (Float) null);
        if (m651b == null) {
            throw new RuntimeException("Could not find key:" + str2 + " in section:" + str);
        }
        return m651b;
    }

    /* renamed from: b */
    public Float m651b(String str, String str2, Float f) {
        return m665a(str, str2, f, false);
    }

    /* renamed from: c */
    public Float m644c(String str, String str2, Float f) {
        Float m665a = m665a(str, str2, (Float) null, false);
        if (m665a == null) {
            return f;
        }
        return Float.valueOf(m665a.floatValue() * 16.666666f);
    }

    /* renamed from: a */
    public Float m665a(String str, String str2, Float f, boolean z) {
        String m657a = m657a(str, str2, true, "time");
        if (m657a == null) {
            return f;
        }
        try {
            return Float.valueOf(m656a(m657a, z, str, str2));
        } catch (NumberFormatException e) {
            throw new RuntimeException("Failed to read time:" + m657a + " in key:" + str2 + " section:" + str + " expected a float with optional 's' or 'ms' postfix");
        }
    }

    /* renamed from: d */
    public Float m639d(String str, String str2, Float f) {
        return m665a(str, str2, f, true);
    }

    /* renamed from: a */
    public static float m656a(String str, boolean z, String str2, String str3) {
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
    public float m626i(String str, String str2) {
        String m657a = m657a(str, str2, false, "float");
        try {
            return Float.parseFloat(m657a);
        } catch (NumberFormatException e) {
            throw new RuntimeException("Failed to read float:" + m657a + " in key:" + str2 + " section:" + str);
        }
    }

    /* renamed from: j */
    public double m624j(String str, String str2) {
        String m657a = m657a(str, str2, false, "double");
        try {
            return Double.parseDouble(m657a);
        } catch (NumberFormatException e) {
            throw new RuntimeException("Failed to read float:" + m657a + " in key:" + str2 + " section:" + str);
        }
    }

    /* renamed from: a */
    public double m674a(String str, String str2, double d) {
        String m657a = m657a(str, str2, true, "double");
        if (m657a == null) {
            return d;
        }
        try {
            return Double.parseDouble(m657a);
        } catch (NumberFormatException e) {
            throw new RuntimeException("Failed to read float:" + m657a + " in key:" + str2 + " section:" + str);
        }
    }

    /* renamed from: a */
    public long m673a(String str, String str2, long j) {
        String m657a = m657a(str, str2, true, "long");
        if (m657a == null) {
            return j;
        }
        try {
            return Long.parseLong(m657a);
        } catch (NumberFormatException e) {
            throw new RuntimeException("[" + str + "]" + str2 + ": Failed to read long:" + m657a + " in key:" + str2 + " section:" + str);
        }
    }

    /* renamed from: d */
    public void m638d(String str, String str2, String str3) {
        if (this.f6826k) {
            throw new RuntimeException("locked changes");
        }
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.f6828j.get(str);
        if (linkedHashMap == null) {
            linkedHashMap = new LinkedHashMap();
            this.f6828j.put(str, linkedHashMap);
        }
        if (linkedHashMap.get(str2) == null) {
            linkedHashMap.put(str2, str3);
        }
    }

    /* renamed from: e */
    public void m635e(String str, String str2, String str3) {
        if (this.f6826k) {
            throw new RuntimeException("locked changes");
        }
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.f6828j.get(str);
        if (linkedHashMap == null) {
            linkedHashMap = new LinkedHashMap();
            this.f6828j.put(str, linkedHashMap);
        }
        linkedHashMap.put(str2, str3);
    }

    /* renamed from: a */
    public void m683a(C1072ab c1072ab) {
        if (this.f6826k) {
            throw new RuntimeException("locked changes");
        }
        for (String str : c1072ab.f6828j.keySet()) {
            LinkedHashMap linkedHashMap = (LinkedHashMap) c1072ab.f6828j.get(str);
            if (!m668a(str, "@copyFrom_skipThisSection", (Boolean) false).booleanValue()) {
                LinkedHashMap linkedHashMap2 = (LinkedHashMap) this.f6828j.get(str);
                if (linkedHashMap2 == null) {
                    linkedHashMap2 = new LinkedHashMap();
                    this.f6828j.put(str, linkedHashMap2);
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
    public Rect m671a(String str, String str2, Rect rect) {
        String m649b = m649b(str, str2, (String) null);
        if (m649b == null) {
            return rect;
        }
        String[] split = m649b.split(",");
        if (split.length != 4) {
            throw new RuntimeException("[" + str + "]" + str2 + ": getRect: expected 4 ints, not:" + split.length);
        }
        try {
            return new Rect(Integer.valueOf(split[0].trim()).intValue(), Integer.valueOf(split[1].trim()).intValue(), Integer.valueOf(split[2].trim()).intValue(), Integer.valueOf(split[3].trim()).intValue());
        } catch (NumberFormatException e) {
            throw new RuntimeException("[" + str + "]" + str2 + ": getRect expected ints got: " + m649b);
        }
    }

    /* renamed from: a */
    public Enum m667a(String str, String str2, Enum r8, Class cls) {
        try {
            return m676a(m649b(str, str2, (String) null), r8, cls);
        } catch (C0412bm e) {
            throw new RuntimeException("[" + str + "]" + str2 + ": " + e.getMessage(), e);
        }
    }

    /* renamed from: a */
    public static Enum m676a(String str, Enum r4, Class cls) {
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
        throw m677a(trim, cls);
    }

    /* renamed from: a */
    private static RuntimeException m677a(String str, Class cls) {
        String str2 = VariableScope.nullOrMissingString;
        for (Object obj : cls.getEnumConstants()) {
            Enum r0 = (Enum) obj;
            if (!str2.equals(VariableScope.nullOrMissingString)) {
                str2 = str2 + ",";
            }
            str2 = str2 + r0.name();
        }
        throw new C0412bm("Unknown value: " + str + " (Expected: " + C0758f.m2095b(str2, 100) + ")");
    }

    /* renamed from: c */
    public C1101m m646c(String str) {
        C1101m c1101m = new C1101m();
        for (String str2 : this.f6828j.keySet()) {
            if (((Map) this.f6828j.get(str2)).get(str) != null) {
                c1101m.add(str2);
            }
        }
        return c1101m;
    }

    /* renamed from: d */
    public C1101m m641d(String str) {
        C1101m c1101m = new C1101m();
        for (String str2 : this.f6828j.keySet()) {
            Map map = (Map) this.f6828j.get(str2);
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
    public LinkedHashMap m642d() {
        return this.f6828j;
    }

    /* renamed from: k */
    public C1101m m622k(String str, String str2) {
        C1101m c1101m = new C1101m();
        Map map = (Map) this.f6828j.get(str);
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
    public C1101m m632f(String str, String str2, String str3) {
        C1101m c1101m = new C1101m();
        Map map = (Map) this.f6828j.get(str);
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
    public boolean m621l(String str, String str2) {
        Map map = (Map) this.f6828j.get(str);
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
    public C1101m m637e(String str) {
        C1101m c1101m = new C1101m();
        for (String str2 : this.f6828j.keySet()) {
            if (str2.startsWith(str) && m631g(str2)) {
                c1101m.add(str2);
            }
        }
        return c1101m;
    }

    /* renamed from: m */
    public C1101m m620m(String str, String str2) {
        C1101m c1101m = new C1101m();
        for (String str3 : this.f6828j.keySet()) {
            if (str3.startsWith(str) || str3.startsWith(str2)) {
                if (m631g(str3)) {
                    c1101m.add(str3);
                }
            }
        }
        return c1101m;
    }

    /* renamed from: f */
    public boolean m634f(String str) {
        if (this.f6828j.get(str) != null) {
            return true;
        }
        return false;
    }

    /* renamed from: g */
    public boolean m631g(String str) {
        Map map = (Map) this.f6828j.get(str);
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
    public boolean m619n(String str, String str2) {
        if (m658a(str, str2, true) != null) {
            return true;
        }
        return false;
    }

    /* renamed from: g */
    public static boolean m629g(String str, String str2, String str3) {
        if (str3.equalsIgnoreCase("true")) {
            return true;
        }
        if (str3.equalsIgnoreCase("false")) {
            return false;
        }
        throw new RuntimeException("[" + str + "]" + str2 + ": Unexpected boolean value:'" + str3 + "'");
    }

    /* renamed from: h */
    public static float m627h(String str, String str2, String str3) {
        try {
            return Float.parseFloat(str3);
        } catch (NumberFormatException e) {
            throw new RuntimeException("[" + str + "]" + str2 + ": Failed to read float:" + str3);
        }
    }

    /* renamed from: i */
    public static int m625i(String str, String str2, String str3) {
        try {
            return Integer.parseInt(str3);
        } catch (NumberFormatException e) {
            throw new RuntimeException("[" + str + "]" + str2 + ": Failed to read int:" + str3);
        }
    }

    /* renamed from: j */
    public static C0448g m623j(String str, String str2, String str3) {
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
        return C0448g.m3729c(trim);
    }
}
