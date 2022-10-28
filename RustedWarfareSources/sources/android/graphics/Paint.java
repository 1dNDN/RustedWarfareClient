package android.graphics;

import java.util.Locale;

/* loaded from: game-lib.jar:android/graphics/Paint.class */
public class Paint {

    /* renamed from: a */
    public int f167a;

    /* renamed from: r */
    private ColorFilter f168r;

    /* renamed from: s */
    private MaskFilter f169s;

    /* renamed from: t */
    private PathEffect f170t;

    /* renamed from: u */
    private Rasterizer f171u;

    /* renamed from: v */
    private Shader f172v;

    /* renamed from: w */
    private Typeface f173w;

    /* renamed from: x */
    private Xfermode f174x;

    /* renamed from: y */
    private boolean f175y;

    /* renamed from: z */
    private float f176z;

    /* renamed from: A */
    private float f177A;

    /* renamed from: B */
    private Locale f178B;

    /* renamed from: b */
    public boolean f179b;

    /* renamed from: c */
    public float f180c;

    /* renamed from: d */
    public float f181d;

    /* renamed from: e */
    public float f182e;

    /* renamed from: f */
    public int f183f;

    /* renamed from: g */
    public int f184g;

    /* renamed from: h */
    static final Style[] f185h = {Style.FILL, Style.STROKE, Style.FILL_AND_STROKE};

    /* renamed from: i */
    static final Cap[] f186i = {Cap.BUTT, Cap.ROUND, Cap.SQUARE};

    /* renamed from: j */
    static final Join[] f187j = {Join.MITER, Join.ROUND, Join.BEVEL};

    /* renamed from: k */
    static final Align[] f188k = {Align.LEFT, Align.CENTER, Align.RIGHT};

    /* renamed from: l */
    int f189l;

    /* renamed from: m */
    Style f190m;

    /* renamed from: n */
    int f191n;

    /* renamed from: o */
    float f192o;

    /* renamed from: p */
    Align f193p;

    /* renamed from: q */
    float f194q;

    /* loaded from: game-lib.jar:android/graphics/Paint$FontMetrics.class */
    public class FontMetrics {

        /* renamed from: a */
        public float f205a;

        /* renamed from: b */
        public float f206b;

        /* renamed from: c */
        public float f207c;

        /* renamed from: d */
        public float f208d;
    }

    /* loaded from: game-lib.jar:android/graphics/Paint$Style.class */
    public enum Style {
        FILL(0),
        STROKE(1),
        FILL_AND_STROKE(2);
        

        /* renamed from: d */
        final int f222d;

        Style(int i) {
            this.f222d = i;
        }
    }

    /* loaded from: game-lib.jar:android/graphics/Paint$Cap.class */
    public enum Cap {
        BUTT(0),
        ROUND(1),
        SQUARE(2);
        

        /* renamed from: d */
        final int f203d;

        Cap(int i) {
            this.f203d = i;
        }
    }

    /* loaded from: game-lib.jar:android/graphics/Paint$Join.class */
    public enum Join {
        MITER(0),
        ROUND(1),
        BEVEL(2);
        

        /* renamed from: d */
        final int f217d;

        Join(int i) {
            this.f217d = i;
        }
    }

    /* loaded from: game-lib.jar:android/graphics/Paint$Align.class */
    public enum Align {
        LEFT(0),
        CENTER(1),
        RIGHT(2);
        

        /* renamed from: d */
        final int f198d;

        Align(int i) {
            this.f198d = i;
        }
    }

    public Paint() {
        this(0);
    }

    public Paint(int i) {
        this.f184g = 2;
        this.f190m = Style.FILL;
        this.f192o = 0.0f;
        this.f194q = 16.0f;
        this.f167a = m5045o();
        m5095a();
        m5093a(i | 1280);
        this.f177A = 1.0f;
        this.f176z = 1.0f;
        m5074a(Locale.getDefault());
    }

    public Paint(Paint paint) {
        this.f184g = 2;
        this.f190m = Style.FILL;
        this.f192o = 0.0f;
        this.f194q = 16.0f;
        this.f167a = m5060d(paint.f167a);
        m5067b(paint);
    }

