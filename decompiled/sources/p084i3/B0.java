package p084i3;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import androidx.fragment.app.DialogInterfaceOnCancelListenerC1130o;
import com.nothing.wallpaper.R;

/* JADX INFO: loaded from: classes.dex */
public class B0 extends DialogInterfaceOnCancelListenerC1130o {

    class a implements DialogInterface.OnClickListener {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        final /* synthetic */ int f21952q;

        a(int i10) {
            this.f21952q = i10;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            ((b) B0.this.getTargetFragment()).D(this.f21952q);
        }
    }

    public interface b {
        void D(int i10);
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC1130o
    public Dialog k0(Bundle bundle) {
        super.k0(bundle);
        return new AlertDialog.Builder(getActivity(), R.style.LightDialogTheme).setMessage(getResources().getString(R.string.start_rotation_error_message)).setPositiveButton(R.string.try_again, new a(getArguments().getInt("network_preference"))).setNegativeButton(android.R.string.cancel, (DialogInterface.OnClickListener) null).create();
    }
}
