package p106k5;

import java.util.Optional;
import p116l5.b;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f22719a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f22720b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b f22721c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f22722d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final double f22723e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final p126m5.a f22724f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final p126m5.a f22725g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final p126m5.a f22726h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final p126m5.a f22727i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final p126m5.a f22728j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final p126m5.a f22729k;

    public a(b bVar, b bVar2, boolean z9, double d10, p126m5.a aVar, p126m5.a aVar2, p126m5.a aVar3, p126m5.a aVar4, p126m5.a aVar5) {
        this(bVar, bVar2, z9, d10, aVar, aVar2, aVar3, aVar4, aVar5, Optional.empty());
    }

    public static double a(b bVar, double[] dArr, double[] dArr2) {
        double d10 = bVar.d();
        int i10 = 0;
        if (dArr2.length == 1) {
            return p156p5.b.e(d10 + dArr2[0]);
        }
        int length = dArr.length;
        while (i10 <= length - 2) {
            double d11 = dArr[i10];
            int i11 = i10 + 1;
            double d12 = dArr[i11];
            if (d11 < d10 && d10 < d12) {
                return p156p5.b.e(d10 + dArr2[i10]);
            }
            i10 = i11;
        }
        return d10;
    }

    public a(b bVar, b bVar2, boolean z9, double d10, p126m5.a aVar, p126m5.a aVar2, p126m5.a aVar3, p126m5.a aVar4, p126m5.a aVar5, Optional optional) {
        this.f22719a = bVar.g();
        this.f22720b = bVar;
        this.f22721c = bVar2;
        this.f22722d = z9;
        this.f22723e = d10;
        this.f22724f = aVar;
        this.f22725g = aVar2;
        this.f22726h = aVar3;
        this.f22727i = aVar4;
        this.f22728j = aVar5;
        this.f22729k = (p126m5.a) optional.orElse(p126m5.a.b(25.0d, 84.0d));
    }
}
