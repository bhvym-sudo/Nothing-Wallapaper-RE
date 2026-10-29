package S4;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Set f7292a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Set f7293b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f7294c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f7295d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final g f7296e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Set f7297f;

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Set f7298a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Set f7299b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f7300c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f7301d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private g f7302e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private Set f7303f;

        /* JADX INFO: Access modifiers changed from: private */
        public b e() {
            this.f7301d = 1;
            return this;
        }

        private void f(Class cls) {
            A.a(!this.f7298a.contains(cls), "Components are not allowed to depend on interfaces they themselves provide.");
        }

        public b b(o oVar) {
            A.c(oVar, "Null dependency");
            f(oVar.b());
            this.f7299b.add(oVar);
            return this;
        }

        public c c() {
            A.d(this.f7302e != null, "Missing required property: factory.");
            return new c(new HashSet(this.f7298a), new HashSet(this.f7299b), this.f7300c, this.f7301d, this.f7302e, this.f7303f);
        }

        public b d(g gVar) {
            this.f7302e = (g) A.c(gVar, "Null factory");
            return this;
        }

        private b(Class cls, Class... clsArr) {
            HashSet hashSet = new HashSet();
            this.f7298a = hashSet;
            this.f7299b = new HashSet();
            this.f7300c = 0;
            this.f7301d = 0;
            this.f7303f = new HashSet();
            A.c(cls, "Null interface");
            hashSet.add(cls);
            for (Class cls2 : clsArr) {
                A.c(cls2, "Null interface");
            }
            Collections.addAll(this.f7298a, clsArr);
        }
    }

    public static b a(Class cls) {
        return new b(cls, new Class[0]);
    }

    public static b b(Class cls, Class... clsArr) {
        return new b(cls, clsArr);
    }

    public static b g(Class cls) {
        return a(cls).e();
    }

    static /* synthetic */ Object k(Object obj, d dVar) {
        return obj;
    }

    public static c l(Object obj, Class cls, Class... clsArr) {
        return b(cls, clsArr).d(C0946b.b(obj)).c();
    }

    public Set c() {
        return this.f7293b;
    }

    public g d() {
        return this.f7296e;
    }

    public Set e() {
        return this.f7292a;
    }

    public Set f() {
        return this.f7297f;
    }

    public boolean h() {
        return this.f7294c == 1;
    }

    public boolean i() {
        return this.f7294c == 2;
    }

    public boolean j() {
        return this.f7295d == 0;
    }

    public String toString() {
        return "Component<" + Arrays.toString(this.f7292a.toArray()) + ">{" + this.f7294c + ", type=" + this.f7295d + ", deps=" + Arrays.toString(this.f7293b.toArray()) + "}";
    }

    private c(Set set, Set set2, int i10, int i11, g gVar, Set set3) {
        this.f7292a = Collections.unmodifiableSet(set);
        this.f7293b = Collections.unmodifiableSet(set2);
        this.f7294c = i10;
        this.f7295d = i11;
        this.f7296e = gVar;
        this.f7297f = Collections.unmodifiableSet(set3);
    }
}
