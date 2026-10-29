package androidx.compose.ui.input.rotary;

import W.M;
import kotlin.jvm.internal.n;
import p219v8.l;

/* JADX INFO: loaded from: classes.dex */
final class RotaryInputElement extends M {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final l f11476b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final l f11477c;

    public RotaryInputElement(l lVar, l lVar2) {
        this.f11476b = lVar;
        this.f11477c = lVar2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RotaryInputElement)) {
            return false;
        }
        RotaryInputElement rotaryInputElement = (RotaryInputElement) obj;
        return n.d(this.f11476b, rotaryInputElement.f11476b) && n.d(this.f11477c, rotaryInputElement.f11477c);
    }

    @Override // W.M
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public b d() {
        return new b(this.f11476b, this.f11477c);
    }

    @Override // W.M
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public void e(b bVar) {
        bVar.h0(this.f11476b);
        bVar.i0(this.f11477c);
    }

    public int hashCode() {
        l lVar = this.f11476b;
        int iHashCode = (lVar == null ? 0 : lVar.hashCode()) * 31;
        l lVar2 = this.f11477c;
        return iHashCode + (lVar2 != null ? lVar2.hashCode() : 0);
    }

    public String toString() {
        return "RotaryInputElement(onRotaryScrollEvent=" + this.f11476b + ", onPreRotaryScrollEvent=" + this.f11477c + ')';
    }
}
