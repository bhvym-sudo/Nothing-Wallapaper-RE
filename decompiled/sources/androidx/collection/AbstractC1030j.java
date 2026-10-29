package androidx.collection;

/* JADX INFO: renamed from: androidx.collection.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1030j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final AbstractC1029i f11329a = new w(0);

    public static final AbstractC1029i a(int... elements) {
        kotlin.jvm.internal.n.h(elements, "elements");
        w wVar = new w(elements.length);
        wVar.h(elements);
        return wVar;
    }
}
