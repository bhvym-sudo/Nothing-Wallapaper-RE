package F7;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.RelativeLayout;
import androidx.recyclerview.widget.ListAdapter;
import androidx.recyclerview.widget.RecyclerView;
import p044e3.AbstractC1312a;

/* JADX INFO: loaded from: classes2.dex */
public final class b extends ListAdapter {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final S1.a f1734q;

    public static final class a extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private final AbstractC1312a f1735q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private final S1.a f1736r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(AbstractC1312a binding, S1.a clockViewFactory) {
            super(binding.o());
            kotlin.jvm.internal.n.h(binding, "binding");
            kotlin.jvm.internal.n.h(clockViewFactory, "clockViewFactory");
            this.f1735q = binding;
            this.f1736r = clockViewFactory;
        }

        public final void d(T1.a info) {
            kotlin.jvm.internal.n.h(info, "info");
            RelativeLayout relativeLayout = this.f1735q.f19925v;
            relativeLayout.setContentDescription(info.b());
            relativeLayout.removeAllViews();
            View viewF = this.f1736r.f(info.a());
            ViewParent parent = viewF.getParent();
            ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
            if (viewGroup != null) {
                viewGroup.removeView(viewF);
            }
            relativeLayout.addView(viewF);
        }

        public final void e() {
            this.f1735q.f19925v.removeAllViews();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(S1.a clockViewFactory) {
        super(new c());
        kotlin.jvm.internal.n.h(clockViewFactory, "clockViewFactory");
        this.f1734q = clockViewFactory;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int i10) {
        kotlin.jvm.internal.n.h(holder, "holder");
        if (holder instanceof a) {
            Object item = getItem(i10);
            kotlin.jvm.internal.n.g(item, "getItem(...)");
            ((a) holder).d((T1.a) item);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int i10) {
        kotlin.jvm.internal.n.h(parent, "parent");
        AbstractC1312a abstractC1312aC = AbstractC1312a.C(LayoutInflater.from(parent.getContext()), parent, false);
        kotlin.jvm.internal.n.g(abstractC1312aC, "inflate(...)");
        return new a(abstractC1312aC, this.f1734q);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onViewRecycled(RecyclerView.ViewHolder holder) {
        kotlin.jvm.internal.n.h(holder, "holder");
        super.onViewRecycled(holder);
        if (holder instanceof a) {
            ((a) holder).e();
        }
    }
}
