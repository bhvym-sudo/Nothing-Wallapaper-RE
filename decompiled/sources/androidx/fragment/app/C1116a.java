package androidx.fragment.app;

import android.util.Log;
import androidx.constraintlayout.core.widgets.Optimizer;
import androidx.lifecycle.AbstractC1157q;
import java.io.PrintWriter;
import java.util.ArrayList;

/* JADX INFO: renamed from: androidx.fragment.app.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
final class C1116a extends S implements J.m {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    final J f13050t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    boolean f13051u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    int f13052v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    boolean f13053w;

    C1116a(J j9) {
        super(j9.w0(), j9.y0() != null ? j9.y0().h().getClassLoader() : null);
        this.f13052v = -1;
        this.f13053w = false;
        this.f13050t = j9;
    }

    public void A(String str, PrintWriter printWriter, boolean z9) {
        String str2;
        if (z9) {
            printWriter.print(str);
            printWriter.print("mName=");
            printWriter.print(this.f12996k);
            printWriter.print(" mIndex=");
            printWriter.print(this.f13052v);
            printWriter.print(" mCommitted=");
            printWriter.println(this.f13051u);
            if (this.f12993h != 0) {
                printWriter.print(str);
                printWriter.print("mTransition=#");
                printWriter.print(Integer.toHexString(this.f12993h));
            }
            if (this.f12989d != 0 || this.f12990e != 0) {
                printWriter.print(str);
                printWriter.print("mEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f12989d));
                printWriter.print(" mExitAnim=#");
                printWriter.println(Integer.toHexString(this.f12990e));
            }
            if (this.f12991f != 0 || this.f12992g != 0) {
                printWriter.print(str);
                printWriter.print("mPopEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f12991f));
                printWriter.print(" mPopExitAnim=#");
                printWriter.println(Integer.toHexString(this.f12992g));
            }
            if (this.f12997l != 0 || this.f12998m != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbTitleRes=#");
                printWriter.print(Integer.toHexString(this.f12997l));
                printWriter.print(" mBreadCrumbTitleText=");
                printWriter.println(this.f12998m);
            }
            if (this.f12999n != 0 || this.f13000o != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbShortTitleRes=#");
                printWriter.print(Integer.toHexString(this.f12999n));
                printWriter.print(" mBreadCrumbShortTitleText=");
                printWriter.println(this.f13000o);
            }
        }
        if (this.f12988c.isEmpty()) {
            return;
        }
        printWriter.print(str);
        printWriter.println("Operations:");
        int size = this.f12988c.size();
        for (int i10 = 0; i10 < size; i10++) {
            S.a aVar = (S.a) this.f12988c.get(i10);
            switch (aVar.f13005a) {
                case 0:
                    str2 = "NULL";
                    break;
                case 1:
                    str2 = "ADD";
                    break;
                case 2:
                    str2 = "REPLACE";
                    break;
                case 3:
                    str2 = "REMOVE";
                    break;
                case 4:
                    str2 = "HIDE";
                    break;
                case 5:
                    str2 = "SHOW";
                    break;
                case 6:
                    str2 = "DETACH";
                    break;
                case 7:
                    str2 = "ATTACH";
                    break;
                case 8:
                    str2 = "SET_PRIMARY_NAV";
                    break;
                case 9:
                    str2 = "UNSET_PRIMARY_NAV";
                    break;
                case 10:
                    str2 = "OP_SET_MAX_LIFECYCLE";
                    break;
                default:
                    str2 = "cmd=" + aVar.f13005a;
                    break;
            }
            printWriter.print(str);
            printWriter.print("  Op #");
            printWriter.print(i10);
            printWriter.print(": ");
            printWriter.print(str2);
            printWriter.print(" ");
            printWriter.println(aVar.f13006b);
            if (z9) {
                if (aVar.f13008d != 0 || aVar.f13009e != 0) {
                    printWriter.print(str);
                    printWriter.print("enterAnim=#");
                    printWriter.print(Integer.toHexString(aVar.f13008d));
                    printWriter.print(" exitAnim=#");
                    printWriter.println(Integer.toHexString(aVar.f13009e));
                }
                if (aVar.f13010f != 0 || aVar.f13011g != 0) {
                    printWriter.print(str);
                    printWriter.print("popEnterAnim=#");
                    printWriter.print(Integer.toHexString(aVar.f13010f));
                    printWriter.print(" popExitAnim=#");
                    printWriter.println(Integer.toHexString(aVar.f13011g));
                }
            }
        }
    }

    void B() {
        int size = this.f12988c.size();
        for (int i10 = 0; i10 < size; i10++) {
            S.a aVar = (S.a) this.f12988c.get(i10);
            AbstractComponentCallbacksC1132q abstractComponentCallbacksC1132q = aVar.f13006b;
            if (abstractComponentCallbacksC1132q != null) {
                abstractComponentCallbacksC1132q.mBeingSaved = this.f13053w;
                abstractComponentCallbacksC1132q.setPopDirection(false);
                abstractComponentCallbacksC1132q.setNextTransition(this.f12993h);
                abstractComponentCallbacksC1132q.setSharedElementNames(this.f13001p, this.f13002q);
            }
            switch (aVar.f13005a) {
                case 1:
                    abstractComponentCallbacksC1132q.setAnimations(aVar.f13008d, aVar.f13009e, aVar.f13010f, aVar.f13011g);
                    this.f13050t.t1(abstractComponentCallbacksC1132q, false);
                    this.f13050t.j(abstractComponentCallbacksC1132q);
                    break;
                case 2:
                default:
                    throw new IllegalArgumentException("Unknown cmd: " + aVar.f13005a);
                case 3:
                    abstractComponentCallbacksC1132q.setAnimations(aVar.f13008d, aVar.f13009e, aVar.f13010f, aVar.f13011g);
                    this.f13050t.k1(abstractComponentCallbacksC1132q);
                    break;
                case 4:
                    abstractComponentCallbacksC1132q.setAnimations(aVar.f13008d, aVar.f13009e, aVar.f13010f, aVar.f13011g);
                    this.f13050t.I0(abstractComponentCallbacksC1132q);
                    break;
                case 5:
                    abstractComponentCallbacksC1132q.setAnimations(aVar.f13008d, aVar.f13009e, aVar.f13010f, aVar.f13011g);
                    this.f13050t.t1(abstractComponentCallbacksC1132q, false);
                    this.f13050t.x1(abstractComponentCallbacksC1132q);
                    break;
                case 6:
                    abstractComponentCallbacksC1132q.setAnimations(aVar.f13008d, aVar.f13009e, aVar.f13010f, aVar.f13011g);
                    this.f13050t.y(abstractComponentCallbacksC1132q);
                    break;
                case 7:
                    abstractComponentCallbacksC1132q.setAnimations(aVar.f13008d, aVar.f13009e, aVar.f13010f, aVar.f13011g);
                    this.f13050t.t1(abstractComponentCallbacksC1132q, false);
                    this.f13050t.o(abstractComponentCallbacksC1132q);
                    break;
                case 8:
                    this.f13050t.v1(abstractComponentCallbacksC1132q);
                    break;
                case 9:
                    this.f13050t.v1(null);
                    break;
                case 10:
                    this.f13050t.u1(abstractComponentCallbacksC1132q, aVar.f13013i);
                    break;
            }
        }
    }

    void C() {
        for (int size = this.f12988c.size() - 1; size >= 0; size--) {
            S.a aVar = (S.a) this.f12988c.get(size);
            AbstractComponentCallbacksC1132q abstractComponentCallbacksC1132q = aVar.f13006b;
            if (abstractComponentCallbacksC1132q != null) {
                abstractComponentCallbacksC1132q.mBeingSaved = this.f13053w;
                abstractComponentCallbacksC1132q.setPopDirection(true);
                abstractComponentCallbacksC1132q.setNextTransition(J.p1(this.f12993h));
                abstractComponentCallbacksC1132q.setSharedElementNames(this.f13002q, this.f13001p);
            }
            switch (aVar.f13005a) {
                case 1:
                    abstractComponentCallbacksC1132q.setAnimations(aVar.f13008d, aVar.f13009e, aVar.f13010f, aVar.f13011g);
                    this.f13050t.t1(abstractComponentCallbacksC1132q, true);
                    this.f13050t.k1(abstractComponentCallbacksC1132q);
                    break;
                case 2:
                default:
                    throw new IllegalArgumentException("Unknown cmd: " + aVar.f13005a);
                case 3:
                    abstractComponentCallbacksC1132q.setAnimations(aVar.f13008d, aVar.f13009e, aVar.f13010f, aVar.f13011g);
                    this.f13050t.j(abstractComponentCallbacksC1132q);
                    break;
                case 4:
                    abstractComponentCallbacksC1132q.setAnimations(aVar.f13008d, aVar.f13009e, aVar.f13010f, aVar.f13011g);
                    this.f13050t.x1(abstractComponentCallbacksC1132q);
                    break;
                case 5:
                    abstractComponentCallbacksC1132q.setAnimations(aVar.f13008d, aVar.f13009e, aVar.f13010f, aVar.f13011g);
                    this.f13050t.t1(abstractComponentCallbacksC1132q, true);
                    this.f13050t.I0(abstractComponentCallbacksC1132q);
                    break;
                case 6:
                    abstractComponentCallbacksC1132q.setAnimations(aVar.f13008d, aVar.f13009e, aVar.f13010f, aVar.f13011g);
                    this.f13050t.o(abstractComponentCallbacksC1132q);
                    break;
                case 7:
                    abstractComponentCallbacksC1132q.setAnimations(aVar.f13008d, aVar.f13009e, aVar.f13010f, aVar.f13011g);
                    this.f13050t.t1(abstractComponentCallbacksC1132q, true);
                    this.f13050t.y(abstractComponentCallbacksC1132q);
                    break;
                case 8:
                    this.f13050t.v1(null);
                    break;
                case 9:
                    this.f13050t.v1(abstractComponentCallbacksC1132q);
                    break;
                case 10:
                    this.f13050t.u1(abstractComponentCallbacksC1132q, aVar.f13012h);
                    break;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:34:0x00b6  */
    AbstractComponentCallbacksC1132q D(ArrayList arrayList, AbstractComponentCallbacksC1132q abstractComponentCallbacksC1132q) {
        AbstractComponentCallbacksC1132q abstractComponentCallbacksC1132q2 = abstractComponentCallbacksC1132q;
        int i10 = 0;
        while (i10 < this.f12988c.size()) {
            S.a aVar = (S.a) this.f12988c.get(i10);
            int i11 = aVar.f13005a;
            if (i11 == 1) {
                arrayList.add(aVar.f13006b);
            } else if (i11 == 2) {
                AbstractComponentCallbacksC1132q abstractComponentCallbacksC1132q3 = aVar.f13006b;
                int i12 = abstractComponentCallbacksC1132q3.mContainerId;
                boolean z9 = false;
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    AbstractComponentCallbacksC1132q abstractComponentCallbacksC1132q4 = (AbstractComponentCallbacksC1132q) arrayList.get(size);
                    if (abstractComponentCallbacksC1132q4.mContainerId == i12) {
                        if (abstractComponentCallbacksC1132q4 == abstractComponentCallbacksC1132q3) {
                            z9 = true;
                        } else {
                            if (abstractComponentCallbacksC1132q4 == abstractComponentCallbacksC1132q2) {
                                this.f12988c.add(i10, new S.a(9, abstractComponentCallbacksC1132q4, true));
                                i10++;
                                abstractComponentCallbacksC1132q2 = null;
                            }
                            S.a aVar2 = new S.a(3, abstractComponentCallbacksC1132q4, true);
                            aVar2.f13008d = aVar.f13008d;
                            aVar2.f13010f = aVar.f13010f;
                            aVar2.f13009e = aVar.f13009e;
                            aVar2.f13011g = aVar.f13011g;
                            this.f12988c.add(i10, aVar2);
                            arrayList.remove(abstractComponentCallbacksC1132q4);
                            i10++;
                        }
                    }
                }
                if (z9) {
                    this.f12988c.remove(i10);
                    i10--;
                } else {
                    aVar.f13005a = 1;
                    aVar.f13007c = true;
                    arrayList.add(abstractComponentCallbacksC1132q3);
                }
            } else if (i11 == 3 || i11 == 6) {
                arrayList.remove(aVar.f13006b);
                AbstractComponentCallbacksC1132q abstractComponentCallbacksC1132q5 = aVar.f13006b;
                if (abstractComponentCallbacksC1132q5 == abstractComponentCallbacksC1132q2) {
                    this.f12988c.add(i10, new S.a(9, abstractComponentCallbacksC1132q5));
                    i10++;
                    abstractComponentCallbacksC1132q2 = null;
                }
            } else if (i11 == 7) {
                arrayList.add(aVar.f13006b);
            } else if (i11 == 8) {
                this.f12988c.add(i10, new S.a(9, abstractComponentCallbacksC1132q2, true));
                aVar.f13007c = true;
                i10++;
                abstractComponentCallbacksC1132q2 = aVar.f13006b;
            }
            i10++;
        }
        return abstractComponentCallbacksC1132q2;
    }

    public String E() {
        return this.f12996k;
    }

    public void F() {
        if (this.f13004s != null) {
            for (int i10 = 0; i10 < this.f13004s.size(); i10++) {
                ((Runnable) this.f13004s.get(i10)).run();
            }
            this.f13004s = null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0027  */
    /* JADX WARN: Code duplicated, block: B:14:0x002d  */
    AbstractComponentCallbacksC1132q G(ArrayList arrayList, AbstractComponentCallbacksC1132q abstractComponentCallbacksC1132q) {
        for (int size = this.f12988c.size() - 1; size >= 0; size--) {
            S.a aVar = (S.a) this.f12988c.get(size);
            int i10 = aVar.f13005a;
            if (i10 == 1) {
                arrayList.remove(aVar.f13006b);
            } else if (i10 != 3) {
                switch (i10) {
                    case 6:
                        arrayList.add(aVar.f13006b);
                        break;
                    case 7:
                        arrayList.remove(aVar.f13006b);
                        break;
                    case 8:
                        abstractComponentCallbacksC1132q = null;
                        break;
                    case 9:
                        abstractComponentCallbacksC1132q = aVar.f13006b;
                        break;
                    case 10:
                        aVar.f13013i = aVar.f13012h;
                        break;
                }
            } else {
                arrayList.add(aVar.f13006b);
            }
        }
        return abstractComponentCallbacksC1132q;
    }

    @Override // androidx.fragment.app.J.m
    public boolean a(ArrayList arrayList, ArrayList arrayList2) {
        if (J.L0(2)) {
            Log.v("FragmentManager", "Run: " + this);
        }
        arrayList.add(this);
        arrayList2.add(Boolean.FALSE);
        if (!this.f12994i) {
            return true;
        }
        this.f13050t.i(this);
        return true;
    }

    @Override // androidx.fragment.app.S
    public int i() {
        return y(false, true);
    }

    @Override // androidx.fragment.app.S
    public int j() {
        return y(true, true);
    }

    @Override // androidx.fragment.app.S
    public void k() {
        n();
        this.f13050t.d0(this, false);
    }

    @Override // androidx.fragment.app.S
    public void l() {
        n();
        this.f13050t.d0(this, true);
    }

    @Override // androidx.fragment.app.S
    public S m(AbstractComponentCallbacksC1132q abstractComponentCallbacksC1132q) {
        J j9 = abstractComponentCallbacksC1132q.mFragmentManager;
        if (j9 == null || j9 == this.f13050t) {
            return super.m(abstractComponentCallbacksC1132q);
        }
        throw new IllegalStateException("Cannot detach Fragment attached to a different FragmentManager. Fragment " + abstractComponentCallbacksC1132q.toString() + " is already attached to a FragmentManager.");
    }

    @Override // androidx.fragment.app.S
    void o(int i10, AbstractComponentCallbacksC1132q abstractComponentCallbacksC1132q, String str, int i11) {
        super.o(i10, abstractComponentCallbacksC1132q, str, i11);
        abstractComponentCallbacksC1132q.mFragmentManager = this.f13050t;
    }

    @Override // androidx.fragment.app.S
    public boolean p() {
        return this.f12988c.isEmpty();
    }

    @Override // androidx.fragment.app.S
    public S q(AbstractComponentCallbacksC1132q abstractComponentCallbacksC1132q) {
        J j9 = abstractComponentCallbacksC1132q.mFragmentManager;
        if (j9 == null || j9 == this.f13050t) {
            return super.q(abstractComponentCallbacksC1132q);
        }
        throw new IllegalStateException("Cannot remove Fragment attached to a different FragmentManager. Fragment " + abstractComponentCallbacksC1132q.toString() + " is already attached to a FragmentManager.");
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(Optimizer.OPTIMIZATION_GRAPH_WRAP);
        sb.append("BackStackEntry{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        if (this.f13052v >= 0) {
            sb.append(" #");
            sb.append(this.f13052v);
        }
        if (this.f12996k != null) {
            sb.append(" ");
            sb.append(this.f12996k);
        }
        sb.append("}");
        return sb.toString();
    }

    @Override // androidx.fragment.app.S
    public S v(AbstractComponentCallbacksC1132q abstractComponentCallbacksC1132q, AbstractC1157q.b bVar) {
        if (abstractComponentCallbacksC1132q.mFragmentManager != this.f13050t) {
            throw new IllegalArgumentException("Cannot setMaxLifecycle for Fragment not attached to FragmentManager " + this.f13050t);
        }
        if (bVar == AbstractC1157q.b.INITIALIZED && abstractComponentCallbacksC1132q.mState > -1) {
            throw new IllegalArgumentException("Cannot set maximum Lifecycle to " + bVar + " after the Fragment has been created");
        }
        if (bVar != AbstractC1157q.b.DESTROYED) {
            return super.v(abstractComponentCallbacksC1132q, bVar);
        }
        throw new IllegalArgumentException("Cannot set maximum Lifecycle to " + bVar + ". Use remove() to remove the fragment from the FragmentManager and trigger its destruction.");
    }

    void x(int i10) {
        if (this.f12994i) {
            if (J.L0(2)) {
                Log.v("FragmentManager", "Bump nesting in " + this + " by " + i10);
            }
            int size = this.f12988c.size();
            for (int i11 = 0; i11 < size; i11++) {
                S.a aVar = (S.a) this.f12988c.get(i11);
                AbstractComponentCallbacksC1132q abstractComponentCallbacksC1132q = aVar.f13006b;
                if (abstractComponentCallbacksC1132q != null) {
                    abstractComponentCallbacksC1132q.mBackStackNesting += i10;
                    if (J.L0(2)) {
                        Log.v("FragmentManager", "Bump nesting of " + aVar.f13006b + " to " + aVar.f13006b.mBackStackNesting);
                    }
                }
            }
        }
    }

    int y(boolean z9, boolean z10) {
        if (this.f13051u) {
            throw new IllegalStateException("commit already called");
        }
        if (J.L0(2)) {
            Log.v("FragmentManager", "Commit: " + this);
            PrintWriter printWriter = new PrintWriter(new Y("FragmentManager"));
            z("  ", printWriter);
            printWriter.close();
        }
        this.f13051u = true;
        if (this.f12994i) {
            this.f13052v = this.f13050t.m();
        } else {
            this.f13052v = -1;
        }
        if (z10) {
            this.f13050t.a0(this, z9);
        }
        return this.f13052v;
    }

    public void z(String str, PrintWriter printWriter) {
        A(str, printWriter, true);
    }
}
