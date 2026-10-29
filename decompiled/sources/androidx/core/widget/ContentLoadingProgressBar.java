package androidx.core.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ProgressBar;

/* JADX INFO: loaded from: classes.dex */
public class ContentLoadingProgressBar extends ProgressBar {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    long f12276q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    boolean f12277r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    boolean f12278s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    boolean f12279t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final Runnable f12280u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final Runnable f12281v;

    public ContentLoadingProgressBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f12276q = -1L;
        this.f12277r = false;
        this.f12278s = false;
        this.f12279t = false;
        this.f12280u = new Runnable() { // from class: androidx.core.widget.d
            @Override // java.lang.Runnable
            public final void run() {
                ContentLoadingProgressBar.d(this.f12346q);
            }
        };
        this.f12281v = new Runnable() { // from class: androidx.core.widget.e
            @Override // java.lang.Runnable
            public final void run() {
                ContentLoadingProgressBar.c(this.f12347q);
            }
        };
    }

    public static /* synthetic */ void c(ContentLoadingProgressBar contentLoadingProgressBar) {
        contentLoadingProgressBar.f12278s = false;
        if (contentLoadingProgressBar.f12279t) {
            return;
        }
        contentLoadingProgressBar.f12276q = System.currentTimeMillis();
        contentLoadingProgressBar.setVisibility(0);
    }

    public static /* synthetic */ void d(ContentLoadingProgressBar contentLoadingProgressBar) {
        contentLoadingProgressBar.f12277r = false;
        contentLoadingProgressBar.f12276q = -1L;
        contentLoadingProgressBar.setVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f() {
        this.f12279t = true;
        removeCallbacks(this.f12281v);
        this.f12278s = false;
        long jCurrentTimeMillis = System.currentTimeMillis();
        long j9 = this.f12276q;
        long j10 = jCurrentTimeMillis - j9;
        if (j10 >= 500 || j9 == -1) {
            setVisibility(8);
        } else {
            if (this.f12277r) {
                return;
            }
            postDelayed(this.f12280u, 500 - j10);
            this.f12277r = true;
        }
    }

    private void g() {
        removeCallbacks(this.f12280u);
        removeCallbacks(this.f12281v);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i() {
        this.f12276q = -1L;
        this.f12279t = false;
        removeCallbacks(this.f12280u);
        this.f12277r = false;
        if (this.f12278s) {
            return;
        }
        postDelayed(this.f12281v, 500L);
        this.f12278s = true;
    }

    public void e() {
        post(new Runnable() { // from class: androidx.core.widget.g
            @Override // java.lang.Runnable
            public final void run() {
                this.f12349q.f();
            }
        });
    }

    public void h() {
        post(new Runnable() { // from class: androidx.core.widget.f
            @Override // java.lang.Runnable
            public final void run() {
                this.f12348q.i();
            }
        });
    }

    @Override // android.widget.ProgressBar, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        g();
    }

    @Override // android.widget.ProgressBar, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        g();
    }
}
