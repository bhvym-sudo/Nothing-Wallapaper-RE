package p175r4;

import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView;

/* JADX INFO: renamed from: r4.l8, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1848l8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Integer f26803a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Integer f26804b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Integer f26805c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Integer f26806d;

    public final C1848l8 a(Integer num) {
        this.f26804b = Integer.valueOf(num.intValue() & SubsamplingScaleImageView.TILE_SIZE_AUTO);
        return this;
    }

    public final C1848l8 b(Integer num) {
        this.f26805c = Integer.valueOf(num.intValue() & SubsamplingScaleImageView.TILE_SIZE_AUTO);
        return this;
    }

    public final C1848l8 c(Integer num) {
        this.f26806d = Integer.valueOf(num.intValue() & SubsamplingScaleImageView.TILE_SIZE_AUTO);
        return this;
    }

    public final C1848l8 d(Integer num) {
        this.f26803a = Integer.valueOf(num.intValue() & SubsamplingScaleImageView.TILE_SIZE_AUTO);
        return this;
    }

    public final C1868n8 e() {
        return new C1868n8(this, null);
    }
}
