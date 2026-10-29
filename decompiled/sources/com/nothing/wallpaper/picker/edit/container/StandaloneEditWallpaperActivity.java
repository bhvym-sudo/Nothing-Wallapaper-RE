package com.nothing.wallpaper.picker.edit.container;

import E8.i;
import android.net.Uri;
import android.os.Binder;
import android.os.Bundle;
import kotlin.jvm.internal.AbstractC1457h;
import kotlin.jvm.internal.n;
import p167q6.b;

/* JADX INFO: loaded from: classes2.dex */
public final class StandaloneEditWallpaperActivity extends EditWallpaperActivity {

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public static final a f18528V = new a(null);

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    private final b f18529U = new b(this);

    public static final class a {
        public /* synthetic */ a(AbstractC1457h abstractC1457h) {
            this();
        }

        private a() {
        }
    }

    private final boolean x0() {
        return getPackageManager().checkPermission("android.permission.READ_MEDIA_IMAGES", getPackageName()) == 0;
    }

    private final boolean y0(Uri uri) {
        return checkUriPermission(uri, Binder.getCallingPid(), Binder.getCallingUid(), 1) == 0;
    }

    private final void z0() {
        String authority;
        Uri data = getIntent().getData();
        w0((data == null || (authority = data.getAuthority()) == null || !i.S(authority, "com.google.android.apps.photos.contentprovider", false, 2, null)) ? new p064g3.i(getIntent().getData()) : new p064g3.i(getIntent().getData(), 1), p158p7.a.C0628a.f23769b, getIntent().getBooleanExtra("com.android.wallpaper.picker.asset_id_present", true));
    }

    @Override // com.nothing.wallpaper.picker.edit.container.EditWallpaperActivity, N6.a, androidx.fragment.app.AbstractActivityC1136v, p010b.j, p161q0.f, android.app.Activity
    protected void onCreate(Bundle bundle) {
        Uri data = getIntent().getData();
        if (data == null) {
            super.onCreate(null);
            this.f18529U.e("No URI passed in intent; exiting StandaloneEditWallpaperActivity");
            finish();
            return;
        }
        boolean z9 = y0(data) && x0();
        if (!z9 && bundle != null) {
            this.f18529U.e("Since we lack image permissions, let’s clear savedInstanceState to prevent fragment restoration.");
            bundle.clear();
        }
        super.onCreate(bundle);
        if (z9) {
            z0();
        } else {
            requestPermissions(new String[]{"android.permission.READ_MEDIA_IMAGES"}, 1);
        }
    }

    @Override // androidx.fragment.app.AbstractActivityC1136v, p010b.j, android.app.Activity
    public void onRequestPermissionsResult(int i10, String[] permissions, int[] grantResults) {
        n.h(permissions, "permissions");
        n.h(grantResults, "grantResults");
        super.onRequestPermissionsResult(i10, permissions, grantResults);
        if (i10 == 1) {
            if (!(permissions.length == 0) && n.d(permissions[0], "android.permission.READ_MEDIA_IMAGES")) {
                if (!(grantResults.length == 0) && grantResults[0] == 0) {
                    z0();
                    return;
                }
            }
            this.f18529U.e("image uri permission denial, finish activity.");
            finish();
        }
    }

    @Override // N6.a, com.android.wallpaper.picker.a.InterfaceC0448a
    public boolean q() {
        return getIntent().getBooleanExtra("up_arrow", true);
    }
}
