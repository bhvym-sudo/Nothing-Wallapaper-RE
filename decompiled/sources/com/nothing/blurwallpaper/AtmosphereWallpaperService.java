package com.nothing.blurwallpaper;

import F8.AbstractC0816i;
import F8.C0803b0;
import F8.J0;
import F8.L;
import I8.InterfaceC0880f;
import I8.InterfaceC0881g;
import android.app.WallpaperColors;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.Point;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Process;
import android.os.RemoteCallback;
import android.service.wallpaper.WallpaperService;
import android.view.SurfaceHolder;
import androidx.lifecycle.AbstractC1157q;
import androidx.lifecycle.AbstractC1164y;
import androidx.lifecycle.C1165z;
import androidx.lifecycle.InterfaceC1148h;
import androidx.lifecycle.InterfaceC1163x;
import androidx.lifecycle.N;
import com.nothing.blurwallpaper.AtmosphereWallpaperService;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.AbstractC1457h;
import kotlin.jvm.internal.n;
import p079h8.A;
import p079h8.r;
import p129m8.j;
import p166q5.SurfaceHolderCallbackC1667e;
import p166q5.v;
import p219v8.p;

/* JADX INFO: loaded from: classes.dex */
public final class AtmosphereWallpaperService extends WallpaperService implements InterfaceC1163x {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final b f17659v = new b(null);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final C1165z f17660q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private BroadcastReceiver f17661r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private boolean f17662s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final p176r5.b f17663t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final AbstractC1157q f17664u;

    public final class a extends WallpaperService.Engine implements InterfaceC1148h, InterfaceC1163x, com.nothing.blurwallpaper.a.InterfaceC0469a {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private SurfaceHolderCallbackC1667e f17666q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private com.nothing.blurwallpaper.a f17667r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        private com.nothing.blurwallpaper.e f17668s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private com.nothing.blurwallpaper.d f17669t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        private boolean f17670u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        private final C1165z f17671v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        private final long f17672w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        private final int f17673x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        private final HandlerC0466a f17674y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        private final AbstractC1157q f17675z;

        /* JADX INFO: renamed from: com.nothing.blurwallpaper.AtmosphereWallpaperService$a$a, reason: collision with other inner class name */
        public static final class HandlerC0466a extends Handler {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ AtmosphereWallpaperService f17677b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            HandlerC0466a(AtmosphereWallpaperService atmosphereWallpaperService, Looper looper) {
                super(looper);
                this.f17677b = atmosphereWallpaperService;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final void b(AtmosphereWallpaperService atmosphereWallpaperService) {
                atmosphereWallpaperService.f17663t.b(Process.myTid());
            }

            @Override // android.os.Handler
            public void handleMessage(Message msg) {
                n.h(msg, "msg");
                super.handleMessage(msg);
                if (msg.what == a.this.f17673x) {
                    SurfaceHolderCallbackC1667e surfaceHolderCallbackC1667e = a.this.f17666q;
                    if (surfaceHolderCallbackC1667e == null) {
                        n.r("surfaceView");
                        surfaceHolderCallbackC1667e = null;
                    }
                    final AtmosphereWallpaperService atmosphereWallpaperService = this.f17677b;
                    surfaceHolderCallbackC1667e.queueEvent(new Runnable() { // from class: q5.i
                        @Override // java.lang.Runnable
                        public final void run() {
                            AtmosphereWallpaperService.a.HandlerC0466a.b(atmosphereWallpaperService);
                        }
                    });
                }
            }
        }

        public static final class b extends l implements p {

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            int f17678q;

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            final /* synthetic */ InterfaceC1163x f17679r;

            /* JADX INFO: renamed from: s, reason: collision with root package name */
            final /* synthetic */ AbstractC1157q.b f17680s;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            final /* synthetic */ InterfaceC0880f f17681t;

            /* JADX INFO: renamed from: u, reason: collision with root package name */
            final /* synthetic */ a f17682u;

            /* JADX INFO: renamed from: v, reason: collision with root package name */
            final /* synthetic */ AtmosphereWallpaperService f17683v;

            /* JADX INFO: renamed from: com.nothing.blurwallpaper.AtmosphereWallpaperService$a$b$a, reason: collision with other inner class name */
            public static final class C0467a extends l implements p {

