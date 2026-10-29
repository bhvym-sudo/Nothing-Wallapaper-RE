package P8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import javax.net.ssl.SSLSocket;
import kotlin.jvm.internal.AbstractC1457h;
import p089i8.AbstractC1444s;

/* JADX INFO: loaded from: classes2.dex */
public final class l {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final b f6317e = new b(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final i[] f6318f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final i[] f6319g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final l f6320h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final l f6321i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final l f6322j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final l f6323k;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f6324a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f6325b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String[] f6326c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String[] f6327d;

    public static final class b {
        public /* synthetic */ b(AbstractC1457h abstractC1457h) {
            this();
        }

        private b() {
        }
    }

    static {
        i iVar = i.f6288o1;
        i iVar2 = i.f6291p1;
        i iVar3 = i.f6294q1;
        i iVar4 = i.f6246a1;
        i iVar5 = i.f6258e1;
        i iVar6 = i.f6249b1;
        i iVar7 = i.f6261f1;
        i iVar8 = i.f6279l1;
        i iVar9 = i.f6276k1;
        i[] iVarArr = {iVar, iVar2, iVar3, iVar4, iVar5, iVar6, iVar7, iVar8, iVar9};
        f6318f = iVarArr;
        i[] iVarArr2 = {iVar, iVar2, iVar3, iVar4, iVar5, iVar6, iVar7, iVar8, iVar9, i.f6216L0, i.f6218M0, i.f6272j0, i.f6275k0, i.f6207H, i.f6215L, i.f6277l};
        f6319g = iVarArr2;
        a aVarB = new a(true).b((i[]) Arrays.copyOf(iVarArr, iVarArr.length));
        G g10 = G.TLS_1_3;
        G g11 = G.TLS_1_2;
        f6320h = aVarB.e(g10, g11).d(true).a();
        f6321i = new a(true).b((i[]) Arrays.copyOf(iVarArr2, iVarArr2.length)).e(g10, g11).d(true).a();
        f6322j = new a(true).b((i[]) Arrays.copyOf(iVarArr2, iVarArr2.length)).e(g10, g11, G.TLS_1_1, G.TLS_1_0).d(true).a();
        f6323k = new a(false).a();
    }

    public l(boolean z9, boolean z10, String[] strArr, String[] strArr2) {
        this.f6324a = z9;
        this.f6325b = z10;
        this.f6326c = strArr;
        this.f6327d = strArr2;
    }

    private final l g(SSLSocket sSLSocket, boolean z9) {
        String[] cipherSuitesIntersection;
        String[] tlsVersionsIntersection;
        if (this.f6326c != null) {
            String[] enabledCipherSuites = sSLSocket.getEnabledCipherSuites();
            kotlin.jvm.internal.n.g(enabledCipherSuites, "sslSocket.enabledCipherSuites");
            cipherSuitesIntersection = Q8.d.E(enabledCipherSuites, this.f6326c, i.f6247b.c());
        } else {
            cipherSuitesIntersection = sSLSocket.getEnabledCipherSuites();
        }
        if (this.f6327d != null) {
            String[] enabledProtocols = sSLSocket.getEnabledProtocols();
            kotlin.jvm.internal.n.g(enabledProtocols, "sslSocket.enabledProtocols");
            tlsVersionsIntersection = Q8.d.E(enabledProtocols, this.f6327d, p109k8.a.f());
        } else {
            tlsVersionsIntersection = sSLSocket.getEnabledProtocols();
        }
        String[] supportedCipherSuites = sSLSocket.getSupportedCipherSuites();
        kotlin.jvm.internal.n.g(supportedCipherSuites, "supportedCipherSuites");
        int iX = Q8.d.x(supportedCipherSuites, "TLS_FALLBACK_SCSV", i.f6247b.c());
        if (z9 && iX != -1) {
            kotlin.jvm.internal.n.g(cipherSuitesIntersection, "cipherSuitesIntersection");
            String str = supportedCipherSuites[iX];
            kotlin.jvm.internal.n.g(str, "supportedCipherSuites[indexOfFallbackScsv]");
            cipherSuitesIntersection = Q8.d.o(cipherSuitesIntersection, str);
        }
        a aVar = new a(this);
        kotlin.jvm.internal.n.g(cipherSuitesIntersection, "cipherSuitesIntersection");
        a aVarC = aVar.c((String[]) Arrays.copyOf(cipherSuitesIntersection, cipherSuitesIntersection.length));
        kotlin.jvm.internal.n.g(tlsVersionsIntersection, "tlsVersionsIntersection");
        return aVarC.f((String[]) Arrays.copyOf(tlsVersionsIntersection, tlsVersionsIntersection.length)).a();
    }

    public final void c(SSLSocket sslSocket, boolean z9) {
        kotlin.jvm.internal.n.h(sslSocket, "sslSocket");
        l lVarG = g(sslSocket, z9);
        if (lVarG.i() != null) {
            sslSocket.setEnabledProtocols(lVarG.f6327d);
        }
        if (lVarG.d() != null) {
            sslSocket.setEnabledCipherSuites(lVarG.f6326c);
        }
    }

    public final List d() {
        String[] strArr = this.f6326c;
        if (strArr == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add(i.f6247b.b(str));
        }
        return AbstractC1444s.r0(arrayList);
    }

    public final boolean e(SSLSocket socket) {
        kotlin.jvm.internal.n.h(socket, "socket");
        if (!this.f6324a) {
            return false;
        }
        String[] strArr = this.f6327d;
        if (strArr != null && !Q8.d.u(strArr, socket.getEnabledProtocols(), p109k8.a.f())) {
            return false;
        }
        String[] strArr2 = this.f6326c;
        return strArr2 == null || Q8.d.u(strArr2, socket.getEnabledCipherSuites(), i.f6247b.c());
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof l)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        boolean z9 = this.f6324a;
        l lVar = (l) obj;
        if (z9 != lVar.f6324a) {
            return false;
        }
        return !z9 || (Arrays.equals(this.f6326c, lVar.f6326c) && Arrays.equals(this.f6327d, lVar.f6327d) && this.f6325b == lVar.f6325b);
    }

