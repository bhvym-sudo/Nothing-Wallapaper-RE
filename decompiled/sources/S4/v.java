package S4;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes.dex */
class v implements Y4.b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private volatile Set f7342b = null;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private volatile Set f7341a = Collections.newSetFromMap(new ConcurrentHashMap());

    v(Collection collection) {
        this.f7341a.addAll(collection);
    }

    static v b(Collection collection) {
        return new v((Set) collection);
    }

    private synchronized void d() {
        try {
            Iterator it = this.f7341a.iterator();
            while (it.hasNext()) {
                this.f7342b.add(((Y4.b) it.next()).get());
            }
            this.f7341a = null;
        } catch (Throwable th) {
            throw th;
        }
    }

    synchronized void a(Y4.b bVar) {
        try {
            if (this.f7342b == null) {
                this.f7341a.add(bVar);
            } else {
                this.f7342b.add(bVar.get());
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // Y4.b
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public Set get() {
        if (this.f7342b == null) {
            synchronized (this) {
                try {
                    if (this.f7342b == null) {
                        this.f7342b = Collections.newSetFromMap(new ConcurrentHashMap());
                        d();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return Collections.unmodifiableSet(this.f7342b);
    }
}
