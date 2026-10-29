package p124m3;

import java.util.List;
import kotlin.jvm.internal.AbstractC1457h;
import kotlin.jvm.internal.n;
import p089i8.AbstractC1444s;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p144o3.a f23218a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final p164q3.a f23219b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final p164q3.a f23220c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final p164q3.a f23221d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final List f23222e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final p219v8.a f23223f;

    public a(p144o3.a aVar, p164q3.a aVar2, p164q3.a aVar3, p164q3.a aVar4, List buttons, p219v8.a aVar5) {
        n.h(buttons, "buttons");
        this.f23218a = aVar;
        this.f23219b = aVar2;
        this.f23220c = aVar3;
        this.f23221d = aVar4;
        this.f23222e = buttons;
        this.f23223f = aVar5;
    }

    public final List a() {
        return this.f23222e;
    }

    public final p164q3.a b() {
        return this.f23219b;
    }

    public final p144o3.a c() {
        return this.f23218a;
    }

    public final p164q3.a d() {
        return this.f23221d;
    }

    public final p219v8.a e() {
        return this.f23223f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return n.d(this.f23218a, aVar.f23218a) && n.d(this.f23219b, aVar.f23219b) && n.d(this.f23220c, aVar.f23220c) && n.d(this.f23221d, aVar.f23221d) && n.d(this.f23222e, aVar.f23222e) && n.d(this.f23223f, aVar.f23223f);
    }

    public final p164q3.a f() {
        return this.f23220c;
    }

    public int hashCode() {
        p144o3.a aVar = this.f23218a;
        int iHashCode = (aVar == null ? 0 : aVar.hashCode()) * 31;
        p164q3.a aVar2 = this.f23219b;
        int iHashCode2 = (iHashCode + (aVar2 == null ? 0 : aVar2.hashCode())) * 31;
        p164q3.a aVar3 = this.f23220c;
        int iHashCode3 = (iHashCode2 + (aVar3 == null ? 0 : aVar3.hashCode())) * 31;
        p164q3.a aVar4 = this.f23221d;
        int iHashCode4 = (((iHashCode3 + (aVar4 == null ? 0 : aVar4.hashCode())) * 31) + this.f23222e.hashCode()) * 31;
        p219v8.a aVar5 = this.f23223f;
        return iHashCode4 + (aVar5 != null ? aVar5.hashCode() : 0);
    }

    public String toString() {
        return "DialogViewModel(icon=" + this.f23218a + ", headline=" + this.f23219b + ", supportingText=" + this.f23220c + ", message=" + this.f23221d + ", buttons=" + this.f23222e + ", onDismissed=" + this.f23223f + ")";
    }

    public /* synthetic */ a(p144o3.a aVar, p164q3.a aVar2, p164q3.a aVar3, p164q3.a aVar4, List list, p219v8.a aVar5, int i10, AbstractC1457h abstractC1457h) {
        this((i10 & 1) != 0 ? null : aVar, (i10 & 2) != 0 ? null : aVar2, (i10 & 4) != 0 ? null : aVar3, (i10 & 8) != 0 ? null : aVar4, (i10 & 16) != 0 ? AbstractC1444s.l() : list, (i10 & 32) != 0 ? null : aVar5);
    }
}
