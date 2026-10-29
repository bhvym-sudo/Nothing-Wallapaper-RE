package p170r;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class a1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ArrayList f25431a = new ArrayList();

    public final void a() {
        this.f25431a.clear();
    }

    public final int b() {
        return this.f25431a.size();
    }

    public final boolean c() {
        return this.f25431a.isEmpty();
    }

    public final boolean d() {
        return !c();
    }

    public final Object e() {
        return this.f25431a.get(b() - 1);
    }

    public final Object f(int i10) {
        return this.f25431a.get(i10);
    }

    public final Object g() {
        return this.f25431a.remove(b() - 1);
    }

    public final boolean h(Object obj) {
        return this.f25431a.add(obj);
    }

    public final Object[] i() {
        int size = this.f25431a.size();
        Object[] objArr = new Object[size];
        for (int i10 = 0; i10 < size; i10++) {
            objArr[i10] = this.f25431a.get(i10);
        }
        return objArr;
    }
}
