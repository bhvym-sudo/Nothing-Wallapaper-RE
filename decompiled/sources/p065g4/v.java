package p065g4;

import android.content.Context;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.AbstractC1227d;
import com.google.android.gms.common.api.internal.AbstractC1230g;
import com.google.android.gms.common.api.internal.C1226c;
import com.google.android.gms.common.api.internal.C1229f;
import java.util.Arrays;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import p005a4.a;
import p005a4.b;
import p005a4.d;
import p005a4.f;
import p025c4.AbstractC1202p;
import p055f4.g;
import p135n4.i;
import p215v4.j;
import p215v4.k;
import p215v4.l;
import p215v4.n;

/* JADX INFO: loaded from: classes.dex */
public final class v extends d implements p055f4.d {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final a.g f21278k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final a.AbstractC0351a f21279l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final a f21280m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ int f21281n = 0;

    static {
        a.g gVar = new a.g();
        f21278k = gVar;
        q qVar = new q();
        f21279l = qVar;
        f21280m = new a("ModuleInstall.API", qVar, gVar);
    }

    public v(Context context) {
        super(context, f21280m, a.d.f9824a, d.a.f9836c);
    }

    static final a q(boolean z9, f... fVarArr) {
        AbstractC1202p.j(fVarArr, "Requested APIs must not be null.");
        AbstractC1202p.b(fVarArr.length > 0, "Please provide at least one OptionalModuleApi.");
        for (f fVar : fVarArr) {
            AbstractC1202p.j(fVar, "Requested API must not be null.");
        }
        return a.c(Arrays.asList(fVarArr), z9);
    }

    @Override // p055f4.d
    public final k a(p055f4.a aVar) {
        return i(AbstractC1227d.c(aVar, p055f4.a.class.getSimpleName()), 27306);
    }

    @Override // p055f4.d
    public final k b(p055f4.f fVar) {
        final a aVarA = a.a(fVar);
        final p055f4.a aVarB = fVar.b();
        Executor executorC = fVar.c();
        boolean zE = fVar.e();
        if (aVarA.b().isEmpty()) {
            return n.d(new g(0));
        }
        if (aVarB == null) {
            AbstractC1230g.a aVarA2 = AbstractC1230g.a();
            aVarA2.d(i.f23267a);
            aVarA2.c(zE);
            aVarA2.e(27304);
            aVarA2.b(new p015b4.i() { // from class: g4.o
                @Override // p015b4.i
                public final void accept(Object obj, Object obj2) {
                    v vVar = this.f21267a;
                    a aVar = aVarA;
                    ((i) ((w) obj).C()).Y(new s(vVar, (l) obj2), aVar, null);
                }
            });
            return g(aVarA2.a());
        }
        AbstractC1202p.i(aVarB);
        C1226c c1226cL = executorC == null ? l(aVarB, p055f4.a.class.getSimpleName()) : AbstractC1227d.b(aVarB, executorC, p055f4.a.class.getSimpleName());
        final d dVar = new d(c1226cL);
        final AtomicReference atomicReference = new AtomicReference();
        p015b4.i iVar = new p015b4.i() { // from class: g4.l
            @Override // p015b4.i
            public final void accept(Object obj, Object obj2) {
                v vVar = this.f21259a;
                AtomicReference atomicReference2 = atomicReference;
                p055f4.a aVar = aVarB;
                a aVar2 = aVarA;
                d dVar2 = dVar;
                ((i) ((w) obj).C()).Y(new t(vVar, atomicReference2, (p215v4.l) obj2, aVar), aVar2, dVar2);
            }
        };
        p015b4.i iVar2 = new p015b4.i() { // from class: g4.m
            @Override // p015b4.i
            public final void accept(Object obj, Object obj2) {
                v vVar = this.f21264a;
                d dVar2 = dVar;
                ((i) ((w) obj).C()).Z(new u(vVar, (l) obj2), dVar2);
            }
        };
        C1229f.a aVarA3 = C1229f.a();
        aVarA3.g(c1226cL);
        aVarA3.d(i.f23267a);
        aVarA3.c(zE);
        aVarA3.b(iVar);
        aVarA3.f(iVar2);
        aVarA3.e(27305);
        return h(aVarA3.a()).m(new j() { // from class: g4.n
            @Override // p215v4.j
            public final k a(Object obj) {
                AtomicReference atomicReference2 = atomicReference;
                int i10 = v.f21281n;
                return atomicReference2.get() != null ? p215v4.n.d((g) atomicReference2.get()) : p215v4.n.c(new b(Status.f16200y));
            }
        });
    }

    @Override // p055f4.d
    public final k d(f... fVarArr) {
        final a aVarQ = q(false, fVarArr);
        if (aVarQ.b().isEmpty()) {
            return n.d(new p055f4.b(true, 0));
        }
        AbstractC1230g.a aVarA = AbstractC1230g.a();
        aVarA.d(i.f23267a);
        aVarA.e(27301);
        aVarA.c(false);
        aVarA.b(new p015b4.i() { // from class: g4.p
            @Override // p015b4.i
            public final void accept(Object obj, Object obj2) {
                v vVar = this.f21269a;
                a aVar = aVarQ;
                ((i) ((w) obj).C()).X(new r(vVar, (l) obj2), aVar);
            }
        });
        return g(aVarA.a());
    }
}
