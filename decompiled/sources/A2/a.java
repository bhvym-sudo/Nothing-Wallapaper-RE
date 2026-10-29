package A2;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import com.android.launcher3.o;
import com.android.launcher3.views.f;

/* JADX INFO: loaded from: classes.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Rect f156a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected final View f157b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f158c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f159d;

    public a(View view) {
        this(view, view.getContext());
    }

    public View a() {
        return this.f157b;
    }

    public float b(View view, int[] iArr) {
        float fJ = ((f) f.y(this.f157b.getContext())).J().j(this.f157b, iArr);
        iArr[0] = Math.round(iArr[0] - ((view.getWidth() - ((this.f157b.getWidth() * fJ) * this.f157b.getScaleX())) / 2.0f));
        iArr[1] = Math.round((iArr[1] - (((1.0f - fJ) * view.getHeight()) / 2.0f)) - (this.f158c / 2));
        return fJ;
    }

    public a(View view, Context context) {
        this.f156a = new Rect();
        this.f157b = view;
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(o.f15635b);
        this.f159d = dimensionPixelSize;
        this.f158c = dimensionPixelSize;
    }
}
