package com.nothing.wallpaper.picker.lockscreen.ui.view;

import F8.AbstractC0812g;
import F8.AbstractC0816i;
import F8.C0803b0;
import F8.T0;
import android.content.Context;
import android.text.format.DateFormat;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.nothing.wallpaper.R;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;
import kotlin.jvm.internal.AbstractC1457h;
import p044e3.AbstractC1328i;
import p044e3.AbstractC1331k;
import p089i8.AbstractC1444s;

/* JADX INFO: loaded from: classes2.dex */
public final class ClockSnapshotListView extends FrameLayout {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final AbstractC1331k f18874q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private a f18875r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final com.android.launcher3.views.f f18876s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final com.android.launcher3.f f18877t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private View.OnClickListener f18878u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final WeakHashMap f18879v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final F8.L f18880w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private Boolean f18881x;

    /* JADX INFO: Access modifiers changed from: private */
    final class a extends RecyclerView.Adapter {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private final S1.a f18882q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private final com.android.launcher3.f f18883r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        private final List f18884s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ ClockSnapshotListView f18885t;

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: com.nothing.wallpaper.picker.lockscreen.ui.view.ClockSnapshotListView$a$a, reason: collision with other inner class name */
        final class C0509a extends RecyclerView.ViewHolder {

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            private final AbstractC1328i f18886q;

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            private final com.android.launcher3.f f18887r;

            /* JADX INFO: renamed from: s, reason: collision with root package name */
            private final S1.a f18888s;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            final /* synthetic */ a f18889t;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0509a(a aVar, AbstractC1328i binding, com.android.launcher3.f deviceProfile, S1.a clockViewFactory) {
                super(binding.o());
                kotlin.jvm.internal.n.h(binding, "binding");
                kotlin.jvm.internal.n.h(deviceProfile, "deviceProfile");
                kotlin.jvm.internal.n.h(clockViewFactory, "clockViewFactory");
                this.f18889t = aVar;
                this.f18886q = binding;
                this.f18887r = deviceProfile;
                this.f18888s = clockViewFactory;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final p079h8.A f(C0509a c0509a, T1.a aVar, View clockView) {
                kotlin.jvm.internal.n.h(clockView, "clockView");
                Object tag = c0509a.itemView.getTag();
                T1.a aVar2 = tag instanceof T1.a ? (T1.a) tag : null;
                if (kotlin.jvm.internal.n.d(aVar2 != null ? aVar2.a() : null, aVar.a())) {
                    c0509a.f18886q.f19993v.setUpClockView(clockView);
                }
                return p079h8.A.f21846a;
            }

            public final void e(final T1.a info) {
                kotlin.jvm.internal.n.h(info, "info");
                ClockSnapshotItemView clockFaceContainer = this.f18886q.f19993v;
                kotlin.jvm.internal.n.g(clockFaceContainer, "clockFaceContainer");
                ViewGroup.LayoutParams layoutParams = clockFaceContainer.getLayoutParams();
                if (layoutParams == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                }
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                com.android.launcher3.f fVar = this.f18887r;
                marginLayoutParams.width = fVar.f15579p;
                marginLayoutParams.height = fVar.f15580q;
                clockFaceContainer.setLayoutParams(marginLayoutParams);
                this.f18886q.f19993v.setSelected(info.c());
                this.f18886q.f19993v.setContentDescription(info.b());
                this.f18886q.f19993v.a();
                S1.a aVar = this.f18888s;
                H h10 = aVar instanceof H ? (H) aVar : null;
                if (h10 == null) {
                    return;
                }
                View viewF = this.f18889t.f18885t.f(info.a());
                if (viewF != null) {
                    this.f18886q.f19993v.setUpClockView(viewF);
                } else {
                    this.f18889t.f18885t.g(info.a(), h10, new p219v8.l() { // from class: com.nothing.wallpaper.picker.lockscreen.ui.view.A
                        @Override // p219v8.l
                        public final Object f(Object obj) {
                            return ClockSnapshotListView.a.C0509a.f(this.f18752q, info, (View) obj);
                        }
                    });
                }
            }

            public final void g() {
                this.f18886q.f19993v.a();
            }

            public final void h(T1.a info) {
                kotlin.jvm.internal.n.h(info, "info");
                this.f18886q.f19993v.setSelected(info.c());
            }
        }

        public a(ClockSnapshotListView clockSnapshotListView, S1.a clockViewFactory, com.android.launcher3.f deviceProfile, List items) {
            kotlin.jvm.internal.n.h(clockViewFactory, "clockViewFactory");
            kotlin.jvm.internal.n.h(deviceProfile, "deviceProfile");
            kotlin.jvm.internal.n.h(items, "items");
            this.f18885t = clockSnapshotListView;
            this.f18882q = clockViewFactory;
            this.f18883r = deviceProfile;
            this.f18884s = items;
        }

