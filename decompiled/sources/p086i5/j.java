package p086i5;

import Z3.c;
import android.content.Context;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Log;
import com.google.android.gms.dynamite.DynamiteModule;
import java.nio.FloatBuffer;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import p025c4.AbstractC1202p;
import p036d5.AbstractC1307f;
import p036d5.C1308g;
import p036d5.C1310i;
import p036d5.l;
import p056f5.a;
import p066g5.b;
import p076h5.e;
import p175r4.AbstractC1948w;
import p175r4.B9;
import p175r4.C1721a1;
import p175r4.C1737b6;
import p175r4.C1784f9;
import p175r4.C1806h9;
import p175r4.C1817i9;
import p175r4.C1848l8;
import p175r4.C1905r6;
import p175r4.C1918t;
import p175r4.D9;
import p175r4.EnumC1866n6;
import p175r4.EnumC1886p6;
import p175r4.EnumC1896q6;
import p175r4.InterfaceC1773e9;
import p175r4.S7;
import p175r4.U5;
import p175r4.U8;
import p175r4.V5;
import p175r4.V7;
import p175r4.Y0;
import p175r4.s9;
import p175r4.v9;
import p175r4.x9;
import p175r4.z9;

/* JADX INFO: loaded from: classes.dex */
public final class j extends AbstractC1307f {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final c[] f22177k = {l.f19615z};

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final b f22178l = b.b();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Context f22179d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final e f22180e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final C1784f9 f22181f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final C1806h9 f22182g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f22183h = true;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f22184i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private v9 f22185j;

    j(C1310i c1310i, e eVar, C1784f9 c1784f9, C1806h9 c1806h9) {
        AbstractC1202p.j(c1310i, "MlKitContext can not be null");
        AbstractC1202p.j(eVar, "SubjectSegmenterOptions can not be null");
        this.f22179d = c1310i.b();
        this.f22180e = eVar;
        this.f22181f = c1784f9;
        this.f22182g = c1806h9;
    }

    private final void n(final EnumC1886p6 enumC1886p6, long j9, final boolean z9, final a aVar, final B9 b10) {
        final long jElapsedRealtime = SystemClock.elapsedRealtime() - j9;
        this.f22181f.f(new InterfaceC1773e9() { // from class: i5.g
            @Override // p175r4.InterfaceC1773e9
            public final U8 zza() {
                return this.f22167a.j(jElapsedRealtime, enumC1886p6, z9, aVar, b10);
            }
        }, EnumC1896q6.ON_DEVICE_SUBJECT_SEGMENTATION_INFERENCE);
        Y0 y9 = new Y0();
        y9.c(this.f22180e.a());
        y9.a(enumC1886p6);
        y9.b(Boolean.valueOf(z9));
        final C1721a1 c1721a1D = y9.d();
        final h hVar = h.f22173a;
        final EnumC1896q6 enumC1896q6 = EnumC1896q6.AGGREGATED_ON_DEVICE_SUBJECT_SEGMENTATION_INFERENCE;
        Executor executorD = C1308g.d();
        final C1784f9 c1784f9 = this.f22181f;
        executorD.execute(new Runnable() { // from class: r4.d9
            @Override // java.lang.Runnable
            public final void run() {
                c1784f9.h(enumC1896q6, c1721a1D, jElapsedRealtime, hVar);
            }
        });
        long jCurrentTimeMillis = System.currentTimeMillis();
        this.f22182g.c(24336, enumC1886p6.zza(), jCurrentTimeMillis - jElapsedRealtime, jCurrentTimeMillis);
    }

    private static final FloatBuffer o(float[] fArr) {
        if (fArr == null) {
            return null;
        }
        FloatBuffer floatBufferAllocate = FloatBuffer.allocate(fArr.length);
        floatBufferAllocate.put(fArr);
        floatBufferAllocate.rewind();
        return floatBufferAllocate;
    }

