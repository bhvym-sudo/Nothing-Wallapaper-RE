package p165q4;

import android.content.Context;
import android.content.res.Resources;
import android.os.SystemClock;
import com.google.android.gms.dynamite.DynamiteModule;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import p025c4.C1199m;
import p036d5.AbstractC1304c;
import p036d5.C1308g;
import p036d5.m;
import p215v4.k;
import p231x0.f;
import p231x0.h;

/* JADX INFO: renamed from: q4.x5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1650x5 {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static N5 f24967k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final P5 f24968l = P5.c("optional-module-barcode", "com.google.android.gms.vision.barcode");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f24969a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f24970b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final InterfaceC1602q5 f24971c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final m f24972d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final k f24973e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final k f24974f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final String f24975g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final int f24976h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Map f24977i = new HashMap();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final Map f24978j = new HashMap();

    public C1650x5(Context context, final m mVar, InterfaceC1602q5 interfaceC1602q5, String str) {
        this.f24969a = context.getPackageName();
        this.f24970b = AbstractC1304c.a(context);
        this.f24972d = mVar;
        this.f24971c = interfaceC1602q5;
        K5.a();
        this.f24975g = str;
        this.f24973e = C1308g.a().b(new Callable() { // from class: q4.u5
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f24891a.a();
            }
        });
        C1308g c1308gA = C1308g.a();
        mVar.getClass();
        this.f24974f = c1308gA.b(new Callable() { // from class: q4.v5
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return mVar.a();
            }
        });
        P5 p9 = f24968l;
        this.f24976h = p9.containsKey(str) ? DynamiteModule.b(context, (String) p9.get(str)) : -1;
    }

    private static synchronized N5 d() {
        try {
            N5 n9 = f24967k;
            if (n9 != null) {
                return n9;
            }
            h hVarA = f.a(Resources.getSystem().getConfiguration());
            C1581n5 c1581n5 = new C1581n5();
            for (int i10 = 0; i10 < hVarA.f(); i10++) {
                c1581n5.c(AbstractC1304c.b(hVarA.c(i10)));
            }
            N5 n5D = c1581n5.d();
            f24967k = n5D;
            return n5D;
        } catch (Throwable th) {
            throw th;
        }
    }

    final /* synthetic */ String a() {
        return C1199m.a().b(this.f24975g);
    }

    final /* synthetic */ void b(InterfaceC1595p5 interfaceC1595p5, F3 f10, String str) {
        interfaceC1595p5.c(f10);
        String strD = interfaceC1595p5.d();
        K4 k9 = new K4();
        k9.b(this.f24969a);
        k9.c(this.f24970b);
        k9.h(d());
        k9.g(Boolean.TRUE);
        k9.l(strD);
        k9.j(str);
        k9.i(this.f24974f.l() ? (String) this.f24974f.i() : this.f24972d.a());
        k9.d(10);
        k9.k(Integer.valueOf(this.f24976h));
        interfaceC1595p5.a(k9);
        this.f24971c.a(interfaceC1595p5);
    }

    public final void c(H5 h10, final F3 f10) {
        EnumC1613s3 enumC1613s3;
        EnumC1655y3 enumC1655y3;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (this.f24977i.get(f10) != null && jElapsedRealtime - ((Long) this.f24977i.get(f10)).longValue() <= TimeUnit.SECONDS.toMillis(30L)) {
            return;
        }
        this.f24977i.put(f10, Long.valueOf(jElapsedRealtime));
        int i10 = h10.f24216a;
        int i11 = h10.f24217b;
        int i12 = h10.f24218c;
        int i13 = h10.f24219d;
        int i14 = h10.f24220e;
        long j9 = h10.f24221f;
        int i15 = h10.f24222g;
        C1648x3 c1648x3 = new C1648x3();
        if (i10 == -1) {
            enumC1613s3 = EnumC1613s3.BITMAP;
        } else if (i10 == 35) {
            enumC1613s3 = EnumC1613s3.YUV_420_888;
        } else if (i10 == 842094169) {
            enumC1613s3 = EnumC1613s3.YV12;
        } else if (i10 != 16) {
            enumC1613s3 = i10 != 17 ? EnumC1613s3.UNKNOWN_FORMAT : EnumC1613s3.NV21;
        } else {
            enumC1613s3 = EnumC1613s3.NV16;
        }
        c1648x3.d(enumC1613s3);
        if (i11 == 1) {
            enumC1655y3 = EnumC1655y3.BITMAP;
        } else if (i11 == 2) {
            enumC1655y3 = EnumC1655y3.BYTEARRAY;
        } else if (i11 != 3) {
            enumC1655y3 = i11 != 4 ? EnumC1655y3.ANDROID_MEDIA_IMAGE : EnumC1655y3.FILEPATH;
        } else {
            enumC1655y3 = EnumC1655y3.BYTEBUFFER;
        }
        c1648x3.f(enumC1655y3);
        c1648x3.c(Integer.valueOf(i12));
        c1648x3.e(Integer.valueOf(i13));
        c1648x3.g(Integer.valueOf(i14));
        c1648x3.b(Long.valueOf(j9));
        c1648x3.h(Integer.valueOf(i15));
        A3 a3J = c1648x3.j();
        G3 g10 = new G3();
        g10.d(a3J);
        final InterfaceC1595p5 interfaceC1595p5E = y5.e(g10);
        final String strB = this.f24973e.l() ? (String) this.f24973e.i() : C1199m.a().b(this.f24975g);
        C1308g.d().execute(new Runnable() { // from class: q4.w5
            @Override // java.lang.Runnable
            public final void run() {
                this.f24932q.b(interfaceC1595p5E, f10, strB);
            }
        });
    }
}
