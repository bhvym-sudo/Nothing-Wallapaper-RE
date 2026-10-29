package I7;

import kotlin.jvm.internal.n;

/* JADX INFO: loaded from: classes2.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final f f3126a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final a f3127b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final c f3128c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final d f3129d;

    public b(f widgetStrategy, a clockStrategy, c shortcutStrategy, d wallpaperStrategy) {
        n.h(widgetStrategy, "widgetStrategy");
        n.h(clockStrategy, "clockStrategy");
        n.h(shortcutStrategy, "shortcutStrategy");
        n.h(wallpaperStrategy, "wallpaperStrategy");
        this.f3126a = widgetStrategy;
        this.f3127b = clockStrategy;
        this.f3128c = shortcutStrategy;
        this.f3129d = wallpaperStrategy;
    }

    public final boolean a() {
        return this.f3126a.c() || this.f3127b.a() || this.f3128c.a() || this.f3129d.h();
    }

    public final boolean b() {
        return this.f3129d.g();
    }

    public final void c() {
        this.f3126a.e();
        this.f3127b.b();
        this.f3128c.b();
        this.f3129d.i();
    }

    public final void d() {
        this.f3126a.h();
        this.f3127b.c();
        this.f3128c.c();
        this.f3129d.j();
    }
}
