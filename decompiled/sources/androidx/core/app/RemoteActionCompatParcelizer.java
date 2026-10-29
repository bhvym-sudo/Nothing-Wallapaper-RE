package androidx.core.app;

import android.app.PendingIntent;
import androidx.core.graphics.drawable.IconCompat;
import androidx.versionedparcelable.a;

/* JADX INFO: loaded from: classes.dex */
public class RemoteActionCompatParcelizer {
    public static RemoteActionCompat read(a aVar) {
        RemoteActionCompat remoteActionCompat = new RemoteActionCompat();
        remoteActionCompat.f12157a = (IconCompat) aVar.C(remoteActionCompat.f12157a, 1);
        remoteActionCompat.f12158b = aVar.o(remoteActionCompat.f12158b, 2);
        remoteActionCompat.f12159c = aVar.o(remoteActionCompat.f12159c, 3);
        remoteActionCompat.f12160d = (PendingIntent) aVar.w(remoteActionCompat.f12160d, 4);
        remoteActionCompat.f12161e = aVar.k(remoteActionCompat.f12161e, 5);
        remoteActionCompat.f12162f = aVar.k(remoteActionCompat.f12162f, 6);
        return remoteActionCompat;
    }

    public static void write(RemoteActionCompat remoteActionCompat, a aVar) {
        aVar.E(false, false);
        aVar.Z(remoteActionCompat.f12157a, 1);
        aVar.M(remoteActionCompat.f12158b, 2);
        aVar.M(remoteActionCompat.f12159c, 3);
        aVar.S(remoteActionCompat.f12160d, 4);
        aVar.I(remoteActionCompat.f12161e, 5);
        aVar.I(remoteActionCompat.f12162f, 6);
    }
}
