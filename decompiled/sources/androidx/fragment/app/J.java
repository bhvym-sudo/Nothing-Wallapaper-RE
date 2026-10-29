package androidx.fragment.app;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.core.widgets.Optimizer;
import androidx.core.view.InterfaceC1081m;
import androidx.core.view.InterfaceC1084p;
import androidx.lifecycle.AbstractC1157q;
import androidx.lifecycle.InterfaceC1163x;
import androidx.lifecycle.e0;
import androidx.lifecycle.f0;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
public abstract class J {

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    private static boolean f12878U = false;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    static boolean f12879V = true;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    AbstractComponentCallbacksC1132q f12880A;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private p030d.c f12885F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private p030d.c f12886G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private p030d.c f12887H;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    private boolean f12889J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    private boolean f12890K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    private boolean f12891L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    private boolean f12892M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    private boolean f12893N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private ArrayList f12894O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    private ArrayList f12895P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    private ArrayList f12896Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    private M f12897R;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    private U0.c.C0285c f12898S;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f12901b;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private ArrayList f12904e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private p010b.v f12906g;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private A f12923x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private AbstractC1138x f12924y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private AbstractComponentCallbacksC1132q f12925z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ArrayList f12900a = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Q f12902c = new Q();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    ArrayList f12903d = new ArrayList();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final B f12905f = new B(this);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    C1116a f12907h = null;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    boolean f12908i = false;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final p010b.u f12909j = new b(false);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final AtomicInteger f12910k = new AtomicInteger();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final Map f12911l = Collections.synchronizedMap(new HashMap());

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final Map f12912m = Collections.synchronizedMap(new HashMap());

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Map f12913n = Collections.synchronizedMap(new HashMap());

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    ArrayList f12914o = new ArrayList();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final C f12915p = new C(this);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final CopyOnWriteArrayList f12916q = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final B0.a f12917r = new B0.a() { // from class: androidx.fragment.app.D
        @Override // B0.a
        public final void accept(Object obj) {
            J.f(this.f12862a, (Configuration) obj);
        }
    };

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final B0.a f12918s = new B0.a() { // from class: androidx.fragment.app.E
        @Override // B0.a
        public final void accept(Object obj) {
            J.a(this.f12863a, (Integer) obj);
        }
    };

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final B0.a f12919t = new B0.a() { // from class: androidx.fragment.app.F
        @Override // B0.a
        public final void accept(Object obj) {
            J.e(this.f12864a, (p161q0.g) obj);
        }
    };

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final B0.a f12920u = new B0.a() { // from class: androidx.fragment.app.G
        @Override // B0.a
        public final void accept(Object obj) {
            J.d(this.f12875a, (p161q0.o) obj);
        }
    };

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final InterfaceC1084p f12921v = new c();

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    int f12922w = -1;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private AbstractC1140z f12881B = null;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private AbstractC1140z f12882C = new d();

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private c0 f12883D = null;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private c0 f12884E = new e();

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    ArrayDeque f12888I = new ArrayDeque();

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    private Runnable f12899T = new f();

    class a implements p030d.b {
        a() {
        }

