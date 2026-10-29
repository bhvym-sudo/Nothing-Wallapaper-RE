package com.nothing.wallpaper.picker.customization.ui.activity;

import K1.p;
import O6.b;
import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import androidx.lifecycle.d0;
import com.nothing.wallpaper.R;
import com.nothing.wallpaper.picker.customization.ui.activity.NTColorPickerActivity;
import kotlin.jvm.internal.AbstractC1457h;
import kotlin.jvm.internal.F;
import kotlin.jvm.internal.n;
import p013b2.c;
import p074h3.H;
import p074h3.I;
import p079h8.h;
import p079h8.i;

/* JADX INFO: loaded from: classes2.dex */
public final class NTColorPickerActivity extends N6.a {

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public static final a f18495S = new a(null);

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    private final h f18496R = i.b(new p219v8.a() { // from class: b7.a
        @Override // p219v8.a
        public final Object invoke() {
            return NTColorPickerActivity.y0(this.f14983q);
        }
    });

    public static final class a {
        public /* synthetic */ a(AbstractC1457h abstractC1457h) {
            this();
        }

        public final void a(Activity context) {
            n.h(context, "context");
            context.startActivityForResult(new Intent(context, (Class<?>) NTColorPickerActivity.class), 1);
        }

        private a() {
        }
    }

    private final void x0(Bundle bundle) {
        if (b.e() && getIntent().getBooleanExtra("key_unlock_bauhaus_style", false)) {
            H hA = I.a();
            n.f(hA, "null cannot be cast to non-null type com.android.customization.module.ThemePickerInjector");
            p pVar = (p) hA;
            c cVar = (c) new d0(this, pVar.i0(this, pVar.i())).a(F.b(c.class));
            if (bundle == null) {
                cVar.A(true);
                if (b.d(this)) {
                    return;
                }
                cVar.B(true);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final c y0(NTColorPickerActivity nTColorPickerActivity) {
        H hA = I.a();
        n.f(hA, "null cannot be cast to non-null type com.android.customization.module.ThemePickerInjector");
        p pVar = (p) hA;
        return (c) new d0(nTColorPickerActivity, pVar.i0(nTColorPickerActivity, pVar.i())).a(F.b(c.class));
    }

    private final c z0() {
        return (c) this.f18496R.getValue();
    }

    @Override // android.app.Activity
    public void finish() {
        if (z0().x()) {
            setResult(-1);
        }
        super.finish();
    }

    @Override // p010b.j, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration newConfig) {
        n.h(newConfig, "newConfig");
        super.onConfigurationChanged(newConfig);
        int i10 = newConfig.uiMode & 48;
        if ((i10 == 16 || i10 == 32) && !z0().z()) {
            recreate();
        }
    }

    @Override // N6.a, androidx.fragment.app.AbstractActivityC1136v, p010b.j, p161q0.f, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        p034d3.a aVarC = I.a().C();
        n.f(aVarC, "null cannot be cast to non-null type com.nothing.wallpaper.config.NTFlags");
        if (((p197t6.c) aVarC).z()) {
            overrideActivityTransition(1, R.anim.stay, R.anim.exit_to_right);
            overrideActivityTransition(0, R.anim.enter_from_right, R.anim.stay);
        }
        setContentView(R.layout.activity_color_picker);
        x0(bundle);
    }
}
