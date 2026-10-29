package androidx.collection;

import java.util.Arrays;
import kotlin.jvm.internal.AbstractC1457h;
import p089i8.AbstractC1439m;

/* JADX INFO: loaded from: classes.dex */
public class r implements Cloneable {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public /* synthetic */ boolean f11353q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public /* synthetic */ long[] f11354r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object[] f11355s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public /* synthetic */ int f11356t;

    public r() {
        this(0, 1, null);
    }

    public void c() {
        int i10 = this.f11356t;
        Object[] objArr = this.f11355s;
        for (int i11 = 0; i11 < i10; i11++) {
            objArr[i11] = null;
        }
        this.f11356t = 0;
        this.f11353q = false;
    }

    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public r clone() throws CloneNotSupportedException {
        Object objClone = super.clone();
        kotlin.jvm.internal.n.f(objClone, "null cannot be cast to non-null type androidx.collection.LongSparseArray<E of androidx.collection.LongSparseArray>");
        r rVar = (r) objClone;
        rVar.f11354r = (long[]) this.f11354r.clone();
        rVar.f11355s = (Object[]) this.f11355s.clone();
        return rVar;
    }

    public boolean e(long j9) {
        return i(j9) >= 0;
    }

    public Object h(long j9) {
        int iB = p150p.a.b(this.f11354r, this.f11356t, j9);
        if (iB < 0 || this.f11355s[iB] == AbstractC1038s.f11357a) {
            return null;
        }
        return this.f11355s[iB];
    }

    public int i(long j9) {
        if (this.f11353q) {
            int i10 = this.f11356t;
            long[] jArr = this.f11354r;
            Object[] objArr = this.f11355s;
            int i11 = 0;
            for (int i12 = 0; i12 < i10; i12++) {
                Object obj = objArr[i12];
                if (obj != AbstractC1038s.f11357a) {
                    if (i12 != i11) {
                        jArr[i11] = jArr[i12];
                        objArr[i11] = obj;
                        objArr[i12] = null;
                    }
                    i11++;
                }
            }
            this.f11353q = false;
            this.f11356t = i11;
        }
        return p150p.a.b(this.f11354r, this.f11356t, j9);
    }

    public boolean j() {
        return o() == 0;
    }

    public long k(int i10) {
        if (!(i10 >= 0 && i10 < this.f11356t)) {
            p150p.d.a("Expected index to be within 0..size()-1, but was " + i10);
        }
        if (this.f11353q) {
            int i11 = this.f11356t;
            long[] jArr = this.f11354r;
            Object[] objArr = this.f11355s;
            int i12 = 0;
            for (int i13 = 0; i13 < i11; i13++) {
                Object obj = objArr[i13];
                if (obj != AbstractC1038s.f11357a) {
                    if (i13 != i12) {
                        jArr[i12] = jArr[i13];
                        objArr[i12] = obj;
                        objArr[i13] = null;
                    }
                    i12++;
                }
            }
            this.f11353q = false;
            this.f11356t = i12;
        }
        return this.f11354r[i10];
    }

