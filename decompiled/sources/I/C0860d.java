package I;

import android.content.ComponentCallbacks2;
import android.view.View;
import android.view.ViewGroup;
import kotlin.jvm.internal.AbstractC1457h;

/* JADX INFO: renamed from: I.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
final class C0860d implements y {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f2691d = new a(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static boolean f2692e = true;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ViewGroup f2693a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Object f2694b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ComponentCallbacks2 f2695c = null;

    /* JADX INFO: renamed from: I.d$a */
    public static final class a {
        public /* synthetic */ a(AbstractC1457h abstractC1457h) {
            this();
        }

        private a() {
        }
    }

    /* JADX INFO: renamed from: I.d$b */
    private static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f2696a = new b();

        private b() {
        }

        public static final long a(View view) {
            return view.getUniqueDrawingId();
        }
    }

    public C0860d(ViewGroup viewGroup) {
        this.f2693a = viewGroup;
    }

    private final long c(View view) {
        return b.a(view);
    }

    @Override // I.y
    public void a(L.c cVar) {
        synchronized (this.f2694b) {
            cVar.H();
            p079h8.A a10 = p079h8.A.f21846a;
        }
    }

    @Override // I.y
    public L.c b() {
        L.c cVar;
        synchronized (this.f2694b) {
            cVar = new L.c(new L.e(c(this.f2693a), null, null, 6, null), null);
        }
        return cVar;
    }
}
