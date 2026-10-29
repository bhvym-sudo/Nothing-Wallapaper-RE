package g9;

import java.io.EOFException;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
abstract class s {

    class a extends s {
        a() {
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // g9.s
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void a(v vVar, Iterable iterable) {
            if (iterable == null) {
                return;
            }
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                s.this.a(vVar, it.next());
            }
        }
    }

    class b extends s {
        b() {
        }

        @Override // g9.s
        void a(v vVar, Object obj) {
            if (obj == null) {
                return;
            }
            int length = Array.getLength(obj);
            for (int i10 = 0; i10 < length; i10++) {
                s.this.a(vVar, Array.get(obj, i10));
            }
        }
    }

    static final class c extends s {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Method f21441a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f21442b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final g9.h f21443c;

        c(Method method, int i10, g9.h hVar) {
            this.f21441a = method;
            this.f21442b = i10;
            this.f21443c = hVar;
        }

        @Override // g9.s
        void a(v vVar, Object obj) {
            if (obj == null) {
                throw C.p(this.f21441a, this.f21442b, "Body parameter value must not be null.", new Object[0]);
            }
            try {
                vVar.l((P8.C) this.f21443c.a(obj));
            } catch (IOException e10) {
                throw C.q(this.f21441a, e10, this.f21442b, "Unable to convert " + obj + " to RequestBody", new Object[0]);
            }
        }
    }

    static final class d extends s {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f21444a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final g9.h f21445b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final boolean f21446c;

        d(String str, g9.h hVar, boolean z9) {
            Objects.requireNonNull(str, "name == null");
            this.f21444a = str;
            this.f21445b = hVar;
            this.f21446c = z9;
        }

        @Override // g9.s
        void a(v vVar, Object obj) {
            String str;
            if (obj == null || (str = (String) this.f21445b.a(obj)) == null) {
                return;
            }
            vVar.a(this.f21444a, str, this.f21446c);
        }
    }

    static final class e extends s {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Method f21447a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f21448b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final g9.h f21449c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final boolean f21450d;

        e(Method method, int i10, g9.h hVar, boolean z9) {
            this.f21447a = method;
            this.f21448b = i10;
            this.f21449c = hVar;
            this.f21450d = z9;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // g9.s
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void a(v vVar, Map map) {
            if (map == null) {
                throw C.p(this.f21447a, this.f21448b, "Field map was null.", new Object[0]);
            }
            for (Map.Entry entry : map.entrySet()) {
                String str = (String) entry.getKey();
                if (str == null) {
                    throw C.p(this.f21447a, this.f21448b, "Field map contained null key.", new Object[0]);
                }
                Object value = entry.getValue();
                if (value == null) {
                    throw C.p(this.f21447a, this.f21448b, "Field map contained null value for key '" + str + "'.", new Object[0]);
                }
                String str2 = (String) this.f21449c.a(value);
                if (str2 == null) {
                    throw C.p(this.f21447a, this.f21448b, "Field map value '" + value + "' converted to null by " + this.f21449c.getClass().getName() + " for key '" + str + "'.", new Object[0]);
                }
                vVar.a(str, str2, this.f21450d);
            }
        }
    }

    static final class f extends s {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f21451a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final g9.h f21452b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final boolean f21453c;

        f(String str, g9.h hVar, boolean z9) {
            Objects.requireNonNull(str, "name == null");
            this.f21451a = str;
            this.f21452b = hVar;
            this.f21453c = z9;
        }

        @Override // g9.s
        void a(v vVar, Object obj) {
            String str;
            if (obj == null || (str = (String) this.f21452b.a(obj)) == null) {
                return;
            }
            vVar.b(this.f21451a, str, this.f21453c);
        }
    }

    static final class g extends s {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Method f21454a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f21455b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final g9.h f21456c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final boolean f21457d;

        g(Method method, int i10, g9.h hVar, boolean z9) {
            this.f21454a = method;
            this.f21455b = i10;
            this.f21456c = hVar;
            this.f21457d = z9;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // g9.s
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void a(v vVar, Map map) {
            if (map == null) {
                throw C.p(this.f21454a, this.f21455b, "Header map was null.", new Object[0]);
            }
            for (Map.Entry entry : map.entrySet()) {
                String str = (String) entry.getKey();
                if (str == null) {
                    throw C.p(this.f21454a, this.f21455b, "Header map contained null key.", new Object[0]);
                }
                Object value = entry.getValue();
                if (value == null) {
                    throw C.p(this.f21454a, this.f21455b, "Header map contained null value for key '" + str + "'.", new Object[0]);
                }
                vVar.b(str, (String) this.f21456c.a(value), this.f21457d);
            }
        }
    }

    static final class h extends s {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Method f21458a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f21459b;

        h(Method method, int i10) {
            this.f21458a = method;
            this.f21459b = i10;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // g9.s
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void a(v vVar, P8.u uVar) {
            if (uVar == null) {
                throw C.p(this.f21458a, this.f21459b, "Headers parameter must not be null.", new Object[0]);
            }
            vVar.c(uVar);
        }
    }

    static final class i extends s {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Method f21460a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f21461b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final P8.u f21462c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final g9.h f21463d;

        i(Method method, int i10, P8.u uVar, g9.h hVar) {
            this.f21460a = method;
            this.f21461b = i10;
            this.f21462c = uVar;
            this.f21463d = hVar;
        }

