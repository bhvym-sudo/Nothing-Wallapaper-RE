package p234x3;

import I8.InterfaceC0880f;
import kotlin.jvm.internal.n;
import p219v8.l;

/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f29864a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f29865b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final l f29866c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final InterfaceC0880f f29867d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final InterfaceC0880f f29868e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final InterfaceC0880f f29869f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final InterfaceC0880f f29870g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final InterfaceC0880f f29871h;

    public e(String wallpaperId, int i10, l thumbnail, InterfaceC0880f isLarge, InterfaceC0880f isProgressIndicatorVisible, InterfaceC0880f isSelectionBorderVisible, InterfaceC0880f isSelectionIconVisible, InterfaceC0880f onSelected) {
        n.h(wallpaperId, "wallpaperId");
        n.h(thumbnail, "thumbnail");
        n.h(isLarge, "isLarge");
        n.h(isProgressIndicatorVisible, "isProgressIndicatorVisible");
        n.h(isSelectionBorderVisible, "isSelectionBorderVisible");
        n.h(isSelectionIconVisible, "isSelectionIconVisible");
        n.h(onSelected, "onSelected");
        this.f29864a = wallpaperId;
        this.f29865b = i10;
        this.f29866c = thumbnail;
        this.f29867d = isLarge;
        this.f29868e = isProgressIndicatorVisible;
        this.f29869f = isSelectionBorderVisible;
        this.f29870g = isSelectionIconVisible;
        this.f29871h = onSelected;
    }

    public final InterfaceC0880f a() {
        return this.f29871h;
    }

    public final int b() {
        return this.f29865b;
    }

    public final l c() {
        return this.f29866c;
    }

    public final InterfaceC0880f d() {
        return this.f29867d;
    }

    public final InterfaceC0880f e() {
        return this.f29868e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return n.d(this.f29864a, eVar.f29864a) && this.f29865b == eVar.f29865b && n.d(this.f29866c, eVar.f29866c) && n.d(this.f29867d, eVar.f29867d) && n.d(this.f29868e, eVar.f29868e) && n.d(this.f29869f, eVar.f29869f) && n.d(this.f29870g, eVar.f29870g) && n.d(this.f29871h, eVar.f29871h);
    }

    public final InterfaceC0880f f() {
        return this.f29869f;
    }

    public final InterfaceC0880f g() {
        return this.f29870g;
    }

    public int hashCode() {
        return (((((((((((((this.f29864a.hashCode() * 31) + Integer.hashCode(this.f29865b)) * 31) + this.f29866c.hashCode()) * 31) + this.f29867d.hashCode()) * 31) + this.f29868e.hashCode()) * 31) + this.f29869f.hashCode()) * 31) + this.f29870g.hashCode()) * 31) + this.f29871h.hashCode();
    }

    public String toString() {
        return "WallpaperQuickSwitchOptionViewModel(wallpaperId=" + this.f29864a + ", placeholderColor=" + this.f29865b + ", thumbnail=" + this.f29866c + ", isLarge=" + this.f29867d + ", isProgressIndicatorVisible=" + this.f29868e + ", isSelectionBorderVisible=" + this.f29869f + ", isSelectionIconVisible=" + this.f29870g + ", onSelected=" + this.f29871h + ")";
    }
}
