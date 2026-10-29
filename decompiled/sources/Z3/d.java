package Z3;

import android.R;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Resources;
import android.util.Log;
import android.util.TypedValue;
import android.widget.ProgressBar;
import androidx.fragment.app.AbstractActivityC1136v;
import com.google.android.gms.common.api.GoogleApiActivity;
import p015b4.InterfaceC1186f;
import p025c4.AbstractC1202p;
import p025c4.AbstractC1211z;
import p025c4.C;

/* JADX INFO: loaded from: classes.dex */
public class d extends e {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f9455c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final Object f9453e = new Object();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final d f9454f = new d();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f9452d = e.f9456a;

    public static d l() {
        return f9454f;
    }

    @Override // Z3.e
    public Intent a(Context context, int i10, String str) {
        return super.a(context, i10, str);
    }

    @Override // Z3.e
    public PendingIntent b(Context context, int i10, int i11) {
        return super.b(context, i10, i11);
    }

    @Override // Z3.e
    public final String d(int i10) {
        return super.d(i10);
    }

    @Override // Z3.e
    public int f(Context context) {
        return super.f(context);
    }

    @Override // Z3.e
    public int g(Context context, int i10) {
        return super.g(context, i10);
    }

    @Override // Z3.e
    public final boolean i(int i10) {
        return super.i(i10);
    }

    public Dialog j(Activity activity, int i10, int i11, DialogInterface.OnCancelListener onCancelListener) {
        return o(activity, i10, C.b(activity, a(activity, i10, "d"), i11), onCancelListener);
    }

    public PendingIntent k(Context context, a aVar) {
        return aVar.d() ? aVar.c() : b(context, aVar.a(), 0);
    }

    public boolean m(Activity activity, int i10, int i11, DialogInterface.OnCancelListener onCancelListener) {
        Dialog dialogJ = j(activity, i10, i11, onCancelListener);
        if (dialogJ == null) {
            return false;
        }
        r(activity, dialogJ, "GooglePlayServicesErrorDialog", onCancelListener);
        return true;
    }

    public void n(Context context, int i10) {
        s(context, i10, null, c(context, i10, 0, "n"));
    }

    final Dialog o(Context context, int i10, C c10, DialogInterface.OnCancelListener onCancelListener) {
        if (i10 == 0) {
            return null;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.alertDialogTheme, typedValue, true);
        AlertDialog.Builder builder = "Theme.Dialog.Alert".equals(context.getResources().getResourceEntryName(typedValue.resourceId)) ? new AlertDialog.Builder(context, 5) : null;
        if (builder == null) {
            builder = new AlertDialog.Builder(context);
        }
        builder.setMessage(AbstractC1211z.d(context, i10));
        if (onCancelListener != null) {
            builder.setOnCancelListener(onCancelListener);
        }
        String strC = AbstractC1211z.c(context, i10);
        if (strC != null) {
            builder.setPositiveButton(strC, c10);
        }
        String strG = AbstractC1211z.g(context, i10);
        if (strG != null) {
            builder.setTitle(strG);
        }
        Log.w("GoogleApiAvailability", String.format("Creating dialog for Google Play services availability issue. ConnectionResult=%s", Integer.valueOf(i10)), new IllegalArgumentException());
        return builder.create();
    }

    public final Dialog p(Activity activity, DialogInterface.OnCancelListener onCancelListener) {
        ProgressBar progressBar = new ProgressBar(activity, null, R.attr.progressBarStyleLarge);
        progressBar.setIndeterminate(true);
        progressBar.setVisibility(0);
        AlertDialog.Builder builder = new AlertDialog.Builder(activity);
        builder.setView(progressBar);
        builder.setMessage(AbstractC1211z.d(activity, 18));
        builder.setPositiveButton("", (DialogInterface.OnClickListener) null);
        AlertDialog alertDialogCreate = builder.create();
        r(activity, alertDialogCreate, "GooglePlayServicesUpdatingDialog", onCancelListener);
        return alertDialogCreate;
    }

    public final p015b4.q q(Context context, p015b4.p pVar) {
        IntentFilter intentFilter = new IntentFilter("android.intent.action.PACKAGE_ADDED");
        intentFilter.addDataScheme("package");
        p015b4.q qVar = new p015b4.q(pVar);
        p135n4.f.h(context, qVar, intentFilter);
        qVar.a(context);
        if (h(context, "com.google.android.gms")) {
            return qVar;
        }
        pVar.a();
        qVar.b();
        return null;
    }

