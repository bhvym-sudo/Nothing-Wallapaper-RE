package p084i3;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.view.d;
import androidx.fragment.app.DialogInterfaceOnCancelListenerC1130o;
import com.nothing.wallpaper.R;

/* JADX INFO: loaded from: classes.dex */
public class w0 extends DialogInterfaceOnCancelListenerC1130o {

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private Button f22135G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private Button f22136H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private Button f22137I;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    private a f22140L;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    private boolean f22142N;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    private boolean f22138J = true;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    private boolean f22139K = true;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    private int f22141M = R.string.set_wallpaper_dialog_message;

    public interface a {
        void n(int i10);

        default void u(boolean z9) {
        }
    }

    public w0() {
        setRetainInstance(true);
    }

    private void D0() {
        Button button = this.f22135G;
        if (button != null) {
            button.setVisibility(this.f22138J ? 0 : 8);
        }
        Button button2 = this.f22136H;
        if (button2 != null) {
            button2.setVisibility(this.f22139K ? 0 : 8);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void v0(View view) {
        y0(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void w0(View view) {
        y0(1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void x0(View view) {
        y0(2);
    }

    private void y0(int i10) {
        this.f22142N = true;
        a aVar = this.f22140L;
        if (aVar != null) {
            aVar.n(i10);
        }
        g0();
    }

    public void A0(a aVar) {
        this.f22140L = aVar;
    }

    public void B0(boolean z9) {
        this.f22139K = z9;
        D0();
    }

    public void C0(int i10) {
        this.f22141M = i10;
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC1130o
    public Dialog k0(Bundle bundle) {
        super.k0(bundle);
        Context context = getContext();
        View viewInflate = View.inflate(new d(getActivity(), R.style.LightDialogTheme), R.layout.dialog_set_wallpaper, null);
        viewInflate.findViewById(R.id.dialog_set_wallpaper_options).setClipToOutline(true);
        View viewInflate2 = View.inflate(context, R.layout.dialog_set_wallpaper_title, null);
        ((TextView) viewInflate2.findViewById(R.id.dialog_set_wallpaper_title)).setText(this.f22141M);
        AlertDialog alertDialogCreate = new AlertDialog.Builder(context, R.style.LightDialogTheme).setCustomTitle(viewInflate2).setView(viewInflate).create();
        Button button = (Button) viewInflate.findViewById(R.id.set_home_wallpaper_button);
        this.f22135G = button;
        button.setOnClickListener(new View.OnClickListener() { // from class: i3.t0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f22094q.v0(view);
            }
        });
        Button button2 = (Button) viewInflate.findViewById(R.id.set_lock_wallpaper_button);
        this.f22136H = button2;
        button2.setOnClickListener(new View.OnClickListener() { // from class: i3.u0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f22096q.w0(view);
            }
        });
        Button button3 = (Button) viewInflate.findViewById(R.id.set_both_wallpaper_button);
        this.f22137I = button3;
        button3.setOnClickListener(new View.OnClickListener() { // from class: i3.v0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f22133q.x0(view);
            }
        });
        D0();
        return alertDialogCreate;
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC1130o, android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        a aVar = this.f22140L;
        if (aVar != null) {
            aVar.u(this.f22142N);
        }
    }

    public void z0(boolean z9) {
        this.f22138J = z9;
        D0();
    }
}
