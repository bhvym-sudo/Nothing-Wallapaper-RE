package Z3;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import androidx.fragment.app.DialogInterfaceOnCancelListenerC1130o;
import androidx.fragment.app.J;
import p025c4.AbstractC1202p;

/* JADX INFO: loaded from: classes.dex */
public class j extends DialogInterfaceOnCancelListenerC1130o {

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private Dialog f9465G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private DialogInterface.OnCancelListener f9466H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private Dialog f9467I;

    public static j s0(Dialog dialog, DialogInterface.OnCancelListener onCancelListener) {
        j jVar = new j();
        Dialog dialog2 = (Dialog) AbstractC1202p.j(dialog, "Cannot display null dialog");
        dialog2.setOnCancelListener(null);
        dialog2.setOnDismissListener(null);
        jVar.f9465G = dialog2;
        if (onCancelListener != null) {
            jVar.f9466H = onCancelListener;
        }
        return jVar;
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC1130o
    public Dialog k0(Bundle bundle) {
        Dialog dialog = this.f9465G;
        if (dialog != null) {
            return dialog;
        }
        p0(false);
        if (this.f9467I == null) {
            this.f9467I = new AlertDialog.Builder((Context) AbstractC1202p.i(getContext())).create();
        }
        return this.f9467I;
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC1130o, android.content.DialogInterface.OnCancelListener
    public void onCancel(DialogInterface dialogInterface) {
        DialogInterface.OnCancelListener onCancelListener = this.f9466H;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC1130o
    public void r0(J j9, String str) {
        super.r0(j9, str);
    }
}
