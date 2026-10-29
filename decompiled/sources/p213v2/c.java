package p213v2;

import C0.d;
import I0.a;
import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import com.android.launcher3.CellLayout;
import com.android.launcher3.t;
import com.android.launcher3.views.f;
import com.android.launcher3.views.g;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class c extends a implements View.OnClickListener, View.OnHoverListener {

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    protected final Rect f28140D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    protected final int[] f28141E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    protected final CellLayout f28142F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    protected final Context f28143G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    protected final g f28144H;

    public c(CellLayout cellLayout) {
        super(cellLayout);
        this.f28140D = new Rect();
        this.f28141E = new int[2];
        this.f28142F = cellLayout;
        Context context = cellLayout.getContext();
        this.f28143G = context;
        f fVar = (f) f.y(context);
        fVar.S();
        this.f28144H = fVar.J();
    }

    private Rect N(int i10) {
        int countX = i10 % this.f28142F.getCountX();
        int countX2 = i10 / this.f28142F.getCountX();
        throw null;
    }

    @Override // I0.a
    protected void B(int i10, AccessibilityEvent accessibilityEvent) {
        if (i10 == Integer.MIN_VALUE) {
            throw new IllegalArgumentException("Invalid virtual view id");
        }
        accessibilityEvent.setContentDescription(this.f28143G.getString(t.f15697a));
    }

    @Override // I0.a
    public void D(int i10, d dVar) {
        if (i10 == Integer.MIN_VALUE) {
            throw new IllegalArgumentException("Invalid virtual view id");
        }
        dVar.k0(O(i10));
        Rect rectN = N(i10);
        dVar.c0(rectN);
        int[] iArr = this.f28141E;
        iArr[1] = 0;
        iArr[0] = 0;
        float fH = this.f28144H.h(this.f28142F, iArr);
        Rect rect = this.f28140D;
        int[] iArr2 = this.f28141E;
        int i11 = iArr2[0];
        rect.left = ((int) (rectN.left * fH)) + i11;
        rect.right = i11 + ((int) (rectN.right * fH));
        int i12 = iArr2[1];
        rect.top = ((int) (rectN.top * fH)) + i12;
        rect.bottom = i12 + ((int) (rectN.bottom * fH));
        dVar.d0(rect);
        dVar.a(16);
        dVar.h0(true);
        dVar.q0(true);
    }

    protected abstract String M(int i10);

    protected abstract String O(int i10);

    protected abstract int P(int i10);

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        z(p(), 16, null);
    }

    @Override // android.view.View.OnHoverListener
    public boolean onHover(View view, MotionEvent motionEvent) {
        return k(motionEvent);
    }

    @Override // I0.a
    public int r(float f10, float f11) {
        if (f10 < 0.0f || f11 < 0.0f || f10 > this.f28142F.getMeasuredWidth() || f11 > this.f28142F.getMeasuredHeight()) {
            return Integer.MIN_VALUE;
        }
        this.f28142F.M((int) f10, (int) f11, this.f28141E);
        int[] iArr = this.f28141E;
        return P(iArr[0] + (iArr[1] * this.f28142F.getCountX()));
    }

    @Override // I0.a
    public void s(List list) {
        int countX = this.f28142F.getCountX() * this.f28142F.getCountY();
        for (int i10 = 0; i10 < countX; i10++) {
            if (P(i10) == i10) {
                list.add(Integer.valueOf(i10));
            }
        }
    }

    @Override // I0.a
    public boolean z(int i10, int i11, Bundle bundle) {
        if (i11 != 16 || i10 == Integer.MIN_VALUE) {
            return false;
        }
        M(i10);
        N(i10);
        throw null;
    }
}
