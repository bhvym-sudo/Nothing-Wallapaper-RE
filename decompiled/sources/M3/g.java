package M3;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final K3.b f4967a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final byte[] f4968b;

    public g(K3.b bVar, byte[] bArr) {
        if (bVar == null) {
            throw new NullPointerException("encoding is null");
        }
        if (bArr == null) {
            throw new NullPointerException("bytes is null");
        }
        this.f4967a = bVar;
        this.f4968b = bArr;
    }

    public byte[] a() {
        return this.f4968b;
    }

    public K3.b b() {
        return this.f4967a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        if (this.f4967a.equals(gVar.f4967a)) {
            return Arrays.equals(this.f4968b, gVar.f4968b);
        }
        return false;
    }

    public int hashCode() {
        return Arrays.hashCode(this.f4968b) ^ ((this.f4967a.hashCode() ^ 1000003) * 1000003);
    }

    public String toString() {
        return "EncodedPayload{encoding=" + this.f4967a + ", bytes=[...]}";
    }
}
