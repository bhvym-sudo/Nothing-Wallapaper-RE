package p234x3;

import H3.q;
import I8.InterfaceC0880f;
import I8.InterfaceC0881g;
import android.app.WallpaperColors;
import android.os.Bundle;
import com.nothing.wallpaper.R;
import kotlin.jvm.internal.AbstractC1457h;
import kotlin.jvm.internal.n;
import p074h3.InterfaceC1364d;
import p079h8.A;
import p079h8.m;
import p129m8.e;
import p219v8.l;
import p219v8.p;

/* JADX INFO: loaded from: classes.dex */
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final q f29845a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final p219v8.a f29846b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final p f29847c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final l f29848d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final p194t3.a f29849e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final InterfaceC1364d.a f29850f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int f29851g;

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final class a implements p219v8.a {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public static final a f29852q = new a();

        a() {
        }

        @Override // p219v8.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Void invoke() {
            return null;
        }
    }

    public /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f29853a;

        static {
            int[] iArr = new int[InterfaceC1364d.a.values().length];
            try {
                iArr[InterfaceC1364d.a.HOME_SCREEN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[InterfaceC1364d.a.LOCK_SCREEN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f29853a = iArr;
        }
    }

    public static final class c implements InterfaceC0880f {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        final /* synthetic */ InterfaceC0880f f29854q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ d f29855r;

        public static final class a implements InterfaceC0881g {

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            final /* synthetic */ InterfaceC0881g f29856q;

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            final /* synthetic */ d f29857r;

            /* JADX INFO: renamed from: x3.d$c$a$a, reason: collision with other inner class name */
            public static final class C0732a extends kotlin.coroutines.jvm.internal.d {

                /* JADX INFO: renamed from: q, reason: collision with root package name */
                /* synthetic */ Object f29858q;

                /* JADX INFO: renamed from: r, reason: collision with root package name */
                int f29859r;

                /* JADX INFO: renamed from: s, reason: collision with root package name */
                Object f29860s;

                /* JADX INFO: renamed from: u, reason: collision with root package name */
                Object f29862u;

                /* JADX INFO: renamed from: v, reason: collision with root package name */
                Object f29863v;

                public C0732a(e eVar) {
                    super(eVar);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    this.f29858q = obj;
                    this.f29859r |= Integer.MIN_VALUE;
                    return a.this.b(null, this);
                }
            }

            public a(InterfaceC0881g interfaceC0881g, d dVar) {
                this.f29856q = interfaceC0881g;
                this.f29857r = dVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            /* JADX WARN: Code restructure failed: missing block: B:32:0x00ab, code lost:
            
                if (r9.b(r7, r0) == r1) goto L33;
             */
            @Override // I8.InterfaceC0881g
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object b(java.lang.Object r8, p129m8.e r9) {
                /*
                    r7 = this;
                    boolean r0 = r9 instanceof x3.d.c.a.C0732a
                    if (r0 == 0) goto L13
                    r0 = r9
                    x3.d$c$a$a r0 = (x3.d.c.a.C0732a) r0
                    int r1 = r0.f29859r
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f29859r = r1
                    goto L18
                L13:
                    x3.d$c$a$a r0 = new x3.d$c$a$a
                    r0.<init>(r9)
                L18:
                    java.lang.Object r9 = r0.f29858q
                    java.lang.Object r1 = p139n8.b.e()
                    int r2 = r0.f29859r
                    r3 = 2
                    r4 = 1
                    if (r2 == 0) goto L4a
                    if (r2 == r4) goto L35
                    if (r2 != r3) goto L2d
                    p079h8.r.b(r9)
                    goto Lae
                L2d:
                    java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                    java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                    r7.<init>(r8)
                    throw r7
                L35:
                    java.lang.Object r7 = r0.f29863v
                    u3.b r7 = (p204u3.b) r7
                    java.lang.Object r8 = r0.f29862u
                    I8.g r8 = (I8.InterfaceC0881g) r8
                    java.lang.Object r2 = r0.f29860s
                    x3.d$c$a r2 = (x3.d.c.a) r2
                    p079h8.r.b(r9)
                    r6 = r8
                    r8 = r7
                    r7 = r2
                    r2 = r9
                    r9 = r6
                    goto L6a
                L4a:
                    p079h8.r.b(r9)
                    I8.g r9 = r7.f29856q
                    u3.b r8 = (p204u3.b) r8
                    x3.d r2 = r7.f29857r
                    h3.d$a r5 = p234x3.d.d(r2)
                    I8.f r2 = p234x3.d.e(r2, r5)
                    r0.f29860s = r7
                    r0.f29862u = r9
                    r0.f29863v = r8
                    r0.f29859r = r4
                    java.lang.Object r2 = I8.AbstractC0882h.x(r2, r0)
                    if (r2 != r1) goto L6a
                    goto Lad
                L6a:
                    u3.b r2 = (p204u3.b) r2
                    x3.d r7 = r7.f29857r
                    t3.a r7 = p234x3.d.c(r7)
                    v8.a r7 = r7.c()
                    java.lang.Object r7 = r7.invoke()
                    java.lang.Boolean r7 = (java.lang.Boolean) r7
                    boolean r7 = r7.booleanValue()
                    r5 = 0
                    if (r7 != 0) goto L9b
                    if (r8 == 0) goto L8a
                    java.lang.String r7 = r8.c()
                    goto L8b
                L8a:
                    r7 = r5
                L8b:
                    if (r2 == 0) goto L92
                    java.lang.String r8 = r2.c()
                    goto L93
                L92:
                    r8 = r5
                L93:
                    boolean r7 = kotlin.jvm.internal.n.d(r7, r8)
                    if (r7 == 0) goto L9a
                    goto L9b
                L9a:
                    r4 = 0
                L9b:
                    java.lang.Boolean r7 = kotlin.coroutines.jvm.internal.b.a(r4)
                    r0.f29860s = r5
                    r0.f29862u = r5
                    r0.f29863v = r5
                    r0.f29859r = r3
                    java.lang.Object r7 = r9.b(r7, r0)
                    if (r7 != r1) goto Lae
                Lad:
                    return r1
                Lae:
                    h8.A r7 = p079h8.A.f21846a
                    return r7
                */
                throw new UnsupportedOperationException("Method not decompiled: x3.d.c.a.b(java.lang.Object, m8.e):java.lang.Object");
            }
        }

        public c(InterfaceC0880f interfaceC0880f, d dVar) {
            this.f29854q = interfaceC0880f;
            this.f29855r = dVar;
        }

        @Override // I8.InterfaceC0880f
        public Object a(InterfaceC0881g interfaceC0881g, e eVar) {
            Object objA = this.f29854q.a(new a(interfaceC0881g, this.f29855r), eVar);
            return objA == p139n8.b.e() ? objA : A.f21846a;
        }
    }

    public d(q previewUtils, p219v8.a initialExtrasProvider, p wallpaperInfoProvider, l onWallpaperColorChanged, p194t3.a wallpaperInteractor, InterfaceC1364d.a screen) {
        int i10;
        n.h(previewUtils, "previewUtils");
        n.h(initialExtrasProvider, "initialExtrasProvider");
        n.h(wallpaperInfoProvider, "wallpaperInfoProvider");
        n.h(onWallpaperColorChanged, "onWallpaperColorChanged");
        n.h(wallpaperInteractor, "wallpaperInteractor");
        n.h(screen, "screen");
        this.f29845a = previewUtils;
        this.f29846b = initialExtrasProvider;
        this.f29847c = wallpaperInfoProvider;
        this.f29848d = onWallpaperColorChanged;
        this.f29849e = wallpaperInteractor;
        this.f29850f = screen;
        int i11 = b.f29853a[screen.ordinal()];
        if (i11 == 1) {
            i10 = R.string.home_wallpaper_preview_card_content_description;
        } else {
            if (i11 != 2) {
                throw new m();
            }
            i10 = R.string.lock_wallpaper_preview_card_content_description;
        }
        this.f29851g = i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final A b(WallpaperColors wallpaperColors) {
        return A.f21846a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final InterfaceC1364d.a m() {
        InterfaceC1364d.a aVar = this.f29850f;
        InterfaceC1364d.a aVar2 = InterfaceC1364d.a.LOCK_SCREEN;
        return aVar == aVar2 ? InterfaceC1364d.a.HOME_SCREEN : aVar2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final InterfaceC0880f o(InterfaceC1364d.a aVar) {
        return this.f29849e.i(aVar);
    }

    static /* synthetic */ InterfaceC0880f p(d dVar, InterfaceC1364d.a aVar, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: wallpaperUpdateEvents");
        }
        if ((i10 & 1) != 0) {
            aVar = dVar.f29850f;
        }
        return dVar.o(aVar);
    }

    public final Bundle f() {
        return (Bundle) this.f29846b.invoke();
    }

    public final int g() {
        return this.f29851g;
    }

    public final q h() {
        return this.f29845a;
    }

    public final InterfaceC1364d.a i() {
        return this.f29850f;
    }

    public final Object j(boolean z9, e eVar) {
        return this.f29847c.invoke(kotlin.coroutines.jvm.internal.b.a(z9), eVar);
    }

    public InterfaceC0880f k() {
        return null;
    }

    public final void l(WallpaperColors wallpaperColors) {
        this.f29848d.f(wallpaperColors);
    }

    public final InterfaceC0880f n() {
        return new c(p(this, null, 1, null), this);
    }

    public InterfaceC0880f q() {
        return null;
    }

    public /* synthetic */ d(q qVar, p219v8.a aVar, p pVar, l lVar, p194t3.a aVar2, InterfaceC1364d.a aVar3, int i10, AbstractC1457h abstractC1457h) {
        this(qVar, (i10 & 2) != 0 ? a.f29852q : aVar, pVar, (i10 & 8) != 0 ? new l() { // from class: x3.c
            @Override // p219v8.l
            public final Object f(Object obj) {
                return d.b((WallpaperColors) obj);
            }
        } : lVar, aVar2, aVar3);
    }
}
