package androidx.datastore.preferences.protobuf;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes.dex */
final class c0 extends AbstractC1093c implements RandomAccess {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final c0 f12450t = new c0(new Object[0], 0, false);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private Object[] f12451r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private int f12452s;

    private c0(Object[] objArr, int i10, boolean z9) {
        super(z9);
        this.f12451r = objArr;
        this.f12452s = i10;
    }

    private static Object[] b(int i10) {
        return new Object[i10];
    }

    public static c0 e() {
        return f12450t;
    }

    private void f(int i10) {
        if (i10 < 0 || i10 >= this.f12452s) {
            throw new IndexOutOfBoundsException(g(i10));
        }
    }

    private String g(int i10) {
        return "Index:" + i10 + ", Size:" + this.f12452s;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(Object obj) {
        a();
        int i10 = this.f12452s;
        Object[] objArr = this.f12451r;
        if (i10 == objArr.length) {
            this.f12451r = Arrays.copyOf(objArr, ((i10 * 3) / 2) + 1);
        }
        Object[] objArr2 = this.f12451r;
        int i11 = this.f12452s;
        this.f12452s = i11 + 1;
        objArr2[i11] = obj;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public Object get(int i10) {
        f(i10);
        return this.f12451r[i10];
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC1114y.b
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public c0 d(int i10) {
        if (i10 >= this.f12452s) {
            return new c0(Arrays.copyOf(this.f12451r, i10), this.f12452s, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC1093c, java.util.AbstractList, java.util.List
    public Object remove(int i10) {
        a();
        f(i10);
        Object[] objArr = this.f12451r;
        Object obj = objArr[i10];
        int i11 = this.f12452s;
        if (i10 < i11 - 1) {
            System.arraycopy(objArr, i10 + 1, objArr, i10, (i11 - i10) - 1);
        }
        this.f12452s--;
        ((AbstractList) this).modCount++;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public Object set(int i10, Object obj) {
        a();
        f(i10);
        Object[] objArr = this.f12451r;
        Object obj2 = objArr[i10];
        objArr[i10] = obj;
        ((AbstractList) this).modCount++;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f12452s;
    }

    @Override // java.util.AbstractList, java.util.List
    public void add(int i10, Object obj) {
        int i11;
        a();
        if (i10 >= 0 && i10 <= (i11 = this.f12452s)) {
            Object[] objArr = this.f12451r;
            if (i11 < objArr.length) {
                System.arraycopy(objArr, i10, objArr, i10 + 1, i11 - i10);
            } else {
                Object[] objArrB = b(((i11 * 3) / 2) + 1);
                System.arraycopy(this.f12451r, 0, objArrB, 0, i10);
                System.arraycopy(this.f12451r, i10, objArrB, i10 + 1, this.f12452s - i10);
                this.f12451r = objArrB;
            }
            this.f12451r[i10] = obj;
            this.f12452s++;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException(g(i10));
    }
}
