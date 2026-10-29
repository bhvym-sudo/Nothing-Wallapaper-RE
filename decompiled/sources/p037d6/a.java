package p037d6;

import O2.d;
import com.nothing.systemui.shared.clocks.view.D;
import kotlin.jvm.internal.n;

/* JADX INFO: loaded from: classes2.dex */
public final class a implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final D f19645a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C0522a f19646b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final C0522a f19647c;

    /* JADX INFO: renamed from: d6.a$a, reason: collision with other inner class name */
    public final class C0522a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private float f19648a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f19649b;

        public C0522a(float f10) {
            this.f19648a = f10;
            this.f19649b = f10 > 0.5f;
        }
    }

    public a(D view, float f10, float f11) {
        n.h(view, "view");
        this.f19645a = view;
        this.f19646b = new C0522a(f10);
        this.f19647c = new C0522a(f11);
    }

    @Override // O2.d
    public void a(float f10) {
    }
}
