package H3;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;

/* JADX INFO: loaded from: classes.dex */
public class w extends BroadcastReceiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private a f2531a;

    public interface a {
        void a();
    }

    private w(a aVar) {
        this.f2531a = aVar;
    }

    public static w a(Context context, a aVar) {
        w wVar = new w(aVar);
        context.registerReceiver(wVar, new IntentFilter("android.intent.action.TIME_TICK"));
        return wVar;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        a aVar = this.f2531a;
        if (aVar != null) {
            aVar.a();
        }
    }
}
