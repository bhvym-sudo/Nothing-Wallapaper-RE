package B5;

import H5.i;
import android.app.PendingIntent;
import android.content.ContentProviderClient;
import android.content.ContentResolver;
import android.content.Context;
import android.os.Bundle;
import com.nothing.cardparser.exception.UnExpectedInfoTypeParserException;
import kotlin.jvm.internal.n;
import org.json.JSONObject;
import p079h8.A;
import p079h8.q;
import p079h8.r;
import p226w5.l;

/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final JSONObject f385a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f386b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f387c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f388d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f389e;

    public e(JSONObject jSONObject) {
        this.f385a = jSONObject;
        this.f386b = jSONObject != null ? ((Number) p206u5.c.c(jSONObject, i.f2544a.a(), -1)).intValue() : -1;
        this.f387c = jSONObject != null && ((Boolean) p206u5.c.c(jSONObject, "callRemote", Boolean.FALSE)).booleanValue();
        this.f388d = jSONObject != null ? ((Boolean) p206u5.c.c(jSONObject, "launchAnimation", Boolean.TRUE)).booleanValue() : true;
        this.f389e = jSONObject != null ? ((Boolean) p206u5.c.c(jSONObject, "clickCallback", Boolean.FALSE)).booleanValue() : false;
    }

    public final PendingIntent a(Context hostContext) {
        n.h(hostContext, "hostContext");
        if (I5.b.f3078a.g() == this.f386b) {
            if (this.f385a != null) {
                return new d(this.f385a).d(hostContext);
            }
            return null;
        }
        throw new UnExpectedInfoTypeParserException("Expected pending info, current type is " + this.f386b, null, 2, null);
    }

    public final PendingIntent b(l configProvider) {
        Object objB;
        Bundle bundleCall;
        n.h(configProvider, "configProvider");
        String strA = configProvider.a();
        int iC = configProvider.c();
        Context contextB = configProvider.b();
        ContentResolver contentResolver = contextB.getApplicationContext().getContentResolver();
        PendingIntent pendingIntent = null;
        try {
            q.a aVar = q.f21862r;
            ContentProviderClient contentProviderClientAcquireUnstableContentProviderClient = contentResolver.acquireUnstableContentProviderClient(strA);
            if (contentProviderClientAcquireUnstableContentProviderClient != null) {
                try {
                    JSONObject jSONObject = this.f385a;
                    bundleCall = contentProviderClientAcquireUnstableContentProviderClient.call("getPendingIntent", String.valueOf(iC), jSONObject != null ? new d(jSONObject).c(contextB) : null);
                    p199t8.a.a(contentProviderClientAcquireUnstableContentProviderClient, null);
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        p199t8.a.a(contentProviderClientAcquireUnstableContentProviderClient, th);
                        throw th2;
                    }
                }
            } else {
                bundleCall = null;
            }
            pendingIntent = bundleCall != null ? (PendingIntent) bundleCall.getParcelable("remotePendingIntent", PendingIntent.class) : null;
            objB = q.b(A.f21846a);
        } catch (Throwable th3) {
            q.a aVar2 = q.f21862r;
            objB = q.b(r.a(th3));
        }
        Throwable thD = q.d(objB);
        if (thD != null) {
            G5.c.d("Parse", "CallRemoteProvider error: " + thD.getMessage());
        }
        return pendingIntent;
    }

    public final boolean c() {
        return I5.b.f3078a.g() == this.f386b;
    }

    public final boolean d() {
        return this.f389e;
    }

    public final boolean e() {
        return this.f388d;
    }

    public final boolean f() {
        return this.f387c;
    }

    public final Bundle g() {
        Bundle bundle = new Bundle();
        JSONObject jSONObject = this.f385a;
        if (jSONObject != null) {
            bundle.putString("result_info", jSONObject.toString());
        }
        return bundle;
    }
}
