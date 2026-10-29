package androidx.transition;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: renamed from: androidx.transition.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1176k extends L {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private float f14134b = 3.0f;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f14135c = 80;

    /* JADX WARN: Code duplicated, block: B:6:0x0010  */
    /* JADX WARN: Code duplicated, block: B:7:0x0012  */
    private int h(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        int i18 = this.f14135c;
        if (i18 == 8388611) {
            if (view.getLayoutDirection() == 1) {
                i18 = 5;
            } else {
                i18 = 3;
            }
        } else if (i18 == 8388613) {
            if (view.getLayoutDirection() == 1) {
                i18 = 3;
            } else {
                i18 = 5;
            }
        }
        if (i18 == 3) {
            return (i16 - i10) + Math.abs(i13 - i11);
        }
        if (i18 == 5) {
            return (i10 - i14) + Math.abs(i13 - i11);
        }
        if (i18 == 48) {
            return (i17 - i11) + Math.abs(i12 - i10);
        }
        if (i18 != 80) {
            return 0;
        }
        return (i11 - i15) + Math.abs(i12 - i10);
    }

    private int i(ViewGroup viewGroup) {
        int i10 = this.f14135c;
        return (i10 == 3 || i10 == 5 || i10 == 8388611 || i10 == 8388613) ? viewGroup.getWidth() : viewGroup.getHeight();
    }

    @Override // androidx.transition.v
    public long c(ViewGroup viewGroup, m mVar, z zVar, z zVar2) {
        int i10;
        int i11;
        int iCenterY;
        int i12;
        z zVar3 = zVar;
        if (zVar3 == null && zVar2 == null) {
            return 0L;
        }
        Rect rectA = mVar.A();
        if (zVar2 == null || e(zVar3) == 0) {
            i10 = -1;
        } else {
            zVar3 = zVar2;
            i10 = 1;
        }
        int iF = f(zVar3);
        int iG = g(zVar3);
        int[] iArr = new int[2];
        viewGroup.getLocationOnScreen(iArr);
        int iRound = iArr[0] + Math.round(viewGroup.getTranslationX());
        int iRound2 = iArr[1] + Math.round(viewGroup.getTranslationY());
        int width = viewGroup.getWidth() + iRound;
        int height = viewGroup.getHeight() + iRound2;
        if (rectA != null) {
            int iCenterX = rectA.centerX();
            i12 = iRound2;
            iCenterY = rectA.centerY();
            i11 = iCenterX;
        } else {
            i11 = (iRound + width) / 2;
            iCenterY = (iRound2 + height) / 2;
            i12 = iRound2;
        }
        float fH = h(viewGroup, iF, iG, i11, iCenterY, iRound, i12, width, height) / i(viewGroup);
        long jY = mVar.y();
        if (jY < 0) {
            jY = 300;
        }
        return Math.round(((jY * ((long) i10)) / this.f14134b) * fH);
    }

    public void j(int i10) {
        this.f14135c = i10;
    }
}
