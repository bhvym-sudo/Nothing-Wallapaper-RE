package com.google.android.material.appbar;

import android.view.View;
import androidx.core.view.H;

/* JADX INFO: loaded from: classes.dex */
class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final View f16466a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f16467b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f16468c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f16469d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f16470e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f16471f = true;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f16472g = true;

    public f(View view) {
        this.f16466a = view;
    }

    void a() {
        View view = this.f16466a;
        H.S(view, this.f16469d - (view.getTop() - this.f16467b));
        View view2 = this.f16466a;
        H.R(view2, this.f16470e - (view2.getLeft() - this.f16468c));
    }

    public int b() {
        return this.f16467b;
    }

    public int c() {
        return this.f16469d;
    }

    void d() {
        this.f16467b = this.f16466a.getTop();
        this.f16468c = this.f16466a.getLeft();
    }

    public boolean e(int i10) {
        if (!this.f16472g || this.f16470e == i10) {
            return false;
        }
        this.f16470e = i10;
        a();
        return true;
    }

    public boolean f(int i10) {
        if (!this.f16471f || this.f16469d == i10) {
            return false;
        }
        this.f16469d = i10;
        a();
        return true;
    }
}
