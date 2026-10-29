package L0;

import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView;

/* JADX INFO: loaded from: classes.dex */
public final class r extends D {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Throwable f4516b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(Throwable finalException) {
        super(SubsamplingScaleImageView.TILE_SIZE_AUTO, null);
        kotlin.jvm.internal.n.h(finalException, "finalException");
        this.f4516b = finalException;
    }

    public final Throwable b() {
        return this.f4516b;
    }
}
