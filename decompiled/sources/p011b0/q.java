package p011b0;

import C8.k;
import kotlin.jvm.internal.AbstractC1457h;
import kotlin.jvm.internal.o;
import p219v8.p;

/* JADX INFO: loaded from: classes.dex */
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f14672a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final p f14673b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f14674c;

    static final class a extends o implements p {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public static final a f14675r = new a();

        a() {
            super(2);
        }

        @Override // p219v8.p
        public final Object invoke(Object obj, Object obj2) {
            return obj == null ? obj2 : obj;
        }
    }

    public q(String str, p pVar) {
        this.f14672a = str;
        this.f14673b = pVar;
    }

    public final String a() {
        return this.f14672a;
    }

    public final boolean b() {
        return this.f14674c;
    }

    public final Object c(Object obj, Object obj2) {
        return this.f14673b.invoke(obj, obj2);
    }

    public final void d(r rVar, k kVar, Object obj) {
        rVar.a(this, obj);
    }

    public String toString() {
        return "AccessibilityKey: " + this.f14672a;
    }

    public /* synthetic */ q(String str, p pVar, int i10, AbstractC1457h abstractC1457h) {
        this(str, (i10 & 2) != 0 ? a.f14675r : pVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public q(String str, boolean z9) {
        this(str, null, 2, 0 == true ? 1 : 0);
        this.f14674c = z9;
    }

    public q(String str, boolean z9, p pVar) {
        this(str, pVar);
        this.f14674c = z9;
    }
}
