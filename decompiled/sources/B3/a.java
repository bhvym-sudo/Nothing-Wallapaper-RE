package B3;

import I8.InterfaceC0880f;
import I8.O;
import androidx.constraintlayout.core.widgets.Optimizer;
import kotlin.jvm.internal.AbstractC1457h;
import kotlin.jvm.internal.n;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final O f342a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Object f343b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final p164q3.a f344c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f345d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final O f346e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final boolean f347f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final InterfaceC0880f f348g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final p219v8.a f349h;

    public a(O key, Object obj, p164q3.a text, boolean z9, O isSelected, boolean z10, InterfaceC0880f onClicked, p219v8.a aVar) {
        n.h(key, "key");
        n.h(text, "text");
        n.h(isSelected, "isSelected");
        n.h(onClicked, "onClicked");
        this.f342a = key;
        this.f343b = obj;
        this.f344c = text;
        this.f345d = z9;
        this.f346e = isSelected;
        this.f347f = z10;
        this.f348g = onClicked;
        this.f349h = aVar;
    }

    public final O a() {
        return this.f342a;
    }

    public final InterfaceC0880f b() {
        return this.f348g;
    }

    public final p219v8.a c() {
        return this.f349h;
    }

    public final Object d() {
        return this.f343b;
    }

    public final p164q3.a e() {
        return this.f344c;
    }

    public boolean equals(Object obj) {
        a aVar = obj instanceof a ? (a) obj : null;
        return aVar != null && n.d(this.f343b, aVar.f343b) && n.d(this.f344c, aVar.f344c) && ((Boolean) this.f346e.getValue()).booleanValue() == ((Boolean) aVar.f346e.getValue()).booleanValue() && this.f347f == aVar.f347f && n.d(this.f349h, aVar.f349h);
    }

    public final boolean f() {
        return this.f347f;
    }

    public final O g() {
        return this.f346e;
    }

    public final boolean h() {
        return this.f345d;
    }

    public int hashCode() {
        int iHashCode = this.f342a.hashCode() * 31;
        Object obj = this.f343b;
        int iHashCode2 = (((((((((((iHashCode + (obj == null ? 0 : obj.hashCode())) * 31) + this.f344c.hashCode()) * 31) + Boolean.hashCode(this.f345d)) * 31) + this.f346e.hashCode()) * 31) + Boolean.hashCode(this.f347f)) * 31) + this.f348g.hashCode()) * 31;
        p219v8.a aVar = this.f349h;
        return iHashCode2 + (aVar != null ? aVar.hashCode() : 0);
    }

    public String toString() {
        return "OptionItemViewModel(key=" + this.f342a + ", payload=" + this.f343b + ", text=" + this.f344c + ", isTextUserVisible=" + this.f345d + ", isSelected=" + this.f346e + ", isEnabled=" + this.f347f + ", onClicked=" + this.f348g + ", onLongClicked=" + this.f349h + ")";
    }

    public /* synthetic */ a(O o9, Object obj, p164q3.a aVar, boolean z9, O o10, boolean z10, InterfaceC0880f interfaceC0880f, p219v8.a aVar2, int i10, AbstractC1457h abstractC1457h) {
        this(o9, (i10 & 2) != 0 ? null : obj, aVar, (i10 & 8) != 0 ? true : z9, o10, (i10 & 32) != 0 ? true : z10, interfaceC0880f, (i10 & Optimizer.OPTIMIZATION_GRAPH_WRAP) != 0 ? null : aVar2);
    }
}
