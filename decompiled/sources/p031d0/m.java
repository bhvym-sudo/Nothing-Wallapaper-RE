package p031d0;

import kotlin.jvm.internal.n;

/* JADX INFO: loaded from: classes.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final k f19412a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final k f19413b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final k f19414c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final k f19415d;

    public m(k kVar, k kVar2, k kVar3, k kVar4) {
        this.f19412a = kVar;
        this.f19413b = kVar2;
        this.f19414c = kVar3;
        this.f19415d = kVar4;
    }

    public final k a() {
        return this.f19413b;
    }

    public final k b() {
        return this.f19414c;
    }

    public final k c() {
        return this.f19415d;
    }

    public final k d() {
        return this.f19412a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return n.d(this.f19412a, mVar.f19412a) && n.d(this.f19413b, mVar.f19413b) && n.d(this.f19414c, mVar.f19414c) && n.d(this.f19415d, mVar.f19415d);
    }

    public int hashCode() {
        k kVar = this.f19412a;
        int iHashCode = (kVar != null ? kVar.hashCode() : 0) * 31;
        k kVar2 = this.f19413b;
        int iHashCode2 = (iHashCode + (kVar2 != null ? kVar2.hashCode() : 0)) * 31;
        k kVar3 = this.f19414c;
        int iHashCode3 = (iHashCode2 + (kVar3 != null ? kVar3.hashCode() : 0)) * 31;
        k kVar4 = this.f19415d;
        return iHashCode3 + (kVar4 != null ? kVar4.hashCode() : 0);
    }
}
