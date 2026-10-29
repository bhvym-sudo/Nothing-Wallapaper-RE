package Z3;

import android.os.RemoteException;
import android.util.Log;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;
import p025c4.AbstractC1202p;
import p025c4.l0;
import p025c4.m0;

/* JADX INFO: loaded from: classes.dex */
abstract class r extends l0 {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final int f9470q;

    protected r(byte[] bArr) {
        AbstractC1202p.a(bArr.length == 25);
        this.f9470q = Arrays.hashCode(bArr);
    }

    protected static byte[] c(String str) {
        try {
            return str.getBytes("ISO-8859-1");
        } catch (UnsupportedEncodingException e10) {
            throw new AssertionError(e10);
        }
    }

    @Override // p025c4.m0
    public final p115l4.a b() {
        return p115l4.b.X(e());
    }

    @Override // p025c4.m0
    public final int d() {
        return this.f9470q;
    }

    abstract byte[] e();

    public final boolean equals(Object obj) {
        p115l4.a aVarB;
        if (obj != null && (obj instanceof m0)) {
            try {
                m0 m0Var = (m0) obj;
                if (m0Var.d() == this.f9470q && (aVarB = m0Var.b()) != null) {
                    return Arrays.equals(e(), (byte[]) p115l4.b.e(aVarB));
                }
                return false;
            } catch (RemoteException e10) {
                Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e10);
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f9470q;
    }
}
