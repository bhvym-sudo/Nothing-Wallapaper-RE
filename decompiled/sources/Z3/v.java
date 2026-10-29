package Z3;

import android.content.Context;
import android.util.Log;

/* JADX INFO: loaded from: classes.dex */
abstract class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final t f9475a = new n(r.c("0\u0082\u0005È0\u0082\u0003° \u0003\u0002\u0001\u0002\u0002\u0014\u0010\u008ae\bsù/\u008eQí"));

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static final t f9476b = new o(r.c("0\u0082\u0006\u00040\u0082\u0003ì \u0003\u0002\u0001\u0002\u0002\u0014\u0003£²\u00ad×árÊkì"));

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static final t f9477c = new p(r.c("0\u0082\u0004C0\u0082\u0003+ \u0003\u0002\u0001\u0002\u0002\t\u0000Âà\u0087FdJ0\u008d0"));

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static final t f9478d = new q(r.c("0\u0082\u0004¨0\u0082\u0003\u0090 \u0003\u0002\u0001\u0002\u0002\t\u0000Õ\u0085¸l}ÓNõ0"));

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final Object f9479e = new Object();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static Context f9480f;

    static synchronized void a(Context context) {
        if (f9480f != null) {
            Log.w("GoogleCertificates", "GoogleCertificates has been initialized already");
        } else if (context != null) {
            f9480f = context.getApplicationContext();
        }
    }
}
