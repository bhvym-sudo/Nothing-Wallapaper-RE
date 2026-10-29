package com.google.android.material.snackbar;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
class c {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static c f17245e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f17246a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Handler f17247b = new Handler(Looper.getMainLooper(), new a());

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private C0463c f17248c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private C0463c f17249d;

    class a implements Handler.Callback {
        a() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            if (message.what != 0) {
                return false;
            }
            c.this.d((C0463c) message.obj);
            return true;
        }
    }

    interface b {
        void b();

        void c(int i10);
    }

    /* JADX INFO: renamed from: com.google.android.material.snackbar.c$c, reason: collision with other inner class name */
    private static class C0463c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final WeakReference f17251a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f17252b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        boolean f17253c;

        C0463c(int i10, b bVar) {
            this.f17251a = new WeakReference(bVar);
            this.f17252b = i10;
        }

        boolean a(b bVar) {
            return bVar != null && this.f17251a.get() == bVar;
        }
    }

    private c() {
    }

    private boolean a(C0463c c0463c, int i10) {
        b bVar = (b) c0463c.f17251a.get();
        if (bVar == null) {
            return false;
        }
        this.f17247b.removeCallbacksAndMessages(c0463c);
        bVar.c(i10);
        return true;
    }

    static c c() {
        if (f17245e == null) {
            f17245e = new c();
        }
        return f17245e;
    }

    private boolean f(b bVar) {
        C0463c c0463c = this.f17248c;
        return c0463c != null && c0463c.a(bVar);
    }

    private boolean g(b bVar) {
        C0463c c0463c = this.f17249d;
        return c0463c != null && c0463c.a(bVar);
    }

    private void l(C0463c c0463c) {
        int i10 = c0463c.f17252b;
        if (i10 == -2) {
            return;
        }
        if (i10 <= 0) {
            i10 = i10 == -1 ? 1500 : 2750;
        }
        this.f17247b.removeCallbacksAndMessages(c0463c);
        Handler handler = this.f17247b;
        handler.sendMessageDelayed(Message.obtain(handler, 0, c0463c), i10);
    }

    private void n() {
        C0463c c0463c = this.f17249d;
        if (c0463c != null) {
            this.f17248c = c0463c;
            this.f17249d = null;
            b bVar = (b) c0463c.f17251a.get();
            if (bVar != null) {
                bVar.b();
            } else {
                this.f17248c = null;
            }
        }
    }

    public void b(b bVar, int i10) {
        synchronized (this.f17246a) {
            try {
                if (f(bVar)) {
                    a(this.f17248c, i10);
                } else if (g(bVar)) {
                    a(this.f17249d, i10);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    void d(C0463c c0463c) {
        synchronized (this.f17246a) {
            try {
                if (this.f17248c == c0463c || this.f17249d == c0463c) {
                    a(c0463c, 2);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public boolean e(b bVar) {
        boolean z9;
        synchronized (this.f17246a) {
            try {
                z9 = f(bVar) || g(bVar);
            } catch (Throwable th) {
                throw th;
            }
        }
        return z9;
    }

    public void h(b bVar) {
        synchronized (this.f17246a) {
            try {
                if (f(bVar)) {
                    this.f17248c = null;
                    if (this.f17249d != null) {
                        n();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void i(b bVar) {
        synchronized (this.f17246a) {
            try {
                if (f(bVar)) {
                    l(this.f17248c);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void j(b bVar) {
        synchronized (this.f17246a) {
            try {
                if (f(bVar)) {
                    C0463c c0463c = this.f17248c;
                    if (!c0463c.f17253c) {
                        c0463c.f17253c = true;
                        this.f17247b.removeCallbacksAndMessages(c0463c);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void k(b bVar) {
        synchronized (this.f17246a) {
            try {
                if (f(bVar)) {
                    C0463c c0463c = this.f17248c;
                    if (c0463c.f17253c) {
                        c0463c.f17253c = false;
                        l(c0463c);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void m(int i10, b bVar) {
        synchronized (this.f17246a) {
            try {
                if (f(bVar)) {
                    C0463c c0463c = this.f17248c;
                    c0463c.f17252b = i10;
                    this.f17247b.removeCallbacksAndMessages(c0463c);
                    l(this.f17248c);
                    return;
                }
                if (g(bVar)) {
                    this.f17249d.f17252b = i10;
                } else {
                    this.f17249d = new C0463c(i10, bVar);
                }
                C0463c c0463c2 = this.f17248c;
                if (c0463c2 == null || !a(c0463c2, 4)) {
                    this.f17248c = null;
                    n();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
