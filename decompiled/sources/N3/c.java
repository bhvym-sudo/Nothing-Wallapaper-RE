package N3;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
final class c extends h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f5214a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final V3.a f5215b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final V3.a f5216c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f5217d;

    c(Context context, V3.a aVar, V3.a aVar2, String str) {
        if (context == null) {
            throw new NullPointerException("Null applicationContext");
        }
        this.f5214a = context;
        if (aVar == null) {
            throw new NullPointerException("Null wallClock");
        }
        this.f5215b = aVar;
        if (aVar2 == null) {
            throw new NullPointerException("Null monotonicClock");
        }
        this.f5216c = aVar2;
        if (str == null) {
            throw new NullPointerException("Null backendName");
        }
        this.f5217d = str;
    }

    @Override // N3.h
    public Context b() {
        return this.f5214a;
    }

    @Override // N3.h
    public String c() {
        return this.f5217d;
    }

    @Override // N3.h
    public V3.a d() {
        return this.f5216c;
    }

    @Override // N3.h
    public V3.a e() {
        return this.f5215b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof h) {
            h hVar = (h) obj;
            if (this.f5214a.equals(hVar.b()) && this.f5215b.equals(hVar.e()) && this.f5216c.equals(hVar.d()) && this.f5217d.equals(hVar.c())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return this.f5217d.hashCode() ^ ((((((this.f5214a.hashCode() ^ 1000003) * 1000003) ^ this.f5215b.hashCode()) * 1000003) ^ this.f5216c.hashCode()) * 1000003);
    }

    public String toString() {
        return "CreationContext{applicationContext=" + this.f5214a + ", wallClock=" + this.f5215b + ", monotonicClock=" + this.f5216c + ", backendName=" + this.f5217d + "}";
    }
}
