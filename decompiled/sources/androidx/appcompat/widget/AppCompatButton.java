package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;

/* JADX INFO: loaded from: classes.dex */
public class AppCompatButton extends Button {
    private C1013j mAppCompatEmojiTextHelper;
    private final C1008e mBackgroundTintHelper;
    private final r mTextHelper;

    public AppCompatButton(Context context) {
        this(context, null);
    }

    private C1013j getEmojiTextViewHelper() {
        if (this.mAppCompatEmojiTextHelper == null) {
            this.mAppCompatEmojiTextHelper = new C1013j(this);
        }
        return this.mAppCompatEmojiTextHelper;
    }

    @Override // android.widget.TextView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        C1008e c1008e = this.mBackgroundTintHelper;
        if (c1008e != null) {
            c1008e.b();
        }
        r rVar = this.mTextHelper;
        if (rVar != null) {
            rVar.b();
        }
    }

    @Override // android.widget.TextView
    public int getAutoSizeMaxTextSize() {
        if (Q.f10851a) {
            return super.getAutoSizeMaxTextSize();
        }
        r rVar = this.mTextHelper;
        if (rVar != null) {
            return rVar.e();
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeMinTextSize() {
        if (Q.f10851a) {
            return super.getAutoSizeMinTextSize();
        }
        r rVar = this.mTextHelper;
        if (rVar != null) {
            return rVar.f();
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeStepGranularity() {
        if (Q.f10851a) {
            return super.getAutoSizeStepGranularity();
        }
        r rVar = this.mTextHelper;
        if (rVar != null) {
            return rVar.g();
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int[] getAutoSizeTextAvailableSizes() {
        if (Q.f10851a) {
            return super.getAutoSizeTextAvailableSizes();
        }
        r rVar = this.mTextHelper;
        return rVar != null ? rVar.h() : new int[0];
    }

    @Override // android.widget.TextView
    @SuppressLint({"WrongConstant"})
    public int getAutoSizeTextType() {
        if (Q.f10851a) {
            return super.getAutoSizeTextType() == 1 ? 1 : 0;
        }
        r rVar = this.mTextHelper;
        if (rVar != null) {
            return rVar.i();
        }
        return 0;
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return androidx.core.widget.l.q(super.getCustomSelectionActionModeCallback());
    }

    public ColorStateList getSupportBackgroundTintList() {
        C1008e c1008e = this.mBackgroundTintHelper;
        if (c1008e != null) {
            return c1008e.c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C1008e c1008e = this.mBackgroundTintHelper;
        if (c1008e != null) {
            return c1008e.d();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.mTextHelper.j();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.mTextHelper.k();
    }

    public boolean isEmojiCompatEnabled() {
        return getEmojiTextViewHelper().b();
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(Button.class.getName());
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(Button.class.getName());
    }

    @Override // android.widget.TextView, android.view.View
    protected void onLayout(boolean z9, int i10, int i11, int i12, int i13) {
        super.onLayout(z9, i10, i11, i12, i13);
        r rVar = this.mTextHelper;
        if (rVar != null) {
            rVar.o(z9, i10, i11, i12, i13);
        }
    }

    @Override // android.widget.TextView
    protected void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        super.onTextChanged(charSequence, i10, i11, i12);
        r rVar = this.mTextHelper;
        if (rVar == null || Q.f10851a || !rVar.l()) {
            return;
        }
        this.mTextHelper.c();
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z9) {
        super.setAllCaps(z9);
        getEmojiTextViewHelper().d(z9);
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeUniformWithConfiguration(int i10, int i11, int i12, int i13) {
        if (Q.f10851a) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i10, i11, i12, i13);
            return;
        }
        r rVar = this.mTextHelper;
        if (rVar != null) {
            rVar.t(i10, i11, i12, i13);
        }
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i10) {
        if (Q.f10851a) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i10);
            return;
        }
        r rVar = this.mTextHelper;
        if (rVar != null) {
            rVar.u(iArr, i10);
        }
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeWithDefaults(int i10) {
        if (Q.f10851a) {
            super.setAutoSizeTextTypeWithDefaults(i10);
            return;
        }
        r rVar = this.mTextHelper;
        if (rVar != null) {
            rVar.v(i10);
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C1008e c1008e = this.mBackgroundTintHelper;
        if (c1008e != null) {
            c1008e.f(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i10) {
        super.setBackgroundResource(i10);
        C1008e c1008e = this.mBackgroundTintHelper;
        if (c1008e != null) {
            c1008e.g(i10);
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(androidx.core.widget.l.r(this, callback));
    }

    public void setEmojiCompatEnabled(boolean z9) {
        getEmojiTextViewHelper().e(z9);
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().a(inputFilterArr));
    }

    public void setSupportAllCaps(boolean z9) {
        r rVar = this.mTextHelper;
        if (rVar != null) {
            rVar.s(z9);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C1008e c1008e = this.mBackgroundTintHelper;
        if (c1008e != null) {
            c1008e.i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C1008e c1008e = this.mBackgroundTintHelper;
        if (c1008e != null) {
            c1008e.j(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        this.mTextHelper.w(colorStateList);
        this.mTextHelper.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        this.mTextHelper.x(mode);
        this.mTextHelper.b();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i10) {
        super.setTextAppearance(context, i10);
        r rVar = this.mTextHelper;
        if (rVar != null) {
            rVar.q(context, i10);
        }
    }

    @Override // android.widget.TextView
    public void setTextSize(int i10, float f10) {
        if (Q.f10851a) {
            super.setTextSize(i10, f10);
            return;
        }
        r rVar = this.mTextHelper;
        if (rVar != null) {
            rVar.A(i10, f10);
        }
    }

    public AppCompatButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, p050f.a.f20350p);
    }

    public AppCompatButton(Context context, AttributeSet attributeSet, int i10) {
        super(G.b(context), attributeSet, i10);
        F.a(this, getContext());
        C1008e c1008e = new C1008e(this);
        this.mBackgroundTintHelper = c1008e;
        c1008e.e(attributeSet, i10);
        r rVar = new r(this);
        this.mTextHelper = rVar;
        rVar.m(attributeSet, i10);
        rVar.b();
        getEmojiTextViewHelper().c(attributeSet, i10);
    }
}
