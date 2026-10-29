package androidx.lifecycle;

/* JADX INFO: loaded from: classes.dex */
public final class c0 implements p079h8.h {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final C8.c f13379q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final p219v8.a f13380r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final p219v8.a f13381s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final p219v8.a f13382t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private a0 f13383u;

    public c0(C8.c viewModelClass, p219v8.a storeProducer, p219v8.a factoryProducer, p219v8.a extrasProducer) {
        kotlin.jvm.internal.n.h(viewModelClass, "viewModelClass");
        kotlin.jvm.internal.n.h(storeProducer, "storeProducer");
        kotlin.jvm.internal.n.h(factoryProducer, "factoryProducer");
        kotlin.jvm.internal.n.h(extrasProducer, "extrasProducer");
        this.f13379q = viewModelClass;
        this.f13380r = storeProducer;
        this.f13381s = factoryProducer;
        this.f13382t = extrasProducer;
    }

    @Override // p079h8.h
    public boolean a() {
        return this.f13383u != null;
    }

    @Override // p079h8.h
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public a0 getValue() {
        a0 a0Var = this.f13383u;
        if (a0Var != null) {
            return a0Var;
        }
        a0 a0VarA = d0.f13391b.a((e0) this.f13380r.invoke(), (d0.c) this.f13381s.invoke(), (Z0.a) this.f13382t.invoke()).a(this.f13379q);
        this.f13383u = a0VarA;
        return a0VarA;
    }
}