    public final boolean f() {
        return this.f6324a;
    }

    public final boolean h() {
        return this.f6325b;
    }

    public int hashCode() {
        if (!this.f6324a) {
            return 17;
        }
        String[] strArr = this.f6326c;
        int iHashCode = (527 + (strArr != null ? Arrays.hashCode(strArr) : 0)) * 31;
        String[] strArr2 = this.f6327d;
        return ((iHashCode + (strArr2 != null ? Arrays.hashCode(strArr2) : 0)) * 31) + (!this.f6325b ? 1 : 0);
    }

    public final List i() {
        String[] strArr = this.f6327d;
        if (strArr == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add(G.f6136r.a(str));
        }
        return AbstractC1444s.r0(arrayList);
    }

    public String toString() {
        if (!this.f6324a) {
            return "ConnectionSpec()";
        }
        return "ConnectionSpec(cipherSuites=" + Objects.toString(d(), "[all enabled]") + ", tlsVersions=" + Objects.toString(i(), "[all enabled]") + ", supportsTlsExtensions=" + this.f6325b + ')';
    }

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private boolean f6328a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String[] f6329b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private String[] f6330c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private boolean f6331d;

        public a(boolean z9) {
            this.f6328a = z9;
        }

        public final l a() {
            return new l(this.f6328a, this.f6331d, this.f6329b, this.f6330c);
        }

        public final a b(i... cipherSuites) {
            kotlin.jvm.internal.n.h(cipherSuites, "cipherSuites");
            if (!this.f6328a) {
                throw new IllegalArgumentException("no cipher suites for cleartext connections");
            }
            ArrayList arrayList = new ArrayList(cipherSuites.length);
            for (i iVar : cipherSuites) {
                arrayList.add(iVar.c());
            }
            String[] strArr = (String[]) arrayList.toArray(new String[0]);
            return c((String[]) Arrays.copyOf(strArr, strArr.length));
        }

        public final a c(String... cipherSuites) {
            kotlin.jvm.internal.n.h(cipherSuites, "cipherSuites");
            if (!this.f6328a) {
                throw new IllegalArgumentException("no cipher suites for cleartext connections");
            }
            if (cipherSuites.length == 0) {
                throw new IllegalArgumentException("At least one cipher suite is required");
            }
            this.f6329b = (String[]) cipherSuites.clone();
            return this;
        }

        public final a d(boolean z9) {
            if (!this.f6328a) {
                throw new IllegalArgumentException("no TLS extensions for cleartext connections");
            }
            this.f6331d = z9;
            return this;
        }

        public final a e(G... tlsVersions) {
            kotlin.jvm.internal.n.h(tlsVersions, "tlsVersions");
            if (!this.f6328a) {
                throw new IllegalArgumentException("no TLS versions for cleartext connections");
            }
            ArrayList arrayList = new ArrayList(tlsVersions.length);
            for (G g10 : tlsVersions) {
                arrayList.add(g10.e());
            }
            String[] strArr = (String[]) arrayList.toArray(new String[0]);
            return f((String[]) Arrays.copyOf(strArr, strArr.length));
        }

        public final a f(String... tlsVersions) {
            kotlin.jvm.internal.n.h(tlsVersions, "tlsVersions");
            if (!this.f6328a) {
                throw new IllegalArgumentException("no TLS versions for cleartext connections");
            }
            if (tlsVersions.length == 0) {
                throw new IllegalArgumentException("At least one TLS version is required");
            }
            this.f6330c = (String[]) tlsVersions.clone();
            return this;
        }

        public a(l connectionSpec) {
            kotlin.jvm.internal.n.h(connectionSpec, "connectionSpec");
            this.f6328a = connectionSpec.f();
            this.f6329b = connectionSpec.f6326c;
            this.f6330c = connectionSpec.f6327d;
            this.f6331d = connectionSpec.h();
        }
    }
}
