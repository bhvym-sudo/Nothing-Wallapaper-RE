package androidx.compose.ui.platform;

import F8.AbstractC0816i;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public final class T {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final T f11780a = new T();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final AtomicBoolean f11781b = new AtomicBoolean(false);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final AtomicBoolean f11782c = new AtomicBoolean(false);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f11783d = 8;

    static final class a extends kotlin.coroutines.jvm.internal.l implements p219v8.p {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        Object f11784q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        Object f11785r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        int f11786s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ H8.g f11787t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(H8.g gVar, p129m8.e eVar) {
            super(2, eVar);
            this.f11787t = gVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final p129m8.e create(Object obj, p129m8.e eVar) {
            return new a(this.f11787t, eVar);
        }

        @Override // p219v8.p
        public final Object invoke(F8.L l9, p129m8.e eVar) {
            return ((a) create(l9, eVar)).invokeSuspend(p079h8.A.f21846a);
        }

        /* JADX WARN: Code duplicated, block: B:16:0x0037 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:19:0x0040 A[Catch: all -> 0x0017, TryCatch #0 {all -> 0x0017, blocks: (B:6:0x0013, B:17:0x0038, B:19:0x0040, B:14:0x002b, B:20:0x0054, B:13:0x0026), top: B:27:0x0007 }] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x0035 -> B:17:0x0038). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // kotlin.coroutines.jvm.internal.a
        public final java.lang.Object invokeSuspend(java.lang.Object r6) {
            /*
                r5 = this;
                java.lang.Object r0 = p139n8.b.e()
                int r1 = r5.f11786s
                r2 = 1
                if (r1 == 0) goto L21
                if (r1 != r2) goto L19
                java.lang.Object r1 = r5.f11785r
                H8.i r1 = (H8.i) r1
                java.lang.Object r3 = r5.f11784q
                H8.v r3 = (H8.v) r3
                p079h8.r.b(r6)     // Catch: java.lang.Throwable -> L17
                goto L38
            L17:
                r5 = move-exception
                goto L5d
            L19:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r6)
                throw r5
            L21:
                p079h8.r.b(r6)
                H8.g r3 = r5.f11787t
                H8.i r6 = r3.iterator()     // Catch: java.lang.Throwable -> L17
                r1 = r6
            L2b:
                r5.f11784q = r3     // Catch: java.lang.Throwable -> L17
                r5.f11785r = r1     // Catch: java.lang.Throwable -> L17
                r5.f11786s = r2     // Catch: java.lang.Throwable -> L17
                java.lang.Object r6 = r1.a(r5)     // Catch: java.lang.Throwable -> L17
                if (r6 != r0) goto L38
                return r0
            L38:
                java.lang.Boolean r6 = (java.lang.Boolean) r6     // Catch: java.lang.Throwable -> L17
                boolean r6 = r6.booleanValue()     // Catch: java.lang.Throwable -> L17
                if (r6 == 0) goto L54
                java.lang.Object r6 = r1.next()     // Catch: java.lang.Throwable -> L17
                h8.A r6 = (p079h8.A) r6     // Catch: java.lang.Throwable -> L17
                java.util.concurrent.atomic.AtomicBoolean r6 = androidx.compose.ui.platform.T.a()     // Catch: java.lang.Throwable -> L17
                r4 = 0
                r6.set(r4)     // Catch: java.lang.Throwable -> L17
                A.k$a r6 = A.k.f25e     // Catch: java.lang.Throwable -> L17
                r6.n()     // Catch: java.lang.Throwable -> L17
                goto L2b
            L54:
                h8.A r5 = p079h8.A.f21846a     // Catch: java.lang.Throwable -> L17
                r5 = 0
                H8.m.a(r3, r5)
                h8.A r5 = p079h8.A.f21846a
                return r5
            L5d:
                throw r5     // Catch: java.lang.Throwable -> L5e
            L5e:
                r6 = move-exception
                H8.m.a(r3, r5)
                throw r6
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.T.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    static final class b extends kotlin.jvm.internal.o implements p219v8.l {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ H8.g f11788r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(H8.g gVar) {
            super(1);
            this.f11788r = gVar;
        }

        public final void a(Object obj) {
            if (T.f11782c.compareAndSet(false, true)) {
                this.f11788r.p(p079h8.A.f21846a);
            }
        }

        @Override // p219v8.l
        public /* bridge */ /* synthetic */ Object f(Object obj) {
            a(obj);
            return p079h8.A.f21846a;
        }
    }

    private T() {
    }

    public final void b() {
        if (f11781b.compareAndSet(false, true)) {
            H8.g gVarB = H8.j.b(1, null, null, 6, null);
            AbstractC0816i.d(F8.M.a(D.f11685C.b()), null, null, new a(gVarB, null), 3, null);
            A.k.f25e.k(new b(gVarB));
        }
    }
}
