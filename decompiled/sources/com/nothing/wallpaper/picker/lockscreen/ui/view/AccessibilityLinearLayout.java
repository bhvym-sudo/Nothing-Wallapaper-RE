package com.nothing.wallpaper.picker.lockscreen.ui.view;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.Button;
import android.widget.LinearLayout;

/* JADX INFO: loaded from: classes2.dex */
public final class AccessibilityLinearLayout extends LinearLayout {
    public AccessibilityLinearLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return String.valueOf(kotlin.jvm.internal.F.b(Button.class).a());
    }
}
