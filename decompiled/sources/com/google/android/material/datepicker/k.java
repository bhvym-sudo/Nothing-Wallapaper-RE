package com.google.android.material.datepicker;

import android.R;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.view.H;
import androidx.core.view.InterfaceC1090w;
import androidx.core.view.V;
import androidx.fragment.app.DialogInterfaceOnCancelListenerC1130o;
import androidx.fragment.app.S;
import com.google.android.material.internal.CheckableImageButton;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: classes.dex */
public final class k<S> extends DialogInterfaceOnCancelListenerC1130o {

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    static final Object f16915i0 = "CONFIRM_BUTTON_TAG";

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    static final Object f16916j0 = "CANCEL_BUTTON_TAG";

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    static final Object f16917k0 = "TOGGLE_BUTTON_TAG";

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private final LinkedHashSet f16918G = new LinkedHashSet();

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private final LinkedHashSet f16919H = new LinkedHashSet();

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private final LinkedHashSet f16920I = new LinkedHashSet();

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    private final LinkedHashSet f16921J = new LinkedHashSet();

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    private int f16922K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    private q f16923L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    private com.google.android.material.datepicker.a f16924M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    private i f16925N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private int f16926O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    private CharSequence f16927P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    private boolean f16928Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    private int f16929R;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    private int f16930S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    private CharSequence f16931T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    private int f16932U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    private CharSequence f16933V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    private int f16934W;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    private CharSequence f16935X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    private int f16936Y;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    private CharSequence f16937Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    private TextView f16938a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    private TextView f16939b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    private CheckableImageButton f16940c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    private N4.h f16941d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    private Button f16942e0;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    private boolean f16943f0;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    private CharSequence f16944g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    private CharSequence f16945h0;

    class a implements InterfaceC1090w {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f16946a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ View f16947b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f16948c;

        a(int i10, View view, int i11) {
            this.f16946a = i10;
            this.f16947b = view;
            this.f16948c = i11;
        }

        @Override // androidx.core.view.InterfaceC1090w
        public V onApplyWindowInsets(View view, V v9) {
            int i10 = v9.f(V.k.f()).f27863b;
            if (this.f16946a >= 0) {
                this.f16947b.getLayoutParams().height = this.f16946a + i10;
                View view2 = this.f16947b;
                view2.setLayoutParams(view2.getLayoutParams());
            }
            View view3 = this.f16947b;
            view3.setPadding(view3.getPaddingLeft(), this.f16948c + i10, this.f16947b.getPaddingRight(), this.f16947b.getPaddingBottom());
            return v9;
        }
    }

    class b extends p {
        b() {
        }
    }

    private int A0(Context context) {
        int i10 = this.f16922K;
        if (i10 != 0) {
            return i10;
        }
        v0();
        throw null;
    }

