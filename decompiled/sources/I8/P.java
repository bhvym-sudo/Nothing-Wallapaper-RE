package I8;

import J8.AbstractC0906b;
import java.util.List;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import p089i8.AbstractC1444s;

/* JADX INFO: loaded from: classes2.dex */
final class P extends AbstractC0906b implements A, InterfaceC0880f, J8.q {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f3194v = AtomicReferenceFieldUpdater.newUpdater(P.class, Object.class, "_state$volatile");
    private volatile /* synthetic */ Object _state$volatile;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private int f3195u;

    static final class a extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        Object f3196q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        Object f3197r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        Object f3198s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        Object f3199t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        Object f3200u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        /* synthetic */ Object f3201v;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        int f3203x;

        a(p129m8.e eVar) {
            super(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f3201v = obj;
            this.f3203x |= Integer.MIN_VALUE;
            return P.this.a(null, this);
        }
    }

    public P(Object obj) {
        this._state$volatile = obj;
    }

    private final boolean t(Object obj, Object obj2) {
        int i10;
        J8.d[] dVarArrP;
        synchronized (this) {
            Object obj3 = f3194v.get(this);
            if (obj != null && !kotlin.jvm.internal.n.d(obj3, obj)) {
                return false;
            }
            if (kotlin.jvm.internal.n.d(obj3, obj2)) {
                return true;
            }
            f3194v.set(this, obj2);
            int i11 = this.f3195u;
            if ((i11 & 1) != 0) {
                this.f3195u = i11 + 2;
                return true;
            }
            int i12 = i11 + 1;
            this.f3195u = i12;
            J8.d[] dVarArrP2 = p();
            p079h8.A a10 = p079h8.A.f21846a;
            while (true) {
                S[] sArr = (S[]) dVarArrP2;
                if (sArr != null) {
                    for (S s9 : sArr) {
                        if (s9 != null) {
                            s9.g();
                        }
                    }
                }
                synchronized (this) {
                    i10 = this.f3195u;
                    if (i10 == i12) {
                        this.f3195u = i12 + 1;
                        return true;
                    }
                    dVarArrP = p();
                    p079h8.A a11 = p079h8.A.f21846a;
                }
                dVarArrP2 = dVarArrP;
                i12 = i10;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0095 A[Catch: all -> 0x0042, PHI: r2 r6 r7 r9 r10
      0x0095: PHI (r2v7 ??) = (r2v14 ??), (r2v15 ??), (r2v16 ??), (r2v17 ??) binds: [B:31:0x0091, B:47:0x00c9, B:49:0x00db, B:15:0x003e] A[DONT_GENERATE, DONT_INLINE]
      0x0095: PHI (r6v3 I8.g) = (r6v1 I8.g), (r6v2 I8.g), (r6v2 I8.g), (r6v7 I8.g) binds: [B:31:0x0091, B:47:0x00c9, B:49:0x00db, B:15:0x003e] A[DONT_GENERATE, DONT_INLINE]
      0x0095: PHI (r7v5 ??) = (r7v3 ??), (r7v10 ??), (r7v11 ??), (r7v12 ??) binds: [B:31:0x0091, B:47:0x00c9, B:49:0x00db, B:15:0x003e] A[DONT_GENERATE, DONT_INLINE]
      0x0095: PHI (r9v8 java.lang.Object) = (r9v6 java.lang.Object), (r9v7 java.lang.Object), (r9v7 java.lang.Object), (r9v22 java.lang.Object) binds: [B:31:0x0091, B:47:0x00c9, B:49:0x00db, B:15:0x003e] A[DONT_GENERATE, DONT_INLINE]
      0x0095: PHI (r10v5 F8.x0) = (r10v3 F8.x0), (r10v4 F8.x0), (r10v4 F8.x0), (r10v12 F8.x0) binds: [B:31:0x0091, B:47:0x00c9, B:49:0x00db, B:15:0x003e] A[DONT_GENERATE, DONT_INLINE], TRY_ENTER, TryCatch #0 {all -> 0x0042, blocks: (B:15:0x003e, B:32:0x0095, B:34:0x009f, B:36:0x00a4, B:46:0x00c5, B:48:0x00cb, B:38:0x00aa, B:42:0x00b1, B:22:0x005f), top: B:53:0x0023 }] */
    /* JADX WARN: Code duplicated, block: B:34:0x009f A[Catch: all -> 0x0042, TryCatch #0 {all -> 0x0042, blocks: (B:15:0x003e, B:32:0x0095, B:34:0x009f, B:36:0x00a4, B:46:0x00c5, B:48:0x00cb, B:38:0x00aa, B:42:0x00b1, B:22:0x005f), top: B:53:0x0023 }] */
    /* JADX WARN: Code duplicated, block: B:36:0x00a4 A[Catch: all -> 0x0042, TryCatch #0 {all -> 0x0042, blocks: (B:15:0x003e, B:32:0x0095, B:34:0x009f, B:36:0x00a4, B:46:0x00c5, B:48:0x00cb, B:38:0x00aa, B:42:0x00b1, B:22:0x005f), top: B:53:0x0023 }] */
    /* JADX WARN: Code duplicated, block: B:40:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:41:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:44:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:45:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:48:0x00cb A[Catch: all -> 0x0042, TRY_LEAVE, TryCatch #0 {all -> 0x0042, blocks: (B:15:0x003e, B:32:0x0095, B:34:0x009f, B:36:0x00a4, B:46:0x00c5, B:48:0x00cb, B:38:0x00aa, B:42:0x00b1, B:22:0x005f), top: B:53:0x0023 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v2, types: [J8.d] */
    /* JADX WARN: Type inference failed for: r2v20 */
    /* JADX WARN: Type inference failed for: r2v21 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6, types: [I8.S, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v9, types: [I8.S] */
    /* JADX WARN: Type inference failed for: r7v1, types: [J8.b] */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v14 */
    /* JADX WARN: Type inference failed for: r7v15 */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v4, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v5, types: [java.lang.Object] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:47:0x00c9 -> B:32:0x0095). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:49:0x00db -> B:32:0x0095). Please report as a decompilation issue!!! */
    /*  JADX ERROR: StackOverflowError in pass: RegionMakerVisitor
        java.lang.StackOverflowError
        	at jadx.core.utils.BlockUtils.traverseSuccessorsUntil(BlockUtils.java:731)
        	at jadx.core.utils.BlockUtils.traverseSuccessorsUntil(BlockUtils.java:749)
        */
    @Override // I8.E, I8.InterfaceC0880f
    public java.lang.Object a(I8.InterfaceC0881g r10, p129m8.e r11) {
        /*
            Method dump skipped, instruction units count: 226
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: I8.P.a(I8.g, m8.e):java.lang.Object");
    }

    @Override // I8.z, I8.InterfaceC0881g
    public Object b(Object obj, p129m8.e eVar) {
        setValue(obj);
        return p079h8.A.f21846a;
    }

    @Override // I8.E
    public List c() {
        return AbstractC1444s.e(getValue());
    }

    @Override // I8.A
    public boolean d(Object obj, Object obj2) {
        if (obj == null) {
            obj = J8.t.f3956a;
        }
        if (obj2 == null) {
            obj2 = J8.t.f3956a;
        }
        return t(obj, obj2);
    }

    @Override // J8.q
    public InterfaceC0880f e(p129m8.i iVar, int i10, H8.a aVar) {
        return Q.d(this, iVar, i10, aVar);
    }

    @Override // I8.z
    public void g() {
        throw new UnsupportedOperationException("MutableStateFlow.resetReplayCache is not supported");
    }

    @Override // I8.A, I8.O
    public Object getValue() {
        K8.D d10 = J8.t.f3956a;
        Object obj = f3194v.get(this);
        if (obj == d10) {
            return null;
        }
        return obj;
    }

    @Override // I8.z
    public boolean h(Object obj) {
        setValue(obj);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // J8.AbstractC0906b
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public S k() {
        return new S();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // J8.AbstractC0906b
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public S[] m(int i10) {
        return new S[i10];
    }

    @Override // I8.A
    public void setValue(Object obj) {
        if (obj == null) {
            obj = J8.t.f3956a;
        }
        t(null, obj);
    }
}
