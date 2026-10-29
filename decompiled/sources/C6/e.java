package C6;

import com.nothing.wallpaper.R;
import kotlin.jvm.internal.AbstractC1457h;
import kotlin.jvm.internal.n;

/* JADX INFO: loaded from: classes2.dex */
public abstract class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f639a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f640b;

    public static final class a extends e {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a f641c = new a();

        private a() {
            super("Depth", R.string.effect_depth, null);
        }

        @Override // C6.e
        public E6.a.C0050a b(String str) {
            n.h(str, "str");
            return new E6.a.C0050a(f641c);
        }
    }

    public static final class b extends e {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final b f642c = new b();

        private b() {
            super("Glass", R.string.effect_glass, null);
        }

        @Override // C6.e
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public F6.a.b b(String str) {
            n.h(str, "str");
            return F6.a.b.f1732d.b(str);
        }
    }

    public static final class c extends e {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final c f643c = new c();

        private c() {
            super("ORIGIN", R.string.effect_none, null);
        }

        @Override // C6.e
        public E6.a.C0050a b(String str) {
            n.h(str, "str");
            return null;
        }
    }

    public /* synthetic */ e(String str, int i10, AbstractC1457h abstractC1457h) {
        this(str, i10);
    }

    public final String a() {
        return this.f639a;
    }

    public abstract E6.a.C0050a b(String str);

    private e(String str, int i10) {
        this.f639a = str;
        this.f640b = i10;
    }
}
