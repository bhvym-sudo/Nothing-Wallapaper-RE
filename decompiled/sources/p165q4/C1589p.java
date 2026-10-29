package p165q4;

import U4.b;
import U4.c;
import U4.g;
import java.io.IOException;

/* JADX INFO: renamed from: q4.p, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
final class C1589p implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f24709a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f24710b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private c f24711c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final C1561l f24712d;

    C1589p(C1561l c1561l) {
        this.f24712d = c1561l;
    }

    private final void b() {
        if (this.f24709a) {
            throw new b("Cannot encode a second value in the ValueEncoderContext");
        }
        this.f24709a = true;
    }

    final void a(c cVar, boolean z9) {
        this.f24709a = false;
        this.f24711c = cVar;
        this.f24710b = z9;
    }

    @Override // U4.g
    public final g c(String str) throws IOException {
        b();
        this.f24712d.e(this.f24711c, str, this.f24710b);
        return this;
    }

    @Override // U4.g
    public final g d(boolean z9) throws IOException {
        b();
        this.f24712d.f(this.f24711c, z9 ? 1 : 0, this.f24710b);
        return this;
    }
}
