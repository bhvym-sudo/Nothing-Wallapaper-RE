package androidx.fragment.app;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.lifecycle.InterfaceC1163x;
import androidx.lifecycle.g0;
import androidx.lifecycle.h0;

/* JADX INFO: renamed from: androidx.fragment.app.o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class DialogInterfaceOnCancelListenerC1130o extends AbstractComponentCallbacksC1132q implements DialogInterface.OnCancelListener, DialogInterface.OnDismissListener {

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private Dialog f13175B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private boolean f13176C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private boolean f13177D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private boolean f13178E;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private Handler f13180q;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private boolean f13189z;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private Runnable f13181r = new a();

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private DialogInterface.OnCancelListener f13182s = new b();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private DialogInterface.OnDismissListener f13183t = new c();

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private int f13184u = 0;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private int f13185v = 0;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private boolean f13186w = true;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private boolean f13187x = true;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private int f13188y = -1;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private androidx.lifecycle.I f13174A = new d();

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private boolean f13179F = false;

    /* JADX INFO: renamed from: androidx.fragment.app.o$a */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            DialogInterfaceOnCancelListenerC1130o.this.f13183t.onDismiss(DialogInterfaceOnCancelListenerC1130o.this.f13175B);
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.o$b */
    class b implements DialogInterface.OnCancelListener {
        b() {
        }

        @Override // android.content.DialogInterface.OnCancelListener
        public void onCancel(DialogInterface dialogInterface) {
            if (DialogInterfaceOnCancelListenerC1130o.this.f13175B != null) {
                DialogInterfaceOnCancelListenerC1130o dialogInterfaceOnCancelListenerC1130o = DialogInterfaceOnCancelListenerC1130o.this;
                dialogInterfaceOnCancelListenerC1130o.onCancel(dialogInterfaceOnCancelListenerC1130o.f13175B);
            }
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.o$c */
    class c implements DialogInterface.OnDismissListener {
        c() {
        }

        @Override // android.content.DialogInterface.OnDismissListener
        public void onDismiss(DialogInterface dialogInterface) {
            if (DialogInterfaceOnCancelListenerC1130o.this.f13175B != null) {
                DialogInterfaceOnCancelListenerC1130o dialogInterfaceOnCancelListenerC1130o = DialogInterfaceOnCancelListenerC1130o.this;
                dialogInterfaceOnCancelListenerC1130o.onDismiss(dialogInterfaceOnCancelListenerC1130o.f13175B);
            }
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.o$d */
    class d implements androidx.lifecycle.I {
        d() {
        }

        @Override // androidx.lifecycle.I
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void b(InterfaceC1163x interfaceC1163x) {
            if (interfaceC1163x == null || !DialogInterfaceOnCancelListenerC1130o.this.f13187x) {
                return;
            }
            View viewRequireView = DialogInterfaceOnCancelListenerC1130o.this.requireView();
            if (viewRequireView.getParent() != null) {
                throw new IllegalStateException("DialogFragment can not be attached to a container view");
            }
            if (DialogInterfaceOnCancelListenerC1130o.this.f13175B != null) {
                if (J.L0(3)) {
                    Log.d("FragmentManager", "DialogFragment " + this + " setting the content view on " + DialogInterfaceOnCancelListenerC1130o.this.f13175B);
                }
                DialogInterfaceOnCancelListenerC1130o.this.f13175B.setContentView(viewRequireView);
            }
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.o$e */
    class e extends AbstractC1138x {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        final /* synthetic */ AbstractC1138x f13194q;

        e(AbstractC1138x abstractC1138x) {
            this.f13194q = abstractC1138x;
        }

        @Override // androidx.fragment.app.AbstractC1138x
        public View c(int i10) {
            return this.f13194q.d() ? this.f13194q.c(i10) : DialogInterfaceOnCancelListenerC1130o.this.l0(i10);
        }

        @Override // androidx.fragment.app.AbstractC1138x
        public boolean d() {
            return this.f13194q.d() || DialogInterfaceOnCancelListenerC1130o.this.m0();
        }
    }

    private void h0(boolean z9, boolean z10, boolean z11) {
        if (this.f13177D) {
            return;
        }
        this.f13177D = true;
        this.f13178E = false;
        Dialog dialog = this.f13175B;
        if (dialog != null) {
            dialog.setOnDismissListener(null);
            this.f13175B.dismiss();
            if (!z10) {
                if (Looper.myLooper() == this.f13180q.getLooper()) {
                    onDismiss(this.f13175B);
                } else {
                    this.f13180q.post(this.f13181r);
                }
            }
        }
        this.f13176C = true;
        if (this.f13188y >= 0) {
            if (z11) {
                getParentFragmentManager().d1(this.f13188y, 1);
            } else {
                getParentFragmentManager().b1(this.f13188y, 1, z9);
            }
            this.f13188y = -1;
            return;
        }
        S sP = getParentFragmentManager().p();
        sP.w(true);
        sP.q(this);
        if (z11) {
            sP.k();
        } else if (z9) {
            sP.j();
        } else {
            sP.i();
        }
    }

    private void n0(Bundle bundle) {
        if (this.f13187x && !this.f13179F) {
            try {
                this.f13189z = true;
                Dialog dialogK0 = k0(bundle);
                this.f13175B = dialogK0;
                if (this.f13187x) {
                    q0(dialogK0, this.f13184u);
                    Context context = getContext();
                    if (context instanceof Activity) {
                        this.f13175B.setOwnerActivity((Activity) context);
                    }
                    this.f13175B.setCancelable(this.f13186w);
                    this.f13175B.setOnCancelListener(this.f13182s);
                    this.f13175B.setOnDismissListener(this.f13183t);
                    this.f13179F = true;
                } else {
                    this.f13175B = null;
                }
            } finally {
                this.f13189z = false;
            }
        }
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1132q
    AbstractC1138x createFragmentContainer() {
        return new e(super.createFragmentContainer());
    }

    public void g0() {
        h0(false, false, false);
    }

    public Dialog i0() {
        return this.f13175B;
    }

    public int j0() {
        return this.f13185v;
    }

    public Dialog k0(Bundle bundle) {
        if (J.L0(3)) {
            Log.d("FragmentManager", "onCreateDialog called for DialogFragment " + this);
        }
        return new p010b.q(requireContext(), j0());
    }

    View l0(int i10) {
        Dialog dialog = this.f13175B;
        if (dialog != null) {
            return dialog.findViewById(i10);
        }
        return null;
    }

    boolean m0() {
        return this.f13179F;
    }

    public final Dialog o0() {
        Dialog dialogI0 = i0();
        if (dialogI0 != null) {
            return dialogI0;
        }
        throw new IllegalStateException("DialogFragment " + this + " does not have a Dialog.");
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1132q
    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1132q
    public void onAttach(Context context) {
        super.onAttach(context);
        getViewLifecycleOwnerLiveData().i(this.f13174A);
        if (this.f13178E) {
            return;
        }
        this.f13177D = false;
    }

    public void onCancel(DialogInterface dialogInterface) {
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1132q
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f13180q = new Handler();
        this.f13187x = this.mContainerId == 0;
        if (bundle != null) {
            this.f13184u = bundle.getInt("android:style", 0);
            this.f13185v = bundle.getInt("android:theme", 0);
            this.f13186w = bundle.getBoolean("android:cancelable", true);
            this.f13187x = bundle.getBoolean("android:showsDialog", this.f13187x);
            this.f13188y = bundle.getInt("android:backStackId", -1);
        }
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1132q
    public void onDestroyView() {
        super.onDestroyView();
        Dialog dialog = this.f13175B;
        if (dialog != null) {
            this.f13176C = true;
            dialog.setOnDismissListener(null);
            this.f13175B.dismiss();
            if (!this.f13177D) {
                onDismiss(this.f13175B);
            }
            this.f13175B = null;
            this.f13179F = false;
        }
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1132q
    public void onDetach() {
        super.onDetach();
        if (!this.f13178E && !this.f13177D) {
            this.f13177D = true;
        }
        getViewLifecycleOwnerLiveData().m(this.f13174A);
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        if (this.f13176C) {
            return;
        }
        if (J.L0(3)) {
            Log.d("FragmentManager", "onDismiss called for DialogFragment " + this);
        }
        h0(true, true, false);
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1132q
    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater layoutInflaterOnGetLayoutInflater = super.onGetLayoutInflater(bundle);
        if (this.f13187x && !this.f13189z) {
            n0(bundle);
            if (J.L0(2)) {
                Log.d("FragmentManager", "get layout inflater for DialogFragment " + this + " from dialog context");
            }
            Dialog dialog = this.f13175B;
            if (dialog != null) {
                return layoutInflaterOnGetLayoutInflater.cloneInContext(dialog.getContext());
            }
        } else if (J.L0(2)) {
            String str = "getting layout inflater for DialogFragment " + this;
            if (!this.f13187x) {
                Log.d("FragmentManager", "mShowsDialog = false: " + str);
                return layoutInflaterOnGetLayoutInflater;
            }
            Log.d("FragmentManager", "mCreatingDialog = true: " + str);
        }
        return layoutInflaterOnGetLayoutInflater;
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1132q
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        Dialog dialog = this.f13175B;
        if (dialog != null) {
            Bundle bundleOnSaveInstanceState = dialog.onSaveInstanceState();
            bundleOnSaveInstanceState.putBoolean("android:dialogShowing", false);
            bundle.putBundle("android:savedDialogState", bundleOnSaveInstanceState);
        }
        int i10 = this.f13184u;
        if (i10 != 0) {
            bundle.putInt("android:style", i10);
        }
        int i11 = this.f13185v;
        if (i11 != 0) {
            bundle.putInt("android:theme", i11);
        }
        boolean z9 = this.f13186w;
        if (!z9) {
            bundle.putBoolean("android:cancelable", z9);
        }
        boolean z10 = this.f13187x;
        if (!z10) {
            bundle.putBoolean("android:showsDialog", z10);
        }
        int i12 = this.f13188y;
        if (i12 != -1) {
            bundle.putInt("android:backStackId", i12);
        }
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1132q
    public void onStart() {
        super.onStart();
        Dialog dialog = this.f13175B;
        if (dialog != null) {
            this.f13176C = false;
            dialog.show();
            View decorView = this.f13175B.getWindow().getDecorView();
            g0.b(decorView, this);
            h0.a(decorView, this);
            p082i1.g.b(decorView, this);
        }
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1132q
    public void onStop() {
        super.onStop();
        Dialog dialog = this.f13175B;
        if (dialog != null) {
            dialog.hide();
        }
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1132q
    public void onViewStateRestored(Bundle bundle) {
        Bundle bundle2;
        super.onViewStateRestored(bundle);
        if (this.f13175B == null || bundle == null || (bundle2 = bundle.getBundle("android:savedDialogState")) == null) {
            return;
        }
        this.f13175B.onRestoreInstanceState(bundle2);
    }

    public void p0(boolean z9) {
        this.f13187x = z9;
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1132q
    void performCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Bundle bundle2;
        super.performCreateView(layoutInflater, viewGroup, bundle);
        if (this.mView != null || this.f13175B == null || bundle == null || (bundle2 = bundle.getBundle("android:savedDialogState")) == null) {
            return;
        }
        this.f13175B.onRestoreInstanceState(bundle2);
    }

    public void q0(Dialog dialog, int i10) {
        if (i10 != 1 && i10 != 2) {
            if (i10 != 3) {
                return;
            }
            Window window = dialog.getWindow();
            if (window != null) {
                window.addFlags(24);
            }
        }
        dialog.requestWindowFeature(1);
    }

    public void r0(J j9, String str) {
        this.f13177D = false;
        this.f13178E = true;
        S sP = j9.p();
        sP.w(true);
        sP.e(this, str);
        sP.i();
    }
}
