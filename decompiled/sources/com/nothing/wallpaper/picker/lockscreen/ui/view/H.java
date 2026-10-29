package com.nothing.wallpaper.picker.lockscreen.ui.view;

import F2.AbstractC0797d;
import android.app.WallpaperManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Point;
import android.text.format.DateFormat;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.lifecycle.InterfaceC1163x;
import com.nothing.cardwidget.battery.BatteryConfig;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ThreadPoolExecutor;
import kotlin.jvm.internal.AbstractC1457h;
import p248y7.C2005g;

/* JADX INFO: loaded from: classes2.dex */
public final class H extends S1.c {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final a f18910r = new a(null);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final Context f18911j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final C2005g f18912k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final HashMap f18913l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final ConcurrentHashMap f18914m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private b f18915n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private O2.h f18916o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private ConcurrentHashMap f18917p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private O2.h f18918q;

    public static final class a {
        public /* synthetic */ a(AbstractC1457h abstractC1457h) {
            this();
        }

        private a() {
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final O2.l f18919a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f18920b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final a f18921c;

        public static final class a implements Runnable {
            a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                if (b.this.f18920b) {
                    AbstractC0797d.f1557e.a(this, 990L);
                    b.this.b().b().b();
                }
            }
        }

        public b(O2.l clockFace) {
            kotlin.jvm.internal.n.h(clockFace, "clockFace");
            this.f18919a = clockFace;
            this.f18921c = new a();
        }

        public final O2.l b() {
            return this.f18919a;
        }

        public final void c() {
            if (this.f18920b) {
                return;
            }
            this.f18920b = true;
            AbstractC0797d.f1557e.execute(this.f18921c);
        }

        public final void d() {
            if (this.f18920b) {
                this.f18920b = false;
                ThreadPoolExecutor threadPoolExecutor = AbstractC0797d.f1555c;
            }
        }
    }

    public static final class c implements C2005g.b {
        c() {
        }

        @Override // p248y7.C2005g.b
        public void a(X5.a data) {
            kotlin.jvm.internal.n.h(data, "data");
            H.this.J(data);
        }

        @Override // p248y7.C2005g.b
        public void b(O2.a data) {
            kotlin.jvm.internal.n.h(data, "data");
            H.this.I(data);
        }

