package androidx.fragment.app;

import android.content.Context;
import android.os.Bundle;
import android.view.View;

/* JADX INFO: renamed from: androidx.fragment.app.x, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1138x {
    public AbstractComponentCallbacksC1132q b(Context context, String str, Bundle bundle) {
        return AbstractComponentCallbacksC1132q.instantiate(context, str, bundle);
    }

    public abstract View c(int i10);

    public abstract boolean d();
}
