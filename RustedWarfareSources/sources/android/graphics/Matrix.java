package android.graphics;

/* loaded from: game-lib.jar:android/graphics/Matrix.class */
public class Matrix {

    /* renamed from: a */
    public static Matrix f159a = new Matrix() { // from class: android.graphics.Matrix.1
    };

    /* renamed from: b */
    public int f160b = m5101a(0);

    public boolean equals(Object obj) {
        if (obj instanceof Matrix) {
            return m5100a(this.f160b, ((Matrix) obj).f160b);
        }
        return false;
    }

    public int hashCode() {
        return 44;
    }

    /* loaded from: game-lib.jar:android/graphics/Matrix$ScaleToFit.class */
    public enum ScaleToFit {
        FILL(0),
        START(1),
        CENTER(2),
        END(3);
        

        /* renamed from: e */
        final int f165e;

        ScaleToFit(int i) {
            this.f165e = i;
        }
    }

    /* renamed from: a */
    public void m5097a(float[] fArr) {
        if (fArr.length < 9) {
            throw new ArrayIndexOutOfBoundsException();
        }
        m5099a(this.f160b, fArr);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(64);
        sb.append("Matrix{");
        m5098a(sb);
        sb.append('}');
        return sb.toString();
    }

    /* renamed from: a */
    public void m5098a(StringBuilder sb) {
        float[] fArr = new float[9];
        m5097a(fArr);
        sb.append('[');
        sb.append(fArr[0]);
        sb.append(", ");
        sb.append(fArr[1]);
        sb.append(", ");
        sb.append(fArr[2]);
        sb.append("][");
        sb.append(fArr[3]);
        sb.append(", ");
        sb.append(fArr[4]);
        sb.append(", ");
        sb.append(fArr[5]);
        sb.append("][");
        sb.append(fArr[6]);
        sb.append(", ");
        sb.append(fArr[7]);
        sb.append(", ");
        sb.append(fArr[8]);
        sb.append(']');
    }

    protected void finalize() {
        try {
            m5096b(this.f160b);
        } finally {
            super.finalize();
        }
    }

    /* renamed from: a */
    private static int m5101a(int i) {
        return 0;
    }

    /* renamed from: a */
    private static void m5099a(int i, float[] fArr) {
    }

    /* renamed from: a */
    private static boolean m5100a(int i, int i2) {
        return false;
    }

    /* renamed from: b */
    private static void m5096b(int i) {
    }
}
