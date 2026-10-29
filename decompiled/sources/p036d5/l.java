package p036d5;

import Z3.c;
import android.content.Context;
import android.util.Log;
import java.util.concurrent.ExecutionException;
import p005a4.f;
import p055f4.b;
import p155p4.AbstractC1474p;
import p155p4.C1473o;
import p215v4.InterfaceC1995f;
import p215v4.n;

/* JADX INFO: loaded from: classes.dex */
public abstract class l {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private static final AbstractC1474p f19588A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private static final AbstractC1474p f19589B;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c[] f19590a = new c[0];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final c f19591b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final c f19592c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final c f19593d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final c f19594e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final c f19595f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final c f19596g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final c f19597h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final c f19598i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final c f19599j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final c f19600k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final c f19601l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final c f19602m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final c f19603n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final c f19604o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final c f19605p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final c f19606q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final c f19607r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final c f19608s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final c f19609t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final c f19610u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final c f19611v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final c f19612w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final c f19613x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final c f19614y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final c f19615z;

    static {
        c cVar = new c("vision.barcode", 1L);
        f19591b = cVar;
        c cVar2 = new c("vision.custom.ica", 1L);
        f19592c = cVar2;
        c cVar3 = new c("vision.face", 1L);
        f19593d = cVar3;
        c cVar4 = new c("vision.ica", 1L);
        f19594e = cVar4;
        c cVar5 = new c("vision.ocr", 1L);
        f19595f = cVar5;
        f19596g = new c("mlkit.ocr.chinese", 1L);
        f19597h = new c("mlkit.ocr.common", 1L);
        f19598i = new c("mlkit.ocr.devanagari", 1L);
        f19599j = new c("mlkit.ocr.japanese", 1L);
        f19600k = new c("mlkit.ocr.korean", 1L);
        c cVar6 = new c("mlkit.langid", 1L);
        f19601l = cVar6;
        c cVar7 = new c("mlkit.nlclassifier", 1L);
        f19602m = cVar7;
        c cVar8 = new c("tflite_dynamite", 1L);
        f19603n = cVar8;
        c cVar9 = new c("mlkit.barcode.ui", 1L);
        f19604o = cVar9;
        c cVar10 = new c("mlkit.smartreply", 1L);
        f19605p = cVar10;
        f19606q = new c("mlkit.image.caption", 1L);
        f19607r = new c("mlkit.docscan.detect", 1L);
        f19608s = new c("mlkit.docscan.crop", 1L);
        f19609t = new c("mlkit.docscan.enhance", 1L);
        f19610u = new c("mlkit.docscan.ui", 1L);
        f19611v = new c("mlkit.docscan.stain", 1L);
        f19612w = new c("mlkit.docscan.shadow", 1L);
        f19613x = new c("mlkit.quality.aesthetic", 1L);
        f19614y = new c("mlkit.quality.technical", 1L);
        f19615z = new c("mlkit.segmentation.subject", 1L);
        C1473o c1473o = new C1473o();
        c1473o.a("barcode", cVar);
        c1473o.a("custom_ica", cVar2);
        c1473o.a("face", cVar3);
        c1473o.a("ica", cVar4);
        c1473o.a("ocr", cVar5);
        c1473o.a("langid", cVar6);
        c1473o.a("nlclassifier", cVar7);
        c1473o.a("tflite_dynamite", cVar8);
        c1473o.a("barcode_ui", cVar9);
        c1473o.a("smart_reply", cVar10);
        f19588A = c1473o.b();
        C1473o c1473o2 = new C1473o();
        c1473o2.a("com.google.android.gms.vision.barcode", cVar);
        c1473o2.a("com.google.android.gms.vision.custom.ica", cVar2);
        c1473o2.a("com.google.android.gms.vision.face", cVar3);
        c1473o2.a("com.google.android.gms.vision.ica", cVar4);
        c1473o2.a("com.google.android.gms.vision.ocr", cVar5);
        c1473o2.a("com.google.android.gms.mlkit.langid", cVar6);
        c1473o2.a("com.google.android.gms.mlkit.nlclassifier", cVar7);
        c1473o2.a("com.google.android.gms.tflite_dynamite", cVar8);
        c1473o2.a("com.google.android.gms.mlkit_smartreply", cVar10);
        f19589B = c1473o2.b();
    }

    public static boolean a(Context context, final c[] cVarArr) {
        try {
            return ((b) n.a(p055f4.c.a(context).d(new f() { // from class: d5.C
                @Override // p005a4.f
                public final c[] a() {
                    c[] cVarArr2 = l.f19590a;
                    return cVarArr;
                }
            }).e(new InterfaceC1995f() { // from class: d5.D
                @Override // p215v4.InterfaceC1995f
                public final void d(Exception exc) {
                    Log.e("OptionalModuleUtils", "Failed to check feature availability", exc);
                }
            }))).a();
        } catch (InterruptedException | ExecutionException e10) {
            Log.e("OptionalModuleUtils", "Failed to complete the task of features availability check", e10);
            return false;
        }
    }

    public static void b(Context context, final c[] cVarArr) {
        p055f4.c.a(context).b(p055f4.f.d().a(new f() { // from class: d5.A
            @Override // p005a4.f
            public final c[] a() {
                c[] cVarArr2 = l.f19590a;
                return cVarArr;
            }
        }).b()).e(new InterfaceC1995f() { // from class: d5.B
            @Override // p215v4.InterfaceC1995f
            public final void d(Exception exc) {
                Log.e("OptionalModuleUtils", "Failed to request modules install request", exc);
            }
        });
    }
}
