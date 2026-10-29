package androidx.appcompat.widget;

import android.R;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.ThemedSpinnerAdapter;

/* JADX INFO: loaded from: classes.dex */
public class AppCompatSpinner extends Spinner {

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private static final int[] f10689y = {R.attr.spinnerMode};

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final C1008e f10690q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final Context f10691r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private y f10692s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private SpinnerAdapter f10693t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final boolean f10694u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private h f10695v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    int f10696w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    final Rect f10697x;

    class a extends y {

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        final /* synthetic */ f f10699z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(View view, f fVar) {
            super(view);
            this.f10699z = fVar;
        }

        @Override // androidx.appcompat.widget.y
        public p100k.e b() {
            return this.f10699z;
        }

        @Override // androidx.appcompat.widget.y
        public boolean c() {
            if (AppCompatSpinner.this.getInternalPopup().a()) {
                return true;
            }
            AppCompatSpinner.this.b();
            return true;
        }
    }

    class b implements ViewTreeObserver.OnGlobalLayoutListener {
        b() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (!AppCompatSpinner.this.getInternalPopup().a()) {
                AppCompatSpinner.this.b();
            }
            ViewTreeObserver viewTreeObserver = AppCompatSpinner.this.getViewTreeObserver();
            if (viewTreeObserver != null) {
                viewTreeObserver.removeOnGlobalLayoutListener(this);
            }
        }
    }

    private static final class c {
        static void a(ThemedSpinnerAdapter themedSpinnerAdapter, Resources.Theme theme) {
            if (B0.d.a(themedSpinnerAdapter.getDropDownViewTheme(), theme)) {
                return;
            }
            themedSpinnerAdapter.setDropDownViewTheme(theme);
        }
    }

    class d implements h, DialogInterface.OnClickListener {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        androidx.appcompat.app.b f10701q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private ListAdapter f10702r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        private CharSequence f10703s;

        d() {
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.h
        public boolean a() {
            androidx.appcompat.app.b bVar = this.f10701q;
            if (bVar != null) {
                return bVar.isShowing();
            }
            return false;
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.h
        public int c() {
            return 0;
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.h
        public void dismiss() {
            androidx.appcompat.app.b bVar = this.f10701q;
            if (bVar != null) {
                bVar.dismiss();
                this.f10701q = null;
            }
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.h
        public void e(int i10) {
            Log.e("AppCompatSpinner", "Cannot set horizontal offset for MODE_DIALOG, ignoring");
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.h
        public CharSequence f() {
            return this.f10703s;
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.h
        public Drawable h() {
            return null;
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.h
        public void i(CharSequence charSequence) {
            this.f10703s = charSequence;
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.h
        public void k(Drawable drawable) {
            Log.e("AppCompatSpinner", "Cannot set popup background for MODE_DIALOG, ignoring");
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.h
        public void l(int i10) {
            Log.e("AppCompatSpinner", "Cannot set vertical offset for MODE_DIALOG, ignoring");
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.h
        public void m(int i10) {
            Log.e("AppCompatSpinner", "Cannot set horizontal (original) offset for MODE_DIALOG, ignoring");
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.h
        public void n(int i10, int i11) {
            if (this.f10702r == null) {
                return;
            }
            androidx.appcompat.app.b.a aVar = new androidx.appcompat.app.b.a(AppCompatSpinner.this.getPopupContext());
            CharSequence charSequence = this.f10703s;
            if (charSequence != null) {
                aVar.l(charSequence);
            }
            androidx.appcompat.app.b bVarA = aVar.k(this.f10702r, AppCompatSpinner.this.getSelectedItemPosition(), this).a();
            this.f10701q = bVarA;
            ListView listViewM = bVarA.m();
            listViewM.setTextDirection(i10);
            listViewM.setTextAlignment(i11);
            this.f10701q.show();
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.h
        public int o() {
            return 0;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            AppCompatSpinner.this.setSelection(i10);
            if (AppCompatSpinner.this.getOnItemClickListener() != null) {
                AppCompatSpinner.this.performItemClick(null, i10, this.f10702r.getItemId(i10));
            }
            dismiss();
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.h
        public void p(ListAdapter listAdapter) {
            this.f10702r = listAdapter;
        }
    }

    private static class e implements ListAdapter, SpinnerAdapter {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private SpinnerAdapter f10705q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private ListAdapter f10706r;

        public e(SpinnerAdapter spinnerAdapter, Resources.Theme theme) {
            this.f10705q = spinnerAdapter;
            if (spinnerAdapter instanceof ListAdapter) {
                this.f10706r = (ListAdapter) spinnerAdapter;
            }
            if (theme == null || !(spinnerAdapter instanceof ThemedSpinnerAdapter)) {
                return;
            }
            c.a((ThemedSpinnerAdapter) spinnerAdapter, theme);
        }

        @Override // android.widget.ListAdapter
        public boolean areAllItemsEnabled() {
            ListAdapter listAdapter = this.f10706r;
            if (listAdapter != null) {
                return listAdapter.areAllItemsEnabled();
            }
            return true;
        }

        @Override // android.widget.Adapter
        public int getCount() {
            SpinnerAdapter spinnerAdapter = this.f10705q;
            if (spinnerAdapter == null) {
                return 0;
            }
            return spinnerAdapter.getCount();
        }

        @Override // android.widget.SpinnerAdapter
        public View getDropDownView(int i10, View view, ViewGroup viewGroup) {
            SpinnerAdapter spinnerAdapter = this.f10705q;
            if (spinnerAdapter == null) {
                return null;
            }
            return spinnerAdapter.getDropDownView(i10, view, viewGroup);
        }

        @Override // android.widget.Adapter
        public Object getItem(int i10) {
            SpinnerAdapter spinnerAdapter = this.f10705q;
            if (spinnerAdapter == null) {
                return null;
            }
            return spinnerAdapter.getItem(i10);
        }

        @Override // android.widget.Adapter
        public long getItemId(int i10) {
            SpinnerAdapter spinnerAdapter = this.f10705q;
            if (spinnerAdapter == null) {
                return -1L;
            }
            return spinnerAdapter.getItemId(i10);
        }

        @Override // android.widget.Adapter
        public int getItemViewType(int i10) {
            return 0;
        }

        @Override // android.widget.Adapter
        public View getView(int i10, View view, ViewGroup viewGroup) {
            return getDropDownView(i10, view, viewGroup);
        }

        @Override // android.widget.Adapter
        public int getViewTypeCount() {
            return 1;
        }

        @Override // android.widget.Adapter
        public boolean hasStableIds() {
            SpinnerAdapter spinnerAdapter = this.f10705q;
            return spinnerAdapter != null && spinnerAdapter.hasStableIds();
        }

        @Override // android.widget.Adapter
        public boolean isEmpty() {
            return getCount() == 0;
        }

        @Override // android.widget.ListAdapter
        public boolean isEnabled(int i10) {
            ListAdapter listAdapter = this.f10706r;
            if (listAdapter != null) {
                return listAdapter.isEnabled(i10);
            }
            return true;
        }

        @Override // android.widget.Adapter
        public void registerDataSetObserver(DataSetObserver dataSetObserver) {
            SpinnerAdapter spinnerAdapter = this.f10705q;
            if (spinnerAdapter != null) {
                spinnerAdapter.registerDataSetObserver(dataSetObserver);
            }
        }

        @Override // android.widget.Adapter
        public void unregisterDataSetObserver(DataSetObserver dataSetObserver) {
            SpinnerAdapter spinnerAdapter = this.f10705q;
            if (spinnerAdapter != null) {
                spinnerAdapter.unregisterDataSetObserver(dataSetObserver);
            }
        }
    }

    class f extends z implements h {

        /* JADX INFO: renamed from: W, reason: collision with root package name */
        private CharSequence f10707W;

        /* JADX INFO: renamed from: X, reason: collision with root package name */
        ListAdapter f10708X;

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        private final Rect f10709Y;

        /* JADX INFO: renamed from: Z, reason: collision with root package name */
        private int f10710Z;

        class a implements AdapterView.OnItemClickListener {

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            final /* synthetic */ AppCompatSpinner f10712q;

            a(AppCompatSpinner appCompatSpinner) {
                this.f10712q = appCompatSpinner;
            }

            @Override // android.widget.AdapterView.OnItemClickListener
            public void onItemClick(AdapterView adapterView, View view, int i10, long j9) {
                AppCompatSpinner.this.setSelection(i10);
                if (AppCompatSpinner.this.getOnItemClickListener() != null) {
                    f fVar = f.this;
                    AppCompatSpinner.this.performItemClick(view, i10, fVar.f10708X.getItemId(i10));
                }
                f.this.dismiss();
            }
        }

        class b implements ViewTreeObserver.OnGlobalLayoutListener {
            b() {
            }

            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public void onGlobalLayout() {
                f fVar = f.this;
                if (!fVar.V(AppCompatSpinner.this)) {
                    f.this.dismiss();
                } else {
                    f.this.T();
                    f.super.b();
                }
            }
        }

        class c implements PopupWindow.OnDismissListener {

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            final /* synthetic */ ViewTreeObserver.OnGlobalLayoutListener f10715q;

            c(ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
                this.f10715q = onGlobalLayoutListener;
            }

            @Override // android.widget.PopupWindow.OnDismissListener
            public void onDismiss() {
                ViewTreeObserver viewTreeObserver = AppCompatSpinner.this.getViewTreeObserver();
                if (viewTreeObserver != null) {
                    viewTreeObserver.removeGlobalOnLayoutListener(this.f10715q);
                }
            }
        }

        public f(Context context, AttributeSet attributeSet, int i10) {
            super(context, attributeSet, i10);
            this.f10709Y = new Rect();
            D(AppCompatSpinner.this);
            J(true);
            P(0);
            L(new a(AppCompatSpinner.this));
        }

        void T() {
            int i10;
            Drawable drawableH = h();
            if (drawableH != null) {
                drawableH.getPadding(AppCompatSpinner.this.f10697x);
                i10 = Q.b(AppCompatSpinner.this) ? AppCompatSpinner.this.f10697x.right : -AppCompatSpinner.this.f10697x.left;
            } else {
                Rect rect = AppCompatSpinner.this.f10697x;
                rect.right = 0;
                rect.left = 0;
                i10 = 0;
            }
            int paddingLeft = AppCompatSpinner.this.getPaddingLeft();
            int paddingRight = AppCompatSpinner.this.getPaddingRight();
            int width = AppCompatSpinner.this.getWidth();
            AppCompatSpinner appCompatSpinner = AppCompatSpinner.this;
            int i11 = appCompatSpinner.f10696w;
            if (i11 == -2) {
                int iA = appCompatSpinner.a((SpinnerAdapter) this.f10708X, h());
                int i12 = AppCompatSpinner.this.getContext().getResources().getDisplayMetrics().widthPixels;
                Rect rect2 = AppCompatSpinner.this.f10697x;
                int i13 = (i12 - rect2.left) - rect2.right;
                if (iA > i13) {
                    iA = i13;
                }
                F(Math.max(iA, (width - paddingLeft) - paddingRight));
            } else if (i11 == -1) {
                F((width - paddingLeft) - paddingRight);
            } else {
                F(i11);
            }
            e(Q.b(AppCompatSpinner.this) ? i10 + (((width - paddingRight) - z()) - U()) : i10 + paddingLeft + U());
        }

        public int U() {
            return this.f10710Z;
        }

        boolean V(View view) {
            return view.isAttachedToWindow() && view.getGlobalVisibleRect(this.f10709Y);
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.h
        public CharSequence f() {
            return this.f10707W;
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.h
        public void i(CharSequence charSequence) {
            this.f10707W = charSequence;
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.h
        public void m(int i10) {
            this.f10710Z = i10;
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.h
        public void n(int i10, int i11) {
            ViewTreeObserver viewTreeObserver;
            boolean zA = a();
            T();
            I(2);
            super.b();
            ListView listViewJ = j();
            listViewJ.setChoiceMode(1);
            listViewJ.setTextDirection(i10);
            listViewJ.setTextAlignment(i11);
            Q(AppCompatSpinner.this.getSelectedItemPosition());
            if (zA || (viewTreeObserver = AppCompatSpinner.this.getViewTreeObserver()) == null) {
                return;
            }
            b bVar = new b();
            viewTreeObserver.addOnGlobalLayoutListener(bVar);
            K(new c(bVar));
        }

        @Override // androidx.appcompat.widget.z, androidx.appcompat.widget.AppCompatSpinner.h
        public void p(ListAdapter listAdapter) {
            super.p(listAdapter);
            this.f10708X = listAdapter;
        }
    }

    static class g extends View.BaseSavedState {
        public static final Parcelable.Creator<g> CREATOR = new a();

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        boolean f10717q;

        class a implements Parcelable.Creator {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public g createFromParcel(Parcel parcel) {
                return new g(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public g[] newArray(int i10) {
                return new g[i10];
            }
        }

        g(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeByte(this.f10717q ? (byte) 1 : (byte) 0);
        }

        g(Parcel parcel) {
            super(parcel);
            this.f10717q = parcel.readByte() != 0;
        }
    }

    interface h {
        boolean a();

        int c();

        void dismiss();

        void e(int i10);

        CharSequence f();

        Drawable h();

        void i(CharSequence charSequence);

        void k(Drawable drawable);

        void l(int i10);

        void m(int i10);

        void n(int i10, int i11);

        int o();

        void p(ListAdapter listAdapter);
    }

    public AppCompatSpinner(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, p050f.a.f20330J);
    }

    int a(SpinnerAdapter spinnerAdapter, Drawable drawable) {
        int i10 = 0;
        if (spinnerAdapter == null) {
            return 0;
        }
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
        int iMax = Math.max(0, getSelectedItemPosition());
        int iMin = Math.min(spinnerAdapter.getCount(), iMax + 15);
        View view = null;
        int iMax2 = 0;
        for (int iMax3 = Math.max(0, iMax - (15 - (iMin - iMax))); iMax3 < iMin; iMax3++) {
            int itemViewType = spinnerAdapter.getItemViewType(iMax3);
            if (itemViewType != i10) {
                view = null;
                i10 = itemViewType;
            }
            view = spinnerAdapter.getView(iMax3, view, this);
            if (view.getLayoutParams() == null) {
                view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            }
            view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
            iMax2 = Math.max(iMax2, view.getMeasuredWidth());
        }
        if (drawable == null) {
            return iMax2;
        }
        drawable.getPadding(this.f10697x);
        Rect rect = this.f10697x;
        return iMax2 + rect.left + rect.right;
    }

    void b() {
        this.f10695v.n(getTextDirection(), getTextAlignment());
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        C1008e c1008e = this.f10690q;
        if (c1008e != null) {
            c1008e.b();
        }
    }

    @Override // android.widget.Spinner
    public int getDropDownHorizontalOffset() {
        h hVar = this.f10695v;
        return hVar != null ? hVar.c() : super.getDropDownHorizontalOffset();
    }

    @Override // android.widget.Spinner
    public int getDropDownVerticalOffset() {
        h hVar = this.f10695v;
        return hVar != null ? hVar.o() : super.getDropDownVerticalOffset();
    }

    @Override // android.widget.Spinner
    public int getDropDownWidth() {
        return this.f10695v != null ? this.f10696w : super.getDropDownWidth();
    }

    final h getInternalPopup() {
        return this.f10695v;
    }

    @Override // android.widget.Spinner
    public Drawable getPopupBackground() {
        h hVar = this.f10695v;
        return hVar != null ? hVar.h() : super.getPopupBackground();
    }

    @Override // android.widget.Spinner
    public Context getPopupContext() {
        return this.f10691r;
    }

    @Override // android.widget.Spinner
    public CharSequence getPrompt() {
        h hVar = this.f10695v;
        return hVar != null ? hVar.f() : super.getPrompt();
    }

    public ColorStateList getSupportBackgroundTintList() {
        C1008e c1008e = this.f10690q;
        if (c1008e != null) {
            return c1008e.c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C1008e c1008e = this.f10690q;
        if (c1008e != null) {
            return c1008e.d();
        }
        return null;
    }

    @Override // android.widget.Spinner, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        h hVar = this.f10695v;
        if (hVar == null || !hVar.a()) {
            return;
        }
        this.f10695v.dismiss();
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    protected void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        if (this.f10695v == null || View.MeasureSpec.getMode(i10) != Integer.MIN_VALUE) {
            return;
        }
        setMeasuredDimension(Math.min(Math.max(getMeasuredWidth(), a(getAdapter(), getBackground())), View.MeasureSpec.getSize(i10)), getMeasuredHeight());
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        ViewTreeObserver viewTreeObserver;
        g gVar = (g) parcelable;
        super.onRestoreInstanceState(gVar.getSuperState());
        if (!gVar.f10717q || (viewTreeObserver = getViewTreeObserver()) == null) {
            return;
        }
        viewTreeObserver.addOnGlobalLayoutListener(new b());
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public Parcelable onSaveInstanceState() {
        g gVar = new g(super.onSaveInstanceState());
        h hVar = this.f10695v;
        gVar.f10717q = hVar != null && hVar.a();
        return gVar;
    }

    @Override // android.widget.Spinner, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        y yVar = this.f10692s;
        if (yVar == null || !yVar.onTouch(this, motionEvent)) {
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }

    @Override // android.widget.Spinner, android.view.View
    public boolean performClick() {
        h hVar = this.f10695v;
        if (hVar == null) {
            return super.performClick();
        }
        if (hVar.a()) {
            return true;
        }
        b();
        return true;
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C1008e c1008e = this.f10690q;
        if (c1008e != null) {
            c1008e.f(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i10) {
        super.setBackgroundResource(i10);
        C1008e c1008e = this.f10690q;
        if (c1008e != null) {
            c1008e.g(i10);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownHorizontalOffset(int i10) {
        h hVar = this.f10695v;
        if (hVar == null) {
            super.setDropDownHorizontalOffset(i10);
        } else {
            hVar.m(i10);
            this.f10695v.e(i10);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownVerticalOffset(int i10) {
        h hVar = this.f10695v;
        if (hVar != null) {
            hVar.l(i10);
        } else {
            super.setDropDownVerticalOffset(i10);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownWidth(int i10) {
        if (this.f10695v != null) {
            this.f10696w = i10;
        } else {
            super.setDropDownWidth(i10);
        }
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundDrawable(Drawable drawable) {
        h hVar = this.f10695v;
        if (hVar != null) {
            hVar.k(drawable);
        } else {
            super.setPopupBackgroundDrawable(drawable);
        }
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundResource(int i10) {
        setPopupBackgroundDrawable(p060g.a.b(getPopupContext(), i10));
    }

    @Override // android.widget.Spinner
    public void setPrompt(CharSequence charSequence) {
        h hVar = this.f10695v;
        if (hVar != null) {
            hVar.i(charSequence);
        } else {
            super.setPrompt(charSequence);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C1008e c1008e = this.f10690q;
        if (c1008e != null) {
            c1008e.i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C1008e c1008e = this.f10690q;
        if (c1008e != null) {
            c1008e.j(mode);
        }
    }

    public AppCompatSpinner(Context context, AttributeSet attributeSet, int i10) {
        this(context, attributeSet, i10, -1);
    }

    @Override // android.widget.AdapterView
    public void setAdapter(SpinnerAdapter spinnerAdapter) {
        if (!this.f10694u) {
            this.f10693t = spinnerAdapter;
            return;
        }
        super.setAdapter(spinnerAdapter);
        if (this.f10695v != null) {
            Context context = this.f10691r;
            if (context == null) {
                context = getContext();
            }
            this.f10695v.p(new e(spinnerAdapter, context.getTheme()));
        }
    }

    public AppCompatSpinner(Context context, AttributeSet attributeSet, int i10, int i11) {
        this(context, attributeSet, i10, i11, null);
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0070 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:35:0x0073  */
    /* JADX WARN: Code duplicated, block: B:36:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:39:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:42:0x00db  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v10 */
    /* JADX WARN: Type inference failed for: r11v11 */
    /* JADX WARN: Type inference failed for: r11v12 */
    /* JADX WARN: Type inference failed for: r11v3 */
    /* JADX WARN: Type inference failed for: r11v4 */
    /* JADX WARN: Type inference failed for: r11v7, types: [android.content.res.TypedArray] */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4, types: [android.content.res.TypedArray] */
    /* JADX WARN: Type inference failed for: r6v0, types: [android.view.View, androidx.appcompat.widget.AppCompatSpinner] */
    public AppCompatSpinner(Context context, AttributeSet attributeSet, int i10, int i11, Resources.Theme theme) throws Throwable {
        TypedArray typedArrayObtainStyledAttributes;
        CharSequence[] charSequenceArrQ;
        SpinnerAdapter spinnerAdapter;
        super(context, attributeSet, i10);
        this.f10697x = new Rect();
        F.a(this, getContext());
        J jV = J.v(context, attributeSet, p050f.j.f20628g2, i10, 0);
        this.f10690q = new C1008e(this);
        if (theme != null) {
            this.f10691r = new androidx.appcompat.view.d(context, theme);
        } else {
            int iN = jV.n(p050f.j.f20653l2, 0);
            if (iN != 0) {
                this.f10691r = new androidx.appcompat.view.d(context, iN);
            } else {
                this.f10691r = context;
            }
        }
        ?? r11 = -1;
        ?? r9 = 0;
        try {
            if (i11 == -1) {
                try {
                    typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f10689y, i10, 0);
                    try {
                        boolean zHasValue = typedArrayObtainStyledAttributes.hasValue(0);
                        r11 = typedArrayObtainStyledAttributes;
                        if (zHasValue) {
                            i11 = typedArrayObtainStyledAttributes.getInt(0, 0);
                            r11 = typedArrayObtainStyledAttributes;
                        }
                    } catch (Exception e10) {
                        e = e10;
                        Log.i("AppCompatSpinner", "Could not read android:spinnerMode", e);
                        r11 = typedArrayObtainStyledAttributes;
                        if (typedArrayObtainStyledAttributes != null) {
                        }
                        if (i11 != 0) {
                            d dVar = new d();
                            this.f10695v = dVar;
                            dVar.i(jV.o(p050f.j.f20643j2));
                        } else if (i11 == 1) {
                            f fVar = new f(this.f10691r, attributeSet, i10);
                            J jV2 = J.v(this.f10691r, attributeSet, p050f.j.f20628g2, i10, 0);
                            this.f10696w = jV2.m(p050f.j.f20648k2, -2);
                            fVar.k(jV2.g(p050f.j.f20638i2));
                            fVar.i(jV.o(p050f.j.f20643j2));
                            jV2.x();
                            this.f10695v = fVar;
                            this.f10692s = new a(this, fVar);
                        }
                        charSequenceArrQ = jV.q(p050f.j.f20633h2);
                        if (charSequenceArrQ != null) {
                            ArrayAdapter arrayAdapter = new ArrayAdapter(context, R.layout.simple_spinner_item, charSequenceArrQ);
                            arrayAdapter.setDropDownViewResource(p050f.g.f20472q);
                            setAdapter(arrayAdapter);
                        }
                        jV.x();
                        this.f10694u = true;
                        spinnerAdapter = this.f10693t;
                        if (spinnerAdapter != null) {
                            setAdapter(spinnerAdapter);
                            this.f10693t = null;
                        }
                        this.f10690q.e(attributeSet, i10);
                    }
                } catch (Exception e11) {
                    e = e11;
                    typedArrayObtainStyledAttributes = null;
                } catch (Throwable th) {
                    th = th;
                    if (r9 != 0) {
                        r9.recycle();
                    }
                    throw th;
                }
                r11.recycle();
            }
            if (i11 != 0) {
                d dVar2 = new d();
                this.f10695v = dVar2;
                dVar2.i(jV.o(p050f.j.f20643j2));
            } else if (i11 == 1) {
                f fVar2 = new f(this.f10691r, attributeSet, i10);
                J jV3 = J.v(this.f10691r, attributeSet, p050f.j.f20628g2, i10, 0);
                this.f10696w = jV3.m(p050f.j.f20648k2, -2);
                fVar2.k(jV3.g(p050f.j.f20638i2));
                fVar2.i(jV.o(p050f.j.f20643j2));
                jV3.x();
                this.f10695v = fVar2;
                this.f10692s = new a(this, fVar2);
            }
            charSequenceArrQ = jV.q(p050f.j.f20633h2);
            if (charSequenceArrQ != null) {
                ArrayAdapter arrayAdapter2 = new ArrayAdapter(context, R.layout.simple_spinner_item, charSequenceArrQ);
                arrayAdapter2.setDropDownViewResource(p050f.g.f20472q);
                setAdapter(arrayAdapter2);
            }
            jV.x();
            this.f10694u = true;
            spinnerAdapter = this.f10693t;
            if (spinnerAdapter != null) {
                setAdapter(spinnerAdapter);
                this.f10693t = null;
            }
            this.f10690q.e(attributeSet, i10);
        } catch (Throwable th2) {
            th = th2;
            r9 = r11;
        }
    }
}
