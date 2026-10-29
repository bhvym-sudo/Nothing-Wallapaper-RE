package M6;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.InterfaceC1163x;
import androidx.recyclerview.widget.RecyclerView;
import com.nothing.wallpaper.R;
import com.nothing.wallpaper.widget.CategoryItemView;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.AbstractC1457h;
import p044e3.K;
import p044e3.X;
import p064g3.AbstractC1356a;

/* JADX INFO: loaded from: classes2.dex */
public final class e extends RecyclerView.Adapter {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final a f5033v = new a(null);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final List f5034q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final Set f5035r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final boolean f5036s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final p219v8.p f5037t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private InterfaceC1163x f5038u;

    public static final class a {
        public /* synthetic */ a(AbstractC1457h abstractC1457h) {
            this();
        }

        private a() {
        }
    }

    public e(List categories, Set appliedIds, boolean z9, p219v8.p listener) {
        kotlin.jvm.internal.n.h(categories, "categories");
        kotlin.jvm.internal.n.h(appliedIds, "appliedIds");
        kotlin.jvm.internal.n.h(listener, "listener");
        this.f5034q = categories;
        this.f5035r = appliedIds;
        this.f5036s = z9;
        this.f5037t = listener;
        setHasStableIds(true);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(M6.a holder, int i10) {
        kotlin.jvm.internal.n.h(holder, "holder");
        AbstractC1356a abstractC1356a = (AbstractC1356a) this.f5034q.get(i10);
        if (holder instanceof u) {
            ((u) holder).m(abstractC1356a, this.f5038u);
        } else {
            holder.d(abstractC1356a);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public M6.a onCreateViewHolder(ViewGroup parent, int i10) {
        kotlin.jvm.internal.n.h(parent, "parent");
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(parent.getContext());
        if (i10 == 1) {
            K kC = K.C(layoutInflaterFrom, parent, false);
            kotlin.jvm.internal.n.g(kC, "inflate(...)");
            return new u(kC, this.f5036s, this.f5037t);
        }
        if (i10 == 2) {
            View viewInflate = layoutInflaterFrom.inflate(R.layout.nt_category_view, parent, false);
            kotlin.jvm.internal.n.f(viewInflate, "null cannot be cast to non-null type com.nothing.wallpaper.widget.CategoryItemView");
            return new f((CategoryItemView) viewInflate, this.f5035r, this.f5037t, true);
        }
        if (i10 != 3) {
            View viewInflate2 = layoutInflaterFrom.inflate(R.layout.nt_category_view, parent, false);
            kotlin.jvm.internal.n.f(viewInflate2, "null cannot be cast to non-null type com.nothing.wallpaper.widget.CategoryItemView");
            return new f((CategoryItemView) viewInflate2, this.f5035r, this.f5037t, false, 8, null);
        }
        X xC = X.C(layoutInflaterFrom, parent, false);
        kotlin.jvm.internal.n.g(xC, "inflate(...)");
        return new h(xC, this.f5035r, this.f5037t);
    }

    public final void f(InterfaceC1163x interfaceC1163x) {
        this.f5038u = interfaceC1163x;
    }

    public final void g(RecyclerView.RecycledViewPool viewPool) {
        kotlin.jvm.internal.n.h(viewPool, "viewPool");
        viewPool.setMaxRecycledViews(1, 1);
        viewPool.setMaxRecycledViews(2, 1);
        viewPool.setMaxRecycledViews(3, 1);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f5034q.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public long getItemId(int i10) {
        return i10;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i10) {
        AbstractC1356a abstractC1356a = (AbstractC1356a) this.f5034q.get(i10);
        if (abstractC1356a instanceof J6.l) {
            return 1;
        }
        if (abstractC1356a instanceof J6.b) {
            return 2;
        }
        return abstractC1356a instanceof J6.h ? 3 : 0;
    }
}
