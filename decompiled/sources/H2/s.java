package H2;

import android.graphics.Typeface;
import android.util.LruCache;
import kotlin.jvm.internal.AbstractC1457h;

/* JADX INFO: loaded from: classes.dex */
public final class s implements r {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f2412e = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Typeface f2413a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f2414b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final LruCache f2415c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final c f2416d;

    public static final class a {
        public /* synthetic */ a(AbstractC1457h abstractC1457h) {
            this();
        }

        private a() {
        }
    }

    public s(Typeface baseTypeface, int i10) {
        kotlin.jvm.internal.n.h(baseTypeface, "baseTypeface");
        this.f2413a = baseTypeface;
        this.f2414b = i10;
        this.f2415c = new LruCache(5);
        this.f2416d = new c(b());
    }

    public int b() {
        return this.f2414b;
    }

    @Override // H2.r
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public c a() {
        return this.f2416d;
    }
}
