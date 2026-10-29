package p084i3;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import androidx.fragment.app.DialogInterfaceOnCancelListenerC1130o;
import com.nothing.wallpaper.R;

/* JADX INFO: loaded from: classes.dex */
public class L extends DialogInterfaceOnCancelListenerC1130o {

    class a implements DialogInterface.OnClickListener {
        a() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            ((b) L.this.getTargetFragment()).I();
        }
    }

    public interface b {
        void I();
    }

    public static L s0() {
        return new L();
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC1130o
    public Dialog k0(Bundle bundle) {
        super.k0(bundle);
        return new AlertDialog.Builder(getActivity(), R.style.LightDialogTheme).setMessage(R.string.load_wallpaper_error_message).setPositiveButton(android.R.string.ok, new a()).create();
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC1130o, android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        ((b) getTargetFragment()).I();
    }
}
