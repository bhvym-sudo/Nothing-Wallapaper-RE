package p074h3;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: h3.t, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1379t implements M {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f21725a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ConnectivityManager f21726b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private BroadcastReceiver f21727c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private List f21728d;

    /* JADX INFO: renamed from: h3.t$a */
    class a extends BroadcastReceiver {
        a() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            int iB = C1379t.this.b();
            for (int i10 = 0; i10 < C1379t.this.f21728d.size(); i10++) {
                ((M.a) C1379t.this.f21728d.get(i10)).a(iB);
            }
        }
    }

    public C1379t(Context context) {
        Context applicationContext = context.getApplicationContext();
        this.f21725a = applicationContext;
        this.f21726b = (ConnectivityManager) applicationContext.getSystemService("connectivity");
        this.f21728d = new ArrayList();
    }

    @Override // p074h3.M
    public void a(M.a aVar) {
        if (this.f21727c != null) {
            if (this.f21728d.contains(aVar)) {
                return;
            }
            this.f21728d.add(aVar);
        } else {
            this.f21727c = new a();
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
            if (!this.f21728d.contains(aVar)) {
                this.f21728d.add(aVar);
            }
            this.f21725a.registerReceiver(this.f21727c, intentFilter);
        }
    }

    @Override // p074h3.M
    public int b() {
        NetworkInfo activeNetworkInfo = this.f21726b.getActiveNetworkInfo();
        return (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) ? 0 : 1;
    }

    @Override // p074h3.M
    public void c(M.a aVar) {
        BroadcastReceiver broadcastReceiver;
        this.f21728d.remove(aVar);
        if (!this.f21728d.isEmpty() || (broadcastReceiver = this.f21727c) == null) {
            return;
        }
        this.f21725a.unregisterReceiver(broadcastReceiver);
        this.f21727c = null;
    }
}
