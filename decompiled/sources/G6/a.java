package G6;

import F8.AbstractC0814h;
import F8.C0826n;
import F8.InterfaceC0822l;
import F8.L;
import android.graphics.Bitmap;
import android.graphics.Point;
import com.android.wallpaper.asset.o;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.n;
import p079h8.A;
import p079h8.m;
import p079h8.q;
import p079h8.r;
import p219v8.p;

/* JADX INFO: loaded from: classes2.dex */
public abstract class a {

    /* JADX INFO: renamed from: G6.a$a, reason: collision with other inner class name */
    static final class C0072a implements com.android.wallpaper.asset.a.e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC0822l f1953a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ com.android.wallpaper.asset.a f1954b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f1955c;

        /* JADX INFO: renamed from: G6.a$a$a, reason: collision with other inner class name */
        static final class C0073a implements com.android.wallpaper.asset.a.d {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ InterfaceC0822l f1956a;

            C0073a(InterfaceC0822l interfaceC0822l) {
                this.f1956a = interfaceC0822l;
            }

            @Override // com.android.wallpaper.asset.a.d
            public final void a(Bitmap bitmap) {
                this.f1956a.resumeWith(q.b(bitmap));
            }
        }

        C0072a(InterfaceC0822l interfaceC0822l, com.android.wallpaper.asset.a aVar, boolean z9) {
            this.f1953a = interfaceC0822l;
            this.f1954b = aVar;
            this.f1955c = z9;
        }

        @Override // com.android.wallpaper.asset.a.e
        public final void a(Point point) {
            if (point == null) {
                this.f1953a.resumeWith(q.b(null));
            } else {
                this.f1954b.g(point.x, point.y, this.f1955c, new C0073a(this.f1953a));
            }
        }
    }

    static final class b extends l implements p {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f1957q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ com.android.wallpaper.asset.a f1958r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        final /* synthetic */ boolean f1959s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(com.android.wallpaper.asset.a aVar, boolean z9, p129m8.e eVar) {
            super(2, eVar);
            this.f1958r = aVar;
            this.f1959s = z9;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final p129m8.e create(Object obj, p129m8.e eVar) {
            return new b(this.f1958r, this.f1959s, eVar);
        }

        @Override // p219v8.p
        public final Object invoke(L l9, p129m8.e eVar) {
            return ((b) create(l9, eVar)).invokeSuspend(A.f21846a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objE = p139n8.b.e();
            int i10 = this.f1957q;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                r.b(obj);
                return obj;
            }
            r.b(obj);
            com.android.wallpaper.asset.a aVar = this.f1958r;
            boolean z9 = this.f1959s;
            this.f1957q = 1;
            Object objB = a.b(aVar, z9, this);
            return objB == objE ? objE : objB;
        }
    }

    static final class c implements com.android.wallpaper.asset.a.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC0822l f1960a;

        c(InterfaceC0822l interfaceC0822l) {
            this.f1960a = interfaceC0822l;
        }

        @Override // com.android.wallpaper.asset.a.d
        public final void a(Bitmap bitmap) {
            this.f1960a.resumeWith(q.b(bitmap));
        }
    }

    static final class d implements com.android.wallpaper.asset.a.e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC0822l f1961a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ com.android.wallpaper.asset.a f1962b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f1963c;

        /* JADX INFO: renamed from: G6.a$d$a, reason: collision with other inner class name */
        static final class C0074a implements com.android.wallpaper.asset.a.d {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ InterfaceC0822l f1964a;

            C0074a(InterfaceC0822l interfaceC0822l) {
                this.f1964a = interfaceC0822l;
            }

            @Override // com.android.wallpaper.asset.a.d
            public final void a(Bitmap bitmap) {
                this.f1964a.resumeWith(q.b(bitmap));
            }
        }

        d(InterfaceC0822l interfaceC0822l, com.android.wallpaper.asset.a aVar, boolean z9) {
            this.f1961a = interfaceC0822l;
            this.f1962b = aVar;
            this.f1963c = z9;
        }

        @Override // com.android.wallpaper.asset.a.e
        public final void a(Point point) {
            if (point == null) {
                this.f1961a.resumeWith(q.b(null));
            } else {
                this.f1962b.g(point.x, point.y, this.f1963c, new C0074a(this.f1961a));
            }
        }
    }

    static final class e extends l implements p {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f1965q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ com.android.wallpaper.asset.a f1966r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        final /* synthetic */ boolean f1967s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(com.android.wallpaper.asset.a aVar, boolean z9, p129m8.e eVar) {
            super(2, eVar);
            this.f1966r = aVar;
            this.f1967s = z9;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final p129m8.e create(Object obj, p129m8.e eVar) {
            return new e(this.f1966r, this.f1967s, eVar);
        }

        @Override // p219v8.p
        public final Object invoke(L l9, p129m8.e eVar) {
            return ((e) create(l9, eVar)).invokeSuspend(A.f21846a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objE = p139n8.b.e();
            int i10 = this.f1965q;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                r.b(obj);
                return obj;
            }
            r.b(obj);
            com.android.wallpaper.asset.a aVar = this.f1966r;
            boolean z9 = this.f1967s;
            this.f1965q = 1;
            Object objE2 = a.e(aVar, z9, this);
            return objE2 == objE ? objE : objE2;
        }
    }

    public static final Bitmap a(p227w6.b bVar, boolean z9, boolean z10) {
        n.h(bVar, "<this>");
        if (bVar instanceof p227w6.b.C0726b) {
            return ((p227w6.b.C0726b) bVar).a();
        }
        if (!(bVar instanceof w6.b.a)) {
            throw new m();
        }
        w6.b.a aVar = (w6.b.a) bVar;
        if (aVar.a() instanceof p237x6.c) {
            return ((p237x6.c) aVar.a()).y();
        }
        return z10 ? f(aVar.a(), z9) : d(aVar.a(), z9);
    }

    public static final Object b(com.android.wallpaper.asset.a aVar, boolean z9, p129m8.e eVar) {
        C0826n c0826n = new C0826n(p139n8.b.c(eVar), 1);
        c0826n.G();
        aVar.j(null, new C0072a(c0826n, aVar, z9));
        Object objA = c0826n.A();
        if (objA == p139n8.b.e()) {
            kotlin.coroutines.jvm.internal.h.c(eVar);
        }
        return objA;
    }

    public static /* synthetic */ Bitmap c(p227w6.b bVar, boolean z9, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z9 = true;
        }
        if ((i10 & 2) != 0) {
            z10 = true;
        }
        return a(bVar, z9, z10);
    }

    public static final Bitmap d(com.android.wallpaper.asset.a asset, boolean z9) {
        n.h(asset, "asset");
        return (Bitmap) AbstractC0814h.b(null, new b(asset, z9, null), 1, null);
    }

    public static final Object e(com.android.wallpaper.asset.a aVar, boolean z9, p129m8.e eVar) {
        C0826n c0826n = new C0826n(p139n8.b.c(eVar), 1);
        c0826n.G();
        if (aVar instanceof o) {
            ((o) aVar).D(z9, new c(c0826n));
        } else {
            aVar.j(null, new d(c0826n, aVar, z9));
        }
        Object objA = c0826n.A();
        if (objA == p139n8.b.e()) {
            kotlin.coroutines.jvm.internal.h.c(eVar);
        }
        return objA;
    }

    public static final Bitmap f(com.android.wallpaper.asset.a asset, boolean z9) {
        n.h(asset, "asset");
        return (Bitmap) AbstractC0814h.b(null, new e(asset, z9, null), 1, null);
    }
}
