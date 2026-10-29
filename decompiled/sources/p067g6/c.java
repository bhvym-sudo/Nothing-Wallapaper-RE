package p067g6;

import F8.AbstractC0812g;
import F8.AbstractC0816i;
import F8.B0;
import F8.C0803b0;
import F8.L;
import F8.M;
import android.content.Context;
import android.os.VibrationEffect;
import android.os.Vibrator;
import android.os.VibratorManager;
import android.provider.Settings;
import android.util.Log;
import java.io.File;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.AbstractC1457h;
import kotlin.jvm.internal.n;
import p079h8.A;
import p079h8.h;
import p079h8.i;
import p079h8.r;
import p129m8.e;
import p219v8.p;

/* JADX INFO: loaded from: classes2.dex */
public final class c {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final a f21297f = new a(null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final String f21298g = "NtUIVibrateUtils";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static volatile c f21299h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f21300a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final h f21301b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Z7.b f21302c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f21303d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Vibrator f21304e;

    public static final class a {
        public /* synthetic */ a(AbstractC1457h abstractC1457h) {
            this();
        }

        public final c a(Context context) {
            c cVar;
            n.h(context, "context");
            c cVar2 = c.f21299h;
            if (cVar2 != null) {
                return cVar2;
            }
            synchronized (this) {
                cVar = c.f21299h;
                if (cVar == null) {
                    Context applicationContext = context.getApplicationContext();
                    n.g(applicationContext, "getApplicationContext(...)");
                    cVar = new c(applicationContext);
                    c.f21299h = cVar;
                }
            }
            return cVar;
        }

        private a() {
        }
    }

    static final class b extends l implements p {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f21305q;

        b(e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final e create(Object obj, e eVar) {
            return c.this.new b(eVar);
        }

        @Override // p219v8.p
        public final Object invoke(L l9, e eVar) {
            return ((b) create(l9, eVar)).invokeSuspend(A.f21846a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objE = p139n8.b.e();
            int i10 = this.f21305q;
            if (i10 == 0) {
                r.b(obj);
                c cVar = c.this;
                this.f21305q = 1;
                if (cVar.i(this) == objE) {
                    return objE;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                r.b(obj);
            }
            return A.f21846a;
        }
    }

    /* JADX INFO: renamed from: g6.c$c, reason: collision with other inner class name */
    static final class C0539c extends l implements p {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f21307q;

        C0539c(e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final e create(Object obj, e eVar) {
            return c.this.new C0539c(eVar);
        }

        @Override // p219v8.p
        public final Object invoke(L l9, e eVar) {
            return ((C0539c) create(l9, eVar)).invokeSuspend(A.f21846a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            p139n8.b.e();
            if (this.f21307q != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            r.b(obj);
            if (!p067g6.a.a()) {
                c.this.f().vibrate(VibrationEffect.createPredefined(0));
                return A.f21846a;
            }
            if (!c.this.h()) {
                c.this.f().vibrate(VibrationEffect.createPredefined(0));
            }
            return A.f21846a;
        }
    }

    public c(Context context) {
        n.h(context, "context");
        this.f21300a = context;
        this.f21301b = i.b(new p219v8.a() { // from class: g6.b
            @Override // p219v8.a
            public final Object invoke() {
                return c.j();
            }
        });
        Object systemService = context.getSystemService("vibrator_manager");
        n.f(systemService, "null cannot be cast to non-null type android.os.VibratorManager");
        Vibrator defaultVibrator = ((VibratorManager) systemService).getDefaultVibrator();
        n.g(defaultVibrator, "getDefaultVibrator(...)");
        this.f21304e = defaultVibrator;
    }

    private final L d() {
        return (L) this.f21301b.getValue();
    }

    private final String e(String str) {
        int i10 = Settings.System.getInt(this.f21300a.getContentResolver(), "haptic_feedback_intensity", 2);
        Log.i(f21298g, "vibrateIntensity:" + i10);
        if (i10 == 1) {
            return "/vendor/etc/richtapresources/weak/" + str;
        }
        if (i10 == 2) {
            return "/vendor/etc/richtapresources/" + str;
        }
        if (i10 != 3) {
            return "/vendor/etc/richtapresources/" + str;
        }
        return "/vendor/etc/richtapresources/strong/" + str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final L j() {
        return M.a(B0.b(null, 1, null).z(C0803b0.c()));
    }

    public final Vibrator f() {
        return this.f21304e;
    }

    public final void g() {
        AbstractC0816i.d(d(), null, null, new b(null), 3, null);
    }

    public final boolean h() {
        Z7.b bVarE;
        if (Settings.System.getInt(this.f21300a.getContentResolver(), "haptic_feedback_enabled", 0) == 0) {
            Log.d(f21298g, "playSwitchVibrate: touch vibrate settings is off !");
            return true;
        }
        try {
            bVarE = Z7.b.e();
            bVarE.g(this.f21300a);
        } catch (NoSuchMethodError e10) {
            Log.w(f21298g, "Cannot find AACHapticUtils", e10);
            bVarE = null;
        }
        if (bVarE == null) {
            return false;
        }
        this.f21302c = bVarE;
        boolean zH = bVarE.h();
        this.f21303d = zH;
        if (!zH) {
            Log.d(f21298g, "playSwitchVibrate: not support rich tap !");
            return true;
        }
        File file = new File(e("NT_OnOff_button.he"));
        if (!file.exists()) {
            Log.i(f21298g, "Could not get vibrate file in vendor folder. Get from system folder again.");
            file = new File("/system/etc/richtapresources/NT_OnOff_button.he");
        }
        if (file.exists()) {
            String str = f21298g;
            Log.d(str, "playSwitchVibrate: AACHapticUtils init!");
            try {
                bVarE.g(this.f21300a);
                bVarE.m(file, 1);
                Log.d(str, "playSwitchVibrate: playPattern");
            } catch (Exception e11) {
                Log.d(f21298g, "playSwitchVibrate failed:" + e11);
            }
        } else {
            Log.i(f21298g, "Could not find vibrate file");
        }
        return true;
    }

    public final Object i(e eVar) {
        Object objG = AbstractC0812g.g(C0803b0.b(), new C0539c(null), eVar);
        return objG == p139n8.b.e() ? objG : A.f21846a;
    }
}
