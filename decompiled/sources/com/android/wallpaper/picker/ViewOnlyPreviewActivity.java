package com.android.wallpaper.picker;

import H3.AbstractC0851a;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.nothing.wallpaper.R;
import com.nothing.wallpaper.picker.edit.container.EditWallpaperActivity;
import p064g3.j;
import p064g3.x;
import p074h3.I;
import p074h3.J;
import p084i3.AbstractActivityC1393c;

/* JADX INFO: loaded from: classes.dex */
public class ViewOnlyPreviewActivity extends AbstractActivityC1393c implements com.android.wallpaper.picker.a.InterfaceC0448a {

    public static class a implements j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private boolean f15939a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f15940b;

        @Override // p064g3.j
        public Intent b(Context context, x xVar, boolean z9) {
            if (new J().b(context) && I.a().C().h(context)) {
                return FullPreviewActivity.L0(context, xVar, this.f15940b);
            }
            return this.f15939a ? EditWallpaperActivity.f18525T.b(context, xVar, z9, this.f15940b) : EditWallpaperActivity.f18525T.a(context, xVar, z9);
        }

        public void c(boolean z9, boolean z10) {
            this.f15939a = z9;
            this.f15940b = z10;
        }
    }

    @Override // com.android.wallpaper.picker.a.InterfaceC0448a
    public void k() {
        onBackPressed();
    }

    @Override // p084i3.AbstractActivityC1393c, androidx.fragment.app.AbstractActivityC1136v, p010b.j, p161q0.f, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_preview);
        J0();
        androidx.fragment.app.J jO0 = o0();
        if (jO0.j0(R.id.fragment_container) == null) {
            Intent intent = getIntent();
            x xVar = (x) intent.getParcelableExtra("com.android.wallpaper.picker.wallpaper_info");
            boolean booleanExtra = intent.getBooleanExtra("com.android.wallpaper.picker.testing_mode_enabled", false);
            jO0.p().b(R.id.fragment_container, I.a().b(this, xVar, 0, intent.getBooleanExtra("com.android.wallpaper.picker.view_as_home", true), intent.getBooleanExtra("com.android.wallpaper.picker.asset_id_present", true), false, booleanExtra)).i();
        }
    }

    @Override // com.android.wallpaper.picker.a.InterfaceC0448a
    public boolean q() {
        return !AbstractC0851a.j(getBaseContext());
    }
}
