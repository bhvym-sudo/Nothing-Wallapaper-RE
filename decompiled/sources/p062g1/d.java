package p062g1;

import android.content.ContentResolver;
import android.database.CharArrayBuffer;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.DataSetObserver;
import android.net.Uri;
import android.os.Bundle;
import android.os.CancellationSignal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.n;
import kotlin.jvm.internal.o;
import p079h8.A;
import p089i8.AbstractC1444s;
import p142o1.e;
import p142o1.f;
import p142o1.g;
import p142o1.h;
import p142o1.j;
import p142o1.k;
import p219v8.l;

/* JADX INFO: loaded from: classes.dex */
public final class d implements h, g {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final h f21014q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final p062g1.c f21015r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final a f21016s;

    public static final class a implements g {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private final p062g1.c f21017q;

        /* JADX INFO: renamed from: g1.d$a$a, reason: collision with other inner class name */
        static final class C0536a extends o implements l {

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            public static final C0536a f21018r = new C0536a();

            C0536a() {
                super(1);
            }

            @Override // p219v8.l
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final List f(g obj) {
                n.h(obj, "obj");
                return obj.k();
            }
        }

        static final class b extends o implements l {

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            final /* synthetic */ String f21019r;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(String str) {
                super(1);
                this.f21019r = str;
            }

            @Override // p219v8.l
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object f(g db) {
                n.h(db, "db");
                db.q(this.f21019r);
                return null;
            }
        }

        /* synthetic */ class c extends kotlin.jvm.internal.l implements l {

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            public static final c f21020q = new c();

            c() {
                super(1, g.class, "inTransaction", "inTransaction()Z", 0);
            }

            @Override // p219v8.l
            /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
            public final Boolean f(g p9) {
                n.h(p9, "p0");
                return Boolean.valueOf(p9.D0());
            }
        }

        /* JADX INFO: renamed from: g1.d$a$d, reason: collision with other inner class name */
        static final class C0537d extends o implements l {

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            public static final C0537d f21021r = new C0537d();

            C0537d() {
                super(1);
            }

            @Override // p219v8.l
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Boolean f(g db) {
                n.h(db, "db");
                return Boolean.valueOf(db.L0());
            }
        }

        static final class e extends o implements l {

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            public static final e f21022r = new e();

            e() {
                super(1);
            }

            @Override // p219v8.l
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String f(g obj) {
                n.h(obj, "obj");
                return obj.getPath();
            }
        }

        static final class f extends o implements l {

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            public static final f f21023r = new f();

            f() {
                super(1);
            }

            @Override // p219v8.l
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object f(g it) {
                n.h(it, "it");
                return null;
            }
        }

        public a(p062g1.c autoCloser) {
            n.h(autoCloser, "autoCloser");
            this.f21017q = autoCloser;
        }

        @Override // p142o1.g
        public boolean D0() {
            if (this.f21017q.h() == null) {
                return false;
            }
            return ((Boolean) this.f21017q.g(c.f21020q)).booleanValue();
        }

        @Override // p142o1.g
        public Cursor K0(j query, CancellationSignal cancellationSignal) {
            n.h(query, "query");
            try {
                return new c(this.f21017q.j().K0(query, cancellationSignal), this.f21017q);
            } catch (Throwable th) {
                this.f21017q.e();
                throw th;
            }
        }

        @Override // p142o1.g
        public boolean L0() {
            return ((Boolean) this.f21017q.g(C0537d.f21021r)).booleanValue();
        }

        @Override // p142o1.g
        public Cursor R0(j query) {
            n.h(query, "query");
            try {
                return new c(this.f21017q.j().R0(query), this.f21017q);
            } catch (Throwable th) {
                this.f21017q.e();
                throw th;
            }
        }

        @Override // p142o1.g
        public void T() {
            A a10;
            g gVarH = this.f21017q.h();
            if (gVarH != null) {
                gVarH.T();
                a10 = A.f21846a;
            } else {
                a10 = null;
            }
            if (a10 == null) {
                throw new IllegalStateException("setTransactionSuccessful called but delegateDb is null");
            }
        }