    /* renamed from: a */
    public void m5095a() {
        m5056e(this.f167a);
        m5093a(1280);
        this.f191n = -1;
        this.f190m = Style.FILL;
        this.f194q = 16.0f;
        this.f193p = Align.LEFT;
        this.f168r = null;
        this.f169s = null;
        this.f170t = null;
        this.f171u = null;
        this.f172v = null;
        this.f173w = null;
        this.f174x = null;
        this.f175y = false;
        this.f176z = 1.0f;
        this.f177A = 1.0f;
        this.f179b = false;
        this.f180c = 0.0f;
        this.f181d = 0.0f;
        this.f182e = 0.0f;
        this.f183f = 0;
        this.f184g = 2;
        m5074a(Locale.getDefault());
    }

    /* renamed from: a */
    public void m5083a(Paint paint) {
        if (this != paint) {
            m5092a(this.f167a, paint.f167a);
            m5067b(paint);
        }
    }

    /* renamed from: b */
    private void m5067b(Paint paint) {
        this.f190m = paint.f190m;
        this.f191n = paint.f191n;
        this.f194q = paint.f194q;
        this.f193p = paint.f193p;
        this.f168r = paint.f168r;
        this.f169s = paint.f169s;
        this.f170t = paint.f170t;
        this.f171u = paint.f171u;
        this.f173w = paint.f173w;
        this.f174x = paint.f174x;
        this.f175y = paint.f175y;
        this.f176z = paint.f176z;
        this.f177A = paint.f177A;
        this.f179b = paint.f179b;
        this.f180c = paint.f180c;
        this.f181d = paint.f181d;
        this.f182e = paint.f182e;
        this.f183f = paint.f183f;
        this.f184g = paint.f184g;
        this.f178B = paint.f178B;
        this.f192o = paint.f192o;
    }

    /* renamed from: b */
    public int m5070b() {
        return this.f189l;
    }

    /* renamed from: a */
    public void m5093a(int i) {
        this.f189l = i;
    }

    /* renamed from: c */
    public final boolean m5065c() {
        return (m5070b() & 1) != 0;
    }

    /* renamed from: a */
    public void mo893a(boolean z) {
        if (z) {
            m5093a(this.f189l | 1);
        } else {
            m5093a(this.f189l & (-2));
        }
    }

    /* renamed from: b */
    public void m5066b(boolean z) {
    }

    /* renamed from: c */
    public void m5062c(boolean z) {
    }

    /* renamed from: d */
    public void m5058d(boolean z) {
    }

    /* renamed from: d */
    public Style m5061d() {
        return this.f190m;
    }

    /* renamed from: a */
    public void m5084a(Style style) {
        this.f190m = style;
    }

    /* renamed from: e */
    public int m5057e() {
        return this.f191n;
    }

    /* renamed from: b */
    public void m5069b(int i) {
        this.f191n = i;
    }

    /* renamed from: f */
    public int m5055f() {
        return Color.m5108a(this.f191n);
    }

    /* renamed from: c */
    public void m5064c(int i) {
        this.f191n = Color.m5106a(i, Color.m5104b(this.f191n), Color.m5103c(this.f191n), Color.m5102d(this.f191n));
    }

    /* renamed from: a */
    public void m5091a(int i, int i2, int i3, int i4) {
        m5069b((i << 24) | (i2 << 16) | (i3 << 8) | i4);
    }

    /* renamed from: g */
    public float m5053g() {
        return this.f192o;
    }

    /* renamed from: a */
    public void m5094a(float f) {
        this.f192o = f;
    }

    /* renamed from: a */
    public void m5086a(Cap cap) {
        m5068b(this.f167a, cap.f203d);
    }

    /* renamed from: h */
    public ColorFilter m5052h() {
        return this.f168r;
    }

    /* renamed from: a */
    public ColorFilter m5088a(ColorFilter colorFilter) {
        m5063c(this.f167a, 0);
        this.f168r = colorFilter;
        return colorFilter;
    }

    /* renamed from: a */
    public Xfermode m5082a(Xfermode xfermode) {
        m5059d(this.f167a, 0);
        this.f174x = xfermode;
        return xfermode;
    }

    /* renamed from: i */
    public Typeface m5051i() {
        return this.f173w;
    }

    /* renamed from: a */
    public Typeface mo895a(Typeface typeface) {
        this.f173w = typeface;
        return typeface;
    }

