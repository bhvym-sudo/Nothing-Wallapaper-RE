package p129m8;

import java.io.Serializable;
import kotlin.jvm.internal.n;
import p219v8.p;

/* JADX INFO: loaded from: classes2.dex */
public final class j implements i, Serializable {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final j f23252q = new j();

    private j() {
    }

    @Override // p129m8.i
    public Object U0(Object obj, p operation) {
        n.h(operation, "operation");
        return obj;
    }

    @Override // p129m8.i
    public i.b b(i.c key) {
        n.h(key, "key");
        return null;
    }

    public int hashCode() {
        return 0;
    }

    @Override // p129m8.i
    public i t0(i.c key) {
        n.h(key, "key");
        return this;
    }

    public String toString() {
        return "EmptyCoroutineContext";
    }

    @Override // p129m8.i
    public i z(i context) {
        n.h(context, "context");
        return context;
    }
}