        @Override // p142o1.g
        public void X() {
            try {
                this.f21017q.j().X();
            } catch (Throwable th) {
                this.f21017q.e();
                throw th;
            }
        }

        public final void a() {
            this.f21017q.g(f.f21023r);
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            this.f21017q.d();
        }

        @Override // p142o1.g
        public Cursor f0(String query) {
            n.h(query, "query");
            try {
                return new c(this.f21017q.j().f0(query), this.f21017q);
            } catch (Throwable th) {
                this.f21017q.e();
                throw th;
            }
        }

        @Override // p142o1.g
        public String getPath() {
            return (String) this.f21017q.g(e.f21022r);
        }

        @Override // p142o1.g
        public void h() {
            try {
                this.f21017q.j().h();
            } catch (Throwable th) {
                this.f21017q.e();
                throw th;
            }
        }

        @Override // p142o1.g
        public boolean isOpen() {
            g gVarH = this.f21017q.h();
            if (gVarH == null) {
                return false;
            }
            return gVarH.isOpen();
        }

        @Override // p142o1.g
        public List k() {
            return (List) this.f21017q.g(C0536a.f21018r);
        }

        @Override // p142o1.g
        public void l0() {
            if (this.f21017q.h() == null) {
                throw new IllegalStateException("End transaction called but delegateDb is null");
            }
            try {
                g gVarH = this.f21017q.h();
                n.e(gVarH);
                gVarH.l0();
            } finally {
                this.f21017q.e();
            }
        }

        @Override // p142o1.g
        public void q(String sql) {
            n.h(sql, "sql");
            this.f21017q.g(new b(sql));
        }

        @Override // p142o1.g
        public k w(String sql) {
            n.h(sql, "sql");
            return new b(sql, this.f21017q);
        }
    }

    private static final class b implements k {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private final String f21024q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private final p062g1.c f21025r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        private final ArrayList f21026s;

        static final class a extends o implements l {

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            public static final a f21027r = new a();

            a() {
                super(1);
            }

            @Override // p219v8.l
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Long f(k obj) {
                n.h(obj, "obj");
                return Long.valueOf(obj.a1());
            }
        }

        /* JADX INFO: renamed from: g1.d$b$b, reason: collision with other inner class name */
        static final class C0538b extends o implements l {

            /* JADX INFO: renamed from: s, reason: collision with root package name */
            final /* synthetic */ l f21029s;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0538b(l lVar) {
                super(1);
                this.f21029s = lVar;
            }

            @Override // p219v8.l
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object f(g db) {
                n.h(db, "db");
                k kVarW = db.w(b.this.f21024q);
                b.this.f(kVarW);
                return this.f21029s.f(kVarW);
            }
        }

        static final class c extends o implements l {

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            public static final c f21030r = new c();

            c() {
                super(1);
            }

            @Override // p219v8.l
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Integer f(k obj) {
                n.h(obj, "obj");
                return Integer.valueOf(obj.v());
            }
        }

