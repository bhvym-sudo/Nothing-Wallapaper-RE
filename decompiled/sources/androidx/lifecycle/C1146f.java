package androidx.lifecycle;

import F8.C0803b0;
import F8.InterfaceC0846x0;
import F8.T0;

/* JADX INFO: renamed from: androidx.lifecycle.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1146f extends F {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private C1143c f13405m;

    /* JADX INFO: renamed from: androidx.lifecycle.f$a */
    static final class a extends kotlin.jvm.internal.o implements p219v8.a {
        a() {
            super(0);
        }

        public final void a() {
            C1146f.this.f13405m = null;
        }

        @Override // p219v8.a
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return p079h8.A.f21846a;
        }
    }

    /* JADX INFO: renamed from: androidx.lifecycle.f$b */
    static final class b extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        Object f13407q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        /* synthetic */ Object f13408r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        int f13410t;

        b(p129m8.e eVar) {
            super(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f13408r = obj;
            this.f13410t |= Integer.MIN_VALUE;
            return C1146f.this.p(this);
        }
    }

    public C1146f(p129m8.i context, long j9, p219v8.p block) {
        kotlin.jvm.internal.n.h(context, "context");
        kotlin.jvm.internal.n.h(block, "block");
        this.f13405m = new C1143c(this, block, j9, F8.M.a(C0803b0.c().n1().z(context).z(T0.a((InterfaceC0846x0) context.b(InterfaceC0846x0.f1901e)))), new a());
    }

    @Override // androidx.lifecycle.F, androidx.lifecycle.C
    protected void j() {
        super.j();
        C1143c c1143c = this.f13405m;
        if (c1143c != null) {
            c1143c.h();
        }
    }

    @Override // androidx.lifecycle.F, androidx.lifecycle.C
    protected void k() {
        super.k();
        C1143c c1143c = this.f13405m;
        if (c1143c != null) {
            c1143c.g();
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object p(p129m8.e eVar) {
        b bVar;
        if (eVar instanceof b) {
            bVar = (b) eVar;
            int i10 = bVar.f13410t;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                bVar.f13410t = i10 - Integer.MIN_VALUE;
            } else {
                bVar = new b(eVar);
            }
        } else {
            bVar = new b(eVar);
        }
        Object obj = bVar.f13408r;
        p139n8.b.e();
        int i11 = bVar.f13410t;
        if (i11 != 0) {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            this = (C1146f) bVar.f13407q;
        }
        p079h8.r.b(obj);
        this.getClass();
        return p079h8.A.f21846a;
    }
}
