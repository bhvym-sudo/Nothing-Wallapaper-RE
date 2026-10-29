package I4;

import android.view.View;
import android.window.BackEvent;
import android.window.OnBackAnimationCallback;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;

/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final d f3045a = a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final I4.b f3046b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final View f3047c;

    private static class b implements d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private OnBackInvokedCallback f3048a;

        private b() {
        }

        @Override // I4.c.d
        public void a(View view) {
            OnBackInvokedDispatcher onBackInvokedDispatcherFindOnBackInvokedDispatcher = view.findOnBackInvokedDispatcher();
            if (onBackInvokedDispatcherFindOnBackInvokedDispatcher == null) {
                return;
            }
            onBackInvokedDispatcherFindOnBackInvokedDispatcher.unregisterOnBackInvokedCallback(this.f3048a);
            this.f3048a = null;
        }

        @Override // I4.c.d
        public void b(I4.b bVar, View view, boolean z9) {
            OnBackInvokedDispatcher onBackInvokedDispatcherFindOnBackInvokedDispatcher;
            if (this.f3048a == null && (onBackInvokedDispatcherFindOnBackInvokedDispatcher = view.findOnBackInvokedDispatcher()) != null) {
                OnBackInvokedCallback onBackInvokedCallbackC = c(bVar);
                this.f3048a = onBackInvokedCallbackC;
                onBackInvokedDispatcherFindOnBackInvokedDispatcher.registerOnBackInvokedCallback(z9 ? 1000000 : 0, onBackInvokedCallbackC);
            }
        }

        abstract OnBackInvokedCallback c(I4.b bVar);

        boolean d() {
            return this.f3048a != null;
        }
    }

    /* JADX INFO: renamed from: I4.c$c, reason: collision with other inner class name */
    private static class C0102c extends b {

        /* JADX INFO: renamed from: I4.c$c$a */
        class a implements OnBackAnimationCallback {

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            final /* synthetic */ I4.b f3049q;

            a(I4.b bVar) {
                this.f3049q = bVar;
            }

            @Override // android.window.OnBackAnimationCallback
            public void onBackCancelled() {
                if (C0102c.this.d()) {
                    this.f3049q.d();
                }
            }

            @Override // android.window.OnBackInvokedCallback
            public void onBackInvoked() {
                this.f3049q.b();
            }

            @Override // android.window.OnBackAnimationCallback
            public void onBackProgressed(BackEvent backEvent) {
                if (C0102c.this.d()) {
                    this.f3049q.a(new p010b.b(backEvent));
                }
            }

            @Override // android.window.OnBackAnimationCallback
            public void onBackStarted(BackEvent backEvent) {
                if (C0102c.this.d()) {
                    this.f3049q.c(new p010b.b(backEvent));
                }
            }
        }

        private C0102c() {
            super();
        }

        @Override // I4.c.b
        OnBackInvokedCallback c(I4.b bVar) {
            return new a(bVar);
        }
    }

    private interface d {
        void a(View view);

        void b(I4.b bVar, View view, boolean z9);
    }

    public c(I4.b bVar, View view) {
        this.f3046b = bVar;
        this.f3047c = view;
    }

    private static d a() {
        return new C0102c();
    }

    private void c(boolean z9) {
        d dVar = this.f3045a;
        if (dVar != null) {
            dVar.b(this.f3046b, this.f3047c, z9);
        }
    }

    public void b() {
        c(false);
    }

    public void d() {
        d dVar = this.f3045a;
        if (dVar != null) {
            dVar.a(this.f3047c);
        }
    }
}
