package com.google.android.material.timepicker;

import android.content.res.Resources;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
class e implements Parcelable {
    public static final Parcelable.Creator<e> CREATOR = new a();

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final b f17640q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final b f17641r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    final int f17642s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    int f17643t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    int f17644u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    int f17645v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    int f17646w;

    class a implements Parcelable.Creator {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public e createFromParcel(Parcel parcel) {
            return new e(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public e[] newArray(int i10) {
            return new e[i10];
        }
    }

    public e(int i10, int i11, int i12, int i13) {
        this.f17643t = i10;
        this.f17644u = i11;
        this.f17645v = i12;
        this.f17642s = i13;
        this.f17646w = c(i10);
        this.f17640q = new b(59);
        this.f17641r = new b(i13 == 1 ? 23 : 12);
    }

    public static String a(Resources resources, CharSequence charSequence) {
        return b(resources, charSequence, "%02d");
    }

    public static String b(Resources resources, CharSequence charSequence, String str) {
        try {
            return String.format(resources.getConfiguration().locale, str, Integer.valueOf(Integer.parseInt(String.valueOf(charSequence))));
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    private static int c(int i10) {
        return i10 >= 12 ? 1 : 0;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return this.f17643t == eVar.f17643t && this.f17644u == eVar.f17644u && this.f17642s == eVar.f17642s && this.f17645v == eVar.f17645v;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f17642s), Integer.valueOf(this.f17643t), Integer.valueOf(this.f17644u), Integer.valueOf(this.f17645v)});
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f17643t);
        parcel.writeInt(this.f17644u);
        parcel.writeInt(this.f17645v);
        parcel.writeInt(this.f17642s);
    }

    protected e(Parcel parcel) {
        this(parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt());
    }
}
