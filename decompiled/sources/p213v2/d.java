package p213v2;

import android.view.View;
import p243y2.a;

/* JADX INFO: loaded from: classes.dex */
public class d implements Runnable {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final View f28145q;

    private d(View view) {
        this.f28145q = view;
    }

    public static d d(View view) {
        if (a.b(view.getContext())) {
            return new d(view);
        }
        return null;
    }

    public void a(CharSequence charSequence) {
        this.f28145q.setContentDescription(charSequence);
        this.f28145q.removeCallbacks(this);
        this.f28145q.postDelayed(this, 200L);
    }

    public void b() {
        this.f28145q.removeCallbacks(this);
    }

    public void c(int i10) {
        b();
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f28145q.sendAccessibilityEvent(4);
    }
}
