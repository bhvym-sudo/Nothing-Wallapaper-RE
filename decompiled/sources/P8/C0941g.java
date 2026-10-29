package P8;

import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import javax.net.ssl.SSLPeerUnverifiedException;
import kotlin.jvm.internal.AbstractC1457h;
import p089i8.AbstractC1444s;

/* JADX INFO: renamed from: P8.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C0941g {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final b f6183c = new b(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final C0941g f6184d = new a().a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Set f6185a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final c9.c f6186b;

    /* JADX INFO: renamed from: P8.g$a */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final List f6187a = new ArrayList();

        /* JADX WARN: Multi-variable type inference failed */
        public final C0941g a() {
            return new C0941g(AbstractC1444s.w0(this.f6187a), null, 2, 0 == true ? 1 : 0);
        }
    }

    /* JADX INFO: renamed from: P8.g$b */
    public static final class b {
        public /* synthetic */ b(AbstractC1457h abstractC1457h) {
            this();
        }

        public final String a(Certificate certificate) {
            kotlin.jvm.internal.n.h(certificate, "certificate");
            if (!(certificate instanceof X509Certificate)) {
                throw new IllegalArgumentException("Certificate pinning requires X509 certificates");
            }
            return "sha256/" + b((X509Certificate) certificate).d();
        }

        public final e9.h b(X509Certificate x509Certificate) {
            kotlin.jvm.internal.n.h(x509Certificate, "<this>");
            e9.h.a aVar = e9.h.f20267t;
            byte[] encoded = x509Certificate.getPublicKey().getEncoded();
            kotlin.jvm.internal.n.g(encoded, "publicKey.encoded");
            return e9.h.a.e(aVar, encoded, 0, 0, 3, null).u();
        }

        private b() {
        }
    }

    /* JADX INFO: renamed from: P8.g$c */
    static final class c extends kotlin.jvm.internal.o implements p219v8.a {

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        final /* synthetic */ List f6189s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ String f6190t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(List list, String str) {
            super(0);
            this.f6189s = list;
            this.f6190t = str;
        }

        @Override // p219v8.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final List invoke() {
            List listA;
            c9.c cVarD = C0941g.this.d();
            if (cVarD == null || (listA = cVarD.a(this.f6189s, this.f6190t)) == null) {
                listA = this.f6189s;
            }
            List<Certificate> list = listA;
            ArrayList arrayList = new ArrayList(AbstractC1444s.u(list, 10));
            for (Certificate certificate : list) {
                kotlin.jvm.internal.n.f(certificate, "null cannot be cast to non-null type java.security.cert.X509Certificate");
                arrayList.add((X509Certificate) certificate);
            }
            return arrayList;
        }
    }

    public C0941g(Set pins, c9.c cVar) {
        kotlin.jvm.internal.n.h(pins, "pins");
        this.f6185a = pins;
        this.f6186b = cVar;
    }

    public final void a(String hostname, List peerCertificates) {
        kotlin.jvm.internal.n.h(hostname, "hostname");
        kotlin.jvm.internal.n.h(peerCertificates, "peerCertificates");
        b(hostname, new c(peerCertificates, hostname));
    }

    public final void b(String hostname, p219v8.a cleanedPeerCertificatesFn) throws SSLPeerUnverifiedException {
        kotlin.jvm.internal.n.h(hostname, "hostname");
        kotlin.jvm.internal.n.h(cleanedPeerCertificatesFn, "cleanedPeerCertificatesFn");
        List listC = c(hostname);
        if (listC.isEmpty()) {
            return;
        }
        List<X509Certificate> list = (List) cleanedPeerCertificatesFn.invoke();
        for (X509Certificate x509Certificate : list) {
            Iterator it = listC.iterator();
            if (it.hasNext()) {
                androidx.appcompat.app.o.a(it.next());
                throw null;
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Certificate pinning failure!");
        sb.append("\n  Peer certificate chain:");
        for (X509Certificate x509Certificate2 : list) {
            sb.append("\n    ");
            sb.append(f6183c.a(x509Certificate2));
            sb.append(": ");
            sb.append(x509Certificate2.getSubjectDN().getName());
        }
        sb.append("\n  Pinned certificates for ");
        sb.append(hostname);
        sb.append(":");
        Iterator it2 = listC.iterator();
        while (it2.hasNext()) {
            androidx.appcompat.app.o.a(it2.next());
            sb.append("\n    ");
            sb.append((Object) null);
        }
        String string = sb.toString();
        kotlin.jvm.internal.n.g(string, "StringBuilder().apply(builderAction).toString()");
        throw new SSLPeerUnverifiedException(string);
    }

    public final List c(String hostname) {
        kotlin.jvm.internal.n.h(hostname, "hostname");
        Set set = this.f6185a;
        List listL = AbstractC1444s.l();
        Iterator it = set.iterator();
        if (!it.hasNext()) {
            return listL;
        }
        androidx.appcompat.app.o.a(it.next());
        throw null;
    }

    public final c9.c d() {
        return this.f6186b;
    }

    public final C0941g e(c9.c certificateChainCleaner) {
        kotlin.jvm.internal.n.h(certificateChainCleaner, "certificateChainCleaner");
        return kotlin.jvm.internal.n.d(this.f6186b, certificateChainCleaner) ? this : new C0941g(this.f6185a, certificateChainCleaner);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C0941g)) {
            return false;
        }
        C0941g c0941g = (C0941g) obj;
        return kotlin.jvm.internal.n.d(c0941g.f6185a, this.f6185a) && kotlin.jvm.internal.n.d(c0941g.f6186b, this.f6186b);
    }

    public int hashCode() {
        int iHashCode = (1517 + this.f6185a.hashCode()) * 41;
        c9.c cVar = this.f6186b;
        return iHashCode + (cVar != null ? cVar.hashCode() : 0);
    }

    public /* synthetic */ C0941g(Set set, c9.c cVar, int i10, AbstractC1457h abstractC1457h) {
        this(set, (i10 & 2) != 0 ? null : cVar);
    }
}
