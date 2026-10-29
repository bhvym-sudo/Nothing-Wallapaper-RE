package p170r;

import kotlin.coroutines.jvm.internal.d;
import p079h8.r;
import p129m8.e;
import p129m8.i;
import p139n8.b;
import p219v8.l;
import p219v8.p;

/* JADX INFO: renamed from: r.n0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1695n0 implements InterfaceC1669a0 {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final InterfaceC1669a0 f25525q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final W f25526r = new W();

    /* JADX INFO: renamed from: r.n0$a */
    static final class a extends d {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        Object f25527q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        Object f25528r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        /* synthetic */ Object f25529s;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        int f25531u;

        a(e eVar) {
            super(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f25529s = obj;
            this.f25531u |= Integer.MIN_VALUE;
            return C1695n0.this.u(null, this);
        }
    }

    public C1695n0(InterfaceC1669a0 interfaceC1669a0) {
        this.f25525q = interfaceC1669a0;
    }

    @Override // p129m8.i
    public Object U0(Object obj, p pVar) {
        return InterfaceC1669a0.a.a(this, obj, pVar);
    }

    @Override // m8.i.b, p129m8.i
    public i.b b(i.c cVar) {
        return InterfaceC1669a0.a.b(this, cVar);
    }

    public final void c() {
        this.f25526r.d();
    }

    public final void d() {
        this.f25526r.f();
    }

    @Override // p129m8.i
    public i t0(i.c cVar) {
        return InterfaceC1669a0.a.c(this, cVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // p170r.InterfaceC1669a0
    public Object u(l lVar, e eVar) {
        a aVar;
        if (eVar instanceof a) {
            aVar = (a) eVar;
            int i10 = aVar.f25531u;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                aVar.f25531u = i10 - Integer.MIN_VALUE;
            } else {
                aVar = new a(eVar);
            }
        } else {
            aVar = new a(eVar);
        }
        Object obj = aVar.f25529s;
        Object objE = b.e();
        int i11 = aVar.f25531u;
        if (i11 == 0) {
            r.b(obj);
            W w9 = this.f25526r;
            aVar.f25527q = this;
            aVar.f25528r = lVar;
            aVar.f25531u = 1;
            if (w9.c(aVar) != objE) {
            }
        }
        if (i11 != 1) {
            if (i11 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            r.b(obj);
            return obj;
        }
        lVar = (l) aVar.f25528r;
        this = (C1695n0) aVar.f25527q;
        r.b(obj);
        InterfaceC1669a0 interfaceC1669a0 = this.f25525q;
        aVar.f25527q = null;
        aVar.f25528r = null;
        aVar.f25531u = 2;
        Object objU = interfaceC1669a0.u(lVar, aVar);
        return objU == objE ? objE : objU;
    }

    @Override // p129m8.i
    public i z(i iVar) {
        return InterfaceC1669a0.a.d(this, iVar);
    }
}
