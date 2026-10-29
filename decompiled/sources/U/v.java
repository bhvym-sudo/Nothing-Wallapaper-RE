package U;

import W.B;
import java.util.ArrayList;
import java.util.List;
import p079h8.A;

/* JADX INFO: loaded from: classes.dex */
public final class v extends B.f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final v f7776b = new v();

    static final class a extends kotlin.jvm.internal.o implements p219v8.l {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public static final a f7777r = new a();

        a() {
            super(1);
        }

        public final void a(t.a aVar) {
        }

        @Override // p219v8.l
        public /* bridge */ /* synthetic */ Object f(Object obj) {
            a((t.a) obj);
            return A.f21846a;
        }
    }

    static final class b extends kotlin.jvm.internal.o implements p219v8.l {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ t f7778r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(t tVar) {
            super(1);
            this.f7778r = tVar;
        }

        public final void a(t.a aVar) {
            t.a.n(aVar, this.f7778r, 0, 0, 0.0f, null, 12, null);
        }

        @Override // p219v8.l
        public /* bridge */ /* synthetic */ Object f(Object obj) {
            a((t.a) obj);
            return A.f21846a;
        }
    }

    static final class c extends kotlin.jvm.internal.o implements p219v8.l {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ List f7779r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(List list) {
            super(1);
            this.f7779r = list;
        }

        public final void a(t.a aVar) {
            List list = this.f7779r;
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                t.a.n(aVar, (t) list.get(i10), 0, 0, 0.0f, null, 12, null);
            }
        }

        @Override // p219v8.l
        public /* bridge */ /* synthetic */ Object f(Object obj) {
            a((t.a) obj);
            return A.f21846a;
        }
    }

    private v() {
        super("Undefined intrinsics block and it is required");
    }

    @Override // U.p
    public q a(r rVar, List list, long j9) {
        if (list.isEmpty()) {
            return r.j(rVar, p111l0.b.j(j9), p111l0.b.i(j9), null, a.f7777r, 4, null);
        }
        if (list.size() == 1) {
            t tVarY = ((o) list.get(0)).y(j9);
            return r.j(rVar, p111l0.c.f(j9, tVarY.Z()), p111l0.c.e(j9, tVarY.U()), null, new b(tVarY), 4, null);
        }
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            arrayList.add(((o) list.get(i10)).y(j9));
        }
        int size2 = arrayList.size();
        int iMax = 0;
        int iMax2 = 0;
        for (int i11 = 0; i11 < size2; i11++) {
            t tVar = (t) arrayList.get(i11);
            iMax = Math.max(tVar.Z(), iMax);
            iMax2 = Math.max(tVar.U(), iMax2);
        }
        return r.j(rVar, p111l0.c.f(j9, iMax), p111l0.c.e(j9, iMax2), null, new c(arrayList), 4, null);
    }
}
