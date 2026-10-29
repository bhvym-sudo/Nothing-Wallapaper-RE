package p025c4;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Build;
import android.util.Log;
import p015b4.InterfaceC1186f;

/* JADX INFO: loaded from: classes.dex */
public abstract class C implements DialogInterface.OnClickListener {
    public static C b(Activity activity, Intent intent, int i10) {
        return new A(intent, activity, i10);
    }

    public static C c(InterfaceC1186f interfaceC1186f, Intent intent, int i10) {
        return new B(intent, interfaceC1186f, 2);
    }

    protected abstract void a();

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i10) {
        try {
            a();
        } catch (ActivityNotFoundException e10) {
            Log.e("DialogRedirect", true == Build.FINGERPRINT.contains("generic") ? "Failed to start resolution intent. This may occur when resolving Google Play services connection issues on emulators with Google APIs but not Google Play Store." : "Failed to start resolution intent.", e10);
        } finally {
            dialogInterface.dismiss();
        }
    }
}
