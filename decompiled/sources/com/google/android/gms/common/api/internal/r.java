package com.google.android.gms.common.api.internal;

import p015b4.C1182b;
import p025c4.AbstractC1201o;

/* JADX INFO: loaded from: classes.dex */
final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C1182b f16303a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Z3.c f16304b;

    /* synthetic */ r(C1182b c1182b, Z3.c cVar, p015b4.n nVar) {
        this.f16303a = c1182b;
        this.f16304b = cVar;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof r)) {
            r rVar = (r) obj;
            if (AbstractC1201o.a(this.f16303a, rVar.f16303a) && AbstractC1201o.a(this.f16304b, rVar.f16304b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return AbstractC1201o.b(this.f16303a, this.f16304b);
    }

    public final String toString() {
        return AbstractC1201o.c(this).a("key", this.f16303a).a("feature", this.f16304b).toString();
    }
}