        @Override // p248y7.C2005g.b
        public void c(Y5.a aVar) {
            H.this.K(aVar);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public H(Context appContext, Point screenSize, WallpaperManager wallpaperManager, Q2.k registry, C2005g clockShareDataManager) {
        super(appContext, screenSize, wallpaperManager, registry);
        kotlin.jvm.internal.n.h(appContext, "appContext");
        kotlin.jvm.internal.n.h(screenSize, "screenSize");
        kotlin.jvm.internal.n.h(wallpaperManager, "wallpaperManager");
        kotlin.jvm.internal.n.h(registry, "registry");
        kotlin.jvm.internal.n.h(clockShareDataManager, "clockShareDataManager");
        this.f18911j = appContext;
        this.f18912k = clockShareDataManager;
        this.f18913l = new HashMap();
        this.f18914m = new ConcurrentHashMap();
        this.f18917p = new ConcurrentHashMap();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void D(H h10, View view) {
        ViewParent parent = view.getParent();
        ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        if (viewGroup != null) {
            Context context = viewGroup.getContext();
            kotlin.jvm.internal.n.g(context, "getContext(...)");
            h10.H(context);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void F(O2.h hVar, H h10) {
        O2.j jVarB = hVar.b();
        Resources resources = h10.f18911j.getResources();
        kotlin.jvm.internal.n.g(resources, "getResources(...)");
        jVarB.d(resources);
        hVar.b().b(DateFormat.is24HourFormat(h10.f18911j));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void I(O2.a aVar) {
        O2.j jVarB;
        O2.j jVarB2;
        O2.h hVar = this.f18916o;
        if (hVar != null && (jVarB2 = hVar.b()) != null) {
            jVarB2.c(aVar);
        }
        O2.h hVar2 = this.f18918q;
        if (hVar2 != null && (jVarB = hVar2.b()) != null) {
            jVarB.c(aVar);
        }
        Collection collectionValues = l().values();
        kotlin.jvm.internal.n.g(collectionValues, "<get-values>(...)");
        Iterator it = collectionValues.iterator();
        while (it.hasNext()) {
            ((O2.h) it.next()).b().c(aVar);
        }
        Collection collectionValues2 = this.f18917p.values();
        kotlin.jvm.internal.n.g(collectionValues2, "<get-values>(...)");
        Iterator it2 = collectionValues2.iterator();
        while (it2.hasNext()) {
            ((O2.h) it2.next()).b().c(aVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void J(X5.a aVar) {
        O2.j jVarB;
        O2.j jVarB2;
        O2.h hVar = this.f18916o;
        if (hVar != null && (jVarB2 = hVar.b()) != null) {
            jVarB2.g(aVar);
        }
        O2.h hVar2 = this.f18918q;
        if (hVar2 != null && (jVarB = hVar2.b()) != null) {
            jVarB.g(aVar);
        }
        Collection collectionValues = l().values();
        kotlin.jvm.internal.n.g(collectionValues, "<get-values>(...)");
        Iterator it = collectionValues.iterator();
        while (it.hasNext()) {
            ((O2.h) it.next()).b().g(aVar);
        }
        Collection collectionValues2 = this.f18917p.values();
        kotlin.jvm.internal.n.g(collectionValues2, "<get-values>(...)");
        Iterator it2 = collectionValues2.iterator();
        while (it2.hasNext()) {
            ((O2.h) it2.next()).b().g(aVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void K(Y5.a aVar) {
        O2.j jVarB;
        O2.j jVarB2;
        O2.h hVar = this.f18916o;
        if (hVar != null && (jVarB2 = hVar.b()) != null) {
            jVarB2.a(aVar);
        }
        O2.h hVar2 = this.f18918q;
        if (hVar2 != null && (jVarB = hVar2.b()) != null) {
            jVarB.a(aVar);
        }
        Collection collectionValues = l().values();
        kotlin.jvm.internal.n.g(collectionValues, "<get-values>(...)");
        Iterator it = collectionValues.iterator();
        while (it.hasNext()) {
            ((O2.h) it.next()).b().a(aVar);
        }
        Collection collectionValues2 = this.f18917p.values();
        kotlin.jvm.internal.n.g(collectionValues2, "<get-values>(...)");
        Iterator it2 = collectionValues2.iterator();
        while (it2.hasNext()) {
            ((O2.h) it2.next()).b().a(aVar);
        }
    }

    private final void M(O2.h hVar, boolean z9, boolean z10) {
        hVar.d().c(z9, z10, false);
    }

    public final O2.h A() {
        return this.f18918q;
    }

    public final View B(String clockId) {
        View view;
        O2.j jVarB;
        O2.k kVarA;
        kotlin.jvm.internal.n.h(clockId, "clockId");
        O2.h hVarQ = q(clockId);
        this.f18918q = hVarQ;
        O2.w wVarA = null;
        O2.l lVarD = hVarQ != null ? hVarQ.d() : null;
        if (lVarD != null && (kVarA = lVarD.a()) != null) {
            wVarA = kVarA.a();
        }
        if (wVarA == O2.w.PER_SECOND) {
            b bVar = this.f18915n;
            if (bVar != null) {
                bVar.d();
            }
            b bVar2 = new b(lVarD);
            bVar2.c();
            this.f18915n = bVar2;
        }
        if (hVarQ != null && (jVarB = hVarQ.b()) != null) {
            jVarB.b(DateFormat.is24HourFormat(this.f18911j));
        }
        return (lVarD == null || (view = lVarD.getView()) == null) ? k() : view;
    }

    public final View C(String clockId, N1.a size, A7.a alignment) {
        kotlin.jvm.internal.n.h(clockId, "clockId");
        kotlin.jvm.internal.n.h(size, "size");
        kotlin.jvm.internal.n.h(alignment, "alignment");
        O2.h hVarQ = q(clockId);
        this.f18916o = hVarQ;
        if (hVarQ != null) {
            M(hVarQ, alignment == A7.a.CENTER, size == N1.a.DYNAMIC);
            if (hVarQ.d().a().a() == O2.w.PER_SECOND) {
                b bVar = new b(hVarQ.d());
                bVar.c();
                this.f18915n = bVar;
            }
            hVarQ.b().b(DateFormat.is24HourFormat(this.f18911j));
            View view = hVarQ.d().getView();
            if (view != null) {
                return view;
            }
        }
        return k();
    }

    public final View E(String clockId) {
        O2.l lVarC;
        O2.k kVarA;
        kotlin.jvm.internal.n.h(clockId, "clockId");
        final O2.h hVarG = G(clockId);
        if (hVarG != null) {
            AbstractC0797d.f1557e.execute(new Runnable() { // from class: com.nothing.wallpaper.picker.lockscreen.ui.view.F
                @Override // java.lang.Runnable
                public final void run() {
                    H.F(hVarG, this);
                }
            });
            lVarC = hVarG.c();
        } else {
            lVarC = null;
        }
        if (((lVarC == null || (kVarA = lVarC.a()) == null) ? null : kVarA.a()) == O2.w.PER_SECOND) {
            b bVar = (b) this.f18913l.get(clockId);
            if (bVar == null) {
                bVar = new b(lVarC);
                this.f18913l.put(clockId, bVar);
            }
            bVar.c();
        }
        View view = lVarC != null ? lVarC.getView() : null;
        return view == null ? k() : view;
    }

    public final O2.h G(String clockId) {
        kotlin.jvm.internal.n.h(clockId, "clockId");
        O2.h hVar = (O2.h) this.f18917p.get(clockId);
        if (hVar != null) {
            return hVar;
        }
        O2.h hVarR = r(clockId);
        if (hVarR == null) {
            return null;
        }
        O2.j jVarB = hVarR.b();
        jVarB.a(this.f18912k.w());
        jVarB.g(this.f18912k.v());
        O2.a aVarT = this.f18912k.t();
        if (aVarT != null) {
            hVarR.b().c(aVarT);
        }
        this.f18917p.put(clockId, hVarR);
        return hVarR;
    }

    public final void H(Context context) {
        kotlin.jvm.internal.n.h(context, "context");
        Intent intent = new Intent("com.nothing.action.APPWIDGET_CONFIGURE");
        intent.setComponent(new ComponentName(BatteryConfig.DEFAULT_PACKAGE_NAME, "com.nothing.hearthstone.quicklook.QuickLookSettingsActivity"));
        p087i6.a.b(p087i6.a.f22186a, context, intent, null, 0, 12, null);
    }

    public final void L(O2.h controller) {
        O2.l lVarD;
        kotlin.jvm.internal.n.h(controller, "controller");
        this.f18918q = controller;
        if (controller == null || (lVarD = controller.d()) == null) {
            return;
        }
        if (lVarD.a().a() == O2.w.PER_SECOND) {
            b bVar = this.f18915n;
            if (bVar != null) {
                bVar.d();
            }
            b bVar2 = new b(lVarD);
            bVar2.c();
            this.f18915n = bVar2;
        }
        controller.b().b(DateFormat.is24HourFormat(this.f18911j));
    }

    @Override // S1.c, S1.a
    public void e(InterfaceC1163x owner) {
        kotlin.jvm.internal.n.h(owner, "owner");
        super.e(owner);
        t();
        Collection collectionValues = this.f18913l.values();
        kotlin.jvm.internal.n.g(collectionValues, "<get-values>(...)");
        Iterator it = collectionValues.iterator();
        while (it.hasNext()) {
            ((b) it.next()).c();
        }
        b bVar = this.f18915n;
        if (bVar != null) {
            bVar.c();
        }
        int iHashCode = owner.hashCode();
        if (this.f18914m.contains(Integer.valueOf(iHashCode))) {
            return;
        }
        c cVar = new c();
        this.f18914m.put(Integer.valueOf(iHashCode), cVar);
        this.f18912k.C(cVar);
    }

    @Override // S1.a
    public View f(String clockId) {
        O2.l lVarD;
        O2.k kVarA;
        kotlin.jvm.internal.n.h(clockId, "clockId");
        O2.h hVarD = d(clockId);
        View view = null;
        if (hVarD != null) {
            O2.j jVarB = hVarD.b();
            Resources resources = this.f18911j.getResources();
            kotlin.jvm.internal.n.g(resources, "getResources(...)");
            jVarB.d(resources);
            lVarD = hVarD.d();
        } else {
            lVarD = null;
        }
        if (((lVarD == null || (kVarA = lVarD.a()) == null) ? null : kVarA.a()) == O2.w.PER_SECOND) {
            b bVar = (b) this.f18913l.get(clockId);
            if (bVar == null) {
                bVar = new b(lVarD);
                this.f18913l.put(clockId, bVar);
            }
            bVar.c();
        }
        View view2 = lVarD != null ? lVarD.getView() : null;
        if (view2 != null) {
            if (A7.d.f308a.h(clockId)) {
                view2.setOnClickListener(new View.OnClickListener() { // from class: com.nothing.wallpaper.picker.lockscreen.ui.view.G
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view3) {
                        H.D(this.f18909q, view3);
                    }
                });
            }
            view = view2;
        }
        return view == null ? k() : view;
    }

    @Override // S1.c, S1.a
    public void i(InterfaceC1163x owner) {
        kotlin.jvm.internal.n.h(owner, "owner");
        super.i(owner);
        Collection collectionValues = this.f18913l.values();
        kotlin.jvm.internal.n.g(collectionValues, "<get-values>(...)");
        Iterator it = collectionValues.iterator();
        while (it.hasNext()) {
            ((b) it.next()).d();
        }
        b bVar = this.f18915n;
        if (bVar != null) {
            bVar.d();
        }
        C2005g.b bVar2 = (C2005g.b) this.f18914m.remove(Integer.valueOf(owner.hashCode()));
        if (bVar2 != null) {
            this.f18912k.D(bVar2);
        }
    }

    @Override // S1.c, S1.a
    public void onDestroy() {
        super.onDestroy();
        Collection collectionValues = this.f18913l.values();
        kotlin.jvm.internal.n.g(collectionValues, "<get-values>(...)");
        Iterator it = collectionValues.iterator();
        while (it.hasNext()) {
            ((b) it.next()).d();
        }
        this.f18913l.clear();
        this.f18915n = null;
        this.f18918q = null;
        this.f18916o = null;
        this.f18917p.clear();
        Iterator it2 = this.f18914m.entrySet().iterator();
        while (it2.hasNext()) {
            this.f18912k.D((C2005g.b) ((Map.Entry) it2.next()).getValue());
        }
        this.f18914m.clear();
    }

    @Override // S1.c
    protected O2.h q(String clockId) {
        O2.j jVarB;
        O2.j jVarB2;
        kotlin.jvm.internal.n.h(clockId, "clockId");
        O2.h hVarQ = super.q(clockId);
        if (hVarQ != null && (jVarB2 = hVarQ.b()) != null) {
            jVarB2.a(this.f18912k.w());
            jVarB2.g(this.f18912k.v());
        }
        O2.a aVarT = this.f18912k.t();
        if (aVarT != null && hVarQ != null && (jVarB = hVarQ.b()) != null) {
            jVarB.c(aVarT);
        }
        return hVarQ;
    }

    @Override // S1.c
    protected boolean s() {
        return F2.F.f1542t.a(this.f18911j).Y();
    }

    @Override // S1.c
    protected void t() {
        O2.l lVarD;
        O2.m mVarB;
        O2.l lVarD2;
        O2.m mVarB2;
        super.t();
        O2.h hVar = this.f18918q;
        if (hVar != null && (lVarD2 = hVar.d()) != null && (mVarB2 = lVarD2.b()) != null) {
            mVarB2.b();
        }
        O2.h hVar2 = this.f18916o;
        if (hVar2 != null && (lVarD = hVar2.d()) != null && (mVarB = lVarD.b()) != null) {
            mVarB.b();
        }
        Iterator it = this.f18917p.entrySet().iterator();
        while (it.hasNext()) {
            ((O2.h) ((Map.Entry) it.next()).getValue()).c().b().b();
        }
    }
}
