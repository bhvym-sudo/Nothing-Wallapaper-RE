package p064g3;

import android.app.WallpaperColors;
import android.app.WallpaperInfo;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f21243a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f21244b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f21245c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected final WallpaperInfo f21246d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f21247e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final String f21248f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final WallpaperColors f21249g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f21250h;

    public y(List list, String str, String str2, WallpaperInfo wallpaperInfo, String str3, String str4, WallpaperColors wallpaperColors, boolean z9) {
        this.f21243a = list;
        this.f21244b = str;
        this.f21245c = str2;
        this.f21246d = wallpaperInfo;
        this.f21247e = str3;
        this.f21248f = str4;
        this.f21249g = wallpaperColors;
        this.f21250h = z9;
    }

    public String a() {
        return this.f21244b;
    }

    public List b() {
        return this.f21243a;
    }

    public String c() {
        return this.f21245c;
    }

    public WallpaperColors d() {
        return this.f21249g;
    }

    public WallpaperInfo e() {
        throw new UnsupportedOperationException("Not implemented for static wallpapers");
    }

    public String f() {
        return this.f21248f;
    }

    public String g() {
        return this.f21247e;
    }

    public boolean h() {
        return this.f21250h;
    }

    public void i(boolean z9) {
        this.f21250h = z9;
    }
}
