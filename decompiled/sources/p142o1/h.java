package p142o1;

import E8.i;
import android.content.Context;
import android.database.sqlite.SQLiteException;
import android.util.Log;
import android.util.Pair;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC1457h;
import kotlin.jvm.internal.n;

/* JADX INFO: loaded from: classes.dex */
public interface h extends Closeable {

    public static abstract class a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final C0597a f23337b = new C0597a(null);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f23338a;

        /* JADX INFO: renamed from: o1.h$a$a, reason: collision with other inner class name */
        public static final class C0597a {
            public /* synthetic */ C0597a(AbstractC1457h abstractC1457h) {
                this();
            }

            private C0597a() {
            }
        }

        public a(int i10) {
            this.f23338a = i10;
        }

        private final void a(String str) {
            if (i.B(str, ":memory:", true)) {
                return;
            }
            int length = str.length() - 1;
            int i10 = 0;
            boolean z9 = false;
            while (i10 <= length) {
                boolean z10 = n.i(str.charAt(!z9 ? i10 : length), 32) <= 0;
                if (z9) {
                    if (!z10) {
                        break;
                    } else {
                        length--;
                    }
                } else if (z10) {
                    i10++;
                } else {
                    z9 = true;
                }
            }
            if (str.subSequence(i10, length + 1).toString().length() == 0) {
                return;
            }
            Log.w("SupportSQLite", "deleting the database file: " + str);
            try {
                p142o1.b.a(new File(str));
            } catch (Exception e10) {
                Log.w("SupportSQLite", "delete failed: ", e10);
            }
        }

        public void b(g db) {
            n.h(db, "db");
        }

        public void c(g db) {
            n.h(db, "db");
            Log.e("SupportSQLite", "Corruption reported by sqlite on database: " + db + ".path");
            if (!db.isOpen()) {
                String path = db.getPath();
                if (path != null) {
                    a(path);
                    return;
                }
                return;
            }
            List listK = null;
            try {
                try {
                    listK = db.k();
                } catch (SQLiteException unused) {
                }
                try {
                    db.close();
                } catch (IOException unused2) {
                }
                if (listK != null) {
                    return;
                }
            } finally {
                if (listK != null) {
                    Iterator it = listK.iterator();
                    while (it.hasNext()) {
                        Object obj = ((Pair) it.next()).second;
                        n.g(obj, "p.second");
                        a((String) obj);
                    }
                } else {
                    String path2 = db.getPath();
                    if (path2 != null) {
                        a(path2);
                    }
                }
            }
        }

        public abstract void d(g gVar);

        public abstract void e(g gVar, int i10, int i11);

        public void f(g db) {
            n.h(db, "db");
        }

        public abstract void g(g gVar, int i10, int i11);
    }

    public static final class b {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final C0598b f23339f = new C0598b(null);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Context f23340a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f23341b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final a f23342c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final boolean f23343d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final boolean f23344e;

        public static class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final Context f23345a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private String f23346b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private a f23347c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private boolean f23348d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            private boolean f23349e;

            public a(Context context) {
                n.h(context, "context");
                this.f23345a = context;
            }

            public b a() {
                String str;
                a aVar = this.f23347c;
                if (aVar == null) {
                    throw new IllegalArgumentException("Must set a callback to create the configuration.");
                }
                if (this.f23348d && ((str = this.f23346b) == null || str.length() == 0)) {
                    throw new IllegalArgumentException("Must set a non-null database name to a configuration that uses the no backup directory.");
                }
                return new b(this.f23345a, this.f23346b, aVar, this.f23348d, this.f23349e);
            }

            public a b(a callback) {
                n.h(callback, "callback");
                this.f23347c = callback;
                return this;
            }

            public a c(String str) {
                this.f23346b = str;
                return this;
            }
        }

        /* JADX INFO: renamed from: o1.h$b$b, reason: collision with other inner class name */
        public static final class C0598b {
            public /* synthetic */ C0598b(AbstractC1457h abstractC1457h) {
                this();
            }

            public final a a(Context context) {
                n.h(context, "context");
                return new a(context);
            }

            private C0598b() {
            }
        }

        public b(Context context, String str, a callback, boolean z9, boolean z10) {
            n.h(context, "context");
            n.h(callback, "callback");
            this.f23340a = context;
            this.f23341b = str;
            this.f23342c = callback;
            this.f23343d = z9;
            this.f23344e = z10;
        }

        public static final a a(Context context) {
            return f23339f.a(context);
        }
    }

    public interface c {
        h a(b bVar);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close();

    g e0();

    String getDatabaseName();

    void setWriteAheadLoggingEnabled(boolean z9);
}
