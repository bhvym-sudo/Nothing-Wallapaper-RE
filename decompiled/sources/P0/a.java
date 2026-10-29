package P0;

import android.os.SystemClock;
import android.view.Choreographer;
import androidx.collection.P;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
class a {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final ThreadLocal f5967g = new ThreadLocal();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private c f5971d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final P f5968a = new P();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final ArrayList f5969b = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final C0201a f5970c = new C0201a();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    long f5972e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f5973f = false;

    /* JADX INFO: renamed from: P0.a$a, reason: collision with other inner class name */
    class C0201a {
        C0201a() {
        }

        void a() {
            a.this.f5972e = SystemClock.uptimeMillis();
            a aVar = a.this;
            aVar.c(aVar.f5972e);
            if (a.this.f5969b.size() > 0) {
                a.this.e().a();
            }
        }
    }

    interface b {
        boolean doAnimationFrame(long j9);
    }

    static abstract class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final C0201a f5975a;

        c(C0201a c0201a) {
            this.f5975a = c0201a;
        }

        abstract void a();
    }

    private static class d extends c {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Choreographer f5976b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Choreographer.FrameCallback f5977c;

        /* JADX INFO: renamed from: P0.a$d$a, reason: collision with other inner class name */
        class ChoreographerFrameCallbackC0202a implements Choreographer.FrameCallback {
            ChoreographerFrameCallbackC0202a() {
            }

            @Override // android.view.Choreographer.FrameCallback
            public void doFrame(long j9) {
                d.this.f5975a.a();
            }
        }

        d(C0201a c0201a) {
            super(c0201a);
            this.f5976b = Choreographer.getInstance();
            this.f5977c = new ChoreographerFrameCallbackC0202a();
        }

        @Override // P0.a.c
        void a() {
            this.f5976b.postFrameCallback(this.f5977c);
        }
    }

    a() {
    }

    private void b() {
        if (this.f5973f) {
            for (int size = this.f5969b.size() - 1; size >= 0; size--) {
                if (this.f5969b.get(size) == null) {
                    this.f5969b.remove(size);
                }
            }
            this.f5973f = false;
        }
    }

    public static a d() {
        ThreadLocal threadLocal = f5967g;
        if (threadLocal.get() == null) {
            threadLocal.set(new a());
        }
        return (a) threadLocal.get();
    }

    private boolean f(b bVar, long j9) {
        Long l9 = (Long) this.f5968a.get(bVar);
        if (l9 == null) {
            return true;
        }
        if (l9.longValue() >= j9) {
            return false;
        }
        this.f5968a.remove(bVar);
        return true;
    }

    public void a(b bVar, long j9) {
        if (this.f5969b.size() == 0) {
            e().a();
        }
        if (!this.f5969b.contains(bVar)) {
            this.f5969b.add(bVar);
        }
        if (j9 > 0) {
            this.f5968a.put(bVar, Long.valueOf(SystemClock.uptimeMillis() + j9));
        }
    }

    void c(long j9) {
        long jUptimeMillis = SystemClock.uptimeMillis();
        for (int i10 = 0; i10 < this.f5969b.size(); i10++) {
            b bVar = (b) this.f5969b.get(i10);
            if (bVar != null && f(bVar, jUptimeMillis)) {
                bVar.doAnimationFrame(j9);
            }
        }
        b();
    }

    c e() {
        if (this.f5971d == null) {
            this.f5971d = new d(this.f5970c);
        }
        return this.f5971d;
    }

    public void g(b bVar) {
        this.f5968a.remove(bVar);
        int iIndexOf = this.f5969b.indexOf(bVar);
        if (iIndexOf >= 0) {
            this.f5969b.set(iIndexOf, null);
            this.f5973f = true;
        }
    }
}
