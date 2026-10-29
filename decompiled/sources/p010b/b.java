package p010b;

import android.window.BackEvent;
import kotlin.jvm.internal.AbstractC1457h;
import kotlin.jvm.internal.n;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f14454e = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final float f14455a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final float f14456b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final float f14457c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f14458d;

    public static final class a {
        public /* synthetic */ a(AbstractC1457h abstractC1457h) {
            this();
        }

        private a() {
        }
    }

    public b(float f10, float f11, float f12, int i10) {
        this.f14455a = f10;
        this.f14456b = f11;
        this.f14457c = f12;
        this.f14458d = i10;
    }

    public final float a() {
        return this.f14457c;
    }

    public final int b() {
        return this.f14458d;
    }

    public String toString() {
        return "BackEventCompat{touchX=" + this.f14455a + ", touchY=" + this.f14456b + ", progress=" + this.f14457c + ", swipeEdge=" + this.f14458d + '}';
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public b(BackEvent backEvent) {
        n.h(backEvent, "backEvent");
        p010b.a aVar = p010b.a.f14453a;
        this(aVar.c(backEvent), aVar.d(backEvent), aVar.a(backEvent), aVar.b(backEvent));
    }
}
