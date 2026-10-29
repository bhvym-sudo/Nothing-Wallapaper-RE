package p025c4;

import android.content.Context;
import android.content.ServiceConnection;
import android.os.HandlerThread;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: c4.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1194h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f15186a = 4225;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Object f15187b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static g0 f15188c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static HandlerThread f15189d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static boolean f15190e = false;

    public static int a() {
        return f15186a;
    }

    public static AbstractC1194h b(Context context) {
        synchronized (f15187b) {
            try {
                if (f15188c == null) {
                    f15188c = new g0(context.getApplicationContext(), f15190e ? c().getLooper() : context.getMainLooper());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return f15188c;
    }

    public static HandlerThread c() {
        synchronized (f15187b) {
            try {
                HandlerThread handlerThread = f15189d;
                if (handlerThread != null) {
                    return handlerThread;
                }
                HandlerThread handlerThread2 = new HandlerThread("GoogleApiHandler", 9);
                f15189d = handlerThread2;
                handlerThread2.start();
                return f15189d;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    protected abstract void d(c0 c0Var, ServiceConnection serviceConnection, String str);

    public final void e(String str, String str2, int i10, ServiceConnection serviceConnection, String str3, boolean z9) {
        d(new c0(str, str2, i10, z9), serviceConnection, str3);
    }

    protected abstract boolean f(c0 c0Var, ServiceConnection serviceConnection, String str, Executor executor);
}
