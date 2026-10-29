package E3;

import java.util.Map;
import kotlin.jvm.internal.n;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map f1278a;

    public a(Map args) {
        n.h(args, "args");
        this.f1278a = args;
    }

    public final Map a() {
        return this.f1278a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a) && n.d(this.f1278a, ((a) obj).f1278a);
    }

    public int hashCode() {
        return this.f1278a.hashCode();
    }

    public String toString() {
        return "RestorableSnapshot(args=" + this.f1278a + ")";
    }
}
