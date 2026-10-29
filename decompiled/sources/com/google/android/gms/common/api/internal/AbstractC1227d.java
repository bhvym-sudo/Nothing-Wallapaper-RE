package com.google.android.gms.common.api.internal;

import android.os.Looper;
import java.util.concurrent.Executor;
import p025c4.AbstractC1202p;

/* JADX INFO: renamed from: com.google.android.gms.common.api.internal.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1227d {
    public static C1226c a(Object obj, Looper looper, String str) {
        AbstractC1202p.j(obj, "Listener must not be null");
        AbstractC1202p.j(looper, "Looper must not be null");
        AbstractC1202p.j(str, "Listener type must not be null");
        return new C1226c(looper, obj, str);
    }

    public static C1226c b(Object obj, Executor executor, String str) {
        AbstractC1202p.j(obj, "Listener must not be null");
        AbstractC1202p.j(executor, "Executor must not be null");
        AbstractC1202p.j(str, "Listener type must not be null");
        return new C1226c(executor, obj, str);
    }

    public static C1226c.a c(Object obj, String str) {
        AbstractC1202p.j(obj, "Listener must not be null");
        AbstractC1202p.j(str, "Listener type must not be null");
        AbstractC1202p.f(str, "Listener type must not be empty");
        return new C1226c.a(obj, str);
    }
}
