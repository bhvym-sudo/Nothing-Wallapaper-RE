package G8;

import F8.A0;
import F8.C0803b0;
import F8.InterfaceC0807d0;
import F8.InterfaceC0822l;
import F8.K0;
import F8.V;
import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.AbstractC1457h;
import kotlin.jvm.internal.n;
import p079h8.A;
import p129m8.i;
import p219v8.l;

/* JADX INFO: loaded from: classes2.dex */
public final class f extends g implements V {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final Handler f2276s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final String f2277t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final boolean f2278u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final f f2279v;

    private f(Handler handler, String str, boolean z9) {
        super(null);
        this.f2276s = handler;
        this.f2277t = str;
        this.f2278u = z9;
        this.f2279v = z9 ? this : new f(handler, str, true);
    }

    private final void r1(i iVar, Runnable runnable) {
        A0.d(iVar, new CancellationException("The task was rejected, the handler underlying the dispatcher '" + this + "' was closed"));
        C0803b0.b().g1(iVar, runnable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void t1(f fVar, Runnable runnable) {
        fVar.f2276s.removeCallbacks(runnable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void u1(InterfaceC0822l interfaceC0822l, f fVar) {
        interfaceC0822l.q(fVar, A.f21846a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final A v1(f fVar, Runnable runnable, Throwable th) {
        fVar.f2276s.removeCallbacks(runnable);
        return A.f21846a;
    }

    @Override // F8.V
    public void T0(long j9, final InterfaceC0822l interfaceC0822l) {
        final Runnable runnable = new Runnable() { // from class: G8.d
            @Override // java.lang.Runnable
            public final void run() {
                f.u1(interfaceC0822l, this);
            }
        };
        if (this.f2276s.postDelayed(runnable, B8.h.j(j9, 4611686018427387903L))) {
            interfaceC0822l.i(new l() { // from class: G8.e
                @Override // p219v8.l
                public final Object f(Object obj) {
                    return f.v1(this.f2274q, runnable, (Throwable) obj);
                }
            });
        } else {
            r1(interfaceC0822l.getContext(), runnable);
        }
    }

    @Override // F8.V
    public InterfaceC0807d0 W0(long j9, final Runnable runnable, i iVar) {
        if (this.f2276s.postDelayed(runnable, B8.h.j(j9, 4611686018427387903L))) {
            return new InterfaceC0807d0() { // from class: G8.c
                @Override // F8.InterfaceC0807d0
                public final void dispose() {
                    f.t1(this.f2270q, runnable);
                }
            };
        }
        r1(iVar, runnable);
        return K0.f1820q;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return fVar.f2276s == this.f2276s && fVar.f2278u == this.f2278u;
    }

    @Override // F8.I
    public void g1(i iVar, Runnable runnable) {
        if (this.f2276s.post(runnable)) {
            return;
        }
        r1(iVar, runnable);
    }

    public int hashCode() {
        return (this.f2278u ? 1231 : 1237) ^ System.identityHashCode(this.f2276s);
    }

    @Override // F8.I
    public boolean i1(i iVar) {
        return (this.f2278u && n.d(Looper.myLooper(), this.f2276s.getLooper())) ? false : true;
    }

    @Override // G8.g
    /* JADX INFO: renamed from: s1, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public f n1() {
        return this.f2279v;
    }

    @Override // F8.I
    public String toString() {
        String strM1 = m1();
        if (strM1 == null) {
            strM1 = this.f2277t;
            if (strM1 == null) {
                strM1 = this.f2276s.toString();
            }
            if (this.f2278u) {
                return strM1 + ".immediate";
            }
        }
        return strM1;
    }

    public /* synthetic */ f(Handler handler, String str, int i10, AbstractC1457h abstractC1457h) {
        this(handler, (i10 & 2) != 0 ? null : str);
    }

    public f(Handler handler, String str) {
        this(handler, str, false);
    }
}
