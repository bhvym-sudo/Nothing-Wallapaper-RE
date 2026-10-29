package p175r4;

import java.util.List;
import java.util.ListIterator;

/* JADX INFO: loaded from: classes.dex */
final class t9 extends C1917s8 implements ListIterator {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    final /* synthetic */ F9 f27394t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    t9(F9 f10) {
        super(f10);
        this.f27394t = f10;
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        boolean zIsEmpty = this.f27394t.isEmpty();
        a();
        ((ListIterator) this.f27349q).add(obj);
        this.f27394t.f25937v.f25964t++;
        if (zIsEmpty) {
            this.f27394t.a();
        }
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        a();
        return ((ListIterator) this.f27349q).hasPrevious();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        a();
        return ((ListIterator) this.f27349q).nextIndex();
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        a();
        return ((ListIterator) this.f27349q).previous();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        a();
        return ((ListIterator) this.f27349q).previousIndex();
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        a();
        ((ListIterator) this.f27349q).set(obj);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t9(F9 f10, int i10) {
        super(f10, ((List) f10.f26250r).listIterator(i10));
        this.f27394t = f10;
    }
}
