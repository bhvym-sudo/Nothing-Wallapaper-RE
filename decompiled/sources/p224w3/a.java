package p224w3;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.android.wallpaper.picker.customization.ui.section.ResponsiveLayoutSectionView;
import com.nothing.wallpaper.R;
import java.util.Locale;
import kotlin.jvm.internal.n;
import p064g3.f;
import p084i3.s0;

/* JADX INFO: loaded from: classes.dex */
public final class a implements f {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final f f28632q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final f f28633r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final boolean f28634s;

    public a(f firstSectionController, f secondSectionController, boolean z9) {
        n.h(firstSectionController, "firstSectionController");
        n.h(secondSectionController, "secondSectionController");
        this.f28632q = firstSectionController;
        this.f28633r = secondSectionController;
        this.f28634s = z9;
    }

    private final void b(LinearLayout linearLayout, f fVar, boolean z9, boolean z10) {
        Context context = linearLayout.getContext();
        n.g(context, "getContext(...)");
        s0 s0VarH = fVar.h(context, new f.b(false, z9, 1, null));
        if (z9) {
            s0VarH.setLayoutParams(new LinearLayout.LayoutParams(0, -2, 1.0f));
            int layoutDirectionFromLocale = TextUtils.getLayoutDirectionFromLocale(Locale.getDefault());
            int i10 = R.drawable.rightmost_connected_section_background;
            if (layoutDirectionFromLocale != 0 ? !z10 : z10) {
                i10 = R.drawable.leftmost_connected_section_background;
            }
            s0VarH.setBackgroundResource(i10);
        }
        linearLayout.addView(s0VarH);
    }

    @Override // p064g3.f
    public boolean e(Context context) {
        n.h(context, "context");
        return this.f28632q.e(context) || this.f28633r.e(context);
    }

    @Override // p064g3.f
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public ResponsiveLayoutSectionView f(Context context) {
        n.h(context, "context");
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.responsive_section, (ViewGroup) null);
        n.f(viewInflate, "null cannot be cast to non-null type com.android.wallpaper.picker.customization.ui.section.ResponsiveLayoutSectionView");
        ResponsiveLayoutSectionView responsiveLayoutSectionView = (ResponsiveLayoutSectionView) viewInflate;
        boolean z9 = responsiveLayoutSectionView.getOrientation() == 0;
        boolean z10 = this.f28634s && z9;
        b(responsiveLayoutSectionView, z10 ? this.f28633r : this.f28632q, z9, true);
        b(responsiveLayoutSectionView, z10 ? this.f28632q : this.f28633r, z9, false);
        return responsiveLayoutSectionView;
    }
}
