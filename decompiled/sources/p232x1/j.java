package p232x1;

import F8.AbstractC0812g;
import F8.AbstractC0816i;
import F8.C0803b0;
import F8.InterfaceC0846x0;
import F8.L;
import F8.M;
import F8.T0;
import L2.m;
import L2.p;
import android.app.WallpaperColors;
import android.app.WallpaperManager;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import androidx.lifecycle.AbstractC1164y;
import androidx.lifecycle.InterfaceC1163x;
import com.nothing.wallpaper.R;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.AbstractC1457h;
import kotlin.jvm.internal.n;
import p074h3.I;
import p079h8.A;
import p079h8.r;
import p089i8.AbstractC1439m;
import p089i8.AbstractC1444s;
import p129m8.e;

/* JADX INFO: loaded from: classes.dex */
public final class j extends p222w1.c implements i {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final a f29725p = new a(null);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final int f29726q = p.c().length;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Context f29727d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private InterfaceC0846x0 f29728e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final boolean f29729f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Integer[] f29730g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final boolean f29731h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private String f29732i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final L f29733j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f29734k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private List f29735l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private List f29736m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private WallpaperColors f29737n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private WallpaperColors f29738o;

    public static final class a {
        public /* synthetic */ a(AbstractC1457h abstractC1457h) {
            this();
        }

        private a() {
        }
    }

    static final class b extends l implements p219v8.p {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f29739q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private /* synthetic */ Object f29740r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ boolean f29742t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        final /* synthetic */ w1.a.b f29743u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        final /* synthetic */ boolean f29744v;

        static final class a extends l implements p219v8.p {

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            int f29745q;

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            final /* synthetic */ j f29746r;