    /* renamed from: j */
    public Align m5050j() {
        return this.f193p;
    }

    /* renamed from: a */
    public void m5087a(Align align) {
        this.f193p = align;
    }

    /* renamed from: a */
    public void m5074a(Locale locale) {
        if (locale == null) {
            throw new IllegalArgumentException("locale cannot be null");
        }
        if (locale.equals(this.f178B)) {
            return;
        }
        this.f178B = locale;
        m5090a(this.f167a, locale.toString());
    }

    /* renamed from: k */
    public float m5049k() {
        return this.f194q;
    }

    /* renamed from: b */
    public void mo892b(float f) {
        this.f194q = f;
    }

    /* renamed from: l */
    public float m5048l() {
        return -this.f194q;
    }

    /* renamed from: m */
    public float m5047m() {
        return 0.0f;
    }

    /* renamed from: a */
    public float m5085a(FontMetrics fontMetrics) {
        return 0.0f;
    }

    /* renamed from: n */
    public FontMetrics m5046n() {
        FontMetrics fontMetrics = new FontMetrics();
        m5085a(fontMetrics);
        return fontMetrics;
    }

    /* loaded from: game-lib.jar:android/graphics/Paint$FontMetricsInt.class */
    public class FontMetricsInt {

        /* renamed from: a */
        public int f209a;

        /* renamed from: b */
        public int f210b;

        /* renamed from: c */
        public int f211c;

        /* renamed from: d */
        public int f212d;

        /* renamed from: e */
        public int f213e;

        public String toString() {
            return "FontMetricsInt: top=" + this.f209a + " ascent=" + this.f210b + " descent=" + this.f211c + " bottom=" + this.f212d + " leading=" + this.f213e;
        }
    }

    /* renamed from: a */
    public float m5079a(String str) {
        if (str == null) {
            throw new IllegalArgumentException("text cannot be null");
        }
        if (str.length() == 0) {
            return 0.0f;
        }
        if (!this.f175y) {
            return (float) Math.ceil(m5078a(str, this.f184g));
        }
        float m5049k = m5049k();
        mo892b(m5049k * this.f176z);
        float m5078a = m5078a(str, this.f184g);
        mo892b(m5049k);
        return (float) Math.ceil(m5078a * this.f177A);
    }

    /* renamed from: a */
    private float m5078a(String str, int i) {
        return str.length() * m5049k();
    }

    /* renamed from: a */
    public int m5072a(char[] cArr, int i, int i2, float f, float[] fArr) {
        if (cArr == null) {
            throw new IllegalArgumentException("text cannot be null");
        }
        if (i < 0 || cArr.length - i < Math.abs(i2)) {
            throw new ArrayIndexOutOfBoundsException();
        }
        if (cArr.length == 0 || i2 == 0) {
            return 0;
        }
        if (!this.f175y) {
            return m5073a(cArr, i, i2, f, this.f184g, fArr);
        }
        float m5049k = m5049k();
        mo892b(m5049k * this.f176z);
        int m5073a = m5073a(cArr, i, i2, f * this.f176z, this.f184g, fArr);
        mo892b(m5049k);
        if (fArr != null) {
            fArr[0] = fArr[0] * this.f177A;
        }
        return m5073a;
    }

    /* renamed from: a */
    private int m5073a(char[] cArr, int i, int i2, float f, int i3, float[] fArr) {
        float m5049k = m5049k();
        if (f > m5049k * i2) {
            return i2;
        }
        if (f == 0.0f) {
            return 1;
        }
        int i4 = (int) (f / m5049k);
        if (i4 < 1) {
            i4 = 1;
        }
        return i4;
    }

    /* renamed from: a */
    private int m5076a(String str, boolean z, float f, int i, float[] fArr) {
        return str.length();
    }

