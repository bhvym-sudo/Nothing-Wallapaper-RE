package p143o2;

import F8.AbstractC0816i;
import F8.L;
import I8.AbstractC0882h;
import I8.InterfaceC0880f;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.lifecycle.AbstractC1151k;
import androidx.lifecycle.AbstractC1157q;
import androidx.lifecycle.AbstractC1164y;
import androidx.lifecycle.InterfaceC1163x;
import com.nothing.wallpaper.R;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.n;
import p079h8.A;
import p079h8.r;
import p129m8.e;
import p139n8.b;
import p173r2.c;
import p219v8.p;

/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final f f23416a = new f();

    static final class a extends l implements p {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f23417q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ c f23418r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        final /* synthetic */ InterfaceC1163x f23419s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ TextView f23420t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        final /* synthetic */ ImageView f23421u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        final /* synthetic */ ImageView f23422v;

        /* JADX INFO: renamed from: o2.f$a$a, reason: collision with other inner class name */
        static final class C0617a extends l implements p {

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            int f23423q;

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            /* synthetic */ Object f23424r;

            /* JADX INFO: renamed from: s, reason: collision with root package name */
            final /* synthetic */ TextView f23425s;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            final /* synthetic */ ImageView f23426t;

            /* JADX INFO: renamed from: u, reason: collision with root package name */
            final /* synthetic */ ImageView f23427u;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0617a(TextView textView, ImageView imageView, ImageView imageView2, e eVar) {
                super(2, eVar);
                this.f23425s = textView;
                this.f23426t = imageView;
                this.f23427u = imageView2;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final e create(Object obj, e eVar) {
                C0617a c0617a = new C0617a(this.f23425s, this.f23426t, this.f23427u, eVar);
                c0617a.f23424r = obj;
                return c0617a;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                b.e();
                if (this.f23423q != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                r.b(obj);
                p173r2.f fVar = (p173r2.f) this.f23424r;
                p154p3.a.f23694a.a(this.f23425s, fVar.a());
                if (fVar.b() != null) {
                    p134n3.b.f23260a.a(this.f23426t, fVar.b());
                }
                this.f23426t.setVisibility(fVar.b() != null ? 0 : 8);
                if (fVar.c() != null) {
                    p134n3.b.f23260a.a(this.f23427u, fVar.c());
                }
                this.f23427u.setVisibility(fVar.c() != null ? 0 : 8);
                return A.f21846a;
            }

            @Override // p219v8.p
            /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
            public final Object invoke(p173r2.f fVar, e eVar) {
                return ((C0617a) create(fVar, eVar)).invokeSuspend(A.f21846a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(c cVar, InterfaceC1163x interfaceC1163x, TextView textView, ImageView imageView, ImageView imageView2, e eVar) {
            super(2, eVar);
            this.f23418r = cVar;
            this.f23419s = interfaceC1163x;
            this.f23420t = textView;
            this.f23421u = imageView;
            this.f23422v = imageView2;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final e create(Object obj, e eVar) {
            return new a(this.f23418r, this.f23419s, this.f23420t, this.f23421u, this.f23422v, eVar);
        }

        @Override // p219v8.p
        public final Object invoke(L l9, e eVar) {
            return ((a) create(l9, eVar)).invokeSuspend(A.f21846a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objE = b.e();
            int i10 = this.f23417q;
            if (i10 == 0) {
                r.b(obj);
                InterfaceC0880f interfaceC0880fA = AbstractC1151k.a(this.f23418r.A(), this.f23419s.getLifecycle(), AbstractC1157q.b.STARTED);
                C0617a c0617a = new C0617a(this.f23420t, this.f23421u, this.f23422v, null);
                this.f23417q = 1;
                if (AbstractC0882h.i(interfaceC0880fA, c0617a, this) == objE) {
                    return objE;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                r.b(obj);
            }
            return A.f21846a;
        }
    }

    private f() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(p219v8.a aVar, View view) {
        aVar.invoke();
    }

    public final void b(View view, c viewModel, InterfaceC1163x lifecycleOwner, final p219v8.a onClicked) {
        n.h(view, "view");
        n.h(viewModel, "viewModel");
        n.h(lifecycleOwner, "lifecycleOwner");
        n.h(onClicked, "onClicked");
        view.setOnClickListener(new View.OnClickListener() { // from class: o2.e
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                f.c(onClicked, view2);
            }
        });
        View viewRequireViewById = view.requireViewById(R.id.keyguard_quick_affordance_description);
        n.g(viewRequireViewById, "requireViewById(...)");
        TextView textView = (TextView) viewRequireViewById;
        View viewRequireViewById2 = view.requireViewById(R.id.icon_1);
        n.g(viewRequireViewById2, "requireViewById(...)");
        View viewRequireViewById3 = view.requireViewById(R.id.icon_2);
        n.g(viewRequireViewById3, "requireViewById(...)");
        AbstractC0816i.d(AbstractC1164y.a(lifecycleOwner), null, null, new a(viewModel, lifecycleOwner, textView, (ImageView) viewRequireViewById2, (ImageView) viewRequireViewById3, null), 3, null);
    }
}
