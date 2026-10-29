package p226w5;

import android.content.res.Configuration;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.ViewGroup;
import java.util.List;
import kotlin.jvm.internal.n;
import p079h8.h;
import p079h8.i;
import p089i8.AbstractC1444s;

/* JADX INFO: loaded from: classes.dex */
public final class r implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final h f29606a = i.b(new p219v8.a() { // from class: w5.q
        @Override // p219v8.a
        public final Object invoke() {
            return r.n(this.f29605q);
        }
    });

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f29607b;

    public final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final SparseArray f29608a = new SparseArray();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Bundle f29609b = new Bundle();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final SparseArray f29610c = new SparseArray();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f29611d = -1;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private List f29612e = AbstractC1444s.l();

        public a() {
        }

        public final SparseArray a() {
            return this.f29608a;
        }

        public final List b() {
            return this.f29612e;
        }

        public final Bundle c() {
            return this.f29609b;
        }

        public final SparseArray d() {
            return this.f29610c;
        }

        public final int e() {
            return this.f29611d;
        }

        public final void f(List list) {
            n.h(list, "<set-?>");
            this.f29612e = list;
        }

        public final void g(int i10) {
            this.f29611d = i10;
        }
    }

    public final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final h f29614a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final h f29615b;

        public b() {
            this.f29614a = i.b(new p219v8.a() { // from class: w5.s
                @Override // p219v8.a
                public final Object invoke() {
                    return r.b.f(rVar);
                }
            });
            this.f29615b = i.b(new p219v8.a() { // from class: w5.t
                @Override // p219v8.a
                public final Object invoke() {
                    return r.b.g(rVar);
                }
            });
        }

        private final a d() {
            return (a) this.f29614a.getValue();
        }

        private final a e() {
            return (a) this.f29615b.getValue();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final a f(r this$0) {
            n.h(this$0, "this$0");
            return this$0.new a();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final a g(r this$0) {
            n.h(this$0, "this$0");
            return this$0.new a();
        }

        public final a c(int i10) {
            return i10 == 1 ? d() : e();
        }
    }

    public r(int i10) {
        this.f29607b = i10;
    }

    private final a k() {
        return l().c(this.f29607b);
    }

    private final b l() {
        return (b) this.f29606a.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final b n(r this$0) {
        n.h(this$0, "this$0");
        return this$0.new b();
    }

    @Override // p226w5.n
    public void a(int i10) {
        this.f29607b = i10;
    }

    @Override // p226w5.n
    public k b(int i10) {
        return (k) k().a().get(i10);
    }

    @Override // p226w5.n
    public void c(int i10, k animator) {
        n.h(animator, "animator");
        if (k().a().get(i10) == null) {
            k().a().put(i10, animator);
        }
    }

    @Override // p226w5.n
    public int d() {
        return this.f29607b;
    }

    @Override // p226w5.n
    public void e(ViewGroup hostView, m scheduler, int i10) {
        n.h(hostView, "hostView");
        n.h(scheduler, "scheduler");
        if (k().d().get(hostView.hashCode()) == null) {
            k().d().put(hostView.hashCode(), scheduler);
        }
        k().g(i10);
    }

    @Override // p226w5.n
    public void f(Bundle bundle) {
        n.h(bundle, "bundle");
        k().c().putAll(bundle);
    }

    @Override // p226w5.n
    public void g(List action) {
        n.h(action, "action");
        k().f(action);
    }

    public final List i() {
        return k().b();
    }

    public final Bundle j() {
        return k().c();
    }

    public final int m() {
        return k().e();
    }

    public final void o(String action) {
        n.h(action, "action");
        SparseArray sparseArrayD = k().d();
        int size = sparseArrayD.size();
        for (int i10 = 0; i10 < size; i10++) {
            sparseArrayD.keyAt(i10);
            ((m) sparseArrayD.valueAt(i10)).a(action);
        }
    }

    public final void p() {
        SparseArray sparseArrayA = k().a();
        int size = sparseArrayA.size();
        for (int i10 = 0; i10 < size; i10++) {
            sparseArrayA.keyAt(i10);
            ((k) sparseArrayA.valueAt(i10)).cancel();
        }
    }

    public final void q() {
        SparseArray sparseArrayA = k().a();
        int size = sparseArrayA.size();
        for (int i10 = 0; i10 < size; i10++) {
            sparseArrayA.keyAt(i10);
            ((k) sparseArrayA.valueAt(i10)).b();
        }
    }

    public final void r(Configuration newConfig) {
        n.h(newConfig, "newConfig");
        SparseArray sparseArrayD = k().d();
        int size = sparseArrayD.size();
        for (int i10 = 0; i10 < size; i10++) {
            sparseArrayD.keyAt(i10);
            ((m) sparseArrayD.valueAt(i10)).onHostConfigChanged(newConfig);
        }
    }

    public final void s() {
        SparseArray sparseArrayD = k().d();
        int size = sparseArrayD.size();
        for (int i10 = 0; i10 < size; i10++) {
            sparseArrayD.keyAt(i10);
            ((m) sparseArrayD.valueAt(i10)).onHostViewPeriodTimeUp();
        }
    }

    public final void t() {
        SparseArray sparseArrayD = k().d();
        int size = sparseArrayD.size();
        for (int i10 = 0; i10 < size; i10++) {
            sparseArrayD.keyAt(i10);
            ((m) sparseArrayD.valueAt(i10)).c();
        }
    }

    public final void u() {
        SparseArray sparseArrayD = k().d();
        int size = sparseArrayD.size();
        for (int i10 = 0; i10 < size; i10++) {
            sparseArrayD.keyAt(i10);
            ((m) sparseArrayD.valueAt(i10)).b();
        }
    }

    public final void v() {
        SparseArray sparseArrayA = k().a();
        int size = sparseArrayA.size();
        for (int i10 = 0; i10 < size; i10++) {
            sparseArrayA.keyAt(i10);
            ((k) sparseArrayA.valueAt(i10)).pause();
        }
    }

    public final void w() {
        SparseArray sparseArrayA = k().a();
        int size = sparseArrayA.size();
        for (int i10 = 0; i10 < size; i10++) {
            sparseArrayA.keyAt(i10);
            ((k) sparseArrayA.valueAt(i10)).a();
        }
    }

    public final void x() {
        SparseArray sparseArrayA = k().a();
        int size = sparseArrayA.size();
        for (int i10 = 0; i10 < size; i10++) {
            sparseArrayA.keyAt(i10);
            ((k) sparseArrayA.valueAt(i10)).start();
        }
    }

    public final void y() {
        SparseArray sparseArrayA = k().a();
        int size = sparseArrayA.size();
        for (int i10 = 0; i10 < size; i10++) {
            sparseArrayA.keyAt(i10);
            ((k) sparseArrayA.valueAt(i10)).registerAnimListener();
        }
    }

    public final void z() {
        SparseArray sparseArrayA = k().a();
        int size = sparseArrayA.size();
        for (int i10 = 0; i10 < size; i10++) {
            sparseArrayA.keyAt(i10);
            ((k) sparseArrayA.valueAt(i10)).unregisterAnimListener();
        }
    }
}
