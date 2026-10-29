package com.android.wallpaper.picker;

import H3.AbstractC0851a;
import H3.AbstractC0854d;
import H3.k;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.provider.Settings;
import android.text.TextUtils;
import android.util.Log;
import androidx.core.view.T;
import androidx.fragment.app.AbstractComponentCallbacksC1132q;
import androidx.lifecycle.InterfaceC1163x;
import com.android.wallpaper.widget.BottomActionBar;
import com.nothing.wallpaper.NTPickerApplication;
import com.nothing.wallpaper.R;
import com.nothing.wallpaper.common.log.FileLog;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import p064g3.AbstractC1356a;
import p064g3.m;
import p064g3.r;
import p064g3.x;
import p064g3.z;
import p074h3.AbstractC1366f;
import p074h3.H;
import p074h3.I;
import p074h3.J;
import p074h3.M;
import p074h3.S;
import p084i3.C1416o;
import p084i3.F0;
import p084i3.K0;

/* JADX INFO: loaded from: classes.dex */
public class CustomizationPickerActivity extends N6.b implements K0, BottomActionBar.e, m, b.d, y3.d.e, z {

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    private i f15924T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    private S f15925U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    private M f15926V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    private M.a f15927W;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    private int f15928X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    private k f15929Y;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    private BottomActionBar f15930Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    private boolean f15931a0;

    private void A0() {
        int i10 = (this.f15929Y.m() && this.f15929Y.n(this)) ? -1 : 1;
        if (getRequestedOrientation() != i10) {
            setRequestedOrientation(i10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void B0(int i10) {
        if (i10 == this.f15928X) {
            return;
        }
        Log.i("CustomizationPickerActivity", "Network status changes, refresh wallpaper categories.");
        this.f15928X = i10;
        this.f15924T.q(true);
    }

    @Override // com.android.wallpaper.widget.BottomActionBar.e
    public BottomActionBar B() {
        return this.f15930Z;
    }

    @Override // y3.d.e
    public void F(int i10) {
    }

    @Override // y3.d.e
    public void G() {
    }

    @Override // p064g3.z
    public void H(x xVar, boolean z9) {
        this.f15924T.B(xVar, z9);
    }

    @Override // com.android.wallpaper.picker.b.d
    public void a(f.b bVar) {
        this.f15924T.a(bVar);
    }

    @Override // com.android.wallpaper.picker.b.d, y3.d.e
    public void b(CharSequence charSequence) {
    }

    @Override // com.android.wallpaper.picker.b.d
    public void c() {
        this.f15924T.i();
    }

    @Override // com.android.wallpaper.picker.b.d, y3.d.e
    public boolean d() {
        return false;
    }

    @Override // androidx.fragment.app.AbstractActivityC1136v, android.app.Activity
    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        G6.g.a(this, printWriter);
        try {
            FileLog.flushAll(printWriter);
        } catch (Exception unused) {
        }
    }

    @Override // N6.a, com.android.wallpaper.picker.a.InterfaceC0448a
    public void k() {
        onBackPressed();
    }

    @Override // p010b.j, android.app.Activity
    public void onBackPressed() {
        if (moveTaskToBack(false)) {
            return;
        }
        super.onBackPressed();
    }

    @Override // p010b.j, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        A0();
    }

    @Override // N6.b, N6.a, androidx.fragment.app.AbstractActivityC1136v, p010b.j, p161q0.f, android.app.Activity
    protected void onCreate(Bundle bundle) {
        U7.b.h(getApplicationContext());
        if (I.a() == null) {
            NTPickerApplication.f18424q.b(getApplication());
        }
        H hA = I.a();
        this.f15924T = new i(this, this, hA);
        this.f15925U = hA.q(this);
        M mD = hA.d(this);
        this.f15926V = mD;
        this.f15928X = mD.b();
        this.f15929Y = hA.e(this);
        A0();
        super.onCreate(bundle);
        J j9 = new J();
        if (j9.b(this)) {
            Intent intent = getIntent();
            if (!AbstractC0851a.h(intent) && !AbstractC0851a.f(intent)) {
                AbstractC0851a.m(this, j9.a(intent), 0);
                finish();
                return;
            }
        }
        setContentView(R.layout.activity_customization_picker);
        this.f15930Z = (BottomActionBar) findViewById(R.id.bottom_actionbar);
        T.b(getWindow(), false);
        boolean zK = AbstractC0851a.k(getIntent());
        if (o0().j0(R.id.fragment_container) == null) {
            if (getIntent() != null) {
                this.f15925U.i(getIntent());
            }
            hA.f(this).m();
            AbstractC1366f.b(getApplicationContext());
            if (I.a().C().l()) {
                u0(p068g7.k.M1(zK, p028c7.a.f15234q.a(this, zK)));
            } else {
                u0(AbstractC0851a.l(getIntent()) ? F0.R0() : C1416o.N0(zK));
            }
            this.f15924T.w();
        }
        if (bundle == null) {
            hA.w(this, this).d();
        }
        Intent intent2 = getIntent();
        String stringExtra = intent2.getStringExtra("destination");
        intent2.removeExtra("destination");
        setIntent(intent2);
        String strA = AbstractC0854d.a(intent2);
        if (!TextUtils.isEmpty(stringExtra)) {
            InterfaceC1163x interfaceC1163xJ0 = o0().j0(R.id.fragment_container);
            if (interfaceC1163xJ0 instanceof g3.f.a) {
                ((g3.f.a) interfaceC1163xJ0).P(stringExtra);
            }
        } else if (!TextUtils.isEmpty(strA)) {
            v0(new b());
            v0(I.a().m(this, strA));
            intent2.setData(null);
        }
        R7.d.f7114r.f();
    }

    @Override // p010b.j, android.app.Activity
    protected void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        if (AbstractC0851a.b(intent)) {
            androidx.fragment.app.J jO0 = o0();
            while (jO0.r0() > 0) {
                jO0.c1();
            }
            AbstractComponentCallbacksC1132q abstractComponentCallbacksC1132qJ0 = o0().j0(R.id.fragment_container);
            if (abstractComponentCallbacksC1132qJ0 instanceof p068g7.k) {
                ((p068g7.k) abstractComponentCallbacksC1132qJ0).D1();
            }
        }
    }

