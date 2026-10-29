package p074h3;

import H3.k;
import android.app.WallpaperManager;
import android.os.Bundle;
import androidx.fragment.app.AbstractActivityC1136v;
import androidx.lifecycle.InterfaceC1163x;
import java.util.List;
import p064g3.f;
import p064g3.m;
import p064g3.v;
import p064g3.z;
import p234x3.b;

/* JADX INFO: renamed from: h3.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC1364d {

    /* JADX INFO: renamed from: h3.d$a */
    public enum a {
        LOCK_SCREEN,
        HOME_SCREEN;

        public int e() {
            return ordinal() != 0 ? 1 : 2;
        }
    }

    List a(a aVar, AbstractActivityC1136v abstractActivityC1136v, InterfaceC1163x interfaceC1163x, v vVar, m mVar, z zVar, f.a aVar2, Bundle bundle, InterfaceC1363c interfaceC1363c, k kVar, b bVar, p194t3.a aVar3, WallpaperManager wallpaperManager, boolean z9);
}
