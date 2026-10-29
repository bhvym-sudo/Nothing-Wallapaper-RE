package D8;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import p089i8.AbstractC1444s;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes2.dex */
public abstract class s extends q {

    public static final class a implements Iterable, p229w8.a {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        final /* synthetic */ h f1168q;

        public a(h hVar) {
            this.f1168q = hVar;
        }

        @Override // java.lang.Iterable
        public Iterator iterator() {
            return this.f1168q.iterator();
        }
    }

    /* synthetic */ class b extends kotlin.jvm.internal.l implements p219v8.l {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public static final b f1169q = new b();

        b() {
            super(1, Iterable.class, "iterator", "iterator()Ljava/util/Iterator;", 0);
        }

        @Override // p219v8.l
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final Iterator f(Iterable p9) {
            kotlin.jvm.internal.n.h(p9, "p0");
            return p9.iterator();
        }
    }

    public static final class c implements h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ h f1170a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Comparator f1171b;

        c(h hVar, Comparator comparator) {
            this.f1170a = hVar;
            this.f1171b = comparator;
        }

        @Override // D8.h
        public Iterator iterator() {
            List listD = s.D(this.f1170a);
            AbstractC1444s.y(listD, this.f1171b);
            return listD.iterator();
        }
    }

    public static h A(h hVar, int i10) {
        kotlin.jvm.internal.n.h(hVar, "<this>");
        if (i10 >= 0) {
            if (i10 == 0) {
                return p.g();
            }
            return hVar instanceof D8.c ? ((D8.c) hVar).a(i10) : new u(hVar, i10);
        }
        throw new IllegalArgumentException(("Requested element count " + i10 + " is less than zero.").toString());
    }

    public static final Collection B(h hVar, Collection destination) {
        kotlin.jvm.internal.n.h(hVar, "<this>");
        kotlin.jvm.internal.n.h(destination, "destination");
        Iterator it = hVar.iterator();
        while (it.hasNext()) {
            destination.add(it.next());
        }
        return destination;
    }

    public static List C(h hVar) {
        kotlin.jvm.internal.n.h(hVar, "<this>");
        Iterator it = hVar.iterator();
        if (!it.hasNext()) {
            return AbstractC1444s.l();
        }
        Object next = it.next();
        if (!it.hasNext()) {
            return AbstractC1444s.e(next);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(next);
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        return arrayList;
    }

    public static List D(h hVar) {
        kotlin.jvm.internal.n.h(hVar, "<this>");
        return (List) B(hVar, new ArrayList());
    }

    public static Iterable m(h hVar) {
        kotlin.jvm.internal.n.h(hVar, "<this>");
        return new a(hVar);
    }

    public static h n(h hVar, int i10) {
        kotlin.jvm.internal.n.h(hVar, "<this>");
        if (i10 >= 0) {
            if (i10 == 0) {
                return hVar;
            }
            return hVar instanceof D8.c ? ((D8.c) hVar).b(i10) : new D8.b(hVar, i10);
        }
        throw new IllegalArgumentException(("Requested element count " + i10 + " is less than zero.").toString());
    }

    public static h o(h hVar, p219v8.l predicate) {
        kotlin.jvm.internal.n.h(hVar, "<this>");
        kotlin.jvm.internal.n.h(predicate, "predicate");
        return new e(hVar, true, predicate);
    }

    public static h p(h hVar, p219v8.l predicate) {
        kotlin.jvm.internal.n.h(hVar, "<this>");
        kotlin.jvm.internal.n.h(predicate, "predicate");
        return new e(hVar, false, predicate);
    }

    public static final h q(h hVar) {
        kotlin.jvm.internal.n.h(hVar, "<this>");
        h hVarP = p(hVar, new p219v8.l() { // from class: D8.r
            @Override // p219v8.l
            public final Object f(Object obj) {
                return Boolean.valueOf(s.r(obj));
            }
        });
        kotlin.jvm.internal.n.f(hVarP, "null cannot be cast to non-null type kotlin.sequences.Sequence<T of kotlin.sequences.SequencesKt___SequencesKt.filterNotNull>");
        return hVarP;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean r(Object obj) {
        return obj == null;
    }

    public static Object s(h hVar) {
        kotlin.jvm.internal.n.h(hVar, "<this>");
        Iterator it = hVar.iterator();
        if (it.hasNext()) {
            return it.next();
        }
        return null;
    }

    public static h t(h hVar, p219v8.l transform) {
        kotlin.jvm.internal.n.h(hVar, "<this>");
        kotlin.jvm.internal.n.h(transform, "transform");
        return new f(hVar, transform, b.f1169q);
    }

    public static final Appendable u(h hVar, Appendable buffer, CharSequence separator, CharSequence prefix, CharSequence postfix, int i10, CharSequence truncated, p219v8.l lVar) throws IOException {
        kotlin.jvm.internal.n.h(hVar, "<this>");
        kotlin.jvm.internal.n.h(buffer, "buffer");
        kotlin.jvm.internal.n.h(separator, "separator");
        kotlin.jvm.internal.n.h(prefix, "prefix");
        kotlin.jvm.internal.n.h(postfix, "postfix");
        kotlin.jvm.internal.n.h(truncated, "truncated");
        buffer.append(prefix);
        int i11 = 0;
        for (Object obj : hVar) {
            i11++;
            if (i11 > 1) {
                buffer.append(separator);
            }
            if (i10 >= 0 && i11 > i10) {
                break;
            }
            E8.i.a(buffer, obj, lVar);
        }
        if (i10 >= 0 && i11 > i10) {
            buffer.append(truncated);
        }
        buffer.append(postfix);
        return buffer;
    }

    public static final String v(h hVar, CharSequence separator, CharSequence prefix, CharSequence postfix, int i10, CharSequence truncated, p219v8.l lVar) {
        kotlin.jvm.internal.n.h(hVar, "<this>");
        kotlin.jvm.internal.n.h(separator, "separator");
        kotlin.jvm.internal.n.h(prefix, "prefix");
        kotlin.jvm.internal.n.h(postfix, "postfix");
        kotlin.jvm.internal.n.h(truncated, "truncated");
        return ((StringBuilder) u(hVar, new StringBuilder(), separator, prefix, postfix, i10, truncated, lVar)).toString();
    }

    public static /* synthetic */ String w(h hVar, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i10, CharSequence charSequence4, p219v8.l lVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            charSequence = ", ";
        }
        if ((i11 & 2) != 0) {
            charSequence2 = "";
        }
        if ((i11 & 4) != 0) {
            charSequence3 = "";
        }
        if ((i11 & 8) != 0) {
            i10 = -1;
        }
        if ((i11 & 16) != 0) {
            charSequence4 = "...";
        }
        if ((i11 & 32) != 0) {
            lVar = null;
        }
        CharSequence charSequence5 = charSequence4;
        p219v8.l lVar2 = lVar;
        return v(hVar, charSequence, charSequence2, charSequence3, i10, charSequence5, lVar2);
    }

    public static h x(h hVar, p219v8.l transform) {
        kotlin.jvm.internal.n.h(hVar, "<this>");
        kotlin.jvm.internal.n.h(transform, "transform");
        return new v(hVar, transform);
    }

    public static h y(h hVar, p219v8.l transform) {
        kotlin.jvm.internal.n.h(hVar, "<this>");
        kotlin.jvm.internal.n.h(transform, "transform");
        return q(new v(hVar, transform));
    }

    public static h z(h hVar, Comparator comparator) {
        kotlin.jvm.internal.n.h(hVar, "<this>");
        kotlin.jvm.internal.n.h(comparator, "comparator");
        return new c(hVar, comparator);
    }
}
