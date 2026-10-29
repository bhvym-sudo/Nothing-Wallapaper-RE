package androidx.collection;

/* JADX INFO: renamed from: androidx.collection.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1032l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final x f11335a = new x(0);

    public static final AbstractC1031k a() {
        x xVar = f11335a;
        kotlin.jvm.internal.n.f(xVar, "null cannot be cast to non-null type androidx.collection.IntObjectMap<V of androidx.collection.IntObjectMapKt.intObjectMapOf>");
        return xVar;
    }

    public static final x b() {
        return new x(0, 1, null);
    }

    public static final x c(int i10, Object obj, int i11, Object obj2, int i12, Object obj3) {
        x xVar = new x(0, 1, null);
        xVar.s(i10, obj);
        xVar.s(i11, obj2);
        xVar.s(i12, obj3);
        return xVar;
    }
}
