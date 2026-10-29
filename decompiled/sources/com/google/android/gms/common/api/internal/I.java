package com.google.android.gms.common.api.internal;

import android.app.PendingIntent;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.atomic.AtomicReference;
import p015b4.InterfaceC1186f;

/* JADX INFO: loaded from: classes.dex */
public abstract class I extends LifecycleCallback implements DialogInterface.OnCancelListener {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    protected volatile boolean f16220r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    protected final AtomicReference f16221s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final Handler f16222t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    protected final Z3.d f16223u;

    I(InterfaceC1186f interfaceC1186f, Z3.d dVar) {
        super(interfaceC1186f);
        this.f16221s = new AtomicReference(null);
        this.f16222t = new p135n4.h(Looper.getMainLooper());
        this.f16223u = dVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void l(Z3.a aVar, int i10) {
        this.f16221s.set(null);
        m(aVar, i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void o() {
        this.f16221s.set(null);
        n();
    }

    private static final int p(F f10) {
        if (f10 == null) {
            return -1;
        }
        return f10.a();
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    public final void e(int i10, int i11, Intent intent) {
        F f10 = (F) this.f16221s.get();
        if (i10 != 1) {
            if (i10 == 2) {
                int iF = this.f16223u.f(b());
                if (iF == 0) {
                    o();
                    return;
                } else {
                    if (f10 == null) {
                        return;
                    }
                    if (f10.b().a() == 18 && iF == 18) {
                        return;
                    }
                }
            }
        } else if (i11 == -1) {
            o();
            return;
        } else if (i11 == 0) {
            if (f10 == null) {
                return;
            }
            l(new Z3.a(intent != null ? intent.getIntExtra("<<ResolutionFailureErrorDetail>>", 13) : 13, null, f10.b().toString()), p(f10));
            return;
        }
        if (f10 != null) {
            l(f10.b(), f10.a());
        }
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    public final void f(Bundle bundle) {
        super.f(bundle);
        if (bundle != null) {
            this.f16221s.set(bundle.getBoolean("resolving_error", false) ? new F(new Z3.a(bundle.getInt("failed_status"), (PendingIntent) bundle.getParcelable("failed_resolution")), bundle.getInt("failed_client_id", -1)) : null);
        }
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    public final void i(Bundle bundle) {
        super.i(bundle);
        F f10 = (F) this.f16221s.get();
        if (f10 == null) {
            return;
        }
        bundle.putBoolean("resolving_error", true);
        bundle.putInt("failed_client_id", f10.a());
        bundle.putInt("failed_status", f10.b().a());
        bundle.putParcelable("failed_resolution", f10.b().c());
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    public void j() {
        super.j();
        this.f16220r = true;
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    public void k() {
        super.k();
        this.f16220r = false;
    }

    protected abstract void m(Z3.a aVar, int i10);

    protected abstract void n();

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        l(new Z3.a(13, null), p((F) this.f16221s.get()));
    }

    public final void s(Z3.a aVar, int i10) {
        F f10 = new F(aVar, i10);
        AtomicReference atomicReference = this.f16221s;
        while (!atomicReference.compareAndSet(null, f10)) {
            if (atomicReference.get() != null) {
                return;
            }
        }
        this.f16222t.post(new H(this, f10));
    }
}
