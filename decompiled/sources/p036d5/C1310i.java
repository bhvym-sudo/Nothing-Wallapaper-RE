package p036d5;

import S4.c;
import S4.f;
import S4.m;
import android.content.Context;
import com.google.mlkit.common.internal.MlKitComponentDiscoveryService;
import p025c4.AbstractC1202p;

/* JADX INFO: renamed from: d5.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1310i {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Object f19580b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static C1310i f19581c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private m f19582a;

    private C1310i() {
    }

    public static C1310i c() {
        C1310i c1310i;
        synchronized (f19580b) {
            AbstractC1202p.m(f19581c != null, "MlKitContext has not been initialized");
            c1310i = (C1310i) AbstractC1202p.i(f19581c);
        }
        return c1310i;
    }

    public static C1310i d(Context context) {
        C1310i c1310iE;
        synchronized (f19580b) {
            c1310iE = f19581c;
            if (c1310iE == null) {
                c1310iE = e(context);
            }
        }
        return c1310iE;
    }

    public static C1310i e(Context context) {
        C1310i c1310i;
        synchronized (f19580b) {
            AbstractC1202p.m(f19581c == null, "MlKitContext is already initialized");
            C1310i c1310i2 = new C1310i();
            f19581c = c1310i2;
            Context contextF = f(context);
            m mVarC = m.e(p215v4.m.f28507a).b(f.b(contextF, MlKitComponentDiscoveryService.class).a()).a(c.l(contextF, Context.class, new Class[0])).a(c.l(c1310i2, C1310i.class, new Class[0])).c();
            c1310i2.f19582a = mVarC;
            mVarC.h(true);
            c1310i = f19581c;
        }
        return c1310i;
    }

    private static Context f(Context context) {
        Context applicationContext = context.getApplicationContext();
        return applicationContext != null ? applicationContext : context;
    }

    public Object a(Class cls) {
        AbstractC1202p.m(f19581c == this, "MlKitContext has been deleted");
        AbstractC1202p.i(this.f19582a);
        return this.f19582a.a(cls);
    }

    public Context b() {
        return (Context) a(Context.class);
    }
}
