package p025c4;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;
import p035d4.a;
import p035d4.c;

/* JADX INFO: renamed from: c4.s, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1204s extends a {
    public static final Parcelable.Creator<C1204s> CREATOR = new C1208w();

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final int f15221q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private List f15222r;

    public C1204s(int i10, List list) {
        this.f15221q = i10;
        this.f15222r = list;
    }

    public final int a() {
        return this.f15221q;
    }

    public final List b() {
        return this.f15222r;
    }

    public final void c(C1200n c1200n) {
        if (this.f15222r == null) {
            this.f15222r = new ArrayList();
        }
        this.f15222r.add(c1200n);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iA = c.a(parcel);
        c.h(parcel, 1, this.f15221q);
        c.p(parcel, 2, this.f15222r, false);
        c.b(parcel, iA);
    }
}
