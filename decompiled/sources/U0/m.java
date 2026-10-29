package U0;

import androidx.fragment.app.AbstractComponentCallbacksC1132q;

/* JADX INFO: loaded from: classes.dex */
public abstract class m extends RuntimeException {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final AbstractComponentCallbacksC1132q f7803q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(AbstractComponentCallbacksC1132q fragment, String str) {
        super(str);
        kotlin.jvm.internal.n.h(fragment, "fragment");
        this.f7803q = fragment;
    }

    public final AbstractComponentCallbacksC1132q a() {
        return this.f7803q;
    }
}
