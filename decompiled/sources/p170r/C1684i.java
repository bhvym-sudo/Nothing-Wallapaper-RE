package p170r;

import kotlin.jvm.internal.o;
import p079h8.A;
import p219v8.p;
import p240y.c;

/* JADX INFO: renamed from: r.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1684i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C1684i f25457a = new C1684i();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static p f25458b = c.b(954879418, false, a.f25460r);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static p f25459c = c.b(1918065384, false, b.f25461r);

    /* JADX INFO: renamed from: r.i$a */
    static final class a extends o implements p {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public static final a f25460r = new a();

        a() {
            super(2);
        }

        public final void a(InterfaceC1690l interfaceC1690l, int i10) {
            if ((i10 & 3) == 2 && interfaceC1690l.h()) {
                interfaceC1690l.m();
                return;
            }
            if (AbstractC1696o.G()) {
                AbstractC1696o.O(954879418, i10, -1, "androidx.compose.runtime.ComposableSingletons$CompositionKt.lambda-1.<anonymous> (Composition.kt:623)");
            }
            if (AbstractC1696o.G()) {
                AbstractC1696o.N();
            }
        }

        @Override // p219v8.p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((InterfaceC1690l) obj, ((Number) obj2).intValue());
            return A.f21846a;
        }
    }

    /* JADX INFO: renamed from: r.i$b */
    static final class b extends o implements p {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public static final b f25461r = new b();

        b() {
            super(2);
        }

        public final void a(InterfaceC1690l interfaceC1690l, int i10) {
            if ((i10 & 3) == 2 && interfaceC1690l.h()) {
                interfaceC1690l.m();
                return;
            }
            if (AbstractC1696o.G()) {
                AbstractC1696o.O(1918065384, i10, -1, "androidx.compose.runtime.ComposableSingletons$CompositionKt.lambda-2.<anonymous> (Composition.kt:757)");
            }
            if (AbstractC1696o.G()) {
                AbstractC1696o.N();
            }
        }

        @Override // p219v8.p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((InterfaceC1690l) obj, ((Number) obj2).intValue());
            return A.f21846a;
        }
    }

    public final p a() {
        return f25458b;
    }

    public final p b() {
        return f25459c;
    }
}
