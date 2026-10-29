package androidx.collection;

/* JADX INFO: loaded from: classes.dex */
public abstract class O {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final F f11294a = new F(0);

    public static final F a() {
        return new F(0, 1, null);
    }

    public static final F b(Object obj, Object obj2) {
        F f10 = new F(2);
        f10.w(obj);
        f10.w(obj2);
        return f10;
    }
}
