package P8;

import e9.C1350e;
import java.io.EOFException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AbstractC1457h;

/* JADX INFO: loaded from: classes2.dex */
public final class s extends C {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final b f6362d = new b(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final x f6363e = x.f6400e.a("application/x-www-form-urlencoded");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List f6364b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final List f6365c;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Charset f6366a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final List f6367b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final List f6368c;

        /* JADX WARN: Multi-variable type inference failed */
        public a() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public final a a(String name, String value) {
            kotlin.jvm.internal.n.h(name, "name");
            kotlin.jvm.internal.n.h(value, "value");
            List list = this.f6367b;
            v.b bVar = v.f6379k;
            list.add(v.b.b(bVar, name, 0, 0, " \"':;<=>@[]^`{}|/\\?#&!$(),~", false, false, true, false, this.f6366a, 91, null));
            this.f6368c.add(v.b.b(bVar, value, 0, 0, " \"':;<=>@[]^`{}|/\\?#&!$(),~", false, false, true, false, this.f6366a, 91, null));
            return this;
        }

        public final a b(String name, String value) {
            kotlin.jvm.internal.n.h(name, "name");
            kotlin.jvm.internal.n.h(value, "value");
            List list = this.f6367b;
            v.b bVar = v.f6379k;
            list.add(v.b.b(bVar, name, 0, 0, " \"':;<=>@[]^`{}|/\\?#&!$(),~", true, false, true, false, this.f6366a, 83, null));
            this.f6368c.add(v.b.b(bVar, value, 0, 0, " \"':;<=>@[]^`{}|/\\?#&!$(),~", true, false, true, false, this.f6366a, 83, null));
            return this;
        }

        public final s c() {
            return new s(this.f6367b, this.f6368c);
        }

        public a(Charset charset) {
            this.f6366a = charset;
            this.f6367b = new ArrayList();
            this.f6368c = new ArrayList();
        }

        public /* synthetic */ a(Charset charset, int i10, AbstractC1457h abstractC1457h) {
            this((i10 & 1) != 0 ? null : charset);
        }
    }

    public static final class b {
        public /* synthetic */ b(AbstractC1457h abstractC1457h) {
            this();
        }

        private b() {
        }
    }

    public s(List encodedNames, List encodedValues) {
        kotlin.jvm.internal.n.h(encodedNames, "encodedNames");
        kotlin.jvm.internal.n.h(encodedValues, "encodedValues");
        this.f6364b = Q8.d.S(encodedNames);
        this.f6365c = Q8.d.S(encodedValues);
    }

    private final long h(e9.f fVar, boolean z9) throws EOFException {
        C1350e c1350eD;
        if (z9) {
            c1350eD = new C1350e();
        } else {
            kotlin.jvm.internal.n.e(fVar);
            c1350eD = fVar.d();
        }
        int size = this.f6364b.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (i10 > 0) {
                c1350eD.F(38);
            }
            c1350eD.d0((String) this.f6364b.get(i10));
            c1350eD.F(61);
            c1350eD.d0((String) this.f6365c.get(i10));
        }
        if (!z9) {
            return 0L;
        }
        long jX0 = c1350eD.X0();
        c1350eD.j();
        return jX0;
    }

    @Override // P8.C
    public long a() {
        return h(null, true);
    }

    @Override // P8.C
    public x b() {
        return f6363e;
    }

    @Override // P8.C
    public void g(e9.f sink) throws EOFException {
        kotlin.jvm.internal.n.h(sink, "sink");
        h(sink, false);
    }
}
