package V2;

import android.util.ArrayMap;
import java.util.function.BiConsumer;

/* JADX INFO: loaded from: classes.dex */
public class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ArrayMap f8182a = new ArrayMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Class f8183b;

    class a implements BiConsumer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ ArrayMap f8184a;

        a(ArrayMap arrayMap) {
            this.f8184a = arrayMap;
        }

        @Override // java.util.function.BiConsumer
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void accept(Class cls, d dVar) {
            d dVarE = (d) this.f8184a.remove(cls);
            if (dVarE == null) {
                dVarE = o.this.e(cls);
            }
            if (dVarE != null) {
                if (dVarE.f8189a != dVar.f8189a) {
                    throw new c(cls, dVarE.f8189a < dVar.f8189a, dVarE.f8189a, dVar.f8189a);
                }
            } else {
                throw new c(cls.getSimpleName() + " does not provide an interface", false);
            }
        }
    }

    class b implements BiConsumer {
        b(o oVar) {
        }

        @Override // java.util.function.BiConsumer
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void accept(Class cls, d dVar) {
            if (dVar.f8190b) {
                throw new c("Missing required dependency " + cls.getSimpleName(), false);
            }
        }
    }

    private static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f8189a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final boolean f8190b;

        public d(int i10, boolean z9) {
            this.f8189a = i10;
            this.f8190b = z9;
        }
    }

    private void c(Class cls, boolean z9) {
        if (this.f8182a.containsKey(cls)) {
            return;
        }
        N2.c cVar = (N2.c) cls.getDeclaredAnnotation(N2.c.class);
        if (cVar != null) {
            this.f8182a.put(cls, new d(cVar.version(), true));
        }
        N2.e eVar = (N2.e) cls.getDeclaredAnnotation(N2.e.class);
        if (eVar != null) {
            this.f8182a.put(eVar.target(), new d(eVar.version(), z9));
        }
        N2.d dVar = (N2.d) cls.getDeclaredAnnotation(N2.d.class);
        if (dVar != null) {
            for (N2.e eVar2 : dVar.value()) {
                this.f8182a.put(eVar2.target(), new d(eVar2.version(), z9));
            }
        }
        N2.b bVar = (N2.b) cls.getDeclaredAnnotation(N2.b.class);
        if (bVar != null) {
            c(bVar.target(), true);
        }
        N2.a aVar = (N2.a) cls.getDeclaredAnnotation(N2.a.class);
        if (aVar != null) {
            for (N2.b bVar2 : aVar.value()) {
                c(bVar2.target(), true);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public d e(Class cls) {
        N2.c cVar = (N2.c) cls.getDeclaredAnnotation(N2.c.class);
        if (cVar != null) {
            return new d(cVar.version(), false);
        }
        return null;
    }

    public o b(Class cls) {
        if (this.f8183b == null) {
            this.f8183b = cls;
        }
        c(cls, false);
        return this;
    }

    public void d(o oVar) {
        ArrayMap arrayMap = new ArrayMap(this.f8182a);
        oVar.f8182a.forEach(new a(arrayMap));
        arrayMap.forEach(new b(this));
    }

    public int f() {
        return ((d) this.f8182a.get(this.f8183b)).f8189a;
    }

    public boolean g() {
        return !this.f8182a.isEmpty();
    }

    public static class c extends RuntimeException {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private final boolean f8186q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private int f8187r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        private int f8188s;

        public c(String str, boolean z9) {
            super(str);
            this.f8186q = z9;
        }

        public boolean a() {
            return this.f8186q;
        }

        public c(Class cls, boolean z9, int i10, int i11) {
            super(cls.getSimpleName() + " expected version " + i10 + " but had " + i11);
            this.f8186q = z9;
            this.f8187r = i10;
            this.f8188s = i11;
        }
    }
}
