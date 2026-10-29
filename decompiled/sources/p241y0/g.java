package p241y0;

import B0.i;
import android.content.Context;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.CancellationSignal;
import android.os.Handler;
import java.util.Collections;
import java.util.List;
import p191t0.e;

/* JADX INFO: loaded from: classes.dex */
public abstract class g {

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Uri f30137a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f30138b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f30139c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final boolean f30140d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final int f30141e;

        public b(Uri uri, int i10, int i11, boolean z9, int i12) {
            this.f30137a = (Uri) i.e(uri);
            this.f30138b = i10;
            this.f30139c = i11;
            this.f30140d = z9;
            this.f30141e = i12;
        }

        static b a(Uri uri, int i10, int i11, boolean z9, int i12) {
            return new b(uri, i10, i11, z9, i12);
        }

        public int b() {
            return this.f30141e;
        }

        public int c() {
            return this.f30138b;
        }

        public Uri d() {
            return this.f30137a;
        }

        public int e() {
            return this.f30139c;
        }

        public boolean f() {
            return this.f30140d;
        }
    }

    public static class c {
        public abstract void a(int i10);

        public abstract void b(Typeface typeface);
    }

    public static Typeface a(Context context, CancellationSignal cancellationSignal, b[] bVarArr) {
        return e.b(context, cancellationSignal, bVarArr, 0);
    }

    public static a b(Context context, CancellationSignal cancellationSignal, e eVar) {
        return d.e(context, List.of(eVar), cancellationSignal);
    }

    public static Typeface c(Context context, List list, int i10, boolean z9, int i11, Handler handler, c cVar) {
        p241y0.a aVar = new p241y0.a(cVar, h.b(handler));
        if (!z9) {
            return f.d(context, list, i10, null, aVar);
        }
        if (list.size() <= 1) {
            return f.e(context, (e) list.get(0), aVar, i10, i11);
        }
        throw new IllegalArgumentException("Fallbacks with blocking fetches are not supported for performance reasons");
    }

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f30135a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final List f30136b;

        public a(int i10, b[] bVarArr) {
            this.f30135a = i10;
            this.f30136b = Collections.singletonList(bVarArr);
        }

        static a a(int i10, List list) {
            return new a(i10, list);
        }

        static a b(int i10, b[] bVarArr) {
            return new a(i10, bVarArr);
        }

        public b[] c() {
            return (b[]) this.f30136b.get(0);
        }

        public List d() {
            return this.f30136b;
        }

        public int e() {
            return this.f30135a;
        }

        boolean f() {
            return this.f30136b.size() > 1;
        }

        a(int i10, List list) {
            this.f30135a = i10;
            this.f30136b = list;
        }
    }
}