        public final boolean d(List clockModels) {
            kotlin.jvm.internal.n.h(clockModels, "clockModels");
            if (clockModels.size() != this.f18884s.size()) {
                return false;
            }
            Iterable<p089i8.I> iterableX0 = AbstractC1444s.x0(this.f18884s);
            if ((iterableX0 instanceof Collection) && ((Collection) iterableX0).isEmpty()) {
                return true;
            }
            for (p089i8.I i10 : iterableX0) {
                int iA = i10.a();
                T1.a aVar = (T1.a) i10.b();
                T1.a aVar2 = (T1.a) AbstractC1444s.V(clockModels, iA);
                if (aVar2 == null || !kotlin.jvm.internal.n.d(aVar.a(), aVar2.a())) {
                    return false;
                }
            }
            return true;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public void onBindViewHolder(C0509a holder, int i10) {
            kotlin.jvm.internal.n.h(holder, "holder");
            T1.a aVar = (T1.a) this.f18884s.get(i10);
            holder.e(aVar);
            holder.itemView.setTag(aVar);
            holder.itemView.setOnClickListener(this.f18885t.getOnClockItemClickListener());
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void onBindViewHolder(C0509a holder, int i10, List payloads) {
            kotlin.jvm.internal.n.h(holder, "holder");
            kotlin.jvm.internal.n.h(payloads, "payloads");
            if (payloads.isEmpty()) {
                onBindViewHolder(holder, i10);
            } else {
                holder.h((T1.a) this.f18884s.get(i10));
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public C0509a onCreateViewHolder(ViewGroup parent, int i10) {
            kotlin.jvm.internal.n.h(parent, "parent");
            AbstractC1328i abstractC1328iC = AbstractC1328i.C(LayoutInflater.from(parent.getContext()), parent, false);
            kotlin.jvm.internal.n.g(abstractC1328iC, "inflate(...)");
            return new C0509a(this, abstractC1328iC, this.f18883r, this.f18882q);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
            return this.f18884s.size();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public void onViewRecycled(C0509a holder) {
            kotlin.jvm.internal.n.h(holder, "holder");
            super.onViewRecycled(holder);
            holder.g();
        }

        public final boolean i(int i10) {
            Iterator it = this.f18884s.iterator();
            int i11 = 0;
            while (true) {
                if (!it.hasNext()) {
                    i11 = -1;
                    break;
                }
                if (((T1.a) it.next()).c()) {
                    break;
                }
                i11++;
            }
            if (i11 == i10 || i11 == -1 || i10 == -1) {
                return false;
            }
            T1.a aVar = (T1.a) this.f18884s.get(i11);
            T1.a aVar2 = (T1.a) this.f18884s.get(i10);
            this.f18884s.set(i11, new T1.a(aVar.a(), false, aVar.b()));
            this.f18884s.set(i10, new T1.a(aVar2.a(), true, aVar2.b()));
            notifyItemChanged(i11, Boolean.FALSE);
            notifyItemChanged(i10, Boolean.TRUE);
            return true;
        }
    }

    static final class b extends kotlin.coroutines.jvm.internal.l implements p219v8.p {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f18890q;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        final /* synthetic */ String f18892s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ p219v8.l f18893t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        final /* synthetic */ H f18894u;

        static final class a extends kotlin.coroutines.jvm.internal.l implements p219v8.p {

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            int f18895q;

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            final /* synthetic */ H f18896r;

            /* JADX INFO: renamed from: s, reason: collision with root package name */
            final /* synthetic */ String f18897s;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(H h10, String str, p129m8.e eVar) {
                super(2, eVar);
                this.f18896r = h10;
                this.f18897s = str;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final p129m8.e create(Object obj, p129m8.e eVar) {
                return new a(this.f18896r, this.f18897s, eVar);
            }

            @Override // p219v8.p
            public final Object invoke(F8.L l9, p129m8.e eVar) {
                return ((a) create(l9, eVar)).invokeSuspend(p079h8.A.f21846a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                p139n8.b.e();
                if (this.f18895q != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                p079h8.r.b(obj);
                return this.f18896r.E(this.f18897s);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(String str, p219v8.l lVar, H h10, p129m8.e eVar) {
            super(2, eVar);
            this.f18892s = str;
            this.f18893t = lVar;
            this.f18894u = h10;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final p129m8.e create(Object obj, p129m8.e eVar) {
            return ClockSnapshotListView.this.new b(this.f18892s, this.f18893t, this.f18894u, eVar);
        }

        @Override // p219v8.p
        public final Object invoke(F8.L l9, p129m8.e eVar) {
            return ((b) create(l9, eVar)).invokeSuspend(p079h8.A.f21846a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objE = p139n8.b.e();
            int i10 = this.f18890q;
            if (i10 == 0) {
                p079h8.r.b(obj);
                F8.I iA = C0803b0.a();
                a aVar = new a(this.f18894u, this.f18892s, null);
                this.f18890q = 1;
                obj = AbstractC0812g.g(iA, aVar, this);
                if (obj == objE) {
                    return objE;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                p079h8.r.b(obj);
            }
            View view = (View) obj;
            ClockSnapshotListView.this.h(this.f18892s, view);
            this.f18893t.f(view);
            return p079h8.A.f21846a;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ClockSnapshotListView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
        kotlin.jvm.internal.n.h(context, "context");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final View f(String str) {
        View view = (View) this.f18879v.get(str);
        if ((view == null || view.isAttachedToWindow()) && view != null) {
            return view;
        }
        this.f18879v.remove(str);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void g(String str, H h10, p219v8.l lVar) {
        View viewF = f(str);
        if (viewF != null) {
            lVar.f(viewF);
        } else {
            AbstractC0816i.d(this.f18880w, null, null, new b(str, lVar, h10, null), 3, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void h(String str, View view) {
        this.f18879v.put(str, view);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void j(ClockSnapshotListView clockSnapshotListView, List list, LinearLayoutManager linearLayoutManager) {
        int dimension = (int) clockSnapshotListView.getResources().getDimension(R.dimen.nt_clock_edit_padding_horizon);
        Iterator it = list.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            if (((T1.a) it.next()).c()) {
                linearLayoutManager.scrollToPositionWithOffset(i10, dimension);
            }
            i10++;
        }
        i10 = -1;
        linearLayoutManager.scrollToPositionWithOffset(i10, dimension);
    }

    private final void k() {
        if (kotlin.jvm.internal.n.d(this.f18881x, Boolean.valueOf(DateFormat.is24HourFormat(getContext())))) {
            return;
        }
        this.f18879v.clear();
        a aVar = this.f18875r;
        if (aVar != null) {
            aVar.notifyItemRangeChanged(0, aVar != null ? aVar.getItemCount() : 0);
        }
    }

    public final void e() {
        this.f18874q.f20013v.setAdapter(null);
        this.f18875r = null;
        this.f18879v.clear();
        F8.M.d(this.f18880w, null, 1, null);
    }

    public final View.OnClickListener getOnClockItemClickListener() {
        return this.f18878u;
    }

    public final void i(final List clocks, S1.a clockViewFactory) {
        kotlin.jvm.internal.n.h(clocks, "clocks");
        kotlin.jvm.internal.n.h(clockViewFactory, "clockViewFactory");
        AbstractC1331k abstractC1331k = this.f18874q;
        a aVar = this.f18875r;
        if (aVar != null && aVar.d(clocks)) {
            k();
            return;
        }
        final LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext(), 0, false);
        abstractC1331k.f20013v.setLayoutManager(linearLayoutManager);
        if (abstractC1331k.f20013v.getItemDecorationCount() > 0) {
            abstractC1331k.f20013v.removeItemDecorationAt(0);
        }
        abstractC1331k.f20013v.addItemDecoration(new C1278u(), 0);
        com.android.launcher3.f deviceProfile = this.f18877t;
        kotlin.jvm.internal.n.g(deviceProfile, "deviceProfile");
        a aVar2 = new a(this, clockViewFactory, deviceProfile, AbstractC1444s.u0(clocks));
        this.f18875r = aVar2;
        abstractC1331k.f20013v.setAdapter(aVar2);
        abstractC1331k.f20013v.post(new Runnable() { // from class: com.nothing.wallpaper.picker.lockscreen.ui.view.z
            @Override // java.lang.Runnable
            public final void run() {
                ClockSnapshotListView.j(this.f19131q, clocks, linearLayoutManager);
            }
        });
    }

    public final void l(int i10, boolean z9) {
        a aVar = this.f18875r;
        if (aVar != null) {
            aVar.i(i10);
        }
        if (z9) {
            this.f18874q.f20013v.smoothScrollToPosition(i10);
        }
    }

    public final void setOnClockItemClickListener(View.OnClickListener onClickListener) {
        this.f18878u = onClickListener;
    }

    public /* synthetic */ ClockSnapshotListView(Context context, AttributeSet attributeSet, int i10, int i11, int i12, AbstractC1457h abstractC1457h) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i10, (i12 & 8) != 0 ? 0 : i11);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ClockSnapshotListView(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        kotlin.jvm.internal.n.h(context, "context");
        AbstractC1331k abstractC1331kC = AbstractC1331k.C(LayoutInflater.from(context), this, true);
        kotlin.jvm.internal.n.g(abstractC1331kC, "inflate(...)");
        this.f18874q = abstractC1331kC;
        com.android.launcher3.views.f fVar = (com.android.launcher3.views.f) com.android.launcher3.views.f.y(context);
        this.f18876s = fVar;
        this.f18877t = fVar.K();
        this.f18879v = new WeakHashMap();
        this.f18880w = F8.M.a(T0.b(null, 1, null).z(C0803b0.c()));
    }
}
