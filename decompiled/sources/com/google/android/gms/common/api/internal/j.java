package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.Status;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map f16280a = Collections.synchronizedMap(new WeakHashMap());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map f16281b = Collections.synchronizedMap(new WeakHashMap());

    private final void f(boolean z9, Status status) {
        HashMap map;
        HashMap map2;
        synchronized (this.f16280a) {
            map = new HashMap(this.f16280a);
        }
        synchronized (this.f16281b) {
            map2 = new HashMap(this.f16281b);
        }
        for (Map.Entry entry : map.entrySet()) {
            if (z9 || ((Boolean) entry.getValue()).booleanValue()) {
                androidx.appcompat.app.o.a(entry.getKey());
                throw null;
            }
        }
        for (Map.Entry entry2 : map2.entrySet()) {
            if (z9 || ((Boolean) entry2.getValue()).booleanValue()) {
                ((p215v4.l) entry2.getKey()).d(new p005a4.b(status));
            }
        }
    }

    final void b(p215v4.l lVar, boolean z9) {
        this.f16281b.put(lVar, Boolean.valueOf(z9));
        lVar.a().c(new C1232i(this, lVar));
    }

    final void c(int i10, String str) {
        StringBuilder sb = new StringBuilder("The connection to Google Play services was lost");
        if (i10 == 1) {
            sb.append(" due to service disconnection.");
        } else if (i10 == 3) {
            sb.append(" due to dead object exception.");
        }
        if (str != null) {
            sb.append(" Last reason for disconnect: ");
            sb.append(str);
        }
        f(true, new Status(20, sb.toString()));
    }

    public final void d() {
        f(false, C1225b.f16230r);
    }

    final boolean e() {
        return (this.f16280a.isEmpty() && this.f16281b.isEmpty()) ? false : true;
    }
}
