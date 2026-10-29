package androidx.room;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.RemoteException;
import android.util.Log;
import androidx.room.d;
import java.util.Arrays;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.n;

/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f13666a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final androidx.room.c f13667b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Executor f13668c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Context f13669d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f13670e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public androidx.room.c.AbstractC0411c f13671f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private androidx.room.b f13672g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final androidx.room.a f13673h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final AtomicBoolean f13674i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final ServiceConnection f13675j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final Runnable f13676k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final Runnable f13677l;

    public static final class a extends androidx.room.c.AbstractC0411c {
        a(String[] strArr) {
            super(strArr);
        }

        @Override // androidx.room.c.AbstractC0411c
        public boolean b() {
            return true;
        }

        @Override // androidx.room.c.AbstractC0411c
        public void c(Set tables) {
            n.h(tables, "tables");
            if (d.this.j().get()) {
                return;
            }
            try {
                androidx.room.b bVarH = d.this.h();
                if (bVarH != null) {
                    bVarH.O(d.this.c(), (String[]) tables.toArray(new String[0]));
                }
            } catch (RemoteException e10) {
                Log.w("ROOM", "Cannot broadcast invalidation", e10);
            }
        }
    }

    public static final class b extends androidx.room.a.AbstractBinderC0408a {
        b() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void e(d this$0, String[] tables) {
            n.h(this$0, "this$0");
            n.h(tables, "$tables");
            this$0.e().k((String[]) Arrays.copyOf(tables, tables.length));
        }

        @Override // androidx.room.a
        public void m(final String[] tables) {
            n.h(tables, "tables");
            Executor executorD = d.this.d();
            final d dVar = d.this;
            executorD.execute(new Runnable() { // from class: g1.o
                @Override // java.lang.Runnable
                public final void run() {
                    d.b.e(dVar, tables);
                }
            });
        }
    }

    public static final class c implements ServiceConnection {
        c() {
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName name, IBinder service) {
            n.h(name, "name");
            n.h(service, "service");
            d.this.m(androidx.room.b.a.a(service));
            d.this.d().execute(d.this.i());
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName name) {
            n.h(name, "name");
            d.this.d().execute(d.this.g());
            d.this.m(null);
        }
    }

    public d(Context context, String name, Intent serviceIntent, androidx.room.c invalidationTracker, Executor executor) {
        n.h(context, "context");
        n.h(name, "name");
        n.h(serviceIntent, "serviceIntent");
        n.h(invalidationTracker, "invalidationTracker");
        n.h(executor, "executor");
        this.f13666a = name;
        this.f13667b = invalidationTracker;
        this.f13668c = executor;
        Context applicationContext = context.getApplicationContext();
        this.f13669d = applicationContext;
        this.f13673h = new b();
        this.f13674i = new AtomicBoolean(false);
        c cVar = new c();
        this.f13675j = cVar;
        this.f13676k = new Runnable() { // from class: g1.m
            @Override // java.lang.Runnable
            public final void run() {
                d.n(this.f21060q);
            }
        };
        this.f13677l = new Runnable() { // from class: g1.n
            @Override // java.lang.Runnable
            public final void run() {
                d.k(this.f21061q);
            }
        };
        l(new a((String[]) invalidationTracker.i().keySet().toArray(new String[0])));
        applicationContext.bindService(serviceIntent, cVar, 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void k(d this$0) {
        n.h(this$0, "this$0");
        this$0.f13667b.n(this$0.f());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void n(d this$0) {
        n.h(this$0, "this$0");
        try {
            androidx.room.b bVar = this$0.f13672g;
            if (bVar != null) {
                this$0.f13670e = bVar.p(this$0.f13673h, this$0.f13666a);
                this$0.f13667b.c(this$0.f());
            }
        } catch (RemoteException e10) {
            Log.w("ROOM", "Cannot register multi-instance invalidation callback", e10);
        }
    }

    public final int c() {
        return this.f13670e;
    }

    public final Executor d() {
        return this.f13668c;
    }

    public final androidx.room.c e() {
        return this.f13667b;
    }

    public final androidx.room.c.AbstractC0411c f() {
        androidx.room.c.AbstractC0411c abstractC0411c = this.f13671f;
        if (abstractC0411c != null) {
            return abstractC0411c;
        }
        n.r("observer");
        return null;
    }

    public final Runnable g() {
        return this.f13677l;
    }

    public final androidx.room.b h() {
        return this.f13672g;
    }

    public final Runnable i() {
        return this.f13676k;
    }

    public final AtomicBoolean j() {
        return this.f13674i;
    }

    public final void l(androidx.room.c.AbstractC0411c abstractC0411c) {
        n.h(abstractC0411c, "<set-?>");
        this.f13671f = abstractC0411c;
    }

    public final void m(androidx.room.b bVar) {
        this.f13672g = bVar;
    }
}
