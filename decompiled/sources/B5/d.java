package B5;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import kotlin.jvm.internal.AbstractC1457h;
import kotlin.jvm.internal.n;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f383b = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final JSONObject f384a;

    public static final class a {
        public /* synthetic */ a(AbstractC1457h abstractC1457h) {
            this();
        }

        private a() {
        }
    }

    public d(JSONObject infoJson) {
        n.h(infoJson, "infoJson");
        this.f384a = infoJson;
    }

    private final PendingIntent a(Context context, int i10, Intent intent, int i11) {
        return PendingIntent.getActivity(context, i10, intent, i11, new b(p206u5.c.b(this.f384a, "bundle")).a());
    }

    private final PendingIntent b(Context context, int i10, Intent intent, int i11) {
        return PendingIntent.getForegroundService(context, i10, intent, i11);
    }

    private final PendingIntent e(Context context, int i10, Intent intent, int i11) {
        return PendingIntent.getService(context, i10, intent, i11);
    }

    public final Bundle c(Context context) {
        n.h(context, "context");
        Bundle bundle = new Bundle();
        int iIntValue = ((Number) p206u5.c.c(this.f384a, "intentType", 0)).intValue();
        Intent intentA = new c(p206u5.c.b(this.f384a, "intent")).a(context);
        int iIntValue2 = ((Number) p206u5.c.c(this.f384a, "requestCode", 1)).intValue();
        int iIntValue3 = ((Number) p206u5.c.c(this.f384a, "flags", 201326592)).intValue();
        Bundle bundleA = new b(p206u5.c.b(this.f384a, "bundle")).a();
        bundle.putInt("intentType", iIntValue);
        bundle.putParcelable("intent", intentA);
        bundle.putInt("requestCode", iIntValue2);
        bundle.putInt("flags", iIntValue3);
        bundle.putParcelable("bundle", bundleA);
        return bundle;
    }

    public final PendingIntent d(Context context) {
        n.h(context, "context");
        Intent intentA = new c(p206u5.c.b(this.f384a, "intent")).a(context);
        if (intentA == null) {
            return null;
        }
        int iIntValue = ((Number) p206u5.c.c(this.f384a, "intentType", 0)).intValue();
        int iIntValue2 = ((Number) p206u5.c.c(this.f384a, "requestCode", 1)).intValue();
        int iIntValue3 = ((Number) p206u5.c.c(this.f384a, "flags", 201326592)).intValue();
        if (iIntValue == 0) {
            return a(context, iIntValue2, intentA, iIntValue3);
        }
        if (iIntValue == 1) {
            return e(context, iIntValue2, intentA, iIntValue3);
        }
        if (iIntValue == 2) {
            return b(context, iIntValue2, intentA, iIntValue3);
        }
        G5.c.f1948a.l("SimulatedPendingIntent", "UnSupport PendingIntent type: " + iIntValue);
        return null;
    }
}
