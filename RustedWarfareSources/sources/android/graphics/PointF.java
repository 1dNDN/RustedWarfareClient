package android.graphics;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: game-lib.jar:android/graphics/PointF.class */
public class PointF implements Parcelable {

    /* renamed from: a */
    public float f227a;

    /* renamed from: b */
    public float f228b;

    public PointF() {
    }

    public PointF(float f, float f2) {
        this.f227a = f;
        this.f228b = f2;
    }

    /* renamed from: a */
    public final void m5040a(float f, float f2) {
        this.f227a = f;
        this.f228b = f2;
    }

    /* renamed from: a */
    public final void m5039a(PointF pointF) {
        this.f227a = pointF.f227a;
        this.f228b = pointF.f228b;
    }

    /* renamed from: b */
    public final void m5038b(float f, float f2) {
        this.f227a += f;
        this.f228b += f2;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeFloat(this.f227a);
        parcel.writeFloat(this.f228b);
    }
}
