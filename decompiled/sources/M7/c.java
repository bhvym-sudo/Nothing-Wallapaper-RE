package M7;

import F8.AbstractC0816i;
import F8.L;
import I8.InterfaceC0880f;
import I8.InterfaceC0881g;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.lifecycle.AbstractC1157q;
import androidx.lifecycle.AbstractC1164y;
import androidx.lifecycle.InterfaceC1163x;
import androidx.lifecycle.N;
import com.nothing.wallpaper.R;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.n;
import p079h8.A;
import p079h8.r;
import p129m8.e;
import p219v8.p;

/* JADX INFO: loaded from: classes2.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c f5096a = new c();

    static final class a extends l implements p {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f5097q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ InterfaceC1163x f5098r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        final /* synthetic */ InterfaceC0880f f5099s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ LinearLayout f5100t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        final /* synthetic */ Context f5101u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        final /* synthetic */ p228w7.a f5102v;

        /* JADX INFO: renamed from: M7.c$a$a, reason: collision with other inner class name */
        static final class C0182a extends l implements p {

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            int f5103q;

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            private /* synthetic */ Object f5104r;

            /* JADX INFO: renamed from: s, reason: collision with root package name */
            final /* synthetic */ InterfaceC0880f f5105s;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            final /* synthetic */ LinearLayout f5106t;

            /* JADX INFO: renamed from: u, reason: collision with root package name */
            final /* synthetic */ Context f5107u;

            /* JADX INFO: renamed from: v, reason: collision with root package name */
            final /* synthetic */ p228w7.a f5108v;

            /* JADX INFO: renamed from: M7.c$a$a$a, reason: collision with other inner class name */
            static final class C0183a extends l implements p {

                /* JADX INFO: renamed from: q, reason: collision with root package name */
                int f5109q;

                /* JADX INFO: renamed from: r, reason: collision with root package name */
                final /* synthetic */ InterfaceC0880f f5110r;

                /* JADX INFO: renamed from: s, reason: collision with root package name */
                final /* synthetic */ LinearLayout f5111s;

                /* JADX INFO: renamed from: t, reason: collision with root package name */
                final /* synthetic */ Context f5112t;

                /* JADX INFO: renamed from: u, reason: collision with root package name */
                final /* synthetic */ p228w7.a f5113u;

                /* JADX INFO: renamed from: M7.c$a$a$a$a, reason: collision with other inner class name */
                static final class C0184a implements InterfaceC0881g {

                    /* JADX INFO: renamed from: q, reason: collision with root package name */
                    final /* synthetic */ LinearLayout f5114q;

                    /* JADX INFO: renamed from: r, reason: collision with root package name */
                    final /* synthetic */ Context f5115r;

                    /* JADX INFO: renamed from: s, reason: collision with root package name */
                    final /* synthetic */ p228w7.a f5116s;

                    /* JADX INFO: renamed from: M7.c$a$a$a$a$a, reason: collision with other inner class name */
                    static final class C0185a extends d {

                        /* JADX INFO: renamed from: q, reason: collision with root package name */
                        Object f5117q;

                        /* JADX INFO: renamed from: r, reason: collision with root package name */
                        Object f5118r;

                        /* JADX INFO: renamed from: s, reason: collision with root package name */
                        int f5119s;

                        /* JADX INFO: renamed from: t, reason: collision with root package name */
                        /* synthetic */ Object f5120t;

                        /* JADX INFO: renamed from: v, reason: collision with root package name */
                        int f5122v;

                        C0185a(e eVar) {
                            super(eVar);
                        }

                        @Override // kotlin.coroutines.jvm.internal.a
                        public final Object invokeSuspend(Object obj) {
                            this.f5120t = obj;
                            this.f5122v |= Integer.MIN_VALUE;
                            return C0184a.this.b(null, this);
                        }
                    }

                    C0184a(LinearLayout linearLayout, Context context, p228w7.a aVar) {
                        this.f5114q = linearLayout;
                        this.f5115r = context;
                        this.f5116s = aVar;
                    }

                    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                    @Override // I8.InterfaceC0881g
                    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                    public final Object b(p208u7.c cVar, e eVar) {
                        C0185a c0185a;
                        c cVar2;
                        LinearLayout linearLayout;
                        int i10;
                        if (eVar instanceof C0185a) {
                            c0185a = (C0185a) eVar;
                            int i11 = c0185a.f5122v;
                            if ((i11 & Integer.MIN_VALUE) != 0) {
                                c0185a.f5122v = i11 - Integer.MIN_VALUE;
                            } else {
                                c0185a = new C0185a(eVar);
                            }
                        } else {
                            c0185a = new C0185a(eVar);
                        }
                        Object obj = c0185a.f5120t;
                        Object objE = p139n8.b.e();
                        int i12 = c0185a.f5122v;
                        if (i12 == 0) {
                            r.b(obj);
                            c cVar3 = c.f5096a;
                            LinearLayout linearLayout2 = this.f5114q;
                            int i13 = !cVar3.j(this.f5115r, this.f5116s) ? 1 : 0;
                            p228w7.a aVar = this.f5116s;
                            c0185a.f5117q = cVar3;
                            c0185a.f5118r = linearLayout2;
                            c0185a.f5119s = i13;
                            c0185a.f5122v = 1;
                            Object objA = aVar.a(cVar, c0185a);
                            if (objA == objE) {
                                return objE;
                            }
                            cVar2 = cVar3;
                            linearLayout = linearLayout2;
                            obj = objA;
                            i10 = i13;
                        } else {
                            if (i12 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            i10 = c0185a.f5119s;
                            linearLayout = (LinearLayout) c0185a.f5118r;
                            cVar2 = (c) c0185a.f5117q;
                            r.b(obj);
                        }
                        cVar2.g(linearLayout, i10 != 0, (Drawable) obj);
                        return A.f21846a;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0183a(InterfaceC0880f interfaceC0880f, LinearLayout linearLayout, Context context, p228w7.a aVar, e eVar) {
                    super(2, eVar);
                    this.f5110r = interfaceC0880f;
                    this.f5111s = linearLayout;
                    this.f5112t = context;
                    this.f5113u = aVar;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final e create(Object obj, e eVar) {
                    return new C0183a(this.f5110r, this.f5111s, this.f5112t, this.f5113u, eVar);
                }

                @Override // p219v8.p
                public final Object invoke(L l9, e eVar) {
                    return ((C0183a) create(l9, eVar)).invokeSuspend(A.f21846a);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    Object objE = p139n8.b.e();
                    int i10 = this.f5109q;
                    if (i10 == 0) {
                        r.b(obj);
                        InterfaceC0880f interfaceC0880f = this.f5110r;
                        C0184a c0184a = new C0184a(this.f5111s, this.f5112t, this.f5113u);
                        this.f5109q = 1;
                        if (interfaceC0880f.a(c0184a, this) == objE) {
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

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0182a(InterfaceC0880f interfaceC0880f, LinearLayout linearLayout, Context context, p228w7.a aVar, e eVar) {
                super(2, eVar);
                this.f5105s = interfaceC0880f;
                this.f5106t = linearLayout;
                this.f5107u = context;
                this.f5108v = aVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final e create(Object obj, e eVar) {
                C0182a c0182a = new C0182a(this.f5105s, this.f5106t, this.f5107u, this.f5108v, eVar);
                c0182a.f5104r = obj;
                return c0182a;
            }

            @Override // p219v8.p
            public final Object invoke(L l9, e eVar) {
                return ((C0182a) create(l9, eVar)).invokeSuspend(A.f21846a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                p139n8.b.e();
                if (this.f5103q != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                r.b(obj);
                AbstractC0816i.d((L) this.f5104r, null, null, new C0183a(this.f5105s, this.f5106t, this.f5107u, this.f5108v, null), 3, null);
                return A.f21846a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(InterfaceC1163x interfaceC1163x, InterfaceC0880f interfaceC0880f, LinearLayout linearLayout, Context context, p228w7.a aVar, e eVar) {
            super(2, eVar);
            this.f5098r = interfaceC1163x;
            this.f5099s = interfaceC0880f;
            this.f5100t = linearLayout;
            this.f5101u = context;
            this.f5102v = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final e create(Object obj, e eVar) {
            return new a(this.f5098r, this.f5099s, this.f5100t, this.f5101u, this.f5102v, eVar);
        }

        @Override // p219v8.p
        public final Object invoke(L l9, e eVar) {
            return ((a) create(l9, eVar)).invokeSuspend(A.f21846a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objE = p139n8.b.e();
            int i10 = this.f5097q;
            if (i10 == 0) {
                r.b(obj);
                InterfaceC1163x interfaceC1163x = this.f5098r;
                AbstractC1157q.b bVar = AbstractC1157q.b.STARTED;
                C0182a c0182a = new C0182a(this.f5099s, this.f5100t, this.f5101u, this.f5102v, null);
                this.f5097q = 1;
                if (N.b(interfaceC1163x, bVar, c0182a, this) == objE) {
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

    private c() {
    }

    public static final LinearLayout e(Context context, ViewGroup parent, int i10, InterfaceC1163x lifecycleOwner, p228w7.a interactor) {
        n.h(context, "context");
        n.h(parent, "parent");
        n.h(lifecycleOwner, "lifecycleOwner");
        n.h(interactor, "interactor");
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.general_linked_option, parent, false);
        n.f(viewInflate, "null cannot be cast to non-null type android.widget.LinearLayout");
        LinearLayout linearLayout = (LinearLayout) viewInflate;
        ((TextView) linearLayout.requireViewById(R.id.option_description)).setText(i10);
        linearLayout.setContentDescription(context.getResources().getString(i10));
        InterfaceC0880f interfaceC0880fB = interactor.b();
        if (interfaceC0880fB == null) {
            f5096a.g(linearLayout, false, null);
            return linearLayout;
        }
        AbstractC0816i.d(AbstractC1164y.a(lifecycleOwner), null, null, new a(lifecycleOwner, interfaceC0880fB, linearLayout, context, interactor, null), 3, null);
        return linearLayout;
    }

    public static final LinearLayout f(Context context, ViewGroup parent, Integer num, ImageView.ScaleType scaleType, int i10, View.OnClickListener onClickListener) {
        n.h(context, "context");
        n.h(parent, "parent");
        n.h(scaleType, "scaleType");
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.general_linked_option, parent, false);
        n.f(viewInflate, "null cannot be cast to non-null type android.widget.LinearLayout");
        LinearLayout linearLayout = (LinearLayout) viewInflate;
        ImageView imageView = (ImageView) linearLayout.requireViewById(R.id.option_icon);
        imageView.setScaleType(scaleType);
        if (num != null) {
            imageView.setImageResource(num.intValue());
        }
        ((TextView) linearLayout.requireViewById(R.id.option_description)).setText(i10);
        linearLayout.setOnClickListener(onClickListener);
        linearLayout.setContentDescription(context.getResources().getString(i10));
        return linearLayout;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:11:0x0056  */
    public final void g(final LinearLayout linearLayout, boolean z9, Drawable drawable) {
        View viewRequireViewById = linearLayout.requireViewById(R.id.option_icon);
        n.g(viewRequireViewById, "requireViewById(...)");
        ImageView imageView = (ImageView) viewRequireViewById;
        View viewRequireViewById2 = linearLayout.requireViewById(R.id.option_icon_container);
        n.g(viewRequireViewById2, "requireViewById(...)");
        if (z9) {
            linearLayout.setAlpha(1.0f);
            imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
            imageView.setImageDrawable(drawable);
            linearLayout.setClickable(true);
            linearLayout.setOnClickListener(new View.OnClickListener() { // from class: M7.a
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    c.h(linearLayout, view);
                }
            });
            return;
        }
        linearLayout.setAlpha(0.3f);
        if (drawable != null) {
            Context context = linearLayout.getContext();
            n.g(context, "getContext(...)");
            if (O6.b.b(context)) {
                imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
                imageView.setImageDrawable(drawable);
            } else {
                imageView.setScaleType(ImageView.ScaleType.FIT_XY);
                imageView.setImageResource(R.drawable.icon_pack_default_icon);
            }
        } else {
            imageView.setScaleType(ImageView.ScaleType.FIT_XY);
            imageView.setImageResource(R.drawable.icon_pack_default_icon);
        }
        Context context2 = linearLayout.getContext();
        n.g(context2, "getContext(...)");
        linearLayout.setClickable(O6.b.b(context2));
        linearLayout.setOnClickListener(new View.OnClickListener() { // from class: M7.b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                c.i(linearLayout, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void h(LinearLayout linearLayout, View view) {
        linearLayout.getContext().startActivity(p058f7.a.b());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i(LinearLayout linearLayout, View view) {
        Context context = linearLayout.getContext();
        n.g(context, "getContext(...)");
        if (O6.b.b(context)) {
            Toast.makeText(linearLayout.getContext(), R.string.nt_icon_pack_disable_tip, 0).show();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean j(Context context, p228w7.a aVar) {
        return !aVar.c() || O6.b.b(context);
    }
}
