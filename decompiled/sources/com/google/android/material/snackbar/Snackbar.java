package com.google.android.material.snackbar;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.constraintlayout.core.widgets.analyzer.BasicMeasure;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import p225w4.g;

/* JADX INFO: loaded from: classes.dex */
public class Snackbar extends BaseTransientBottomBar {

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private static final int[] f17235I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    private static final int[] f17236J;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private final AccessibilityManager f17237G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private boolean f17238H;

    public static final class SnackbarLayout extends BaseTransientBottomBar.r {
        public SnackbarLayout(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        @Override // com.google.android.material.snackbar.BaseTransientBottomBar.r, android.widget.FrameLayout, android.view.View
        protected void onMeasure(int i10, int i11) {
            super.onMeasure(i10, i11);
            int childCount = getChildCount();
            int measuredWidth = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
            for (int i12 = 0; i12 < childCount; i12++) {
                View childAt = getChildAt(i12);
                if (childAt.getLayoutParams().width == -1) {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth, BasicMeasure.EXACTLY), View.MeasureSpec.makeMeasureSpec(childAt.getMeasuredHeight(), BasicMeasure.EXACTLY));
                }
            }
        }

        @Override // com.google.android.material.snackbar.BaseTransientBottomBar.r, android.view.View
        public /* bridge */ /* synthetic */ void setBackground(Drawable drawable) {
            super.setBackground(drawable);
        }

        @Override // com.google.android.material.snackbar.BaseTransientBottomBar.r, android.view.View
        public /* bridge */ /* synthetic */ void setBackgroundDrawable(Drawable drawable) {
            super.setBackgroundDrawable(drawable);
        }

        @Override // com.google.android.material.snackbar.BaseTransientBottomBar.r, android.view.View
        public /* bridge */ /* synthetic */ void setBackgroundTintList(ColorStateList colorStateList) {
            super.setBackgroundTintList(colorStateList);
        }

        @Override // com.google.android.material.snackbar.BaseTransientBottomBar.r, android.view.View
        public /* bridge */ /* synthetic */ void setBackgroundTintMode(PorterDuff.Mode mode) {
            super.setBackgroundTintMode(mode);
        }

        @Override // com.google.android.material.snackbar.BaseTransientBottomBar.r, android.view.View
        public /* bridge */ /* synthetic */ void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
            super.setLayoutParams(layoutParams);
        }

        @Override // com.google.android.material.snackbar.BaseTransientBottomBar.r, android.view.View
        public /* bridge */ /* synthetic */ void setOnClickListener(View.OnClickListener onClickListener) {
            super.setOnClickListener(onClickListener);
        }
    }

    static {
        int i10 = p225w4.a.f28682Q;
        f17235I = new int[]{i10};
        f17236J = new int[]{i10, p225w4.a.f28684S};
    }

    private Snackbar(Context context, ViewGroup viewGroup, View view, a aVar) {
        super(context, viewGroup, view, aVar);
        this.f17237G = (AccessibilityManager) viewGroup.getContext().getSystemService("accessibility");
    }

    public static /* synthetic */ void e0(Snackbar snackbar, View.OnClickListener onClickListener, View view) {
        snackbar.getClass();
        onClickListener.onClick(view);
        snackbar.y(1);
    }

    private static ViewGroup f0(View view) {
        ViewGroup viewGroup = null;
        while (!(view instanceof CoordinatorLayout)) {
            if (view instanceof FrameLayout) {
                if (view.getId() == 16908290) {
                    return (ViewGroup) view;
                }
                viewGroup = (ViewGroup) view;
            }
            if (view != null) {
                Object parent = view.getParent();
                view = parent instanceof View ? (View) parent : null;
            }
            if (view == null) {
                return viewGroup;
            }
        }
        return (ViewGroup) view;
    }

    private Button g0() {
        return h0().getActionView();
    }

    private SnackbarContentLayout h0() {
        return (SnackbarContentLayout) this.f17184i.getChildAt(0);
    }

    private TextView i0() {
        return h0().getMessageView();
    }

    private static boolean j0(Context context) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(f17236J);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, -1);
        int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(1, -1);
        typedArrayObtainStyledAttributes.recycle();
        return (resourceId == -1 || resourceId2 == -1) ? false : true;
    }

    public static Snackbar k0(View view, int i10, int i11) {
        return l0(view, view.getResources().getText(i10), i11);
    }

    public static Snackbar l0(View view, CharSequence charSequence, int i10) {
        return m0(null, view, charSequence, i10);
    }

    private static Snackbar m0(Context context, View view, CharSequence charSequence, int i10) {
        ViewGroup viewGroupF0 = f0(view);
        if (viewGroupF0 == null) {
            throw new IllegalArgumentException("No suitable parent found from the given view. Please provide a valid view.");
        }
        if (context == null) {
            context = viewGroupF0.getContext();
        }
        SnackbarContentLayout snackbarContentLayout = (SnackbarContentLayout) LayoutInflater.from(context).inflate(j0(context) ? g.f28872w : g.f28852c, viewGroupF0, false);
        Snackbar snackbar = new Snackbar(context, viewGroupF0, snackbarContentLayout, snackbarContentLayout);
        snackbar.p0(charSequence);
        snackbar.S(i10);
        return snackbar;
    }

    @Override // com.google.android.material.snackbar.BaseTransientBottomBar
    public int B() {
        int iB = super.B();
        if (iB == -2) {
            return -2;
        }
        return this.f17237G.getRecommendedTimeoutMillis(iB, (this.f17238H ? 4 : 0) | 3);
    }

    @Override // com.google.android.material.snackbar.BaseTransientBottomBar
    public void W() {
        super.W();
    }

    public Snackbar n0(CharSequence charSequence, final View.OnClickListener onClickListener) {
        Button buttonG0 = g0();
        if (TextUtils.isEmpty(charSequence) || onClickListener == null) {
            buttonG0.setVisibility(8);
            buttonG0.setOnClickListener(null);
            this.f17238H = false;
            return this;
        }
        this.f17238H = true;
        buttonG0.setVisibility(0);
        buttonG0.setText(charSequence);
        buttonG0.setOnClickListener(new View.OnClickListener() { // from class: com.google.android.material.snackbar.b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Snackbar.e0(this.f17243q, onClickListener, view);
            }
        });
        return this;
    }

    public Snackbar o0(int i10) {
        g0().setTextColor(i10);
        return this;
    }

    public Snackbar p0(CharSequence charSequence) {
        i0().setText(charSequence);
        return this;
    }

    @Override // com.google.android.material.snackbar.BaseTransientBottomBar
    public void x() {
        super.x();
    }
}
