package p170r;

import F8.C0826n;
import F8.InterfaceC0822l;
import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.jvm.internal.h;
import kotlin.jvm.internal.o;
import p079h8.A;
import p079h8.q;
import p129m8.e;
import p139n8.b;
import p219v8.l;

/* JADX INFO: loaded from: classes.dex */
public final class W {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f25401a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private List f25402b = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private List f25403c = new ArrayList();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f25404d = true;

    static final class a extends o implements l {

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        final /* synthetic */ InterfaceC0822l f25406s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(InterfaceC0822l interfaceC0822l) {
            super(1);
            this.f25406s = interfaceC0822l;
        }

        public final void a(Throwable th) {
            Object obj = W.this.f25401a;
            W w9 = W.this;
            InterfaceC0822l interfaceC0822l = this.f25406s;
            synchronized (obj) {
                w9.f25402b.remove(interfaceC0822l);
                A a10 = A.f21846a;
            }
        }

        @Override // p219v8.l
        public /* bridge */ /* synthetic */ Object f(Object obj) {
            a((Throwable) obj);
            return A.f21846a;
        }
    }

    public final Object c(e eVar) {
        if (e()) {
            return A.f21846a;
        }
        C0826n c0826n = new C0826n(b.c(eVar), 1);
        c0826n.G();
        synchronized (this.f25401a) {
            this.f25402b.add(c0826n);
        }
        c0826n.i(new a(c0826n));
        Object objA = c0826n.A();
        if (objA == b.e()) {
            h.c(eVar);
        }
        return objA == b.e() ? objA : A.f21846a;
    }

    public final void d() {
        synchronized (this.f25401a) {
            this.f25404d = false;
            A a10 = A.f21846a;
        }
    }

    public final boolean e() {
        boolean z9;
        synchronized (this.f25401a) {
            z9 = this.f25404d;
        }
        return z9;
    }

    public final void f() {
        synchronized (this.f25401a) {
            try {
                if (e()) {
                    return;
                }
                List list = this.f25402b;
                this.f25402b = this.f25403c;
                this.f25403c = list;
                this.f25404d = true;
                int size = list.size();
                for (int i10 = 0; i10 < size; i10++) {
                    e eVar = (e) list.get(i10);
                    q.a aVar = q.f21862r;
                    eVar.resumeWith(q.b(A.f21846a));
                }
                list.clear();
                A a10 = A.f21846a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
