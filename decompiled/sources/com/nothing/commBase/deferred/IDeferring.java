package com.nothing.commBase.deferred;

/* JADX INFO: loaded from: classes2.dex */
public interface IDeferring extends IDeferringObservable {
    public static final Companion Companion = Companion.$$INSTANCE;
    public static final long MAX_DEFERRED_REFRESH_TIME = 1000;

    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        public static final long MAX_DEFERRED_REFRESH_TIME = 1000;

        private Companion() {
        }
    }

    boolean isDeferring();

    boolean removeDeferringCallback(Runnable runnable);

    void runOnDeferringEnd(Runnable runnable);
}