    @Override // p036d5.k
    public final synchronized void b() {
        try {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            Context context = this.f22179d;
            c[] cVarArr = f22177k;
            if (!l.a(context, cVarArr)) {
                if (!this.f22184i) {
                    l.b(this.f22179d, cVarArr);
                    this.f22184i = true;
                }
                m(EnumC1886p6.OPTIONAL_MODULE_NOT_AVAILABLE, jElapsedRealtime);
                throw new Z4.a("Waiting for the subject segmentation optional module to be downloaded. Please wait.", 14);
            }
            try {
                if (this.f22185j == null) {
                    this.f22185j = x9.a(DynamiteModule.d(this.f22179d, DynamiteModule.f16327b, "com.google.android.gms.mlkit_subject_segmentation").c("com.google.android.gms.mlkit.segmentation.subject.SubjectSegmenterCreator")).B(p115l4.b.X(this.f22179d), new D9(this.f22180e.d(), this.f22180e.c(), this.f22180e.e(), this.f22180e.g(), this.f22180e.f()));
                }
                try {
                    this.f22185j.Y();
                    m(EnumC1886p6.NO_ERROR, jElapsedRealtime);
                } catch (RemoteException e10) {
                    m(EnumC1886p6.OPTIONAL_MODULE_INIT_ERROR, jElapsedRealtime);
                    throw new Z4.a("Failed to init module subject segmenter", 13, e10);
                }
            } catch (Exception e11) {
                m(EnumC1886p6.OPTIONAL_MODULE_CREATE_ERROR, jElapsedRealtime);
                throw new Z4.a("Failed to load subject segmentation module", 13, e11);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // p036d5.k
    public final synchronized void d() {
        try {
            try {
                v9 v9Var = this.f22185j;
                if (v9Var != null) {
                    v9Var.Z();
                }
                this.f22185j = null;
            } catch (RemoteException unused) {
                Log.e("SubjectSegmenterTask", "Failed to release subject segmenter");
                this.f22185j = null;
            }
            this.f22183h = true;
            this.f22181f.f(new InterfaceC1773e9() { // from class: i5.f
                @Override // p175r4.InterfaceC1773e9
                public final U8 zza() {
                    C1905r6 c1905r6 = new C1905r6();
                    c1905r6.e(EnumC1866n6.TYPE_THIN);
                    return C1817i9.e(c1905r6);
                }
            }, EnumC1896q6.ON_DEVICE_SUBJECT_SEGMENTATION_CLOSE);
        } catch (Throwable th) {
            this.f22185j = null;
            throw th;
        }
    }

    final /* synthetic */ U8 j(long j9, EnumC1886p6 enumC1886p6, boolean z9, a aVar, B9 b10) {
        V5 v9;
        S7 s9 = new S7();
        C1737b6 c1737b6 = new C1737b6();
        c1737b6.a(Long.valueOf(j9));
        c1737b6.b(enumC1886p6);
        c1737b6.c(Boolean.valueOf(z9));
        s9.f(c1737b6.d());
        int iD = aVar.d();
        int iC = f22178l.c(aVar);
        U5 u9 = new U5();
        if (iD == -1) {
            v9 = V5.BITMAP;
        } else if (iD == 35) {
            v9 = V5.YUV_420_888;
        } else if (iD == 842094169) {
            v9 = V5.YV12;
        } else if (iD != 16) {
            v9 = iD != 17 ? V5.UNKNOWN_FORMAT : V5.NV21;
        } else {
            v9 = V5.NV16;
        }
        u9.a(v9);
        u9.b(Integer.valueOf(iC));
        s9.e(u9.d());
        s9.i(this.f22180e.a());
        if (b10 != null) {
            s9.g(AbstractC1948w.m(b10.b()));
            List<z9> listC = b10.c();
            if (!listC.isEmpty()) {
                C1918t c1918t = new C1918t();
                for (z9 z9Var : listC) {
                    C1848l8 c1848l8 = new C1848l8();
                    c1848l8.d(Integer.valueOf(z9Var.d()));
                    c1848l8.a(Integer.valueOf(z9Var.a()));
                    c1848l8.b(Integer.valueOf(z9Var.b()));
                    c1848l8.c(Integer.valueOf(z9Var.c()));
                    c1918t.a(c1848l8.e());
                }
                s9.h(c1918t.b());
            }
        }
        C1905r6 c1905r6 = new C1905r6();
        c1905r6.e(EnumC1866n6.TYPE_THIN);
        c1905r6.h(s9.j());
        return C1817i9.e(c1905r6);
    }

    final /* synthetic */ U8 k(EnumC1886p6 enumC1886p6, long j9) {
        C1905r6 c1905r6 = new C1905r6();
        c1905r6.e(EnumC1866n6.TYPE_THIN);
        V7 v9 = new V7();
        v9.d(this.f22180e.a());
        v9.c(enumC1886p6);
        v9.b(Long.valueOf(SystemClock.elapsedRealtime() - j9));
        c1905r6.i(v9.e());
        return C1817i9.e(c1905r6);
    }

    @Override // p036d5.AbstractC1307f
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public final synchronized p076h5.c i(a aVar) {
        B9 b9X;
        ArrayList arrayList;
        try {
            AbstractC1202p.j(aVar, "Input image can not be null");
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            try {
                b9X = ((v9) AbstractC1202p.i(this.f22185j)).X(b.b().a(aVar), new s9(aVar.d(), aVar.i(), aVar.e(), p066g5.a.a(aVar.h()), SystemClock.elapsedRealtime()));
                arrayList = new ArrayList();
                if (this.f22180e.e()) {
                    for (z9 z9Var : b9X.c()) {
                        arrayList.add(new p076h5.a(o(z9Var.f()), z9Var.e(), z9Var.d(), z9Var.a(), z9Var.b(), z9Var.c()));
                    }
                }
                n(EnumC1886p6.NO_ERROR, jElapsedRealtime, this.f22183h, aVar, b9X);
                this.f22183h = false;
            } catch (RemoteException e10) {
                n(EnumC1886p6.OPTIONAL_MODULE_INFERENCE_ERROR, jElapsedRealtime, this.f22183h, aVar, null);
                throw new Z4.a("Failed to run thin subject segmenter.", 13, e10);
            }
        } catch (Throwable th) {
            throw th;
        }
        return new p076h5.c(arrayList, o(b9X.d()), b9X.a());
    }

    final void m(final EnumC1886p6 enumC1886p6, final long j9) {
        this.f22181f.f(new InterfaceC1773e9() { // from class: i5.i
            @Override // p175r4.InterfaceC1773e9
            public final U8 zza() {
                return this.f22174a.k(enumC1886p6, j9);
            }
        }, EnumC1896q6.ON_DEVICE_SUBJECT_SEGMENTATION_LOAD);
    }
}
