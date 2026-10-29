package J6;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import kotlin.jvm.internal.AbstractC1457h;
import kotlin.jvm.internal.n;
import p064g3.A;
import p064g3.r;
import p064g3.x;

/* JADX INFO: loaded from: classes2.dex */
public final class h extends r {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final a f3588i = new a(null);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static boolean f3589j;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final ExecutorService f3590h;

    public static final class a {
        public /* synthetic */ a(AbstractC1457h abstractC1457h) {
            this();
        }

        public final boolean a() {
            return h.f3589j;
        }

        public final void b(boolean z9) {
            h.f3589j = z9;
        }

        private a() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(String title, String collectionId, List wallpapers, int i10) {
        super(title, collectionId, wallpapers, i10);
        n.h(title, "title");
        n.h(collectionId, "collectionId");
        n.h(wallpapers, "wallpapers");
        this.f3590h = Executors.newCachedThreadPool();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void w(Context context, h hVar, final A a10) {
        i.a aVar = i.f3591F;
        String strB = hVar.b();
        n.g(strB, "getCollectionId(...)");
        final List listB = aVar.b(context, strB);
        Object mWallpapersLock = hVar.f21212d;
        n.g(mWallpapersLock, "mWallpapersLock");
        synchronized (mWallpapersLock) {
            hVar.p().clear();
            hVar.p().addAll(listB);
        }
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: J6.g
            @Override // java.lang.Runnable
            public final void run() {
                h.x(a10, listB);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void x(A a10, List list) {
        if (a10 != null) {
            a10.a(list);
        }
    }

    @Override // p064g3.AbstractC1356a
    public boolean n() {
        return true;
    }

    @Override // p064g3.r
    public void o(final Context context, final A a10, boolean z9) {
        if (!z9) {
            super.o(context, a10, false);
        } else if (context != null) {
            this.f3590h.execute(new Runnable() { // from class: J6.f
                @Override // java.lang.Runnable
                public final void run() {
                    h.w(context, this, a10);
                }
            });
        }
    }

    public final void v(List list) {
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                p().remove((x) it.next());
            }
        }
    }
}
