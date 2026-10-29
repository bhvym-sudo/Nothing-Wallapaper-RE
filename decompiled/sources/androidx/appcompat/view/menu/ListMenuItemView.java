package androidx.appcompat.view.menu;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;
import androidx.appcompat.widget.J;

/* JADX INFO: loaded from: classes.dex */
public class ListMenuItemView extends LinearLayout implements k.a, AbsListView.SelectionBoundsAdjuster {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private int f10386A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private Context f10387B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private boolean f10388C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private Drawable f10389D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private boolean f10390E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private LayoutInflater f10391F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private boolean f10392G;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private g f10393q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private ImageView f10394r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private RadioButton f10395s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private TextView f10396t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private CheckBox f10397u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private TextView f10398v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private ImageView f10399w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private ImageView f10400x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private LinearLayout f10401y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private Drawable f10402z;

    public ListMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, p050f.a.f20324D);
    }

    private void a(View view) {
        b(view, -1);
    }

    private void b(View view, int i10) {
        LinearLayout linearLayout = this.f10401y;
        if (linearLayout != null) {
            linearLayout.addView(view, i10);
        } else {
            addView(view, i10);
        }
    }

    private void c() {
        CheckBox checkBox = (CheckBox) getInflater().inflate(p050f.g.f20463h, (ViewGroup) this, false);
        this.f10397u = checkBox;
        a(checkBox);
    }

    private void f() {
        ImageView imageView = (ImageView) getInflater().inflate(p050f.g.f20464i, (ViewGroup) this, false);
        this.f10394r = imageView;
        b(imageView, 0);
    }

    private void g() {
        RadioButton radioButton = (RadioButton) getInflater().inflate(p050f.g.f20466k, (ViewGroup) this, false);
        this.f10395s = radioButton;
        a(radioButton);
    }

    private LayoutInflater getInflater() {
        if (this.f10391F == null) {
            this.f10391F = LayoutInflater.from(getContext());
        }
        return this.f10391F;
    }

    private void setSubMenuArrowVisible(boolean z9) {
        ImageView imageView = this.f10399w;
        if (imageView != null) {
            imageView.setVisibility(z9 ? 0 : 8);
        }
    }

    @Override // android.widget.AbsListView.SelectionBoundsAdjuster
    public void adjustListItemSelectionBounds(Rect rect) {
        ImageView imageView = this.f10400x;
        if (imageView == null || imageView.getVisibility() != 0) {
            return;
        }
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f10400x.getLayoutParams();
        rect.top += this.f10400x.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
    }

    @Override // androidx.appcompat.view.menu.k.a
    public boolean d() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.k.a
    public void e(g gVar, int i10) {
        this.f10393q = gVar;
        setVisibility(gVar.isVisible() ? 0 : 8);
        setTitle(gVar.i(this));
        setCheckable(gVar.isCheckable());
        h(gVar.z(), gVar.g());
        setIcon(gVar.getIcon());
        setEnabled(gVar.isEnabled());
        setSubMenuArrowVisible(gVar.hasSubMenu());
        setContentDescription(gVar.getContentDescription());
    }

    @Override // androidx.appcompat.view.menu.k.a
    public g getItemData() {
        return this.f10393q;
    }

    public void h(boolean z9, char c10) {
        int i10 = (z9 && this.f10393q.z()) ? 0 : 8;
        if (i10 == 0) {
            this.f10398v.setText(this.f10393q.h());
        }
        if (this.f10398v.getVisibility() != i10) {
            this.f10398v.setVisibility(i10);
        }
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        setBackground(this.f10402z);
        TextView textView = (TextView) findViewById(p050f.f.f20426C);
        this.f10396t = textView;
        int i10 = this.f10386A;
        if (i10 != -1) {
            textView.setTextAppearance(this.f10387B, i10);
        }
        this.f10398v = (TextView) findViewById(p050f.f.f20452w);
        ImageView imageView = (ImageView) findViewById(p050f.f.f20455z);
        this.f10399w = imageView;
        if (imageView != null) {
            imageView.setImageDrawable(this.f10389D);
        }
        this.f10400x = (ImageView) findViewById(p050f.f.f20447r);
        this.f10401y = (LinearLayout) findViewById(p050f.f.f20441l);
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int i10, int i11) {
        if (this.f10394r != null && this.f10388C) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.f10394r.getLayoutParams();
            int i12 = layoutParams.height;
            if (i12 > 0 && layoutParams2.width <= 0) {
                layoutParams2.width = i12;
            }
        }
        super.onMeasure(i10, i11);
    }

    public void setCheckable(boolean z9) {
        CompoundButton compoundButton;
        View view;
        if (!z9 && this.f10395s == null && this.f10397u == null) {
            return;
        }
        if (this.f10393q.m()) {
            if (this.f10395s == null) {
                g();
            }
            compoundButton = this.f10395s;
            view = this.f10397u;
        } else {
            if (this.f10397u == null) {
                c();
            }
            compoundButton = this.f10397u;
            view = this.f10395s;
        }
        if (z9) {
            compoundButton.setChecked(this.f10393q.isChecked());
            if (compoundButton.getVisibility() != 0) {
                compoundButton.setVisibility(0);
            }
            if (view == null || view.getVisibility() == 8) {
                return;
            }
            view.setVisibility(8);
            return;
        }
        CheckBox checkBox = this.f10397u;
        if (checkBox != null) {
            checkBox.setVisibility(8);
        }
        RadioButton radioButton = this.f10395s;
        if (radioButton != null) {
            radioButton.setVisibility(8);
        }
    }

    public void setChecked(boolean z9) {
        CompoundButton compoundButton;
        if (this.f10393q.m()) {
            if (this.f10395s == null) {
                g();
            }
            compoundButton = this.f10395s;
        } else {
            if (this.f10397u == null) {
                c();
            }
            compoundButton = this.f10397u;
        }
        compoundButton.setChecked(z9);
    }

    public void setForceShowIcon(boolean z9) {
        this.f10392G = z9;
        this.f10388C = z9;
    }

    public void setGroupDividerEnabled(boolean z9) {
        ImageView imageView = this.f10400x;
        if (imageView != null) {
            imageView.setVisibility((this.f10390E || !z9) ? 8 : 0);
        }
    }

    public void setIcon(Drawable drawable) {
        boolean z9 = this.f10393q.y() || this.f10392G;
        if (z9 || this.f10388C) {
            ImageView imageView = this.f10394r;
            if (imageView == null && drawable == null && !this.f10388C) {
                return;
            }
            if (imageView == null) {
                f();
            }
            if (drawable == null && !this.f10388C) {
                this.f10394r.setVisibility(8);
                return;
            }
            ImageView imageView2 = this.f10394r;
            if (!z9) {
                drawable = null;
            }
            imageView2.setImageDrawable(drawable);
            if (this.f10394r.getVisibility() != 0) {
                this.f10394r.setVisibility(0);
            }
        }
    }

    public void setTitle(CharSequence charSequence) {
        if (charSequence == null) {
            if (this.f10396t.getVisibility() != 8) {
                this.f10396t.setVisibility(8);
            }
        } else {
            this.f10396t.setText(charSequence);
            if (this.f10396t.getVisibility() != 0) {
                this.f10396t.setVisibility(0);
            }
        }
    }

    public ListMenuItemView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet);
        J jV = J.v(getContext(), attributeSet, p050f.j.f20569T1, i10, 0);
        this.f10402z = jV.g(p050f.j.f20577V1);
        this.f10386A = jV.n(p050f.j.f20573U1, -1);
        this.f10388C = jV.a(p050f.j.f20581W1, false);
        this.f10387B = context;
        this.f10389D = jV.g(p050f.j.f20585X1);
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(null, new int[]{R.attr.divider}, p050f.a.f20321A, 0);
        this.f10390E = typedArrayObtainStyledAttributes.hasValue(0);
        jV.x();
        typedArrayObtainStyledAttributes.recycle();
    }
}
