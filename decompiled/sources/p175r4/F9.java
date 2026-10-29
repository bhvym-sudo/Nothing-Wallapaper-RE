package p175r4;

import java.util.Collection;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: loaded from: classes.dex */
class F9 extends T8 implements List {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    final /* synthetic */ G9 f25937v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    F9(G9 g10, Object obj, List list, T8 t9) {
        super(g10, obj, list, t9);
        this.f25937v = g10;
    }

    @Override // java.util.List
    public final void add(int i10, Object obj) {
        b();
        boolean zIsEmpty = this.f26250r.isEmpty();
        ((List) this.f26250r).add(i10, obj);
        this.f25937v.f25964t++;
        if (zIsEmpty) {
            a();
        }
    }

    @Override // java.util.List
    public final boolean addAll(int i10, Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean zAddAll = ((List) this.f26250r).addAll(i10, collection);
        if (zAddAll) {
            int size2 = this.f26250r.size();
            this.f25937v.f25964t += size2 - size;
            if (size == 0) {
                a();
                return true;
            }
        }
        return zAddAll;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        b();
        return ((List) this.f26250r).get(i10);
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        b();
        return ((List) this.f26250r).indexOf(obj);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        b();
        return ((List) this.f26250r).lastIndexOf(obj);
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        b();
        return new t9(this);
    }

    @Override // java.util.List
    public final Object remove(int i10) {
        b();
        Object objRemove = ((List) this.f26250r).remove(i10);
        this.f25937v.f25964t--;
        e();
        return objRemove;
    }

    @Override // java.util.List
    public final Object set(int i10, Object obj) {
        b();
        return ((List) this.f26250r).set(i10, obj);
    }

    @Override // java.util.List
    public final List subList(int i10, int i11) {
        b();
        List listSubList = ((List) this.f26250r).subList(i10, i11);
        T8 t9 = this.f26251s;
        if (t9 == null) {
            t9 = this;
        }
        return this.f25937v.k(this.f26249q, listSubList, t9);
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i10) {
        b();
        return new t9(this, i10);
    }
}
