package U5;

import F5.m;
import F8.AbstractC0812g;
import F8.AbstractC0816i;
import F8.AbstractC0845x;
import F8.I;
import F8.InterfaceC0841v;
import F8.L;
import F8.W;
import I8.AbstractC0882h;
import I8.G;
import I8.InterfaceC0880f;
import I8.InterfaceC0881g;
import I8.Q;
import L0.InterfaceC0932i;
import android.content.Context;
import android.content.pm.LauncherApps;
import android.content.pm.PackageManager;
import android.database.ContentObserver;
import android.os.Handler;
import android.os.Looper;
import android.os.UserHandle;
import android.provider.Settings;
import com.google.gson.Gson;
import com.nothing.cardwidget.battery.BatteryConfig;
import com.nothing.launcher.card.data.CardWidgetSimpleInfo;
import com.nothing.launcher.card.j;
import java.io.IOException;
import java.text.Collator;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AbstractC1457h;
import kotlin.jvm.internal.F;
import p089i8.AbstractC1444s;

/* JADX INFO: loaded from: classes2.dex */
public final class e implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f7853a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final L f7854b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final I f7855c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final p249y8.a f7856d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Gson f7857e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final F5.l f7858f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private String f7859g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final I8.z f7860h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final InterfaceC0880f f7861i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final I8.z f7862j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f7863k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final InterfaceC0841v f7864l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final InterfaceC0880f f7865m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final InterfaceC0880f f7866n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final InterfaceC0880f f7867o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final InterfaceC0880f f7868p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final I8.A f7869q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final InterfaceC0880f f7870r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final InterfaceC0880f f7871s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final B f7872t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    static final /* synthetic */ C8.k[] f7849v = {F.g(new kotlin.jvm.internal.y(e.class, "dataStore", "getDataStore(Landroid/content/Context;)Landroidx/datastore/core/DataStore;", 0))};

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final C0957b f7848u = new C0957b(null);

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static final List f7850w = AbstractC1444s.n("com.nothing.hearthstone.authority.APP_CARD.ql_transparent", "com.nothing.hearthstone.authority.APP_CARD.ql_card", "com.nothing.weather.widget.rectangle");

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private static final O0.f.a f7851x = O0.i.a("widget_settings_tips");

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private static final O0.f.a f7852y = O0.i.a("clock_settings_tips");

    static final class A extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        /* synthetic */ Object f7873q;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        int f7875s;

        A(p129m8.e eVar) {
            super(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f7873q = obj;
            this.f7875s |= Integer.MIN_VALUE;
            return e.this.d(this);
        }
    }

    public static final class B implements Comparator {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Collator f7876a = Collator.getInstance();

        B() {
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(S5.d dVar, S5.d dVar2) {
            if (dVar == null) {
                return -1;
            }
            if (dVar2 == null) {
                return 1;
            }
            boolean z9 = false;
            boolean z10 = dVar.a(e.this.f7853a).length() > 0 && Character.isLetterOrDigit(dVar.a(e.this.f7853a).codePointAt(0));
            if (dVar2.a(e.this.f7853a).length() > 0 && Character.isLetterOrDigit(dVar2.a(e.this.f7853a).codePointAt(0))) {
                z9 = true;
            }
            if (z10 && !z9) {
                return -1;
            }
            if (z10 || !z9) {
                return this.f7876a.compare(dVar.a(e.this.f7853a), dVar2.a(e.this.f7853a));
            }
            return 1;
        }
    }

    static final class C extends kotlin.coroutines.jvm.internal.l implements p219v8.p {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f7878q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private /* synthetic */ Object f7879r;

        public static final class a extends ContentObserver {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ e f7881a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ H8.t f7882b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(e eVar, H8.t tVar) {
                super(null);
                this.f7881a = eVar;
                this.f7882b = tVar;
            }

            @Override // android.database.ContentObserver
            public void onChange(boolean z9) {
                C.x(this.f7881a, this.f7882b);
            }
        }

        C(p129m8.e eVar) {
            super(2, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final p079h8.A w(e eVar, a aVar) {
            eVar.f7853a.getContentResolver().unregisterContentObserver(aVar);
            return p079h8.A.f21846a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void x(e eVar, H8.t tVar) {
            String string = Settings.Secure.getString(eVar.f7853a.getContentResolver(), "systemui_widget_infos");
            com.nothing.wallpaper.common.log.c.d("WidgetRepository", "send canUpdate:" + eVar.f7863k + " newInfo:" + string + " originInfo:" + eVar.f7859g);
            if (eVar.f7863k) {
                if (string == null || !kotlin.jvm.internal.n.d(string, eVar.f7859g)) {
                    eVar.f7859g = string;
                    tVar.p(eVar.Z(string));
                }
            }
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final p129m8.e create(Object obj, p129m8.e eVar) {
            C c10 = e.this.new C(eVar);
            c10.f7879r = obj;
            return c10;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objE = p139n8.b.e();
            int i10 = this.f7878q;
            if (i10 == 0) {
                p079h8.r.b(obj);
                H8.t tVar = (H8.t) this.f7879r;
                final a aVar = new a(e.this, tVar);
                e.this.f7853a.getContentResolver().registerContentObserver(Settings.Secure.getUriFor("systemui_widget_infos"), false, aVar);
                x(e.this, tVar);
                final e eVar = e.this;
                p219v8.a aVar2 = new p219v8.a() { // from class: U5.h
                    @Override // p219v8.a
                    public final Object invoke() {
                        return e.C.w(eVar, aVar);
                    }
                };
                this.f7878q = 1;
                if (H8.r.a(tVar, aVar2, this) == objE) {
                    return objE;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                p079h8.r.b(obj);
            }
            return p079h8.A.f21846a;
        }

        @Override // p219v8.p
        /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
        public final Object invoke(H8.t tVar, p129m8.e eVar) {
            return ((C) create(tVar, eVar)).invokeSuspend(p079h8.A.f21846a);
        }
    }

    /* JADX INFO: renamed from: U5.e$a, reason: case insensitive filesystem */
    static final class C0956a extends kotlin.coroutines.jvm.internal.l implements p219v8.p {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f7883q;

        /* JADX INFO: renamed from: U5.e$a$a, reason: collision with other inner class name */
        static final class C0289a extends kotlin.coroutines.jvm.internal.l implements p219v8.p {

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            int f7885q;

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            /* synthetic */ Object f7886r;

            C0289a(p129m8.e eVar) {
                super(2, eVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final p129m8.e create(Object obj, p129m8.e eVar) {
                C0289a c0289a = new C0289a(eVar);
                c0289a.f7886r = obj;
                return c0289a;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object objE = p139n8.b.e();
                int i10 = this.f7885q;
                if (i10 != 0) {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    List list = (List) this.f7886r;
                    p079h8.r.b(obj);
                    return list;
                }
                p079h8.r.b(obj);
                List list2 = (List) this.f7886r;
                this.f7886r = list2;
                this.f7885q = 1;
                return W.b(100L, this) == objE ? objE : list2;
            }

            @Override // p219v8.p
            /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
            public final Object invoke(List list, p129m8.e eVar) {
                return ((C0289a) create(list, eVar)).invokeSuspend(p079h8.A.f21846a);
            }
        }

        /* JADX INFO: renamed from: U5.e$a$b */
        static final class b implements InterfaceC0881g {

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            final /* synthetic */ e f7887q;

            /* JADX INFO: renamed from: U5.e$a$b$a, reason: collision with other inner class name */
            static final class C0290a extends kotlin.coroutines.jvm.internal.d {

                /* JADX INFO: renamed from: q, reason: collision with root package name */
                Object f7888q;

                /* JADX INFO: renamed from: r, reason: collision with root package name */
                /* synthetic */ Object f7889r;

                /* JADX INFO: renamed from: t, reason: collision with root package name */
                int f7891t;

                C0290a(p129m8.e eVar) {
                    super(eVar);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    this.f7889r = obj;
                    this.f7891t |= Integer.MIN_VALUE;
                    return b.this.b(null, this);
                }
            }

            b(e eVar) {
                this.f7887q = eVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // I8.InterfaceC0881g
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object b(List list, p129m8.e eVar) {
                C0290a c0290a;
                if (eVar instanceof C0290a) {
                    c0290a = (C0290a) eVar;
                    int i10 = c0290a.f7891t;
                    if ((i10 & Integer.MIN_VALUE) != 0) {
                        c0290a.f7891t = i10 - Integer.MIN_VALUE;
                    } else {
                        c0290a = new C0290a(eVar);
                    }
                } else {
                    c0290a = new C0290a(eVar);
                }
                Object obj = c0290a.f7889r;
                Object objE = p139n8.b.e();
                int i11 = c0290a.f7891t;
                if (i11 == 0) {
                    p079h8.r.b(obj);
                    I8.z zVar = this.f7887q.f7860h;
                    c0290a.f7888q = this;
                    c0290a.f7891t = 1;
                    if (zVar.b(list, c0290a) == objE) {
                        return objE;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    this = (b) c0290a.f7888q;
                    p079h8.r.b(obj);
                }
                if (!this.f7887q.f7864l.O0()) {
                    this.f7887q.f7864l.B0(p079h8.A.f21846a);
                }
                return p079h8.A.f21846a;
            }
        }

        C0956a(p129m8.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final p129m8.e create(Object obj, p129m8.e eVar) {
            return e.this.new C0956a(eVar);
        }

        @Override // p219v8.p
        public final Object invoke(L l9, p129m8.e eVar) {
            return ((C0956a) create(l9, eVar)).invokeSuspend(p079h8.A.f21846a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objE = p139n8.b.e();
            int i10 = this.f7883q;
            if (i10 == 0) {
                p079h8.r.b(obj);
                InterfaceC0880f interfaceC0880fE = AbstractC0882h.E(e.this.f7871s, new C0289a(null));
                b bVar = new b(e.this);
                this.f7883q = 1;
                if (interfaceC0880fE.a(bVar, this) == objE) {
                    return objE;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                p079h8.r.b(obj);
            }
            return p079h8.A.f21846a;
        }
    }

    /* JADX INFO: renamed from: U5.e$b, reason: case insensitive filesystem */
    public static final class C0957b {
        public /* synthetic */ C0957b(AbstractC1457h abstractC1457h) {
            this();
        }

        private C0957b() {
        }
    }

    /* JADX INFO: renamed from: U5.e$c, reason: case insensitive filesystem */
    static final class C0958c extends kotlin.coroutines.jvm.internal.l implements p219v8.p {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f7892q;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        final /* synthetic */ p079h8.o f7894s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0958c(p079h8.o oVar, p129m8.e eVar) {
            super(2, eVar);
            this.f7894s = oVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final p129m8.e create(Object obj, p129m8.e eVar) {
            return e.this.new C0958c(this.f7894s, eVar);
        }

        @Override // p219v8.p
        public final Object invoke(L l9, p129m8.e eVar) {
            return ((C0958c) create(l9, eVar)).invokeSuspend(p079h8.A.f21846a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objE = p139n8.b.e();
            int i10 = this.f7892q;
            if (i10 == 0) {
                p079h8.r.b(obj);
                I8.z zVar = e.this.f7860h;
                this.f7892q = 1;
                obj = AbstractC0882h.x(zVar, this);
                if (obj == objE) {
                    return objE;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                p079h8.r.b(obj);
            }
            p079h8.o oVar = this.f7894s;
            e eVar = e.this;
            List list = (List) obj;
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : list) {
                if (((com.nothing.launcher.card.t) ((p079h8.o) obj2).d()).n()) {
                    arrayList.add(obj2);
                }
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                list.remove((p079h8.o) it.next());
            }
            list.add(oVar);
            List list2 = list;
            ArrayList arrayList2 = new ArrayList(AbstractC1444s.u(list2, 10));
            Iterator it2 = list2.iterator();
            while (it2.hasNext()) {
                arrayList2.add((com.nothing.launcher.card.t) ((p079h8.o) it2.next()).d());
            }
            eVar.b0(arrayList2);
            return p079h8.A.f21846a;
        }
    }

    static final class d extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        Object f7895q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        /* synthetic */ Object f7896r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        int f7898t;

        d(p129m8.e eVar) {
            super(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f7896r = obj;
            this.f7898t |= Integer.MIN_VALUE;
            return e.this.s(null, this);
        }
    }

    /* JADX INFO: renamed from: U5.e$e, reason: collision with other inner class name */
    static final class C0291e extends kotlin.coroutines.jvm.internal.l implements p219v8.p {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f7899q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private /* synthetic */ Object f7900r;

        /* JADX INFO: renamed from: U5.e$e$a */
        public static final class a extends LauncherApps.Callback {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ H8.t f7902a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ e f7903b;

            a(H8.t tVar, e eVar) {
                this.f7902a = tVar;
                this.f7903b = eVar;
            }

            @Override // android.content.pm.LauncherApps.Callback
            public void onPackageAdded(String str, UserHandle userHandle) {
                C0291e.x(this.f7902a, this.f7903b);
            }

            @Override // android.content.pm.LauncherApps.Callback
            public void onPackageChanged(String str, UserHandle userHandle) {
                if (kotlin.jvm.internal.n.d(str, "com.nothing.cardservice")) {
                    C0291e.x(this.f7902a, this.f7903b);
                }
            }

            @Override // android.content.pm.LauncherApps.Callback
            public void onPackageRemoved(String str, UserHandle userHandle) {
                C0291e.x(this.f7902a, this.f7903b);
            }

            @Override // android.content.pm.LauncherApps.Callback
            public void onPackagesAvailable(String[] strArr, UserHandle userHandle, boolean z9) {
                C0291e.x(this.f7902a, this.f7903b);
            }

            @Override // android.content.pm.LauncherApps.Callback
            public void onPackagesUnavailable(String[] strArr, UserHandle userHandle, boolean z9) {
                C0291e.x(this.f7902a, this.f7903b);
            }
        }

        /* JADX INFO: renamed from: U5.e$e$b */
        static final class b extends kotlin.coroutines.jvm.internal.l implements p219v8.p {

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            int f7904q;

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            final /* synthetic */ H8.t f7905r;

            /* JADX INFO: renamed from: s, reason: collision with root package name */
            final /* synthetic */ e f7906s;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(H8.t tVar, e eVar, p129m8.e eVar2) {
                super(2, eVar2);
                this.f7905r = tVar;
                this.f7906s = eVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final p129m8.e create(Object obj, p129m8.e eVar) {
                return new b(this.f7905r, this.f7906s, eVar);
            }

            @Override // p219v8.p
            public final Object invoke(L l9, p129m8.e eVar) {
                return ((b) create(l9, eVar)).invokeSuspend(p079h8.A.f21846a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                p139n8.b.e();
                if (this.f7904q != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                p079h8.r.b(obj);
                this.f7905r.p(this.f7906s.U());
                return p079h8.A.f21846a;
            }
        }

        C0291e(p129m8.e eVar) {
            super(2, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final p079h8.A w(LauncherApps launcherApps, a aVar) {
            if (launcherApps != null) {
                launcherApps.unregisterCallback(aVar);
            }
            return p079h8.A.f21846a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void x(H8.t tVar, e eVar) {
            AbstractC0816i.d(tVar, null, null, new b(tVar, eVar, null), 3, null);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final p129m8.e create(Object obj, p129m8.e eVar) {
            C0291e c0291e = e.this.new C0291e(eVar);
            c0291e.f7900r = obj;
            return c0291e;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objE = p139n8.b.e();
            int i10 = this.f7899q;
            if (i10 == 0) {
                p079h8.r.b(obj);
                H8.t tVar = (H8.t) this.f7900r;
                final LauncherApps launcherApps = (LauncherApps) e.this.f7853a.getSystemService(LauncherApps.class);
                final a aVar = new a(tVar, e.this);
                if (launcherApps != null) {
                    launcherApps.registerCallback(aVar, new Handler(Looper.getMainLooper()));
                }
                x(tVar, e.this);
                p219v8.a aVar2 = new p219v8.a() { // from class: U5.f
                    @Override // p219v8.a
                    public final Object invoke() {
                        return e.C0291e.w(launcherApps, aVar);
                    }
                };
                this.f7899q = 1;
                if (H8.r.a(tVar, aVar2, this) == objE) {
                    return objE;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                p079h8.r.b(obj);
            }
            return p079h8.A.f21846a;
        }

        @Override // p219v8.p
        /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
        public final Object invoke(H8.t tVar, p129m8.e eVar) {
            return ((C0291e) create(tVar, eVar)).invokeSuspend(p079h8.A.f21846a);
        }
    }

    static final class f extends kotlin.coroutines.jvm.internal.l implements p219v8.q {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f7907q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private /* synthetic */ Object f7908r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        /* synthetic */ Object f7909s;

        f(p129m8.e eVar) {
            super(3, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objE = p139n8.b.e();
            int i10 = this.f7907q;
            if (i10 == 0) {
                p079h8.r.b(obj);
                InterfaceC0881g interfaceC0881g = (InterfaceC0881g) this.f7908r;
                Throwable th = (Throwable) this.f7909s;
                if (!(th instanceof IOException)) {
                    throw th;
                }
                O0.f fVarA = O0.g.a();
                this.f7908r = null;
                this.f7907q = 1;
                if (interfaceC0881g.b(fVarA, this) == objE) {
                    return objE;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                p079h8.r.b(obj);
            }
            return p079h8.A.f21846a;
        }

        @Override // p219v8.q
        /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
        public final Object e(InterfaceC0881g interfaceC0881g, Throwable th, p129m8.e eVar) {
            f fVar = new f(eVar);
            fVar.f7908r = interfaceC0881g;
            fVar.f7909s = th;
            return fVar.invokeSuspend(p079h8.A.f21846a);
        }
    }

    static final class g extends kotlin.coroutines.jvm.internal.l implements p219v8.p {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f7910q;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        final /* synthetic */ int f7912s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(int i10, p129m8.e eVar) {
            super(2, eVar);
            this.f7912s = i10;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final p129m8.e create(Object obj, p129m8.e eVar) {
            return e.this.new g(this.f7912s, eVar);
        }

        @Override // p219v8.p
        public final Object invoke(L l9, p129m8.e eVar) {
            return ((g) create(l9, eVar)).invokeSuspend(p079h8.A.f21846a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object next;
            Object objE = p139n8.b.e();
            int i10 = this.f7910q;
            if (i10 == 0) {
                p079h8.r.b(obj);
                I8.z zVar = e.this.f7860h;
                this.f7910q = 1;
                obj = AbstractC0882h.x(zVar, this);
                if (obj == objE) {
                    return objE;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                p079h8.r.b(obj);
            }
            e eVar = e.this;
            int i11 = this.f7912s;
            List list = (List) obj;
            List list2 = list;
            Iterator it = list2.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (((com.nothing.launcher.card.t) ((p079h8.o) next).d()).m() != i11);
            p079h8.o oVar = (p079h8.o) next;
            if (oVar != null) {
                kotlin.coroutines.jvm.internal.b.a(list.remove(oVar));
            }
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : list2) {
                if (((com.nothing.launcher.card.t) ((p079h8.o) obj2).d()).n()) {
                    arrayList.add(obj2);
                }
            }
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                list.remove((p079h8.o) it2.next());
            }
            ArrayList arrayList2 = new ArrayList(AbstractC1444s.u(list2, 10));
            Iterator it3 = list2.iterator();
            while (it3.hasNext()) {
                arrayList2.add((com.nothing.launcher.card.t) ((p079h8.o) it3.next()).d());
            }
            eVar.b0(arrayList2);
            return p079h8.A.f21846a;
        }
    }

    static final class h extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f7913q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        /* synthetic */ Object f7914r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        int f7916t;

        h(p129m8.e eVar) {
            super(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f7914r = obj;
            this.f7916t |= Integer.MIN_VALUE;
            return e.this.g(0, this);
        }
    }

    static final class i extends kotlin.coroutines.jvm.internal.l implements p219v8.q {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f7917q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        /* synthetic */ boolean f7918r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        /* synthetic */ Object f7919s;

        i(p129m8.e eVar) {
            super(3, eVar);
        }

        @Override // p219v8.q
        public /* bridge */ /* synthetic */ Object e(Object obj, Object obj2, Object obj3) {
            return s(((Boolean) obj).booleanValue(), (Boolean) obj2, (p129m8.e) obj3);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            boolean zBooleanValue;
            p139n8.b.e();
            if (this.f7917q != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p079h8.r.b(obj);
            boolean z9 = this.f7918r;
            Boolean bool = (Boolean) this.f7919s;
            if (bool != null) {
                zBooleanValue = bool.booleanValue();
            } else {
                zBooleanValue = z9;
            }
            return kotlin.coroutines.jvm.internal.b.a(zBooleanValue);
        }

        public final Object s(boolean z9, Boolean bool, p129m8.e eVar) {
            i iVar = new i(eVar);
            iVar.f7918r = z9;
            iVar.f7919s = bool;
            return iVar.invokeSuspend(p079h8.A.f21846a);
        }
    }

    static final class j extends kotlin.coroutines.jvm.internal.l implements p219v8.p {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f7920q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private /* synthetic */ Object f7921r;

        public static final class a extends ContentObserver {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ e f7923a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ H8.t f7924b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(e eVar, H8.t tVar) {
                super(null);
                this.f7923a = eVar;
                this.f7924b = tVar;
            }

            @Override // android.database.ContentObserver
            public void onChange(boolean z9) {
                j.x(this.f7923a, this.f7924b);
            }
        }

        j(p129m8.e eVar) {
            super(2, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final p079h8.A w(e eVar, a aVar) {
            eVar.f7853a.getContentResolver().unregisterContentObserver(aVar);
            return p079h8.A.f21846a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void x(e eVar, H8.t tVar) {
            tVar.p(Boolean.valueOf(Settings.Secure.getInt(eVar.f7853a.getContentResolver(), "lock_screen_expand_widget_enable", 0) != 0));
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final p129m8.e create(Object obj, p129m8.e eVar) {
            j jVar = e.this.new j(eVar);
            jVar.f7921r = obj;
            return jVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objE = p139n8.b.e();
            int i10 = this.f7920q;
            if (i10 == 0) {
                p079h8.r.b(obj);
                H8.t tVar = (H8.t) this.f7921r;
                final a aVar = new a(e.this, tVar);
                e.this.f7853a.getContentResolver().registerContentObserver(Settings.Secure.getUriFor("lock_screen_expand_widget_enable"), false, aVar);
                x(e.this, tVar);
                final e eVar = e.this;
                p219v8.a aVar2 = new p219v8.a() { // from class: U5.g
                    @Override // p219v8.a
                    public final Object invoke() {
                        return e.j.w(eVar, aVar);
                    }
                };
                this.f7920q = 1;
                if (H8.r.a(tVar, aVar2, this) == objE) {
                    return objE;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                p079h8.r.b(obj);
            }
            return p079h8.A.f21846a;
        }

        @Override // p219v8.p
        /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
        public final Object invoke(H8.t tVar, p129m8.e eVar) {
            return ((j) create(tVar, eVar)).invokeSuspend(p079h8.A.f21846a);
        }
    }

    static final class k extends kotlin.coroutines.jvm.internal.l implements p219v8.p {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f7925q;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        final /* synthetic */ boolean f7927s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        k(boolean z9, p129m8.e eVar) {
            super(2, eVar);
            this.f7927s = z9;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final p129m8.e create(Object obj, p129m8.e eVar) {
            return e.this.new k(this.f7927s, eVar);
        }

        @Override // p219v8.p
        public final Object invoke(L l9, p129m8.e eVar) {
            return ((k) create(l9, eVar)).invokeSuspend(p079h8.A.f21846a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            p139n8.b.e();
            if (this.f7925q != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p079h8.r.b(obj);
            Settings.Secure.putInt(e.this.f7853a.getContentResolver(), "lock_screen_expand_widget_enable", this.f7927s ? 1 : 0);
            return p079h8.A.f21846a;
        }
    }

    static final class l extends kotlin.coroutines.jvm.internal.l implements p219v8.p {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f7928q;

        l(p129m8.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final p129m8.e create(Object obj, p129m8.e eVar) {
            return e.this.new l(eVar);
        }

        @Override // p219v8.p
        public final Object invoke(L l9, p129m8.e eVar) {
            return ((l) create(l9, eVar)).invokeSuspend(p079h8.A.f21846a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objE = p139n8.b.e();
            int i10 = this.f7928q;
            if (i10 == 0) {
                p079h8.r.b(obj);
                List listU = e.this.u();
                List list = listU;
                ArrayList arrayList = new ArrayList(AbstractC1444s.u(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(kotlin.coroutines.jvm.internal.b.c(((com.nothing.launcher.card.t) ((p079h8.o) it.next()).d()).m()));
                }
                com.nothing.wallpaper.common.log.c.d("WidgetRepository", "restoreWidgetInfo ids:" + arrayList.toString());
                I8.z zVar = e.this.f7860h;
                this.f7928q = 1;
                if (zVar.b(listU, this) == objE) {
                    return objE;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                p079h8.r.b(obj);
            }
            return p079h8.A.f21846a;
        }
    }

    static final class m extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        Object f7930q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        Object f7931r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        /* synthetic */ Object f7932s;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        int f7934u;

        m(p129m8.e eVar) {
            super(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f7932s = obj;
            this.f7934u |= Integer.MIN_VALUE;
            return e.this.i(null, this);
        }
    }

    static final class n extends kotlin.coroutines.jvm.internal.l implements p219v8.p {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f7935q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private /* synthetic */ Object f7936r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ String f7938t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        n(String str, p129m8.e eVar) {
            super(2, eVar);
            this.f7938t = str;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final p129m8.e create(Object obj, p129m8.e eVar) {
            n nVar = e.this.new n(this.f7938t, eVar);
            nVar.f7936r = obj;
            return nVar;
        }

        @Override // p219v8.p
        public final Object invoke(L l9, p129m8.e eVar) {
            return ((n) create(l9, eVar)).invokeSuspend(p079h8.A.f21846a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objB;
            Object objE = p139n8.b.e();
            int i10 = this.f7935q;
            if (i10 == 0) {
                p079h8.r.b(obj);
                e eVar = e.this;
                String str = this.f7938t;
                try {
                    h8.q.a aVar = p079h8.q.f21862r;
                    objB = p079h8.q.b((CardWidgetSimpleInfo[]) eVar.f7857e.fromJson(str, CardWidgetSimpleInfo[].class));
                } catch (Throwable th) {
                    h8.q.a aVar2 = p079h8.q.f21862r;
                    objB = p079h8.q.b(p079h8.r.a(th));
                }
                if (p079h8.q.f(objB)) {
                    objB = null;
                }
                List listY = e.this.Y((CardWidgetSimpleInfo[]) objB);
                e eVar2 = e.this;
                eVar2.f7859g = Settings.Secure.getString(eVar2.f7853a.getContentResolver(), "systemui_widget_infos");
                List list = listY;
                ArrayList arrayList = new ArrayList(AbstractC1444s.u(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(kotlin.coroutines.jvm.internal.b.c(((com.nothing.launcher.card.t) ((p079h8.o) it.next()).d()).m()));
                }
                com.nothing.wallpaper.common.log.c.d("WidgetRepository", "restoreWidgetsFromSaveState ids:" + arrayList.toString());
                I8.z zVar = e.this.f7860h;
                this.f7935q = 1;
                if (zVar.b(listY, this) == objE) {
                    return objE;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                p079h8.r.b(obj);
            }
            return p079h8.A.f21846a;
        }
    }

    static final class o extends kotlin.coroutines.jvm.internal.l implements p219v8.p {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f7939q;

        o(p129m8.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final p129m8.e create(Object obj, p129m8.e eVar) {
            return e.this.new o(eVar);
        }

        @Override // p219v8.p
        public final Object invoke(L l9, p129m8.e eVar) {
            return ((o) create(l9, eVar)).invokeSuspend(p079h8.A.f21846a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objE = p139n8.b.e();
            int i10 = this.f7939q;
            if (i10 == 0) {
                p079h8.r.b(obj);
                e eVar = e.this;
                this.f7939q = 1;
                if (eVar.R(this) == objE) {
                    return objE;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                p079h8.r.b(obj);
            }
            return p079h8.A.f21846a;
        }
    }

    static final class p extends kotlin.coroutines.jvm.internal.l implements p219v8.p {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f7941q;

        p(p129m8.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final p129m8.e create(Object obj, p129m8.e eVar) {
            return e.this.new p(eVar);
        }

        @Override // p219v8.p
        public final Object invoke(L l9, p129m8.e eVar) {
            return ((p) create(l9, eVar)).invokeSuspend(p079h8.A.f21846a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objE = p139n8.b.e();
            int i10 = this.f7941q;
            if (i10 == 0) {
                p079h8.r.b(obj);
                InterfaceC0880f interfaceC0880fX = e.this.x();
                this.f7941q = 1;
                obj = AbstractC0882h.x(interfaceC0880fX, this);
                if (obj == objE) {
                    return objE;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                p079h8.r.b(obj);
            }
            boolean zBooleanValue = ((Boolean) obj).booleanValue();
            Settings.Secure.putInt(e.this.f7853a.getContentResolver(), "lock_screen_expand_widget_enable", zBooleanValue ? 1 : 0);
            com.nothing.wallpaper.common.log.c.d("WidgetRepository", "saveExpandWidget expand:" + zBooleanValue);
            return p079h8.A.f21846a;
        }
    }

    static final class q extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        Object f7943q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        /* synthetic */ Object f7944r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        int f7946t;

        q(p129m8.e eVar) {
            super(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f7944r = obj;
            this.f7946t |= Integer.MIN_VALUE;
            return e.this.k(this);
        }
    }

    static final class r extends kotlin.coroutines.jvm.internal.l implements p219v8.p {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f7947q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ String f7948r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        final /* synthetic */ e f7949s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        r(String str, e eVar, p129m8.e eVar2) {
            super(2, eVar2);
            this.f7948r = str;
            this.f7949s = eVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final p129m8.e create(Object obj, p129m8.e eVar) {
            return new r(this.f7948r, this.f7949s, eVar);
        }

        @Override // p219v8.p
        public final Object invoke(L l9, p129m8.e eVar) {
            return ((r) create(l9, eVar)).invokeSuspend(p079h8.A.f21846a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            p139n8.b.e();
            if (this.f7947q != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p079h8.r.b(obj);
            String str = this.f7948r;
            if (str != null) {
                return kotlin.coroutines.jvm.internal.b.a(Settings.Secure.putString(this.f7949s.f7853a.getContentResolver(), "systemui_widget_infos", str));
            }
            return null;
        }
    }

    static final class s extends kotlin.coroutines.jvm.internal.l implements p219v8.q {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f7950q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private /* synthetic */ Object f7951r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        /* synthetic */ Object f7952s;

        s(p129m8.e eVar) {
            super(3, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objE = p139n8.b.e();
            int i10 = this.f7950q;
            if (i10 == 0) {
                p079h8.r.b(obj);
                InterfaceC0881g interfaceC0881g = (InterfaceC0881g) this.f7951r;
                Throwable th = (Throwable) this.f7952s;
                if (!(th instanceof IOException)) {
                    throw th;
                }
                O0.f fVarA = O0.g.a();
                this.f7951r = null;
                this.f7950q = 1;
                if (interfaceC0881g.b(fVarA, this) == objE) {
                    return objE;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                p079h8.r.b(obj);
            }
            return p079h8.A.f21846a;
        }

        @Override // p219v8.q
        /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
        public final Object e(InterfaceC0881g interfaceC0881g, Throwable th, p129m8.e eVar) {
            s sVar = new s(eVar);
            sVar.f7951r = interfaceC0881g;
            sVar.f7952s = th;
            return sVar.invokeSuspend(p079h8.A.f21846a);
        }
    }

    static final class t extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        /* synthetic */ Object f7953q;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        int f7955s;

        t(p129m8.e eVar) {
            super(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f7953q = obj;
            this.f7955s |= Integer.MIN_VALUE;
            return e.this.h(this);
        }
    }

    static final class u extends kotlin.coroutines.jvm.internal.l implements p219v8.p {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f7956q;

        u(p129m8.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final p129m8.e create(Object obj, p129m8.e eVar) {
            return e.this.new u(eVar);
        }

        @Override // p219v8.p
        public final Object invoke(L l9, p129m8.e eVar) {
            return ((u) create(l9, eVar)).invokeSuspend(p079h8.A.f21846a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objE = p139n8.b.e();
            int i10 = this.f7956q;
            if (i10 == 0) {
                p079h8.r.b(obj);
                I8.z zVar = e.this.f7860h;
                this.f7956q = 1;
                obj = AbstractC0882h.x(zVar, this);
                if (obj == objE) {
                    return objE;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                p079h8.r.b(obj);
            }
            List list = (List) obj;
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : list) {
                if (!((com.nothing.launcher.card.t) ((p079h8.o) obj2).d()).n()) {
                    arrayList.add(obj2);
                }
            }
            ArrayList arrayList2 = new ArrayList(AbstractC1444s.u(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(kotlin.coroutines.jvm.internal.b.c(((com.nothing.launcher.card.t) ((p079h8.o) it.next()).d()).m()));
            }
            com.nothing.wallpaper.common.log.c.d("WidgetRepository", "snapshotWidgetsJsonForSaveState widgetId:" + arrayList2.toString());
            ArrayList arrayList3 = new ArrayList();
            for (Object obj3 : list) {
                if (!((com.nothing.launcher.card.t) ((p079h8.o) obj3).d()).n()) {
                    arrayList3.add(obj3);
                }
            }
            ArrayList arrayList4 = new ArrayList(AbstractC1444s.u(arrayList3, 10));
            Iterator it2 = arrayList3.iterator();
            while (it2.hasNext()) {
                com.nothing.launcher.card.t tVar = (com.nothing.launcher.card.t) ((p079h8.o) it2.next()).b();
                arrayList4.add(new CardWidgetSimpleInfo(tVar.m(), tVar.f595s, tVar.f596t, tVar.f597u, tVar.f598v, System.currentTimeMillis()));
            }
            return e.this.f7857e.toJson(arrayList4);
        }
    }

    public static final class v implements InterfaceC0880f {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        final /* synthetic */ InterfaceC0880f f7958q;

        public static final class a implements InterfaceC0881g {

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            final /* synthetic */ InterfaceC0881g f7959q;

            /* JADX INFO: renamed from: U5.e$v$a$a, reason: collision with other inner class name */
            public static final class C0292a extends kotlin.coroutines.jvm.internal.d {

                /* JADX INFO: renamed from: q, reason: collision with root package name */
                /* synthetic */ Object f7960q;

                /* JADX INFO: renamed from: r, reason: collision with root package name */
                int f7961r;

                public C0292a(p129m8.e eVar) {
                    super(eVar);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    this.f7960q = obj;
                    this.f7961r |= Integer.MIN_VALUE;
                    return a.this.b(null, this);
                }
            }

            public a(InterfaceC0881g interfaceC0881g) {
                this.f7959q = interfaceC0881g;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // I8.InterfaceC0881g
            public final Object b(Object obj, p129m8.e eVar) {
                C0292a c0292a;
                if (eVar instanceof C0292a) {
                    c0292a = (C0292a) eVar;
                    int i10 = c0292a.f7961r;
                    if ((i10 & Integer.MIN_VALUE) != 0) {
                        c0292a.f7961r = i10 - Integer.MIN_VALUE;
                    } else {
                        c0292a = new C0292a(eVar);
                    }
                } else {
                    c0292a = new C0292a(eVar);
                }
                Object obj2 = c0292a.f7960q;
                Object objE = p139n8.b.e();
                int i11 = c0292a.f7961r;
                if (i11 == 0) {
                    p079h8.r.b(obj2);
                    InterfaceC0881g interfaceC0881g = this.f7959q;
                    Boolean bool = (Boolean) ((O0.f) obj).b(e.f7851x);
                    Boolean boolA = kotlin.coroutines.jvm.internal.b.a(bool != null ? bool.booleanValue() : true);
                    c0292a.f7961r = 1;
                    if (interfaceC0881g.b(boolA, c0292a) == objE) {
                        return objE;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    p079h8.r.b(obj2);
                }
                return p079h8.A.f21846a;
            }
        }

        public v(InterfaceC0880f interfaceC0880f) {
            this.f7958q = interfaceC0880f;
        }

        @Override // I8.InterfaceC0880f
        public Object a(InterfaceC0881g interfaceC0881g, p129m8.e eVar) {
            Object objA = this.f7958q.a(new a(interfaceC0881g), eVar);
            return objA == p139n8.b.e() ? objA : p079h8.A.f21846a;
        }
    }

    public static final class w implements InterfaceC0880f {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        final /* synthetic */ InterfaceC0880f f7963q;

        public static final class a implements InterfaceC0881g {

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            final /* synthetic */ InterfaceC0881g f7964q;

            /* JADX INFO: renamed from: U5.e$w$a$a, reason: collision with other inner class name */
            public static final class C0293a extends kotlin.coroutines.jvm.internal.d {

                /* JADX INFO: renamed from: q, reason: collision with root package name */
                /* synthetic */ Object f7965q;

                /* JADX INFO: renamed from: r, reason: collision with root package name */
                int f7966r;

                public C0293a(p129m8.e eVar) {
                    super(eVar);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    this.f7965q = obj;
                    this.f7966r |= Integer.MIN_VALUE;
                    return a.this.b(null, this);
                }
            }

            public a(InterfaceC0881g interfaceC0881g) {
                this.f7964q = interfaceC0881g;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // I8.InterfaceC0881g
            public final Object b(Object obj, p129m8.e eVar) {
                C0293a c0293a;
                if (eVar instanceof C0293a) {
                    c0293a = (C0293a) eVar;
                    int i10 = c0293a.f7966r;
                    if ((i10 & Integer.MIN_VALUE) != 0) {
                        c0293a.f7966r = i10 - Integer.MIN_VALUE;
                    } else {
                        c0293a = new C0293a(eVar);
                    }
                } else {
                    c0293a = new C0293a(eVar);
                }
                Object obj2 = c0293a.f7965q;
                Object objE = p139n8.b.e();
                int i11 = c0293a.f7966r;
                if (i11 == 0) {
                    p079h8.r.b(obj2);
                    InterfaceC0881g interfaceC0881g = this.f7964q;
                    Boolean bool = (Boolean) ((O0.f) obj).b(e.f7852y);
                    Boolean boolA = kotlin.coroutines.jvm.internal.b.a(bool != null ? bool.booleanValue() : true);
                    c0293a.f7966r = 1;
                    if (interfaceC0881g.b(boolA, c0293a) == objE) {
                        return objE;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    p079h8.r.b(obj2);
                }
                return p079h8.A.f21846a;
            }
        }

        public w(InterfaceC0880f interfaceC0880f) {
            this.f7963q = interfaceC0880f;
        }

        @Override // I8.InterfaceC0880f
        public Object a(InterfaceC0881g interfaceC0881g, p129m8.e eVar) {
            Object objA = this.f7963q.a(new a(interfaceC0881g), eVar);
            return objA == p139n8.b.e() ? objA : p079h8.A.f21846a;
        }
    }

    static final class x extends kotlin.coroutines.jvm.internal.l implements p219v8.p {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f7968q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        /* synthetic */ Object f7969r;

        x(p129m8.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final p129m8.e create(Object obj, p129m8.e eVar) {
            x xVar = new x(eVar);
            xVar.f7969r = obj;
            return xVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            p139n8.b.e();
            if (this.f7968q != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p079h8.r.b(obj);
            ((O0.c) this.f7969r).i(e.f7852y, kotlin.coroutines.jvm.internal.b.a(false));
            return p079h8.A.f21846a;
        }

        @Override // p219v8.p
        /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
        public final Object invoke(O0.c cVar, p129m8.e eVar) {
            return ((x) create(cVar, eVar)).invokeSuspend(p079h8.A.f21846a);
        }
    }

    static final class y extends kotlin.coroutines.jvm.internal.l implements p219v8.p {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f7970q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        /* synthetic */ Object f7971r;

        y(p129m8.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final p129m8.e create(Object obj, p129m8.e eVar) {
            y yVar = new y(eVar);
            yVar.f7971r = obj;
            return yVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            p139n8.b.e();
            if (this.f7970q != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p079h8.r.b(obj);
            ((O0.c) this.f7971r).i(e.f7851x, kotlin.coroutines.jvm.internal.b.a(false));
            return p079h8.A.f21846a;
        }

        @Override // p219v8.p
        /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
        public final Object invoke(O0.c cVar, p129m8.e eVar) {
            return ((y) create(cVar, eVar)).invokeSuspend(p079h8.A.f21846a);
        }
    }

    static final class z extends kotlin.coroutines.jvm.internal.l implements p219v8.p {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f7972q;

        z(p129m8.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final p129m8.e create(Object obj, p129m8.e eVar) {
            return e.this.new z(eVar);
        }

        @Override // p219v8.p
        public final Object invoke(L l9, p129m8.e eVar) {
            return ((z) create(l9, eVar)).invokeSuspend(p079h8.A.f21846a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objE = p139n8.b.e();
            int i10 = this.f7972q;
            if (i10 == 0) {
                p079h8.r.b(obj);
                I8.z zVar = e.this.f7860h;
                this.f7972q = 1;
                obj = AbstractC0882h.x(zVar, this);
                if (obj == objE) {
                    return objE;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                p079h8.r.b(obj);
            }
            e eVar = e.this;
            List list = (List) obj;
            List<p079h8.o> list2 = list;
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : list2) {
                if (((com.nothing.launcher.card.t) ((p079h8.o) obj2).d()).n()) {
                    arrayList.add(obj2);
                }
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                list.remove((p079h8.o) it.next());
            }
            for (p079h8.o oVar : list2) {
                ((com.nothing.launcher.card.t) oVar.d()).r(-1);
                ((com.nothing.launcher.card.t) oVar.d()).s(-1);
                ((com.nothing.launcher.card.t) oVar.d()).t(false);
            }
            ArrayList arrayList2 = new ArrayList(AbstractC1444s.u(list2, 10));
            Iterator it2 = list2.iterator();
            while (it2.hasNext()) {
                arrayList2.add((com.nothing.launcher.card.t) ((p079h8.o) it2.next()).d());
            }
            eVar.b0(arrayList2);
            return p079h8.A.f21846a;
        }
    }

    public e(Context context, L scope, I backgroundDispatcher) {
        kotlin.jvm.internal.n.h(context, "context");
        kotlin.jvm.internal.n.h(scope, "scope");
        kotlin.jvm.internal.n.h(backgroundDispatcher, "backgroundDispatcher");
        this.f7853a = context;
        this.f7854b = scope;
        this.f7855c = backgroundDispatcher;
        this.f7856d = N0.a.b("widget_preferences", null, null, null, 14, null);
        this.f7857e = new Gson();
        this.f7858f = F5.l.f1669g.a(context);
        I8.z zVarB = G.b(1, 0, null, 6, null);
        this.f7860h = zVarB;
        this.f7861i = zVarB;
        this.f7862j = G.b(1, 0, null, 6, null);
        this.f7863k = true;
        this.f7864l = AbstractC0845x.b(null, 1, null);
        AbstractC0816i.d(scope, null, null, new C0956a(null), 3, null);
        this.f7865m = new v(AbstractC0882h.f(S(context).getData(), new s(null)));
        this.f7866n = new w(AbstractC0882h.f(S(context).getData(), new f(null)));
        this.f7867o = AbstractC0882h.D(AbstractC0882h.e(new C0291e(null)), backgroundDispatcher);
        InterfaceC0880f interfaceC0880fD = AbstractC0882h.D(AbstractC0882h.e(new j(null)), backgroundDispatcher);
        this.f7868p = interfaceC0880fD;
        I8.A a10 = Q.a(null);
        this.f7869q = a10;
        this.f7870r = AbstractC0882h.l(interfaceC0880fD, a10, new i(null));
        this.f7871s = AbstractC0882h.D(AbstractC0882h.e(new C(null)), backgroundDispatcher);
        this.f7872t = new B();
    }

    private final InterfaceC0932i S(Context context) {
        return (InterfaceC0932i) this.f7856d.a(context, f7849v[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List U() {
        final int iA0 = a0();
        D8.h<p079h8.o> hVarT = D8.k.t(D8.k.x(D8.k.o(AbstractC1444s.K(this.f7858f.j(null)), new p219v8.l() { // from class: U5.b
            @Override // p219v8.l
            public final Object f(Object obj) {
                return Boolean.valueOf(e.V(this.f7845q, iA0, (m) obj));
            }
        }), new p219v8.l() { // from class: U5.c
            @Override // p219v8.l
            public final Object f(Object obj) {
                return e.W(this.f7847q, (m) obj);
            }
        }), new p219v8.l() { // from class: U5.d
            @Override // p219v8.l
            public final Object f(Object obj) {
                return e.X((j) obj);
            }
        });
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (p079h8.o oVar : hVarT) {
            F2.r rVar = (F2.r) oVar.c();
            Object arrayList = linkedHashMap.get(rVar);
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap.put(rVar, arrayList);
            }
            ((List) arrayList).add((com.nothing.launcher.card.j) oVar.d());
        }
        ArrayList arrayList2 = new ArrayList(linkedHashMap.size());
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            arrayList2.add(new S5.a(((F2.r) entry.getKey()).a(), ((F2.r) entry.getKey()).c(), ((F2.r) entry.getKey()).b(), (List) entry.getValue()));
        }
        return AbstractC1444s.m0(arrayList2, this.f7872t);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean V(e eVar, int i10, F5.m it) {
        kotlin.jvm.internal.n.h(it, "it");
        return eVar.c0(it, i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final com.nothing.launcher.card.j W(e eVar, F5.m it) {
        kotlin.jvm.internal.n.h(it, "it");
        return com.nothing.launcher.card.j.f18121Z.a(eVar.f7853a, it);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Iterable X(com.nothing.launcher.card.j it) {
        kotlin.jvm.internal.n.h(it, "it");
        return (kotlin.jvm.internal.n.d(it.H(), BatteryConfig.DEFAULT_PACKAGE_NAME) && it.q() == 0) ? AbstractC1444s.p(p079h8.v.a(new F2.r(it.H(), it.D0(), it.q(), it.f()), it)) : AbstractC1444s.p(p079h8.v.a(new F2.r(it.H(), it.D0(), it.q(), it.r()), it));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List Y(CardWidgetSimpleInfo[] cardWidgetSimpleInfoArr) {
        p079h8.o oVarA;
        if (cardWidgetSimpleInfoArr == null) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        for (CardWidgetSimpleInfo cardWidgetSimpleInfo : cardWidgetSimpleInfoArr) {
            F5.m mVarL = F5.l.f1669g.a(this.f7853a).l(cardWidgetSimpleInfo.getId());
            if (mVarL != null) {
                com.nothing.launcher.card.j jVarA = com.nothing.launcher.card.j.f18121Z.a(this.f7853a, mVarL);
                com.nothing.launcher.card.t tVar = new com.nothing.launcher.card.t(cardWidgetSimpleInfo.getId(), jVarA.v0());
                tVar.f593q = cardWidgetSimpleInfo.getId();
                tVar.f597u = cardWidgetSimpleInfo.getSpanX();
                tVar.f598v = cardWidgetSimpleInfo.getSpanY();
                tVar.f595s = cardWidgetSimpleInfo.getCellX();
                tVar.f596t = cardWidgetSimpleInfo.getCellY();
                tVar.f594r = 0;
                tVar.f599w = jVarA.z0();
                tVar.f600x = jVarA.A0();
                oVarA = p079h8.v.a(jVarA, tVar);
            } else {
                oVarA = null;
            }
            if (oVarA != null) {
                arrayList.add(oVarA);
            }
        }
        return AbstractC1444s.u0(arrayList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List Z(String str) {
        Object objB;
        if (str == null || str.length() == 0) {
            return new ArrayList();
        }
        try {
            h8.q.a aVar = p079h8.q.f21862r;
            objB = p079h8.q.b((CardWidgetSimpleInfo[]) this.f7857e.fromJson(str, CardWidgetSimpleInfo[].class));
        } catch (Throwable th) {
            h8.q.a aVar2 = p079h8.q.f21862r;
            objB = p079h8.q.b(p079h8.r.a(th));
        }
        if (p079h8.q.f(objB)) {
            objB = null;
        }
        return Y((CardWidgetSimpleInfo[]) objB);
    }

    private final int a0() {
        Object objB;
        Object next;
        try {
            h8.q.a aVar = p079h8.q.f21862r;
            List<PackageManager.Property> listQueryApplicationProperty = this.f7853a.getPackageManager().queryApplicationProperty("com.nothing.cardservice.host.api_level");
            kotlin.jvm.internal.n.g(listQueryApplicationProperty, "queryApplicationProperty(...)");
            Iterator<T> it = listQueryApplicationProperty.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!kotlin.jvm.internal.n.d(((PackageManager.Property) next).getPackageName(), "com.android.systemui"));
            PackageManager.Property property = (PackageManager.Property) next;
            objB = p079h8.q.b(Integer.valueOf(property != null ? property.getInteger() : 0));
        } catch (Throwable th) {
            h8.q.a aVar2 = p079h8.q.f21862r;
            objB = p079h8.q.b(p079h8.r.a(th));
        }
        if (p079h8.q.f(objB)) {
            objB = 0;
        }
        return ((Number) objB).intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void b0(List list) {
        List<com.nothing.launcher.card.t> list2 = list;
        ArrayList arrayList = new ArrayList(AbstractC1444s.u(list2, 10));
        for (com.nothing.launcher.card.t tVar : list2) {
            arrayList.add(new CardWidgetSimpleInfo(tVar.m(), tVar.f595s, tVar.f596t, tVar.f597u, tVar.f598v, System.currentTimeMillis()));
        }
        this.f7859g = this.f7857e.toJson(arrayList);
        Settings.Secure.putString(this.f7853a.getContentResolver(), "systemui_widget_infos", this.f7859g);
    }

    private final boolean c0(F5.m mVar, int i10) {
        return mVar.x() <= i10 && !f7850w.contains(mVar.b()) && mVar.j() >= 3;
    }

    public Object R(p129m8.e eVar) {
        Object objP0 = this.f7864l.P0(eVar);
        return objP0 == p139n8.b.e() ? objP0 : p079h8.A.f21846a;
    }

    @Override // U5.a
    /* JADX INFO: renamed from: T, reason: merged with bridge method [inline-methods] */
    public I8.z j() {
        return this.f7862j;
    }

    @Override // U5.a
    public void a(boolean z9) {
        AbstractC0816i.d(this.f7854b, this.f7855c, null, new k(z9, null), 2, null);
    }

    @Override // U5.a
    public void b() {
        AbstractC0816i.d(this.f7854b, this.f7855c, null, new p(null), 2, null);
    }

    @Override // U5.a
    public InterfaceC0880f c() {
        return this.f7865m;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // U5.a
    public Object d(p129m8.e eVar) {
        A a10;
        if (eVar instanceof A) {
            a10 = (A) eVar;
            int i10 = a10.f7875s;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                a10.f7875s = i10 - Integer.MIN_VALUE;
            } else {
                a10 = new A(eVar);
            }
        } else {
            a10 = new A(eVar);
        }
        Object objX = a10.f7873q;
        Object objE = p139n8.b.e();
        int i11 = a10.f7875s;
        if (i11 == 0) {
            p079h8.r.b(objX);
            l(false);
            I8.z zVar = this.f7860h;
            a10.f7875s = 1;
            objX = AbstractC0882h.x(zVar, a10);
            if (objX == objE) {
                return objE;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p079h8.r.b(objX);
        }
        List list = (List) objX;
        List<p079h8.o> list2 = list;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list2) {
            if (((com.nothing.launcher.card.t) ((p079h8.o) obj).d()).n()) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            list.remove((p079h8.o) it.next());
        }
        for (p079h8.o oVar : list2) {
            ((com.nothing.launcher.card.t) oVar.d()).r(-1);
            ((com.nothing.launcher.card.t) oVar.d()).s(-1);
            ((com.nothing.launcher.card.t) oVar.d()).t(false);
        }
        return p079h8.A.f21846a;
    }

    @Override // U5.a
    public void e(boolean z9) {
        this.f7869q.setValue(Boolean.valueOf(z9));
    }

    @Override // U5.a
    public void f() {
        AbstractC0816i.d(this.f7854b, this.f7855c, null, new l(null), 2, null);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // U5.a
    public Object g(int i10, p129m8.e eVar) {
        h hVar;
        Object next;
        if (eVar instanceof h) {
            hVar = (h) eVar;
            int i11 = hVar.f7916t;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                hVar.f7916t = i11 - Integer.MIN_VALUE;
            } else {
                hVar = new h(eVar);
            }
        } else {
            hVar = new h(eVar);
        }
        Object objX = hVar.f7914r;
        Object objE = p139n8.b.e();
        int i12 = hVar.f7916t;
        if (i12 == 0) {
            p079h8.r.b(objX);
            l(false);
            I8.z zVar = this.f7860h;
            hVar.f7913q = i10;
            hVar.f7916t = 1;
            objX = AbstractC0882h.x(zVar, hVar);
            if (objX == objE) {
                return objE;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i10 = hVar.f7913q;
            p079h8.r.b(objX);
        }
        List list = (List) objX;
        List list2 = list;
        Iterator it = list2.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((com.nothing.launcher.card.t) ((p079h8.o) next).d()).m() != i10);
        p079h8.o oVar = (p079h8.o) next;
        if (oVar != null) {
            kotlin.coroutines.jvm.internal.b.a(list.remove(oVar));
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : list2) {
            if (((com.nothing.launcher.card.t) ((p079h8.o) obj).d()).n()) {
                arrayList.add(obj);
            }
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            list.remove((p079h8.o) it2.next());
        }
        return p079h8.A.f21846a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // U5.a
    public Object h(p129m8.e eVar) {
        t tVar;
        if (eVar instanceof t) {
            tVar = (t) eVar;
            int i10 = tVar.f7955s;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                tVar.f7955s = i10 - Integer.MIN_VALUE;
            } else {
                tVar = new t(eVar);
            }
        } else {
            tVar = new t(eVar);
        }
        Object objG = tVar.f7953q;
        Object objE = p139n8.b.e();
        int i11 = tVar.f7955s;
        if (i11 == 0) {
            p079h8.r.b(objG);
            I i12 = this.f7855c;
            u uVar = new u(null);
            tVar.f7955s = 1;
            objG = AbstractC0812g.g(i12, uVar, tVar);
            if (objG == objE) {
                return objE;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p079h8.r.b(objG);
        }
        kotlin.jvm.internal.n.g(objG, "withContext(...)");
        return objG;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0075, code lost:
    
        if (F8.AbstractC0812g.g(r10, r2, r0) == r1) goto L24;
     */
    @Override // U5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object i(java.lang.String r9, p129m8.e r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof U5.e.m
            if (r0 == 0) goto L13
            r0 = r10
            U5.e$m r0 = (U5.e.m) r0
            int r1 = r0.f7934u
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f7934u = r1
            goto L18
        L13:
            U5.e$m r0 = new U5.e$m
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.f7932s
            java.lang.Object r1 = p139n8.b.e()
            int r2 = r0.f7934u
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L42
            if (r2 == r4) goto L35
            if (r2 != r3) goto L2d
            p079h8.r.b(r10)
            goto L78
        L2d:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L35:
            java.lang.Object r8 = r0.f7931r
            r9 = r8
            java.lang.String r9 = (java.lang.String) r9
            java.lang.Object r8 = r0.f7930q
            U5.e r8 = (U5.e) r8
            p079h8.r.b(r10)
            goto L59
        L42:
            p079h8.r.b(r10)
            U5.e$o r10 = new U5.e$o
            r10.<init>(r5)
            r0.f7930q = r8
            r0.f7931r = r9
            r0.f7934u = r4
            r6 = 5000(0x1388, double:2.4703E-320)
            java.lang.Object r10 = F8.Y0.c(r6, r10, r0)
            if (r10 != r1) goto L59
            goto L77
        L59:
            h8.A r10 = (p079h8.A) r10
            if (r10 != 0) goto L64
            java.lang.String r10 = "WidgetRepository"
            java.lang.String r2 = "restoreWidgetsFromSaveState: wait for first pipeline emit timed out, applying draft anyway"
            com.nothing.wallpaper.common.log.c.f(r10, r2)
        L64:
            F8.I r10 = r8.f7855c
            U5.e$n r2 = new U5.e$n
            r2.<init>(r9, r5)
            r0.f7930q = r5
            r0.f7931r = r5
            r0.f7934u = r3
            java.lang.Object r8 = F8.AbstractC0812g.g(r10, r2, r0)
            if (r8 != r1) goto L78
        L77:
            return r1
        L78:
            h8.A r8 = p079h8.A.f21846a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: U5.e.i(java.lang.String, m8.e):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0141, code lost:
    
        if (F8.AbstractC0812g.g(r1, r6, r2) == r3) goto L43;
     */
    @Override // U5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object k(p129m8.e r18) {
        /*
            Method dump skipped, instruction units count: 327
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: U5.e.k(m8.e):java.lang.Object");
    }

    @Override // U5.a
    public void l(boolean z9) {
        this.f7863k = z9;
    }

    @Override // U5.a
    public Object m(p129m8.e eVar) {
        Object objA = O0.j.a(S(this.f7853a), new x(null), eVar);
        return objA == p139n8.b.e() ? objA : p079h8.A.f21846a;
    }

    @Override // U5.a
    public Object n(p129m8.e eVar) {
        Object objA = O0.j.a(S(this.f7853a), new y(null), eVar);
        return objA == p139n8.b.e() ? objA : p079h8.A.f21846a;
    }

    @Override // U5.a
    public InterfaceC0880f o() {
        return this.f7861i;
    }

    @Override // U5.a
    public InterfaceC0880f p() {
        return this.f7866n;
    }

    @Override // U5.a
    public void q(p079h8.o info) {
        kotlin.jvm.internal.n.h(info, "info");
        AbstractC0816i.d(this.f7854b, this.f7855c, null, new C0958c(info, null), 2, null);
    }

    @Override // U5.a
    public boolean r() {
        return Settings.Secure.getInt(this.f7853a.getContentResolver(), "lock_screen_expand_widget_enable", 0) != 0;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // U5.a
    public Object s(p079h8.o oVar, p129m8.e eVar) {
        d dVar;
        if (eVar instanceof d) {
            dVar = (d) eVar;
            int i10 = dVar.f7898t;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                dVar.f7898t = i10 - Integer.MIN_VALUE;
            } else {
                dVar = new d(eVar);
            }
        } else {
            dVar = new d(eVar);
        }
        Object objX = dVar.f7896r;
        Object objE = p139n8.b.e();
        int i11 = dVar.f7898t;
        if (i11 == 0) {
            p079h8.r.b(objX);
            l(false);
            I8.z zVar = this.f7860h;
            dVar.f7895q = oVar;
            dVar.f7898t = 1;
            objX = AbstractC0882h.x(zVar, dVar);
            if (objX == objE) {
                return objE;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oVar = (p079h8.o) dVar.f7895q;
            p079h8.r.b(objX);
        }
        List list = (List) objX;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((com.nothing.launcher.card.t) ((p079h8.o) obj).d()).n()) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            list.remove((p079h8.o) it.next());
        }
        list.add(oVar);
        return p079h8.A.f21846a;
    }

    @Override // U5.a
    public CardWidgetSimpleInfo[] t() {
        CardWidgetSimpleInfo[] cardWidgetSimpleInfoArr;
        String str = this.f7859g;
        return (str == null || (cardWidgetSimpleInfoArr = (CardWidgetSimpleInfo[]) this.f7857e.fromJson(str, CardWidgetSimpleInfo[].class)) == null) ? new CardWidgetSimpleInfo[0] : cardWidgetSimpleInfoArr;
    }

    @Override // U5.a
    public List u() {
        return Z(Settings.Secure.getString(this.f7853a.getContentResolver(), "systemui_widget_infos"));
    }

    @Override // U5.a
    public void v() {
        AbstractC0816i.d(this.f7854b, this.f7855c, null, new z(null), 2, null);
    }

    @Override // U5.a
    public InterfaceC0880f w() {
        return this.f7867o;
    }

    @Override // U5.a
    public InterfaceC0880f x() {
        return this.f7870r;
    }

    @Override // U5.a
    public void y(int i10) {
        AbstractC0816i.d(this.f7854b, this.f7855c, null, new g(i10, null), 2, null);
    }

    @Override // U5.a
    public void z() {
        this.f7869q.setValue(null);
    }
}
