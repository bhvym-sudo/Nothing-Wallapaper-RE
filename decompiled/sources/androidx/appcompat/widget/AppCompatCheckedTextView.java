package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.CheckedTextView;

/* JADX INFO: loaded from: classes.dex */
public class AppCompatCheckedTextView extends CheckedTextView {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final C1009f f10668q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final C1008e f10669r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final r f10670s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private C1013j f10671t;

    public AppCompatCheckedTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, p050f.a.f20352r);
    }

    private C1013j getEmojiTextViewHelper() {
        if (this.f10671t == null) {
            this.f10671t = new C1013j(this);
        }
        return this.f10671t;
    }

    @Override // android.widget.CheckedTextView, android.widget.TextView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        r rVar = this.f10670s;
        if (rVar != null) {
            rVar.b();
        }
        C1008e c1008e = this.f10669r;
        if (c1008e != null) {
            c1008e.b();
        }
        C1009f c1009f = this.f10668q;
        if (c1009f != null) {
            c1009f.a();
        }
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return androidx.core.widget.l.q(super.getCustomSelectionActionModeCallback());
    }

    public ColorStateList getSupportBackgroundTintList() {
        C1008e c1008e = this.f10669r;
        if (c1008e != null) {
            return c1008e.c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C1008e c1008e = this.f10669r;
        if (c1008e != null) {
            return c1008e.d();
        }
        return null;
    }

    public ColorStateList getSupportCheckMarkTintList() {
        C1009f c1009f = this.f10668q;
        if (c1009f != null) {
            return c1009f.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportCheckMarkTintMode() {
        C1009f c1009f = this.f10668q;
        if (c1009f != null) {
            return c1009f.c();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f10670s.j();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f10670s.k();
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        return AbstractC1014k.a(super.onCreateInputConnection(editorInfo), editorInfo, this);
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z9) {
        super.setAllCaps(z9);
        getEmojiTextViewHelper().d(z9);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C1008e c1008e = this.f10669r;
        if (c1008e != null) {
            c1008e.f(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i10) {
        super.setBackgroundResource(i10);
        C1008e c1008e = this.f10669r;
        if (c1008e != null) {
            c1008e.g(i10);
        }
    }

    @Override // android.widget.CheckedTextView
    public void setCheckMarkDrawable(Drawable drawable) {
        super.setCheckMarkDrawable(drawable);
        C1009f c1009f = this.f10668q;
        if (c1009f != null) {
            c1009f.e();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        r rVar = this.f10670s;
        if (rVar != null) {
            rVar.p();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        r rVar = this.f10670s;
        if (rVar != null) {
            rVar.p();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(androidx.core.widget.l.r(this, callback));
    }

    public void setEmojiCompatEnabled(boolean z9) {
        getEmojiTextViewHelper().e(z9);
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C1008e c1008e = this.f10669r;
        if (c1008e != null) {
            c1008e.i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C1008e c1008e = this.f10669r;
        if (c1008e != null) {
            c1008e.j(mode);
        }
    }

    public void setSupportCheckMarkTintList(ColorStateList colorStateList) {
        C1009f c1009f = this.f10668q;
        if (c1009f != null) {
            c1009f.f(colorStateList);
        }
    }

    public void setSupportCheckMarkTintMode(PorterDuff.Mode mode) {
        C1009f c1009f = this.f10668q;
        if (c1009f != null) {
            c1009f.g(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        this.f10670s.w(colorStateList);
        this.f10670s.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        this.f10670s.x(mode);
        this.f10670s.b();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i10) {
        super.setTextAppearance(context, i10);
        r rVar = this.f10670s;
        if (rVar != null) {
            rVar.q(context, i10);
        }
    }

    public AppCompatCheckedTextView(Context context, AttributeSet attributeSet, int i10) {
        super(G.b(context), attributeSet, i10);
        F.a(this, getContext());
        r rVar = new r(this);
        this.f10670s = rVar;
        rVar.m(attributeSet, i10);
        rVar.b();
        C1008e c1008e = new C1008e(this);
        this.f10669r = c1008e;
        c1008e.e(attributeSet, i10);
        C1009f c1009f = new C1009f(this);
        this.f10668q = c1009f;
        c1009f.d(attributeSet, i10);
        getEmojiTextViewHelper().c(attributeSet, i10);
    }

    @Override // android.widget.CheckedTextView
    public void setCheckMarkDrawable(int i10) {
        setCheckMarkDrawable(p060g.a.b(getContext(), i10));
    }
}
