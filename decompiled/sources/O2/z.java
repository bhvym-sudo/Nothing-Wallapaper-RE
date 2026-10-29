package O2;

import kotlin.jvm.internal.AbstractC1457h;

/* JADX INFO: loaded from: classes.dex */
public final class z {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final a f5831f = new a(null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final b f5832g = b.MOSTLY_SUNNY;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f5833a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final b f5834b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f5835c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f5836d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final p219v8.l f5837e;

    public static final class a {
        public /* synthetic */ a(AbstractC1457h abstractC1457h) {
            this();
        }

        public final z a() {
            return b(kotlin.jvm.internal.n.d(A0.a.a(), "celsius"));
        }

        public final z b(boolean z9) {
            return new z("", z.f5832g, z9, z9 ? 21 : 58, null, 16, null);
        }

        private a() {
        }
    }

    public enum b {
        UNKNOWN_ICON(0, ""),
        SUNNY(1, "a"),
        CLEAR_NIGHT(2, "f"),
        MOSTLY_SUNNY(3, "b"),
        MOSTLY_CLEAR_NIGHT(4, "n"),
        PARTLY_CLOUDY(5, "b"),
        PARTLY_CLOUDY_NIGHT(6, "n"),
        MOSTLY_CLOUDY_DAY(7, "e"),
        MOSTLY_CLOUDY_NIGHT(8, "e"),
        CLOUDY(9, "e"),
        HAZE_FOG_DUST_SMOKE(10, "d"),
        DRIZZLE(11, "c"),
        HEAVY_RAIN(12, "c"),
        SHOWERS_RAIN(13, "c"),
        SCATTERED_SHOWERS_DAY(14, "c"),
        SCATTERED_SHOWERS_NIGHT(15, "c"),
        ISOLATED_SCATTERED_TSTORMS_DAY(16, "i"),
        ISOLATED_SCATTERED_TSTORMS_NIGHT(17, "i"),
        STRONG_TSTORMS(18, "i"),
        BLIZZARD(19, "j"),
        BLOWING_SNOW(20, "j"),
        FLURRIES(21, "h"),
        HEAVY_SNOW(22, "j"),
        SCATTERED_SNOW_SHOWERS_DAY(23, "h"),
        SCATTERED_SNOW_SHOWERS_NIGHT(24, "h"),
        SNOW_SHOWERS_SNOW(25, "g"),
        MIXED_RAIN_HAIL_RAIN_SLEET(26, "h"),
        SLEET_HAIL(27, "h"),
        TORNADO(28, "l"),
        TROPICAL_STORM_HURRICANE(29, "m"),
        WINDY_BREEZY(30, "k"),
        WINTRY_MIX_RAIN_SNOW(31, "h");


        /* JADX INFO: renamed from: a0, reason: collision with root package name */
        private static final /* synthetic */ p149o8.a f5864a0 = p149o8.b.a(d());

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public static final a f5865s = new a(null);

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private final int f5873q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private final String f5874r;

        public static final class a {
            public /* synthetic */ a(AbstractC1457h abstractC1457h) {
                this();
            }

            private a() {
            }
        }

        b(int i10, String str) {
            this.f5873q = i10;
            this.f5874r = str;
        }
    }

    public z(String description, b state, boolean z9, int i10, p219v8.l lVar) {
        kotlin.jvm.internal.n.h(description, "description");
        kotlin.jvm.internal.n.h(state, "state");
        this.f5833a = description;
        this.f5834b = state;
        this.f5835c = z9;
        this.f5836d = i10;
        this.f5837e = lVar;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z)) {
            return false;
        }
        z zVar = (z) obj;
        return kotlin.jvm.internal.n.d(this.f5833a, zVar.f5833a) && this.f5834b == zVar.f5834b && this.f5835c == zVar.f5835c && this.f5836d == zVar.f5836d && kotlin.jvm.internal.n.d(this.f5837e, zVar.f5837e);
    }

    public int hashCode() {
        int iHashCode = ((((((this.f5833a.hashCode() * 31) + this.f5834b.hashCode()) * 31) + Boolean.hashCode(this.f5835c)) * 31) + Integer.hashCode(this.f5836d)) * 31;
        p219v8.l lVar = this.f5837e;
        return iHashCode + (lVar == null ? 0 : lVar.hashCode());
    }

    public String toString() {
        String str = this.f5835c ? "C" : "F";
        return this.f5834b + " (\"" + this.f5833a + "\") " + this.f5836d + "°" + str;
    }

    public /* synthetic */ z(String str, b bVar, boolean z9, int i10, p219v8.l lVar, int i11, AbstractC1457h abstractC1457h) {
        this(str, bVar, z9, i10, (i11 & 16) != 0 ? null : lVar);
    }
}
