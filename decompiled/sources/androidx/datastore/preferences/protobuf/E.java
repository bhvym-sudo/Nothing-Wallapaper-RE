package androidx.datastore.preferences.protobuf;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
final class E implements D {
    E() {
    }

    static AbstractC1114y.b d(Object obj, long j9) {
        return (AbstractC1114y.b) p0.z(obj, j9);
    }

    @Override // androidx.datastore.preferences.protobuf.D
    public void a(Object obj, Object obj2, long j9) {
        AbstractC1114y.b bVarD = d(obj, j9);
        AbstractC1114y.b bVarD2 = d(obj2, j9);
        int size = bVarD.size();
        int size2 = bVarD2.size();
        if (size > 0 && size2 > 0) {
            if (!bVarD.l()) {
                bVarD = bVarD.d(size2 + size);
            }
            bVarD.addAll(bVarD2);
        }
        if (size > 0) {
            bVarD2 = bVarD;
        }
        p0.O(obj, j9, bVarD2);
    }

    @Override // androidx.datastore.preferences.protobuf.D
    public void b(Object obj, long j9) {
        d(obj, j9).c();
    }

    @Override // androidx.datastore.preferences.protobuf.D
    public List c(Object obj, long j9) {
        AbstractC1114y.b bVarD = d(obj, j9);
        if (bVarD.l()) {
            return bVarD;
        }
        int size = bVarD.size();
        AbstractC1114y.b bVarD2 = bVarD.d(size == 0 ? 10 : size * 2);
        p0.O(obj, j9, bVarD2);
        return bVarD2;
    }
}