    public void l(long j9, Object obj) {
        int iB = p150p.a.b(this.f11354r, this.f11356t, j9);
        if (iB >= 0) {
            this.f11355s[iB] = obj;
            return;
        }
        int i10 = ~iB;
        if (i10 < this.f11356t && this.f11355s[i10] == AbstractC1038s.f11357a) {
            this.f11354r[i10] = j9;
            this.f11355s[i10] = obj;
            return;
        }
        if (this.f11353q) {
            int i11 = this.f11356t;
            long[] jArr = this.f11354r;
            if (i11 >= jArr.length) {
                Object[] objArr = this.f11355s;
                int i12 = 0;
                for (int i13 = 0; i13 < i11; i13++) {
                    Object obj2 = objArr[i13];
                    if (obj2 != AbstractC1038s.f11357a) {
                        if (i13 != i12) {
                            jArr[i12] = jArr[i13];
                            objArr[i12] = obj2;
                            objArr[i13] = null;
                        }
                        i12++;
                    }
                }
                this.f11353q = false;
                this.f11356t = i12;
                i10 = ~p150p.a.b(this.f11354r, i12, j9);
            }
        }
        int i14 = this.f11356t;
        if (i14 >= this.f11354r.length) {
            int iF = p150p.a.f(i14 + 1);
            long[] jArrCopyOf = Arrays.copyOf(this.f11354r, iF);
            kotlin.jvm.internal.n.g(jArrCopyOf, "copyOf(this, newSize)");
            this.f11354r = jArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(this.f11355s, iF);
            kotlin.jvm.internal.n.g(objArrCopyOf, "copyOf(this, newSize)");
            this.f11355s = objArrCopyOf;
        }
        int i15 = this.f11356t;
        if (i15 - i10 != 0) {
            long[] jArr2 = this.f11354r;
            int i16 = i10 + 1;
            AbstractC1439m.g(jArr2, jArr2, i16, i10, i15);
            Object[] objArr2 = this.f11355s;
            AbstractC1439m.h(objArr2, objArr2, i16, i10, this.f11356t);
        }
        this.f11354r[i10] = j9;
        this.f11355s[i10] = obj;
        this.f11356t++;
    }

    public void m(long j9) {
        int iB = p150p.a.b(this.f11354r, this.f11356t, j9);
        if (iB < 0 || this.f11355s[iB] == AbstractC1038s.f11357a) {
            return;
        }
        this.f11355s[iB] = AbstractC1038s.f11357a;
        this.f11353q = true;
    }

    public void n(int i10) {
        if (this.f11355s[i10] != AbstractC1038s.f11357a) {
            this.f11355s[i10] = AbstractC1038s.f11357a;
            this.f11353q = true;
        }
    }

    public int o() {
        if (this.f11353q) {
            int i10 = this.f11356t;
            long[] jArr = this.f11354r;
            Object[] objArr = this.f11355s;
            int i11 = 0;
            for (int i12 = 0; i12 < i10; i12++) {
                Object obj = objArr[i12];
                if (obj != AbstractC1038s.f11357a) {
                    if (i12 != i11) {
                        jArr[i11] = jArr[i12];
                        objArr[i11] = obj;
                        objArr[i12] = null;
                    }
                    i11++;
                }
            }
            this.f11353q = false;
            this.f11356t = i11;
        }
        return this.f11356t;
    }

    public Object p(int i10) {
        if (!(i10 >= 0 && i10 < this.f11356t)) {
            p150p.d.a("Expected index to be within 0..size()-1, but was " + i10);
        }
        if (this.f11353q) {
            int i11 = this.f11356t;
            long[] jArr = this.f11354r;
            Object[] objArr = this.f11355s;
            int i12 = 0;
            for (int i13 = 0; i13 < i11; i13++) {
                Object obj = objArr[i13];
                if (obj != AbstractC1038s.f11357a) {
                    if (i13 != i12) {
                        jArr[i12] = jArr[i13];
                        objArr[i12] = obj;
                        objArr[i13] = null;
                    }
                    i12++;
                }
            }
            this.f11353q = false;
            this.f11356t = i12;
        }
        return this.f11355s[i10];
    }

    public String toString() {
        if (o() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f11356t * 28);
        sb.append('{');
        int i10 = this.f11356t;
        for (int i11 = 0; i11 < i10; i11++) {
            if (i11 > 0) {
                sb.append(", ");
            }
            sb.append(k(i11));
            sb.append('=');
            Object objP = p(i11);
            if (objP != sb) {
                sb.append(objP);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        String string = sb.toString();
        kotlin.jvm.internal.n.g(string, "StringBuilder(capacity).…builderAction).toString()");
        return string;
    }

    public r(int i10) {
        if (i10 == 0) {
            this.f11354r = p150p.a.f23564b;
            this.f11355s = p150p.a.f23565c;
        } else {
            int iF = p150p.a.f(i10);
            this.f11354r = new long[iF];
            this.f11355s = new Object[iF];
        }
    }

    public /* synthetic */ r(int i10, int i11, AbstractC1457h abstractC1457h) {
        this((i11 & 1) != 0 ? 10 : i10);
    }
}
