package p165q4;

import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView;

/* JADX INFO: loaded from: classes.dex */
public final class K4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f24263a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f24264b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f24265c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f24266d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private N5 f24267e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f24268f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Boolean f24269g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private Boolean f24270h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private Boolean f24271i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private Integer f24272j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private Integer f24273k;

    public final K4 b(String str) {
        this.f24263a = str;
        return this;
    }

    public final K4 c(String str) {
        this.f24264b = str;
        return this;
    }

    public final K4 d(Integer num) {
        this.f24272j = Integer.valueOf(num.intValue() & SubsamplingScaleImageView.TILE_SIZE_AUTO);
        return this;
    }

    public final K4 e(Boolean bool) {
        this.f24269g = bool;
        return this;
    }

    public final K4 f(Boolean bool) {
        this.f24271i = bool;
        return this;
    }

    public final K4 g(Boolean bool) {
        this.f24270h = bool;
        return this;
    }

    public final K4 h(N5 n9) {
        this.f24267e = n9;
        return this;
    }

    public final K4 i(String str) {
        this.f24268f = str;
        return this;
    }

    public final K4 j(String str) {
        this.f24265c = str;
        return this;
    }

    public final K4 k(Integer num) {
        this.f24273k = num;
        return this;
    }

    public final K4 l(String str) {
        this.f24266d = str;
        return this;
    }

    public final N4 m() {
        return new N4(this, null);
    }
}
