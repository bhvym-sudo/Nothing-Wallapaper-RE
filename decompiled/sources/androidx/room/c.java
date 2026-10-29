package androidx.room;

import E8.i;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.util.Log;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.Lock;
import kotlin.jvm.internal.AbstractC1457h;
import kotlin.jvm.internal.n;
import p062g1.q;
import p079h8.A;
import p089i8.AbstractC1444s;
import p089i8.N;
import p089i8.U;
import p142o1.g;
import p142o1.k;

/* JADX INFO: loaded from: classes.dex */
public class c {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final a f13637q = new a(null);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final String[] f13638r = {"UPDATE", "DELETE", "INSERT"};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final q f13639a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map f13640b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Map f13641c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Map f13642d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String[] f13643e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private p062g1.c f13644f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final AtomicBoolean f13645g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private volatile boolean f13646h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private volatile k f13647i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final b f13648j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final p062g1.k f13649k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final p120m.b f13650l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private androidx.room.d f13651m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Object f13652n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final Object f13653o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final Runnable f13654p;

    public static final class a {
        public /* synthetic */ a(AbstractC1457h abstractC1457h) {
            this();
        }

        public final void a(g database) {
            n.h(database, "database");
            if (database.L0()) {
                database.X();
            } else {
                database.h();
            }
        }

        public final String b(String tableName, String triggerType) {
            n.h(tableName, "tableName");
            n.h(triggerType, "triggerType");
            return "`room_table_modification_trigger_" + tableName + '_' + triggerType + '`';
        }

