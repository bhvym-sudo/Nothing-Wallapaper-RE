package p230x;

import kotlin.jvm.internal.AbstractC1457h;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f29668a;

    public b(int i10) {
        this.f29668a = i10;
    }

    public final int a() {
        return this.f29668a;
    }

    public final void b(int i10) {
        this.f29668a += i10;
    }

    public final void c(int i10) {
        this.f29668a = i10;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b) && this.f29668a == ((b) obj).f29668a;
    }

    public int hashCode() {
        return Integer.hashCode(this.f29668a);
    }

    public String toString() {
        return "DeltaCounter(count=" + this.f29668a + ')';
    }

    public /* synthetic */ b(int i10, int i11, AbstractC1457h abstractC1457h) {
        this((i11 & 1) != 0 ? 0 : i10);
    }
}
