package androidx.slice.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;

/* JADX INFO: loaded from: classes.dex */
public class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f13990a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f13991b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f13992c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f13993d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f13994e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f13995f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f13996g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f13997h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f13998i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f13999j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f14000k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f14001l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f14002m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f14003n;

    public j(Context context, AttributeSet attributeSet, int i10, int i11) {
        this.f13990a = -1;
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, p122m1.h.f23156K, i10, i11);
        try {
            int color = typedArrayObtainStyledAttributes.getColor(p122m1.h.f23168W, -1);
            if (color == -1) {
                color = this.f13990a;
            }
            this.f13990a = color;
            this.f13991b = typedArrayObtainStyledAttributes.getColor(p122m1.h.f23169X, 0);
            this.f13992c = typedArrayObtainStyledAttributes.getColor(p122m1.h.f23165T, 0);
            this.f13993d = (int) typedArrayObtainStyledAttributes.getDimension(p122m1.h.f23164S, 0.0f);
            this.f13994e = (int) typedArrayObtainStyledAttributes.getDimension(p122m1.h.f23162Q, 0.0f);
            this.f13995f = (int) typedArrayObtainStyledAttributes.getDimension(p122m1.h.f23163R, 0.0f);
            this.f13996g = (int) typedArrayObtainStyledAttributes.getDimension(p122m1.h.f23170Y, 0.0f);
            this.f13997h = (int) typedArrayObtainStyledAttributes.getDimension(p122m1.h.f23166U, 0.0f);
            this.f13998i = (int) typedArrayObtainStyledAttributes.getDimension(p122m1.h.f23167V, 0.0f);
            this.f13999j = (int) typedArrayObtainStyledAttributes.getDimension(p122m1.h.f23160O, 0.0f);
            this.f14000k = (int) typedArrayObtainStyledAttributes.getDimension(p122m1.h.f23158M, 0.0f);
            this.f14001l = (int) typedArrayObtainStyledAttributes.getDimension(p122m1.h.f23159N, context.getResources().getDimensionPixelSize(p122m1.b.f23109j));
            this.f14002m = (int) typedArrayObtainStyledAttributes.getDimension(p122m1.h.f23161P, 0.0f);
            this.f14003n = (int) typedArrayObtainStyledAttributes.getDimension(p122m1.h.f23157L, 0.0f);
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public int a() {
        return this.f14003n;
    }

    public int b() {
        return this.f14000k;
    }

    public int c() {
        return this.f13999j;
    }

    public int d() {
        return this.f14002m;
    }

    public int e() {
        return this.f13994e;
    }

    public int f() {
        return this.f13993d;
    }

    public int g() {
        return this.f13992c;
    }

    public int h() {
        return this.f13997h;
    }

    public int i() {
        return this.f13990a;
    }

    public int j() {
        return this.f13991b;
    }

    public int k() {
        return this.f13996g;
    }

    public int l() {
        return this.f14001l;
    }

    public int m() {
        return this.f13995f;
    }

    public int n() {
        return this.f13998i;
    }

    public void o(int i10) {
        this.f13990a = i10;
    }
}
