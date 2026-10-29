package p074h3;

import android.app.WallpaperColors;
import android.graphics.Bitmap;
import android.text.TextUtils;
import java.util.List;
import p064g3.k;
import p064g3.o;
import p064g3.x;

/* JADX INFO: loaded from: classes.dex */
public interface W {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f21650a = a.f21651a;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ a f21651a = new a();

        private a() {
        }

        public final String a(String str, long j9) {
            if (!TextUtils.isEmpty(str)) {
                return str;
            }
            if (j9 > 0) {
                return String.valueOf(j9);
            }
            return null;
        }
    }

    String A();

    void B();

    String C();

    long D();

    String E();

    void F(String str);

    List G();

    String H();

    void I(int i10);

    String J();

    void K(String str);

    int L();

    WallpaperColors M();

    String N();

    void O(List list);

    void P(boolean z9);

    void Q(o oVar);

    String R();

    List S();

    void T(String str);

    String U();

    WallpaperColors V();

    String W();

    String X();

    WallpaperColors Y(String str);

    void Z(String str);

    void a();

    WallpaperColors a0();

    void b(String str);

    int b0();

    String c();

    void c0(boolean z9);

    void d();

    String d0();

    void e(String str);

    void e0(String str);

    String f();

    String g();

    long g0();

    void h(List list);

    boolean h0();

    String i();

    void i0(String str);

    void j(long j9);

    void j0(String str, WallpaperColors wallpaperColors);

    boolean k();

    void k0(int i10);

    void l(String str);

    void l0(int i10, String str, k kVar, WallpaperColors wallpaperColors);

    void m();

    void o(int i10);

    void p(int i10);

    void q(String str);

    String r();

    void s(int i10, String str, x xVar, Bitmap bitmap, WallpaperColors wallpaperColors);

    void t(o oVar);

    String u();

    void v(String str);

    void w();

    List x();

    int y();

    WallpaperColors z();
}
