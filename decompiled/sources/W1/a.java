package W1;

import kotlin.jvm.internal.n;
import p232x1.g;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f8645a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final g f8646b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f8647c;

    public a(String key, g colorOption, boolean z9) {
        n.h(key, "key");
        n.h(colorOption, "colorOption");
        this.f8645a = key;
        this.f8646b = colorOption;
        this.f8647c = z9;
    }

    public final g a() {
        return this.f8646b;
    }

    public final String b() {
        return this.f8645a;
    }

    public final boolean c() {
        return this.f8647c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return n.d(this.f8645a, aVar.f8645a) && n.d(this.f8646b, aVar.f8646b) && this.f8647c == aVar.f8647c;
    }

    public int hashCode() {
        return (((this.f8645a.hashCode() * 31) + this.f8646b.hashCode()) * 31) + Boolean.hashCode(this.f8647c);
    }

    public String toString() {
        return "ColorOptionModel(key=" + this.f8645a + ", colorOption=" + this.f8646b + ", isSelected=" + this.f8647c + ")";
    }
}
