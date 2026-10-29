package L0;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicBoolean;
import p079h8.AbstractC1388c;

/* JADX INFO: loaded from: classes.dex */
public final class p implements F {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final File f4492a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final A f4493b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final t f4494c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final p219v8.a f4495d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final AtomicBoolean f4496e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final O8.a f4497f;

    static final class a extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        Object f4498q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        Object f4499r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        boolean f4500s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        /* synthetic */ Object f4501t;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        int f4503v;

        a(p129m8.e eVar) {
            super(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f4501t = obj;
            this.f4503v |= Integer.MIN_VALUE;
            return p.this.a(null, this);
        }
    }

    static final class b extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        Object f4504q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        Object f4505r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        Object f4506s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        Object f4507t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        /* synthetic */ Object f4508u;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        int f4510w;

        b(p129m8.e eVar) {
            super(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f4508u = obj;
            this.f4510w |= Integer.MIN_VALUE;
            return p.this.e(null, this);
        }
    }

    public p(File file, A serializer, t coordinator, p219v8.a onClose) {
        kotlin.jvm.internal.n.h(file, "file");
        kotlin.jvm.internal.n.h(serializer, "serializer");
        kotlin.jvm.internal.n.h(coordinator, "coordinator");
        kotlin.jvm.internal.n.h(onClose, "onClose");
        this.f4492a = file;
        this.f4493b = serializer;
        this.f4494c = coordinator;
        this.f4495d = onClose;
        this.f4496e = new AtomicBoolean(false);
        this.f4497f = O8.g.b(false, 1, null);
    }

    private final void f() {
        if (this.f4496e.get()) {
            throw new IllegalStateException("StorageConnection has already been disposed.");
        }
    }

