package p074h3;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;

/* JADX INFO: renamed from: h3.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1367g implements InterfaceC1361a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private AlarmManager f21685a;

    public C1367g(Context context) {
        this.f21685a = (AlarmManager) context.getSystemService("alarm");
    }

    @Override // p074h3.InterfaceC1361a
    public void a(int i10, long j9, long j10, PendingIntent pendingIntent) {
        this.f21685a.setInexactRepeating(i10, j9, j10, pendingIntent);
    }

    @Override // p074h3.InterfaceC1361a
    public void b(PendingIntent pendingIntent) {
        this.f21685a.cancel(pendingIntent);
    }
}
