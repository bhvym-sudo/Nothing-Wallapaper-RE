package R5;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import androidx.appcompat.app.c;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.T;
import androidx.fragment.app.AbstractComponentCallbacksC1132q;
import kotlin.jvm.internal.AbstractC1457h;
import kotlin.jvm.internal.n;

/* JADX INFO: loaded from: classes2.dex */
public abstract class b extends c {

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public static final a f7104T = new a(null);

    public static final class a {
        public /* synthetic */ a(AbstractC1457h abstractC1457h) {
            this();
        }

        private a() {
        }
    }

    private final void M0() {
        F0((Toolbar) findViewById(Q5.b.f6829f));
        androidx.appcompat.app.a aVarV0 = v0();
        if (aVarV0 != null) {
            aVarV0.s(true);
            aVarV0.u(L0());
        }
    }

    private final void N0() {
        if (Q0()) {
            View viewFindViewById = findViewById(Q5.b.f6824a);
            if (viewFindViewById != null) {
                viewFindViewById.setVisibility(0);
            }
            final View viewFindViewById2 = findViewById(Q5.b.f6827d);
            final View viewFindViewById3 = findViewById(Q5.b.f6828e);
            if (viewFindViewById3 != null) {
                int dimensionPixelSize = viewFindViewById3.getContext().getResources().getDimensionPixelSize(Q5.a.f6823a);
                ViewGroup.LayoutParams layoutParams = viewFindViewById3.getLayoutParams();
                n.f(layoutParams, "null cannot be cast to non-null type androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams");
                ((ViewGroup.MarginLayoutParams) ((CoordinatorLayout.f) layoutParams)).bottomMargin = dimensionPixelSize;
                viewFindViewById3.setOnScrollChangeListener(new View.OnScrollChangeListener() { // from class: R5.a
                    @Override // android.view.View.OnScrollChangeListener
                    public final void onScrollChange(View view, int i10, int i11, int i12, int i13) {
                        b.O0(viewFindViewById2, viewFindViewById3, view, i10, i11, i12, i13);
                    }
                });
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void O0(View view, View this_apply, View view2, int i10, int i11, int i12, int i13) {
        n.h(this_apply, "$this_apply");
        if (view == null) {
            return;
        }
        view.setVisibility(this_apply.canScrollVertically(1) ? 0 : 8);
    }

    private final void P0() {
        M0();
        N0();
    }

    public final Button J0() {
        return (Button) findViewById(Q5.b.f6825b);
    }

    public abstract AbstractComponentCallbacksC1132q K0();

    public abstract String L0();

    public abstract boolean Q0();

    @Override // androidx.fragment.app.AbstractActivityC1136v, p010b.j, p161q0.f, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        T.b(getWindow(), false);
        setContentView(Q5.c.f6830a);
        if (bundle == null) {
            o0().p().r(Q5.b.f6826c, K0()).i();
        }
        P0();
    }

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(MenuItem item) {
        n.h(item, "item");
        if (item.getItemId() != 16908332) {
            return super.onOptionsItemSelected(item);
        }
        finish();
        return true;
    }
}
