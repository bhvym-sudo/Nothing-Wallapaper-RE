package p084i3;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import androidx.fragment.app.DialogInterfaceOnCancelListenerC1130o;
import androidx.lifecycle.InterfaceC1163x;
import com.nothing.wallpaper.R;

/* JADX INFO: loaded from: classes.dex */
public class x0 extends DialogInterfaceOnCancelListenerC1130o {

    class a implements DialogInterface.OnClickListener {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        final /* synthetic */ int f22147q;

        a(int i10) {
            this.f22147q = i10;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            InterfaceC1163x targetFragment = x0.this.getTargetFragment();
            InterfaceC1163x activity = x0.this.getActivity();
            if (targetFragment == null) {
                targetFragment = activity;
            }
            b bVar = (b) targetFragment;
            if (bVar != null) {
                bVar.B(this.f22147q);
            }
        }
    }

    public interface b {
        void B(int i10);
    }

    public static x0 s0(int i10, int i11) {
        x0 x0Var = new x0();
        Bundle bundle = new Bundle();
        bundle.putInt("message", i10);
        bundle.putInt("destination", i11);
        x0Var.setArguments(bundle);
        return x0Var;
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC1130o
    public Dialog k0(Bundle bundle) {
        super.k0(bundle);
        return new AlertDialog.Builder(getActivity(), R.style.LightDialogTheme).setMessage(getArguments().getInt("message")).setPositiveButton(R.string.try_again, new a(getArguments().getInt("destination"))).setNegativeButton(android.R.string.cancel, (DialogInterface.OnClickListener) null).create();
    }
}
