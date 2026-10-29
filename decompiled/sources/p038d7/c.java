package p038d7;

import D8.k;
import F8.AbstractC0816i;
import F8.InterfaceC0807d0;
import F8.InterfaceC0846x0;
import F8.L;
import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import androidx.core.view.K;
import androidx.lifecycle.AbstractC1157q;
import androidx.lifecycle.AbstractC1164y;
import androidx.lifecycle.InterfaceC1163x;
import androidx.lifecycle.N;
import com.nothing.wallpaper.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.n;
import p064g3.f;
import p079h8.A;
import p079h8.o;
import p079h8.r;
import p129m8.e;
import p139n8.b;
import p219v8.p;

/* JADX INFO: loaded from: classes2.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c f19695a = new c();

    static final class a extends l implements p {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f19696q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ InterfaceC1163x f19697r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        final /* synthetic */ FrameLayout f19698s;

        /* JADX INFO: renamed from: d7.c$a$a, reason: collision with other inner class name */
        static final class C0523a extends l implements p {

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            int f19699q;

            C0523a(e eVar) {
                super(2, eVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final e create(Object obj, e eVar) {
                return new C0523a(eVar);
            }

            @Override // p219v8.p
            public final Object invoke(L l9, e eVar) {
                return ((C0523a) create(l9, eVar)).invokeSuspend(A.f21846a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                b.e();
                if (this.f19699q != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                r.b(obj);
                com.nothing.wallpaper.common.log.c.c("NTCustomizationPickerBinder in started");
                return A.f21846a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(InterfaceC1163x interfaceC1163x, FrameLayout frameLayout, e eVar) {
            super(2, eVar);
            this.f19697r = interfaceC1163x;
            this.f19698s = frameLayout;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final o u(View view) {
            Object tag = view.getTag();
            return new o(view, tag instanceof f ? (f) tag : null);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final e create(Object obj, e eVar) {
            return new a(this.f19697r, this.f19698s, eVar);
        }

        @Override // p219v8.p
        public final Object invoke(L l9, e eVar) {
            return ((a) create(l9, eVar)).invokeSuspend(A.f21846a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objE = b.e();
            int i10 = this.f19696q;
            if (i10 == 0) {
                r.b(obj);
                InterfaceC1163x interfaceC1163x = this.f19697r;
                AbstractC1157q.b bVar = AbstractC1157q.b.STARTED;
                C0523a c0523a = new C0523a(null);
                this.f19696q = 1;
                if (N.b(interfaceC1163x, bVar, c0523a, this) == objE) {
                    return objE;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                r.b(obj);
            }
            for (o oVar : k.x(K.b(this.f19698s), new p219v8.l() { // from class: d7.b
                @Override // p219v8.l
                public final Object f(Object obj2) {
                    return c.a.u((View) obj2);
                }
            })) {
                f fVar = (f) oVar.d();
                if (fVar != null) {
                    fVar.a();
                }
                ((View) oVar.c()).setTag(null);
            }
            this.f19698s.removeAllViews();
            return A.f21846a;
        }
    }

    private c() {
    }

    public static final InterfaceC0807d0 b(View container, InterfaceC1163x lifecycleOwner, List availableSections, p219v8.a highPriorityClickEvent) {
        n.h(container, "container");
        n.h(lifecycleOwner, "lifecycleOwner");
        n.h(availableSections, "availableSections");
        n.h(highPriorityClickEvent, "highPriorityClickEvent");
        View viewRequireViewById = container.requireViewById(R.id.screen_preview_click_view);
        n.g(viewRequireViewById, "requireViewById(...)");
        FrameLayout frameLayout = (FrameLayout) viewRequireViewById;
        c cVar = f19695a;
        Context context = frameLayout.getContext();
        n.g(context, "getContext(...)");
        cVar.d(context, frameLayout, availableSections, highPriorityClickEvent);
        final InterfaceC0846x0 interfaceC0846x0D = AbstractC0816i.d(AbstractC1164y.a(lifecycleOwner), null, null, new a(lifecycleOwner, frameLayout, null), 3, null);
        return new InterfaceC0807d0() { // from class: d7.a
            @Override // F8.InterfaceC0807d0
            public final void dispose() {
                c.c(interfaceC0846x0D);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(InterfaceC0846x0 interfaceC0846x0) {
        InterfaceC0846x0.a.a(interfaceC0846x0, null, 1, null);
    }

    private final void d(Context context, View view, List list, p219v8.a aVar) {
        ArrayList<f> arrayList = new ArrayList();
        for (Object obj : list) {
            if (((f) obj).e(context)) {
                arrayList.add(obj);
            }
        }
        for (f fVar : arrayList) {
            View viewC = fVar.c(view, context);
            if (viewC != null) {
                viewC.setTag(fVar);
            }
            if (fVar instanceof p178r7.c) {
                ((p178r7.c) fVar).L(view, aVar);
            }
        }
    }
}
