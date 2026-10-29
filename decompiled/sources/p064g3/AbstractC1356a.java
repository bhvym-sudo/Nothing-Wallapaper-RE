package p064g3;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import com.android.wallpaper.asset.a;

/* JADX INFO: renamed from: g3.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1356a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f21152a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f21153b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f21154c;

    public AbstractC1356a(String str, String str2, int i10) {
        this.f21152a = str;
        this.f21153b = str2;
        this.f21154c = i10;
    }

    public boolean a(String str) {
        return false;
    }

    public String b() {
        return this.f21153b;
    }

    public Drawable c(Context context) {
        return null;
    }

    public int d() {
        return 40;
    }

    public int e() {
        return this.f21154c;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof AbstractC1356a)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        return TextUtils.equals(b(), ((AbstractC1356a) obj).b());
    }

    public x f() {
        return null;
    }

    public abstract a g(Context context);

    public String h() {
        return this.f21152a;
    }

    public int hashCode() {
        String str = this.f21153b;
        return str == null ? super.hashCode() : str.hashCode();
    }

    public B i() {
        return null;
    }

    public boolean j() {
        return false;
    }

    public abstract void k(Activity activity, int i10);

    public boolean l() {
        return false;
    }

    public boolean m() {
        return false;
    }

    public boolean n() {
        return false;
    }
}
