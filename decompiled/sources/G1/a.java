package G1;

import android.content.Context;
import android.content.om.OverlayManager;
import p222w1.b;

/* JADX INFO: loaded from: classes.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final OverlayManager f1938a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String[] f1939b;

    public a(Context context) {
        this.f1938a = (OverlayManager) context.getSystemService(OverlayManager.class);
        this.f1939b = b.b(context);
    }
}