                /* JADX INFO: renamed from: q, reason: collision with root package name */
                int f17684q;

                /* JADX INFO: renamed from: r, reason: collision with root package name */
                final /* synthetic */ InterfaceC0880f f17685r;

                /* JADX INFO: renamed from: s, reason: collision with root package name */
                final /* synthetic */ a f17686s;

                /* JADX INFO: renamed from: t, reason: collision with root package name */
                final /* synthetic */ AtmosphereWallpaperService f17687t;

                /* JADX INFO: renamed from: com.nothing.blurwallpaper.AtmosphereWallpaperService$a$b$a$a, reason: collision with other inner class name */
                public static final class C0468a implements InterfaceC0881g {

                    /* JADX INFO: renamed from: q, reason: collision with root package name */
                    final /* synthetic */ a f17688q;

                    /* JADX INFO: renamed from: r, reason: collision with root package name */
                    final /* synthetic */ AtmosphereWallpaperService f17689r;

                    public C0468a(a aVar, AtmosphereWallpaperService atmosphereWallpaperService) {
                        this.f17688q = aVar;
                        this.f17689r = atmosphereWallpaperService;
                    }

                    @Override // I8.InterfaceC0881g
                    public final Object b(Object obj, p129m8.e eVar) {
                        boolean zBooleanValue = ((Boolean) obj).booleanValue();
                        com.nothing.wallpaper.common.log.c.d("BLUR-AtmosphereWallpaperService", "lockScreenStateFlow collect " + zBooleanValue);
                        SurfaceHolderCallbackC1667e surfaceHolderCallbackC1667e = this.f17688q.f17666q;
                        if (surfaceHolderCallbackC1667e == null) {
                            n.r("surfaceView");
                            surfaceHolderCallbackC1667e = null;
                        }
                        surfaceHolderCallbackC1667e.queueEvent(new c(zBooleanValue, this.f17689r, this.f17688q));
                        return A.f21846a;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0467a(InterfaceC0880f interfaceC0880f, p129m8.e eVar, a aVar, AtmosphereWallpaperService atmosphereWallpaperService) {
                    super(2, eVar);
                    this.f17685r = interfaceC0880f;
                    this.f17686s = aVar;
                    this.f17687t = atmosphereWallpaperService;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final p129m8.e create(Object obj, p129m8.e eVar) {
                    return new C0467a(this.f17685r, eVar, this.f17686s, this.f17687t);
                }

                @Override // p219v8.p
                public final Object invoke(L l9, p129m8.e eVar) {
                    return ((C0467a) create(l9, eVar)).invokeSuspend(A.f21846a);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    Object objE = p139n8.b.e();
                    int i10 = this.f17684q;
                    if (i10 == 0) {
                        r.b(obj);
                        InterfaceC0880f interfaceC0880f = this.f17685r;
                        C0468a c0468a = new C0468a(this.f17686s, this.f17687t);
                        this.f17684q = 1;
                        if (interfaceC0880f.a(c0468a, this) == objE) {
                            return objE;
                        }
                    } else {
                        if (i10 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        r.b(obj);
                    }
                    return A.f21846a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(InterfaceC1163x interfaceC1163x, AbstractC1157q.b bVar, InterfaceC0880f interfaceC0880f, p129m8.e eVar, a aVar, AtmosphereWallpaperService atmosphereWallpaperService) {
                super(2, eVar);
                this.f17679r = interfaceC1163x;
                this.f17680s = bVar;
                this.f17681t = interfaceC0880f;
                this.f17682u = aVar;
                this.f17683v = atmosphereWallpaperService;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final p129m8.e create(Object obj, p129m8.e eVar) {
                return new b(this.f17679r, this.f17680s, this.f17681t, eVar, this.f17682u, this.f17683v);
            }

            @Override // p219v8.p
            public final Object invoke(L l9, p129m8.e eVar) {
                return ((b) create(l9, eVar)).invokeSuspend(A.f21846a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object objE = p139n8.b.e();
                int i10 = this.f17678q;
                if (i10 == 0) {
                    r.b(obj);
                    AbstractC1157q lifecycle = this.f17679r.getLifecycle();
                    AbstractC1157q.b bVar = this.f17680s;
                    C0467a c0467a = new C0467a(this.f17681t, null, this.f17682u, this.f17683v);
                    this.f17678q = 1;
                    if (N.a(lifecycle, bVar, c0467a, this) == objE) {
                        return objE;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    r.b(obj);
                }
                return A.f21846a;
            }
        }

        static final class c implements Runnable {

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            final /* synthetic */ boolean f17690q;

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            final /* synthetic */ AtmosphereWallpaperService f17691r;

            /* JADX INFO: renamed from: s, reason: collision with root package name */
            final /* synthetic */ a f17692s;

            c(boolean z9, AtmosphereWallpaperService atmosphereWallpaperService, a aVar) {
                this.f17690q = z9;
                this.f17691r = atmosphereWallpaperService;
                this.f17692s = aVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                if (!this.f17690q && !this.f17691r.f17662s) {
                    this.f17691r.f17662s = true;
                    this.f17691r.f17663t.a(Process.myTid());
                    this.f17692s.f17674y.sendEmptyMessageDelayed(this.f17692s.f17673x, this.f17692s.f17672w);
                }
                com.nothing.blurwallpaper.a aVar = this.f17692s.f17667r;
                SurfaceHolderCallbackC1667e surfaceHolderCallbackC1667e = null;
                if (aVar == null) {
                    n.r("renderer");
                    aVar = null;
                }
                aVar.G(this.f17692s.isPreview());
                com.nothing.blurwallpaper.a aVar2 = this.f17692s.f17667r;
                if (aVar2 == null) {
                    n.r("renderer");
                    aVar2 = null;
                }
                aVar2.D(this.f17690q);
                com.nothing.blurwallpaper.a aVar3 = this.f17692s.f17667r;
                if (aVar3 == null) {
                    n.r("renderer");
                    aVar3 = null;
                }
                aVar3.y();
                com.nothing.blurwallpaper.a aVar4 = this.f17692s.f17667r;
                if (aVar4 == null) {
                    n.r("renderer");
                    aVar4 = null;
                }
                aVar4.z(true ^ this.f17690q);
                SurfaceHolderCallbackC1667e surfaceHolderCallbackC1667e2 = this.f17692s.f17666q;
                if (surfaceHolderCallbackC1667e2 == null) {
                    n.r("surfaceView");
                } else {
                    surfaceHolderCallbackC1667e = surfaceHolderCallbackC1667e2;
                }
                surfaceHolderCallbackC1667e.requestRender();
            }
        }

        static final class d extends l implements p {

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            int f17693q;

            d(p129m8.e eVar) {
                super(2, eVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final p129m8.e create(Object obj, p129m8.e eVar) {
                return a.this.new d(eVar);
            }

            @Override // p219v8.p
            public final Object invoke(L l9, p129m8.e eVar) {
                return ((d) create(l9, eVar)).invokeSuspend(A.f21846a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                p139n8.b.e();
                if (this.f17693q != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                r.b(obj);
                com.nothing.wallpaper.common.log.c.k("BLUR-AtmosphereWallpaperService", "shutdown GL thread.");
                SurfaceHolderCallbackC1667e surfaceHolderCallbackC1667e = a.this.f17666q;
                if (surfaceHolderCallbackC1667e == null) {
                    n.r("surfaceView");
                    surfaceHolderCallbackC1667e = null;
                }
                surfaceHolderCallbackC1667e.a();
                System.gc();
                return A.f21846a;
            }
        }

        static final class e extends l implements p {

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            int f17695q;

            /* JADX INFO: renamed from: s, reason: collision with root package name */
            final /* synthetic */ p219v8.a f17697s;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            e(p219v8.a aVar, p129m8.e eVar) {
                super(2, eVar);
                this.f17697s = aVar;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final void u(p219v8.a aVar, a aVar2) {
                com.nothing.wallpaper.common.log.c.k("BLUR-AtmosphereWallpaperService", "rendererPrepared finishDrawing");
                aVar.invoke();
                com.nothing.wallpaper.common.log.c.k("BLUR-AtmosphereWallpaperService", "rendererPrepared reportEngineShown=false");
                aVar2.reportEngineShown(false);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final p129m8.e create(Object obj, p129m8.e eVar) {
                return a.this.new e(this.f17697s, eVar);
            }

            @Override // p219v8.p
            public final Object invoke(L l9, p129m8.e eVar) {
                return ((e) create(l9, eVar)).invokeSuspend(A.f21846a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                p139n8.b.e();
                if (this.f17695q != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                r.b(obj);
                SurfaceHolderCallbackC1667e surfaceHolderCallbackC1667e = a.this.f17666q;
                if (surfaceHolderCallbackC1667e == null) {
                    n.r("surfaceView");
                    surfaceHolderCallbackC1667e = null;
                }
                SurfaceHolder surfaceHolder = a.this.getSurfaceHolder();
                final p219v8.a aVar = this.f17697s;
                final a aVar2 = a.this;
                surfaceHolderCallbackC1667e.surfaceRedrawNeededAsync(surfaceHolder, new Runnable() { // from class: com.nothing.blurwallpaper.b
                    @Override // java.lang.Runnable
                    public final void run() {
                        AtmosphereWallpaperService.a.e.u(aVar, aVar2);
                    }
                });
                return A.f21846a;
            }
        }

        public a() {
            super(AtmosphereWallpaperService.this);
            C1165z c1165z = new C1165z(this);
            this.f17671v = c1165z;
            this.f17672w = 3500L;
            this.f17673x = 1;
            this.f17674y = new HandlerC0466a(AtmosphereWallpaperService.this, Looper.getMainLooper());
            this.f17675z = c1165z;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void r(a aVar) {
            com.nothing.blurwallpaper.a aVar2 = aVar.f17667r;
            if (aVar2 == null) {
                n.r("renderer");
                aVar2 = null;
            }
            aVar2.o();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void s(a aVar) {
            com.nothing.wallpaper.common.log.c.k("BLUR-AtmosphereWallpaperService", "destroy native.");
            com.nothing.blurwallpaper.a aVar2 = aVar.f17667r;
            if (aVar2 == null) {
                n.r("renderer");
                aVar2 = null;
            }
            aVar2.p();
            AbstractC0816i.d(AbstractC1164y.a(aVar), J0.f1819r, null, aVar.new d(null), 2, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void t(p219v8.a aVar, a aVar2) {
            aVar.invoke();
            SurfaceHolderCallbackC1667e surfaceHolderCallbackC1667e = aVar2.f17666q;
            if (surfaceHolderCallbackC1667e == null) {
                n.r("surfaceView");
                surfaceHolderCallbackC1667e = null;
            }
            surfaceHolderCallbackC1667e.requestRender();
        }

        @Override // com.nothing.blurwallpaper.a.InterfaceC0469a
        public void a() {
            SurfaceHolderCallbackC1667e surfaceHolderCallbackC1667e = this.f17666q;
            if (surfaceHolderCallbackC1667e == null) {
                n.r("surfaceView");
                surfaceHolderCallbackC1667e = null;
            }
            surfaceHolderCallbackC1667e.requestRender();
        }

        @Override // com.nothing.blurwallpaper.a.InterfaceC0469a
        public void c(final p219v8.a event) {
            n.h(event, "event");
            SurfaceHolderCallbackC1667e surfaceHolderCallbackC1667e = this.f17666q;
            if (surfaceHolderCallbackC1667e == null) {
                n.r("surfaceView");
                surfaceHolderCallbackC1667e = null;
            }
            surfaceHolderCallbackC1667e.queueEvent(new Runnable() { // from class: q5.h
                @Override // java.lang.Runnable
                public final void run() {
                    AtmosphereWallpaperService.a.t(event, this);
                }
            });
        }

        @Override // com.nothing.blurwallpaper.a.InterfaceC0469a
        public void d(p219v8.a event) {
            n.h(event, "event");
            AbstractC0816i.d(AbstractC1164y.a(this), C0803b0.b(), null, new e(event, null), 2, null);
        }

        @Override // androidx.lifecycle.InterfaceC1163x
        public AbstractC1157q getLifecycle() {
            return this.f17675z;
        }

        @Override // android.service.wallpaper.WallpaperService.Engine
        public Bundle onCommand(String str, int i10, int i11, int i12, Bundle bundle, boolean z9) {
            if (n.d("android.wallpaper.tap", str)) {
                int i13 = bundle != null ? bundle.getInt("preview_action", -1) : -1;
                int i14 = bundle != null ? bundle.getInt("preview_page", 0) : 0;
                com.nothing.blurwallpaper.e eVar = null;
                String string = bundle != null ? bundle.getString("preview_uri", null) : null;
                Boolean boolValueOf = bundle != null ? Boolean.valueOf(bundle.getBoolean("preview_play_animation", true)) : null;
                Boolean boolValueOf2 = bundle != null ? Boolean.valueOf(bundle.getBoolean("preview_same_as_home", false)) : null;
                RemoteCallback remoteCallback = bundle != null ? (RemoteCallback) bundle.getParcelable("preview_frame_callback", RemoteCallback.class) : null;
                if (i13 != -1) {
                    com.nothing.wallpaper.common.log.c.k("BLUR-AtmosphereWallpaperService", "onCommand: previewAction=" + i13 + ", previewPage=" + i14 + ", previewURI=" + string + ", playAnimation=" + boolValueOf + ", saveAsHome=" + boolValueOf2 + ", includeCallback=" + (remoteCallback != null));
                    com.nothing.blurwallpaper.e eVar2 = this.f17668s;
                    if (eVar2 == null) {
                        n.r("renderController");
                        eVar2 = null;
                    }
                    if (!eVar2.A()) {
                        com.nothing.blurwallpaper.e eVar3 = this.f17668s;
                        if (eVar3 == null) {
                            n.r("renderController");
                            eVar3 = null;
                        }
                        eVar3.O(true);
                    }
                    if (i13 == c.PREVIEW.ordinal()) {
                        com.nothing.blurwallpaper.e eVar4 = this.f17668s;
                        if (eVar4 == null) {
                            n.r("renderController");
                            eVar4 = null;
                        }
                        boolean zIsPreview = isPreview();
                        com.nothing.blurwallpaper.e eVar5 = this.f17668s;
                        if (eVar5 == null) {
                            n.r("renderController");
                            eVar5 = null;
                        }
                        com.nothing.wallpaper.common.log.c.d("BLUR-AtmosphereWallpaperService", "onCommand: " + eVar4 + " " + zIsPreview + " start loadCustomFinal size: " + eVar5.x());
                        if (boolValueOf != null) {
                            boolean zBooleanValue = boolValueOf.booleanValue();
                            com.nothing.blurwallpaper.e eVar6 = this.f17668s;
                            if (eVar6 == null) {
                                n.r("renderController");
                                eVar6 = null;
                            }
                            eVar6.P(zBooleanValue);
                        }
                        if (boolValueOf2 != null) {
                            boolean zBooleanValue2 = boolValueOf2.booleanValue();
                            com.nothing.blurwallpaper.e eVar7 = this.f17668s;
                            if (eVar7 == null) {
                                n.r("renderController");
                                eVar7 = null;
                            }
                            eVar7.R(zBooleanValue2);
                        }
                        if (remoteCallback != null) {
                            com.nothing.blurwallpaper.e eVar8 = this.f17668s;
                            if (eVar8 == null) {
                                n.r("renderController");
                                eVar8 = null;
                            }
                            eVar8.N(remoteCallback);
                        }
                        com.nothing.blurwallpaper.e eVar9 = this.f17668s;
                        if (eVar9 == null) {
                            n.r("renderController");
                        } else {
                            eVar = eVar9;
                        }
                        eVar.C(i14 == d.LOCK_SCREEN.ordinal());
                    } else if (i13 == c.EDIT_PREVIEW.ordinal() && string != null) {
                        com.nothing.blurwallpaper.e eVar10 = this.f17668s;
                        if (eVar10 == null) {
                            n.r("renderController");
                        } else {
                            eVar = eVar10;
                        }
                        eVar.G(string, i14 == d.LOCK_SCREEN.ordinal());
                    }
                }
            }
            return new Bundle();
        }

        @Override // android.service.wallpaper.WallpaperService.Engine
        public WallpaperColors onComputeColors() {
            if (isPreview()) {
                return super.onComputeColors();
            }
            v vVar = v.f25076a;
            Context applicationContext = AtmosphereWallpaperService.this.getApplicationContext();
            n.g(applicationContext, "getApplicationContext(...)");
            return vVar.c(applicationContext);
        }

        @Override // android.service.wallpaper.WallpaperService.Engine
        public void onCreate(SurfaceHolder surfaceHolder) {
            com.nothing.wallpaper.common.log.c.d("BLUR-AtmosphereWallpaperService", "AtmosphereEngine onCreate: " + this + ", isPreview=" + isPreview());
            super.onCreate(surfaceHolder);
            SurfaceHolderCallbackC1667e surfaceHolderCallbackC1667e = new SurfaceHolderCallbackC1667e(AtmosphereWallpaperService.this);
            this.f17666q = surfaceHolderCallbackC1667e;
            surfaceHolderCallbackC1667e.setSurfaceHolder(surfaceHolder);
            SurfaceHolderCallbackC1667e surfaceHolderCallbackC1667e2 = this.f17666q;
            com.nothing.blurwallpaper.e eVar = null;
            if (surfaceHolderCallbackC1667e2 == null) {
                n.r("surfaceView");
                surfaceHolderCallbackC1667e2 = null;
            }
            surfaceHolderCallbackC1667e2.setEGLContextClientVersion(3);
            SurfaceHolderCallbackC1667e surfaceHolderCallbackC1667e3 = this.f17666q;
            if (surfaceHolderCallbackC1667e3 == null) {
                n.r("surfaceView");
                surfaceHolderCallbackC1667e3 = null;
            }
            surfaceHolderCallbackC1667e3.setDebugFlags(3);
            AtmosphereWallpaperService atmosphereWallpaperService = AtmosphereWallpaperService.this;
            boolean zIsPreview = isPreview();
            Context displayContext = getDisplayContext();
            this.f17667r = new com.nothing.blurwallpaper.a(atmosphereWallpaperService, this, zIsPreview, displayContext != null ? displayContext.getDisplay() : null);
            AtmosphereWallpaperService atmosphereWallpaperService2 = AtmosphereWallpaperService.this;
            com.nothing.blurwallpaper.a aVar = this.f17667r;
            if (aVar == null) {
                n.r("renderer");
                aVar = null;
            }
            com.nothing.blurwallpaper.e eVar2 = new com.nothing.blurwallpaper.e(atmosphereWallpaperService2, aVar, this, isPreview());
            this.f17668s = eVar2;
            eVar2.x().set(getDesiredMinimumWidth(), getDesiredMinimumHeight());
            com.nothing.blurwallpaper.e eVar3 = this.f17668s;
            if (eVar3 == null) {
                n.r("renderController");
                eVar3 = null;
            }
            com.nothing.blurwallpaper.e eVar4 = this.f17668s;
            if (eVar4 == null) {
                n.r("renderController");
                eVar4 = null;
            }
            com.nothing.wallpaper.common.log.c.d("BLUR-AtmosphereWallpaperService", "onCreate:renderController " + eVar3 + " ,reqSize=" + eVar4.x());
            C1165z c1165z = this.f17671v;
            com.nothing.blurwallpaper.e eVar5 = this.f17668s;
            if (eVar5 == null) {
                n.r("renderController");
                eVar5 = null;
            }
            c1165z.a(eVar5);
            SurfaceHolderCallbackC1667e surfaceHolderCallbackC1667e4 = this.f17666q;
            if (surfaceHolderCallbackC1667e4 == null) {
                n.r("surfaceView");
                surfaceHolderCallbackC1667e4 = null;
            }
            com.nothing.blurwallpaper.a aVar2 = this.f17667r;
            if (aVar2 == null) {
                n.r("renderer");
                aVar2 = null;
            }
            surfaceHolderCallbackC1667e4.setRenderer(aVar2);
            SurfaceHolderCallbackC1667e surfaceHolderCallbackC1667e5 = this.f17666q;
            if (surfaceHolderCallbackC1667e5 == null) {
                n.r("surfaceView");
                surfaceHolderCallbackC1667e5 = null;
            }
            surfaceHolderCallbackC1667e5.setRenderMode(0);
            SurfaceHolderCallbackC1667e surfaceHolderCallbackC1667e6 = this.f17666q;
            if (surfaceHolderCallbackC1667e6 == null) {
                n.r("surfaceView");
                surfaceHolderCallbackC1667e6 = null;
            }
            surfaceHolderCallbackC1667e6.requestRender();
            SurfaceHolderCallbackC1667e surfaceHolderCallbackC1667e7 = this.f17666q;
            if (surfaceHolderCallbackC1667e7 == null) {
                n.r("surfaceView");
                surfaceHolderCallbackC1667e7 = null;
            }
            surfaceHolderCallbackC1667e7.queueEvent(new Runnable() { // from class: q5.f
                @Override // java.lang.Runnable
                public final void run() {
                    AtmosphereWallpaperService.a.r(this.f25042q);
                }
            });
            this.f17671v.i(AbstractC1157q.a.ON_CREATE);
            com.nothing.blurwallpaper.d dVar = new com.nothing.blurwallpaper.d(AtmosphereWallpaperService.this, this);
            this.f17669t = dVar;
            this.f17671v.a(dVar);
            AtmosphereWallpaperService.this.f17660q.a(this);
            com.nothing.blurwallpaper.e eVar6 = this.f17668s;
            if (eVar6 == null) {
                n.r("renderController");
            } else {
                eVar = eVar6;
            }
            AbstractC0816i.d(AbstractC1164y.a(this), j.f23252q, null, new b(this, AbstractC1157q.b.STARTED, eVar.u(), null, this, AtmosphereWallpaperService.this), 2, null);
            this.f17670u = true;
        }

        @Override // android.service.wallpaper.WallpaperService.Engine
        public void onDestroy() {
            if (!this.f17670u) {
                com.nothing.wallpaper.common.log.c.f("BLUR-AtmosphereWallpaperService", "Engine.onDestroy: onDestroy but not init engine.");
                return;
            }
            com.nothing.wallpaper.common.log.c.d("BLUR-AtmosphereWallpaperService", "onDestroy: " + this);
            SurfaceHolderCallbackC1667e surfaceHolderCallbackC1667e = null;
            this.f17674y.removeCallbacksAndMessages(null);
            AtmosphereWallpaperService.this.f17660q.d(this);
            this.f17671v.i(AbstractC1157q.a.ON_DESTROY);
            C1165z c1165z = this.f17671v;
            com.nothing.blurwallpaper.d dVar = this.f17669t;
            if (dVar == null) {
                n.r("lockscreenObserver");
                dVar = null;
            }
            c1165z.d(dVar);
            C1165z c1165z2 = this.f17671v;
            com.nothing.blurwallpaper.e eVar = this.f17668s;
            if (eVar == null) {
                n.r("renderController");
                eVar = null;
            }
            c1165z2.d(eVar);
            SurfaceHolderCallbackC1667e surfaceHolderCallbackC1667e2 = this.f17666q;
            if (surfaceHolderCallbackC1667e2 == null) {
                n.r("surfaceView");
            } else {
                surfaceHolderCallbackC1667e = surfaceHolderCallbackC1667e2;
            }
            surfaceHolderCallbackC1667e.queueEvent(new Runnable() { // from class: q5.g
                @Override // java.lang.Runnable
                public final void run() {
                    AtmosphereWallpaperService.a.s(this.f25043q);
                }
            });
            super.onDestroy();
        }

        @Override // androidx.lifecycle.InterfaceC1148h
        public void onStart(InterfaceC1163x owner) {
            n.h(owner, "owner");
            super.onStart(owner);
            this.f17671v.i(AbstractC1157q.a.ON_START);
        }

        @Override // android.service.wallpaper.WallpaperService.Engine
        public void onSurfaceChanged(SurfaceHolder surfaceHolder, int i10, int i11, int i12) {
            super.onSurfaceChanged(surfaceHolder, i10, i11, i12);
            com.nothing.blurwallpaper.e eVar = null;
            if (!isPreview()) {
                com.nothing.blurwallpaper.e eVar2 = this.f17668s;
                if (eVar2 == null) {
                    n.r("renderController");
                    eVar2 = null;
                }
                eVar2.Q(new Point(i11, i12));
            }
            com.nothing.blurwallpaper.e eVar3 = this.f17668s;
            if (eVar3 == null) {
                n.r("renderController");
            } else {
                eVar = eVar3;
            }
            com.nothing.wallpaper.common.log.c.d("BLUR-AtmosphereWallpaperService", "Engine.onSurfaceChanged: " + eVar + " " + isPreview() + " , size[" + i11 + "," + i12 + "]");
        }

        @Override // android.service.wallpaper.WallpaperService.Engine
        public void onSurfaceCreated(SurfaceHolder holder) {
            n.h(holder, "holder");
            com.nothing.wallpaper.common.log.c.d("BLUR-AtmosphereWallpaperService", "AtmosphereEngine onSurfaceCreated: " + this + ", holder=" + holder + ", isPreview=" + isPreview());
            super.onSurfaceCreated(holder);
        }

        @Override // android.service.wallpaper.WallpaperService.Engine
        public void onVisibilityChanged(boolean z9) {
            com.nothing.wallpaper.common.log.c.d("BLUR-AtmosphereWallpaperService", "onVisibilityChanged: " + z9);
            super.onVisibilityChanged(z9);
        }

        @Override // android.service.wallpaper.WallpaperService.Engine
        public void onWallpaperFlagsChanged(int i10) {
            super.onWallpaperFlagsChanged(i10);
            com.nothing.wallpaper.common.log.c.d("BLUR-AtmosphereWallpaperService", "onWallpaperFlagsChanged which=" + i10);
        }

        public final boolean p() {
            com.nothing.blurwallpaper.e eVar = this.f17668s;
            if (eVar == null) {
                n.r("renderController");
                eVar = null;
            }
            return ((Boolean) eVar.u().getValue()).booleanValue();
        }

        public final void q(boolean z9) {
            if (isPreview()) {
                return;
            }
            com.nothing.blurwallpaper.e eVar = this.f17668s;
            if (eVar == null) {
                n.r("renderController");
                eVar = null;
            }
            eVar.u().setValue(Boolean.valueOf(z9));
        }

        public boolean shouldWaitForEngineShown() {
            com.nothing.blurwallpaper.a aVar = this.f17667r;
            if (aVar == null) {
                n.r("renderer");
                aVar = null;
            }
            return !aVar.u();
        }
    }

    public static final class b {
        public /* synthetic */ b(AbstractC1457h abstractC1457h) {
            this();
        }

        private b() {
        }
    }

    public enum c {
        PREVIEW,
        EDIT_PREVIEW;


        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private static final /* synthetic */ p149o8.a f17701t = p149o8.b.a(d());
    }

    public enum d {
        LOCK_SCREEN,
        HOME_SCREEN;


        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private static final /* synthetic */ p149o8.a f17705t = p149o8.b.a(d());
    }

    public static final class e extends BroadcastReceiver {
        e() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            n.h(context, "context");
            n.h(intent, "intent");
            AtmosphereWallpaperService.this.f17660q.i(AbstractC1157q.a.ON_START);
            AtmosphereWallpaperService.this.unregisterReceiver(this);
            AtmosphereWallpaperService.this.f17661r = null;
        }
    }

    public AtmosphereWallpaperService() {
        C1165z c1165z = new C1165z(this);
        this.f17660q = c1165z;
        this.f17663t = new p176r5.b();
        this.f17664u = c1165z;
    }

    @Override // androidx.lifecycle.InterfaceC1163x
    public AbstractC1157q getLifecycle() {
        return this.f17664u;
    }

    @Override // android.service.wallpaper.WallpaperService, android.app.Service
    public void onCreate() {
        super.onCreate();
        com.nothing.wallpaper.common.log.c.d("BLUR-AtmosphereWallpaperService", "onCreate: " + this);
        h.f17835a.c(this);
        this.f17660q.i(AbstractC1157q.a.ON_CREATE);
        if (p231x0.l.a(this)) {
            this.f17660q.i(AbstractC1157q.a.ON_START);
            return;
        }
        this.f17661r = new e();
        registerReceiver(this.f17661r, new IntentFilter("android.intent.action.USER_UNLOCKED"));
    }

    @Override // android.service.wallpaper.WallpaperService
    public WallpaperService.Engine onCreateEngine() {
        com.nothing.wallpaper.common.log.c.d("BLUR-AtmosphereWallpaperService", "onCreateEngine: " + this);
        return new a();
    }

    @Override // android.service.wallpaper.WallpaperService, android.app.Service
    public void onDestroy() {
        BroadcastReceiver broadcastReceiver = this.f17661r;
        if (broadcastReceiver != null) {
            unregisterReceiver(broadcastReceiver);
        }
        this.f17660q.i(AbstractC1157q.a.ON_DESTROY);
        super.onDestroy();
    }
}
