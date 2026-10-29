package p107k6;

import android.os.Handler;
import android.os.Looper;
import com.nothing.wallpaper.common.log.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC1457h;
import kotlin.jvm.internal.n;
import p079h8.A;
import p219v8.l;

/* JADX INFO: loaded from: classes2.dex */
public abstract class e {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final a f22753g = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private volatile long f22754a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private volatile boolean f22755b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Object f22756c = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final List f22757d = new ArrayList();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Handler f22758e = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Runnable f22759f = new Runnable() { // from class: k6.d
        @Override // java.lang.Runnable
        public final void run() {
            e.b(this.f22752q);
        }
    };

    public static final class a {
        public /* synthetic */ a(AbstractC1457h abstractC1457h) {
            this();
        }

        private a() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(e eVar) {
        eVar.f22755b = false;
        if (System.currentTimeMillis() - eVar.f22754a >= eVar.f()) {
            eVar.c();
        } else {
            eVar.n();
        }
    }

    private final void n() {
        if (this.f22755b) {
            return;
        }
        synchronized (this.f22756c) {
            try {
                if (this.f22755b) {
                    return;
                }
                if (!this.f22757d.isEmpty()) {
                    this.f22755b = true;
                    this.f22758e.postDelayed(this.f22759f, f());
                }
                A a10 = A.f21846a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void c() {
        synchronized (this.f22756c) {
            try {
                Iterator it = this.f22757d.iterator();
                while (it.hasNext()) {
                    j(it.next());
                }
                this.f22757d.clear();
                A a10 = A.f21846a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void d() {
        synchronized (this.f22756c) {
            this.f22758e.removeCallbacks(this.f22759f);
            A a10 = A.f21846a;
        }
        c();
    }

    protected final Object e(l predicateLocked) {
        n.h(predicateLocked, "predicateLocked");
        this.f22754a = System.currentTimeMillis();
        synchronized (this.f22756c) {
            Iterator it = this.f22757d.iterator();
            while (it.hasNext()) {
                Object next = it.next();
                if (((Boolean) predicateLocked.f(next)).booleanValue()) {
                    it.remove();
                    c.d("SimpledObjectPool", h() + " get " + next + ".");
                    return next;
                }
            }
            A a10 = A.f21846a;
            c.d("SimpledObjectPool", h() + " get nothing.");
            return null;
        }
    }

    public abstract long f();

    public abstract int g();

    protected abstract String h();

    protected abstract boolean i(Object obj);

    protected void j(Object obj) {
    }

    protected void k(Object obj) {
    }

    protected void l(Object obj) {
    }

    public final void m(Object obj) {
        this.f22754a = System.currentTimeMillis();
        if (!i(obj)) {
            c.d("SimpledObjectPool", h() + " can't recycle " + obj + ".");
            return;
        }
        synchronized (this.f22756c) {
            if (this.f22757d.size() == g()) {
                k(obj);
                c.d("SimpledObjectPool", h() + " can't recycle " + obj + " cause capacity to maximum.");
                return;
            }
            this.f22757d.add(obj);
            l(obj);
            c.d("SimpledObjectPool", h() + " " + obj + " successful recycling.");
            A a10 = A.f21846a;
            n();
        }
    }
}
