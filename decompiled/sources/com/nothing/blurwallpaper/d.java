package com.nothing.blurwallpaper;

import F8.AbstractC0816i;
import F8.InterfaceC0846x0;
import F8.L;
import F8.W;
import android.animation.ValueAnimator;
import android.app.KeyguardManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import androidx.lifecycle.AbstractC1164y;
import androidx.lifecycle.InterfaceC1148h;
import androidx.lifecycle.InterfaceC1163x;
import com.nothing.blurwallpaper.d;
import com.nothing.kafka.EventObserver;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.AbstractC1457h;
import kotlin.jvm.internal.n;
import p079h8.A;
import p079h8.i;
import p079h8.r;
import p089i8.C1438l;
import p219v8.p;

/* JADX INFO: loaded from: classes.dex */
public final class d implements InterfaceC1148h {

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public static final a f17750D = new a(null);

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private static final boolean f17751E;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private final p079h8.h f17752A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private final c f17753B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final C0472d f17754C;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final Context f17755q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final AtmosphereWallpaperService.a f17756r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private InterfaceC1163x f17757s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private b f17758t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private InterfaceC0846x0 f17759u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private InterfaceC0846x0 f17760v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private C1438l f17761w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private final p079h8.h f17762x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private final p079h8.h f17763y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private final p079h8.h f17764z;

    public static final class a {
        public /* synthetic */ a(AbstractC1457h abstractC1457h) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean b(Integer num) {
            if (num != null && num.intValue() == 0) {
                return true;
            }
            return num != null && num.intValue() == 1;
        }

        private a() {
        }
    }

    public final class b extends BroadcastReceiver {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final h.a f17765a = new h.a();

