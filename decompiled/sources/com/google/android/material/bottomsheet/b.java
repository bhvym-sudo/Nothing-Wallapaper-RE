package com.google.android.material.bottomsheet;

import android.view.View;
import androidx.core.view.U;
import androidx.core.view.V;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
class b extends U.b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final View f16616b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f16617c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f16618d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int[] f16619e;

    public b(View view) {
        super(0);
        this.f16619e = new int[2];
        this.f16616b = view;
    }

    @Override // androidx.core.view.U.b
    public void b(U u9) {
        this.f16616b.setTranslationY(0.0f);
    }

    @Override // androidx.core.view.U.b
    public void c(U u9) {
        this.f16616b.getLocationOnScreen(this.f16619e);
        this.f16617c = this.f16619e[1];
    }

    @Override // androidx.core.view.U.b
    public V d(V v9, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            U u9 = (U) it.next();
            if ((u9.b() & V.k.a()) != 0) {
                this.f16616b.setTranslationY(p235x4.a.c(this.f16618d, 0, u9.a()));
                break;
            }
        }
        return v9;
    }

    @Override // androidx.core.view.U.b
    public U.a e(U u9, U.a aVar) {
        this.f16616b.getLocationOnScreen(this.f16619e);
        int i10 = this.f16617c - this.f16619e[1];
        this.f16618d = i10;
        this.f16616b.setTranslationY(i10);
        return aVar;
    }
}
