package p147o6;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.animation.AnimationUtils;
import com.bumptech.glide.request.transition.Transition;
import kotlin.jvm.internal.n;

/* JADX INFO: loaded from: classes2.dex */
public final class a implements Transition {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f23442a;

    public a(int i10) {
        this.f23442a = i10;
    }

    @Override // com.bumptech.glide.request.transition.Transition
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public boolean transition(Drawable drawable, Transition.ViewAdapter adapter) {
        n.h(adapter, "adapter");
        View view = adapter.getView();
        if (view != null) {
            view.clearAnimation();
            view.startAnimation(AnimationUtils.loadAnimation(view.getContext(), this.f23442a));
        }
        if (drawable == null) {
            return true;
        }
        adapter.setDrawable(drawable);
        return true;
    }
}
