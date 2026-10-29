package p210v;

import java.util.Map;
import p230x.a;

/* JADX INFO: loaded from: classes.dex */
public final class y extends u {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final i f28083t;

    public y(i iVar) {
        this.f28083t = iVar;
    }

    @Override // java.util.Iterator
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public Map.Entry next() {
        a.a(g());
        n(f() + 2);
        return new c(this.f28083t, d()[f() - 2], d()[f() - 1]);
    }
}
