package V8;

import P8.B;
import P8.C;
import P8.D;
import P8.E;
import P8.F;
import P8.v;
import P8.w;
import P8.z;
import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.net.SocketTimeoutException;
import java.security.cert.CertificateException;
import java.util.List;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import kotlin.jvm.internal.AbstractC1457h;
import kotlin.jvm.internal.n;
import p089i8.AbstractC1444s;

/* JADX INFO: loaded from: classes2.dex */
public final class j implements w {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f8251b = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final z f8252a;

    public static final class a {
        public /* synthetic */ a(AbstractC1457h abstractC1457h) {
            this();
        }

        private a() {
        }
    }

    public j(z client) {
        n.h(client, "client");
        this.f8252a = client;
    }

    private final B b(D d10, String str) {
        String strG;
        v vVarQ;
        if (!this.f8252a.s() || (strG = D.G(d10, "Location", null, 2, null)) == null || (vVarQ = d10.t0().j().q(strG)) == null) {
            return null;
        }
        if (!n.d(vVarQ.r(), d10.t0().j().r()) && !this.f8252a.t()) {
            return null;
        }
        B.a aVarH = d10.t0().h();
        if (f.a(str)) {
            int iJ = d10.j();
            f fVar = f.f8237a;
            boolean z9 = fVar.c(str) || iJ == 308 || iJ == 307;
            if (!fVar.b(str) || iJ == 308 || iJ == 307) {
                aVarH.e(str, z9 ? d10.t0().a() : null);
            } else {
                aVarH.e("GET", null);
            }
            if (!z9) {
                aVarH.f("Transfer-Encoding");
                aVarH.f("Content-Length");
                aVarH.f("Content-Type");
            }
        }
        if (!Q8.d.j(d10.t0().j(), vVarQ)) {
            aVarH.f("Authorization");
        }
        return aVarH.h(vVarQ).b();
    }

    private final B c(D d10, U8.c cVar) throws ProtocolException {
        U8.f fVarH;
        F fA = (cVar == null || (fVarH = cVar.h()) == null) ? null : fVarH.A();
        int iJ = d10.j();
        String strG = d10.t0().g();
        if (iJ != 307 && iJ != 308) {
            if (iJ == 401) {
                return this.f8252a.h().a(fA, d10);
            }
            if (iJ == 421) {
                C cA = d10.t0().a();
                if ((cA != null && cA.f()) || cVar == null || !cVar.l()) {
                    return null;
                }
                cVar.h().y();
                return d10.t0();
            }
            if (iJ == 503) {
                D dY = d10.Y();
                if ((dY == null || dY.j() != 503) && g(d10, SubsamplingScaleImageView.TILE_SIZE_AUTO) == 0) {
                    return d10.t0();
                }
                return null;
            }
            if (iJ == 407) {
                n.e(fA);
                if (fA.b().type() == Proxy.Type.HTTP) {
                    return this.f8252a.E().a(fA, d10);
                }
                throw new ProtocolException("Received HTTP_PROXY_AUTH (407) code while not using proxy");
            }
            if (iJ == 408) {
                if (!this.f8252a.H()) {
                    return null;
                }
                C cA2 = d10.t0().a();
                if (cA2 != null && cA2.f()) {
                    return null;
                }
                D dY2 = d10.Y();
                if ((dY2 == null || dY2.j() != 408) && g(d10, 0) <= 0) {
                    return d10.t0();
                }
                return null;
            }
            switch (iJ) {
                case 300:
                case 301:
                case 302:
                case 303:
                    break;
                default:
                    return null;
            }
        }
        return b(d10, strG);
    }

    private final boolean d(IOException iOException, boolean z9) {
        if (iOException instanceof ProtocolException) {
            return false;
        }
        if (iOException instanceof InterruptedIOException) {
            return (iOException instanceof SocketTimeoutException) && !z9;
        }
        return (((iOException instanceof SSLHandshakeException) && (iOException.getCause() instanceof CertificateException)) || (iOException instanceof SSLPeerUnverifiedException)) ? false : true;
    }

    private final boolean e(IOException iOException, U8.e eVar, B b10, boolean z9) {
        if (this.f8252a.H()) {
            return !(z9 && f(iOException, b10)) && d(iOException, z9) && eVar.C();
        }
        return false;
    }

    private final boolean f(IOException iOException, B b10) {
        C cA = b10.a();
        return (cA != null && cA.f()) || (iOException instanceof FileNotFoundException);
    }

    private final int g(D d10, int i10) {
        String strG = D.G(d10, "Retry-After", null, 2, null);
        if (strG == null) {
            return i10;
        }
        if (!new E8.g("\\d+").a(strG)) {
            return SubsamplingScaleImageView.TILE_SIZE_AUTO;
        }
        Integer numValueOf = Integer.valueOf(strG);
        n.g(numValueOf, "valueOf(header)");
        return numValueOf.intValue();
    }

    @Override // P8.w
    public D a(w.a chain) {
        D dA;
        n.h(chain, "chain");
        g gVar = (g) chain;
        B bJ = gVar.j();
        U8.e eVarF = gVar.f();
        List listL = AbstractC1444s.l();
        int i10 = 0;
        D d10 = null;
        while (true) {
            boolean z9 = true;
            while (true) {
                eVarF.l(bJ, z9);
                try {
                    if (eVarF.f()) {
                        throw new IOException("Canceled");
                    }
                    try {
                        dA = gVar.a(bJ);
                    } catch (U8.i e10) {
                        if (!e(e10.c(), eVarF, bJ, false)) {
                            throw Q8.d.Y(e10.b(), listL);
                        }
                        listL = AbstractC1444s.h0(listL, e10.b());
                        eVarF.m(true);
                        z9 = false;
                    } catch (IOException e11) {
                        if (!e(e11, eVarF, bJ, !(e11 instanceof X8.a))) {
                            throw Q8.d.Y(e11, listL);
                        }
                        listL = AbstractC1444s.h0(listL, e11);
                        eVarF.m(true);
                        z9 = false;
                    }
                    eVarF.m(true);
                    z9 = false;
                } catch (Throwable th) {
                    eVarF.m(true);
                    throw th;
                }
            }
            if (d10 != null) {
                dA = dA.U().o(d10.U().b(null).c()).c();
            }
            d10 = dA;
            U8.c cVarR = eVarF.r();
            B bC = c(d10, cVarR);
            if (bC == null) {
                if (cVarR != null && cVarR.m()) {
                    eVarF.E();
                }
                eVarF.m(false);
                return d10;
            }
            C cA = bC.a();
            if (cA != null && cA.f()) {
                eVarF.m(false);
                return d10;
            }
            E eA = d10.a();
            if (eA != null) {
                Q8.d.m(eA);
            }
            i10++;
            if (i10 > 20) {
                throw new ProtocolException("Too many follow-up requests: " + i10);
            }
            eVarF.m(true);
            bJ = bC;
        }
    }
}
