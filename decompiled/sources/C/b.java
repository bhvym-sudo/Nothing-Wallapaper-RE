package C;

import kotlin.jvm.internal.n;
import kotlin.jvm.internal.o;
import p219v8.l;
import p219v8.p;

/* JADX INFO: loaded from: classes.dex */
public final class b implements c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final c f442b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final c f443c;

    static final class a extends o implements p {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public static final a f444r = new a();

        a() {
            super(2);
        }

        @Override // p219v8.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke(String str, c.b bVar) {
            if (str.length() == 0) {
                return bVar.toString();
            }
            return str + ", " + bVar;
        }
    }

    public b(c cVar, c cVar2) {
        this.f442b = cVar;
        this.f443c = cVar2;
    }

    @Override // C.c
    public boolean a(l lVar) {
        return this.f442b.a(lVar) && this.f443c.a(lVar);
    }

    @Override // C.c
    public Object b(Object obj, p pVar) {
        return this.f443c.b(this.f442b.b(obj, pVar), pVar);
    }

    public final c d() {
        return this.f443c;
    }

    public final c e() {
        return this.f442b;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return n.d(this.f442b, bVar.f442b) && n.d(this.f443c, bVar.f443c);
    }

    public int hashCode() {
        return this.f442b.hashCode() + (this.f443c.hashCode() * 31);
    }

    public String toString() {
        return '[' + ((String) b("", a.f444r)) + ']';
    }
}
