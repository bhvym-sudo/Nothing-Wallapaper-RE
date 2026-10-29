package p187s6;

import kotlin.jvm.internal.AbstractC1457h;
import kotlin.jvm.internal.F;
import kotlin.jvm.internal.n;
import p079h8.m;

/* JADX INFO: loaded from: classes2.dex */
public abstract class a implements Comparable {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final int f27747q;

    /* JADX INFO: renamed from: s6.a$a, reason: collision with other inner class name */
    public static final class C0670a extends a {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public static final C0670a f27748r = new C0670a();

        private C0670a() {
            super(2, null);
        }
    }

    public static final class b extends a {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public static final b f27749r = new b();

        private b() {
            super(1, null);
        }
    }

    public static final class c extends a {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public static final c f27750r = new c();

        private c() {
            super(4, null);
        }
    }

    public static final class d extends a {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public static final d f27751r = new d();

        private d() {
            super(3, null);
        }
    }

    public static abstract class e implements Comparable {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private final int f27752q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private final boolean f27753r;

        /* JADX INFO: renamed from: s6.a$e$a, reason: collision with other inner class name */
        public static final class C0671a extends e {

            /* JADX INFO: renamed from: s, reason: collision with root package name */
            public static final C0671a f27754s = new C0671a();

            private C0671a() {
                super(4, false, 2, null);
            }
        }

        public static final class b extends e {

            /* JADX INFO: renamed from: s, reason: collision with root package name */
            private boolean f27755s;

            public /* synthetic */ b(boolean z9, int i10, AbstractC1457h abstractC1457h) {
                this((i10 & 1) != 0 ? false : z9);
            }

            @Override // s6.a.e
            public boolean e() {
                return !this.f27755s;
            }

            public final b i() {
                return new b(true);
            }

            public final boolean k() {
                return this.f27755s;
            }

            @Override // s6.a.e
            public String toString() {
                return "EngineAttached(shown:" + this.f27755s + ")";
            }

            /* JADX WARN: Illegal instructions before constructor call */
            public b(boolean z9) {
                int i10 = 2;
                super(i10, false, i10, null);
                this.f27755s = z9;
            }
        }

        public static final class c extends e {

            /* JADX INFO: renamed from: s, reason: collision with root package name */
            public static final c f27756s = new c();

            /* JADX WARN: Multi-variable type inference failed */
            private c() {
                super(0, 0 == true ? 1 : 0, 2, null);
            }
        }

        public static final class d extends e {

            /* JADX INFO: renamed from: s, reason: collision with root package name */
            public static final d f27757s = new d();

            private d() {
                super(1, false, 2, null);
            }
        }

        /* JADX INFO: renamed from: s6.a$e$e, reason: collision with other inner class name */
        public static final class C0672e extends e {

            /* JADX INFO: renamed from: s, reason: collision with root package name */
            private final boolean f27758s;

            public C0672e(boolean z9) {
                super(3, false, 2, null);
                this.f27758s = z9;
            }

            public final boolean i() {
                return this.f27758s;
            }

            public /* synthetic */ C0672e(boolean z9, int i10, AbstractC1457h abstractC1457h) {
                this((i10 & 1) != 0 ? false : z9);
            }
        }

        public /* synthetic */ e(int i10, boolean z9, AbstractC1457h abstractC1457h) {
            this(i10, z9);
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public int compareTo(e other) {
            n.h(other, "other");
            if ((this instanceof b) && (other instanceof b)) {
                b bVar = (b) this;
                b bVar2 = (b) other;
                if (bVar.k() == bVar2.k()) {
                    return 0;
                }
                return (!bVar.k() || bVar2.k()) ? -1 : 1;
            }
            if ((this instanceof C0672e) && ((C0672e) this).i() && (other instanceof d)) {
                return -1;
            }
            return this.f27752q - other.f27752q;
        }

        public boolean e() {
            return this.f27753r;
        }

        public final boolean f() {
            return n.d(this, d.f27757s) || (this instanceof b);
        }

        public final e g() {
            if (!(this instanceof b)) {
                return null;
            }
            b bVar = (b) this;
            if (bVar.k()) {
                return null;
            }
            return bVar.i();
        }

        public final boolean h(e other) {
            n.h(other, "other");
            if (f() && (other instanceof C0672e) && ((C0672e) other).i()) {
                return true;
            }
            return (this instanceof C0672e) && ((C0672e) this).i() && (other instanceof d);
        }

        public String toString() {
            String strB = F.b(getClass()).b();
            return strB == null ? "State" : strB;
        }

        private e(int i10, boolean z9) {
            this.f27752q = i10;
            this.f27753r = z9;
        }

        public /* synthetic */ e(int i10, boolean z9, int i11, AbstractC1457h abstractC1457h) {
            this(i10, (i11 & 2) != 0 ? false : z9, null);
        }
    }

    public /* synthetic */ a(int i10, AbstractC1457h abstractC1457h) {
        this(i10);
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public int compareTo(a other) {
        n.h(other, "other");
        return this.f27747q - other.f27747q;
    }

    public final e e() {
        if (this instanceof b) {
            return e.d.f27757s;
        }
        AbstractC1457h abstractC1457h = null;
        int i10 = 1;
        boolean z9 = false;
        if (this instanceof C0670a) {
            return new e.b(z9, i10, abstractC1457h);
        }
        if (this instanceof d) {
            return new e.C0672e(z9, i10, abstractC1457h);
        }
        if (this instanceof c) {
            return e.C0671a.f27754s;
        }
        throw new m();
    }

    public String toString() {
        String strB = F.b(getClass()).b();
        return strB == null ? "Event" : strB;
    }

    private a(int i10) {
        this.f27747q = i10;
    }
}
