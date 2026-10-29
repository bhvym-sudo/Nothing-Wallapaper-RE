package p078h7;

import H3.s;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.android.wallpaper.picker.customization.ui.section.ResponsiveLayoutSectionView;
import com.nothing.wallpaper.R;
import kotlin.jvm.internal.n;
import p064g3.f;

/* JADX INFO: loaded from: classes2.dex */
public abstract class c implements f {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final f f21818q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final f f21819r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final f f21820s;

    public c(f firstSectionController, f secondSectionController, f thirdSectionController) {
        n.h(firstSectionController, "firstSectionController");
        n.h(secondSectionController, "secondSectionController");
        n.h(thirdSectionController, "thirdSectionController");
        this.f21818q = firstSectionController;
        this.f21819r = secondSectionController;
        this.f21820s = thirdSectionController;
    }

    private final void b(Context context, ResponsiveLayoutSectionView responsiveLayoutSectionView, f fVar) {
        View viewC;
        if (!fVar.e(context) || (viewC = fVar.c(responsiveLayoutSectionView, context)) == null) {
            return;
        }
        responsiveLayoutSectionView.addView(viewC, new LinearLayout.LayoutParams(0, -1, 1.0f));
    }

    private final void i(Context context, ResponsiveLayoutSectionView responsiveLayoutSectionView) {
        b(context, responsiveLayoutSectionView, this.f21818q);
        b(context, responsiveLayoutSectionView, this.f21819r);
        b(context, responsiveLayoutSectionView, this.f21820s);
    }

    private final void j(Context context, ResponsiveLayoutSectionView responsiveLayoutSectionView) {
        ViewGroup.LayoutParams layoutParams = responsiveLayoutSectionView.getLayoutParams();
        n.f(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        layoutParams.width = s.a().e(context.getDisplay()).x;
    }

    @Override // p064g3.f
    public boolean e(Context context) {
        n.h(context, "context");
        return this.f21818q.e(context) || this.f21819r.e(context) || this.f21820s.e(context);
    }

    @Override // p064g3.f
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public ResponsiveLayoutSectionView c(View view, Context context) {
        n.h(view, "view");
        n.h(context, "context");
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        LayoutInflater.from(context).inflate(R.layout.nt_linked_section, viewGroup, true);
        View childAt = viewGroup.getChildAt(childCount);
        n.f(childAt, "null cannot be cast to non-null type com.android.wallpaper.picker.customization.ui.section.ResponsiveLayoutSectionView");
        ResponsiveLayoutSectionView responsiveLayoutSectionView = (ResponsiveLayoutSectionView) childAt;
        j(context, responsiveLayoutSectionView);
        i(context, responsiveLayoutSectionView);
        return responsiveLayoutSectionView;
    }
}
