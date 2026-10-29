package p101k0;

import kotlin.jvm.internal.AbstractC1457h;
import p111l0.u;
import p111l0.v;

/* JADX INFO: loaded from: classes.dex */
public final class l {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f22677c = new a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final l f22678d = new l(0, 0, 3, null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f22679a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f22680b;

    public static final class a {
        public /* synthetic */ a(AbstractC1457h abstractC1457h) {
            this();
        }

        private a() {
        }
    }

    public /* synthetic */ l(long j9, long j10, AbstractC1457h abstractC1457h) {
        this(j9, j10);
    }

    public final long a() {
        return this.f22679a;
    }

    public final long b() {
        return this.f22680b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return u.e(this.f22679a, lVar.f22679a) && u.e(this.f22680b, lVar.f22680b);
    }

    public int hashCode() {
        return (u.i(this.f22679a) * 31) + u.i(this.f22680b);
    }

    public String toString() {
        return "TextIndent(firstLine=" + ((Object) u.j(this.f22679a)) + ", restLine=" + ((Object) u.j(this.f22680b)) + ')';
    }

    private l(long j9, long j10) {
        this.f22679a = j9;
        this.f22680b = j10;
    }

    public /* synthetic */ l(long j9, long j10, int i10, AbstractC1457h abstractC1457h) {
        this((i10 & 1) != 0 ? v.b(0) : j9, (i10 & 2) != 0 ? v.b(0) : j10, null);
    }
}
