package F2;

import android.content.Context;
import android.os.Looper;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.function.Supplier;

/* JADX INFO: loaded from: classes.dex */
public class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a f1574a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Object f1575b;

    public interface a {
        Object a(Context context);
    }

    public l(a aVar) {
        this.f1574a = aVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object d(Context context) {
        return this.f1574a.a(context.getApplicationContext());
    }

    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public Object e(final Context context) {
        if (this.f1575b == null) {
            if (Looper.myLooper() != Looper.getMainLooper()) {
                try {
                    return AbstractC0797d.f1557e.submit(new Callable() { // from class: F2.k
                        @Override // java.util.concurrent.Callable
                        public final Object call() {
                            return this.f1572a.e(context);
                        }
                    }).get();
                } catch (InterruptedException | ExecutionException e10) {
                    throw new RuntimeException(e10);
                }
            }
            this.f1575b = y.c("main.thread.object", new Supplier() { // from class: F2.j
                @Override // java.util.function.Supplier
                public final Object get() {
                    return this.f1570a.d(context);
                }
            });
        }
        return this.f1575b;
    }
}
