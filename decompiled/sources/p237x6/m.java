package p237x6;

import T8.e;
import Y8.a;
import android.content.Context;
import java.io.File;
import java.util.concurrent.ThreadFactory;
import kotlin.jvm.internal.n;
import p257z6.b;

/* JADX INFO: loaded from: classes2.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final m f30067a = new m();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static q f30068b;

    private m() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Thread c(Runnable runnable) {
        return new Thread(runnable, "DiskLruCache");
    }

    public final synchronized q b(Context context) {
        try {
            n.h(context, "context");
            q qVar = f30068b;
            if (qVar != null) {
                q qVar2 = null;
                if (qVar == null) {
                    n.r("cache");
                    qVar = null;
                }
                if (!qVar.y()) {
                    q qVar3 = f30068b;
                    if (qVar3 == null) {
                        n.r("cache");
                    } else {
                        qVar2 = qVar3;
                    }
                    return qVar2;
                }
            }
            d dVar = new d(new e(new b(a.f9379b, new File(context.getDataDir(), "effect"), 1, 2, 104857600L, new e(new e.c(new ThreadFactory() { // from class: x6.l
                @Override // java.util.concurrent.ThreadFactory
                public final Thread newThread(Runnable runnable) {
                    return m.c(runnable);
                }
            })))));
            f30068b = dVar;
            return dVar;
        } catch (Throwable th) {
            throw th;
        }
    }
}
