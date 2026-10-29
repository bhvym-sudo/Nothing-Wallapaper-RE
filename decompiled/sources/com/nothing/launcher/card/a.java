package com.nothing.launcher.card;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes2.dex */
public final class a implements Parcelable {
    public static final Parcelable.Creator<a> CREATOR = new C0479a();

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final F5.m f18098q;

    /* JADX INFO: renamed from: com.nothing.launcher.card.a$a, reason: collision with other inner class name */
    public static final class C0479a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final a createFromParcel(Parcel parcel) {
            kotlin.jvm.internal.n.h(parcel, "parcel");
            return new a((F5.m) parcel.readParcelable(a.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final a[] newArray(int i10) {
            return new a[i10];
        }
    }

    public a(F5.m info) {
        kotlin.jvm.internal.n.h(info, "info");
        this.f18098q = info;
    }

    public final j a(Context context) {
        kotlin.jvm.internal.n.h(context, "context");
        return j.f18121Z.a(context, this.f18098q);
    }

    public final boolean b() {
        int iD = this.f18098q.d();
        return (this.f18098q.m() == null || ((iD & 1) != 0 && (iD & 2) != 0)) ? false : true;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i10) {
        kotlin.jvm.internal.n.h(dest, "dest");
        dest.writeParcelable(this.f18098q, i10);
    }
}
