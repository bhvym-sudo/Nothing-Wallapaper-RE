package p087i6;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import com.nothing.wallpaper.common.log.c;
import kotlin.jvm.internal.n;
import p079h8.h;
import p079h8.i;
import p219v8.l;

/* JADX INFO: loaded from: classes2.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f22198a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f22199b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private l f22200c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final h f22201d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final a f22202e;

    public static final class a extends ConnectivityManager.NetworkCallback {
        a() {
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onCapabilitiesChanged(Network network, NetworkCapabilities capabilities) {
            l lVar;
            n.h(network, "network");
            n.h(capabilities, "capabilities");
            super.onCapabilitiesChanged(network, capabilities);
            boolean z9 = capabilities.hasCapability(12) && capabilities.hasCapability(16);
            c.k(k.this.f22199b, "onCapabilitiesChanged " + z9);
            if (!z9 || (lVar = k.this.f22200c) == null) {
                return;
            }
            lVar.f(Boolean.TRUE);
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onLost(Network network) {
            n.h(network, "network");
            super.onLost(network);
            c.k(k.this.f22199b, "onLost");
            l lVar = k.this.f22200c;
            if (lVar != null) {
                lVar.f(Boolean.FALSE);
            }
        }
    }

    public k(Context context) {
        n.h(context, "context");
        this.f22198a = context;
        this.f22199b = "NTNetworkStatusNotifier";
        this.f22201d = i.b(new p219v8.a() { // from class: i6.j
            @Override // p219v8.a
            public final Object invoke() {
                return k.d(this.f22197q);
            }
        });
        this.f22202e = new a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ConnectivityManager d(k kVar) {
        Object systemService = kVar.f22198a.getSystemService("connectivity");
        n.f(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
        return (ConnectivityManager) systemService;
    }

    private final ConnectivityManager e() {
        return (ConnectivityManager) this.f22201d.getValue();
    }

    public final void f(l networkChanged) {
        n.h(networkChanged, "networkChanged");
        if (this.f22200c == null) {
            e().registerDefaultNetworkCallback(this.f22202e);
            this.f22200c = networkChanged;
        }
    }

    public final void g() {
        if (this.f22200c != null) {
            e().unregisterNetworkCallback(this.f22202e);
            this.f22200c = null;
        }
    }
}
