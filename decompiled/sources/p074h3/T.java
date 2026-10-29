package p074h3;

import androidx.appcompat.app.o;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class T {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Object f21624b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static T f21625c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private List f21626a = new ArrayList();

    private T() {
    }

    public static T a() {
        T t9;
        synchronized (f21624b) {
            try {
                if (f21625c == null) {
                    f21625c = new T();
                }
                t9 = f21625c;
            } catch (Throwable th) {
                throw th;
            }
        }
        return t9;
    }

    public void b() {
        if (this.f21626a.size() <= 0) {
            return;
        }
        o.a(this.f21626a.get(0));
        throw null;
    }
}
