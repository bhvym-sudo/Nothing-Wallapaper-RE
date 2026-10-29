package g9;

import P8.D;
import P8.E;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class x<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final D f21542a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Object f21543b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final E f21544c;

    private x(D d10, Object obj, E e10) {
        this.f21542a = d10;
        this.f21543b = obj;
        this.f21544c = e10;
    }

    public static x c(E e10, D d10) {
        Objects.requireNonNull(e10, "body == null");
        Objects.requireNonNull(d10, "rawResponse == null");
        if (d10.isSuccessful()) {
            throw new IllegalArgumentException("rawResponse should not be successful response");
        }
        return new x(d10, null, e10);
    }

    public static x f(Object obj, D d10) {
        Objects.requireNonNull(d10, "rawResponse == null");
        if (d10.isSuccessful()) {
            return new x(d10, obj, null);
        }
        throw new IllegalArgumentException("rawResponse must be successful response");
    }

    public Object a() {
        return this.f21543b;
    }

    public int b() {
        return this.f21542a.j();
    }

    public boolean d() {
        return this.f21542a.isSuccessful();
    }

    public String e() {
        return this.f21542a.K();
    }

    public String toString() {
        return this.f21542a.toString();
    }
}
