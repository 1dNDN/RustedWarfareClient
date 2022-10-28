package android.graphics;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: game-lib.jar:android/graphics/RectF.class */
public class RectF implements Parcelable {

    /* renamed from: a */
    public float f234a;

    /* renamed from: b */
    public float f235b;

    /* renamed from: c */
    public float f236c;

    /* renamed from: d */
    public float f237d;

    /* renamed from: e */
    public static final Parcelable.Creator f238e = new Parcelable.Creator() { // from class: android.graphics.RectF.1
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public RectF createFromParcel(Parcel parcel) {
            RectF rectF = new RectF();
            rectF.m5018a(parcel);
            return rectF;
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public RectF[] newArray(int i) {
            return new RectF[i];
        }
    };

    public RectF() {
    }

    public RectF(float f, float f2, float f3, float f4) {
        this.f234a = f;
        this.f235b = f2;
        this.f236c = f3;
        this.f237d = f4;
    }

    public RectF(RectF rectF) {
        this.f234a = rectF.f234a;
        this.f235b = rectF.f235b;
        this.f236c = rectF.f236c;
        this.f237d = rectF.f237d;
    }

    public RectF(Rect rect) {
        this.f234a = rect.f230a;
        this.f235b = rect.f231b;
        this.f236c = rect.f232c;
        this.f237d = rect.f233d;
    }

    public String toString() {
        return "RectF(" + this.f234a + ", " + this.f235b + ", " + this.f236c + ", " + this.f237d + ")";
    }

    /* renamed from: a */
    public final boolean m5024a() {
        return this.f234a >= this.f236c || this.f235b >= this.f237d;
    }

    /* renamed from: b */
    public final float m5017b() {
        return this.f236c - this.f234a;
    }

    /* renamed from: c */
    public final float m5013c() {
        return this.f237d - this.f235b;
    }

    /* renamed from: d */
    public final float m5011d() {
        return (this.f234a + this.f236c) * 0.5f;
    }

    /* renamed from: e */
    public final float m5010e() {
        return (this.f235b + this.f237d) * 0.5f;
    }

    /* renamed from: f */
    public void m5009f() {
        this.f237d = 0.0f;
        this.f235b = 0.0f;
        this.f236c = 0.0f;
        this.f234a = 0.0f;
    }

    /* renamed from: a */
    public void m5022a(float f, float f2, float f3, float f4) {
        this.f234a = f;
        this.f235b = f2;
        this.f236c = f3;
        this.f237d = f4;
    }

    /* renamed from: a */
    public void m5020a(RectF rectF) {
        this.f234a = rectF.f234a;
        this.f235b = rectF.f235b;
        this.f236c = rectF.f236c;
        this.f237d = rectF.f237d;
    }

    /* renamed from: a */
    public void m5021a(Rect rect) {
        this.f234a = rect.f230a;
        this.f235b = rect.f231b;
        this.f236c = rect.f232c;
        this.f237d = rect.f233d;
    }

    /* renamed from: a */
    public void m5023a(float f, float f2) {
        this.f234a += f;
        this.f235b += f2;
        this.f236c += f;
        this.f237d += f2;
    }

    /* renamed from: b */
    public boolean m5016b(float f, float f2) {
        return this.f234a < this.f236c && this.f235b < this.f237d && f >= this.f234a && f < this.f236c && f2 >= this.f235b && f2 < this.f237d;
    }

    /* renamed from: b */
    public boolean m5015b(float f, float f2, float f3, float f4) {
        if (this.f234a < f3 && f < this.f236c && this.f235b < f4 && f2 < this.f237d) {
            if (this.f234a < f) {
                this.f234a = f;
            }
            if (this.f235b < f2) {
                this.f235b = f2;
            }
            if (this.f236c > f3) {
                this.f236c = f3;
            }
            if (this.f237d > f4) {
                this.f237d = f4;
                return true;
            }
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public boolean m5014b(RectF rectF) {
        return m5015b(rectF.f234a, rectF.f235b, rectF.f236c, rectF.f237d);
    }

    /* renamed from: a */
    public static boolean m5019a(RectF rectF, RectF rectF2) {
        return rectF.f234a < rectF2.f236c && rectF2.f234a < rectF.f236c && rectF.f235b < rectF2.f237d && rectF2.f235b < rectF.f237d;
    }

    /* renamed from: c */
    public void m5012c(float f, float f2) {
        if (f < this.f234a) {
            this.f234a = f;
        } else if (f > this.f236c) {
            this.f236c = f;
        }
        if (f2 < this.f235b) {
            this.f235b = f2;
        } else if (f2 > this.f237d) {
            this.f237d = f2;
        }
    }

    /* renamed from: g */
    public void m5008g() {
        if (this.f234a > this.f236c) {
            float f = this.f234a;
            this.f234a = this.f236c;
            this.f236c = f;
        }
        if (this.f235b > this.f237d) {
            float f2 = this.f235b;
            this.f235b = this.f237d;
            this.f237d = f2;
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeFloat(this.f234a);
        parcel.writeFloat(this.f235b);
        parcel.writeFloat(this.f236c);
        parcel.writeFloat(this.f237d);
    }

    /* renamed from: a */
    public void m5018a(Parcel parcel) {
        this.f234a = parcel.readFloat();
        this.f235b = parcel.readFloat();
        this.f236c = parcel.readFloat();
        this.f237d = parcel.readFloat();
    }
}
