package p011b0;

import B8.b;
import B8.h;
import kotlin.jvm.internal.AbstractC1457h;
import kotlin.jvm.internal.n;

/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f14553d = new a(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final c f14554e = new c(0.0f, h.b(0.0f, 0.0f), 0, 4, null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final float f14555a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final b f14556b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f14557c;

    public static final class a {
        public /* synthetic */ a(AbstractC1457h abstractC1457h) {
            this();
        }

        public final c a() {
            return c.f14554e;
        }

        private a() {
        }
    }

    public c(float f10, b bVar, int i10) {
        this.f14555a = f10;
        this.f14556b = bVar;
        this.f14557c = i10;
        if (Float.isNaN(f10)) {
            throw new IllegalArgumentException("current must not be NaN");
        }
    }

    public final float b() {
        return this.f14555a;
    }

    public final b c() {
        return this.f14556b;
    }

    public final int d() {
        return this.f14557c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f14555a == cVar.f14555a && n.d(this.f14556b, cVar.f14556b) && this.f14557c == cVar.f14557c;
    }

    public int hashCode() {
        return (((Float.hashCode(this.f14555a) * 31) + this.f14556b.hashCode()) * 31) + this.f14557c;
    }

    public String toString() {
        return "ProgressBarRangeInfo(current=" + this.f14555a + ", range=" + this.f14556b + ", steps=" + this.f14557c + ')';
    }

    public /* synthetic */ c(float f10, b bVar, int i10, int i11, AbstractC1457h abstractC1457h) {
        this(f10, bVar, (i11 & 4) != 0 ? 0 : i10);
    }
}
