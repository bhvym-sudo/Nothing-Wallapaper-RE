package W7;

import kotlin.jvm.internal.AbstractC1457h;
import kotlin.jvm.internal.n;

/* JADX INFO: loaded from: classes2.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f8888a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final p219v8.a f8889b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final b f8890c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f8891d;

    public a(String label, p219v8.a onClick, b style, boolean z9) {
        n.h(label, "label");
        n.h(onClick, "onClick");
        n.h(style, "style");
        this.f8888a = label;
        this.f8889b = onClick;
        this.f8890c = style;
        this.f8891d = z9;
    }

    public final boolean a() {
        return this.f8891d;
    }

    public final String b() {
        return this.f8888a;
    }

    public final p219v8.a c() {
        return this.f8889b;
    }

    public final b d() {
        return this.f8890c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return n.d(this.f8888a, aVar.f8888a) && n.d(this.f8889b, aVar.f8889b) && this.f8890c == aVar.f8890c && this.f8891d == aVar.f8891d;
    }

    public int hashCode() {
        return (((((this.f8888a.hashCode() * 31) + this.f8889b.hashCode()) * 31) + this.f8890c.hashCode()) * 31) + Boolean.hashCode(this.f8891d);
    }

    public String toString() {
        return "NtDialogButtonInfo(label=" + this.f8888a + ", onClick=" + this.f8889b + ", style=" + this.f8890c + ", enabled=" + this.f8891d + ")";
    }

    public /* synthetic */ a(String str, p219v8.a aVar, b bVar, boolean z9, int i10, AbstractC1457h abstractC1457h) {
        this(str, aVar, (i10 & 4) != 0 ? b.Normal : bVar, (i10 & 8) != 0 ? true : z9);
    }
}
