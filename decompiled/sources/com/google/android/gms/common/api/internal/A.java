package com.google.android.gms.common.api.internal;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;

/* JADX INFO: loaded from: classes.dex */
abstract class A extends p015b4.r {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected final p215v4.l f16207b;

    public A(int i10, p215v4.l lVar) {
        super(i10);
        this.f16207b = lVar;
    }

    @Override // com.google.android.gms.common.api.internal.E
    public final void a(Status status) {
        this.f16207b.d(new p005a4.b(status));
    }

    @Override // com.google.android.gms.common.api.internal.E
    public final void b(Exception exc) {
        this.f16207b.d(exc);
    }

    @Override // com.google.android.gms.common.api.internal.E
    public final void c(q qVar) throws DeadObjectException {
        try {
            h(qVar);
        } catch (DeadObjectException e10) {
            a(E.e(e10));
            throw e10;
        } catch (RemoteException e11) {
            a(E.e(e11));
        } catch (RuntimeException e12) {
            this.f16207b.d(e12);
        }
    }

    protected abstract void h(q qVar);
}
