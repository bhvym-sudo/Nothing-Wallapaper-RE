package G5;

import F8.AbstractC0816i;
import F8.C0803b0;
import F8.L;
import F8.M;
import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.provider.Settings;
import android.util.Log;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.n;
import p079h8.A;
import p079h8.r;
import p129m8.e;
import p219v8.p;

/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c f1948a = new c();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Uri f1949b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static boolean f1950c;

    static final class a extends l implements p {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f1951q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ ContentResolver f1952r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(ContentResolver contentResolver, e eVar) {
            super(2, eVar);
            this.f1952r = contentResolver;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final e create(Object obj, e eVar) {
            return new a(this.f1952r, eVar);
        }

        @Override // p219v8.p
        public final Object invoke(L l9, e eVar) {
            return ((a) create(l9, eVar)).invokeSuspend(A.f21846a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            p139n8.b.e();
            if (this.f1951q != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            r.b(obj);
            c.f1948a.k(Settings.System.getInt(this.f1952r, "nt_log_capture", 0) == 1);
            return A.f21846a;
        }
    }

    static {
        Uri uriFor = Settings.System.getUriFor("nt_log_capture");
        n.g(uriFor, "getUriFor(...)");
        f1949b = uriFor;
    }

    private c() {
    }

    public static final void b(String tag, String str) {
        n.h(tag, "tag");
        if (f1950c || Log.isLoggable("NTWidget-", 3)) {
            n.e(str);
            Log.d("NTWidget-" + tag, str);
        }
    }

    public static final void d(String tag, String str) {
        n.h(tag, "tag");
        n.e(str);
        Log.e("NTWidget-" + tag, str);
    }

    public static final void e(String tag, String str, Throwable th) {
        n.h(tag, "tag");
        if (f1950c || Log.isLoggable("NTWidget-", 6)) {
            Log.e("NTWidget-" + tag, str, th);
        }
    }

    private final void i(ContentResolver contentResolver) {
        AbstractC0816i.d(M.b(), C0803b0.b(), null, new a(contentResolver, null), 2, null);
    }

    public final void a(String str) {
        if (f1950c || Log.isLoggable("NTWidget-", 3)) {
            n.e(str);
            Log.d("NTWidget-", str);
        }
    }

    public final void c(String str) {
        n.e(str);
        Log.e("NTWidget-", str);
    }

    public final boolean f() {
        return f1950c;
    }

    public final void g(String str) {
        n.e(str);
        Log.i("NTWidget-", str);
    }

    public final void h(String tag, String str) {
        n.h(tag, "tag");
        n.e(str);
        Log.i("NTWidget-" + tag, str);
    }

    public final void j(Context context) {
        n.h(context, "context");
        ContentResolver contentResolver = context.getApplicationContext().getContentResolver();
        G5.a aVar = new G5.a(context, new Handler(Looper.getMainLooper()));
        n.e(contentResolver);
        i(contentResolver);
        contentResolver.registerContentObserver(f1949b, false, aVar);
    }

    public final void k(boolean z9) {
        f1950c = z9;
    }

    public final void l(String tag, String str) {
        n.h(tag, "tag");
        if (f1950c || Log.isLoggable("NTWidget-", 5)) {
            n.e(str);
            Log.w("NTWidget-" + tag, str);
        }
    }
}
