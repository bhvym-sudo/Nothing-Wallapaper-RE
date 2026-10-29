package p175r4;

import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView;

/* JADX INFO: loaded from: classes.dex */
public final class X0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private C1721a1 f26324a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Integer f26325b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Q5 f26326c;

    public final X0 a(Integer num) {
        this.f26325b = Integer.valueOf(num.intValue() & SubsamplingScaleImageView.TILE_SIZE_AUTO);
        return this;
    }

    public final X0 b(Q5 q9) {
        this.f26326c = q9;
        return this;
    }

    public final X0 c(C1721a1 c1721a1) {
        this.f26324a = c1721a1;
        return this;
    }

    public final C1743c1 e() {
        return new C1743c1(this, null);
    }
}
