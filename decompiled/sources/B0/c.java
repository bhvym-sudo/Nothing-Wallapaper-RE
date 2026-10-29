package B0;

import android.util.LongSparseArray;
import p089i8.M;

/* JADX INFO: loaded from: classes.dex */
public abstract class c {

    public static final class a extends M {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private int f326q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ LongSparseArray f327r;

        a(LongSparseArray longSparseArray) {
            this.f327r = longSparseArray;
        }

        @Override // p089i8.M
        public long a() {
            LongSparseArray longSparseArray = this.f327r;
            int i10 = this.f326q;
            this.f326q = i10 + 1;
            return longSparseArray.keyAt(i10);
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f326q < this.f327r.size();
        }
    }

    public static final M a(LongSparseArray longSparseArray) {
        return new a(longSparseArray);
    }
}
