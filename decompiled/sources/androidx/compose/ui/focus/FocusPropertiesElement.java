package androidx.compose.ui.focus;

import W.M;

/* JADX INFO: loaded from: classes.dex */
final class FocusPropertiesElement extends M {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final G.j f11396b;

    public FocusPropertiesElement(G.j jVar) {
        this.f11396b = jVar;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof FocusPropertiesElement) && kotlin.jvm.internal.n.d(this.f11396b, ((FocusPropertiesElement) obj).f11396b);
    }

    @Override // W.M
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public i d() {
        return new i(this.f11396b);
    }

    @Override // W.M
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public void e(i iVar) {
        iVar.h0(this.f11396b);
    }

    public int hashCode() {
        return this.f11396b.hashCode();
    }

    public String toString() {
        return "FocusPropertiesElement(scope=" + this.f11396b + ')';
    }
}
