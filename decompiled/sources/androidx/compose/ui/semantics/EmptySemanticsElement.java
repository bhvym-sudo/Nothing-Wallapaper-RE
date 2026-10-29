package androidx.compose.ui.semantics;

import W.M;
import p011b0.b;

/* JADX INFO: loaded from: classes.dex */
public final class EmptySemanticsElement extends M {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final b f12019b;

    public EmptySemanticsElement(b bVar) {
        this.f12019b = bVar;
    }

    public boolean equals(Object obj) {
        return obj == this;
    }

    @Override // W.M
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public b d() {
        return this.f12019b;
    }

    @Override // W.M
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public void e(b bVar) {
    }

    public int hashCode() {
        return System.identityHashCode(this);
    }
}
