package com.nothing.wallpaper.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Outline;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewOutlineProvider;
import androidx.appcompat.widget.AppCompatImageView;
import kotlin.jvm.internal.AbstractC1457h;
import kotlin.jvm.internal.n;

/* JADX INFO: loaded from: classes2.dex */
public final class RoundImageView extends AppCompatImageView {

    public static final class a extends ViewOutlineProvider {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ float f19177a;

        a(float f10) {
            this.f19177a = f10;
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            n.h(view, "view");
            n.h(outline, "outline");
            outline.setRoundRect(new Rect(0, 0, view.getWidth(), view.getHeight()), this.f19177a);
        }
    }

    public static final class b extends ViewOutlineProvider {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ float f19178a;

        b(float f10) {
            this.f19178a = f10;
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            n.h(view, "view");
            n.h(outline, "outline");
            outline.setRoundRect(new Rect(0, 0, view.getWidth(), view.getHeight()), this.f19178a);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public RoundImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        n.h(context, "context");
    }

    public final void setRoundRadius(float f10) {
        setOutlineProvider(new b(f10));
    }

    public /* synthetic */ RoundImageView(Context context, AttributeSet attributeSet, int i10, int i11, AbstractC1457h abstractC1457h) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? 0 : i10);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RoundImageView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        n.h(context, "context");
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, p004a3.a.f9756j2, i10, 0);
        setOutlineProvider(new a(typedArrayObtainStyledAttributes.getDimension(0, 0.0f)));
        setClipToOutline(true);
        typedArrayObtainStyledAttributes.recycle();
    }
}
