package p001a0;

import F8.AbstractC0816i;
import F8.J0;
import F8.L;
import F8.M;
import H.g;
import I.AbstractC0859c;
import I.InterfaceC0869m;
import I.J;
import W.U;
import android.graphics.BlendMode;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.CancellationSignal;
import android.view.ScrollCaptureCallback;
import android.view.ScrollCaptureSession;
import java.util.function.Consumer;
import kotlin.coroutines.jvm.internal.l;
import p011b0.j;
import p011b0.m;
import p079h8.A;
import p079h8.r;
import p111l0.o;
import p170r.AbstractC1671b0;
import p219v8.p;

/* JADX INFO: loaded from: classes.dex */
public final class a implements ScrollCaptureCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final j f9550a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final o f9551b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final InterfaceC0350a f9552c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final L f9553d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final p001a0.e f9554e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f9555f;

    /* JADX INFO: renamed from: a0.a$a, reason: collision with other inner class name */
    public interface InterfaceC0350a {
        void a();

        void b();
    }

    static final class b extends l implements p {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f9556q;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        final /* synthetic */ Runnable f9558s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(Runnable runnable, p129m8.e eVar) {
            super(2, eVar);
            this.f9558s = runnable;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final p129m8.e create(Object obj, p129m8.e eVar) {
            return a.this.new b(this.f9558s, eVar);
        }

        @Override // p219v8.p
        public final Object invoke(L l9, p129m8.e eVar) {
            return ((b) create(l9, eVar)).invokeSuspend(A.f21846a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objE = p139n8.b.e();
            int i10 = this.f9556q;
            if (i10 == 0) {
                r.b(obj);
                p001a0.e eVar = a.this.f9554e;
                this.f9556q = 1;
                if (eVar.g(0.0f, this) == objE) {
                    return objE;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                r.b(obj);
            }
            a.this.f9552c.b();
            this.f9558s.run();
            return A.f21846a;
        }
    }

    static final class c extends l implements p {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f9559q;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        final /* synthetic */ ScrollCaptureSession f9561s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ Rect f9562t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        final /* synthetic */ Consumer f9563u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(ScrollCaptureSession scrollCaptureSession, Rect rect, Consumer consumer, p129m8.e eVar) {
            super(2, eVar);
            this.f9561s = scrollCaptureSession;
            this.f9562t = rect;
            this.f9563u = consumer;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final p129m8.e create(Object obj, p129m8.e eVar) {
            return a.this.new c(this.f9561s, this.f9562t, this.f9563u, eVar);
        }

        @Override // p219v8.p
        public final Object invoke(L l9, p129m8.e eVar) {
            return ((c) create(l9, eVar)).invokeSuspend(A.f21846a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objE = p139n8.b.e();
            int i10 = this.f9559q;
            if (i10 == 0) {
                r.b(obj);
                a aVar = a.this;
                ScrollCaptureSession scrollCaptureSession = this.f9561s;
                o oVarD = J.d(this.f9562t);
                this.f9559q = 1;
                obj = aVar.e(scrollCaptureSession, oVarD, this);
                if (obj == objE) {
                    return objE;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                r.b(obj);
            }
            this.f9563u.accept(J.b((o) obj));
            return A.f21846a;
        }
    }

    static final class d extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        Object f9564q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        Object f9565r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        Object f9566s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        int f9567t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        int f9568u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        /* synthetic */ Object f9569v;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        int f9571x;

        d(p129m8.e eVar) {
            super(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f9569v = obj;
            this.f9571x |= Integer.MIN_VALUE;
            return a.this.e(null, null, this);
        }
    }

    static final class e extends kotlin.jvm.internal.o implements p219v8.l {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public static final e f9572r = new e();

        e() {
            super(1);
        }

        public final void a(long j9) {
        }

        @Override // p219v8.l
        public /* bridge */ /* synthetic */ Object f(Object obj) {
            a(((Number) obj).longValue());
            return A.f21846a;
        }
    }

    static final class f extends l implements p {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        boolean f9573q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f9574r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        /* synthetic */ float f9575s;

        f(p129m8.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final p129m8.e create(Object obj, p129m8.e eVar) {
            f fVar = a.this.new f(eVar);
            fVar.f9575s = ((Number) obj).floatValue();
            return fVar;
        }

        @Override // p219v8.p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return s(((Number) obj).floatValue(), (p129m8.e) obj2);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            p139n8.b.e();
            int i10 = this.f9574r;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                boolean z9 = this.f9573q;
                r.b(obj);
                long jS = ((g) obj).s();
                return kotlin.coroutines.jvm.internal.b.b(z9 ? -g.l(jS) : g.l(jS));
            }
            r.b(obj);
            if (h.c(a.this.f9550a) == null) {
                T.a.c("Required value was null.");
                throw new p079h8.f();
            }
            androidx.appcompat.app.o.a(a.this.f9550a.w().m(m.f14629a.F()));
            throw null;
        }

        public final Object s(float f10, p129m8.e eVar) {
            return ((f) create(Float.valueOf(f10), eVar)).invokeSuspend(A.f21846a);
        }
    }

    public a(j jVar, o oVar, L l9, InterfaceC0350a interfaceC0350a) {
        this.f9550a = jVar;
        this.f9551b = oVar;
        this.f9552c = interfaceC0350a;
        this.f9553d = M.h(l9, p001a0.d.f9579q);
        this.f9554e = new p001a0.e(oVar.e(), new f(null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:25:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:27:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:29:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:36:0x0105  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object e(ScrollCaptureSession scrollCaptureSession, o oVar, p129m8.e eVar) {
        d dVar;
        int iH;
        int iD;
        ScrollCaptureSession scrollCaptureSession2;
        int i10;
        o oVar2;
        a aVar;
        int i11;
        int iC;
        int iC2;
        o oVarC;
        U uE;
        Canvas canvasLockHardwareCanvas;
        if (eVar instanceof d) {
            dVar = (d) eVar;
            int i12 = dVar.f9571x;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                dVar.f9571x = i12 - Integer.MIN_VALUE;
            } else {
                dVar = new d(eVar);
            }
        } else {
            dVar = new d(eVar);
        }
        Object obj = dVar.f9569v;
        Object objE = p139n8.b.e();
        int i13 = dVar.f9571x;
        if (i13 == 0) {
            r.b(obj);
            iH = oVar.h();
            iD = oVar.d();
            p001a0.e eVar2 = this.f9554e;
            dVar.f9564q = this;
            dVar.f9565r = scrollCaptureSession;
            dVar.f9566s = oVar;
            dVar.f9567t = iH;
            dVar.f9568u = iD;
            dVar.f9571x = 1;
            if (eVar2.f(iH, iD, dVar) != objE) {
            }
            return objE;
        }
        if (i13 == 1) {
            int i14 = dVar.f9568u;
            int i15 = dVar.f9567t;
            oVar = (o) dVar.f9566s;
            ScrollCaptureSession scrollCaptureSession3 = (ScrollCaptureSession) dVar.f9565r;
            a aVar2 = (a) dVar.f9564q;
            r.b(obj);
            iH = i15;
            scrollCaptureSession = scrollCaptureSession3;
            iD = i14;
            this = aVar2;
        } else {
            if (i13 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i11 = dVar.f9568u;
            i10 = dVar.f9567t;
            o oVar3 = (o) dVar.f9566s;
            ScrollCaptureSession scrollCaptureSession4 = (ScrollCaptureSession) dVar.f9565r;
            a aVar3 = (a) dVar.f9564q;
            r.b(obj);
            oVar2 = oVar3;
            aVar = aVar3;
            scrollCaptureSession2 = scrollCaptureSession4;
        }
        iC = aVar.f9554e.c(i10);
        iC2 = aVar.f9554e.c(i11);
        oVarC = o.c(oVar2, 0, iC, 0, iC2, 5, null);
        if (iC == iC2) {
            return o.f22831e.a();
        }
        uE = aVar.f9550a.e();
        if (uE != null) {
            throw new IllegalStateException("Could not find coordinator for semantics node.");
        }
        canvasLockHardwareCanvas = scrollCaptureSession2.getSurface().lockHardwareCanvas();
        try {
            canvasLockHardwareCanvas.drawColor(0, BlendMode.CLEAR);
            InterfaceC0869m interfaceC0869mA = AbstractC0859c.a(canvasLockHardwareCanvas);
            interfaceC0869mA.l(-oVarC.f(), -oVarC.h());
            uE.W0(interfaceC0869mA, null);
            return oVarC.k(0, p239x8.a.b(aVar.f9554e.b()));
        } finally {
            scrollCaptureSession2.getSurface().unlockCanvasAndPost(canvasLockHardwareCanvas);
        }
        e eVar3 = e.f9572r;
        dVar.f9564q = this;
        dVar.f9565r = scrollCaptureSession;
        dVar.f9566s = oVar;
        dVar.f9567t = iH;
        dVar.f9568u = iD;
        dVar.f9571x = 2;
        if (AbstractC1671b0.b(eVar3, dVar) != objE) {
            int i16 = iH;
            scrollCaptureSession2 = scrollCaptureSession;
            i10 = i16;
            oVar2 = oVar;
            aVar = this;
            i11 = iD;
            iC = aVar.f9554e.c(i10);
            iC2 = aVar.f9554e.c(i11);
            oVarC = o.c(oVar2, 0, iC, 0, iC2, 5, null);
            if (iC == iC2) {
                return o.f22831e.a();
            }
            uE = aVar.f9550a.e();
            if (uE != null) {
                throw new IllegalStateException("Could not find coordinator for semantics node.");
            }
            canvasLockHardwareCanvas = scrollCaptureSession2.getSurface().lockHardwareCanvas();
            canvasLockHardwareCanvas.drawColor(0, BlendMode.CLEAR);
            InterfaceC0869m interfaceC0869mA2 = AbstractC0859c.a(canvasLockHardwareCanvas);
            interfaceC0869mA2.l(-oVarC.f(), -oVarC.h());
            uE.W0(interfaceC0869mA2, null);
            return oVarC.k(0, p239x8.a.b(aVar.f9554e.b()));
        }
        return objE;
    }

    @Override // android.view.ScrollCaptureCallback
    public void onScrollCaptureEnd(Runnable runnable) {
        AbstractC0816i.d(this.f9553d, J0.f1819r, null, new b(runnable, null), 2, null);
    }

    @Override // android.view.ScrollCaptureCallback
    public void onScrollCaptureImageRequest(ScrollCaptureSession scrollCaptureSession, CancellationSignal cancellationSignal, Rect rect, Consumer consumer) {
        p001a0.c.c(this.f9553d, cancellationSignal, new c(scrollCaptureSession, rect, consumer, null));
    }

    @Override // android.view.ScrollCaptureCallback
    public void onScrollCaptureSearch(CancellationSignal cancellationSignal, Consumer consumer) {
        consumer.accept(J.b(this.f9551b));
    }

    @Override // android.view.ScrollCaptureCallback
    public void onScrollCaptureStart(ScrollCaptureSession scrollCaptureSession, CancellationSignal cancellationSignal, Runnable runnable) {
        this.f9554e.d();
        this.f9555f = 0;
        this.f9552c.a();
        runnable.run();
    }
}
