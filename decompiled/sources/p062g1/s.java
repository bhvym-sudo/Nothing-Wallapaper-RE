package p062g1;

import android.database.Cursor;
import androidx.appcompat.app.o;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC1457h;
import kotlin.jvm.internal.n;
import p142o1.g;
import p142o1.h;

/* JADX INFO: loaded from: classes.dex */
public class s extends h.a {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final a f21110g = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private f f21111c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final b f21112d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f21113e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final String f21114f;

    public static final class a {
        public /* synthetic */ a(AbstractC1457h abstractC1457h) {
            this();
        }

        public final boolean a(g db) throws IOException {
            n.h(db, "db");
            Cursor cursorF0 = db.f0("SELECT count(*) FROM sqlite_master WHERE name != 'android_metadata'");
            try {
                boolean z9 = false;
                if (cursorF0.moveToFirst() && cursorF0.getInt(0) == 0) {
                    z9 = true;
                }
                p189s8.b.a(cursorF0, null);
                return z9;
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    p189s8.b.a(cursorF0, th);
                    throw th2;
                }
            }
        }

        public final boolean b(g db) throws IOException {
            n.h(db, "db");
            Cursor cursorF0 = db.f0("SELECT 1 FROM sqlite_master WHERE type = 'table' AND name='room_master_table'");
            try {
                boolean z9 = false;
                if (cursorF0.moveToFirst() && cursorF0.getInt(0) != 0) {
                    z9 = true;
                }
                p189s8.b.a(cursorF0, null);
                return z9;
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    p189s8.b.a(cursorF0, th);
                    throw th2;
                }
            }
        }

        private a() {
        }
    }

    public static abstract class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f21115a;

        public b(int i10) {
            this.f21115a = i10;
        }

        public abstract void a(g gVar);

        public abstract void b(g gVar);

        public abstract void c(g gVar);

        public abstract void d(g gVar);

        public abstract void e(g gVar);

        public abstract void f(g gVar);

        public abstract c g(g gVar);
    }

    public static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f21116a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f21117b;

        public c(boolean z9, String str) {
            this.f21116a = z9;
            this.f21117b = str;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(f configuration, b delegate, String identityHash, String legacyHash) {
        super(delegate.f21115a);
        n.h(configuration, "configuration");
        n.h(delegate, "delegate");
        n.h(identityHash, "identityHash");
        n.h(legacyHash, "legacyHash");
        this.f21111c = configuration;
        this.f21112d = delegate;
        this.f21113e = identityHash;
        this.f21114f = legacyHash;
    }

    private final void h(g gVar) throws IOException {
        if (!f21110g.b(gVar)) {
            c cVarG = this.f21112d.g(gVar);
            if (cVarG.f21116a) {
                this.f21112d.e(gVar);
                j(gVar);
                return;
            } else {
                throw new IllegalStateException("Pre-packaged database has an invalid schema: " + cVarG.f21117b);
            }
        }
        Cursor cursorR0 = gVar.R0(new p142o1.a("SELECT identity_hash FROM room_master_table WHERE id = 42 LIMIT 1"));
        try {
            String string = cursorR0.moveToFirst() ? cursorR0.getString(0) : null;
            p189s8.b.a(cursorR0, null);
            if (n.d(this.f21113e, string) || n.d(this.f21114f, string)) {
                return;
            }
            throw new IllegalStateException("Room cannot verify the data integrity. Looks like you've changed schema but forgot to update the version number. You can simply fix this by increasing the version number. Expected identity hash: " + this.f21113e + ", found: " + string);
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                p189s8.b.a(cursorR0, th);
                throw th2;
            }
        }
    }

    private final void i(g gVar) {
        gVar.q("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
    }

    private final void j(g gVar) {
        i(gVar);
        gVar.q(r.a(this.f21113e));
    }

    @Override // o1.h.a
    public void b(g db) {
        n.h(db, "db");
        super.b(db);
    }

    @Override // o1.h.a
    public void d(g db) throws IOException {
        n.h(db, "db");
        boolean zA = f21110g.a(db);
        this.f21112d.a(db);
        if (!zA) {
            c cVarG = this.f21112d.g(db);
            if (!cVarG.f21116a) {
                throw new IllegalStateException("Pre-packaged database has an invalid schema: " + cVarG.f21117b);
            }
        }
        j(db);
        this.f21112d.c(db);
    }

    @Override // o1.h.a
    public void e(g db, int i10, int i11) {
        n.h(db, "db");
        g(db, i10, i11);
    }

    @Override // o1.h.a
    public void f(g db) throws IOException {
        n.h(db, "db");
        super.f(db);
        h(db);
        this.f21112d.d(db);
        this.f21111c = null;
    }

    @Override // o1.h.a
    public void g(g db, int i10, int i11) {
        List listA;
        n.h(db, "db");
        f fVar = this.f21111c;
        if (fVar == null || (listA = fVar.f21038d.a(i10, i11)) == null) {
            f fVar2 = this.f21111c;
            if (fVar2 != null && !fVar2.a(i10, i11)) {
                this.f21112d.b(db);
                this.f21112d.a(db);
                return;
            }
            throw new IllegalStateException("A migration from " + i10 + " to " + i11 + " was required but not found. Please provide the necessary Migration path via RoomDatabase.Builder.addMigration(Migration ...) or allow for destructive migrations via one of the RoomDatabase.Builder.fallbackToDestructiveMigration* methods.");
        }
        this.f21112d.f(db);
        Iterator it = listA.iterator();
        if (it.hasNext()) {
            o.a(it.next());
            throw null;
        }
        c cVarG = this.f21112d.g(db);
        if (cVarG.f21116a) {
            this.f21112d.e(db);
            j(db);
        } else {
            throw new IllegalStateException("Migration didn't properly handle: " + cVarG.f21117b);
        }
    }
}