    final void r(Activity activity, Dialog dialog, String str, DialogInterface.OnCancelListener onCancelListener) {
        try {
            if (activity instanceof AbstractActivityC1136v) {
                j.s0(dialog, onCancelListener).r0(((AbstractActivityC1136v) activity).o0(), str);
                return;
            }
        } catch (NoClassDefFoundError unused) {
        }
        b.a(dialog, onCancelListener).show(activity.getFragmentManager(), str);
    }

    final void s(Context context, int i10, String str, PendingIntent pendingIntent) {
        int i11;
        String str2;
        Log.w("GoogleApiAvailability", String.format("GMS core API Availability. ConnectionResult=%s, tag=%s", Integer.valueOf(i10), null), new IllegalArgumentException());
        if (i10 == 18) {
            t(context);
            return;
        }
        if (pendingIntent == null) {
            if (i10 == 6) {
                Log.w("GoogleApiAvailability", "Missing resolution for ConnectionResult.RESOLUTION_REQUIRED. Call GoogleApiAvailability#showErrorNotification(Context, ConnectionResult) instead.");
                return;
            }
            return;
        }
        String strF = AbstractC1211z.f(context, i10);
        String strE = AbstractC1211z.e(context, i10);
        Resources resources = context.getResources();
        NotificationManager notificationManager = (NotificationManager) AbstractC1202p.i(context.getSystemService("notification"));
        q0.j.d dVarN = new q0.j.d(context).k(true).e(true).i(strF).n(new q0.j.b().h(strE));
        if (p085i4.e.b(context)) {
            AbstractC1202p.l(p085i4.g.c());
            dVarN.m(context.getApplicationInfo().icon).l(2);
            if (p085i4.e.c(context)) {
                dVarN.a(Y3.a.f9333a, resources.getString(Y3.b.f9348o), pendingIntent);
            } else {
                dVarN.g(pendingIntent);
            }
        } else {
            dVarN.m(R.drawable.stat_sys_warning).o(resources.getString(Y3.b.f9341h)).p(System.currentTimeMillis()).g(pendingIntent).h(strE);
        }
        if (p085i4.g.f()) {
            AbstractC1202p.l(p085i4.g.f());
            synchronized (f9453e) {
                str2 = this.f9455c;
            }
            if (str2 == null) {
                str2 = "com.google.android.gms.availability";
                NotificationChannel notificationChannel = notificationManager.getNotificationChannel("com.google.android.gms.availability");
                String strB = AbstractC1211z.b(context);
                if (notificationChannel == null) {
                    notificationManager.createNotificationChannel(new NotificationChannel("com.google.android.gms.availability", strB, 4));
                } else if (!strB.contentEquals(notificationChannel.getName())) {
                    notificationChannel.setName(strB);
                    notificationManager.createNotificationChannel(notificationChannel);
                }
            }
            dVarN.f(str2);
        }
        Notification notificationB = dVarN.b();
        if (i10 == 1 || i10 == 2 || i10 == 3) {
            g.f9460b.set(false);
            i11 = 10436;
        } else {
            i11 = 39789;
        }
        notificationManager.notify(i11, notificationB);
    }

    final void t(Context context) {
        new k(this, context).sendEmptyMessageDelayed(1, 120000L);
    }

    public final boolean u(Activity activity, InterfaceC1186f interfaceC1186f, int i10, int i11, DialogInterface.OnCancelListener onCancelListener) {
        Dialog dialogO = o(activity, i10, C.c(interfaceC1186f, a(activity, i10, "d"), 2), onCancelListener);
        if (dialogO == null) {
            return false;
        }
        r(activity, dialogO, "GooglePlayServicesErrorDialog", onCancelListener);
        return true;
    }

    public final boolean v(Context context, a aVar, int i10) {
        PendingIntent pendingIntentK;
        if (p105k4.a.a(context) || (pendingIntentK = k(context, aVar)) == null) {
            return false;
        }
        s(context, aVar.a(), null, PendingIntent.getActivity(context, 0, GoogleApiActivity.a(context, pendingIntentK, i10, true), p135n4.g.f23266a | 134217728));
        return true;
    }
}
