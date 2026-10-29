package F8;

import K8.AbstractC0919l;

/* JADX INFO: loaded from: classes2.dex */
public abstract class H0 extends I {
    @Override // F8.I
    public I j1(int i10, String str) {
        AbstractC0919l.a(i10);
        return AbstractC0919l.b(this, str);
    }

    public abstract H0 l1();

    protected final String m1() {
        H0 h0L1;
        H0 h0C = C0803b0.c();
        if (this == h0C) {
            return "Dispatchers.Main";
        }
        try {
            h0L1 = h0C.l1();
        } catch (UnsupportedOperationException unused) {
            h0L1 = null;
        }
        if (this == h0L1) {
            return "Dispatchers.Main.immediate";
        }
        return null;
    }
}
