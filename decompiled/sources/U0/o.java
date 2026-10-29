package U0;

import androidx.fragment.app.AbstractComponentCallbacksC1132q;

/* JADX INFO: loaded from: classes.dex */
public final class o extends m {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final AbstractComponentCallbacksC1132q f7805r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final int f7806s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(AbstractComponentCallbacksC1132q fragment, AbstractComponentCallbacksC1132q expectedParentFragment, int i10) {
        super(fragment, "Attempting to nest fragment " + fragment + " within the view of parent fragment " + expectedParentFragment + " via container with ID " + i10 + " without using parent's childFragmentManager");
        kotlin.jvm.internal.n.h(fragment, "fragment");
        kotlin.jvm.internal.n.h(expectedParentFragment, "expectedParentFragment");
        this.f7805r = expectedParentFragment;
        this.f7806s = i10;
    }
}
