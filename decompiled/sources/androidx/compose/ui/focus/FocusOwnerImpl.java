package androidx.compose.ui.focus;

import W.AbstractC0967i;
import W.B;
import W.InterfaceC0966h;
import W.M;
import W.S;
import W.W;
import android.view.KeyEvent;
import androidx.collection.A;
import androidx.constraintlayout.core.widgets.Optimizer;
import java.util.ArrayList;
import p111l0.s;

/* JADX INFO: loaded from: classes.dex */
public final class FocusOwnerImpl implements G.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p219v8.p f11379a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final p219v8.l f11380b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final p219v8.a f11381c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final p219v8.a f11382d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final p219v8.a f11383e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final G.d f11385g;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private A f11388j;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private k f11384f = new k();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final G.o f11386h = new G.o();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final C.c f11387i = h.a(C.c.f445a, e.f11394r).c(new M() { // from class: androidx.compose.ui.focus.FocusOwnerImpl$modifier$2
        public boolean equals(Object obj) {
            return obj == this;
        }

        @Override // W.M
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public k d() {
            return this.f11395b.r();
        }

        @Override // W.M
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public void e(k kVar) {
        }

        public int hashCode() {
            return this.f11395b.r().hashCode();
        }
    });

    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f11389a;

        static {
            int[] iArr = new int[G.a.values().length];
            try {
                iArr[G.a.Redirected.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[G.a.Cancelled.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[G.a.RedirectCancelled.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[G.a.None.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f11389a = iArr;
        }
    }

    static final class b extends kotlin.jvm.internal.o implements p219v8.a {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public static final b f11390r = new b();

        b() {
            super(0);
        }

        public final void a() {
        }

        @Override // p219v8.a
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return p079h8.A.f21846a;
        }
    }

    /* synthetic */ class c extends kotlin.jvm.internal.l implements p219v8.a {
        c(Object obj) {
            super(0, obj, FocusOwnerImpl.class, "invalidateOwnerFocusState", "invalidateOwnerFocusState()V", 0);
        }

        @Override // p219v8.a
        public /* bridge */ /* synthetic */ Object invoke() {
            m4invoke();
            return p079h8.A.f21846a;
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m4invoke() {
            ((FocusOwnerImpl) this.receiver).s();
        }
    }

    static final class d extends kotlin.jvm.internal.o implements p219v8.l {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ k f11391r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        final /* synthetic */ FocusOwnerImpl f11392s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ p219v8.l f11393t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(k kVar, FocusOwnerImpl focusOwnerImpl, p219v8.l lVar) {
            super(1);
            this.f11391r = kVar;
            this.f11392s = focusOwnerImpl;
            this.f11393t = lVar;
        }

        @Override // p219v8.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean f(k kVar) {
            boolean zBooleanValue;
            if (kotlin.jvm.internal.n.d(kVar, this.f11391r)) {
                zBooleanValue = false;
            } else {
                if (kotlin.jvm.internal.n.d(kVar, this.f11392s.r())) {
                    throw new IllegalStateException("Focus search landed at the root.");
                }
                zBooleanValue = ((Boolean) this.f11393t.f(kVar)).booleanValue();
            }
            return Boolean.valueOf(zBooleanValue);
        }
    }

    static final class e extends kotlin.jvm.internal.o implements p219v8.l {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public static final e f11394r = new e();

        e() {
            super(1);
        }

        public final void a(f fVar) {
            fVar.o(false);
        }

        @Override // p219v8.l
        public /* bridge */ /* synthetic */ Object f(Object obj) {
            a((f) obj);
            return p079h8.A.f21846a;
        }
    }

    public FocusOwnerImpl(p219v8.l lVar, p219v8.p pVar, p219v8.l lVar2, p219v8.a aVar, p219v8.a aVar2, p219v8.a aVar3) {
        this.f11379a = pVar;
        this.f11380b = lVar2;
        this.f11381c = aVar;
        this.f11382d = aVar2;
        this.f11383e = aVar3;
        this.f11385g = new G.d(lVar, new c(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void s() {
        if (this.f11384f.o0() == G.m.Inactive) {
            this.f11381c.invoke();
        }
    }

    private final C.c.AbstractC0022c t(InterfaceC0966h interfaceC0966h) {
        int iA = W.a(Optimizer.OPTIMIZATION_GROUPING) | W.a(8192);
        if (!interfaceC0966h.z().Q()) {
            T.a.b("visitLocalDescendants called on an unattached node");
        }
        C.c.AbstractC0022c abstractC0022cZ = interfaceC0966h.z();
        C.c.AbstractC0022c abstractC0022c = null;
        if ((abstractC0022cZ.H() & iA) != 0) {
            for (C.c.AbstractC0022c abstractC0022cI = abstractC0022cZ.I(); abstractC0022cI != null; abstractC0022cI = abstractC0022cI.I()) {
                if ((abstractC0022cI.L() & iA) != 0) {
                    if ((W.a(Optimizer.OPTIMIZATION_GROUPING) & abstractC0022cI.L()) != 0) {
                        return abstractC0022c;
                    }
                    abstractC0022c = abstractC0022cI;
                }
            }
        }
        return abstractC0022c;
    }

    private final boolean u(KeyEvent keyEvent) {
        long jA = O.d.a(keyEvent);
        int iB = O.d.b(keyEvent);
        O.c.a aVar = O.c.f5730a;
        if (O.c.e(iB, aVar.a())) {
            A a10 = this.f11388j;
            if (a10 == null) {
                a10 = new A(3);
                this.f11388j = a10;
            }
            a10.l(jA);
        } else if (O.c.e(iB, aVar.b())) {
            A a11 = this.f11388j;
            if (a11 == null || !a11.a(jA)) {
                return false;
            }
            A a12 = this.f11388j;
            if (a12 != null) {
                a12.m(jA);
            }
        }
        return true;
    }

    @Override // G.g
    public void a(k kVar) {
        this.f11385g.g(kVar);
    }

    @Override // G.g
    public C.c b() {
        return this.f11387i;
    }

    @Override // G.g
    public void c(G.h hVar) {
        this.f11385g.e(hVar);
    }

    @Override // G.g
    public void d(G.b bVar) {
        this.f11385g.d(bVar);
    }

    @Override // G.g
    public boolean e(boolean z9, boolean z10, boolean z11, int i10) {
        boolean zC;
        G.o oVarI = i();
        b bVar = b.f11390r;
        try {
            if (oVarI.f1932c) {
                oVarI.g();
            }
            oVarI.f();
            if (bVar != null) {
                oVarI.f1931b.b(bVar);
            }
            if (!z9) {
                int i11 = a.f11389a[l.e(this.f11384f, i10).ordinal()];
                zC = (i11 == 1 || i11 == 2 || i11 == 3) ? false : l.c(this.f11384f, z9, z10);
            }
            oVarI.h();
            if (zC && z11) {
                this.f11381c.invoke();
            }
            return zC;
        } catch (Throwable th) {
            oVarI.h();
            throw th;
        }
    }

    @Override // G.g
    public G.l f() {
        return this.f11384f.o0();
    }

    @Override // G.g
    public boolean g(androidx.compose.ui.focus.b bVar, H.i iVar) {
        return ((Boolean) this.f11379a.invoke(bVar, iVar)).booleanValue();
    }

    @Override // G.g
    public G.o i() {
        return this.f11386h;
    }

    @Override // G.g
    public H.i j() {
        k kVarB = m.b(this.f11384f);
        if (kVarB != null) {
            return m.d(kVarB);
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:138:0x01f0  */
    /* JADX WARN: Code duplicated, block: B:175:0x00f5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:176:0x00f6 A[EDGE_INSN: B:176:0x00f6->B:65:0x00f6 BREAK  A[LOOP:10: B:45:0x00b3->B:180:0x00b3, LOOP_LABEL: LOOP:10: B:45:0x00b3->B:180:0x00b3], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:184:0x00dd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:42:0x0097  */
    /* JADX WARN: Code duplicated, block: B:44:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:46:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:48:0x00c4 A[ADDED_TO_REGION, LOOP:11: B:48:0x00c4->B:57:0x00dd, LOOP_START, PHI: r6
      0x00c4: PHI (r6v11 C.c$c) = (r6v4 C.c$c), (r6v12 C.c$c) binds: [B:47:0x00c2, B:57:0x00dd] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:49:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:51:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:53:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:56:0x00d5 A[LOOP:12: B:52:0x00ce->B:56:0x00d5, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:67:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:68:0x00ff  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v10, types: [C.c$c] */
    /* JADX WARN: Type inference failed for: r10v15, types: [C.c$c] */
    /* JADX WARN: Type inference failed for: r10v33 */
    /* JADX WARN: Type inference failed for: r10v34 */
    /* JADX WARN: Type inference failed for: r10v35 */
    /* JADX WARN: Type inference failed for: r10v36 */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v10, types: [C.c$c] */
    /* JADX WARN: Type inference failed for: r7v31 */
    /* JADX WARN: Type inference failed for: r7v9 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11, types: [C.c$c] */
    /* JADX WARN: Type inference failed for: r8v14 */
    /* JADX WARN: Type inference failed for: r8v2 */
    @Override // G.g
    public boolean k(KeyEvent keyEvent, p219v8.a aVar) {
        k kVar;
        int iA;
        C.c.AbstractC0022c abstractC0022cN;
        B bH;
        ?? F9;
        O.e eVar;
        C.c.AbstractC0022c abstractC0022cZ;
        S sV;
        ?? F10;
        S sV2;
        ?? F11;
        S sV3;
        if (this.f11385g.b()) {
            System.out.println((Object) "FocusRelatedWarning: Dispatching key event while focus system is invalidated.");
            return false;
        }
        if (!u(keyEvent)) {
            return false;
        }
        k kVarB = m.b(this.f11384f);
        if (kVarB == null || (abstractC0022cZ = t(kVarB)) == null) {
            if (kVarB != null) {
                int iA2 = W.a(8192);
                if (!kVarB.z().Q()) {
                    throw new IllegalStateException("visitAncestors called on an unattached node");
                }
                C.c.AbstractC0022c abstractC0022cZ2 = kVarB.z();
                B bH2 = AbstractC0967i.h(kVarB);
                loop7: while (true) {
                    if (bH2 == null) {
                        F10 = 0;
                        break;
                    }
                    if ((bH2.V().k().H() & iA2) != 0) {
                        while (abstractC0022cZ2 != null) {
                            if ((abstractC0022cZ2.L() & iA2) != 0) {
                                F10 = abstractC0022cZ2;
                                while (F10 != 0) {
                                    if (F10 instanceof O.e) {
                                        break loop7;
                                    }
                                    F10.L();
                                    F10 = AbstractC0967i.f(null);
                                }
                            }
                            abstractC0022cZ2 = abstractC0022cZ2.N();
                        }
                    }
                    bH2 = bH2.Y();
                    abstractC0022cZ2 = (bH2 == null || (sV2 = bH2.V()) == null) ? null : sV2.o();
                }
                O.e eVar2 = (O.e) F10;
                if (eVar2 != null) {
                    abstractC0022cZ = eVar2.z();
                } else {
                    kVar = this.f11384f;
                    iA = W.a(8192);
                    if (kVar.z().Q()) {
                        throw new IllegalStateException("visitAncestors called on an unattached node");
                    }
                    abstractC0022cN = kVar.z().N();
                    bH = AbstractC0967i.h(kVar);
                    loop10: while (true) {
                        if (bH != null) {
                            F9 = 0;
                            break;
                        }
                        if ((bH.V().k().H() & iA) != 0) {
                            while (abstractC0022cN != null) {
                                if ((abstractC0022cN.L() & iA) != 0) {
                                    F9 = abstractC0022cN;
                                    while (F9 != 0) {
                                        if (F9 instanceof O.e) {
                                            break loop10;
                                        }
                                        F9.L();
                                        F9 = AbstractC0967i.f(null);
                                    }
                                }
                                abstractC0022cN = abstractC0022cN.N();
                            }
                        }
                        bH = bH.Y();
                        abstractC0022cN = (bH != null || (sV = bH.V()) == null) ? null : sV.o();
                    }
                    eVar = (O.e) F9;
                    if (eVar != null) {
                        abstractC0022cZ = eVar.z();
                    } else {
                        abstractC0022cZ = null;
                    }
                }
            } else {
                kVar = this.f11384f;
                iA = W.a(8192);
                if (kVar.z().Q()) {
                    throw new IllegalStateException("visitAncestors called on an unattached node");
                }
                abstractC0022cN = kVar.z().N();
                bH = AbstractC0967i.h(kVar);
                loop10: while (true) {
                    if (bH != null) {
                        F9 = 0;
                        break;
                    }
                    if ((bH.V().k().H() & iA) != 0) {
                        while (abstractC0022cN != null) {
                            if ((abstractC0022cN.L() & iA) != 0) {
                                F9 = abstractC0022cN;
                                while (F9 != 0) {
                                    if (F9 instanceof O.e) {
                                        break loop10;
                                        break loop10;
                                    }
                                    F9.L();
                                    F9 = AbstractC0967i.f(null);
                                }
                            }
                            abstractC0022cN = abstractC0022cN.N();
                        }
                    }
                    bH = bH.Y();
                    if (bH != null) {
                    }
                }
                eVar = (O.e) F9;
                if (eVar != null) {
                    abstractC0022cZ = eVar.z();
                } else {
                    abstractC0022cZ = null;
                }
            }
        }
        if (abstractC0022cZ != null) {
            int iA3 = W.a(8192);
            if (!abstractC0022cZ.z().Q()) {
                throw new IllegalStateException("visitAncestors called on an unattached node");
            }
            C.c.AbstractC0022c abstractC0022cN2 = abstractC0022cZ.z().N();
            B bH3 = AbstractC0967i.h(abstractC0022cZ);
            ArrayList arrayList = null;
            while (bH3 != null) {
                if ((bH3.V().k().H() & iA3) != 0) {
                    while (abstractC0022cN2 != null) {
                        if ((abstractC0022cN2.L() & iA3) != 0) {
                            for (C.c.AbstractC0022c abstractC0022cF = abstractC0022cN2; abstractC0022cF != null; abstractC0022cF = AbstractC0967i.f(null)) {
                                if (abstractC0022cF instanceof O.e) {
                                    if (arrayList == null) {
                                        arrayList = new ArrayList();
                                    }
                                    arrayList.add(abstractC0022cF);
                                } else {
                                    abstractC0022cF.L();
                                }
                            }
                        }
                        abstractC0022cN2 = abstractC0022cN2.N();
                    }
                }
                bH3 = bH3.Y();
                abstractC0022cN2 = (bH3 == null || (sV3 = bH3.V()) == null) ? null : sV3.o();
            }
            if (arrayList != null) {
                int size = arrayList.size() - 1;
                if (size >= 0) {
                    while (true) {
                        int i10 = size - 1;
                        if (((O.e) arrayList.get(size)).a(keyEvent)) {
                            return true;
                        }
                        if (i10 < 0) {
                            break;
                        }
                        size = i10;
                    }
                }
                p079h8.A a10 = p079h8.A.f21846a;
            }
            for (?? Z9 = abstractC0022cZ.z(); Z9 != 0; Z9 = AbstractC0967i.f(null)) {
                if (!(Z9 instanceof O.e)) {
                    Z9.L();
                } else if (((O.e) Z9).a(keyEvent)) {
                    return true;
                }
            }
            if (((Boolean) aVar.invoke()).booleanValue()) {
                return true;
            }
            C.c.AbstractC0022c abstractC0022cZ3 = abstractC0022cZ.z();
            for (F11 = abstractC0022cZ3; F11 != 0; F11 = AbstractC0967i.f(null)) {
                if (!(F11 instanceof O.e)) {
                    F11.L();
                } else {
                    if (((O.e) F11).k(keyEvent)) {
                        return true;
                    }
                }
            }
            if (arrayList != null) {
                int size2 = arrayList.size();
                for (int i11 = 0; i11 < size2; i11++) {
                    if (((O.e) arrayList.get(i11)).k(keyEvent)) {
                        return true;
                    }
                }
                p079h8.A a11 = p079h8.A.f21846a;
            }
            p079h8.A a12 = p079h8.A.f21846a;
        }
        return false;
    }

    @Override // G.g
    public boolean l(KeyEvent keyEvent) {
        S sV;
        if (this.f11385g.b()) {
            System.out.println((Object) "FocusRelatedWarning: Dispatching intercepted soft keyboard event while the focus system is invalidated.");
            return false;
        }
        k kVarB = m.b(this.f11384f);
        if (kVarB != null) {
            int iA = W.a(131072);
            if (!kVarB.z().Q()) {
                throw new IllegalStateException("visitAncestors called on an unattached node");
            }
            C.c.AbstractC0022c abstractC0022cZ = kVarB.z();
            B bH = AbstractC0967i.h(kVarB);
            while (bH != null) {
                if ((bH.V().k().H() & iA) != 0) {
                    while (abstractC0022cZ != null) {
                        if ((abstractC0022cZ.L() & iA) != 0) {
                            for (C.c.AbstractC0022c abstractC0022cF = abstractC0022cZ; abstractC0022cF != null; abstractC0022cF = AbstractC0967i.f(null)) {
                                abstractC0022cF.L();
                            }
                        }
                        abstractC0022cZ = abstractC0022cZ.N();
                    }
                }
                bH = bH.Y();
                abstractC0022cZ = (bH == null || (sV = bH.V()) == null) ? null : sV.o();
            }
            androidx.appcompat.app.o.a(null);
        }
        return false;
    }

    @Override // G.g
    public Boolean m(int i10, H.i iVar, p219v8.l lVar) {
        k kVarB = m.b(this.f11384f);
        if (kVarB != null) {
            j jVarA = m.a(kVarB, i10, (s) this.f11383e.invoke());
            j.a aVar = j.f11426b;
            if (kotlin.jvm.internal.n.d(jVarA, aVar.a())) {
                return null;
            }
            if (!kotlin.jvm.internal.n.d(jVarA, aVar.b())) {
                return Boolean.valueOf(jVarA.c(lVar));
            }
        } else {
            kVarB = null;
        }
        return m.e(this.f11384f, i10, (s) this.f11383e.invoke(), iVar, new d(kVarB, this, lVar));
    }

    @Override // G.g
    public void n() {
        G.o oVarI = i();
        if (oVarI.f1932c) {
            l.c(this.f11384f, true, true);
            return;
        }
        try {
            oVarI.f();
            l.c(this.f11384f, true, true);
        } finally {
            oVarI.h();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v20 */
    /* JADX WARN: Type inference failed for: r1v21 */
    /* JADX WARN: Type inference failed for: r1v22 */
    /* JADX WARN: Type inference failed for: r1v23 */
    /* JADX WARN: Type inference failed for: r1v3, types: [C.c$c] */
    /* JADX WARN: Type inference failed for: r1v5, types: [C.c$c] */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v12, types: [C.c$c] */
    /* JADX WARN: Type inference failed for: r5v14 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3 */
    @Override // G.g
    public boolean o(S.b bVar) {
        S.a aVar;
        int size;
        S sV;
        ?? F9;
        S sV2;
        if (this.f11385g.b()) {
            throw new IllegalStateException("Dispatching rotary event while focus system is invalidated.");
        }
        k kVarB = m.b(this.f11384f);
        if (kVarB != null) {
            int iA = W.a(16384);
            if (!kVarB.z().Q()) {
                throw new IllegalStateException("visitAncestors called on an unattached node");
            }
            C.c.AbstractC0022c abstractC0022cZ = kVarB.z();
            B bH = AbstractC0967i.h(kVarB);
            loop0: while (true) {
                if (bH == null) {
                    F9 = 0;
                    break;
                }
                if ((bH.V().k().H() & iA) != 0) {
                    while (abstractC0022cZ != null) {
                        if ((abstractC0022cZ.L() & iA) != 0) {
                            F9 = abstractC0022cZ;
                            while (F9 != 0) {
                                if (F9 instanceof S.a) {
                                    break loop0;
                                }
                                F9.L();
                                F9 = AbstractC0967i.f(null);
                            }
                        }
                        abstractC0022cZ = abstractC0022cZ.N();
                    }
                }
                bH = bH.Y();
                abstractC0022cZ = (bH == null || (sV2 = bH.V()) == null) ? null : sV2.o();
            }
            aVar = (S.a) F9;
        } else {
            aVar = null;
        }
        if (aVar != null) {
            int iA2 = W.a(16384);
            if (!aVar.z().Q()) {
                throw new IllegalStateException("visitAncestors called on an unattached node");
            }
            C.c.AbstractC0022c abstractC0022cN = aVar.z().N();
            B bH2 = AbstractC0967i.h(aVar);
            ArrayList arrayList = null;
            while (bH2 != null) {
                if ((bH2.V().k().H() & iA2) != 0) {
                    while (abstractC0022cN != null) {
                        if ((abstractC0022cN.L() & iA2) != 0) {
                            for (C.c.AbstractC0022c abstractC0022cF = abstractC0022cN; abstractC0022cF != null; abstractC0022cF = AbstractC0967i.f(null)) {
                                if (abstractC0022cF instanceof S.a) {
                                    if (arrayList == null) {
                                        arrayList = new ArrayList();
                                    }
                                    arrayList.add(abstractC0022cF);
                                } else {
                                    abstractC0022cF.L();
                                }
                            }
                        }
                        abstractC0022cN = abstractC0022cN.N();
                    }
                }
                bH2 = bH2.Y();
                abstractC0022cN = (bH2 == null || (sV = bH2.V()) == null) ? null : sV.o();
            }
            if (arrayList != null && (size = arrayList.size() - 1) >= 0) {
                while (true) {
                    int i10 = size - 1;
                    if (((S.a) arrayList.get(size)).h(bVar)) {
                        return true;
                    }
                    if (i10 < 0) {
                        break;
                    }
                    size = i10;
                }
            }
            for (?? Z9 = aVar.z(); Z9 != 0; Z9 = AbstractC0967i.f(null)) {
                if (!(Z9 instanceof S.a)) {
                    Z9.L();
                } else if (((S.a) Z9).h(bVar)) {
                    return true;
                }
            }
            for (?? Z10 = aVar.z(); Z10 != 0; Z10 = AbstractC0967i.f(null)) {
                if (!(Z10 instanceof S.a)) {
                    Z10.L();
                } else if (((S.a) Z10).D(bVar)) {
                    return true;
                }
            }
            if (arrayList != null) {
                int size2 = arrayList.size();
                for (int i11 = 0; i11 < size2; i11++) {
                    if (((S.a) arrayList.get(i11)).D(bVar)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // G.e
    public void p(boolean z9) {
        e(z9, true, true, androidx.compose.ui.focus.b.f11397b.c());
    }

    public final k r() {
        return this.f11384f;
    }
}
