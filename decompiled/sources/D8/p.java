package D8;

import java.util.Iterator;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes2.dex */
public abstract class p extends m {

    public static final class a implements h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Iterator f1167a;

        public a(Iterator it) {
            this.f1167a = it;
        }

        @Override // D8.h
        public Iterator iterator() {
            return this.f1167a;
        }
    }

    public static h e(Iterator it) {
        kotlin.jvm.internal.n.h(it, "<this>");
        return f(new a(it));
    }

    public static final h f(h hVar) {
        kotlin.jvm.internal.n.h(hVar, "<this>");
        return hVar instanceof D8.a ? hVar : new D8.a(hVar);
    }

    public static final h g() {
        return d.f1140a;
    }

    public static h h(final Object obj, p219v8.l nextFunction) {
        kotlin.jvm.internal.n.h(nextFunction, "nextFunction");
        return obj == null ? d.f1140a : new g(new p219v8.a() { // from class: D8.n
            @Override // p219v8.a
            public final Object invoke() {
                return p.k(obj);
            }
        }, nextFunction);
    }

    public static h i(final p219v8.a nextFunction) {
        kotlin.jvm.internal.n.h(nextFunction, "nextFunction");
        return f(new g(nextFunction, new p219v8.l() { // from class: D8.o
            @Override // p219v8.l
            public final Object f(Object obj) {
                return p.j(nextFunction, obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object j(p219v8.a aVar, Object it) {
        kotlin.jvm.internal.n.h(it, "it");
        return aVar.invoke();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object k(Object obj) {
        return obj;
    }
}
