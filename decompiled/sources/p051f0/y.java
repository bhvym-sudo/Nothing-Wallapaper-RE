package p051f0;

import kotlin.jvm.internal.o;
import p041e0.b;
import p079h8.A;
import p081i0.e;
import p081i0.f;
import p170r.b1;
import p219v8.l;

/* JADX INFO: loaded from: classes.dex */
public final class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final f f20782a = e.a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final b f20783b = new b(16);

    static final class a extends o implements l {

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        final /* synthetic */ x f20785s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(x xVar) {
            super(1);
            this.f20785s = xVar;
        }

        public final void a(z zVar) {
            f fVarB = y.this.b();
            y yVar = y.this;
            x xVar = this.f20785s;
            synchronized (fVarB) {
                try {
                    if (zVar.c()) {
                        yVar.f20783b.e(xVar, zVar);
                    } else {
                        yVar.f20783b.f(xVar);
                    }
                    A a10 = A.f21846a;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // p219v8.l
        public /* bridge */ /* synthetic */ Object f(Object obj) {
            a((z) obj);
            return A.f21846a;
        }
    }

    public final f b() {
        return this.f20782a;
    }

    public final b1 c(x xVar, l lVar) {
        synchronized (this.f20782a) {
            z zVar = (z) this.f20783b.d(xVar);
            if (zVar != null) {
                if (zVar.c()) {
                    return zVar;
                }
            }
            try {
                z zVar2 = (z) lVar.f(new a(xVar));
                synchronized (this.f20782a) {
                    try {
                        if (this.f20783b.d(xVar) == null && zVar2.c()) {
                            this.f20783b.e(xVar, zVar2);
                        }
                        A a10 = A.f21846a;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return zVar2;
            } catch (Exception e10) {
                throw new IllegalStateException("Could not load font", e10);
            }
        }
    }
}
