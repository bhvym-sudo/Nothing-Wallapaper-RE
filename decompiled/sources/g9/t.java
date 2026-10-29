package g9;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
abstract class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final Executor f21486a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static final u f21487b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static final C1360c f21488c;

    static {
        String property = System.getProperty("java.vm.name");
        property.getClass();
        if (property.equals("RoboVM")) {
            f21486a = null;
            f21487b = new u();
            f21488c = new C1360c();
        } else if (property.equals("Dalvik")) {
            f21486a = new ExecutorC1358a();
            f21487b = new u.a();
            f21488c = new C1360c.a();
        } else {
            f21486a = null;
            f21487b = new u.b();
            f21488c = new C1360c.a();
        }
    }
}
