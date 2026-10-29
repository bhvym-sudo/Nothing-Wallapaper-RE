package p165q4;

/* JADX INFO: loaded from: classes.dex */
final class X5 extends P5 {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    static final P5 f24433v = new X5(null, new Object[0], 0);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    final transient Object[] f24434t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final transient int f24435u;

    private X5(Object obj, Object[] objArr, int i10) {
        this.f24434t = objArr;
        this.f24435u = i10;
    }

    static X5 h(int i10, Object[] objArr, O5 o9) {
        Object obj = objArr[0];
        obj.getClass();
        Object obj2 = objArr[1];
        obj2.getClass();
        AbstractC1551j3.a(obj, obj2);
        return new X5(null, objArr, 1);
    }

    @Override // p165q4.P5
    final M4 a() {
        return new W5(this.f24434t, 1, this.f24435u);
    }

    @Override // p165q4.P5
    final Q5 d() {
        return new U5(this, this.f24434t, 0, this.f24435u);
    }

    @Override // p165q4.P5
    final Q5 f() {
        return new V5(this, new W5(this.f24434t, 0, this.f24435u));
    }

    /* JADX WARN: Code duplicated, block: B:4:0x0007  */
    @Override // p165q4.P5, java.util.Map
    public final Object get(Object obj) {
        Object obj2;
        Object[] objArr = this.f24434t;
        int i10 = this.f24435u;
        if (obj != null && i10 == 1) {
            Object obj3 = objArr[0];
            obj3.getClass();
            if (obj3.equals(obj)) {
                obj2 = objArr[1];
                obj2.getClass();
            } else {
                obj2 = null;
            }
        } else {
            obj2 = null;
        }
        if (obj2 == null) {
            return null;
        }
        return obj2;
    }

    @Override // java.util.Map
    public final int size() {
        return this.f24435u;
    }
}
