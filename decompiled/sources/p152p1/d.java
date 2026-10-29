package p152p1;

import android.content.Context;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;
import java.io.File;
import java.util.UUID;
import kotlin.jvm.internal.AbstractC1457h;
import kotlin.jvm.internal.n;
import kotlin.jvm.internal.o;
import p079h8.i;
import p142o1.g;
import p142o1.h;

/* JADX INFO: loaded from: classes.dex */
public final class d implements h {

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final a f23660x = new a(null);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final Context f23661q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final String f23662r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final h.a f23663s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final boolean f23664t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final boolean f23665u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final p079h8.h f23666v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private boolean f23667w;

    public static final class a {
        public /* synthetic */ a(AbstractC1457h abstractC1457h) {
            this();
        }

        private a() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private p152p1.c f23668a;

        public b(p152p1.c cVar) {
            this.f23668a = cVar;
        }

        public final p152p1.c a() {
            return this.f23668a;
        }

        public final void b(p152p1.c cVar) {
            this.f23668a = cVar;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static final class c extends SQLiteOpenHelper {

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public static final C0623c f23669x = new C0623c(null);

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private final Context f23670q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private final b f23671r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        private final h.a f23672s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private final boolean f23673t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        private boolean f23674u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        private final p162q1.a f23675v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        private boolean f23676w;

        private static final class a extends RuntimeException {

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            private final b f23677q;

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            private final Throwable f23678r;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(b callbackName, Throwable cause) {
                super(cause);
                n.h(callbackName, "callbackName");
                n.h(cause, "cause");
                this.f23677q = callbackName;
                this.f23678r = cause;
            }

            public final b a() {
                return this.f23677q;
            }

            @Override // java.lang.Throwable
            public Throwable getCause() {
                return this.f23678r;
            }
        }

        public enum b {
            ON_CONFIGURE,
            ON_CREATE,
            ON_UPGRADE,
            ON_DOWNGRADE,
            ON_OPEN
        }

        /* JADX INFO: renamed from: p1.d$c$c, reason: collision with other inner class name */
        public static final class C0623c {
            public /* synthetic */ C0623c(AbstractC1457h abstractC1457h) {
                this();
            }

            public final p152p1.c a(b refHolder, SQLiteDatabase sqLiteDatabase) {
                n.h(refHolder, "refHolder");
                n.h(sqLiteDatabase, "sqLiteDatabase");
                p152p1.c cVarA = refHolder.a();
                if (cVarA != null && cVarA.f(sqLiteDatabase)) {
                    return cVarA;
                }
                p152p1.c cVar = new p152p1.c(sqLiteDatabase);
                refHolder.b(cVar);
                return cVar;
            }

            private C0623c() {
            }
        }

        /* JADX INFO: renamed from: p1.d$c$d, reason: collision with other inner class name */
        public /* synthetic */ class C0624d {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f23685a;

            static {
                int[] iArr = new int[b.values().length];
                try {
                    iArr[b.ON_CONFIGURE.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[b.ON_CREATE.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[b.ON_UPGRADE.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[b.ON_DOWNGRADE.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[b.ON_OPEN.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                f23685a = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Context context, String str, final b dbRef, final h.a callback, boolean z9) {
            String string;
            super(context, str, null, callback.f23338a, new DatabaseErrorHandler() { // from class: p1.e
                @Override // android.database.DatabaseErrorHandler
                public final void onCorruption(SQLiteDatabase sQLiteDatabase) {
                    d.c.b(callback, dbRef, sQLiteDatabase);
                }
            });
            n.h(context, "context");
            n.h(dbRef, "dbRef");
            n.h(callback, "callback");
            this.f23670q = context;
            this.f23671r = dbRef;
            this.f23672s = callback;
            this.f23673t = z9;
            if (str == null) {
                string = UUID.randomUUID().toString();
                n.g(string, "randomUUID().toString()");
            } else {
                string = str;
            }
            this.f23675v = new p162q1.a(string, context.getCacheDir(), false);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void b(h.a callback, b dbRef, SQLiteDatabase dbObj) {
            n.h(callback, "$callback");
            n.h(dbRef, "$dbRef");
            C0623c c0623c = f23669x;
            n.g(dbObj, "dbObj");
            callback.c(c0623c.a(dbRef, dbObj));
        }

        private final SQLiteDatabase j(boolean z9) {
            if (z9) {
                SQLiteDatabase writableDatabase = super.getWritableDatabase();
                n.g(writableDatabase, "{\n                super.…eDatabase()\n            }");
                return writableDatabase;
            }
            SQLiteDatabase readableDatabase = super.getReadableDatabase();
            n.g(readableDatabase, "{\n                super.…eDatabase()\n            }");
            return readableDatabase;
        }

        private final SQLiteDatabase u(boolean z9) throws Throwable {
            File parentFile;
            String databaseName = getDatabaseName();
            boolean z10 = this.f23676w;
            if (databaseName != null && !z10 && (parentFile = this.f23670q.getDatabasePath(databaseName).getParentFile()) != null) {
                parentFile.mkdirs();
                if (!parentFile.isDirectory()) {
                    Log.w("SupportSQLite", "Invalid database parent file, not a directory: " + parentFile);
                }
            }
            try {
                return j(z9);
            } catch (Throwable unused) {
                super.close();
                try {
                    Thread.sleep(500L);
                } catch (InterruptedException unused2) {
                }
                try {
                    return j(z9);
                } catch (Throwable th) {
                    super.close();
                    if (th instanceof a) {
                        a aVar = th;
                        Throwable cause = aVar.getCause();
                        int i10 = C0624d.f23685a[aVar.a().ordinal()];
                        if (i10 == 1 || i10 == 2 || i10 == 3 || i10 == 4 || !(cause instanceof SQLiteException)) {
                            throw cause;
                        }
                    } else if (!(th instanceof SQLiteException) || databaseName == null || !this.f23673t) {
                        throw th;
                    }
                    this.f23670q.deleteDatabase(databaseName);
                    try {
                        return j(z9);
                    } catch (a e10) {
                        throw e10.getCause();
                    }
                }
            }
        }

        @Override // android.database.sqlite.SQLiteOpenHelper, java.lang.AutoCloseable
        public void close() {
            try {
                p162q1.a.c(this.f23675v, false, 1, null);
                super.close();
                this.f23671r.b(null);
                this.f23676w = false;
            } finally {
                this.f23675v.d();
            }
        }

        public final g f(boolean z9) {
            g gVarG;
            try {
                this.f23675v.b((this.f23676w || getDatabaseName() == null) ? false : true);
                this.f23674u = false;
                SQLiteDatabase sQLiteDatabaseU = u(z9);
                if (this.f23674u) {
                    close();
                    gVarG = f(z9);
                } else {
                    gVarG = g(sQLiteDatabaseU);
                }
                return gVarG;
            } finally {
                this.f23675v.d();
            }
        }

        public final p152p1.c g(SQLiteDatabase sqLiteDatabase) {
            n.h(sqLiteDatabase, "sqLiteDatabase");
            return f23669x.a(this.f23671r, sqLiteDatabase);
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onConfigure(SQLiteDatabase db) {
            n.h(db, "db");
            if (!this.f23674u && this.f23672s.f23338a != db.getVersion()) {
                db.setMaxSqlCacheSize(1);
            }
            try {
                this.f23672s.b(g(db));
            } catch (Throwable th) {
                throw new a(b.ON_CONFIGURE, th);
            }
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onCreate(SQLiteDatabase sqLiteDatabase) {
            n.h(sqLiteDatabase, "sqLiteDatabase");
            try {
                this.f23672s.d(g(sqLiteDatabase));
            } catch (Throwable th) {
                throw new a(b.ON_CREATE, th);
            }
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onDowngrade(SQLiteDatabase db, int i10, int i11) {
            n.h(db, "db");
            this.f23674u = true;
            try {
                this.f23672s.e(g(db), i10, i11);
            } catch (Throwable th) {
                throw new a(b.ON_DOWNGRADE, th);
            }
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onOpen(SQLiteDatabase db) {
            n.h(db, "db");
            if (!this.f23674u) {
                try {
                    this.f23672s.f(g(db));
                } catch (Throwable th) {
                    throw new a(b.ON_OPEN, th);
                }
            }
            this.f23676w = true;
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i10, int i11) {
            n.h(sqLiteDatabase, "sqLiteDatabase");
            this.f23674u = true;
            try {
                this.f23672s.g(g(sqLiteDatabase), i10, i11);
            } catch (Throwable th) {
                throw new a(b.ON_UPGRADE, th);
            }
        }
    }

    /* JADX INFO: renamed from: p1.d$d, reason: collision with other inner class name */
    static final class C0625d extends o implements p219v8.a {
        C0625d() {
            super(0);
        }

        @Override // p219v8.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final c invoke() {
            c cVar;
            if (d.this.f23662r == null || !d.this.f23664t) {
                cVar = new c(d.this.f23661q, d.this.f23662r, new b(null), d.this.f23663s, d.this.f23665u);
            } else {
                cVar = new c(d.this.f23661q, new File(p142o1.d.a(d.this.f23661q), d.this.f23662r).getAbsolutePath(), new b(null), d.this.f23663s, d.this.f23665u);
            }
            p142o1.b.d(cVar, d.this.f23667w);
            return cVar;
        }
    }

    public d(Context context, String str, h.a callback, boolean z9, boolean z10) {
        n.h(context, "context");
        n.h(callback, "callback");
        this.f23661q = context;
        this.f23662r = str;
        this.f23663s = callback;
        this.f23664t = z9;
        this.f23665u = z10;
        this.f23666v = i.b(new C0625d());
    }

    private final c z() {
        return (c) this.f23666v.getValue();
    }

    @Override // p142o1.h, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.f23666v.a()) {
            z().close();
        }
    }

    @Override // p142o1.h
    public g e0() {
        return z().f(true);
    }

    @Override // p142o1.h
    public String getDatabaseName() {
        return this.f23662r;
    }

    @Override // p142o1.h
    public void setWriteAheadLoggingEnabled(boolean z9) {
        if (this.f23666v.a()) {
            p142o1.b.d(z(), z9);
        }
        this.f23667w = z9;
    }
}
