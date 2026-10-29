package p155p4;

/* JADX INFO: renamed from: p4.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
final class C1472n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f23737a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Object f23738b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Object f23739c;

    C1472n(Object obj, Object obj2, Object obj3) {
        this.f23737a = obj;
        this.f23738b = obj2;
        this.f23739c = obj3;
    }

    final IllegalArgumentException a() {
        Object obj = this.f23739c;
        Object obj2 = this.f23738b;
        Object obj3 = this.f23737a;
        return new IllegalArgumentException("Multiple entries with same key: " + String.valueOf(obj3) + "=" + String.valueOf(obj2) + " and " + String.valueOf(obj3) + "=" + String.valueOf(obj));
    }
}
