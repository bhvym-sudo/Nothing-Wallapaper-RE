package U0;

import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.ViewGroup;
import androidx.fragment.app.AbstractComponentCallbacksC1132q;
import androidx.fragment.app.J;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.AbstractC1457h;
import p089i8.AbstractC1444s;
import p089i8.N;
import p089i8.U;

/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c f7783a = new c();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static C0285c f7784b = C0285c.f7796d;

    public enum a {
        PENALTY_LOG,
        PENALTY_DEATH,
        DETECT_FRAGMENT_REUSE,
        DETECT_FRAGMENT_TAG_USAGE,
        DETECT_WRONG_NESTED_HIERARCHY,
        DETECT_RETAIN_INSTANCE_USAGE,
        DETECT_SET_USER_VISIBLE_HINT,
        DETECT_TARGET_FRAGMENT_USAGE,
        DETECT_WRONG_FRAGMENT_CONTAINER
    }

    public interface b {
    }

    /* JADX INFO: renamed from: U0.c$c, reason: collision with other inner class name */
    public static final class C0285c {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a f7795c = new a(null);

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final C0285c f7796d = new C0285c(U.d(), null, N.g());

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Set f7797a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Map f7798b;

        /* JADX INFO: renamed from: U0.c$c$a */
        public static final class a {
            public /* synthetic */ a(AbstractC1457h abstractC1457h) {
                this();
            }

            private a() {
            }
        }

        public C0285c(Set flags, b bVar, Map allowedViolations) {
            kotlin.jvm.internal.n.h(flags, "flags");
            kotlin.jvm.internal.n.h(allowedViolations, "allowedViolations");
            this.f7797a = flags;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry entry : allowedViolations.entrySet()) {
                linkedHashMap.put((String) entry.getKey(), (Set) entry.getValue());
            }
            this.f7798b = linkedHashMap;
        }

        public final Set a() {
            return this.f7797a;
        }

        public final b b() {
            return null;
        }

        public final Map c() {
            return this.f7798b;
        }
    }

    private c() {
    }

    private final C0285c b(AbstractComponentCallbacksC1132q abstractComponentCallbacksC1132q) {
        while (abstractComponentCallbacksC1132q != null) {
            if (abstractComponentCallbacksC1132q.isAdded()) {
                J parentFragmentManager = abstractComponentCallbacksC1132q.getParentFragmentManager();
                kotlin.jvm.internal.n.g(parentFragmentManager, "declaringFragment.parentFragmentManager");
                if (parentFragmentManager.E0() != null) {
                    C0285c c0285cE0 = parentFragmentManager.E0();
                    kotlin.jvm.internal.n.e(c0285cE0);
                    return c0285cE0;
                }
            }
            abstractComponentCallbacksC1132q = abstractComponentCallbacksC1132q.getParentFragment();
        }
        return f7784b;
    }

    private final void c(C0285c c0285c, final m mVar) {
        AbstractComponentCallbacksC1132q abstractComponentCallbacksC1132qA = mVar.a();
        final String name = abstractComponentCallbacksC1132qA.getClass().getName();
        if (c0285c.a().contains(a.PENALTY_LOG)) {
            Log.d("FragmentStrictMode", "Policy violation in " + name, mVar);
        }
        c0285c.b();
        if (c0285c.a().contains(a.PENALTY_DEATH)) {
            p(abstractComponentCallbacksC1132qA, new Runnable() { // from class: U0.b
                @Override // java.lang.Runnable
                public final void run() {
                    c.d(name, mVar);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(String str, m violation) {
        kotlin.jvm.internal.n.h(violation, "$violation");
        Log.e("FragmentStrictMode", "Policy violation with PENALTY_DEATH in " + str, violation);
        throw violation;
    }

    private final void e(m mVar) {
        if (J.L0(3)) {
            Log.d("FragmentManager", "StrictMode violation in " + mVar.a().getClass().getName(), mVar);
        }
    }

    public static final void f(AbstractComponentCallbacksC1132q fragment, String previousFragmentId) {
        kotlin.jvm.internal.n.h(fragment, "fragment");
        kotlin.jvm.internal.n.h(previousFragmentId, "previousFragmentId");
        U0.a aVar = new U0.a(fragment, previousFragmentId);
        c cVar = f7783a;
        cVar.e(aVar);
        C0285c c0285cB = cVar.b(fragment);
        if (c0285cB.a().contains(a.DETECT_FRAGMENT_REUSE) && cVar.q(c0285cB, fragment.getClass(), aVar.getClass())) {
            cVar.c(c0285cB, aVar);
        }
    }

    public static final void g(AbstractComponentCallbacksC1132q fragment, ViewGroup viewGroup) {
        kotlin.jvm.internal.n.h(fragment, "fragment");
        d dVar = new d(fragment, viewGroup);
        c cVar = f7783a;
        cVar.e(dVar);
        C0285c c0285cB = cVar.b(fragment);
        if (c0285cB.a().contains(a.DETECT_FRAGMENT_TAG_USAGE) && cVar.q(c0285cB, fragment.getClass(), dVar.getClass())) {
            cVar.c(c0285cB, dVar);
        }
    }

    public static final void h(AbstractComponentCallbacksC1132q fragment) {
        kotlin.jvm.internal.n.h(fragment, "fragment");
        e eVar = new e(fragment);
        c cVar = f7783a;
        cVar.e(eVar);
        C0285c c0285cB = cVar.b(fragment);
        if (c0285cB.a().contains(a.DETECT_RETAIN_INSTANCE_USAGE) && cVar.q(c0285cB, fragment.getClass(), eVar.getClass())) {
            cVar.c(c0285cB, eVar);
        }
    }

    public static final void i(AbstractComponentCallbacksC1132q fragment) {
        kotlin.jvm.internal.n.h(fragment, "fragment");
        f fVar = new f(fragment);
        c cVar = f7783a;
        cVar.e(fVar);
        C0285c c0285cB = cVar.b(fragment);
        if (c0285cB.a().contains(a.DETECT_TARGET_FRAGMENT_USAGE) && cVar.q(c0285cB, fragment.getClass(), fVar.getClass())) {
            cVar.c(c0285cB, fVar);
        }
    }

    public static final void j(AbstractComponentCallbacksC1132q fragment) {
        kotlin.jvm.internal.n.h(fragment, "fragment");
        g gVar = new g(fragment);
        c cVar = f7783a;
        cVar.e(gVar);
        C0285c c0285cB = cVar.b(fragment);
        if (c0285cB.a().contains(a.DETECT_TARGET_FRAGMENT_USAGE) && cVar.q(c0285cB, fragment.getClass(), gVar.getClass())) {
            cVar.c(c0285cB, gVar);
        }
    }

    public static final void k(AbstractComponentCallbacksC1132q fragment) {
        kotlin.jvm.internal.n.h(fragment, "fragment");
        i iVar = new i(fragment);
        c cVar = f7783a;
        cVar.e(iVar);
        C0285c c0285cB = cVar.b(fragment);
        if (c0285cB.a().contains(a.DETECT_RETAIN_INSTANCE_USAGE) && cVar.q(c0285cB, fragment.getClass(), iVar.getClass())) {
            cVar.c(c0285cB, iVar);
        }
    }

    public static final void l(AbstractComponentCallbacksC1132q violatingFragment, AbstractComponentCallbacksC1132q targetFragment, int i10) {
        kotlin.jvm.internal.n.h(violatingFragment, "violatingFragment");
        kotlin.jvm.internal.n.h(targetFragment, "targetFragment");
        j jVar = new j(violatingFragment, targetFragment, i10);
        c cVar = f7783a;
        cVar.e(jVar);
        C0285c c0285cB = cVar.b(violatingFragment);
        if (c0285cB.a().contains(a.DETECT_TARGET_FRAGMENT_USAGE) && cVar.q(c0285cB, violatingFragment.getClass(), jVar.getClass())) {
            cVar.c(c0285cB, jVar);
        }
    }

    public static final void m(AbstractComponentCallbacksC1132q fragment, boolean z9) {
        kotlin.jvm.internal.n.h(fragment, "fragment");
        k kVar = new k(fragment, z9);
        c cVar = f7783a;
        cVar.e(kVar);
        C0285c c0285cB = cVar.b(fragment);
        if (c0285cB.a().contains(a.DETECT_SET_USER_VISIBLE_HINT) && cVar.q(c0285cB, fragment.getClass(), kVar.getClass())) {
            cVar.c(c0285cB, kVar);
        }
    }

    public static final void n(AbstractComponentCallbacksC1132q fragment, ViewGroup container) {
        kotlin.jvm.internal.n.h(fragment, "fragment");
        kotlin.jvm.internal.n.h(container, "container");
        n nVar = new n(fragment, container);
        c cVar = f7783a;
        cVar.e(nVar);
        C0285c c0285cB = cVar.b(fragment);
        if (c0285cB.a().contains(a.DETECT_WRONG_FRAGMENT_CONTAINER) && cVar.q(c0285cB, fragment.getClass(), nVar.getClass())) {
            cVar.c(c0285cB, nVar);
        }
    }

    public static final void o(AbstractComponentCallbacksC1132q fragment, AbstractComponentCallbacksC1132q expectedParentFragment, int i10) {
        kotlin.jvm.internal.n.h(fragment, "fragment");
        kotlin.jvm.internal.n.h(expectedParentFragment, "expectedParentFragment");
        o oVar = new o(fragment, expectedParentFragment, i10);
        c cVar = f7783a;
        cVar.e(oVar);
        C0285c c0285cB = cVar.b(fragment);
        if (c0285cB.a().contains(a.DETECT_WRONG_NESTED_HIERARCHY) && cVar.q(c0285cB, fragment.getClass(), oVar.getClass())) {
            cVar.c(c0285cB, oVar);
        }
    }

    private final void p(AbstractComponentCallbacksC1132q abstractComponentCallbacksC1132q, Runnable runnable) {
        if (!abstractComponentCallbacksC1132q.isAdded()) {
            runnable.run();
            return;
        }
        Handler handlerK = abstractComponentCallbacksC1132q.getParentFragmentManager().y0().k();
        if (kotlin.jvm.internal.n.d(handlerK.getLooper(), Looper.myLooper())) {
            runnable.run();
        } else {
            handlerK.post(runnable);
        }
    }

    private final boolean q(C0285c c0285c, Class cls, Class cls2) {
        Set set = (Set) c0285c.c().get(cls.getName());
        if (set == null) {
            return true;
        }
        if (kotlin.jvm.internal.n.d(cls2.getSuperclass(), m.class) || !AbstractC1444s.L(set, cls2.getSuperclass())) {
            return !set.contains(cls2);
        }
        return false;
    }
}
