package F5;

import android.content.ContentProviderClient;
import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.os.RemoteException;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.internal.AbstractC1457h;
import p079h8.A;

/* JADX INFO: loaded from: classes.dex */
public final class l extends F5.a {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final a f1669g = new a(null);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static volatile l f1670h;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Context f1671f;

    public static final class a {
        public /* synthetic */ a(AbstractC1457h abstractC1457h) {
            this();
        }

        public final l a(Context context) {
            kotlin.jvm.internal.n.h(context, "context");
            synchronized (l.class) {
                try {
                    if (l.f1670h == null) {
                        l.f1670h = new l(context, null);
                    }
                    A a10 = A.f21846a;
                } catch (Throwable th) {
                    throw th;
                }
            }
            l lVar = l.f1670h;
            kotlin.jvm.internal.n.e(lVar);
            return lVar;
        }

        private a() {
        }
    }

    public /* synthetic */ l(Context context, AbstractC1457h abstractC1457h) {
        this(context);
    }

    public final List j(String str) {
        List listE;
        b();
        q qVarC = c();
        if (qVarC != null) {
            try {
                listE = b.f1640a.a("getInstalledCardWithLevel", d()) ? qVarC.E(str, 13) : qVarC.S(str);
            } catch (RemoteException e10) {
                G5.c.d("Manager", "widget service dead?: " + e10);
                listE = Collections.EMPTY_LIST;
            }
            if (listE != null) {
                return listE;
            }
        }
        List list = Collections.EMPTY_LIST;
        kotlin.jvm.internal.n.g(list, "emptyList(...)");
        return list;
    }

    public final Uri k(String stickerCode) {
        Object objB;
        kotlin.jvm.internal.n.h(stickerCode, "stickerCode");
        b();
        try {
            h8.q.a aVar = p079h8.q.f21862r;
            q qVarC = c();
            objB = p079h8.q.b(qVarC != null ? qVarC.i(stickerCode) : null);
        } catch (Throwable th) {
            h8.q.a aVar2 = p079h8.q.f21862r;
            objB = p079h8.q.b(p079h8.r.a(th));
        }
        Throwable thD = p079h8.q.d(objB);
        if (thD != null) {
            G5.c.d("Manager", "widget service dead?: " + thD);
        }
        return (Uri) (p079h8.q.f(objB) ? null : objB);
    }

    public final m l(int i10) {
        b();
        q qVarC = c();
        if (qVarC == null) {
            return null;
        }
        try {
            return qVarC.G(i10);
        } catch (RemoteException e10) {
            G5.c.d("Manager", "widget service dead?: " + e10);
            return null;
        }
    }

    public final Bundle m(int i10) {
        b();
        q qVarC = c();
        if (qVarC == null) {
            return null;
        }
        try {
            return qVarC.l(i10);
        } catch (RemoteException e10) {
            G5.c.d("Manager", "widget service dead?: " + e10);
            return null;
        }
    }

    public final boolean n(int i10, String authority) {
        Object objB;
        kotlin.jvm.internal.n.h(authority, "authority");
        ContentResolver contentResolver = this.f1671f.getApplicationContext().getContentResolver();
        try {
            h8.q.a aVar = p079h8.q.f21862r;
            ContentProviderClient contentProviderClientAcquireUnstableContentProviderClient = contentResolver.acquireUnstableContentProviderClient(authority);
            Boolean bool = null;
            if (contentProviderClientAcquireUnstableContentProviderClient != null) {
                try {
                    String strValueOf = String.valueOf(i10);
                    Bundle bundle = new Bundle();
                    bundle.putString("widget_config_key", "should_intercept_click");
                    A a10 = A.f21846a;
                    Bundle bundleCall = contentProviderClientAcquireUnstableContentProviderClient.call("getWidgetConfigInfo", strValueOf, bundle);
                    Boolean boolValueOf = Boolean.valueOf(bundleCall != null ? bundleCall.getBoolean("should_intercept_click", true) : true);
                    p199t8.a.a(contentProviderClientAcquireUnstableContentProviderClient, null);
                    bool = boolValueOf;
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        p199t8.a.a(contentProviderClientAcquireUnstableContentProviderClient, th);
                        throw th2;
                    }
                }
            }
            objB = p079h8.q.b(bool);
        } catch (Throwable th3) {
            h8.q.a aVar2 = p079h8.q.f21862r;
            objB = p079h8.q.b(p079h8.r.a(th3));
        }
        Boolean bool2 = Boolean.TRUE;
        if (p079h8.q.f(objB)) {
            objB = bool2;
        }
        Boolean bool3 = (Boolean) objB;
        if (bool3 != null) {
            return bool3.booleanValue();
        }
        return true;
    }

    public final void o(int i10, Bundle options) {
        kotlin.jvm.internal.n.h(options, "options");
        b();
        q qVarC = c();
        if (qVarC != null) {
            try {
                qVarC.W(i10, options);
            } catch (RemoteException e10) {
                G5.c.d("Manager", "widget service dead?: " + e10);
            }
        }
    }

    private l(Context context) {
        super(context);
        this.f1671f = context;
        j jVar = j.f1647a;
        Context applicationContext = context.getApplicationContext();
        kotlin.jvm.internal.n.g(applicationContext, "getApplicationContext(...)");
        jVar.z(applicationContext, this);
        G5.c.f1948a.j(context);
    }
}
