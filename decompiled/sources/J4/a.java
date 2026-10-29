package J4;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatRadioButton;
import androidx.core.widget.c;
import com.google.android.material.internal.k;
import p225w4.j;

/* JADX INFO: loaded from: classes.dex */
public class a extends AppCompatRadioButton {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static final int f3531w = j.f28923t;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private static final int[][] f3532x = {new int[]{R.attr.state_enabled, R.attr.state_checked}, new int[]{R.attr.state_enabled, -16842912}, new int[]{-16842910, R.attr.state_checked}, new int[]{-16842910, -16842912}};

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private ColorStateList f3533u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private boolean f3534v;

    public a(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, p225w4.a.f28681P);
    }

    private ColorStateList getMaterialThemeColorsTintList() {
        if (this.f3533u == null) {
            int iD = D4.a.d(this, p225w4.a.f28706i);
            int iD2 = D4.a.d(this, p225w4.a.f28709l);
            int iD3 = D4.a.d(this, p225w4.a.f28712o);
            int[][] iArr = f3532x;
            int[] iArr2 = new int[iArr.length];
            iArr2[0] = D4.a.j(iD3, iD, 1.0f);
            iArr2[1] = D4.a.j(iD3, iD2, 0.54f);
            iArr2[2] = D4.a.j(iD3, iD2, 0.38f);
            iArr2[3] = D4.a.j(iD3, iD2, 0.38f);
            this.f3533u = new ColorStateList(iArr, iArr2);
        }
        return this.f3533u;
    }

    @Override // android.widget.TextView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f3534v && c.b(this) == null) {
            setUseMaterialThemeColors(true);
        }
    }

    public void setUseMaterialThemeColors(boolean z9) {
        this.f3534v = z9;
        if (z9) {
            c.d(this, getMaterialThemeColorsTintList());
        } else {
            c.d(this, null);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public a(Context context, AttributeSet attributeSet, int i10) {
        int i11 = f3531w;
        super(Q4.a.c(context, attributeSet, i10, i11), attributeSet, i10);
        Context context2 = getContext();
        TypedArray typedArrayI = k.i(context2, attributeSet, p225w4.k.f29396w4, i10, i11, new int[0]);
        int i12 = p225w4.k.f29406x4;
        if (typedArrayI.hasValue(i12)) {
            c.d(this, K4.c.a(context2, typedArrayI, i12));
        }
        this.f3534v = typedArrayI.getBoolean(p225w4.k.f29416y4, false);
        typedArrayI.recycle();
    }
}
