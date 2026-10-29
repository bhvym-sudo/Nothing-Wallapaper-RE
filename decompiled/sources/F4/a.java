package F4;

import K4.b;
import android.content.Context;
import android.graphics.Color;

/* JADX INFO: loaded from: classes.dex */
public class a {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final int f1629f = (int) Math.round(5.1000000000000005d);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f1630a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f1631b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f1632c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f1633d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final float f1634e;

    public a(Context context) {
        this(b.b(context, p225w4.a.f28717t, false), D4.a.b(context, p225w4.a.f28716s, 0), D4.a.b(context, p225w4.a.f28715r, 0), D4.a.b(context, p225w4.a.f28712o, 0), context.getResources().getDisplayMetrics().density);
    }

    private boolean f(int i10) {
        return p191t0.a.x(i10, 255) == this.f1633d;
    }

    public float a(float f10) {
        float f11 = this.f1634e;
        if (f11 <= 0.0f || f10 <= 0.0f) {
            return 0.0f;
        }
        return Math.min(((((float) Math.log1p(f10 / f11)) * 4.5f) + 2.0f) / 100.0f, 1.0f);
    }

    public int b(int i10, float f10) {
        int i11;
        float fA = a(f10);
        int iAlpha = Color.alpha(i10);
        int iJ = D4.a.j(p191t0.a.x(i10, 255), this.f1631b, fA);
        if (fA > 0.0f && (i11 = this.f1632c) != 0) {
            iJ = D4.a.i(iJ, p191t0.a.x(i11, f1629f));
        }
        return p191t0.a.x(iJ, iAlpha);
    }

    public int c(int i10, float f10) {
        return (this.f1630a && f(i10)) ? b(i10, f10) : i10;
    }

    public int d(float f10) {
        return c(this.f1633d, f10);
    }

    public boolean e() {
        return this.f1630a;
    }

    public a(boolean z9, int i10, int i11, int i12, float f10) {
        this.f1630a = z9;
        this.f1631b = i10;
        this.f1632c = i11;
        this.f1633d = i12;
        this.f1634e = f10;
    }
}
