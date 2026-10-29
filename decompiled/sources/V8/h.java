package V8;

import P8.E;
import P8.x;
import kotlin.jvm.internal.n;

/* JADX INFO: loaded from: classes2.dex */
public final class h extends E {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final String f8247s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final long f8248t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final e9.g f8249u;

    public h(String str, long j9, e9.g source) {
        n.h(source, "source");
        this.f8247s = str;
        this.f8248t = j9;
        this.f8249u = source;
    }

    @Override // P8.E
    public long f() {
        return this.f8248t;
    }

    @Override // P8.E
    public x g() {
        String str = this.f8247s;
        if (str != null) {
            return x.f6400e.b(str);
        }
        return null;
    }

    @Override // P8.E
    public e9.g u() {
        return this.f8249u;
    }
}
