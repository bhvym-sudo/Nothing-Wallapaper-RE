package p064g3;

import I8.A;
import I8.AbstractC0882h;
import I8.O;
import I8.Q;
import android.app.WallpaperColors;
import androidx.lifecycle.C;
import androidx.lifecycle.H;
import kotlin.jvm.internal.n;
import p079h8.h;
import p079h8.i;
import p219v8.a;

/* JADX INFO: loaded from: classes.dex */
public final class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final h f21225a = i.b(new a() { // from class: g3.t
        @Override // p219v8.a
        public final Object invoke() {
            return v.c();
        }
    });

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C f21226b = g();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final h f21227c = i.b(new a() { // from class: g3.u
        @Override // p219v8.a
        public final Object invoke() {
            return v.d();
        }
    });

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final C f21228d = h();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final A f21229e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final O f21230f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final A f21231g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final O f21232h;

    public v() {
        s.b bVar = s.b.f21224a;
        A a10 = Q.a(bVar);
        this.f21229e = a10;
        this.f21230f = AbstractC0882h.b(a10);
        A a11 = Q.a(bVar);
        this.f21231g = a11;
        this.f21232h = AbstractC0882h.b(a11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final H c() {
        return new H();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final H d() {
        return new H();
    }

    private final H g() {
        return (H) this.f21225a.getValue();
    }

    private final H h() {
        return (H) this.f21227c.getValue();
    }

    public final O e() {
        return this.f21230f;
    }

    public final O f() {
        return this.f21232h;
    }

    public final void i(WallpaperColors wallpaperColors) {
        this.f21229e.setValue(new s.a(wallpaperColors));
        if (n.d(wallpaperColors, g().e())) {
            return;
        }
        g().n(wallpaperColors);
    }

    public final void j(WallpaperColors wallpaperColors) {
        this.f21231g.setValue(new s.a(wallpaperColors));
        if (n.d(wallpaperColors, h().e())) {
            return;
        }
        h().n(wallpaperColors);
    }
}
