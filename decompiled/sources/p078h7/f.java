package p078h7;

import M7.c;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.lifecycle.I;
import com.nothing.wallpaper.R;
import kotlin.jvm.internal.n;
import p084i3.s0;
import p228w7.b;
import p242y1.e;

/* JADX INFO: loaded from: classes2.dex */
public final class f implements p064g3.f {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final b f21823q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final e f21824r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final I f21825s;

    public static final class a implements View.OnAttachStateChangeListener {
        a() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View v9) {
            n.h(v9, "v");
            f.this.f21824r.g(null).i(f.this.f21825s);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View v9) {
            n.h(v9, "v");
            f.this.f21824r.g(null).m(f.this.f21825s);
        }
    }

    public f(b launcherUpdateInteractor, e gridManager) {
        n.h(launcherUpdateInteractor, "launcherUpdateInteractor");
        n.h(gridManager, "gridManager");
        this.f21823q = launcherUpdateInteractor;
        this.f21824r = gridManager;
        this.f21825s = new I() { // from class: h7.d
            @Override // androidx.lifecycle.I
            public final void b(Object obj) {
                f.l(this.f21821q, obj);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void k(Context context, View view) {
        context.startActivity(p058f7.a.a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void l(f fVar, Object it) {
        n.h(it, "it");
        fVar.m();
    }

    private final void m() {
        this.f21823q.b(true);
    }

    private final boolean n() {
        return !this.f21824r.i();
    }

    @Override // p064g3.f
    public View c(View view, final Context context) {
        n.h(view, "view");
        n.h(context, "context");
        LinearLayout linearLayoutF = c.f(context, (ViewGroup) view, Integer.valueOf(R.drawable.nt_ic_grid_section), ImageView.ScaleType.CENTER_INSIDE, R.string.nt_grid_section_title, new View.OnClickListener() { // from class: h7.e
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                f.k(context, view2);
            }
        });
        if (!n()) {
            linearLayoutF.addOnAttachStateChangeListener(new a());
            return linearLayoutF;
        }
        linearLayoutF.setClickable(false);
        linearLayoutF.setAlpha(0.3f);
        return linearLayoutF;
    }

    @Override // p064g3.f
    public boolean e(Context context) {
        n.h(context, "context");
        return p058f7.b.f20880a.c(context);
    }

    @Override // p064g3.f
    public s0 f(Context context) {
        n.h(context, "context");
        throw new p079h8.n("An operation is not implemented: Not yet implemented");
    }
}
