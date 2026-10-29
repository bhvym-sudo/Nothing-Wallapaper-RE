package com.bumptech.glide.manager;

import androidx.lifecycle.AbstractC1157q;
import androidx.lifecycle.InterfaceC1162w;
import androidx.lifecycle.InterfaceC1163x;
import androidx.lifecycle.J;
import com.bumptech.glide.util.Util;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
final class LifecycleLifecycle implements Lifecycle, InterfaceC1162w {
    private final AbstractC1157q lifecycle;
    private final Set<LifecycleListener> lifecycleListeners = new HashSet();

    LifecycleLifecycle(AbstractC1157q abstractC1157q) {
        this.lifecycle = abstractC1157q;
        abstractC1157q.a(this);
    }

    @Override // com.bumptech.glide.manager.Lifecycle
    public void addListener(LifecycleListener lifecycleListener) {
        this.lifecycleListeners.add(lifecycleListener);
        if (this.lifecycle.b() == AbstractC1157q.b.DESTROYED) {
            lifecycleListener.onDestroy();
        } else if (this.lifecycle.b().e(AbstractC1157q.b.STARTED)) {
            lifecycleListener.onStart();
        } else {
            lifecycleListener.onStop();
        }
    }

    @J(AbstractC1157q.a.ON_DESTROY)
    public void onDestroy(InterfaceC1163x interfaceC1163x) {
        Iterator it = Util.getSnapshot(this.lifecycleListeners).iterator();
        while (it.hasNext()) {
            ((LifecycleListener) it.next()).onDestroy();
        }
        interfaceC1163x.getLifecycle().d(this);
    }

    @J(AbstractC1157q.a.ON_START)
    public void onStart(InterfaceC1163x interfaceC1163x) {
        Iterator it = Util.getSnapshot(this.lifecycleListeners).iterator();
        while (it.hasNext()) {
            ((LifecycleListener) it.next()).onStart();
        }
    }

    @J(AbstractC1157q.a.ON_STOP)
    public void onStop(InterfaceC1163x interfaceC1163x) {
        Iterator it = Util.getSnapshot(this.lifecycleListeners).iterator();
        while (it.hasNext()) {
            ((LifecycleListener) it.next()).onStop();
        }
    }

    @Override // com.bumptech.glide.manager.Lifecycle
    public void removeListener(LifecycleListener lifecycleListener) {
        this.lifecycleListeners.remove(lifecycleListener);
    }
}
