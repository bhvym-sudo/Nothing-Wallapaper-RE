package androidx.compose.ui.platform;

import android.view.ActionMode;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final class C implements m0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final View f11661a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ActionMode f11662b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Y.a f11663c = new Y.a(new a(), null, null, null, null, null, 62, null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private n0 f11664d = n0.Hidden;

    static final class a extends kotlin.jvm.internal.o implements p219v8.a {
        a() {
            super(0);
        }

        public final void a() {
            C.this.f11662b = null;
        }

        @Override // p219v8.a
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return p079h8.A.f21846a;
        }
    }

    public C(View view) {
        this.f11661a = view;
    }
}
