package p074h3;

import android.content.Context;
import android.content.Intent;
import android.content.pm.LauncherApps;
import android.content.pm.PackageManager;
import android.os.UserHandle;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: h3.u, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1380u implements O {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map f21730a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Context f21731b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final LauncherApps f21732c;

    /* JADX INFO: renamed from: h3.u$a */
    private static class a extends LauncherApps.Callback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Context f21733a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Intent f21734b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final O.a f21735c;

        a(Context context, String str, O.a aVar) {
            this.f21733a = context.getApplicationContext();
            this.f21734b = new Intent(str);
            this.f21735c = aVar;
        }

        private boolean a(String str) {
            this.f21734b.setPackage(str);
            PackageManager packageManager = this.f21733a.getPackageManager();
            return (packageManager.queryIntentServices(this.f21734b, 0).isEmpty() && packageManager.queryIntentActivities(this.f21734b, 0).isEmpty()) ? false : true;
        }

        @Override // android.content.pm.LauncherApps.Callback
        public void onPackageAdded(String str, UserHandle userHandle) {
            if (a(str)) {
                this.f21735c.a(str, 1);
            }
        }

        @Override // android.content.pm.LauncherApps.Callback
        public void onPackageChanged(String str, UserHandle userHandle) {
            if (a(str)) {
                this.f21735c.a(str, 2);
            }
        }

        @Override // android.content.pm.LauncherApps.Callback
        public void onPackageRemoved(String str, UserHandle userHandle) {
            this.f21735c.a(str, 3);
        }

        @Override // android.content.pm.LauncherApps.Callback
        public void onPackagesAvailable(String[] strArr, UserHandle userHandle, boolean z9) {
            for (String str : strArr) {
                if (a(str)) {
                    this.f21735c.a(str, z9 ? 2 : 1);
                }
            }
        }

        @Override // android.content.pm.LauncherApps.Callback
        public void onPackagesSuspended(String[] strArr, UserHandle userHandle) {
            for (String str : strArr) {
                if (a(str)) {
                    this.f21735c.a(str, 3);
                }
            }
        }

        @Override // android.content.pm.LauncherApps.Callback
        public void onPackagesUnavailable(String[] strArr, UserHandle userHandle, boolean z9) {
            for (String str : strArr) {
                if (!z9 && a(str)) {
                    this.f21735c.a(str, 3);
                }
            }
        }

        @Override // android.content.pm.LauncherApps.Callback
        public void onPackagesUnsuspended(String[] strArr, UserHandle userHandle) {
            for (String str : strArr) {
                if (a(str)) {
                    this.f21735c.a(str, 1);
                }
            }
        }
    }

    public C1380u(Context context) {
        Context applicationContext = context.getApplicationContext();
        this.f21731b = applicationContext;
        this.f21732c = (LauncherApps) applicationContext.getSystemService("launcherapps");
    }

    private void c(O.a aVar) {
        a aVar2 = (a) this.f21730a.remove(aVar);
        if (aVar2 != null) {
            this.f21732c.unregisterCallback(aVar2);
        }
    }

    @Override // p074h3.O
    public void a(O.a aVar, String str) {
        a aVar2 = new a(this.f21731b, str, aVar);
        c(aVar);
        this.f21730a.put(aVar, aVar2);
        this.f21732c.registerCallback(aVar2);
    }

    @Override // p074h3.O
    public void b(O.a aVar) {
        c(aVar);
    }
}
