package p010b;

import android.window.BackEvent;
import kotlin.jvm.internal.n;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f14453a = new a();

    private a() {
    }

    public final float a(BackEvent backEvent) {
        n.h(backEvent, "backEvent");
        return backEvent.getProgress();
    }

    public final int b(BackEvent backEvent) {
        n.h(backEvent, "backEvent");
        return backEvent.getSwipeEdge();
    }

    public final float c(BackEvent backEvent) {
        n.h(backEvent, "backEvent");
        return backEvent.getTouchX();
    }

    public final float d(BackEvent backEvent) {
        n.h(backEvent, "backEvent");
        return backEvent.getTouchY();
    }
}
