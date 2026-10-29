package com.nothing.wallpaper.picker.individual;

import I3.p;
import J6.h;
import J6.i;
import M6.k;
import android.content.Context;
import android.graphics.Insets;
import android.util.AttributeSet;
import android.view.WindowInsets;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.nothing.wallpaper.R;
import com.nothing.wallpaper.picker.individual.IndividualPickerFrame;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.AbstractC1457h;
import kotlin.jvm.internal.n;
import p064g3.A;
import p064g3.AbstractC1356a;
import p064g3.r;
import p064g3.x;
import p089i8.AbstractC1444s;
import p219v8.q;

/* JADX INFO: loaded from: classes2.dex */
public final class IndividualPickerFrame extends RecyclerView {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final a f18589t = new a(null);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private r f18590q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private GridLayoutManager f18591r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private k f18592s;

    public static final class a {
        public /* synthetic */ a(AbstractC1457h abstractC1457h) {
            this();
        }

        private a() {
        }
    }

    public static final class b extends GridLayoutManager.SpanSizeLookup {
        b() {
        }

        @Override // androidx.recyclerview.widget.GridLayoutManager.SpanSizeLookup
        public int getSpanSize(int i10) {
            RecyclerView.Adapter adapter = IndividualPickerFrame.this.getAdapter();
            int itemCount = adapter != null ? adapter.getItemCount() : 0;
            return (itemCount <= 0 || itemCount - 1 != i10) ? 1 : 3;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public IndividualPickerFrame(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        n.h(context, "context");
    }

    private final i d() {
        return new i("CREATIVE_FOOT_WALLPAPER_ID", i.f3591F.a(getContext()), "", "", "", "");
    }

    private final void e() {
        this.f18591r.setSpanSizeLookup(new b());
    }

    private final void g(boolean z9, final List list) {
        r rVar = this.f18590q;
        if (rVar instanceof h) {
            if (rVar != null) {
                rVar.o(getContext(), new A() { // from class: x7.a
                    @Override // p064g3.A
                    public final void a(List list2) {
                        IndividualPickerFrame.i(list, this, list2);
                    }
                }, z9);
            }
        } else if (rVar != null) {
            rVar.o(getContext(), new A() { // from class: x7.b
                @Override // p064g3.A
                public final void a(List list2) {
                    IndividualPickerFrame.j(this.f30072a, list2);
                }
            }, z9);
        }
    }

    static /* synthetic */ void h(IndividualPickerFrame individualPickerFrame, boolean z9, List list, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            list = null;
        }
        individualPickerFrame.g(z9, list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i(List list, IndividualPickerFrame individualPickerFrame, List list2) {
        Object next;
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                n.e(list2);
                Iterator it2 = list2.iterator();
                do {
                    if (!it2.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it2.next();
                } while (!n.d(str, ((x) next).r()));
                x xVar = (x) next;
                if (xVar instanceof i) {
                    ((i) xVar).A(true);
                }
            }
        }
        if (list2.size() > 0) {
            list2.add(individualPickerFrame.d());
        }
        k kVar = individualPickerFrame.f18592s;
        if (kVar != null) {
            kVar.submitList(list2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void j(IndividualPickerFrame individualPickerFrame, List list) {
        k kVar = individualPickerFrame.f18592s;
        if (kVar != null) {
            kVar.submitList(list);
        }
    }

    public final void f() {
        scrollToPosition(0);
        this.f18592s = null;
    }

    public final AbstractC1356a getCategory() {
        return this.f18590q;
    }

    public final List<x> getWallpaperList() {
        List<x> currentList;
        k kVar = this.f18592s;
        return (kVar == null || (currentList = kVar.getCurrentList()) == null) ? AbstractC1444s.l() : currentList;
    }

    public final void k(r category, Set appliedIds, List list, q listener) {
        n.h(category, "category");
        n.h(appliedIds, "appliedIds");
        n.h(listener, "listener");
        this.f18590q = category;
        if (this.f18592s == null) {
            Context context = getContext();
            n.g(context, "getContext(...)");
            k kVar = new k(context, appliedIds, listener);
            this.f18592s = kVar;
            setAdapter(kVar);
        }
        if (category instanceof h) {
            e();
        } else {
            this.f18591r.setSpanSizeLookup(new GridLayoutManager.DefaultSpanSizeLookup());
        }
        g(false, list);
    }

    public final void l() {
        h(this, false, null, 2, null);
    }

    public final void m() {
        for (x xVar : getWallpaperList()) {
            if (xVar instanceof i) {
                ((i) xVar).A(false);
            }
        }
    }

    @Override // android.view.View
    public WindowInsets onApplyWindowInsets(WindowInsets insets) {
        n.h(insets, "insets");
        Insets insets2 = insets.getInsets(WindowInsets.Type.navigationBars());
        n.g(insets2, "getInsets(...)");
        setPadding(getPaddingLeft(), getPaddingTop(), getPaddingRight(), insets2.bottom);
        WindowInsets windowInsetsOnApplyWindowInsets = super.onApplyWindowInsets(insets);
        n.g(windowInsetsOnApplyWindowInsets, "onApplyWindowInsets(...)");
        return windowInsetsOnApplyWindowInsets;
    }

    public /* synthetic */ IndividualPickerFrame(Context context, AttributeSet attributeSet, int i10, int i11, AbstractC1457h abstractC1457h) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? 0 : i10);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IndividualPickerFrame(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        n.h(context, "context");
        GridLayoutManager gridLayoutManager = new GridLayoutManager(context, 3);
        this.f18591r = gridLayoutManager;
        setLayoutManager(gridLayoutManager);
        addItemDecoration(new p(getResources().getDimensionPixelSize(R.dimen.grid_item_individual_padding_horizontal), getResources().getDimensionPixelSize(R.dimen.nt_category_item_space)));
    }
}
