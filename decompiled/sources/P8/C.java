package P8;

import kotlin.jvm.internal.AbstractC1457h;

/* JADX INFO: loaded from: classes2.dex */
public abstract class C {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f6090a = new a(null);

    public static final class a {

        /* JADX INFO: renamed from: P8.C$a$a, reason: collision with other inner class name */
        public static final class C0209a extends C {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ x f6091b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ e9.h f6092c;

            C0209a(x xVar, e9.h hVar) {
                this.f6091b = xVar;
                this.f6092c = hVar;
            }

            @Override // P8.C
            public long a() {
                return this.f6092c.v();
            }

            @Override // P8.C
            public x b() {
                return this.f6091b;
            }

            @Override // P8.C
            public void g(e9.f sink) {
                kotlin.jvm.internal.n.h(sink, "sink");
                sink.s0(this.f6092c);
            }
        }

        public static final class b extends C {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ x f6093b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ int f6094c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ byte[] f6095d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            final /* synthetic */ int f6096e;

            b(x xVar, int i10, byte[] bArr, int i11) {
                this.f6093b = xVar;
                this.f6094c = i10;
                this.f6095d = bArr;
                this.f6096e = i11;
            }

            @Override // P8.C
            public long a() {
                return this.f6094c;
            }

            @Override // P8.C
            public x b() {
                return this.f6093b;
            }

            @Override // P8.C
            public void g(e9.f sink) {
                kotlin.jvm.internal.n.h(sink, "sink");
                sink.k0(this.f6095d, this.f6096e, this.f6094c);
            }
        }

        public /* synthetic */ a(AbstractC1457h abstractC1457h) {
            this();
        }

        public static /* synthetic */ C f(a aVar, x xVar, byte[] bArr, int i10, int i11, int i12, Object obj) {
            if ((i12 & 4) != 0) {
                i10 = 0;
            }
            if ((i12 & 8) != 0) {
                i11 = bArr.length;
            }
            return aVar.c(xVar, bArr, i10, i11);
        }

        public static /* synthetic */ C g(a aVar, byte[] bArr, x xVar, int i10, int i11, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                xVar = null;
            }
            if ((i12 & 2) != 0) {
                i10 = 0;
            }
            if ((i12 & 4) != 0) {
                i11 = bArr.length;
            }
            return aVar.e(bArr, xVar, i10, i11);
        }

        public final C a(x xVar, e9.h content) {
            kotlin.jvm.internal.n.h(content, "content");
            return d(content, xVar);
        }

        public final C b(x xVar, byte[] content) {
            kotlin.jvm.internal.n.h(content, "content");
            return f(this, xVar, content, 0, 0, 12, null);
        }

        public final C c(x xVar, byte[] content, int i10, int i11) {
            kotlin.jvm.internal.n.h(content, "content");
            return e(content, xVar, i10, i11);
        }

        public final C d(e9.h hVar, x xVar) {
            kotlin.jvm.internal.n.h(hVar, "<this>");
            return new C0209a(xVar, hVar);
        }

        public final C e(byte[] bArr, x xVar, int i10, int i11) {
            kotlin.jvm.internal.n.h(bArr, "<this>");
            Q8.d.l(bArr.length, i10, i11);
            return new b(xVar, i11, bArr, i10);
        }

        private a() {
        }
    }

    public static final C c(x xVar, e9.h hVar) {
        return f6090a.a(xVar, hVar);
    }

    public static final C d(x xVar, byte[] bArr) {
        return f6090a.b(xVar, bArr);
    }

    public abstract long a();

    public abstract x b();

    public boolean e() {
        return false;
    }

    public boolean f() {
        return false;
    }

    public abstract void g(e9.f fVar);
}
