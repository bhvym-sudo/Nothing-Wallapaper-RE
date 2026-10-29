package com.nothing.commBase.deferred;

/* JADX INFO: loaded from: classes2.dex */
public interface IDeferringObserver {

    public static final class DefaultImpls {
        public static void onCardRemoved(IDeferringObserver iDeferringObserver, int i10) {
        }
    }

    IDeferring getDeferringController();

    void onCardRemoved(int i10);

    void onCardVisibilityChanged(boolean z9);
}
