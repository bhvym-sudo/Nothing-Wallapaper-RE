package androidx.compose.ui.platform;

import p170r.AbstractC1696o;
import p170r.InterfaceC1690l;

/* JADX INFO: loaded from: classes.dex */
public final class L {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final L f11724a = new L();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static p219v8.p f11725b = p240y.c.b(-1759434350, false, a.f11726r);

    static final class a extends kotlin.jvm.internal.o implements p219v8.p {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public static final a f11726r = new a();

        a() {
            super(2);
        }

        public final void a(InterfaceC1690l interfaceC1690l, int i10) {
            if ((i10 & 3) == 2 && interfaceC1690l.h()) {
                interfaceC1690l.m();
                return;
            }
            if (AbstractC1696o.G()) {
                AbstractC1696o.O(-1759434350, i10, -1, "androidx.compose.ui.platform.ComposableSingletons$Wrapper_androidKt.lambda-1.<anonymous> (Wrapper.android.kt:120)");
            }
            if (AbstractC1696o.G()) {
                AbstractC1696o.N();
            }
        }

        @Override // p219v8.p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((InterfaceC1690l) obj, ((Number) obj2).intValue());
            return p079h8.A.f21846a;
        }
    }

    public final p219v8.p a() {
        return f11725b;
    }
}
