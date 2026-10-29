package p030d;

import android.content.Intent;
import android.content.IntentSender;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.AbstractC1457h;
import kotlin.jvm.internal.n;

/* JADX INFO: loaded from: classes.dex */
public final class g implements Parcelable {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final IntentSender f19293q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final Intent f19294r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final int f19295s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final int f19296t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final c f19292u = new c(null);
    public static final Parcelable.Creator<g> CREATOR = new b();

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final IntentSender f19297a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Intent f19298b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f19299c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f19300d;

        public a(IntentSender intentSender) {
            n.h(intentSender, "intentSender");
            this.f19297a = intentSender;
        }

        public final g a() {
            return new g(this.f19297a, this.f19298b, this.f19299c, this.f19300d);
        }

        public final a b(Intent intent) {
            this.f19298b = intent;
            return this;
        }

        public final a c(int i10, int i11) {
            this.f19300d = i10;
            this.f19299c = i11;
            return this;
        }
    }

    public static final class b implements Parcelable.Creator {
        b() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public g createFromParcel(Parcel inParcel) {
            n.h(inParcel, "inParcel");
            return new g(inParcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public g[] newArray(int i10) {
            return new g[i10];
        }
    }

    public static final class c {
        public /* synthetic */ c(AbstractC1457h abstractC1457h) {
            this();
        }

        private c() {
        }
    }

    public g(IntentSender intentSender, Intent intent, int i10, int i11) {
        n.h(intentSender, "intentSender");
        this.f19293q = intentSender;
        this.f19294r = intent;
        this.f19295s = i10;
        this.f19296t = i11;
    }

    public final Intent a() {
        return this.f19294r;
    }

    public final int b() {
        return this.f19295s;
    }

    public final int c() {
        return this.f19296t;
    }

    public final IntentSender d() {
        return this.f19293q;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel dest, int i10) {
        n.h(dest, "dest");
        dest.writeParcelable(this.f19293q, i10);
        dest.writeParcelable(this.f19294r, i10);
        dest.writeInt(this.f19295s);
        dest.writeInt(this.f19296t);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public g(Parcel parcel) {
        n.h(parcel, "parcel");
        Parcelable parcelable = parcel.readParcelable(IntentSender.class.getClassLoader());
        n.e(parcelable);
        this((IntentSender) parcelable, (Intent) parcel.readParcelable(Intent.class.getClassLoader()), parcel.readInt(), parcel.readInt());
    }
}
