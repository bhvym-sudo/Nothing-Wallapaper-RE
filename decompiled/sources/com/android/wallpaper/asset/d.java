package com.android.wallpaper.asset;

import android.app.Activity;
import android.app.ActivityManager;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.graphics.Rect;
import android.util.LruCache;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public class d extends com.android.wallpaper.asset.a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static int f15859d = 104857600;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static LruCache f15860e = new a(f15859d);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f15861b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final com.android.wallpaper.asset.a f15862c;

    class a extends LruCache {
        a(int i10) {
            super(i10);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.util.LruCache
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int sizeOf(b bVar, Bitmap bitmap) {
            return bitmap.getByteCount();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final com.android.wallpaper.asset.a f15863a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final int f15864b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final int f15865c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final boolean f15866d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final Rect f15867e;

        b(com.android.wallpaper.asset.a aVar, int i10, int i11) {
            this(aVar, i10, i11, false, null);
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return Objects.equals(this.f15863a, bVar.f15863a) && bVar.f15864b == this.f15864b && bVar.f15865c == this.f15865c && bVar.f15866d == this.f15866d && Objects.equals(this.f15867e, bVar.f15867e);
        }

        public int hashCode() {
            return Objects.hash(this.f15863a, Integer.valueOf(this.f15864b), Integer.valueOf(this.f15865c));
        }

        b(com.android.wallpaper.asset.a aVar, int i10, int i11, boolean z9, Rect rect) {
            this.f15863a = aVar;
            this.f15864b = i10;
            this.f15865c = i11;
            this.f15866d = z9;
            this.f15867e = rect;
        }
    }

    public d(Context context, com.android.wallpaper.asset.a aVar) {
        this.f15862c = aVar instanceof d ? ((d) aVar).f15862c : aVar;
        this.f15861b = p161q0.b.a((ActivityManager) context.getApplicationContext().getSystemService("activity"));
    }

    public static /* synthetic */ void t(b bVar, com.android.wallpaper.asset.a.d dVar, Bitmap bitmap) {
        if (bitmap != null) {
            f15860e.put(bVar, bitmap);
        }
        dVar.a(bitmap);
    }

    public static /* synthetic */ void u(b bVar, com.android.wallpaper.asset.a.d dVar, Bitmap bitmap) {
        if (bitmap != null) {
            f15860e.put(bVar, bitmap);
        }
        dVar.a(bitmap);
    }

    @Override // com.android.wallpaper.asset.a
    protected void e(Context context, Point point, Rect rect, boolean z9) {
        this.f15862c.e(context, point, rect, z9);
    }

    @Override // com.android.wallpaper.asset.a
    public void g(int i10, int i11, boolean z9, final com.android.wallpaper.asset.a.d dVar) {
        if (this.f15861b) {
            com.android.wallpaper.asset.a aVar = this.f15862c;
            Objects.requireNonNull(dVar);
            aVar.g(i10, i11, z9, new com.android.wallpaper.asset.a.d() { // from class: b3.e
                @Override // com.android.wallpaper.asset.a.d
                public final void a(Bitmap bitmap) {
                    dVar.a(bitmap);
                }
            });
        } else {
            final b bVar = new b(this.f15862c, i10, i11);
            Bitmap bitmap = (Bitmap) f15860e.get(bVar);
            if (bitmap != null) {
                dVar.a(bitmap);
            } else {
                this.f15862c.g(i10, i11, z9, new com.android.wallpaper.asset.a.d() { // from class: com.android.wallpaper.asset.c
                    @Override // com.android.wallpaper.asset.a.d
                    public final void a(Bitmap bitmap2) {
                        d.t(bVar, dVar, bitmap2);
                    }
                });
            }
        }
    }

    @Override // com.android.wallpaper.asset.a
    public void i(Rect rect, int i10, int i11, boolean z9, final com.android.wallpaper.asset.a.d dVar) {
        if (this.f15861b) {
            this.f15862c.i(rect, i10, i11, z9, dVar);
            return;
        }
        final b bVar = new b(this.f15862c, i10, i11, z9, rect);
        Bitmap bitmap = (Bitmap) f15860e.get(bVar);
        if (bitmap != null) {
            dVar.a(bitmap);
        } else {
            this.f15862c.i(rect, i10, i11, z9, new com.android.wallpaper.asset.a.d() { // from class: com.android.wallpaper.asset.b
                @Override // com.android.wallpaper.asset.a.d
                public final void a(Bitmap bitmap2) {
                    d.u(bVar, dVar, bitmap2);
                }
            });
        }
    }

    @Override // com.android.wallpaper.asset.a
    public void j(Activity activity, com.android.wallpaper.asset.a.e eVar) {
        this.f15862c.j(activity, eVar);
    }
}
