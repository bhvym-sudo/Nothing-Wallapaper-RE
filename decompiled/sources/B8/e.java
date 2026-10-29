package B8;

import kotlin.jvm.internal.AbstractC1457h;
import p089i8.L;

/* JADX INFO: loaded from: classes2.dex */
public class e implements Iterable, p229w8.a {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final a f432t = new a(null);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final int f433q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final int f434r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final int f435s;

    public static final class a {
        public /* synthetic */ a(AbstractC1457h abstractC1457h) {
            this();
        }

        public final e a(int i10, int i11, int i12) {
            return new e(i10, i11, i12);
        }

        private a() {
        }
    }

    public e(int i10, int i11, int i12) {
        if (i12 == 0) {
            throw new IllegalArgumentException("Step must be non-zero.");
        }
        if (i12 == Integer.MIN_VALUE) {
            throw new IllegalArgumentException("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
        }
        this.f433q = i10;
        this.f434r = p159p8.c.b(i10, i11, i12);
        this.f435s = i12;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof e)) {
            return false;
        }
        if (isEmpty() && ((e) obj).isEmpty()) {
            return true;
        }
        e eVar = (e) obj;
        return this.f433q == eVar.f433q && this.f434r == eVar.f434r && this.f435s == eVar.f435s;
    }

    public final int g() {
        return this.f433q;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (((this.f433q * 31) + this.f434r) * 31) + this.f435s;
    }

    public boolean isEmpty() {
        if (this.f435s > 0) {
            return this.f433q > this.f434r;
        }
        return this.f433q < this.f434r;
    }

    public final int m() {
        return this.f434r;
    }

    public final int n() {
        return this.f435s;
    }

    @Override // java.lang.Iterable
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public L iterator() {
        return new f(this.f433q, this.f434r, this.f435s);
    }

    public String toString() {
        StringBuilder sb;
        int i10;
        if (this.f435s > 0) {
            sb = new StringBuilder();
            sb.append(this.f433q);
            sb.append("..");
            sb.append(this.f434r);
            sb.append(" step ");
            i10 = this.f435s;
        } else {
            sb = new StringBuilder();
            sb.append(this.f433q);
            sb.append(" downTo ");
            sb.append(this.f434r);
            sb.append(" step ");
            i10 = -this.f435s;
        }
        sb.append(i10);
        return sb.toString();
    }
}