    @Override // androidx.fragment.app.AbstractActivityC1136v, android.app.Activity
    protected void onPause() {
        super.onPause();
        this.f15931a0 = false;
    }

    @Override // androidx.fragment.app.AbstractActivityC1136v, p010b.j, android.app.Activity
    public void onRequestPermissionsResult(int i10, String[] strArr, int[] iArr) {
        this.f15924T.u(i10, strArr, iArr);
    }

    @Override // androidx.fragment.app.AbstractActivityC1136v, android.app.Activity
    protected void onResume() {
        super.onResume();
        this.f15931a0 = true;
        this.f15925U.c(Settings.Global.getInt(getContentResolver(), "device_provisioned", 0) != 0, AbstractC0851a.l(getIntent()));
    }

    @Override // androidx.fragment.app.AbstractActivityC1136v, android.app.Activity
    protected void onStart() {
        super.onStart();
        if (this.f15927W == null) {
            M.a aVar = new M.a() { // from class: i3.h
                @Override // h3.M.a
                public final void a(int i10) {
                    this.f22035a.B0(i10);
                }
            };
            this.f15927W = aVar;
            this.f15926V.a(aVar);
        }
    }

    @Override // androidx.fragment.app.AbstractActivityC1136v, android.app.Activity
    protected void onStop() {
        this.f15925U.h();
        M.a aVar = this.f15927W;
        if (aVar != null) {
            this.f15926V.c(aVar);
            this.f15927W = null;
        }
        super.onStop();
    }

    @Override // N6.a, com.android.wallpaper.picker.a.InterfaceC0448a
    public boolean q() {
        return !AbstractC0851a.j(this);
    }

    @Override // com.android.wallpaper.picker.b.d
    public void u() {
        i iVar = this.f15924T;
        iVar.q(iVar.l().a(this));
    }

    @Override // N6.a
    protected void v0(AbstractComponentCallbacksC1132q abstractComponentCallbacksC1132q) {
        o0().p().r(R.id.fragment_container, abstractComponentCallbacksC1132q).g(null).i();
        o0().g0();
    }

    @Override // y3.d.e
    public void w() {
        o0().a1();
    }

    @Override // p084i3.K0
    public b x() {
        AbstractComponentCallbacksC1132q abstractComponentCallbacksC1132qJ0 = o0().j0(R.id.fragment_container);
        if (abstractComponentCallbacksC1132qJ0 instanceof b) {
            return (b) abstractComponentCallbacksC1132qJ0;
        }
        return null;
    }

    @Override // N6.b
    public AbstractComponentCallbacksC1132q x0() {
        AbstractComponentCallbacksC1132q abstractComponentCallbacksC1132qJ0 = o0().j0(R.id.fragment_container);
        if (abstractComponentCallbacksC1132qJ0 == null || !(abstractComponentCallbacksC1132qJ0 instanceof p068g7.k)) {
            return null;
        }
        return abstractComponentCallbacksC1132qJ0;
    }

    @Override // com.android.wallpaper.picker.b.d
    public void y(AbstractC1356a abstractC1356a) {
        if (abstractC1356a instanceof r) {
            v0(I.a().m(this, abstractC1356a.b()));
        } else {
            this.f15924T.z(abstractC1356a.b());
        }
    }

    @Override // N6.b
    protected boolean y0(int i10, int i11, Intent intent) {
        return this.f15924T.p(i10, i11, intent);
    }
}
