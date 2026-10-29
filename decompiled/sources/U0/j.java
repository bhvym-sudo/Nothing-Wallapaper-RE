package U0;

import androidx.fragment.app.AbstractComponentCallbacksC1132q;

/* JADX INFO: loaded from: classes.dex */
public final class j extends l {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final AbstractComponentCallbacksC1132q f7800r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final int f7801s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(AbstractComponentCallbacksC1132q fragment, AbstractComponentCallbacksC1132q targetFragment, int i10) {
        super(fragment, "Attempting to set target fragment " + targetFragment + " with request code " + i10 + " for fragment " + fragment);
        kotlin.jvm.internal.n.h(fragment, "fragment");
        kotlin.jvm.internal.n.h(targetFragment, "targetFragment");
        this.f7800r = targetFragment;
        this.f7801s = i10;
    }
}
