package p001a0;

import F8.AbstractC0816i;
import F8.InterfaceC0846x0;
import F8.L;
import android.os.CancellationSignal;
import kotlin.jvm.internal.o;
import p079h8.A;
import p219v8.l;
import p219v8.p;

/* JADX INFO: loaded from: classes.dex */
public abstract class c {

    static final class a extends o implements l {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ CancellationSignal f9578r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(CancellationSignal cancellationSignal) {
            super(1);
            this.f9578r = cancellationSignal;
        }

        public final void a(Throwable th) {
            if (th != null) {
                this.f9578r.cancel();
            }
        }

        @Override // p219v8.l
        public /* bridge */ /* synthetic */ Object f(Object obj) {
            a((Throwable) obj);
            return A.f21846a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC0846x0 c(L l9, CancellationSignal cancellationSignal, p pVar) {
        final InterfaceC0846x0 interfaceC0846x0D = AbstractC0816i.d(l9, null, null, pVar, 3, null);
        interfaceC0846x0D.c1(new a(cancellationSignal));
        cancellationSignal.setOnCancelListener(new CancellationSignal.OnCancelListener() { // from class: a0.b
            @Override // android.os.CancellationSignal.OnCancelListener
            public final void onCancel() {
                c.d(interfaceC0846x0D);
            }
        });
        return interfaceC0846x0D;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(InterfaceC0846x0 interfaceC0846x0) {
        InterfaceC0846x0.a.a(interfaceC0846x0, null, 1, null);
    }
}
