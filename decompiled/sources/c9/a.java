package c9;

import java.security.GeneralSecurityException;
import java.security.cert.X509Certificate;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import kotlin.jvm.internal.AbstractC1457h;
import kotlin.jvm.internal.n;

/* JADX INFO: loaded from: classes2.dex */
public final class a extends c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final C0439a f15250c = new C0439a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e f15251b;

    /* JADX INFO: renamed from: c9.a$a, reason: collision with other inner class name */
    public static final class C0439a {
        public /* synthetic */ C0439a(AbstractC1457h abstractC1457h) {
            this();
        }

        private C0439a() {
        }
    }

    public a(e trustRootIndex) {
        n.h(trustRootIndex, "trustRootIndex");
        this.f15251b = trustRootIndex;
    }

    private final boolean b(X509Certificate x509Certificate, X509Certificate x509Certificate2) {
        if (!n.d(x509Certificate.getIssuerDN(), x509Certificate2.getSubjectDN())) {
            return false;
        }
        try {
            x509Certificate.verify(x509Certificate2.getPublicKey());
            return true;
        } catch (GeneralSecurityException unused) {
            return false;
        }
    }

    @Override // c9.c
    public List a(List chain, String hostname) throws SSLPeerUnverifiedException {
        X509Certificate x509Certificate;
        n.h(chain, "chain");
        n.h(hostname, "hostname");
        ArrayDeque arrayDeque = new ArrayDeque(chain);
        ArrayList arrayList = new ArrayList();
        Object objRemoveFirst = arrayDeque.removeFirst();
        n.g(objRemoveFirst, "queue.removeFirst()");
        arrayList.add(objRemoveFirst);
        boolean z9 = false;
        for (int i10 = 0; i10 < 9; i10++) {
            Object obj = arrayList.get(arrayList.size() - 1);
            n.f(obj, "null cannot be cast to non-null type java.security.cert.X509Certificate");
            X509Certificate x509Certificate2 = (X509Certificate) obj;
            X509Certificate x509CertificateA = this.f15251b.a(x509Certificate2);
            if (x509CertificateA != null) {
                if (arrayList.size() > 1 || !n.d(x509Certificate2, x509CertificateA)) {
                    arrayList.add(x509CertificateA);
                }
                if (b(x509CertificateA, x509CertificateA)) {
                    return arrayList;
                }
                z9 = true;
            } else {
                Iterator it = arrayDeque.iterator();
                n.g(it, "queue.iterator()");
                do {
                    if (!it.hasNext()) {
                        if (!z9) {
                            throw new SSLPeerUnverifiedException("Failed to find a trusted cert that signed " + x509Certificate2);
                        }
                        return arrayList;
                    }
                    Object next = it.next();
                    n.f(next, "null cannot be cast to non-null type java.security.cert.X509Certificate");
                    x509Certificate = (X509Certificate) next;
                } while (!b(x509Certificate2, x509Certificate));
                it.remove();
                arrayList.add(x509Certificate);
            }
        }
        throw new SSLPeerUnverifiedException("Certificate chain too long: " + arrayList);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof a) && n.d(((a) obj).f15251b, this.f15251b);
    }

    public int hashCode() {
        return this.f15251b.hashCode();
    }
}
