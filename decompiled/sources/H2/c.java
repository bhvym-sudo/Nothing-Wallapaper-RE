package H2;

import android.graphics.fonts.Font;
import android.util.LruCache;
import kotlin.jvm.internal.AbstractC1457h;

/* JADX INFO: loaded from: classes.dex */
public final class c implements b {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f2341e = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f2342a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f2343b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final LruCache f2344c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final LruCache f2345d;

    public static final class a {
        public /* synthetic */ a(AbstractC1457h abstractC1457h) {
            this();
        }

        private a() {
        }
    }

    public c(int i10) {
        this.f2342a = i10;
        int iC = c() * 2;
        this.f2343b = iC;
        this.f2344c = new LruCache(iC);
        this.f2345d = new LruCache(iC);
    }

    @Override // H2.b
    public void a(t key, Font font) {
        kotlin.jvm.internal.n.h(key, "key");
        kotlin.jvm.internal.n.h(font, "font");
        this.f2345d.put(key, font);
    }

    @Override // H2.b
    public void b(h key, Font font) {
        kotlin.jvm.internal.n.h(key, "key");
        kotlin.jvm.internal.n.h(font, "font");
        this.f2344c.put(key, font);
    }

    @Override // H2.b
    public int c() {
        return this.f2342a;
    }

    @Override // H2.b
    public Font d(h key) {
        kotlin.jvm.internal.n.h(key, "key");
        return (Font) this.f2344c.get(key);
    }

    @Override // H2.b
    public Font e(t key) {
        kotlin.jvm.internal.n.h(key, "key");
        return (Font) this.f2345d.get(key);
    }
}
