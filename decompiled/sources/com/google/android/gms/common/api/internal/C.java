package com.google.android.gms.common.api.internal;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;

/* JADX INFO: loaded from: classes.dex */
public final class C extends p015b4.r {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AbstractC1230g f16209b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final p215v4.l f16210c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final p015b4.j f16211d;

    public C(int i10, AbstractC1230g abstractC1230g, p215v4.l lVar, p015b4.j jVar) {
        super(i10);
        this.f16210c = lVar;
        this.f16209b = abstractC1230g;
        this.f16211d = jVar;
        if (i10 == 2 && abstractC1230g.c()) {
            throw new IllegalArgumentException("Best-effort write calls cannot pass methods that should auto-resolve missing features.");
        }
    }

    @Override // com.google.android.gms.common.api.internal.E
    public final void a(Status status) {
        this.f16210c.d(this.f16211d.a(status));
    }

    @Override // com.google.android.gms.common.api.internal.E
    public final void b(Exception exc) {
        this.f16210c.d(exc);
    }

    @Override // com.google.android.gms.common.api.internal.E
    public final void c(q qVar) throws DeadObjectException {
        try {
            this.f16209b.b(qVar.u(), this.f16210c);
        } catch (DeadObjectException e10) {
            throw e10;
        } catch (RemoteException e11) {
            a(E.e(e11));
        } catch (RuntimeException e12) {
            this.f16210c.d(e12);
        }
    }

    @Override // com.google.android.gms.common.api.internal.E
    public final void d(j jVar, boolean z9) {
        jVar.b(this.f16210c, z9);
    }

    @Override // p015b4.r
    public final boolean f(q qVar) {
        return this.f16209b.c();
    }

    @Override // p015b4.r
    public final Z3.c[] g(q qVar) {
        return this.f16209b.e();
    }
}