    /* renamed from: a */
    public int m5081a(CharSequence charSequence, int i, int i2, boolean z, float f, float[] fArr) {
        int m5072a;
        if (charSequence == null) {
            throw new IllegalArgumentException("text cannot be null");
        }
        if ((i | i2 | (i2 - i) | (charSequence.length() - i2)) < 0) {
            throw new IndexOutOfBoundsException();
        }
        if (charSequence.length() == 0 || i == i2) {
            return 0;
        }
        if (i == 0 && (charSequence instanceof String) && i2 == charSequence.length()) {
            return m5075a((String) charSequence, z, f, fArr);
        }
        char[] m5005a = TemporaryBuffer.m5005a(i2 - i);
        m5080a(charSequence, i, i2, m5005a, 0);
        if (z) {
            m5072a = m5072a(m5005a, 0, i2 - i, f, fArr);
        } else {
            m5072a = m5072a(m5005a, 0, -(i2 - i), f, fArr);
        }
        TemporaryBuffer.m5004a(m5005a);
        return m5072a;
    }

    /* renamed from: a */
    public static void m5080a(CharSequence charSequence, int i, int i2, char[] cArr, int i3) {
        Class<?> cls = charSequence.getClass();
        if (cls == String.class) {
            ((String) charSequence).getChars(i, i2, cArr, i3);
        } else if (cls == StringBuffer.class) {
            ((StringBuffer) charSequence).getChars(i, i2, cArr, i3);
        } else if (cls == StringBuilder.class) {
            ((StringBuilder) charSequence).getChars(i, i2, cArr, i3);
        } else {
            for (int i4 = i; i4 < i2; i4++) {
                int i5 = i3;
                i3++;
                cArr[i5] = charSequence.charAt(i4);
            }
        }
    }

    /* renamed from: a */
    public int m5075a(String str, boolean z, float f, float[] fArr) {
        if (str == null) {
            throw new IllegalArgumentException("text cannot be null");
        }
        if (str.length() == 0) {
            return 0;
        }
        if (!this.f175y) {
            return m5076a(str, z, f, this.f184g, fArr);
        }
        float m5049k = m5049k();
        mo892b(m5049k * this.f176z);
        int m5076a = m5076a(str, z, f * this.f176z, this.f184g, fArr);
        mo892b(m5049k);
        if (fArr != null) {
            fArr[0] = fArr[0] * this.f177A;
        }
        return m5076a;
    }

    /* renamed from: a */
    public int m5071a(char[] cArr, int i, int i2, float[] fArr) {
        if (cArr == null) {
            throw new IllegalArgumentException("text cannot be null");
        }
        if ((i | i2) < 0 || i + i2 > cArr.length || i2 > fArr.length) {
            throw new ArrayIndexOutOfBoundsException();
        }
        if (cArr.length == 0 || i2 == 0) {
            return 0;
        }
        if (!this.f175y) {
            return m5089a(this.f167a, cArr, i, i2, this.f184g, fArr);
        }
        float m5049k = m5049k();
        mo892b(m5049k * this.f176z);
        int m5089a = m5089a(this.f167a, cArr, i, i2, this.f184g, fArr);
        mo892b(m5049k);
        for (int i3 = 0; i3 < m5089a; i3++) {
            int i4 = i3;
            fArr[i4] = fArr[i4] * this.f177A;
        }
        return m5089a;
    }

    /* renamed from: a */
    public void m5077a(String str, int i, int i2, Rect rect) {
        if ((i | i2 | (i2 - i) | (str.length() - i2)) < 0) {
            throw new IndexOutOfBoundsException();
        }
        if (rect == null) {
            throw new NullPointerException("need bounds Rect");
        }
        rect.m5035a(0, 0, 0, (int) this.f194q);
    }

    protected void finalize() {
        try {
            m5054f(this.f167a);
        } finally {
            super.finalize();
        }
    }

    /* renamed from: o */
    private static int m5045o() {
        return 0;
    }

    /* renamed from: d */
    private static int m5060d(int i) {
        return 0;
    }

    /* renamed from: e */
    private static void m5056e(int i) {
    }

    /* renamed from: a */
    private static void m5092a(int i, int i2) {
    }

    /* renamed from: b */
    private static void m5068b(int i, int i2) {
    }

    /* renamed from: c */
    private static int m5063c(int i, int i2) {
        return 0;
    }

    /* renamed from: d */
    private static int m5059d(int i, int i2) {
        return 0;
    }

    /* renamed from: a */
    private static void m5090a(int i, String str) {
    }

    /* renamed from: a */
    private static int m5089a(int i, char[] cArr, int i2, int i3, int i4, float[] fArr) {
        return 0;
    }

    /* renamed from: f */
    private static void m5054f(int i) {
    }
}
