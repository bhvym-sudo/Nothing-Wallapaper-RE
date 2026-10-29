package p062g1;

import java.io.File;
import java.util.concurrent.Callable;
import kotlin.jvm.internal.n;
import p142o1.h;

/* JADX INFO: loaded from: classes.dex */
public final class v implements h.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f21136a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final File f21137b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Callable f21138c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final h.c f21139d;

    public v(String str, File file, Callable callable, h.c mDelegate) {
        n.h(mDelegate, "mDelegate");
        this.f21136a = str;
        this.f21137b = file;
        this.f21138c = callable;
        this.f21139d = mDelegate;
    }

    @Override // o1.h.c
    public h a(h.b configuration) {
        n.h(configuration, "configuration");
        return new u(configuration.f23340a, this.f21136a, this.f21137b, this.f21138c, configuration.f23342c.f23338a, this.f21139d.a(configuration));
    }
}
