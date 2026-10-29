package p175r4;

import U4.b;
import U4.c;
import U4.g;
import java.io.IOException;

/* JADX INFO: renamed from: r4.m0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
final class C1850m0 implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f26818a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f26819b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private c f26820c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final C1808i0 f26821d;

    C1850m0(C1808i0 c1808i0) {
        this.f26821d = c1808i0;
    }

    private final void b() {
        if (this.f26818a) {
            throw new b("Cannot encode a second value in the ValueEncoderContext");
        }
        this.f26818a = true;
    }

    final void a(c cVar, boolean z9) {
        this.f26818a = false;
        this.f26820c = cVar;
        this.f26819b = z9;
    }

    @Override // U4.g
    public final g c(String str) throws IOException {
        b();
        this.f26821d.e(this.f26820c, str, this.f26819b);
        return this;
    }

    @Override // U4.g
    public final g d(boolean z9) throws IOException {
        b();
        this.f26821d.f(this.f26820c, z9 ? 1 : 0, this.f26819b);
        return this;
    }
}
