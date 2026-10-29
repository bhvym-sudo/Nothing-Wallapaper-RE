package p242y1;

import K1.q;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import androidx.lifecycle.C;
import com.nothing.wallpaper.R;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import p074h3.I;
import p222w1.a;

/* JADX INFO: loaded from: classes.dex */
public class e implements a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final ExecutorService f30167d = Executors.newSingleThreadExecutor();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static e f30168e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final j f30169a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final q f30170b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f30171c = -1;

    e(j jVar, q qVar) {
        this.f30169a = jVar;
        this.f30170b = qVar;
    }

    public static /* synthetic */ void b(a.b bVar, List list) {
        if (bVar != null) {
            if (list == null || list.isEmpty()) {
                bVar.a(null);
            } else {
                bVar.b(list);
            }
        }
    }

    public static e f(Context context) {
        if (f30168e == null) {
            Context applicationContext = context.getApplicationContext();
            f30168e = new e(new j(applicationContext, applicationContext.getString(R.string.grid_control_metadata_name)), (q) ((K1.a) I.a()).q(applicationContext));
        }
        return f30168e;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void j(boolean z9, final a.b bVar) {
        final List listC = this.f30169a.c(z9);
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: y1.d
            @Override // java.lang.Runnable
            public final void run() {
                e.b(bVar, listC);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Integer k() {
        List listC = this.f30169a.c(true);
        return Integer.valueOf(listC == null ? 0 : listC.size());
    }

    public void d(a aVar, a.InterfaceC0718a interfaceC0718a) {
        if (this.f30169a.a(aVar.f30156u) != 1) {
            interfaceC0718a.a(null);
        } else {
            this.f30170b.l(aVar);
            interfaceC0718a.b();
        }
    }

    public void e(final a.b bVar, final boolean z9) {
        f30167d.submit(new Runnable() { // from class: y1.c
            @Override // java.lang.Runnable
            public final void run() {
                this.f30162q.j(z9, bVar);
            }
        });
    }

    public C g(Handler handler) {
        return this.f30169a.d(handler);
    }

    public boolean h() {
        if (this.f30171c < 0) {
            try {
                this.f30171c = ((Integer) f30167d.submit(new Callable() { // from class: y1.b
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        return this.f30161a.k();
                    }
                }).get()).intValue();
            } catch (InterruptedException | ExecutionException e10) {
                Log.w("GridOptionsManager", "could not get gridOptionSize", e10);
            }
        }
        return this.f30171c > 1 && this.f30169a.b();
    }

    public boolean i() {
        return this.f30169a.b();
    }
}
