package p055f4;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import p025c4.AbstractC1202p;

/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f20826a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final p055f4.a f20827b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Executor f20828c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f20829d;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final List f20830a = new ArrayList();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f20831b = true;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private p055f4.a f20832c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private Executor f20833d;

        public a a(p005a4.f fVar) {
            this.f20830a.add(fVar);
            return this;
        }

        public f b() {
            return new f(this.f20830a, this.f20832c, this.f20833d, this.f20831b, null);
        }

        public a c(p055f4.a aVar) {
            return d(aVar, null);
        }

        public a d(p055f4.a aVar, Executor executor) {
            this.f20832c = aVar;
            this.f20833d = executor;
            return this;
        }
    }

    /* synthetic */ f(List list, p055f4.a aVar, Executor executor, boolean z9, k kVar) {
        AbstractC1202p.j(list, "APIs must not be null.");
        AbstractC1202p.b(!list.isEmpty(), "APIs must not be empty.");
        if (executor != null) {
            AbstractC1202p.j(aVar, "Listener must not be null when listener executor is set.");
        }
        this.f20826a = list;
        this.f20827b = aVar;
        this.f20828c = executor;
        this.f20829d = z9;
    }

    public static a d() {
        return new a();
    }

    public List a() {
        return this.f20826a;
    }

    public p055f4.a b() {
        return this.f20827b;
    }

    public Executor c() {
        return this.f20828c;
    }

    public final boolean e() {
        return this.f20829d;
    }
}
