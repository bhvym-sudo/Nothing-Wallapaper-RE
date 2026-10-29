package Q;

import android.view.MotionEvent;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f6568a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List f6569b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final MotionEvent f6570c;

    public v(long j9, List list, MotionEvent motionEvent) {
        this.f6568a = j9;
        this.f6569b = list;
        this.f6570c = motionEvent;
    }

    public final MotionEvent a() {
        return this.f6570c;
    }

    public final List b() {
        return this.f6569b;
    }
}
