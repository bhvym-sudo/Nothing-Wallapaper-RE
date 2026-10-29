package p258z7;

import android.graphics.RectF;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.n;

/* JADX INFO: loaded from: classes2.dex */
public final class a implements Parcelable {
    public static final Parcelable.Creator<a> CREATOR = new C0767a();

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final RectF f30789q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final RectF f30790r;

    /* JADX INFO: renamed from: z7.a$a, reason: collision with other inner class name */
    public static final class C0767a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final a createFromParcel(Parcel parcel) {
            n.h(parcel, "parcel");
            return new a((RectF) parcel.readParcelable(a.class.getClassLoader()), (RectF) parcel.readParcelable(a.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final a[] newArray(int i10) {
            return new a[i10];
        }
    }

    public a(RectF initRect, RectF finalRect) {
        n.h(initRect, "initRect");
        n.h(finalRect, "finalRect");
        this.f30789q = initRect;
        this.f30790r = finalRect;
    }

    public final RectF a() {
        return this.f30790r;
    }

    public final RectF b() {
        return this.f30789q;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return n.d(this.f30789q, aVar.f30789q) && n.d(this.f30790r, aVar.f30790r);
    }

    public int hashCode() {
        return (this.f30789q.hashCode() * 31) + this.f30790r.hashCode();
    }

    public String toString() {
        return "AnimationParameter(initRect=" + this.f30789q + ", finalRect=" + this.f30790r + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i10) {
        n.h(dest, "dest");
        dest.writeParcelable(this.f30789q, i10);
        dest.writeParcelable(this.f30790r, i10);
    }
}
