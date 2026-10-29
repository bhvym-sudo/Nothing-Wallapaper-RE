package p062g1;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import kotlin.jvm.internal.AbstractC1457h;
import kotlin.jvm.internal.n;
import p079h8.A;
import p142o1.i;
import p142o1.j;

/* JADX INFO: loaded from: classes.dex */
public final class t implements j, i {

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final a f21118y = new a(null);

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final TreeMap f21119z = new TreeMap();

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final int f21120q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private volatile String f21121r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final long[] f21122s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final double[] f21123t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final String[] f21124u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final byte[][] f21125v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final int[] f21126w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private int f21127x;

    public static final class a {
        public /* synthetic */ a(AbstractC1457h abstractC1457h) {
            this();
        }

        public final t a(String query, int i10) {
            n.h(query, "query");
            TreeMap treeMap = t.f21119z;
            synchronized (treeMap) {
                Map.Entry entryCeilingEntry = treeMap.ceilingEntry(Integer.valueOf(i10));
                if (entryCeilingEntry == null) {
                    A a10 = A.f21846a;
                    t tVar = new t(i10, null);
                    tVar.j(query, i10);
                    return tVar;
                }
                treeMap.remove(entryCeilingEntry.getKey());
                t sqliteQuery = (t) entryCeilingEntry.getValue();
                sqliteQuery.j(query, i10);
                n.g(sqliteQuery, "sqliteQuery");
                return sqliteQuery;
            }
        }

        public final void b() {
            TreeMap treeMap = t.f21119z;
            if (treeMap.size() <= 15) {
                return;
            }
            int size = treeMap.size() - 10;
            Iterator it = treeMap.descendingKeySet().iterator();
            n.g(it, "queryPool.descendingKeySet().iterator()");
            while (true) {
                int i10 = size - 1;
                if (size <= 0) {
                    return;
                }
                it.next();
                it.remove();
                size = i10;
            }
        }

        private a() {
        }
    }

    public /* synthetic */ t(int i10, AbstractC1457h abstractC1457h) {
        this(i10);
    }

    public static final t f(String str, int i10) {
        return f21118y.a(str, i10);
    }

    @Override // p142o1.i
    public void C(int i10, double d10) {
        this.f21126w[i10] = 3;
        this.f21123t[i10] = d10;
    }

    @Override // p142o1.i
    public void P(int i10, long j9) {
        this.f21126w[i10] = 2;
        this.f21122s[i10] = j9;
    }

    @Override // p142o1.j
    public String a() {
        String str = this.f21121r;
        if (str != null) {
            return str;
        }
        throw new IllegalStateException("Required value was null.");
    }

    @Override // p142o1.i
    public void a0(int i10, byte[] value) {
        n.h(value, "value");
        this.f21126w[i10] = 5;
        this.f21125v[i10] = value;
    }

    @Override // p142o1.j
    public void b(i statement) {
        n.h(statement, "statement");
        int iG = g();
        if (1 > iG) {
            return;
        }
        int i10 = 1;
        while (true) {
            int i11 = this.f21126w[i10];
            if (i11 == 1) {
                statement.x0(i10);
            } else if (i11 == 2) {
                statement.P(i10, this.f21122s[i10]);
            } else if (i11 == 3) {
                statement.C(i10, this.f21123t[i10]);
            } else if (i11 == 4) {
                String str = this.f21124u[i10];
                if (str == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                statement.r(i10, str);
            } else if (i11 == 5) {
                byte[] bArr = this.f21125v[i10];
                if (bArr == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                statement.a0(i10, bArr);
            }
            if (i10 == iG) {
                return;
            } else {
                i10++;
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    public int g() {
        return this.f21127x;
    }

    public final void j(String query, int i10) {
        n.h(query, "query");
        this.f21121r = query;
        this.f21127x = i10;
    }

    @Override // p142o1.i
    public void r(int i10, String value) {
        n.h(value, "value");
        this.f21126w[i10] = 4;
        this.f21124u[i10] = value;
    }

    public final void u() {
        TreeMap treeMap = f21119z;
        synchronized (treeMap) {
            treeMap.put(Integer.valueOf(this.f21120q), this);
            f21118y.b();
            A a10 = A.f21846a;
        }
    }

    @Override // p142o1.i
    public void x0(int i10) {
        this.f21126w[i10] = 1;
    }

    private t(int i10) {
        this.f21120q = i10;
        int i11 = i10 + 1;
        this.f21126w = new int[i11];
        this.f21122s = new long[i11];
        this.f21123t = new double[i11];
        this.f21124u = new String[i11];
        this.f21125v = new byte[i11][];
    }
}
