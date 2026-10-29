package p210v;

import java.util.Map;
import p230x.a;

/* JADX INFO: loaded from: classes.dex */
public final class v extends u {
    @Override // java.util.Iterator
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public Map.Entry next() {
        a.a(g());
        n(f() + 2);
        return new b(d()[f() - 2], d()[f() - 1]);
    }
}