        public b(String sql, p062g1.c autoCloser) {
            n.h(sql, "sql");
            n.h(autoCloser, "autoCloser");
            this.f21024q = sql;
            this.f21025r = autoCloser;
            this.f21026s = new ArrayList();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void f(k kVar) {
            Iterator it = this.f21026s.iterator();
            int i10 = 0;
            while (it.hasNext()) {
                it.next();
                int i11 = i10 + 1;
                if (i10 < 0) {
                    AbstractC1444s.t();
                }
                Object obj = this.f21026s.get(i10);
                if (obj == null) {
                    kVar.x0(i11);
                } else if (obj instanceof Long) {
                    kVar.P(i11, ((Number) obj).longValue());
                } else if (obj instanceof Double) {
                    kVar.C(i11, ((Number) obj).doubleValue());
                } else if (obj instanceof String) {
                    kVar.r(i11, (String) obj);
                } else if (obj instanceof byte[]) {
                    kVar.a0(i11, (byte[]) obj);
                }
                i10 = i11;
            }
        }

        private final Object g(l lVar) {
            return this.f21025r.g(new C0538b(lVar));
        }

        private final void j(int i10, Object obj) {
            int size;
            int i11 = i10 - 1;
            if (i11 >= this.f21026s.size() && (size = this.f21026s.size()) <= i11) {
                while (true) {
                    this.f21026s.add(null);
                    if (size == i11) {
                        break;
                    } else {
                        size++;
                    }
                }
            }
            this.f21026s.set(i11, obj);
        }

        @Override // p142o1.i
        public void C(int i10, double d10) {
            j(i10, Double.valueOf(d10));
        }

        @Override // p142o1.i
        public void P(int i10, long j9) {
            j(i10, Long.valueOf(j9));
        }

        @Override // p142o1.i
        public void a0(int i10, byte[] value) {
            n.h(value, "value");
            j(i10, value);
        }

        @Override // p142o1.k
        public long a1() {
            return ((Number) g(a.f21027r)).longValue();
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }

        @Override // p142o1.i
        public void r(int i10, String value) {
            n.h(value, "value");
            j(i10, value);
        }

        @Override // p142o1.k
        public int v() {
            return ((Number) g(c.f21030r)).intValue();
        }

        @Override // p142o1.i
        public void x0(int i10) {
            j(i10, null);
        }
    }

    private static final class c implements Cursor {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private final Cursor f21031q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private final p062g1.c f21032r;

        public c(Cursor delegate, p062g1.c autoCloser) {
            n.h(delegate, "delegate");
            n.h(autoCloser, "autoCloser");
            this.f21031q = delegate;
            this.f21032r = autoCloser;
        }

        @Override // android.database.Cursor, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            this.f21031q.close();
            this.f21032r.e();
        }

        @Override // android.database.Cursor
        public void copyStringToBuffer(int i10, CharArrayBuffer charArrayBuffer) {
            this.f21031q.copyStringToBuffer(i10, charArrayBuffer);
        }

        @Override // android.database.Cursor
        public void deactivate() {
            this.f21031q.deactivate();
        }

        @Override // android.database.Cursor
        public byte[] getBlob(int i10) {
            return this.f21031q.getBlob(i10);
        }

        @Override // android.database.Cursor
        public int getColumnCount() {
            return this.f21031q.getColumnCount();
        }

        @Override // android.database.Cursor
        public int getColumnIndex(String str) {
            return this.f21031q.getColumnIndex(str);
        }

        @Override // android.database.Cursor
        public int getColumnIndexOrThrow(String str) {
            return this.f21031q.getColumnIndexOrThrow(str);
        }

        @Override // android.database.Cursor
        public String getColumnName(int i10) {
            return this.f21031q.getColumnName(i10);
        }

        @Override // android.database.Cursor
        public String[] getColumnNames() {
            return this.f21031q.getColumnNames();
        }

        @Override // android.database.Cursor
        public int getCount() {
            return this.f21031q.getCount();
        }

        @Override // android.database.Cursor
        public double getDouble(int i10) {
            return this.f21031q.getDouble(i10);
        }

        @Override // android.database.Cursor
        public Bundle getExtras() {
            return this.f21031q.getExtras();
        }

        @Override // android.database.Cursor
        public float getFloat(int i10) {
            return this.f21031q.getFloat(i10);
        }

        @Override // android.database.Cursor
        public int getInt(int i10) {
            return this.f21031q.getInt(i10);
        }

        @Override // android.database.Cursor
        public long getLong(int i10) {
            return this.f21031q.getLong(i10);
        }

        @Override // android.database.Cursor
        public Uri getNotificationUri() {
            return p142o1.c.a(this.f21031q);
        }

        @Override // android.database.Cursor
        public List getNotificationUris() {
            return f.a(this.f21031q);
        }

        @Override // android.database.Cursor
        public int getPosition() {
            return this.f21031q.getPosition();
        }

        @Override // android.database.Cursor
        public short getShort(int i10) {
            return this.f21031q.getShort(i10);
        }

        @Override // android.database.Cursor
        public String getString(int i10) {
            return this.f21031q.getString(i10);
        }

