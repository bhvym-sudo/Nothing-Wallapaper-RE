package X8;

import kotlin.jvm.internal.AbstractC1457h;

/* JADX INFO: loaded from: classes2.dex */
public final class c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f9040d = new a(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final e9.h f9041e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final e9.h f9042f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final e9.h f9043g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final e9.h f9044h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final e9.h f9045i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final e9.h f9046j;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e9.h f9047a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e9.h f9048b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f9049c;

    public static final class a {
        public /* synthetic */ a(AbstractC1457h abstractC1457h) {
            this();
        }

        private a() {
        }
    }

    static {
        e9.h.a aVar = e9.h.f20267t;
        f9041e = aVar.c(":");
        f9042f = aVar.c(":status");
        f9043g = aVar.c(":method");
        f9044h = aVar.c(":path");
        f9045i = aVar.c(":scheme");
        f9046j = aVar.c(":authority");
    }

    public c(e9.h name, e9.h value) {
        kotlin.jvm.internal.n.h(name, "name");
        kotlin.jvm.internal.n.h(value, "value");
        this.f9047a = name;
        this.f9048b = value;
        this.f9049c = name.v() + 32 + value.v();
    }

    public final e9.h a() {
        return this.f9047a;
    }

    public final e9.h b() {
        return this.f9048b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return kotlin.jvm.internal.n.d(this.f9047a, cVar.f9047a) && kotlin.jvm.internal.n.d(this.f9048b, cVar.f9048b);
    }

    public int hashCode() {
        return (this.f9047a.hashCode() * 31) + this.f9048b.hashCode();
    }

    public String toString() {
        return this.f9047a.y() + ": " + this.f9048b.y();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public c(String name, String value) {
        kotlin.jvm.internal.n.h(name, "name");
        kotlin.jvm.internal.n.h(value, "value");
        e9.h.a aVar = e9.h.f20267t;
        this(aVar.c(name), aVar.c(value));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public c(e9.h name, String value) {
        this(name, e9.h.f20267t.c(value));
        kotlin.jvm.internal.n.h(name, "name");
        kotlin.jvm.internal.n.h(value, "value");
    }
}
