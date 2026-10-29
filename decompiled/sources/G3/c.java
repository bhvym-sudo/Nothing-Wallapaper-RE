package G3;

import I8.A;
import I8.AbstractC0882h;
import I8.InterfaceC0880f;
import I8.Q;
import com.nothing.wallpaper.R;
import kotlin.jvm.internal.n;
import p089i8.AbstractC1444s;

/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final D3.c f1942a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterfaceC0880f f1943b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final A f1944c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final InterfaceC0880f f1945d;

    public c(D3.c interactor) {
        n.h(interactor, "interactor");
        this.f1942a = interactor;
        this.f1943b = interactor.b();
        A a10 = Q.a(null);
        this.f1944c = a10;
        this.f1945d = AbstractC0882h.b(a10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p079h8.A f(c cVar) {
        cVar.f1942a.c();
        cVar.f1944c.setValue(null);
        return p079h8.A.f21846a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p079h8.A g(c cVar) {
        cVar.f1944c.setValue(null);
        return p079h8.A.f21846a;
    }

    public final InterfaceC0880f c() {
        return this.f1945d;
    }

    public final InterfaceC0880f d() {
        return this.f1943b;
    }

    public final void e() {
        this.f1944c.setValue(new p124m3.a(new o3.a.b(R.drawable.ic_device_reset, null), new q3.a.c(R.string.reset_confirmation_dialog_title), null, new q3.a.c(R.string.reset_confirmation_dialog_message), AbstractC1444s.n(new p104k3.b(new q3.a.c(R.string.cancel), k3.a.b.f22710b, null, 4, null), new p104k3.b(new q3.a.c(R.string.reset), p104k3.a.C0577a.f22709b, new p219v8.a() { // from class: G3.a
            @Override // p219v8.a
            public final Object invoke() {
                return c.f(this.f1940q);
            }
        })), new p219v8.a() { // from class: G3.b
            @Override // p219v8.a
            public final Object invoke() {
                return c.g(this.f1941q);
            }
        }, 4, null));
    }
}
