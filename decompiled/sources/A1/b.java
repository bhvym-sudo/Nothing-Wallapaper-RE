package A1;

import E8.i;
import android.util.Log;
import java.util.Map;
import kotlin.coroutines.jvm.internal.d;
import kotlin.jvm.internal.AbstractC1457h;
import kotlin.jvm.internal.n;
import p079h8.A;
import p079h8.r;
import p089i8.N;
import p129m8.e;

/* JADX INFO: loaded from: classes.dex */
public final class b implements D3.a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f148d = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final A1.a f149a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private D3.b f150b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private B1.a f151c;

    public static final class a {
        public /* synthetic */ a(AbstractC1457h abstractC1457h) {
            this();
        }

        private a() {
        }
    }

    /* JADX INFO: renamed from: A1.b$b, reason: collision with other inner class name */
    static final class C0006b extends d {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        Object f152q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        /* synthetic */ Object f153r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        int f155t;

        C0006b(e eVar) {
            super(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f153r = obj;
            this.f155t |= Integer.MIN_VALUE;
            return b.this.b(null, this);
        }
    }

    public b(A1.a interactor) {
        n.h(interactor, "interactor");
        this.f149a = interactor;
        this.f150b = D3.b.a.f714a;
    }

    private final E3.a c(B1.a aVar) {
        String strB;
        Map mapC = N.c();
        if (aVar != null && (strB = aVar.b()) != null) {
            mapC.put("grid_option", strB);
        }
        return new E3.a(N.b(mapC));
    }

    @Override // D3.a
    public Object a(E3.a aVar, e eVar) {
        String str = (String) aVar.a().get("grid_option");
        B1.a aVar2 = this.f151c;
        if (aVar2 != null) {
            if (!n.d(aVar2.b(), str)) {
                Log.wtf("GridSnapshotRestorer", i.l("Original snapshot name was " + aVar2.b() + " but we're being told to\n                        | restore to " + str + ". The current implementation doesn't\n                        | support undo, only a reset back to the original grid option.", null, 1, null));
            }
            Object objH = this.f149a.h(aVar2, eVar);
            if (objH == p139n8.b.e()) {
                return objH;
            }
        }
        return A.f21846a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // D3.a
    public Object b(D3.b bVar, e eVar) {
        C0006b c0006b;
        if (eVar instanceof C0006b) {
            c0006b = (C0006b) eVar;
            int i10 = c0006b.f155t;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c0006b.f155t = i10 - Integer.MIN_VALUE;
            } else {
                c0006b = new C0006b(eVar);
            }
        } else {
            c0006b = new C0006b(eVar);
        }
        Object objF = c0006b.f153r;
        Object objE = p139n8.b.e();
        int i11 = c0006b.f155t;
        if (i11 == 0) {
            r.b(objF);
            this.f150b = bVar;
            A1.a aVar = this.f149a;
            c0006b.f152q = this;
            c0006b.f155t = 1;
            objF = aVar.f(c0006b);
            if (objF == objE) {
                return objE;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            this = (b) c0006b.f152q;
            r.b(objF);
        }
        B1.a aVar2 = (B1.a) objF;
        this.f151c = aVar2;
        return this.c(aVar2);
    }

    public final void d(B1.a option) {
        n.h(option, "option");
        this.f150b.a(c(option));
    }
}
