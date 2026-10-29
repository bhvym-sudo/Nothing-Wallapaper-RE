package androidx.compose.ui.platform;

import F8.AbstractC0816i;
import F8.C0834r0;
import F8.InterfaceC0846x0;
import android.view.View;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final class A0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final A0 f11512a = new A0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final AtomicReference f11513b = new AtomicReference(z0.f12016a.c());

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f11514c = 8;

    public static final class a implements View.OnAttachStateChangeListener {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        final /* synthetic */ InterfaceC0846x0 f11515q;

        a(InterfaceC0846x0 interfaceC0846x0) {
            this.f11515q = interfaceC0846x0;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            view.removeOnAttachStateChangeListener(this);
            InterfaceC0846x0.a.a(this.f11515q, null, 1, null);
        }
    }

    static final class b extends kotlin.coroutines.jvm.internal.l implements p219v8.p {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f11516q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ p170r.A0 f11517r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        final /* synthetic */ View f11518s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(p170r.A0 a10, View view, p129m8.e eVar) {
            super(2, eVar);
            this.f11517r = a10;
            this.f11518s = view;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final p129m8.e create(Object obj, p129m8.e eVar) {
            return new b(this.f11517r, this.f11518s, eVar);
        }

        @Override // p219v8.p
        public final Object invoke(F8.L l9, p129m8.e eVar) {
            return ((b) create(l9, eVar)).invokeSuspend(p079h8.A.f21846a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objE = p139n8.b.e();
            int i10 = this.f11516q;
            try {
                if (i10 == 0) {
                    p079h8.r.b(obj);
                    p170r.A0 a10 = this.f11517r;
                    this.f11516q = 1;
                    if (a10.j0(this) == objE) {
                        return objE;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    p079h8.r.b(obj);
                }
                if (B0.f(this.f11518s) == this.f11517r) {
                    B0.i(this.f11518s, null);
                }
                return p079h8.A.f21846a;
            } catch (Throwable th) {
                if (B0.f(this.f11518s) == this.f11517r) {
                    B0.i(this.f11518s, null);
                }
                throw th;
            }
        }
    }

    private A0() {
    }

    public final p170r.A0 a(View view) {
        p170r.A0 a0A = ((z0) f11513b.get()).a(view);
        B0.i(view, a0A);
        view.addOnAttachStateChangeListener(new a(AbstractC0816i.d(C0834r0.f1894q, G8.h.b(view.getHandler(), "windowRecomposer cleanup").n1(), null, new b(a0A, view, null), 2, null)));
        return a0A;
    }
}
