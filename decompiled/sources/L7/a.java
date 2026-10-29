package L7;

import F8.AbstractC0816i;
import F8.L;
import I8.AbstractC0882h;
import I8.InterfaceC0880f;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
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
import p173r2.f;
import p219v8.p;

/* JADX INFO: loaded from: classes2.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f4812a = new a();

    /* JADX INFO: renamed from: L7.a$a, reason: collision with other inner class name */
    static final class C0165a extends l implements p {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f4813q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ c f4814r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        final /* synthetic */ InterfaceC1163x f4815s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ ImageView f4816t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        final /* synthetic */ ImageView f4817u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        final /* synthetic */ ImageView f4818v;

        /* JADX INFO: renamed from: L7.a$a$a, reason: collision with other inner class name */
        static final class C0166a extends l implements p {

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            int f4819q;

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            /* synthetic */ Object f4820r;

            /* JADX INFO: renamed from: s, reason: collision with root package name */
            final /* synthetic */ ImageView f4821s;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            final /* synthetic */ ImageView f4822t;

            /* JADX INFO: renamed from: u, reason: collision with root package name */
            final /* synthetic */ ImageView f4823u;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0166a(ImageView imageView, ImageView imageView2, ImageView imageView3, e eVar) {
                super(2, eVar);
                this.f4821s = imageView;
                this.f4822t = imageView2;
                this.f4823u = imageView3;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final e create(Object obj, e eVar) {
                C0166a c0166a = new C0166a(this.f4821s, this.f4822t, this.f4823u, eVar);
                c0166a.f4820r = obj;
                return c0166a;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                b.e();
                if (this.f4819q != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                r.b(obj);
                f fVar = (f) this.f4820r;
                this.f4821s.setVisibility(0);
                this.f4822t.setVisibility(0);
                this.f4823u.setVisibility(8);
                if (a.f4812a.c(fVar.b(), fVar.c())) {
                    this.f4821s.setVisibility(8);
                    this.f4822t.setVisibility(8);
                    this.f4823u.setVisibility(0);
                    this.f4823u.setImageResource(R.drawable.nt_ic_empty_shortcut_section);
                } else {
                    p144o3.a bVar = new o3.a.b(R.drawable.nt_ic_lockscreen_shortcut_none, new q3.a.c(R.string.nt_keyguard_quick_affordance_empty_description));
                    p134n3.b bVar2 = p134n3.b.f23260a;
                    ImageView imageView = this.f4821s;
                    p144o3.a aVarB = fVar.b();
                    if (aVarB == null) {
                        aVarB = bVar;
                    }
                    bVar2.a(imageView, aVarB);
                    ImageView imageView2 = this.f4822t;
                    p144o3.a aVarC = fVar.c();
                    if (aVarC != null) {
                        bVar = aVarC;
                    }
                    bVar2.a(imageView2, bVar);
                }
                return A.f21846a;
            }

            @Override // p219v8.p
            /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
            public final Object invoke(f fVar, e eVar) {
                return ((C0166a) create(fVar, eVar)).invokeSuspend(A.f21846a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0165a(c cVar, InterfaceC1163x interfaceC1163x, ImageView imageView, ImageView imageView2, ImageView imageView3, e eVar) {
            super(2, eVar);
            this.f4814r = cVar;
            this.f4815s = interfaceC1163x;
            this.f4816t = imageView;
            this.f4817u = imageView2;
            this.f4818v = imageView3;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final e create(Object obj, e eVar) {
            return new C0165a(this.f4814r, this.f4815s, this.f4816t, this.f4817u, this.f4818v, eVar);
        }

        @Override // p219v8.p
        public final Object invoke(L l9, e eVar) {
            return ((C0165a) create(l9, eVar)).invokeSuspend(A.f21846a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objE = b.e();
            int i10 = this.f4813q;
            if (i10 == 0) {
                r.b(obj);
                InterfaceC0880f interfaceC0880fA = AbstractC1151k.a(this.f4814r.A(), this.f4815s.getLifecycle(), AbstractC1157q.b.RESUMED);
                C0166a c0166a = new C0166a(this.f4816t, this.f4817u, this.f4818v, null);
                this.f4813q = 1;
                if (AbstractC0882h.i(interfaceC0880fA, c0166a, this) == objE) {
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

    private a() {
    }

    public static final LinearLayout b(Context context, ViewGroup parent, c viewModel, InterfaceC1163x lifecycleOwner, View.OnClickListener clickListener) {
        n.h(context, "context");
        n.h(parent, "parent");
        n.h(viewModel, "viewModel");
        n.h(lifecycleOwner, "lifecycleOwner");
        n.h(clickListener, "clickListener");
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.keyguard_quick_affordance_linked_option, parent, false);
        n.f(viewInflate, "null cannot be cast to non-null type android.widget.LinearLayout");
        LinearLayout linearLayout = (LinearLayout) viewInflate;
        linearLayout.setOnClickListener(clickListener);
        ((TextView) linearLayout.requireViewById(R.id.option_description)).setText(R.string.nt_keyguard_quick_affordance_section_title);
        linearLayout.setContentDescription(context.getResources().getString(R.string.nt_keyguard_quick_affordance_section_title));
        View viewRequireViewById = linearLayout.requireViewById(R.id.all_empty_option_icon);
        n.g(viewRequireViewById, "requireViewById(...)");
        ImageView imageView = (ImageView) viewRequireViewById;
        View viewRequireViewById2 = linearLayout.requireViewById(R.id.option_icon_1);
        n.g(viewRequireViewById2, "requireViewById(...)");
        ImageView imageView2 = (ImageView) viewRequireViewById2;
        View viewRequireViewById3 = linearLayout.requireViewById(R.id.option_icon_2);
        n.g(viewRequireViewById3, "requireViewById(...)");
        AbstractC0816i.d(AbstractC1164y.a(lifecycleOwner), null, null, new C0165a(viewModel, lifecycleOwner, imageView2, (ImageView) viewRequireViewById3, imageView, null), 3, null);
        return linearLayout;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean c(p144o3.a aVar, p144o3.a aVar2) {
        return (aVar == null || d(aVar)) && (aVar2 == null || d(aVar2));
    }

    private final boolean d(p144o3.a aVar) {
        return (aVar instanceof o3.a.b) && ((o3.a.b) aVar).b() == R.drawable.link_off;
    }
}
