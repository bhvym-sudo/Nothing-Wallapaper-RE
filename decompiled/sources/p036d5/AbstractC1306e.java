package p036d5;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: d5.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1306e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map f19576a = new HashMap();

    protected abstract Object a(Object obj);

    public Object b(Object obj) {
        synchronized (this.f19576a) {
            try {
                if (this.f19576a.containsKey(obj)) {
                    return this.f19576a.get(obj);
                }
                Object objA = a(obj);
                this.f19576a.put(obj, objA);
                return objA;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
