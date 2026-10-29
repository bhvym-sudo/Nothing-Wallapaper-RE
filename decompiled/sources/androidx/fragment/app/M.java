package androidx.fragment.app;

import android.util.Log;
import androidx.lifecycle.e0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
final class M extends androidx.lifecycle.a0 {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final androidx.lifecycle.d0.c f12951i = new a();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f12955e;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final HashMap f12952b = new HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final HashMap f12953c = new HashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final HashMap f12954d = new HashMap();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f12956f = false;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f12957g = false;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f12958h = false;

    class a implements androidx.lifecycle.d0.c {
        a() {
        }

        @Override // androidx.lifecycle.d0.c
        public androidx.lifecycle.a0 a(Class cls) {
            return new M(true);
        }
    }

    M(boolean z9) {
        this.f12955e = z9;
    }

    private void h(String str, boolean z9) {
        M m9 = (M) this.f12953c.get(str);
        if (m9 != null) {
            if (z9) {
                ArrayList arrayList = new ArrayList();
                arrayList.addAll(m9.f12953c.keySet());
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    m9.g((String) it.next(), true);
                }
            }
            m9.d();
            this.f12953c.remove(str);
        }
        e0 e0Var = (e0) this.f12954d.get(str);
        if (e0Var != null) {
            e0Var.a();
            this.f12954d.remove(str);
        }
    }

    static M k(e0 e0Var) {
        return (M) new androidx.lifecycle.d0(e0Var, f12951i).b(M.class);
    }

    @Override // androidx.lifecycle.a0
    protected void d() {
        if (J.L0(3)) {
            Log.d("FragmentManager", "onCleared called for " + this);
        }
        this.f12956f = true;
    }

    void e(AbstractComponentCallbacksC1132q abstractComponentCallbacksC1132q) {
        if (this.f12958h) {
            if (J.L0(2)) {
                Log.v("FragmentManager", "Ignoring addRetainedFragment as the state is already saved");
            }
        } else {
            if (this.f12952b.containsKey(abstractComponentCallbacksC1132q.mWho)) {
                return;
            }
            this.f12952b.put(abstractComponentCallbacksC1132q.mWho, abstractComponentCallbacksC1132q);
            if (J.L0(2)) {
                Log.v("FragmentManager", "Updating retained Fragments: Added " + abstractComponentCallbacksC1132q);
            }
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && M.class == obj.getClass()) {
            M m9 = (M) obj;
            if (this.f12952b.equals(m9.f12952b) && this.f12953c.equals(m9.f12953c) && this.f12954d.equals(m9.f12954d)) {
                return true;
            }
        }
        return false;
    }

    void f(AbstractComponentCallbacksC1132q abstractComponentCallbacksC1132q, boolean z9) {
        if (J.L0(3)) {
            Log.d("FragmentManager", "Clearing non-config state for " + abstractComponentCallbacksC1132q);
        }
        h(abstractComponentCallbacksC1132q.mWho, z9);
    }

    void g(String str, boolean z9) {
        if (J.L0(3)) {
            Log.d("FragmentManager", "Clearing non-config state for saved state of Fragment " + str);
        }
        h(str, z9);
    }

    public int hashCode() {
        return (((this.f12952b.hashCode() * 31) + this.f12953c.hashCode()) * 31) + this.f12954d.hashCode();
    }

    AbstractComponentCallbacksC1132q i(String str) {
        return (AbstractComponentCallbacksC1132q) this.f12952b.get(str);
    }

    M j(AbstractComponentCallbacksC1132q abstractComponentCallbacksC1132q) {
        M m9 = (M) this.f12953c.get(abstractComponentCallbacksC1132q.mWho);
        if (m9 != null) {
            return m9;
        }
        M m10 = new M(this.f12955e);
        this.f12953c.put(abstractComponentCallbacksC1132q.mWho, m10);
        return m10;
    }

    Collection l() {
        return new ArrayList(this.f12952b.values());
    }

    e0 m(AbstractComponentCallbacksC1132q abstractComponentCallbacksC1132q) {
        e0 e0Var = (e0) this.f12954d.get(abstractComponentCallbacksC1132q.mWho);
        if (e0Var != null) {
            return e0Var;
        }
        e0 e0Var2 = new e0();
        this.f12954d.put(abstractComponentCallbacksC1132q.mWho, e0Var2);
        return e0Var2;
    }

    boolean n() {
        return this.f12956f;
    }

    void o(AbstractComponentCallbacksC1132q abstractComponentCallbacksC1132q) {
        if (this.f12958h) {
            if (J.L0(2)) {
                Log.v("FragmentManager", "Ignoring removeRetainedFragment as the state is already saved");
            }
        } else {
            if (this.f12952b.remove(abstractComponentCallbacksC1132q.mWho) == null || !J.L0(2)) {
                return;
            }
            Log.v("FragmentManager", "Updating retained Fragments: Removed " + abstractComponentCallbacksC1132q);
        }
    }

    void p(boolean z9) {
        this.f12958h = z9;
    }

    boolean q(AbstractComponentCallbacksC1132q abstractComponentCallbacksC1132q) {
        if (this.f12952b.containsKey(abstractComponentCallbacksC1132q.mWho)) {
            return this.f12955e ? this.f12956f : !this.f12957g;
        }
        return true;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("FragmentManagerViewModel{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} Fragments (");
        Iterator it = this.f12952b.values().iterator();
        while (it.hasNext()) {
            sb.append(it.next());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") Child Non Config (");
        Iterator it2 = this.f12953c.keySet().iterator();
        while (it2.hasNext()) {
            sb.append((String) it2.next());
            if (it2.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") ViewModelStores (");
        Iterator it3 = this.f12954d.keySet().iterator();
        while (it3.hasNext()) {
            sb.append((String) it3.next());
            if (it3.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(')');
        return sb.toString();
    }
}
