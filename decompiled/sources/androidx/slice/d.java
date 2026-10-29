package androidx.slice;

import android.content.Context;
import android.database.ContentObserver;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Handler;
import android.os.Looper;
import android.util.ArrayMap;
import android.util.Pair;
import androidx.slice.widget.g;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public abstract class d extends c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ArrayMap f13705a = new ArrayMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected final Context f13706b;

    class a implements Executor {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        final /* synthetic */ Handler f13707q;

        a(Handler handler) {
            this.f13707q = handler;
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            this.f13707q.post(runnable);
        }
    }

    private class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Uri f13709a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final Executor f13710b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final c.a f13711c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private boolean f13712d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final Runnable f13713e = new a();

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final ContentObserver f13714f = new C0413b(new Handler(Looper.getMainLooper()));

        class a implements Runnable {

            /* JADX INFO: renamed from: androidx.slice.d$b$a$a, reason: collision with other inner class name */
            class RunnableC0412a implements Runnable {

                /* JADX INFO: renamed from: q, reason: collision with root package name */
                final /* synthetic */ Slice f13717q;

                RunnableC0412a(Slice slice) {
                    this.f13717q = slice;
                }

                @Override // java.lang.Runnable
                public void run() {
                    b.this.f13711c.a(this.f13717q);
                }
            }

            a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                b.this.c();
                b bVar = b.this;
                b.this.f13710b.execute(new RunnableC0412a(Slice.b(d.this.f13706b, bVar.f13709a, g.f13981c)));
            }
        }

        /* JADX INFO: renamed from: androidx.slice.d$b$b, reason: collision with other inner class name */
        class C0413b extends ContentObserver {
            C0413b(Handler handler) {
                super(handler);
            }

            @Override // android.database.ContentObserver
            public void onChange(boolean z9) {
                AsyncTask.execute(b.this.f13713e);
            }
        }

        b(Uri uri, Executor executor, c.a aVar) {
            this.f13709a = uri;
            this.f13710b = executor;
            this.f13711c = aVar;
        }

        void a() {
            d.this.f13706b.getContentResolver().registerContentObserver(this.f13709a, true, this.f13714f);
            c();
        }

        void b() {
            d.this.f13706b.getContentResolver().unregisterContentObserver(this.f13714f);
            if (this.f13712d) {
                d.this.f(this.f13709a);
                this.f13712d = false;
            }
        }

        void c() {
            if (this.f13712d) {
                return;
            }
            try {
                d.this.d(this.f13709a);
                this.f13712d = true;
            } catch (SecurityException unused) {
            }
        }
    }

    d(Context context) {
        this.f13706b = context;
    }

    private b h(Uri uri, c.a aVar, b bVar) {
        Pair pair = new Pair(uri, aVar);
        synchronized (this.f13705a) {
            try {
                if (this.f13705a.containsKey(pair)) {
                    ((b) this.f13705a.get(pair)).b();
                }
                this.f13705a.put(pair, bVar);
            } catch (Throwable th) {
                throw th;
            }
        }
        return bVar;
    }

    @Override // androidx.slice.c
    public void e(Uri uri, c.a aVar) {
        i(uri, new a(new Handler(Looper.getMainLooper())), aVar);
    }

    @Override // androidx.slice.c
    public void g(Uri uri, c.a aVar) {
        synchronized (this.f13705a) {
            try {
                b bVar = (b) this.f13705a.remove(new Pair(uri, aVar));
                if (bVar != null) {
                    bVar.b();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void i(Uri uri, Executor executor, c.a aVar) {
        h(uri, aVar, new b(uri, executor, aVar)).a();
    }
}
