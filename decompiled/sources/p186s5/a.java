package p186s5;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f27720a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f27721b;

    public a(int i10, int i11) {
        this.f27720a = i10;
        this.f27721b = i11;
    }

    public final int a() {
        return this.f27721b;
    }

    public final int b() {
        return this.f27720a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f27720a == aVar.f27720a && this.f27721b == aVar.f27721b;
    }

    public int hashCode() {
        return (Integer.hashCode(this.f27720a) * 31) + Integer.hashCode(this.f27721b);
    }

    public String toString() {
        return "BubbleMessage(widgetId=" + this.f27720a + ", resId=" + this.f27721b + ")";
    }
}
