package p153p2;

import K1.p;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.AbstractActivityC1136v;
import androidx.lifecycle.d0;
import androidx.transition.m;
import com.nothing.wallpaper.R;
import kotlin.jvm.internal.AbstractC1457h;
import kotlin.jvm.internal.F;
import kotlin.jvm.internal.n;
import p074h3.H;
import p074h3.I;
import p143o2.d;
import p173r2.c;

/* JADX INFO: loaded from: classes.dex */
public final class b extends com.android.wallpaper.picker.a {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final a f23692v = new a(null);

    public static final class a {
        public /* synthetic */ a(AbstractC1457h abstractC1457h) {
            this();
        }

        public final b a() {
            return new b();
        }

        private a() {
        }
    }

    /* JADX INFO: renamed from: p2.b$b, reason: collision with other inner class name */
    public static final class C0626b implements m.h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ View f23693a;

        public C0626b(View view) {
            this.f23693a = view;
        }

        @Override // androidx.transition.m.h
        public void a(m transition) {
            View viewFindViewById;
            n.h(transition, "transition");
            View view = this.f23693a;
            if (view == null || (viewFindViewById = view.findViewById(R.id.preview)) == null) {
                return;
            }
            viewFindViewById.setVisibility(8);
        }

        @Override // androidx.transition.m.h
        public void c(m transition) {
            n.h(transition, "transition");
        }

        @Override // androidx.transition.m.h
        public void f(m transition) {
            n.h(transition, "transition");
        }

        @Override // androidx.transition.m.h
        public void i(m transition) {
            n.h(transition, "transition");
        }

        @Override // androidx.transition.m.h
        public void k(m transition) {
            n.h(transition, "transition");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void w0(b bVar) {
        bVar.startPostponedEnterTransition();
    }

    @Override // com.android.wallpaper.picker.a
    public CharSequence i0() {
        String string = requireContext().getString(R.string.keyguard_quick_affordance_title);
        n.g(string, "getString(...)");
        return string;
    }

    @Override // com.android.wallpaper.picker.a
    protected int j0() {
        return android.R.color.transparent;
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1132q
    public View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        n.h(inflater, "inflater");
        View viewInflate = inflater.inflate(R.layout.fragment_lock_screen_quick_affordances, viewGroup, false);
        q0(viewInflate);
        H hA = I.a();
        n.f(hA, "null cannot be cast to non-null type com.android.customization.module.ThemePickerInjector");
        p pVar = (p) hA;
        AbstractActivityC1136v abstractActivityC1136vRequireActivity = requireActivity();
        n.g(abstractActivityC1136vRequireActivity, "requireActivity(...)");
        Context contextRequireContext = requireContext();
        n.g(contextRequireContext, "requireContext(...)");
        c cVar = (c) new d0(abstractActivityC1136vRequireActivity, pVar.u0(contextRequireContext)).a(F.b(c.class));
        AbstractActivityC1136v abstractActivityC1136vRequireActivity2 = requireActivity();
        n.g(abstractActivityC1136vRequireActivity2, "requireActivity(...)");
        View viewRequireViewById = viewInflate.requireViewById(R.id.preview);
        n.g(viewRequireViewById, "requireViewById(...)");
        AbstractActivityC1136v abstractActivityC1136vRequireActivity3 = requireActivity();
        n.e(abstractActivityC1136vRequireActivity3);
        d.b(abstractActivityC1136vRequireActivity2, (CardView) viewRequireViewById, cVar, this, pVar.e(abstractActivityC1136vRequireActivity3).o(abstractActivityC1136vRequireActivity3));
        n.e(viewInflate);
        p143o2.b.c(viewInflate, cVar, this);
        postponeEnterTransition();
        viewInflate.post(new Runnable() { // from class: p2.a
            @Override // java.lang.Runnable
            public final void run() {
                b.w0(this.f23691q);
            }
        });
        Object returnTransition = getReturnTransition();
        m mVar = returnTransition instanceof m ? (m) returnTransition : null;
        if (mVar != null) {
            mVar.e(new C0626b(viewInflate));
        }
        return viewInflate;
    }
}
