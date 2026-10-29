package p084i3;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.TextView;
import androidx.fragment.app.DialogInterfaceOnCancelListenerC1130o;
import com.nothing.wallpaper.R;
import p074h3.I;

/* JADX INFO: loaded from: classes.dex */
public class A0 extends DialogInterfaceOnCancelListenerC1130o {

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private boolean f21950G;

    public interface a {
        void t(DialogInterface dialogInterface);
    }

    private int u0() {
        return R.string.start_rotation_dialog_body;
    }

    private int v0() {
        return android.R.string.ok;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void w0(CheckBox checkBox, View view) {
        this.f21950G = checkBox.isChecked();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ void x0(DialogInterface dialogInterface, int i10) {
        ((r0) getTargetFragment()).j(this.f21950G ? 1 : 0);
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC1130o
    public Dialog k0(Bundle bundle) {
        View viewInflate = getActivity().getLayoutInflater().inflate(R.layout.dialog_start_rotation, (ViewGroup) null);
        ((TextView) viewInflate.findViewById(R.id.start_rotation_dialog_subhead)).setText(Html.fromHtml(getResources().getString(u0())));
        final CheckBox checkBox = (CheckBox) viewInflate.findViewById(R.id.start_rotation_wifi_only_checkbox);
        if (I.a().x().a(getContext())) {
            checkBox.setChecked(this.f21950G);
            checkBox.setOnClickListener(new View.OnClickListener() { // from class: i3.y0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f22151q.w0(checkBox, view);
                }
            });
        } else {
            checkBox.setVisibility(8);
        }
        return new AlertDialog.Builder(getActivity(), R.style.LightDialogTheme).setView(viewInflate).setNegativeButton(android.R.string.cancel, (DialogInterface.OnClickListener) null).setPositiveButton(v0(), new DialogInterface.OnClickListener() { // from class: i3.z0
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i10) {
                this.f22154q.x0(dialogInterface, i10);
            }
        }).create();
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC1130o, androidx.fragment.app.AbstractComponentCallbacksC1132q
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            this.f21950G = true;
        } else {
            this.f21950G = bundle.getBoolean("key_is_wifi_only_checked");
        }
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC1130o, android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        ((a) getTargetFragment()).t(dialogInterface);
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC1130o, androidx.fragment.app.AbstractComponentCallbacksC1132q
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("key_is_wifi_only_checked", this.f21950G);
    }
}
