package com.nothing.cardwidget;

/* JADX INFO: loaded from: classes.dex */
public interface IScrollableView extends IHorizontalScrollableView, IVerticalScrollableView {

    public static final class DefaultImpls {
        public static boolean isHScrollable(IScrollableView iScrollableView) {
            return IHorizontalScrollableView.DefaultImpls.isHScrollable(iScrollableView);
        }

        public static boolean isVScrollable(IScrollableView iScrollableView) {
            return IVerticalScrollableView.DefaultImpls.isVScrollable(iScrollableView);
        }
    }
}
