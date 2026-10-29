package P8;

import java.io.IOException;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import kotlin.jvm.internal.AbstractC1457h;
import p089i8.AbstractC1444s;

/* JADX INFO: loaded from: classes2.dex */
public final class t {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f6369e = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final G f6370a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final i f6371b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final List f6372c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final p079h8.h f6373d;

    public static final class a {

        /* JADX INFO: renamed from: P8.t$a$a, reason: collision with other inner class name */
        static final class C0213a extends kotlin.jvm.internal.o implements p219v8.a {

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            final /* synthetic */ List f6374r;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0213a(List list) {
                super(0);
                this.f6374r = list;
            }

            @Override // p219v8.a
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final List invoke() {
                return this.f6374r;
            }
        }

        public /* synthetic */ a(AbstractC1457h abstractC1457h) {
            this();
        }

        private final List b(Certificate[] certificateArr) {
            return certificateArr != null ? Q8.d.w(Arrays.copyOf(certificateArr, certificateArr.length)) : AbstractC1444s.l();
        }

        public final t a(SSLSession sSLSession) throws IOException {
            List listL;
            kotlin.jvm.internal.n.h(sSLSession, "<this>");
            String cipherSuite = sSLSession.getCipherSuite();
            if (cipherSuite == null) {
                throw new IllegalStateException("cipherSuite == null");
            }
            if (kotlin.jvm.internal.n.d(cipherSuite, "TLS_NULL_WITH_NULL_NULL") ? true : kotlin.jvm.internal.n.d(cipherSuite, "SSL_NULL_WITH_NULL_NULL")) {
                throw new IOException("cipherSuite == " + cipherSuite);
            }
            i iVarB = i.f6247b.b(cipherSuite);
            String protocol = sSLSession.getProtocol();
            if (protocol == null) {
                throw new IllegalStateException("tlsVersion == null");
            }
            if (kotlin.jvm.internal.n.d("NONE", protocol)) {
                throw new IOException("tlsVersion == NONE");
            }
            G gA = G.f6136r.a(protocol);
            try {
                listL = b(sSLSession.getPeerCertificates());
            } catch (SSLPeerUnverifiedException unused) {
                listL = AbstractC1444s.l();
            }
            return new t(gA, iVarB, b(sSLSession.getLocalCertificates()), new C0213a(listL));
        }

        private a() {
        }
    }

    static final class b extends kotlin.jvm.internal.o implements p219v8.a {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ p219v8.a f6375r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(p219v8.a aVar) {
            super(0);
            this.f6375r = aVar;
        }

        @Override // p219v8.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final List invoke() {
            try {
                return (List) this.f6375r.invoke();
            } catch (SSLPeerUnverifiedException unused) {
                return AbstractC1444s.l();
            }
        }
    }

    public t(G tlsVersion, i cipherSuite, List localCertificates, p219v8.a peerCertificatesFn) {
        kotlin.jvm.internal.n.h(tlsVersion, "tlsVersion");
        kotlin.jvm.internal.n.h(cipherSuite, "cipherSuite");
        kotlin.jvm.internal.n.h(localCertificates, "localCertificates");
        kotlin.jvm.internal.n.h(peerCertificatesFn, "peerCertificatesFn");
        this.f6370a = tlsVersion;
        this.f6371b = cipherSuite;
        this.f6372c = localCertificates;
        this.f6373d = p079h8.i.b(new b(peerCertificatesFn));
    }

    private final String b(Certificate certificate) {
        if (certificate instanceof X509Certificate) {
            return ((X509Certificate) certificate).getSubjectDN().toString();
        }
        String type = certificate.getType();
        kotlin.jvm.internal.n.g(type, "type");
        return type;
    }

    public final i a() {
        return this.f6371b;
    }

    public final List c() {
        return this.f6372c;
    }

    public final List d() {
        return (List) this.f6373d.getValue();
    }

    public final G e() {
        return this.f6370a;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof t)) {
            return false;
        }
        t tVar = (t) obj;
        return tVar.f6370a == this.f6370a && kotlin.jvm.internal.n.d(tVar.f6371b, this.f6371b) && kotlin.jvm.internal.n.d(tVar.d(), d()) && kotlin.jvm.internal.n.d(tVar.f6372c, this.f6372c);
    }

    public int hashCode() {
        return ((((((527 + this.f6370a.hashCode()) * 31) + this.f6371b.hashCode()) * 31) + d().hashCode()) * 31) + this.f6372c.hashCode();
    }

    public String toString() {
        List listD = d();
        ArrayList arrayList = new ArrayList(AbstractC1444s.u(listD, 10));
        Iterator it = listD.iterator();
        while (it.hasNext()) {
            arrayList.add(b((Certificate) it.next()));
        }
        String string = arrayList.toString();
        StringBuilder sb = new StringBuilder();
        sb.append("Handshake{tlsVersion=");
        sb.append(this.f6370a);
        sb.append(" cipherSuite=");
        sb.append(this.f6371b);
        sb.append(" peerCertificates=");
        sb.append(string);
        sb.append(" localCertificates=");
        List list = this.f6372c;
        ArrayList arrayList2 = new ArrayList(AbstractC1444s.u(list, 10));
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList2.add(b((Certificate) it2.next()));
        }
        sb.append(arrayList2);
        sb.append('}');
        return sb.toString();
    }
}
