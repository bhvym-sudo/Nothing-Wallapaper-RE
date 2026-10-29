package p257z6;

import E8.g;
import E8.i;
import android.net.Uri;
import e9.B;
import e9.f;
import e9.j;
import e9.o;
import e9.z;
import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.Flushable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.AbstractC1457h;
import kotlin.jvm.internal.n;
import p079h8.A;
import p219v8.l;

/* JADX INFO: loaded from: classes2.dex */
public final class b implements Closeable, Flushable {

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public static final a f30727L = new a(null);

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public static final String f30728M = "journal";

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public static final String f30729N = "journal.tmp";

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public static final String f30730O = "journal.bkp";

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public static final String f30731P = "libcore.io.DiskLruCache";

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public static final String f30732Q = "1";

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public static final long f30733R = -1;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public static final g f30734S = new g("[a-z0-9_-]{1,120}");

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public static final String f30735T = "CLEAN";

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public static final String f30736U = "DIRTY";

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public static final String f30737V = "REMOVE";

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public static final String f30738W = "READ";

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public static final String f30739X = "DisLruCache";

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private final LinkedHashMap f30740A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private int f30741B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private boolean f30742C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private boolean f30743D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private boolean f30744E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private boolean f30745F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private boolean f30746G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private boolean f30747H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private long f30748I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    private final T8.d f30749J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    private final e f30750K;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final Y8.a f30751q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final File f30752r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final int f30753s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final int f30754t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private long f30755u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final File f30756v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final File f30757w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private final File f30758x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private long f30759y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private f f30760z;

    public static final class a {
        public /* synthetic */ a(AbstractC1457h abstractC1457h) {
            this();
        }

        private a() {
        }
    }

    /* JADX INFO: renamed from: z6.b$b, reason: collision with other inner class name */
    public final class C0766b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final c f30761a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final boolean[] f30762b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f30763c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ b f30764d;

