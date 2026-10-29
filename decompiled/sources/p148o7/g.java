package p148o7;

import F8.AbstractC0812g;
import F8.AbstractC0816i;
import F8.AbstractC0829o0;
import F8.AbstractC0833q0;
import F8.C0803b0;
import F8.InterfaceC0846x0;
import F8.L;
import F8.T;
import I8.A;
import I8.AbstractC0882h;
import I8.InterfaceC0880f;
import I8.O;
import android.app.WallpaperManager;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.graphics.PointF;
import android.net.Uri;
import androidx.lifecycle.Q;
import androidx.lifecycle.b0;
import com.davemorrissey.labs.subscaleview.ImageSource;
import com.nothing.wallpaper.effects.data.model.ViewScope;
import com.nothing.wallpaper.segmenter.Segmenter;
import java.io.IOException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import kotlin.jvm.internal.AbstractC1457h;
import kotlin.jvm.internal.n;
import p064g3.x;
import p074h3.I;
import p079h8.o;
import p079h8.r;
import p079h8.u;
import p219v8.p;
import p219v8.q;

/* JADX INFO: loaded from: classes2.dex */
public final class g extends p148o7.b {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public static final c f23470C = new c(null);

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private int f23471A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private final k f23472B;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final p158p7.a f23473j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final p237x6.k f23474k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final D6.e f23475l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final Q f23476m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final p167q6.b f23477n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final AbstractC0829o0 f23478o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final com.android.wallpaper.asset.a f23479p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final p148o7.i f23480q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final A f23481r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final A f23482s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final O f23483t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final InterfaceC0880f f23484u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final InterfaceC0880f f23485v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final InterfaceC0880f f23486w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private InterfaceC0846x0 f23487x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private final p079h8.h f23488y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private final p079h8.h f23489z;

    static final class a extends kotlin.coroutines.jvm.internal.l implements p {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        Object f23490q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f23491r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        private /* synthetic */ Object f23492s;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        final /* synthetic */ x f23494u;

