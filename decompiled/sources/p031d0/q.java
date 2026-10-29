package p031d0;

import kotlin.jvm.internal.n;

/* JADX INFO: loaded from: classes.dex */
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f19419a;

    public q(String str) {
        this.f19419a = str;
    }

    public final String a() {
        return this.f19419a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof q) && n.d(this.f19419a, ((q) obj).f19419a);
    }

    public int hashCode() {
        return this.f19419a.hashCode();
    }

    public String toString() {
        return "UrlAnnotation(url=" + this.f19419a + ')';
    }
}
