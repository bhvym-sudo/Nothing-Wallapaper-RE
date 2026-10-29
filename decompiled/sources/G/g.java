package G;

import android.view.KeyEvent;

/* JADX INFO: loaded from: classes.dex */
public interface g extends e {

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final class a extends kotlin.jvm.internal.o implements p219v8.a {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public static final a f1923r = new a();

        a() {
            super(0);
        }

        @Override // p219v8.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke() {
            return Boolean.FALSE;
        }
    }

    static /* synthetic */ boolean h(g gVar, KeyEvent keyEvent, p219v8.a aVar, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: dispatchKeyEvent-YhN2O0w");
        }
        if ((i10 & 2) != 0) {
            aVar = a.f1923r;
        }
        return gVar.k(keyEvent, aVar);
    }

    void a(androidx.compose.ui.focus.k kVar);

    C.c b();

    void c(h hVar);

    void d(b bVar);

    boolean e(boolean z9, boolean z10, boolean z11, int i10);

    l f();

    boolean g(androidx.compose.ui.focus.b bVar, H.i iVar);

    o i();

    H.i j();

    boolean k(KeyEvent keyEvent, p219v8.a aVar);

    boolean l(KeyEvent keyEvent);

    Boolean m(int i10, H.i iVar, p219v8.l lVar);

    void n();

    boolean o(S.b bVar);
}
