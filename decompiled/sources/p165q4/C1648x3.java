package p165q4;

import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView;

/* JADX INFO: renamed from: q4.x3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1648x3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Long f24960a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private EnumC1655y3 f24961b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private EnumC1613s3 f24962c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Integer f24963d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Integer f24964e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Integer f24965f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Integer f24966g;

    public final C1648x3 b(Long l9) {
        this.f24960a = Long.valueOf(l9.longValue() & Long.MAX_VALUE);
        return this;
    }

    public final C1648x3 c(Integer num) {
        this.f24963d = Integer.valueOf(num.intValue() & SubsamplingScaleImageView.TILE_SIZE_AUTO);
        return this;
    }

    public final C1648x3 d(EnumC1613s3 enumC1613s3) {
        this.f24962c = enumC1613s3;
        return this;
    }

    public final C1648x3 e(Integer num) {
        this.f24965f = Integer.valueOf(num.intValue() & SubsamplingScaleImageView.TILE_SIZE_AUTO);
        return this;
    }

    public final C1648x3 f(EnumC1655y3 enumC1655y3) {
        this.f24961b = enumC1655y3;
        return this;
    }

    public final C1648x3 g(Integer num) {
        this.f24964e = Integer.valueOf(num.intValue() & SubsamplingScaleImageView.TILE_SIZE_AUTO);
        return this;
    }

    public final C1648x3 h(Integer num) {
        this.f24966g = Integer.valueOf(num.intValue() & SubsamplingScaleImageView.TILE_SIZE_AUTO);
        return this;
    }

    public final A3 j() {
        return new A3(this, null);
    }
}
