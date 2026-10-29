package U2;

import I8.InterfaceC0880f;
import I8.O;
import kotlin.coroutines.jvm.internal.d;
import kotlin.jvm.internal.n;
import p079h8.A;
import p129m8.e;
import p139n8.b;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final T2.a f7834a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterfaceC0880f f7835b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final O f7836c;

    /* JADX INFO: renamed from: U2.a$a, reason: collision with other inner class name */
    static final class C0288a extends d {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        Object f7837q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        /* synthetic */ Object f7838r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        int f7840t;

        C0288a(e eVar) {
            super(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f7838r = obj;
            this.f7840t |= Integer.MIN_VALUE;
            return a.this.c(this);
        }
    }

    public a(T2.a repository) {
        n.h(repository, "repository");
        this.f7834a = repository;
        this.f7835b = repository.c();
        this.f7836c = repository.b();
    }

    public final Object a(e eVar) {
        return this.f7834a.d(eVar);
    }

    public final Object b(boolean z9, e eVar) {
        Object objE = this.f7834a.e(z9, eVar);
        return objE == b.e() ? objE : A.f21846a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0064, code lost:
    
        if (r5.f7834a.e(!r6, r0) == r1) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(p129m8.e r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof U2.a.C0288a
            if (r0 == 0) goto L13
            r0 = r6
            U2.a$a r0 = (U2.a.C0288a) r0
            int r1 = r0.f7840t
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f7840t = r1
            goto L18
        L13:
            U2.a$a r0 = new U2.a$a
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f7838r
            java.lang.Object r1 = p139n8.b.e()
            int r2 = r0.f7840t
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3c
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            p079h8.r.b(r6)
            goto L67
        L2c:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L34:
            java.lang.Object r5 = r0.f7837q
            U2.a r5 = (U2.a) r5
            p079h8.r.b(r6)
            goto L4c
        L3c:
            p079h8.r.b(r6)
            T2.a r6 = r5.f7834a
            r0.f7837q = r5
            r0.f7840t = r4
            java.lang.Object r6 = r6.d(r0)
            if (r6 != r1) goto L4c
            goto L66
        L4c:
            I8.O r6 = (I8.O) r6
            java.lang.Object r6 = r6.getValue()
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            T2.a r5 = r5.f7834a
            r6 = r6 ^ r4
            r2 = 0
            r0.f7837q = r2
            r0.f7840t = r3
            java.lang.Object r5 = r5.e(r6, r0)
            if (r5 != r1) goto L67
        L66:
            return r1
        L67:
            h8.A r5 = p079h8.A.f21846a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: U2.a.c(m8.e):java.lang.Object");
    }
}