        /* JADX INFO: renamed from: o7.g$a$a, reason: collision with other inner class name */
        static final class C0620a extends kotlin.coroutines.jvm.internal.l implements p {

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            int f23495q;

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            final /* synthetic */ g f23496r;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0620a(g gVar, p129m8.e eVar) {
                super(2, eVar);
                this.f23496r = gVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final p129m8.e create(Object obj, p129m8.e eVar) {
                return new C0620a(this.f23496r, eVar);
            }

            @Override // p219v8.p
            public final Object invoke(L l9, p129m8.e eVar) {
                return ((C0620a) create(l9, eVar)).invokeSuspend(p079h8.A.f21846a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                p139n8.b.e();
                if (this.f23495q != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                r.b(obj);
                if (this.f23496r.X() && n.d(this.f23496r.f23473j, p7.a.b.f23770b)) {
                    return this.f23496r.i0();
                }
                return null;
            }
        }

        static final class b extends kotlin.coroutines.jvm.internal.l implements p {

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            int f23497q;

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            final /* synthetic */ g f23498r;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(g gVar, p129m8.e eVar) {
                super(2, eVar);
                this.f23498r = gVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final p129m8.e create(Object obj, p129m8.e eVar) {
                return new b(this.f23498r, eVar);
            }

            @Override // p219v8.p
            public final Object invoke(L l9, p129m8.e eVar) {
                return ((b) create(l9, eVar)).invokeSuspend(p079h8.A.f21846a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                p139n8.b.e();
                if (this.f23497q != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                r.b(obj);
                return G6.a.c(this.f23498r.f23474k.q().c(), false, false, 2, null);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(x xVar, p129m8.e eVar) {
            super(2, eVar);
            this.f23494u = xVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final p129m8.e create(Object obj, p129m8.e eVar) {
            a aVar = g.this.new a(this.f23494u, eVar);
            aVar.f23492s = obj;
            return aVar;
        }

        @Override // p219v8.p
        public final Object invoke(L l9, p129m8.e eVar) {
            return ((a) create(l9, eVar)).invokeSuspend(p079h8.A.f21846a);
        }

        /* JADX WARN: Code duplicated, block: B:22:0x008a  */
        /* JADX WARN: Code duplicated, block: B:23:0x008f  */
        /* JADX WARN: Code duplicated, block: B:25:0x0092  */
        /* JADX WARN: Code duplicated, block: B:26:0x0097  */
        /* JADX WARN: Code duplicated, block: B:29:0x00b8  */
        /* JADX WARN: Code duplicated, block: B:34:0x00d5  */
        /* JADX WARN: Code duplicated, block: B:35:0x00dd  */
        /* JADX WARN: Code duplicated, block: B:37:0x00e9  */
        /* JADX WARN: Code duplicated, block: B:40:0x00f6  */
        /* JADX WARN: Code duplicated, block: B:42:0x00f9  */
        /* JADX WARN: Code duplicated, block: B:44:0x0108  */
        /* JADX WARN: Instruction removed from duplicated block: B:44:0x0108, please report this as an issue */
        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            T tB;
            L l9;
            Bitmap bitmap;
            Bitmap bitmap2;
            Point pointA;
            Point pointA2;
            g gVar;
            g gVar2;
            Object objE = p139n8.b.e();
            int i10 = this.f23491r;
            if (i10 == 0) {
                r.b(obj);
                L l10 = (L) this.f23492s;
                T tB2 = AbstractC0816i.b(l10, C0803b0.b(), null, new b(g.this, null), 2, null);
                tB = AbstractC0816i.b(l10, C0803b0.b(), null, new C0620a(g.this, null), 2, null);
                this.f23492s = l10;
                this.f23490q = tB;
                this.f23491r = 1;
                obj = tB2.P0(this);
                if (obj != objE) {
                    l9 = l10;
                }
                return objE;
            }
            if (i10 == 1) {
                tB = (T) this.f23490q;
                l9 = (L) this.f23492s;
                r.b(obj);
            } else {
                if (i10 == 2) {
                    bitmap = (Bitmap) this.f23490q;
                    r.b(obj);
                    bitmap2 = (Bitmap) obj;
                    if (bitmap != null) {
                        pointA = p097j6.b.a(bitmap);
                    } else {
                        pointA = null;
                    }
                    if (bitmap2 != null) {
                        pointA2 = p097j6.b.a(bitmap2);
                    } else {
                        pointA2 = null;
                    }
                    com.nothing.wallpaper.common.log.c.d("ImageCropViewModel", "load wallpaper complete rawSize:" + pointA + " depth:" + pointA2);
                    if (bitmap != null) {
                        gVar = g.this;
                        gVar.f23475l.N0(bitmap);
                        if (gVar.X() && n.d(gVar.f23473j, p7.a.b.f23770b)) {
                            if (bitmap2 != null) {
                                gVar.f23475l.o(bitmap2);
                            } else {
                                if (gVar.f0().c() instanceof Segmenter.ModuleState.Available) {
                                    this.f23492s = gVar;
                                    this.f23490q = null;
                                    this.f23491r = 3;
                                    if (gVar.s0(bitmap, this) != objE) {
                                        gVar2 = gVar;
                                    }
                                    return objE;
                                }
                                gVar.f0().b(gVar.f23472B);
                            }
                        }
                        gVar.r0();
                    } else {
                        g gVar3 = g.this;
                        x xVar = this.f23494u;
                        gVar3.f23477n.e("original Bitmap load failed " + xVar + ".");
                        gVar3.i().l(p128m7.a.C0594a.f23242a);
                    }
                    return p079h8.A.f21846a;
                }
                if (i10 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                gVar2 = (g) this.f23492s;
                r.b(obj);
            }
            gVar = gVar2;
            gVar.r0();
            return p079h8.A.f21846a;
            Bitmap bitmap3 = (Bitmap) obj;
            this.f23492s = l9;
            this.f23490q = bitmap3;
            this.f23491r = 2;
            Object objP0 = tB.P0(this);
            if (objP0 != objE) {
                bitmap = bitmap3;
                obj = objP0;
                bitmap2 = (Bitmap) obj;
                if (bitmap != null) {
                    pointA = p097j6.b.a(bitmap);
                } else {
                    pointA = null;
                }
                if (bitmap2 != null) {
                    pointA2 = p097j6.b.a(bitmap2);
                } else {
                    pointA2 = null;
                }
                com.nothing.wallpaper.common.log.c.d("ImageCropViewModel", "load wallpaper complete rawSize:" + pointA + " depth:" + pointA2);
                if (bitmap != null) {
                    gVar = g.this;
                    gVar.f23475l.N0(bitmap);
                    if (gVar.X()) {
                        if (bitmap2 != null) {
                            gVar.f23475l.o(bitmap2);
                        } else if (gVar.f0().c() instanceof Segmenter.ModuleState.Available) {
                            this.f23492s = gVar;
                            this.f23490q = null;
                            this.f23491r = 3;
                            if (gVar.s0(bitmap, this) != objE) {
                                gVar2 = gVar;
                                gVar = gVar2;
                            }
                        } else {
                            gVar.f0().b(gVar.f23472B);
                        }
                    }
                    gVar.r0();
                } else {
                    g gVar4 = g.this;
                    x xVar2 = this.f23494u;
                    gVar4.f23477n.e("original Bitmap load failed " + xVar2 + ".");
                    gVar4.i().l(p128m7.a.C0594a.f23242a);
                }
                return p079h8.A.f21846a;
            }
            return objE;
        }
    }

    static final class b extends kotlin.coroutines.jvm.internal.l implements p {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f23499q;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        final /* synthetic */ ViewScope f23501s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(ViewScope viewScope, p129m8.e eVar) {
            super(2, eVar);
            this.f23501s = viewScope;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final p129m8.e create(Object obj, p129m8.e eVar) {
            return g.this.new b(this.f23501s, eVar);
        }

        @Override // p219v8.p
        public final Object invoke(L l9, p129m8.e eVar) {
            return ((b) create(l9, eVar)).invokeSuspend(p079h8.A.f21846a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            p139n8.b.e();
            if (this.f23499q != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            r.b(obj);
            g.this.f23475l.y0(this.f23501s);
            return p079h8.A.f21846a;
        }
    }

    public static final class c {
        public /* synthetic */ c(AbstractC1457h abstractC1457h) {
            this();
        }

        private c() {
        }
    }

    static final class d extends kotlin.coroutines.jvm.internal.l implements q {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f23502q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        /* synthetic */ Object f23503r;

        d(p129m8.e eVar) {
            super(3, eVar);
        }

        @Override // p219v8.q
        public /* bridge */ /* synthetic */ Object e(Object obj, Object obj2, Object obj3) {
            return s((Bitmap) obj, ((Boolean) obj2).booleanValue(), (p129m8.e) obj3);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            p139n8.b.e();
            if (this.f23502q != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            r.b(obj);
            Bitmap bitmap = (Bitmap) this.f23503r;
            Point point = new Point(bitmap.getWidth(), bitmap.getHeight());
            ImageSource imageSourceCachedBitmap = ImageSource.cachedBitmap(bitmap);
            n.g(imageSourceCachedBitmap, "cachedBitmap(...)");
            if (g.this.h0(bitmap)) {
                imageSourceCachedBitmap.setLargeBmp(true);
            }
            return new o(imageSourceCachedBitmap, point);
        }

        public final Object s(Bitmap bitmap, boolean z9, p129m8.e eVar) {
            d dVar = g.this.new d(eVar);
            dVar.f23503r = bitmap;
            return dVar.invokeSuspend(p079h8.A.f21846a);
        }
    }

    static final class e extends kotlin.coroutines.jvm.internal.l implements q {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f23505q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        /* synthetic */ Object f23506r;

        e(p129m8.e eVar) {
            super(3, eVar);
        }

        @Override // p219v8.q
        public /* bridge */ /* synthetic */ Object e(Object obj, Object obj2, Object obj3) {
            return s((Bitmap) obj, ((Boolean) obj2).booleanValue(), (p129m8.e) obj3);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            p139n8.b.e();
            if (this.f23505q != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            r.b(obj);
            Bitmap bitmap = (Bitmap) this.f23506r;
            return new u(g.this.T(bitmap), bitmap, new Point(bitmap.getWidth(), bitmap.getHeight()));
        }

        public final Object s(Bitmap bitmap, boolean z9, p129m8.e eVar) {
            e eVar2 = g.this.new e(eVar);
            eVar2.f23506r = bitmap;
            return eVar2.invokeSuspend(p079h8.A.f21846a);
        }
    }

    static final class f extends kotlin.coroutines.jvm.internal.l implements p {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f23508q;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        final /* synthetic */ PointF f23510s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ Float f23511t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        final /* synthetic */ String f23512u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(PointF pointF, Float f10, String str, p129m8.e eVar) {
            super(2, eVar);
            this.f23510s = pointF;
            this.f23511t = f10;
            this.f23512u = str;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final p129m8.e create(Object obj, p129m8.e eVar) {
            return g.this.new f(this.f23510s, this.f23511t, this.f23512u, eVar);
        }

        @Override // p219v8.p
        public final Object invoke(L l9, p129m8.e eVar) {
            return ((f) create(l9, eVar)).invokeSuspend(p079h8.A.f21846a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            p139n8.b.e();
            if (this.f23508q != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            r.b(obj);
            g.this.f23480q.j(this.f23510s, this.f23511t, this.f23512u);
            return p079h8.A.f21846a;
        }
    }

    /* JADX INFO: renamed from: o7.g$g, reason: collision with other inner class name */
    static final class C0621g extends kotlin.coroutines.jvm.internal.l implements p {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f23513q;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        final /* synthetic */ Float f23515s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ PointF f23516t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0621g(Float f10, PointF pointF, p129m8.e eVar) {
            super(2, eVar);
            this.f23515s = f10;
            this.f23516t = pointF;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final p129m8.e create(Object obj, p129m8.e eVar) {
            return g.this.new C0621g(this.f23515s, this.f23516t, eVar);
        }

        @Override // p219v8.p
        public final Object invoke(L l9, p129m8.e eVar) {
            return ((C0621g) create(l9, eVar)).invokeSuspend(p079h8.A.f21846a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            p139n8.b.e();
            if (this.f23513q != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            r.b(obj);
            g.this.f23480q.c(this.f23515s, this.f23516t);
            return p079h8.A.f21846a;
        }
    }

    static final class h extends kotlin.coroutines.jvm.internal.l implements p {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f23517q;

        h(p129m8.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final p129m8.e create(Object obj, p129m8.e eVar) {
            return g.this.new h(eVar);
        }

        @Override // p219v8.p
        public final Object invoke(L l9, p129m8.e eVar) {
            return ((h) create(l9, eVar)).invokeSuspend(p079h8.A.f21846a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objE = p139n8.b.e();
            int i10 = this.f23517q;
            if (i10 == 0) {
                r.b(obj);
                A a10 = g.this.f23481r;
                Boolean boolA = kotlin.coroutines.jvm.internal.b.a(true);
                this.f23517q = 1;
                if (a10.b(boolA, this) == objE) {
                    return objE;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                r.b(obj);
            }
            return p079h8.A.f21846a;
        }
    }

    static final class i extends kotlin.coroutines.jvm.internal.l implements p {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f23519q;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        final /* synthetic */ Bitmap f23521s;

        public static final class a implements Segmenter.a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ g f23522a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ Bitmap f23523b;

            /* JADX INFO: renamed from: o7.g$i$a$a, reason: collision with other inner class name */
            static final class C0622a extends kotlin.coroutines.jvm.internal.l implements p {

                /* JADX INFO: renamed from: q, reason: collision with root package name */
                int f23524q;

                /* JADX INFO: renamed from: r, reason: collision with root package name */
                final /* synthetic */ g f23525r;

                /* JADX INFO: renamed from: s, reason: collision with root package name */
                final /* synthetic */ Bitmap f23526s;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0622a(g gVar, Bitmap bitmap, p129m8.e eVar) {
                    super(2, eVar);
                    this.f23525r = gVar;
                    this.f23526s = bitmap;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final p129m8.e create(Object obj, p129m8.e eVar) {
                    return new C0622a(this.f23525r, this.f23526s, eVar);
                }

                @Override // p219v8.p
                public final Object invoke(L l9, p129m8.e eVar) {
                    return ((C0622a) create(l9, eVar)).invokeSuspend(p079h8.A.f21846a);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    Object objE = p139n8.b.e();
                    int i10 = this.f23524q;
                    if (i10 == 0) {
                        r.b(obj);
                        g gVar = this.f23525r;
                        Bitmap bitmap = this.f23526s;
                        this.f23524q = 1;
                        if (gVar.s0(bitmap, this) == objE) {
                            return objE;
                        }
                    } else {
                        if (i10 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        r.b(obj);
                    }
                    return p079h8.A.f21846a;
                }
            }

            static final class b extends kotlin.coroutines.jvm.internal.l implements p {

                /* JADX INFO: renamed from: q, reason: collision with root package name */
                int f23527q;

                /* JADX INFO: renamed from: r, reason: collision with root package name */
                final /* synthetic */ g f23528r;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                b(g gVar, p129m8.e eVar) {
                    super(2, eVar);
                    this.f23528r = gVar;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final p129m8.e create(Object obj, p129m8.e eVar) {
                    return new b(this.f23528r, eVar);
                }

                @Override // p219v8.p
                public final Object invoke(L l9, p129m8.e eVar) {
                    return ((b) create(l9, eVar)).invokeSuspend(p079h8.A.f21846a);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    p139n8.b.e();
                    if (this.f23527q != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    r.b(obj);
                    this.f23528r.k0(true);
                    return p079h8.A.f21846a;
                }
            }

            a(g gVar, Bitmap bitmap) {
                this.f23522a = gVar;
                this.f23523b = bitmap;
            }

            @Override // com.nothing.wallpaper.segmenter.Segmenter.a
            public void a(Segmenter.FailReason reason) {
                n.h(reason, "reason");
                com.nothing.wallpaper.common.log.c.f("ImageCropViewModel", "segment wallpaper failed, reason:" + reason + " count:" + this.f23522a.f23471A);
                if ((reason instanceof Segmenter.FailReason.SubjectTransparent) || this.f23522a.f23471A >= 3) {
                    this.f23522a.f23482s.setValue(Boolean.FALSE);
                    return;
                }
                this.f23522a.f23471A++;
                AbstractC0816i.d(b0.a(this.f23522a), C0803b0.b(), null, new C0622a(this.f23522a, this.f23523b, null), 2, null);
            }

            @Override // com.nothing.wallpaper.segmenter.Segmenter.a
            public void b(Bitmap bitmap) {
                n.h(bitmap, "bitmap");
                this.f23522a.f23475l.o(bitmap);
                this.f23522a.f23474k.A(bitmap);
                AbstractC0816i.d(b0.a(this.f23522a), null, null, new b(this.f23522a, null), 3, null);
                this.f23522a.f23482s.setValue(Boolean.TRUE);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(Bitmap bitmap, p129m8.e eVar) {
            super(2, eVar);
            this.f23521s = bitmap;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final p129m8.e create(Object obj, p129m8.e eVar) {
            return g.this.new i(this.f23521s, eVar);
        }

        @Override // p219v8.p
        public final Object invoke(L l9, p129m8.e eVar) {
            return ((i) create(l9, eVar)).invokeSuspend(p079h8.A.f21846a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            p139n8.b.e();
            if (this.f23519q != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            r.b(obj);
            Segmenter segmenterF0 = g.this.f0();
            Bitmap bitmap = this.f23521s;
            return kotlin.coroutines.jvm.internal.b.a(segmenterF0.d(bitmap, new a(g.this, bitmap)));
        }
    }

    static final class j extends kotlin.coroutines.jvm.internal.l implements p {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f23529q;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        final /* synthetic */ Point f23531s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(Point point, p129m8.e eVar) {
            super(2, eVar);
            this.f23531s = point;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final p129m8.e create(Object obj, p129m8.e eVar) {
            return g.this.new j(this.f23531s, eVar);
        }

        @Override // p219v8.p
        public final Object invoke(L l9, p129m8.e eVar) {
            return ((j) create(l9, eVar)).invokeSuspend(p079h8.A.f21846a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Point pointA;
            Object objE = p139n8.b.e();
            int i10 = this.f23529q;
            if (i10 == 0) {
                r.b(obj);
                InterfaceC0880f interfaceC0880fF0 = g.this.f23475l.F0();
                this.f23529q = 1;
                obj = AbstractC0882h.z(interfaceC0880fF0, this);
                if (obj == objE) {
                    return objE;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                r.b(obj);
            }
            Bitmap bitmap = (Bitmap) obj;
            if (bitmap == null || (pointA = p097j6.b.a(bitmap)) == null) {
                return p079h8.A.f21846a;
            }
            g.this.f23480q.p(this.f23531s, pointA);
            return p079h8.A.f21846a;
        }
    }

    public static final class k implements Segmenter.b {

        static final class a extends kotlin.coroutines.jvm.internal.l implements p {

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            int f23533q;

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            final /* synthetic */ Segmenter.ModuleState f23534r;

            /* JADX INFO: renamed from: s, reason: collision with root package name */
            final /* synthetic */ g f23535s;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(Segmenter.ModuleState moduleState, g gVar, p129m8.e eVar) {
                super(2, eVar);
                this.f23534r = moduleState;
                this.f23535s = gVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final p129m8.e create(Object obj, p129m8.e eVar) {
                return new a(this.f23534r, this.f23535s, eVar);
            }

            @Override // p219v8.p
            public final Object invoke(L l9, p129m8.e eVar) {
                return ((a) create(l9, eVar)).invokeSuspend(p079h8.A.f21846a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Bitmap bitmapC;
                Object objE = p139n8.b.e();
                int i10 = this.f23533q;
                if (i10 == 0) {
                    r.b(obj);
                    if (n.d(this.f23534r, Segmenter.ModuleState.Available.INSTANCE) && (bitmapC = G6.a.c(this.f23535s.f23474k.q().c(), false, false, 2, null)) != null) {
                        g gVar = this.f23535s;
                        this.f23533q = 1;
                        if (gVar.s0(bitmapC, this) == objE) {
                            return objE;
                        }
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    r.b(obj);
                }
                return p079h8.A.f21846a;
            }
        }

        k() {
        }

        @Override // com.nothing.wallpaper.segmenter.Segmenter.b
        public void a(Segmenter.ModuleState state) {
            n.h(state, "state");
            com.nothing.wallpaper.common.log.c.d("ImageCropViewModel", "segmenter state change:" + state);
            AbstractC0816i.d(b0.a(g.this), C0803b0.b(), null, new a(state, g.this, null), 2, null);
        }
    }

    static final class l extends kotlin.coroutines.jvm.internal.l implements p {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f23536q;

        l(p129m8.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final p129m8.e create(Object obj, p129m8.e eVar) {
            return g.this.new l(eVar);
        }

        @Override // p219v8.p
        public final Object invoke(L l9, p129m8.e eVar) {
            return ((l) create(l9, eVar)).invokeSuspend(p079h8.A.f21846a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objE = p139n8.b.e();
            int i10 = this.f23536q;
            if (i10 == 0) {
                r.b(obj);
                InterfaceC0880f interfaceC0880fA0 = g.this.a0();
                this.f23536q = 1;
                if (AbstractC0882h.x(interfaceC0880fA0, this) == objE) {
                    return objE;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                r.b(obj);
            }
            g.this.f23477n.a("previewEnable now.");
            if (n.d(g.this.i().e(), p128m7.a.C0594a.f23242a)) {
                return p079h8.A.f21846a;
            }
            g.this.i().l(m7.a.c.f23244a);
            return p079h8.A.f21846a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(Context appContext, final x wallpaper, p158p7.a editFrom, p237x6.k assetManager, D6.e bitmapDataSource, Q savedStateHandle) {
        super(appContext, wallpaper);
        n.h(appContext, "appContext");
        n.h(wallpaper, "wallpaper");
        n.h(editFrom, "editFrom");
        n.h(assetManager, "assetManager");
        n.h(bitmapDataSource, "bitmapDataSource");
        n.h(savedStateHandle, "savedStateHandle");
        this.f23473j = editFrom;
        this.f23474k = assetManager;
        this.f23475l = bitmapDataSource;
        this.f23476m = savedStateHandle;
        p167q6.b bVar = new p167q6.b("ImageCropViewModel");
        this.f23477n = bVar;
        ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor();
        n.g(executorServiceNewSingleThreadExecutor, "newSingleThreadExecutor(...)");
        this.f23478o = AbstractC0833q0.a(executorServiceNewSingleThreadExecutor);
        this.f23479p = G6.e.e(wallpaper, appContext);
        p148o7.i iVar = new p148o7.i(wallpaper.k(), savedStateHandle);
        this.f23480q = iVar;
        A a10 = I8.Q.a(Boolean.FALSE);
        this.f23481r = a10;
        A a11 = I8.Q.a(null);
        this.f23482s = a11;
        this.f23483t = AbstractC0882h.b(a11);
        this.f23484u = AbstractC0882h.B(bitmapDataSource.F0(), a10, new e(null));
        this.f23485v = AbstractC0882h.B(bitmapDataSource.M(), a10, new d(null));
        this.f23486w = bitmapDataSource.S();
        this.f23488y = p079h8.i.b(new p219v8.a() { // from class: o7.c
            @Override // p219v8.a
            public final Object invoke() {
                return Boolean.valueOf(g.U(wallpaper));
            }
        });
        this.f23489z = p079h8.i.b(new p219v8.a() { // from class: o7.d
            @Override // p219v8.a
            public final Object invoke() {
                return g.q0();
            }
        });
        this.f23472B = new k();
        C6.g gVarK = wallpaper.k();
        com.nothing.wallpaper.common.log.c.d("ImageCropViewModel", "restore from effectInfo " + (gVarK != null ? gVarK.c() : null));
        assetManager.B(new p219v8.a() { // from class: o7.e
            @Override // p219v8.a
            public final Object invoke() {
                return g.A(this.f23468q);
            }
        });
        AbstractC0816i.d(b0.a(this), C0803b0.b(), null, new a(wallpaper, null), 2, null);
        iVar.n(new p219v8.l() { // from class: o7.f
            @Override // p219v8.l
            public final Object f(Object obj) {
                return g.B(this.f23469q, (ViewScope) obj);
            }
        });
        if (g0() == null || d0() == null) {
            return;
        }
        bVar.a("restore viewSize and previewScale from savedInstance.");
        Point pointG0 = g0();
        n.e(pointG0);
        Float fD0 = d0();
        n.e(fD0);
        o0(pointG0, fD0.floatValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p079h8.A A(g gVar) {
        gVar.i().l(p128m7.a.C0594a.f23242a);
        return p079h8.A.f21846a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p079h8.A B(g gVar, ViewScope it) {
        n.h(it, "it");
        AbstractC0816i.d(b0.a(gVar), C0803b0.b(), null, gVar.new b(it, null), 2, null);
        return p079h8.A.f21846a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ImageSource T(Bitmap bitmap) {
        if (!h0(bitmap)) {
            ImageSource imageSourceCachedBitmap = ImageSource.cachedBitmap(bitmap);
            n.g(imageSourceCachedBitmap, "cachedBitmap(...)");
            return imageSourceCachedBitmap;
        }
        com.android.wallpaper.asset.a aVar = this.f23479p;
        if (!(aVar instanceof p237x6.c) && !(aVar instanceof com.android.wallpaper.asset.h)) {
            if (aVar instanceof com.android.wallpaper.asset.g) {
                ImageSource imageSourceUri = ImageSource.uri(((com.android.wallpaper.asset.g) aVar).U());
                n.g(imageSourceUri, "uri(...)");
                imageSourceUri.setLargeBmp(true);
                return imageSourceUri;
            }
            ImageSource imageSourceCachedBitmap2 = ImageSource.cachedBitmap(bitmap);
            n.g(imageSourceCachedBitmap2, "cachedBitmap(...)");
            imageSourceCachedBitmap2.setLargeBmp(true);
            return imageSourceCachedBitmap2;
        }
        p227w6.b bVarZ = Z();
        w6.b.a aVar2 = bVarZ instanceof w6.b.a ? (w6.b.a) bVarZ : null;
        com.android.wallpaper.asset.a aVarA = aVar2 != null ? aVar2.a() : null;
        p237x6.g gVar = aVarA instanceof p237x6.g ? (p237x6.g) aVarA : null;
        Uri uriS = gVar != null ? gVar.S() : null;
        if (uriS == null) {
            ImageSource imageSourceCachedBitmap3 = ImageSource.cachedBitmap(bitmap);
            n.e(imageSourceCachedBitmap3);
            return imageSourceCachedBitmap3;
        }
        ImageSource imageSourceUri2 = ImageSource.uri(uriS);
        n.g(imageSourceUri2, "uri(...)");
        imageSourceUri2.setLargeBmp(true);
        return imageSourceUri2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean U(x xVar) {
        return !xVar.s() && I.a().C().p();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean X() {
        return ((Boolean) this.f23488y.getValue()).booleanValue();
    }

    private final Float d0() {
        return (Float) this.f23476m.d("key_preview_scale");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Segmenter f0() {
        return (Segmenter) this.f23489z.getValue();
    }

    private final Point g0() {
        return (Point) this.f23476m.d("key_view_size");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean h0(Bitmap bitmap) {
        return (bitmap.getWidth() * bitmap.getHeight()) * (bitmap.getConfig() == Bitmap.Config.RGB_565 ? 2 : 4) > 62914560;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Bitmap i0() {
        p227w6.b bVarC;
        p227w6.d dVarM = this.f23474k.m();
        Bitmap bitmapC = null;
        if (dVarM != null && (bVarC = dVarM.c()) != null) {
            bitmapC = G6.a.c(bVarC, false, false, 2, null);
        }
        if (bitmapC != null || j().k() != null || !p098j7.j.f22340T.b(f())) {
            return bitmapC;
        }
        Object systemService = f().getSystemService("wallpaper");
        n.f(systemService, "null cannot be cast to non-null type android.app.WallpaperManager");
        Bitmap bitmapA = p137n6.e.a((WallpaperManager) systemService, f().getUserId(), false);
        if (bitmapA != null) {
            this.f23474k.A(bitmapA);
        }
        com.nothing.wallpaper.common.log.c.d("ImageCropViewModel", "loadDepthBitmap from system success:" + (bitmapA != null));
        return bitmapA;
    }

    public static /* synthetic */ void l0(g gVar, boolean z9, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z9 = false;
        }
        gVar.k0(z9);
    }

    private final void o0(Point point, float f10) {
        r0();
        this.f23475l.m(point, f10);
        AbstractC0816i.d(b0.a(this), null, null, new h(null), 3, null);
        t0();
    }

    private final Object p0(Bitmap bitmap, p129m8.e eVar) {
        return AbstractC0812g.g(this.f23478o, new i(bitmap, null), eVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Segmenter q0() {
        return P7.b.c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void r0() {
        Point pointG0 = g0();
        if (pointG0 == null) {
            return;
        }
        AbstractC0816i.d(b0.a(this), null, null, new j(pointG0, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object s0(Bitmap bitmap, p129m8.e eVar) {
        com.nothing.wallpaper.common.log.c.d("ImageCropViewModel", "segment wallpaper, support:" + j().t() + " applied:" + j().s());
        if (!j().t() || j().s()) {
            return p079h8.A.f21846a;
        }
        Object objP0 = p0(bitmap, eVar);
        return objP0 == p139n8.b.e() ? objP0 : p079h8.A.f21846a;
    }

    private final void t0() {
        if (g0() == null || d0() == null || n.d(i().e(), p128m7.a.C0594a.f23242a)) {
            return;
        }
        InterfaceC0846x0 interfaceC0846x0 = this.f23487x;
        if (interfaceC0846x0 != null) {
            InterfaceC0846x0.a.a(interfaceC0846x0, null, 1, null);
        }
        this.f23487x = AbstractC0816i.d(b0.a(this), C0803b0.b(), null, new l(null), 2, null);
    }

    public final com.android.wallpaper.asset.a V() {
        return this.f23479p;
    }

    public final ViewScope W() {
        return this.f23480q.h();
    }

    public final InterfaceC0880f Y() {
        return this.f23485v;
    }

    public final p227w6.b Z() {
        return this.f23474k.q().c();
    }

    public final InterfaceC0880f a0() {
        return this.f23484u;
    }

    public final ViewScope b0() {
        return this.f23480q.f();
    }

    public int c0() {
        return this.f23475l.v0();
    }

    @Override // androidx.lifecycle.a0
    protected void d() throws IOException {
        super.d();
        this.f23478o.close();
        if (X()) {
            f0().e(this.f23472B);
        }
        this.f23475l.close();
    }

    public final O e0() {
        return this.f23483t;
    }

    public final void j0(PointF pointF, Float f10, String str) {
        AbstractC0816i.d(b0.a(this), C0803b0.b(), null, new f(pointF, f10, str, null), 2, null);
    }

    @Override // p148o7.b
    public InterfaceC0880f k() {
        return this.f23486w;
    }

    public final void k0(boolean z9) {
        this.f23480q.k(z9);
    }

    public final void m0(Float f10, PointF pointF) {
        AbstractC0816i.d(b0.a(this), C0803b0.b(), null, new C0621g(f10, pointF, null), 2, null);
    }

    public final void n0(Point size, float f10) {
        n.h(size, "size");
        this.f23476m.i("key_view_size", size);
        this.f23476m.i("key_preview_scale", Float.valueOf(f10));
        o0(size, f10);
    }

    @Override // p148o7.b
    public void v() {
        com.nothing.wallpaper.common.log.c.d("ImageCropViewModel", "update original scope:" + W());
        this.f23480q.q(W());
    }
}
