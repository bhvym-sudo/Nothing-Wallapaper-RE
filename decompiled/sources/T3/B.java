package T3;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.os.SystemClock;
import android.util.Base64;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public class B implements InterfaceC0949c, U3.b {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static final K3.b f7616u = K3.b.b("proto");

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final H f7617q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final V3.a f7618r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final V3.a f7619s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final AbstractC0950d f7620t;

    interface b {
        Object apply(Object obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final String f7621a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final String f7622b;

        private c(String str, String str2) {
            this.f7621a = str;
            this.f7622b = str2;
        }
    }

    interface d {
        Object a();
    }

    B(V3.a aVar, V3.a aVar2, AbstractC0950d abstractC0950d, H h10) {
        this.f7617q = h10;
        this.f7618r = aVar;
        this.f7619s = aVar2;
        this.f7620t = abstractC0950d;
    }

    static /* synthetic */ List A0(SQLiteDatabase sQLiteDatabase) {
        return (List) l1(sQLiteDatabase.rawQuery("SELECT distinct t._id, t.backend_name, t.priority, t.extras FROM transport_contexts AS t, events AS e WHERE e.context_id = t._id", new String[0]), t.a());
    }

    static /* synthetic */ List B0(B b10, M3.m mVar, SQLiteDatabase sQLiteDatabase) {
        List listX0 = b10.X0(sQLiteDatabase, mVar);
        return b10.I(listX0, b10.c1(sQLiteDatabase, listX0));
    }

    private boolean G() {
        return j() * u() >= this.f7620t.f();
    }

    private List I(List list, Map map) {
        ListIterator listIterator = list.listIterator();
        while (listIterator.hasNext()) {
            AbstractC0955i abstractC0955i = (AbstractC0955i) listIterator.next();
            if (map.containsKey(Long.valueOf(abstractC0955i.c()))) {
                M3.h.a aVarL = abstractC0955i.b().l();
                for (c cVar : (Set) map.get(Long.valueOf(abstractC0955i.c()))) {
                    aVarL.c(cVar.f7621a, cVar.f7622b);
                }
                listIterator.set(AbstractC0955i.a(abstractC0955i.c(), abstractC0955i.d(), aVarL.d()));
            }
        }
        return list;
    }

    static /* synthetic */ Object I0(B b10, List list, M3.m mVar, Cursor cursor) {
        while (cursor.moveToNext()) {
            long j9 = cursor.getLong(0);
            boolean z9 = cursor.getInt(7) != 0;
            M3.h.a aVarK = M3.h.a().j(cursor.getString(1)).i(cursor.getLong(2)).k(cursor.getLong(3));
            if (z9) {
                aVarK.h(new M3.g(j1(cursor.getString(4)), cursor.getBlob(5)));
            } else {
                aVarK.h(new M3.g(j1(cursor.getString(4)), b10.h1(j9)));
            }
            if (!cursor.isNull(6)) {
                aVarK.g(Integer.valueOf(cursor.getInt(6)));
            }
            list.add(AbstractC0955i.a(j9, mVar, aVarK.d()));
        }
        return null;
    }

    static /* synthetic */ Object O0(Map map, Cursor cursor) {
        while (true) {
            if (!cursor.moveToNext()) {
                return null;
            }
            long j9 = cursor.getLong(0);
            Set hashSet = (Set) map.get(Long.valueOf(j9));
            if (hashSet == null) {
                hashSet = new HashSet();
                map.put(Long.valueOf(j9), hashSet);
            }
            hashSet.add(new c(cursor.getString(1), cursor.getString(2)));
        }
    }

    static /* synthetic */ Long P0(B b10, M3.m mVar, M3.h hVar, SQLiteDatabase sQLiteDatabase) {
        if (b10.G()) {
            return -1L;
        }
        long jF = b10.f(sQLiteDatabase, mVar);
        int iE = b10.f7620t.e();
        byte[] bArrA = hVar.e().a();
        boolean z9 = bArrA.length <= iE;
        ContentValues contentValues = new ContentValues();
        contentValues.put("context_id", Long.valueOf(jF));
        contentValues.put("transport_name", hVar.j());
        contentValues.put("timestamp_ms", Long.valueOf(hVar.f()));
        contentValues.put("uptime_ms", Long.valueOf(hVar.k()));
        contentValues.put("payload_encoding", hVar.e().b().a());
        contentValues.put("code", hVar.d());
        contentValues.put("num_attempts", (Integer) 0);
        contentValues.put("inline", Boolean.valueOf(z9));
        contentValues.put("payload", z9 ? bArrA : new byte[0]);
        long jInsert = sQLiteDatabase.insert("events", null, contentValues);
        if (!z9) {
            int iCeil = (int) Math.ceil(((double) bArrA.length) / ((double) iE));
            for (int i10 = 1; i10 <= iCeil; i10++) {
                byte[] bArrCopyOfRange = Arrays.copyOfRange(bArrA, (i10 - 1) * iE, Math.min(i10 * iE, bArrA.length));
                ContentValues contentValues2 = new ContentValues();
                contentValues2.put("event_id", Long.valueOf(jInsert));
                contentValues2.put("sequence_num", Integer.valueOf(i10));
                contentValues2.put("bytes", bArrCopyOfRange);
                sQLiteDatabase.insert("event_payloads", null, contentValues2);
            }
        }
        for (Map.Entry entry : hVar.i().entrySet()) {
            ContentValues contentValues3 = new ContentValues();
            contentValues3.put("event_id", Long.valueOf(jInsert));
            contentValues3.put("name", (String) entry.getKey());
            contentValues3.put("value", (String) entry.getValue());
            sQLiteDatabase.insert("event_metadata", null, contentValues3);
        }
        return Long.valueOf(jInsert);
    }

    static /* synthetic */ Object Q(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.beginTransaction();
        return null;
    }

    static /* synthetic */ byte[] T0(Cursor cursor) {
        ArrayList arrayList = new ArrayList();
        int length = 0;
        while (cursor.moveToNext()) {
            byte[] blob = cursor.getBlob(0);
            arrayList.add(blob);
            length += blob.length;
        }
        byte[] bArr = new byte[length];
        int length2 = 0;
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            byte[] bArr2 = (byte[]) arrayList.get(i10);
            System.arraycopy(bArr2, 0, bArr, length2, bArr2.length);
            length2 += bArr2.length;
        }
        return bArr;
    }

    static /* synthetic */ Object U(Throwable th) {
        throw new U3.a("Timed out while trying to acquire the lock.", th);
    }

    static /* synthetic */ Object U0(String str, SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.compileStatement(str).execute();
        sQLiteDatabase.compileStatement("DELETE FROM events WHERE num_attempts >= 16").execute();
        return null;
    }

    static /* synthetic */ Object W0(long j9, M3.m mVar, SQLiteDatabase sQLiteDatabase) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("next_request_ms", Long.valueOf(j9));
        if (sQLiteDatabase.update("transport_contexts", contentValues, "backend_name = ? and priority = ?", new String[]{mVar.b(), String.valueOf(W3.a.a(mVar.d()))}) < 1) {
            contentValues.put("backend_name", mVar.b());
            contentValues.put("priority", Integer.valueOf(W3.a.a(mVar.d())));
            sQLiteDatabase.insert("transport_contexts", null, contentValues);
        }
        return null;
    }

    private List X0(SQLiteDatabase sQLiteDatabase, M3.m mVar) {
        ArrayList arrayList = new ArrayList();
        Long lZ = z(sQLiteDatabase, mVar);
        if (lZ == null) {
            return arrayList;
        }
        l1(sQLiteDatabase.query("events", new String[]{"_id", "transport_name", "timestamp_ms", "uptime_ms", "payload_encoding", "payload", "code", "inline"}, "context_id = ?", new String[]{lZ.toString()}, null, null, null, String.valueOf(this.f7620t.d())), n.a(this, arrayList, mVar));
        return arrayList;
    }

    static /* synthetic */ SQLiteDatabase Y(Throwable th) {
        throw new U3.a("Timed out while trying to open db.", th);
    }

    private void b(SQLiteDatabase sQLiteDatabase) {
        i1(q.b(sQLiteDatabase), r.a());
    }

    static /* synthetic */ Long b0(Cursor cursor) {
        if (cursor.moveToNext()) {
            return Long.valueOf(cursor.getLong(0));
        }
        return 0L;
    }

    private Map c1(SQLiteDatabase sQLiteDatabase, List list) {
        HashMap map = new HashMap();
        StringBuilder sb = new StringBuilder("event_id IN (");
        for (int i10 = 0; i10 < list.size(); i10++) {
            sb.append(((AbstractC0955i) list.get(i10)).c());
            if (i10 < list.size() - 1) {
                sb.append(',');
            }
        }
        sb.append(')');
        l1(sQLiteDatabase.query("event_metadata", new String[]{"event_id", "name", "value"}, sb.toString(), null, null, null, null), p.a(map));
        return map;
    }

    private long f(SQLiteDatabase sQLiteDatabase, M3.m mVar) {
        Long lZ = z(sQLiteDatabase, mVar);
        if (lZ != null) {
            return lZ.longValue();
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("backend_name", mVar.b());
        contentValues.put("priority", Integer.valueOf(W3.a.a(mVar.d())));
        contentValues.put("next_request_ms", (Integer) 0);
        if (mVar.c() != null) {
            contentValues.put("extras", Base64.encodeToString(mVar.c(), 0));
        }
        return sQLiteDatabase.insert("transport_contexts", null, contentValues);
    }

    private static byte[] g1(String str) {
        if (str == null) {
            return null;
        }
        return Base64.decode(str, 0);
    }

    private byte[] h1(long j9) {
        return (byte[]) l1(g().query("event_payloads", new String[]{"bytes"}, "event_id = ?", new String[]{String.valueOf(j9)}, null, null, "sequence_num"), o.a());
    }

    private Object i1(d dVar, b bVar) {
        long jA = this.f7619s.a();
        while (true) {
            try {
                return dVar.a();
            } catch (SQLiteDatabaseLockedException e10) {
                if (this.f7619s.a() >= ((long) this.f7620t.b()) + jA) {
                    return bVar.apply(e10);
                }
                SystemClock.sleep(50L);
            }
        }
    }

    private long j() {
        return g().compileStatement("PRAGMA page_count").simpleQueryForLong();
    }

    private static K3.b j1(String str) {
        return str == null ? f7616u : K3.b.b(str);
    }

    private static String k1(Iterable iterable) {
        StringBuilder sb = new StringBuilder("(");
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            sb.append(((AbstractC0955i) it.next()).c());
            if (it.hasNext()) {
                sb.append(',');
            }
        }
        sb.append(')');
        return sb.toString();
    }

    static Object l1(Cursor cursor, b bVar) {
        try {
            return bVar.apply(cursor);
        } finally {
            cursor.close();
        }
    }

    static /* synthetic */ Long q0(Cursor cursor) {
        if (cursor.moveToNext()) {
            return Long.valueOf(cursor.getLong(0));
        }
        return null;
    }

    static /* synthetic */ Boolean t0(B b10, M3.m mVar, SQLiteDatabase sQLiteDatabase) {
        Long lZ = b10.z(sQLiteDatabase, mVar);
        return lZ == null ? Boolean.FALSE : (Boolean) l1(b10.g().rawQuery("SELECT 1 FROM events WHERE context_id = ? LIMIT 1", new String[]{lZ.toString()}), u.a());
    }

    private long u() {
        return g().compileStatement("PRAGMA page_size").simpleQueryForLong();
    }

    static /* synthetic */ List w0(Cursor cursor) {
        ArrayList arrayList = new ArrayList();
        while (cursor.moveToNext()) {
            arrayList.add(M3.m.a().b(cursor.getString(1)).d(W3.a.b(cursor.getInt(2))).c(g1(cursor.getString(3))).a());
        }
        return arrayList;
    }

    private Long z(SQLiteDatabase sQLiteDatabase, M3.m mVar) {
        StringBuilder sb = new StringBuilder("backend_name = ? and priority = ?");
        ArrayList arrayList = new ArrayList(Arrays.asList(mVar.b(), String.valueOf(W3.a.a(mVar.d()))));
        if (mVar.c() != null) {
            sb.append(" and extras = ?");
            arrayList.add(Base64.encodeToString(mVar.c(), 0));
        } else {
            sb.append(" and extras is null");
        }
        return (Long) l1(sQLiteDatabase.query("transport_contexts", new String[]{"_id"}, sb.toString(), (String[]) arrayList.toArray(new String[0]), null, null, null), x.a());
    }

    Object B(b bVar) {
        SQLiteDatabase sQLiteDatabaseG = g();
        sQLiteDatabaseG.beginTransaction();
        try {
            Object objApply = bVar.apply(sQLiteDatabaseG);
            sQLiteDatabaseG.setTransactionSuccessful();
            return objApply;
        } finally {
            sQLiteDatabaseG.endTransaction();
        }
    }

    @Override // T3.InterfaceC0949c
    public Iterable E0(M3.m mVar) {
        return (Iterable) B(k.a(this, mVar));
    }

    @Override // T3.InterfaceC0949c
    public Iterable H() {
        return (Iterable) B(l.a());
    }

    @Override // T3.InterfaceC0949c
    public long J(M3.m mVar) {
        return ((Long) l1(g().rawQuery("SELECT next_request_ms FROM transport_contexts WHERE backend_name = ? and priority = ?", new String[]{mVar.b(), String.valueOf(W3.a.a(mVar.d()))}), z.a())).longValue();
    }

    @Override // T3.InterfaceC0949c
    public void V0(Iterable iterable) {
        if (iterable.iterator().hasNext()) {
            B(y.a("UPDATE events SET num_attempts = num_attempts + 1 WHERE _id in " + k1(iterable)));
        }
    }

    @Override // U3.b
    public Object a(U3.b.a aVar) {
        SQLiteDatabase sQLiteDatabaseG = g();
        b(sQLiteDatabaseG);
        try {
            Object objA = aVar.a();
            sQLiteDatabaseG.setTransactionSuccessful();
            return objA;
        } finally {
            sQLiteDatabaseG.endTransaction();
        }
    }

    @Override // T3.InterfaceC0949c
    public int c() {
        return ((Integer) B(m.a(this.f7618r.a() - this.f7620t.c()))).intValue();
    }

    @Override // T3.InterfaceC0949c
    public void c0(M3.m mVar, long j9) {
        B(j.a(j9, mVar));
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f7617q.close();
    }

    SQLiteDatabase g() {
        H h10 = this.f7617q;
        h10.getClass();
        return (SQLiteDatabase) i1(s.b(h10), v.a());
    }

    @Override // T3.InterfaceC0949c
    public void i(Iterable iterable) {
        if (iterable.iterator().hasNext()) {
            g().compileStatement("DELETE FROM events WHERE _id in " + k1(iterable)).execute();
        }
    }

    @Override // T3.InterfaceC0949c
    public boolean i0(M3.m mVar) {
        return ((Boolean) B(A.a(this, mVar))).booleanValue();
    }

    @Override // T3.InterfaceC0949c
    public AbstractC0955i n0(M3.m mVar, M3.h hVar) {
        P3.a.b("SQLiteEventStore", "Storing event with priority=%s, name=%s for destination %s", mVar.d(), hVar.j(), mVar.b());
        long jLongValue = ((Long) B(w.a(this, mVar, hVar))).longValue();
        if (jLongValue < 1) {
            return null;
        }
        return AbstractC0955i.a(jLongValue, mVar, hVar);
    }
}
