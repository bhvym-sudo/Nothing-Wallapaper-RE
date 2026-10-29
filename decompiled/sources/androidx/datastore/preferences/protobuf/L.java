package androidx.datastore.preferences.protobuf;

import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
final class L implements K {
    L() {
    }

    private static int i(int i10, Object obj, Object obj2) {
        J j9 = (J) obj;
        I i11 = (I) obj2;
        int iA = 0;
        if (j9.isEmpty()) {
            return 0;
        }
        for (Map.Entry entry : j9.entrySet()) {
            iA += i11.a(i10, entry.getKey(), entry.getValue());
        }
        return iA;
    }

    private static J j(Object obj, Object obj2) {
        J jQ = (J) obj;
        J j9 = (J) obj2;
        if (!j9.isEmpty()) {
            if (!jQ.n()) {
                jQ = jQ.q();
            }
            jQ.p(j9);
        }
        return jQ;
    }

    @Override // androidx.datastore.preferences.protobuf.K
    public Object a(Object obj, Object obj2) {
        return j(obj, obj2);
    }

    @Override // androidx.datastore.preferences.protobuf.K
    public Object b(Object obj) {
        ((J) obj).o();
        return obj;
    }

    @Override // androidx.datastore.preferences.protobuf.K
    public I.a c(Object obj) {
        return ((I) obj).c();
    }

    @Override // androidx.datastore.preferences.protobuf.K
    public Map d(Object obj) {
        return (J) obj;
    }

    @Override // androidx.datastore.preferences.protobuf.K
    public Object e(Object obj) {
        return J.i().q();
    }

    @Override // androidx.datastore.preferences.protobuf.K
    public int f(int i10, Object obj, Object obj2) {
        return i(i10, obj, obj2);
    }

    @Override // androidx.datastore.preferences.protobuf.K
    public boolean g(Object obj) {
        return !((J) obj).n();
    }

    @Override // androidx.datastore.preferences.protobuf.K
    public Map h(Object obj) {
        return (J) obj;
    }
}
