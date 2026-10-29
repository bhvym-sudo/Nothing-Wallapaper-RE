package androidx.datastore.preferences.protobuf;

import java.util.Collections;
import java.util.Map;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1105o {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static volatile C1105o f12540b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static final C1105o f12541c = new C1105o(true);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map f12542a = Collections.EMPTY_MAP;

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.o$a */
    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Object f12543a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f12544b;

        a(Object obj, int i10) {
            this.f12543a = obj;
            this.f12544b = i10;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f12543a == aVar.f12543a && this.f12544b == aVar.f12544b;
        }

        public int hashCode() {
            return (System.identityHashCode(this.f12543a) * 65535) + this.f12544b;
        }
    }

    C1105o(boolean z9) {
    }

    public static C1105o b() {
        C1105o c1105oA;
        if (b0.f12446d) {
            return f12541c;
        }
        C1105o c1105o = f12540b;
        if (c1105o != null) {
            return c1105o;
        }
        synchronized (C1105o.class) {
            try {
                c1105oA = f12540b;
                if (c1105oA == null) {
                    c1105oA = AbstractC1104n.a();
                    f12540b = c1105oA;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return c1105oA;
    }

    public AbstractC1112w.c a(P p9, int i10) {
        androidx.appcompat.app.o.a(this.f12542a.get(new a(p9, i10)));
        return null;
    }
}
