package androidx.transition;

import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public abstract class L extends v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String[] f14073a = {"android:visibilityPropagation:visibility", "android:visibilityPropagation:center"};

    private static int d(z zVar, int i10) {
        int[] iArr;
        if (zVar == null || (iArr = (int[]) zVar.f14230a.get("android:visibilityPropagation:center")) == null) {
            return -1;
        }
        return iArr[i10];
    }

    @Override // androidx.transition.v
    public void a(z zVar) {
        View view = zVar.f14231b;
        Integer numValueOf = (Integer) zVar.f14230a.get("android:visibility:visibility");
        if (numValueOf == null) {
            numValueOf = Integer.valueOf(view.getVisibility());
        }
        zVar.f14230a.put("android:visibilityPropagation:visibility", numValueOf);
        int[] iArr = {iRound, 0};
        view.getLocationOnScreen(iArr);
        int iRound = iArr[0] + Math.round(view.getTranslationX());
        iArr[0] = iRound + (view.getWidth() / 2);
        int iRound2 = iArr[1] + Math.round(view.getTranslationY());
        iArr[1] = iRound2;
        iArr[1] = iRound2 + (view.getHeight() / 2);
        zVar.f14230a.put("android:visibilityPropagation:center", iArr);
    }

    @Override // androidx.transition.v
    public String[] b() {
        return f14073a;
    }

    public int e(z zVar) {
        Integer num;
        if (zVar == null || (num = (Integer) zVar.f14230a.get("android:visibilityPropagation:visibility")) == null) {
            return 8;
        }
        return num.intValue();
    }

    public int f(z zVar) {
        return d(zVar, 0);
    }

    public int g(z zVar) {
        return d(zVar, 1);
    }
}
