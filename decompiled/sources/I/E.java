package I;

import kotlin.jvm.internal.AbstractC1457h;

/* JADX INFO: loaded from: classes.dex */
public abstract class E {

    public static final class a extends E {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final H f2641a;

        public a(H h10) {
            super(null);
            this.f2641a = h10;
        }

        @Override // I.E
        public H.i a() {
            return this.f2641a.d();
        }

        public final H b() {
            return this.f2641a;
        }
    }

    public static final class b extends E {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final H.i f2642a;

        public b(H.i iVar) {
            super(null);
            this.f2642a = iVar;
        }

        @Override // I.E
        public H.i a() {
            return this.f2642a;
        }

        public final H.i b() {
            return this.f2642a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && kotlin.jvm.internal.n.d(this.f2642a, ((b) obj).f2642a);
        }

        public int hashCode() {
            return this.f2642a.hashCode();
        }
    }

    public static final class c extends E {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final H.k f2643a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final H f2644b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public c(H.k kVar) {
            super(0 == true ? 1 : 0);
            H h10 = null;
            this.f2643a = kVar;
            if (!H.l.d(kVar)) {
                H hA = AbstractC0866j.a();
                H.e(hA, kVar, null, 2, null);
                h10 = hA;
            }
            this.f2644b = h10;
        }

        @Override // I.E
        public H.i a() {
            return H.l.c(this.f2643a);
        }

        public final H.k b() {
            return this.f2643a;
        }

        public final H c() {
            return this.f2644b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && kotlin.jvm.internal.n.d(this.f2643a, ((c) obj).f2643a);
        }

        public int hashCode() {
            return this.f2643a.hashCode();
        }
    }

    public /* synthetic */ E(AbstractC1457h abstractC1457h) {
        this();
    }

    public abstract H.i a();

    private E() {
    }
}