        static final class a extends l implements p {

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            int f17767q;

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            final /* synthetic */ d f17768r;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(d dVar, p129m8.e eVar) {
                super(2, eVar);
                this.f17768r = dVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final p129m8.e create(Object obj, p129m8.e eVar) {
                return new a(this.f17768r, eVar);
            }

            @Override // p219v8.p
            public final Object invoke(L l9, p129m8.e eVar) {
                return ((a) create(l9, eVar)).invokeSuspend(A.f21846a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object objE = p139n8.b.e();
                int i10 = this.f17767q;
                if (i10 == 0) {
                    r.b(obj);
                    if (ValueAnimator.areAnimatorsEnabled()) {
                        long durationScale = (long) (500 * ValueAnimator.getDurationScale());
                        this.f17767q = 1;
                        if (W.b(durationScale, this) == objE) {
                            return objE;
                        }
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    r.b(obj);
                }
                this.f17768r.w(true);
                return A.f21846a;
            }
        }

        /* JADX INFO: renamed from: com.nothing.blurwallpaper.d$b$b, reason: collision with other inner class name */
        static final class C0471b extends l implements p {

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            int f17769q;

            C0471b(p129m8.e eVar) {
                super(2, eVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final p129m8.e create(Object obj, p129m8.e eVar) {
                return b.this.new C0471b(eVar);
            }

            @Override // p219v8.p
            public final Object invoke(L l9, p129m8.e eVar) {
                return ((C0471b) create(l9, eVar)).invokeSuspend(A.f21846a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object objE = p139n8.b.e();
                int i10 = this.f17769q;
                if (i10 == 0) {
                    r.b(obj);
                    this.f17769q = 1;
                    if (W.b(200L, this) == objE) {
                        return objE;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    r.b(obj);
                }
                b.this.c();
                return A.f21846a;
            }
        }

        public b() {
        }

        private final void b() {
            InterfaceC0846x0 interfaceC0846x0 = d.this.f17759u;
            if (interfaceC0846x0 != null) {
                InterfaceC0846x0.a.a(interfaceC0846x0, null, 1, null);
            }
            InterfaceC0846x0 interfaceC0846x1 = d.this.f17760v;
            if (interfaceC0846x1 != null) {
                InterfaceC0846x0.a.a(interfaceC0846x1, null, 1, null);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean c() {
            if (d.this.p().isKeyguardLocked()) {
                return false;
            }
            com.nothing.wallpaper.common.log.c.d("BLUR-LockscreenObserver", "KeyguardManager.isKeyguardLocked = false");
            d.this.w(false);
            return true;
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            n.h(context, "context");
            com.nothing.wallpaper.common.log.c.k("BLUR-LockscreenObserver", "onReceive: " + this + " " + (intent != null ? intent.getAction() : null));
            String action = intent != null ? intent.getAction() : null;
            if (action != null) {
                int iHashCode = action.hashCode();
                if (iHashCode == -2128145023) {
                    if (action.equals("android.intent.action.SCREEN_OFF")) {
                        d.this.f17761w.addFirst(2);
                        this.f17765a.a();
                        b();
                        d dVar = d.this;
                        InterfaceC1163x interfaceC1163x = dVar.f17757s;
                        if (interfaceC1163x == null) {
                            n.r("owner");
                            interfaceC1163x = null;
                        }
                        dVar.f17759u = AbstractC0816i.d(AbstractC1164y.a(interfaceC1163x), null, null, new a(d.this, null), 3, null);
                        return;
                    }
                    return;
                }
                boolean z9 = false;
                if (iHashCode != -1454123155) {
                    if (iHashCode == 1656375523 && action.equals("com.nothing.systemui.NT_USER_PRESENT")) {
                        d.this.f17761w.addFirst(0);
                        b();
                        d.this.w(false);
                        return;
                    }
                    return;
                }
                if (action.equals("android.intent.action.SCREEN_ON")) {
                    b();
                    if (this.f17765a.a()) {
                        d dVar2 = d.this;
                        dVar2.w(dVar2.p().isKeyguardLocked());
                        com.nothing.wallpaper.common.log.c.d("BLUR-LockscreenObserver", "The time interval between the screen off and on is less than 450, ignoring this event.");
                        return;
                    }
                    a aVar = d.f17750D;
                    if (aVar.b((Integer) d.this.f17761w.t()) && aVar.b((Integer) d.this.f17761w.t())) {
                        z9 = true;
                    }
                    d.this.f17761w.clear();
                    if (z9) {
                        com.nothing.wallpaper.common.log.c.o("BLUR-LockscreenObserver", "The SCREEN_ON broadcast received after unlock event that is too late, we ignore it.");
                        return;
                    }
                    d.this.w(true);
                    if (c()) {
                        return;
                    }
                    d dVar3 = d.this;
                    InterfaceC1163x interfaceC1163x2 = dVar3.f17757s;
                    if (interfaceC1163x2 == null) {
                        n.r("owner");
                        interfaceC1163x2 = null;
                    }
                    dVar3.f17760v = AbstractC0816i.d(AbstractC1164y.a(interfaceC1163x2), null, null, new C0471b(null), 3, null);
                }
            }
        }
    }

    public static final class c implements EventObserver.EventCallback {
        c() {
        }

        public void updateEvent(String str) {
            if (str == null || str.length() == 0) {
                return;
            }
            boolean zD = n.d(str, "true");
            d.this.f17761w.addFirst(Integer.valueOf(zD ? 2 : 1));
            com.nothing.wallpaper.common.log.c.k("BLUR-LockscreenObserver", "EventObserver.EventCallback.updateEvent nt_lockscreen_show isShowLockscreen = " + zD);
            d.this.w(zD);
        }
    }

    /* JADX INFO: renamed from: com.nothing.blurwallpaper.d$d, reason: collision with other inner class name */
    public static final class C0472d implements EventObserver.EventCallback {
        C0472d() {
        }

        public void updateEvent(String str) {
            if (str == null || str.length() == 0) {
                return;
            }
            boolean zD = n.d(str, "true");
            d.this.f17761w.addFirst(Integer.valueOf(zD ? 0 : 2));
            com.nothing.wallpaper.common.log.c.k("BLUR-LockscreenObserver", "EventObserver.EventCallback.updateEvent nt_lockscreen_unlocked isUnlocked = " + zD);
            d.this.w(zD ^ true);
        }
    }

    static {
        f17751E = Build.VERSION.SDK_INT >= 36;
    }

    public d(Context context, AtmosphereWallpaperService.a engine) {
        n.h(context, "context");
        n.h(engine, "engine");
        this.f17755q = context;
        this.f17756r = engine;
        this.f17761w = new C1438l(2);
        this.f17762x = i.b(new p219v8.a() { // from class: q5.r
            @Override // p219v8.a
            public final Object invoke() {
                return d.t(this.f25073q);
            }
        });
        this.f17763y = i.b(new p219v8.a() { // from class: q5.s
            @Override // p219v8.a
            public final Object invoke() {
                return d.v();
            }
        });
        this.f17764z = i.b(new p219v8.a() { // from class: q5.t
            @Override // p219v8.a
            public final Object invoke() {
                return d.u(this.f25074q);
            }
        });
        this.f17752A = i.b(new p219v8.a() { // from class: q5.u
            @Override // p219v8.a
            public final Object invoke() {
                return d.x(this.f25075q);
            }
        });
        this.f17753B = new c();
        this.f17754C = new C0472d();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final KeyguardManager p() {
        return (KeyguardManager) this.f17762x.getValue();
    }

    private final EventObserver q() {
        return (EventObserver) this.f17764z.getValue();
    }

    private final Handler r() {
        return (Handler) this.f17763y.getValue();
    }

    private final EventObserver s() {
        return (EventObserver) this.f17752A.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final KeyguardManager t(d dVar) {
        Object systemService = dVar.f17755q.getSystemService("keyguard");
        n.f(systemService, "null cannot be cast to non-null type android.app.KeyguardManager");
        return (KeyguardManager) systemService;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final EventObserver u(d dVar) {
        return new EventObserver(dVar.f17755q, dVar.r(), "nt_lockscreen_show");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Handler v() {
        return new Handler(Looper.getMainLooper());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void w(boolean z9) {
        boolean zP = this.f17756r.p();
        com.nothing.wallpaper.common.log.c.k("BLUR-LockscreenObserver", "notifyEngine old=" + zP + " new=" + z9 + ".");
        if (zP == z9) {
            return;
        }
        this.f17756r.q(z9);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final EventObserver x(d dVar) {
        return new EventObserver(dVar.f17755q, dVar.r(), "nt_lockscreen_unlocked");
    }

    @Override // androidx.lifecycle.InterfaceC1148h
    public void g(InterfaceC1163x owner) {
        n.h(owner, "owner");
        this.f17757s = owner;
        IntentFilter intentFilter = new IntentFilter();
        boolean z9 = f17751E;
        if (!z9) {
            intentFilter.addAction("com.nothing.systemui.NT_USER_PRESENT");
        }
        intentFilter.addAction("android.intent.action.SCREEN_OFF");
        intentFilter.addAction("android.intent.action.SCREEN_ON");
        b bVar = new b();
        this.f17758t = bVar;
        this.f17755q.registerReceiver(bVar, intentFilter, 2);
        q().register(this.f17753B, true);
        if (z9) {
            s().register(this.f17754C, true);
        }
        if (p231x0.l.a(this.f17755q)) {
            return;
        }
        w(true);
    }

    @Override // androidx.lifecycle.InterfaceC1148h
    public void onDestroy(InterfaceC1163x owner) {
        n.h(owner, "owner");
        InterfaceC0846x0 interfaceC0846x0 = this.f17759u;
        if (interfaceC0846x0 != null) {
            InterfaceC0846x0.a.a(interfaceC0846x0, null, 1, null);
        }
        InterfaceC0846x0 interfaceC0846x1 = this.f17760v;
        if (interfaceC0846x1 != null) {
            InterfaceC0846x0.a.a(interfaceC0846x1, null, 1, null);
        }
        b bVar = this.f17758t;
        if (bVar != null) {
            try {
                this.f17755q.unregisterReceiver(bVar);
            } catch (IllegalArgumentException unused) {
                com.nothing.wallpaper.common.log.c.f("BLUR-LockscreenObserver", "Receiver not registered.");
            }
            this.f17758t = null;
        }
        q().unregister();
        if (f17751E) {
            s().unregister();
        }
    }
}
