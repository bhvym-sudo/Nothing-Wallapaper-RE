package p084i3;

import androidx.appcompat.app.c;

/* JADX INFO: renamed from: i3.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractActivityC1391b extends c {

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    private boolean f22027T;

    public boolean I0() {
        return this.f22027T;
    }

    @Override // androidx.fragment.app.AbstractActivityC1136v, android.app.Activity
    protected void onPause() {
        super.onPause();
        this.f22027T = false;
    }

    @Override // androidx.fragment.app.AbstractActivityC1136v, android.app.Activity
    protected void onResume() {
        super.onResume();
        this.f22027T = true;
    }
}
