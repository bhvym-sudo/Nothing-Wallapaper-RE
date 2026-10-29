package androidx.fragment.app;

import android.animation.LayoutTransition;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC1457h;

/* JADX INFO: loaded from: classes.dex */
public final class FragmentContainerView extends FrameLayout {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final List f12865q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final List f12866r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private View.OnApplyWindowInsetsListener f12867s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private boolean f12868t;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f12869a = new a();

        private a() {
        }

        public final WindowInsets a(View.OnApplyWindowInsetsListener onApplyWindowInsetsListener, View v9, WindowInsets insets) {
            kotlin.jvm.internal.n.h(onApplyWindowInsetsListener, "onApplyWindowInsetsListener");
            kotlin.jvm.internal.n.h(v9, "v");
            kotlin.jvm.internal.n.h(insets, "insets");
            WindowInsets windowInsetsOnApplyWindowInsets = onApplyWindowInsetsListener.onApplyWindowInsets(v9, insets);
            kotlin.jvm.internal.n.g(windowInsetsOnApplyWindowInsets, "onApplyWindowInsetsListe…lyWindowInsets(v, insets)");
            return windowInsetsOnApplyWindowInsets;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FragmentContainerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        kotlin.jvm.internal.n.h(context, "context");
    }

    private final void a(View view) {
        if (this.f12866r.contains(view)) {
            this.f12865q.add(view);
        }
    }

    @Override // android.view.ViewGroup
    public void addView(View child, int i10, ViewGroup.LayoutParams layoutParams) {
        kotlin.jvm.internal.n.h(child, "child");
        if (J.F0(child) != null) {
            super.addView(child, i10, layoutParams);
            return;
        }
        throw new IllegalStateException(("Views added to a FragmentContainerView must be associated with a Fragment. View " + child + " is not associated with a Fragment.").toString());
    }

