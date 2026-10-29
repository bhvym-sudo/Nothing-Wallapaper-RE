package p152p1;

import android.database.Cursor;
import android.database.sqlite.SQLiteCursor;
import android.database.sqlite.SQLiteCursorDriver;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteQuery;
import android.database.sqlite.SQLiteStatement;
import android.os.CancellationSignal;
import java.util.List;
import kotlin.jvm.internal.AbstractC1457h;
import kotlin.jvm.internal.n;
import kotlin.jvm.internal.o;
import p142o1.g;
import p142o1.j;
import p142o1.k;
import p219v8.r;

/* JADX INFO: loaded from: classes.dex */
public final class c implements g {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final a f23655r = new a(null);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final String[] f23656s = {"", " OR ROLLBACK ", " OR ABORT ", " OR FAIL ", " OR IGNORE ", " OR REPLACE "};

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final String[] f23657t = new String[0];

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final SQLiteDatabase f23658q;

    public static final class a {
        public /* synthetic */ a(AbstractC1457h abstractC1457h) {
            this();
        }

        private a() {
        }
    }

    static final class b extends o implements r {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ j f23659r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(j jVar) {
            super(4);
            this.f23659r = jVar;
        }

        @Override // p219v8.r
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final SQLiteCursor j(SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
            j jVar = this.f23659r;
            n.e(sQLiteQuery);
            jVar.b(new g(sQLiteQuery));
            return new SQLiteCursor(sQLiteCursorDriver, str, sQLiteQuery);
        }
    }

    public c(SQLiteDatabase delegate) {
        n.h(delegate, "delegate");
        this.f23658q = delegate;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Cursor g(r tmp0, SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
        n.h(tmp0, "$tmp0");
        return (Cursor) tmp0.j(sQLiteDatabase, sQLiteCursorDriver, str, sQLiteQuery);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Cursor j(j query, SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
        n.h(query, "$query");
        n.e(sQLiteQuery);
        query.b(new g(sQLiteQuery));
        return new SQLiteCursor(sQLiteCursorDriver, str, sQLiteQuery);
    }

    @Override // p142o1.g
    public boolean D0() {
        return this.f23658q.inTransaction();
    }

    @Override // p142o1.g
    public Cursor K0(final j query, CancellationSignal cancellationSignal) {
        n.h(query, "query");
        SQLiteDatabase sQLiteDatabase = this.f23658q;
        String strA = query.a();
        String[] strArr = f23657t;
        n.e(cancellationSignal);
        return p142o1.b.c(sQLiteDatabase, strA, strArr, null, cancellationSignal, new SQLiteDatabase.CursorFactory() { // from class: p1.a
            @Override // android.database.sqlite.SQLiteDatabase.CursorFactory
            public final Cursor newCursor(SQLiteDatabase sQLiteDatabase2, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
                return c.j(query, sQLiteDatabase2, sQLiteCursorDriver, str, sQLiteQuery);
            }
        });
    }

    @Override // p142o1.g
    public boolean L0() {
        return p142o1.b.b(this.f23658q);
    }

    @Override // p142o1.g
    public Cursor R0(j query) {
        n.h(query, "query");
        final b bVar = new b(query);
        Cursor cursorRawQueryWithFactory = this.f23658q.rawQueryWithFactory(new SQLiteDatabase.CursorFactory() { // from class: p1.b
            @Override // android.database.sqlite.SQLiteDatabase.CursorFactory
            public final Cursor newCursor(SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
                return c.g(bVar, sQLiteDatabase, sQLiteCursorDriver, str, sQLiteQuery);
            }
        }, query.a(), f23657t, null);
        n.g(cursorRawQueryWithFactory, "delegate.rawQueryWithFac…EMPTY_STRING_ARRAY, null)");
        return cursorRawQueryWithFactory;
    }

    @Override // p142o1.g
    public void T() {
        this.f23658q.setTransactionSuccessful();
    }

    @Override // p142o1.g
    public void X() {
        this.f23658q.beginTransactionNonExclusive();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f23658q.close();
    }

    public final boolean f(SQLiteDatabase sqLiteDatabase) {
        n.h(sqLiteDatabase, "sqLiteDatabase");
        return n.d(this.f23658q, sqLiteDatabase);
    }

    @Override // p142o1.g
    public Cursor f0(String query) {
        n.h(query, "query");
        return R0(new p142o1.a(query));
    }

    @Override // p142o1.g
    public String getPath() {
        return this.f23658q.getPath();
    }

    @Override // p142o1.g
    public void h() {
        this.f23658q.beginTransaction();
    }

    @Override // p142o1.g
    public boolean isOpen() {
        return this.f23658q.isOpen();
    }

    @Override // p142o1.g
    public List k() {
        return this.f23658q.getAttachedDbs();
    }

    @Override // p142o1.g
    public void l0() {
        this.f23658q.endTransaction();
    }

    @Override // p142o1.g
    public void q(String sql) {
        n.h(sql, "sql");
        this.f23658q.execSQL(sql);
    }

    @Override // p142o1.g
    public k w(String sql) {
        n.h(sql, "sql");
        SQLiteStatement sQLiteStatementCompileStatement = this.f23658q.compileStatement(sql);
        n.g(sQLiteStatementCompileStatement, "delegate.compileStatement(sql)");
        return new h(sQLiteStatementCompileStatement);
    }
}
