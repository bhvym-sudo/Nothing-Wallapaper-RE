package L0;

import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public class n implements y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final File f4476a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final A f4477b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final AtomicBoolean f4478c;

    static final class a extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        Object f4479q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        Object f4480r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        /* synthetic */ Object f4481s;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        int f4483u;

        a(p129m8.e eVar) {
            super(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f4481s = obj;
            this.f4483u |= Integer.MIN_VALUE;
            return n.i(n.this, this);
        }
    }

    public n(File file, A serializer) {
        kotlin.jvm.internal.n.h(file, "file");
        kotlin.jvm.internal.n.h(serializer, "serializer");
        this.f4476a = file;
        this.f4477b = serializer;
        this.f4478c = new AtomicBoolean(false);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v11, types: [L0.n] */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r7v0, types: [L0.n, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v2, types: [L0.n] */
    static /* synthetic */ Object i(n nVar, p129m8.e eVar) throws IOException {
        a aVar;
        Throwable th;
        Closeable closeable;
        Closeable closeable2;
        Throwable th2;
        if (eVar instanceof a) {
            aVar = (a) eVar;
            int i10 = aVar.f4483u;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                aVar.f4483u = i10 - Integer.MIN_VALUE;
            } else {
                aVar = new a(eVar);
            }
        } else {
            aVar = new a(eVar);
        }
        Object obj = aVar.f4481s;
        Object objE = p139n8.b.e();
        ?? r9 = aVar.f4483u;
        try {
            if (r9 != 0) {
                if (r9 == 1) {
                    closeable2 = (Closeable) aVar.f4480r;
                    r9 = (n) aVar.f4479q;
                    try {
                        p079h8.r.b(obj);
                        p189s8.b.a(closeable2, null);
                        return obj;
                    } catch (Throwable th3) {
                        th2 = th3;
                        try {
                            throw th2;
                        } catch (Throwable th4) {
                            p189s8.b.a(closeable2, th2);
                            throw th4;
                        }
                    }
                }
                if (r9 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                closeable = (Closeable) aVar.f4479q;
                try {
                    p079h8.r.b(obj);
                    p189s8.b.a(closeable, null);
                    return obj;
                } catch (Throwable th5) {
                    th = th5;
                    try {
                        throw th;
                    } catch (Throwable th6) {
                        p189s8.b.a(closeable, th);
                        throw th6;
                    }
                }
            }
            p079h8.r.b(obj);
            nVar.f();
            try {
                FileInputStream fileInputStream = new FileInputStream(((n) nVar).f4476a);
                try {
                    A a10 = ((n) nVar).f4477b;
                    aVar.f4479q = nVar;
                    aVar.f4480r = fileInputStream;
                    aVar.f4483u = 1;
                    Object objC = a10.c(fileInputStream, aVar);
                    if (objC != objE) {
                        closeable2 = fileInputStream;
                        obj = objC;
                        p189s8.b.a(closeable2, null);
                        return obj;
                    }
                } catch (Throwable th7) {
                    r9 = nVar;
                    closeable2 = fileInputStream;
                    th2 = th7;
                    throw th2;
                }
            } catch (FileNotFoundException unused) {
                if (!((n) nVar).f4476a.exists()) {
                    return ((n) nVar).f4477b.a();
                }
                FileInputStream fileInputStream2 = new FileInputStream(((n) nVar).f4476a);
                try {
                    A a11 = ((n) nVar).f4477b;
                    aVar.f4479q = fileInputStream2;
                    aVar.f4480r = null;
                    aVar.f4483u = 2;
                    Object objC2 = a11.c(fileInputStream2, aVar);
                    if (objC2 != objE) {
                        obj = objC2;
                        closeable = fileInputStream2;
                        p189s8.b.a(closeable, null);
                        return obj;
                    }
                } catch (Throwable th8) {
                    th = th8;
                    closeable = fileInputStream2;
                    throw th;
                }
            }
            return objE;
        } catch (FileNotFoundException unused2) {
            nVar = r9;
        }
    }

    @Override // L0.y
    public Object b(p129m8.e eVar) {
        return i(this, eVar);
    }

    @Override // L0.InterfaceC0926c
    public void close() {
        this.f4478c.set(true);
    }

    protected final void f() {
        if (this.f4478c.get()) {
            throw new IllegalStateException("This scope has already been closed.");
        }
    }

    protected final File g() {
        return this.f4476a;
    }

    protected final A h() {
        return this.f4477b;
    }
}
