package p062g1;

import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.os.CancellationSignal;
import android.os.Looper;
import java.io.File;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import kotlin.jvm.internal.AbstractC1457h;
import kotlin.jvm.internal.n;
import kotlin.jvm.internal.o;
import p089i8.AbstractC1444s;
import p089i8.N;
import p089i8.U;
import p142o1.j;
import p142o1.k;
import p219v8.l;

/* JADX INFO: loaded from: classes.dex */
public abstract class q {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final c f21065o = new c(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected volatile p142o1.g f21066a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Executor f21067b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Executor f21068c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private p142o1.h f21069d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f21071f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f21072g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    protected List f21073h;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private p062g1.c f21076k;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final Map f21078m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Map f21079n;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final androidx.room.c f21070e = g();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private Map f21074i = new LinkedHashMap();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final ReentrantReadWriteLock f21075j = new ReentrantReadWriteLock();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final ThreadLocal f21077l = new ThreadLocal();

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Context f21080a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Class f21081b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final String f21082c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final List f21083d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final List f21084e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private List f21085f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private Executor f21086g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private Executor f21087h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private o1.h.c f21088i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private boolean f21089j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private d f21090k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private Intent f21091l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private boolean f21092m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private boolean f21093n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private long f21094o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private TimeUnit f21095p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private final e f21096q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private Set f21097r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        private Set f21098s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private String f21099t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        private File f21100u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        private Callable f21101v;

        public a(Context context, Class klass, String str) {
            n.h(context, "context");
            n.h(klass, "klass");
            this.f21080a = context;
            this.f21081b = klass;
            this.f21082c = str;
            this.f21083d = new ArrayList();
            this.f21084e = new ArrayList();
            this.f21085f = new ArrayList();
            this.f21090k = d.AUTOMATIC;
            this.f21092m = true;
            this.f21094o = -1L;
            this.f21096q = new e();
            this.f21097r = new LinkedHashSet();
        }

        public a a(b callback) {
            n.h(callback, "callback");
            this.f21083d.add(callback);
            return this;
        }

        public q b() {
            Executor executor = this.f21086g;
            if (executor == null && this.f21087h == null) {
                Executor executorF = p110l.c.f();
                this.f21087h = executorF;
                this.f21086g = executorF;
            } else if (executor != null && this.f21087h == null) {
                this.f21087h = executor;
            } else if (executor == null) {
                this.f21086g = this.f21087h;
            }
            Set set = this.f21098s;
            if (set != null) {
                n.e(set);
                Iterator it = set.iterator();
                while (it.hasNext()) {
                    int iIntValue = ((Number) it.next()).intValue();
                    if (this.f21097r.contains(Integer.valueOf(iIntValue))) {
                        throw new IllegalArgumentException(("Inconsistency detected. A Migration was supplied to addMigration(Migration... migrations) that has a start or end version equal to a start version supplied to fallbackToDestructiveMigrationFrom(int... startVersions). Start version: " + iIntValue).toString());
                    }
                }
            }
            o1.h.c vVar = this.f21088i;
            if (vVar == null) {
                vVar = new p152p1.f();
            }
            if (vVar != null) {
                if (this.f21094o > 0) {
                    if (this.f21082c == null) {
                        throw new IllegalArgumentException("Cannot create auto-closing database for an in-memory database.");
                    }
                    long j9 = this.f21094o;
                    TimeUnit timeUnit = this.f21095p;
                    if (timeUnit == null) {
                        throw new IllegalArgumentException("Required value was null.");
                    }
                    Executor executor2 = this.f21086g;
                    if (executor2 == null) {
                        throw new IllegalArgumentException("Required value was null.");
                    }
                    vVar = new p062g1.e(vVar, new p062g1.c(j9, timeUnit, executor2));
                }
                String str = this.f21099t;
                if (str != null || this.f21100u != null || this.f21101v != null) {
                    if (this.f21082c == null) {
                        throw new IllegalArgumentException("Cannot create from asset or file for an in-memory database.");
                    }
                    int i10 = str == null ? 0 : 1;
                    File file = this.f21100u;
                    int i11 = file == null ? 0 : 1;
                    Callable callable = this.f21101v;
                    if (i10 + i11 + (callable != null ? 1 : 0) != 1) {
                        throw new IllegalArgumentException("More than one of createFromAsset(), createFromInputStream(), and createFromFile() were called on this Builder, but the database can only be created using one of the three configurations.");
                    }
                    vVar = new v(str, file, callable, vVar);
                }
            } else {
                vVar = null;
            }
            o1.h.c cVar = vVar;
            if (cVar == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            Context context = this.f21080a;
            String str2 = this.f21082c;
            e eVar = this.f21096q;
            List list = this.f21083d;
            boolean z9 = this.f21089j;
            d dVarF = this.f21090k.f(context);
            Executor executor3 = this.f21086g;
            if (executor3 == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            Executor executor4 = this.f21087h;
            if (executor4 == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            p062g1.f fVar = new p062g1.f(context, str2, cVar, eVar, list, z9, dVarF, executor3, executor4, this.f21091l, this.f21092m, this.f21093n, this.f21097r, this.f21099t, this.f21100u, this.f21101v, null, this.f21084e, this.f21085f);
            q qVar = (q) p.b(this.f21081b, "_Impl");
            qVar.r(fVar);
            return qVar;
        }

        public a c() {
            this.f21092m = false;
            this.f21093n = true;
            return this;
        }
    }

    public static abstract class b {
        public abstract void a(p142o1.g gVar);

        public void b(p142o1.g db) {
            n.h(db, "db");
        }

        public void c(p142o1.g db) {
            n.h(db, "db");
        }
    }

    public static final class c {
        public /* synthetic */ c(AbstractC1457h abstractC1457h) {
            this();
        }

        private c() {
        }
    }

    public enum d {
        AUTOMATIC,
        TRUNCATE,
        WRITE_AHEAD_LOGGING;

        private final boolean e(ActivityManager activityManager) {
            return p142o1.c.b(activityManager);
        }

        public final d f(Context context) {
            n.h(context, "context");
            if (this != AUTOMATIC) {
                return this;
            }
            Object systemService = context.getSystemService("activity");
            ActivityManager activityManager = systemService instanceof ActivityManager ? (ActivityManager) systemService : null;
            return (activityManager == null || e(activityManager)) ? TRUNCATE : WRITE_AHEAD_LOGGING;
        }
    }

    public static class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Map f21106a = new LinkedHashMap();

        private final List b(List list, boolean z9, int i10, int i11) {
            boolean z10;
            do {
                if (z9) {
                    if (i10 >= i11) {
                        return list;
                    }
                } else if (i10 <= i11) {
                    return list;
                }
                TreeMap treeMap = (TreeMap) this.f21106a.get(Integer.valueOf(i10));
                if (treeMap != null) {
                    Iterator it = (z9 ? treeMap.descendingKeySet() : treeMap.keySet()).iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            z10 = false;
                            break;
                        }
                        Integer targetVersion = (Integer) it.next();
                        if (!z9) {
                            n.g(targetVersion, "targetVersion");
                            int iIntValue = targetVersion.intValue();
                            if (i11 <= iIntValue && iIntValue < i10) {
                                Object obj = treeMap.get(targetVersion);
                                n.e(obj);
                                list.add(obj);
                                i10 = targetVersion.intValue();
                                z10 = true;
                                break;
                                break;
                            }
                        } else {
                            int i12 = i10 + 1;
                            n.g(targetVersion, "targetVersion");
                            int iIntValue2 = targetVersion.intValue();
                            if (i12 <= iIntValue2 && iIntValue2 <= i11) {
                                Object obj2 = treeMap.get(targetVersion);
                                n.e(obj2);
                                list.add(obj2);
                                i10 = targetVersion.intValue();
                                z10 = true;
                                break;
                            }
                        }
                    }
                } else {
                    return null;
                }
            } while (z10);
            return null;
        }

        public List a(int i10, int i11) {
            if (i10 == i11) {
                return AbstractC1444s.l();
            }
            return b(new ArrayList(), i11 > i10, i10, i11);
        }
    }

