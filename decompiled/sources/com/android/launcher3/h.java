package com.android.launcher3;

import android.content.Context;
import android.graphics.Rect;

/* JADX INFO: loaded from: classes.dex */
public interface h {

    public static class a {

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public p213v2.d f15604l;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f15593a = -1;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f15594b = -1;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f15595c = -1;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f15596d = -1;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public boolean f15597e = false;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public p253z2.h f15598f = null;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public C2.b f15599g = null;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public C2.b f15600h = null;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public g f15601i = null;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public boolean f15602j = false;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public boolean f15603k = true;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public p253z2.j f15605m = null;

        public a(Context context) {
        }

        public final float[] a(float[] fArr) {
            if (fArr == null) {
                fArr = new float[2];
            }
            Rect dragRegion = this.f15598f.getDragRegion();
            int i10 = (this.f15593a - this.f15595c) - dragRegion.left;
            int i11 = (this.f15594b - this.f15596d) - dragRegion.top;
            fArr[0] = i10 + (dragRegion.width() / 2);
            fArr[1] = i11 + (dragRegion.height() / 2);
            return fArr;
        }
    }

    void c(Rect rect);

    default void g(a aVar) {
    }

    boolean i();

    void l(a aVar);

    void s(a aVar);

    boolean u(a aVar);

    void w(a aVar);

    void z(a aVar, p253z2.e eVar);
}
