package p170r;

import A.q;
import android.os.Looper;
import android.util.Log;
import kotlin.jvm.internal.o;
import p079h8.h;
import p079h8.i;

/* JADX INFO: renamed from: r.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1670b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final h f25432a = i.b(a.f25434r);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final long f25433b;

    /* JADX INFO: renamed from: r.b$a */
    static final class a extends o implements p219v8.a {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public static final a f25434r = new a();

        a() {
            super(0);
        }

        @Override // p219v8.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC1669a0 invoke() {
            return Looper.getMainLooper() != null ? C.f25277q : J0.f25307q;
        }
    }

    static {
        long id;
        try {
            id = Looper.getMainLooper().getThread().getId();
        } catch (Exception unused) {
            id = -1;
        }
        f25433b = id;
    }

    public static final InterfaceC1679f0 a(float f10) {
        return new C1691l0(f10);
    }

    public static final q b(Object obj, R0 r9) {
        return new C1693m0(obj, r9);
    }

    public static final long c() {
        return f25433b;
    }

    public static final void d(String str, Throwable th) {
        Log.e("ComposeInternal", str, th);
    }
}
