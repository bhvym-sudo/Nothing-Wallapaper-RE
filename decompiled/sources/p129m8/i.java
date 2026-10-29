package p129m8;

import kotlin.jvm.internal.n;
import p219v8.p;

/* JADX INFO: loaded from: classes2.dex */
public interface i {

    public static final class a {
        public static i b(i iVar, i context) {
            n.h(context, "context");
            return context == j.f23252q ? iVar : (i) context.U0(iVar, new p() { // from class: m8.h
                @Override // p219v8.p
                public final Object invoke(Object obj, Object obj2) {
                    return i.a.c((i) obj, (i.b) obj2);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static i c(i acc, b element) {
            n.h(acc, "acc");
            n.h(element, "element");
            i iVarT0 = acc.t0(element.getKey());
            j jVar = j.f23252q;
            if (iVarT0 == jVar) {
                return element;
            }
            f.b bVar = f.f23250l;
            f fVar = (f) iVarT0.b(bVar);
            if (fVar == null) {
                return new d(iVarT0, element);
            }
            i iVarT1 = iVarT0.t0(bVar);
            return iVarT1 == jVar ? new d(element, fVar) : new d(new d(iVarT1, element), fVar);
        }
    }

    public interface b extends i {

        public static final class a {
            public static Object a(b bVar, Object obj, p operation) {
                n.h(operation, "operation");
                return operation.invoke(obj, bVar);
            }

            public static b b(b bVar, c key) {
                n.h(key, "key");
                if (!n.d(bVar.getKey(), key)) {
                    return null;
                }
                n.f(bVar, "null cannot be cast to non-null type E of kotlin.coroutines.CoroutineContext.Element.get");
                return bVar;
            }

            public static i c(b bVar, c key) {
                n.h(key, "key");
                return n.d(bVar.getKey(), key) ? j.f23252q : bVar;
            }

            public static i d(b bVar, i context) {
                n.h(context, "context");
                return a.b(bVar, context);
            }
        }

        @Override // p129m8.i
        b b(c cVar);

        c getKey();
    }

    public interface c {
    }

    Object U0(Object obj, p pVar);

    b b(c cVar);

    i t0(c cVar);

    i z(i iVar);
}
