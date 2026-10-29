package com.nothing.wallpaper.picker.creative;

import R5.b;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.fragment.app.AbstractComponentCallbacksC1132q;
import com.nothing.wallpaper.R;
import com.nothing.wallpaper.picker.creative.AiWallpaperEntranceActivity;
import kotlin.jvm.internal.n;

/* JADX INFO: loaded from: classes2.dex */
public final class AiWallpaperEntranceActivity extends b {
    /* JADX INFO: Access modifiers changed from: private */
    public static final void S0(AiWallpaperEntranceActivity aiWallpaperEntranceActivity, View view) {
        CreativeWallpaperActivity.f18470T.c(aiWallpaperEntranceActivity);
    }

    @Override // R5.b
    public AbstractComponentCallbacksC1132q K0() {
        return a.f18474r.a();
    }

    @Override // R5.b
    public String L0() {
        String string = getResources().getString(R.string.nt_ai_wallpaper_title);
        n.g(string, "getString(...)");
        return string;
    }

    @Override // R5.b
    public boolean Q0() {
        return true;
    }

    @Override // R5.b, androidx.fragment.app.AbstractActivityC1136v, p010b.j, p161q0.f, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Button buttonJ0 = J0();
        if (buttonJ0 != null) {
            buttonJ0.setOnClickListener(new View.OnClickListener() { // from class: S6.a
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    AiWallpaperEntranceActivity.S0(this.f7360q, view);
                }
            });
        }
    }
}
