package p065g4;

import Z3.c;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;
import p025c4.AbstractC1201o;
import p025c4.AbstractC1202p;
import p055f4.f;

/* JADX INFO: loaded from: classes.dex */
public class a extends p035d4.a {
    public static final Parcelable.Creator<a> CREATOR = new f();

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static final Comparator f21251u = new Comparator() { // from class: g4.e
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            c cVar = (c) obj;
            c cVar2 = (c) obj2;
            Parcelable.Creator<a> creator = a.CREATOR;
            return !cVar.a().equals(cVar2.a()) ? cVar.a().compareTo(cVar2.a()) : (cVar.b() > cVar2.b() ? 1 : (cVar.b() == cVar2.b() ? 0 : -1));
        }
    };

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final List f21252q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final boolean f21253r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final String f21254s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final String f21255t;

    public a(List list, boolean z9, String str, String str2) {
        AbstractC1202p.i(list);
        this.f21252q = list;
        this.f21253r = z9;
        this.f21254s = str;
        this.f21255t = str2;
    }

    public static a a(f fVar) {
        return c(fVar.a(), true);
    }

    static a c(List list, boolean z9) {
        TreeSet treeSet = new TreeSet(f21251u);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Collections.addAll(treeSet, ((p005a4.f) it.next()).a());
        }
        return new a(new ArrayList(treeSet), z9, null, null);
    }

    public List b() {
        return this.f21252q;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f21253r == aVar.f21253r && AbstractC1201o.a(this.f21252q, aVar.f21252q) && AbstractC1201o.a(this.f21254s, aVar.f21254s) && AbstractC1201o.a(this.f21255t, aVar.f21255t);
    }

    public final int hashCode() {
        return AbstractC1201o.b(Boolean.valueOf(this.f21253r), this.f21252q, this.f21254s, this.f21255t);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iA = p035d4.c.a(parcel);
        p035d4.c.p(parcel, 1, b(), false);
        p035d4.c.c(parcel, 2, this.f21253r);
        p035d4.c.m(parcel, 3, this.f21254s, false);
        p035d4.c.m(parcel, 4, this.f21255t, false);
        p035d4.c.b(parcel, iA);
    }
}