        @Override // g9.s
        void a(v vVar, Object obj) {
            if (obj == null) {
                return;
            }
            try {
                vVar.d(this.f21462c, (P8.C) this.f21463d.a(obj));
            } catch (IOException e10) {
                throw C.p(this.f21460a, this.f21461b, "Unable to convert " + obj + " to RequestBody", e10);
            }
        }
    }

    static final class j extends s {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Method f21464a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f21465b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final g9.h f21466c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final String f21467d;

        j(Method method, int i10, g9.h hVar, String str) {
            this.f21464a = method;
            this.f21465b = i10;
            this.f21466c = hVar;
            this.f21467d = str;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // g9.s
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void a(v vVar, Map map) {
            if (map == null) {
                throw C.p(this.f21464a, this.f21465b, "Part map was null.", new Object[0]);
            }
            for (Map.Entry entry : map.entrySet()) {
                String str = (String) entry.getKey();
                if (str == null) {
                    throw C.p(this.f21464a, this.f21465b, "Part map contained null key.", new Object[0]);
                }
                Object value = entry.getValue();
                if (value == null) {
                    throw C.p(this.f21464a, this.f21465b, "Part map contained null value for key '" + str + "'.", new Object[0]);
                }
                vVar.d(P8.u.g("Content-Disposition", "form-data; name=\"" + str + "\"", "Content-Transfer-Encoding", this.f21467d), (P8.C) this.f21466c.a(value));
            }
        }
    }

    static final class k extends s {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Method f21468a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f21469b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final String f21470c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final g9.h f21471d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final boolean f21472e;

        k(Method method, int i10, String str, g9.h hVar, boolean z9) {
            this.f21468a = method;
            this.f21469b = i10;
            Objects.requireNonNull(str, "name == null");
            this.f21470c = str;
            this.f21471d = hVar;
            this.f21472e = z9;
        }

        @Override // g9.s
        void a(v vVar, Object obj) throws EOFException {
            if (obj != null) {
                vVar.f(this.f21470c, (String) this.f21471d.a(obj), this.f21472e);
                return;
            }
            throw C.p(this.f21468a, this.f21469b, "Path parameter \"" + this.f21470c + "\" value must not be null.", new Object[0]);
        }
    }

    static final class l extends s {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f21473a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final g9.h f21474b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final boolean f21475c;

        l(String str, g9.h hVar, boolean z9) {
            Objects.requireNonNull(str, "name == null");
            this.f21473a = str;
            this.f21474b = hVar;
            this.f21475c = z9;
        }

        @Override // g9.s
        void a(v vVar, Object obj) {
            String str;
            if (obj == null || (str = (String) this.f21474b.a(obj)) == null) {
                return;
            }
            vVar.g(this.f21473a, str, this.f21475c);
        }
    }

    static final class m extends s {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Method f21476a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f21477b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final g9.h f21478c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final boolean f21479d;

        m(Method method, int i10, g9.h hVar, boolean z9) {
            this.f21476a = method;
            this.f21477b = i10;
            this.f21478c = hVar;
            this.f21479d = z9;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // g9.s
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void a(v vVar, Map map) {
            if (map == null) {
                throw C.p(this.f21476a, this.f21477b, "Query map was null", new Object[0]);
            }
            for (Map.Entry entry : map.entrySet()) {
                String str = (String) entry.getKey();
                if (str == null) {
                    throw C.p(this.f21476a, this.f21477b, "Query map contained null key.", new Object[0]);
                }
                Object value = entry.getValue();
                if (value == null) {
                    throw C.p(this.f21476a, this.f21477b, "Query map contained null value for key '" + str + "'.", new Object[0]);
                }
                String str2 = (String) this.f21478c.a(value);
                if (str2 == null) {
                    throw C.p(this.f21476a, this.f21477b, "Query map value '" + value + "' converted to null by " + this.f21478c.getClass().getName() + " for key '" + str + "'.", new Object[0]);
                }
                vVar.g(str, str2, this.f21479d);
            }
        }
    }

    static final class n extends s {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final g9.h f21480a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final boolean f21481b;

        n(g9.h hVar, boolean z9) {
            this.f21480a = hVar;
            this.f21481b = z9;
        }

        @Override // g9.s
        void a(v vVar, Object obj) {
            if (obj == null) {
                return;
            }
            vVar.g((String) this.f21480a.a(obj), null, this.f21481b);
        }
    }

    static final class o extends s {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final o f21482a = new o();

        private o() {
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // g9.s
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void a(v vVar, P8.y.c cVar) {
            if (cVar != null) {
                vVar.e(cVar);
            }
        }
    }

    static final class p extends s {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Method f21483a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f21484b;

        p(Method method, int i10) {
            this.f21483a = method;
            this.f21484b = i10;
        }

        @Override // g9.s
        void a(v vVar, Object obj) {
            if (obj == null) {
                throw C.p(this.f21483a, this.f21484b, "@Url parameter is null.", new Object[0]);
            }
            vVar.m(obj);
        }
    }

    static final class q extends s {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Class f21485a;

        q(Class cls) {
            this.f21485a = cls;
        }

        @Override // g9.s
        void a(v vVar, Object obj) {
            vVar.h(this.f21485a, obj);
        }
    }

    s() {
    }

    abstract void a(v vVar, Object obj);

    final s b() {
        return new b();
    }

    final s c() {
        return new a();
    }
}
