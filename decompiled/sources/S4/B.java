package S4;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
final class B extends AbstractC0945a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Set f7282a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Set f7283b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Set f7284c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Set f7285d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Set f7286e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Set f7287f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final d f7288g;

    private static class a implements X4.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Set f7289a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final X4.b f7290b;

        public a(Set set, X4.b bVar) {
            this.f7289a = set;
            this.f7290b = bVar;
        }
    }

    B(c cVar, d dVar) {
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        HashSet hashSet4 = new HashSet();
        HashSet hashSet5 = new HashSet();
        for (o oVar : cVar.c()) {
            if (oVar.d()) {
                if (oVar.f()) {
                    hashSet4.add(oVar.b());
                } else {
                    hashSet.add(oVar.b());
                }
            } else if (oVar.c()) {
                hashSet3.add(oVar.b());
            } else if (oVar.f()) {
                hashSet5.add(oVar.b());
            } else {
                hashSet2.add(oVar.b());
            }
        }
        if (!cVar.f().isEmpty()) {
            hashSet.add(X4.b.class);
        }
        this.f7282a = Collections.unmodifiableSet(hashSet);
        this.f7283b = Collections.unmodifiableSet(hashSet2);
        this.f7284c = Collections.unmodifiableSet(hashSet3);
        this.f7285d = Collections.unmodifiableSet(hashSet4);
        this.f7286e = Collections.unmodifiableSet(hashSet5);
        this.f7287f = cVar.f();
        this.f7288g = dVar;
    }

    @Override // S4.AbstractC0945a, S4.d
    public Object a(Class cls) {
        if (!this.f7282a.contains(cls)) {
            throw new q(String.format("Attempting to request an undeclared dependency %s.", cls));
        }
        Object objA = this.f7288g.a(cls);
        return !cls.equals(X4.b.class) ? objA : new a(this.f7287f, (X4.b) objA);
    }

    @Override // S4.d
    public Y4.b b(Class cls) {
        if (this.f7283b.contains(cls)) {
            return this.f7288g.b(cls);
        }
        throw new q(String.format("Attempting to request an undeclared dependency Provider<%s>.", cls));
    }

    @Override // S4.d
    public Y4.b c(Class cls) {
        if (this.f7286e.contains(cls)) {
            return this.f7288g.c(cls);
        }
        throw new q(String.format("Attempting to request an undeclared dependency Provider<Set<%s>>.", cls));
    }

    @Override // S4.AbstractC0945a, S4.d
    public Set d(Class cls) {
        if (this.f7285d.contains(cls)) {
            return this.f7288g.d(cls);
        }
        throw new q(String.format("Attempting to request an undeclared dependency Set<%s>.", cls));
    }
}
