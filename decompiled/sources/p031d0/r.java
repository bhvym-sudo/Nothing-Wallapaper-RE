package p031d0;

import kotlin.jvm.internal.n;

/* JADX INFO: loaded from: classes.dex */
public final class r extends p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f19420a;

    public r(String str) {
        super(null);
        this.f19420a = str;
    }

    public final String a() {
        return this.f19420a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof r) && n.d(this.f19420a, ((r) obj).f19420a);
    }

    public int hashCode() {
        return this.f19420a.hashCode();
    }

    public String toString() {
        return "VerbatimTtsAnnotation(verbatim=" + this.f19420a + ')';
    }
}
