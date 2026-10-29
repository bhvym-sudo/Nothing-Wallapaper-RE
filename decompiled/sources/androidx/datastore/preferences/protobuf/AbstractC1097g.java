package androidx.datastore.preferences.protobuf;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Locale;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1097g implements Iterable, Serializable {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final AbstractC1097g f12460r = new i(AbstractC1114y.f12699d);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final f f12461s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final Comparator f12462t;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f12463q = 0;

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.g$a */
    class a extends c {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private int f12464q = 0;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private final int f12465r;

        a() {
            this.f12465r = AbstractC1097g.this.size();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1097g.InterfaceC0385g
        public byte b() {
            int i10 = this.f12464q;
            if (i10 >= this.f12465r) {
                throw new NoSuchElementException();
            }
            this.f12464q = i10 + 1;
            return AbstractC1097g.this.o(i10);
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f12464q < this.f12465r;
        }
    }

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.g$b */
    class b implements Comparator {
        b() {
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(AbstractC1097g abstractC1097g, AbstractC1097g abstractC1097g2) {
            InterfaceC0385g interfaceC0385gP = abstractC1097g.p();
            InterfaceC0385g interfaceC0385gP2 = abstractC1097g2.p();
            while (interfaceC0385gP.hasNext() && interfaceC0385gP2.hasNext()) {
                int iCompareTo = Integer.valueOf(AbstractC1097g.u(interfaceC0385gP.b())).compareTo(Integer.valueOf(AbstractC1097g.u(interfaceC0385gP2.b())));
                if (iCompareTo != 0) {
                    return iCompareTo;
                }
            }
            return Integer.valueOf(abstractC1097g.size()).compareTo(Integer.valueOf(abstractC1097g2.size()));
        }
    }

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.g$c */
    static abstract class c implements InterfaceC0385g {
        c() {
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Byte next() {
            return Byte.valueOf(b());
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException();
        }
    }

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.g$d */
    private static final class d implements f {
        private d() {
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1097g.f
        public byte[] a(byte[] bArr, int i10, int i11) {
            return Arrays.copyOfRange(bArr, i10, i11 + i10);
        }

        /* synthetic */ d(a aVar) {
            this();
        }
    }

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.g$e */
    private static final class e extends i {

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        private final int f12467v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        private final int f12468w;

        e(byte[] bArr, int i10, int i11) {
            super(bArr);
            AbstractC1097g.f(i10, i10 + i11, bArr.length);
            this.f12467v = i10;
            this.f12468w = i11;
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1097g.i
        protected int A() {
            return this.f12467v;
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1097g.i, androidx.datastore.preferences.protobuf.AbstractC1097g
        public byte b(int i10) {
            AbstractC1097g.e(i10, size());
            return this.f12469u[this.f12467v + i10];
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1097g.i, androidx.datastore.preferences.protobuf.AbstractC1097g
        protected void n(byte[] bArr, int i10, int i11, int i12) {
            System.arraycopy(this.f12469u, A() + i10, bArr, i11, i12);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1097g.i, androidx.datastore.preferences.protobuf.AbstractC1097g
        byte o(int i10) {
            return this.f12469u[this.f12467v + i10];
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1097g.i, androidx.datastore.preferences.protobuf.AbstractC1097g
        public int size() {
            return this.f12468w;
        }
    }

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.g$f */
    private interface f {
        byte[] a(byte[] bArr, int i10, int i11);
    }

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.g$g, reason: collision with other inner class name */
    public interface InterfaceC0385g extends Iterator {
        byte b();
    }

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.g$h */
    static abstract class h extends AbstractC1097g {
        /* synthetic */ h(a aVar) {
            this();
        }

        @Override // java.lang.Iterable
        public /* bridge */ /* synthetic */ Iterator iterator() {
            return super.p();
        }

        private h() {
        }
    }

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.g$i */
    private static class i extends h {

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        protected final byte[] f12469u;

        i(byte[] bArr) {
            super(null);
            bArr.getClass();
            this.f12469u = bArr;
        }

        protected int A() {
            return 0;
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1097g
        public byte b(int i10) {
            return this.f12469u[i10];
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1097g
        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof AbstractC1097g) || size() != ((AbstractC1097g) obj).size()) {
                return false;
            }
            if (size() == 0) {
                return true;
            }
            if (!(obj instanceof i)) {
                return obj.equals(this);
            }
            i iVar = (i) obj;
            int iR = r();
            int iR2 = iVar.r();
            if (iR == 0 || iR2 == 0 || iR == iR2) {
                return z(iVar, 0, size());
            }
            return false;
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1097g
        protected void n(byte[] bArr, int i10, int i11, int i12) {
            System.arraycopy(this.f12469u, i10, bArr, i11, i12);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1097g
        byte o(int i10) {
            return this.f12469u[i10];
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1097g
        protected final int q(int i10, int i11, int i12) {
            return AbstractC1114y.g(i10, this.f12469u, A() + i11, i12);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1097g
        public final AbstractC1097g s(int i10, int i11) {
            int iF = AbstractC1097g.f(i10, i11, size());
            return iF == 0 ? AbstractC1097g.f12460r : new e(this.f12469u, A() + i10, iF);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1097g
        public int size() {
            return this.f12469u.length;
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1097g
        final void y(AbstractC1096f abstractC1096f) {
            abstractC1096f.a(this.f12469u, A(), size());
        }

        final boolean z(AbstractC1097g abstractC1097g, int i10, int i11) {
            if (i11 > abstractC1097g.size()) {
                throw new IllegalArgumentException("Length too large: " + i11 + size());
            }
            int i12 = i10 + i11;
            if (i12 > abstractC1097g.size()) {
                throw new IllegalArgumentException("Ran off end of other: " + i10 + ", " + i11 + ", " + abstractC1097g.size());
            }
            if (!(abstractC1097g instanceof i)) {
                return abstractC1097g.s(i10, i12).equals(s(0, i11));
            }
            i iVar = (i) abstractC1097g;
            byte[] bArr = this.f12469u;
            byte[] bArr2 = iVar.f12469u;
            int iA = A() + i11;
            int iA2 = A();
            int iA3 = iVar.A() + i10;
            while (iA2 < iA) {
                if (bArr[iA2] != bArr2[iA3]) {
                    return false;
                }
                iA2++;
                iA3++;
            }
            return true;
        }
    }

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.g$j */
    private static final class j implements f {
        private j() {
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1097g.f
        public byte[] a(byte[] bArr, int i10, int i11) {
            byte[] bArr2 = new byte[i11];
            System.arraycopy(bArr, i10, bArr2, 0, i11);
            return bArr2;
        }

        /* synthetic */ j(a aVar) {
            this();
        }
    }

    static {
        a aVar = null;
        f12461s = AbstractC1094d.c() ? new j(aVar) : new d(aVar);
        f12462t = new b();
    }

    AbstractC1097g() {
    }

    static void e(int i10, int i11) {
        if (((i11 - (i10 + 1)) | i10) < 0) {
            if (i10 < 0) {
                throw new ArrayIndexOutOfBoundsException("Index < 0: " + i10);
            }
            throw new ArrayIndexOutOfBoundsException("Index > length: " + i10 + ", " + i11);
        }
    }

    static int f(int i10, int i11, int i12) {
        int i13 = i11 - i10;
        if ((i10 | i11 | i13 | (i12 - i11)) >= 0) {
            return i13;
        }
        if (i10 < 0) {
            throw new IndexOutOfBoundsException("Beginning index: " + i10 + " < 0");
        }
        if (i11 < i10) {
            throw new IndexOutOfBoundsException("Beginning index larger than ending index: " + i10 + ", " + i11);
        }
        throw new IndexOutOfBoundsException("End index: " + i11 + " >= " + i12);
    }

    public static AbstractC1097g g(byte[] bArr) {
        return j(bArr, 0, bArr.length);
    }

    public static AbstractC1097g j(byte[] bArr, int i10, int i11) {
        f(i10, i10 + i11, bArr.length);
        return new i(f12461s.a(bArr, i10, i11));
    }

    public static AbstractC1097g m(String str) {
        return new i(str.getBytes(AbstractC1114y.f12697b));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int u(byte b10) {
        return b10 & 255;
    }

    private String v() {
        if (size() <= 50) {
            return k0.a(this);
        }
        return k0.a(s(0, 47)) + "...";
    }

    static AbstractC1097g w(byte[] bArr) {
        return new i(bArr);
    }

    static AbstractC1097g x(byte[] bArr, int i10, int i11) {
        return new e(bArr, i10, i11);
    }

    public abstract byte b(int i10);

    public abstract boolean equals(Object obj);

    public final int hashCode() {
        int iQ = this.f12463q;
        if (iQ == 0) {
            int size = size();
            iQ = q(size, 0, size);
            if (iQ == 0) {
                iQ = 1;
            }
            this.f12463q = iQ;
        }
        return iQ;
    }

    protected abstract void n(byte[] bArr, int i10, int i11, int i12);

    abstract byte o(int i10);

    public InterfaceC0385g p() {
        return new a();
    }

    protected abstract int q(int i10, int i11, int i12);

    protected final int r() {
        return this.f12463q;
    }

    public abstract AbstractC1097g s(int i10, int i11);

    public abstract int size();

    public final byte[] t() {
        int size = size();
        if (size == 0) {
            return AbstractC1114y.f12699d;
        }
        byte[] bArr = new byte[size];
        n(bArr, 0, 0, size);
        return bArr;
    }

    public final String toString() {
        return String.format(Locale.ROOT, "<ByteString@%s size=%d contents=\"%s\">", Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(size()), v());
    }

    abstract void y(AbstractC1096f abstractC1096f);
}
