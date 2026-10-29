package androidx.compose.ui.input.key;

import W.M;
import kotlin.jvm.internal.n;
import p219v8.l;

/* JADX INFO: loaded from: classes.dex */
final class KeyInputElement extends M {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final l f11472b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final l f11473c;

    public KeyInputElement(l lVar, l lVar2) {
        this.f11472b = lVar;
        this.f11473c = lVar2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof KeyInputElement)) {
            return false;
        }
        KeyInputElement keyInputElement = (KeyInputElement) obj;
        return n.d(this.f11472b, keyInputElement.f11472b) && n.d(this.f11473c, keyInputElement.f11473c);
    }

    @Override // W.M
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public b d() {
        return new b(this.f11472b, this.f11473c);
    }

    @Override // W.M
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public void e(b bVar) {
        bVar.h0(this.f11472b);
        bVar.i0(this.f11473c);
    }

    public int hashCode() {
        l lVar = this.f11472b;
        int iHashCode = (lVar == null ? 0 : lVar.hashCode()) * 31;
        l lVar2 = this.f11473c;
        return iHashCode + (lVar2 != null ? lVar2.hashCode() : 0);
    }

    public String toString() {
        return "KeyInputElement(onKeyEvent=" + this.f11472b + ", onPreKeyEvent=" + this.f11473c + ')';
    }
}
