package S3;

import android.app.job.JobInfo;
import com.nothing.cardwidget.battery.BatteryConfig;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public abstract class d {

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private V3.a f7237a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Map f7238b = new HashMap();

        public a a(K3.d dVar, b bVar) {
            this.f7238b.put(dVar, bVar);
            return this;
        }

        public d b() {
            if (this.f7237a == null) {
                throw new NullPointerException("missing required property: clock");
            }
            if (this.f7238b.keySet().size() < K3.d.values().length) {
                throw new IllegalStateException("Not all priorities have been configured");
            }
            Map map = this.f7238b;
            this.f7238b = new HashMap();
            return d.d(this.f7237a, map);
        }

        public a c(V3.a aVar) {
            this.f7237a = aVar;
            return this;
        }
    }

    public static abstract class b {

        public static abstract class a {
            public abstract b a();

            public abstract a b(long j9);

            public abstract a c(Set set);

            public abstract a d(long j9);
        }

        public static a a() {
            return new S3.b.C0261b().c(Collections.EMPTY_SET);
        }

        abstract long b();

        abstract Set c();

        abstract long d();
    }

    public enum c {
        NETWORK_UNMETERED,
        DEVICE_IDLE,
        DEVICE_CHARGING
    }

    private long a(int i10, long j9) {
        int i11 = i10 - 1;
        return (long) (Math.pow(3.0d, i11) * j9 * Math.max(1.0d, Math.log(10000.0d) / Math.log((j9 > 1 ? j9 : 2L) * ((long) i11))));
    }

    public static a b() {
        return new a();
    }

    static d d(V3.a aVar, Map map) {
        return new S3.a(aVar, map);
    }

    public static d f(V3.a aVar) {
        return b().a(K3.d.DEFAULT, b.a().b(BatteryConfig.DURATION_TASK_AWAITING).d(86400000L).a()).a(K3.d.HIGHEST, b.a().b(1000L).d(86400000L).a()).a(K3.d.VERY_LOW, b.a().b(86400000L).d(86400000L).c(i(c.NETWORK_UNMETERED, c.DEVICE_IDLE)).a()).c(aVar).b();
    }

    private static Set i(Object... objArr) {
        return Collections.unmodifiableSet(new HashSet(Arrays.asList(objArr)));
    }

    private void j(JobInfo.Builder builder, Set set) {
        if (set.contains(c.NETWORK_UNMETERED)) {
            builder.setRequiredNetworkType(2);
        } else {
            builder.setRequiredNetworkType(1);
        }
        if (set.contains(c.DEVICE_CHARGING)) {
            builder.setRequiresCharging(true);
        }
        if (set.contains(c.DEVICE_IDLE)) {
            builder.setRequiresDeviceIdle(true);
        }
    }

    public JobInfo.Builder c(JobInfo.Builder builder, K3.d dVar, long j9, int i10) {
        builder.setMinimumLatency(g(dVar, j9, i10));
        j(builder, ((b) h().get(dVar)).c());
        return builder;
    }

    abstract V3.a e();

    public long g(K3.d dVar, long j9, int i10) {
        long jA = j9 - e().a();
        b bVar = (b) h().get(dVar);
        return Math.min(Math.max(a(i10, bVar.b()), jA), bVar.d());
    }

    abstract Map h();
}
