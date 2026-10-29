package com.android.wallpaper.picker;

import H3.AbstractC0851a;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.transition.Slide;
import android.widget.Toast;
import androidx.fragment.app.J;
import com.nothing.wallpaper.R;
import p064g3.x;
import p074h3.I;
import p084i3.AbstractActivityC1393c;

/* JADX INFO: loaded from: classes.dex */
public class FullPreviewActivity extends AbstractActivityC1393c implements a.InterfaceC0448a {
    public static Intent K0(Context context, x xVar) {
        Intent intent = new Intent(context, (Class<?>) FullPreviewActivity.class);
        intent.setFlags(268468224);
        intent.putExtra("com.android.wallpaper.picker.wallpaper_info", xVar);
        return intent;
    }

    public static Intent L0(Context context, x xVar, boolean z9) {
        return K0(context, xVar).putExtra("com.android.wallpaper.picker.view_as_home", z9);
    }

    @Override // com.android.wallpaper.picker.a.InterfaceC0448a
    public void k() {
        onBackPressed();
    }

    @Override // p084i3.AbstractActivityC1393c, androidx.fragment.app.AbstractActivityC1136v, p010b.j, p161q0.f, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getWindow().setAllowEnterTransitionOverlap(true);
        getWindow().requestFeature(13);
        getWindow().setExitTransition(new Slide());
        getWindow().setEnterTransition(new Slide());
        setContentView(R.layout.activity_fullscreen_preview);
        J0();
        J jO0 = o0();
        if (jO0.j0(R.id.fragment_container) == null) {
            Intent intent = getIntent();
            x xVar = (x) intent.getParcelableExtra("com.android.wallpaper.picker.wallpaper_info");
            boolean booleanExtra = intent.getBooleanExtra("com.android.wallpaper.picker.view_as_home", true ^ I.a().C().h(this));
            boolean booleanExtra2 = intent.getBooleanExtra("com.android.wallpaper.picker.testing_mode_enabled", false);
            jO0.p().b(R.id.fragment_container, I.a().b(this, xVar, 1, booleanExtra, intent.getBooleanExtra("com.android.wallpaper.picker.asset_id_present", false), true, booleanExtra2)).i();
        }
    }

    @Override // p084i3.AbstractActivityC1391b, androidx.fragment.app.AbstractActivityC1136v, android.app.Activity
    protected void onResume() {
        super.onResume();
        setRequestedOrientation(I.a().e(this).n(this) ? 2 : 1);
        if (isInMultiWindowMode()) {
            Toast.makeText(this, R.string.wallpaper_exit_split_screen, 0).show();
            onBackPressed();
        }
    }

    @Override // com.android.wallpaper.picker.a.InterfaceC0448a
    public boolean q() {
        return !AbstractC0851a.j(getBaseContext());
    }
}
