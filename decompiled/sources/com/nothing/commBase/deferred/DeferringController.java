package com.nothing.commBase.deferred;

import android.os.SystemClock;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.internal.n;

/* JADX INFO: loaded from: classes2.dex */
public final class DeferringController implements IDeferring {
    private long beginDeferTime;
    private Set<Runnable> deferredRunnable;
    private long maxDeferTime = 1000;

    private final void executeAndClearDeferringList() {
        Set<Runnable> set = this.deferredRunnable;
        this.deferredRunnable = null;
        if (set != null) {
            Iterator<T> it = set.iterator();
            while (it.hasNext()) {
                ((Runnable) it.next()).run();
            }
        }
    }

    @Override // com.nothing.commBase.deferred.IDeferringObservable
    public void beginDeferring(long j9) {
        this.maxDeferTime = j9;
        this.beginDeferTime = SystemClock.uptimeMillis() + j9;
    }

    @Override // com.nothing.commBase.deferred.IDeferringObservable
    public void endDeferring() {
        this.beginDeferTime = 0L;
        executeAndClearDeferringList();
    }

    @Override // com.nothing.commBase.deferred.IDeferring
    public boolean isDeferring() {
        return SystemClock.uptimeMillis() < this.beginDeferTime;
    }

    @Override // com.nothing.commBase.deferred.IDeferring
    public synchronized boolean removeDeferringCallback(Runnable runnable) {
        Set<Runnable> set;
        n.h(runnable, "runnable");
        set = this.deferredRunnable;
        return set != null ? set.remove(runnable) : false;
    }

    @Override // com.nothing.commBase.deferred.IDeferring
    public synchronized void runOnDeferringEnd(Runnable runnable) {
        try {
            n.h(runnable, "runnable");
            if (isDeferring()) {
                if (this.deferredRunnable == null) {
                    this.deferredRunnable = new LinkedHashSet();
                }
                Set<Runnable> set = this.deferredRunnable;
                if (set != null) {
                    set.add(runnable);
                }
            } else {
                runnable.run();
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
