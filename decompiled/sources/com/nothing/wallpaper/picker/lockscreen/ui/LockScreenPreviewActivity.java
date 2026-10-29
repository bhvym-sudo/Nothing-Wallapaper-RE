package com.nothing.wallpaper.picker.lockscreen.ui;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import androidx.fragment.app.AbstractComponentCallbacksC1132q;
import androidx.fragment.app.J;
import androidx.lifecycle.d0;
import com.android.wallpaper.picker.f;
import com.android.wallpaper.picker.i;
import com.nothing.wallpaper.NTPickerApplication;
import com.nothing.wallpaper.R;
import com.nothing.wallpaper.picker.lockscreen.ui.LockScreenPreviewActivity;
import kotlin.jvm.internal.AbstractC1457h;
import kotlin.jvm.internal.n;
import p064g3.AbstractC1356a;
import p064g3.r;
import p064g3.x;
import p064g3.z;
import p074h3.H;
import p074h3.I;
import p079h8.h;
import p084i3.K0;

/* JADX INFO: loaded from: classes2.dex */
public final class LockScreenPreviewActivity extends N6.b implements K0, com.android.wallpaper.picker.b.d, z {

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public static final a f18742X = new a(null);

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    private static final String f18743Y = "LockScreenPreviewActivity";

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    private i f18744T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    private final Handler f18745U = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    private final h f18746V = p079h8.i.b(new p219v8.a() { // from class: E7.P
        @Override // p219v8.a
        public final Object invoke() {
            return LockScreenPreviewActivity.E0(this.f1325q);
        }
    });

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    private final Runnable f18747W = new Runnable() { // from class: E7.Q
        @Override // java.lang.Runnable
        public final void run() {
            LockScreenPreviewActivity.D0(this.f1326q);
        }
    };

    public static final class a {
        public /* synthetic */ a(AbstractC1457h abstractC1457h) {
            this();
        }

        private a() {
        }
    }

    private final J7.b B0() {
        return (J7.b) this.f18746V.getValue();
    }

    private final void C0(Intent intent) {
        String stringExtra = intent.getStringExtra("com.nothing.userguide.extra.KEY_FROM_TIPS");
        com.nothing.wallpaper.common.log.c.d(f18743Y, "handleIntent extraParam:" + stringExtra);
        if (n.d("lock_screen_widget", stringExtra)) {
            B0().n("custom_widget", true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void D0(LockScreenPreviewActivity lockScreenPreviewActivity) {
        i iVar = lockScreenPreviewActivity.f18744T;
        if (iVar != null) {
            iVar.w();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final J7.b E0(LockScreenPreviewActivity lockScreenPreviewActivity) {
        return (J7.b) new d0(lockScreenPreviewActivity, lockScreenPreviewActivity.getDefaultViewModelProviderFactory()).b(J7.b.class);
    }

    @Override // p064g3.z
    public void H(x xVar, boolean z9) {
        i iVar = this.f18744T;
        if (iVar != null) {
            iVar.B(xVar, z9);
        }
    }

    @Override // com.android.wallpaper.picker.b.d
    public void a(f.b bVar) {
        i iVar = this.f18744T;
        if (iVar != null) {
            iVar.a(bVar);
        }
    }

    @Override // com.android.wallpaper.picker.b.d, y3.d.e
    public void b(CharSequence charSequence) {
    }

    @Override // com.android.wallpaper.picker.b.d
    public void c() {
        i iVar = this.f18744T;
        if (iVar != null) {
            iVar.i();
        }
    }

    @Override // com.android.wallpaper.picker.b.d, y3.d.e
    public boolean d() {
        return false;
    }

    @Override // N6.b, N6.a, androidx.fragment.app.AbstractActivityC1136v, p010b.j, p161q0.f, android.app.Activity
    protected void onCreate(Bundle bundle) {
        if (I.a() == null) {
            NTPickerApplication.a aVar = NTPickerApplication.f18424q;
            Application application = getApplication();
            n.g(application, "getApplication(...)");
            aVar.b(application);
        }
        this.f18744T = new i(this, this, I.a());
        super.onCreate(bundle);
        B0().w(true);
        B0().y(true);
        setContentView(R.layout.activity_lock_screen_preview);
        Intent intent = getIntent();
        n.g(intent, "getIntent(...)");
        C0(intent);
        this.f18745U.postDelayed(this.f18747W, 2500L);
        Context applicationContext = getApplicationContext();
        n.g(applicationContext, "getApplicationContext(...)");
        U7.b.h(applicationContext);
    }

    @Override // N6.b, androidx.fragment.app.AbstractActivityC1136v, android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        this.f18745U.removeCallbacks(this.f18747W);
    }

    @Override // p010b.j, android.app.Activity
    protected void onNewIntent(Intent intent) {
        n.h(intent, "intent");
        super.onNewIntent(intent);
        C0(intent);
    }

    @Override // androidx.fragment.app.AbstractActivityC1136v, p010b.j, android.app.Activity
    public void onRequestPermissionsResult(int i10, String[] permissions, int[] grantResults) {
        n.h(permissions, "permissions");
        n.h(grantResults, "grantResults");
        super.onRequestPermissionsResult(i10, permissions, grantResults);
        i iVar = this.f18744T;
        if (iVar != null) {
            iVar.u(i10, permissions, grantResults);
        }
    }

    @Override // com.android.wallpaper.picker.b.d
    public void u() {
        i iVar = this.f18744T;
        if (iVar != null) {
            iVar.q(iVar.l().a(this));
        }
    }

    @Override // p084i3.K0
    public com.android.wallpaper.picker.b x() {
        J jO0 = o0();
        n.g(jO0, "getSupportFragmentManager(...)");
        AbstractComponentCallbacksC1132q abstractComponentCallbacksC1132qJ0 = jO0.j0(R.id.fragment_container);
        if (abstractComponentCallbacksC1132qJ0 instanceof com.android.wallpaper.picker.b) {
            return (com.android.wallpaper.picker.b) abstractComponentCallbacksC1132qJ0;
        }
        return null;
    }

    @Override // N6.b
    public AbstractComponentCallbacksC1132q x0() {
        AbstractComponentCallbacksC1132q abstractComponentCallbacksC1132qJ0 = o0().j0(R.id.fragment_container);
        if (abstractComponentCallbacksC1132qJ0 == null || !(abstractComponentCallbacksC1132qJ0 instanceof LockScreenFragment)) {
            return null;
        }
        return abstractComponentCallbacksC1132qJ0;
    }

    @Override // com.android.wallpaper.picker.b.d
    public void y(AbstractC1356a abstractC1356a) {
        if (abstractC1356a == null) {
            return;
        }
        if (abstractC1356a instanceof r) {
            H hA = I.a();
            String strB = ((r) abstractC1356a).b();
            n.g(strB, "getCollectionId(...)");
            v0(hA.m(this, strB));
            return;
        }
        i iVar = this.f18744T;
        if (iVar != null) {
            iVar.z(abstractC1356a.b());
        }
    }

    @Override // N6.b
    protected boolean y0(int i10, int i11, Intent intent) {
        i iVar = this.f18744T;
        return iVar != null && iVar.p(i10, i11, intent);
    }
}
