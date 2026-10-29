package p220w;

import p230x.c;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f28538a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Object f28539b;

    public a(Object obj, Object obj2) {
        this.f28538a = obj;
        this.f28539b = obj2;
    }

    public final boolean a() {
        return this.f28539b != c.f29669a;
    }

    public final boolean b() {
        return this.f28538a != c.f29669a;
    }

    public final Object c() {
        return this.f28539b;
    }

    public final Object d() {
        return this.f28538a;
    }

    public final a e(Object obj) {
        return new a(this.f28538a, obj);
    }

    public final a f(Object obj) {
        return new a(obj, this.f28539b);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public a() {
        c cVar = c.f29669a;
        this(cVar, cVar);
    }

    public a(Object obj) {
        this(obj, c.f29669a);
    }
}
