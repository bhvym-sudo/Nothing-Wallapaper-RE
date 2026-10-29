package E8;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.AbstractC1457h;

/* JADX INFO: loaded from: classes2.dex */
final class f implements Iterator, p229w8.a {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static final a f1463v = new a(null);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final CharSequence f1464q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int f1465r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private int f1466s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f1467t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private int f1468u;

    private static final class a {
        public /* synthetic */ a(AbstractC1457h abstractC1457h) {
            this();
        }

        private a() {
        }
    }

    public f(CharSequence string) {
        kotlin.jvm.internal.n.h(string, "string");
        this.f1464q = string;
    }

    @Override // java.util.Iterator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public String next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f1465r = 0;
        int i10 = this.f1467t;
        int i11 = this.f1466s;
        this.f1466s = this.f1468u + i10;
        return this.f1464q.subSequence(i11, i10).toString();
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        int i10;
        int i11;
        int i12 = this.f1465r;
        if (i12 != 0) {
            return i12 == 1;
        }
        if (this.f1468u < 0) {
            this.f1465r = 2;
            return false;
        }
        int length = this.f1464q.length();
        int length2 = this.f1464q.length();
        for (int i13 = this.f1466s; i13 < length2; i13++) {
            char cCharAt = this.f1464q.charAt(i13);
            if (cCharAt == '\n' || cCharAt == '\r') {
                i10 = (cCharAt == '\r' && (i11 = i13 + 1) < this.f1464q.length() && this.f1464q.charAt(i11) == '\n') ? 2 : 1;
                length = i13;
                this.f1465r = 1;
                this.f1468u = i10;
                this.f1467t = length;
                return true;
            }
        }
        i10 = -1;
        this.f1465r = 1;
        this.f1468u = i10;
        this.f1467t = length;
        return true;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
