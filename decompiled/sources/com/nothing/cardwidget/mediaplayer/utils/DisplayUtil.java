package com.nothing.cardwidget.mediaplayer.utils;

import android.view.View;
import android.view.ViewGroup;
import kotlin.jvm.internal.n;

/* JADX INFO: loaded from: classes2.dex */
public final class DisplayUtil {
    public static final DisplayUtil INSTANCE = new DisplayUtil();
    public static final String MARGIN_BOTTOM = "layout_marginBottom";
    public static final String MARGIN_END = "layout_marginEnd";
    public static final String MARGIN_LEFT = "layout_marginLeft";
    public static final String MARGIN_RIGHT = "layout_marginRight";
    public static final String MARGIN_START = "layout_marginStart";
    public static final String MARGIN_TOP = "layout_marginTop";
    private static final String TAG = "DisplayUtil";

    private DisplayUtil() {
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final void setViewMargin(View view, String key, int i10) {
        n.h(view, "view");
        n.h(key, "key");
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            switch (key.hashCode()) {
                case -954397320:
                    if (key.equals(MARGIN_END)) {
                        ((ViewGroup.MarginLayoutParams) layoutParams).setMarginEnd(i10);
                    }
                    break;
                case -954382862:
                    if (key.equals(MARGIN_TOP)) {
                        ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = i10;
                    }
                    break;
                case 148567150:
                    if (key.equals(MARGIN_BOTTOM)) {
                        ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin = i10;
                    }
                    break;
                case 478654218:
                    if (key.equals(MARGIN_LEFT)) {
                        ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin = i10;
                    }
                    break;
                case 1959039865:
                    if (key.equals(MARGIN_RIGHT)) {
                        ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin = i10;
                    }
                    break;
                case 1960285631:
                    if (key.equals(MARGIN_START)) {
                        ((ViewGroup.MarginLayoutParams) layoutParams).setMarginStart(i10);
                    }
                    break;
            }
            view.setLayoutParams(layoutParams);
        }
    }

    public final void setViewPadding(View view, Integer num, Integer num2, Integer num3, Integer num4) {
        n.h(view, "view");
        view.setPadding(num != null ? num.intValue() : view.getPaddingLeft(), num2 != null ? num2.intValue() : view.getPaddingTop(), num3 != null ? num3.intValue() : view.getPaddingRight(), num4 != null ? num4.intValue() : view.getPaddingBottom());
    }

    public final void setViewSize(View view, Integer num, Integer num2) {
        n.h(view, "view");
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams != null) {
            if (num != null) {
                layoutParams.width = num.intValue();
            }
            if (num2 != null) {
                layoutParams.height = num2.intValue();
            }
            view.setLayoutParams(layoutParams);
        }
    }
}
