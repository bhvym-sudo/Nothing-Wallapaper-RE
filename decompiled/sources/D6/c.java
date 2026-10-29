package D6;

import F8.AbstractC0816i;
import F8.C0803b0;
import F8.L;
import F8.M;
import F8.T0;
import I8.A;
import I8.InterfaceC0880f;
import I8.Q;
import android.app.WallpaperColors;
import android.content.Context;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import p064g3.x;

/* JADX INFO: loaded from: classes2.dex */
public final class c implements f {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final p167q6.b f1032q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final L f1033r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final Future f1034s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final A f1035t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final InterfaceC0880f f1036u;

    static final class a extends kotlin.coroutines.jvm.internal.l implements p219v8.p {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f1037q;

        a(p129m8.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final p129m8.e create(Object obj, p129m8.e eVar) {
            return c.this.new a(eVar);
        }

        @Override // p219v8.p
        public final Object invoke(L l9, p129m8.e eVar) {
            return ((a) create(l9, eVar)).invokeSuspend(p079h8.A.f21846a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            p139n8.b.e();
            if (this.f1037q != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p079h8.r.b(obj);
            try {
                WallpaperColors wallpaperColorsB = ((x.a) c.this.f1034s.get(10L, TimeUnit.SECONDS)).b();
                c cVar = c.this;
                cVar.f1035t.setValue(wallpaperColorsB);
                p167q6.b bVar = cVar.f1032q;
                kotlin.jvm.internal.n.e(wallpaperColorsB);
                bVar.a("Get init colors after future done. isEmpty=" + G6.h.d(wallpaperColorsB));
            } catch (InterruptedException unused) {
                c.this.f1032q.e("Get init colors failure cause future was interrupted.");
            } catch (CancellationException unused2) {
                c.this.f1032q.e("Get init colors failure cause future was cancellation.");
            } catch (TimeoutException unused3) {
                c.this.f1032q.e("Get init colors failure cause timeout after 10 s.");
            }
            return p079h8.A.f21846a;
        }
    }

    public c(Context appContext, x wallpaper) {
        kotlin.jvm.internal.n.h(appContext, "appContext");
        kotlin.jvm.internal.n.h(wallpaper, "wallpaper");
        this.f1032q = new p167q6.b(this);
        L lA = M.a(T0.b(null, 1, null).z(C0803b0.b()));
        this.f1033r = lA;
        this.f1034s = wallpaper.b(appContext);
        A a10 = Q.a(G6.h.a());
        this.f1035t = a10;
        this.f1036u = a10;
        AbstractC0816i.d(lA, null, null, new a(null), 3, null);
    }

    @Override // D6.f
    public InterfaceC0880f S() {
        return this.f1036u;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        M.d(this.f1033r, null, 1, null);
        this.f1034s.cancel(true);
    }
}
