package p001a0;

import B8.h;
import kotlin.coroutines.jvm.internal.d;
import p079h8.A;
import p079h8.r;
import p139n8.b;
import p219v8.p;

/* JADX INFO: loaded from: classes.dex */
final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f9580a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final p f9581b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private float f9582c;

    static final class a extends d {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        Object f9583q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        /* synthetic */ Object f9584r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        int f9586t;

        a(p129m8.e eVar) {
            super(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f9584r = obj;
            this.f9586t |= Integer.MIN_VALUE;
            return e.this.e(0.0f, this);
        }
    }

    public e(int i10, p pVar) {
        this.f9580a = i10;
        this.f9581b = pVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object e(float f10, p129m8.e eVar) {
        a aVar;
        if (eVar instanceof a) {
            aVar = (a) eVar;
            int i10 = aVar.f9586t;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                aVar.f9586t = i10 - Integer.MIN_VALUE;
            } else {
                aVar = new a(eVar);
            }
        } else {
            aVar = new a(eVar);
        }
        Object objInvoke = aVar.f9584r;
        Object objE = b.e();
        int i11 = aVar.f9586t;
        if (i11 == 0) {
            r.b(objInvoke);
            p pVar = this.f9581b;
            Float fB = kotlin.coroutines.jvm.internal.b.b(f10);
            aVar.f9583q = this;
            aVar.f9586t = 1;
            objInvoke = pVar.invoke(fB, aVar);
            if (objInvoke == objE) {
                return objE;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            this = (e) aVar.f9583q;
            r.b(objInvoke);
        }
        this.f9582c += ((Number) objInvoke).floatValue();
        return A.f21846a;
    }

    public final float b() {
        return this.f9582c;
    }

    public final int c(int i10) {
        return h.m(i10 - p239x8.a.b(this.f9582c), 0, this.f9580a);
    }

    public final void d() {
        this.f9582c = 0.0f;
    }

    public final Object f(int i10, int i11, p129m8.e eVar) {
        if (i10 > i11) {
            throw new IllegalArgumentException(("Expected min=" + i10 + " ≤ max=" + i11).toString());
        }
        int i12 = i11 - i10;
        int i13 = this.f9580a;
        if (i12 > i13) {
            throw new IllegalArgumentException(("Expected range (" + i12 + ") to be ≤ viewportSize=" + this.f9580a).toString());
        }
        float f10 = i10;
        float f11 = this.f9582c;
        if (f10 >= f11 && i11 <= i13 + f11) {
            return A.f21846a;
        }
        if (f10 >= f11) {
            i10 = i11 - i13;
        }
        Object objG = g(i10, eVar);
        return objG == b.e() ? objG : A.f21846a;
    }

    public final Object g(float f10, p129m8.e eVar) {
        Object objE = e(f10 - this.f9582c, eVar);
        return objE == b.e() ? objE : A.f21846a;
    }
}
