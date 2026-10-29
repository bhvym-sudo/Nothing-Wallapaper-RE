package F1;

import android.app.UiModeManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;
import android.os.Looper;
import android.os.PowerManager;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.Switch;
import android.widget.Toast;
import androidx.lifecycle.AbstractC1157q;
import androidx.lifecycle.InterfaceC1162w;
import androidx.lifecycle.J;
import com.android.customization.picker.mode.DarkModeSectionView;
import com.nothing.wallpaper.R;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import p084i3.s0;

/* JADX INFO: loaded from: classes.dex */
public class e implements p064g3.f, InterfaceC1162w {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static final ExecutorService f1515w = Executors.newSingleThreadExecutor();

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final AbstractC1157q f1516q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final PowerManager f1517r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final a f1518s = new a();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private Context f1519t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private DarkModeSectionView f1520u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final h f1521v;

    private class a extends BroadcastReceiver {
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (!TextUtils.equals(intent.getAction(), "android.os.action.POWER_SAVE_MODE_CHANGED") || e.this.f1520u == null) {
                return;
            }
            e.this.f1520u.setEnabled(!e.this.f1517r.isPowerSaveMode());
        }

        private a() {
        }
    }

    public e(Context context, AbstractC1157q abstractC1157q, h hVar) {
        this.f1519t = context;
        this.f1516q = abstractC1157q;
        this.f1517r = (PowerManager) context.getSystemService(PowerManager.class);
        abstractC1157q.a(this);
        this.f1521v = hVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void q() {
        if (this.f1519t == null || !this.f1516q.b().e(AbstractC1157q.b.STARTED)) {
            return;
        }
        this.f1519t.registerReceiver(this.f1518s, new IntentFilter("android.os.action.POWER_SAVE_MODE_CHANGED"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void r() {
        a aVar;
        Context context = this.f1519t;
        if (context == null || (aVar = this.f1518s) == null) {
            return;
        }
        context.unregisterReceiver(aVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void s(Context context, UiModeManager uiModeManager, boolean z9) {
        this.f1520u.announceForAccessibility(context.getString(R.string.mode_changed));
        uiModeManager.setNightModeActivated(z9);
        this.f1521v.g(z9);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void t(final Context context, final boolean z9) {
        if (context == null) {
            return;
        }
        if (!((Switch) this.f1520u.findViewById(R.id.dark_mode_toggle)).isEnabled()) {
            Context context2 = this.f1519t;
            Toast.makeText(context2, context2.getString(R.string.mode_disabled_msg), 0).show();
        } else {
            final UiModeManager uiModeManager = (UiModeManager) context.getSystemService(UiModeManager.class);
            new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: F1.d
                @Override // java.lang.Runnable
                public final void run() {
                    this.f1511q.s(context, uiModeManager, z9);
                }
            }, context.getResources().getInteger(android.R.integer.config_shortAnimTime));
        }
    }

    @Override // p064g3.f
    public void a() {
        this.f1516q.d(this);
        this.f1519t = null;
    }

    @Override // p064g3.f
    public boolean e(Context context) {
        return context != null && p171r0.a.a(context, "android.permission.MODIFY_DAY_NIGHT_MODE") == 0;
    }

    @J(AbstractC1157q.a.ON_START)
    public void onStart() {
        f1515w.submit(new Runnable() { // from class: F1.b
            @Override // java.lang.Runnable
            public final void run() {
                this.f1509q.q();
            }
        });
    }

    @J(AbstractC1157q.a.ON_STOP)
    public void onStop() {
        f1515w.submit(new Runnable() { // from class: F1.a
            @Override // java.lang.Runnable
            public final void run() {
                this.f1508q.r();
            }
        });
    }

    @Override // p064g3.f
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public DarkModeSectionView f(Context context) {
        DarkModeSectionView darkModeSectionView = (DarkModeSectionView) LayoutInflater.from(context).inflate(R.layout.dark_mode_section_view, (ViewGroup) null);
        this.f1520u = darkModeSectionView;
        darkModeSectionView.setViewListener(new s0.a() { // from class: F1.c
            @Override // i3.s0.a
            public final void a(Context context2, boolean z9) {
                this.f1510a.t(context2, z9);
            }
        });
        this.f1520u.setEnabled(!((PowerManager) context.getSystemService(PowerManager.class)).isPowerSaveMode());
        return this.f1520u;
    }
}
