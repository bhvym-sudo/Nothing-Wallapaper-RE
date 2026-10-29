package M3;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
final class c extends m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f4948a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final byte[] f4949b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final K3.d f4950c;

    static final class b extends m.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f4951a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private byte[] f4952b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private K3.d f4953c;

        b() {
        }

        @Override // M3.m.a
        public m a() {
            String str = "";
            if (this.f4951a == null) {
                str = " backendName";
            }
            if (this.f4953c == null) {
                str = str + " priority";
            }
            if (str.isEmpty()) {
                return new c(this.f4951a, this.f4952b, this.f4953c);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // M3.m.a
        public m.a b(String str) {
            if (str == null) {
                throw new NullPointerException("Null backendName");
            }
            this.f4951a = str;
            return this;
        }

        @Override // M3.m.a
        public m.a c(byte[] bArr) {
            this.f4952b = bArr;
            return this;
        }

        @Override // M3.m.a
        public m.a d(K3.d dVar) {
            if (dVar == null) {
                throw new NullPointerException("Null priority");
            }
            this.f4953c = dVar;
            return this;
        }
    }

    @Override // M3.m
    public String b() {
        return this.f4948a;
    }

    @Override // M3.m
    public byte[] c() {
        return this.f4949b;
    }

    @Override // M3.m
    public K3.d d() {
        return this.f4950c;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof m) {
            m mVar = (m) obj;
            if (this.f4948a.equals(mVar.b())) {
                if (Arrays.equals(this.f4949b, mVar instanceof c ? ((c) mVar).f4949b : mVar.c()) && this.f4950c.equals(mVar.d())) {
                    return true;
                }
            }
        }
        return false;
    }

    public int hashCode() {
        return this.f4950c.hashCode() ^ ((((this.f4948a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f4949b)) * 1000003);
    }

    private c(String str, byte[] bArr, K3.d dVar) {
        this.f4948a = str;
        this.f4949b = bArr;
        this.f4950c = dVar;
    }
}
