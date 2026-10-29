package p165q4;

import android.os.SystemClock;
import java.io.Closeable;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: renamed from: q4.k5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1560k5 implements Closeable {

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private static final Map f24618x = new HashMap();

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final String f24619q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int f24620r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private double f24621s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private long f24622t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private long f24623u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private long f24624v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private long f24625w;

    private C1560k5(String str) {
        this.f24624v = 2147483647L;
        this.f24625w = -2147483648L;
        this.f24619q = str;
    }

    private final void a() {
        this.f24620r = 0;
        this.f24621s = 0.0d;
        this.f24622t = 0L;
        this.f24624v = 2147483647L;
        this.f24625w = -2147483648L;
    }

    public static C1560k5 j(String str) {
        K5.a();
        if (!K5.b()) {
            return C1546i5.f24587y;
        }
        Map map = f24618x;
        if (map.get("detectorTaskWithResource#run") == null) {
            map.put("detectorTaskWithResource#run", new C1560k5("detectorTaskWithResource#run"));
        }
        return (C1560k5) map.get("detectorTaskWithResource#run");
    }

    public C1560k5 b() {
        this.f24622t = SystemClock.elapsedRealtimeNanos() / 1000;
        return this;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        long j9 = this.f24622t;
        if (j9 == 0) {
            throw new IllegalStateException("Did you forget to call start()?");
        }
        g(j9);
    }

    public void f(long j9) {
        long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos() / 1000;
        long j10 = this.f24623u;
        if (j10 != 0 && jElapsedRealtimeNanos - j10 >= 1000000) {
            a();
        }
        this.f24623u = jElapsedRealtimeNanos;
        this.f24620r++;
        this.f24621s += j9;
        this.f24624v = Math.min(this.f24624v, j9);
        this.f24625w = Math.max(this.f24625w, j9);
        if (this.f24620r % 50 == 0) {
            String.format(Locale.US, "[%s] cur=%dus, counts=%d, min=%dus, max=%dus, avg=%dus", this.f24619q, Long.valueOf(j9), Integer.valueOf(this.f24620r), Long.valueOf(this.f24624v), Long.valueOf(this.f24625w), Integer.valueOf((int) (this.f24621s / ((double) this.f24620r))));
            K5.a();
        }
        if (this.f24620r % 500 == 0) {
            a();
        }
    }

    public void g(long j9) {
        f((SystemClock.elapsedRealtimeNanos() / 1000) - j9);
    }
}
