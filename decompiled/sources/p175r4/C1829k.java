package p175r4;

import java.util.Map;

/* JADX INFO: renamed from: r4.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
final class C1829k extends H9 {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final Object f26761q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int f26762r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    final /* synthetic */ C1849m f26763s;

    C1829k(C1849m c1849m, int i10) {
        this.f26763s = c1849m;
        Object[] objArr = c1849m.f26811s;
        objArr.getClass();
        this.f26761q = objArr[i10];
        this.f26762r = i10;
    }

    private final void a() {
        int i10 = this.f26762r;
        if (i10 != -1 && i10 < this.f26763s.size()) {
            Object obj = this.f26761q;
            C1849m c1849m = this.f26763s;
            int i11 = this.f26762r;
            Object[] objArr = c1849m.f26811s;
            objArr.getClass();
            if (AbstractC1765e1.a(obj, objArr[i11])) {
                return;
            }
        }
        this.f26762r = this.f26763s.s(this.f26761q);
    }

    @Override // p175r4.H9, java.util.Map.Entry
    public final Object getKey() {
        return this.f26761q;
    }

    @Override // p175r4.H9, java.util.Map.Entry
    public final Object getValue() {
        Map mapL = this.f26763s.l();
        if (mapL != null) {
            return mapL.get(this.f26761q);
        }
        a();
        int i10 = this.f26762r;
        if (i10 == -1) {
            return null;
        }
        Object[] objArr = this.f26763s.f26812t;
        objArr.getClass();
        return objArr[i10];
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        Map mapL = this.f26763s.l();
        if (mapL != null) {
            return mapL.put(this.f26761q, obj);
        }
        a();
        int i10 = this.f26762r;
        if (i10 == -1) {
            this.f26763s.put(this.f26761q, obj);
            return null;
        }
        Object[] objArr = this.f26763s.f26812t;
        objArr.getClass();
        Object obj2 = objArr[i10];
        objArr[i10] = obj;
        return obj2;
    }
}
