package g9;

import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.concurrent.CompletableFuture;

/* JADX INFO: loaded from: classes2.dex */
final class g extends e.a {

    private static final class a implements e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Type f21373a;

        /* JADX INFO: renamed from: g9.g$a$a, reason: collision with other inner class name */
        private class C0543a implements f {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final CompletableFuture f21374a;

            public C0543a(CompletableFuture completableFuture) {
                this.f21374a = completableFuture;
            }

            @Override // g9.f
            public void a(d dVar, Throwable th) {
                this.f21374a.completeExceptionally(th);
            }

            @Override // g9.f
            public void b(d dVar, x xVar) {
                if (xVar.d()) {
                    this.f21374a.complete(xVar.a());
                } else {
                    this.f21374a.completeExceptionally(new m(xVar));
                }
            }
        }

        a(Type type) {
            this.f21373a = type;
        }

        @Override // g9.e
        public Type a() {
            return this.f21373a;
        }

        @Override // g9.e
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public CompletableFuture b(d dVar) {
            b bVar = new b(dVar);
            dVar.g(new C0543a(bVar));
            return bVar;
        }
    }

    private static final class b extends CompletableFuture {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private final d f21376q;

        b(d dVar) {
            this.f21376q = dVar;
        }

        @Override // java.util.concurrent.CompletableFuture, java.util.concurrent.Future
        public boolean cancel(boolean z9) {
            if (z9) {
                this.f21376q.cancel();
            }
            return super.cancel(z9);
        }
    }

    private static final class c implements e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Type f21377a;

        private class a implements f {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final CompletableFuture f21378a;

            public a(CompletableFuture completableFuture) {
                this.f21378a = completableFuture;
            }

            @Override // g9.f
            public void a(d dVar, Throwable th) {
                this.f21378a.completeExceptionally(th);
            }

            @Override // g9.f
            public void b(d dVar, x xVar) {
                this.f21378a.complete(xVar);
            }
        }

        c(Type type) {
            this.f21377a = type;
        }

        @Override // g9.e
        public Type a() {
            return this.f21377a;
        }

        @Override // g9.e
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public CompletableFuture b(d dVar) {
            b bVar = new b(dVar);
            dVar.g(new a(bVar));
            return bVar;
        }
    }

    g() {
    }

    @Override // g9.e.a
    public e a(Type type, Annotation[] annotationArr, y yVar) {
        if (e.a.c(type) != CompletableFuture.class) {
            return null;
        }
        if (!(type instanceof ParameterizedType)) {
            throw new IllegalStateException("CompletableFuture return type must be parameterized as CompletableFuture<Foo> or CompletableFuture<? extends Foo>");
        }
        Type typeB = e.a.b(0, (ParameterizedType) type);
        if (e.a.c(typeB) != x.class) {
            return new a(typeB);
        }
        if (typeB instanceof ParameterizedType) {
            return new c(e.a.b(0, (ParameterizedType) typeB));
        }
        throw new IllegalStateException("Response must be parameterized as Response<Foo> or Response<? extends Foo>");
    }
}
