package K1;

import android.content.Context;
import android.content.Intent;
import p074h3.H;
import p074h3.I;
import p074h3.N;
import p074h3.W;
import p074h3.b0;

/* JADX INFO: loaded from: classes.dex */
public class e extends N implements q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f3996a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final W f3997b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final b0 f3998c;

    public e(Context context) {
        this.f3996a = context;
        H hA = I.a();
        this.f3997b = hA.f(context);
        this.f3998c = hA.l(context);
    }

    private int m(Intent intent) {
        if (!intent.hasExtra("com.android.wallpaper.LAUNCH_SOURCE")) {
            if (intent.hasExtra(":settings:fragment_args_key")) {
                return 8;
            }
            if (intent.getAction() == null || !intent.getAction().equals("android.service.wallpaper.CROP_AND_SET_WALLPAPER")) {
                return (intent.getCategories() == null || !intent.getCategories().contains("android.intent.category.LAUNCHER")) ? 0 : 5;
            }
            return 6;
        }
        String stringExtra = intent.getStringExtra("com.android.wallpaper.LAUNCH_SOURCE");
        stringExtra.getClass();
        switch (stringExtra) {
            case "app_launched_settings":
                return 2;
            case "app_launched_launcher":
                return 1;
            case "app_launched_tips":
                return 4;
            case "app_launched_deeplink":
                return 7;
            case "app_launched_suw":
                return 3;
            default:
                return 0;
        }
    }

    private int n(String str) {
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    @Override // p074h3.S
    public void a(String str) {
        new f().b(5).f(n(str)).a();
    }

    @Override // p074h3.S
    public void b() {
        new f().b(8).a();
    }

    @Override // p074h3.S
    public void c(boolean z9, boolean z10) {
        new f().b(1).a();
    }

    @Override // p074h3.S
    public void d(String str, String str2, String str3) {
        new f().b(7).f(n(str)).g(n(str2)).c(n(str3)).a();
    }

    @Override // p074h3.S
    public void h() {
        new f().b(2).a();
    }

    @Override // p074h3.S
    public void i(Intent intent) {
        new f().b(22).d(m(intent)).a();
    }

    @Override // p074h3.S
    public void j(String str) {
        new f().b(6).f(n(str)).a();
    }

    @Override // K1.q
    public void l(p242y1.a aVar) {
        new f().b(4).e(aVar.f30158w).a();
    }
}
