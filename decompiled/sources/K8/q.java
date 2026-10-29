package K8;

import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.AbstractC1457h;

/* JADX INFO: loaded from: classes2.dex */
public final class q {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f4183e = new a(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f4184f = AtomicReferenceFieldUpdater.newUpdater(q.class, Object.class, "_next$volatile");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final /* synthetic */ AtomicLongFieldUpdater f4185g = AtomicLongFieldUpdater.newUpdater(q.class, "_state$volatile");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final D f4186h = new D("REMOVE_FROZEN");
    private volatile /* synthetic */ Object _next$volatile;
    private volatile /* synthetic */ long _state$volatile;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f4187a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f4188b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f4189c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final /* synthetic */ AtomicReferenceArray f4190d;

    public static final class a {
        public /* synthetic */ a(AbstractC1457h abstractC1457h) {
            this();
        }

        public final int a(long j9) {
            return (j9 & 2305843009213693952L) != 0 ? 2 : 1;
        }

        public final long b(long j9, int i10) {
            return d(j9, 1073741823L) | ((long) i10);
        }

        public final long c(long j9, int i10) {
            return d(j9, 1152921503533105152L) | (((long) i10) << 30);
        }

        public final long d(long j9, long j10) {
            return j9 & (~j10);
        }

        private a() {
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f4191a;

        public b(int i10) {
            this.f4191a = i10;
        }
    }

    public q(int i10, boolean z9) {
        this.f4187a = i10;
        this.f4188b = z9;
        int i11 = i10 - 1;
        this.f4189c = i11;
        this.f4190d = new AtomicReferenceArray(i10);
        if (i11 > 1073741823) {
            throw new IllegalStateException("Check failed.");
        }
        if ((i10 & i11) != 0) {
            throw new IllegalStateException("Check failed.");
        }
    }

    private final q b(long j9) {
        q qVar = new q(this.f4187a * 2, this.f4188b);
        int i10 = (int) (1073741823 & j9);
        int i11 = (int) ((1152921503533105152L & j9) >> 30);
        while (true) {
            int i12 = this.f4189c;
            if ((i10 & i12) == (i12 & i11)) {
                f4185g.set(qVar, f4183e.d(j9, 1152921504606846976L));
                return qVar;
            }
            Object bVar = f().get(this.f4189c & i10);
            if (bVar == null) {
                bVar = new b(i10);
            }
            qVar.f().set(qVar.f4189c & i10, bVar);
            i10++;
        }
    }

    private final q c(long j9) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f4184f;
        while (true) {
            q qVar = (q) atomicReferenceFieldUpdater.get(this);
            if (qVar != null) {
                return qVar;
            }
            f4184f.compareAndSet(this, null, b(j9));
        }
    }

    private final q e(int i10, Object obj) {
        Object obj2 = f().get(this.f4189c & i10);
        if (!(obj2 instanceof b) || ((b) obj2).f4191a != i10) {
            return null;
        }
        f().set(i10 & this.f4189c, obj);
        return this;
    }

    private final /* synthetic */ AtomicReferenceArray f() {
        return this.f4190d;
    }

    private final long k() {
        AtomicLongFieldUpdater atomicLongFieldUpdater = f4185g;
        while (true) {
            long j9 = atomicLongFieldUpdater.get(this);
            if ((j9 & 1152921504606846976L) != 0) {
                return j9;
            }
            long j10 = 1152921504606846976L | j9;
            q qVar = this;
            if (atomicLongFieldUpdater.compareAndSet(qVar, j9, j10)) {
                return j10;
            }
            this = qVar;
        }
    }

    private final q n(int i10, int i11) {
        AtomicLongFieldUpdater atomicLongFieldUpdater = f4185g;
        while (true) {
            long j9 = atomicLongFieldUpdater.get(this);
            int i12 = (int) (1073741823 & j9);
            if ((1152921504606846976L & j9) != 0) {
                return this.l();
            }
            q qVar = this;
            if (f4185g.compareAndSet(qVar, j9, f4183e.b(j9, i11))) {
                qVar.f().set(qVar.f4189c & i12, null);
                return null;
            }
            this = qVar;
        }
    }

    public final int a(Object obj) {
        AtomicLongFieldUpdater atomicLongFieldUpdater = f4185g;
        while (true) {
            long j9 = atomicLongFieldUpdater.get(this);
            if ((3458764513820540928L & j9) != 0) {
                return f4183e.a(j9);
            }
            int i10 = (int) (1073741823 & j9);
            int i11 = (int) ((1152921503533105152L & j9) >> 30);
            int i12 = this.f4189c;
            if (((i11 + 2) & i12) == (i10 & i12)) {
                return 1;
            }
            if (this.f4188b || this.f().get(i11 & i12) == null) {
                q qVar = this;
                if (f4185g.compareAndSet(qVar, j9, f4183e.c(j9, (i11 + 1) & 1073741823))) {
                    qVar.f().set(i11 & i12, obj);
                    q qVarE = qVar;
                    while ((f4185g.get(qVarE) & 1152921504606846976L) != 0 && (qVarE = qVarE.l().e(i11, obj)) != null) {
                    }
                    return 0;
                }
                this = qVar;
            } else {
                int i13 = this.f4187a;
                if (i13 < 1024 || ((i11 - i10) & 1073741823) > (i13 >> 1)) {
                    return 1;
                }
            }
        }
    }

    public final boolean d() {
        AtomicLongFieldUpdater atomicLongFieldUpdater = f4185g;
        while (true) {
            long j9 = atomicLongFieldUpdater.get(this);
            if ((j9 & 2305843009213693952L) != 0) {
                return true;
            }
            if ((1152921504606846976L & j9) != 0) {
                return false;
            }
            q qVar = this;
            if (atomicLongFieldUpdater.compareAndSet(qVar, j9, 2305843009213693952L | j9)) {
                return true;
            }
            this = qVar;
        }
    }

    public final int g() {
        long j9 = f4185g.get(this);
        return 1073741823 & (((int) ((j9 & 1152921503533105152L) >> 30)) - ((int) (1073741823 & j9)));
    }

    public final boolean j() {
        long j9 = f4185g.get(this);
        return ((int) (1073741823 & j9)) == ((int) ((j9 & 1152921503533105152L) >> 30));
    }

    public final q l() {
        return c(k());
    }

    public final Object m() {
        AtomicLongFieldUpdater atomicLongFieldUpdater = f4185g;
        while (true) {
            long j9 = atomicLongFieldUpdater.get(this);
            if ((1152921504606846976L & j9) != 0) {
                return f4186h;
            }
            int i10 = (int) (1073741823 & j9);
            int i11 = this.f4189c;
            if ((((int) ((1152921503533105152L & j9) >> 30)) & i11) == (i11 & i10)) {
                return null;
            }
            Object obj = this.f().get(this.f4189c & i10);
            if (obj == null) {
                if (this.f4188b) {
                    return null;
                }
            } else {
                if (obj instanceof b) {
                    return null;
                }
                int i12 = (i10 + 1) & 1073741823;
                q qVar = this;
                if (f4185g.compareAndSet(qVar, j9, f4183e.b(j9, i12))) {
                    qVar.f().set(qVar.f4189c & i10, null);
                    return obj;
                }
                if (qVar.f4188b) {
                    q qVarN = qVar;
                    do {
                        qVarN = qVarN.n(i10, i12);
                    } while (qVarN != null);
                    return obj;
                }
                this = qVar;
            }
        }
    }
}
