package g9;

import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Objects;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
final class i extends e.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Executor f21380a;

    class a implements e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Type f21381a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Executor f21382b;

        a(Type type, Executor executor) {
            this.f21381a = type;
            this.f21382b = executor;
        }

        @Override // g9.e
        public Type a() {
            return this.f21381a;
        }

        @Override // g9.e
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public d b(d dVar) {
            Executor executor = this.f21382b;
            return executor == null ? dVar : new b(executor, dVar);
        }
    }

    static final class b implements d {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        final Executor f21384q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final d f21385r;

        class a implements f {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ f f21386a;

            a(f fVar) {
                this.f21386a = fVar;
            }

            public static /* synthetic */ void d(a aVar, f fVar, x xVar) {
                if (b.this.f21385r.f()) {
                    fVar.a(b.this, new IOException("Canceled"));
                } else {
                    fVar.b(b.this, xVar);
                }
            }

            @Override // g9.f
            public void a(d dVar, final Throwable th) {
                Executor executor = b.this.f21384q;
                final f fVar = this.f21386a;
                executor.execute(new Runnable() { // from class: g9.k
                    @Override // java.lang.Runnable
                    public final void run() {
                        fVar.a(i.b.this, th);
                    }
                });
            }

            @Override // g9.f
            public void b(d dVar, final x xVar) {
                Executor executor = b.this.f21384q;
                final f fVar = this.f21386a;
                executor.execute(new Runnable() { // from class: g9.j
                    @Override // java.lang.Runnable
                    public final void run() {
                        i.b.a.d(this.f21388q, fVar, xVar);
                    }
                });
            }
        }

        b(Executor executor, d dVar) {
            this.f21384q = executor;
            this.f21385r = dVar;
        }

        @Override // g9.d
        public x a() {
            return this.f21385r.a();
        }

        @Override // g9.d
        public P8.B b() {
            return this.f21385r.b();
        }

        @Override // g9.d
        public void cancel() {
            this.f21385r.cancel();
        }

        @Override // g9.d
        public boolean f() {
            return this.f21385r.f();
        }

        @Override // g9.d
        public void g(f fVar) {
            Objects.requireNonNull(fVar, "callback == null");
            this.f21385r.g(new a(fVar));
        }

        @Override // g9.d
        /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
        public d clone() {
            return new b(this.f21384q, this.f21385r.clone());
        }
    }

    i(Executor executor) {
        this.f21380a = executor;
    }

    @Override // g9.e.a
    public e a(Type type, Annotation[] annotationArr, y yVar) {
        if (e.a.c(type) != d.class) {
            return null;
        }
        if (type instanceof ParameterizedType) {
            return new a(C.g(0, (ParameterizedType) type), C.l(annotationArr, A.class) ? null : this.f21380a);
        }
        throw new IllegalArgumentException("Call return type must be parameterized as Call<Foo> or Call<? extends Foo>");
    }
}
