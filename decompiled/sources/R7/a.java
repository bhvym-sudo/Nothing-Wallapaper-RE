package R7;

import android.content.Context;
import android.os.Bundle;
import com.nothing.experience.AppTracking;
import kotlin.jvm.internal.n;

/* JADX INFO: loaded from: classes2.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AppTracking f7108a;

    public a(Context context) {
        n.h(context, "context");
        this.f7108a = AppTracking.getInstance(context);
    }

    public final boolean a(String eventName, Bundle eventParams) {
        n.h(eventName, "eventName");
        n.h(eventParams, "eventParams");
        return this.f7108a.logProductEvent(eventName, eventParams);
    }
}
