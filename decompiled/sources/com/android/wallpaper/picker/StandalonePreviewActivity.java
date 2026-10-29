package com.android.wallpaper.picker;

import H3.AbstractC0851a;
import android.content.Intent;
import android.net.Uri;
import android.os.Binder;
import android.os.Bundle;
import android.util.Log;
import com.nothing.wallpaper.R;
import p074h3.I;
import p074h3.J;
import p074h3.L;
import p074h3.S;
import p084i3.AbstractActivityC1393c;

/* JADX INFO: loaded from: classes.dex */
public class StandalonePreviewActivity extends AbstractActivityC1393c implements a.InterfaceC0448a {

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    private S f15933U;

    private boolean K0() {
        return getPackageManager().checkPermission("android.permission.READ_MEDIA_IMAGES", getPackageName()) == 0;
    }

    private boolean L0(Uri uri) {
        return checkUriPermission(uri, Binder.getCallingPid(), Binder.getCallingUid(), 1) == 0;
    }

    private void M0(L l9) {
        Intent intent = getIntent();
        Uri data = intent.getData();
        if (data != null) {
            grantUriPermission(getPackageName(), data, 1);
        }
        Intent intentA = l9.a(intent);
        intentA.addFlags(268435456).putExtra("android.intent.extra.STREAM", intent.getData()).putExtra("up_arrow", true);
        AbstractC0851a.m(this, intentA, 0);
        finish();
    }

    private void N0() {
        J j9 = new J();
        if (j9.b(this)) {
            Intent intent = getIntent();
            if (!AbstractC0851a.h(intent) && !AbstractC0851a.f(intent)) {
                if (I.a().C().h(this)) {
                    return;
                }
                M0(j9);
            } else {
                Uri uri = intent.hasExtra("android.intent.extra.STREAM") ? (Uri) intent.getParcelableExtra("android.intent.extra.STREAM") : null;
                if (uri != null) {
                    intent.setData(uri);
                }
            }
        }
    }

    private void O0() {
        Intent intent = getIntent();
        boolean booleanExtra = intent.getBooleanExtra("com.android.wallpaper.picker.testing_mode_enabled", false);
        boolean booleanExtra2 = intent.getBooleanExtra("com.android.wallpaper.picker.asset_id_present", false);
        o0().p().b(R.id.fragment_container, I.a().b(this, new p064g3.i(intent.getData()), 1, true, booleanExtra2, false, booleanExtra)).i();
    }

    @Override // com.android.wallpaper.picker.a.InterfaceC0448a
    public void k() {
        onBackPressed();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (o0().j0(R.id.fragment_container) == null) {
            O0();
        }
    }

    @Override // p084i3.AbstractActivityC1393c, androidx.fragment.app.AbstractActivityC1136v, p010b.j, p161q0.f, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_preview);
        N0();
        J0();
        S sQ = I.a().q(getApplicationContext());
        this.f15933U = sQ;
        sQ.k();
        Uri data = getIntent().getData();
        if (data == null) {
            Log.e("StandalonePreview", "No URI passed in intent; exiting StandalonePreviewActivity");
            finish();
            return;
        }
        boolean zL0 = L0(data);
        this.f15933U.e(zL0);
        if (zL0 || K0()) {
            return;
        }
        requestPermissions(new String[]{"android.permission.READ_MEDIA_IMAGES"}, 1);
    }

    @Override // androidx.fragment.app.AbstractActivityC1136v, p010b.j, android.app.Activity
    public void onRequestPermissionsResult(int i10, String[] strArr, int[] iArr) {
        if (i10 == 1) {
            boolean z9 = strArr.length > 0 && strArr[0].equals("android.permission.READ_MEDIA_IMAGES") && iArr.length > 0 && iArr[0] == 0;
            this.f15933U.g(z9);
            if (!z9) {
                finish();
            }
            O0();
        }
    }

    @Override // p084i3.AbstractActivityC1391b, androidx.fragment.app.AbstractActivityC1136v, android.app.Activity
    protected void onResume() {
        super.onResume();
        if (getResources().getBoolean(R.bool.is_large_screen)) {
            return;
        }
        setRequestedOrientation(1);
    }

    @Override // com.android.wallpaper.picker.a.InterfaceC0448a
    public boolean q() {
        return getIntent().getBooleanExtra("up_arrow", false);
    }
}