    private void B0(Context context) {
        this.f16940c0.setTag(f16917k0);
        this.f16940c0.setImageDrawable(t0(context));
        this.f16940c0.setChecked(this.f16929R != 0);
        H.g0(this.f16940c0, null);
        J0(this.f16940c0);
        this.f16940c0.setOnClickListener(new View.OnClickListener() { // from class: com.google.android.material.datepicker.j
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                k.s0(this.f16914q, view);
            }
        });
    }

    static boolean C0(Context context) {
        return F0(context, R.attr.windowFullscreen);
    }

    private boolean D0() {
        return getResources().getConfiguration().orientation == 2;
    }

    static boolean E0(Context context) {
        return F0(context, p225w4.a.f28680O);
    }

    static boolean F0(Context context, int i10) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(K4.b.d(context, p225w4.a.f28723z, i.class.getCanonicalName()), new int[]{i10});
        boolean z9 = typedArrayObtainStyledAttributes.getBoolean(0, false);
        typedArrayObtainStyledAttributes.recycle();
        return z9;
    }

    private void G0() {
        int iA0 = A0(requireContext());
        v0();
        i iVarT0 = i.t0(null, iA0, this.f16924M, null);
        this.f16925N = iVarT0;
        q qVarF0 = iVarT0;
        if (this.f16929R == 1) {
            v0();
            qVarF0 = l.f0(null, iA0, this.f16924M);
        }
        this.f16923L = qVarF0;
        I0();
        H0(y0());
        S sP = getChildFragmentManager().p();
        sP.r(p225w4.e.f28801A, this.f16923L);
        sP.k();
        this.f16923L.d0(new b());
    }

    private void I0() {
        this.f16938a0.setText((this.f16929R == 1 && D0()) ? this.f16945h0 : this.f16944g0);
    }

    private void J0(CheckableImageButton checkableImageButton) {
        this.f16940c0.setContentDescription(this.f16929R == 1 ? checkableImageButton.getContext().getString(p225w4.i.f28900w) : checkableImageButton.getContext().getString(p225w4.i.f28902y));
    }

    public static /* synthetic */ void s0(k kVar, View view) {
        kVar.v0();
        throw null;
    }

    private static Drawable t0(Context context) {
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{R.attr.state_checked}, p060g.a.b(context, p225w4.d.f28792b));
        stateListDrawable.addState(new int[0], p060g.a.b(context, p225w4.d.f28793c));
        return stateListDrawable;
    }

    private void u0(Window window) {
        if (this.f16943f0) {
            return;
        }
        View viewFindViewById = requireView().findViewById(p225w4.e.f28830i);
        com.google.android.material.internal.c.a(window, true, com.google.android.material.internal.n.d(viewFindViewById), null);
        H.u0(viewFindViewById, new a(viewFindViewById.getLayoutParams().height, viewFindViewById, viewFindViewById.getPaddingTop()));
        this.f16943f0 = true;
    }

    private d v0() {
        androidx.appcompat.app.o.a(getArguments().getParcelable("DATE_SELECTOR_KEY"));
        return null;
    }

    private static CharSequence w0(CharSequence charSequence) {
        if (charSequence == null) {
            return null;
        }
        String[] strArrSplit = TextUtils.split(String.valueOf(charSequence), "\n");
        return strArrSplit.length > 1 ? strArrSplit[0] : charSequence;
    }

    private String x0() {
        v0();
        requireContext();
        throw null;
    }

    private static int z0(Context context) {
        Resources resources = context.getResources();
        int dimensionPixelOffset = resources.getDimensionPixelOffset(p225w4.c.f28745P);
        int i10 = m.g().f16957t;
        return (dimensionPixelOffset * 2) + (resources.getDimensionPixelSize(p225w4.c.f28747R) * i10) + ((i10 - 1) * resources.getDimensionPixelOffset(p225w4.c.f28750U));
    }

    void H0(String str) {
        this.f16939b0.setContentDescription(x0());
        this.f16939b0.setText(str);
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC1130o
    public final Dialog k0(Bundle bundle) {
        Dialog dialog = new Dialog(requireContext(), A0(requireContext()));
        Context context = dialog.getContext();
        this.f16928Q = C0(context);
        int i10 = p225w4.a.f28723z;
        int i11 = p225w4.j.f28926w;
        this.f16941d0 = new N4.h(context, null, i10, i11);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(null, p225w4.k.f29058N3, i10, i11);
        int color = typedArrayObtainStyledAttributes.getColor(p225w4.k.f29067O3, 0);
        typedArrayObtainStyledAttributes.recycle();
        this.f16941d0.K(context);
        this.f16941d0.V(ColorStateList.valueOf(color));
        this.f16941d0.U(H.r(dialog.getWindow().getDecorView()));
        return dialog;
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC1130o, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        Iterator it = this.f16920I.iterator();
        while (it.hasNext()) {
            ((DialogInterface.OnCancelListener) it.next()).onCancel(dialogInterface);
        }
        super.onCancel(dialogInterface);
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC1130o, androidx.fragment.app.AbstractComponentCallbacksC1132q
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            bundle = getArguments();
        }
        this.f16922K = bundle.getInt("OVERRIDE_THEME_RES_ID");
        androidx.appcompat.app.o.a(bundle.getParcelable("DATE_SELECTOR_KEY"));
        this.f16924M = (com.google.android.material.datepicker.a) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        androidx.appcompat.app.o.a(bundle.getParcelable("DAY_VIEW_DECORATOR_KEY"));
        this.f16926O = bundle.getInt("TITLE_TEXT_RES_ID_KEY");
        this.f16927P = bundle.getCharSequence("TITLE_TEXT_KEY");
        this.f16929R = bundle.getInt("INPUT_MODE_KEY");
        this.f16930S = bundle.getInt("POSITIVE_BUTTON_TEXT_RES_ID_KEY");
        this.f16931T = bundle.getCharSequence("POSITIVE_BUTTON_TEXT_KEY");
        this.f16932U = bundle.getInt("POSITIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY");
        this.f16933V = bundle.getCharSequence("POSITIVE_BUTTON_CONTENT_DESCRIPTION_KEY");
        this.f16934W = bundle.getInt("NEGATIVE_BUTTON_TEXT_RES_ID_KEY");
        this.f16935X = bundle.getCharSequence("NEGATIVE_BUTTON_TEXT_KEY");
        this.f16936Y = bundle.getInt("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY");
        this.f16937Z = bundle.getCharSequence("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_KEY");
        CharSequence text = this.f16927P;
        if (text == null) {
            text = requireContext().getResources().getText(this.f16926O);
        }
        this.f16944g0 = text;
        this.f16945h0 = w0(text);
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1132q
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewInflate = layoutInflater.inflate(this.f16928Q ? p225w4.g.f28874y : p225w4.g.f28873x, viewGroup);
        Context context = viewInflate.getContext();
        if (this.f16928Q) {
            viewInflate.findViewById(p225w4.e.f28801A).setLayoutParams(new LinearLayout.LayoutParams(z0(context), -2));
        } else {
            viewInflate.findViewById(p225w4.e.f28802B).setLayoutParams(new LinearLayout.LayoutParams(z0(context), -1));
        }
        TextView textView = (TextView) viewInflate.findViewById(p225w4.e.f28805E);
        this.f16939b0 = textView;
        H.i0(textView, 1);
        this.f16940c0 = (CheckableImageButton) viewInflate.findViewById(p225w4.e.f28806F);
        this.f16938a0 = (TextView) viewInflate.findViewById(p225w4.e.f28807G);
        B0(context);
        this.f16942e0 = (Button) viewInflate.findViewById(p225w4.e.f28825d);
        v0();
        throw null;
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC1130o, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        Iterator it = this.f16921J.iterator();
        while (it.hasNext()) {
            ((DialogInterface.OnDismissListener) it.next()).onDismiss(dialogInterface);
        }
        ViewGroup viewGroup = (ViewGroup) getView();
        if (viewGroup != null) {
            viewGroup.removeAllViews();
        }
        super.onDismiss(dialogInterface);
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC1130o, androidx.fragment.app.AbstractComponentCallbacksC1132q
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt("OVERRIDE_THEME_RES_ID", this.f16922K);
        bundle.putParcelable("DATE_SELECTOR_KEY", null);
        com.google.android.material.datepicker.a.b bVar = new com.google.android.material.datepicker.a.b(this.f16924M);
        i iVar = this.f16925N;
        m mVarO0 = iVar == null ? null : iVar.o0();
        if (mVarO0 != null) {
            bVar.b(mVarO0.f16959v);
        }
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", bVar.a());
        bundle.putParcelable("DAY_VIEW_DECORATOR_KEY", null);
        bundle.putInt("TITLE_TEXT_RES_ID_KEY", this.f16926O);
        bundle.putCharSequence("TITLE_TEXT_KEY", this.f16927P);
        bundle.putInt("INPUT_MODE_KEY", this.f16929R);
        bundle.putInt("POSITIVE_BUTTON_TEXT_RES_ID_KEY", this.f16930S);
        bundle.putCharSequence("POSITIVE_BUTTON_TEXT_KEY", this.f16931T);
        bundle.putInt("POSITIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY", this.f16932U);
        bundle.putCharSequence("POSITIVE_BUTTON_CONTENT_DESCRIPTION_KEY", this.f16933V);
        bundle.putInt("NEGATIVE_BUTTON_TEXT_RES_ID_KEY", this.f16934W);
        bundle.putCharSequence("NEGATIVE_BUTTON_TEXT_KEY", this.f16935X);
        bundle.putInt("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY", this.f16936Y);
        bundle.putCharSequence("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_KEY", this.f16937Z);
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC1130o, androidx.fragment.app.AbstractComponentCallbacksC1132q
    public void onStart() {
        super.onStart();
        Window window = o0().getWindow();
        if (this.f16928Q) {
            window.setLayout(-1, -1);
            window.setBackgroundDrawable(this.f16941d0);
            u0(window);
        } else {
            window.setLayout(-2, -2);
            int dimensionPixelOffset = getResources().getDimensionPixelOffset(p225w4.c.f28749T);
            Rect rect = new Rect(dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset);
            window.setBackgroundDrawable(new InsetDrawable((Drawable) this.f16941d0, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset));
            window.getDecorView().setOnTouchListener(new E4.a(o0(), rect));
        }
        G0();
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC1130o, androidx.fragment.app.AbstractComponentCallbacksC1132q
    public void onStop() {
        this.f16923L.e0();
        super.onStop();
    }

    public String y0() {
        v0();
        getContext();
        throw null;
    }
}