        private a() {
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final a f13655e = new a(null);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final long[] f13656a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final boolean[] f13657b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int[] f13658c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private boolean f13659d;

        public static final class a {
            public /* synthetic */ a(AbstractC1457h abstractC1457h) {
                this();
            }

            private a() {
            }
        }

        public b(int i10) {
            this.f13656a = new long[i10];
            this.f13657b = new boolean[i10];
            this.f13658c = new int[i10];
        }

        public final int[] a() {
            synchronized (this) {
                try {
                    if (!this.f13659d) {
                        return null;
                    }
                    long[] jArr = this.f13656a;
                    int length = jArr.length;
                    int i10 = 0;
                    int i11 = 0;
                    while (i10 < length) {
                        int i12 = i11 + 1;
                        int i13 = 1;
                        boolean z9 = jArr[i10] > 0;
                        boolean[] zArr = this.f13657b;
                        if (z9 != zArr[i11]) {
                            int[] iArr = this.f13658c;
                            if (!z9) {
                                i13 = 2;
                            }
                            iArr[i11] = i13;
                        } else {
                            this.f13658c[i11] = 0;
                        }
                        zArr[i11] = z9;
                        i10++;
                        i11 = i12;
                    }
                    this.f13659d = false;
                    return (int[]) this.f13658c.clone();
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        public final boolean b(int... tableIds) {
            boolean z9;
            n.h(tableIds, "tableIds");
            synchronized (this) {
                try {
                    z9 = false;
                    for (int i10 : tableIds) {
                        long[] jArr = this.f13656a;
                        long j9 = jArr[i10];
                        jArr[i10] = 1 + j9;
                        if (j9 == 0) {
                            this.f13659d = true;
                            z9 = true;
                        }
                    }
                    A a10 = A.f21846a;
                } catch (Throwable th) {
                    throw th;
                }
            }
            return z9;
        }

        public final boolean c(int... tableIds) {
            boolean z9;
            n.h(tableIds, "tableIds");
            synchronized (this) {
                try {
                    z9 = false;
                    for (int i10 : tableIds) {
                        long[] jArr = this.f13656a;
                        long j9 = jArr[i10];
                        jArr[i10] = j9 - 1;
                        if (j9 == 1) {
                            this.f13659d = true;
                            z9 = true;
                        }
                    }
                    A a10 = A.f21846a;
                } catch (Throwable th) {
                    throw th;
                }
            }
            return z9;
        }

        public final void d() {
            synchronized (this) {
                Arrays.fill(this.f13657b, false);
                this.f13659d = true;
                A a10 = A.f21846a;
            }
        }
    }

    /* JADX INFO: renamed from: androidx.room.c$c, reason: collision with other inner class name */
    public static abstract class AbstractC0411c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String[] f13660a;

        public AbstractC0411c(String[] tables) {
            n.h(tables, "tables");
            this.f13660a = tables;
        }

        public final String[] a() {
            return this.f13660a;
        }

        public abstract boolean b();

        public abstract void c(Set set);
    }

    public static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final AbstractC0411c f13661a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int[] f13662b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final String[] f13663c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final Set f13664d;

        public d(AbstractC0411c observer, int[] tableIds, String[] tableNames) {
            n.h(observer, "observer");
            n.h(tableIds, "tableIds");
            n.h(tableNames, "tableNames");
            this.f13661a = observer;
            this.f13662b = tableIds;
            this.f13663c = tableNames;
            this.f13664d = !(tableNames.length == 0) ? U.c(tableNames[0]) : U.d();
            if (tableIds.length != tableNames.length) {
                throw new IllegalStateException("Check failed.");
            }
        }

        public final int[] a() {
            return this.f13662b;
        }

        public final void b(Set invalidatedTablesIds) {
            Set setD;
            n.h(invalidatedTablesIds, "invalidatedTablesIds");
            int[] iArr = this.f13662b;
            int length = iArr.length;
            if (length != 0) {
                int i10 = 0;
                if (length != 1) {
                    Set setB = U.b();
                    int[] iArr2 = this.f13662b;
                    int length2 = iArr2.length;
                    int i11 = 0;
                    while (i10 < length2) {
                        int i12 = i11 + 1;
                        if (invalidatedTablesIds.contains(Integer.valueOf(iArr2[i10]))) {
                            setB.add(this.f13663c[i11]);
                        }
                        i10++;
                        i11 = i12;
                    }
                    setD = U.a(setB);
                } else {
                    setD = invalidatedTablesIds.contains(Integer.valueOf(iArr[0])) ? this.f13664d : U.d();
                }
            } else {
                setD = U.d();
            }
            if (setD.isEmpty()) {
                return;
            }
            this.f13661a.c(setD);
        }

        public final void c(String[] tables) {
            Set setD;
            n.h(tables, "tables");
            int length = this.f13663c.length;
            if (length == 0) {
                setD = U.d();
            } else if (length == 1) {
                int length2 = tables.length;
                int i10 = 0;
                while (true) {
                    if (i10 >= length2) {
                        setD = U.d();
                        break;
                    } else {
                        if (i.B(tables[i10], this.f13663c[0], true)) {
                            setD = this.f13664d;
                            break;
                        }
                        i10++;
                    }
                }
            } else {
                Set setB = U.b();
                for (String str : tables) {
                    for (String str2 : this.f13663c) {
                        if (i.B(str2, str, true)) {
                            setB.add(str2);
                        }
                    }
                }
                setD = U.a(setB);
            }
            if (setD.isEmpty()) {
                return;
            }
            this.f13661a.c(setD);
        }
    }

    public static final class e implements Runnable {
        e() {
        }

        private final Set a() throws IOException {
            c cVar = c.this;
            Set setB = U.b();
            Cursor cursorY = q.y(cVar.f(), new p142o1.a("SELECT * FROM room_table_modification_log WHERE invalidated = 1;"), null, 2, null);
            while (cursorY.moveToNext()) {
                try {
                    setB.add(Integer.valueOf(cursorY.getInt(0)));
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        p189s8.b.a(cursorY, th);
                        throw th2;
                    }
                }
            }
            A a10 = A.f21846a;
            p189s8.b.a(cursorY, null);
            Set setA = U.a(setB);
            if (setA.isEmpty()) {
                return setA;
            }
            if (c.this.e() == null) {
                throw new IllegalStateException("Required value was null.");
            }
            k kVarE = c.this.e();
            if (kVarE == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            kVarE.v();
            return setA;
        }

        @Override // java.lang.Runnable
        public void run() {
            Set setD;
            p062g1.c cVar;
            Lock lockK = c.this.f().k();
            lockK.lock();
            try {
                try {
                    if (!c.this.d()) {
                        lockK.unlock();
                        p062g1.c cVar2 = c.this.f13644f;
                        if (cVar2 != null) {
                            cVar2.e();
                            return;
                        }
                        return;
                    }
                    if (!c.this.h().compareAndSet(true, false)) {
                        lockK.unlock();
                        p062g1.c cVar3 = c.this.f13644f;
                        if (cVar3 != null) {
                            cVar3.e();
                            return;
                        }
                        return;
                    }
                    if (c.this.f().q()) {
                        lockK.unlock();
                        p062g1.c cVar4 = c.this.f13644f;
                        if (cVar4 != null) {
                            cVar4.e();
                            return;
                        }
                        return;
                    }
                    g gVarE0 = c.this.f().m().e0();
                    gVarE0.X();
                    try {
                        setD = a();
                        gVarE0.T();
                        gVarE0.l0();
                        lockK.unlock();
                        cVar = c.this.f13644f;
                        if (cVar != null) {
                            cVar.e();
                        }
                        if (setD.isEmpty()) {
                            return;
                        }
                        p120m.b bVarG = c.this.g();
                        c cVar5 = c.this;
                        synchronized (bVarG) {
                            try {
                                Iterator it = cVar5.g().iterator();
                                while (it.hasNext()) {
                                    ((d) ((Map.Entry) it.next()).getValue()).b(setD);
                                }
                                A a10 = A.f21846a;
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                    } catch (Throwable th2) {
                        gVarE0.l0();
                        throw th2;
                    }
                } catch (Throwable th3) {
                    lockK.unlock();
                    p062g1.c cVar6 = c.this.f13644f;
                    if (cVar6 != null) {
                        cVar6.e();
                    }
                    throw th3;
                }
            } catch (SQLiteException e10) {
                Log.e("ROOM", "Cannot run invalidation tracker. Is the db closed?", e10);
                setD = U.d();
                lockK.unlock();
                cVar = c.this.f13644f;
                if (cVar != null) {
                }
            } catch (IllegalStateException e11) {
                Log.e("ROOM", "Cannot run invalidation tracker. Is the db closed?", e11);
                setD = U.d();
                lockK.unlock();
                cVar = c.this.f13644f;
                if (cVar != null) {
                }
            }
        }
    }

    public c(q database, Map shadowTablesMap, Map viewTables, String... tableNames) {
        String lowerCase;
        n.h(database, "database");
        n.h(shadowTablesMap, "shadowTablesMap");
        n.h(viewTables, "viewTables");
        n.h(tableNames, "tableNames");
        this.f13639a = database;
        this.f13640b = shadowTablesMap;
        this.f13641c = viewTables;
        this.f13645g = new AtomicBoolean(false);
        this.f13648j = new b(tableNames.length);
        this.f13649k = new p062g1.k(database);
        this.f13650l = new p120m.b();
        this.f13652n = new Object();
        this.f13653o = new Object();
        this.f13642d = new LinkedHashMap();
        int length = tableNames.length;
        String[] strArr = new String[length];
        for (int i10 = 0; i10 < length; i10++) {
            String str = tableNames[i10];
            Locale US = Locale.US;
            n.g(US, "US");
            String lowerCase2 = str.toLowerCase(US);
            n.g(lowerCase2, "this as java.lang.String).toLowerCase(locale)");
            this.f13642d.put(lowerCase2, Integer.valueOf(i10));
            String str2 = (String) this.f13640b.get(tableNames[i10]);
            if (str2 != null) {
                n.g(US, "US");
                lowerCase = str2.toLowerCase(US);
                n.g(lowerCase, "this as java.lang.String).toLowerCase(locale)");
            } else {
                lowerCase = null;
            }
            if (lowerCase != null) {
                lowerCase2 = lowerCase;
            }
            strArr[i10] = lowerCase2;
        }
        this.f13643e = strArr;
        for (Map.Entry entry : this.f13640b.entrySet()) {
            String str3 = (String) entry.getValue();
            Locale US2 = Locale.US;
            n.g(US2, "US");
            String lowerCase3 = str3.toLowerCase(US2);
            n.g(lowerCase3, "this as java.lang.String).toLowerCase(locale)");
            if (this.f13642d.containsKey(lowerCase3)) {
                String str4 = (String) entry.getKey();
                n.g(US2, "US");
                String lowerCase4 = str4.toLowerCase(US2);
                n.g(lowerCase4, "this as java.lang.String).toLowerCase(locale)");
                Map map = this.f13642d;
                map.put(lowerCase4, N.h(map, lowerCase3));
            }
        }
        this.f13654p = new e();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void l() {
        synchronized (this.f13653o) {
            this.f13646h = false;
            this.f13648j.d();
            k kVar = this.f13647i;
            if (kVar != null) {
                kVar.close();
                A a10 = A.f21846a;
            }
        }
    }

    private final String[] o(String[] strArr) {
        Set setB = U.b();
        for (String str : strArr) {
            Map map = this.f13641c;
            Locale US = Locale.US;
            n.g(US, "US");
            String lowerCase = str.toLowerCase(US);
            n.g(lowerCase, "this as java.lang.String).toLowerCase(locale)");
            if (map.containsKey(lowerCase)) {
                Map map2 = this.f13641c;
                n.g(US, "US");
                String lowerCase2 = str.toLowerCase(US);
                n.g(lowerCase2, "this as java.lang.String).toLowerCase(locale)");
                Object obj = map2.get(lowerCase2);
                n.e(obj);
                setB.addAll((Collection) obj);
            } else {
                setB.add(str);
            }
        }
        return (String[]) U.a(setB).toArray(new String[0]);
    }

    private final void r(g gVar, int i10) {
        gVar.q("INSERT OR IGNORE INTO room_table_modification_log VALUES(" + i10 + ", 0)");
        String str = this.f13643e[i10];
        for (String str2 : f13638r) {
            String str3 = "CREATE TEMP TRIGGER IF NOT EXISTS " + f13637q.b(str, str2) + " AFTER " + str2 + " ON `" + str + "` BEGIN UPDATE room_table_modification_log SET invalidated = 1 WHERE table_id = " + i10 + " AND invalidated = 0; END";
            n.g(str3, "StringBuilder().apply(builderAction).toString()");
            gVar.q(str3);
        }
    }

    private final void s(g gVar, int i10) {
        String str = this.f13643e[i10];
        for (String str2 : f13638r) {
            String str3 = "DROP TRIGGER IF EXISTS " + f13637q.b(str, str2);
            n.g(str3, "StringBuilder().apply(builderAction).toString()");
            gVar.q(str3);
        }
    }

    public void c(AbstractC0411c observer) {
        d dVar;
        n.h(observer, "observer");
        String[] strArrO = o(observer.a());
        ArrayList arrayList = new ArrayList(strArrO.length);
        for (String str : strArrO) {
            Map map = this.f13642d;
            Locale US = Locale.US;
            n.g(US, "US");
            String lowerCase = str.toLowerCase(US);
            n.g(lowerCase, "this as java.lang.String).toLowerCase(locale)");
            Integer num = (Integer) map.get(lowerCase);
            if (num == null) {
                throw new IllegalArgumentException("There is no table with name " + str);
            }
            arrayList.add(num);
        }
        int[] iArrQ0 = AbstractC1444s.q0(arrayList);
        d dVar2 = new d(observer, iArrQ0, strArrO);
        synchronized (this.f13650l) {
            dVar = (d) this.f13650l.j(observer, dVar2);
        }
        if (dVar == null && this.f13648j.b(Arrays.copyOf(iArrQ0, iArrQ0.length))) {
            t();
        }
    }

    public final boolean d() {
        if (!this.f13639a.w()) {
            return false;
        }
        if (!this.f13646h) {
            this.f13639a.m().e0();
        }
        if (this.f13646h) {
            return true;
        }
        Log.e("ROOM", "database is not initialized even though it is open");
        return false;
    }

    public final k e() {
        return this.f13647i;
    }

    public final q f() {
        return this.f13639a;
    }

    public final p120m.b g() {
        return this.f13650l;
    }

    public final AtomicBoolean h() {
        return this.f13645g;
    }

    public final Map i() {
        return this.f13642d;
    }

    public final void j(g database) {
        n.h(database, "database");
        synchronized (this.f13653o) {
            if (this.f13646h) {
                Log.e("ROOM", "Invalidation tracker is initialized twice :/.");
                return;
            }
            database.q("PRAGMA temp_store = MEMORY;");
            database.q("PRAGMA recursive_triggers='ON';");
            database.q("CREATE TEMP TABLE room_table_modification_log (table_id INTEGER PRIMARY KEY, invalidated INTEGER NOT NULL DEFAULT 0)");
            u(database);
            this.f13647i = database.w("UPDATE room_table_modification_log SET invalidated = 0 WHERE invalidated = 1");
            this.f13646h = true;
            A a10 = A.f21846a;
        }
    }

    public final void k(String... tables) {
        n.h(tables, "tables");
        synchronized (this.f13650l) {
            try {
                for (Map.Entry entry : this.f13650l) {
                    n.g(entry, "(observer, wrapper)");
                    AbstractC0411c abstractC0411c = (AbstractC0411c) entry.getKey();
                    d dVar = (d) entry.getValue();
                    if (!abstractC0411c.b()) {
                        dVar.c(tables);
                    }
                }
                A a10 = A.f21846a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void m() {
        if (this.f13645g.compareAndSet(false, true)) {
            p062g1.c cVar = this.f13644f;
            if (cVar != null) {
                cVar.j();
            }
            this.f13639a.n().execute(this.f13654p);
        }
    }

    public void n(AbstractC0411c observer) {
        d dVar;
        n.h(observer, "observer");
        synchronized (this.f13650l) {
            dVar = (d) this.f13650l.m(observer);
        }
        if (dVar != null) {
            b bVar = this.f13648j;
            int[] iArrA = dVar.a();
            if (bVar.c(Arrays.copyOf(iArrA, iArrA.length))) {
                t();
            }
        }
    }

    public final void p(p062g1.c autoCloser) {
        n.h(autoCloser, "autoCloser");
        this.f13644f = autoCloser;
        autoCloser.l(new Runnable() { // from class: g1.l
            @Override // java.lang.Runnable
            public final void run() {
                this.f21059q.l();
            }
        });
    }

    public final void q(Context context, String name, Intent serviceIntent) {
        n.h(context, "context");
        n.h(name, "name");
        n.h(serviceIntent, "serviceIntent");
        this.f13651m = new androidx.room.d(context, name, serviceIntent, this, this.f13639a.n());
    }

    public final void t() {
        if (this.f13639a.w()) {
            u(this.f13639a.m().e0());
        }
    }

    public final void u(g database) {
        n.h(database, "database");
        if (database.D0()) {
            return;
        }
        try {
            Lock lockK = this.f13639a.k();
            lockK.lock();
            try {
                synchronized (this.f13652n) {
                    try {
                        int[] iArrA = this.f13648j.a();
                        if (iArrA != null) {
                            f13637q.a(database);
                            try {
                                int length = iArrA.length;
                                int i10 = 0;
                                int i11 = 0;
                                while (i10 < length) {
                                    int i12 = iArrA[i10];
                                    int i13 = i11 + 1;
                                    if (i12 == 1) {
                                        r(database, i11);
                                    } else if (i12 == 2) {
                                        s(database, i11);
                                    }
                                    i10++;
                                    i11 = i13;
                                }
                                database.T();
                                database.l0();
                                A a10 = A.f21846a;
                            } catch (Throwable th) {
                                database.l0();
                                throw th;
                            }
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                lockK.unlock();
            } catch (Throwable th3) {
                lockK.unlock();
                throw th3;
            }
        } catch (SQLiteException e10) {
            Log.e("ROOM", "Cannot run invalidation tracker. Is the db closed?", e10);
        } catch (IllegalStateException e11) {
            Log.e("ROOM", "Cannot run invalidation tracker. Is the db closed?", e11);
        }
    }
}
