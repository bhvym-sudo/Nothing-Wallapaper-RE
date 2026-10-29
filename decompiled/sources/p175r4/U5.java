package p175r4;

import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView;

/* JADX INFO: loaded from: classes.dex */
public final class U5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private V5 f26270a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Integer f26271b;

    public final U5 a(V5 v9) {
        this.f26270a = v9;
        return this;
    }

    public final U5 b(Integer num) {
        this.f26271b = Integer.valueOf(num.intValue() & SubsamplingScaleImageView.TILE_SIZE_AUTO);
        return this;
    }

    public final X5 d() {
        return new X5(this, null);
    }
}
