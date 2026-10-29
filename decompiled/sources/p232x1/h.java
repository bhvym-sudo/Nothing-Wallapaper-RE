package p232x1;

import android.content.Context;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.n;

/* JADX INFO: loaded from: classes.dex */
public final class h extends g {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final String f29710g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final b f29711h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final W1.b f29712i;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f29713a;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private String f29716d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private boolean f29717e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private int f29718f;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private int f29720h;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int[] f29714b = new int[0];

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int[] f29715c = new int[0];

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private int f29719g = 1;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private Map f29721i = new HashMap();

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private W1.b f29722j = W1.b.WALLPAPER_COLOR;

        private final b c() {
            return new b(this.f29714b, this.f29715c);
        }

        public final a a(String str, String str2) {
            if (str != null) {
                this.f29721i.put(str, str2);
            }
            return this;
        }

        public final h b() {
            return new h(this.f29713a, this.f29721i, this.f29717e, this.f29716d, this.f29718f, this.f29719g, this.f29720h, c(), this.f29722j);
        }

        public final void d(int[] iArr) {
            n.h(iArr, "<set-?>");
            this.f29715c = iArr;
        }

        public final void e(boolean z9) {
            this.f29717e = z9;
        }

        public final void f(int i10) {
            this.f29720h = i10;
        }

        public final void g(int[] iArr) {
            n.h(iArr, "<set-?>");
            this.f29714b = iArr;
        }

        public final void h(int i10) {
            this.f29718f = i10;
        }

        public final void i(String str) {
            this.f29716d = str;
        }

        public final void j(int i10) {
            this.f29719g = i10;
        }

        public final void k(String str) {
            this.f29713a = str;
        }

        public final void l(W1.b bVar) {
            n.h(bVar, "<set-?>");
            this.f29722j = bVar;
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int[] f29723a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int[] f29724b;

        public b(int[] lightColors, int[] darkColors) {
            n.h(lightColors, "lightColors");
            n.h(darkColors, "darkColors");
            this.f29723a = lightColors;
            this.f29724b = darkColors;
        }

        public final int[] a(boolean z9) {
            return z9 ? this.f29724b : this.f29723a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(String str, Map overlayPackages, boolean z9, String str2, int i10, int i11, int i12, b previewInfo, W1.b type) {
        super(str, overlayPackages, z9, i10, Integer.valueOf(i11), i12);
        n.h(overlayPackages, "overlayPackages");
        n.h(previewInfo, "previewInfo");
        n.h(type, "type");
        this.f29710g = str2;
        this.f29711h = previewInfo;
        this.f29712i = type;
    }

    @Override // p232x1.g
    public String e() {
        return this.f29710g;
    }

    public CharSequence m(Context context) {
        n.h(context, "context");
        return g();
    }

    public b n() {
        return this.f29711h;
    }

    public final W1.b o() {
        return this.f29712i;
    }
}
