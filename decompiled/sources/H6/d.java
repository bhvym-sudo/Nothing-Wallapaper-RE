package H6;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.core.view.K;
import androidx.core.view.y;
import com.nothing.wallpaper.R;
import java.util.Iterator;
import kotlin.jvm.internal.n;

/* JADX INFO: loaded from: classes2.dex */
public abstract class d {

    public static final class a implements Runnable {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        final /* synthetic */ View f2548q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ View f2549r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        final /* synthetic */ View f2550s;

        public a(View view, View view2, View view3) {
            this.f2548q = view;
            this.f2549r = view2;
            this.f2550s = view3;
        }

        @Override // java.lang.Runnable
        public final void run() {
            int dimensionPixelOffset = this.f2549r.getResources().getDimensionPixelOffset(R.dimen.nt_category_item_space);
            int width = this.f2550s.getWidth();
            int height = this.f2550s.getHeight();
            this.f2549r.setScaleX((width + dimensionPixelOffset) / width);
            this.f2549r.setScaleY((dimensionPixelOffset + height) / height);
        }
    }

    public static final PointF b(View view, View parent) {
        n.h(view, "<this>");
        n.h(parent, "parent");
        int width = view.getWidth();
        int height = view.getHeight();
        PointF pointF = (width == 0 || height == 0) ? new PointF(1.0f, 1.0f) : new PointF(parent.getWidth() / width, parent.getHeight() / height);
        view.setScaleX(pointF.x);
        view.setScaleY(pointF.y);
        return pointF;
    }

    public static final boolean c(View view) {
        n.h(view, "<this>");
        if (view.isLayoutDirectionResolved()) {
            return view.getLayoutDirection() == 1;
        }
        Context context = view.getContext();
        n.g(context, "getContext(...)");
        return TextUtils.getLayoutDirectionFromLocale(H6.a.a(context)) == 1;
    }

    public static final void d(View view, View parent) {
        n.h(view, "<this>");
        n.h(parent, "parent");
        y.a(view, new a(view, view, parent));
    }

    public static final void e(View view, boolean z9) {
        n.h(view, "<this>");
        view.setEnabled(z9);
        if (view instanceof ViewGroup) {
            Iterator it = K.b((ViewGroup) view).iterator();
            while (it.hasNext()) {
                e((View) it.next(), z9);
            }
        }
    }

    public static final void f(View view) {
        n.h(view, "<this>");
        ViewParent parent = view.getParent();
        ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        if (viewGroup == null) {
            return;
        }
        Resources.Theme theme = view.getContext().getTheme();
        TypedValue typedValue = new TypedValue();
        theme.resolveAttribute(android.R.attr.selectableItemBackground, typedValue, true);
        TypedArray typedArrayObtainStyledAttributes = theme.obtainStyledAttributes(typedValue.resourceId, new int[]{android.R.attr.selectableItemBackground});
        n.g(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(0);
        final RippleDrawable rippleDrawable = drawable instanceof RippleDrawable ? (RippleDrawable) drawable : null;
        typedArrayObtainStyledAttributes.recycle();
        if (rippleDrawable == null) {
            return;
        }
        viewGroup.setBackground(rippleDrawable);
        view.setOnTouchListener(new View.OnTouchListener() { // from class: H6.c
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view2, MotionEvent motionEvent) {
                return d.g(rippleDrawable, view2, motionEvent);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean g(RippleDrawable rippleDrawable, View view, MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            n.e(view);
            n.e(motionEvent);
            h(view, rippleDrawable, motionEvent, true);
        } else if (action == 1 || action == 3) {
            n.e(view);
            n.e(motionEvent);
            h(view, rippleDrawable, motionEvent, false);
        }
        return false;
    }

    private static final void h(View view, RippleDrawable rippleDrawable, MotionEvent motionEvent, boolean z9) {
        int[] iArr;
        float left = view.getLeft() + motionEvent.getX();
        float right = view.getRight() + motionEvent.getY();
        if (z9) {
            rippleDrawable.setHotspot(left, right);
            iArr = new int[]{android.R.attr.state_pressed, android.R.attr.state_enabled};
        } else {
            iArr = new int[0];
        }
        rippleDrawable.setState(iArr);
    }
}
