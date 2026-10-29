package p175r4;

/* JADX INFO: loaded from: classes.dex */
final class S extends AbstractC1968y {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    static final AbstractC1968y f26206v = new S(null, new Object[0], 0);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    final transient Object[] f26207t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final transient int f26208u;

    private S(Object obj, Object[] objArr, int i10) {
        this.f26207t = objArr;
        this.f26208u = i10;
    }

    static S h(int i10, Object[] objArr, AbstractC1958x abstractC1958x) {
        Object obj = objArr[0];
        obj.getClass();
        Object obj2 = objArr[1];
        obj2.getClass();
        AbstractC1741c.b(obj, obj2);
        return new S(null, objArr, 1);
    }

    @Override // p175r4.AbstractC1968y
    final r a() {
        return new Q(this.f26207t, 1, this.f26208u);
    }

    @Override // p175r4.AbstractC1968y
    final AbstractC1978z d() {
        return new O(this, this.f26207t, 0, this.f26208u);
    }

    @Override // p175r4.AbstractC1968y
    final AbstractC1978z f() {
        return new P(this, new Q(this.f26207t, 0, this.f26208u));
    }

    /* JADX WARN: Code duplicated, block: B:4:0x0003  */
    @Override // p175r4.AbstractC1968y, java.util.Map
    public final Object get(Object obj) {
        Object obj2;
        if (obj == null) {
            obj2 = null;
        } else {
            int i10 = this.f26208u;
            Object[] objArr = this.f26207t;
            if (i10 == 1) {
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
        }
        if (obj2 == null) {
            return null;
        }
        return obj2;
    }

    @Override // java.util.Map
    public final int size() {
        return this.f26208u;
    }
}
