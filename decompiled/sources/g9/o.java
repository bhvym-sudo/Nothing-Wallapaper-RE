package g9;

import java.lang.reflect.Method;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Class f21406a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Object f21407b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Method f21408c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final List f21409d;

    o(Class cls, Object obj, Method method, List list) {
        this.f21406a = cls;
        this.f21407b = obj;
        this.f21408c = method;
        this.f21409d = Collections.unmodifiableList(list);
    }

    public Method a() {
        return this.f21408c;
    }

    public Class b() {
        return this.f21406a;
    }

    public String toString() {
        return String.format("%s.%s() %s", this.f21406a.getName(), this.f21408c.getName(), this.f21409d);
    }
}
