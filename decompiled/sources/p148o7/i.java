package p148o7;

import C6.g;
import G6.c;
import android.graphics.Point;
import android.graphics.PointF;
import androidx.lifecycle.Q;
import com.nothing.wallpaper.effects.data.model.ViewScope;
import kotlin.jvm.internal.AbstractC1457h;
import kotlin.jvm.internal.n;
import p167q6.b;
import p219v8.l;

/* JADX INFO: loaded from: classes2.dex */
public final class i {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final a f23541m = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final g f23542a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Q f23543b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final b f23544c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Point f23545d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Point f23546e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final boolean f23547f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private l f23548g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private volatile boolean f23549h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f23550i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private String f23551j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private Float f23552k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private PointF f23553l;

    public static final class a {
        public /* synthetic */ a(AbstractC1457h abstractC1457h) {
            this();
        }

        private a() {
        }
    }

    public i(g gVar, Q savedStateHandle) {
        n.h(savedStateHandle, "savedStateHandle");
        this.f23542a = gVar;
        this.f23543b = savedStateHandle;
        this.f23544c = new b("WallpaperImageScopeHelper");
        this.f23547f = (g() == null || d() == null) ? false : true;
    }

    private final void a(Float f10, PointF pointF) {
        l lVar;
        if (!this.f23550i || (lVar = this.f23548g) == null) {
            return;
        }
        ViewScope viewScopeH = h();
        if (viewScopeH != null) {
            if (n.a(viewScopeH.getScale(), f10) && n.d(viewScopeH.getCenter(), pointF)) {
                this.f23544c.a("consumePending but skip send " + viewScopeH + ".");
            } else {
                boolean zI = i(viewScopeH);
                this.f23544c.a("consumePending, normalized = " + zI + " , send " + viewScopeH + ".");
                if (f() == null) {
                    m(viewScopeH);
                }
                lVar.f(viewScopeH);
            }
        }
        this.f23550i = false;
    }

    static /* synthetic */ void b(i iVar, Float f10, PointF pointF, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = null;
        }
        if ((i10 & 2) != 0) {
            pointF = null;
        }
        iVar.a(f10, pointF);
    }

    private final PointF d() {
        return (PointF) this.f23543b.d("key_scope_center");
    }

    private final ViewScope e() {
        Float fValueOf;
        Point point = null;
        if (this.f23549h && (g() != null || d() != null)) {
            String str = this.f23551j;
            if (str == null) {
                str = "";
            }
            StringBuffer stringBuffer = new StringBuffer(str);
            if (g() != null) {
                fValueOf = g();
            } else {
                stringBuffer.append("|LastScope.scale");
                ViewScope viewScopeF = f();
                fValueOf = viewScopeF != null ? Float.valueOf(viewScopeF.getScale()) : null;
            }
            PointF pointFD = d();
            if (pointFD == null) {
                stringBuffer.append("|LastScope.center");
                ViewScope viewScopeF2 = f();
                pointFD = viewScopeF2 != null ? viewScopeF2.getCenter() : null;
            }
            if (fValueOf != null && pointFD != null) {
                float fFloatValue = fValueOf.floatValue();
                Point point2 = this.f23545d;
                if (point2 == null) {
                    n.r("viewSize");
                } else {
                    point = point2;
                }
                ViewScope viewScope = new ViewScope(fFloatValue, pointFD, point);
                viewScope.setReason(stringBuffer.toString());
                return viewScope;
            }
        }
        return null;
    }

    private final Float g() {
        return (Float) this.f23543b.d("key_scope_scale");
    }

    private final boolean i(ViewScope viewScope) {
        if (!this.f23549h) {
            return false;
        }
        float scale = viewScope.getScale();
        Point viewSize = viewScope.getViewSize();
        Point point = this.f23546e;
        if (point == null) {
            n.r("imageSize");
            point = null;
        }
        return G6.b.j(scale, viewSize, point, viewScope.getCenter());
    }

    private final void l(PointF pointF) {
        this.f23543b.i("key_scope_center", pointF);
    }

    private final void o(Float f10) {
        this.f23543b.i("key_scope_scale", f10);
    }

    public final synchronized void c(Float f10, PointF pointF) {
        try {
            this.f23544c.a("consumeScope, scale=" + f10 + ", center=" + pointF + ".");
            j(pointF, f10, "consumeScope");
            ViewScope viewScopeE = e();
            if (viewScopeE != null) {
                this.f23552k = Float.valueOf(viewScopeE.getScale());
                this.f23553l = viewScopeE.getCenter();
            }
            b(this, null, null, 3, null);
        } catch (Throwable th) {
            throw th;
        }
    }

    public final ViewScope f() {
        return (ViewScope) this.f23543b.d("key_origin_scope");
    }

    public final ViewScope h() {
        ViewScope viewScopeE = e();
        return viewScopeE == null ? f() : viewScopeE;
    }

    public final synchronized void j(PointF pointF, Float f10, String str) {
        try {
            if (this.f23549h) {
                PointF pointFD = d();
                if (pointFD == null) {
                    ViewScope viewScopeF = f();
                    pointFD = viewScopeF != null ? viewScopeF.getCenter() : null;
                }
                Float fG = g();
                if (fG == null) {
                    ViewScope viewScopeF2 = f();
                    fG = viewScopeF2 != null ? Float.valueOf(viewScopeF2.getScale()) : null;
                }
                boolean z9 = pointFD == null && fG == null;
                if (pointF != null) {
                    l(new PointF(pointF.x, pointF.y));
                }
                if (f10 != null) {
                    o(Float.valueOf(f10.floatValue()));
                }
                if ((!n.d(d(), pointFD) && f10 == null) || ((pointF == null && !n.c(g(), fG)) || !n.d(d(), pointFD) || !n.c(g(), fG) || n.d("reason_depth_init", str))) {
                    this.f23551j = str;
                    ViewScope viewScopeE = e();
                    if (viewScopeE != null) {
                        this.f23544c.a("onScopeChanged,received new scope " + viewScopeE);
                        this.f23550i = true;
                    }
                }
                if (z9 || n.d("reason_depth_init", str)) {
                    b(this, null, null, 3, null);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void k(boolean z9) {
        try {
            this.f23544c.a("onScopeChangedEnd, send new scope, force:" + z9);
            if (z9) {
                this.f23550i = true;
                b(this, null, null, 3, null);
            } else {
                a(this.f23552k, this.f23553l);
            }
            this.f23552k = null;
            this.f23553l = null;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final void m(ViewScope viewScope) {
        this.f23543b.i("key_origin_scope", viewScope);
    }

    public final void n(l lVar) {
        l lVar2 = this.f23548g;
        this.f23548g = lVar;
        this.f23550i = (n.d(lVar2, lVar) || lVar == null) ? false : true;
        b(this, null, null, 3, null);
    }

    public final synchronized void p(Point viewSize, Point imageSize) {
        try {
            n.h(viewSize, "viewSize");
            n.h(imageSize, "imageSize");
            if (this.f23549h) {
                return;
            }
            boolean z9 = true;
            this.f23549h = true;
            this.f23545d = viewSize;
            this.f23546e = imageSize;
            ViewScope viewScopeI = c.i(this.f23542a, viewSize);
            if (viewScopeI != null) {
                viewScopeI.setReason("LastScope");
                i(viewScopeI);
            } else {
                viewScopeI = null;
            }
            m(viewScopeI);
            if (f() == null && !this.f23547f) {
                z9 = false;
            }
            this.f23550i = z9;
            b(this, null, null, 3, null);
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void q(ViewScope viewScope) {
        m(viewScope);
    }
}
