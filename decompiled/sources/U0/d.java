package U0;

import android.view.ViewGroup;
import androidx.fragment.app.AbstractComponentCallbacksC1132q;

/* JADX INFO: loaded from: classes.dex */
public final class d extends m {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final ViewGroup f7799r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(AbstractComponentCallbacksC1132q fragment, ViewGroup viewGroup) {
        super(fragment, "Attempting to use <fragment> tag to add fragment " + fragment + " to container " + viewGroup);
        kotlin.jvm.internal.n.h(fragment, "fragment");
        this.f7799r = viewGroup;
    }
}
