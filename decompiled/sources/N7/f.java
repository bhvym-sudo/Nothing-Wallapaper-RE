package N7;

import F8.InterfaceC0807d0;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.RemoteCallback;
import androidx.lifecycle.AbstractC1157q;
import androidx.lifecycle.InterfaceC1160u;
import androidx.lifecycle.InterfaceC1163x;
import kotlin.jvm.internal.A;
import kotlin.jvm.internal.E;
import kotlin.jvm.internal.n;
import p079h8.h;
import p079h8.i;
import p079h8.o;
import p219v8.l;

/* JADX INFO: loaded from: classes2.dex */
public abstract class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final h f5393a = i.b(new p219v8.a() { // from class: N7.d
        @Override // p219v8.a
        public final Object invoke() {
            return f.n();
        }
    });

    public static final class a implements InterfaceC1160u {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        final /* synthetic */ A f5394q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ AbstractC1157q f5395r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        final /* synthetic */ E f5396s;

        a(A a10, AbstractC1157q abstractC1157q, E e10) {
            this.f5394q = a10;
            this.f5395r = abstractC1157q;
            this.f5396s = e10;
        }

        @Override // androidx.lifecycle.InterfaceC1160u
        public void onStateChanged(InterfaceC1163x source, AbstractC1157q.a event) {
            n.h(source, "source");
            n.h(event, "event");
            A a10 = this.f5394q;
            if (a10.f22775q) {
                this.f5395r.d(this);
            } else if (event == AbstractC1157q.a.ON_DESTROY) {
                f.h(this.f5396s, a10, "lifecycle");
            }
        }
    }

    public static final o g(final AbstractC1157q lifecycle, l onFrame) {
        n.h(lifecycle, "lifecycle");
        n.h(onFrame, "onFrame");
        final E e10 = new E();
        e10.f22779q = onFrame;
        final A a10 = new A();
        final a aVar = new a(a10, lifecycle, e10);
        InterfaceC0807d0 interfaceC0807d0 = new InterfaceC0807d0() { // from class: N7.a
            @Override // F8.InterfaceC0807d0
            public final void dispose() {
                f.i(a10, lifecycle, aVar, e10);
            }
        };
        o(new Runnable() { // from class: N7.b
            @Override // java.lang.Runnable
            public final void run() {
                f.k(lifecycle, aVar);
            }
        });
        return new o(interfaceC0807d0, new RemoteCallback(new RemoteCallback.OnResultListener() { // from class: N7.c
            public final void onResult(Bundle bundle) {
                f.l(e10, bundle);
            }
        }, m()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void h(E e10, A a10, String str) {
        com.nothing.wallpaper.common.log.c.k("BuildFrameCallback", "dispose onFrameCallback by " + str + ".");
        e10.f22779q = null;
        a10.f22775q = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i(A a10, final AbstractC1157q abstractC1157q, final a aVar, E e10) {
        if (a10.f22775q) {
            return;
        }
        o(new Runnable() { // from class: N7.e
            @Override // java.lang.Runnable
            public final void run() {
                f.j(abstractC1157q, aVar);
            }
        });
        h(e10, a10, "handle");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void j(AbstractC1157q abstractC1157q, a aVar) {
        abstractC1157q.d(aVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void k(AbstractC1157q abstractC1157q, a aVar) {
        abstractC1157q.a(aVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void l(E e10, Bundle bundle) {
        if (((l) e10.f22779q) == null) {
            return;
        }
        IBinder binder = bundle != null ? bundle.getBinder("frame_bitmap_fetcher") : null;
        if (binder == null) {
            com.nothing.wallpaper.common.log.c.o("BuildFrameCallback", "frame_bitmap_fetcher didn't received.");
            return;
        }
        p097j6.f fVarA = j6.f.a.a(binder);
        com.nothing.wallpaper.common.log.c.k("BuildFrameCallback", "send bitmap to onFrame.");
        l lVar = (l) e10.f22779q;
        if (lVar != null) {
            Bitmap bitmap = fVarA.get();
            n.g(bitmap, "get(...)");
            lVar.f(bitmap);
        }
    }

    private static final Handler m() {
        return (Handler) f5393a.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Handler n() {
        return new Handler(Looper.getMainLooper());
    }

    private static final void o(Runnable runnable) {
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            runnable.run();
        } else {
            m().post(runnable);
        }
    }
}
