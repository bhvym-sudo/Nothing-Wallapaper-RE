package p038d7;

import F8.AbstractC0816i;
import F8.L;
import I8.AbstractC0882h;
import I8.InterfaceC0880f;
import I8.InterfaceC0881g;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toolbar;
import androidx.lifecycle.AbstractC1157q;
import androidx.lifecycle.AbstractC1164y;
import androidx.lifecycle.InterfaceC1160u;
import androidx.lifecycle.InterfaceC1163x;
import androidx.lifecycle.N;
import com.nothing.wallpaper.R;
import kotlin.jvm.internal.E;
import kotlin.jvm.internal.n;
import p044e3.Z;
import p079h8.A;
import p079h8.r;
import p088i7.d;
import p129m8.e;
import p219v8.p;
import p219v8.q;
import p234x3.b;

/* JADX INFO: loaded from: classes2.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final l f19719a = new l();

    static final class a extends kotlin.coroutines.jvm.internal.l implements p {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f19720q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ InterfaceC1163x f19721r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        final /* synthetic */ b f19722s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ d f19723t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        final /* synthetic */ MenuItem f19724u;

        /* JADX INFO: renamed from: d7.l$a$a, reason: collision with other inner class name */
        static final class C0524a extends kotlin.coroutines.jvm.internal.l implements p {

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            int f19725q;

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            private /* synthetic */ Object f19726r;

            /* JADX INFO: renamed from: s, reason: collision with root package name */
            final /* synthetic */ b f19727s;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            final /* synthetic */ d f19728t;

            /* JADX INFO: renamed from: u, reason: collision with root package name */
            final /* synthetic */ MenuItem f19729u;

            /* JADX INFO: renamed from: d7.l$a$a$a, reason: collision with other inner class name */
            static final class C0525a extends kotlin.coroutines.jvm.internal.l implements p {

                /* JADX INFO: renamed from: q, reason: collision with root package name */
                int f19730q;

                /* JADX INFO: renamed from: r, reason: collision with root package name */
                final /* synthetic */ p234x3.b f19731r;

                /* JADX INFO: renamed from: s, reason: collision with root package name */
                final /* synthetic */ d f19732s;

                /* JADX INFO: renamed from: t, reason: collision with root package name */
                final /* synthetic */ MenuItem f19733t;

                /* JADX INFO: renamed from: d7.l$a$a$a$a, reason: collision with other inner class name */
                static final class C0526a extends kotlin.coroutines.jvm.internal.l implements q {

                    /* JADX INFO: renamed from: q, reason: collision with root package name */
                    int f19734q;

                    /* JADX INFO: renamed from: r, reason: collision with root package name */
                    /* synthetic */ boolean f19735r;

                    /* JADX INFO: renamed from: s, reason: collision with root package name */
                    /* synthetic */ boolean f19736s;

                    C0526a(e eVar) {
                        super(3, eVar);
                    }

                    @Override // p219v8.q
                    public /* bridge */ /* synthetic */ Object e(Object obj, Object obj2, Object obj3) {
                        return s(((Boolean) obj).booleanValue(), ((Boolean) obj2).booleanValue(), (e) obj3);
                    }

                    @Override // kotlin.coroutines.jvm.internal.a
                    public final Object invokeSuspend(Object obj) {
                        p139n8.b.e();
                        if (this.f19734q != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        r.b(obj);
                        return kotlin.coroutines.jvm.internal.b.a(!this.f19735r && this.f19736s);
                    }

                    public final Object s(boolean z9, boolean z10, e eVar) {
                        C0526a c0526a = new C0526a(eVar);
                        c0526a.f19735r = z9;
                        c0526a.f19736s = z10;
                        return c0526a.invokeSuspend(A.f21846a);
                    }
                }

                /* JADX INFO: renamed from: d7.l$a$a$a$b */
                static final class b implements InterfaceC0881g {

                    /* JADX INFO: renamed from: q, reason: collision with root package name */
                    final /* synthetic */ MenuItem f19737q;

                    b(MenuItem menuItem) {
                        this.f19737q = menuItem;
                    }

                    public final Object a(boolean z9, e eVar) {
                        this.f19737q.setVisible(z9);
                        return A.f21846a;
                    }

                    @Override // I8.InterfaceC0881g
                    public /* bridge */ /* synthetic */ Object b(Object obj, e eVar) {
                        return a(((Boolean) obj).booleanValue(), eVar);
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0525a(p234x3.b bVar, d dVar, MenuItem menuItem, e eVar) {
                    super(2, eVar);
                    this.f19731r = bVar;
                    this.f19732s = dVar;
                    this.f19733t = menuItem;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final e create(Object obj, e eVar) {
                    return new C0525a(this.f19731r, this.f19732s, this.f19733t, eVar);
                }

                @Override // p219v8.p
                public final Object invoke(L l9, e eVar) {
                    return ((C0525a) create(l9, eVar)).invokeSuspend(A.f21846a);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    Object objE = p139n8.b.e();
                    int i10 = this.f19730q;
                    if (i10 == 0) {
                        r.b(obj);
                        InterfaceC0880f interfaceC0880fO = AbstractC0882h.o(AbstractC0882h.l(this.f19731r.k(), this.f19732s.n(), new C0526a(null)));
                        b bVar = new b(this.f19733t);
                        this.f19730q = 1;
                        if (interfaceC0880fO.a(bVar, this) == objE) {
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
            C0524a(b bVar, d dVar, MenuItem menuItem, e eVar) {
                super(2, eVar);
                this.f19727s = bVar;
                this.f19728t = dVar;
                this.f19729u = menuItem;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final e create(Object obj, e eVar) {
                C0524a c0524a = new C0524a(this.f19727s, this.f19728t, this.f19729u, eVar);
                c0524a.f19726r = obj;
                return c0524a;
            }

            @Override // p219v8.p
            public final Object invoke(L l9, e eVar) {
                return ((C0524a) create(l9, eVar)).invokeSuspend(A.f21846a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                p139n8.b.e();
                if (this.f19725q != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                r.b(obj);
                AbstractC0816i.d((L) this.f19726r, null, null, new C0525a(this.f19727s, this.f19728t, this.f19729u, null), 3, null);
                return A.f21846a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(InterfaceC1163x interfaceC1163x, b bVar, d dVar, MenuItem menuItem, e eVar) {
            super(2, eVar);
            this.f19721r = interfaceC1163x;
            this.f19722s = bVar;
            this.f19723t = dVar;
            this.f19724u = menuItem;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final e create(Object obj, e eVar) {
            return new a(this.f19721r, this.f19722s, this.f19723t, this.f19724u, eVar);
        }

        @Override // p219v8.p
        public final Object invoke(L l9, e eVar) {
            return ((a) create(l9, eVar)).invokeSuspend(A.f21846a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objE = p139n8.b.e();
            int i10 = this.f19720q;
            if (i10 == 0) {
                r.b(obj);
                InterfaceC1163x interfaceC1163x = this.f19721r;
                AbstractC1157q.b bVar = AbstractC1157q.b.STARTED;
                C0524a c0524a = new C0524a(this.f19722s, this.f19723t, this.f19724u, null);
                this.f19720q = 1;
                if (N.b(interfaceC1163x, bVar, c0524a, this) == objE) {
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

    private l() {
    }

    private static final void j(E e10) {
        Dialog dialog = (Dialog) e10.f22779q;
        if (dialog != null) {
            dialog.dismiss();
        }
        Dialog dialog2 = (Dialog) e10.f22779q;
        if (dialog2 != null) {
            dialog2.setOnDismissListener(null);
        }
        Dialog dialog3 = (Dialog) e10.f22779q;
        if (dialog3 != null) {
            dialog3.setOnCancelListener(null);
        }
        e10.f22779q = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean k(Context context, E e10, d dVar, MenuItem it) {
        n.h(it, "it");
        if (it.getItemId() != R.id.reset) {
            return false;
        }
        m(context, e10, dVar);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void l(d dVar, Context context, E e10, InterfaceC1163x interfaceC1163x, AbstractC1157q.a event) {
        n.h(interfaceC1163x, "<unused var>");
        n.h(event, "event");
        if (event == AbstractC1157q.a.ON_CREATE) {
            dVar.r(context);
        } else if (event == AbstractC1157q.a.ON_DESTROY) {
            j(e10);
            dVar.v(context);
        }
    }

    private static final void m(final Context context, final E e10, final d dVar) {
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.nt_dialog_customization_reset, (ViewGroup) null);
        final Z zC = Z.C(viewInflate);
        androidx.appcompat.app.b.a aVarN = new androidx.appcompat.app.b.a(context, R.style.LightDialogTheme).n(viewInflate);
        final E e11 = new E();
        zC.f19923y.setOnClickListener(new View.OnClickListener() { // from class: d7.f
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                l.n(dVar, e10, view);
            }
        });
        zC.f19924z.setOnClickListener(new View.OnClickListener() { // from class: d7.g
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                l.o(e11, dVar, zC, context, e10, view);
            }
        });
        zC.f19921w.setOnClickListener(new View.OnClickListener() { // from class: d7.h
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                l.q(zC, view);
            }
        });
        aVarN.h(new DialogInterface.OnDismissListener() { // from class: d7.i
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                l.r(e11, dialogInterface);
            }
        });
        aVarN.g(new DialogInterface.OnCancelListener() { // from class: d7.j
            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                l.s(dVar, dialogInterface);
            }
        });
        androidx.appcompat.app.b bVarA = aVarN.a();
        e10.f22779q = bVarA;
        androidx.appcompat.app.b bVar = bVarA;
        if (bVar != null) {
            bVar.show();
        }
        dVar.u(Boolean.TRUE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void n(d dVar, E e10, View view) {
        dVar.u(Boolean.FALSE);
        j(e10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void o(E e10, final d dVar, final Z z9, final Context context, E e11, View view) {
        e10.f22779q = new p219v8.a() { // from class: d7.k
            @Override // p219v8.a
            public final Object invoke() {
                return l.p(dVar, z9, context);
            }
        };
        dVar.u(Boolean.FALSE);
        j(e11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final A p(d dVar, Z z9, Context context) {
        dVar.t(!z9.f19920v.isChecked());
        Intent intent = new Intent("android.intent.action.MAIN");
        intent.addCategory("android.intent.category.HOME");
        intent.setFlags(268435456);
        p087i6.a.b(p087i6.a.f22186a, context, intent, null, 0, 12, null);
        Activity activity = context instanceof Activity ? (Activity) context : null;
        if (activity != null) {
            activity.finish();
        }
        return A.f21846a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void q(Z z9, View view) {
        z9.f19920v.toggle();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void r(E e10, DialogInterface dialogInterface) {
        p219v8.a aVar = (p219v8.a) e10.f22779q;
        if (aVar != null) {
            aVar.invoke();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void s(d dVar, DialogInterface dialogInterface) {
        dVar.u(Boolean.FALSE);
    }

    public final void i(final Context context, Toolbar toolbar, b pickerViewModel, final d resetViewModel, InterfaceC1163x lifecycleOwner) {
        n.h(context, "context");
        n.h(toolbar, "toolbar");
        n.h(pickerViewModel, "pickerViewModel");
        n.h(resetViewModel, "resetViewModel");
        n.h(lifecycleOwner, "lifecycleOwner");
        final E e10 = new E();
        MenuItem menuItemFindItem = toolbar.getMenu().findItem(R.id.reset);
        menuItemFindItem.setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() { // from class: d7.d
            @Override // android.view.MenuItem.OnMenuItemClickListener
            public final boolean onMenuItemClick(MenuItem menuItem) {
                return l.k(context, e10, resetViewModel, menuItem);
            }
        });
        if (n.d(resetViewModel.p(), Boolean.TRUE)) {
            m(context, e10, resetViewModel);
        }
        AbstractC0816i.d(AbstractC1164y.a(lifecycleOwner), null, null, new a(lifecycleOwner, pickerViewModel, resetViewModel, menuItemFindItem, null), 3, null);
        lifecycleOwner.getLifecycle().a(new InterfaceC1160u() { // from class: d7.e
            @Override // androidx.lifecycle.InterfaceC1160u
            public final void onStateChanged(InterfaceC1163x interfaceC1163x, AbstractC1157q.a aVar) {
                l.l(resetViewModel, context, e10, interfaceC1163x, aVar);
            }
        });
    }
}
