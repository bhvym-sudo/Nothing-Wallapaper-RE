package S7;

import android.animation.Animator;
import android.view.View;
import android.view.ViewGroup;
import androidx.transition.K;
import androidx.transition.z;
import kotlin.jvm.internal.AbstractC1457h;
import kotlin.jvm.internal.n;

/* JADX INFO: loaded from: classes2.dex */
public final class e extends K {

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public static final a f7376k0 = new a(null);

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    private final int f7377i0;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    private final R4.a f7378j0;

    public static final class a {
        public /* synthetic */ a(AbstractC1457h abstractC1457h) {
            this();
        }

        private a() {
        }
    }

    public e(int i10, boolean z9) {
        R4.a aVar;
        this.f7377i0 = i10;
        if (i10 == 0) {
            aVar = new R4.a(z9 ? 8388613 : 8388611);
        } else {
            aVar = new R4.a(z9 ? 80 : 48);
        }
        this.f7378j0 = aVar;
    }

    private final Animator C0(ViewGroup viewGroup, View view, boolean z9) {
        this.f7378j0.i(this.f7377i0 == 0 ? viewGroup.getWidth() : viewGroup.getHeight());
        return z9 ? this.f7378j0.a(viewGroup, view) : this.f7378j0.b(viewGroup, view);
    }

    @Override // androidx.transition.K
    public Animator x0(ViewGroup sceneRoot, View view, z zVar, z zVar2) {
        n.h(sceneRoot, "sceneRoot");
        n.h(view, "view");
        return C0(sceneRoot, view, true);
    }

    @Override // androidx.transition.K
    public Animator z0(ViewGroup sceneRoot, View view, z zVar, z zVar2) {
        n.h(sceneRoot, "sceneRoot");
        n.h(view, "view");
        return C0(sceneRoot, view, false);
    }
}
