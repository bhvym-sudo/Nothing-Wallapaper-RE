package G8;

import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import java.lang.reflect.InvocationTargetException;
import kotlin.jvm.internal.n;
import p079h8.q;
import p079h8.r;

/* JADX INFO: loaded from: classes2.dex */
public abstract class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final g f2280a;
    private static volatile Choreographer choreographer;

    static {
        Object objB;
        try {
            q.a aVar = q.f21862r;
            objB = q.b(new f(a(Looper.getMainLooper(), true), null, 2, null));
        } catch (Throwable th) {
            q.a aVar2 = q.f21862r;
            objB = q.b(r.a(th));
        }
        f2280a = (g) (q.f(objB) ? null : objB);
    }

    public static final Handler a(Looper looper, boolean z9) throws IllegalAccessException, InvocationTargetException {
        if (!z9) {
            return new Handler(looper);
        }
        Object objInvoke = Handler.class.getDeclaredMethod("createAsync", Looper.class).invoke(null, looper);
        n.f(objInvoke, "null cannot be cast to non-null type android.os.Handler");
        return (Handler) objInvoke;
    }

    public static final g b(Handler handler, String str) {
        return new f(handler, str);
    }
}
