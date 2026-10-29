package O5;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.jvm.internal.AbstractC1457h;
import kotlin.jvm.internal.n;
import p079h8.A;
import p079h8.q;
import p079h8.r;
import p089i8.AbstractC1444s;

/* JADX INFO: loaded from: classes2.dex */
public final class b extends BroadcastReceiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f5889a = new b();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static volatile Map f5890b = new LinkedHashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static volatile Set f5891c = new LinkedHashSet();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static Future f5892d;

    public static final class a implements Runnable {

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public static final C0193a f5893u = new C0193a(null);

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        private static volatile AtomicLong f5894v = new AtomicLong(0);

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private final IntentFilter f5895q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private final BroadcastReceiver f5896r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        private final long f5897s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private final Context f5898t;

        /* JADX INFO: renamed from: O5.b$a$a, reason: collision with other inner class name */
        public static final class C0193a {
            public /* synthetic */ C0193a(AbstractC1457h abstractC1457h) {
                this();
            }

            private C0193a() {
            }
        }

        public a(Context context, IntentFilter intentFilter, BroadcastReceiver receiver) {
            n.h(context, "context");
            n.h(intentFilter, "intentFilter");
            n.h(receiver, "receiver");
            this.f5895q = intentFilter;
            this.f5896r = receiver;
            long jCurrentTimeMillis = System.currentTimeMillis();
            this.f5897s = jCurrentTimeMillis;
            this.f5898t = context.getApplicationContext();
            if (f5894v.get() != 0) {
                f5894v.set(jCurrentTimeMillis);
            } else {
                f5894v.set(1L);
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            Object objB;
            if (this.f5897s >= f5894v.get()) {
                try {
                    q.a aVar = q.f21862r;
                    if (f5894v.get() != 1) {
                        this.f5898t.unregisterReceiver(this.f5896r);
                    }
                    q.b(A.f21846a);
                } catch (Throwable th) {
                    q.a aVar2 = q.f21862r;
                    q.b(r.a(th));
                }
                try {
                    int iCountActions = this.f5895q.countActions();
                    if (iCountActions > 0) {
                        this.f5898t.registerReceiver(this.f5896r, this.f5895q);
                    }
                    objB = q.b(Integer.valueOf(Log.i("ConfigBroadcastManager", "Register Broadcast successfully for intent actions size = " + iCountActions)));
                } catch (Throwable th2) {
                    q.a aVar3 = q.f21862r;
                    objB = q.b(r.a(th2));
                }
                Throwable thD = q.d(objB);
                if (thD != null) {
                    Log.e("ConfigBroadcastManager", "Register Broadcast Task execute failure with exception.", thD);
                }
            }
        }
    }

    /* JADX INFO: renamed from: O5.b$b, reason: collision with other inner class name */
    public interface InterfaceC0194b {
        void onBroadcastReceive(Intent intent);
    }

    private b() {
    }

    public static final synchronized void a(Context context, InterfaceC0194b observer, List actions) {
        n.h(context, "context");
        n.h(observer, "observer");
        n.h(actions, "actions");
        f5890b.put(observer, actions);
        f5889a.c(context);
    }

    private final IntentFilter b(Set set) {
        IntentFilter intentFilter = new IntentFilter();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            intentFilter.addAction((String) it.next());
        }
        return intentFilter;
    }

    private final boolean c(Context context) {
        Map map = f5890b;
        ArrayList arrayList = new ArrayList();
        Iterator it = map.entrySet().iterator();
        while (it.hasNext()) {
            AbstractC1444s.z(arrayList, (Iterable) ((Map.Entry) it.next()).getValue());
        }
        Set setV0 = AbstractC1444s.v0(arrayList);
        if (n.d(setV0, f5891c)) {
            return false;
        }
        IntentFilter intentFilterB = b(setV0);
        Future future = f5892d;
        if (future != null) {
            future.cancel(true);
        }
        try {
            q.a aVar = q.f21862r;
            f5892d = Executors.newCachedThreadPool().submit(new a(context, intentFilterB, f5889a));
            q.b(A.f21846a);
        } catch (Throwable th) {
            q.a aVar2 = q.f21862r;
            q.b(r.a(th));
        }
        f5891c = setV0;
        return true;
    }

    public static final synchronized void d(Context context, InterfaceC0194b observer) {
        n.h(context, "context");
        n.h(observer, "observer");
        f5890b.remove(observer);
        f5889a.c(context);
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        String action;
        String action2 = intent != null ? intent.getAction() : null;
        Log.i("ConfigBroadcastManager", "onReceive action =" + action2 + ", actionMap = " + f5890b.size());
        if (intent == null || (action = intent.getAction()) == null) {
            return;
        }
        for (Map.Entry entry : f5890b.entrySet()) {
            if (((List) entry.getValue()).contains(action)) {
                ((InterfaceC0194b) entry.getKey()).onBroadcastReceive(intent);
            }
        }
    }
}
