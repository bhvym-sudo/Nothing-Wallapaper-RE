package androidx.compose.ui.focus;

import kotlin.jvm.internal.InterfaceC1458i;

/* JADX INFO: loaded from: classes.dex */
public abstract class h {

    static final class a implements G.j, InterfaceC1458i {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private final /* synthetic */ p219v8.l f11424q;

        a(p219v8.l lVar) {
            this.f11424q = lVar;
        }

        @Override // kotlin.jvm.internal.InterfaceC1458i
        public final p079h8.e a() {
            return this.f11424q;
        }

        @Override // G.j
        public final /* synthetic */ void b(f fVar) {
            this.f11424q.f(fVar);
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof G.j) && (obj instanceof InterfaceC1458i)) {
                return kotlin.jvm.internal.n.d(a(), ((InterfaceC1458i) obj).a());
            }
            return false;
        }

        public final int hashCode() {
            return a().hashCode();
        }
    }

    public static final C.c a(C.c cVar, p219v8.l lVar) {
        return cVar.c(new FocusPropertiesElement(new a(lVar)));
    }
}
