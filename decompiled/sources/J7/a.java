package J7;

import F8.AbstractC0816i;
import F8.L;
import androidx.lifecycle.Q;
import p079h8.A;
import p079h8.q;
import p079h8.r;

/* JADX INFO: loaded from: classes2.dex */
public final class a implements o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Q f3612a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f3613b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f3614c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final O8.a f3615d;

    /* JADX INFO: renamed from: J7.a$a, reason: collision with other inner class name */
    static final class C0125a extends kotlin.coroutines.jvm.internal.l implements p219v8.p {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        Object f3616q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        Object f3617r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        Object f3618s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        Object f3619t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        int f3620u;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        final /* synthetic */ U5.a f3622w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        final /* synthetic */ p079h8.o f3623x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0125a(U5.a aVar, p079h8.o oVar, p129m8.e eVar) {
            super(2, eVar);
            this.f3622w = aVar;
            this.f3623x = oVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final p129m8.e create(Object obj, p129m8.e eVar) {
            return a.this.new C0125a(this.f3622w, this.f3623x, eVar);
        }

        @Override // p219v8.p
        public final Object invoke(L l9, p129m8.e eVar) {
            return ((C0125a) create(l9, eVar)).invokeSuspend(A.f21846a);
        }

        /* JADX WARN: Code duplicated, block: B:31:0x0094  */
        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            O8.a aVar;
            p079h8.o oVar;
            U5.a aVar2;
            a aVar3;
            U5.a aVar4;
            Throwable th;
            O8.a aVar5;
            Object objE = p139n8.b.e();
            int i10 = this.f3620u;
            try {
                if (i10 == 0) {
                    r.b(obj);
                    aVar = a.this.f3615d;
                    U5.a aVar6 = this.f3622w;
                    p079h8.o oVar2 = this.f3623x;
                    a aVar7 = a.this;
                    this.f3616q = aVar;
                    this.f3617r = aVar6;
                    this.f3618s = oVar2;
                    this.f3619t = aVar7;
                    this.f3620u = 1;
                    if (aVar.c(null, this) != objE) {
                        oVar = oVar2;
                        aVar2 = aVar6;
                        aVar3 = aVar7;
                    }
                    return objE;
                }
                if (i10 != 1) {
                    if (i10 != 2) {
                        if (i10 != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        aVar5 = (O8.a) this.f3616q;
                        try {
                            r.b(obj);
                            A a10 = A.f21846a;
                            aVar5.b(null);
                            return A.f21846a;
                        } catch (Throwable th2) {
                            th = th2;
                            aVar5.b(null);
                            throw th;
                        }
                    }
                    aVar3 = (a) this.f3618s;
                    aVar4 = (U5.a) this.f3617r;
                    O8.a aVar8 = (O8.a) this.f3616q;
                    try {
                        r.b(obj);
                        aVar = aVar8;
                        this.f3616q = aVar;
                        this.f3617r = null;
                        this.f3618s = null;
                        this.f3620u = 3;
                        if (aVar3.m(aVar4, this) != objE) {
                            aVar5 = aVar;
                            A a11 = A.f21846a;
                            aVar5.b(null);
                            return A.f21846a;
                        }
                        return objE;
                    } catch (Throwable th3) {
                        th = th3;
                        aVar5 = aVar8;
                        aVar5.b(null);
                        throw th;
                    }
                }
                aVar3 = (a) this.f3619t;
                oVar = (p079h8.o) this.f3618s;
                aVar2 = (U5.a) this.f3617r;
                O8.a aVar9 = (O8.a) this.f3616q;
                r.b(obj);
                aVar = aVar9;
                this.f3616q = aVar;
                this.f3617r = aVar2;
                this.f3618s = aVar3;
                this.f3619t = null;
                this.f3620u = 2;
                if (aVar2.s(oVar, this) != objE) {
                    aVar4 = aVar2;
                    this.f3616q = aVar;
                    this.f3617r = null;
                    this.f3618s = null;
                    this.f3620u = 3;
                    if (aVar3.m(aVar4, this) != objE) {
                        aVar5 = aVar;
                        A a12 = A.f21846a;
                        aVar5.b(null);
                        return A.f21846a;
                    }
                }
                return objE;
            } catch (Throwable th4) {
                O8.a aVar10 = aVar;
                th = th4;
                aVar5 = aVar10;
                aVar5.b(null);
                throw th;
            }
        }
    }

    static final class b extends kotlin.coroutines.jvm.internal.l implements p219v8.p {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        Object f3624q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        Object f3625r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        Object f3626s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        int f3627t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        int f3628u;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        final /* synthetic */ U5.a f3630w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        final /* synthetic */ int f3631x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(U5.a aVar, int i10, p129m8.e eVar) {
            super(2, eVar);
            this.f3630w = aVar;
            this.f3631x = i10;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final p129m8.e create(Object obj, p129m8.e eVar) {
            return a.this.new b(this.f3630w, this.f3631x, eVar);
        }

        @Override // p219v8.p
        public final Object invoke(L l9, p129m8.e eVar) {
            return ((b) create(l9, eVar)).invokeSuspend(A.f21846a);
        }

        /* JADX WARN: Code duplicated, block: B:31:0x0092  */
        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            O8.a aVar;
            U5.a aVar2;
            int i10;
            a aVar3;
            a aVar4;
            U5.a aVar5;
            Throwable th;
            O8.a aVar6;
            Object objE = p139n8.b.e();
            int i11 = this.f3628u;
            try {
                if (i11 == 0) {
                    r.b(obj);
                    aVar = a.this.f3615d;
                    U5.a aVar7 = this.f3630w;
                    int i12 = this.f3631x;
                    a aVar8 = a.this;
                    this.f3624q = aVar;
                    this.f3625r = aVar7;
                    this.f3626s = aVar8;
                    this.f3627t = i12;
                    this.f3628u = 1;
                    if (aVar.c(null, this) != objE) {
                        aVar2 = aVar7;
                        i10 = i12;
                        aVar3 = aVar8;
                    }
                    return objE;
                }
                if (i11 != 1) {
                    if (i11 != 2) {
                        if (i11 != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        aVar6 = (O8.a) this.f3624q;
                        try {
                            r.b(obj);
                            A a10 = A.f21846a;
                            aVar6.b(null);
                            return A.f21846a;
                        } catch (Throwable th2) {
                            th = th2;
                            aVar6.b(null);
                            throw th;
                        }
                    }
                    aVar4 = (a) this.f3626s;
                    aVar5 = (U5.a) this.f3625r;
                    O8.a aVar9 = (O8.a) this.f3624q;
                    try {
                        r.b(obj);
                        aVar = aVar9;
                        this.f3624q = aVar;
                        this.f3625r = null;
                        this.f3626s = null;
                        this.f3628u = 3;
                        if (aVar4.m(aVar5, this) != objE) {
                            aVar6 = aVar;
                            A a11 = A.f21846a;
                            aVar6.b(null);
                            return A.f21846a;
                        }
                        return objE;
                    } catch (Throwable th3) {
                        th = th3;
                        aVar6 = aVar9;
                        aVar6.b(null);
                        throw th;
                    }
                }
                i10 = this.f3627t;
                aVar3 = (a) this.f3626s;
                aVar2 = (U5.a) this.f3625r;
                O8.a aVar10 = (O8.a) this.f3624q;
                r.b(obj);
                aVar = aVar10;
                this.f3624q = aVar;
                this.f3625r = aVar2;
                this.f3626s = aVar3;
                this.f3628u = 2;
                if (aVar2.g(i10, this) != objE) {
                    aVar4 = aVar3;
                    aVar5 = aVar2;
                    this.f3624q = aVar;
                    this.f3625r = null;
                    this.f3626s = null;
                    this.f3628u = 3;
                    if (aVar4.m(aVar5, this) != objE) {
                        aVar6 = aVar;
                        A a12 = A.f21846a;
                        aVar6.b(null);
                        return A.f21846a;
                    }
                }
                return objE;
            } catch (Throwable th4) {
                O8.a aVar11 = aVar;
                th = th4;
                aVar6 = aVar11;
                aVar6.b(null);
                throw th;
            }
        }
    }

    static final class c extends kotlin.coroutines.jvm.internal.l implements p219v8.p {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        Object f3632q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        Object f3633r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        Object f3634s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        boolean f3635t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        int f3636u;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        final /* synthetic */ U5.a f3638w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        final /* synthetic */ boolean f3639x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(U5.a aVar, boolean z9, p129m8.e eVar) {
            super(2, eVar);
            this.f3638w = aVar;
            this.f3639x = z9;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final p129m8.e create(Object obj, p129m8.e eVar) {
            return a.this.new c(this.f3638w, this.f3639x, eVar);
        }

        @Override // p219v8.p
        public final Object invoke(L l9, p129m8.e eVar) {
            return ((c) create(l9, eVar)).invokeSuspend(A.f21846a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            O8.a aVar;
            U5.a aVar2;
            boolean z9;
            a aVar3;
            Object objE = p139n8.b.e();
            int i10 = this.f3636u;
            if (i10 == 0) {
                r.b(obj);
                O8.a aVar4 = a.this.f3615d;
                U5.a aVar5 = this.f3638w;
                boolean z10 = this.f3639x;
                a aVar6 = a.this;
                this.f3632q = aVar4;
                this.f3633r = aVar5;
                this.f3634s = aVar6;
                this.f3635t = z10;
                this.f3636u = 1;
                if (aVar4.c(null, this) == objE) {
                    return objE;
                }
                aVar = aVar4;
                aVar2 = aVar5;
                z9 = z10;
                aVar3 = aVar6;
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                z9 = this.f3635t;
                aVar3 = (a) this.f3634s;
                aVar2 = (U5.a) this.f3633r;
                aVar = (O8.a) this.f3632q;
                r.b(obj);
            }
            try {
                aVar2.e(z9);
                aVar3.f3612a.i(aVar3.f3614c, kotlin.coroutines.jvm.internal.b.a(z9));
                A a10 = A.f21846a;
                return A.f21846a;
            } finally {
                aVar.b(null);
            }
        }
    }

    static final class d extends kotlin.coroutines.jvm.internal.l implements p219v8.p {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        Object f3640q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        Object f3641r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        Object f3642s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        int f3643t;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        final /* synthetic */ U5.a f3645v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(U5.a aVar, p129m8.e eVar) {
            super(2, eVar);
            this.f3645v = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final p129m8.e create(Object obj, p129m8.e eVar) {
            return a.this.new d(this.f3645v, eVar);
        }

        @Override // p219v8.p
        public final Object invoke(L l9, p129m8.e eVar) {
            return ((d) create(l9, eVar)).invokeSuspend(A.f21846a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            O8.a aVar;
            U5.a aVar2;
            a aVar3;
            Throwable th;
            O8.a aVar4;
            a aVar5;
            Object objE = p139n8.b.e();
            int i10 = this.f3643t;
            try {
                if (i10 == 0) {
                    r.b(obj);
                    aVar = a.this.f3615d;
                    U5.a aVar6 = this.f3645v;
                    a aVar7 = a.this;
                    this.f3640q = aVar;
                    this.f3641r = aVar6;
                    this.f3642s = aVar7;
                    this.f3643t = 1;
                    if (aVar.c(null, this) != objE) {
                        aVar2 = aVar6;
                        aVar3 = aVar7;
                    }
                    return objE;
                }
                if (i10 != 1) {
                    if (i10 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    aVar5 = (a) this.f3641r;
                    aVar4 = (O8.a) this.f3640q;
                    try {
                        r.b(obj);
                        aVar5.f3612a.f(aVar5.f3613b);
                        aVar5.f3612a.f(aVar5.f3614c);
                        A a10 = A.f21846a;
                        aVar4.b(null);
                        return A.f21846a;
                    } catch (Throwable th2) {
                        th = th2;
                        aVar4.b(null);
                        throw th;
                    }
                }
                aVar3 = (a) this.f3642s;
                aVar2 = (U5.a) this.f3641r;
                O8.a aVar8 = (O8.a) this.f3640q;
                r.b(obj);
                aVar = aVar8;
                this.f3640q = aVar;
                this.f3641r = aVar3;
                this.f3642s = null;
                this.f3643t = 2;
                if (aVar2.k(this) != objE) {
                    aVar4 = aVar;
                    aVar5 = aVar3;
                    aVar5.f3612a.f(aVar5.f3613b);
                    aVar5.f3612a.f(aVar5.f3614c);
                    A a11 = A.f21846a;
                    aVar4.b(null);
                    return A.f21846a;
                }
                return objE;
            } catch (Throwable th3) {
                O8.a aVar9 = aVar;
                th = th3;
                aVar4 = aVar9;
                aVar4.b(null);
                throw th;
            }
        }
    }

    static final class e extends kotlin.coroutines.jvm.internal.l implements p219v8.p {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        Object f3646q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        Object f3647r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        Object f3648s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        int f3649t;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        final /* synthetic */ U5.a f3651v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(U5.a aVar, p129m8.e eVar) {
            super(2, eVar);
            this.f3651v = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final p129m8.e create(Object obj, p129m8.e eVar) {
            return a.this.new e(this.f3651v, eVar);
        }

        @Override // p219v8.p
        public final Object invoke(L l9, p129m8.e eVar) {
            return ((e) create(l9, eVar)).invokeSuspend(A.f21846a);
        }

        /* JADX WARN: Code duplicated, block: B:31:0x0088  */
        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            O8.a aVar;
            U5.a aVar2;
            a aVar3;
            U5.a aVar4;
            Throwable th;
            O8.a aVar5;
            Object objE = p139n8.b.e();
            int i10 = this.f3649t;
            try {
                if (i10 == 0) {
                    r.b(obj);
                    aVar = a.this.f3615d;
                    U5.a aVar6 = this.f3651v;
                    a aVar7 = a.this;
                    this.f3646q = aVar;
                    this.f3647r = aVar6;
                    this.f3648s = aVar7;
                    this.f3649t = 1;
                    if (aVar.c(null, this) != objE) {
                        aVar2 = aVar6;
                        aVar3 = aVar7;
                    }
                    return objE;
                }
                if (i10 != 1) {
                    if (i10 != 2) {
                        if (i10 != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        aVar5 = (O8.a) this.f3646q;
                        try {
                            r.b(obj);
                            A a10 = A.f21846a;
                            aVar5.b(null);
                            return A.f21846a;
                        } catch (Throwable th2) {
                            th = th2;
                            aVar5.b(null);
                            throw th;
                        }
                    }
                    aVar3 = (a) this.f3648s;
                    aVar4 = (U5.a) this.f3647r;
                    O8.a aVar8 = (O8.a) this.f3646q;
                    try {
                        r.b(obj);
                        aVar = aVar8;
                        this.f3646q = aVar;
                        this.f3647r = null;
                        this.f3648s = null;
                        this.f3649t = 3;
                        if (aVar3.m(aVar4, this) != objE) {
                            aVar5 = aVar;
                            A a11 = A.f21846a;
                            aVar5.b(null);
                            return A.f21846a;
                        }
                        return objE;
                    } catch (Throwable th3) {
                        th = th3;
                        aVar5 = aVar8;
                        aVar5.b(null);
                        throw th;
                    }
                }
                aVar3 = (a) this.f3648s;
                aVar2 = (U5.a) this.f3647r;
                O8.a aVar9 = (O8.a) this.f3646q;
                r.b(obj);
                aVar = aVar9;
                this.f3646q = aVar;
                this.f3647r = aVar2;
                this.f3648s = aVar3;
                this.f3649t = 2;
                if (aVar2.d(this) != objE) {
                    aVar4 = aVar2;
                    this.f3646q = aVar;
                    this.f3647r = null;
                    this.f3648s = null;
                    this.f3649t = 3;
                    if (aVar3.m(aVar4, this) != objE) {
                        aVar5 = aVar;
                        A a12 = A.f21846a;
                        aVar5.b(null);
                        return A.f21846a;
                    }
                }
                return objE;
            } catch (Throwable th4) {
                O8.a aVar10 = aVar;
                th = th4;
                aVar5 = aVar10;
                aVar5.b(null);
                throw th;
            }
        }
    }

    static final class f extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        Object f3652q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        /* synthetic */ Object f3653r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        int f3655t;

        f(p129m8.e eVar) {
            super(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f3653r = obj;
            this.f3655t |= Integer.MIN_VALUE;
            return a.this.m(null, this);
        }
    }

    static final class g extends kotlin.coroutines.jvm.internal.l implements p219v8.p {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f3656q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private /* synthetic */ Object f3657r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        final /* synthetic */ U5.a f3658s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ String f3659t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(U5.a aVar, String str, p129m8.e eVar) {
            super(2, eVar);
            this.f3658s = aVar;
            this.f3659t = str;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final p129m8.e create(Object obj, p129m8.e eVar) {
            g gVar = new g(this.f3658s, this.f3659t, eVar);
            gVar.f3657r = obj;
            return gVar;
        }

        @Override // p219v8.p
        public final Object invoke(L l9, p129m8.e eVar) {
            return ((g) create(l9, eVar)).invokeSuspend(A.f21846a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objB;
            Object objE = p139n8.b.e();
            int i10 = this.f3656q;
            try {
                if (i10 == 0) {
                    r.b(obj);
                    U5.a aVar = this.f3658s;
                    String str = this.f3659t;
                    q.a aVar2 = q.f21862r;
                    this.f3656q = 1;
                    if (aVar.i(str, this) == objE) {
                        return objE;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    r.b(obj);
                }
                objB = q.b(A.f21846a);
            } catch (Throwable th) {
                q.a aVar3 = q.f21862r;
                objB = q.b(r.a(th));
            }
            U5.a aVar4 = this.f3658s;
            Throwable thD = q.d(objB);
            if (thD != null) {
                com.nothing.wallpaper.common.log.c.f("WidgetEditCoordinator", "restoreWidgetsFromSaveState failed: " + thD.getMessage());
                aVar4.f();
            }
            return A.f21846a;
        }
    }

    public a(Q savedStateHandle) {
        kotlin.jvm.internal.n.h(savedStateHandle, "savedStateHandle");
        this.f3612a = savedStateHandle;
        this.f3613b = "edit_widgets_json";
        this.f3614c = "expand_widget";
        this.f3615d = O8.g.b(false, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object m(U5.a aVar, p129m8.e eVar) {
        f fVar;
        Object objB;
        if (eVar instanceof f) {
            fVar = (f) eVar;
            int i10 = fVar.f3655t;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                fVar.f3655t = i10 - Integer.MIN_VALUE;
            } else {
                fVar = new f(eVar);
            }
        } else {
            fVar = new f(eVar);
        }
        Object objH = fVar.f3653r;
        Object objE = p139n8.b.e();
        int i11 = fVar.f3655t;
        try {
            if (i11 == 0) {
                r.b(objH);
                q.a aVar2 = q.f21862r;
                fVar.f3652q = this;
                fVar.f3655t = 1;
                objH = aVar.h(fVar);
                if (objH == objE) {
                    return objE;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                this = (a) fVar.f3652q;
                r.b(objH);
            }
            this.f3612a.i(this.f3613b, (String) objH);
            objB = q.b(A.f21846a);
        } catch (Throwable th) {
            q.a aVar3 = q.f21862r;
            objB = q.b(r.a(th));
        }
        Throwable thD = q.d(objB);
        if (thD != null) {
            com.nothing.wallpaper.common.log.c.f("WidgetEditCoordinator", "persistEditWidgetsToSavedState failed: " + thD.getMessage());
        }
        return A.f21846a;
    }

    @Override // J7.o
    public void a(U5.a repository) {
        kotlin.jvm.internal.n.h(repository, "repository");
        this.f3612a.f(this.f3613b);
        this.f3612a.f(this.f3614c);
        repository.f();
    }

    @Override // J7.o
    public void b(L scope, U5.a repository, boolean z9) {
        kotlin.jvm.internal.n.h(scope, "scope");
        kotlin.jvm.internal.n.h(repository, "repository");
        AbstractC0816i.d(scope, null, null, new c(repository, z9, null), 3, null);
    }

    @Override // J7.o
    public void c(L scope, U5.a repository) {
        kotlin.jvm.internal.n.h(scope, "scope");
        kotlin.jvm.internal.n.h(repository, "repository");
        AbstractC0816i.d(scope, null, null, new d(repository, null), 3, null);
    }

    @Override // J7.o
    public void d(L scope, U5.a repository) {
        kotlin.jvm.internal.n.h(scope, "scope");
        kotlin.jvm.internal.n.h(repository, "repository");
        Boolean bool = (Boolean) this.f3612a.d(this.f3614c);
        if (bool == null) {
            repository.z();
        } else {
            repository.e(bool.booleanValue());
        }
        com.nothing.wallpaper.common.log.c.d("WidgetEditCoordinator", "scheduleWidgetRestoreOnInit expand:" + bool);
        String str = (String) this.f3612a.d(this.f3613b);
        if (str == null || str.length() == 0) {
            repository.f();
        } else {
            AbstractC0816i.d(scope, null, null, new g(repository, str, null), 3, null);
        }
    }

    @Override // J7.o
    public void e(L scope, U5.a repository, p079h8.o info) {
        kotlin.jvm.internal.n.h(scope, "scope");
        kotlin.jvm.internal.n.h(repository, "repository");
        kotlin.jvm.internal.n.h(info, "info");
        AbstractC0816i.d(scope, null, null, new C0125a(repository, info, null), 3, null);
    }

    @Override // J7.o
    public void f(L scope, U5.a repository) {
        kotlin.jvm.internal.n.h(scope, "scope");
        kotlin.jvm.internal.n.h(repository, "repository");
        AbstractC0816i.d(scope, null, null, new e(repository, null), 3, null);
    }

    @Override // J7.o
    public void g(L scope, U5.a repository, int i10) {
        kotlin.jvm.internal.n.h(scope, "scope");
        kotlin.jvm.internal.n.h(repository, "repository");
        AbstractC0816i.d(scope, null, null, new b(repository, i10, null), 3, null);
    }
}
