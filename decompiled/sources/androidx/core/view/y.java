package androidx.core.view;

import android.view.View;
import android.view.ViewTreeObserver;

/* JADX INFO: loaded from: classes.dex */
public final class y implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final View f12272q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private ViewTreeObserver f12273r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final Runnable f12274s;

    private y(View view, Runnable runnable) {
        this.f12272q = view;
        this.f12273r = view.getViewTreeObserver();
        this.f12274s = runnable;
    }

    public static y a(View view, Runnable runnable) {
        if (view == null) {
            throw new NullPointerException("view == null");
        }
        if (runnable == null) {
            throw new NullPointerException("runnable == null");
        }
        y yVar = new y(view, runnable);
        view.getViewTreeObserver().addOnPreDrawListener(yVar);
        view.addOnAttachStateChangeListener(yVar);
        return yVar;
    }

    public void b() {
        if (this.f12273r.isAlive()) {
            this.f12273r.removeOnPreDrawListener(this);
        } else {
            this.f12272q.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        this.f12272q.removeOnAttachStateChangeListener(this);
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
        b();
        this.f12274s.run();
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
        this.f12273r = view.getViewTreeObserver();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View view) {
        b();
    }
}
