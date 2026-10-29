package com.nothing.cardwidget;

/* JADX INFO: loaded from: classes.dex */
public interface IVerticalScrollableView {

    public static final class DefaultImpls {
        public static boolean isVScrollable(IVerticalScrollableView iVerticalScrollableView) {
            return true;
        }
    }

    boolean isVScrollable();
}
