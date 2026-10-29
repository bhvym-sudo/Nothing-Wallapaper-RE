package F8;

import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes2.dex */
public final class J0 extends p129m8.a implements InterfaceC0846x0 {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final J0 f1819r = new J0();

    private J0() {
        super(InterfaceC0846x0.f1901e);
    }

    @Override // F8.InterfaceC0846x0
    public InterfaceC0835s G(InterfaceC0839u interfaceC0839u) {
        return K0.f1820q;
    }

    @Override // F8.InterfaceC0846x0
    public InterfaceC0807d0 I(boolean z9, boolean z10, p219v8.l lVar) {
        return K0.f1820q;
    }

    @Override // F8.InterfaceC0846x0
    public CancellationException K() {
        throw new IllegalStateException("This job is always active");
    }

    @Override // F8.InterfaceC0846x0
    public boolean O0() {
        return false;
    }

    @Override // F8.InterfaceC0846x0
    public Object Q(p129m8.e eVar) {
        throw new UnsupportedOperationException("This job is always active");
    }

    @Override // F8.InterfaceC0846x0
    public boolean a() {
        return true;
    }

    @Override // F8.InterfaceC0846x0
    public InterfaceC0807d0 c1(p219v8.l lVar) {
        return K0.f1820q;
    }

    @Override // F8.InterfaceC0846x0
    public void f(CancellationException cancellationException) {
    }

    @Override // F8.InterfaceC0846x0
    public boolean isCancelled() {
        return false;
    }

    @Override // F8.InterfaceC0846x0
    public boolean start() {
        return false;
    }

    public String toString() {
        return "NonCancellable";
    }
}
