package androidx.loader.app;

import androidx.appcompat.app.o;
import androidx.collection.Q;
import androidx.constraintlayout.core.widgets.Optimizer;
import androidx.lifecycle.InterfaceC1163x;
import androidx.lifecycle.a0;
import androidx.lifecycle.d0;
import androidx.lifecycle.e0;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* JADX INFO: loaded from: classes.dex */
class b extends androidx.loader.app.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC1163x f13473a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final a f13474b;

    static class a extends a0 {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final d0.c f13475d = new C0404a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Q f13476b = new Q();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f13477c = false;

        /* JADX INFO: renamed from: androidx.loader.app.b$a$a, reason: collision with other inner class name */
        static class C0404a implements d0.c {
            C0404a() {
            }

            @Override // androidx.lifecycle.d0.c
            public a0 a(Class cls) {
                return new a();
            }
        }

        a() {
        }

        static a f(e0 e0Var) {
            return (a) new d0(e0Var, f13475d).b(a.class);
        }

        @Override // androidx.lifecycle.a0
        protected void d() {
            super.d();
            if (this.f13476b.n() <= 0) {
                this.f13476b.d();
            } else {
                o.a(this.f13476b.o(0));
                throw null;
            }
        }

        public void e(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
            if (this.f13476b.n() > 0) {
                printWriter.print(str);
                printWriter.println("Loaders:");
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append("    ");
                if (this.f13476b.n() <= 0) {
                    return;
                }
                o.a(this.f13476b.o(0));
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(this.f13476b.l(0));
                printWriter.print(": ");
                throw null;
            }
        }

        void g() {
            if (this.f13476b.n() <= 0) {
                return;
            }
            o.a(this.f13476b.o(0));
            throw null;
        }
    }

    b(InterfaceC1163x interfaceC1163x, e0 e0Var) {
        this.f13473a = interfaceC1163x;
        this.f13474b = a.f(e0Var);
    }

    @Override // androidx.loader.app.a
    public void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        this.f13474b.e(str, fileDescriptor, printWriter, strArr);
    }

    @Override // androidx.loader.app.a
    public void c() {
        this.f13474b.g();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(Optimizer.OPTIMIZATION_GRAPH_WRAP);
        sb.append("LoaderManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        B0.b.a(this.f13473a, sb);
        sb.append("}}");
        return sb.toString();
    }
}
