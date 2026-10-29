package p155p4;

import android.content.Context;
import com.google.android.gms.dynamite.DynamiteModule;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Callable;
import p025c4.C1199m;
import p036d5.AbstractC1304c;
import p036d5.C1308g;
import p036d5.m;
import p215v4.k;

/* JADX INFO: loaded from: classes.dex */
public final class N {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final AbstractC1474p f23706k = AbstractC1474p.c("optional-module-barcode", "com.google.android.gms.vision.barcode");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f23707a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f23708b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final H f23709c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final m f23710d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final k f23711e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final k f23712f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final String f23713g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final int f23714h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Map f23715i = new HashMap();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final Map f23716j = new HashMap();

    public N(Context context, final m mVar, H h10, String str) {
        this.f23707a = context.getPackageName();
        this.f23708b = AbstractC1304c.a(context);
        this.f23710d = mVar;
        this.f23709c = h10;
        Z.a();
        this.f23713g = str;
        this.f23711e = C1308g.a().b(new Callable() { // from class: p4.L
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f23704a.a();
            }
        });
        C1308g c1308gA = C1308g.a();
        mVar.getClass();
        this.f23712f = c1308gA.b(new Callable() { // from class: p4.M
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return mVar.a();
            }
        });
        AbstractC1474p abstractC1474p = f23706k;
        this.f23714h = abstractC1474p.containsKey(str) ? DynamiteModule.b(context, (String) abstractC1474p.get(str)) : -1;
    }

    final /* synthetic */ String a() {
        return C1199m.a().b(this.f23713g);
    }
}
