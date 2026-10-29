package androidx.core.view;

import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: renamed from: androidx.core.view.v, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1089v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f12270a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f12271b;

    public C1089v(ViewGroup viewGroup) {
    }

    public int a() {
        return this.f12271b | this.f12270a;
    }

    public void b(View view, View view2, int i10) {
        c(view, view2, i10, 0);
    }

    public void c(View view, View view2, int i10, int i11) {
        if (i11 == 1) {
            this.f12271b = i10;
        } else {
            this.f12270a = i10;
        }
    }

    public void d(View view, int i10) {
        if (i10 == 1) {
            this.f12271b = 0;
        } else {
            this.f12270a = 0;
        }
    }
}
