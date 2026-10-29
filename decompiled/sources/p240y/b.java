package p240y;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.I;
import kotlin.jvm.internal.n;
import kotlin.jvm.internal.o;
import p079h8.A;
import p170r.AbstractC1716y0;
import p170r.I0;
import p170r.InterfaceC1690l;
import p170r.InterfaceC1712w0;
import p219v8.p;
import p219v8.q;
import p219v8.r;
import p219v8.s;

/* JADX INFO: loaded from: classes.dex */
public final class b implements p240y.a {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final int f30073q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final boolean f30074r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private Object f30075s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private InterfaceC1712w0 f30076t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private List f30077u;

    static final class a extends o implements p {

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        final /* synthetic */ Object f30079s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ int f30080t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Object obj, int i10) {
            super(2);
            this.f30079s = obj;
            this.f30080t = i10;
        }

        public final void a(InterfaceC1690l interfaceC1690l, int i10) {
            b.this.d(this.f30079s, interfaceC1690l, AbstractC1716y0.a(this.f30080t) | 1);
        }

        @Override // p219v8.p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((InterfaceC1690l) obj, ((Number) obj2).intValue());
            return A.f21846a;
        }
    }

    /* JADX INFO: renamed from: y.b$b, reason: collision with other inner class name */
    static final class C0740b extends o implements p {

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        final /* synthetic */ Object f30082s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ Object f30083t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        final /* synthetic */ int f30084u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0740b(Object obj, Object obj2, int i10) {
            super(2);
            this.f30082s = obj;
            this.f30083t = obj2;
            this.f30084u = i10;
        }

        public final void a(InterfaceC1690l interfaceC1690l, int i10) {
            b.this.b(this.f30082s, this.f30083t, interfaceC1690l, AbstractC1716y0.a(this.f30084u) | 1);
        }

        @Override // p219v8.p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((InterfaceC1690l) obj, ((Number) obj2).intValue());
            return A.f21846a;
        }
    }

    static final class c extends o implements p {

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        final /* synthetic */ Object f30086s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ Object f30087t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        final /* synthetic */ Object f30088u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        final /* synthetic */ int f30089v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(Object obj, Object obj2, Object obj3, int i10) {
            super(2);
            this.f30086s = obj;
            this.f30087t = obj2;
            this.f30088u = obj3;
            this.f30089v = i10;
        }

        public final void a(InterfaceC1690l interfaceC1690l, int i10) {
            b.this.a(this.f30086s, this.f30087t, this.f30088u, interfaceC1690l, AbstractC1716y0.a(this.f30089v) | 1);
        }

        @Override // p219v8.p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((InterfaceC1690l) obj, ((Number) obj2).intValue());
            return A.f21846a;
        }
    }

    public b(int i10, boolean z9, Object obj) {
        this.f30073q = i10;
        this.f30074r = z9;
        this.f30075s = obj;
    }

    private final void h(InterfaceC1690l interfaceC1690l) {
        InterfaceC1712w0 interfaceC1712w0B;
        if (!this.f30074r || (interfaceC1712w0B = interfaceC1690l.b()) == null) {
            return;
        }
        interfaceC1690l.j(interfaceC1712w0B);
        if (p240y.c.e(this.f30076t, interfaceC1712w0B)) {
            this.f30076t = interfaceC1712w0B;
            return;
        }
        List list = this.f30077u;
        if (list == null) {
            ArrayList arrayList = new ArrayList();
            this.f30077u = arrayList;
            arrayList.add(interfaceC1712w0B);
            return;
        }
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (p240y.c.e((InterfaceC1712w0) list.get(i10), interfaceC1712w0B)) {
                list.set(i10, interfaceC1712w0B);
                return;
            }
        }
        list.add(interfaceC1712w0B);
    }

    private final void i() {
        if (this.f30074r) {
            InterfaceC1712w0 interfaceC1712w0 = this.f30076t;
            if (interfaceC1712w0 != null) {
                interfaceC1712w0.invalidate();
                this.f30076t = null;
            }
            List list = this.f30077u;
            if (list != null) {
                int size = list.size();
                for (int i10 = 0; i10 < size; i10++) {
                    ((InterfaceC1712w0) list.get(i10)).invalidate();
                }
                list.clear();
            }
        }
    }

    public Object a(Object obj, Object obj2, Object obj3, InterfaceC1690l interfaceC1690l, int i10) {
        InterfaceC1690l interfaceC1690lG = interfaceC1690l.g(this.f30073q);
        h(interfaceC1690lG);
        int iC = interfaceC1690lG.s(this) ? p240y.c.c(3) : p240y.c.f(3);
        Object obj4 = this.f30075s;
        n.f(obj4, "null cannot be cast to non-null type kotlin.Function5<@[ParameterName(name = 'p1')] kotlin.Any?, @[ParameterName(name = 'p2')] kotlin.Any?, @[ParameterName(name = 'p3')] kotlin.Any?, @[ParameterName(name = 'c')] androidx.compose.runtime.Composer, @[ParameterName(name = 'changed')] kotlin.Int, kotlin.Any?>");
        Object objN = ((s) I.d(obj4, 5)).n(obj, obj2, obj3, interfaceC1690lG, Integer.valueOf(iC | i10));
        I0 i0K = interfaceC1690lG.k();
        if (i0K != null) {
            i0K.a(new c(obj, obj2, obj3, i10));
        }
        return objN;
    }

    public Object b(Object obj, Object obj2, InterfaceC1690l interfaceC1690l, int i10) {
        InterfaceC1690l interfaceC1690lG = interfaceC1690l.g(this.f30073q);
        h(interfaceC1690lG);
        int iC = interfaceC1690lG.s(this) ? p240y.c.c(2) : p240y.c.f(2);
        Object obj3 = this.f30075s;
        n.f(obj3, "null cannot be cast to non-null type kotlin.Function4<@[ParameterName(name = 'p1')] kotlin.Any?, @[ParameterName(name = 'p2')] kotlin.Any?, @[ParameterName(name = 'c')] androidx.compose.runtime.Composer, @[ParameterName(name = 'changed')] kotlin.Int, kotlin.Any?>");
        Object objJ = ((r) I.d(obj3, 4)).j(obj, obj2, interfaceC1690lG, Integer.valueOf(iC | i10));
        I0 i0K = interfaceC1690lG.k();
        if (i0K != null) {
            i0K.a(new C0740b(obj, obj2, i10));
        }
        return objJ;
    }

    public Object d(Object obj, InterfaceC1690l interfaceC1690l, int i10) {
        InterfaceC1690l interfaceC1690lG = interfaceC1690l.g(this.f30073q);
        h(interfaceC1690lG);
        int iC = interfaceC1690lG.s(this) ? p240y.c.c(1) : p240y.c.f(1);
        Object obj2 = this.f30075s;
        n.f(obj2, "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = 'p1')] kotlin.Any?, @[ParameterName(name = 'c')] androidx.compose.runtime.Composer, @[ParameterName(name = 'changed')] kotlin.Int, kotlin.Any?>");
        Object objE = ((q) I.d(obj2, 3)).e(obj, interfaceC1690lG, Integer.valueOf(iC | i10));
        I0 i0K = interfaceC1690lG.k();
        if (i0K != null) {
            i0K.a(new a(obj, i10));
        }
        return objE;
    }

    @Override // p219v8.q
    public /* bridge */ /* synthetic */ Object e(Object obj, Object obj2, Object obj3) {
        return d(obj, (InterfaceC1690l) obj2, ((Number) obj3).intValue());
    }

    public Object g(InterfaceC1690l interfaceC1690l, int i10) {
        InterfaceC1690l interfaceC1690lG = interfaceC1690l.g(this.f30073q);
        h(interfaceC1690lG);
        int iC = i10 | (interfaceC1690lG.s(this) ? p240y.c.c(0) : p240y.c.f(0));
        Object obj = this.f30075s;
        n.f(obj, "null cannot be cast to non-null type kotlin.Function2<@[ParameterName(name = 'c')] androidx.compose.runtime.Composer, @[ParameterName(name = 'changed')] kotlin.Int, kotlin.Any?>");
        Object objInvoke = ((p) I.d(obj, 2)).invoke(interfaceC1690lG, Integer.valueOf(iC));
        I0 i0K = interfaceC1690lG.k();
        if (i0K != null) {
            n.f(this, "null cannot be cast to non-null type kotlin.Function2<androidx.compose.runtime.Composer, kotlin.Int, kotlin.Unit>");
            i0K.a((p) I.d(this, 2));
        }
        return objInvoke;
    }

    @Override // p219v8.p
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return g((InterfaceC1690l) obj, ((Number) obj2).intValue());
    }

    @Override // p219v8.r
    public /* bridge */ /* synthetic */ Object j(Object obj, Object obj2, Object obj3, Object obj4) {
        return b(obj, obj2, (InterfaceC1690l) obj3, ((Number) obj4).intValue());
    }

    public final void k(Object obj) {
        if (n.d(this.f30075s, obj)) {
            return;
        }
        boolean z9 = this.f30075s == null;
        this.f30075s = obj;
        if (z9) {
            return;
        }
        i();
    }

    @Override // p219v8.s
    public /* bridge */ /* synthetic */ Object n(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        return a(obj, obj2, obj3, (InterfaceC1690l) obj4, ((Number) obj5).intValue());
    }
}
