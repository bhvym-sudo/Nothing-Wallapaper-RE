package androidx.appcompat.widget;

import android.app.SearchableInfo;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ImageSpan;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.widget.AutoCompleteTextView;
import android.widget.ImageView;
import androidx.constraintlayout.core.widgets.analyzer.BasicMeasure;
import com.bumptech.glide.load.engine.bitmap_recycle.ArrayPool;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public class SearchView extends LinearLayoutCompat implements androidx.appcompat.view.c {

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    static final e f10868u0 = null;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    final SearchAutoComplete f10869F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private final View f10870G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private final View f10871H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    final ImageView f10872I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    final ImageView f10873J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    final ImageView f10874K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    final ImageView f10875L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    private g f10876M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    private Rect f10877N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private Rect f10878O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    private int[] f10879P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    private int[] f10880Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    private final ImageView f10881R;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    private final Drawable f10882S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    private final int f10883T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    private final int f10884U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    private final Intent f10885V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    private final Intent f10886W;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    private final CharSequence f10887a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    View.OnFocusChangeListener f10888b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    private View.OnClickListener f10889c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    private boolean f10890d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    private boolean f10891e0;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    F0.a f10892f0;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    private boolean f10893g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    private CharSequence f10894h0;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    private boolean f10895i0;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    private boolean f10896j0;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    private int f10897k0;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    private boolean f10898l0;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    private CharSequence f10899m0;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    private boolean f10900n0;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    private int f10901o0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    SearchableInfo f10902p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    private Bundle f10903q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    private final Runnable f10904r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    private Runnable f10905s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    private final WeakHashMap f10906t0;

    public static class SearchAutoComplete extends AppCompatAutoCompleteTextView {

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        private int f10907u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        private SearchView f10908v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        private boolean f10909w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        final Runnable f10910x;

        class a implements Runnable {
            a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                SearchAutoComplete.this.c();
            }
        }

        public SearchAutoComplete(Context context, AttributeSet attributeSet) {
            this(context, attributeSet, p050f.a.f20349o);
        }

        private int getSearchViewTextMinWidthDp() {
            Configuration configuration = getResources().getConfiguration();
            int i10 = configuration.screenWidthDp;
            int i11 = configuration.screenHeightDp;
            if (i10 >= 960 && i11 >= 720 && configuration.orientation == 2) {
                return 256;
            }
            if (i10 < 600) {
                return (i10 < 640 || i11 < 480) ? 160 : 192;
            }
            return 192;
        }

        void b() {
            a.b(this, 1);
            if (enoughToFilter()) {
                showDropDown();
            }
        }

        void c() {
            if (this.f10909w) {
                ((InputMethodManager) getContext().getSystemService("input_method")).showSoftInput(this, 0);
                this.f10909w = false;
            }
        }

        @Override // android.widget.AutoCompleteTextView
        public boolean enoughToFilter() {
            return this.f10907u <= 0 || super.enoughToFilter();
        }

        @Override // androidx.appcompat.widget.AppCompatAutoCompleteTextView, android.widget.TextView, android.view.View
        public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
            InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
            if (this.f10909w) {
                removeCallbacks(this.f10910x);
                post(this.f10910x);
            }
            return inputConnectionOnCreateInputConnection;
        }

        @Override // android.view.View
        protected void onFinishInflate() {
            super.onFinishInflate();
            setMinWidth((int) TypedValue.applyDimension(1, getSearchViewTextMinWidthDp(), getResources().getDisplayMetrics()));
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        protected void onFocusChanged(boolean z9, int i10, Rect rect) {
            super.onFocusChanged(z9, i10, rect);
            this.f10908v.P();
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public boolean onKeyPreIme(int i10, KeyEvent keyEvent) {
            if (i10 == 4) {
                if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                    KeyEvent.DispatcherState keyDispatcherState = getKeyDispatcherState();
                    if (keyDispatcherState != null) {
                        keyDispatcherState.startTracking(keyEvent, this);
                    }
                    return true;
                }
                if (keyEvent.getAction() == 1) {
                    KeyEvent.DispatcherState keyDispatcherState2 = getKeyDispatcherState();
                    if (keyDispatcherState2 != null) {
                        keyDispatcherState2.handleUpEvent(keyEvent);
                    }
                    if (keyEvent.isTracking() && !keyEvent.isCanceled()) {
                        this.f10908v.clearFocus();
                        setImeVisibility(false);
                        return true;
                    }
                }
            }
            return super.onKeyPreIme(i10, keyEvent);
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public void onWindowFocusChanged(boolean z9) {
            super.onWindowFocusChanged(z9);
            if (z9 && this.f10908v.hasFocus() && getVisibility() == 0) {
                this.f10909w = true;
                if (SearchView.I(getContext())) {
                    b();
                }
            }
        }

        @Override // android.widget.AutoCompleteTextView
        public void performCompletion() {
        }

        @Override // android.widget.AutoCompleteTextView
        protected void replaceText(CharSequence charSequence) {
        }

        void setImeVisibility(boolean z9) {
            InputMethodManager inputMethodManager = (InputMethodManager) getContext().getSystemService("input_method");
            if (!z9) {
                this.f10909w = false;
                removeCallbacks(this.f10910x);
                inputMethodManager.hideSoftInputFromWindow(getWindowToken(), 0);
            } else {
                if (!inputMethodManager.isActive(this)) {
                    this.f10909w = true;
                    return;
                }
                this.f10909w = false;
                removeCallbacks(this.f10910x);
                inputMethodManager.showSoftInput(this, 0);
            }
        }

        void setSearchView(SearchView searchView) {
            this.f10908v = searchView;
        }

        @Override // android.widget.AutoCompleteTextView
        public void setThreshold(int i10) {
            super.setThreshold(i10);
            this.f10907u = i10;
        }

        public SearchAutoComplete(Context context, AttributeSet attributeSet, int i10) {
            super(context, attributeSet, i10);
            this.f10910x = new a();
            this.f10907u = getThreshold();
        }
    }

    static class a {
        static void a(AutoCompleteTextView autoCompleteTextView) {
            autoCompleteTextView.refreshAutoCompleteResults();
        }

        static void b(SearchAutoComplete searchAutoComplete, int i10) {
            searchAutoComplete.setInputMethodMode(i10);
        }
    }

    public interface b {
    }

    public interface c {
    }

    public interface d {
    }

    private static class e {
    }

    static class f extends H0.a {
        public static final Parcelable.Creator<f> CREATOR = new a();

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        boolean f10912q;

        class a implements Parcelable.ClassLoaderCreator {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public f createFromParcel(Parcel parcel) {
                return new f(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public f createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new f(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public f[] newArray(int i10) {
                return new f[i10];
            }
        }

        f(Parcelable parcelable) {
            super(parcelable);
        }

        public String toString() {
            return "SearchView.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " isIconified=" + this.f10912q + "}";
        }

        @Override // H0.a, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeValue(Boolean.valueOf(this.f10912q));
        }

        public f(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f10912q = ((Boolean) parcel.readValue(null)).booleanValue();
        }
    }

    private static class g extends TouchDelegate {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final View f10913a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Rect f10914b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Rect f10915c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final Rect f10916d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final int f10917e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private boolean f10918f;

        public g(Rect rect, Rect rect2, View view) {
            super(rect, view);
            this.f10917e = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
            this.f10914b = new Rect();
            this.f10916d = new Rect();
            this.f10915c = new Rect();
            a(rect, rect2);
            this.f10913a = view;
        }

        public void a(Rect rect, Rect rect2) {
            this.f10914b.set(rect);
            this.f10916d.set(rect);
            Rect rect3 = this.f10916d;
            int i10 = this.f10917e;
            rect3.inset(-i10, -i10);
            this.f10915c.set(rect2);
        }

        /* JADX WARN: Code duplicated, block: B:19:0x003e  */
        @Override // android.view.TouchDelegate
        public boolean onTouchEvent(MotionEvent motionEvent) {
            boolean z9;
            boolean z10;
            int x9 = (int) motionEvent.getX();
            int y9 = (int) motionEvent.getY();
            int action = motionEvent.getAction();
            boolean z11 = true;
            if (action != 0) {
                if (action == 1 || action == 2) {
                    z10 = this.f10918f;
                    if (z10 && !this.f10916d.contains(x9, y9)) {
                        z11 = z10;
                        z9 = false;
                    }
                } else if (action != 3) {
                    z9 = true;
                    z11 = false;
                } else {
                    z10 = this.f10918f;
                    this.f10918f = false;
                }
                z11 = z10;
                z9 = true;
            } else if (this.f10914b.contains(x9, y9)) {
                this.f10918f = true;
                z9 = true;
            } else {
                z9 = true;
                z11 = false;
            }
            if (!z11) {
                return false;
            }
            if (!z9 || this.f10915c.contains(x9, y9)) {
                Rect rect = this.f10915c;
                motionEvent.setLocation(x9 - rect.left, y9 - rect.top);
            } else {
                motionEvent.setLocation(this.f10913a.getWidth() / 2, this.f10913a.getHeight() / 2);
            }
            return this.f10913a.dispatchTouchEvent(motionEvent);
        }
    }

    private Intent B(String str, Uri uri, String str2, String str3, int i10, String str4) {
        Intent intent = new Intent(str);
        intent.addFlags(268435456);
        if (uri != null) {
            intent.setData(uri);
        }
        intent.putExtra("user_query", this.f10899m0);
        if (str3 != null) {
            intent.putExtra("query", str3);
        }
        if (str2 != null) {
            intent.putExtra("intent_extra_data_key", str2);
        }
        Bundle bundle = this.f10903q0;
        if (bundle != null) {
            intent.putExtra("app_data", bundle);
        }
        if (i10 != 0) {
            intent.putExtra("action_key", i10);
            intent.putExtra("action_msg", str4);
        }
        intent.setComponent(this.f10902p0.getSearchActivity());
        return intent;
    }

    private void C() {
        this.f10869F.dismissDropDown();
    }

    private void E(View view, Rect rect) {
        view.getLocationInWindow(this.f10879P);
        getLocationInWindow(this.f10880Q);
        int[] iArr = this.f10879P;
        int i10 = iArr[1];
        int[] iArr2 = this.f10880Q;
        int i11 = i10 - iArr2[1];
        int i12 = iArr[0] - iArr2[0];
        rect.set(i12, i11, view.getWidth() + i12, view.getHeight() + i11);
    }

    private CharSequence F(CharSequence charSequence) {
        if (!this.f10890d0 || this.f10882S == null) {
            return charSequence;
        }
        int textSize = (int) (((double) this.f10869F.getTextSize()) * 1.25d);
        this.f10882S.setBounds(0, 0, textSize, textSize);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("   ");
        spannableStringBuilder.setSpan(new ImageSpan(this.f10882S), 1, 2, 33);
        spannableStringBuilder.append(charSequence);
        return spannableStringBuilder;
    }

    private boolean G() {
        Intent intent;
        SearchableInfo searchableInfo = this.f10902p0;
        if (searchableInfo != null && searchableInfo.getVoiceSearchEnabled()) {
            if (this.f10902p0.getVoiceSearchLaunchWebSearch()) {
                intent = this.f10885V;
            } else {
                intent = this.f10902p0.getVoiceSearchLaunchRecognizer() ? this.f10886W : null;
            }
            if (intent != null && getContext().getPackageManager().resolveActivity(intent, ArrayPool.STANDARD_BUFFER_SIZE_BYTES) != null) {
                return true;
            }
        }
        return false;
    }

    static boolean I(Context context) {
        return context.getResources().getConfiguration().orientation == 2;
    }

    private boolean J() {
        return (this.f10893g0 || this.f10898l0) && !H();
    }

    private void Q() {
        post(this.f10904r0);
    }

    private void S() {
        boolean zIsEmpty = TextUtils.isEmpty(this.f10869F.getText());
        this.f10874K.setVisibility(!zIsEmpty || (this.f10890d0 && !this.f10900n0) ? 0 : 8);
        Drawable drawable = this.f10874K.getDrawable();
        if (drawable != null) {
            drawable.setState(!zIsEmpty ? ViewGroup.ENABLED_STATE_SET : ViewGroup.EMPTY_STATE_SET);
        }
    }

    private void T() {
        CharSequence queryHint = getQueryHint();
        SearchAutoComplete searchAutoComplete = this.f10869F;
        if (queryHint == null) {
            queryHint = "";
        }
        searchAutoComplete.setHint(F(queryHint));
    }

    private void U() {
        this.f10869F.setThreshold(this.f10902p0.getSuggestThreshold());
        this.f10869F.setImeOptions(this.f10902p0.getImeOptions());
        int inputType = this.f10902p0.getInputType();
        if ((inputType & 15) == 1) {
            inputType &= -65537;
            if (this.f10902p0.getSuggestAuthority() != null) {
                inputType |= 589824;
            }
        }
        this.f10869F.setInputType(inputType);
        F0.a aVar = this.f10892f0;
        if (aVar != null) {
            aVar.changeCursor(null);
        }
        if (this.f10902p0.getSuggestAuthority() != null) {
            E e10 = new E(getContext(), this, this.f10902p0, this.f10906t0);
            this.f10892f0 = e10;
            this.f10869F.setAdapter(e10);
            ((E) this.f10892f0).t(this.f10895i0 ? 2 : 1);
        }
    }

    private void V() {
        this.f10871H.setVisibility((J() && (this.f10873J.getVisibility() == 0 || this.f10875L.getVisibility() == 0)) ? 0 : 8);
    }

    private void W(boolean z9) {
        this.f10873J.setVisibility((this.f10893g0 && J() && hasFocus() && (z9 || !this.f10898l0)) ? 0 : 8);
    }

    private void X(boolean z9) {
        this.f10891e0 = z9;
        int i10 = 8;
        int i11 = z9 ? 0 : 8;
        boolean zIsEmpty = TextUtils.isEmpty(this.f10869F.getText());
        this.f10872I.setVisibility(i11);
        W(!zIsEmpty);
        this.f10870G.setVisibility(z9 ? 8 : 0);
        if (this.f10881R.getDrawable() != null && !this.f10890d0) {
            i10 = 0;
        }
        this.f10881R.setVisibility(i10);
        S();
        Y(zIsEmpty);
        V();
    }

    private void Y(boolean z9) {
        int i10 = 8;
        if (this.f10898l0 && !H() && z9) {
            this.f10873J.setVisibility(8);
            i10 = 0;
        }
        this.f10875L.setVisibility(i10);
    }

    private int getPreferredHeight() {
        return getContext().getResources().getDimensionPixelSize(p050f.d.f20374e);
    }

    private int getPreferredWidth() {
        return getContext().getResources().getDimensionPixelSize(p050f.d.f20375f);
    }

    private void setQuery(CharSequence charSequence) {
        this.f10869F.setText(charSequence);
        this.f10869F.setSelection(TextUtils.isEmpty(charSequence) ? 0 : charSequence.length());
    }

    void D() {
        a.a(this.f10869F);
    }

    public boolean H() {
        return this.f10891e0;
    }

    void K(int i10, String str, String str2) {
        getContext().startActivity(B("android.intent.action.SEARCH", null, null, str2, i10, str));
    }

    void L() {
        if (!TextUtils.isEmpty(this.f10869F.getText())) {
            this.f10869F.setText("");
            this.f10869F.requestFocus();
            this.f10869F.setImeVisibility(true);
        } else if (this.f10890d0) {
            clearFocus();
            X(true);
        }
    }

    protected void M(CharSequence charSequence) {
        setQuery(charSequence);
    }

    void N() {
        X(false);
        this.f10869F.requestFocus();
        this.f10869F.setImeVisibility(true);
        View.OnClickListener onClickListener = this.f10889c0;
        if (onClickListener != null) {
            onClickListener.onClick(this);
        }
    }

    void O() {
        Editable text = this.f10869F.getText();
        if (text == null || TextUtils.getTrimmedLength(text) <= 0) {
            return;
        }
        if (this.f10902p0 != null) {
            K(0, null, text.toString());
        }
        this.f10869F.setImeVisibility(false);
        C();
    }

    void P() {
        X(H());
        Q();
        if (this.f10869F.hasFocus()) {
            D();
        }
    }

    public void R(CharSequence charSequence, boolean z9) {
        this.f10869F.setText(charSequence);
        if (charSequence != null) {
            SearchAutoComplete searchAutoComplete = this.f10869F;
            searchAutoComplete.setSelection(searchAutoComplete.length());
            this.f10899m0 = charSequence;
        }
        if (!z9 || TextUtils.isEmpty(charSequence)) {
            return;
        }
        O();
    }

    @Override // androidx.appcompat.view.c
    public void c() {
        if (this.f10900n0) {
            return;
        }
        this.f10900n0 = true;
        int imeOptions = this.f10869F.getImeOptions();
        this.f10901o0 = imeOptions;
        this.f10869F.setImeOptions(imeOptions | 33554432);
        this.f10869F.setText("");
        setIconified(false);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void clearFocus() {
        this.f10896j0 = true;
        super.clearFocus();
        this.f10869F.clearFocus();
        this.f10869F.setImeVisibility(false);
        this.f10896j0 = false;
    }

    @Override // androidx.appcompat.view.c
    public void f() {
        R("", false);
        clearFocus();
        X(true);
        this.f10869F.setImeOptions(this.f10901o0);
        this.f10900n0 = false;
    }

    public int getImeOptions() {
        return this.f10869F.getImeOptions();
    }

    public int getInputType() {
        return this.f10869F.getInputType();
    }

    public int getMaxWidth() {
        return this.f10897k0;
    }

    public CharSequence getQuery() {
        return this.f10869F.getText();
    }

    public CharSequence getQueryHint() {
        CharSequence charSequence = this.f10894h0;
        if (charSequence != null) {
            return charSequence;
        }
        SearchableInfo searchableInfo = this.f10902p0;
        return (searchableInfo == null || searchableInfo.getHintId() == 0) ? this.f10887a0 : getContext().getText(this.f10902p0.getHintId());
    }

    int getSuggestionCommitIconResId() {
        return this.f10884U;
    }

    int getSuggestionRowLayout() {
        return this.f10883T;
    }

    public F0.a getSuggestionsAdapter() {
        return this.f10892f0;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        removeCallbacks(this.f10904r0);
        post(this.f10905s0);
        super.onDetachedFromWindow();
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z9, int i10, int i11, int i12, int i13) {
        super.onLayout(z9, i10, i11, i12, i13);
        if (z9) {
            E(this.f10869F, this.f10877N);
            Rect rect = this.f10878O;
            Rect rect2 = this.f10877N;
            rect.set(rect2.left, 0, rect2.right, i13 - i11);
            g gVar = this.f10876M;
            if (gVar != null) {
                gVar.a(this.f10878O, this.f10877N);
                return;
            }
            g gVar2 = new g(this.f10878O, this.f10877N, this.f10869F);
            this.f10876M = gVar2;
            setTouchDelegate(gVar2);
        }
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.View
    protected void onMeasure(int i10, int i11) {
        int i12;
        if (H()) {
            super.onMeasure(i10, i11);
            return;
        }
        int mode = View.MeasureSpec.getMode(i10);
        int size = View.MeasureSpec.getSize(i10);
        if (mode == Integer.MIN_VALUE) {
            int i13 = this.f10897k0;
            size = i13 > 0 ? Math.min(i13, size) : Math.min(getPreferredWidth(), size);
        } else if (mode == 0) {
            size = this.f10897k0;
            if (size <= 0) {
                size = getPreferredWidth();
            }
        } else if (mode == 1073741824 && (i12 = this.f10897k0) > 0) {
            size = Math.min(i12, size);
        }
        int mode2 = View.MeasureSpec.getMode(i11);
        int size2 = View.MeasureSpec.getSize(i11);
        if (mode2 == Integer.MIN_VALUE) {
            size2 = Math.min(getPreferredHeight(), size2);
        } else if (mode2 == 0) {
            size2 = getPreferredHeight();
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, BasicMeasure.EXACTLY), View.MeasureSpec.makeMeasureSpec(size2, BasicMeasure.EXACTLY));
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof f)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        f fVar = (f) parcelable;
        super.onRestoreInstanceState(fVar.getSuperState());
        X(fVar.f10912q);
        requestLayout();
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        f fVar = new f(super.onSaveInstanceState());
        fVar.f10912q = H();
        return fVar;
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z9) {
        super.onWindowFocusChanged(z9);
        Q();
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean requestFocus(int i10, Rect rect) {
        if (this.f10896j0 || !isFocusable()) {
            return false;
        }
        if (H()) {
            return super.requestFocus(i10, rect);
        }
        boolean zRequestFocus = this.f10869F.requestFocus(i10, rect);
        if (zRequestFocus) {
            X(false);
        }
        return zRequestFocus;
    }

    public void setAppSearchData(Bundle bundle) {
        this.f10903q0 = bundle;
    }

    public void setIconified(boolean z9) {
        if (z9) {
            L();
        } else {
            N();
        }
    }

    public void setIconifiedByDefault(boolean z9) {
        if (this.f10890d0 == z9) {
            return;
        }
        this.f10890d0 = z9;
        X(z9);
        T();
    }

    public void setImeOptions(int i10) {
        this.f10869F.setImeOptions(i10);
    }

    public void setInputType(int i10) {
        this.f10869F.setInputType(i10);
    }

    public void setMaxWidth(int i10) {
        this.f10897k0 = i10;
        requestLayout();
    }

    public void setOnCloseListener(b bVar) {
    }

    public void setOnQueryTextFocusChangeListener(View.OnFocusChangeListener onFocusChangeListener) {
        this.f10888b0 = onFocusChangeListener;
    }

    public void setOnQueryTextListener(c cVar) {
    }

    public void setOnSearchClickListener(View.OnClickListener onClickListener) {
        this.f10889c0 = onClickListener;
    }

    public void setOnSuggestionListener(d dVar) {
    }

    public void setQueryHint(CharSequence charSequence) {
        this.f10894h0 = charSequence;
        T();
    }

    public void setQueryRefinementEnabled(boolean z9) {
        this.f10895i0 = z9;
        F0.a aVar = this.f10892f0;
        if (aVar instanceof E) {
            ((E) aVar).t(z9 ? 2 : 1);
        }
    }

    public void setSearchableInfo(SearchableInfo searchableInfo) {
        this.f10902p0 = searchableInfo;
        if (searchableInfo != null) {
            U();
            T();
        }
        boolean zG = G();
        this.f10898l0 = zG;
        if (zG) {
            this.f10869F.setPrivateImeOptions("nm");
        }
        X(H());
    }

    public void setSubmitButtonEnabled(boolean z9) {
        this.f10893g0 = z9;
        X(H());
    }

    public void setSuggestionsAdapter(F0.a aVar) {
        this.f10892f0 = aVar;
        this.f10869F.setAdapter(aVar);
    }
}
