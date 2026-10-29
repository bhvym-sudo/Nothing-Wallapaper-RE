package androidx.slice.widget;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.AsyncTask;
import androidx.collection.C1022b;
import androidx.lifecycle.C;
import androidx.slice.Slice;
import androidx.slice.SliceSpec;
import java.util.Arrays;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public abstract class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final SliceSpec f13979a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final SliceSpec f13980b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Set f13981c;

    private static class a extends C {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        final androidx.slice.c f13983m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Uri f13984n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private final Runnable f13985o = new RunnableC0415a();

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        final androidx.slice.c.a f13986p = new b();

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        final Intent f13982l = null;

        /* JADX INFO: renamed from: androidx.slice.widget.g$a$a, reason: collision with other inner class name */
        class RunnableC0415a implements Runnable {
            RunnableC0415a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                a aVar = a.this;
                Uri uri = aVar.f13984n;
                Slice sliceB = uri != null ? aVar.f13983m.b(uri) : aVar.f13983m.a(aVar.f13982l);
                a aVar2 = a.this;
                if (aVar2.f13984n == null && sliceB != null) {
                    aVar2.f13984n = sliceB.f();
                    a aVar3 = a.this;
                    aVar3.f13983m.e(aVar3.f13984n, aVar3.f13986p);
                }
                a.this.l(sliceB);
            }
        }

        class b implements androidx.slice.c.a {
            b() {
            }

            @Override // androidx.slice.c.a
            public void a(Slice slice) {
                a.this.l(slice);
            }
        }

        a(Context context, Uri uri) {
            this.f13983m = androidx.slice.c.c(context);
            this.f13984n = uri;
        }

        @Override // androidx.lifecycle.C
        protected void j() {
            AsyncTask.execute(this.f13985o);
            Uri uri = this.f13984n;
            if (uri != null) {
                this.f13983m.e(uri, this.f13986p);
            }
        }

        @Override // androidx.lifecycle.C
        protected void k() {
            Uri uri = this.f13984n;
            if (uri != null) {
                this.f13983m.g(uri, this.f13986p);
            }
        }
    }

    static {
        SliceSpec sliceSpec = new SliceSpec("androidx.app.slice.BASIC", 1);
        f13979a = sliceSpec;
        SliceSpec sliceSpec2 = new SliceSpec("androidx.app.slice.LIST", 1);
        f13980b = sliceSpec2;
        f13981c = new C1022b(Arrays.asList(p092j1.b.f22288a, p092j1.b.f22289b, sliceSpec, sliceSpec2));
    }

    public static C a(Context context, Uri uri) {
        return new a(context.getApplicationContext(), uri);
    }
}
