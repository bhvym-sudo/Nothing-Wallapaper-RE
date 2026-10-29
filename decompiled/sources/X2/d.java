package X2;

import I8.InterfaceC0880f;

/* JADX INFO: loaded from: classes.dex */
public interface d {
    static /* synthetic */ InterfaceC0880f b(d dVar, String str, int i10, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: intSetting");
        }
        if ((i11 & 2) != 0) {
            i10 = 0;
        }
        return dVar.a(str, i10);
    }

    InterfaceC0880f a(String str, int i10);
}
