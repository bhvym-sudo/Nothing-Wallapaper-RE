package p220w;

import java.util.Iterator;
import kotlin.jvm.internal.AbstractC1457h;
import kotlin.jvm.internal.n;
import p089i8.AbstractC1436j;
import p200u.d;
import p230x.c;

/* JADX INFO: loaded from: classes.dex */
public final class b extends AbstractC1436j implements d {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final a f28540u = new a(null);

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final int f28541v = 8;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static final b f28542w;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final Object f28543r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final Object f28544s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final p210v.d f28545t;

    public static final class a {
        public /* synthetic */ a(AbstractC1457h abstractC1457h) {
            this();
        }

        public final d a() {
            return b.f28542w;
        }

        private a() {
        }
    }

    static {
        c cVar = c.f29669a;
        f28542w = new b(cVar, cVar, p210v.d.f28046t.a());
    }

    public b(Object obj, Object obj2, p210v.d dVar) {
        this.f28543r = obj;
        this.f28544s = obj2;
        this.f28545t = dVar;
    }

    @Override // java.util.Collection, java.util.Set, p200u.d
    public d add(Object obj) {
        if (this.f28545t.containsKey(obj)) {
            return this;
        }
        if (isEmpty()) {
            return new b(obj, obj, this.f28545t.q(obj, new p220w.a()));
        }
        Object obj2 = this.f28544s;
        Object obj3 = this.f28545t.get(obj2);
        n.e(obj3);
        return new b(this.f28543r, obj, this.f28545t.q(obj2, ((p220w.a) obj3).e(obj)).q(obj, new p220w.a(obj2)));
    }

    @Override // p089i8.AbstractC1428b
    public int b() {
        return this.f28545t.size();
    }

    @Override // p089i8.AbstractC1428b, java.util.Collection, java.util.List
    public boolean contains(Object obj) {
        return this.f28545t.containsKey(obj);
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator iterator() {
        return new c(this.f28543r, this.f28545t);
    }

    @Override // java.util.Collection, java.util.Set, p200u.d
    public d remove(Object obj) {
        p220w.a aVar = (p220w.a) this.f28545t.get(obj);
        if (aVar == null) {
            return this;
        }
        p210v.d dVarR = this.f28545t.r(obj);
        if (aVar.b()) {
            Object obj2 = dVarR.get(aVar.d());
            n.e(obj2);
            dVarR = dVarR.q(aVar.d(), ((p220w.a) obj2).e(aVar.c()));
        }
        if (aVar.a()) {
            Object obj3 = dVarR.get(aVar.c());
            n.e(obj3);
            dVarR = dVarR.q(aVar.c(), ((p220w.a) obj3).f(aVar.d()));
        }
        return new b(!aVar.b() ? aVar.c() : this.f28543r, !aVar.a() ? aVar.d() : this.f28544s, dVarR);
    }
}
