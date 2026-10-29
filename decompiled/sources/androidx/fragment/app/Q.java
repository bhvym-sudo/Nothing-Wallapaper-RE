package androidx.fragment.app;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
class Q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ArrayList f12982a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final HashMap f12983b = new HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final HashMap f12984c = new HashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private M f12985d;

    Q() {
    }

    void A(M m9) {
        this.f12985d = m9;
    }

    Bundle B(String str, Bundle bundle) {
        return bundle != null ? (Bundle) this.f12984c.put(str, bundle) : (Bundle) this.f12984c.remove(str);
    }

    void a(AbstractComponentCallbacksC1132q abstractComponentCallbacksC1132q) {
        if (this.f12982a.contains(abstractComponentCallbacksC1132q)) {
            throw new IllegalStateException("Fragment already added: " + abstractComponentCallbacksC1132q);
        }
        synchronized (this.f12982a) {
            this.f12982a.add(abstractComponentCallbacksC1132q);
        }
        abstractComponentCallbacksC1132q.mAdded = true;
    }

    void b() {
        this.f12983b.values().removeAll(Collections.singleton(null));
    }

    boolean c(String str) {
        return this.f12983b.get(str) != null;
    }

    void d(int i10) {
        for (P p9 : this.f12983b.values()) {
            if (p9 != null) {
                p9.t(i10);
            }
        }
    }

    void e(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        String str2 = str + "    ";
        if (!this.f12983b.isEmpty()) {
            printWriter.print(str);
            printWriter.println("Active Fragments:");
            for (P p9 : this.f12983b.values()) {
                printWriter.print(str);
                if (p9 != null) {
                    AbstractComponentCallbacksC1132q abstractComponentCallbacksC1132qK = p9.k();
                    printWriter.println(abstractComponentCallbacksC1132qK);
                    abstractComponentCallbacksC1132qK.dump(str2, fileDescriptor, printWriter, strArr);
                } else {
                    printWriter.println("null");
                }
            }
        }
        int size = this.f12982a.size();
        if (size > 0) {
            printWriter.print(str);
            printWriter.println("Added Fragments:");
            for (int i10 = 0; i10 < size; i10++) {
                AbstractComponentCallbacksC1132q abstractComponentCallbacksC1132q = (AbstractComponentCallbacksC1132q) this.f12982a.get(i10);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i10);
                printWriter.print(": ");
                printWriter.println(abstractComponentCallbacksC1132q.toString());
            }
        }
    }

    AbstractComponentCallbacksC1132q f(String str) {
        P p9 = (P) this.f12983b.get(str);
        if (p9 != null) {
            return p9.k();
        }
        return null;
    }

    AbstractComponentCallbacksC1132q g(int i10) {
        for (int size = this.f12982a.size() - 1; size >= 0; size--) {
            AbstractComponentCallbacksC1132q abstractComponentCallbacksC1132q = (AbstractComponentCallbacksC1132q) this.f12982a.get(size);
            if (abstractComponentCallbacksC1132q != null && abstractComponentCallbacksC1132q.mFragmentId == i10) {
                return abstractComponentCallbacksC1132q;
            }
        }
        for (P p9 : this.f12983b.values()) {
            if (p9 != null) {
                AbstractComponentCallbacksC1132q abstractComponentCallbacksC1132qK = p9.k();
                if (abstractComponentCallbacksC1132qK.mFragmentId == i10) {
                    return abstractComponentCallbacksC1132qK;
                }
            }
        }
        return null;
    }

    AbstractComponentCallbacksC1132q h(String str) {
        if (str != null) {
            for (int size = this.f12982a.size() - 1; size >= 0; size--) {
                AbstractComponentCallbacksC1132q abstractComponentCallbacksC1132q = (AbstractComponentCallbacksC1132q) this.f12982a.get(size);
                if (abstractComponentCallbacksC1132q != null && str.equals(abstractComponentCallbacksC1132q.mTag)) {
                    return abstractComponentCallbacksC1132q;
                }
            }
        }
        if (str == null) {
            return null;
        }
        for (P p9 : this.f12983b.values()) {
            if (p9 != null) {
                AbstractComponentCallbacksC1132q abstractComponentCallbacksC1132qK = p9.k();
                if (str.equals(abstractComponentCallbacksC1132qK.mTag)) {
                    return abstractComponentCallbacksC1132qK;
                }
            }
        }
        return null;
    }

    AbstractComponentCallbacksC1132q i(String str) {
        AbstractComponentCallbacksC1132q abstractComponentCallbacksC1132qFindFragmentByWho;
        for (P p9 : this.f12983b.values()) {
            if (p9 != null && (abstractComponentCallbacksC1132qFindFragmentByWho = p9.k().findFragmentByWho(str)) != null) {
                return abstractComponentCallbacksC1132qFindFragmentByWho;
            }
        }
        return null;
    }

    int j(AbstractComponentCallbacksC1132q abstractComponentCallbacksC1132q) {
        View view;
        View view2;
        ViewGroup viewGroup = abstractComponentCallbacksC1132q.mContainer;
        if (viewGroup == null) {
            return -1;
        }
        int iIndexOf = this.f12982a.indexOf(abstractComponentCallbacksC1132q);
        for (int i10 = iIndexOf - 1; i10 >= 0; i10--) {
            AbstractComponentCallbacksC1132q abstractComponentCallbacksC1132q2 = (AbstractComponentCallbacksC1132q) this.f12982a.get(i10);
            if (abstractComponentCallbacksC1132q2.mContainer == viewGroup && (view2 = abstractComponentCallbacksC1132q2.mView) != null) {
                return viewGroup.indexOfChild(view2) + 1;
            }
        }
        while (true) {
            iIndexOf++;
            if (iIndexOf >= this.f12982a.size()) {
                return -1;
            }
            AbstractComponentCallbacksC1132q abstractComponentCallbacksC1132q3 = (AbstractComponentCallbacksC1132q) this.f12982a.get(iIndexOf);
            if (abstractComponentCallbacksC1132q3.mContainer == viewGroup && (view = abstractComponentCallbacksC1132q3.mView) != null) {
                return viewGroup.indexOfChild(view);
            }
        }
    }

    List k() {
        ArrayList arrayList = new ArrayList();
        for (P p9 : this.f12983b.values()) {
            if (p9 != null) {
                arrayList.add(p9);
            }
        }
        return arrayList;
    }

    List l() {
        ArrayList arrayList = new ArrayList();
        for (P p9 : this.f12983b.values()) {
            if (p9 != null) {
                arrayList.add(p9.k());
            } else {
                arrayList.add(null);
            }
        }
        return arrayList;
    }

    HashMap m() {
        return this.f12984c;
    }

    P n(String str) {
        return (P) this.f12983b.get(str);
    }

    List o() {
        ArrayList arrayList;
        if (this.f12982a.isEmpty()) {
            return Collections.EMPTY_LIST;
        }
        synchronized (this.f12982a) {
            arrayList = new ArrayList(this.f12982a);
        }
        return arrayList;
    }

    M p() {
        return this.f12985d;
    }

    Bundle q(String str) {
        return (Bundle) this.f12984c.get(str);
    }

    void r(P p9) {
        AbstractComponentCallbacksC1132q abstractComponentCallbacksC1132qK = p9.k();
        if (c(abstractComponentCallbacksC1132qK.mWho)) {
            return;
        }
        this.f12983b.put(abstractComponentCallbacksC1132qK.mWho, p9);
        if (abstractComponentCallbacksC1132qK.mRetainInstanceChangedWhileDetached) {
            if (abstractComponentCallbacksC1132qK.mRetainInstance) {
                this.f12985d.e(abstractComponentCallbacksC1132qK);
            } else {
                this.f12985d.o(abstractComponentCallbacksC1132qK);
            }
            abstractComponentCallbacksC1132qK.mRetainInstanceChangedWhileDetached = false;
        }
        if (J.L0(2)) {
            Log.v("FragmentManager", "Added fragment to active set " + abstractComponentCallbacksC1132qK);
        }
    }

    void s(P p9) {
        AbstractComponentCallbacksC1132q abstractComponentCallbacksC1132qK = p9.k();
        if (abstractComponentCallbacksC1132qK.mRetainInstance) {
            this.f12985d.o(abstractComponentCallbacksC1132qK);
        }
        if (this.f12983b.get(abstractComponentCallbacksC1132qK.mWho) == p9 && ((P) this.f12983b.put(abstractComponentCallbacksC1132qK.mWho, null)) != null && J.L0(2)) {
            Log.v("FragmentManager", "Removed fragment from active set " + abstractComponentCallbacksC1132qK);
        }
    }

    void t() {
        Iterator it = this.f12982a.iterator();
        while (it.hasNext()) {
            P p9 = (P) this.f12983b.get(((AbstractComponentCallbacksC1132q) it.next()).mWho);
            if (p9 != null) {
                p9.m();
            }
        }
        for (P p10 : this.f12983b.values()) {
            if (p10 != null) {
                p10.m();
                AbstractComponentCallbacksC1132q abstractComponentCallbacksC1132qK = p10.k();
                if (abstractComponentCallbacksC1132qK.mRemoving && !abstractComponentCallbacksC1132qK.isInBackStack()) {
                    if (abstractComponentCallbacksC1132qK.mBeingSaved && !this.f12984c.containsKey(abstractComponentCallbacksC1132qK.mWho)) {
                        B(abstractComponentCallbacksC1132qK.mWho, p10.r());
                    }
                    s(p10);
                }
            }
        }
    }

    void u(AbstractComponentCallbacksC1132q abstractComponentCallbacksC1132q) {
        synchronized (this.f12982a) {
            this.f12982a.remove(abstractComponentCallbacksC1132q);
        }
        abstractComponentCallbacksC1132q.mAdded = false;
    }

    void v() {
        this.f12983b.clear();
    }

    void w(List list) {
        this.f12982a.clear();
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                AbstractComponentCallbacksC1132q abstractComponentCallbacksC1132qF = f(str);
                if (abstractComponentCallbacksC1132qF == null) {
                    throw new IllegalStateException("No instantiated fragment for (" + str + ")");
                }
                if (J.L0(2)) {
                    Log.v("FragmentManager", "restoreSaveState: added (" + str + "): " + abstractComponentCallbacksC1132qF);
                }
                a(abstractComponentCallbacksC1132qF);
            }
        }
    }

    void x(HashMap map) {
        this.f12984c.clear();
        this.f12984c.putAll(map);
    }

    ArrayList y() {
        ArrayList arrayList = new ArrayList(this.f12983b.size());
        for (P p9 : this.f12983b.values()) {
            if (p9 != null) {
                AbstractComponentCallbacksC1132q abstractComponentCallbacksC1132qK = p9.k();
                B(abstractComponentCallbacksC1132qK.mWho, p9.r());
                arrayList.add(abstractComponentCallbacksC1132qK.mWho);
                if (J.L0(2)) {
                    Log.v("FragmentManager", "Saved state of " + abstractComponentCallbacksC1132qK + ": " + abstractComponentCallbacksC1132qK.mSavedFragmentState);
                }
            }
        }
        return arrayList;
    }

    ArrayList z() {
        synchronized (this.f12982a) {
            try {
                if (this.f12982a.isEmpty()) {
                    return null;
                }
                ArrayList arrayList = new ArrayList(this.f12982a.size());
                for (AbstractComponentCallbacksC1132q abstractComponentCallbacksC1132q : this.f12982a) {
                    arrayList.add(abstractComponentCallbacksC1132q.mWho);
                    if (J.L0(2)) {
                        Log.v("FragmentManager", "saveAllState: adding fragment (" + abstractComponentCallbacksC1132q.mWho + "): " + abstractComponentCallbacksC1132q);
                    }
                }
                return arrayList;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
