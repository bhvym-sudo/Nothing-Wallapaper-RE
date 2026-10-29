package T7;

import android.content.Context;
import android.graphics.Insets;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.V;
import com.nothing.wallpaper.R;
import java.util.List;
import kotlin.jvm.internal.n;

/* JADX INFO: loaded from: classes2.dex */
public final class h extends ConstraintLayout {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private TextView f7719q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private TextView f7720r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private TextView f7721s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private TextView f7722t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private ImageView f7723u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private View f7724v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private View f7725w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(Context context) {
        super(context);
        n.h(context, "context");
        LayoutInflater.from(getContext()).inflate(R.layout.nt_layout_wallpaper_info, (ViewGroup) this, true);
        this.f7719q = (TextView) findViewById(R.id.tv_wallpaper_info_title);
        this.f7720r = (TextView) findViewById(R.id.tv_wallpaper_info_subtitle1);
        this.f7721s = (TextView) findViewById(R.id.tv_wallpaper_info_subtitle2);
        this.f7722t = (TextView) findViewById(R.id.tv_learn_more);
        this.f7723u = (ImageView) findViewById(R.id.btn_icon);
        this.f7724v = findViewById(R.id.layout_btn);
        this.f7725w = findViewById(R.id.drag_icon);
        if (p024c3.a.a()) {
            setOnApplyWindowInsetsListener(new View.OnApplyWindowInsetsListener() { // from class: T7.f
                @Override // android.view.View.OnApplyWindowInsetsListener
                public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                    return h.d(this.f7717a, view, windowInsets);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final WindowInsets d(h hVar, View view, WindowInsets windowInsets) {
        n.h(view, "<unused var>");
        n.h(windowInsets, "windowInsets");
        Insets insets = windowInsets.getInsets(V.k.d());
        n.g(insets, "getInsets(...)");
        View viewFindViewById = hVar.findViewById(R.id.layout_wallpaper_info);
        if (viewFindViewById != null) {
            viewFindViewById.setPadding(viewFindViewById.getPaddingLeft(), viewFindViewById.getPaddingTop(), viewFindViewById.getPaddingRight(), insets.bottom);
        }
        return windowInsets;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(View.OnClickListener onClickListener, View view) {
        onClickListener.onClick(view);
    }

    public final void e(List attributions, CharSequence charSequence, boolean z9, boolean z10, Drawable drawable, View.OnClickListener onClickListener) {
        TextView textView;
        ImageView imageView;
        CharSequence charSequence2;
        CharSequence charSequence3;
        TextView textView2;
        n.h(attributions, "attributions");
        View view = this.f7724v;
        if (view != null) {
            view.setVisibility(8);
        }
        TextView textView3 = this.f7720r;
        if (textView3 != null) {
            textView3.setVisibility(8);
        }
        TextView textView4 = this.f7721s;
        if (textView4 != null) {
            textView4.setVisibility(8);
        }
        if (attributions.size() > 0 && (textView2 = this.f7719q) != null) {
            textView2.setText((CharSequence) attributions.get(0));
        }
        if (z9) {
            if (attributions.size() > 1 && (charSequence3 = (CharSequence) attributions.get(1)) != null && charSequence3.length() != 0) {
                TextView textView5 = this.f7720r;
                if (textView5 != null) {
                    textView5.setVisibility(0);
                }
                TextView textView6 = this.f7720r;
                if (textView6 != null) {
                    textView6.setText((CharSequence) attributions.get(1));
                }
            }
            if (attributions.size() > 2 && (charSequence2 = (CharSequence) attributions.get(2)) != null && charSequence2.length() != 0) {
                TextView textView7 = this.f7721s;
                if (textView7 != null) {
                    textView7.setVisibility(0);
                }
                TextView textView8 = this.f7721s;
                if (textView8 != null) {
                    textView8.setText((CharSequence) attributions.get(2));
                }
                TextView textView9 = this.f7720r;
                ViewGroup.LayoutParams layoutParams = textView9 != null ? textView9.getLayoutParams() : null;
                n.f(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin = 0;
            }
            if (z10) {
                View view2 = this.f7724v;
                if (view2 != null) {
                    view2.setVisibility(0);
                }
                if (drawable != null && (imageView = this.f7723u) != null) {
                    imageView.setImageDrawable(drawable);
                }
                if (charSequence != null && (textView = this.f7722t) != null) {
                    textView.setText(charSequence);
                }
                View view3 = this.f7724v;
                if (view3 != null) {
                    view3.setOnClickListener(onClickListener);
                }
            }
        }
    }

    public final void setDragIconClickListener(final View.OnClickListener onClickListener) {
        n.h(onClickListener, "onClickListener");
        View view = this.f7725w;
        if (view != null) {
            view.setOnClickListener(new View.OnClickListener() { // from class: T7.g
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    h.f(onClickListener, view2);
                }
            });
        }
    }
}
