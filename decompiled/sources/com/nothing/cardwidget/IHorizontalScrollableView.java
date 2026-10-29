package com.nothing.cardwidget;

/* JADX INFO: loaded from: classes.dex */
public interface IHorizontalScrollableView {

    public static final class DefaultImpls {
        public static boolean isHScrollable(IHorizontalScrollableView iHorizontalScrollableView) {
            return true;
        }
    }

    boolean isHScrollable();
}
