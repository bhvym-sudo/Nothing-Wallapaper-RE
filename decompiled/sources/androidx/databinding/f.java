package androidx.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes.dex */
public abstract class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static d f12354a = new DataBinderMapperImpl();

    static g a(e eVar, View view, int i10) {
        return f12354a.b(eVar, view, i10);
    }

    static g b(e eVar, View[] viewArr, int i10) {
        return f12354a.c(eVar, viewArr, i10);
    }

    private static g c(e eVar, ViewGroup viewGroup, int i10, int i11) {
        int childCount = viewGroup.getChildCount();
        int i12 = childCount - i10;
        if (i12 == 1) {
            return a(eVar, viewGroup.getChildAt(childCount - 1), i11);
        }
        View[] viewArr = new View[i12];
        for (int i13 = 0; i13 < i12; i13++) {
            viewArr[i13] = viewGroup.getChildAt(i13 + i10);
        }
        return b(eVar, viewArr, i11);
    }

    public static e d() {
        return null;
    }

    public static g e(LayoutInflater layoutInflater, int i10, ViewGroup viewGroup, boolean z9) {
        return f(layoutInflater, i10, viewGroup, z9, null);
    }

    public static g f(LayoutInflater layoutInflater, int i10, ViewGroup viewGroup, boolean z9, e eVar) {
        boolean z10 = viewGroup != null && z9;
        return z10 ? c(eVar, viewGroup, z10 ? viewGroup.getChildCount() : 0, i10) : a(eVar, layoutInflater.inflate(i10, viewGroup, z9), i10);
    }
}
