package O1;

import android.graphics.drawable.Drawable;
import kotlin.jvm.internal.AbstractC1457h;
import kotlin.jvm.internal.n;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final C0191a f5750j = new C0191a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f5751a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f5752b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f5753c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Drawable f5754d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f5755e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final String f5756f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int f5757g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Integer f5758h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final boolean f5759i;

    /* JADX INFO: renamed from: O1.a$a, reason: collision with other inner class name */
    public static final class C0191a {
        public /* synthetic */ C0191a(AbstractC1457h abstractC1457h) {
            this();
        }

        private C0191a() {
        }
    }

    public a(String clockId, boolean z9, String description, Drawable thumbnail, boolean z10, O2.b bVar, String str, int i10, Integer num, boolean z11) {
        n.h(clockId, "clockId");
        n.h(description, "description");
        n.h(thumbnail, "thumbnail");
        this.f5751a = clockId;
        this.f5752b = z9;
        this.f5753c = description;
        this.f5754d = thumbnail;
        this.f5755e = z10;
        this.f5756f = str;
        this.f5757g = i10;
        this.f5758h = num;
        this.f5759i = z11;
    }

    public final O2.b a() {
        return null;
    }

    public final String b() {
        return this.f5751a;
    }

    public final int c() {
        return this.f5757g;
    }

    public final Integer d() {
        return this.f5758h;
    }

    public final String e() {
        return this.f5756f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return n.d(this.f5751a, aVar.f5751a) && this.f5752b == aVar.f5752b && n.d(this.f5753c, aVar.f5753c) && n.d(this.f5754d, aVar.f5754d) && this.f5755e == aVar.f5755e && n.d(null, null) && n.d(this.f5756f, aVar.f5756f) && this.f5757g == aVar.f5757g && n.d(this.f5758h, aVar.f5758h) && this.f5759i == aVar.f5759i;
    }

    public final boolean f() {
        return this.f5759i;
    }

    public final boolean g() {
        return this.f5752b;
    }

    public int hashCode() {
        int iHashCode = ((((((((this.f5751a.hashCode() * 31) + Boolean.hashCode(this.f5752b)) * 31) + this.f5753c.hashCode()) * 31) + this.f5754d.hashCode()) * 31) + Boolean.hashCode(this.f5755e)) * 961;
        String str = this.f5756f;
        int iHashCode2 = (((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + Integer.hashCode(this.f5757g)) * 31;
        Integer num = this.f5758h;
        return ((iHashCode2 + (num != null ? num.hashCode() : 0)) * 31) + Boolean.hashCode(this.f5759i);
    }

    public String toString() {
        return "ClockMetadataModel(clockId=" + this.f5751a + ", isSelected=" + this.f5752b + ", description=" + this.f5753c + ", thumbnail=" + this.f5754d + ", isReactiveToTone=" + this.f5755e + ", axisPresetConfig=" + ((Object) null) + ", selectedColorId=" + this.f5756f + ", colorToneProgress=" + this.f5757g + ", seedColor=" + this.f5758h + ", supportTransition=" + this.f5759i + ")";
    }
}
