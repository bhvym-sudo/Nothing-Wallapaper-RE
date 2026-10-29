package com.nothing.wallpaper.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Outline;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewOutlineProvider;
import com.android.wallpaper.picker.FixedWidthDisplayRatioFrameLayout;
import kotlin.jvm.internal.n;
import p087i6.q;

/* JADX INFO: loaded from: classes2.dex */
public final class RoundFWDRFrameLayout extends FixedWidthDisplayRatioFrameLayout {

    public static final class a extends ViewOutlineProvider {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ float f19176a;

        a(float f10) {
            this.f19176a = f10;
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            n.h(view, "view");
            n.h(outline, "outline");
            outline.setRoundRect(new Rect(0, 0, view.getWidth(), view.getHeight()), this.f19176a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RoundFWDRFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        n.h(context, "context");
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, p004a3.a.f9756j2, 0, 0);
        setOutlineProvider(new a(q.a(context, typedArrayObtainStyledAttributes.getDimension(0, 0.0f))));
        setClipToOutline(true);
        typedArrayObtainStyledAttributes.recycle();
    }
}
