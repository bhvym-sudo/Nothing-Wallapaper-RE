package S5;

import android.content.Context;
import kotlin.jvm.internal.AbstractC1457h;
import kotlin.jvm.internal.n;

/* JADX INFO: loaded from: classes2.dex */
public final class c implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f7358a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f7359b;

    public c(boolean z9, String key) {
        n.h(key, "key");
        this.f7358a = z9;
        this.f7359b = key;
    }

    @Override // S5.d
    public String a(Context context) {
        return d.a.a(this, context);
    }

    public final boolean b() {
        return this.f7358a;
    }

    public final String c() {
        return this.f7359b;
    }

    public final void d(boolean z9) {
        this.f7358a = z9;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f7358a == cVar.f7358a && n.d(this.f7359b, cVar.f7359b);
    }

    public int hashCode() {
        return (Boolean.hashCode(this.f7358a) * 31) + this.f7359b.hashCode();
    }

    public String toString() {
        return "HeadGroupMetaInfo(expand=" + this.f7358a + ", key=" + this.f7359b + ")";
    }

    public /* synthetic */ c(boolean z9, String str, int i10, AbstractC1457h abstractC1457h) {
        this(z9, (i10 & 2) != 0 ? "head" : str);
    }
}
