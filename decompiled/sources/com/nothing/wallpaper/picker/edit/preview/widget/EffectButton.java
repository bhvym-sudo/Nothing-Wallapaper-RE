package com.nothing.wallpaper.picker.edit.preview.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.nothing.wallpaper.R;
import kotlin.jvm.internal.AbstractC1457h;
import kotlin.jvm.internal.n;
import p004a3.a;
import p044e3.AbstractC1319d0;

/* JADX INFO: loaded from: classes2.dex */
public final class EffectButton extends LinearLayout {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final AbstractC1319d0 f18538q;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public EffectButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
        n.h(context, "context");
    }

    private final void setImageDrawable(Drawable drawable) {
        this.f18538q.f19947v.setImageDrawable(drawable);
    }

    private final void setTitle(CharSequence charSequence) {
        this.f18538q.f19949x.setText(charSequence);
        this.f18538q.f19947v.setContentDescription(charSequence);
    }

    @Override // android.view.View
    public void setEnabled(boolean z9) {
        super.setEnabled(z9);
        AbstractC1319d0 abstractC1319d0 = this.f18538q;
        abstractC1319d0.f19947v.setEnabled(z9);
        abstractC1319d0.f19949x.setEnabled(z9);
        abstractC1319d0.f19948w.setEnabled(z9);
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        this.f18538q.f19947v.setOnClickListener(onClickListener);
    }

    @Override // android.view.View
    public void setSelected(boolean z9) {
        super.setSelected(z9);
        this.f18538q.f19948w.setText(getResources().getText(z9 ? R.string.on : R.string.off));
    }

    public /* synthetic */ EffectButton(Context context, AttributeSet attributeSet, int i10, int i11, int i12, AbstractC1457h abstractC1457h) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i10, (i12 & 8) != 0 ? 0 : i11);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EffectButton(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        n.h(context, "context");
        AbstractC1319d0 abstractC1319d0C = AbstractC1319d0.C(LayoutInflater.from(context), this, true);
        n.g(abstractC1319d0C, "inflate(...)");
        this.f18538q = abstractC1319d0C;
        setOrientation(1);
        setGravity(1);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.f9774o0, i10, i11);
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(0);
        if (drawable != null) {
            setImageDrawable(drawable);
        }
        setTitle(typedArrayObtainStyledAttributes.getText(1));
        TextView state = abstractC1319d0C.f19948w;
        n.g(state, "state");
        state.setVisibility(typedArrayObtainStyledAttributes.getInt(2, 1) == 0 ? 4 : 0);
        typedArrayObtainStyledAttributes.recycle();
    }
}
