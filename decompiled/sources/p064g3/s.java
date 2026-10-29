package p064g3;

import android.app.WallpaperColors;
import kotlin.jvm.internal.AbstractC1457h;
import kotlin.jvm.internal.n;

/* JADX INFO: loaded from: classes.dex */
public abstract class s {

    public static final class a extends s {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final WallpaperColors f21223a;

        public a(WallpaperColors wallpaperColors) {
            super(null);
            this.f21223a = wallpaperColors;
        }

        public final WallpaperColors a() {
            return this.f21223a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && n.d(this.f21223a, ((a) obj).f21223a);
        }

        public int hashCode() {
            WallpaperColors wallpaperColors = this.f21223a;
            if (wallpaperColors == null) {
                return 0;
            }
            return wallpaperColors.hashCode();
        }

        public String toString() {
            return "Loaded(colors=" + this.f21223a + ")";
        }
    }

    public static final class b extends s {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f21224a = new b();

        private b() {
            super(null);
        }
    }

    public /* synthetic */ s(AbstractC1457h abstractC1457h) {
        this();
    }

    private s() {
    }
}
