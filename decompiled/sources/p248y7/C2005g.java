package p248y7;

import F8.AbstractC0816i;
import F8.I;
import F8.InterfaceC0846x0;
import F8.L;
import H8.t;
import I8.AbstractC0882h;
import I8.InterfaceC0880f;
import android.app.AlarmManager;
import android.content.BroadcastReceiver;
import android.content.ContentProviderClient;
import android.content.ContentResolver;
import android.content.ContentUris;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.database.ContentObserver;
import android.net.Uri;
import android.os.Bundle;
import android.provider.Settings;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.AbstractC1457h;
import kotlin.jvm.internal.n;
import p079h8.A;
import p079h8.r;
import p219v8.p;
import p219v8.q;

/* JADX INFO: renamed from: y7.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2005g {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final a f30417r = new a(null);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final Uri f30418s = Uri.parse("content://com.nothing.weather.share/query/geo_weather_info");

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final Uri f30419t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static final Uri f30420u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static final String[] f30421v;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f30422a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final L f30423b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ContentResolver f30424c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final List f30425d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private InterfaceC0846x0 f30426e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Y5.a f30427f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private X5.a f30428g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private O2.a f30429h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final p079h8.h f30430i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final InterfaceC0880f f30431j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final InterfaceC0880f f30432k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final InterfaceC0880f f30433l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final InterfaceC0880f f30434m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final InterfaceC0880f f30435n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final InterfaceC0880f f30436o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final InterfaceC0880f f30437p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final InterfaceC0880f f30438q;

    /* JADX INFO: renamed from: y7.g$a */
    public static final class a {
        public /* synthetic */ a(AbstractC1457h abstractC1457h) {
            this();
        }

        private a() {
        }
    }

    /* JADX INFO: renamed from: y7.g$b */
    public interface b {
        void a(X5.a aVar);

        void b(O2.a aVar);

        void c(Y5.a aVar);
    }

    /* JADX INFO: renamed from: y7.g$c */
    static final class c extends l implements p {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f30439q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private /* synthetic */ Object f30440r;

        /* JADX INFO: renamed from: y7.g$c$a */
        public static final class a extends BroadcastReceiver {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ t f30442a;

            a(t tVar) {
                this.f30442a = tVar;
            }

            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, Intent intent) {
                n.h(context, "context");
                n.h(intent, "intent");
                if (n.d("android.intent.action.TIMEZONE_CHANGED", intent.getAction()) || n.d("android.app.action.NEXT_ALARM_CLOCK_CHANGED", intent.getAction())) {
                    c.y(this.f30442a);
                }
            }
        }

        c(p129m8.e eVar) {
            super(2, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final A w(C2005g c2005g, BroadcastReceiver broadcastReceiver) {
            z(c2005g, broadcastReceiver);
            return A.f21846a;
        }

        private static final void x(C2005g c2005g, BroadcastReceiver broadcastReceiver) {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.TIMEZONE_CHANGED");
            intentFilter.addAction("android.app.action.NEXT_ALARM_CLOCK_CHANGED");
            c2005g.f30422a.registerReceiver(broadcastReceiver, intentFilter);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void y(t tVar) {
            tVar.p(new Object());
        }

        private static final void z(C2005g c2005g, BroadcastReceiver broadcastReceiver) {
            c2005g.f30422a.unregisterReceiver(broadcastReceiver);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final p129m8.e create(Object obj, p129m8.e eVar) {
            c cVar = C2005g.this.new c(eVar);
            cVar.f30440r = obj;
            return cVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objE = p139n8.b.e();
            int i10 = this.f30439q;
            if (i10 == 0) {
                r.b(obj);
                t tVar = (t) this.f30440r;
                final a aVar = new a(tVar);
                y(tVar);
                x(C2005g.this, aVar);
                final C2005g c2005g = C2005g.this;
                p219v8.a aVar2 = new p219v8.a() { // from class: y7.h
                    @Override // p219v8.a
                    public final Object invoke() {
                        return C2005g.c.w(c2005g, aVar);
                    }
                };
                this.f30439q = 1;
                if (H8.r.a(tVar, aVar2, this) == objE) {
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

        @Override // p219v8.p
        /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
        public final Object invoke(t tVar, p129m8.e eVar) {
            return ((c) create(tVar, eVar)).invokeSuspend(A.f21846a);
        }
    }

    /* JADX INFO: renamed from: y7.g$d */
    static final class d extends l implements q {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f30443q;

        d(p129m8.e eVar) {
            super(3, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            AlarmManager.AlarmClockInfo nextAlarmClock;
            p139n8.b.e();
            if (this.f30443q != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            r.b(obj);
            AlarmManager alarmManagerU = C2005g.this.u();
            return new O2.a((alarmManagerU == null || (nextAlarmClock = alarmManagerU.getNextAlarmClock()) == null) ? null : kotlin.coroutines.jvm.internal.b.d(nextAlarmClock.getTriggerTime()), "");
        }

        @Override // p219v8.q
        /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
        public final Object e(Object obj, Object obj2, p129m8.e eVar) {
            return C2005g.this.new d(eVar).invokeSuspend(A.f21846a);
        }
    }

    /* JADX INFO: renamed from: y7.g$e */
    static final class e extends l implements p {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f30445q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private /* synthetic */ Object f30446r;

        /* JADX INFO: renamed from: y7.g$e$a */
        public static final class a extends ContentObserver {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ t f30448a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(t tVar) {
                super(null);
                this.f30448a = tVar;
            }

            @Override // android.database.ContentObserver
            public void onChange(boolean z9) {
                e.x(this.f30448a);
            }
        }

        e(p129m8.e eVar) {
            super(2, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final A w(C2005g c2005g, a aVar) {
            c2005g.f30424c.unregisterContentObserver(aVar);
            return A.f21846a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void x(t tVar) {
            tVar.p(new Object());
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final p129m8.e create(Object obj, p129m8.e eVar) {
            e eVar2 = C2005g.this.new e(eVar);
            eVar2.f30446r = obj;
            return eVar2;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objE = p139n8.b.e();
            int i10 = this.f30445q;
            if (i10 == 0) {
                r.b(obj);
                t tVar = (t) this.f30446r;
                final a aVar = new a(tVar);
                x(tVar);
                C2005g c2005g = C2005g.this;
                ContentResolver contentResolver = c2005g.f30424c;
                n.g(contentResolver, "access$getContentResolver$p(...)");
                c2005g.B(contentResolver, C2005g.f30420u, true, aVar);
                final C2005g c2005g2 = C2005g.this;
                p219v8.a aVar2 = new p219v8.a() { // from class: y7.i
                    @Override // p219v8.a
                    public final Object invoke() {
                        return C2005g.e.w(c2005g2, aVar);
                    }
                };
                this.f30445q = 1;
                if (H8.r.a(tVar, aVar2, this) == objE) {
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

        @Override // p219v8.p
        /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
        public final Object invoke(t tVar, p129m8.e eVar) {
            return ((e) create(tVar, eVar)).invokeSuspend(A.f21846a);
        }
    }

    /* JADX INFO: renamed from: y7.g$f */
    static final class f extends l implements q {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f30449q;

        f(p129m8.e eVar) {
            super(3, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            p139n8.b.e();
            if (this.f30449q != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            r.b(obj);
            return C2005g.this.z("calendar") ? C2005g.this.y() : new X5.a();
        }

        @Override // p219v8.q
        /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
        public final Object e(Object obj, Object obj2, p129m8.e eVar) {
            return C2005g.this.new f(eVar).invokeSuspend(A.f21846a);
        }
    }

    /* JADX INFO: renamed from: y7.g$g, reason: collision with other inner class name */
    static final class C0753g extends l implements p {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f30451q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private /* synthetic */ Object f30452r;

        /* JADX INFO: renamed from: y7.g$g$a */
        static final class a extends l implements p {

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            int f30454q;

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            final /* synthetic */ C2005g f30455r;

            /* JADX INFO: renamed from: y7.g$g$a$a, reason: collision with other inner class name */
            static final class C0754a extends l implements p {

                /* JADX INFO: renamed from: q, reason: collision with root package name */
                int f30456q;

                /* JADX INFO: renamed from: r, reason: collision with root package name */
                /* synthetic */ Object f30457r;

                /* JADX INFO: renamed from: s, reason: collision with root package name */
                final /* synthetic */ C2005g f30458s;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0754a(C2005g c2005g, p129m8.e eVar) {
                    super(2, eVar);
                    this.f30458s = c2005g;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final p129m8.e create(Object obj, p129m8.e eVar) {
                    C0754a c0754a = new C0754a(this.f30458s, eVar);
                    c0754a.f30457r = obj;
                    return c0754a;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    p139n8.b.e();
                    if (this.f30456q != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    r.b(obj);
                    Y5.a aVar = (Y5.a) this.f30457r;
                    this.f30458s.f30427f = aVar;
                    Iterator it = this.f30458s.f30425d.iterator();
                    while (it.hasNext()) {
                        ((b) it.next()).c(aVar);
                    }
                    return A.f21846a;
                }

                @Override // p219v8.p
                /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
                public final Object invoke(Y5.a aVar, p129m8.e eVar) {
                    return ((C0754a) create(aVar, eVar)).invokeSuspend(A.f21846a);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(C2005g c2005g, p129m8.e eVar) {
                super(2, eVar);
                this.f30455r = c2005g;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final p129m8.e create(Object obj, p129m8.e eVar) {
                return new a(this.f30455r, eVar);
            }

            @Override // p219v8.p
            public final Object invoke(L l9, p129m8.e eVar) {
                return ((a) create(l9, eVar)).invokeSuspend(A.f21846a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object objE = p139n8.b.e();
                int i10 = this.f30454q;
                if (i10 == 0) {
                    r.b(obj);
                    InterfaceC0880f interfaceC0880f = this.f30455r.f30436o;
                    C0754a c0754a = new C0754a(this.f30455r, null);
                    this.f30454q = 1;
                    if (AbstractC0882h.i(interfaceC0880f, c0754a, this) == objE) {
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

        /* JADX INFO: renamed from: y7.g$g$b */
        static final class b extends l implements p {

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            int f30459q;

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            final /* synthetic */ C2005g f30460r;

            /* JADX INFO: renamed from: y7.g$g$b$a */
            static final class a extends l implements p {

                /* JADX INFO: renamed from: q, reason: collision with root package name */
                int f30461q;

                /* JADX INFO: renamed from: r, reason: collision with root package name */
                /* synthetic */ Object f30462r;

                /* JADX INFO: renamed from: s, reason: collision with root package name */
                final /* synthetic */ C2005g f30463s;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                a(C2005g c2005g, p129m8.e eVar) {
                    super(2, eVar);
                    this.f30463s = c2005g;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final p129m8.e create(Object obj, p129m8.e eVar) {
                    a aVar = new a(this.f30463s, eVar);
                    aVar.f30462r = obj;
                    return aVar;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    p139n8.b.e();
                    if (this.f30461q != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    r.b(obj);
                    X5.a aVar = (X5.a) this.f30462r;
                    this.f30463s.f30428g = aVar;
                    Iterator it = this.f30463s.f30425d.iterator();
                    while (it.hasNext()) {
                        ((b) it.next()).a(aVar);
                    }
                    return A.f21846a;
                }

                @Override // p219v8.p
                /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
                public final Object invoke(X5.a aVar, p129m8.e eVar) {
                    return ((a) create(aVar, eVar)).invokeSuspend(A.f21846a);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(C2005g c2005g, p129m8.e eVar) {
                super(2, eVar);
                this.f30460r = c2005g;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final p129m8.e create(Object obj, p129m8.e eVar) {
                return new b(this.f30460r, eVar);
            }

            @Override // p219v8.p
            public final Object invoke(L l9, p129m8.e eVar) {
                return ((b) create(l9, eVar)).invokeSuspend(A.f21846a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object objE = p139n8.b.e();
                int i10 = this.f30459q;
                if (i10 == 0) {
                    r.b(obj);
                    InterfaceC0880f interfaceC0880f = this.f30460r.f30437p;
                    a aVar = new a(this.f30460r, null);
                    this.f30459q = 1;
                    if (AbstractC0882h.i(interfaceC0880f, aVar, this) == objE) {
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

        /* JADX INFO: renamed from: y7.g$g$c */
        static final class c extends l implements p {

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            int f30464q;

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            final /* synthetic */ C2005g f30465r;

            /* JADX INFO: renamed from: y7.g$g$c$a */
            static final class a extends l implements p {

                /* JADX INFO: renamed from: q, reason: collision with root package name */
                int f30466q;

                /* JADX INFO: renamed from: r, reason: collision with root package name */
                /* synthetic */ Object f30467r;

                /* JADX INFO: renamed from: s, reason: collision with root package name */
                final /* synthetic */ C2005g f30468s;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                a(C2005g c2005g, p129m8.e eVar) {
                    super(2, eVar);
                    this.f30468s = c2005g;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final p129m8.e create(Object obj, p129m8.e eVar) {
                    a aVar = new a(this.f30468s, eVar);
                    aVar.f30467r = obj;
                    return aVar;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    p139n8.b.e();
                    if (this.f30466q != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    r.b(obj);
                    O2.a aVar = (O2.a) this.f30467r;
                    this.f30468s.f30429h = aVar;
                    Iterator it = this.f30468s.f30425d.iterator();
                    while (it.hasNext()) {
                        ((b) it.next()).b(aVar);
                    }
                    return A.f21846a;
                }

                @Override // p219v8.p
                /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
                public final Object invoke(O2.a aVar, p129m8.e eVar) {
                    return ((a) create(aVar, eVar)).invokeSuspend(A.f21846a);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            c(C2005g c2005g, p129m8.e eVar) {
                super(2, eVar);
                this.f30465r = c2005g;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final p129m8.e create(Object obj, p129m8.e eVar) {
                return new c(this.f30465r, eVar);
            }

            @Override // p219v8.p
            public final Object invoke(L l9, p129m8.e eVar) {
                return ((c) create(l9, eVar)).invokeSuspend(A.f21846a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object objE = p139n8.b.e();
                int i10 = this.f30464q;
                if (i10 == 0) {
                    r.b(obj);
                    InterfaceC0880f interfaceC0880f = this.f30465r.f30438q;
                    a aVar = new a(this.f30465r, null);
                    this.f30464q = 1;
                    if (AbstractC0882h.i(interfaceC0880f, aVar, this) == objE) {
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

        C0753g(p129m8.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final p129m8.e create(Object obj, p129m8.e eVar) {
            C0753g c0753g = C2005g.this.new C0753g(eVar);
            c0753g.f30452r = obj;
            return c0753g;
        }

        @Override // p219v8.p
        public final Object invoke(L l9, p129m8.e eVar) {
            return ((C0753g) create(l9, eVar)).invokeSuspend(A.f21846a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            p139n8.b.e();
            if (this.f30451q != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            r.b(obj);
            L l9 = (L) this.f30452r;
            AbstractC0816i.d(l9, null, null, new a(C2005g.this, null), 3, null);
            AbstractC0816i.d(l9, null, null, new b(C2005g.this, null), 3, null);
            AbstractC0816i.d(l9, null, null, new c(C2005g.this, null), 3, null);
            return A.f21846a;
        }
    }

    /* JADX INFO: renamed from: y7.g$h */
    static final class h extends l implements p {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f30469q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private /* synthetic */ Object f30470r;

        /* JADX INFO: renamed from: y7.g$h$a */
        public static final class a extends ContentObserver {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ t f30472a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(t tVar) {
                super(null);
                this.f30472a = tVar;
            }

            @Override // android.database.ContentObserver
            public void onChange(boolean z9) {
                h.x(this.f30472a);
            }
        }

        h(p129m8.e eVar) {
            super(2, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final A w(C2005g c2005g, a aVar) {
            c2005g.f30424c.unregisterContentObserver(aVar);
            return A.f21846a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void x(t tVar) {
            tVar.p(new Object());
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final p129m8.e create(Object obj, p129m8.e eVar) {
            h hVar = C2005g.this.new h(eVar);
            hVar.f30470r = obj;
            return hVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objE = p139n8.b.e();
            int i10 = this.f30469q;
            if (i10 == 0) {
                r.b(obj);
                t tVar = (t) this.f30470r;
                final a aVar = new a(tVar);
                x(tVar);
                C2005g c2005g = C2005g.this;
                ContentResolver contentResolver = c2005g.f30424c;
                n.g(contentResolver, "access$getContentResolver$p(...)");
                c2005g.B(contentResolver, C2005g.f30419t, true, aVar);
                final C2005g c2005g2 = C2005g.this;
                p219v8.a aVar2 = new p219v8.a() { // from class: y7.j
                    @Override // p219v8.a
                    public final Object invoke() {
                        return C2005g.h.w(c2005g2, aVar);
                    }
                };
                this.f30469q = 1;
                if (H8.r.a(tVar, aVar2, this) == objE) {
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

        @Override // p219v8.p
        /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
        public final Object invoke(t tVar, p129m8.e eVar) {
            return ((h) create(tVar, eVar)).invokeSuspend(A.f21846a);
        }
    }

    /* JADX INFO: renamed from: y7.g$i */
    static final class i extends l implements p {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f30473q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private /* synthetic */ Object f30474r;

        /* JADX INFO: renamed from: y7.g$i$a */
        public static final class a extends ContentObserver {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ t f30476a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(t tVar) {
                super(null);
                this.f30476a = tVar;
            }

            @Override // android.database.ContentObserver
            public void onChange(boolean z9) {
                i.x(this.f30476a);
            }
        }

        i(p129m8.e eVar) {
            super(2, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final A w(C2005g c2005g, a aVar) {
            c2005g.f30424c.unregisterContentObserver(aVar);
            return A.f21846a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void x(t tVar) {
            tVar.p(new Object());
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final p129m8.e create(Object obj, p129m8.e eVar) {
            i iVar = C2005g.this.new i(eVar);
            iVar.f30474r = obj;
            return iVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objE = p139n8.b.e();
            int i10 = this.f30473q;
            if (i10 == 0) {
                r.b(obj);
                t tVar = (t) this.f30474r;
                final a aVar = new a(tVar);
                x(tVar);
                C2005g c2005g = C2005g.this;
                ContentResolver contentResolver = c2005g.f30424c;
                n.g(contentResolver, "access$getContentResolver$p(...)");
                Uri uriFor = Settings.System.getUriFor("time_12_24");
                n.g(uriFor, "getUriFor(...)");
                c2005g.B(contentResolver, uriFor, true, aVar);
                final C2005g c2005g2 = C2005g.this;
                p219v8.a aVar2 = new p219v8.a() { // from class: y7.k
                    @Override // p219v8.a
                    public final Object invoke() {
                        return C2005g.i.w(c2005g2, aVar);
                    }
                };
                this.f30473q = 1;
                if (H8.r.a(tVar, aVar2, this) == objE) {
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

        @Override // p219v8.p
        /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
        public final Object invoke(t tVar, p129m8.e eVar) {
            return ((i) create(tVar, eVar)).invokeSuspend(A.f21846a);
        }
    }

    /* JADX INFO: renamed from: y7.g$j */
    static final class j extends l implements p {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f30477q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private /* synthetic */ Object f30478r;

        /* JADX INFO: renamed from: y7.g$j$a */
        public static final class a extends ContentObserver {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ t f30480a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(t tVar) {
                super(null);
                this.f30480a = tVar;
            }

            @Override // android.database.ContentObserver
            public void onChange(boolean z9) {
                j.x(this.f30480a);
            }
        }

        j(p129m8.e eVar) {
            super(2, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final A w(C2005g c2005g, a aVar) {
            c2005g.f30424c.unregisterContentObserver(aVar);
            return A.f21846a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void x(t tVar) {
            tVar.p(new Object());
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final p129m8.e create(Object obj, p129m8.e eVar) {
            j jVar = C2005g.this.new j(eVar);
            jVar.f30478r = obj;
            return jVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objE = p139n8.b.e();
            int i10 = this.f30477q;
            if (i10 == 0) {
                r.b(obj);
                t tVar = (t) this.f30478r;
                final a aVar = new a(tVar);
                x(tVar);
                C2005g c2005g = C2005g.this;
                ContentResolver contentResolver = c2005g.f30424c;
                n.g(contentResolver, "access$getContentResolver$p(...)");
                Uri uri = C2005g.f30418s;
                n.g(uri, "access$getONE_GLANCE_WEATHER_DATA$cp(...)");
                c2005g.B(contentResolver, uri, true, aVar);
                final C2005g c2005g2 = C2005g.this;
                p219v8.a aVar2 = new p219v8.a() { // from class: y7.l
                    @Override // p219v8.a
                    public final Object invoke() {
                        return C2005g.j.w(c2005g2, aVar);
                    }
                };
                this.f30477q = 1;
                if (H8.r.a(tVar, aVar2, this) == objE) {
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

        @Override // p219v8.p
        /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
        public final Object invoke(t tVar, p129m8.e eVar) {
            return ((j) create(tVar, eVar)).invokeSuspend(A.f21846a);
        }
    }

    /* JADX INFO: renamed from: y7.g$k */
    static final class k extends l implements q {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f30481q;

        k(p129m8.e eVar) {
            super(3, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            p139n8.b.e();
            if (this.f30481q != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            r.b(obj);
            if (C2005g.this.z("weather")) {
                return C2005g.this.A();
            }
            return null;
        }

        @Override // p219v8.q
        /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
        public final Object e(Object obj, Object obj2, p129m8.e eVar) {
            return C2005g.this.new k(eVar).invokeSuspend(A.f21846a);
        }
    }

    static {
        Uri uri = Uri.parse("content://com.nothing.quicklook.share/query/switch_settings");
        n.g(uri, "parse(...)");
        f30419t = uri;
        Uri uri2 = Uri.parse("content://com.nothing.quicklook.share/calendar/instances/when");
        n.g(uri2, "parse(...)");
        f30420u = uri2;
        f30421v = new String[]{"event_id", "title", "begin", "end", "eventLocation"};
    }

    public C2005g(Context context, L scope, I backgroundDispatcher) {
        n.h(context, "context");
        n.h(scope, "scope");
        n.h(backgroundDispatcher, "backgroundDispatcher");
        this.f30422a = context;
        this.f30423b = scope;
        this.f30424c = context.getContentResolver();
        this.f30425d = new ArrayList();
        this.f30430i = p079h8.i.b(new p219v8.a() { // from class: y7.f
            @Override // p219v8.a
            public final Object invoke() {
                return C2005g.s(this.f30416q);
            }
        });
        InterfaceC0880f interfaceC0880fD = AbstractC0882h.D(AbstractC0882h.e(new j(null)), backgroundDispatcher);
        this.f30431j = interfaceC0880fD;
        InterfaceC0880f interfaceC0880fE = AbstractC0882h.e(new e(null));
        this.f30432k = interfaceC0880fE;
        InterfaceC0880f interfaceC0880fD2 = AbstractC0882h.D(AbstractC0882h.e(new h(null)), backgroundDispatcher);
        this.f30433l = interfaceC0880fD2;
        InterfaceC0880f interfaceC0880fD3 = AbstractC0882h.D(AbstractC0882h.e(new i(null)), backgroundDispatcher);
        this.f30434m = interfaceC0880fD3;
        InterfaceC0880f interfaceC0880fD4 = AbstractC0882h.D(AbstractC0882h.e(new c(null)), backgroundDispatcher);
        this.f30435n = interfaceC0880fD4;
        this.f30436o = AbstractC0882h.D(AbstractC0882h.l(interfaceC0880fD, interfaceC0880fD2, new k(null)), backgroundDispatcher);
        this.f30437p = AbstractC0882h.D(AbstractC0882h.l(interfaceC0880fE, interfaceC0880fD2, new f(null)), backgroundDispatcher);
        this.f30438q = AbstractC0882h.D(AbstractC0882h.l(interfaceC0880fD4, interfaceC0880fD3, new d(null)), backgroundDispatcher);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:21:0x006c A[Catch: all -> 0x0083, TryCatch #0 {all -> 0x0083, blocks: (B:2:0x0000, B:14:0x0060, B:22:0x007e, B:21:0x006c, B:19:0x0068, B:20:0x006b, B:17:0x0066, B:4:0x000c, B:6:0x0020, B:8:0x0029, B:11:0x004d), top: B:31:0x0000, inners: #1, #2 }] */
    public final Y5.a A() {
        Object objB;
        Y5.a aVar;
        try {
            h8.q.a aVar2 = p079h8.q.f21862r;
            ContentProviderClient contentProviderClientAcquireContentProviderClient = this.f30424c.acquireContentProviderClient("com.nothing.weather.share");
            if (contentProviderClientAcquireContentProviderClient != null) {
                try {
                    Bundle bundle = new Bundle();
                    bundle.putBoolean("is_force_request", false);
                    Bundle bundleCall = contentProviderClientAcquireContentProviderClient.call("query_weather_info", null, bundle);
                    if (bundleCall == null) {
                        aVar = null;
                    } else if (bundleCall.getInt("response_status") == 1) {
                        aVar = new Y5.a(0L, bundleCall.getString("current_weather_description"), bundleCall.getInt("current_weather_icon"), 0, 0, bundleCall.getInt("current_temp"), null, 0, 217, null);
                    } else {
                        aVar = new Y5.a(0L, null, 0, 0, 0, 0, null, 0, 255, null);
                    }
                    p199t8.a.a(contentProviderClientAcquireContentProviderClient, null);
                    if (aVar == null) {
                        aVar = new Y5.a(0L, null, 0, 0, 0, 0, null, 0, 255, null);
                    }
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        p199t8.a.a(contentProviderClientAcquireContentProviderClient, th);
                        throw th2;
                    }
                }
            } else {
                aVar = new Y5.a(0L, null, 0, 0, 0, 0, null, 0, 255, null);
            }
            objB = p079h8.q.b(aVar);
        } catch (Throwable th3) {
            h8.q.a aVar3 = p079h8.q.f21862r;
            objB = p079h8.q.b(r.a(th3));
        }
        Y5.a aVar4 = new Y5.a(0L, null, 0, 0, 0, 0, null, 0, 255, null);
        if (p079h8.q.f(objB)) {
            objB = aVar4;
        }
        return (Y5.a) objB;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void B(ContentResolver contentResolver, Uri uri, boolean z9, ContentObserver contentObserver) {
        Object objB;
        try {
            h8.q.a aVar = p079h8.q.f21862r;
            contentResolver.registerContentObserver(uri, z9, contentObserver);
            objB = p079h8.q.b(A.f21846a);
        } catch (Throwable th) {
            h8.q.a aVar2 = p079h8.q.f21862r;
            objB = p079h8.q.b(r.a(th));
        }
        Throwable thD = p079h8.q.d(objB);
        if (thD != null) {
            com.nothing.wallpaper.common.log.c.f("ClockShareDataManager", "onActive register failed, msg:" + thD.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AlarmManager s(C2005g c2005g) {
        return (AlarmManager) c2005g.f30422a.getSystemService(AlarmManager.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final AlarmManager u() {
        return (AlarmManager) this.f30430i.getValue();
    }

    private final void x() {
        InterfaceC0846x0 interfaceC0846x0 = this.f30426e;
        if (interfaceC0846x0 != null) {
            InterfaceC0846x0.a.a(interfaceC0846x0, null, 1, null);
        }
        this.f30426e = AbstractC0816i.d(this.f30423b, null, null, new C0753g(null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:9:0x0075 A[Catch: all -> 0x0073, TRY_LEAVE, TryCatch #1 {all -> 0x0073, blocks: (B:4:0x0068, B:6:0x006e, B:9:0x0075), top: B:25:0x0068, outer: #2 }] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v10, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r7v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v14 */
    /* JADX WARN: Type inference failed for: r7v4, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v9, types: [android.database.Cursor, java.io.Closeable] */
    public final X5.a y() {
        ?? B9;
        X5.a aVarA;
        try {
            h8.q.a aVar = p079h8.q.f21862r;
            long time = new Date(System.currentTimeMillis() - ((long) 600000)).getTime();
            Uri.Builder builderBuildUpon = f30420u.buildUpon();
            ContentUris.appendId(builderBuildUpon, time);
            ContentUris.appendId(builderBuildUpon, Long.MAX_VALUE);
            Uri uriBuild = builderBuildUpon.build();
            Bundle bundle = new Bundle();
            bundle.putInt("android:query-arg-limit", 1);
            bundle.putInt("android:query-arg-sort-direction", 0);
            bundle.putString("android:query-arg-sql-selection", "isPrimary = ? and allDay =? and begin > ?");
            bundle.putStringArray("android:query-arg-sort-columns", new String[]{"begin"});
            bundle.putStringArray("android:query-arg-sql-selection-args", new String[]{"1", "0", String.valueOf(time)});
            ?? Query = this.f30424c.query(uriBuild, f30421v, bundle, null);
            if (Query != 0) {
                try {
                    if (Query.moveToFirst()) {
                        aVarA = X5.a.a(Query);
                    } else {
                        aVarA = new X5.a();
                    }
                    p189s8.b.a(Query, null);
                    Query = p079h8.q.b(aVarA);
                    B9 = Query;
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        p189s8.b.a(Query, th);
                        throw th2;
                    }
                }
            } else {
                aVarA = new X5.a();
                p189s8.b.a(Query, null);
                Query = p079h8.q.b(aVarA);
                B9 = Query;
            }
        } catch (Throwable th3) {
            h8.q.a aVar2 = p079h8.q.f21862r;
            B9 = p079h8.q.b(r.a(th3));
        }
        X5.a aVar3 = new X5.a();
        boolean zF = p079h8.q.f(B9);
        ?? r9 = B9;
        if (zF) {
            r9 = aVar3;
        }
        return (X5.a) r9;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:19:0x0031  */
    public final boolean z(String str) {
        Object objB;
        boolean zBooleanValue;
        try {
            h8.q.a aVar = p079h8.q.f21862r;
            ContentProviderClient contentProviderClientAcquireContentProviderClient = this.f30424c.acquireContentProviderClient("com.nothing.quicklook.share");
            if (contentProviderClientAcquireContentProviderClient != null) {
                try {
                    Bundle bundleCall = contentProviderClientAcquireContentProviderClient.call("queryQuickLookSettings", null, null);
                    Boolean boolValueOf = bundleCall != null ? Boolean.valueOf(bundleCall.getBoolean(str)) : null;
                    p199t8.a.a(contentProviderClientAcquireContentProviderClient, null);
                    if (boolValueOf != null) {
                        zBooleanValue = boolValueOf.booleanValue();
                    } else {
                        zBooleanValue = false;
                    }
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        p199t8.a.a(contentProviderClientAcquireContentProviderClient, th);
                        throw th2;
                    }
                }
            } else {
                zBooleanValue = false;
            }
            objB = p079h8.q.b(Boolean.valueOf(zBooleanValue));
        } catch (Throwable th3) {
            h8.q.a aVar2 = p079h8.q.f21862r;
            objB = p079h8.q.b(r.a(th3));
        }
        Boolean bool = Boolean.FALSE;
        if (p079h8.q.f(objB)) {
            objB = bool;
        }
        return ((Boolean) objB).booleanValue();
    }

    public final void C(b l9) {
        n.h(l9, "l");
        if (this.f30425d.size() == 0) {
            x();
        }
        this.f30425d.add(l9);
    }

    public final void D(b l9) {
        n.h(l9, "l");
        this.f30425d.remove(l9);
        if (this.f30425d.size() == 0) {
            InterfaceC0846x0 interfaceC0846x0 = this.f30426e;
            if (interfaceC0846x0 != null) {
                InterfaceC0846x0.a.a(interfaceC0846x0, null, 1, null);
            }
            this.f30426e = null;
        }
    }

    public final O2.a t() {
        return this.f30429h;
    }

    public final X5.a v() {
        return this.f30428g;
    }

    public final Y5.a w() {
        return this.f30427f;
    }
}
