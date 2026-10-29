package M8;

import F8.I;
import K8.AbstractC0919l;

/* JADX INFO: loaded from: classes2.dex */
public final class c extends f {

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final c f5154y = new c();

    private c() {
        super(j.f5166c, j.f5167d, j.f5168e, j.f5164a);
    }

    @Override // F8.AbstractC0829o0, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        throw new UnsupportedOperationException("Dispatchers.Default cannot be closed");
    }

    @Override // F8.I
    public I j1(int i10, String str) {
        AbstractC0919l.a(i10);
        return i10 >= j.f5166c ? AbstractC0919l.b(this, str) : super.j1(i10, str);
    }

    @Override // F8.I
    public String toString() {
        return "Dispatchers.Default";
    }
}
