package androidx.viewpager.widget;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;

/* JADX INFO: loaded from: classes.dex */
public class PagerTabStrip extends PagerTitleStrip {

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private int f14345F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private int f14346G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private int f14347H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private int f14348I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    private int f14349J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    private int f14350K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    private final Paint f14351L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    private final Rect f14352M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    private int f14353N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private boolean f14354O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    private boolean f14355P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    private int f14356Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    private boolean f14357R;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    private float f14358S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    private float f14359T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    private int f14360U;

    @Override // androidx.viewpager.widget.PagerTitleStrip
    void c(int i10, float f10, boolean z9) {
        Rect rect = this.f14352M;
        int height = getHeight();
        int left = this.f14368s.getLeft() - this.f14350K;
        int right = this.f14368s.getRight() + this.f14350K;
        int i11 = height - this.f14346G;
        rect.set(left, i11, right, height);
        super.c(i10, f10, z9);
        this.f14353N = (int) (Math.abs(f10 - 0.5f) * 2.0f * 255.0f);
        rect.union(this.f14368s.getLeft() - this.f14350K, i11, this.f14368s.getRight() + this.f14350K, height);
        invalidate(rect);
    }

    public boolean getDrawFullUnderline() {
        return this.f14354O;
    }

    @Override // androidx.viewpager.widget.PagerTitleStrip
    int getMinHeight() {
        return Math.max(super.getMinHeight(), this.f14349J);
    }

    public int getTabIndicatorColor() {
        return this.f14345F;
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int height = getHeight();
        int left = this.f14368s.getLeft() - this.f14350K;
        int right = this.f14368s.getRight() + this.f14350K;
        int i10 = height - this.f14346G;
        this.f14351L.setColor((this.f14353N << 24) | (this.f14345F & 16777215));
        float f10 = height;
        canvas.drawRect(left, i10, right, f10, this.f14351L);
        if (this.f14354O) {
            this.f14351L.setColor((this.f14345F & 16777215) | (-16777216));
            canvas.drawRect(getPaddingLeft(), height - this.f14356Q, getWidth() - getPaddingRight(), f10, this.f14351L);
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action != 0 && this.f14357R) {
            return false;
        }
        float x9 = motionEvent.getX();
        float y9 = motionEvent.getY();
        if (action == 0) {
            this.f14358S = x9;
            this.f14359T = y9;
            this.f14357R = false;
        } else if (action != 1) {
            if (action == 2 && (Math.abs(x9 - this.f14358S) > this.f14360U || Math.abs(y9 - this.f14359T) > this.f14360U)) {
                this.f14357R = true;
            }
        } else if (x9 < this.f14368s.getLeft() - this.f14350K) {
            ViewPager viewPager = this.f14366q;
            viewPager.setCurrentItem(viewPager.getCurrentItem() - 1);
        } else if (x9 > this.f14368s.getRight() + this.f14350K) {
            ViewPager viewPager2 = this.f14366q;
            viewPager2.setCurrentItem(viewPager2.getCurrentItem() + 1);
        }
        return true;
    }

    @Override // android.view.View
    public void setBackgroundColor(int i10) {
        super.setBackgroundColor(i10);
        if (this.f14355P) {
            return;
        }
        this.f14354O = (i10 & (-16777216)) == 0;
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        if (this.f14355P) {
            return;
        }
        this.f14354O = drawable == null;
    }

    @Override // android.view.View
    public void setBackgroundResource(int i10) {
        super.setBackgroundResource(i10);
        if (this.f14355P) {
            return;
        }
        this.f14354O = i10 == 0;
    }

    public void setDrawFullUnderline(boolean z9) {
        this.f14354O = z9;
        this.f14355P = true;
        invalidate();
    }

    @Override // android.view.View
    public void setPadding(int i10, int i11, int i12, int i13) {
        int i14 = this.f14347H;
        if (i13 < i14) {
            i13 = i14;
        }
        super.setPadding(i10, i11, i12, i13);
    }

    public void setTabIndicatorColor(int i10) {
        this.f14345F = i10;
        this.f14351L.setColor(i10);
        invalidate();
    }

    public void setTabIndicatorColorResource(int i10) {
        setTabIndicatorColor(p171r0.a.b(getContext(), i10));
    }

    @Override // androidx.viewpager.widget.PagerTitleStrip
    public void setTextSpacing(int i10) {
        int i11 = this.f14348I;
        if (i10 < i11) {
            i10 = i11;
        }
        super.setTextSpacing(i10);
    }
}