    public static abstract class f {
    }

    static final class g extends o implements l {
        g() {
            super(1);
        }

        @Override // p219v8.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object f(p142o1.g it) {
            n.h(it, "it");
            q.this.s();
            return null;
        }
    }

    static final class h extends o implements l {
        h() {
            super(1);
        }

        @Override // p219v8.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object f(p142o1.g it) {
            n.h(it, "it");
            q.this.t();
            return null;
        }
    }

    public q() {
        Map mapSynchronizedMap = Collections.synchronizedMap(new LinkedHashMap());
        n.g(mapSynchronizedMap, "synchronizedMap(mutableMapOf())");
        this.f21078m = mapSynchronizedMap;
        this.f21079n = new LinkedHashMap();
    }

    private final Object A(Class cls, p142o1.h hVar) {
        if (cls.isInstance(hVar)) {
            return hVar;
        }
        if (hVar instanceof p062g1.g) {
            return A(cls, ((p062g1.g) hVar).a());
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void s() {
        c();
        p142o1.g gVarE0 = m().e0();
        l().u(gVarE0);
        if (gVarE0.L0()) {
            gVarE0.X();
        } else {
            gVarE0.h();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void t() {
        m().e0().l0();
        if (q()) {
            return;
        }
        l().m();
    }

    public static /* synthetic */ Cursor y(q qVar, j jVar, CancellationSignal cancellationSignal, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: query");
        }
        if ((i10 & 2) != 0) {
            cancellationSignal = null;
        }
        return qVar.x(jVar, cancellationSignal);
    }

    public void c() {
        if (!this.f21071f && v()) {
            throw new IllegalStateException("Cannot access database on the main thread since it may potentially lock the UI for a long period of time.");
        }
    }

    public void d() {
        if (!q() && this.f21077l.get() != null) {
            throw new IllegalStateException("Cannot access database on a different coroutine context inherited from a suspending transaction.");
        }
    }

    public void e() {
        c();
        p062g1.c cVar = this.f21076k;
        if (cVar == null) {
            s();
        } else {
            cVar.g(new g());
        }
    }

    public k f(String sql) {
        n.h(sql, "sql");
        c();
        d();
        return m().e0().w(sql);
    }

    protected abstract androidx.room.c g();

    protected abstract p142o1.h h(p062g1.f fVar);

    public void i() {
        p062g1.c cVar = this.f21076k;
        if (cVar == null) {
            t();
        } else {
            cVar.g(new h());
        }
    }

    public List j(Map autoMigrationSpecs) {
        n.h(autoMigrationSpecs, "autoMigrationSpecs");
        return AbstractC1444s.l();
    }

    public final Lock k() {
        ReentrantReadWriteLock.ReadLock lock = this.f21075j.readLock();
        n.g(lock, "readWriteLock.readLock()");
        return lock;
    }

    public androidx.room.c l() {
        return this.f21070e;
    }

    public p142o1.h m() {
        p142o1.h hVar = this.f21069d;
        if (hVar != null) {
            return hVar;
        }
        n.r("internalOpenHelper");
        return null;
    }

    public Executor n() {
        Executor executor = this.f21067b;
        if (executor != null) {
            return executor;
        }
        n.r("internalQueryExecutor");
        return null;
    }

    public Set o() {
        return U.d();
    }

    protected Map p() {
        return N.g();
    }

    public boolean q() {
        return m().e0().D0();
    }

    public void r(p062g1.f configuration) {
        n.h(configuration, "configuration");
        this.f21069d = h(configuration);
        Set setO = o();
        BitSet bitSet = new BitSet();
        Iterator it = setO.iterator();
        while (true) {
            int i10 = -1;
            if (it.hasNext()) {
                Class cls = (Class) it.next();
                int size = configuration.f21052r.size() - 1;
                if (size >= 0) {
                    while (true) {
                        int i11 = size - 1;
                        if (cls.isAssignableFrom(configuration.f21052r.get(size).getClass())) {
                            bitSet.set(size);
                            i10 = size;
                            break;
                        } else if (i11 < 0) {
                            break;
                        } else {
                            size = i11;
                        }
                    }
                }
                if (i10 < 0) {
                    throw new IllegalArgumentException(("A required auto migration spec (" + cls.getCanonicalName() + ") is missing in the database configuration.").toString());
                }
                this.f21074i.put(cls, configuration.f21052r.get(i10));
            } else {
                int size2 = configuration.f21052r.size() - 1;
                if (size2 >= 0) {
                    while (true) {
                        int i12 = size2 - 1;
                        if (!bitSet.get(size2)) {
                            throw new IllegalArgumentException("Unexpected auto migration specs found. Annotate AutoMigrationSpec implementation with @ProvidedAutoMigrationSpec annotation or remove this spec from the builder.");
                        }
                        if (i12 < 0) {
                            break;
                        } else {
                            size2 = i12;
                        }
                    }
                }
                Iterator it2 = j(this.f21074i).iterator();
                if (it2.hasNext()) {
                    androidx.appcompat.app.o.a(it2.next());
                    throw null;
                }
                u uVar = (u) A(u.class, m());
                if (uVar != null) {
                    uVar.g(configuration);
                }
                p062g1.d dVar = (p062g1.d) A(p062g1.d.class, m());
                if (dVar != null) {
                    this.f21076k = dVar.f21015r;
                    l().p(dVar.f21015r);
                }
                boolean z9 = configuration.f21041g == d.WRITE_AHEAD_LOGGING;
                m().setWriteAheadLoggingEnabled(z9);
                this.f21073h = configuration.f21039e;
                this.f21067b = configuration.f21042h;
                this.f21068c = new y(configuration.f21043i);
                this.f21071f = configuration.f21040f;
                this.f21072g = z9;
                if (configuration.f21044j != null) {
                    if (configuration.f21036b == null) {
                        throw new IllegalArgumentException("Required value was null.");
                    }
                    l().q(configuration.f21035a, configuration.f21036b, configuration.f21044j);
                }
                Map mapP = p();
                BitSet bitSet2 = new BitSet();
                for (Map.Entry entry : mapP.entrySet()) {
                    Class cls2 = (Class) entry.getKey();
                    for (Class cls3 : (List) entry.getValue()) {
                        int size3 = configuration.f21051q.size() - 1;
                        if (size3 < 0) {
                            size3 = -1;
                            break;
                        }
                        while (true) {
                            int i13 = size3 - 1;
                            if (cls3.isAssignableFrom(configuration.f21051q.get(size3).getClass())) {
                                bitSet2.set(size3);
                                break;
                            } else {
                                if (i13 < 0) {
                                    size3 = -1;
                                    break;
                                }
                                size3 = i13;
                            }
                        }
                        if (size3 < 0) {
                            throw new IllegalArgumentException(("A required type converter (" + cls3 + ") for " + cls2.getCanonicalName() + " is missing in the database configuration.").toString());
                        }
                        this.f21079n.put(cls3, configuration.f21051q.get(size3));
                    }
                }
                int size4 = configuration.f21051q.size() - 1;
                if (size4 < 0) {
                    return;
                }
                while (true) {
                    int i14 = size4 - 1;
                    if (!bitSet2.get(size4)) {
                        throw new IllegalArgumentException("Unexpected type converter " + configuration.f21051q.get(size4) + ". Annotate TypeConverter class with @ProvidedTypeConverter annotation or remove this converter from the builder.");
                    }
                    if (i14 < 0) {
                        return;
                    } else {
                        size4 = i14;
                    }
                }
            }
        }
    }

    protected void u(p142o1.g db) {
        n.h(db, "db");
        l().j(db);
    }

    public final boolean v() {
        return Looper.getMainLooper().getThread() == Thread.currentThread();
    }

    public final boolean w() {
        p142o1.g gVar = this.f21066a;
        return gVar != null && gVar.isOpen();
    }

    public Cursor x(j query, CancellationSignal cancellationSignal) {
        n.h(query, "query");
        c();
        d();
        return cancellationSignal != null ? m().e0().K0(query, cancellationSignal) : m().e0().R0(query);
    }

    public void z() {
        m().e0().T();
    }
}
