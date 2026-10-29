package p051f0;

import kotlin.jvm.internal.AbstractC1457h;
import kotlin.jvm.internal.o;
import p170r.b1;
import p219v8.l;

/* JADX INFO: loaded from: classes.dex */
public final class h implements g.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final s f20731a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final t f20732b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final y f20733c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final k f20734d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final r f20735e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final l f20736f;

    static final class a extends o implements l {
        a() {
            super(1);
        }

        @Override // p219v8.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object f(x xVar) {
            return h.this.f(x.b(xVar, null, null, 0, 0, null, 30, null)).getValue();
        }
    }

    static final class b extends o implements l {

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        final /* synthetic */ x f20739s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(x xVar) {
            super(1);
            this.f20739s = xVar;
        }

        @Override // p219v8.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final z f(l lVar) {
            z zVarA = h.this.f20734d.a(this.f20739s, h.this.e(), lVar, h.this.f20736f);
            if (zVarA != null) {
                return zVarA;
            }
            z zVarA2 = h.this.f20735e.a(this.f20739s, h.this.e(), lVar, h.this.f20736f);
            if (zVarA2 != null) {
                return zVarA2;
            }
            throw new IllegalStateException("Could not load font");
        }
    }

    public h(s sVar, t tVar, y yVar, k kVar, r rVar) {
        this.f20731a = sVar;
        this.f20732b = tVar;
        this.f20733c = yVar;
        this.f20734d = kVar;
        this.f20735e = rVar;
        this.f20736f = new a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final b1 f(x xVar) {
        return this.f20733c.c(xVar, new b(xVar));
    }

    public final s e() {
        return this.f20731a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ h(s sVar, t tVar, y yVar, k kVar, r rVar, int i10, AbstractC1457h abstractC1457h) {
        this(sVar, (i10 & 2) != 0 ? t.f20775a.a() : tVar, (i10 & 4) != 0 ? i.b() : yVar, (i10 & 8) != 0 ? new k(i.a(), null, 2, 0 == true ? 1 : 0) : kVar, (i10 & 16) != 0 ? new r() : rVar);
    }
}
