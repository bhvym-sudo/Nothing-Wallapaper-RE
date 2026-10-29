package androidx.compose.ui.platform;

import I.AbstractC0859c;
import I.InterfaceC0869m;
import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes.dex */
public class DrawChildContainer extends ViewGroup {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private boolean f11709q;

    public DrawChildContainer(Context context) {
        super(context);
        setClipChildren(false);
        setTag(C.g.f471I, Boolean.TRUE);
    }

    public final void a(InterfaceC0869m interfaceC0869m, View view, long j9) {
        super.drawChild(AbstractC0859c.c(interfaceC0869m), view, j9);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchDraw(Canvas canvas) {
        int childCount = super.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            kotlin.jvm.internal.n.f(childAt, "null cannot be cast to non-null type androidx.compose.ui.platform.ViewLayer");
            if (((ViewLayer) childAt).t()) {
                this.f11709q = true;
                try {
                    super.dispatchDraw(canvas);
                    return;
                } finally {
                    this.f11709q = false;
                }
            }
        }
    }

    @Override // android.view.ViewGroup
    public int getChildCount() {
        if (this.f11709q) {
            return super.getChildCount();
        }
        return 0;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z9, int i10, int i11, int i12, int i13) {
    }

    @Override // android.view.View
    protected void onMeasure(int i10, int i11) {
        setMeasuredDimension(0, 0);
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
    }
}
