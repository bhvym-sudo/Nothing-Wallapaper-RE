package com.nothing.wallpaper.picker.lockscreen.ui.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import com.nothing.wallpaper.R;
import java.util.List;
import kotlin.jvm.internal.AbstractC1457h;
import p044e3.t0;

/* JADX INFO: loaded from: classes2.dex */
public final class ShortCutPreview extends FrameLayout {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final t0 f18976q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private a f18977r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private boolean f18978s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private List f18979t;

    public interface a {
        void a(String str);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ShortCutPreview(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
        kotlin.jvm.internal.n.h(context, "context");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(ShortCutPreview shortCutPreview, View view) {
        view.performHapticFeedback(4);
        a aVar = shortCutPreview.f18977r;
        if (aVar != null) {
            aVar.a("bottom_start");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(ShortCutPreview shortCutPreview, View view) {
        view.performHapticFeedback(4);
        a aVar = shortCutPreview.f18977r;
        if (aVar != null) {
            aVar.a("bottom_end");
        }
    }

    private final boolean e(C7.a aVar) {
        return f(aVar) && this.f18978s;
    }

    private final boolean f(C7.a aVar) {
        return kotlin.jvm.internal.n.d(aVar.c(), "none") || !aVar.e();
    }

    public final void g(float f10, boolean z9) {
        t0 t0Var = this.f18976q;
        if (!z9) {
            t0Var.f20121w.setAnimAlpha(f10);
            t0Var.f20120v.setAnimAlpha(f10);
        }
        List<p079h8.u> list = this.f18979t;
        if (list != null) {
            for (p079h8.u uVar : list) {
                if (kotlin.jvm.internal.n.d(uVar.d(), "bottom_start") && f((C7.a) uVar.e())) {
                    t0Var.f20121w.setAlpha(f10);
                    TransitionImageView slotStart = t0Var.f20121w;
                    kotlin.jvm.internal.n.g(slotStart, "slotStart");
                    slotStart.setVisibility(f10 > 0.0f ? 0 : 8);
                } else if (kotlin.jvm.internal.n.d(uVar.d(), "bottom_end") && f((C7.a) uVar.e())) {
                    t0Var.f20120v.setAlpha(f10);
                    TransitionImageView slotEnd = t0Var.f20120v;
                    kotlin.jvm.internal.n.g(slotEnd, "slotEnd");
                    slotEnd.setVisibility(f10 > 0.0f ? 0 : 8);
                }
            }
        }
    }

    public final a getOnSlotListener() {
        return this.f18977r;
    }

    public final boolean getShowPreview() {
        return this.f18978s;
    }

    public final List<p079h8.u> getSlotShortcuts() {
        return this.f18979t;
    }

    public final void setAnimAlpha(float f10) {
        if (this.f18976q.f20121w.isSelected()) {
            this.f18976q.f20121w.setAnimAlpha(f10);
            this.f18976q.f20120v.setAnimAlpha(1.0f);
        } else {
            this.f18976q.f20121w.setAnimAlpha(1.0f);
            this.f18976q.f20120v.setAnimAlpha(f10);
        }
    }

    public final void setOnSlotListener(a aVar) {
        this.f18977r = aVar;
    }

    public final void setShortcuts(List<p079h8.u> shortcuts) {
        kotlin.jvm.internal.n.h(shortcuts, "shortcuts");
        this.f18979t = shortcuts;
        t0 t0Var = this.f18976q;
        for (p079h8.u uVar : shortcuts) {
            if (kotlin.jvm.internal.n.d(uVar.d(), "bottom_start")) {
                if (kotlin.jvm.internal.n.d(((C7.a) uVar.e()).c(), "none")) {
                    TransitionImageView transitionImageView = t0Var.f20121w;
                    Drawable drawableB = ((C7.a) uVar.e()).b();
                    F2.h hVar = F2.h.f1567a;
                    Context context = getContext();
                    kotlin.jvm.internal.n.g(context, "getContext(...)");
                    transitionImageView.e(drawableB, hVar.i(context, R.color.shortcut_icon_color2));
                } else {
                    TransitionImageView transitionImageView2 = t0Var.f20121w;
                    Drawable drawableB2 = ((C7.a) uVar.e()).b();
                    F2.h hVar2 = F2.h.f1567a;
                    Context context2 = getContext();
                    kotlin.jvm.internal.n.g(context2, "getContext(...)");
                    transitionImageView2.e(drawableB2, hVar2.i(context2, android.R.color.white));
                }
                t0Var.f20121w.g(((C7.a) uVar.e()).b(), getContext().getColorStateList(R.color.shortcut_icon_color));
                t0Var.f20121w.setContentDescription(((C7.a) uVar.e()).d());
                t0Var.f20121w.setSelected(((Boolean) uVar.f()).booleanValue());
                TransitionImageView slotStart = t0Var.f20121w;
                kotlin.jvm.internal.n.g(slotStart, "slotStart");
                slotStart.setVisibility(e((C7.a) uVar.e()) ? 8 : 0);
            } else if (kotlin.jvm.internal.n.d(uVar.d(), "bottom_end")) {
                if (kotlin.jvm.internal.n.d(((C7.a) uVar.e()).c(), "none")) {
                    TransitionImageView transitionImageView3 = t0Var.f20120v;
                    Drawable drawableB3 = ((C7.a) uVar.e()).b();
                    F2.h hVar3 = F2.h.f1567a;
                    Context context3 = getContext();
                    kotlin.jvm.internal.n.g(context3, "getContext(...)");
                    transitionImageView3.e(drawableB3, hVar3.i(context3, R.color.shortcut_icon_color2));
                } else {
                    TransitionImageView transitionImageView4 = t0Var.f20120v;
                    Drawable drawableB4 = ((C7.a) uVar.e()).b();
                    F2.h hVar4 = F2.h.f1567a;
                    Context context4 = getContext();
                    kotlin.jvm.internal.n.g(context4, "getContext(...)");
                    transitionImageView4.e(drawableB4, hVar4.i(context4, android.R.color.white));
                }
                t0Var.f20120v.g(((C7.a) uVar.e()).b(), getContext().getColorStateList(R.color.shortcut_icon_color));
                t0Var.f20120v.setContentDescription(((C7.a) uVar.e()).d());
                t0Var.f20120v.setSelected(((Boolean) uVar.f()).booleanValue());
                TransitionImageView slotEnd = t0Var.f20120v;
                kotlin.jvm.internal.n.g(slotEnd, "slotEnd");
                slotEnd.setVisibility(e((C7.a) uVar.e()) ? 8 : 0);
            }
        }
    }

    public final void setShowPreview(boolean z9) {
        this.f18978s = z9;
    }

    public /* synthetic */ ShortCutPreview(Context context, AttributeSet attributeSet, int i10, int i11, int i12, AbstractC1457h abstractC1457h) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i10, (i12 & 8) != 0 ? 0 : i11);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShortCutPreview(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        kotlin.jvm.internal.n.h(context, "context");
        t0 t0VarC = t0.C(LayoutInflater.from(context), this, true);
        kotlin.jvm.internal.n.g(t0VarC, "inflate(...)");
        this.f18976q = t0VarC;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, p004a3.a.f9796t2, i10, i11);
        this.f18978s = typedArrayObtainStyledAttributes.getInt(0, 1) == 0;
        typedArrayObtainStyledAttributes.recycle();
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.nt_shortcut_icon_size);
        int dimensionPixelSize2 = getResources().getDimensionPixelSize(R.dimen.nt_shortcut_icon_bg_size);
        t0VarC.f20121w.f(dimensionPixelSize, dimensionPixelSize);
        t0VarC.f20121w.h(dimensionPixelSize, dimensionPixelSize);
        t0VarC.f20121w.c(dimensionPixelSize2, dimensionPixelSize2);
        t0VarC.f20121w.d(dimensionPixelSize2, dimensionPixelSize2);
        t0VarC.f20120v.f(dimensionPixelSize, dimensionPixelSize);
        t0VarC.f20120v.h(dimensionPixelSize, dimensionPixelSize);
        t0VarC.f20120v.c(dimensionPixelSize2, dimensionPixelSize2);
        t0VarC.f20120v.d(dimensionPixelSize2, dimensionPixelSize2);
        t0VarC.f20121w.setOnClickListener(new View.OnClickListener() { // from class: com.nothing.wallpaper.picker.lockscreen.ui.view.P
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ShortCutPreview.c(this.f18955q, view);
            }
        });
        t0VarC.f20120v.setOnClickListener(new View.OnClickListener() { // from class: com.nothing.wallpaper.picker.lockscreen.ui.view.Q
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ShortCutPreview.d(this.f18956q, view);
            }
        });
        t0VarC.f20121w.setSelected(true);
        setAnimAlpha(1.0f);
        if (this.f18978s) {
            t0VarC.f20121w.setAnimAlpha(0.0f);
            t0VarC.f20120v.setAnimAlpha(0.0f);
        }
    }
}
