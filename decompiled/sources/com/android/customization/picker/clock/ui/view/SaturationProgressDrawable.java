package com.android.customization.picker.clock.ui.view;

import B8.h;
import android.content.res.Resources;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableWrapper;
import android.graphics.drawable.InsetDrawable;
import kotlin.jvm.internal.AbstractC1457h;
import kotlin.jvm.internal.n;

/* JADX INFO: loaded from: classes.dex */
public final class SaturationProgressDrawable extends InsetDrawable {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final a f15362q = new a(null);

    public static final class a {
        public /* synthetic */ a(AbstractC1457h abstractC1457h) {
            this();
        }

        private a() {
        }
    }

    private static final class b extends Drawable.ConstantState {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Drawable.ConstantState f15363a;

        public b(Drawable.ConstantState wrappedState) {
            n.h(wrappedState, "wrappedState");
            this.f15363a = wrappedState;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public boolean canApplyTheme() {
            return true;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.f15363a.getChangingConfigurations();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            return newDrawable(null, null);
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources, Resources.Theme theme) {
            Drawable drawableNewDrawable = this.f15363a.newDrawable(resources, theme);
            n.f(drawableNewDrawable, "null cannot be cast to non-null type android.graphics.drawable.DrawableWrapper");
            return new SaturationProgressDrawable(((DrawableWrapper) drawableNewDrawable).getDrawable());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SaturationProgressDrawable() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // android.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
    public boolean canApplyTheme() {
        Drawable drawable = getDrawable();
        return (drawable != null ? drawable.canApplyTheme() : false) || super.canApplyTheme();
    }

    @Override // android.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
    public int getChangingConfigurations() {
        return super.getChangingConfigurations() | 4096;
    }

    @Override // android.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        Drawable.ConstantState constantState = super.getConstantState();
        n.e(constantState);
        return new b(constantState);
    }

    @Override // android.graphics.drawable.InsetDrawable, android.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect bounds) {
        n.h(bounds, "bounds");
        super.onBoundsChange(bounds);
        onLevelChange(getLevel());
    }

    @Override // android.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
    public boolean onLayoutDirectionChanged(int i10) {
        onLevelChange(getLevel());
        return super.onLayoutDirectionChanged(i10);
    }

    @Override // android.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
    protected boolean onLevelChange(int i10) {
        Drawable drawable = getDrawable();
        Rect bounds = drawable != null ? drawable.getBounds() : null;
        n.e(bounds);
        int iWidth = ((getBounds().width() * i10) / 10000) + (getBounds().height() / 2);
        Drawable drawable2 = getDrawable();
        if (drawable2 != null) {
            drawable2.setBounds(getBounds().left, bounds.top, h.f(h.i(iWidth, getBounds().width()), getBounds().height()), bounds.bottom);
        }
        return super.onLevelChange(i10);
    }

    public /* synthetic */ SaturationProgressDrawable(Drawable drawable, int i10, AbstractC1457h abstractC1457h) {
        this((i10 & 1) != 0 ? null : drawable);
    }

    public SaturationProgressDrawable(Drawable drawable) {
        super(drawable, 0);
    }
}
