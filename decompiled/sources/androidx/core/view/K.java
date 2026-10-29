package androidx.core.view;

import android.view.View;
import android.view.ViewGroup;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public abstract class K {

    public static final class a implements D8.h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ ViewGroup f12196a;

        a(ViewGroup viewGroup) {
            this.f12196a = viewGroup;
        }

        @Override // D8.h
        public Iterator iterator() {
            return K.d(this.f12196a);
        }
    }

    static final class b extends kotlin.jvm.internal.o implements p219v8.l {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public static final b f12197r = new b();

        b() {
            super(1);
        }

        @Override // p219v8.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Iterator f(View view) {
            D8.h hVarB;
            ViewGroup viewGroup = view instanceof ViewGroup ? (ViewGroup) view : null;
            if (viewGroup == null || (hVarB = K.b(viewGroup)) == null) {
                return null;
            }
            return hVarB.iterator();
        }
    }

    public static final class c implements Iterator, p229w8.a {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private int f12198q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ ViewGroup f12199r;

        c(ViewGroup viewGroup) {
            this.f12199r = viewGroup;
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public View next() {
            ViewGroup viewGroup = this.f12199r;
            int i10 = this.f12198q;
            this.f12198q = i10 + 1;
            View childAt = viewGroup.getChildAt(i10);
            if (childAt != null) {
                return childAt;
            }
            throw new IndexOutOfBoundsException();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f12198q < this.f12199r.getChildCount();
        }

        @Override // java.util.Iterator
        public void remove() {
            ViewGroup viewGroup = this.f12199r;
            int i10 = this.f12198q - 1;
            this.f12198q = i10;
            viewGroup.removeViewAt(i10);
        }
    }

    public static final class d implements D8.h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ ViewGroup f12200a;

        public d(ViewGroup viewGroup) {
            this.f12200a = viewGroup;
        }

        @Override // D8.h
        public Iterator iterator() {
            return new D(K.b(this.f12200a).iterator(), b.f12197r);
        }
    }

    public static final View a(ViewGroup viewGroup, int i10) {
        View childAt = viewGroup.getChildAt(i10);
        if (childAt != null) {
            return childAt;
        }
        throw new IndexOutOfBoundsException("Index: " + i10 + ", Size: " + viewGroup.getChildCount());
    }

    public static final D8.h b(ViewGroup viewGroup) {
        return new a(viewGroup);
    }

    public static final D8.h c(ViewGroup viewGroup) {
        return new d(viewGroup);
    }

    public static final Iterator d(ViewGroup viewGroup) {
        return new c(viewGroup);
    }
}
