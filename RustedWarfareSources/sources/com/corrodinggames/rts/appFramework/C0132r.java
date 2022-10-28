package com.corrodinggames.rts.appFramework;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Comparator;
import java.util.Date;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: com.corrodinggames.rts.appFramework.r */
/* loaded from: game-lib.jar:com/corrodinggames/rts/appFramework/r.class */
class C0132r implements Comparator {

    /* renamed from: a */
    Pattern f543a = Pattern.compile(".*\\((.*)\\).*");

    @Override // java.util.Comparator
    /* renamed from: a */
    public int compare(String str, String str2) {
        Date m4750a = m4750a(str);
        Date m4750a2 = m4750a(str2);
        if (m4750a == null && m4750a2 == null) {
            return str.compareTo(str2);
        }
        if (m4750a != null && m4750a2 != null) {
            return m4750a2.compareTo(m4750a);
        }
        if (m4750a == null && m4750a2 != null) {
            return -1;
        }
        if (m4750a != null && m4750a2 == null) {
            return 1;
        }
        return 0;
    }

    /* renamed from: a */
    public Date m4750a(String str) {
        Matcher matcher = this.f543a.matcher(str);
        if (matcher.matches()) {
            String group = matcher.group(1);
            try {
                return new SimpleDateFormat("d MMM yyyy HH.mm.ss", Locale.ENGLISH).parse(group);
            } catch (ParseException e) {
                try {
                    return new SimpleDateFormat("d MMM yyyy HH:mm:ss", Locale.ENGLISH).parse(group);
                } catch (ParseException e2) {
                    try {
                        return new SimpleDateFormat("d MMM yyyy HH_mm_ss", Locale.ENGLISH).parse(group);
                    } catch (ParseException e3) {
                        try {
                            return new SimpleDateFormat("d MMM yyyy HH-mm-ss", Locale.ENGLISH).parse(group);
                        } catch (ParseException e4) {
                            try {
                                return new SimpleDateFormat("d MMM. yyyy HH.mm.ss", Locale.ENGLISH).parse(group);
                            } catch (ParseException e5) {
                                return null;
                            }
                        }
                    }
                }
            }
        }
        return null;
    }
}
