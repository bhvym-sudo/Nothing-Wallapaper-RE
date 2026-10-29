package F8;

import kotlin.jvm.internal.AbstractC1457h;

/* JADX INFO: renamed from: F8.z, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C0849z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f1904a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InterfaceC0820k f1905b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p219v8.q f1906c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f1907d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Throwable f1908e;

    public C0849z(Object obj, InterfaceC0820k interfaceC0820k, p219v8.q qVar, Object obj2, Throwable th) {
        this.f1904a = obj;
        this.f1905b = interfaceC0820k;
        this.f1906c = qVar;
        this.f1907d = obj2;
        this.f1908e = th;
    }

    public static /* synthetic */ C0849z b(C0849z c0849z, Object obj, InterfaceC0820k interfaceC0820k, p219v8.q qVar, Object obj2, Throwable th, int i10, Object obj3) {
        if ((i10 & 1) != 0) {
            obj = c0849z.f1904a;
        }
        if ((i10 & 2) != 0) {
            interfaceC0820k = c0849z.f1905b;
        }
        if ((i10 & 4) != 0) {
            qVar = c0849z.f1906c;
        }
        if ((i10 & 8) != 0) {
            obj2 = c0849z.f1907d;
        }
        if ((i10 & 16) != 0) {
            th = c0849z.f1908e;
        }
        Throwable th2 = th;
        p219v8.q qVar2 = qVar;
        return c0849z.a(obj, interfaceC0820k, qVar2, obj2, th2);
    }

    public final C0849z a(Object obj, InterfaceC0820k interfaceC0820k, p219v8.q qVar, Object obj2, Throwable th) {
        return new C0849z(obj, interfaceC0820k, qVar, obj2, th);
    }

    public final boolean c() {
        return this.f1908e != null;
    }

    public final void d(C0826n c0826n, Throwable th) {
        InterfaceC0820k interfaceC0820k = this.f1905b;
        if (interfaceC0820k != null) {
            c0826n.n(interfaceC0820k, th);
        }
        p219v8.q qVar = this.f1906c;
        if (qVar != null) {
            c0826n.p(qVar, th, this.f1904a);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0849z)) {
            return false;
        }
        C0849z c0849z = (C0849z) obj;
        return kotlin.jvm.internal.n.d(this.f1904a, c0849z.f1904a) && kotlin.jvm.internal.n.d(this.f1905b, c0849z.f1905b) && kotlin.jvm.internal.n.d(this.f1906c, c0849z.f1906c) && kotlin.jvm.internal.n.d(this.f1907d, c0849z.f1907d) && kotlin.jvm.internal.n.d(this.f1908e, c0849z.f1908e);
    }

    public int hashCode() {
        Object obj = this.f1904a;
        int iHashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        InterfaceC0820k interfaceC0820k = this.f1905b;
        int iHashCode2 = (iHashCode + (interfaceC0820k == null ? 0 : interfaceC0820k.hashCode())) * 31;
        p219v8.q qVar = this.f1906c;
        int iHashCode3 = (iHashCode2 + (qVar == null ? 0 : qVar.hashCode())) * 31;
        Object obj2 = this.f1907d;
        int iHashCode4 = (iHashCode3 + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        Throwable th = this.f1908e;
        return iHashCode4 + (th != null ? th.hashCode() : 0);
    }

    public String toString() {
        return "CompletedContinuation(result=" + this.f1904a + ", cancelHandler=" + this.f1905b + ", onCancellation=" + this.f1906c + ", idempotentResume=" + this.f1907d + ", cancelCause=" + this.f1908e + ')';
    }

    public /* synthetic */ C0849z(Object obj, InterfaceC0820k interfaceC0820k, p219v8.q qVar, Object obj2, Throwable th, int i10, AbstractC1457h abstractC1457h) {
        this(obj, (i10 & 2) != 0 ? null : interfaceC0820k, (i10 & 4) != 0 ? null : qVar, (i10 & 8) != 0 ? null : obj2, (i10 & 16) != 0 ? null : th);
    }
}
