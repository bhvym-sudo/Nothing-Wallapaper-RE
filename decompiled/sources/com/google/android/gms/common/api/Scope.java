package com.google.android.gms.common.api;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import p025c4.AbstractC1202p;
import p035d4.c;

/* JADX INFO: loaded from: classes.dex */
public final class Scope extends p035d4.a implements ReflectedParcelable {
    public static final Parcelable.Creator<Scope> CREATOR = new a();

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    final int f16192q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final String f16193r;

    Scope(int i10, String str) {
        AbstractC1202p.f(str, "scopeUri must not be null or empty");
        this.f16192q = i10;
        this.f16193r = str;
    }

    public String a() {
        return this.f16193r;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Scope) {
            return this.f16193r.equals(((Scope) obj).f16193r);
        }
        return false;
    }

    public int hashCode() {
        return this.f16193r.hashCode();
    }

    public String toString() {
        return this.f16193r;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int iA = c.a(parcel);
        c.h(parcel, 1, this.f16192q);
        c.m(parcel, 2, a(), false);
        c.b(parcel, iA);
    }

    public Scope(String str) {
        this(1, str);
    }
}
