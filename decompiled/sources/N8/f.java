package N8;

import kotlin.jvm.internal.AbstractC1457h;
import p219v8.q;

/* JADX INFO: loaded from: classes2.dex */
public final class f implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f5401a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final q f5402b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final q f5403c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final q f5404d;

    public f(Object obj, q qVar, q qVar2) {
        this.f5401a = obj;
        this.f5402b = qVar;
        this.f5403c = qVar2;
        this.f5404d = l.f5428a;
    }

    @Override // N8.i
    public q a() {
        return this.f5402b;
    }

    @Override // N8.i
    public Object b() {
        return this.f5401a;
    }

    @Override // N8.i
    public q c() {
        return this.f5403c;
    }

    @Override // N8.i
    public q d() {
        return this.f5404d;
    }

    public /* synthetic */ f(Object obj, q qVar, q qVar2, int i10, AbstractC1457h abstractC1457h) {
        this(obj, qVar, (i10 & 4) != 0 ? null : qVar2);
    }
}