            /* JADX INFO: renamed from: s, reason: collision with root package name */
            final /* synthetic */ boolean f29747s;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            final /* synthetic */ w1.a.b f29748t;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(j jVar, boolean z9, w1.a.b bVar, e eVar) {
                super(2, eVar);
                this.f29746r = jVar;
                this.f29747s = z9;
                this.f29748t = bVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final e create(Object obj, e eVar) {
                return new a(this.f29746r, this.f29747s, this.f29748t, eVar);
            }

            @Override // p219v8.p
            public final Object invoke(L l9, e eVar) {
                return ((a) create(l9, eVar)).invokeSuspend(A.f21846a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object objE = p139n8.b.e();
                int i10 = this.f29745q;
                try {
                    if (i10 == 0) {
                        r.b(obj);
                        j jVar = this.f29746r;
                        boolean z9 = this.f29747s;
                        this.f29745q = 1;
                        if (jVar.E(z9, this) == objE) {
                            return objE;
                        }
                    } else {
                        if (i10 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        r.b(obj);
                    }
                    w1.a.b bVar = this.f29748t;
                    if (bVar != null) {
                        bVar.b(this.f29746r.t(this.f29747s));
                    }
                } catch (Throwable th) {
                    this.f29746r.f29734k = false;
                    w1.a.b bVar2 = this.f29748t;
                    if (bVar2 != null) {
                        bVar2.a(th);
                    }
                }
                return A.f21846a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(boolean z9, w1.a.b bVar, boolean z10, e eVar) {
            super(2, eVar);
            this.f29742t = z9;
            this.f29743u = bVar;
            this.f29744v = z10;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final e create(Object obj, e eVar) {
            b bVar = j.this.new b(this.f29742t, this.f29743u, this.f29744v, eVar);
            bVar.f29740r = obj;
            return bVar;
        }

        @Override // p219v8.p
        public final Object invoke(L l9, e eVar) {
            return ((b) create(l9, eVar)).invokeSuspend(A.f21846a);
        }

        /* JADX WARN: Code duplicated, block: B:24:0x0056  */
        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            L l9;
            L l10;
            Object objE = p139n8.b.e();
            int i10 = this.f29739q;
            if (i10 == 0) {
                r.b(obj);
                L l11 = (L) this.f29740r;
                InterfaceC0846x0 interfaceC0846x0 = j.this.f29728e;
                if (interfaceC0846x0 != null) {
                    this.f29740r = l11;
                    this.f29739q = 1;
                    if (interfaceC0846x0.Q(this) == objE) {
                        return objE;
                    }
                    l10 = l11;
                } else {
                    l9 = l11;
                }
                if (j.this.f29735l != null || this.f29742t) {
                    j jVar = j.this;
                    jVar.f29728e = AbstractC0816i.d(l9, null, null, new a(jVar, this.f29744v, this.f29743u, null), 3, null);
                } else {
                    w1.a.b bVar = this.f29743u;
                    if (bVar != null) {
                        bVar.b(j.this.t(this.f29744v));
                    }
                }
                return A.f21846a;
            }
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            l10 = (L) this.f29740r;
            r.b(obj);
            l9 = l10;
            if (j.this.f29735l != null) {
                j jVar2 = j.this;
                jVar2.f29728e = AbstractC0816i.d(l9, null, null, new a(jVar2, this.f29744v, this.f29743u, null), 3, null);
            } else {
                j jVar3 = j.this;
                jVar3.f29728e = AbstractC0816i.d(l9, null, null, new a(jVar3, this.f29744v, this.f29743u, null), 3, null);
            }
            return A.f21846a;
        }
    }

    static final class c extends l implements p219v8.p {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f29749q;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        final /* synthetic */ boolean f29751s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(boolean z9, e eVar) {
            super(2, eVar);
            this.f29751s = z9;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final e create(Object obj, e eVar) {
            return j.this.new c(this.f29751s, eVar);
        }

        @Override // p219v8.p
        public final Object invoke(L l9, e eVar) {
            return ((c) create(l9, eVar)).invokeSuspend(A.f21846a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            int iB;
            p139n8.b.e();
            if (this.f29749q != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            r.b(obj);
            ArrayList arrayList = new ArrayList();
            String[] strArrD = j.this.e() ? j.this.d("color_bundles") : new String[0];
            int length = strArrD.length;
            n.e(strArrD);
            Iterator it = AbstractC1439m.W(strArrD, length).iterator();
            boolean z9 = false;
            int i10 = 1;
            while (true) {
                String strC = null;
                if (!it.hasNext()) {
                    break;
                }
                String str = (String) it.next();
                try {
                    strC = j.this.c("color_style_", str);
                } catch (Resources.NotFoundException unused) {
                }
                if (strC != null) {
                    try {
                        iB = p.b(strC);
                    } catch (IllegalArgumentException unused2) {
                        iB = 1;
                    }
                } else {
                    iB = 1;
                }
                if (iB == 7) {
                    p034d3.a aVarC = I.a().C();
                    Context context = ((p222w1.c) j.this).f28551a;
                    n.g(context, "access$getMContext$p$s1310504532(...)");
                    if (aVarC.j(context)) {
                        j.this.f29732i = str;
                        z9 = true;
                    }
                }
                j jVar = j.this;
                n.e(str);
                arrayList.add(j.v(jVar, str, i10, kotlin.coroutines.jvm.internal.b.c(iB), null, this.f29751s, 8, null));
                i10++;
            }
            if (O6.b.d(j.this.f29727d)) {
                arrayList.add(0, j.v(j.this, "Bauhaus", 100, kotlin.coroutines.jvm.internal.b.c(7), null, this.f29751s, 8, null));
            }
            if (!z9) {
                j.this.f29732i = null;
            }
            j.this.f29735l = arrayList;
            j.this.f29728e = null;
            return A.f21846a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(Context context, String stubPackageName) {
        super(context, stubPackageName);
        n.h(context, "context");
        n.h(stubPackageName, "stubPackageName");
        this.f29727d = context;
        this.f29729f = k.a(context);
        this.f29730g = new Integer[]{1, 0, 2, 3};
        p034d3.a aVarC = I.a().C();
        n.f(aVarC, "null cannot be cast to non-null type com.nothing.wallpaper.config.NTFlags");
        this.f29731h = ((p197t6.c) aVarC).y();
        Object obj = this.f28551a;
        this.f29733j = obj instanceof InterfaceC1163x ? AbstractC1164y.a((InterfaceC1163x) obj) : M.a(C0803b0.a().z(T0.b(null, 1, null)));
        this.f29734k = true;
    }

    private final int[] A(m mVar) {
        return new int[]{p191t0.a.x(mVar.i().k(), 255), p191t0.a.x(mVar.i().k(), 255), ColorStateList.valueOf(mVar.j().j()).withLStar(85.0f).getColors()[0], p191t0.a.x(mVar.k().i(), 255)};
    }

    private final int[] B(m mVar) {
        return new int[]{p191t0.a.x(mVar.i().g(), 255), p191t0.a.x(mVar.i().g(), 255), ColorStateList.valueOf(mVar.j().j()).withLStar(85.0f).getColors()[0], p191t0.a.x(mVar.k().i(), 255)};
    }

    private final int[] C(m mVar) {
        int[] iArr = mVar.o() == 5 ? new int[]{mVar.k().d(450.0f), mVar.i().d(550.0f)} : new int[]{mVar.i().d(450.0f), mVar.i().d(450.0f)};
        int i10 = iArr[0];
        int i11 = iArr[1];
        return new int[]{i10, i11, i10, i11};
    }

    private final boolean D() {
        WallpaperManager wallpaperManager = WallpaperManager.getInstance(this.f28551a.getApplicationContext());
        return wallpaperManager.getWallpaperId(2) > wallpaperManager.getWallpaperId(1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object E(boolean z9, e eVar) {
        Object objG = AbstractC0812g.g(C0803b0.b(), new c(z9, null), eVar);
        return objG == p139n8.b.e() ? objG : A.f21846a;
    }

    private final void F(WallpaperColors wallpaperColors, WallpaperColors wallpaperColors2) {
        j jVar;
        if (wallpaperColors == null) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        int i10 = wallpaperColors2 == null ? 4 : 2;
        if (wallpaperColors2 != null) {
            boolean zD = D();
            jVar = this;
            jVar.s(zD ? wallpaperColors2 : wallpaperColors, i10, zD ? "lock_wallpaper" : "home_wallpaper", true, arrayList);
            jVar.s(zD ? wallpaperColors : wallpaperColors2, 4 - (arrayList.size() / f29726q), zD ? "home_wallpaper" : "lock_wallpaper", false, arrayList);
        } else {
            jVar = this;
            jVar.s(wallpaperColors, i10, "home_wallpaper", true, arrayList);
        }
        HashSet hashSet = new HashSet();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            g gVar = (g) obj;
            n.f(gVar, "null cannot be cast to non-null type com.android.customization.model.color.ColorOptionImpl");
            h hVar = (h) gVar;
            int[] iArrA = hVar.n().a(false);
            int[] iArrA2 = hVar.n().a(true);
            StringBuilder sb = new StringBuilder();
            for (int i11 : iArrA) {
                sb.append(i11);
            }
            for (int i12 : iArrA2) {
                sb.append(i12);
            }
            if (hashSet.add(sb.toString())) {
                arrayList2.add(obj);
            }
        }
        jVar.f29736m = arrayList2;
    }

    static /* synthetic */ void G(j jVar, WallpaperColors wallpaperColors, WallpaperColors wallpaperColors2, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            wallpaperColors2 = null;
        }
        jVar.F(wallpaperColors, wallpaperColors2);
    }

    private final void r(int i10, int i11, boolean z9, String str, List list) {
        String string;
        for (Integer num : this.f29730g) {
            int iIntValue = num.intValue();
            m mVar = new m(i10, false, iIntValue);
            m mVar2 = new m(i10, true, iIntValue);
            h.a aVar = new h.a();
            aVar.g(A(mVar));
            aVar.d(w(mVar2));
            aVar.h(i10);
            aVar.a("android.theme.customization.system_palette", z9 ? "" : k.b(i10));
            if (iIntValue == 0) {
                string = this.f29727d.getString(R.string.content_description_neutral_color_option);
            } else if (iIntValue == 1) {
                string = this.f29727d.getString(R.string.content_description_dynamic_color_option);
            } else if (iIntValue != 2) {
                string = iIntValue != 3 ? this.f29727d.getString(R.string.content_description_dynamic_color_option) : this.f29727d.getString(R.string.content_description_expressive_color_option);
            } else {
                string = this.f29727d.getString(R.string.content_description_vibrant_color_option);
            }
            aVar.k(string);
            aVar.i(str);
            aVar.j(iIntValue);
            aVar.f(1 + i11);
            aVar.e(z9);
            aVar.l(W1.b.WALLPAPER_COLOR);
            list.add(aVar.b());
        }
    }

    private final void s(WallpaperColors wallpaperColors, int i10, String str, boolean z9, List list) {
        List listM = m.m(wallpaperColors);
        n.e(listM);
        Integer num = (Integer) AbstractC1444s.S(listM);
        n.e(num);
        String str2 = str;
        List list2 = list;
        r(num.intValue(), 0, z9, str2, list2);
        int i11 = 0;
        for (Integer num2 : AbstractC1444s.o0(AbstractC1444s.N(listM, 1), i10 - 1)) {
            i11++;
            n.e(num2);
            String str3 = str2;
            List list3 = list2;
            r(num2.intValue(), i11, false, str3, list3);
            str2 = str3;
            list2 = list3;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List t(boolean z9) {
        List arrayList;
        String str;
        List listL = this.f29735l;
        if (listL == null) {
            listL = AbstractC1444s.l();
        }
        List list = this.f29736m;
        if (list == null || (arrayList = AbstractC1444s.u0(list)) == null) {
            arrayList = new ArrayList();
        }
        p034d3.a aVarC = I.a().C();
        Context mContext = this.f28551a;
        n.g(mContext, "mContext");
        if (aVarC.j(mContext) && this.f29731h && (str = this.f29732i) != null && !arrayList.isEmpty()) {
            arrayList.add(1, u(str, -1, 7, W1.b.WALLPAPER_COLOR, z9));
        }
        return AbstractC1444s.g0(arrayList, listL);
    }

    private final h u(String str, int i10, Integer num, W1.b bVar, boolean z9) {
        h.a aVar = new h.a();
        if (n.d("Bauhaus", str)) {
            aVar.k("Bauhaus");
        } else {
            aVar.k(c("bundle_name_", str));
        }
        aVar.f(i10);
        aVar.i("preset");
        aVar.l(bVar);
        int iB = n.d("Bauhaus", str) ? b("color_secondary_", this.f29732i) : b("color_secondary_", str);
        m mVar = new m(iB, true);
        int iL = new m(iB, false).l();
        int iL2 = mVar.l();
        int[] iArrZ = {iL, iL, iL, iL};
        int[] iArrZ2 = {iL2, iL2, iL2, iL2};
        aVar.h(iB);
        aVar.a("android.theme.customization.accent_color", k.b(iB));
        aVar.a("android.theme.customization.system_palette", k.b(iB));
        if (num != null) {
            aVar.j(num.intValue());
            m mVar2 = new m(iB, false, num.intValue());
            m mVar3 = new m(iB, true, num.intValue());
            if (num.intValue() == 7) {
                iArrZ2 = x(mVar3);
                iArrZ = B(mVar2);
            } else {
                iArrZ2 = z9 ? z(mVar3, iB) : y(mVar3);
                iArrZ = z9 ? z(mVar2, iB) : C(mVar2);
            }
        }
        aVar.g(iArrZ);
        aVar.d(iArrZ2);
        return aVar.b();
    }

    static /* synthetic */ h v(j jVar, String str, int i10, Integer num, W1.b bVar, boolean z9, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            num = null;
        }
        Integer num2 = num;
        if ((i11 & 8) != 0) {
            bVar = W1.b.PRESET_COLOR;
        }
        return jVar.u(str, i10, num2, bVar, z9);
    }

    private final int[] w(m mVar) {
        return new int[]{p191t0.a.x(mVar.i().h(), 255), p191t0.a.x(mVar.i().h(), 255), ColorStateList.valueOf(mVar.j().j()).withLStar(35.0f).getColors()[0], p191t0.a.x(mVar.k().i(), 255)};
    }

    private final int[] x(m mVar) {
        return new int[]{p191t0.a.x(mVar.i().e(), 255), p191t0.a.x(mVar.i().e(), 255), ColorStateList.valueOf(mVar.j().j()).withLStar(35.0f).getColors()[0], p191t0.a.x(mVar.k().i(), 255)};
    }

    private final int[] y(m mVar) {
        int[] iArr = mVar.o() == 5 ? new int[]{mVar.k().f(), mVar.i().h()} : new int[]{mVar.i().h(), mVar.i().h()};
        int i10 = iArr[0];
        int i11 = iArr[1];
        return new int[]{i10, i11, i10, i11};
    }

    private final int[] z(m mVar, int i10) {
        int[] iArr;
        int iO = mVar.o();
        if (iO != 4) {
            iArr = iO != 5 ? new int[]{i10, i10} : new int[]{mVar.k().f(), mVar.i().h()};
        } else {
            iArr = new int[]{mVar.i().h(), mVar.i().h()};
        }
        int i11 = iArr[0];
        int i12 = iArr[1];
        return new int[]{i11, i12, i11, i12};
    }

    @Override // p232x1.i
    public void a(w1.a.b bVar, boolean z9, WallpaperColors wallpaperColors, WallpaperColors wallpaperColors2) {
        boolean zK = p034d3.a.f19546c.a().k();
        if (zK) {
            if (!n.d(this.f29737n, wallpaperColors) || z9) {
                G(this, wallpaperColors, null, 2, null);
                this.f29737n = wallpaperColors;
            }
        } else if (!n.d(this.f29737n, wallpaperColors) || !n.d(this.f29738o, wallpaperColors2) || z9) {
            F(wallpaperColors, wallpaperColors2);
            this.f29737n = wallpaperColors;
            this.f29738o = wallpaperColors2;
        }
        AbstractC0816i.d(this.f29733j, null, null, new b(z9, bVar, zK, null), 3, null);
    }

    @Override // p222w1.c
    public boolean e() {
        return this.f29729f && super.e() && this.f29734k;
    }
}
