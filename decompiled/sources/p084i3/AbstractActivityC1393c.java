package p084i3;

import android.os.Bundle;
import androidx.core.view.T;
import com.nothing.wallpaper.R;
import p074h3.I;
import p074h3.S;

/* JADX INFO: renamed from: i3.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractActivityC1393c extends AbstractActivityC1391b {
    protected void J0() {
        T.b(getWindow(), false);
    }

    @Override // androidx.fragment.app.AbstractActivityC1136v, p010b.j, p161q0.f, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        S sQ = I.a().q(this);
        getWindow().setColorMode(1);
        setTheme(R.style.WallpaperTheme);
        getWindow().setFormat(-3);
        if (getIntent() == null || getIntent().getAction() == null) {
            return;
        }
        sQ.i(getIntent());
    }
}
