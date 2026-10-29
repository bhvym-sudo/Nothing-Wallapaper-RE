package p175r4;

import android.content.Context;
import android.os.SystemClock;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;
import p025c4.AbstractC1205t;
import p025c4.C1200n;
import p025c4.C1204s;
import p025c4.C1207v;
import p025c4.InterfaceC1206u;
import p215v4.InterfaceC1995f;

/* JADX INFO: renamed from: r4.h9, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1806h9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC1206u f26715a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AtomicLong f26716b = new AtomicLong(-1);

    C1806h9(Context context, String str) {
        this.f26715a = AbstractC1205t.b(context, C1207v.a().b("mlkit:vision").a());
    }

    public static C1806h9 a(Context context) {
        return new C1806h9(context, "mlkit:vision");
    }

    final /* synthetic */ void b(long j9, Exception exc) {
        this.f26716b.set(j9);
    }

    public final synchronized void c(int i10, int i11, long j9, long j10) {
        AtomicLong atomicLong = this.f26716b;
        final long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (atomicLong.get() != -1 && jElapsedRealtime - this.f26716b.get() <= TimeUnit.MINUTES.toMillis(30L)) {
            return;
        }
        this.f26715a.c(new C1204s(0, Arrays.asList(new C1200n(24336, i11, 0, j9, j10, null, null, 0)))).e(new InterfaceC1995f() { // from class: r4.g9
            @Override // p215v4.InterfaceC1995f
            public final void d(Exception exc) {
                this.f26696a.b(jElapsedRealtime, exc);
            }
        });
    }
}
