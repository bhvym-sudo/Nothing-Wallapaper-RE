package p190t;

import D8.j;
import androidx.collection.N;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import kotlin.coroutines.jvm.internal.k;
import kotlin.jvm.internal.AbstractC1456g;
import p079h8.A;
import p129m8.e;
import p219v8.p;

/* JADX INFO: loaded from: classes.dex */
public final class d implements Set, p229w8.a {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final N f27848q;

    static final class a extends k implements p {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        Object f27850r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        Object f27851s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        int f27852t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        int f27853u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        int f27854v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        int f27855w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        long f27856x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        int f27857y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        private /* synthetic */ Object f27858z;

        a(e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final e create(Object obj, e eVar) {
            a aVar = d.this.new a(eVar);
            aVar.f27858z = obj;
            return aVar;
        }

        /* JADX WARN: Code duplicated, block: B:13:0x005a  */
        /* JADX WARN: Code duplicated, block: B:21:0x0097 A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:22:0x0099  */
        /* JADX WARN: Code duplicated, block: B:24:0x009f  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x0058 -> B:23:0x009d). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x005a -> B:14:0x006b). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0074 -> B:20:0x0094). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x0091 -> B:20:0x0094). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // kotlin.coroutines.jvm.internal.a
        public final java.lang.Object invokeSuspend(java.lang.Object r21) {
            /*
                r20 = this;
                r0 = r20
                java.lang.Object r1 = p139n8.b.e()
                int r2 = r0.f27857y
                r3 = 0
                r4 = 8
                r5 = 1
                if (r2 == 0) goto L33
                if (r2 != r5) goto L2b
                int r2 = r0.f27855w
                int r6 = r0.f27854v
                long r7 = r0.f27856x
                int r9 = r0.f27853u
                int r10 = r0.f27852t
                java.lang.Object r11 = r0.f27851s
                long[] r11 = (long[]) r11
                java.lang.Object r12 = r0.f27850r
                java.lang.Object[] r12 = (java.lang.Object[]) r12
                java.lang.Object r13 = r0.f27858z
                D8.j r13 = (D8.j) r13
                p079h8.r.b(r21)
                goto L94
            L2b:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
                r0.<init>(r1)
                throw r0
            L33:
                p079h8.r.b(r21)
                java.lang.Object r2 = r0.f27858z
                D8.j r2 = (D8.j) r2
                t.d r6 = p190t.d.this
                androidx.collection.N r6 = r6.a()
                java.lang.Object[] r7 = r6.f11289b
                long[] r6 = r6.f11288a
                int r8 = r6.length
                int r8 = r8 + (-2)
                if (r8 < 0) goto La2
                r9 = r3
            L4a:
                r10 = r6[r9]
                long r12 = ~r10
                r14 = 7
                long r12 = r12 << r14
                long r12 = r12 & r10
                r14 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
                long r12 = r12 & r14
                int r12 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
                if (r12 == 0) goto L9d
                int r12 = r9 - r8
                int r12 = ~r12
                int r12 = r12 >>> 31
                int r12 = 8 - r12
                r13 = r2
                r2 = r3
                r18 = r10
                r11 = r6
                r10 = r8
                r6 = r12
                r12 = r7
                r7 = r18
            L6b:
                if (r2 >= r6) goto L97
                r14 = 255(0xff, double:1.26E-321)
                long r14 = r14 & r7
                r16 = 128(0x80, double:6.3E-322)
                int r14 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
                if (r14 >= 0) goto L94
                int r14 = r9 << 3
                int r14 = r14 + r2
                r14 = r12[r14]
                r0.f27858z = r13
                r0.f27850r = r12
                r0.f27851s = r11
                r0.f27852t = r10
                r0.f27853u = r9
                r0.f27856x = r7
                r0.f27854v = r6
                r0.f27855w = r2
                r0.f27857y = r5
                java.lang.Object r14 = r13.c(r14, r0)
                if (r14 != r1) goto L94
                return r1
            L94:
                long r7 = r7 >> r4
                int r2 = r2 + r5
                goto L6b
            L97:
                if (r6 != r4) goto La2
                r8 = r10
                r6 = r11
                r7 = r12
                r2 = r13
            L9d:
                if (r9 == r8) goto La2
                int r9 = r9 + 1
                goto L4a
            La2:
                h8.A r0 = p079h8.A.f21846a
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: t.d.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // p219v8.p
        /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
        public final Object invoke(j jVar, e eVar) {
            return ((a) create(jVar, eVar)).invokeSuspend(A.f21846a);
        }
    }

    public d(N n9) {
        this.f27848q = n9;
    }

    public final N a() {
        return this.f27848q;
    }

    @Override // java.util.Set, java.util.Collection
    public boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Set, java.util.Collection
    public boolean addAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public int b() {
        return this.f27848q.c();
    }

    @Override // java.util.Set, java.util.Collection
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Set, java.util.Collection
    public boolean contains(Object obj) {
        return this.f27848q.a(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public boolean containsAll(Collection collection) {
        Collection collection2 = collection;
        if ((collection2 instanceof Collection) && collection2.isEmpty()) {
            return true;
        }
        Iterator it = collection2.iterator();
        while (it.hasNext()) {
            if (!this.f27848q.a(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public boolean isEmpty() {
        return this.f27848q.d();
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public Iterator iterator() {
        return D8.k.a(new a(null));
    }

    @Override // java.util.Set, java.util.Collection
    public boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Set, java.util.Collection
    public boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Set, java.util.Collection
    public boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Set, java.util.Collection
    public final /* bridge */ int size() {
        return b();
    }

    @Override // java.util.Set, java.util.Collection
    public Object[] toArray() {
        return AbstractC1456g.a(this);
    }

    @Override // java.util.Set, java.util.Collection
    public Object[] toArray(Object[] objArr) {
        return AbstractC1456g.b(this, objArr);
    }
}