    private final void g(File file) throws IOException {
        File parentFile = file.getCanonicalFile().getParentFile();
        if (parentFile != null) {
            parentFile.mkdirs();
            if (parentFile.isDirectory()) {
                return;
            }
            throw new IOException("Unable to create parent directories of " + file);
        }
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0076 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:29:0x0078  */
    /* JADX WARN: Code duplicated, block: B:55:0x007e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // L0.F
    public Object a(p219v8.q qVar, p129m8.e eVar) throws Throwable {
        a aVar;
        boolean zA;
        Throwable th;
        InterfaceC0926c interfaceC0926c;
        p pVar;
        boolean z9;
        if (eVar instanceof a) {
            aVar = (a) eVar;
            int i10 = aVar.f4503v;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                aVar.f4503v = i10 - Integer.MIN_VALUE;
            } else {
                aVar = new a(eVar);
            }
        } else {
            aVar = new a(eVar);
        }
        Object obj = aVar.f4501t;
        Object objE = p139n8.b.e();
        int i11 = aVar.f4503v;
        if (i11 == 0) {
            p079h8.r.b(obj);
            f();
            zA = O8.a.C0200a.a(this.f4497f, null, 1, null);
            try {
                n nVar = new n(this.f4492a, this.f4493b);
                try {
                    Object objA = kotlin.coroutines.jvm.internal.b.a(zA);
                    aVar.f4498q = this;
                    aVar.f4499r = nVar;
                    aVar.f4500s = zA;
                    aVar.f4503v = 1;
                    Object objE2 = qVar.e(nVar, objA, aVar);
                    if (objE2 == objE) {
                        return objE;
                    }
                    pVar = this;
                    z9 = zA;
                    obj = objE2;
                    interfaceC0926c = nVar;
                    interfaceC0926c.close();
                    th = null;
                    if (th != null) {
                        throw th;
                    }
                    if (z9) {
                        O8.a.C0200a.b(pVar.f4497f, null, 1, null);
                    }
                    return obj;
                } catch (Throwable th2) {
                    th = th2;
                    interfaceC0926c = nVar;
                    interfaceC0926c.close();
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            z9 = aVar.f4500s;
            interfaceC0926c = (InterfaceC0926c) aVar.f4499r;
            pVar = (p) aVar.f4498q;
            try {
                p079h8.r.b(obj);
                try {
                    interfaceC0926c.close();
                    th = null;
                } catch (Throwable th4) {
                    th = th4;
                }
                if (th != null) {
                    if (z9) {
                        O8.a.C0200a.b(pVar.f4497f, null, 1, null);
                    }
                    return obj;
                }
                try {
                    throw th;
                } catch (Throwable th5) {
                    th = th5;
                    zA = z9;
                    this = pVar;
                }
            } catch (Throwable th6) {
                zA = z9;
                this = pVar;
                th = th6;
                try {
                    interfaceC0926c.close();
                    throw th;
                } catch (Throwable th7) {
                    AbstractC1388c.a(th, th7);
                    throw th;
                }
            }
        }
        if (zA) {
            O8.a.C0200a.b(this.f4497f, null, 1, null);
        }
        throw th;
    }

    @Override // L0.F
    public t c() {
        return this.f4494c;
    }

    @Override // L0.InterfaceC0926c
    public void close() {
        this.f4496e.set(true);
        this.f4495d.invoke();
    }

    /* JADX WARN: Code duplicated, block: B:34:0x00b9 A[Catch: all -> 0x00ee, IOException -> 0x00f1, TRY_ENTER, TryCatch #2 {IOException -> 0x00f1, blocks: (B:34:0x00b9, B:36:0x00bf, B:39:0x00c8, B:40:0x00ed, B:48:0x00fd, B:55:0x010b, B:54:0x0108), top: B:69:0x0023 }] */
    /* JADX WARN: Code duplicated, block: B:48:0x00fd A[Catch: all -> 0x00ee, IOException -> 0x00f1, TRY_ENTER, TRY_LEAVE, TryCatch #2 {IOException -> 0x00f1, blocks: (B:34:0x00b9, B:36:0x00bf, B:39:0x00c8, B:40:0x00ed, B:48:0x00fd, B:55:0x010b, B:54:0x0108), top: B:69:0x0023 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.io.File] */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.io.File, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v6, types: [java.io.File, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v12, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v3, types: [O8.a] */
    @Override // L0.F
    public Object e(p219v8.p pVar, p129m8.e eVar) throws Throwable {
        b bVar;
        ?? file;
        O8.a aVar;
        q qVar;
        Throwable th;
        InterfaceC0926c interfaceC0926c;
        p pVar2;
        O8.a aVar2;
        ?? r9;
        if (eVar instanceof b) {
            bVar = (b) eVar;
            int i10 = bVar.f4510w;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                bVar.f4510w = i10 - Integer.MIN_VALUE;
            } else {
                bVar = new b(eVar);
            }
        } else {
            bVar = new b(eVar);
        }
        ?? r10 = bVar.f4508u;
        Object objE = p139n8.b.e();
        int i11 = bVar.f4510w;
        try {
            try {
                try {
                    try {
                        try {
                            if (i11 == 0) {
                                p079h8.r.b(r10);
                                f();
                                g(this.f4492a);
                                aVar = this.f4497f;
                                bVar.f4504q = this;
                                bVar.f4505r = pVar;
                                bVar.f4506s = aVar;
                                bVar.f4510w = 1;
                                if (aVar.c(null, bVar) != objE) {
                                }
                                return objE;
                            }
                            if (i11 != 1) {
                                if (i11 != 2) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                interfaceC0926c = (InterfaceC0926c) bVar.f4507t;
                                File file2 = (File) bVar.f4506s;
                                aVar2 = (O8.a) bVar.f4505r;
                                pVar2 = (p) bVar.f4504q;
                                try {
                                    p079h8.r.b(r10);
                                    r9 = file2;
                                    p079h8.A a10 = p079h8.A.f21846a;
                                    try {
                                        interfaceC0926c.close();
                                        th = null;
                                    } catch (Throwable th2) {
                                        th = th2;
                                    }
                                    if (th == null) {
                                        throw th;
                                    }
                                    if (r9.exists() && !m.a(r9, pVar2.f4492a)) {
                                        throw new IOException("Unable to rename " + r9 + " to " + pVar2.f4492a + ". This likely means that there are multiple instances of DataStore for this file. Ensure that you are only creating a single instance of datastore for this file.");
                                    }
                                    p079h8.A a11 = p079h8.A.f21846a;
                                    aVar2.b(null);
                                    return p079h8.A.f21846a;
                                } catch (Throwable th3) {
                                    th = th3;
                                    try {
                                        interfaceC0926c.close();
                                    } catch (Throwable th4) {
                                        AbstractC1388c.a(th, th4);
                                    }
                                    throw th;
                                }
                            }
                            O8.a aVar3 = (O8.a) bVar.f4506s;
                            pVar = (p219v8.p) bVar.f4505r;
                            p pVar3 = (p) bVar.f4504q;
                            p079h8.r.b(r10);
                            aVar = aVar3;
                            this = pVar3;
                            bVar.f4504q = this;
                            bVar.f4505r = aVar;
                            bVar.f4506s = file;
                            bVar.f4507t = qVar;
                            bVar.f4510w = 2;
                            if (pVar.invoke(qVar, bVar) != objE) {
                                pVar2 = this;
                                aVar2 = aVar;
                                r9 = file;
                                interfaceC0926c = qVar;
                                p079h8.A a12 = p079h8.A.f21846a;
                                interfaceC0926c.close();
                                th = null;
                                if (th == null) {
                                    throw th;
                                }
                                if (r9.exists()) {
                                    throw new IOException("Unable to rename " + r9 + " to " + pVar2.f4492a + ". This likely means that there are multiple instances of DataStore for this file. Ensure that you are only creating a single instance of datastore for this file.");
                                }
                                p079h8.A a13 = p079h8.A.f21846a;
                                aVar2.b(null);
                                return p079h8.A.f21846a;
                            }
                            return objE;
                        } catch (Throwable th5) {
                            th = th5;
                            interfaceC0926c = qVar;
                            interfaceC0926c.close();
                            throw th;
                        }
                        qVar = new q(file, this.f4493b);
                    } catch (IOException e10) {
                        e = e10;
                        if (file.exists()) {
                            file.delete();
                        }
                        throw e;
                    }
                    file = new File(this.f4492a.getAbsolutePath() + ".tmp");
                } catch (IOException e11) {
                    e = e11;
                    file = pVar;
                }
            } catch (Throwable th6) {
                th = th6;
                r10.b(null);
                throw th;
            }
        } catch (Throwable th7) {
            th = th7;
            r10 = objE;
            r10.b(null);
            throw th;
        }
    }
}
