package android.graphics;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.DisplayMetrics;
import java.io.OutputStream;

/* loaded from: game-lib.jar:android/graphics/Bitmap.class */
public final class Bitmap implements Parcelable {

    /* renamed from: a */
    public final int f126a;

    /* renamed from: d */
    private final boolean f127d;

    /* renamed from: e */
    private boolean f128e;

    /* renamed from: f */
    private int f129f;

    /* renamed from: g */
    private int f130g;

    /* renamed from: h */
    private boolean f131h;

    /* renamed from: b */
    int f132b;

    /* renamed from: i */
    private static volatile int f133i = -1;

    /* renamed from: c */
    public static final Parcelable.Creator f134c = new Parcelable.Creator() { // from class: android.graphics.Bitmap.1
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public Bitmap createFromParcel(Parcel parcel) {
            Bitmap nativeCreateFromParcel = Bitmap.nativeCreateFromParcel(parcel);
            if (nativeCreateFromParcel == null) {
                throw new RuntimeException("Failed to unparcel Bitmap");
            }
            return nativeCreateFromParcel;
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public Bitmap[] newArray(int i) {
            return new Bitmap[i];
        }
    };

    private static native Bitmap nativeCreate(int[] iArr, int i, int i2, int i3, int i4, int i5, boolean z);

    private static native Bitmap nativeCopy(int i, int i2, boolean z);

    private static native boolean nativeCompress(int i, int i2, int i3, OutputStream outputStream, byte[] bArr);

    private static native void nativeErase(int i, int i2);

    private static native int nativeConfig(int i);

    private static native int nativeGetPixel(int i, int i2, int i3, boolean z);

    private static native void nativeGetPixels(int i, int[] iArr, int i2, int i3, int i4, int i5, int i6, int i7, boolean z);

    private static native void nativeSetPixel(int i, int i2, int i3, int i4, boolean z);

    private static native void nativeSetPixels(int i, int[] iArr, int i2, int i3, int i4, int i5, int i6, int i7, boolean z);

    /* JADX INFO: Access modifiers changed from: private */
    public static native Bitmap nativeCreateFromParcel(Parcel parcel);

    private static native boolean nativeWriteToParcel(int i, boolean z, int i2, Parcel parcel);

    private static native void nativeSetHasAlpha(int i, boolean z);

    /* renamed from: a */
    private void m5141a(String str) {
        if (this.f131h) {
            throw new IllegalStateException(str);
        }
    }

    /* renamed from: b */
    private static void m5137b(int i, int i2) {
        if (i < 0) {
            throw new IllegalArgumentException("x must be >= 0");
        }
        if (i2 < 0) {
            throw new IllegalArgumentException("y must be >= 0");
        }
    }

    /* loaded from: game-lib.jar:android/graphics/Bitmap$Config.class */
    public enum Config {
        ALPHA_8(2),
        RGB_565(4),
        ARGB_4444(5),
        ARGB_8888(6);
        

        /* renamed from: e */
        final int f144e;

        /* renamed from: f */
        private static Config[] f145f = {null, null, ALPHA_8, null, RGB_565, ARGB_4444, ARGB_8888};

        Config(int i) {
            this.f144e = i;
        }

        /* renamed from: a */
        static Config m5130a(int i) {
            return f145f[i];
        }
    }

    /* renamed from: a */
    public Bitmap m5144a(Config config, boolean z) {
        m5141a("Can't copy a recycled bitmap");
        Bitmap nativeCopy = nativeCopy(this.f126a, config.f144e, z);
        if (nativeCopy != null) {
            nativeCopy.f128e = this.f128e;
            nativeCopy.f132b = this.f132b;
        }
        return nativeCopy;
    }

    /* renamed from: a */
    public static Bitmap m5147a(int i, int i2, Config config) {
        return m5146a(i, i2, config, true);
    }

    /* renamed from: a */
    private static Bitmap m5146a(int i, int i2, Config config, boolean z) {
        return m5142a(null, i, i2, config, z);
    }

    /* renamed from: a */
    private static Bitmap m5142a(DisplayMetrics displayMetrics, int i, int i2, Config config, boolean z) {
        if (i <= 0 || i2 <= 0) {
            throw new IllegalArgumentException("width and height must be > 0");
        }
        Bitmap nativeCreate = nativeCreate(null, 0, i, i, i2, config.f144e, true);
        if (displayMetrics != null) {
            nativeCreate.f132b = displayMetrics.densityDpi;
        }
        if (config == Config.ARGB_8888 && !z) {
            nativeErase(nativeCreate.f126a, -16777216);
            nativeSetHasAlpha(nativeCreate.f126a, z);
        }
        return nativeCreate;
    }

    /* loaded from: game-lib.jar:android/graphics/Bitmap$CompressFormat.class */
    public enum CompressFormat {
        JPEG(0),
        PNG(1),
        WEBP(2);
        

        /* renamed from: d */
        final int f138d;

        CompressFormat(int i) {
            this.f138d = i;
        }
    }

    /* renamed from: a */
    public boolean m5145a(CompressFormat compressFormat, int i, OutputStream outputStream) {
        m5141a("Can't compress a recycled bitmap");
        if (outputStream == null) {
            throw new NullPointerException();
        }
        if (i < 0 || i > 100) {
            throw new IllegalArgumentException("quality must be 0..100");
        }
        return nativeCompress(this.f126a, compressFormat.f138d, i, outputStream, new byte[4096]);
    }

    /* renamed from: a */
    public final boolean m5152a() {
        return this.f127d;
    }

    /* renamed from: b */
    public final int m5138b() {
        return this.f129f;
    }

    /* renamed from: c */
    public final int m5135c() {
        return this.f130g;
    }

    /* renamed from: d */
    public final Config m5133d() {
        return Config.m5130a(nativeConfig(this.f126a));
    }

    /* renamed from: a */
    public void m5140a(boolean z) {
        nativeSetHasAlpha(this.f126a, z);
    }

    /* renamed from: a */
    public void m5151a(int i) {
        m5141a("Can't erase a recycled bitmap");
        if (!m5152a()) {
            throw new IllegalStateException("cannot erase immutable bitmaps");
        }
        nativeErase(this.f126a, i);
    }

    /* renamed from: a */
    public int m5150a(int i, int i2) {
        m5141a("Can't call getPixel() on a recycled bitmap");
        m5134c(i, i2);
        return nativeGetPixel(this.f126a, i, i2, this.f128e);
    }

    /* renamed from: a */
    public void m5139a(int[] iArr, int i, int i2, int i3, int i4, int i5, int i6) {
        m5141a("Can't call getPixels() on a recycled bitmap");
        if (i5 == 0 || i6 == 0) {
            return;
        }
        m5148a(i3, i4, i5, i6, i, i2, iArr);
        nativeGetPixels(this.f126a, iArr, i, i2, i3, i4, i5, i6, this.f128e);
    }

    /* renamed from: c */
    private void m5134c(int i, int i2) {
        m5137b(i, i2);
        if (i >= m5138b()) {
            throw new IllegalArgumentException("x must be < bitmap.width()");
        }
        if (i2 >= m5135c()) {
            throw new IllegalArgumentException("y must be < bitmap.height()");
        }
    }

    /* renamed from: a */
    private void m5148a(int i, int i2, int i3, int i4, int i5, int i6, int[] iArr) {
        m5137b(i, i2);
        if (i3 < 0) {
            throw new IllegalArgumentException("width must be >= 0");
        }
        if (i4 < 0) {
            throw new IllegalArgumentException("height must be >= 0");
        }
        if (i + i3 > m5138b()) {
            throw new IllegalArgumentException("x + width must be <= bitmap.width()");
        }
        if (i2 + i4 > m5135c()) {
            throw new IllegalArgumentException("y + height must be <= bitmap.height()");
        }
        if (Math.abs(i6) < i3) {
            throw new IllegalArgumentException("abs(stride) must be >= width");
        }
        int i7 = i5 + ((i4 - 1) * i6);
        int length = iArr.length;
        if (i5 < 0 || i5 + i3 > length || i7 < 0 || i7 + i3 > length) {
            throw new ArrayIndexOutOfBoundsException();
        }
    }

    /* renamed from: a */
    public void m5149a(int i, int i2, int i3) {
        m5141a("Can't call setPixel() on a recycled bitmap");
        if (!m5152a()) {
            throw new IllegalStateException();
        }
        m5134c(i, i2);
        nativeSetPixel(this.f126a, i, i2, i3, this.f128e);
    }

    /* renamed from: b */
    public void m5136b(int[] iArr, int i, int i2, int i3, int i4, int i5, int i6) {
        m5141a("Can't call setPixels() on a recycled bitmap");
        if (!m5152a()) {
            throw new IllegalStateException();
        }
        if (i5 == 0 || i6 == 0) {
            return;
        }
        m5148a(i3, i4, i5, i6, i, i2, iArr);
        nativeSetPixels(this.f126a, iArr, i, i2, i3, i4, i5, i6, this.f128e);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        m5141a("Can't parcel a recycled bitmap");
        if (!nativeWriteToParcel(this.f126a, this.f127d, this.f132b, parcel)) {
            throw new RuntimeException("native writeToParcel failed");
        }
    }
}
