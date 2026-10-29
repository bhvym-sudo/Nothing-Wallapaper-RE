package com.nothing.wallpaper.picker.creative;

import H6.e;
import S6.d;
import W6.U;
import W6.x;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Window;
import androidx.fragment.app.J;
import com.nothing.wallpaper.R;
import kotlin.jvm.internal.AbstractC1457h;
import kotlin.jvm.internal.n;
import p010b.u;

/* JADX INFO: loaded from: classes2.dex */
public final class CreativeWallpaperActivity extends N6.a implements d {

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public static final a f18470T = new a(null);

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    private b f18471R;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    private final c f18472S = new c();

    public static final class a {
        public /* synthetic */ a(AbstractC1457h abstractC1457h) {
            this();
        }

        public final boolean a(Context context) {
            n.h(context, "context");
            return p087i6.n.a(context, "first_use_creative_wallpaper", true);
        }

        public final void b(Context context, boolean z9) {
            n.h(context, "context");
            p087i6.n.f(context, "first_use_creative_wallpaper", z9);
        }

        public final void c(Activity context) {
            n.h(context, "context");
            context.startActivityForResult(new Intent(context, (Class<?>) CreativeWallpaperActivity.class), 1);
        }

        private a() {
        }
    }

    public interface b {
        boolean q();
    }

    public static final class c extends u {
        c() {
            super(true);
        }

        @Override // p010b.u
        public void d() {
            b bVar = CreativeWallpaperActivity.this.f18471R;
            if ((bVar == null || !bVar.q()) && !CreativeWallpaperActivity.this.o0().c1()) {
                CreativeWallpaperActivity.this.finish();
            }
        }
    }

    @Override // S6.d
    public void A() {
        v0(new x());
    }

    @Override // androidx.fragment.app.AbstractActivityC1136v, p010b.j, android.app.Activity
    protected void onActivityResult(int i10, int i11, Intent intent) {
        super.onActivityResult(i10, i11, intent);
        if (i11 == -1) {
            setResult(-1);
            finish();
        }
    }

    @Override // N6.a, androidx.fragment.app.AbstractActivityC1136v, p010b.j, p161q0.f, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_creative_wallpaper);
        J jO0 = o0();
        n.g(jO0, "getSupportFragmentManager(...)");
        if (jO0.j0(R.id.fragment_container) == null) {
            jO0.p().b(R.id.fragment_container, new U()).i();
        }
        f().h(this, this.f18472S);
        a aVar = f18470T;
        if (aVar.a(this)) {
            aVar.b(this, false);
        }
    }

    @Override // androidx.fragment.app.AbstractActivityC1136v, android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        this.f18472S.h();
    }

    @Override // androidx.fragment.app.AbstractActivityC1136v, android.app.Activity
    protected void onStart() {
        super.onStart();
        Window window = getWindow();
        n.g(window, "getWindow(...)");
        e.a(window);
    }

    public final void x0(boolean z9) {
        this.f18472S.j(z9);
    }

    public final void y0(b bVar) {
        this.f18471R = bVar;
    }
}