        @Override // android.database.Cursor
        public int getType(int i10) {
            return this.f21031q.getType(i10);
        }

        @Override // android.database.Cursor
        public boolean getWantsAllOnMoveCalls() {
            return this.f21031q.getWantsAllOnMoveCalls();
        }

        @Override // android.database.Cursor
        public boolean isAfterLast() {
            return this.f21031q.isAfterLast();
        }

        @Override // android.database.Cursor
        public boolean isBeforeFirst() {
            return this.f21031q.isBeforeFirst();
        }

        @Override // android.database.Cursor
        public boolean isClosed() {
            return this.f21031q.isClosed();
        }

        @Override // android.database.Cursor
        public boolean isFirst() {
            return this.f21031q.isFirst();
        }

        @Override // android.database.Cursor
        public boolean isLast() {
            return this.f21031q.isLast();
        }

        @Override // android.database.Cursor
        public boolean isNull(int i10) {
            return this.f21031q.isNull(i10);
        }

        @Override // android.database.Cursor
        public boolean move(int i10) {
            return this.f21031q.move(i10);
        }

        @Override // android.database.Cursor
        public boolean moveToFirst() {
            return this.f21031q.moveToFirst();
        }

        @Override // android.database.Cursor
        public boolean moveToLast() {
            return this.f21031q.moveToLast();
        }

        @Override // android.database.Cursor
        public boolean moveToNext() {
            return this.f21031q.moveToNext();
        }

        @Override // android.database.Cursor
        public boolean moveToPosition(int i10) {
            return this.f21031q.moveToPosition(i10);
        }

        @Override // android.database.Cursor
        public boolean moveToPrevious() {
            return this.f21031q.moveToPrevious();
        }

        @Override // android.database.Cursor
        public void registerContentObserver(ContentObserver contentObserver) {
            this.f21031q.registerContentObserver(contentObserver);
        }

        @Override // android.database.Cursor
        public void registerDataSetObserver(DataSetObserver dataSetObserver) {
            this.f21031q.registerDataSetObserver(dataSetObserver);
        }

        @Override // android.database.Cursor
        public boolean requery() {
            return this.f21031q.requery();
        }

        @Override // android.database.Cursor
        public Bundle respond(Bundle bundle) {
            return this.f21031q.respond(bundle);
        }

        @Override // android.database.Cursor
        public void setExtras(Bundle extras) {
            n.h(extras, "extras");
            e.a(this.f21031q, extras);
        }

        @Override // android.database.Cursor
        public void setNotificationUri(ContentResolver contentResolver, Uri uri) {
            this.f21031q.setNotificationUri(contentResolver, uri);
        }

        @Override // android.database.Cursor
        public void setNotificationUris(ContentResolver cr, List uris) {
            n.h(cr, "cr");
            n.h(uris, "uris");
            f.b(this.f21031q, cr, uris);
        }

        @Override // android.database.Cursor
        public void unregisterContentObserver(ContentObserver contentObserver) {
            this.f21031q.unregisterContentObserver(contentObserver);
        }

        @Override // android.database.Cursor
        public void unregisterDataSetObserver(DataSetObserver dataSetObserver) {
            this.f21031q.unregisterDataSetObserver(dataSetObserver);
        }
    }

    public d(h delegate, p062g1.c autoCloser) {
        n.h(delegate, "delegate");
        n.h(autoCloser, "autoCloser");
        this.f21014q = delegate;
        this.f21015r = autoCloser;
        autoCloser.k(a());
        this.f21016s = new a(autoCloser);
    }

    @Override // p062g1.g
    public h a() {
        return this.f21014q;
    }

    @Override // p142o1.h, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f21016s.close();
    }

    @Override // p142o1.h
    public g e0() {
        this.f21016s.a();
        return this.f21016s;
    }

    @Override // p142o1.h
    public String getDatabaseName() {
        return this.f21014q.getDatabaseName();
    }

    @Override // p142o1.h
    public void setWriteAheadLoggingEnabled(boolean z9) {
        this.f21014q.setWriteAheadLoggingEnabled(z9);
    }
}
