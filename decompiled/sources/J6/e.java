package J6;

import F8.AbstractC0812g;
import F8.AbstractC0814h;
import F8.AbstractC0816i;
import F8.AbstractC0845x;
import F8.C0803b0;
import F8.InterfaceC0841v;
import F8.InterfaceC0846x0;
import F8.L;
import F8.M;
import android.graphics.Bitmap;
import java.io.ByteArrayOutputStream;
import kotlin.jvm.internal.AbstractC1457h;
import kotlin.jvm.internal.n;
import p064g3.x;
import p074h3.C1383x;
import p079h8.A;
import p079h8.r;
import p079h8.u;
import p219v8.p;

/* JADX INFO: loaded from: classes2.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final L f3558a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f3559b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final p167q6.b f3560c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Integer f3561d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private volatile InterfaceC0841v f3562e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private volatile InterfaceC0846x0 f3563f;

    public static abstract class a {

        /* JADX INFO: renamed from: J6.e$a$a, reason: collision with other inner class name */
        public static final class C0123a extends a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final Throwable f3564a;

            public C0123a(Throwable th) {
                super(null);
                this.f3564a = th;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C0123a) && n.d(this.f3564a, ((C0123a) obj).f3564a);
            }

            public int hashCode() {
                Throwable th = this.f3564a;
                if (th == null) {
                    return 0;
                }
                return th.hashCode();
            }

            public String toString() {
                return "FailedWithCompressDone(exception=" + this.f3564a + ")";
            }
        }

        public static final class b extends a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final Throwable f3565a;

            public b(Throwable th) {
                super(null);
                this.f3565a = th;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof b) && n.d(this.f3565a, ((b) obj).f3565a);
            }

            public int hashCode() {
                Throwable th = this.f3565a;
                if (th == null) {
                    return 0;
                }
                return th.hashCode();
            }

            public String toString() {
                return "FailedWithCompressInterrupt(exception=" + this.f3565a + ")";
            }
        }

        public static final class c extends a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final c f3566a = new c();

            private c() {
                super(null);
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof c);
            }

            public int hashCode() {
                return -80158969;
            }

            public String toString() {
                return "NoCompressionTask";
            }
        }

        public static final class d extends a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final ByteArrayOutputStream f3567a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public d(ByteArrayOutputStream outputStream) {
                super(null);
                n.h(outputStream, "outputStream");
                this.f3567a = outputStream;
            }

            public final ByteArrayOutputStream a() {
                return this.f3567a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof d) && n.d(this.f3567a, ((d) obj).f3567a);
            }

            public int hashCode() {
                return this.f3567a.hashCode();
            }

            public String toString() {
                return "Success(outputStream=" + this.f3567a + ")";
            }
        }

        public /* synthetic */ a(AbstractC1457h abstractC1457h) {
            this();
        }

        private a() {
        }
    }

    static final class b extends kotlin.coroutines.jvm.internal.l implements p {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f3568q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private /* synthetic */ Object f3569r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ C6.i f3571t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        final /* synthetic */ InterfaceC0841v f3572u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(C6.i iVar, InterfaceC0841v interfaceC0841v, p129m8.e eVar) {
            super(2, eVar);
            this.f3571t = iVar;
            this.f3572u = interfaceC0841v;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final p129m8.e create(Object obj, p129m8.e eVar) {
            b bVar = e.this.new b(this.f3571t, this.f3572u, eVar);
            bVar.f3569r = obj;
            return bVar;
        }

        @Override // p219v8.p
        public final Object invoke(L l9, p129m8.e eVar) {
            return ((b) create(l9, eVar)).invokeSuspend(A.f21846a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Exception exc;
            Object objE = p139n8.b.e();
            int i10 = this.f3568q;
            if (i10 == 0) {
                r.b(obj);
                if (M.g((L) this.f3569r)) {
                    e.this.f3560c.f("assignCroppedBitmap: compression start");
                    try {
                        Bitmap bitmapA = this.f3571t.a();
                        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                        if (C1383x.m(bitmapA, byteArrayOutputStream)) {
                            e.this.f3560c.f("assignCroppedBitmap: compression done successfully");
                            this.f3572u.B0(byteArrayOutputStream);
                        } else {
                            e.this.f3560c.f("assignCroppedBitmap: compression done with no output");
                            this.f3572u.B0(null);
                        }
                    } catch (Exception e10) {
                        e eVar = e.this;
                        this.f3569r = e10;
                        this.f3568q = 1;
                        if (eVar.h(null, this) == objE) {
                            return objE;
                        }
                        exc = e10;
                        this.f3572u.A0(exc);
                        e.this.f3560c.e("assignCroppedBitmap: compression was interrupted, error is " + exc.getMessage());
                    }
                    e.this.f3560c.f("assignCroppedBitmap: compression end");
                }
                return A.f21846a;
            }
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            exc = (Exception) this.f3569r;
            r.b(obj);
            this.f3572u.A0(exc);
            e.this.f3560c.e("assignCroppedBitmap: compression was interrupted, error is " + exc.getMessage());
            e.this.f3560c.f("assignCroppedBitmap: compression end");
            return A.f21846a;
        }
    }

    static final class c extends kotlin.coroutines.jvm.internal.l implements p {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f3573q;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        final /* synthetic */ InterfaceC0841v f3575s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(InterfaceC0841v interfaceC0841v, p129m8.e eVar) {
            super(2, eVar);
            this.f3575s = interfaceC0841v;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final p129m8.e create(Object obj, p129m8.e eVar) {
            return e.this.new c(this.f3575s, eVar);
        }

        @Override // p219v8.p
        public final Object invoke(L l9, p129m8.e eVar) {
            return ((c) create(l9, eVar)).invokeSuspend(A.f21846a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objE = p139n8.b.e();
            int i10 = this.f3573q;
            if (i10 == 0) {
                r.b(obj);
                e.this.f3560c.a("getOutputBlocking: " + this.f3575s + " start");
                InterfaceC0841v interfaceC0841v = this.f3575s;
                this.f3573q = 1;
                obj = interfaceC0841v.P0(this);
                if (obj == objE) {
                    return objE;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                r.b(obj);
            }
            ByteArrayOutputStream byteArrayOutputStream = (ByteArrayOutputStream) obj;
            Object dVar = byteArrayOutputStream != null ? new a.d(byteArrayOutputStream) : new a.C0123a(null);
            e eVar = e.this;
            InterfaceC0841v interfaceC0841v2 = this.f3575s;
            eVar.f3560c.a("getOutputBlocking: " + interfaceC0841v2 + " end");
            return dVar;
        }
    }

    static final class d extends kotlin.coroutines.jvm.internal.l implements p {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f3576q;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        final /* synthetic */ Integer f3578s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(Integer num, p129m8.e eVar) {
            super(2, eVar);
            this.f3578s = num;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final p129m8.e create(Object obj, p129m8.e eVar) {
            return e.this.new d(this.f3578s, eVar);
        }

        @Override // p219v8.p
        public final Object invoke(L l9, p129m8.e eVar) {
            return ((d) create(l9, eVar)).invokeSuspend(A.f21846a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            p139n8.b.e();
            if (this.f3576q != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            r.b(obj);
            e.this.f3561d = this.f3578s;
            return A.f21846a;
        }
    }

    /* JADX INFO: renamed from: J6.e$e, reason: collision with other inner class name */
    static final class C0124e extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        Object f3579q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        /* synthetic */ Object f3580r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        int f3582t;

        C0124e(p129m8.e eVar) {
            super(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f3580r = obj;
            this.f3582t |= Integer.MIN_VALUE;
            return e.this.i(false, false, null, null, null, this);
        }
    }

    public e(L vmScope) {
        n.h(vmScope, "vmScope");
        this.f3558a = vmScope;
        this.f3559b = "EditedStaticWallpaperCache";
        this.f3560c = new p167q6.b("EditedStaticWallpaperCache");
    }

    private final void d(C6.i iVar) {
        int iHashCode = iVar.hashCode();
        Integer num = this.f3561d;
        if (num == null || num.intValue() != iHashCode || this.f3562e == null) {
            e();
            this.f3561d = Integer.valueOf(iHashCode);
            InterfaceC0841v interfaceC0841vB = AbstractC0845x.b(null, 1, null);
            this.f3562e = interfaceC0841vB;
            this.f3563f = AbstractC0816i.d(this.f3558a, C0803b0.b(), null, new b(iVar, interfaceC0841vB, null), 2, null);
            return;
        }
        this.f3560c.f("assignCroppedBitmap: hit cache " + iHashCode + ", please reuse later");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object h(Integer num, p129m8.e eVar) {
        Object objG = AbstractC0812g.g(C0803b0.c(), new d(num, null), eVar);
        return objG == p139n8.b.e() ? objG : A.f21846a;
    }

    public final void e() {
        InterfaceC0846x0 interfaceC0846x0 = this.f3563f;
        if (interfaceC0846x0 != null) {
            InterfaceC0846x0.a.a(interfaceC0846x0, null, 1, null);
        }
        this.f3563f = null;
        InterfaceC0841v interfaceC0841v = this.f3562e;
        if (interfaceC0841v != null) {
            InterfaceC0846x0.a.a(interfaceC0841v, null, 1, null);
        }
        this.f3562e = null;
        this.f3561d = null;
    }

    public final a f() {
        InterfaceC0841v interfaceC0841v = this.f3562e;
        if (interfaceC0841v == null) {
            return a.c.f3566a;
        }
        try {
            return (a) AbstractC0814h.b(null, new c(interfaceC0841v, null), 1, null);
        } catch (Throwable th) {
            this.f3560c.e("getOutputBlocking: stopped, error is " + th.getMessage());
            return new a.b(th);
        }
    }

    public final boolean g() {
        return (this.f3561d == null || this.f3562e == null) ? false : true;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object i(boolean z9, boolean z10, x xVar, D6.f fVar, p pVar, p129m8.e eVar) {
        C0124e c0124e;
        if (eVar instanceof C0124e) {
            c0124e = (C0124e) eVar;
            int i10 = c0124e.f3582t;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c0124e.f3582t = i10 - Integer.MIN_VALUE;
            } else {
                c0124e = new C0124e(eVar);
            }
        } else {
            c0124e = new C0124e(eVar);
        }
        Object objInvoke = c0124e.f3580r;
        Object objE = p139n8.b.e();
        int i11 = c0124e.f3582t;
        boolean z11 = false;
        if (i11 == 0) {
            r.b(objInvoke);
            if (z10) {
                return kotlin.coroutines.jvm.internal.b.a(false);
            }
            if (G6.e.s(xVar) && (fVar instanceof D6.e)) {
                Object obj = z9 ? C6.e.b.f642c : null;
                c0124e.f3579q = this;
                c0124e.f3582t = 1;
                objInvoke = pVar.invoke(obj, c0124e);
                if (objInvoke == objE) {
                    return objE;
                }
            }
            return kotlin.coroutines.jvm.internal.b.a(z11);
        }
        if (i11 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        this = (e) c0124e.f3579q;
        r.b(objInvoke);
        u uVar = (u) objInvoke;
        if (uVar == null) {
            this.f3560c.e("start cache but buildEffectInfo return null.");
        } else {
            C6.i iVar = (C6.i) uVar.b();
            this.d(iVar);
            z11 = true;
        }
        return kotlin.coroutines.jvm.internal.b.a(z11);
    }
}
