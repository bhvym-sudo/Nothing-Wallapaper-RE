package N3;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
final class a extends f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Iterable f5208a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final byte[] f5209b;

    static final class b extends f.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Iterable f5210a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private byte[] f5211b;

        b() {
        }

        @Override // N3.f.a
        public f a() {
            String str = "";
            if (this.f5210a == null) {
                str = " events";
            }
            if (str.isEmpty()) {
                return new a(this.f5210a, this.f5211b);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // N3.f.a
        public f.a b(Iterable iterable) {
            if (iterable == null) {
                throw new NullPointerException("Null events");
            }
            this.f5210a = iterable;
            return this;
        }

        @Override // N3.f.a
        public f.a c(byte[] bArr) {
            this.f5211b = bArr;
            return this;
        }
    }

    @Override // N3.f
    public Iterable b() {
        return this.f5208a;
    }

    @Override // N3.f
    public byte[] c() {
        return this.f5209b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof f) {
            f fVar = (f) obj;
            if (this.f5208a.equals(fVar.b())) {
                if (Arrays.equals(this.f5209b, fVar instanceof a ? ((a) fVar).f5209b : fVar.c())) {
                    return true;
                }
            }
        }
        return false;
    }

    public int hashCode() {
        return Arrays.hashCode(this.f5209b) ^ ((this.f5208a.hashCode() ^ 1000003) * 1000003);
    }

    public String toString() {
        return "BackendRequest{events=" + this.f5208a + ", extras=" + Arrays.toString(this.f5209b) + "}";
    }

    private a(Iterable iterable, byte[] bArr) {
        this.f5208a = iterable;
        this.f5209b = bArr;
    }
}