        public C0766b(b bVar, c entry) {
            n.h(entry, "entry");
            this.f30764d = bVar;
            this.f30761a = entry;
            this.f30762b = entry.g() ? null : new boolean[bVar.A0()];
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final A h(b bVar, C0766b c0766b, IOException it) {
            n.h(it, "it");
            synchronized (bVar) {
                c0766b.d();
            }
            return A.f21846a;
        }

        public final void b() {
            b bVar = this.f30764d;
            synchronized (bVar) {
                try {
                    if (this.f30763c) {
                        throw new IllegalStateException("Check failed.");
                    }
                    if (n.d(this.f30761a.b(), this)) {
                        bVar.I(this, false);
                    }
                    this.f30763c = true;
                    A a10 = A.f21846a;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        public final void c() {
            b bVar = this.f30764d;
            synchronized (bVar) {
                try {
                    if (this.f30763c) {
                        throw new IllegalStateException("Check failed.");
                    }
                    if (n.d(this.f30761a.b(), this)) {
                        bVar.I(this, true);
                    }
                    this.f30763c = true;
                    A a10 = A.f21846a;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        public final void d() {
            if (n.d(this.f30761a.b(), this)) {
                if (this.f30764d.f30743D) {
                    this.f30764d.I(this, false);
                } else {
                    this.f30761a.q(true);
                }
            }
        }

        public final c e() {
            return this.f30761a;
        }

        public final boolean[] f() {
            return this.f30762b;
        }

        public final z g(int i10) {
            final b bVar = this.f30764d;
            synchronized (bVar) {
                if (this.f30763c) {
                    throw new IllegalStateException("Check failed.");
                }
                if (!n.d(this.f30761a.b(), this)) {
                    return o.b();
                }
                if (!this.f30761a.g()) {
                    boolean[] zArr = this.f30762b;
                    n.e(zArr);
                    zArr[i10] = true;
                }
                try {
                    return new p257z6.d(bVar.w0().b((File) this.f30761a.c().get(i10)), new l() { // from class: z6.c
                        @Override // p219v8.l
                        public final Object f(Object obj) {
                            return b.C0766b.h(bVar, this, (IOException) obj);
                        }
                    });
                } catch (FileNotFoundException unused) {
                    return o.b();
                }
            }
        }
    }

    public final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f30765a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final long[] f30766b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final List f30767c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final List f30768d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private boolean f30769e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private boolean f30770f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private C0766b f30771g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private int f30772h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private long f30773i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ b f30774j;

        public static final class a extends j {

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            private boolean f30775r;

            /* JADX INFO: renamed from: s, reason: collision with root package name */
            final /* synthetic */ b f30776s;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            final /* synthetic */ c f30777t;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(B b10, b bVar, c cVar) {
                super(b10);
                this.f30776s = bVar;
                this.f30777t = cVar;
            }

            @Override // e9.j, e9.B, java.io.Closeable, java.lang.AutoCloseable
            public void close() {
                super.close();
                if (this.f30775r) {
                    return;
                }
                this.f30775r = true;
                b bVar = this.f30776s;
                c cVar = this.f30777t;
                synchronized (bVar) {
                    try {
                        cVar.n(cVar.f() - 1);
                        if (cVar.f() == 0 && cVar.i()) {
                            bVar.g1(cVar);
                        }
                        A a10 = A.f21846a;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        }

        public c(b bVar, String key) {
            n.h(key, "key");
            this.f30774j = bVar;
            this.f30765a = key;
            this.f30766b = new long[bVar.A0()];
            this.f30767c = new ArrayList();
            this.f30768d = new ArrayList();
            StringBuilder sb = new StringBuilder(key);
            sb.append('.');
            int length = sb.length();
            int iA0 = bVar.A0();
            for (int i10 = 0; i10 < iA0; i10++) {
                sb.append(i10);
                this.f30767c.add(new File(this.f30774j.t0(), sb.toString()));
                sb.append(".tmp");
                this.f30768d.add(new File(this.f30774j.t0(), sb.toString()));
                sb.setLength(length);
            }
        }

        private final Void j(List list) throws IOException {
            throw new IOException("unexpected journal line: " + list);
        }

        private final B k(int i10) {
            B bA = this.f30774j.w0().a((File) this.f30767c.get(i10));
            if (this.f30774j.f30743D) {
                return bA;
            }
            this.f30772h++;
            return new a(bA, this.f30774j, this);
        }

        public final List a() {
            return this.f30767c;
        }

        public final C0766b b() {
            return this.f30771g;
        }

        public final List c() {
            return this.f30768d;
        }

        public final String d() {
            return this.f30765a;
        }

        public final long[] e() {
            return this.f30766b;
        }

        public final int f() {
            return this.f30772h;
        }

        public final boolean g() {
            return this.f30769e;
        }

        public final long h() {
            return this.f30773i;
        }

        public final boolean i() {
            return this.f30770f;
        }

        public final void l(C0766b c0766b) {
            this.f30771g = c0766b;
        }

        public final void m(List strings) throws IOException {
            n.h(strings, "strings");
            if (strings.size() != this.f30774j.A0()) {
                j(strings);
                throw new p079h8.f();
            }
            try {
                int size = strings.size();
                for (int i10 = 0; i10 < size; i10++) {
                    this.f30766b[i10] = Long.parseLong((String) strings.get(i10));
                }
            } catch (NumberFormatException unused) {
                j(strings);
                throw new p079h8.f();
            }
        }

        public final void n(int i10) {
            this.f30772h = i10;
        }

        public final void o(boolean z9) {
            this.f30769e = z9;
        }

        public final void p(long j9) {
            this.f30773i = j9;
        }

        public final void q(boolean z9) {
            this.f30770f = z9;
        }

        public final d r() {
            if (!this.f30769e) {
                return null;
            }
            if (!this.f30774j.f30743D && (this.f30771g != null || this.f30770f)) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            long[] jArr = (long[]) this.f30766b.clone();
            try {
                int iA0 = this.f30774j.A0();
                for (int i10 = 0; i10 < iA0; i10++) {
                    arrayList.add(k(i10));
                }
                return new d(this.f30774j, this.f30765a, this.f30773i, arrayList, jArr, this.f30767c);
            } catch (FileNotFoundException unused) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    Q8.d.m((B) it.next());
                }
                try {
                    this.f30774j.g1(this);
                } catch (IOException unused2) {
                }
                return null;
            }
        }

        public final void s(f writer) {
            n.h(writer, "writer");
            for (long j9 : this.f30766b) {
                writer.F(32).Z0(j9);
            }
        }
    }

    public final class d implements Closeable {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private final String f30778q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private final long f30779r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        private final List f30780s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private final long[] f30781t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        private final List f30782u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        final /* synthetic */ b f30783v;

        public d(b bVar, String key, long j9, List sources, long[] lengths, List files) {
            n.h(key, "key");
            n.h(sources, "sources");
            n.h(lengths, "lengths");
            n.h(files, "files");
            this.f30783v = bVar;
            this.f30778q = key;
            this.f30779r = j9;
            this.f30780s = sources;
            this.f30781t = lengths;
            this.f30782u = files;
        }

        public final B a(int i10) {
            return (B) this.f30780s.get(i10);
        }

        public final Uri b(int i10) {
            File file = (File) this.f30782u.get(i10);
            if (!file.exists() || file.length() <= 0) {
                return null;
            }
            return Uri.fromFile(file);
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            Iterator it = this.f30780s.iterator();
            while (it.hasNext()) {
                Q8.d.m((B) it.next());
            }
        }
    }

    public static final class e extends T8.a {
        e() {
            super("Effect Image Cache", false, 2, null);
        }

        @Override // T8.a
        public long f() {
            b bVar = b.this;
            synchronized (bVar) {
                if (!bVar.f30744E || bVar.q0()) {
                    return -1L;
                }
                try {
                    bVar.i1();
                } catch (IOException unused) {
                    bVar.f30746G = true;
                }
                try {
                    if (bVar.I0()) {
                        bVar.c1();
                        bVar.f30741B = 0;
                    }
                } catch (IOException unused2) {
                    bVar.f30747H = true;
                    bVar.f30760z = o.c(o.b());
                }
                return -1L;
            }
        }
    }

    public b(Y8.a fileSystem, File directory, int i10, int i11, long j9, T8.e taskRunner) {
        n.h(fileSystem, "fileSystem");
        n.h(directory, "directory");
        n.h(taskRunner, "taskRunner");
        this.f30751q = fileSystem;
        this.f30752r = directory;
        this.f30753s = i10;
        this.f30754t = i11;
        this.f30755u = j9;
        this.f30740A = new LinkedHashMap(0, 0.75f, true);
        this.f30749J = taskRunner.i();
        this.f30750K = new e();
        if (j9 <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        if (i11 <= 0) {
            throw new IllegalArgumentException("valueCount <= 0");
        }
        this.f30756v = new File(directory, f30728M);
        this.f30757w = new File(directory, f30729N);
        this.f30758x = new File(directory, f30730O);
    }

    private final synchronized void G() {
        if (this.f30745F) {
            throw new IllegalStateException("cache is closed");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean I0() {
        int i10 = this.f30741B;
        return i10 >= 2000 && i10 >= this.f30740A.size();
    }

    private final f P0() {
        return o.c(new p257z6.d(this.f30751q.g(this.f30756v), new l() { // from class: z6.a
            @Override // p219v8.l
            public final Object f(Object obj) {
                return b.T0(this.f30726q, (IOException) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final A T0(b bVar, IOException it) {
        n.h(it, "it");
        bVar.f30742C = true;
        return A.f21846a;
    }

    public static /* synthetic */ C0766b U(b bVar, String str, long j9, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            j9 = f30733R;
        }
        return bVar.Q(str, j9);
    }

    private final void U0() {
        this.f30751q.f(this.f30757w);
        Iterator it = this.f30740A.values().iterator();
        while (it.hasNext()) {
            Object next = it.next();
            n.g(next, "next(...)");
            c cVar = (c) next;
            int i10 = 0;
            if (cVar.b() == null) {
                int i11 = this.f30754t;
                while (i10 < i11) {
                    this.f30759y += cVar.e()[i10];
                    i10++;
                }
            } else {
                cVar.l(null);
                int i12 = this.f30754t;
                while (i10 < i12) {
                    this.f30751q.f((File) cVar.a().get(i10));
                    this.f30751q.f((File) cVar.c().get(i10));
                    i10++;
                }
                it.remove();
            }
        }
    }

    private final void W0() throws IOException {
        e9.g gVarD = o.d(this.f30751q.a(this.f30756v));
        try {
            String strZ0 = gVarD.z0();
            String strZ1 = gVarD.z0();
            String strZ2 = gVarD.z0();
            String strZ3 = gVarD.z0();
            String strZ4 = gVarD.z0();
            if (!n.d(f30731P, strZ0) || !n.d(f30732Q, strZ1) || !n.d(String.valueOf(this.f30753s), strZ2) || !n.d(String.valueOf(this.f30754t), strZ3) || strZ4.length() > 0) {
                throw new IOException("unexpected journal header: [" + strZ0 + ", " + strZ1 + ", " + strZ3 + ", " + strZ4 + "]");
            }
            int i10 = 0;
            while (true) {
                try {
                    X0(gVarD.z0());
                    i10++;
                } catch (EOFException unused) {
                    this.f30741B = i10 - this.f30740A.size();
                    if (gVarD.D()) {
                        this.f30760z = P0();
                    } else {
                        c1();
                    }
                    A a10 = A.f21846a;
                    p189s8.b.a(gVarD, null);
                    return;
                }
            }
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                p189s8.b.a(gVarD, th);
                throw th2;
            }
        }
    }

    private final void X0(String str) throws IOException {
        String strSubstring;
        int iC0 = i.c0(str, ' ', 0, false, 6, null);
        if (iC0 == -1) {
            throw new IOException("unexpected journal line: " + str);
        }
        int i10 = iC0 + 1;
        int iC1 = i.c0(str, ' ', i10, false, 4, null);
        if (iC1 == -1) {
            strSubstring = str.substring(i10);
            n.g(strSubstring, "substring(...)");
            String str2 = f30737V;
            if (iC0 == str2.length() && i.M(str, str2, false, 2, null)) {
                this.f30740A.remove(strSubstring);
                return;
            }
        } else {
            strSubstring = str.substring(i10, iC1);
            n.g(strSubstring, "substring(...)");
        }
        c cVar = (c) this.f30740A.get(strSubstring);
        if (cVar == null) {
            cVar = new c(this, strSubstring);
            this.f30740A.put(strSubstring, cVar);
        }
        if (iC1 != -1) {
            String str3 = f30735T;
            if (iC0 == str3.length() && i.M(str, str3, false, 2, null)) {
                String strSubstring2 = str.substring(iC1 + 1);
                n.g(strSubstring2, "substring(...)");
                List listC0 = i.C0(strSubstring2, new char[]{' '}, false, 0, 6, null);
                cVar.o(true);
                cVar.l(null);
                cVar.m(listC0);
                return;
            }
        }
        if (iC1 == -1) {
            String str4 = f30736U;
            if (iC0 == str4.length() && i.M(str, str4, false, 2, null)) {
                cVar.l(new C0766b(this, cVar));
                return;
            }
        }
        if (iC1 == -1) {
            String str5 = f30738W;
            if (iC0 == str5.length() && i.M(str, str5, false, 2, null)) {
                return;
            }
        }
        throw new IOException("unexpected journal line: " + str);
    }

    private final boolean h1() {
        for (Object obj : this.f30740A.values()) {
            n.g(obj, "next(...)");
            c cVar = (c) obj;
            if (!cVar.i()) {
                g1(cVar);
                return true;
            }
        }
        return false;
    }

    private final void j1(String str) {
        if (f30734S.a(str)) {
            return;
        }
        throw new IllegalArgumentException(("keys must match regex [a-z0-9_-]{1,120}: \"" + str + "\"").toString());
    }

    public final int A0() {
        return this.f30754t;
    }

    public final synchronized void B0() {
        try {
            if (this.f30744E) {
                return;
            }
            if (this.f30751q.d(this.f30758x)) {
                if (this.f30751q.d(this.f30756v)) {
                    this.f30751q.f(this.f30758x);
                } else {
                    this.f30751q.e(this.f30758x, this.f30756v);
                }
            }
            this.f30743D = p257z6.e.a(this.f30751q, this.f30758x);
            if (this.f30751q.d(this.f30756v)) {
                try {
                    W0();
                    U0();
                    this.f30744E = true;
                    return;
                } catch (IOException e10) {
                    com.nothing.wallpaper.common.log.c.o(f30739X, "DiskLruCache " + this.f30752r + " is corrupt: " + e10.getMessage() + ", removing");
                    try {
                        K();
                        this.f30745F = false;
                        c1();
                        this.f30744E = true;
                    } catch (Throwable th) {
                        this.f30745F = false;
                        throw th;
                    }
                }
            }
            c1();
            this.f30744E = true;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized void I(C0766b editor, boolean z9) {
        n.h(editor, "editor");
        c cVarE = editor.e();
        if (!n.d(cVarE.b(), editor)) {
            throw new IllegalStateException("Check failed.");
        }
        if (z9 && !cVarE.g()) {
            int i10 = this.f30754t;
            for (int i11 = 0; i11 < i10; i11++) {
                boolean[] zArrF = editor.f();
                n.e(zArrF);
                if (!zArrF[i11]) {
                    editor.b();
                    throw new IllegalStateException("Newly created entry didn't create value for index " + i11);
                }
                if (!this.f30751q.d((File) cVarE.c().get(i11))) {
                    editor.b();
                    return;
                }
            }
        }
        int i12 = this.f30754t;
        for (int i13 = 0; i13 < i12; i13++) {
            File file = (File) cVarE.c().get(i13);
            if (!z9 || cVarE.i()) {
                this.f30751q.f(file);
            } else if (this.f30751q.d(file)) {
                File file2 = (File) cVarE.a().get(i13);
                this.f30751q.e(file, file2);
                long j9 = cVarE.e()[i13];
                long jH = this.f30751q.h(file2);
                cVarE.e()[i13] = jH;
                this.f30759y = (this.f30759y - j9) + jH;
            }
        }
        cVarE.l(null);
        if (cVarE.i()) {
            g1(cVarE);
            return;
        }
        this.f30741B++;
        f fVar = this.f30760z;
        n.e(fVar);
        if (cVarE.g() || z9) {
            cVarE.o(true);
            fVar.d0(f30735T).F(32);
            fVar.d0(cVarE.d());
            cVarE.s(fVar);
            fVar.F(10);
            if (z9) {
                long j10 = this.f30748I;
                this.f30748I = 1 + j10;
                cVarE.p(j10);
            }
        } else {
            this.f30740A.remove(cVarE.d());
            fVar.d0(f30737V).F(32);
            fVar.d0(cVarE.d());
            fVar.F(10);
        }
        fVar.flush();
        if (this.f30759y > this.f30755u || I0()) {
            T8.d.j(this.f30749J, this.f30750K, 0L, 2, null);
        }
    }

    public final void K() {
        close();
        this.f30751q.c(this.f30752r);
    }

    public final synchronized List O0() {
        ArrayList arrayList;
        B0();
        arrayList = new ArrayList();
        Set setKeySet = this.f30740A.keySet();
        n.g(setKeySet, "<get-keys>(...)");
        arrayList.addAll(setKeySet);
        return arrayList;
    }

    public final synchronized C0766b Q(String key, long j9) {
        n.h(key, "key");
        B0();
        G();
        j1(key);
        c cVar = (c) this.f30740A.get(key);
        if (j9 != f30733R && (cVar == null || cVar.h() != j9)) {
            return null;
        }
        if ((cVar != null ? cVar.b() : null) != null) {
            return null;
        }
        if (cVar != null && cVar.f() != 0) {
            return null;
        }
        if (!this.f30746G && !this.f30747H) {
            f fVar = this.f30760z;
            n.e(fVar);
            fVar.d0(f30736U).F(32).d0(key).F(10);
            fVar.flush();
            if (this.f30742C) {
                return null;
            }
            if (cVar == null) {
                cVar = new c(this, key);
                this.f30740A.put(key, cVar);
            }
            C0766b c0766b = new C0766b(this, cVar);
            cVar.l(c0766b);
            return c0766b;
        }
        T8.d.j(this.f30749J, this.f30750K, 0L, 2, null);
        return null;
    }

    public final synchronized void Y(List list) {
        try {
            B0();
            Collection collectionValues = this.f30740A.values();
            n.g(collectionValues, "<get-values>(...)");
            for (c cVar : (c[]) collectionValues.toArray(new c[0])) {
                n.e(cVar);
                if (list == null || !list.contains(cVar.d())) {
                    g1(cVar);
                }
            }
            this.f30746G = false;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized d b0(String key) {
        n.h(key, "key");
        B0();
        G();
        j1(key);
        c cVar = (c) this.f30740A.get(key);
        if (cVar == null) {
            return null;
        }
        d dVarR = cVar.r();
        if (dVarR == null) {
            return null;
        }
        this.f30741B++;
        f fVar = this.f30760z;
        n.e(fVar);
        fVar.d0(f30738W).F(32).d0(key).F(10);
        if (I0()) {
            T8.d.j(this.f30749J, this.f30750K, 0L, 2, null);
        }
        return dVarR;
    }

    public final synchronized void c1() {
        try {
            f fVar = this.f30760z;
            if (fVar != null) {
                fVar.close();
            }
            f fVarC = o.c(this.f30751q.b(this.f30757w));
            try {
                fVarC.d0(f30731P).F(10);
                fVarC.d0(f30732Q).F(10);
                fVarC.Z0(this.f30753s).F(10);
                fVarC.Z0(this.f30754t).F(10);
                fVarC.F(10);
                for (Object obj : this.f30740A.values()) {
                    n.g(obj, "next(...)");
                    c cVar = (c) obj;
                    if (cVar.b() != null) {
                        fVarC.d0(f30736U).F(32);
                        fVarC.d0(cVar.d());
                        fVarC.F(10);
                    } else {
                        fVarC.d0(f30735T).F(32);
                        fVarC.d0(cVar.d());
                        cVar.s(fVarC);
                        fVarC.F(10);
                    }
                }
                A a10 = A.f21846a;
                p189s8.b.a(fVarC, null);
                if (this.f30751q.d(this.f30756v)) {
                    this.f30751q.e(this.f30756v, this.f30758x);
                }
                this.f30751q.e(this.f30757w, this.f30756v);
                this.f30751q.f(this.f30758x);
                this.f30760z = P0();
                this.f30742C = false;
                this.f30747H = false;
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    p189s8.b.a(fVarC, th);
                    throw th2;
                }
            }
        } catch (Throwable th3) {
            throw th3;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
        C0766b c0766bB;
        try {
            if (this.f30744E && !this.f30745F) {
                Collection collectionValues = this.f30740A.values();
                n.g(collectionValues, "<get-values>(...)");
                for (c cVar : (c[]) collectionValues.toArray(new c[0])) {
                    n.e(cVar);
                    if (cVar.b() != null && (c0766bB = cVar.b()) != null) {
                        c0766bB.d();
                    }
                }
                i1();
                f fVar = this.f30760z;
                n.e(fVar);
                fVar.close();
                this.f30760z = null;
                this.f30745F = true;
                return;
            }
            this.f30745F = true;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // java.io.Flushable
    public synchronized void flush() {
        if (this.f30744E) {
            G();
            i1();
            f fVar = this.f30760z;
            n.e(fVar);
            fVar.flush();
        }
    }

    public final boolean g1(c entry) {
        f fVar;
        n.h(entry, "entry");
        if (!this.f30743D) {
            if (entry.f() > 0 && (fVar = this.f30760z) != null) {
                fVar.d0(f30736U);
                fVar.F(32);
                fVar.d0(entry.d());
                fVar.F(10);
                fVar.flush();
            }
            if (entry.f() > 0 || entry.b() != null) {
                entry.q(true);
                return true;
            }
        }
        C0766b c0766bB = entry.b();
        if (c0766bB != null) {
            c0766bB.d();
        }
        int i10 = this.f30754t;
        for (int i11 = 0; i11 < i10; i11++) {
            this.f30751q.f((File) entry.a().get(i11));
            this.f30759y -= entry.e()[i11];
            entry.e()[i11] = 0;
        }
        this.f30741B++;
        f fVar2 = this.f30760z;
        if (fVar2 != null) {
            fVar2.d0(f30737V);
            fVar2.F(32);
            fVar2.d0(entry.d());
            fVar2.F(10);
        }
        this.f30740A.remove(entry.d());
        if (I0()) {
            T8.d.j(this.f30749J, this.f30750K, 0L, 2, null);
        }
        return true;
    }

    public final void i1() {
        while (this.f30759y > this.f30755u) {
            if (!h1()) {
                return;
            }
        }
        this.f30746G = false;
    }

    public final synchronized boolean isClosed() {
        return this.f30745F;
    }

    public final boolean q0() {
        return this.f30745F;
    }

    public final synchronized boolean remove(String key) {
        n.h(key, "key");
        B0();
        G();
        j1(key);
        c cVar = (c) this.f30740A.get(key);
        if (cVar == null) {
            return false;
        }
        boolean zG1 = g1(cVar);
        if (zG1 && this.f30759y <= this.f30755u) {
            this.f30746G = false;
        }
        return zG1;
    }

    public final File t0() {
        return this.f30752r;
    }

    public final Y8.a w0() {
        return this.f30751q;
    }
}