    @Override // android.view.ViewGroup, android.view.View
    public WindowInsets dispatchApplyWindowInsets(WindowInsets insets) {
        androidx.core.view.V vT;
        kotlin.jvm.internal.n.h(insets, "insets");
        androidx.core.view.V vU = androidx.core.view.V.u(insets);
        kotlin.jvm.internal.n.g(vU, "toWindowInsetsCompat(insets)");
        View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = this.f12867s;
        if (onApplyWindowInsetsListener != null) {
            a aVar = a.f12869a;
            kotlin.jvm.internal.n.e(onApplyWindowInsetsListener);
            vT = androidx.core.view.V.u(aVar.a(onApplyWindowInsetsListener, this, insets));
        } else {
            vT = androidx.core.view.H.T(this, vU);
        }
        kotlin.jvm.internal.n.g(vT, "if (applyWindowInsetsLis…, insetsCompat)\n        }");
        if (!vT.o()) {
            int childCount = getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                androidx.core.view.H.f(getChildAt(i10), vT);
            }
        }
        return insets;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchDraw(Canvas canvas) {
        kotlin.jvm.internal.n.h(canvas, "canvas");
        if (this.f12868t) {
            Iterator it = this.f12865q.iterator();
            while (it.hasNext()) {
                super.drawChild(canvas, (View) it.next(), getDrawingTime());
            }
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.view.ViewGroup
    protected boolean drawChild(Canvas canvas, View child, long j9) {
        kotlin.jvm.internal.n.h(canvas, "canvas");
        kotlin.jvm.internal.n.h(child, "child");
        if (this.f12868t && !this.f12865q.isEmpty() && this.f12865q.contains(child)) {
            return false;
        }
        return super.drawChild(canvas, child, j9);
    }

    @Override // android.view.ViewGroup
    public void endViewTransition(View view) {
        kotlin.jvm.internal.n.h(view, "view");
        this.f12866r.remove(view);
        if (this.f12865q.remove(view)) {
            this.f12868t = true;
        }
        super.endViewTransition(view);
    }

    public final <F extends AbstractComponentCallbacksC1132q> F getFragment() {
        return (F) J.m0(this).j0(getId());
    }

    @Override // android.view.View
    public WindowInsets onApplyWindowInsets(WindowInsets insets) {
        kotlin.jvm.internal.n.h(insets, "insets");
        return insets;
    }

    @Override // android.view.ViewGroup
    public void removeAllViewsInLayout() {
        int childCount = getChildCount();
        while (true) {
            childCount--;
            if (-1 >= childCount) {
                super.removeAllViewsInLayout();
                return;
            } else {
                View view = getChildAt(childCount);
                kotlin.jvm.internal.n.g(view, "view");
                a(view);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void removeView(View view) {
        kotlin.jvm.internal.n.h(view, "view");
        a(view);
        super.removeView(view);
    }

    @Override // android.view.ViewGroup
    public void removeViewAt(int i10) {
        View view = getChildAt(i10);
        kotlin.jvm.internal.n.g(view, "view");
        a(view);
        super.removeViewAt(i10);
    }

    @Override // android.view.ViewGroup
    public void removeViewInLayout(View view) {
        kotlin.jvm.internal.n.h(view, "view");
        a(view);
        super.removeViewInLayout(view);
    }

    @Override // android.view.ViewGroup
    public void removeViews(int i10, int i11) {
        int i12 = i10 + i11;
        for (int i13 = i10; i13 < i12; i13++) {
            View view = getChildAt(i13);
            kotlin.jvm.internal.n.g(view, "view");
            a(view);
        }
        super.removeViews(i10, i11);
    }

    @Override // android.view.ViewGroup
    public void removeViewsInLayout(int i10, int i11) {
        int i12 = i10 + i11;
        for (int i13 = i10; i13 < i12; i13++) {
            View view = getChildAt(i13);
            kotlin.jvm.internal.n.g(view, "view");
            a(view);
        }
        super.removeViewsInLayout(i10, i11);
    }

    public final void setDrawDisappearingViewsLast(boolean z9) {
        this.f12868t = z9;
    }

    @Override // android.view.ViewGroup
    public void setLayoutTransition(LayoutTransition layoutTransition) {
        throw new UnsupportedOperationException("FragmentContainerView does not support Layout Transitions or animateLayoutChanges=\"true\".");
    }

    @Override // android.view.View
    public void setOnApplyWindowInsetsListener(View.OnApplyWindowInsetsListener listener) {
        kotlin.jvm.internal.n.h(listener, "listener");
        this.f12867s = listener;
    }

    @Override // android.view.ViewGroup
    public void startViewTransition(View view) {
        kotlin.jvm.internal.n.h(view, "view");
        if (view.getParent() == this) {
            this.f12866r.add(view);
        }
        super.startViewTransition(view);
    }

    public /* synthetic */ FragmentContainerView(Context context, AttributeSet attributeSet, int i10, int i11, AbstractC1457h abstractC1457h) {
        this(context, attributeSet, (i11 & 4) != 0 ? 0 : i10);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FragmentContainerView(Context context, AttributeSet attributeSet, int i10) {
        String str;
        super(context, attributeSet, i10);
        kotlin.jvm.internal.n.h(context, "context");
        this.f12865q = new ArrayList();
        this.f12866r = new ArrayList();
        this.f12868t = true;
        if (attributeSet != null) {
            String classAttribute = attributeSet.getClassAttribute();
            int[] FragmentContainerView = T0.c.f7408e;
            kotlin.jvm.internal.n.g(FragmentContainerView, "FragmentContainerView");
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, FragmentContainerView, 0, 0);
            if (classAttribute == null) {
                classAttribute = typedArrayObtainStyledAttributes.getString(T0.c.f7409f);
                str = "android:name";
            } else {
                str = "class";
            }
            typedArrayObtainStyledAttributes.recycle();
            if (classAttribute == null || isInEditMode()) {
                return;
            }
            throw new UnsupportedOperationException("FragmentContainerView must be within a FragmentActivity to use " + str + "=\"" + classAttribute + '\"');
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FragmentContainerView(Context context, AttributeSet attrs, J fm) {
        String str;
        super(context, attrs);
        kotlin.jvm.internal.n.h(context, "context");
        kotlin.jvm.internal.n.h(attrs, "attrs");
        kotlin.jvm.internal.n.h(fm, "fm");
        this.f12865q = new ArrayList();
        this.f12866r = new ArrayList();
        this.f12868t = true;
        String classAttribute = attrs.getClassAttribute();
        int[] FragmentContainerView = T0.c.f7408e;
        kotlin.jvm.internal.n.g(FragmentContainerView, "FragmentContainerView");
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attrs, FragmentContainerView, 0, 0);
        classAttribute = classAttribute == null ? typedArrayObtainStyledAttributes.getString(T0.c.f7409f) : classAttribute;
        String string = typedArrayObtainStyledAttributes.getString(T0.c.f7410g);
        typedArrayObtainStyledAttributes.recycle();
        int id = getId();
        AbstractComponentCallbacksC1132q abstractComponentCallbacksC1132qJ0 = fm.j0(id);
        if (classAttribute != null && abstractComponentCallbacksC1132qJ0 == null) {
            if (id == -1) {
                if (string != null) {
                    str = " with tag " + string;
                } else {
                    str = "";
                }
                throw new IllegalStateException("FragmentContainerView must have an android:id to add Fragment " + classAttribute + str);
            }
            AbstractComponentCallbacksC1132q abstractComponentCallbacksC1132qA = fm.w0().a(context.getClassLoader(), classAttribute);
            kotlin.jvm.internal.n.g(abstractComponentCallbacksC1132qA, "fm.fragmentFactory.insta…ontext.classLoader, name)");
            abstractComponentCallbacksC1132qA.mFragmentId = id;
            abstractComponentCallbacksC1132qA.mContainerId = id;
            abstractComponentCallbacksC1132qA.mTag = string;
            abstractComponentCallbacksC1132qA.mFragmentManager = fm;
            abstractComponentCallbacksC1132qA.mHost = fm.y0();
            abstractComponentCallbacksC1132qA.onInflate(context, attrs, (Bundle) null);
            fm.p().w(true).d(this, abstractComponentCallbacksC1132qA, string).l();
        }
        fm.Y0(this);
    }
}
