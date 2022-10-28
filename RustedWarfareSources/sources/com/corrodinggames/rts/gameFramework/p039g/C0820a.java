package com.corrodinggames.rts.gameFramework.p039g;

import android.os.Build;
import com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope;
import com.corrodinggames.rts.gameFramework.LoggerMaybe;
import com.corrodinggames.rts.gameFramework.SettingsEngine;
import com.corrodinggames.rts.gameFramework.p036e.C0750a;
import com.corrodinggames.rts.gameFramework.utility.C1098j;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.text.FieldPosition;
import java.text.MessageFormat;
import java.util.Locale;
import java.util.MissingResourceException;
import java.util.PropertyResourceBundle;
import java.util.ResourceBundle;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: com.corrodinggames.rts.gameFramework.g.a */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/g/a.class */
public final class C0820a {

    /* renamed from: a */
    static ResourceBundle f5398a;

    /* renamed from: b */
    static boolean f5399b;

    /* renamed from: d */
    public static String f5400d;

    /* renamed from: c */
    public static int f5401c = 0;

    /* renamed from: e */
    static Pattern f5402e = Pattern.compile("(.*)(\\(.*\\)( *\\[by.*\\])?)");

    /* renamed from: f */
    static final Pattern f5403f = Pattern.compile("\\[i:([^\\]]*?)\\]");

    /* renamed from: a */
    public static void m1694a() {
        m1682e();
    }

    /* renamed from: b */
    static ResourceBundle m1688b() {
        if (f5398a == null) {
            m1682e();
        }
        return f5398a;
    }

    /* renamed from: a */
    static PropertyResourceBundle m1693a(String str) {
        C1098j m2220j = C0750a.m2220j("translations/" + str);
        if (m2220j == null) {
            return null;
        }
        PropertyResourceBundle propertyResourceBundle = null;
        try {
            InputStreamReader inputStreamReader = new InputStreamReader(m2220j, "UTF-8");
            propertyResourceBundle = new PropertyResourceBundle(inputStreamReader);
            inputStreamReader.close();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        } catch (IOException e2) {
            e2.printStackTrace();
        }
        return propertyResourceBundle;
    }

    /* renamed from: a */
    public static String m1690a(String str, Locale locale, boolean z, boolean z2) {
        String str2;
        String str3;
        if (locale == Locale.ROOT) {
            return str;
        }
        String language = locale.getLanguage();
        if (z) {
            str2 = locale.getCountry();
        } else {
            str2 = VariableScope.nullOrMissingString;
        }
        if (z2) {
            str3 = locale.getVariant();
        } else {
            str3 = VariableScope.nullOrMissingString;
        }
        if (language.equals(VariableScope.nullOrMissingString) && str2.equals(VariableScope.nullOrMissingString) && str3.equals(VariableScope.nullOrMissingString)) {
            return str;
        }
        StringBuilder sb = new StringBuilder(str);
        sb.append('_');
        if (!str3.equals(VariableScope.nullOrMissingString)) {
            sb.append(language).append('_').append(str2.toLowerCase(Locale.ROOT)).append('_').append(str3.toLowerCase(Locale.ROOT));
        } else if (!str2.equals(VariableScope.nullOrMissingString)) {
            sb.append(language).append('_').append(str2.toLowerCase(Locale.ROOT));
        } else {
            sb.append(language);
        }
        return sb.toString();
    }

    /* renamed from: a */
    static ResourceBundle m1691a(String str, Locale locale) {
        String str2 = m1690a(str, Locale.ROOT, false, false) + ".properties";
        PropertyResourceBundle m1693a = m1693a(str2);
        if (m1693a == null) {
            throw new RuntimeException("Root locate file:" + str2 + " is missing, it is required");
        }
        if (Locale.ROOT.equals(locale)) {
            LoggerMaybe.LogDebug2("Locale: Using " + str2 + " as locale");
            return m1693a;
        }
        String str3 = m1690a(str, locale, true, true) + ".properties";
        PropertyResourceBundle m1693a2 = m1693a(str3);
        if (m1693a2 == null) {
            LoggerMaybe.LogDebug2("Locale: No locale for " + str3 + " checking locale without variant ");
            str3 = m1690a(str, locale, true, false) + ".properties";
            m1693a2 = m1693a(str3);
            if (m1693a2 == null) {
                LoggerMaybe.LogDebug2("Locale: No locale for " + str3 + " checking locale without variant or country");
                str3 = m1690a(str, locale, false, false) + ".properties";
                m1693a2 = m1693a(str3);
                if (m1693a2 == null) {
                    LoggerMaybe.LogDebug2("Locale: No locale for " + str3 + " using base locale");
                    return m1693a;
                }
            }
        }
        LoggerMaybe.LogDebug2("Locale: Using " + str3 + " as locale");
        return new C0821b(m1693a2, m1693a);
    }

    /* renamed from: c */
    public static String m1686c() {
        if (f5400d != null) {
            return f5400d;
        }
        return m1684d().getLanguage();
    }

