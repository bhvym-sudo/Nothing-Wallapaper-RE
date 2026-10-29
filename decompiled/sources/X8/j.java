package X8;

import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView;
import e9.C1350e;
import java.io.Closeable;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.jvm.internal.AbstractC1457h;

/* JADX INFO: loaded from: classes2.dex */
public final class j implements Closeable {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final a f9202w = new a(null);

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private static final Logger f9203x = Logger.getLogger(e.class.getName());

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final e9.f f9204q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final boolean f9205r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final C1350e f9206s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f9207t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private boolean f9208u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final d.b f9209v;

    public static final class a {
        public /* synthetic */ a(AbstractC1457h abstractC1457h) {
            this();
        }

        private a() {
        }
    }

    public j(e9.f sink, boolean z9) {
        kotlin.jvm.internal.n.h(sink, "sink");
        this.f9204q = sink;
        this.f9205r = z9;
        C1350e c1350e = new C1350e();
        this.f9206s = c1350e;
        this.f9207t = 16384;
        this.f9209v = new d.b(0, false, c1350e, 3, null);
    }

    private final void Y(int i10, long j9) {
        while (j9 > 0) {
            long jMin = Math.min(this.f9207t, j9);
            j9 -= jMin;
            j(i10, (int) jMin, 9, j9 == 0 ? 4 : 0);
            this.f9204q.Z(this.f9206s, jMin);
        }
    }

    public final int B() {
        return this.f9207t;
    }

    public final synchronized void G(boolean z9, int i10, int i11) {
        if (this.f9208u) {
            throw new IOException("closed");
        }
        j(0, 8, 6, z9 ? 1 : 0);
        this.f9204q.x(i10);
        this.f9204q.x(i11);
        this.f9204q.flush();
    }

    public final synchronized void I(int i10, int i11, List requestHeaders) {
        kotlin.jvm.internal.n.h(requestHeaders, "requestHeaders");
        if (this.f9208u) {
            throw new IOException("closed");
        }
        this.f9209v.g(requestHeaders);
        long jX0 = this.f9206s.X0();
        int iMin = (int) Math.min(((long) this.f9207t) - 4, jX0);
        long j9 = iMin;
        j(i10, iMin + 4, 5, jX0 == j9 ? 4 : 0);
        this.f9204q.x(i11 & SubsamplingScaleImageView.TILE_SIZE_AUTO);
        this.f9204q.Z(this.f9206s, j9);
        if (jX0 > j9) {
            Y(i10, jX0 - j9);
        }
    }

    public final synchronized void K(int i10, b errorCode) {
        kotlin.jvm.internal.n.h(errorCode, "errorCode");
        if (this.f9208u) {
            throw new IOException("closed");
        }
        if (errorCode.e() == -1) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        j(i10, 4, 3, 0);
        this.f9204q.x(errorCode.e());
        this.f9204q.flush();
    }

