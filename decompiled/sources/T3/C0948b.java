package T3;

/* JADX INFO: renamed from: T3.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
final class C0948b extends AbstractC0955i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f7652a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final M3.m f7653b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final M3.h f7654c;

    C0948b(long j9, M3.m mVar, M3.h hVar) {
        this.f7652a = j9;
        if (mVar == null) {
            throw new NullPointerException("Null transportContext");
        }
        this.f7653b = mVar;
        if (hVar == null) {
            throw new NullPointerException("Null event");
        }
        this.f7654c = hVar;
    }

    @Override // T3.AbstractC0955i
    public M3.h b() {
        return this.f7654c;
    }

    @Override // T3.AbstractC0955i
    public long c() {
        return this.f7652a;
    }

    @Override // T3.AbstractC0955i
    public M3.m d() {
        return this.f7653b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC0955i) {
            AbstractC0955i abstractC0955i = (AbstractC0955i) obj;
            if (this.f7652a == abstractC0955i.c() && this.f7653b.equals(abstractC0955i.d()) && this.f7654c.equals(abstractC0955i.b())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        long j9 = this.f7652a;
        return this.f7654c.hashCode() ^ ((((((int) (j9 ^ (j9 >>> 32))) ^ 1000003) * 1000003) ^ this.f7653b.hashCode()) * 1000003);
    }

    public String toString() {
        return "PersistedEvent{id=" + this.f7652a + ", transportContext=" + this.f7653b + ", event=" + this.f7654c + "}";
    }
}
