package p170r;

import java.util.Arrays;
import kotlin.jvm.internal.o;
import p079h8.A;
import p219v8.p;

/* JADX INFO: renamed from: r.v, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1709v {

    /* JADX INFO: renamed from: r.v$a */
    static final class a extends o implements p {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ C1710v0[] f25582r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        final /* synthetic */ p f25583s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ int f25584t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(C1710v0[] c1710v0Arr, p pVar, int i10) {
            super(2);
            this.f25582r = c1710v0Arr;
            this.f25583s = pVar;
            this.f25584t = i10;
        }

        public final void a(InterfaceC1690l interfaceC1690l, int i10) {
            C1710v0[] c1710v0Arr = this.f25582r;
            AbstractC1709v.b((C1710v0[]) Arrays.copyOf(c1710v0Arr, c1710v0Arr.length), this.f25583s, interfaceC1690l, AbstractC1716y0.a(this.f25584t | 1));
        }

        @Override // p219v8.p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((InterfaceC1690l) obj, ((Number) obj2).intValue());
            return A.f21846a;
        }
    }

    /* JADX INFO: renamed from: r.v$b */
    static final class b extends o implements p {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ C1710v0 f25585r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        final /* synthetic */ p f25586s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ int f25587t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(C1710v0 c1710v0, p pVar, int i10) {
            super(2);
            this.f25585r = c1710v0;
            this.f25586s = pVar;
            this.f25587t = i10;
        }

        public final void a(InterfaceC1690l interfaceC1690l, int i10) {
            AbstractC1709v.a(this.f25585r, this.f25586s, interfaceC1690l, AbstractC1716y0.a(this.f25587t | 1));
        }

        @Override // p219v8.p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((InterfaceC1690l) obj, ((Number) obj2).intValue());
            return A.f21846a;
        }
    }

    public static final void a(C1710v0 c1710v0, p pVar, InterfaceC1690l interfaceC1690l, int i10) {
        InterfaceC1690l interfaceC1690lG = interfaceC1690l.g(-1350970552);
        if (AbstractC1696o.G()) {
            AbstractC1696o.O(-1350970552, i10, -1, "androidx.compose.runtime.CompositionLocalProvider (CompositionLocal.kt:398)");
        }
        interfaceC1690lG.i(c1710v0);
        pVar.invoke(interfaceC1690lG, Integer.valueOf((i10 >> 3) & 14));
        interfaceC1690lG.r();
        if (AbstractC1696o.G()) {
            AbstractC1696o.N();
        }
        I0 i0K = interfaceC1690lG.k();
        if (i0K != null) {
            i0K.a(new b(c1710v0, pVar, i10));
        }
    }

    public static final void b(C1710v0[] c1710v0Arr, p pVar, InterfaceC1690l interfaceC1690l, int i10) {
        InterfaceC1690l interfaceC1690lG = interfaceC1690l.g(-1390796515);
        if (AbstractC1696o.G()) {
            AbstractC1696o.O(-1390796515, i10, -1, "androidx.compose.runtime.CompositionLocalProvider (CompositionLocal.kt:377)");
        }
        interfaceC1690lG.c(c1710v0Arr);
        pVar.invoke(interfaceC1690lG, Integer.valueOf((i10 >> 3) & 14));
        interfaceC1690lG.o();
        if (AbstractC1696o.G()) {
            AbstractC1696o.N();
        }
        I0 i0K = interfaceC1690lG.k();
        if (i0K != null) {
            i0K.a(new a(c1710v0Arr, pVar, i10));
        }
    }

    public static final AbstractC1708u0 c(R0 r9, p219v8.a aVar) {
        return new J(r9, aVar);
    }

    public static /* synthetic */ AbstractC1708u0 d(R0 r9, p219v8.a aVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            r9 = S0.g();
        }
        return c(r9, aVar);
    }

    public static final AbstractC1708u0 e(p219v8.a aVar) {
        return new c1(aVar);
    }
}
