package p041e0;

import java.util.HashMap;
import java.util.LinkedHashSet;
import kotlin.jvm.internal.I;
import kotlin.jvm.internal.n;
import p079h8.A;
import p081i0.e;
import p081i0.f;
import p089i8.AbstractC1444s;

/* JADX INFO: loaded from: classes.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final f f19760a = e.a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final HashMap f19761b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final LinkedHashSet f19762c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f19763d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f19764e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f19765f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f19766g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f19767h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f19768i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f19769j;

    public b(int i10) {
        if (i10 <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        this.f19764e = i10;
        this.f19761b = new HashMap(0, 0.75f);
        this.f19762c = new LinkedHashSet();
    }

    private final int g(Object obj, Object obj2) {
        int i10 = i(obj, obj2);
        if (i10 >= 0) {
            return i10;
        }
        throw new IllegalStateException(("Negative size: " + obj + '=' + obj2).toString());
    }

    protected Object b(Object obj) {
        return null;
    }

    protected void c(boolean z9, Object obj, Object obj2, Object obj3) {
    }

    public final Object d(Object obj) {
        synchronized (this.f19760a) {
            Object obj2 = this.f19761b.get(obj);
            if (obj2 != null) {
                this.f19762c.remove(obj);
                this.f19762c.add(obj);
                this.f19768i++;
                return obj2;
            }
            this.f19769j++;
            Object objB = b(obj);
            if (objB == null) {
                return null;
            }
            synchronized (this.f19760a) {
                try {
                    this.f19766g++;
                    Object objPut = this.f19761b.put(obj, objB);
                    this.f19762c.remove(obj);
                    this.f19762c.add(obj);
                    if (objPut != null) {
                        this.f19761b.put(obj, objPut);
                        obj2 = objPut;
                    } else {
                        this.f19763d = h() + g(obj, objB);
                    }
                    A a10 = A.f21846a;
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (obj2 != null) {
                c(false, obj, objB, obj2);
                return obj2;
            }
            j(this.f19764e);
            return objB;
        }
    }

    public final Object e(Object obj, Object obj2) {
        Object objPut;
        if (obj == null || obj2 == null) {
            throw null;
        }
        synchronized (this.f19760a) {
            try {
                this.f19765f++;
                this.f19763d = h() + g(obj, obj2);
                objPut = this.f19761b.put(obj, obj2);
                if (objPut != null) {
                    this.f19763d = h() - g(obj, objPut);
                }
                if (this.f19762c.contains(obj)) {
                    this.f19762c.remove(obj);
                }
                this.f19762c.add(obj);
            } catch (Throwable th) {
                throw th;
            }
        }
        if (objPut != null) {
            c(false, obj, objPut, obj2);
        }
        j(this.f19764e);
        return objPut;
    }

    public final Object f(Object obj) {
        Object objRemove;
        obj.getClass();
        synchronized (this.f19760a) {
            try {
                objRemove = this.f19761b.remove(obj);
                this.f19762c.remove(obj);
                if (objRemove != null) {
                    this.f19763d = h() - g(obj, objRemove);
                }
                A a10 = A.f21846a;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (objRemove != null) {
            c(false, obj, objRemove, null);
        }
        return objRemove;
    }

    public final int h() {
        int i10;
        synchronized (this.f19760a) {
            i10 = this.f19763d;
        }
        return i10;
    }

    protected int i(Object obj, Object obj2) {
        return 1;
    }

    public void j(int i10) {
        Object objR;
        Object obj;
        while (true) {
            synchronized (this.f19760a) {
                try {
                    if (h() >= 0 && (!this.f19761b.isEmpty() || h() == 0)) {
                        if (this.f19761b.isEmpty() != this.f19762c.isEmpty()) {
                            break;
                        }
                        if (h() <= i10 || this.f19761b.isEmpty()) {
                            objR = null;
                            obj = null;
                        } else {
                            objR = AbstractC1444s.R(this.f19762c);
                            obj = this.f19761b.get(objR);
                            if (obj == null) {
                                throw new IllegalStateException("inconsistent state");
                            }
                            I.c(this.f19761b).remove(objR);
                            I.a(this.f19762c).remove(objR);
                            int iH = h();
                            n.e(objR);
                            n.e(obj);
                            this.f19763d = iH - g(objR, obj);
                            this.f19767h++;
                        }
                        A a10 = A.f21846a;
                    } else {
                        break;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (objR == null && obj == null) {
                return;
            }
            n.e(objR);
            n.e(obj);
            c(true, objR, obj, null);
        }
        throw new IllegalStateException("map/keySet size inconsistency");
    }

    public String toString() {
        String str;
        synchronized (this.f19760a) {
            try {
                int i10 = this.f19768i;
                int i11 = this.f19769j + i10;
                str = "LruCache[maxSize=" + this.f19764e + ",hits=" + this.f19768i + ",misses=" + this.f19769j + ",hitRate=" + (i11 != 0 ? (i10 * 100) / i11 : 0) + "%]";
            } catch (Throwable th) {
                throw th;
            }
        }
        return str;
    }
}
