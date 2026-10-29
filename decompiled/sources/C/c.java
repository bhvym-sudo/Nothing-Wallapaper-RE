package C;

import F8.L;
import F8.M;
import W.InterfaceC0966h;
import W.U;
import W.a0;
import p219v8.l;
import p219v8.p;

/* JADX INFO: loaded from: classes.dex */
public interface c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f445a = a.f446b;

    public static final class a implements c {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        static final /* synthetic */ a f446b = new a();

        private a() {
        }

        @Override // C.c
        public boolean a(l lVar) {
            return true;
        }

        @Override // C.c
        public Object b(Object obj, p pVar) {
            return obj;
        }

        @Override // C.c
        public c c(c cVar) {
            return cVar;
        }

        public String toString() {
            return "Modifier";
        }
    }

    public interface b extends c {
        @Override // C.c
        default boolean a(l lVar) {
            return ((Boolean) lVar.f(this)).booleanValue();
        }

        @Override // C.c
        default Object b(Object obj, p pVar) {
            return pVar.invoke(obj, this);
        }
    }

    /* JADX INFO: renamed from: C.c$c, reason: collision with other inner class name */
    public static abstract class AbstractC0022c implements InterfaceC0966h {

        /* JADX INFO: renamed from: A, reason: collision with root package name */
        private boolean f447A;

        /* JADX INFO: renamed from: B, reason: collision with root package name */
        private boolean f448B;

        /* JADX INFO: renamed from: C, reason: collision with root package name */
        private boolean f449C;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private L f451r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        private int f452s;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        private AbstractC0022c f454u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        private AbstractC0022c f455v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        private a0 f456w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        private U f457x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        private boolean f458y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        private boolean f459z;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private AbstractC0022c f450q = this;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private int f453t = -1;

        public final int H() {
            return this.f453t;
        }

        public final AbstractC0022c I() {
            return this.f455v;
        }

        public final U J() {
            return this.f457x;
        }

        public final boolean K() {
            return this.f458y;
        }

        public final int L() {
            return this.f452s;
        }

        public final a0 M() {
            return this.f456w;
        }

        public final AbstractC0022c N() {
            return this.f454u;
        }

        public boolean O() {
            return true;
        }

        public final boolean P() {
            return this.f459z;
        }

        public final boolean Q() {
            return this.f449C;
        }

        public void R() {
            if (this.f449C) {
                T.a.b("node attached multiple times");
            }
            if (!(this.f457x != null)) {
                T.a.b("attach invoked on a node without a coordinator");
            }
            this.f449C = true;
            this.f447A = true;
        }

        public void S() {
            if (!this.f449C) {
                T.a.b("Cannot detach a node that is not attached");
            }
            if (this.f447A) {
                T.a.b("Must run runAttachLifecycle() before markAsDetached()");
            }
            if (this.f448B) {
                T.a.b("Must run runDetachLifecycle() before markAsDetached()");
            }
            this.f449C = false;
            L l9 = this.f451r;
            if (l9 != null) {
                M.c(l9, new d());
                this.f451r = null;
            }
        }

        public void T() {
        }

        public void U() {
        }

        public void V() {
        }

        public void W() {
            if (!this.f449C) {
                T.a.b("reset() called on an unattached node");
            }
            V();
        }

        public void X() {
            if (!this.f449C) {
                T.a.b("Must run markAsAttached() prior to runAttachLifecycle");
            }
            if (!this.f447A) {
                T.a.b("Must run runAttachLifecycle() only once after markAsAttached()");
            }
            this.f447A = false;
            T();
            this.f448B = true;
        }

        public void Y() {
            if (!this.f449C) {
                T.a.b("node detached multiple times");
            }
            if (!(this.f457x != null)) {
                T.a.b("detach invoked on a node without a coordinator");
            }
            if (!this.f448B) {
                T.a.b("Must run runDetachLifecycle() once after runAttachLifecycle() and before markAsDetached()");
            }
            this.f448B = false;
            U();
        }

        public final void Z(int i10) {
            this.f453t = i10;
        }

        public final void a0(AbstractC0022c abstractC0022c) {
            this.f455v = abstractC0022c;
        }

        public final void b0(boolean z9) {
            this.f458y = z9;
        }

        public final void c0(int i10) {
            this.f452s = i10;
        }

        public final void d0(a0 a0Var) {
            this.f456w = a0Var;
        }

        public final void e0(AbstractC0022c abstractC0022c) {
            this.f454u = abstractC0022c;
        }

        public final void f0(boolean z9) {
            this.f459z = z9;
        }

        public void g0(U u9) {
            this.f457x = u9;
        }

        @Override // W.InterfaceC0966h
        public final AbstractC0022c z() {
            return this.f450q;
        }
    }

    boolean a(l lVar);

    Object b(Object obj, p pVar);

    default c c(c cVar) {
        return cVar == f445a ? this : new C.b(this, cVar);
    }
}
