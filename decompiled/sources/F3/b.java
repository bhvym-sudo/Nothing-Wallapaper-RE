package F3;

import F8.AbstractC0816i;
import F8.L;
import G3.c;
import I8.InterfaceC0880f;
import I8.InterfaceC0881g;
import android.app.Dialog;
import android.content.Context;
import android.view.MenuItem;
import android.widget.Toolbar;
import androidx.lifecycle.AbstractC1157q;
import androidx.lifecycle.AbstractC1164y;
import androidx.lifecycle.InterfaceC1163x;
import androidx.lifecycle.N;
import com.nothing.wallpaper.R;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.E;
import kotlin.jvm.internal.n;
import p079h8.A;
import p079h8.r;
import p129m8.e;
import p219v8.p;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f1606a = new b();

    static final class a extends l implements p {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f1607q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ InterfaceC1163x f1608r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        final /* synthetic */ c f1609s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ MenuItem f1610t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        final /* synthetic */ E f1611u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        final /* synthetic */ Toolbar f1612v;

        /* JADX INFO: renamed from: F3.b$a$a, reason: collision with other inner class name */
        static final class C0061a extends l implements p {

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            int f1613q;

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            private /* synthetic */ Object f1614r;

            /* JADX INFO: renamed from: s, reason: collision with root package name */
            final /* synthetic */ c f1615s;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            final /* synthetic */ MenuItem f1616t;

            /* JADX INFO: renamed from: u, reason: collision with root package name */
            final /* synthetic */ E f1617u;

            /* JADX INFO: renamed from: v, reason: collision with root package name */
            final /* synthetic */ Toolbar f1618v;

            /* JADX INFO: renamed from: F3.b$a$a$a, reason: collision with other inner class name */
            static final class C0062a extends l implements p {

                /* JADX INFO: renamed from: q, reason: collision with root package name */
                int f1619q;

                /* JADX INFO: renamed from: r, reason: collision with root package name */
                final /* synthetic */ c f1620r;

                /* JADX INFO: renamed from: s, reason: collision with root package name */
                final /* synthetic */ MenuItem f1621s;

                /* JADX INFO: renamed from: F3.b$a$a$a$a, reason: collision with other inner class name */
                static final class C0063a implements InterfaceC0881g {

                    /* JADX INFO: renamed from: q, reason: collision with root package name */
                    final /* synthetic */ MenuItem f1622q;

                    C0063a(MenuItem menuItem) {
                        this.f1622q = menuItem;
                    }

                    public final Object a(boolean z9, e eVar) {
                        this.f1622q.setVisible(z9);
                        return A.f21846a;
                    }

                    @Override // I8.InterfaceC0881g
                    public /* bridge */ /* synthetic */ Object b(Object obj, e eVar) {
                        return a(((Boolean) obj).booleanValue(), eVar);
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0062a(c cVar, MenuItem menuItem, e eVar) {
                    super(2, eVar);
                    this.f1620r = cVar;
                    this.f1621s = menuItem;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final e create(Object obj, e eVar) {
                    return new C0062a(this.f1620r, this.f1621s, eVar);
                }

                @Override // p219v8.p
                public final Object invoke(L l9, e eVar) {
                    return ((C0062a) create(l9, eVar)).invokeSuspend(A.f21846a);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    Object objE = p139n8.b.e();
                    int i10 = this.f1619q;
                    if (i10 == 0) {
                        r.b(obj);
                        InterfaceC0880f interfaceC0880fD = this.f1620r.d();
                        C0063a c0063a = new C0063a(this.f1621s);
                        this.f1619q = 1;
                        if (interfaceC0880fD.a(c0063a, this) == objE) {
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

            /* JADX INFO: renamed from: F3.b$a$a$b, reason: collision with other inner class name */
            static final class C0064b extends l implements p {

                /* JADX INFO: renamed from: q, reason: collision with root package name */
                int f1623q;

                /* JADX INFO: renamed from: r, reason: collision with root package name */
                final /* synthetic */ c f1624r;

                /* JADX INFO: renamed from: s, reason: collision with root package name */
                final /* synthetic */ E f1625s;

                /* JADX INFO: renamed from: t, reason: collision with root package name */
                final /* synthetic */ Toolbar f1626t;

                /* JADX INFO: renamed from: F3.b$a$a$b$a, reason: collision with other inner class name */
                static final class C0065a implements InterfaceC0881g {

                    /* JADX INFO: renamed from: q, reason: collision with root package name */
                    final /* synthetic */ E f1627q;

                    /* JADX INFO: renamed from: r, reason: collision with root package name */
                    final /* synthetic */ Toolbar f1628r;

                    C0065a(E e10, Toolbar toolbar) {
                        this.f1627q = e10;
                        this.f1628r = toolbar;
                    }

                    @Override // I8.InterfaceC0881g
                    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                    public final Object b(p124m3.a aVar, e eVar) {
                        if (aVar != null) {
                            b.e(this.f1627q);
                            b.g(this.f1627q, this.f1628r, aVar);
                        } else {
                            b.e(this.f1627q);
                        }
                        return A.f21846a;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0064b(c cVar, E e10, Toolbar toolbar, e eVar) {
                    super(2, eVar);
                    this.f1624r = cVar;
                    this.f1625s = e10;
                    this.f1626t = toolbar;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final e create(Object obj, e eVar) {
                    return new C0064b(this.f1624r, this.f1625s, this.f1626t, eVar);
                }

                @Override // p219v8.p
                public final Object invoke(L l9, e eVar) {
                    return ((C0064b) create(l9, eVar)).invokeSuspend(A.f21846a);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    Object objE = p139n8.b.e();
                    int i10 = this.f1623q;
                    if (i10 == 0) {
                        r.b(obj);
                        InterfaceC0880f interfaceC0880fC = this.f1624r.c();
                        C0065a c0065a = new C0065a(this.f1625s, this.f1626t);
                        this.f1623q = 1;
                        if (interfaceC0880fC.a(c0065a, this) == objE) {
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
            C0061a(c cVar, MenuItem menuItem, E e10, Toolbar toolbar, e eVar) {
                super(2, eVar);
                this.f1615s = cVar;
                this.f1616t = menuItem;
                this.f1617u = e10;
                this.f1618v = toolbar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final e create(Object obj, e eVar) {
                C0061a c0061a = new C0061a(this.f1615s, this.f1616t, this.f1617u, this.f1618v, eVar);
                c0061a.f1614r = obj;
                return c0061a;
            }

            @Override // p219v8.p
            public final Object invoke(L l9, e eVar) {
                return ((C0061a) create(l9, eVar)).invokeSuspend(A.f21846a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                p139n8.b.e();
                if (this.f1613q != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                r.b(obj);
                L l9 = (L) this.f1614r;
                AbstractC0816i.d(l9, null, null, new C0062a(this.f1615s, this.f1616t, null), 3, null);
                AbstractC0816i.d(l9, null, null, new C0064b(this.f1615s, this.f1617u, this.f1618v, null), 3, null);
                return A.f21846a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(InterfaceC1163x interfaceC1163x, c cVar, MenuItem menuItem, E e10, Toolbar toolbar, e eVar) {
            super(2, eVar);
            this.f1608r = interfaceC1163x;
            this.f1609s = cVar;
            this.f1610t = menuItem;
            this.f1611u = e10;
            this.f1612v = toolbar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final e create(Object obj, e eVar) {
            return new a(this.f1608r, this.f1609s, this.f1610t, this.f1611u, this.f1612v, eVar);
        }

        @Override // p219v8.p
        public final Object invoke(L l9, e eVar) {
            return ((a) create(l9, eVar)).invokeSuspend(A.f21846a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objE = p139n8.b.e();
            int i10 = this.f1607q;
            if (i10 == 0) {
                r.b(obj);
                InterfaceC1163x interfaceC1163x = this.f1608r;
                AbstractC1157q.b bVar = AbstractC1157q.b.STARTED;
                C0061a c0061a = new C0061a(this.f1609s, this.f1610t, this.f1611u, this.f1612v, null);
                this.f1607q = 1;
                if (N.b(interfaceC1163x, bVar, c0061a, this) == objE) {
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

    private b() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(E e10) {
        Dialog dialog = (Dialog) e10.f22779q;
        if (dialog != null) {
            dialog.setOnDismissListener(null);
        }
        Dialog dialog2 = (Dialog) e10.f22779q;
        if (dialog2 != null) {
            dialog2.dismiss();
        }
        e10.f22779q = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean f(c cVar, MenuItem it) {
        n.h(it, "it");
        cVar.e();
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g(E e10, Toolbar toolbar, p124m3.a aVar) {
        p114l3.c cVar = p114l3.c.f22930a;
        Context context = toolbar.getContext();
        n.g(context, "getContext(...)");
        Dialog dialogD = p114l3.c.d(cVar, context, aVar, null, 0, 0, 28, null);
        e10.f22779q = dialogD;
        if (dialogD != null) {
            dialogD.show();
        }
    }

    public final void d(Toolbar view, final c viewModel, InterfaceC1163x lifecycleOwner) {
        n.h(view, "view");
        n.h(viewModel, "viewModel");
        n.h(lifecycleOwner, "lifecycleOwner");
        MenuItem menuItemFindItem = view.getMenu().findItem(R.id.revert);
        menuItemFindItem.setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() { // from class: F3.a
            @Override // android.view.MenuItem.OnMenuItemClickListener
            public final boolean onMenuItemClick(MenuItem menuItem) {
                return b.f(viewModel, menuItem);
            }
        });
        AbstractC0816i.d(AbstractC1164y.a(lifecycleOwner), null, null, new a(lifecycleOwner, viewModel, menuItemFindItem, new E(), view, null), 3, null);
    }
}
