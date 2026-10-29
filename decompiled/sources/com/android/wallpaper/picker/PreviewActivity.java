package com.android.wallpaper.picker;

import H3.AbstractC0851a;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.nothing.wallpaper.R;
import com.nothing.wallpaper.picker.edit.container.EditWallpaperActivity;
import p064g3.j;
import p064g3.x;
import p074h3.I;
import p074h3.J;
import p084i3.AbstractActivityC1393c;

/* JADX INFO: loaded from: classes.dex */
public class PreviewActivity extends AbstractActivityC1393c implements com.android.wallpaper.picker.a.InterfaceC0448a {

    public static class a implements j {
        @Override // p064g3.j
        public Intent b(Context context, x xVar, boolean z9) {
            return (new J().b(context) && I.a().C().h(context)) ? FullPreviewActivity.K0(context, xVar) : EditWallpaperActivity.f18525T.c(context, xVar, z9, true, true);
        }
    }

    @Override // com.android.wallpaper.picker.a.InterfaceC0448a
    public void k() {
        onBackPressed();
    }

    @Override // androidx.fragment.app.AbstractActivityC1136v, p010b.j, android.app.Activity
    protected void onActivityResult(int i10, int i11, Intent intent) {
        super.onActivityResult(i10, i11, intent);
        if (i10 == 0 && i11 == -1) {
            Uri data = intent == null ? null : intent.getData();
            if (data != null) {
                p064g3.i iVar = new p064g3.i(data);
                o0().p().r(R.id.fragment_container, I.a().b(this, iVar, 1, true, true, false, false)).i();
            }
        }
    }

    @Override // p084i3.AbstractActivityC1393c, androidx.fragment.app.AbstractActivityC1136v, p010b.j, p161q0.f, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_preview);
        J0();
        androidx.fragment.app.J jO0 = o0();
        if (jO0.j0(R.id.fragment_container) == null) {
            Intent intent = getIntent();
            jO0.p().b(R.id.fragment_container, I.a().b(this, (x) intent.getParcelableExtra("com.android.wallpaper.picker.wallpaper_info"), 1, intent.getBooleanExtra("com.android.wallpaper.picker.view_as_home", !I.a().C().h(this)), intent.getBooleanExtra("com.android.wallpaper.picker.asset_id_present", false), false, intent.getBooleanExtra("com.android.wallpaper.picker.testing_mode_enabled", false))).i();
        }
    }

    @Override // com.android.wallpaper.picker.a.InterfaceC0448a
    public boolean q() {
        return !AbstractC0851a.j(getBaseContext());
    }
}
