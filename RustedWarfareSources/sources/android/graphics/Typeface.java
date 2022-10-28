package android.graphics;

import android.util.SparseArray;

/* loaded from: game-lib.jar:android/graphics/Typeface.class */
public class Typeface {

    /* renamed from: g */
    int f247g;

    /* renamed from: j */
    private int f248j;

    /* renamed from: h */
    String f249h;

    /* renamed from: i */
    private static final SparseArray f246i = new SparseArray(3);

    /* renamed from: a */
    public static final Typeface f240a = m5000a((String) null, 0);

    /* renamed from: b */
    public static final Typeface f241b = m5000a((String) null, 1);

    /* renamed from: c */
    public static final Typeface f242c = m5000a("sans-serif", 0);

    /* renamed from: d */
    public static final Typeface f243d = m5000a("serif", 0);

    /* renamed from: e */
    public static final Typeface f244e = m5000a("monospace", 0);

    /* renamed from: f */
    static Typeface[] f245f = {f240a, f241b, m5000a((String) null, 2), m5000a((String) null, 3)};

    /* renamed from: a */
    public final boolean m5003a() {
        return (this.f248j & 1) != 0;
    }

    /* renamed from: a */
    public static Typeface m5000a(String str, int i) {
        Typeface typeface = new Typeface(0);
        typeface.f248j = i;
        typeface.f249h = str;
        return typeface;
    }

    /* renamed from: a */
    public static Typeface m5001a(Typeface typeface, int i) {
        Typeface typeface2;
        int i2 = 0;
        if (typeface != null) {
            if (typeface.f248j == i) {
                return typeface;
            }
            i2 = typeface.f247g;
        }
        SparseArray sparseArray = (SparseArray) f246i.m4930a(i2);
        if (sparseArray != null && (typeface2 = (Typeface) sparseArray.m4930a(i)) != null) {
            return typeface2;
        }
        Typeface typeface3 = new Typeface(0);
        typeface3.f248j = i;
        typeface3.f249h = typeface.f249h;
        if (sparseArray == null) {
            sparseArray = new SparseArray(4);
            f246i.m4926b(i2, sparseArray);
        }
        sparseArray.m4926b(i, typeface3);
        return typeface3;
    }

    private Typeface(int i) {
        this.f248j = 0;
        this.f247g = i;
        this.f248j = m4999b(i);
    }

    protected void finalize() {
        try {
            m5002a(this.f247g);
        } finally {
            super.finalize();
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Typeface typeface = (Typeface) obj;
        return this.f248j == typeface.f248j && this.f247g == typeface.f247g;
    }

    public int hashCode() {
        return (31 * this.f247g) + this.f248j;
    }

    /* renamed from: a */
    private static void m5002a(int i) {
    }

    /* renamed from: b */
    private static int m4999b(int i) {
        return 0;
    }
}
