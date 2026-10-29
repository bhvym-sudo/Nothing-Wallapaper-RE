package p104k3;

import kotlin.jvm.internal.AbstractC1457h;
import kotlin.jvm.internal.n;
import p164q3.a;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a f22711a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final a f22712b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final p219v8.a f22713c;

    public b(a text, a style, p219v8.a aVar) {
        n.h(text, "text");
        n.h(style, "style");
        this.f22711a = text;
        this.f22712b = style;
        this.f22713c = aVar;
    }

    public static /* synthetic */ b b(b bVar, a aVar, a aVar2, p219v8.a aVar3, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            aVar = bVar.f22711a;
        }
        if ((i10 & 2) != 0) {
            aVar2 = bVar.f22712b;
        }
        if ((i10 & 4) != 0) {
            aVar3 = bVar.f22713c;
        }
        return bVar.a(aVar, aVar2, aVar3);
    }

    public final b a(a text, a style, p219v8.a aVar) {
        n.h(text, "text");
        n.h(style, "style");
        return new b(text, style, aVar);
    }

    public final p219v8.a c() {
        return this.f22713c;
    }

    public final a d() {
        return this.f22712b;
    }

    public final a e() {
        return this.f22711a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return n.d(this.f22711a, bVar.f22711a) && n.d(this.f22712b, bVar.f22712b) && n.d(this.f22713c, bVar.f22713c);
    }

    public int hashCode() {
        int iHashCode = ((this.f22711a.hashCode() * 31) + this.f22712b.hashCode()) * 31;
        p219v8.a aVar = this.f22713c;
        return iHashCode + (aVar == null ? 0 : aVar.hashCode());
    }

    public String toString() {
        return "ButtonViewModel(text=" + this.f22711a + ", style=" + this.f22712b + ", onClicked=" + this.f22713c + ")";
    }

    public /* synthetic */ b(a aVar, a aVar2, p219v8.a aVar3, int i10, AbstractC1457h abstractC1457h) {
        this(aVar, aVar2, (i10 & 4) != 0 ? null : aVar3);
    }
}
