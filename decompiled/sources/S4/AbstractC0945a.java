package S4;

import java.util.Set;

/* JADX INFO: renamed from: S4.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
abstract class AbstractC0945a implements d {
    AbstractC0945a() {
    }

    @Override // S4.d
    public Object a(Class cls) {
        Y4.b bVarB = b(cls);
        if (bVarB == null) {
            return null;
        }
        return bVarB.get();
    }

    @Override // S4.d
    public Set d(Class cls) {
        return (Set) c(cls).get();
    }
}
