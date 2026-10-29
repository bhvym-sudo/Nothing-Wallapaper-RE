package C6;

import android.graphics.Rect;
import kotlin.jvm.internal.n;

/* JADX INFO: loaded from: classes2.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Rect f633a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final float f634b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final float f635c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Rect f636d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final p079h8.h f637e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final float f638f;

    public d(Rect imageScaledRect, float f10, float f11, Rect wallpaperScaledRect) {
        n.h(imageScaledRect, "imageScaledRect");
        n.h(wallpaperScaledRect, "wallpaperScaledRect");
        this.f633a = imageScaledRect;
        this.f634b = f10;
        this.f635c = f11;
        this.f636d = wallpaperScaledRect;
        this.f637e = p079h8.i.b(new p219v8.a() { // from class: C6.c
            @Override // p219v8.a
            public final Object invoke() {
                return d.h(this.f632q);
            }
        });
        this.f638f = f10 * f11;
    }

    public static /* synthetic */ d c(d dVar, Rect rect, float f10, float f11, Rect rect2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            rect = dVar.f633a;
        }
        if ((i10 & 2) != 0) {
            f10 = dVar.f634b;
        }
        if ((i10 & 4) != 0) {
            f11 = dVar.f635c;
        }
        if ((i10 & 8) != 0) {
            rect2 = dVar.f636d;
        }
        return dVar.b(rect, f10, f11, rect2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Rect h(d dVar) {
        return new Rect((int) Math.floor(dVar.f633a.left / dVar.f634b), (int) Math.floor(dVar.f633a.top / dVar.f634b), (int) Math.ceil(dVar.f633a.right / dVar.f634b), (int) Math.ceil(dVar.f633a.bottom / dVar.f634b));
    }

    public final d b(Rect imageScaledRect, float f10, float f11, Rect wallpaperScaledRect) {
        n.h(imageScaledRect, "imageScaledRect");
        n.h(wallpaperScaledRect, "wallpaperScaledRect");
        return new d(imageScaledRect, f10, f11, wallpaperScaledRect);
    }

    public final Rect d() {
        return this.f633a;
    }

    public final Rect e() {
        return (Rect) this.f637e.getValue();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return n.d(this.f633a, dVar.f633a) && Float.compare(this.f634b, dVar.f634b) == 0 && Float.compare(this.f635c, dVar.f635c) == 0 && n.d(this.f636d, dVar.f636d);
    }

    public final float f() {
        return this.f638f;
    }

    public final Rect g() {
        return this.f636d;
    }

    public int hashCode() {
        return (((((this.f633a.hashCode() * 31) + Float.hashCode(this.f634b)) * 31) + Float.hashCode(this.f635c)) * 31) + this.f636d.hashCode();
    }

    public String toString() {
        return "CropRect(imageScaledRect=" + this.f633a + ", wallpaperScale=" + this.f634b + ", screenScale=" + this.f635c + ", wallpaperScaledRect=" + this.f636d + ", rawRect=" + e() + ", scale=" + this.f638f + ")";
    }
}
