package androidx.appcompat.view;

import android.view.View;
import android.view.animation.Interpolator;
import androidx.core.view.O;
import androidx.core.view.P;
import androidx.core.view.Q;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public class h {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Interpolator f10363c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    P f10364d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f10365e;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f10362b = -1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Q f10366f = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final ArrayList f10361a = new ArrayList();

    class a extends Q {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private boolean f10367a = false;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f10368b = 0;

        a() {
        }

        @Override // androidx.core.view.P
        public void b(View view) {
            int i10 = this.f10368b + 1;
            this.f10368b = i10;
            if (i10 == h.this.f10361a.size()) {
                P p9 = h.this.f10364d;
                if (p9 != null) {
                    p9.b(null);
                }
                d();
            }
        }

        @Override // androidx.core.view.Q, androidx.core.view.P
        public void c(View view) {
            if (this.f10367a) {
                return;
            }
            this.f10367a = true;
            P p9 = h.this.f10364d;
            if (p9 != null) {
                p9.c(null);
            }
        }

        void d() {
            this.f10368b = 0;
            this.f10367a = false;
            h.this.b();
        }
    }

    public void a() {
        if (this.f10365e) {
            Iterator it = this.f10361a.iterator();
            while (it.hasNext()) {
                ((O) it.next()).c();
            }
            this.f10365e = false;
        }
    }

    void b() {
        this.f10365e = false;
    }

    public h c(O o9) {
        if (!this.f10365e) {
            this.f10361a.add(o9);
        }
        return this;
    }

    public h d(O o9, O o10) {
        this.f10361a.add(o9);
        o10.i(o9.d());
        this.f10361a.add(o10);
        return this;
    }

    public h e(long j9) {
        if (!this.f10365e) {
            this.f10362b = j9;
        }
        return this;
    }

    public h f(Interpolator interpolator) {
        if (!this.f10365e) {
            this.f10363c = interpolator;
        }
        return this;
    }

    public h g(P p9) {
        if (!this.f10365e) {
            this.f10364d = p9;
        }
        return this;
    }

    public void h() {
        if (this.f10365e) {
            return;
        }
        for (O o9 : this.f10361a) {
            long j9 = this.f10362b;
            if (j9 >= 0) {
                o9.e(j9);
            }
            Interpolator interpolator = this.f10363c;
            if (interpolator != null) {
                o9.f(interpolator);
            }
            if (this.f10364d != null) {
                o9.g(this.f10366f);
            }
            o9.k();
        }
        this.f10365e = true;
    }
}
