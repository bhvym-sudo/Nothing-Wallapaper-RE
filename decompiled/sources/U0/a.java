package U0;

import androidx.fragment.app.AbstractComponentCallbacksC1132q;

/* JADX INFO: loaded from: classes.dex */
public final class a extends m {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final String f7780r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(AbstractComponentCallbacksC1132q fragment, String previousFragmentId) {
        super(fragment, "Attempting to reuse fragment " + fragment + " with previous ID " + previousFragmentId);
        kotlin.jvm.internal.n.h(fragment, "fragment");
        kotlin.jvm.internal.n.h(previousFragmentId, "previousFragmentId");
        this.f7780r = previousFragmentId;
    }
}