        @Override // p030d.b
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(Map map) {
            String[] strArr = (String[]) map.keySet().toArray(new String[0]);
            ArrayList arrayList = new ArrayList(map.values());
            int[] iArr = new int[arrayList.size()];
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                iArr[i10] = ((Boolean) arrayList.get(i10)).booleanValue() ? 0 : -1;
            }
            l lVar = (l) J.this.f12888I.pollFirst();
            if (lVar == null) {
                Log.w("FragmentManager", "No permissions were requested for " + this);
                return;
            }
            String str = lVar.f12936q;
            int i11 = lVar.f12937r;
            AbstractComponentCallbacksC1132q abstractComponentCallbacksC1132qI = J.this.f12902c.i(str);
            if (abstractComponentCallbacksC1132qI != null) {
                abstractComponentCallbacksC1132qI.onRequestPermissionsResult(i11, strArr, iArr);
                return;
            }
            Log.w("FragmentManager", "Permission request result delivered for unknown Fragment " + str);
        }
    }

    class b extends p010b.u {
        b(boolean z9) {
            super(z9);
        }

        @Override // p010b.u
        public void c() {
            if (J.L0(3)) {
                Log.d("FragmentManager", "handleOnBackCancelled. PREDICTIVE_BACK = " + J.f12879V + " fragment manager " + J.this);
            }
            if (J.f12879V) {
                J.this.q();
            }
        }

        @Override // p010b.u
        public void d() {
            if (J.L0(3)) {
                Log.d("FragmentManager", "handleOnBackPressed. PREDICTIVE_BACK = " + J.f12879V + " fragment manager " + J.this);
            }
            J.this.H0();
        }

        @Override // p010b.u
        public void e(p010b.b bVar) {
            if (J.L0(2)) {
                Log.v("FragmentManager", "handleOnBackProgressed. PREDICTIVE_BACK = " + J.f12879V + " fragment manager " + J.this);
            }
            J j9 = J.this;
            if (j9.f12907h != null) {
                Iterator it = j9.w(new ArrayList(Collections.singletonList(J.this.f12907h)), 0, 1).iterator();
                while (it.hasNext()) {
                    ((b0) it.next()).A(bVar);
                }
                Iterator it2 = J.this.f12914o.iterator();
                if (it2.hasNext()) {
                    androidx.appcompat.app.o.a(it2.next());
                    throw null;
                }
            }
        }

        @Override // p010b.u
        public void f(p010b.b bVar) {
            if (J.L0(3)) {
                Log.d("FragmentManager", "handleOnBackStarted. PREDICTIVE_BACK = " + J.f12879V + " fragment manager " + J.this);
            }
            if (J.f12879V) {
                J.this.Z();
                J.this.h1();
            }
        }
    }

    class c implements InterfaceC1084p {
        c() {
        }

        @Override // androidx.core.view.InterfaceC1084p
        public boolean a(MenuItem menuItem) {
            return J.this.L(menuItem);
        }

        @Override // androidx.core.view.InterfaceC1084p
        public void b(Menu menu) {
            J.this.M(menu);
        }

        @Override // androidx.core.view.InterfaceC1084p
        public void c(Menu menu, MenuInflater menuInflater) {
            J.this.E(menu, menuInflater);
        }

        @Override // androidx.core.view.InterfaceC1084p
        public void d(Menu menu) {
            J.this.Q(menu);
        }
    }

    class d extends AbstractC1140z {
        d() {
        }

        @Override // androidx.fragment.app.AbstractC1140z
        public AbstractComponentCallbacksC1132q a(ClassLoader classLoader, String str) {
            return J.this.y0().b(J.this.y0().h(), str, null);
        }
    }

    class e implements c0 {
        e() {
        }

        @Override // androidx.fragment.app.c0
        public b0 a(ViewGroup viewGroup) {
            return new C1121f(viewGroup);
        }
    }

    class f implements Runnable {
        f() {
        }

        @Override // java.lang.Runnable
        public void run() {
            J.this.c0(true);
        }
    }

    class g implements N {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        final /* synthetic */ AbstractComponentCallbacksC1132q f12932q;

        g(AbstractComponentCallbacksC1132q abstractComponentCallbacksC1132q) {
            this.f12932q = abstractComponentCallbacksC1132q;
        }

        @Override // androidx.fragment.app.N
        public void a(J j9, AbstractComponentCallbacksC1132q abstractComponentCallbacksC1132q) {
            this.f12932q.onAttachFragment(abstractComponentCallbacksC1132q);
        }
    }

    class h implements p030d.b {
        h() {
        }

        @Override // p030d.b
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(p030d.a aVar) {
            l lVar = (l) J.this.f12888I.pollLast();
            if (lVar == null) {
                Log.w("FragmentManager", "No Activities were started for result for " + this);
                return;
            }
            String str = lVar.f12936q;
            int i10 = lVar.f12937r;
            AbstractComponentCallbacksC1132q abstractComponentCallbacksC1132qI = J.this.f12902c.i(str);
            if (abstractComponentCallbacksC1132qI != null) {
                abstractComponentCallbacksC1132qI.onActivityResult(i10, aVar.b(), aVar.a());
                return;
            }
            Log.w("FragmentManager", "Activity result delivered for unknown Fragment " + str);
        }
    }

    class i implements p030d.b {
        i() {
        }

        @Override // p030d.b
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(p030d.a aVar) {
            l lVar = (l) J.this.f12888I.pollFirst();
            if (lVar == null) {
                Log.w("FragmentManager", "No IntentSenders were started for " + this);
                return;
            }
            String str = lVar.f12936q;
            int i10 = lVar.f12937r;
            AbstractComponentCallbacksC1132q abstractComponentCallbacksC1132qI = J.this.f12902c.i(str);
            if (abstractComponentCallbacksC1132qI != null) {
                abstractComponentCallbacksC1132qI.onActivityResult(i10, aVar.b(), aVar.a());
                return;
            }
            Log.w("FragmentManager", "Intent Sender result delivered for unknown Fragment " + str);
        }
    }

    static class j extends p040e.a {
        j() {
        }

        @Override // p040e.a
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public Intent a(Context context, p030d.g gVar) {
            Bundle bundleExtra;
            Intent intent = new Intent("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST");
            Intent intentA = gVar.a();
            if (intentA != null && (bundleExtra = intentA.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) != null) {
                intent.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundleExtra);
                intentA.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
                if (intentA.getBooleanExtra("androidx.fragment.extra.ACTIVITY_OPTIONS_BUNDLE", false)) {
                    gVar = new d.g.a(gVar.d()).b(null).c(gVar.c(), gVar.b()).a();
                }
            }
            intent.putExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST", gVar);
            if (J.L0(2)) {
                Log.v("FragmentManager", "CreateIntent created the following intent: " + intent);
            }
            return intent;
        }

        @Override // p040e.a
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public p030d.a c(int i10, Intent intent) {
            return new p030d.a(i10, intent);
        }
    }

    public static abstract class k {
        @Deprecated
        public void onFragmentActivityCreated(J j9, AbstractComponentCallbacksC1132q abstractComponentCallbacksC1132q, Bundle bundle) {
        }

        public void onFragmentAttached(J j9, AbstractComponentCallbacksC1132q abstractComponentCallbacksC1132q, Context context) {
        }

        public void onFragmentCreated(J j9, AbstractComponentCallbacksC1132q abstractComponentCallbacksC1132q, Bundle bundle) {
        }

        public void onFragmentDestroyed(J j9, AbstractComponentCallbacksC1132q abstractComponentCallbacksC1132q) {
        }

        public void onFragmentDetached(J j9, AbstractComponentCallbacksC1132q abstractComponentCallbacksC1132q) {
        }

        public void onFragmentPaused(J j9, AbstractComponentCallbacksC1132q abstractComponentCallbacksC1132q) {
        }

        public void onFragmentPreAttached(J j9, AbstractComponentCallbacksC1132q abstractComponentCallbacksC1132q, Context context) {
        }

        public void onFragmentPreCreated(J j9, AbstractComponentCallbacksC1132q abstractComponentCallbacksC1132q, Bundle bundle) {
        }

        public void onFragmentResumed(J j9, AbstractComponentCallbacksC1132q abstractComponentCallbacksC1132q) {
        }

        public void onFragmentSaveInstanceState(J j9, AbstractComponentCallbacksC1132q abstractComponentCallbacksC1132q, Bundle bundle) {
        }

        public void onFragmentStarted(J j9, AbstractComponentCallbacksC1132q abstractComponentCallbacksC1132q) {
        }

        public void onFragmentStopped(J j9, AbstractComponentCallbacksC1132q abstractComponentCallbacksC1132q) {
        }

        public abstract void onFragmentViewCreated(J j9, AbstractComponentCallbacksC1132q abstractComponentCallbacksC1132q, View view, Bundle bundle);

        public void onFragmentViewDestroyed(J j9, AbstractComponentCallbacksC1132q abstractComponentCallbacksC1132q) {
        }
    }

    interface m {
        boolean a(ArrayList arrayList, ArrayList arrayList2);
    }

    private class n implements m {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final String f12938a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final int f12939b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final int f12940c;

        n(String str, int i10, int i11) {
            this.f12938a = str;
            this.f12939b = i10;
            this.f12940c = i11;
        }

        @Override // androidx.fragment.app.J.m
        public boolean a(ArrayList arrayList, ArrayList arrayList2) {
            AbstractComponentCallbacksC1132q abstractComponentCallbacksC1132q = J.this.f12880A;
            if (abstractComponentCallbacksC1132q == null || this.f12939b >= 0 || this.f12938a != null || !abstractComponentCallbacksC1132q.getChildFragmentManager().c1()) {
                return J.this.f1(arrayList, arrayList2, this.f12938a, this.f12939b, this.f12940c);
            }
            return false;
        }
    }

    class o implements m {
        o() {
        }

        @Override // androidx.fragment.app.J.m
        public boolean a(ArrayList arrayList, ArrayList arrayList2) {
            boolean zG1 = J.this.g1(arrayList, arrayList2);
            if (!J.this.f12914o.isEmpty() && arrayList.size() > 0) {
                ((Boolean) arrayList2.get(arrayList.size() - 1)).booleanValue();
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    linkedHashSet.addAll(J.this.p0((C1116a) it.next()));
                }
                Iterator it2 = J.this.f12914o.iterator();
                while (it2.hasNext()) {
                    androidx.appcompat.app.o.a(it2.next());
                    Iterator it3 = linkedHashSet.iterator();
                    if (it3.hasNext()) {
                        throw null;
                    }
                }
            }
            return zG1;
        }
    }

    private void B1() {
        synchronized (this.f12900a) {
            try {
                if (!this.f12900a.isEmpty()) {
                    this.f12909j.j(true);
                    if (L0(3)) {
                        Log.d("FragmentManager", "FragmentManager " + this + " enabling OnBackPressedCallback, caused by non-empty pending actions");
                    }
                    return;
                }
                boolean z9 = r0() > 0 && Q0(this.f12925z);
                if (L0(3)) {
                    Log.d("FragmentManager", "OnBackPressedCallback for FragmentManager " + this + " enabled state is " + z9);
                }
                this.f12909j.j(z9);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    static AbstractComponentCallbacksC1132q F0(View view) {
        Object tag = view.getTag(T0.b.f7401a);
        if (tag instanceof AbstractComponentCallbacksC1132q) {
            return (AbstractComponentCallbacksC1132q) tag;
        }
        return null;
    }

    public static boolean L0(int i10) {
        return f12878U || Log.isLoggable("FragmentManager", i10);
    }

    private boolean M0(AbstractComponentCallbacksC1132q abstractComponentCallbacksC1132q) {
        return (abstractComponentCallbacksC1132q.mHasMenu && abstractComponentCallbacksC1132q.mMenuVisible) || abstractComponentCallbacksC1132q.mChildFragmentManager.r();
    }

    private void N(AbstractComponentCallbacksC1132q abstractComponentCallbacksC1132q) {
        if (abstractComponentCallbacksC1132q == null || !abstractComponentCallbacksC1132q.equals(h0(abstractComponentCallbacksC1132q.mWho))) {
            return;
        }
        abstractComponentCallbacksC1132q.performPrimaryNavigationFragmentChanged();
    }

    private boolean N0() {
        AbstractComponentCallbacksC1132q abstractComponentCallbacksC1132q = this.f12925z;
        if (abstractComponentCallbacksC1132q == null) {
            return true;
        }
        return abstractComponentCallbacksC1132q.isAdded() && this.f12925z.getParentFragmentManager().N0();
    }

    private void U(int i10) {
        try {
            this.f12901b = true;
            this.f12902c.d(i10);
            W0(i10, false);
            Iterator it = v().iterator();
            while (it.hasNext()) {
                ((b0) it.next()).q();
            }
            this.f12901b = false;
            c0(true);
        } catch (Throwable th) {
            this.f12901b = false;
            throw th;
        }
    }

    private void X() {
        if (this.f12893N) {
            this.f12893N = false;
            y1();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Z() {
        Iterator it = v().iterator();
        while (it.hasNext()) {
            ((b0) it.next()).q();
        }
    }

    public static /* synthetic */ void a(J j9, Integer num) {
        if (j9.N0() && num.intValue() == 80) {
            j9.H(false);
        }
    }

    private void b0(boolean z9) {
        if (this.f12901b) {
            throw new IllegalStateException("FragmentManager is already executing transactions");
        }
        if (this.f12923x == null) {
            if (!this.f12892M) {
                throw new IllegalStateException("FragmentManager has not been attached to a host.");
            }
            throw new IllegalStateException("FragmentManager has been destroyed");
        }
        if (Looper.myLooper() != this.f12923x.k().getLooper()) {
            throw new IllegalStateException("Must be called from main thread of fragment host");
        }
        if (!z9) {
            s();
        }
        if (this.f12894O == null) {
            this.f12894O = new ArrayList();
            this.f12895P = new ArrayList();
        }
    }

    public static /* synthetic */ void c(J j9) {
        Iterator it = j9.f12914o.iterator();
        if (it.hasNext()) {
            androidx.appcompat.app.o.a(it.next());
            throw null;
        }
    }

    public static /* synthetic */ void d(J j9, p161q0.o oVar) {
        if (j9.N0()) {
            j9.P(oVar.a(), false);
        }
    }

    public static /* synthetic */ void e(J j9, p161q0.g gVar) {
        if (j9.N0()) {
            j9.I(gVar.a(), false);
        }
    }

    private static void e0(ArrayList arrayList, ArrayList arrayList2, int i10, int i11) {
        while (i10 < i11) {
            C1116a c1116a = (C1116a) arrayList.get(i10);
            if (((Boolean) arrayList2.get(i10)).booleanValue()) {
                c1116a.x(-1);
                c1116a.C();
            } else {
                c1116a.x(1);
                c1116a.B();
            }
            i10++;
        }
    }

    private boolean e1(String str, int i10, int i11) {
        c0(false);
        b0(true);
        AbstractComponentCallbacksC1132q abstractComponentCallbacksC1132q = this.f12880A;
        if (abstractComponentCallbacksC1132q != null && i10 < 0 && str == null && abstractComponentCallbacksC1132q.getChildFragmentManager().c1()) {
            return true;
        }
        boolean zF1 = f1(this.f12894O, this.f12895P, str, i10, i11);
        if (zF1) {
            this.f12901b = true;
            try {
                l1(this.f12894O, this.f12895P);
                t();
            } catch (Throwable th) {
                t();
                throw th;
            }
        }
        B1();
        X();
        this.f12902c.b();
        return zF1;
    }

    public static /* synthetic */ void f(J j9, Configuration configuration) {
        if (j9.N0()) {
            j9.B(configuration, false);
        }
    }

    private void f0(ArrayList arrayList, ArrayList arrayList2, int i10, int i11) {
        boolean z9 = ((C1116a) arrayList.get(i10)).f13003r;
        ArrayList arrayList3 = this.f12896Q;
        if (arrayList3 == null) {
            this.f12896Q = new ArrayList();
        } else {
            arrayList3.clear();
        }
        this.f12896Q.addAll(this.f12902c.o());
        AbstractComponentCallbacksC1132q abstractComponentCallbacksC1132qC0 = C0();
        boolean z10 = false;
        for (int i12 = i10; i12 < i11; i12++) {
            C1116a c1116a = (C1116a) arrayList.get(i12);
            abstractComponentCallbacksC1132qC0 = !((Boolean) arrayList2.get(i12)).booleanValue() ? c1116a.D(this.f12896Q, abstractComponentCallbacksC1132qC0) : c1116a.G(this.f12896Q, abstractComponentCallbacksC1132qC0);
            z10 = z10 || c1116a.f12994i;
        }
        this.f12896Q.clear();
        if (!z9 && this.f12922w >= 1) {
            for (int i13 = i10; i13 < i11; i13++) {
                Iterator it = ((C1116a) arrayList.get(i13)).f12988c.iterator();
                while (it.hasNext()) {
                    AbstractComponentCallbacksC1132q abstractComponentCallbacksC1132q = ((S.a) it.next()).f13006b;
                    if (abstractComponentCallbacksC1132q != null && abstractComponentCallbacksC1132q.mFragmentManager != null) {
                        this.f12902c.r(x(abstractComponentCallbacksC1132q));
                    }
                }
            }
        }
        e0(arrayList, arrayList2, i10, i11);
        boolean zBooleanValue = ((Boolean) arrayList2.get(i11 - 1)).booleanValue();
        if (z10 && !this.f12914o.isEmpty()) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                linkedHashSet.addAll(p0((C1116a) it2.next()));
            }
            if (this.f12907h == null) {
                Iterator it3 = this.f12914o.iterator();
                while (it3.hasNext()) {
                    androidx.appcompat.app.o.a(it3.next());
                    Iterator it4 = linkedHashSet.iterator();
                    if (it4.hasNext()) {
                        throw null;
                    }
                }
                Iterator it5 = this.f12914o.iterator();
                while (it5.hasNext()) {
                    androidx.appcompat.app.o.a(it5.next());
                    Iterator it6 = linkedHashSet.iterator();
                    if (it6.hasNext()) {
                        throw null;
                    }
                }
            }
        }
        for (int i14 = i10; i14 < i11; i14++) {
            C1116a c1116a2 = (C1116a) arrayList.get(i14);
            if (zBooleanValue) {
                for (int size = c1116a2.f12988c.size() - 1; size >= 0; size--) {
                    AbstractComponentCallbacksC1132q abstractComponentCallbacksC1132q2 = ((S.a) c1116a2.f12988c.get(size)).f13006b;
                    if (abstractComponentCallbacksC1132q2 != null) {
                        x(abstractComponentCallbacksC1132q2).m();
                    }
                }
            } else {
                Iterator it7 = c1116a2.f12988c.iterator();
                while (it7.hasNext()) {
                    AbstractComponentCallbacksC1132q abstractComponentCallbacksC1132q3 = ((S.a) it7.next()).f13006b;
                    if (abstractComponentCallbacksC1132q3 != null) {
                        x(abstractComponentCallbacksC1132q3).m();
                    }
                }
            }
        }
        W0(this.f12922w, true);
        for (b0 b0Var : w(arrayList, i10, i11)) {
            b0Var.D(zBooleanValue);
            b0Var.z();
            b0Var.n();
        }
        while (i10 < i11) {
            C1116a c1116a3 = (C1116a) arrayList.get(i10);
            if (((Boolean) arrayList2.get(i10)).booleanValue() && c1116a3.f13052v >= 0) {
                c1116a3.f13052v = -1;
            }
            c1116a3.F();
            i10++;
        }
        if (z10) {
            n1();
        }
    }

    private int i0(String str, int i10, boolean z9) {
        if (this.f12903d.isEmpty()) {
            return -1;
        }
        if (str == null && i10 < 0) {
            if (z9) {
                return 0;
            }
            return this.f12903d.size() - 1;
        }
        int size = this.f12903d.size() - 1;
        while (size >= 0) {
            C1116a c1116a = (C1116a) this.f12903d.get(size);
            if ((str != null && str.equals(c1116a.E())) || (i10 >= 0 && i10 == c1116a.f13052v)) {
                break;
            }
            size--;
        }
        if (size < 0) {
            return size;
        }
        if (!z9) {
            if (size == this.f12903d.size() - 1) {
                return -1;
            }
            return size + 1;
        }
        while (size > 0) {
            C1116a c1116a2 = (C1116a) this.f12903d.get(size - 1);
            if ((str == null || !str.equals(c1116a2.E())) && (i10 < 0 || i10 != c1116a2.f13052v)) {
                break;
            }
            size--;
        }
        return size;
    }

    private void l1(ArrayList arrayList, ArrayList arrayList2) {
        if (arrayList.isEmpty()) {
            return;
        }
        if (arrayList.size() != arrayList2.size()) {
            throw new IllegalStateException("Internal error with the back stack records");
        }
        int size = arrayList.size();
        int i10 = 0;
        int i11 = 0;
        while (i10 < size) {
            if (!((C1116a) arrayList.get(i10)).f13003r) {
                if (i11 != i10) {
                    f0(arrayList, arrayList2, i11, i10);
                }
                i11 = i10 + 1;
                if (((Boolean) arrayList2.get(i10)).booleanValue()) {
                    while (i11 < size && ((Boolean) arrayList2.get(i11)).booleanValue() && !((C1116a) arrayList.get(i11)).f13003r) {
                        i11++;
                    }
                }
                f0(arrayList, arrayList2, i10, i11);
                i10 = i11 - 1;
            }
            i10++;
        }
        if (i11 != size) {
            f0(arrayList, arrayList2, i11, size);
        }
    }

    public static J m0(View view) {
        AbstractActivityC1136v abstractActivityC1136v;
        AbstractComponentCallbacksC1132q abstractComponentCallbacksC1132qN0 = n0(view);
        if (abstractComponentCallbacksC1132qN0 != null) {
            if (abstractComponentCallbacksC1132qN0.isAdded()) {
                return abstractComponentCallbacksC1132qN0.getChildFragmentManager();
            }
            throw new IllegalStateException("The Fragment " + abstractComponentCallbacksC1132qN0 + " that owns View " + view + " has already been destroyed. Nested fragments should always use the child FragmentManager.");
        }
        Context context = view.getContext();
        while (true) {
            if (!(context instanceof ContextWrapper)) {
                abstractActivityC1136v = null;
                break;
            }
            if (context instanceof AbstractActivityC1136v) {
                abstractActivityC1136v = (AbstractActivityC1136v) context;
                break;
            }
            context = ((ContextWrapper) context).getBaseContext();
        }
        if (abstractActivityC1136v != null) {
            return abstractActivityC1136v.o0();
        }
        throw new IllegalStateException("View " + view + " is not within a subclass of FragmentActivity.");
    }

    static AbstractComponentCallbacksC1132q n0(View view) {
        while (view != null) {
            AbstractComponentCallbacksC1132q abstractComponentCallbacksC1132qF0 = F0(view);
            if (abstractComponentCallbacksC1132qF0 != null) {
                return abstractComponentCallbacksC1132qF0;
            }
            Object parent = view.getParent();
            view = parent instanceof View ? (View) parent : null;
        }
        return null;
    }

    private void n1() {
        if (this.f12914o.size() <= 0) {
            return;
        }
        androidx.appcompat.app.o.a(this.f12914o.get(0));
        throw null;
    }

    private void o0() {
        Iterator it = v().iterator();
        while (it.hasNext()) {
            ((b0) it.next()).r();
        }
    }

    static int p1(int i10) {
        if (i10 == 4097) {
            return 8194;
        }
        if (i10 == 8194) {
            return 4097;
        }
        if (i10 == 8197) {
            return 4100;
        }
        if (i10 != 4099) {
            return i10 != 4100 ? 0 : 8197;
        }
        return 4099;
    }

    private boolean q0(ArrayList arrayList, ArrayList arrayList2) {
        synchronized (this.f12900a) {
            if (this.f12900a.isEmpty()) {
                return false;
            }
            try {
                int size = this.f12900a.size();
                boolean zA = false;
                for (int i10 = 0; i10 < size; i10++) {
                    zA |= ((m) this.f12900a.get(i10)).a(arrayList, arrayList2);
                }
                this.f12900a.clear();
                this.f12923x.k().removeCallbacks(this.f12899T);
                return zA;
            } catch (Throwable th) {
                this.f12900a.clear();
                this.f12923x.k().removeCallbacks(this.f12899T);
                throw th;
            }
        }
    }

    private void s() {
        if (S0()) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
    }

    private M s0(AbstractComponentCallbacksC1132q abstractComponentCallbacksC1132q) {
        return this.f12897R.j(abstractComponentCallbacksC1132q);
    }

    private void t() {
        this.f12901b = false;
        this.f12895P.clear();
        this.f12894O.clear();
    }

    private void u() {
        boolean zN;
        A a10 = this.f12923x;
        if (a10 instanceof f0) {
            zN = this.f12902c.p().n();
        } else {
            zN = a10.h() instanceof Activity ? !((Activity) this.f12923x.h()).isChangingConfigurations() : true;
        }
        if (zN) {
            Iterator it = this.f12911l.values().iterator();
            while (it.hasNext()) {
                Iterator it2 = ((C1118c) it.next()).f13105q.iterator();
                while (it2.hasNext()) {
                    this.f12902c.p().g((String) it2.next(), false);
                }
            }
        }
    }

    private Set v() {
        HashSet hashSet = new HashSet();
        Iterator it = this.f12902c.k().iterator();
        while (it.hasNext()) {
            ViewGroup viewGroup = ((P) it.next()).k().mContainer;
            if (viewGroup != null) {
                hashSet.add(b0.v(viewGroup, D0()));
            }
        }
        return hashSet;
    }

    private ViewGroup v0(AbstractComponentCallbacksC1132q abstractComponentCallbacksC1132q) {
        ViewGroup viewGroup = abstractComponentCallbacksC1132q.mContainer;
        if (viewGroup != null) {
            return viewGroup;
        }
        if (abstractComponentCallbacksC1132q.mContainerId > 0 && this.f12924y.d()) {
            View viewC = this.f12924y.c(abstractComponentCallbacksC1132q.mContainerId);
            if (viewC instanceof ViewGroup) {
                return (ViewGroup) viewC;
            }
        }
        return null;
    }

    private void w1(AbstractComponentCallbacksC1132q abstractComponentCallbacksC1132q) {
        ViewGroup viewGroupV0 = v0(abstractComponentCallbacksC1132q);
        if (viewGroupV0 == null || abstractComponentCallbacksC1132q.getEnterAnim() + abstractComponentCallbacksC1132q.getExitAnim() + abstractComponentCallbacksC1132q.getPopEnterAnim() + abstractComponentCallbacksC1132q.getPopExitAnim() <= 0) {
            return;
        }
        int i10 = T0.b.f7403c;
        if (viewGroupV0.getTag(i10) == null) {
            viewGroupV0.setTag(i10, abstractComponentCallbacksC1132q);
        }
        ((AbstractComponentCallbacksC1132q) viewGroupV0.getTag(i10)).setPopDirection(abstractComponentCallbacksC1132q.getPopDirection());
    }

    private void y1() {
        Iterator it = this.f12902c.k().iterator();
        while (it.hasNext()) {
            Z0((P) it.next());
        }
    }

    private void z1(RuntimeException runtimeException) {
        Log.e("FragmentManager", runtimeException.getMessage());
        Log.e("FragmentManager", "Activity state:");
        PrintWriter printWriter = new PrintWriter(new Y("FragmentManager"));
        A a10 = this.f12923x;
        if (a10 != null) {
            try {
                a10.p("  ", null, printWriter, new String[0]);
                throw runtimeException;
            } catch (Exception e10) {
                Log.e("FragmentManager", "Failed dumping state", e10);
                throw runtimeException;
            }
        }
        try {
            Y("  ", null, printWriter, new String[0]);
            throw runtimeException;
        } catch (Exception e11) {
            Log.e("FragmentManager", "Failed dumping state", e11);
            throw runtimeException;
        }
    }

    void A() {
        this.f12890K = false;
        this.f12891L = false;
        this.f12897R.p(false);
        U(0);
    }

    C A0() {
        return this.f12915p;
    }

    public void A1(k kVar) {
        this.f12915p.p(kVar);
    }

    void B(Configuration configuration, boolean z9) {
        if (z9 && (this.f12923x instanceof p171r0.b)) {
            z1(new IllegalStateException("Do not call dispatchConfigurationChanged() on host. Host implements OnConfigurationChangedProvider and automatically dispatches configuration changes to fragments."));
        }
        for (AbstractComponentCallbacksC1132q abstractComponentCallbacksC1132q : this.f12902c.o()) {
            if (abstractComponentCallbacksC1132q != null) {
                abstractComponentCallbacksC1132q.performConfigurationChanged(configuration);
                if (z9) {
                    abstractComponentCallbacksC1132q.mChildFragmentManager.B(configuration, true);
                }
            }
        }
    }

    AbstractComponentCallbacksC1132q B0() {
        return this.f12925z;
    }

    boolean C(MenuItem menuItem) {
        if (this.f12922w < 1) {
            return false;
        }
        for (AbstractComponentCallbacksC1132q abstractComponentCallbacksC1132q : this.f12902c.o()) {
            if (abstractComponentCallbacksC1132q != null && abstractComponentCallbacksC1132q.performContextItemSelected(menuItem)) {
                return true;
            }
        }
        return false;
    }

    public AbstractComponentCallbacksC1132q C0() {
        return this.f12880A;
    }

    void D() {
        this.f12890K = false;
        this.f12891L = false;
        this.f12897R.p(false);
        U(1);
    }

    c0 D0() {
        c0 c0Var = this.f12883D;
        if (c0Var != null) {
            return c0Var;
        }
        AbstractComponentCallbacksC1132q abstractComponentCallbacksC1132q = this.f12925z;
        return abstractComponentCallbacksC1132q != null ? abstractComponentCallbacksC1132q.mFragmentManager.D0() : this.f12884E;
    }

    boolean E(Menu menu, MenuInflater menuInflater) {
        if (this.f12922w < 1) {
            return false;
        }
        ArrayList arrayList = null;
        boolean z9 = false;
        for (AbstractComponentCallbacksC1132q abstractComponentCallbacksC1132q : this.f12902c.o()) {
            if (abstractComponentCallbacksC1132q != null && P0(abstractComponentCallbacksC1132q) && abstractComponentCallbacksC1132q.performCreateOptionsMenu(menu, menuInflater)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(abstractComponentCallbacksC1132q);
                z9 = true;
            }
        }
        if (this.f12904e != null) {
            for (int i10 = 0; i10 < this.f12904e.size(); i10++) {
                AbstractComponentCallbacksC1132q abstractComponentCallbacksC1132q2 = (AbstractComponentCallbacksC1132q) this.f12904e.get(i10);
                if (arrayList == null || !arrayList.contains(abstractComponentCallbacksC1132q2)) {
                    abstractComponentCallbacksC1132q2.onDestroyOptionsMenu();
                }
            }
        }
        this.f12904e = arrayList;
        return z9;
    }

    public U0.c.C0285c E0() {
        return this.f12898S;
    }

    void F() {
        this.f12892M = true;
        c0(true);
        Z();
        u();
        U(-1);
        Object obj = this.f12923x;
        if (obj instanceof p171r0.c) {
            ((p171r0.c) obj).r(this.f12918s);
        }
        Object obj2 = this.f12923x;
        if (obj2 instanceof p171r0.b) {
            ((p171r0.b) obj2).l(this.f12917r);
        }
        Object obj3 = this.f12923x;
        if (obj3 instanceof p161q0.m) {
            ((p161q0.m) obj3).i(this.f12919t);
        }
        Object obj4 = this.f12923x;
        if (obj4 instanceof p161q0.n) {
            ((p161q0.n) obj4).C(this.f12920u);
        }
        Object obj5 = this.f12923x;
        if ((obj5 instanceof InterfaceC1081m) && this.f12925z == null) {
            ((InterfaceC1081m) obj5).g(this.f12921v);
        }
        this.f12923x = null;
        this.f12924y = null;
        this.f12925z = null;
        if (this.f12906g != null) {
            this.f12909j.h();
            this.f12906g = null;
        }
        p030d.c cVar = this.f12885F;
        if (cVar != null) {
            cVar.d();
            this.f12886G.d();
            this.f12887H.d();
        }
    }

    void G() {
        U(1);
    }

    e0 G0(AbstractComponentCallbacksC1132q abstractComponentCallbacksC1132q) {
        return this.f12897R.m(abstractComponentCallbacksC1132q);
    }

    void H(boolean z9) {
        if (z9 && (this.f12923x instanceof p171r0.c)) {
            z1(new IllegalStateException("Do not call dispatchLowMemory() on host. Host implements OnTrimMemoryProvider and automatically dispatches low memory callbacks to fragments."));
        }
        for (AbstractComponentCallbacksC1132q abstractComponentCallbacksC1132q : this.f12902c.o()) {
            if (abstractComponentCallbacksC1132q != null) {
                abstractComponentCallbacksC1132q.performLowMemory();
                if (z9) {
                    abstractComponentCallbacksC1132q.mChildFragmentManager.H(true);
                }
            }
        }
    }

    void H0() {
        this.f12908i = true;
        c0(true);
        this.f12908i = false;
        if (!f12879V || this.f12907h == null) {
            if (this.f12909j.g()) {
                if (L0(3)) {
                    Log.d("FragmentManager", "Calling popBackStackImmediate via onBackPressed callback");
                }
                c1();
                return;
            } else {
                if (L0(3)) {
                    Log.d("FragmentManager", "Calling onBackPressed via onBackPressed callback");
                }
                this.f12906g.l();
                return;
            }
        }
        if (!this.f12914o.isEmpty()) {
            LinkedHashSet linkedHashSet = new LinkedHashSet(p0(this.f12907h));
            Iterator it = this.f12914o.iterator();
            while (it.hasNext()) {
                androidx.appcompat.app.o.a(it.next());
                Iterator it2 = linkedHashSet.iterator();
                if (it2.hasNext()) {
                    throw null;
                }
            }
        }
        Iterator it3 = this.f12907h.f12988c.iterator();
        while (it3.hasNext()) {
            AbstractComponentCallbacksC1132q abstractComponentCallbacksC1132q = ((S.a) it3.next()).f13006b;
            if (abstractComponentCallbacksC1132q != null) {
                abstractComponentCallbacksC1132q.mTransitioning = false;
            }
        }
        Iterator it4 = w(new ArrayList(Collections.singletonList(this.f12907h)), 0, 1).iterator();
        while (it4.hasNext()) {
            ((b0) it4.next()).f();
        }
        Iterator it5 = this.f12907h.f12988c.iterator();
        while (it5.hasNext()) {
            AbstractComponentCallbacksC1132q abstractComponentCallbacksC1132q2 = ((S.a) it5.next()).f13006b;
            if (abstractComponentCallbacksC1132q2 != null && abstractComponentCallbacksC1132q2.mContainer == null) {
                x(abstractComponentCallbacksC1132q2).m();
            }
        }
        this.f12907h = null;
        B1();
        if (L0(3)) {
            Log.d("FragmentManager", "Op is being set to null");
            Log.d("FragmentManager", "OnBackPressedCallback enabled=" + this.f12909j.g() + " for  FragmentManager " + this);
        }
    }

    void I(boolean z9, boolean z10) {
        if (z10 && (this.f12923x instanceof p161q0.m)) {
            z1(new IllegalStateException("Do not call dispatchMultiWindowModeChanged() on host. Host implements OnMultiWindowModeChangedProvider and automatically dispatches multi-window mode changes to fragments."));
        }
        for (AbstractComponentCallbacksC1132q abstractComponentCallbacksC1132q : this.f12902c.o()) {
            if (abstractComponentCallbacksC1132q != null) {
                abstractComponentCallbacksC1132q.performMultiWindowModeChanged(z9);
                if (z10) {
                    abstractComponentCallbacksC1132q.mChildFragmentManager.I(z9, true);
                }
            }
        }
    }

    void I0(AbstractComponentCallbacksC1132q abstractComponentCallbacksC1132q) {
        if (L0(2)) {
            Log.v("FragmentManager", "hide: " + abstractComponentCallbacksC1132q);
        }
        if (abstractComponentCallbacksC1132q.mHidden) {
            return;
        }
        abstractComponentCallbacksC1132q.mHidden = true;
        abstractComponentCallbacksC1132q.mHiddenChanged = true ^ abstractComponentCallbacksC1132q.mHiddenChanged;
        w1(abstractComponentCallbacksC1132q);
    }

    void J(AbstractComponentCallbacksC1132q abstractComponentCallbacksC1132q) {
        Iterator it = this.f12916q.iterator();
        while (it.hasNext()) {
            ((N) it.next()).a(this, abstractComponentCallbacksC1132q);
        }
    }

    void J0(AbstractComponentCallbacksC1132q abstractComponentCallbacksC1132q) {
        if (abstractComponentCallbacksC1132q.mAdded && M0(abstractComponentCallbacksC1132q)) {
            this.f12889J = true;
        }
    }

    void K() {
        for (AbstractComponentCallbacksC1132q abstractComponentCallbacksC1132q : this.f12902c.l()) {
            if (abstractComponentCallbacksC1132q != null) {
                abstractComponentCallbacksC1132q.onHiddenChanged(abstractComponentCallbacksC1132q.isHidden());
                abstractComponentCallbacksC1132q.mChildFragmentManager.K();
            }
        }
    }

    public boolean K0() {
        return this.f12892M;
    }

    boolean L(MenuItem menuItem) {
        if (this.f12922w < 1) {
            return false;
        }
        for (AbstractComponentCallbacksC1132q abstractComponentCallbacksC1132q : this.f12902c.o()) {
            if (abstractComponentCallbacksC1132q != null && abstractComponentCallbacksC1132q.performOptionsItemSelected(menuItem)) {
                return true;
            }
        }
        return false;
    }

    void M(Menu menu) {
        if (this.f12922w < 1) {
            return;
        }
        for (AbstractComponentCallbacksC1132q abstractComponentCallbacksC1132q : this.f12902c.o()) {
            if (abstractComponentCallbacksC1132q != null) {
                abstractComponentCallbacksC1132q.performOptionsMenuClosed(menu);
            }
        }
    }

    void O() {
        U(5);
    }

    boolean O0(AbstractComponentCallbacksC1132q abstractComponentCallbacksC1132q) {
        if (abstractComponentCallbacksC1132q == null) {
            return false;
        }
        return abstractComponentCallbacksC1132q.isHidden();
    }

    void P(boolean z9, boolean z10) {
        if (z10 && (this.f12923x instanceof p161q0.n)) {
            z1(new IllegalStateException("Do not call dispatchPictureInPictureModeChanged() on host. Host implements OnPictureInPictureModeChangedProvider and automatically dispatches picture-in-picture mode changes to fragments."));
        }
        for (AbstractComponentCallbacksC1132q abstractComponentCallbacksC1132q : this.f12902c.o()) {
            if (abstractComponentCallbacksC1132q != null) {
                abstractComponentCallbacksC1132q.performPictureInPictureModeChanged(z9);
                if (z10) {
                    abstractComponentCallbacksC1132q.mChildFragmentManager.P(z9, true);
                }
            }
        }
    }

    boolean P0(AbstractComponentCallbacksC1132q abstractComponentCallbacksC1132q) {
        if (abstractComponentCallbacksC1132q == null) {
            return true;
        }
        return abstractComponentCallbacksC1132q.isMenuVisible();
    }

    boolean Q(Menu menu) {
        boolean z9 = false;
        if (this.f12922w < 1) {
            return false;
        }
        for (AbstractComponentCallbacksC1132q abstractComponentCallbacksC1132q : this.f12902c.o()) {
            if (abstractComponentCallbacksC1132q != null && P0(abstractComponentCallbacksC1132q) && abstractComponentCallbacksC1132q.performPrepareOptionsMenu(menu)) {
                z9 = true;
            }
        }
        return z9;
    }

    boolean Q0(AbstractComponentCallbacksC1132q abstractComponentCallbacksC1132q) {
        if (abstractComponentCallbacksC1132q == null) {
            return true;
        }
        J j9 = abstractComponentCallbacksC1132q.mFragmentManager;
        return abstractComponentCallbacksC1132q.equals(j9.C0()) && Q0(j9.f12925z);
    }

    void R() {
        B1();
        N(this.f12880A);
    }

    boolean R0(int i10) {
        return this.f12922w >= i10;
    }

    void S() {
        this.f12890K = false;
        this.f12891L = false;
        this.f12897R.p(false);
        U(7);
    }

    public boolean S0() {
        return this.f12890K || this.f12891L;
    }

    void T() {
        this.f12890K = false;
        this.f12891L = false;
        this.f12897R.p(false);
        U(5);
    }

    void T0(AbstractComponentCallbacksC1132q abstractComponentCallbacksC1132q, String[] strArr, int i10) {
        if (this.f12887H == null) {
            this.f12923x.u(abstractComponentCallbacksC1132q, strArr, i10);
            return;
        }
        this.f12888I.addLast(new l(abstractComponentCallbacksC1132q.mWho, i10));
        this.f12887H.b(strArr);
    }

    void U0(AbstractComponentCallbacksC1132q abstractComponentCallbacksC1132q, Intent intent, int i10, Bundle bundle) {
        if (this.f12885F == null) {
            this.f12923x.x(abstractComponentCallbacksC1132q, intent, i10, bundle);
            return;
        }
        this.f12888I.addLast(new l(abstractComponentCallbacksC1132q.mWho, i10));
        if (bundle != null) {
            intent.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundle);
        }
        this.f12885F.b(intent);
    }

    void V() {
        this.f12891L = true;
        this.f12897R.p(true);
        U(4);
    }

    void V0(AbstractComponentCallbacksC1132q abstractComponentCallbacksC1132q, IntentSender intentSender, int i10, Intent intent, int i11, int i12, int i13, Bundle bundle) {
        if (this.f12886G == null) {
            this.f12923x.y(abstractComponentCallbacksC1132q, intentSender, i10, intent, i11, i12, i13, bundle);
            return;
        }
        if (bundle != null) {
            if (intent == null) {
                intent = new Intent();
                intent.putExtra("androidx.fragment.extra.ACTIVITY_OPTIONS_BUNDLE", true);
            }
            if (L0(2)) {
                Log.v("FragmentManager", "ActivityOptions " + bundle + " were added to fillInIntent " + intent + " for fragment " + abstractComponentCallbacksC1132q);
            }
            intent.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundle);
        }
        p030d.g gVarA = new d.g.a(intentSender).b(intent).c(i12, i11).a();
        this.f12888I.addLast(new l(abstractComponentCallbacksC1132q.mWho, i10));
        if (L0(2)) {
            Log.v("FragmentManager", "Fragment " + abstractComponentCallbacksC1132q + "is launching an IntentSender for result ");
        }
        this.f12886G.b(gVarA);
    }

    void W() {
        U(2);
    }

    void W0(int i10, boolean z9) {
        A a10;
        if (this.f12923x == null && i10 != -1) {
            throw new IllegalStateException("No activity");
        }
        if (z9 || i10 != this.f12922w) {
            this.f12922w = i10;
            this.f12902c.t();
            y1();
            if (this.f12889J && (a10 = this.f12923x) != null && this.f12922w == 7) {
                a10.z();
                this.f12889J = false;
            }
        }
    }

    void X0() {
        if (this.f12923x == null) {
            return;
        }
        this.f12890K = false;
        this.f12891L = false;
        this.f12897R.p(false);
        for (AbstractComponentCallbacksC1132q abstractComponentCallbacksC1132q : this.f12902c.o()) {
            if (abstractComponentCallbacksC1132q != null) {
                abstractComponentCallbacksC1132q.noteStateNotSaved();
            }
        }
    }

    public void Y(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        int size;
        String str2 = str + "    ";
        this.f12902c.e(str, fileDescriptor, printWriter, strArr);
        ArrayList arrayList = this.f12904e;
        if (arrayList != null && (size = arrayList.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Fragments Created Menus:");
            for (int i10 = 0; i10 < size; i10++) {
                AbstractComponentCallbacksC1132q abstractComponentCallbacksC1132q = (AbstractComponentCallbacksC1132q) this.f12904e.get(i10);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i10);
                printWriter.print(": ");
                printWriter.println(abstractComponentCallbacksC1132q.toString());
            }
        }
        int size2 = this.f12903d.size();
        if (size2 > 0) {
            printWriter.print(str);
            printWriter.println("Back Stack:");
            for (int i11 = 0; i11 < size2; i11++) {
                C1116a c1116a = (C1116a) this.f12903d.get(i11);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i11);
                printWriter.print(": ");
                printWriter.println(c1116a.toString());
                c1116a.z(str2, printWriter);
            }
        }
        printWriter.print(str);
        printWriter.println("Back Stack Index: " + this.f12910k.get());
        synchronized (this.f12900a) {
            try {
                int size3 = this.f12900a.size();
                if (size3 > 0) {
                    printWriter.print(str);
                    printWriter.println("Pending Actions:");
                    for (int i12 = 0; i12 < size3; i12++) {
                        m mVar = (m) this.f12900a.get(i12);
                        printWriter.print(str);
                        printWriter.print("  #");
                        printWriter.print(i12);
                        printWriter.print(": ");
                        printWriter.println(mVar);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        printWriter.print(str);
        printWriter.println("FragmentManager misc state:");
        printWriter.print(str);
        printWriter.print("  mHost=");
        printWriter.println(this.f12923x);
        printWriter.print(str);
        printWriter.print("  mContainer=");
        printWriter.println(this.f12924y);
        if (this.f12925z != null) {
            printWriter.print(str);
            printWriter.print("  mParent=");
            printWriter.println(this.f12925z);
        }
        printWriter.print(str);
        printWriter.print("  mCurState=");
        printWriter.print(this.f12922w);
        printWriter.print(" mStateSaved=");
        printWriter.print(this.f12890K);
        printWriter.print(" mStopped=");
        printWriter.print(this.f12891L);
        printWriter.print(" mDestroyed=");
        printWriter.println(this.f12892M);
        if (this.f12889J) {
            printWriter.print(str);
            printWriter.print("  mNeedMenuInvalidate=");
            printWriter.println(this.f12889J);
        }
    }

    public final void Y0(FragmentContainerView fragmentContainerView) {
        View view;
        for (P p9 : this.f12902c.k()) {
            AbstractComponentCallbacksC1132q abstractComponentCallbacksC1132qK = p9.k();
            if (abstractComponentCallbacksC1132qK.mContainerId == fragmentContainerView.getId() && (view = abstractComponentCallbacksC1132qK.mView) != null && view.getParent() == null) {
                abstractComponentCallbacksC1132qK.mContainer = fragmentContainerView;
                p9.b();
                p9.m();
            }
        }
    }

    void Z0(P p9) {
        AbstractComponentCallbacksC1132q abstractComponentCallbacksC1132qK = p9.k();
        if (abstractComponentCallbacksC1132qK.mDeferStart) {
            if (this.f12901b) {
                this.f12893N = true;
            } else {
                abstractComponentCallbacksC1132qK.mDeferStart = false;
                p9.m();
            }
        }
    }

    void a0(m mVar, boolean z9) {
        if (!z9) {
            if (this.f12923x == null) {
                if (!this.f12892M) {
                    throw new IllegalStateException("FragmentManager has not been attached to a host.");
                }
                throw new IllegalStateException("FragmentManager has been destroyed");
            }
            s();
        }
        synchronized (this.f12900a) {
            try {
                if (this.f12923x == null) {
                    if (!z9) {
                        throw new IllegalStateException("Activity has been destroyed");
                    }
                } else {
                    this.f12900a.add(mVar);
                    s1();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void a1() {
        a0(new n(null, -1, 0), false);
    }

    void b1(int i10, int i11, boolean z9) {
        if (i10 >= 0) {
            a0(new n(null, i10, i11), z9);
            return;
        }
        throw new IllegalArgumentException("Bad id: " + i10);
    }

    boolean c0(boolean z9) {
        C1116a c1116a;
        b0(z9);
        boolean z10 = false;
        if (!this.f12908i && (c1116a = this.f12907h) != null) {
            c1116a.f13051u = false;
            if (L0(3)) {
                Log.d("FragmentManager", "Reversing mTransitioningOp " + this.f12907h + " as part of execPendingActions for actions " + this.f12900a);
            }
            this.f12907h.y(false, false);
            this.f12900a.add(0, this.f12907h);
            Iterator it = this.f12907h.f12988c.iterator();
            while (it.hasNext()) {
                AbstractComponentCallbacksC1132q abstractComponentCallbacksC1132q = ((S.a) it.next()).f13006b;
                if (abstractComponentCallbacksC1132q != null) {
                    abstractComponentCallbacksC1132q.mTransitioning = false;
                }
            }
            this.f12907h = null;
        }
        while (q0(this.f12894O, this.f12895P)) {
            z10 = true;
            this.f12901b = true;
            try {
                l1(this.f12894O, this.f12895P);
                t();
            } catch (Throwable th) {
                t();
                throw th;
            }
        }
        B1();
        X();
        this.f12902c.b();
        return z10;
    }

    public boolean c1() {
        return e1(null, -1, 0);
    }

    void d0(m mVar, boolean z9) {
        if (z9 && (this.f12923x == null || this.f12892M)) {
            return;
        }
        b0(z9);
        C1116a c1116a = this.f12907h;
        boolean z10 = false;
        if (c1116a != null) {
            c1116a.f13051u = false;
            if (L0(3)) {
                Log.d("FragmentManager", "Reversing mTransitioningOp " + this.f12907h + " as part of execSingleAction for action " + mVar);
            }
            this.f12907h.y(false, false);
            boolean zA = this.f12907h.a(this.f12894O, this.f12895P);
            Iterator it = this.f12907h.f12988c.iterator();
            while (it.hasNext()) {
                AbstractComponentCallbacksC1132q abstractComponentCallbacksC1132q = ((S.a) it.next()).f13006b;
                if (abstractComponentCallbacksC1132q != null) {
                    abstractComponentCallbacksC1132q.mTransitioning = false;
                }
            }
            this.f12907h = null;
            z10 = zA;
        }
        boolean zA2 = mVar.a(this.f12894O, this.f12895P);
        if (z10 || zA2) {
            this.f12901b = true;
            try {
                l1(this.f12894O, this.f12895P);
                t();
            } catch (Throwable th) {
                t();
                throw th;
            }
        }
        B1();
        X();
        this.f12902c.b();
    }

    public boolean d1(int i10, int i11) {
        if (i10 >= 0) {
            return e1(null, i10, i11);
        }
        throw new IllegalArgumentException("Bad id: " + i10);
    }

    boolean f1(ArrayList arrayList, ArrayList arrayList2, String str, int i10, int i11) {
        int iI0 = i0(str, i10, (i11 & 1) != 0);
        if (iI0 < 0) {
            return false;
        }
        for (int size = this.f12903d.size() - 1; size >= iI0; size--) {
            arrayList.add((C1116a) this.f12903d.remove(size));
            arrayList2.add(Boolean.TRUE);
        }
        return true;
    }

    public boolean g0() {
        boolean zC0 = c0(true);
        o0();
        return zC0;
    }

    boolean g1(ArrayList arrayList, ArrayList arrayList2) {
        if (L0(2)) {
            Log.v("FragmentManager", "FragmentManager has the following pending actions inside of prepareBackStackState: " + this.f12900a);
        }
        if (this.f12903d.isEmpty()) {
            Log.i("FragmentManager", "Ignoring call to start back stack pop because the back stack is empty.");
            return false;
        }
        ArrayList arrayList3 = this.f12903d;
        C1116a c1116a = (C1116a) arrayList3.get(arrayList3.size() - 1);
        this.f12907h = c1116a;
        Iterator it = c1116a.f12988c.iterator();
        while (it.hasNext()) {
            AbstractComponentCallbacksC1132q abstractComponentCallbacksC1132q = ((S.a) it.next()).f13006b;
            if (abstractComponentCallbacksC1132q != null) {
                abstractComponentCallbacksC1132q.mTransitioning = true;
            }
        }
        return f1(arrayList, arrayList2, null, -1, 0);
    }

    AbstractComponentCallbacksC1132q h0(String str) {
        return this.f12902c.f(str);
    }

    void h1() {
        a0(new o(), false);
    }

    void i(C1116a c1116a) {
        this.f12903d.add(c1116a);
    }

    public void i1(Bundle bundle, String str, AbstractComponentCallbacksC1132q abstractComponentCallbacksC1132q) {
        if (abstractComponentCallbacksC1132q.mFragmentManager != this) {
            z1(new IllegalStateException("Fragment " + abstractComponentCallbacksC1132q + " is not currently in the FragmentManager"));
        }
        bundle.putString(str, abstractComponentCallbacksC1132q.mWho);
    }

    P j(AbstractComponentCallbacksC1132q abstractComponentCallbacksC1132q) {
        String str = abstractComponentCallbacksC1132q.mPreviousWho;
        if (str != null) {
            U0.c.f(abstractComponentCallbacksC1132q, str);
        }
        if (L0(2)) {
            Log.v("FragmentManager", "add: " + abstractComponentCallbacksC1132q);
        }
        P pX = x(abstractComponentCallbacksC1132q);
        abstractComponentCallbacksC1132q.mFragmentManager = this;
        this.f12902c.r(pX);
        if (!abstractComponentCallbacksC1132q.mDetached) {
            this.f12902c.a(abstractComponentCallbacksC1132q);
            abstractComponentCallbacksC1132q.mRemoving = false;
            if (abstractComponentCallbacksC1132q.mView == null) {
                abstractComponentCallbacksC1132q.mHiddenChanged = false;
            }
            if (M0(abstractComponentCallbacksC1132q)) {
                this.f12889J = true;
            }
        }
        return pX;
    }

    public AbstractComponentCallbacksC1132q j0(int i10) {
        return this.f12902c.g(i10);
    }

    public void j1(k kVar, boolean z9) {
        this.f12915p.o(kVar, z9);
    }

    public void k(N n9) {
        this.f12916q.add(n9);
    }

    public AbstractComponentCallbacksC1132q k0(String str) {
        return this.f12902c.h(str);
    }

    void k1(AbstractComponentCallbacksC1132q abstractComponentCallbacksC1132q) {
        if (L0(2)) {
            Log.v("FragmentManager", "remove: " + abstractComponentCallbacksC1132q + " nesting=" + abstractComponentCallbacksC1132q.mBackStackNesting);
        }
        boolean zIsInBackStack = abstractComponentCallbacksC1132q.isInBackStack();
        if (abstractComponentCallbacksC1132q.mDetached && zIsInBackStack) {
            return;
        }
        this.f12902c.u(abstractComponentCallbacksC1132q);
        if (M0(abstractComponentCallbacksC1132q)) {
            this.f12889J = true;
        }
        abstractComponentCallbacksC1132q.mRemoving = true;
        w1(abstractComponentCallbacksC1132q);
    }

    void l(AbstractComponentCallbacksC1132q abstractComponentCallbacksC1132q) {
        this.f12897R.e(abstractComponentCallbacksC1132q);
    }

    AbstractComponentCallbacksC1132q l0(String str) {
        return this.f12902c.i(str);
    }

    int m() {
        return this.f12910k.getAndIncrement();
    }

    void m1(AbstractComponentCallbacksC1132q abstractComponentCallbacksC1132q) {
        this.f12897R.o(abstractComponentCallbacksC1132q);
    }

    /* JADX WARN: Multi-variable type inference failed */
    void n(A a10, AbstractC1138x abstractC1138x, AbstractComponentCallbacksC1132q abstractComponentCallbacksC1132q) {
        String str;
        InterfaceC1163x interfaceC1163x;
        if (this.f12923x != null) {
            throw new IllegalStateException("Already attached");
        }
        this.f12923x = a10;
        this.f12924y = abstractC1138x;
        this.f12925z = abstractComponentCallbacksC1132q;
        if (abstractComponentCallbacksC1132q != null) {
            k(new g(abstractComponentCallbacksC1132q));
        } else if (a10 instanceof N) {
            k((N) a10);
        }
        if (this.f12925z != null) {
            B1();
        }
        if (a10 instanceof p010b.w) {
            p010b.w wVar = (p010b.w) a10;
            p010b.v vVarF = wVar.f();
            this.f12906g = vVarF;
            if (abstractComponentCallbacksC1132q != null) {
                interfaceC1163x = wVar;
                interfaceC1163x = abstractComponentCallbacksC1132q;
            }
            interfaceC1163x = wVar;
            vVarF.h(interfaceC1163x, this.f12909j);
        }
        if (abstractComponentCallbacksC1132q != null) {
            this.f12897R = abstractComponentCallbacksC1132q.mFragmentManager.s0(abstractComponentCallbacksC1132q);
        } else if (a10 instanceof f0) {
            this.f12897R = M.k(((f0) a10).getViewModelStore());
        } else {
            this.f12897R = new M(false);
        }
        this.f12897R.p(S0());
        this.f12902c.A(this.f12897R);
        Object obj = this.f12923x;
        if ((obj instanceof p082i1.f) && abstractComponentCallbacksC1132q == null) {
            p082i1.d savedStateRegistry = ((p082i1.f) obj).getSavedStateRegistry();
            savedStateRegistry.h("android:support:fragments", new i1.d.c() { // from class: androidx.fragment.app.H
                @Override // i1.d.c
                public final Bundle saveState() {
                    return this.f12876a.q1();
                }
            });
            Bundle bundleB = savedStateRegistry.b("android:support:fragments");
            if (bundleB != null) {
                o1(bundleB);
            }
        }
        Object obj2 = this.f12923x;
        if (obj2 instanceof p030d.f) {
            p030d.e eVarN = ((p030d.f) obj2).n();
            if (abstractComponentCallbacksC1132q != null) {
                str = abstractComponentCallbacksC1132q.mWho + ":";
            } else {
                str = "";
            }
            String str2 = "FragmentManager:" + str;
            this.f12885F = eVarN.m(str2 + "StartActivityForResult", new p040e.c(), new h());
            this.f12886G = eVarN.m(str2 + "StartIntentSenderForResult", new j(), new i());
            this.f12887H = eVarN.m(str2 + "RequestPermissions", new p040e.b(), new a());
        }
        Object obj3 = this.f12923x;
        if (obj3 instanceof p171r0.b) {
            ((p171r0.b) obj3).o(this.f12917r);
        }
        Object obj4 = this.f12923x;
        if (obj4 instanceof p171r0.c) {
            ((p171r0.c) obj4).s(this.f12918s);
        }
        Object obj5 = this.f12923x;
        if (obj5 instanceof p161q0.m) {
            ((p161q0.m) obj5).m(this.f12919t);
        }
        Object obj6 = this.f12923x;
        if (obj6 instanceof p161q0.n) {
            ((p161q0.n) obj6).v(this.f12920u);
        }
        Object obj7 = this.f12923x;
        if ((obj7 instanceof InterfaceC1081m) && abstractComponentCallbacksC1132q == null) {
            ((InterfaceC1081m) obj7).D(this.f12921v);
        }
    }

    void o(AbstractComponentCallbacksC1132q abstractComponentCallbacksC1132q) {
        if (L0(2)) {
            Log.v("FragmentManager", "attach: " + abstractComponentCallbacksC1132q);
        }
        if (abstractComponentCallbacksC1132q.mDetached) {
            abstractComponentCallbacksC1132q.mDetached = false;
            if (abstractComponentCallbacksC1132q.mAdded) {
                return;
            }
            this.f12902c.a(abstractComponentCallbacksC1132q);
            if (L0(2)) {
                Log.v("FragmentManager", "add from attach: " + abstractComponentCallbacksC1132q);
            }
            if (M0(abstractComponentCallbacksC1132q)) {
                this.f12889J = true;
            }
        }
    }

    void o1(Parcelable parcelable) {
        P p9;
        Bundle bundle;
        Bundle bundle2;
        if (parcelable == null) {
            return;
        }
        Bundle bundle3 = (Bundle) parcelable;
        for (String str : bundle3.keySet()) {
            if (str.startsWith("result_") && (bundle2 = bundle3.getBundle(str)) != null) {
                bundle2.setClassLoader(this.f12923x.h().getClassLoader());
                this.f12912m.put(str.substring(7), bundle2);
            }
        }
        HashMap map = new HashMap();
        for (String str2 : bundle3.keySet()) {
            if (str2.startsWith("fragment_") && (bundle = bundle3.getBundle(str2)) != null) {
                bundle.setClassLoader(this.f12923x.h().getClassLoader());
                map.put(str2.substring(9), bundle);
            }
        }
        this.f12902c.x(map);
        L l9 = (L) bundle3.getParcelable("state");
        if (l9 == null) {
            return;
        }
        this.f12902c.v();
        Iterator it = l9.f12943q.iterator();
        while (it.hasNext()) {
            Bundle bundleB = this.f12902c.B((String) it.next(), null);
            if (bundleB != null) {
                AbstractComponentCallbacksC1132q abstractComponentCallbacksC1132qI = this.f12897R.i(((O) bundleB.getParcelable("state")).f12965r);
                if (abstractComponentCallbacksC1132qI != null) {
                    if (L0(2)) {
                        Log.v("FragmentManager", "restoreSaveState: re-attaching retained " + abstractComponentCallbacksC1132qI);
                    }
                    p9 = new P(this.f12915p, this.f12902c, abstractComponentCallbacksC1132qI, bundleB);
                } else {
                    p9 = new P(this.f12915p, this.f12902c, this.f12923x.h().getClassLoader(), w0(), bundleB);
                }
                AbstractComponentCallbacksC1132q abstractComponentCallbacksC1132qK = p9.k();
                abstractComponentCallbacksC1132qK.mSavedFragmentState = bundleB;
                abstractComponentCallbacksC1132qK.mFragmentManager = this;
                if (L0(2)) {
                    Log.v("FragmentManager", "restoreSaveState: active (" + abstractComponentCallbacksC1132qK.mWho + "): " + abstractComponentCallbacksC1132qK);
                }
                p9.o(this.f12923x.h().getClassLoader());
                this.f12902c.r(p9);
                p9.t(this.f12922w);
            }
        }
        for (AbstractComponentCallbacksC1132q abstractComponentCallbacksC1132q : this.f12897R.l()) {
            if (!this.f12902c.c(abstractComponentCallbacksC1132q.mWho)) {
                if (L0(2)) {
                    Log.v("FragmentManager", "Discarding retained Fragment " + abstractComponentCallbacksC1132q + " that was not found in the set of active Fragments " + l9.f12943q);
                }
                this.f12897R.o(abstractComponentCallbacksC1132q);
                abstractComponentCallbacksC1132q.mFragmentManager = this;
                P p10 = new P(this.f12915p, this.f12902c, abstractComponentCallbacksC1132q);
                p10.t(1);
                p10.m();
                abstractComponentCallbacksC1132q.mRemoving = true;
                p10.m();
            }
        }
        this.f12902c.w(l9.f12944r);
        if (l9.f12945s != null) {
            this.f12903d = new ArrayList(l9.f12945s.length);
            int i10 = 0;
            while (true) {
                C1117b[] c1117bArr = l9.f12945s;
                if (i10 >= c1117bArr.length) {
                    break;
                }
                C1116a c1116aB = c1117bArr[i10].b(this);
                if (L0(2)) {
                    Log.v("FragmentManager", "restoreAllState: back stack #" + i10 + " (index " + c1116aB.f13052v + "): " + c1116aB);
                    PrintWriter printWriter = new PrintWriter(new Y("FragmentManager"));
                    c1116aB.A("  ", printWriter, false);
                    printWriter.close();
                }
                this.f12903d.add(c1116aB);
                i10++;
            }
        } else {
            this.f12903d = new ArrayList();
        }
        this.f12910k.set(l9.f12946t);
        String str3 = l9.f12947u;
        if (str3 != null) {
            AbstractComponentCallbacksC1132q abstractComponentCallbacksC1132qH0 = h0(str3);
            this.f12880A = abstractComponentCallbacksC1132qH0;
            N(abstractComponentCallbacksC1132qH0);
        }
        ArrayList arrayList = l9.f12948v;
        if (arrayList != null) {
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                this.f12911l.put((String) arrayList.get(i11), (C1118c) l9.f12949w.get(i11));
            }
        }
        this.f12888I = new ArrayDeque(l9.f12950x);
    }

    public S p() {
        return new C1116a(this);
    }

    Set p0(C1116a c1116a) {
        HashSet hashSet = new HashSet();
        for (int i10 = 0; i10 < c1116a.f12988c.size(); i10++) {
            AbstractComponentCallbacksC1132q abstractComponentCallbacksC1132q = ((S.a) c1116a.f12988c.get(i10)).f13006b;
            if (abstractComponentCallbacksC1132q != null && c1116a.f12994i) {
                hashSet.add(abstractComponentCallbacksC1132q);
            }
        }
        return hashSet;
    }

    void q() {
        if (L0(3)) {
            Log.d("FragmentManager", "cancelBackStackTransition for transition " + this.f12907h);
        }
        C1116a c1116a = this.f12907h;
        if (c1116a != null) {
            c1116a.f13051u = false;
            c1116a.t(true, new Runnable() { // from class: androidx.fragment.app.I
                @Override // java.lang.Runnable
                public final void run() {
                    J.c(this.f12877q);
                }
            });
            this.f12907h.i();
            this.f12908i = true;
            g0();
            this.f12908i = false;
            this.f12907h = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Bundle q1() {
        C1117b[] c1117bArr;
        Bundle bundle = new Bundle();
        o0();
        Z();
        c0(true);
        this.f12890K = true;
        this.f12897R.p(true);
        ArrayList arrayListY = this.f12902c.y();
        HashMap mapM = this.f12902c.m();
        if (!mapM.isEmpty()) {
            ArrayList arrayListZ = this.f12902c.z();
            int size = this.f12903d.size();
            if (size > 0) {
                c1117bArr = new C1117b[size];
                for (int i10 = 0; i10 < size; i10++) {
                    c1117bArr[i10] = new C1117b((C1116a) this.f12903d.get(i10));
                    if (L0(2)) {
                        Log.v("FragmentManager", "saveAllState: adding back stack #" + i10 + ": " + this.f12903d.get(i10));
                    }
                }
            } else {
                c1117bArr = null;
            }
            L l9 = new L();
            l9.f12943q = arrayListY;
            l9.f12944r = arrayListZ;
            l9.f12945s = c1117bArr;
            l9.f12946t = this.f12910k.get();
            AbstractComponentCallbacksC1132q abstractComponentCallbacksC1132q = this.f12880A;
            if (abstractComponentCallbacksC1132q != null) {
                l9.f12947u = abstractComponentCallbacksC1132q.mWho;
            }
            l9.f12948v.addAll(this.f12911l.keySet());
            l9.f12949w.addAll(this.f12911l.values());
            l9.f12950x = new ArrayList(this.f12888I);
            bundle.putParcelable("state", l9);
            for (String str : this.f12912m.keySet()) {
                bundle.putBundle("result_" + str, (Bundle) this.f12912m.get(str));
            }
            for (String str2 : mapM.keySet()) {
                bundle.putBundle("fragment_" + str2, (Bundle) mapM.get(str2));
            }
        } else if (L0(2)) {
            Log.v("FragmentManager", "saveAllState: no fragments!");
            return bundle;
        }
        return bundle;
    }

    boolean r() {
        boolean zM0 = false;
        for (AbstractComponentCallbacksC1132q abstractComponentCallbacksC1132q : this.f12902c.l()) {
            if (abstractComponentCallbacksC1132q != null) {
                zM0 = M0(abstractComponentCallbacksC1132q);
            }
            if (zM0) {
                return true;
            }
        }
        return false;
    }

    public int r0() {
        return this.f12903d.size() + (this.f12907h != null ? 1 : 0);
    }

    public AbstractComponentCallbacksC1132q.n r1(AbstractComponentCallbacksC1132q abstractComponentCallbacksC1132q) {
        P pN = this.f12902c.n(abstractComponentCallbacksC1132q.mWho);
        if (pN == null || !pN.k().equals(abstractComponentCallbacksC1132q)) {
            z1(new IllegalStateException("Fragment " + abstractComponentCallbacksC1132q + " is not currently in the FragmentManager"));
        }
        return pN.q();
    }

    void s1() {
        synchronized (this.f12900a) {
            try {
                if (this.f12900a.size() == 1) {
                    this.f12923x.k().removeCallbacks(this.f12899T);
                    this.f12923x.k().post(this.f12899T);
                    B1();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    AbstractC1138x t0() {
        return this.f12924y;
    }

    void t1(AbstractComponentCallbacksC1132q abstractComponentCallbacksC1132q, boolean z9) {
        ViewGroup viewGroupV0 = v0(abstractComponentCallbacksC1132q);
        if (viewGroupV0 == null || !(viewGroupV0 instanceof FragmentContainerView)) {
            return;
        }
        ((FragmentContainerView) viewGroupV0).setDrawDisappearingViewsLast(!z9);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(Optimizer.OPTIMIZATION_GRAPH_WRAP);
        sb.append("FragmentManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        AbstractComponentCallbacksC1132q abstractComponentCallbacksC1132q = this.f12925z;
        if (abstractComponentCallbacksC1132q != null) {
            sb.append(abstractComponentCallbacksC1132q.getClass().getSimpleName());
            sb.append("{");
            sb.append(Integer.toHexString(System.identityHashCode(this.f12925z)));
            sb.append("}");
        } else {
            A a10 = this.f12923x;
            if (a10 != null) {
                sb.append(a10.getClass().getSimpleName());
                sb.append("{");
                sb.append(Integer.toHexString(System.identityHashCode(this.f12923x)));
                sb.append("}");
            } else {
                sb.append("null");
            }
        }
        sb.append("}}");
        return sb.toString();
    }

    public AbstractComponentCallbacksC1132q u0(Bundle bundle, String str) {
        String string = bundle.getString(str);
        if (string == null) {
            return null;
        }
        AbstractComponentCallbacksC1132q abstractComponentCallbacksC1132qH0 = h0(string);
        if (abstractComponentCallbacksC1132qH0 == null) {
            z1(new IllegalStateException("Fragment no longer exists for key " + str + ": unique id " + string));
        }
        return abstractComponentCallbacksC1132qH0;
    }

    void u1(AbstractComponentCallbacksC1132q abstractComponentCallbacksC1132q, AbstractC1157q.b bVar) {
        if (abstractComponentCallbacksC1132q.equals(h0(abstractComponentCallbacksC1132q.mWho)) && (abstractComponentCallbacksC1132q.mHost == null || abstractComponentCallbacksC1132q.mFragmentManager == this)) {
            abstractComponentCallbacksC1132q.mMaxState = bVar;
            return;
        }
        throw new IllegalArgumentException("Fragment " + abstractComponentCallbacksC1132q + " is not an active fragment of FragmentManager " + this);
    }

    void v1(AbstractComponentCallbacksC1132q abstractComponentCallbacksC1132q) {
        if (abstractComponentCallbacksC1132q == null || (abstractComponentCallbacksC1132q.equals(h0(abstractComponentCallbacksC1132q.mWho)) && (abstractComponentCallbacksC1132q.mHost == null || abstractComponentCallbacksC1132q.mFragmentManager == this))) {
            AbstractComponentCallbacksC1132q abstractComponentCallbacksC1132q2 = this.f12880A;
            this.f12880A = abstractComponentCallbacksC1132q;
            N(abstractComponentCallbacksC1132q2);
            N(this.f12880A);
            return;
        }
        throw new IllegalArgumentException("Fragment " + abstractComponentCallbacksC1132q + " is not an active fragment of FragmentManager " + this);
    }

    Set w(ArrayList arrayList, int i10, int i11) {
        ViewGroup viewGroup;
        HashSet hashSet = new HashSet();
        while (i10 < i11) {
            Iterator it = ((C1116a) arrayList.get(i10)).f12988c.iterator();
            while (it.hasNext()) {
                AbstractComponentCallbacksC1132q abstractComponentCallbacksC1132q = ((S.a) it.next()).f13006b;
                if (abstractComponentCallbacksC1132q != null && (viewGroup = abstractComponentCallbacksC1132q.mContainer) != null) {
                    hashSet.add(b0.u(viewGroup, this));
                }
            }
            i10++;
        }
        return hashSet;
    }

    public AbstractC1140z w0() {
        AbstractC1140z abstractC1140z = this.f12881B;
        if (abstractC1140z != null) {
            return abstractC1140z;
        }
        AbstractComponentCallbacksC1132q abstractComponentCallbacksC1132q = this.f12925z;
        return abstractComponentCallbacksC1132q != null ? abstractComponentCallbacksC1132q.mFragmentManager.w0() : this.f12882C;
    }

    P x(AbstractComponentCallbacksC1132q abstractComponentCallbacksC1132q) {
        P pN = this.f12902c.n(abstractComponentCallbacksC1132q.mWho);
        if (pN != null) {
            return pN;
        }
        P p9 = new P(this.f12915p, this.f12902c, abstractComponentCallbacksC1132q);
        p9.o(this.f12923x.h().getClassLoader());
        p9.t(this.f12922w);
        return p9;
    }

    public List x0() {
        return this.f12902c.o();
    }

    void x1(AbstractComponentCallbacksC1132q abstractComponentCallbacksC1132q) {
        if (L0(2)) {
            Log.v("FragmentManager", "show: " + abstractComponentCallbacksC1132q);
        }
        if (abstractComponentCallbacksC1132q.mHidden) {
            abstractComponentCallbacksC1132q.mHidden = false;
            abstractComponentCallbacksC1132q.mHiddenChanged = !abstractComponentCallbacksC1132q.mHiddenChanged;
        }
    }

    void y(AbstractComponentCallbacksC1132q abstractComponentCallbacksC1132q) {
        if (L0(2)) {
            Log.v("FragmentManager", "detach: " + abstractComponentCallbacksC1132q);
        }
        if (abstractComponentCallbacksC1132q.mDetached) {
            return;
        }
        abstractComponentCallbacksC1132q.mDetached = true;
        if (abstractComponentCallbacksC1132q.mAdded) {
            if (L0(2)) {
                Log.v("FragmentManager", "remove from detach: " + abstractComponentCallbacksC1132q);
            }
            this.f12902c.u(abstractComponentCallbacksC1132q);
            if (M0(abstractComponentCallbacksC1132q)) {
                this.f12889J = true;
            }
            w1(abstractComponentCallbacksC1132q);
        }
    }

    public A y0() {
        return this.f12923x;
    }

    void z() {
        this.f12890K = false;
        this.f12891L = false;
        this.f12897R.p(false);
        U(4);
    }

    LayoutInflater.Factory2 z0() {
        return this.f12905f;
    }

    static class l implements Parcelable {
        public static final Parcelable.Creator<l> CREATOR = new a();

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        String f12936q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f12937r;

        class a implements Parcelable.Creator {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public l createFromParcel(Parcel parcel) {
                return new l(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public l[] newArray(int i10) {
                return new l[i10];
            }
        }

        l(String str, int i10) {
            this.f12936q = str;
            this.f12937r = i10;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            parcel.writeString(this.f12936q);
            parcel.writeInt(this.f12937r);
        }

        l(Parcel parcel) {
            this.f12936q = parcel.readString();
            this.f12937r = parcel.readInt();
        }
    }
}
