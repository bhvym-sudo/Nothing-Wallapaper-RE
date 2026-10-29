package p101k0;

import java.util.ArrayList;
import kotlin.jvm.internal.AbstractC1457h;

/* JADX INFO: loaded from: classes.dex */
public final class h {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f22657b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final h f22658c = new h(0);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final h f22659d = new h(1);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final h f22660e = new h(2);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f22661a;

    public static final class a {
        public /* synthetic */ a(AbstractC1457h abstractC1457h) {
            this();
        }

        public final h a() {
            return h.f22660e;
        }

        public final h b() {
            return h.f22659d;
        }

        private a() {
        }
    }

    public h(int i10) {
        this.f22661a = i10;
    }

    public final boolean c(h hVar) {
        int i10 = this.f22661a;
        return (hVar.f22661a | i10) == i10;
    }

    public final int d() {
        return this.f22661a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof h) && this.f22661a == ((h) obj).f22661a;
    }

    public int hashCode() {
        return this.f22661a;
    }

    public String toString() {
        if (this.f22661a == 0) {
            return "TextDecoration.None";
        }
        ArrayList arrayList = new ArrayList();
        if ((this.f22661a & f22659d.f22661a) != 0) {
            arrayList.add("Underline");
        }
        if ((this.f22661a & f22660e.f22661a) != 0) {
            arrayList.add("LineThrough");
        }
        if (arrayList.size() == 1) {
            return "TextDecoration." + ((String) arrayList.get(0));
        }
        return "TextDecoration[" + p131n0.a.d(arrayList, ", ", null, null, 0, null, null, 62, null) + ']';
    }
}
