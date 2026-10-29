package com.nothing.wallpaper.picker.edit.container;

import D6.f;
import G6.e;
import G6.g;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.AbstractComponentCallbacksC1132q;
import androidx.fragment.app.J;
import androidx.lifecycle.d0;
import com.nothing.wallpaper.R;
import kotlin.jvm.internal.AbstractC1457h;
import kotlin.jvm.internal.n;
import p064g3.x;
import p074h3.H;
import p074h3.I;
import p098j7.j;
import p098j7.o;
import p118l7.r;
import p118l7.v;
import p148o7.b;
import p148o7.h;
import p168q7.l;
import p197t6.c;
import p237x6.k;
import p237x6.q;

/* JADX INFO: loaded from: classes2.dex */
public class EditWallpaperActivity extends N6.a implements o {

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public static final a f18525T = new a(null);

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    private j f18526R;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    private b f18527S;

    public static final class a {
        public /* synthetic */ a(AbstractC1457h abstractC1457h) {
            this();
        }

        public static /* synthetic */ Intent d(a aVar, Context context, x xVar, boolean z9, boolean z10, boolean z11, int i10, Object obj) {
            if ((i10 & 8) != 0) {
                z10 = true;
            }
            boolean z12 = z10;
            if ((i10 & 16) != 0) {
                z11 = false;
            }
            return aVar.c(context, xVar, z9, z12, z11);
        }

        public final Intent a(Context context, x wallpaper, boolean z9) {
            n.h(context, "context");
            n.h(wallpaper, "wallpaper");
            return d(this, context, wallpaper, z9, false, false, 24, null);
        }

        public final Intent b(Context context, x wallpaper, boolean z9, boolean z10) {
            n.h(context, "context");
            n.h(wallpaper, "wallpaper");
            return d(this, context, wallpaper, z9, z10, false, 16, null);
        }

        public final Intent c(Context context, x wallpaper, boolean z9, boolean z10, boolean z11) {
            n.h(context, "context");
            n.h(wallpaper, "wallpaper");
            Intent intentPutExtra = new Intent(context, (Class<?>) EditWallpaperActivity.class).putExtra("com.android.wallpaper.picker.wallpaper_info", wallpaper).putExtra("com.android.wallpaper.picker.asset_id_present", z9).putExtra("com.android.wallpaper.picker.view_as_home", z10).putExtra("com.nothing.wallpaper.picker.new_wallpaper", z11);
            n.g(intentPutExtra, "putExtra(...)");
            return intentPutExtra;
        }

        private a() {
        }
    }

    @Override // p098j7.o
    public void E() {
        v0(new l());
    }

    @Override // N6.a, androidx.fragment.app.AbstractActivityC1136v, p010b.j, p161q0.f, android.app.Activity
    protected void onCreate(Bundle bundle) {
        p158p7.a aVarA;
        super.onCreate(bundle);
        p034d3.a aVarC = I.a().C();
        n.f(aVarC, "null cannot be cast to non-null type com.nothing.wallpaper.config.NTFlags");
        if (((c) aVarC).z()) {
            overrideActivityTransition(1, R.anim.stay, R.anim.exit_to_right);
            overrideActivityTransition(0, R.anim.enter_from_right, R.anim.stay);
        }
        setContentView(R.layout.activity_edit_wallpaper);
        x xVar = (x) getIntent().getParcelableExtra("com.android.wallpaper.picker.wallpaper_info", x.class);
        if (xVar == null) {
            return;
        }
        boolean booleanExtra = getIntent().getBooleanExtra("com.android.wallpaper.picker.asset_id_present", true);
        boolean booleanExtra2 = getIntent().getBooleanExtra("com.android.wallpaper.picker.view_as_home", true);
        if (getIntent().getBooleanExtra("com.nothing.wallpaper.picker.new_wallpaper", false)) {
            aVarA = p158p7.a.C0628a.f23769b;
        } else {
            p7.a.c.C0629a c0629a = p7.a.c.f23771b;
            aVarA = booleanExtra2 ? c0629a.a() : c0629a.b();
        }
        w0(xVar, aVarA, booleanExtra);
    }

    protected final void w0(x wallpaper, p158p7.a editFrom, boolean z9) {
        x xVar;
        f cVar;
        com.android.wallpaper.asset.a aVarD;
        n.h(wallpaper, "wallpaper");
        n.h(editFrom, "editFrom");
        com.nothing.wallpaper.common.log.c.k("EditWallpaperActivity", "Edit " + g.d(wallpaper, this) + " from " + editFrom + ".");
        if (e.s(wallpaper)) {
            Context applicationContext = getApplicationContext();
            n.g(applicationContext, "getApplicationContext(...)");
            xVar = wallpaper;
            cVar = new D6.b(applicationContext, xVar, true, false, false);
        } else {
            xVar = wallpaper;
            Context applicationContext2 = getApplicationContext();
            n.g(applicationContext2, "getApplicationContext(...)");
            cVar = new D6.c(applicationContext2, xVar);
        }
        k kVar = null;
        if (e.s(xVar)) {
            C6.g gVarK = xVar.k();
            if (e.i(xVar)) {
                aVarD = e.c(this);
            } else {
                aVarD = xVar.d(getApplicationContext());
                n.e(aVarD);
            }
            H hA = I.a();
            n.f(hA, "null cannot be cast to non-null type com.android.customization.module.CustomizationInjector");
            Context applicationContext3 = getApplicationContext();
            n.g(applicationContext3, "getApplicationContext(...)");
            q qVarO = ((K1.a) hA).o(applicationContext3);
            Context applicationContext4 = getApplicationContext();
            n.g(applicationContext4, "getApplicationContext(...)");
            kVar = new k(qVarO, applicationContext4, aVarD, gVarK != null ? gVarK.d() : null);
        }
        d0.c cVarA = p098j7.n.a(editFrom, xVar, kVar, cVar);
        this.f18526R = (j) new d0(this, cVarA).b(j.class);
        this.f18527S = e.s(xVar) ? (b) new d0(this, cVarA).b(p148o7.g.class) : (b) new d0(this, cVarA).b(h.class);
        J jO0 = o0();
        n.g(jO0, "getSupportFragmentManager(...)");
        if (jO0.j0(R.id.fragment_container) == null) {
            AbstractComponentCallbacksC1132q rVar = e.s(xVar) ? new r() : new v();
            Bundle bundle = new Bundle();
            bundle.putBoolean("is_asset_id_present", z9);
            rVar.setArguments(bundle);
            jO0.p().b(R.id.fragment_container, rVar).i();
        }
    }
}
