package U0;

import android.view.ViewGroup;
import androidx.fragment.app.AbstractComponentCallbacksC1132q;

/* JADX INFO: loaded from: classes.dex */
public final class n extends m {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final ViewGroup f7804r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(AbstractComponentCallbacksC1132q fragment, ViewGroup container) {
        super(fragment, "Attempting to add fragment " + fragment + " to container " + container + " which is not a FragmentContainerView");
        kotlin.jvm.internal.n.h(fragment, "fragment");
        kotlin.jvm.internal.n.h(container, "container");
        this.f7804r = container;
    }
}
