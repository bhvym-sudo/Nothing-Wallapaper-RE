package O2;

import kotlin.jvm.internal.AbstractC1457h;

/* JADX INFO: loaded from: classes.dex */
public final class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f5801a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f5802b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f5803c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f5804d;

    public s(String clockId, boolean z9, String str, boolean z10) {
        kotlin.jvm.internal.n.h(clockId, "clockId");
        this.f5801a = clockId;
        this.f5802b = z9;
        this.f5803c = str;
        this.f5804d = z10;
    }

    public final String a() {
        return this.f5801a;
    }

    public final String b() {
        return this.f5803c;
    }

    public final boolean c() {
        return this.f5804d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        return kotlin.jvm.internal.n.d(this.f5801a, sVar.f5801a) && this.f5802b == sVar.f5802b && kotlin.jvm.internal.n.d(this.f5803c, sVar.f5803c) && this.f5804d == sVar.f5804d;
    }

    public int hashCode() {
        int iHashCode = ((this.f5801a.hashCode() * 31) + Boolean.hashCode(this.f5802b)) * 31;
        String str = this.f5803c;
        return ((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + Boolean.hashCode(this.f5804d);
    }

    public String toString() {
        return "ClockMetadata(clockId=" + this.f5801a + ", isDeprecated=" + this.f5802b + ", replacementTarget=" + this.f5803c + ", supportTransition=" + this.f5804d + ")";
    }

    public /* synthetic */ s(String str, boolean z9, String str2, boolean z10, int i10, AbstractC1457h abstractC1457h) {
        this(str, (i10 & 2) != 0 ? false : z9, (i10 & 4) != 0 ? null : str2, (i10 & 8) != 0 ? false : z10);
    }
}