    public final synchronized void Q(m settings) {
        int i10;
        try {
            kotlin.jvm.internal.n.h(settings, "settings");
            if (this.f9208u) {
                throw new IOException("closed");
            }
            int i11 = 0;
            j(0, settings.i() * 6, 4, 0);
            while (i11 < 10) {
                if (settings.f(i11)) {
                    if (i11 != 4) {
                        i10 = i11 != 7 ? i11 : 4;
                    } else {
                        i10 = 3;
                    }
                    this.f9204q.s(i10);
                    this.f9204q.x(settings.a(i11));
                }
                i11++;
            }
            this.f9204q.flush();
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void U(int i10, long j9) {
        if (this.f9208u) {
            throw new IOException("closed");
        }
        if (j9 == 0 || j9 > 2147483647L) {
            throw new IllegalArgumentException(("windowSizeIncrement == 0 || windowSizeIncrement > 0x7fffffffL: " + j9).toString());
        }
        j(i10, 4, 8, 0);
        this.f9204q.x((int) j9);
        this.f9204q.flush();
    }

    public final synchronized void a(m peerSettings) {
        try {
            kotlin.jvm.internal.n.h(peerSettings, "peerSettings");
            if (this.f9208u) {
                throw new IOException("closed");
            }
            this.f9207t = peerSettings.e(this.f9207t);
            if (peerSettings.b() != -1) {
                this.f9209v.e(peerSettings.b());
            }
            j(0, 0, 4, 1);
            this.f9204q.flush();
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void b() {
        try {
            if (this.f9208u) {
                throw new IOException("closed");
            }
            if (this.f9205r) {
                Logger logger = f9203x;
                if (logger.isLoggable(Level.FINE)) {
                    logger.fine(Q8.d.t(">> CONNECTION " + e.f9072b.n(), new Object[0]));
                }
                this.f9204q.s0(e.f9072b);
                this.f9204q.flush();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
        this.f9208u = true;
        this.f9204q.close();
    }

    public final synchronized void f(boolean z9, int i10, C1350e c1350e, int i11) {
        if (this.f9208u) {
            throw new IOException("closed");
        }
        g(i10, z9 ? 1 : 0, c1350e, i11);
    }

    public final synchronized void flush() {
        if (this.f9208u) {
            throw new IOException("closed");
        }
        this.f9204q.flush();
    }

    public final void g(int i10, int i11, C1350e c1350e, int i12) {
        j(i10, i12, 0, i11);
        if (i12 > 0) {
            e9.f fVar = this.f9204q;
            kotlin.jvm.internal.n.e(c1350e);
            fVar.Z(c1350e, i12);
        }
    }

    public final void j(int i10, int i11, int i12, int i13) {
        int i14;
        int i15;
        int i16;
        int i17;
        Logger logger = f9203x;
        if (logger.isLoggable(Level.FINE)) {
            i14 = i10;
            i15 = i11;
            i16 = i12;
            i17 = i13;
            logger.fine(e.f9071a.c(false, i14, i15, i16, i17));
        } else {
            i14 = i10;
            i15 = i11;
            i16 = i12;
            i17 = i13;
        }
        if (i15 > this.f9207t) {
            throw new IllegalArgumentException(("FRAME_SIZE_ERROR length > " + this.f9207t + ": " + i15).toString());
        }
        if ((Integer.MIN_VALUE & i14) != 0) {
            throw new IllegalArgumentException(("reserved bit set: " + i14).toString());
        }
        Q8.d.Z(this.f9204q, i15);
        this.f9204q.F(i16 & 255);
        this.f9204q.F(i17 & 255);
        this.f9204q.x(Integer.MAX_VALUE & i14);
    }

    public final synchronized void u(int i10, b errorCode, byte[] debugData) {
        try {
            kotlin.jvm.internal.n.h(errorCode, "errorCode");
            kotlin.jvm.internal.n.h(debugData, "debugData");
            if (this.f9208u) {
                throw new IOException("closed");
            }
            if (errorCode.e() == -1) {
                throw new IllegalArgumentException("errorCode.httpCode == -1");
            }
            j(0, debugData.length + 8, 7, 0);
            this.f9204q.x(i10);
            this.f9204q.x(errorCode.e());
            if (!(debugData.length == 0)) {
                this.f9204q.G0(debugData);
            }
            this.f9204q.flush();
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void z(boolean z9, int i10, List headerBlock) {
        kotlin.jvm.internal.n.h(headerBlock, "headerBlock");
        if (this.f9208u) {
            throw new IOException("closed");
        }
        this.f9209v.g(headerBlock);
        long jX0 = this.f9206s.X0();
        long jMin = Math.min(this.f9207t, jX0);
        int i11 = jX0 == jMin ? 4 : 0;
        if (z9) {
            i11 |= 1;
        }
        j(i10, (int) jMin, 1, i11);
        this.f9204q.Z(this.f9206s, jMin);
        if (jX0 > jMin) {
            Y(i10, jX0 - jMin);
        }
    }
}
