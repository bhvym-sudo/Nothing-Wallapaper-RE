package S8;

import E8.i;
import P8.B;
import P8.C0938d;
import P8.D;
import P8.u;
import Q8.d;
import V8.c;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.AbstractC1457h;
import kotlin.jvm.internal.n;

/* JADX INFO: loaded from: classes2.dex */
public final class b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f7380c = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final B f7381a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final D f7382b;

    public static final class a {
        public /* synthetic */ a(AbstractC1457h abstractC1457h) {
            this();
        }

        /* JADX WARN: Code duplicated, block: B:24:0x003b  */
        public final boolean a(D response, B request) {
            n.h(response, "response");
            n.h(request, "request");
            int iJ = response.j();
            if (iJ != 200 && iJ != 410 && iJ != 414 && iJ != 501 && iJ != 203 && iJ != 204) {
                if (iJ == 307) {
                    if (D.G(response, "Expires", null, 2, null) == null && response.b().c() == -1 && !response.b().b() && !response.b().a()) {
                        return false;
                    }
                } else if (iJ != 308 && iJ != 404 && iJ != 405) {
                    switch (iJ) {
                        case 300:
                        case 301:
                            break;
                        case 302:
                            if (D.G(response, "Expires", null, 2, null) == null) {
                                return false;
                            }
                            break;
                        default:
                            return false;
                    }
                }
            }
            return (response.b().h() || request.b().h()) ? false : true;
        }

        private a() {
        }
    }

    /* JADX INFO: renamed from: S8.b$b, reason: collision with other inner class name */
    public static final class C0263b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final long f7383a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final B f7384b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final D f7385c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private Date f7386d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private String f7387e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private Date f7388f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private String f7389g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private Date f7390h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private long f7391i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private long f7392j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private String f7393k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private int f7394l;

        public C0263b(long j9, B request, D d10) {
            n.h(request, "request");
            this.f7383a = j9;
            this.f7384b = request;
            this.f7385c = d10;
            this.f7394l = -1;
            if (d10 != null) {
                this.f7391i = d10.w0();
                this.f7392j = d10.q0();
                u uVarI = d10.I();
                int size = uVarI.size();
                for (int i10 = 0; i10 < size; i10++) {
                    String strB = uVarI.b(i10);
                    String strM = uVarI.m(i10);
                    if (i.B(strB, "Date", true)) {
                        this.f7386d = c.a(strM);
                        this.f7387e = strM;
                    } else if (i.B(strB, "Expires", true)) {
                        this.f7390h = c.a(strM);
                    } else if (i.B(strB, "Last-Modified", true)) {
                        this.f7388f = c.a(strM);
                        this.f7389g = strM;
                    } else if (i.B(strB, "ETag", true)) {
                        this.f7393k = strM;
                    } else if (i.B(strB, "Age", true)) {
                        this.f7394l = d.V(strM, -1);
                    }
                }
            }
        }

        private final long a() {
            Date date = this.f7386d;
            long jMax = date != null ? Math.max(0L, this.f7392j - date.getTime()) : 0L;
            int i10 = this.f7394l;
            if (i10 != -1) {
                jMax = Math.max(jMax, TimeUnit.SECONDS.toMillis(i10));
            }
            long j9 = this.f7392j;
            return jMax + (j9 - this.f7391i) + (this.f7383a - j9);
        }

        private final b c() {
            String str;
            if (this.f7385c == null) {
                return new b(this.f7384b, null);
            }
            if ((!this.f7384b.f() || this.f7385c.z() != null) && b.f7380c.a(this.f7385c, this.f7384b)) {
                C0938d c0938dB = this.f7384b.b();
                if (c0938dB.g() || e(this.f7384b)) {
                    return new b(this.f7384b, null);
                }
                C0938d c0938dB2 = this.f7385c.b();
                long jA = a();
                long jD = d();
                if (c0938dB.c() != -1) {
                    jD = Math.min(jD, TimeUnit.SECONDS.toMillis(c0938dB.c()));
                }
                long millis = 0;
                long millis2 = c0938dB.e() != -1 ? TimeUnit.SECONDS.toMillis(c0938dB.e()) : 0L;
                if (!c0938dB2.f() && c0938dB.d() != -1) {
                    millis = TimeUnit.SECONDS.toMillis(c0938dB.d());
                }
                if (!c0938dB2.g()) {
                    long j9 = millis2 + jA;
                    if (j9 < millis + jD) {
                        D.a aVarU = this.f7385c.U();
                        if (j9 >= jD) {
                            aVarU.a("Warning", "110 HttpURLConnection \"Response is stale\"");
                        }
                        if (jA > 86400000 && f()) {
                            aVarU.a("Warning", "113 HttpURLConnection \"Heuristic expiration\"");
                        }
                        return new b(null, aVarU.c());
                    }
                }
                String str2 = this.f7393k;
                if (str2 != null) {
                    str = "If-None-Match";
                } else {
                    if (this.f7388f != null) {
                        str2 = this.f7389g;
                    } else {
                        if (this.f7386d == null) {
                            return new b(this.f7384b, null);
                        }
                        str2 = this.f7387e;
                    }
                    str = "If-Modified-Since";
                }
                u.a aVarF = this.f7384b.e().f();
                n.e(str2);
                aVarF.d(str, str2);
                return new b(this.f7384b.h().d(aVarF.f()).b(), this.f7385c);
            }
            return new b(this.f7384b, null);
        }

        private final long d() {
            D d10 = this.f7385c;
            n.e(d10);
            C0938d c0938dB = d10.b();
            if (c0938dB.c() != -1) {
                return TimeUnit.SECONDS.toMillis(c0938dB.c());
            }
            Date date = this.f7390h;
            if (date != null) {
                Date date2 = this.f7386d;
                long time = date.getTime() - (date2 != null ? date2.getTime() : this.f7392j);
                if (time > 0) {
                    return time;
                }
                return 0L;
            }
            if (this.f7388f != null && this.f7385c.t0().j().o() == null) {
                Date date3 = this.f7386d;
                long time2 = date3 != null ? date3.getTime() : this.f7391i;
                Date date4 = this.f7388f;
                n.e(date4);
                long time3 = time2 - date4.getTime();
                if (time3 > 0) {
                    return time3 / ((long) 10);
                }
            }
            return 0L;
        }

        private final boolean e(B b10) {
            return (b10.d("If-Modified-Since") == null && b10.d("If-None-Match") == null) ? false : true;
        }

        private final boolean f() {
            D d10 = this.f7385c;
            n.e(d10);
            return d10.b().c() == -1 && this.f7390h == null;
        }

        public final b b() {
            b bVarC = c();
            return (bVarC.b() == null || !this.f7384b.b().i()) ? bVarC : new b(null, null);
        }
    }

    public b(B b10, D d10) {
        this.f7381a = b10;
        this.f7382b = d10;
    }

    public final D a() {
        return this.f7382b;
    }

    public final B b() {
        return this.f7381a;
    }
}