    /* renamed from: d */
    public static Locale m1684d() {
        LoggerMaybe m1079A = LoggerMaybe.m1079A();
        SettingsEngine settingsEngine = null;
        if (m1079A != null) {
            settingsEngine = m1079A.f6115bQ;
        }
        boolean z = false;
        if (settingsEngine != null && settingsEngine.forceEnglish) {
            z = true;
        }
        if (z) {
            return Locale.ROOT;
        }
        return Locale.getDefault();
    }

    /* renamed from: e */
    public static synchronized void m1682e() {
        f5401c++;
        LoggerMaybe m1079A = LoggerMaybe.m1079A();
        SettingsEngine settingsEngine = null;
        if (m1079A != null) {
            settingsEngine = m1079A.f6115bQ;
        }
        boolean z = false;
        if (settingsEngine != null && settingsEngine.forceEnglish) {
            z = true;
        }
        if (f5398a != null && f5399b == z) {
            LoggerMaybe.LogDebug2("Locale.reload: skipping reload");
        }
        if (Build.VERSION.SDK_INT >= 9) {
            ResourceBundle.clearCache();
        }
        if (z) {
            LoggerMaybe.LogDebug2("Locale: forceEnglish");
            f5398a = m1691a("Strings", Locale.ROOT);
        } else if (f5400d != null) {
            f5398a = m1691a("Strings", new Locale(f5400d));
        } else if (settingsEngine != null && settingsEngine.overrideLanguageCode != null && !settingsEngine.overrideLanguageCode.equals(VariableScope.nullOrMissingString)) {
            f5398a = m1691a("Strings", new Locale(settingsEngine.overrideLanguageCode));
        } else {
            Locale locale = Locale.getDefault();
            LoggerMaybe.LogDebug2("Locale: default targetLocale:" + locale);
            if (locale != null) {
                LoggerMaybe.LogDebug2("Locale: default targetLocale ISO3:" + locale.getISO3Language());
            }
            f5398a = m1691a("Strings", locale);
        }
        f5399b = z;
        if (0 != 0) {
        }
    }

    /* renamed from: d */
    private static final String m1683d(String str) {
        try {
            String string = m1688b().getString(str);
            if (string.contains("[") || string.contains("]")) {
                string = string.replace("[[", "{{").replace("]]", "}}").replace("[", "{{").replace("]", "}}");
            }
            if (string.contains("{") || string.contains("}")) {
                string = string.replace("}}  {{", "}}{{").replace("}} {{", "}}{{").replace("}}{{", "\n-").replace("{{", "-").replace("}}", VariableScope.nullOrMissingString);
            }
            return string;
        } catch (NullPointerException e) {
            throw new RuntimeException("NullPointer with key:" + str + " locale:" + m1688b().getLocale().toString(), e);
        }
    }

    /* renamed from: e */
    private static final boolean m1681e(String str) {
        try {
            m1688b().getString(str);
            return true;
        } catch (MissingResourceException e) {
            return false;
        }
    }

    /* renamed from: a */
    public static final String m1692a(String str, String str2, Object... objArr) {
        try {
            return m1689a(str, objArr);
        } catch (MissingResourceException e) {
            return str2;
        }
    }

    /* renamed from: a */
    public static final String m1689a(String str, Object... objArr) {
        String m1683d = m1683d(str);
        if (objArr.length == 0) {
            return m1683d;
        }
        return new MessageFormat(m1683d).format(objArr, new StringBuffer(), (FieldPosition) null).toString();
    }

    /* renamed from: b */
    public static final String m1687b(String str) {
        if (str == null) {
            return null;
        }
        String str2 = str;
        String str3 = null;
        Matcher matcher = f5402e.matcher(str);
        if (matcher.matches()) {
            str2 = matcher.group(1);
            str3 = matcher.group(2);
        }
        String str4 = "maps.name." + str2.trim().replace(" ", "_").replace(".tmx", VariableScope.nullOrMissingString).toLowerCase(Locale.ENGLISH);
        if (m1681e(str4)) {
            String m1689a = m1689a(str4, new Object[0]);
            if (str3 != null) {
                m1689a = m1689a + str3;
            }
            LoggerMaybe.LogDebug2("translated:" + m1689a);
            if (m1689a != null) {
                m1689a = m1689a.replace("_", " ");
            }
            return m1689a;
        }
        return str;
    }

    /* renamed from: c */
    public static String m1685c(String str) {
        if (!str.contains("[i:")) {
            return str;
        }
        int i = 0;
        StringBuffer stringBuffer = new StringBuffer();
        Matcher matcher = f5403f.matcher(str);
        while (matcher.find()) {
            i++;
            if (i > 100) {
                LoggerMaybe.m990b("convertInlineBlocks: Too many loops while parsing: " + str);
                return str;
            }
            String group = matcher.group(1);
            String m1692a = m1692a(group, null, new Object[0]);
            if (m1692a == null) {
                LoggerMaybe.LogDebug2("convertInlineBlocks: No key:" + group);
                m1692a = "[No key: " + group + "]";
            }
            matcher.appendReplacement(stringBuffer, m1692a);
        }
        matcher.appendTail(stringBuffer);
        return stringBuffer.toString();
    }
}
