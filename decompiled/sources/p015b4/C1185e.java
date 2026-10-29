package p015b4;

import android.app.Activity;
import androidx.fragment.app.AbstractActivityC1136v;
import p025c4.AbstractC1202p;

/* JADX INFO: renamed from: b4.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1185e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f14903a;

    public C1185e(Activity activity) {
        AbstractC1202p.j(activity, "Activity must not be null");
        this.f14903a = activity;
    }

    public final Activity a() {
        return (Activity) this.f14903a;
    }

    public final AbstractActivityC1136v b() {
        return (AbstractActivityC1136v) this.f14903a;
    }

    public final boolean c() {
        return this.f14903a instanceof Activity;
    }

    public final boolean d() {
        return this.f14903a instanceof AbstractActivityC1136v;
    }
}
