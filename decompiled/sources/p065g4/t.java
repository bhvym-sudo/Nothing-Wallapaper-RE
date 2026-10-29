package p065g4;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.AbstractC1227d;
import java.util.concurrent.atomic.AtomicReference;
import p015b4.k;
import p055f4.a;
import p055f4.g;
import p215v4.l;

/* JADX INFO: loaded from: classes.dex */
final class t extends b {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    final /* synthetic */ AtomicReference f21273q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    final /* synthetic */ l f21274r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    final /* synthetic */ a f21275s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    final /* synthetic */ v f21276t;

    t(v vVar, AtomicReference atomicReference, l lVar, a aVar) {
        this.f21276t = vVar;
        this.f21273q = atomicReference;
        this.f21274r = lVar;
        this.f21275s = aVar;
    }

    @Override // p065g4.b, p065g4.h
    public final void v(Status status, g gVar) {
        if (gVar != null) {
            this.f21273q.set(gVar);
        }
        k.a(status, null, this.f21274r);
        if (!status.e() || (gVar != null && gVar.c())) {
            this.f21276t.i(AbstractC1227d.c(this.f21275s, a.class.getSimpleName()), 27306);
        }
    }
}
