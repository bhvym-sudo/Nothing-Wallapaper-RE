package Q2;

import F8.AbstractC0812g;
import F8.AbstractC0816i;
import F8.I;
import F8.L;
import android.app.ActivityManager;
import android.app.UserSwitchObserver;
import android.content.Context;
import android.database.ContentObserver;
import android.os.Build;
import android.provider.Settings;
import android.util.Log;
import androidx.constraintlayout.core.widgets.Optimizer;
import com.android.systemui.plugins.clocks.ClockProviderPlugin;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.BiConsumer;
import kotlin.jvm.internal.AbstractC1457h;
import kotlin.jvm.internal.F;
import org.json.JSONObject;
import p079h8.A;
import p089i8.AbstractC1444s;
import p089i8.N;

/* JADX INFO: loaded from: classes.dex */
public class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f6749a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final M2.d f6750b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final L f6751c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final I f6752d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final I f6753e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final boolean f6754f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final boolean f6755g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final O2.u f6756h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final String f6757i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final boolean f6758j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final Z2.b f6759k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final String f6760l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final K2.e f6761m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final ConcurrentHashMap f6762n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final ConcurrentHashMap f6763o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final List f6764p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final h f6765q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final f f6766r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final UserSwitchObserverC0241k f6767s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private O2.v f6768t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private boolean f6769u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private AtomicBoolean f6770v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private AtomicBoolean f6771w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private AtomicBoolean f6772x;

    public interface a {
        default void a() {
        }

        void b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final O2.s f6773a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private O2.u f6774b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final M2.b f6775c;

        public b(O2.s metadata, O2.u uVar, M2.b bVar) {
            kotlin.jvm.internal.n.h(metadata, "metadata");
            this.f6773a = metadata;
            this.f6774b = uVar;
            this.f6775c = bVar;
        }

        public final M2.b a() {
            return this.f6775c;
        }

        public final O2.s b() {
            return this.f6773a;
        }

        public final O2.u c() {
            return this.f6774b;
        }

        public final void d(O2.u uVar) {
            this.f6774b = uVar;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return kotlin.jvm.internal.n.d(this.f6773a, bVar.f6773a) && kotlin.jvm.internal.n.d(this.f6774b, bVar.f6774b) && kotlin.jvm.internal.n.d(this.f6775c, bVar.f6775c);
        }

        public int hashCode() {
            int iHashCode = this.f6773a.hashCode() * 31;
            O2.u uVar = this.f6774b;
            int iHashCode2 = (iHashCode + (uVar == null ? 0 : uVar.hashCode())) * 31;
            M2.b bVar = this.f6775c;
            return iHashCode2 + (bVar != null ? bVar.hashCode() : 0);
        }

        public String toString() {
            return "ClockInfo(metadata=" + this.f6773a + ", provider=" + this.f6774b + ", manager=" + this.f6775c + ")";
        }
    }

    static final class c extends kotlin.coroutines.jvm.internal.l implements p219v8.p {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f6776q;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        final /* synthetic */ String f6778s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(String str, p129m8.e eVar) {
            super(2, eVar);
            this.f6778s = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final O2.v u(String str, O2.v vVar) {
            return O2.v.f(vVar, str, null, null, 6, null);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final p129m8.e create(Object obj, p129m8.e eVar) {
            return k.this.new c(this.f6778s, eVar);
        }

        @Override // p219v8.p
        public final Object invoke(L l9, p129m8.e eVar) {
            return ((c) create(l9, eVar)).invokeSuspend(A.f21846a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objE = p139n8.b.e();
            int i10 = this.f6776q;
            if (i10 == 0) {
                p079h8.r.b(obj);
                k kVar = k.this;
                final String str = this.f6778s;
                p219v8.l lVar = new p219v8.l() { // from class: Q2.l
                    @Override // p219v8.l
                    public final Object f(Object obj2) {
                        return k.c.u(str, (O2.v) obj2);
                    }
                };
                this.f6776q = 1;
                if (kVar.F(lVar, this) == objE) {
                    return objE;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                p079h8.r.b(obj);
            }
            return A.f21846a;
        }
    }

    public static final class d implements Comparator {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ List f6779a;

        public d(List list) {
            this.f6779a = list;
        }

        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return p109k8.a.d(Integer.valueOf(this.f6779a.indexOf((String) ((p079h8.o) obj).a())), Integer.valueOf(this.f6779a.indexOf((String) ((p079h8.o) obj2).a())));
        }
    }

    static final class e extends kotlin.coroutines.jvm.internal.l implements p219v8.p {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f6780q;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        final /* synthetic */ p219v8.l f6782s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(p219v8.l lVar, p129m8.e eVar) {
            super(2, eVar);
            this.f6782s = lVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final p129m8.e create(Object obj, p129m8.e eVar) {
            return k.this.new e(this.f6782s, eVar);
        }

        @Override // p219v8.p
        public final Object invoke(L l9, p129m8.e eVar) {
            return ((e) create(l9, eVar)).invokeSuspend(A.f21846a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            p139n8.b.e();
            if (this.f6780q != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p079h8.r.b(obj);
            k kVar = k.this;
            p219v8.l lVar = this.f6782s;
            O2.v vVarE = kVar.E();
            if (vVarE == null) {
                vVarE = new O2.v(null, null, null, 7, null);
            }
            kVar.q((O2.v) lVar.f(vVarE));
            return A.f21846a;
        }
    }

    public static final class f implements M2.c {
        f() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void n(k kVar, String str, String str2) {
            kVar.w();
            androidx.appcompat.app.o.a(null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String o(K2.b w9) {
            kotlin.jvm.internal.n.h(w9, "$this$w");
            return "Loading unrecognized clock package: " + w9.o();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String p(K2.b i10) {
            kotlin.jvm.internal.n.h(i10, "$this$i");
            return "Skipping initial load of known clock package package: " + i10.o();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final A q(kotlin.jvm.internal.A a10, k kVar, b it) {
            kotlin.jvm.internal.n.h(it, "it");
            a10.f22775q = true;
            kVar.G(it);
            return A.f21846a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String r(K2.b e10) {
            kotlin.jvm.internal.n.h(e10, "$this$e");
            return "Clock Id conflict on attach: " + e10.o() + " is double registered by " + e10.n() + " and " + e10.e() + ". Using " + e10.n() + " since it was attached first.";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean s(M2.b bVar, List list, Map.Entry it) {
            kotlin.jvm.internal.n.h(it, "it");
            if (!kotlin.jvm.internal.n.d(((b) it.getValue()).a(), bVar)) {
                return false;
            }
            Object value = it.getValue();
            kotlin.jvm.internal.n.g(value, "<get-value>(...)");
            list.add(value);
            return true;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final A u(kotlin.jvm.internal.A a10, k kVar, b it) {
            kotlin.jvm.internal.n.h(it, "it");
            a10.f22775q = true;
            kVar.G(it);
            return A.f21846a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String v(K2.b e10) {
            kotlin.jvm.internal.n.h(e10, "$this$e");
            return "Clock Id conflict on load: " + e10.o() + " is double registered by " + e10.n() + " and " + e10.e() + ". Using " + e10.n() + " since it was attached first.";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String x(K2.b e10) {
            kotlin.jvm.internal.n.h(e10, "$this$e");
            return "Clock Id conflict on unload: " + e10.o() + " is double registered by " + e10.n() + " and " + e10.e() + ". Using " + e10.n() + " since it was attached first.";
        }

        @Override // M2.c
        public void a(final M2.b manager) {
            kotlin.jvm.internal.n.h(manager, "manager");
            final ArrayList arrayList = new ArrayList();
            Set setEntrySet = k.this.f6763o.entrySet();
            kotlin.jvm.internal.n.g(setEntrySet, "<get-entries>(...)");
            AbstractC1444s.D(setEntrySet, new p219v8.l() { // from class: Q2.m
                @Override // p219v8.l
                public final Object f(Object obj) {
                    return Boolean.valueOf(k.f.s(manager, arrayList, (Map.Entry) obj));
                }
            });
            k kVar = k.this;
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                kVar.I((b) it.next());
            }
            if (arrayList.size() > 0) {
                k.this.T();
            }
        }

        @Override // M2.c
        public boolean c(M2.b manager) {
            String string;
            kotlin.jvm.internal.n.h(manager, "manager");
            final k kVar = k.this;
            manager.c(new BiConsumer() { // from class: Q2.p
                @Override // java.util.function.BiConsumer
                public final void accept(Object obj, Object obj2) {
                    k.f.n(kVar, (String) obj, (String) obj2);
                }
            });
            if (k.this.B()) {
                return true;
            }
            List<O2.s> list = (List) v.f6807b.get(manager.a());
            if (list == null) {
                K2.e eVar = k.this.f6761m;
                K2.b bVarA = eVar.e().a(eVar.f(), K2.a.WARNING, new p219v8.l() { // from class: Q2.q
                    @Override // p219v8.l
                    public final Object f(Object obj) {
                        return k.f.o((K2.b) obj);
                    }
                }, null);
                bVarA.k(manager.a());
                eVar.e().b(bVarA);
                return true;
            }
            K2.e eVar2 = k.this.f6761m;
            K2.b bVarA2 = eVar2.e().a(eVar2.f(), K2.a.INFO, new p219v8.l() { // from class: Q2.r
                @Override // p219v8.l
                public final Object f(Object obj) {
                    return k.f.p((K2.b) obj);
                }
            }, null);
            bVarA2.k(manager.a());
            eVar2.e().b(bVarA2);
            final kotlin.jvm.internal.A a10 = new kotlin.jvm.internal.A();
            boolean z9 = false;
            for (O2.s sVar : list) {
                String strA = sVar.a();
                ConcurrentHashMap concurrentHashMap = k.this.f6763o;
                b bVar = new b(sVar, null, manager);
                final k kVar2 = k.this;
                b bVar2 = (b) v.e(concurrentHashMap, strA, bVar, new p219v8.l() { // from class: Q2.s
                    @Override // p219v8.l
                    public final Object f(Object obj) {
                        return k.f.q(a10, kVar2, (k.b) obj);
                    }
                });
                if (kotlin.jvm.internal.n.d(manager, bVar2.a())) {
                    z9 = z9 || kotlin.jvm.internal.n.d(k.this.A(), sVar.a());
                    bVar2.d(null);
                } else {
                    K2.e eVar3 = k.this.f6761m;
                    K2.b bVarA3 = eVar3.e().a(eVar3.f(), K2.a.ERROR, new p219v8.l() { // from class: Q2.t
                        @Override // p219v8.l
                        public final Object f(Object obj) {
                            return k.f.r((K2.b) obj);
                        }
                    }, null);
                    bVarA3.k(strA);
                    M2.b bVarA4 = bVar2.a();
                    if (bVarA4 == null || (string = bVarA4.toString()) == null) {
                        O2.u uVarC = bVar2.c();
                        string = uVarC != null ? uVarC.toString() : null;
                    }
                    bVarA3.i(string);
                    bVarA3.m(manager.toString());
                    eVar3.e().b(bVarA3);
                }
            }
            if (a10.f22775q) {
                k.this.T();
            }
            k.this.W();
            return z9;
        }

        @Override // M2.c
        /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
        public void b(ClockProviderPlugin plugin, Context pluginContext, M2.b manager) {
            String string;
            kotlin.jvm.internal.n.h(plugin, "plugin");
            kotlin.jvm.internal.n.h(pluginContext, "pluginContext");
            kotlin.jvm.internal.n.h(manager, "manager");
            k.this.w();
            plugin.initialize(null);
            final kotlin.jvm.internal.A a10 = new kotlin.jvm.internal.A();
            for (O2.s sVar : plugin.getClocks()) {
                String strA = sVar.a();
                ConcurrentHashMap concurrentHashMap = k.this.f6763o;
                b bVar = new b(sVar, plugin, manager);
                final k kVar = k.this;
                b bVar2 = (b) v.e(concurrentHashMap, strA, bVar, new p219v8.l() { // from class: Q2.n
                    @Override // p219v8.l
                    public final Object f(Object obj) {
                        return k.f.u(a10, kVar, (k.b) obj);
                    }
                });
                if (kotlin.jvm.internal.n.d(manager, bVar2.a())) {
                    String strB = sVar.b();
                    if (strB != null) {
                        k.this.f6762n.put(strA, strB);
                    }
                    bVar2.d(plugin);
                    k.this.K(bVar2);
                } else {
                    K2.e eVar = k.this.f6761m;
                    K2.b bVarA = eVar.e().a(eVar.f(), K2.a.ERROR, new p219v8.l() { // from class: Q2.o
                        @Override // p219v8.l
                        public final Object f(Object obj) {
                            return k.f.v((K2.b) obj);
                        }
                    }, null);
                    bVarA.k(strA);
                    M2.b bVarA2 = bVar2.a();
                    if (bVarA2 == null || (string = bVarA2.toString()) == null) {
                        O2.u uVarC = bVar2.c();
                        string = uVarC != null ? uVarC.toString() : null;
                    }
                    bVarA.i(string);
                    bVarA.m(manager.toString());
                    eVar.e().b(bVarA);
                    manager.d();
                }
            }
            if (a10.f22775q) {
                k.this.T();
            }
            k.this.W();
        }

        @Override // M2.c
        /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
        public void d(ClockProviderPlugin plugin, M2.b manager) {
            O2.u uVarC;
            M2.b bVarA;
            String string;
            kotlin.jvm.internal.n.h(plugin, "plugin");
            kotlin.jvm.internal.n.h(manager, "manager");
            Iterator it = plugin.getClocks().iterator();
            while (it.hasNext()) {
                String strA = ((O2.s) it.next()).a();
                b bVar = (b) k.this.f6763o.get(strA);
                String string2 = null;
                if (kotlin.jvm.internal.n.d(bVar != null ? bVar.a() : null, manager)) {
                    bVar.d(null);
                    k.this.M(bVar);
                } else {
                    K2.e eVar = k.this.f6761m;
                    K2.b bVarA2 = eVar.e().a(eVar.f(), K2.a.ERROR, new p219v8.l() { // from class: Q2.u
                        @Override // p219v8.l
                        public final Object f(Object obj) {
                            return k.f.x((K2.b) obj);
                        }
                    }, null);
                    bVarA2.k(strA);
                    if (bVar != null && (bVarA = bVar.a()) != null && (string = bVarA.toString()) != null) {
                        string2 = string;
                    } else if (bVar != null && (uVarC = bVar.c()) != null) {
                        string2 = uVarC.toString();
                    }
                    bVarA2.i(string2);
                    bVarA2.m(manager.toString());
                    eVar.e().b(bVarA2);
                }
            }
            k.this.W();
        }
    }

    static final class g extends kotlin.coroutines.jvm.internal.l implements p219v8.p {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f6784q;

        g(p129m8.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final p129m8.e create(Object obj, p129m8.e eVar) {
            return k.this.new g(eVar);
        }

        @Override // p219v8.p
        public final Object invoke(L l9, p129m8.e eVar) {
            return ((g) create(l9, eVar)).invokeSuspend(A.f21846a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            p139n8.b.e();
            if (this.f6784q != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p079h8.r.b(obj);
            k.this.O();
            return A.f21846a;
        }
    }

    public static final class h extends ContentObserver {

        static final class a extends kotlin.coroutines.jvm.internal.l implements p219v8.p {

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            int f6787q;

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            final /* synthetic */ k f6788r;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(k kVar, p129m8.e eVar) {
                super(2, eVar);
                this.f6788r = kVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final p129m8.e create(Object obj, p129m8.e eVar) {
                return new a(this.f6788r, eVar);
            }

            @Override // p219v8.p
            public final Object invoke(L l9, p129m8.e eVar) {
                return ((a) create(l9, eVar)).invokeSuspend(A.f21846a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                p139n8.b.e();
                if (this.f6787q != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                p079h8.r.b(obj);
                this.f6788r.O();
                return A.f21846a;
            }
        }

        h() {
            super(null);
        }

        public void onChange(boolean z9, Collection uris, int i10, int i11) {
            kotlin.jvm.internal.n.h(uris, "uris");
            AbstractC0816i.d(k.this.C(), k.this.v(), null, new a(k.this, null), 2, null);
        }
    }

    static final class i extends kotlin.coroutines.jvm.internal.l implements p219v8.p {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f6789q;

        i(p129m8.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final p129m8.e create(Object obj, p129m8.e eVar) {
            return k.this.new i(eVar);
        }

        @Override // p219v8.p
        public final Object invoke(L l9, p129m8.e eVar) {
            return ((i) create(l9, eVar)).invokeSuspend(A.f21846a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            p139n8.b.e();
            if (this.f6789q != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p079h8.r.b(obj);
            k.this.u().a();
            k.this.f6771w.set(false);
            Iterator it = k.this.f6764p.iterator();
            while (it.hasNext()) {
                ((a) it.next()).b();
            }
            return A.f21846a;
        }
    }

    static final class j extends kotlin.coroutines.jvm.internal.l implements p219v8.p {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f6791q;

        j(p129m8.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final p129m8.e create(Object obj, p129m8.e eVar) {
            return k.this.new j(eVar);
        }

        @Override // p219v8.p
        public final Object invoke(L l9, p129m8.e eVar) {
            return ((j) create(l9, eVar)).invokeSuspend(A.f21846a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            p139n8.b.e();
            if (this.f6791q != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p079h8.r.b(obj);
            k.this.u().a();
            k.this.f6770v.set(false);
            Iterator it = k.this.f6764p.iterator();
            while (it.hasNext()) {
                ((a) it.next()).a();
            }
            return A.f21846a;
        }
    }

    /* JADX INFO: renamed from: Q2.k$k, reason: collision with other inner class name */
    public static final class UserSwitchObserverC0241k extends UserSwitchObserver {

        /* JADX INFO: renamed from: Q2.k$k$a */
        static final class a extends kotlin.coroutines.jvm.internal.l implements p219v8.p {

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            int f6794q;

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            final /* synthetic */ k f6795r;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(k kVar, p129m8.e eVar) {
                super(2, eVar);
                this.f6795r = kVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final p129m8.e create(Object obj, p129m8.e eVar) {
                return new a(this.f6795r, eVar);
            }

            @Override // p219v8.p
            public final Object invoke(L l9, p129m8.e eVar) {
                return ((a) create(l9, eVar)).invokeSuspend(A.f21846a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                p139n8.b.e();
                if (this.f6794q != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                p079h8.r.b(obj);
                this.f6795r.O();
                return A.f21846a;
            }
        }

        UserSwitchObserverC0241k() {
        }

        public void onUserSwitchComplete(int i10) {
            AbstractC0816i.d(k.this.C(), k.this.v(), null, new a(k.this, null), 2, null);
        }
    }

    static final class l extends kotlin.coroutines.jvm.internal.l implements p219v8.p {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f6796q;

        l(p129m8.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final p129m8.e create(Object obj, p129m8.e eVar) {
            return k.this.new l(eVar);
        }

        @Override // p219v8.p
        public final Object invoke(L l9, p129m8.e eVar) {
            return ((l) create(l9, eVar)).invokeSuspend(A.f21846a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            p139n8.b.e();
            if (this.f6796q != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p079h8.r.b(obj);
            ConcurrentHashMap concurrentHashMap = k.this.f6763o;
            k kVar = k.this;
            synchronized (concurrentHashMap) {
                try {
                    kVar.f6772x.set(false);
                    if (kVar.B()) {
                        K2.e.h(kVar.f6761m, "verifyLoadedProviders: keepAllLoaded=true", null, 2, null);
                        Iterator it = kVar.f6763o.entrySet().iterator();
                        while (it.hasNext()) {
                            M2.b bVarA = ((b) ((Map.Entry) it.next()).getValue()).a();
                            if (bVarA != null) {
                                bVarA.b();
                            }
                        }
                        return A.f21846a;
                    }
                    b bVar = (b) kVar.f6763o.get(kVar.A());
                    if (bVar == null) {
                        K2.e.h(kVar.f6761m, "verifyLoadedProviders: currentClock=null", null, 2, null);
                        Iterator it2 = kVar.f6763o.entrySet().iterator();
                        while (it2.hasNext()) {
                            M2.b bVarA2 = ((b) ((Map.Entry) it2.next()).getValue()).a();
                            if (bVarA2 != null) {
                                bVarA2.d();
                            }
                        }
                        return A.f21846a;
                    }
                    K2.e.h(kVar.f6761m, "verifyLoadedProviders: load currentClock", null, 2, null);
                    M2.b bVarA3 = bVar.a();
                    if (bVarA3 != null) {
                        bVarA3.b();
                    }
                    Iterator it3 = kVar.f6763o.entrySet().iterator();
                    while (it3.hasNext()) {
                        M2.b bVarA4 = ((b) ((Map.Entry) it3.next()).getValue()).a();
                        if (bVarA4 != null && !kotlin.jvm.internal.n.d(bVarA3, bVarA4)) {
                            bVarA4.d();
                        }
                    }
                    return A.f21846a;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public k(Context context, M2.d pluginManager, L scope, I mainDispatcher, I bgDispatcher, boolean z9, boolean z10, O2.u defaultClockProvider, String fallbackClockId, O2.r rVar, boolean z11, String subTag, Z2.b bVar) {
        kotlin.jvm.internal.n.h(context, "context");
        kotlin.jvm.internal.n.h(pluginManager, "pluginManager");
        kotlin.jvm.internal.n.h(scope, "scope");
        kotlin.jvm.internal.n.h(mainDispatcher, "mainDispatcher");
        kotlin.jvm.internal.n.h(bgDispatcher, "bgDispatcher");
        kotlin.jvm.internal.n.h(defaultClockProvider, "defaultClockProvider");
        kotlin.jvm.internal.n.h(fallbackClockId, "fallbackClockId");
        kotlin.jvm.internal.n.h(subTag, "subTag");
        kotlin.jvm.internal.n.h(bVar, "assert");
        this.f6749a = context;
        this.f6750b = pluginManager;
        this.f6751c = scope;
        this.f6752d = mainDispatcher;
        this.f6753e = bgDispatcher;
        this.f6754f = z9;
        this.f6755g = z10;
        this.f6756h = defaultClockProvider;
        this.f6757i = fallbackClockId;
        this.f6758j = z11;
        this.f6759k = bVar;
        String str = F.b(k.class).b() + " (" + subTag + ")";
        this.f6760l = str;
        this.f6761m = new K2.e(new K2.c(K2.a.DEBUG), str);
        this.f6762n = new ConcurrentHashMap();
        this.f6763o = new ConcurrentHashMap();
        this.f6764p = new ArrayList();
        this.f6765q = new h();
        this.f6766r = new f();
        this.f6767s = new UserSwitchObserverC0241k();
        this.f6770v = new AtomicBoolean(false);
        this.f6771w = new AtomicBoolean(false);
        defaultClockProvider.initialize(null);
        for (O2.s sVar : defaultClockProvider.getClocks()) {
            this.f6763o.put(sVar.a(), new b(sVar, this.f6756h, null));
            String strB = sVar.b();
            if (strB != null) {
                this.f6762n.put(sVar.a(), strB);
            }
        }
        if (this.f6763o.containsKey("DEFAULT")) {
            this.f6772x = new AtomicBoolean(false);
            return;
        }
        throw new IllegalArgumentException(this.f6756h + " did not register clock at DEFAULT");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void G(b bVar) {
        boolean zD = kotlin.jvm.internal.n.d(A(), bVar.b().a());
        K2.e eVar = this.f6761m;
        K2.b bVarA = eVar.e().a(eVar.f(), zD ? K2.a.INFO : K2.a.DEBUG, new p219v8.l() { // from class: Q2.i
            @Override // p219v8.l
            public final Object f(Object obj) {
                return k.H((K2.b) obj);
            }
        }, null);
        bVarA.k(bVar.b().a());
        bVarA.i(String.valueOf(bVar.a()));
        bVarA.g(zD);
        eVar.e().b(bVarA);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String H(K2.b log) {
        kotlin.jvm.internal.n.h(log, "$this$log");
        return "Connected " + log.o() + " @" + log.n() + (log.c() ? " (Current Clock)" : "");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void I(b bVar) {
        boolean zD = kotlin.jvm.internal.n.d(A(), bVar.b().a());
        K2.e eVar = this.f6761m;
        K2.b bVarA = eVar.e().a(eVar.f(), zD ? K2.a.INFO : K2.a.DEBUG, new p219v8.l() { // from class: Q2.g
            @Override // p219v8.l
            public final Object f(Object obj) {
                return k.J((K2.b) obj);
            }
        }, null);
        bVarA.k(bVar.b().a());
        bVarA.i(String.valueOf(bVar.a()));
        bVarA.g(zD);
        eVar.e().b(bVarA);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String J(K2.b log) {
        kotlin.jvm.internal.n.h(log, "$this$log");
        return "Disconnected " + log.o() + " @" + log.n() + (log.c() ? " (Current Clock)" : "");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void K(b bVar) {
        boolean zD = kotlin.jvm.internal.n.d(A(), bVar.b().a());
        K2.e eVar = this.f6761m;
        K2.b bVarA = eVar.e().a(eVar.f(), zD ? K2.a.INFO : K2.a.DEBUG, new p219v8.l() { // from class: Q2.j
            @Override // p219v8.l
            public final Object f(Object obj) {
                return k.L((K2.b) obj);
            }
        }, null);
        bVarA.k(bVar.b().a());
        bVarA.i(String.valueOf(bVar.a()));
        bVarA.g(zD);
        eVar.e().b(bVarA);
        if (zD) {
            U();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String L(K2.b log) {
        kotlin.jvm.internal.n.h(log, "$this$log");
        return "Loaded " + log.o() + " @" + log.n() + (log.c() ? " (Current Clock)" : "");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void M(b bVar) {
        boolean zD = kotlin.jvm.internal.n.d(A(), bVar.b().a());
        K2.e eVar = this.f6761m;
        K2.b bVarA = eVar.e().a(eVar.f(), zD ? K2.a.WARNING : K2.a.DEBUG, new p219v8.l() { // from class: Q2.h
            @Override // p219v8.l
            public final Object f(Object obj) {
                return k.N((K2.b) obj);
            }
        }, null);
        bVarA.k(bVar.b().a());
        bVarA.i(String.valueOf(bVar.a()));
        bVarA.g(zD);
        eVar.e().b(bVarA);
        if (zD) {
            U();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String N(K2.b log) {
        kotlin.jvm.internal.n.h(log, "$this$log");
        return "Unloaded " + log.o() + " @" + log.n() + (log.c() ? " (Current Clock)" : "");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void T() {
        if (this.f6771w.compareAndSet(false, true)) {
            AbstractC0816i.d(this.f6751c, this.f6752d, null, new i(null), 2, null);
        }
    }

    private final void U() {
        if (this.f6770v.compareAndSet(false, true)) {
            AbstractC0816i.d(this.f6751c, this.f6752d, null, new j(null), 2, null);
        }
    }

    private final O2.h r(String str) {
        String str2;
        O2.u uVarC;
        O2.v vVarE = E();
        O2.v vVar = vVarE == null ? new O2.v(null, null, null, 7, null) : vVarE;
        if (kotlin.jvm.internal.n.d(str, vVar.h())) {
            str2 = str;
        } else {
            str2 = str;
            vVar = O2.v.f(vVar, str2, null, null, 6, null);
        }
        b bVar = (b) this.f6763o.get(str2);
        if (bVar == null || (uVarC = bVar.c()) == null) {
            return null;
        }
        return uVarC.createClock(vVar);
    }

    public static /* synthetic */ List z(k kVar, boolean z9, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getClocks");
        }
        if ((i10 & 1) != 0) {
            z9 = false;
        }
        return kVar.y(z9);
    }

    public final String A() {
        String strH;
        O2.v vVarE = E();
        return (vVarE == null || (strH = vVarE.h()) == null) ? this.f6757i : strH;
    }

    public final boolean B() {
        return this.f6758j;
    }

    public final L C() {
        return this.f6751c;
    }

    public final Integer D() {
        O2.v vVarE = E();
        if (vVarE != null) {
            return vVarE.j();
        }
        return null;
    }

    public final O2.v E() {
        return this.f6768t;
    }

    public final Object F(p219v8.l lVar, p129m8.e eVar) {
        Object objG = AbstractC0812g.g(this.f6753e, new e(lVar, null), eVar);
        return objG == p139n8.b.e() ? objG : A.f21846a;
    }

    public void O() {
        p037d6.f fVar;
        this.f6759k.b();
        O2.v vVar = null;
        try {
            String stringForUser = this.f6755g ? Settings.Secure.getStringForUser(this.f6749a.getContentResolver(), "lock_screen_custom_clock_face", ActivityManager.getCurrentUser()) : Settings.Secure.getString(this.f6749a.getContentResolver(), "lock_screen_custom_clock_face");
            if (stringForUser != null) {
                vVar = O2.v.f5811e.a(new JSONObject(stringForUser));
            }
        } catch (Exception e10) {
            this.f6761m.d("Failed to parse clock settings", e10);
        }
        if (vVar == null) {
            int i10 = Settings.System.getInt(this.f6749a.getContentResolver(), "nt_ota_user", -1);
            if (i10 == -1) {
                i10 = Settings.Global.getInt(this.f6749a.getContentResolver(), "nt_is_upgrade", 0);
                Settings.Global.putInt(this.f6749a.getContentResolver(), "nt_is_upgrade", 0);
                Settings.System.putInt(this.f6749a.getContentResolver(), "nt_ota_user", i10);
            }
            if (v.f6808c) {
                fVar = p037d6.f.f19681D;
            } else if (i10 == 1) {
                fVar = p037d6.f.f19678A;
            } else {
                fVar = Build.VERSION.SDK_INT <= 35 ? p037d6.f.f19688w : p037d6.f.f19691z;
            }
            String string = this.f6749a.getString(fVar.e());
            kotlin.jvm.internal.n.g(string, "getString(...)");
            R(string);
            vVar = new O2.v(string, null, null, 6, null);
        }
        if (Build.VERSION.SDK_INT > 35 && ("NDOT".equals(vVar.h()) || "LONDON_UG".equals(vVar.h()))) {
            O2.v vVar2 = new O2.v(vVar.h() + "_16b", null, null, 6, null);
            q(vVar2);
            vVar = vVar2;
        }
        S(vVar);
    }

    public final void P(a listener) {
        kotlin.jvm.internal.n.h(listener, "listener");
        this.f6759k.a();
        this.f6764p.add(listener);
    }

    public final void Q() {
        if (!this.f6754f || this.f6769u) {
            return;
        }
        this.f6769u = true;
        this.f6750b.a(this.f6766r, ClockProviderPlugin.class, true);
        AbstractC0816i.d(this.f6751c, this.f6753e, null, new g(null), 2, null);
        if (!this.f6755g) {
            this.f6749a.getContentResolver().registerContentObserver(Settings.Secure.getUriFor("lock_screen_custom_clock_face"), false, this.f6765q);
        } else {
            this.f6749a.getContentResolver().registerContentObserver(Settings.Secure.getUriFor("lock_screen_custom_clock_face"), false, this.f6765q, -1);
            ActivityManager.getService().registerUserSwitchObserver(this.f6767s, this.f6760l);
        }
    }

    public final void R(String value) {
        kotlin.jvm.internal.n.h(value, "value");
        AbstractC0816i.d(this.f6751c, this.f6753e, null, new c(value, null), 2, null);
    }

    protected final void S(O2.v vVar) {
        if (kotlin.jvm.internal.n.d(this.f6768t, vVar)) {
            return;
        }
        this.f6768t = vVar;
        W();
        U();
    }

    public final void V(a listener) {
        kotlin.jvm.internal.n.h(listener, "listener");
        this.f6759k.a();
        this.f6764p.remove(listener);
    }

    public final void W() {
        if (this.f6772x.compareAndSet(false, true)) {
            AbstractC0816i.d(this.f6751c, this.f6753e, null, new l(null), 2, null);
        } else {
            K2.e.l(this.f6761m, "verifyLoadedProviders: shouldSchedule=false", null, 2, null);
        }
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0029 A[Catch: Exception -> 0x001f, TRY_ENTER, TryCatch #0 {Exception -> 0x001f, blocks: (B:4:0x0007, B:10:0x0023, B:13:0x0029, B:14:0x003b), top: B:19:0x0007 }] */
    /* JADX WARN: Code duplicated, block: B:14:0x003b A[Catch: Exception -> 0x001f, TRY_LEAVE, TryCatch #0 {Exception -> 0x001f, blocks: (B:4:0x0007, B:10:0x0023, B:13:0x0029, B:14:0x003b), top: B:19:0x0007 }] */
    public void q(O2.v vVar) {
        Object objB;
        this.f6759k.b();
        if (vVar != null) {
            try {
                vVar.i().put(v.f6806a, System.currentTimeMillis());
                objB = O2.v.f5811e.b(vVar);
                if (objB == null) {
                    objB = "";
                    if (this.f6755g) {
                        Settings.Secure.putStringForUser(this.f6749a.getContentResolver(), "lock_screen_custom_clock_face", objB.toString(), ActivityManager.getCurrentUser());
                    } else {
                        Settings.Secure.putString(this.f6749a.getContentResolver(), "lock_screen_custom_clock_face", objB.toString());
                    }
                } else if (this.f6755g) {
                    Settings.Secure.putStringForUser(this.f6749a.getContentResolver(), "lock_screen_custom_clock_face", objB.toString(), ActivityManager.getCurrentUser());
                } else {
                    Settings.Secure.putString(this.f6749a.getContentResolver(), "lock_screen_custom_clock_face", objB.toString());
                }
            } catch (Exception e10) {
                this.f6761m.d("Failed to set clock settings", e10);
            }
        } else {
            objB = "";
            if (this.f6755g) {
                Settings.Secure.putStringForUser(this.f6749a.getContentResolver(), "lock_screen_custom_clock_face", objB.toString(), ActivityManager.getCurrentUser());
            } else {
                Settings.Secure.putString(this.f6749a.getContentResolver(), "lock_screen_custom_clock_face", objB.toString());
            }
        }
        S(vVar);
    }

    public final O2.h s(String clockId) {
        kotlin.jvm.internal.n.h(clockId, "clockId");
        return r(clockId);
    }

    public final String t() {
        String strA = A();
        if (!this.f6763o.containsKey(strA)) {
            return "DEFAULT";
        }
        String str = (String) this.f6762n.get(strA);
        return str == null ? strA : str;
    }

    public final Z2.b u() {
        return this.f6759k;
    }

    public final I v() {
        return this.f6753e;
    }

    public final O2.r w() {
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x003f  */
    public final O2.t x(String clockId) {
        String str;
        O2.u uVarC;
        kotlin.jvm.internal.n.h(clockId, "clockId");
        O2.v vVarE = E();
        if (vVarE != null) {
            Log.d(this.f6760l, " settings.clockId:" + clockId + "current clockId:" + vVarE.h());
            if (!kotlin.jvm.internal.n.d(clockId, vVarE.h())) {
                vVarE = null;
            }
            if (vVarE == null) {
                str = clockId;
                vVarE = new O2.v(str, null, null, 6, null);
            } else {
                str = clockId;
            }
        } else {
            str = clockId;
            vVarE = new O2.v(str, null, null, 6, null);
        }
        b bVar = (b) this.f6763o.get(str);
        if (bVar == null || (uVarC = bVar.c()) == null) {
            return null;
        }
        return uVarC.getClockPickerConfig(vVarE);
    }

    public final List y(boolean z9) {
        if (!this.f6754f) {
            Object obj = this.f6763o.get("DEFAULT");
            kotlin.jvm.internal.n.e(obj);
            return AbstractC1444s.e(((b) obj).b());
        }
        if (z9) {
            ConcurrentHashMap concurrentHashMap = this.f6763o;
            ArrayList arrayList = new ArrayList(concurrentHashMap.size());
            Iterator it = concurrentHashMap.entrySet().iterator();
            while (it.hasNext()) {
                arrayList.add(((b) ((Map.Entry) it.next()).getValue()).b());
            }
            return arrayList;
        }
        List clocks = this.f6756h.getClocks();
        ArrayList arrayList2 = new ArrayList(AbstractC1444s.u(clocks, 10));
        Iterator it2 = clocks.iterator();
        while (it2.hasNext()) {
            arrayList2.add(((O2.s) it2.next()).a());
        }
        List listM0 = AbstractC1444s.m0(N.s(this.f6763o), new d(arrayList2));
        ArrayList arrayList3 = new ArrayList(AbstractC1444s.u(listM0, 10));
        Iterator it3 = listM0.iterator();
        while (it3.hasNext()) {
            arrayList3.add(((b) ((p079h8.o) it3.next()).b()).b());
        }
        return arrayList3;
    }

    public /* synthetic */ k(Context context, M2.d dVar, L l9, I i10, I i11, boolean z9, boolean z10, O2.u uVar, String str, O2.r rVar, boolean z11, String str2, Z2.b bVar, int i12, AbstractC1457h abstractC1457h) {
        this(context, dVar, l9, i10, i11, z9, z10, uVar, (i12 & 256) != 0 ? "DEFAULT" : str, (i12 & Optimizer.OPTIMIZATION_DEPENDENCY_ORDERING) != 0 ? null : rVar, z11, str2, (i12 & 4096) != 0 ? new Z2.b() : bVar);
    }
}
