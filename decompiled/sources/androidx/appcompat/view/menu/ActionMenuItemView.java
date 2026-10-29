package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.O;
import androidx.appcompat.widget.y;
import androidx.constraintlayout.core.widgets.analyzer.BasicMeasure;

/* JADX INFO: loaded from: classes.dex */
public class ActionMenuItemView extends AppCompatTextView implements k.a, View.OnClickListener, ActionMenuView.a {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    e.b f10371A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private y f10372B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    b f10373C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private boolean f10374D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private boolean f10375E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private int f10376F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private int f10377G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private int f10378H;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    g f10379x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private CharSequence f10380y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private Drawable f10381z;

    private class a extends y {
        public a() {
            super(ActionMenuItemView.this);
        }

        @Override // androidx.appcompat.widget.y
        public p100k.e b() {
            b bVar = ActionMenuItemView.this.f10373C;
            if (bVar != null) {
                return bVar.a();
            }
            return null;
        }

        @Override // androidx.appcompat.widget.y
        protected boolean c() {
            p100k.e eVarB;
            ActionMenuItemView actionMenuItemView = ActionMenuItemView.this;
            e.b bVar = actionMenuItemView.f10371A;
            return bVar != null && bVar.a(actionMenuItemView.f10379x) && (eVarB = b()) != null && eVarB.a();
        }
    }

    public static abstract class b {
        public abstract p100k.e a();
    }

    public ActionMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private boolean t() {
        Configuration configuration = getContext().getResources().getConfiguration();
        int i10 = configuration.screenWidthDp;
        int i11 = configuration.screenHeightDp;
        if (i10 < 480) {
            return (i10 >= 640 && i11 >= 480) || configuration.orientation == 2;
        }
        return true;
    }

    private void u() {
        boolean z9 = true;
        boolean z10 = !TextUtils.isEmpty(this.f10380y);
        if (this.f10381z != null && (!this.f10379x.A() || (!this.f10374D && !this.f10375E))) {
            z9 = false;
        }
        boolean z11 = z10 & z9;
        setText(z11 ? this.f10380y : null);
        CharSequence contentDescription = this.f10379x.getContentDescription();
        if (TextUtils.isEmpty(contentDescription)) {
            setContentDescription(z11 ? null : this.f10379x.getTitle());
        } else {
            setContentDescription(contentDescription);
        }
        CharSequence tooltipText = this.f10379x.getTooltipText();
        if (TextUtils.isEmpty(tooltipText)) {
            O.a(this, z11 ? null : this.f10379x.getTitle());
        } else {
            O.a(this, tooltipText);
        }
    }

    @Override // androidx.appcompat.widget.ActionMenuView.a
    public boolean a() {
        return s();
    }

    @Override // androidx.appcompat.widget.ActionMenuView.a
    public boolean b() {
        return s() && this.f10379x.getIcon() == null;
    }

    @Override // androidx.appcompat.view.menu.k.a
    public boolean d() {
        return true;
    }

    @Override // androidx.appcompat.view.menu.k.a
    public void e(g gVar, int i10) {
        this.f10379x = gVar;
        setIcon(gVar.getIcon());
        setTitle(gVar.i(this));
        setId(gVar.getItemId());
        setVisibility(gVar.isVisible() ? 0 : 8);
        setEnabled(gVar.isEnabled());
        if (gVar.hasSubMenu() && this.f10372B == null) {
            this.f10372B = new a();
        }
    }

    @Override // android.widget.TextView, android.view.View
    public CharSequence getAccessibilityClassName() {
        return Button.class.getName();
    }

    @Override // androidx.appcompat.view.menu.k.a
    public g getItemData() {
        return this.f10379x;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        e.b bVar = this.f10371A;
        if (bVar != null) {
            bVar.a(this.f10379x);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f10374D = t();
        u();
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView, android.view.View
    protected void onMeasure(int i10, int i11) {
        int i12;
        boolean zS = s();
        if (zS && (i12 = this.f10377G) >= 0) {
            super.setPadding(i12, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
        super.onMeasure(i10, i11);
        int mode = View.MeasureSpec.getMode(i10);
        int size = View.MeasureSpec.getSize(i10);
        int measuredWidth = getMeasuredWidth();
        int iMin = mode == Integer.MIN_VALUE ? Math.min(size, this.f10376F) : this.f10376F;
        if (mode != 1073741824 && this.f10376F > 0 && measuredWidth < iMin) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(iMin, BasicMeasure.EXACTLY), i11);
        }
        if (zS || this.f10381z == null) {
            return;
        }
        super.setPadding((getMeasuredWidth() - this.f10381z.getBounds().width()) / 2, getPaddingTop(), getPaddingRight(), getPaddingBottom());
    }

    @Override // android.widget.TextView, android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        super.onRestoreInstanceState(null);
    }

    @Override // android.widget.TextView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        y yVar;
        if (this.f10379x.hasSubMenu() && (yVar = this.f10372B) != null && yVar.onTouch(this, motionEvent)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public boolean s() {
        return !TextUtils.isEmpty(getText());
    }

    public void setCheckable(boolean z9) {
    }

    public void setChecked(boolean z9) {
    }

    public void setExpandedFormat(boolean z9) {
        if (this.f10375E != z9) {
            this.f10375E = z9;
            g gVar = this.f10379x;
            if (gVar != null) {
                gVar.c();
            }
        }
    }

    public void setIcon(Drawable drawable) {
        this.f10381z = drawable;
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            int i10 = this.f10378H;
            if (intrinsicWidth > i10) {
                intrinsicHeight = (int) (intrinsicHeight * (i10 / intrinsicWidth));
                intrinsicWidth = i10;
            }
            if (intrinsicHeight > i10) {
                intrinsicWidth = (int) (intrinsicWidth * (i10 / intrinsicHeight));
            } else {
                i10 = intrinsicHeight;
            }
            drawable.setBounds(0, 0, intrinsicWidth, i10);
        }
        setCompoundDrawables(drawable, null, null, null);
        u();
    }

    public void setItemInvoker(e.b bVar) {
        this.f10371A = bVar;
    }

    @Override // android.widget.TextView, android.view.View
    public void setPadding(int i10, int i11, int i12, int i13) {
        this.f10377G = i10;
        super.setPadding(i10, i11, i12, i13);
    }

    public void setPopupCallback(b bVar) {
        this.f10373C = bVar;
    }

    public void setTitle(CharSequence charSequence) {
        this.f10380y = charSequence;
        u();
    }

    public ActionMenuItemView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        Resources resources = context.getResources();
        this.f10374D = t();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, p050f.j.f20700v, i10, 0);
        this.f10376F = typedArrayObtainStyledAttributes.getDimensionPixelSize(p050f.j.f20705w, 0);
        typedArrayObtainStyledAttributes.recycle();
        this.f10378H = (int) ((resources.getDisplayMetrics().density * 32.0f) + 0.5f);
        setOnClickListener(this);
        this.f10377G = -1;
        setSaveEnabled(false);
    }
}
