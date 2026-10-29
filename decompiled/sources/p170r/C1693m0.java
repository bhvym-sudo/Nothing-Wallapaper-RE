package p170r;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.AbstractC1457h;
import kotlin.jvm.internal.n;

/* JADX INFO: renamed from: r.m0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1693m0 extends Q0 implements Parcelable {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final b f25524t = new b(null);
    public static final Parcelable.Creator<C1693m0> CREATOR = new a();

    /* JADX INFO: renamed from: r.m0$a */
    public static final class a implements Parcelable.ClassLoaderCreator {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public C1693m0 createFromParcel(Parcel parcel) {
            return createFromParcel(parcel, null);
        }

        @Override // android.os.Parcelable.ClassLoaderCreator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public C1693m0 createFromParcel(Parcel parcel, ClassLoader classLoader) {
            R0 r0E;
            if (classLoader == null) {
                classLoader = a.class.getClassLoader();
            }
            Object value = parcel.readValue(classLoader);
            int i10 = parcel.readInt();
            if (i10 == 0) {
                r0E = S0.e();
            } else if (i10 == 1) {
                r0E = S0.g();
            } else {
                if (i10 != 2) {
                    throw new IllegalStateException("Unsupported MutableState policy " + i10 + " was restored");
                }
                r0E = S0.f();
            }
            return new C1693m0(value, r0E);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public C1693m0[] newArray(int i10) {
            return new C1693m0[i10];
        }
    }

    /* JADX INFO: renamed from: r.m0$b */
    public static final class b {
        public /* synthetic */ b(AbstractC1457h abstractC1457h) {
            this();
        }

        private b() {
        }
    }

    public C1693m0(Object obj, R0 r9) {
        super(obj, r9);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int i11;
        parcel.writeValue(getValue());
        R0 r0A = a();
        if (n.d(r0A, S0.e())) {
            i11 = 0;
        } else if (n.d(r0A, S0.g())) {
            i11 = 1;
        } else {
            if (!n.d(r0A, S0.f())) {
                throw new IllegalStateException("Only known types of MutableState's SnapshotMutationPolicy are supported");
            }
            i11 = 2;
        }
        parcel.writeInt(i11);
    }
}
