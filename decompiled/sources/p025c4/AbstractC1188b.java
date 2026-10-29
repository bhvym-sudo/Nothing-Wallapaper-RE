package p025c4;

import com.google.android.gms.common.api.Status;
import p005a4.b;
import p005a4.g;

/* JADX INFO: renamed from: c4.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1188b {
    public static b a(Status status) {
        return status.d() ? new g(status) : new b(status);
    }
}
