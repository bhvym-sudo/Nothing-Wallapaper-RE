package p233x2;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes.dex */
public class b extends ViewGroup.MarginLayoutParams {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f29757a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f29758b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f29759c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f29760d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f29761e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f29762f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f29763g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f29764h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f29765i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f29766j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f29767k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f29768l;

    public b(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f29764h = true;
        this.f29765i = true;
        this.f29762f = 1;
        this.f29763g = 1;
    }

    public int a() {
        return this.f29757a;
    }

    public int b() {
        return this.f29758b;
    }

    public int c() {
        return this.f29759c;
    }

    public int d() {
        return this.f29760d;
    }

    public void e(int i10) {
        this.f29757a = i10;
    }

    public void f(int i10) {
        this.f29758b = i10;
    }

    public void g(int i10) {
        this.f29759c = i10;
    }

    public void h(int i10) {
        this.f29760d = i10;
    }

    public void i(int i10, int i11, boolean z9, int i12, int i13, float f10, float f11, Point point, Rect rect) {
        if (this.f29764h) {
            int i14 = this.f29762f;
            int i15 = this.f29763g;
            int iC = this.f29761e ? c() : a();
            int iD = this.f29761e ? d() : b();
            if (z9) {
                iC = (i12 - iC) - this.f29762f;
            }
            int i16 = (i14 - 1) * point.x;
            int i17 = (i15 - 1) * point.y;
            ((ViewGroup.MarginLayoutParams) this).width = (Math.round(((i14 * i10) + i16) / f10) - ((ViewGroup.MarginLayoutParams) this).leftMargin) - ((ViewGroup.MarginLayoutParams) this).rightMargin;
            int iRound = Math.round(((i15 * i11) + i17) / f11);
            int i18 = ((ViewGroup.MarginLayoutParams) this).topMargin;
            int i19 = (iRound - i18) - ((ViewGroup.MarginLayoutParams) this).bottomMargin;
            ((ViewGroup.MarginLayoutParams) this).height = i19;
            int i20 = ((ViewGroup.MarginLayoutParams) this).leftMargin + (i10 * iC) + (iC * point.x);
            this.f29766j = i20;
            int i21 = i18 + (i11 * iD) + (iD * point.y);
            this.f29767k = i21;
            if (rect != null) {
                int i22 = rect.left;
                this.f29766j = i20 + i22;
                int i23 = rect.top;
                this.f29767k = i21 + i23;
                ((ViewGroup.MarginLayoutParams) this).width -= i22 + rect.right;
                ((ViewGroup.MarginLayoutParams) this).height = i19 - (i23 + rect.bottom);
            }
        }
    }

    public void j(int i10, int i11, boolean z9, int i12, int i13, Point point) {
        i(i10, i11, z9, i12, i13, 1.0f, 1.0f, point, null);
    }

    public String toString() {
        return "(" + a() + ", " + b() + ")";
    }

    public b(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.f29764h = true;
        this.f29765i = true;
        this.f29762f = 1;
        this.f29763g = 1;
    }

    public b(int i10, int i11, int i12, int i13) {
        super(-1, -1);
        this.f29764h = true;
        this.f29765i = true;
        this.f29757a = i10;
        this.f29758b = i11;
        this.f29762f = i12;
        this.f29763g = i13;
    }
}
