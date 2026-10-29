package androidx.collection;

import java.util.Map;
import p089i8.AbstractC1444s;

/* JADX INFO: loaded from: classes.dex */
public class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f11358a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final p150p.c f11359b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final p150p.b f11360c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f11361d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f11362e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f11363f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f11364g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f11365h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f11366i;

    public t(int i10) {
        this.f11358a = i10;
        if (!(i10 > 0)) {
            p150p.d.a("maxSize <= 0");
        }
        this.f11359b = new p150p.c(0, 0.75f);
        this.f11360c = new p150p.b();
    }

    private final int g(Object obj, Object obj2) {
        int iH = h(obj, obj2);
        if (!(iH >= 0)) {
            p150p.d.b("Negative size: " + obj + '=' + obj2);
        }
        return iH;
    }

    protected Object a(Object key) {
        kotlin.jvm.internal.n.h(key, "key");
        return null;
    }

    protected void b(boolean z9, Object key, Object oldValue, Object obj) {
        kotlin.jvm.internal.n.h(key, "key");
        kotlin.jvm.internal.n.h(oldValue, "oldValue");
    }

    public final void c() {
        i(-1);
    }

    public final Object d(Object key) {
        Object objD;
        kotlin.jvm.internal.n.h(key, "key");
        synchronized (this.f11360c) {
            Object objA = this.f11359b.a(key);
            if (objA != null) {
                this.f11365h++;
                return objA;
            }
            this.f11366i++;
            Object objA2 = a(key);
            if (objA2 == null) {
                return null;
            }
            synchronized (this.f11360c) {
                try {
                    this.f11363f++;
                    objD = this.f11359b.d(key, objA2);
                    if (objD != null) {
                        this.f11359b.d(key, objD);
                    } else {
                        this.f11361d += g(key, objA2);
                        p079h8.A a10 = p079h8.A.f21846a;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (objD != null) {
                b(false, key, objA2, objD);
                return objD;
            }
            i(this.f11358a);
            return objA2;
        }
    }

    public final Object e(Object key, Object value) {
        Object objD;
        kotlin.jvm.internal.n.h(key, "key");
        kotlin.jvm.internal.n.h(value, "value");
        synchronized (this.f11360c) {
            try {
                this.f11362e++;
                this.f11361d += g(key, value);
                objD = this.f11359b.d(key, value);
                if (objD != null) {
                    this.f11361d -= g(key, objD);
                }
                p079h8.A a10 = p079h8.A.f21846a;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (objD != null) {
            b(false, key, objD, value);
        }
        i(this.f11358a);
        return objD;
    }

    public void f(int i10) {
        if (!(i10 > 0)) {
            p150p.d.a("maxSize <= 0");
        }
        synchronized (this.f11360c) {
            this.f11358a = i10;
            p079h8.A a10 = p079h8.A.f21846a;
        }
        i(i10);
    }

    protected int h(Object key, Object value) {
        kotlin.jvm.internal.n.h(key, "key");
        kotlin.jvm.internal.n.h(value, "value");
        return 1;
    }

    public void i(int i10) {
        Object key;
        Object value;
        while (true) {
            synchronized (this.f11360c) {
                try {
                    if (!(this.f11361d >= 0 && (!this.f11359b.c() || this.f11361d == 0))) {
                        p150p.d.b("LruCache.sizeOf() is reporting inconsistent results!");
                    }
                    if (this.f11361d <= i10 || this.f11359b.c()) {
                        break;
                        break;
                    }
                    Map.Entry entry = (Map.Entry) AbstractC1444s.T(this.f11359b.b());
                    if (entry == null) {
                        return;
                    }
                    key = entry.getKey();
                    value = entry.getValue();
                    this.f11359b.e(key);
                    this.f11361d -= g(key, value);
                    this.f11364g++;
                } catch (Throwable th) {
                    throw th;
                }
            }
            b(true, key, value, null);
        }
    }

    public String toString() {
        String str;
        synchronized (this.f11360c) {
            try {
                int i10 = this.f11365h;
                int i11 = this.f11366i + i10;
                str = "LruCache[maxSize=" + this.f11358a + ",hits=" + this.f11365h + ",misses=" + this.f11366i + ",hitRate=" + (i11 != 0 ? (i10 * 100) / i11 : 0) + "%]";
            } catch (Throwable th) {
                throw th;
            }
        }
        return str;
    }
}
