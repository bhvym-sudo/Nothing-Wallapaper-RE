package p234x3;

import kotlin.jvm.internal.n;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f29816a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final p219v8.a f29817b;

    public a(boolean z9, p219v8.a aVar) {
        this.f29816a = z9;
        this.f29817b = aVar;
    }

    public final p219v8.a a() {
        return this.f29817b;
    }

    public final boolean b() {
        return this.f29816a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f29816a == aVar.f29816a && n.d(this.f29817b, aVar.f29817b);
    }

    public int hashCode() {
        int iHashCode = Boolean.hashCode(this.f29816a) * 31;
        p219v8.a aVar = this.f29817b;
        return iHashCode + (aVar == null ? 0 : aVar.hashCode());
    }

    public String toString() {
        return "CustomizationPickerTabViewModel(isSelected=" + this.f29816a + ", onClicked=" + this.f29817b + ")";
    }
}
