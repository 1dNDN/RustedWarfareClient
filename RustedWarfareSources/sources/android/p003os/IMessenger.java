package android.p003os;

/* renamed from: android.os.IMessenger */
/* loaded from: game-lib.jar:android/os/IMessenger.class */
public interface IMessenger extends IInterface {
    /* renamed from: a */
    void m4975a(Message message);

    /* renamed from: android.os.IMessenger$Stub */
    /* loaded from: game-lib.jar:android/os/IMessenger$Stub.class */
    public abstract class Stub extends Binder implements IMessenger {
        public Stub() {
            attachInterface(this, "android.os.IMessenger");
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            Message message;
            switch (i) {
                case 1:
                    parcel.enforceInterface("android.os.IMessenger");
                    if (0 != parcel.readInt()) {
                        message = (Message) Message.f293m.createFromParcel(parcel);
                    } else {
                        message = null;
                    }
                    m4975a(message);
                    return true;
                case 1598968902:
                    parcel2.writeString("android.os.IMessenger");
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }
    }
}
