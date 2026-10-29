package p208u7;

import java.util.Arrays;
import kotlin.jvm.internal.AbstractC1457h;
import kotlin.jvm.internal.n;

/* JADX INFO: loaded from: classes2.dex */
public final class c {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f28037e = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f28038a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f28039b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f28040c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final byte[] f28041d;

    public static final class a {
        public /* synthetic */ a(AbstractC1457h abstractC1457h) {
            this();
        }

        private a() {
        }
    }

    public c(String name, int i10, int i11, byte[] bArr) {
        n.h(name, "name");
        this.f28038a = name;
        this.f28039b = i10;
        this.f28040c = i11;
        this.f28041d = bArr;
    }

    public final byte[] a() {
        return this.f28041d;
    }

    public final int b() {
        return this.f28039b;
    }

    public final boolean c() {
        return !n.d(this.f28038a, "Unknown");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return n.d(this.f28038a, cVar.f28038a) && this.f28039b == cVar.f28039b && this.f28040c == cVar.f28040c && n.d(this.f28041d, cVar.f28041d);
    }

    public int hashCode() {
        int iHashCode = ((((this.f28038a.hashCode() * 31) + Integer.hashCode(this.f28039b)) * 31) + Integer.hashCode(this.f28040c)) * 31;
        byte[] bArr = this.f28041d;
        return iHashCode + (bArr == null ? 0 : Arrays.hashCode(bArr));
    }

    public String toString() {
        return "PickedIconPack(name=" + this.f28038a + ", iconResId=" + this.f28039b + ", tintColorResId=" + this.f28040c + ", blob=" + Arrays.toString(this.f28041d) + ")";
    }
}
