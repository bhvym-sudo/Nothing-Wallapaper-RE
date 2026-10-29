package com.nothing.launcher.card;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Process;
import android.os.UserHandle;
import android.util.Size;
import kotlin.jvm.internal.AbstractC1457h;
import p079h8.v;

/* JADX INFO: loaded from: classes2.dex */
public final class j extends F5.m {

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public static final a f18121Z = new a(null);

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    private int f18122Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    private int f18123R;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    private int f18124S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    private int f18125T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    private int f18126U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    private int f18127V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    private int f18128W;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    private Drawable f18129X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    private String f18130Y;

    public static final class a {
        public /* synthetic */ a(AbstractC1457h abstractC1457h) {
            this();
        }

        public final j a(Context context, F5.m cardInfo) {
            kotlin.jvm.internal.n.h(context, "context");
            kotlin.jvm.internal.n.h(cardInfo, "cardInfo");
            if (cardInfo instanceof j) {
                return (j) cardInfo;
            }
            j jVar = new j();
            jVar.s0(cardInfo);
            jVar.E0();
            jVar.f18128W = context.getPackageManager().getApplicationInfo(cardInfo.H(), PackageManager.ApplicationInfoFlags.of(0L)).icon;
            return jVar;
        }

        private a() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void E0() {
        int iL = l();
        int iK = k();
        int iF = B8.h.f(0, y());
        int iF2 = B8.h.f(0, w());
        int i10 = u() > 0 ? B8.h.i(iF, u()) : iF;
        int i11 = t() > 0 ? B8.h.i(iF2, t()) : iF2;
        this.f18124S = B8.h.i(iL, iF);
        this.f18125T = B8.h.i(iK, iF2);
        this.f18126U = i10;
        this.f18127V = i11;
        this.f18122Q = iL;
        this.f18123R = iK;
    }

    private final Drawable G0(Context context) {
        Drawable drawable = this.f18129X;
        return drawable == null ? F0(context, 0, J()) : drawable;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void s0(F5.m mVar) {
        Q(mVar.e());
        j0(mVar.H());
        R(mVar.f());
        k0(mVar.J());
        O(mVar.b());
        b0(mVar.s());
        U(mVar.l());
        T(mVar.k());
        g0(mVar.y());
        e0(mVar.w());
        d0(mVar.u());
        c0(mVar.t());
        S(mVar.j());
        P(mVar.d());
        V(mVar.m());
        m0(mVar.L());
        f0(mVar.x());
        l0(mVar.K());
        W(mVar.n());
        X(mVar.o());
        Y(mVar.p());
        Z(mVar.q());
        a0(mVar.r());
        h0(mVar.A());
        i0(mVar.C());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void u0(Drawable drawable, int i10, int i11, float f10, Canvas canvas) {
        drawable.setBounds(0, 0, i10, i11);
        int iSave = canvas.save();
        canvas.scale(f10, f10);
        drawable.draw(canvas);
        canvas.restoreToCount(iSave);
    }

    public final int A0() {
        return this.f18125T;
    }

    public final int B0() {
        return this.f18122Q;
    }

    public final int C0() {
        return this.f18123R;
    }

    public final UserHandle D0() {
        UserHandle userHandleMyUserHandle = Process.myUserHandle();
        kotlin.jvm.internal.n.g(userHandleMyUserHandle, "myUserHandle(...)");
        return userHandleMyUserHandle;
    }

    public final Drawable F0(Context context, int i10, int i11) {
        Object objB;
        kotlin.jvm.internal.n.h(context, "context");
        try {
            h8.q.a aVar = p079h8.q.f21862r;
            Resources resourcesForApplication = context.getPackageManager().getResourcesForApplication(H());
            kotlin.jvm.internal.n.g(resourcesForApplication, "getResourcesForApplication(...)");
            objB = p079h8.q.b(resourcesForApplication.getDrawableForDensity(i11, i10, null));
        } catch (Throwable th) {
            h8.q.a aVar2 = p079h8.q.f21862r;
            objB = p079h8.q.b(p079h8.r.a(th));
        }
        return (Drawable) (p079h8.q.f(objB) ? null : objB);
    }

    public final void H0(String str) {
        this.f18130Y = str;
    }

    public final void I0(int i10) {
        this.f18124S = i10;
    }

    public final void J0(int i10) {
        this.f18125T = i10;
    }

    public final void K0(Drawable drawable) {
        this.f18129X = drawable;
    }

    public final void L0(int i10) {
        this.f18122Q = i10;
    }

    public final void M0(int i10) {
        this.f18123R = i10;
    }

    public final void r0(j cardInfo) {
        kotlin.jvm.internal.n.h(cardInfo, "cardInfo");
        s0(cardInfo);
        this.f18124S = cardInfo.f18124S;
        this.f18125T = cardInfo.f18125T;
        this.f18122Q = cardInfo.f18122Q;
        this.f18123R = cardInfo.f18123R;
        int i10 = cardInfo.f18127V;
        this.f18126U = i10;
        this.f18127V = i10;
    }

    public final Bitmap t0(Context context, Rect size) {
        final Drawable drawableMutate;
        p079h8.o oVarA;
        kotlin.jvm.internal.n.h(context, "context");
        kotlin.jvm.internal.n.h(size, "size");
        Drawable drawableG0 = G0(context);
        if (drawableG0 == null || (drawableMutate = drawableG0.mutate()) == null) {
            return null;
        }
        if (drawableMutate.getIntrinsicWidth() <= 0 || drawableMutate.getIntrinsicHeight() <= 0) {
            Size sizeA = V5.a.a(context, this.f18122Q, this.f18123R);
            oVarA = v.a(Integer.valueOf(sizeA.getWidth()), Integer.valueOf(sizeA.getHeight()));
        } else {
            oVarA = v.a(Integer.valueOf(drawableMutate.getIntrinsicWidth()), Integer.valueOf(drawableMutate.getIntrinsicHeight()));
        }
        final int iIntValue = ((Number) oVarA.a()).intValue();
        final int iIntValue2 = ((Number) oVarA.b()).intValue();
        final float fMin = Math.min(size.width() / iIntValue, size.height() / iIntValue2);
        return B2.a.c(size.width(), size.height(), new B2.a() { // from class: com.nothing.launcher.card.i
            @Override // B2.a
            public final void b(Canvas canvas) {
                j.u0(drawableMutate, iIntValue, iIntValue2, fMin, canvas);
            }
        });
    }

    public final ComponentName v0() {
        ComponentName componentNameK = K();
        kotlin.jvm.internal.n.e(componentNameK);
        return componentNameK;
    }

    public final String w0() {
        return this.f18130Y;
    }

    public final String x0(Context context) {
        kotlin.jvm.internal.n.h(context, "context");
        String strI = this.f18130Y;
        if (strI == null) {
            strI = I(context);
            if (strI.length() <= 0) {
                strI = null;
            }
            if (strI == null) {
                return g(context);
            }
        }
        return strI;
    }

    public final int y0() {
        return this.f18128W;
    }

    public final int z0() {
        return this.f18124S;
    }
}
