package p101k0;

import kotlin.jvm.internal.AbstractC1457h;

/* JADX INFO: loaded from: classes.dex */
public final class k {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f22673c = new a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final k f22674d = new k(1.0f, 0.0f);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final float f22675a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final float f22676b;

    public static final class a {
        public /* synthetic */ a(AbstractC1457h abstractC1457h) {
            this();
        }

        private a() {
        }
    }

    public k(float f10, float f11) {
        this.f22675a = f10;
        this.f22676b = f11;
    }

    public final float a() {
        return this.f22675a;
    }

    public final float b() {
        return this.f22676b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return this.f22675a == kVar.f22675a && this.f22676b == kVar.f22676b;
    }

    public int hashCode() {
        return (Float.hashCode(this.f22675a) * 31) + Float.hashCode(this.f22676b);
    }

    public String toString() {
        return "TextGeometricTransform(scaleX=" + this.f22675a + ", skewX=" + this.f22676b + ')';
    }
}
