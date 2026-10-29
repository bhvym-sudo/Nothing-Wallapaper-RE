package p037d6;

import K2.f;
import O2.k;
import O2.l;
import O2.m;
import O2.w;
import O2.x;
import O2.y;
import android.R;
import android.graphics.Rect;
import android.view.View;
import com.nothing.systemui.shared.clocks.view.D;
import kotlin.jvm.internal.AbstractC1457h;
import kotlin.jvm.internal.n;

/* JADX INFO: loaded from: classes2.dex */
public final class d implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final D f19662a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private p037d6.a f19663b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final k f19664c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private y f19665d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final m f19666e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final x f19667f;

    public static final class a implements m {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f19669b;

        a(boolean z9) {
            this.f19669b = z9;
        }

        @Override // O2.m
        public void a(boolean z9, boolean z10, boolean z11) {
            if (this.f19669b) {
                d.this.getView().q(true, true, true);
            } else {
                d.this.getView().q(z9, z10, z11);
            }
        }

        @Override // O2.m
        public void b() {
            d.this.getView().F();
        }

        @Override // O2.m
        public void c(y theme) {
            n.h(theme, "theme");
            d.this.i(theme);
            d.this.getView().v(theme);
        }

        @Override // O2.m
        public void d(float f10) {
            d.this.getView().u();
        }

        @Override // O2.m
        public void e(Rect rect) {
        }
    }

    public d(D view, String clockViewId, w clockTickRate, f fVar, boolean z9) {
        n.h(view, "view");
        n.h(clockViewId, "clockViewId");
        n.h(clockTickRate, "clockTickRate");
        this.f19662a = view;
        this.f19663b = new p037d6.a(getView(), 0.0f, 0.0f);
        this.f19664c = new k(clockTickRate, false, false, false, 14, null);
        this.f19665d = new y(true, Integer.valueOf(getView().getResources().getColor(R.color.white)));
        this.f19666e = new a(z9);
        x xVar = new x(getView());
        ((View) xVar.b().get(0)).setId(xVar.a().getResources().getIdentifier(clockViewId, "id", xVar.a().getContext().getPackageName()));
        this.f19667f = xVar;
        getView().setIsSnapshotClockView(z9);
        if (fVar != null) {
            getView().setMessageBuffer(fVar);
        }
    }

    @Override // O2.l
    public k a() {
        return this.f19664c;
    }

    @Override // O2.l
    public m b() {
        return this.f19666e;
    }

    @Override // O2.l
    public void c(boolean z9, boolean z10, boolean z11) {
        b().a(z9, z10, z11);
    }

    @Override // O2.l
    public y e() {
        return this.f19665d;
    }

    @Override // O2.l
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public p037d6.a d() {
        return this.f19663b;
    }

    @Override // O2.l
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public D getView() {
        return this.f19662a;
    }

    public void h(p037d6.a aVar) {
        n.h(aVar, "<set-?>");
        this.f19663b = aVar;
    }

    public void i(y yVar) {
        n.h(yVar, "<set-?>");
        this.f19665d = yVar;
    }

    public /* synthetic */ d(D d10, String str, w wVar, f fVar, boolean z9, int i10, AbstractC1457h abstractC1457h) {
        this(d10, str, (i10 & 4) != 0 ? w.PER_MINUTE : wVar, (i10 & 8) != 0 ? null : fVar, (i10 & 16) != 0 ? false : z9);
    }
}
