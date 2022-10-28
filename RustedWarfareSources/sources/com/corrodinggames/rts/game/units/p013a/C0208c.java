package com.corrodinggames.rts.game.units.p013a;

import com.corrodinggames.rts.gameFramework.p041i.Reader;
import com.corrodinggames.rts.gameFramework.p041i.StreamWriter;
import java.util.HashMap;

/* renamed from: com.corrodinggames.rts.game.units.a.c */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/a/c.class */
public class C0208c {

    /* renamed from: c */
    private static final HashMap f1427c = new HashMap();

    /* renamed from: a */
    public static final C0208c f1428a = m4813a("-1");

    /* renamed from: b */
    String f1429b;

    /* renamed from: a */
    public static C0208c m4813a(String str) {
        C0208c c0208c = (C0208c) f1427c.get(str);
        if (c0208c != null) {
            return c0208c;
        }
        C0208c c0208c2 = new C0208c(str);
        f1427c.put(str, c0208c2);
        return c0208c2;
    }

    /* renamed from: a */
    public String m4817a() {
        return this.f1429b;
    }

    private C0208c(String str) {
        this.f1429b = str;
    }

    /* renamed from: a */
    public static void m4815a(StreamWriter streamWriter, C0208c c0208c) {
        String str = null;
        if (c0208c != null) {
            str = c0208c.f1429b;
        }
        streamWriter.m1399b(str);
    }

    /* renamed from: a */
    public static C0208c m4814a(Reader reader) {
        String ReadString = reader.ReadString();
        if (ReadString != null) {
            return m4813a(ReadString);
        }
        return null;
    }

    public boolean equals(Object obj) {
        return this == obj;
    }

    public int hashCode() {
        return this.f1429b.hashCode();
    }

    public String toString() {
        return "ActionId(" + this.f1429b + ")";
    }

    /* renamed from: a */
    public final boolean m4816a(C0208c c0208c) {
        return this == c0208c;
    }
}
