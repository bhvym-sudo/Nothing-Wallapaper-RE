package com.nothing.wallpaper.widget;

import J6.h;
import J6.m;
import M6.c;
import M6.v;
import R7.d;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.nothing.wallpaper.R;
import com.nothing.wallpaper.widget.CategoryItemView;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.AbstractC1457h;
import kotlin.jvm.internal.n;
import p064g3.AbstractC1356a;
import p064g3.r;
import p064g3.x;
import p079h8.A;
import p089i8.AbstractC1444s;
import p219v8.p;

/* JADX INFO: loaded from: classes2.dex */
public final class CategoryItemView extends LinearLayout {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final a f19137v = new a(null);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private c f19138q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private AbstractC1356a f19139r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private boolean f19140s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private TextView f19141t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private RecyclerView f19142u;

    public static final class a {
        public /* synthetic */ a(AbstractC1457h abstractC1457h) {
            this();
        }

        private a() {
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CategoryItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
        n.h(context, "context");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(CategoryItemView categoryItemView, List list) {
        if (!categoryItemView.f19140s) {
            n.e(list);
            categoryItemView.e(list);
        } else {
            c cVar = categoryItemView.f19138q;
            if (cVar != null) {
                cVar.submitList(list);
            }
        }
    }

    private final void e(List list) {
        if (list.size() > 6) {
            list = AbstractC1444s.g0(AbstractC1444s.o0(list, 6), AbstractC1444s.e(new m(R.string.nt_wallpaper_see_all, R.drawable.nt_ic_more, 0, 4, null)));
        }
        if (this.f19139r instanceof h) {
            list = AbstractC1444s.g0(AbstractC1444s.e(new m(R.string.nt_create, R.drawable.nt_ic_creative, 0)), list);
        }
        c cVar = this.f19138q;
        if (cVar != null) {
            cVar.submitList(list);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final A g(CategoryItemView categoryItemView, p pVar, x xVar, View view) {
        String strR;
        n.h(view, "view");
        if (xVar instanceof m) {
            view.setTag(categoryItemView.f19139r);
            d.f7114r.j();
        } else if (!(xVar instanceof J6.c) && xVar != null && (strR = xVar.r()) != null) {
            d.f7114r.k(strR);
        }
        pVar.invoke(xVar, view);
        return A.f21846a;
    }

    public final void c(AbstractC1356a category) {
        n.h(category, "category");
        this.f19139r = category;
        TextView textView = this.f19141t;
        if (textView != null) {
            textView.setText(category.h());
        }
        if (category instanceof r) {
            ((r) category).o(getContext(), new p064g3.A() { // from class: T7.a
                @Override // p064g3.A
                public final void a(List list) {
                    CategoryItemView.d(this.f7710a, list);
                }
            }, false);
        }
    }

    public final void f(Set appliedIds, boolean z9, final p listener) {
        ViewGroup.LayoutParams layoutParams;
        n.h(appliedIds, "appliedIds");
        n.h(listener, "listener");
        this.f19140s = z9;
        RecyclerView recyclerView = this.f19142u;
        if (recyclerView != null && (layoutParams = recyclerView.getLayoutParams()) != null) {
            layoutParams.height = getResources().getDimensionPixelOffset(z9 ? R.dimen.nt_wallpaper_color_category_height : R.dimen.nt_wallpaper_category_height);
        }
        Context context = getContext();
        n.g(context, "getContext(...)");
        this.f19138q = new c(context, appliedIds, new p() { // from class: T7.b
            @Override // p219v8.p
            public final Object invoke(Object obj, Object obj2) {
                return CategoryItemView.g(this.f7711q, listener, (x) obj, (View) obj2);
            }
        });
        RecyclerView recyclerView2 = this.f19142u;
        if (recyclerView2 != null) {
            recyclerView2.setLayoutManager(z9 ? new GridLayoutManager(recyclerView2.getContext(), 2, 0, false) : new LinearLayoutManager(recyclerView2.getContext(), 0, false));
            recyclerView2.addItemDecoration(new v(recyclerView2.getContext().getResources().getDimensionPixelOffset(R.dimen.nt_category_item_space) / 2, 0));
            recyclerView2.setAdapter(this.f19138q);
        }
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        this.f19141t = (TextView) findViewById(R.id.category_title);
        this.f19142u = (RecyclerView) findViewById(R.id.category_grid);
    }

    public /* synthetic */ CategoryItemView(Context context, AttributeSet attributeSet, int i10, int i11, int i12, AbstractC1457h abstractC1457h) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i10, (i12 & 8) != 0 ? 0 : i11);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CategoryItemView(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        n.h(context, "context");
    }
}
