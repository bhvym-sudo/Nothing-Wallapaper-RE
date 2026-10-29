package com.google.android.gms.common.api.internal;

import android.os.Looper;
import java.util.concurrent.Executor;
import p025c4.AbstractC1202p;

/* JADX INFO: renamed from: com.google.android.gms.common.api.internal.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1226c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Executor f16251a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private volatile Object f16252b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private volatile a f16253c;

    /* JADX INFO: renamed from: com.google.android.gms.common.api.internal.c$a */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Object f16254a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f16255b;

        a(Object obj, String str) {
            this.f16254a = obj;
            this.f16255b = str;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f16254a == aVar.f16254a && this.f16255b.equals(aVar.f16255b);
        }

        public int hashCode() {
            return (System.identityHashCode(this.f16254a) * 31) + this.f16255b.hashCode();
        }
    }

    /* JADX INFO: renamed from: com.google.android.gms.common.api.internal.c$b */
    public interface b {
        void a(Object obj);

        void b();
    }

    C1226c(Looper looper, Object obj, String str) {
        this.f16251a = new p095j4.a(looper);
        this.f16252b = AbstractC1202p.j(obj, "Listener must not be null");
        this.f16253c = new a(obj, AbstractC1202p.e(str));
    }

    public void a() {
        this.f16252b = null;
        this.f16253c = null;
    }

    public a b() {
        return this.f16253c;
    }

    public void c(final b bVar) {
        AbstractC1202p.j(bVar, "Notifier must not be null");
        this.f16251a.execute(new Runnable() { // from class: com.google.android.gms.common.api.internal.u
            @Override // java.lang.Runnable
            public final void run() {
                this.f16313q.d(bVar);
            }
        });
    }

    final void d(b bVar) {
        Object obj = this.f16252b;
        if (obj == null) {
            bVar.b();
            return;
        }
        try {
            bVar.a(obj);
        } catch (RuntimeException e10) {
            bVar.b();
            throw e10;
        }
    }

    C1226c(Executor executor, Object obj, String str) {
        this.f16251a = (Executor) AbstractC1202p.j(executor, "Executor must not be null");
        this.f16252b = AbstractC1202p.j(obj, "Listener must not be null");
        this.f16253c = new a(obj, AbstractC1202p.e(str));
    }
}
