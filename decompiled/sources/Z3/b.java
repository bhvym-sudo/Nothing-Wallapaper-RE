package Z3;

import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.app.FragmentManager;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import p025c4.AbstractC1202p;

/* JADX INFO: loaded from: classes.dex */
public class b extends DialogFragment {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private Dialog f9446q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private DialogInterface.OnCancelListener f9447r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private Dialog f9448s;

    public static b a(Dialog dialog, DialogInterface.OnCancelListener onCancelListener) {
        b bVar = new b();
        Dialog dialog2 = (Dialog) AbstractC1202p.j(dialog, "Cannot display null dialog");
        dialog2.setOnCancelListener(null);
        dialog2.setOnDismissListener(null);
        bVar.f9446q = dialog2;
        if (onCancelListener != null) {
            bVar.f9447r = onCancelListener;
        }
        return bVar;
    }

    @Override // android.app.DialogFragment, android.content.DialogInterface.OnCancelListener
    public void onCancel(DialogInterface dialogInterface) {
        DialogInterface.OnCancelListener onCancelListener = this.f9447r;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }

    @Override // android.app.DialogFragment
    public Dialog onCreateDialog(Bundle bundle) {
        Dialog dialog = this.f9446q;
        if (dialog != null) {
            return dialog;
        }
        setShowsDialog(false);
        if (this.f9448s == null) {
            this.f9448s = new AlertDialog.Builder((Context) AbstractC1202p.i(getActivity())).create();
        }
        return this.f9448s;
    }

    @Override // android.app.DialogFragment
    public void show(FragmentManager fragmentManager, String str) {
        super.show(fragmentManager, str);
    }
}
