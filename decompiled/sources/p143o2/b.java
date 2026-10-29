package p143o2;

import F8.AbstractC0816i;
import F8.L;
import I8.AbstractC0882h;
import I8.InterfaceC0880f;
import I8.InterfaceC0881g;
import I8.O;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.widget.ImageView;
import androidx.core.view.C1069a;
import androidx.core.view.H;
import androidx.lifecycle.AbstractC1157q;
import androidx.lifecycle.AbstractC1164y;
import androidx.lifecycle.InterfaceC1163x;
import androidx.lifecycle.N;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.nothing.wallpaper.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.E;
import kotlin.jvm.internal.n;
import p079h8.A;
import p079h8.f;
import p079h8.r;
import p089i8.AbstractC1444s;
import p129m8.e;
import p173r2.c;
import p219v8.p;
import p219v8.q;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f23350a = new b();

    static final class a extends l implements p {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f23351q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ InterfaceC1163x f23352r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        final /* synthetic */ c f23353s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ p133n2.b f23354t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        final /* synthetic */ p254z3.a f23355u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        final /* synthetic */ RecyclerView f23356v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        final /* synthetic */ E f23357w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        final /* synthetic */ View f23358x;

        /* JADX INFO: renamed from: o2.b$a$a, reason: collision with other inner class name */
        static final class C0599a extends l implements p {

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            int f23359q;

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            private /* synthetic */ Object f23360r;

            /* JADX INFO: renamed from: s, reason: collision with root package name */
            final /* synthetic */ p173r2.c f23361s;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            final /* synthetic */ p133n2.b f23362t;

            /* JADX INFO: renamed from: u, reason: collision with root package name */
            final /* synthetic */ p254z3.a f23363u;

            /* JADX INFO: renamed from: v, reason: collision with root package name */
            final /* synthetic */ RecyclerView f23364v;

            /* JADX INFO: renamed from: w, reason: collision with root package name */
            final /* synthetic */ E f23365w;

            /* JADX INFO: renamed from: x, reason: collision with root package name */
            final /* synthetic */ View f23366x;

            /* JADX INFO: renamed from: o2.b$a$a$a, reason: collision with other inner class name */
            static final class C0600a extends l implements p {

                /* JADX INFO: renamed from: q, reason: collision with root package name */
                int f23367q;

                /* JADX INFO: renamed from: r, reason: collision with root package name */
                final /* synthetic */ p173r2.c f23368r;

                /* JADX INFO: renamed from: s, reason: collision with root package name */
                final /* synthetic */ p133n2.b f23369s;

                /* JADX INFO: renamed from: o2.b$a$a$a$a, reason: collision with other inner class name */
                static final class C0601a implements InterfaceC0881g {

                    /* JADX INFO: renamed from: q, reason: collision with root package name */
                    final /* synthetic */ p133n2.b f23370q;

                    C0601a(p133n2.b bVar) {
                        this.f23370q = bVar;
                    }

                    @Override // I8.InterfaceC0881g
                    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                    public final Object b(Collection collection, p129m8.e eVar) {
                        this.f23370q.h(AbstractC1444s.r0(collection));
                        return A.f21846a;
                    }
                }

                /* JADX INFO: renamed from: o2.b$a$a$a$b, reason: collision with other inner class name */
                public static final class C0602b implements InterfaceC0880f {

                    /* JADX INFO: renamed from: q, reason: collision with root package name */
                    final /* synthetic */ InterfaceC0880f f23371q;

                    /* JADX INFO: renamed from: o2.b$a$a$a$b$a, reason: collision with other inner class name */
                    public static final class C0603a implements InterfaceC0881g {

                        /* JADX INFO: renamed from: q, reason: collision with root package name */
                        final /* synthetic */ InterfaceC0881g f23372q;

                        /* JADX INFO: renamed from: o2.b$a$a$a$b$a$a, reason: collision with other inner class name */
                        public static final class C0604a extends kotlin.coroutines.jvm.internal.d {

                            /* JADX INFO: renamed from: q, reason: collision with root package name */
                            /* synthetic */ Object f23373q;

                            /* JADX INFO: renamed from: r, reason: collision with root package name */
                            int f23374r;

                            public C0604a(p129m8.e eVar) {
                                super(eVar);
                            }

                            @Override // kotlin.coroutines.jvm.internal.a
                            public final Object invokeSuspend(Object obj) {
                                this.f23373q = obj;
                                this.f23374r |= Integer.MIN_VALUE;
                                return C0603a.this.b(null, this);
                            }
                        }

                        public C0603a(InterfaceC0881g interfaceC0881g) {
                            this.f23372q = interfaceC0881g;
                        }

                        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                        @Override // I8.InterfaceC0881g
                        public final Object b(Object obj, p129m8.e eVar) {
                            C0604a c0604a;
                            if (eVar instanceof C0604a) {
                                c0604a = (C0604a) eVar;
                                int i10 = c0604a.f23374r;
                                if ((i10 & Integer.MIN_VALUE) != 0) {
                                    c0604a.f23374r = i10 - Integer.MIN_VALUE;
                                } else {
                                    c0604a = new C0604a(eVar);
                                }
                            } else {
                                c0604a = new C0604a(eVar);
                            }
                            Object obj2 = c0604a.f23373q;
                            Object objE = p139n8.b.e();
                            int i11 = c0604a.f23374r;
                            if (i11 == 0) {
                                r.b(obj2);
                                InterfaceC0881g interfaceC0881g = this.f23372q;
                                Collection collectionValues = ((Map) obj).values();
                                c0604a.f23374r = 1;
                                if (interfaceC0881g.b(collectionValues, c0604a) == objE) {
                                    return objE;
                                }
                            } else {
                                if (i11 != 1) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                r.b(obj2);
                            }
                            return A.f21846a;
                        }
                    }

                    public C0602b(InterfaceC0880f interfaceC0880f) {
                        this.f23371q = interfaceC0880f;
                    }

                    @Override // I8.InterfaceC0880f
                    public Object a(InterfaceC0881g interfaceC0881g, p129m8.e eVar) {
                        Object objA = this.f23371q.a(new C0603a(interfaceC0881g), eVar);
                        return objA == p139n8.b.e() ? objA : A.f21846a;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0600a(p173r2.c cVar, p133n2.b bVar, p129m8.e eVar) {
                    super(2, eVar);
                    this.f23368r = cVar;
                    this.f23369s = bVar;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final p129m8.e create(Object obj, p129m8.e eVar) {
                    return new C0600a(this.f23368r, this.f23369s, eVar);
                }

                @Override // p219v8.p
                public final Object invoke(L l9, p129m8.e eVar) {
                    return ((C0600a) create(l9, eVar)).invokeSuspend(A.f21846a);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    Object objE = p139n8.b.e();
                    int i10 = this.f23367q;
                    if (i10 == 0) {
                        r.b(obj);
                        C0602b c0602b = new C0602b(this.f23368r.z());
                        C0601a c0601a = new C0601a(this.f23369s);
                        this.f23367q = 1;
                        if (c0602b.a(c0601a, this) == objE) {
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

            /* JADX INFO: renamed from: o2.b$a$a$b, reason: collision with other inner class name */
            static final class C0605b extends l implements p {

                /* JADX INFO: renamed from: q, reason: collision with root package name */
                int f23376q;

                /* JADX INFO: renamed from: r, reason: collision with root package name */
                final /* synthetic */ p173r2.c f23377r;

                /* JADX INFO: renamed from: s, reason: collision with root package name */
                final /* synthetic */ p254z3.a f23378s;

                /* JADX INFO: renamed from: o2.b$a$a$b$a, reason: collision with other inner class name */
                static final class C0606a implements InterfaceC0881g {

                    /* JADX INFO: renamed from: q, reason: collision with root package name */
                    final /* synthetic */ p254z3.a f23379q;

                    C0606a(p254z3.a aVar) {
                        this.f23379q = aVar;
                    }

                    @Override // I8.InterfaceC0881g
                    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                    public final Object b(List list, p129m8.e eVar) {
                        this.f23379q.h(list);
                        return A.f21846a;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0605b(p173r2.c cVar, p254z3.a aVar, p129m8.e eVar) {
                    super(2, eVar);
                    this.f23377r = cVar;
                    this.f23378s = aVar;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final p129m8.e create(Object obj, p129m8.e eVar) {
                    return new C0605b(this.f23377r, this.f23378s, eVar);
                }

                @Override // p219v8.p
                public final Object invoke(L l9, p129m8.e eVar) {
                    return ((C0605b) create(l9, eVar)).invokeSuspend(A.f21846a);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    Object objE = p139n8.b.e();
                    int i10 = this.f23376q;
                    if (i10 == 0) {
                        r.b(obj);
                        InterfaceC0880f interfaceC0880fV = this.f23377r.v();
                        C0606a c0606a = new C0606a(this.f23378s);
                        this.f23376q = 1;
                        if (interfaceC0880fV.a(c0606a, this) == objE) {
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

            /* JADX INFO: renamed from: o2.b$a$a$c */
            static final class c extends l implements p {

                /* JADX INFO: renamed from: q, reason: collision with root package name */
                int f23380q;

                /* JADX INFO: renamed from: r, reason: collision with root package name */
                final /* synthetic */ p173r2.c f23381r;

                /* JADX INFO: renamed from: s, reason: collision with root package name */
                final /* synthetic */ RecyclerView f23382s;

                /* JADX INFO: renamed from: o2.b$a$a$c$a, reason: collision with other inner class name */
                static final class RunnableC0607a implements Runnable {

                    /* JADX INFO: renamed from: q, reason: collision with root package name */
                    final /* synthetic */ int f23383q;

                    /* JADX INFO: renamed from: r, reason: collision with root package name */
                    final /* synthetic */ RecyclerView f23384r;

                    /* JADX INFO: renamed from: s, reason: collision with root package name */
                    final /* synthetic */ int f23385s;

                    RunnableC0607a(int i10, RecyclerView recyclerView, int i11) {
                        this.f23383q = i10;
                        this.f23384r = recyclerView;
                        this.f23385s = i11;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        if (this.f23383q == 0) {
                            this.f23384r.scrollToPosition(this.f23385s);
                        } else {
                            this.f23384r.smoothScrollToPosition(this.f23385s);
                        }
                    }
                }

                /* JADX INFO: renamed from: o2.b$a$a$c$b, reason: collision with other inner class name */
                public static final class C0608b implements InterfaceC0881g {

                    /* JADX INFO: renamed from: q, reason: collision with root package name */
                    private int f23386q;

                    /* JADX INFO: renamed from: r, reason: collision with root package name */
                    final /* synthetic */ RecyclerView f23387r;

                    public C0608b(RecyclerView recyclerView) {
                        this.f23387r = recyclerView;
                    }

                    @Override // I8.InterfaceC0881g
                    public Object b(Object obj, p129m8.e eVar) {
                        int i10 = this.f23386q;
                        this.f23386q = i10 + 1;
                        if (i10 < 0) {
                            throw new ArithmeticException("Index overflow has happened");
                        }
                        int iIntValue = ((Number) obj).intValue();
                        if (iIntValue != -1) {
                            RecyclerView recyclerView = this.f23387r;
                            recyclerView.post(new RunnableC0607a(i10, recyclerView, iIntValue));
                        }
                        return A.f21846a;
                    }
                }

                /* JADX INFO: renamed from: o2.b$a$a$c$c, reason: collision with other inner class name */
                public static final class C0609c extends l implements q {

                    /* JADX INFO: renamed from: q, reason: collision with root package name */
                    int f23388q;

                    /* JADX INFO: renamed from: r, reason: collision with root package name */
                    private /* synthetic */ Object f23389r;

                    /* JADX INFO: renamed from: s, reason: collision with root package name */
                    /* synthetic */ Object f23390s;

                    public C0609c(p129m8.e eVar) {
                        super(3, eVar);
                    }

                    @Override // kotlin.coroutines.jvm.internal.a
                    public final Object invokeSuspend(Object obj) {
                        Object objE = p139n8.b.e();
                        int i10 = this.f23388q;
                        if (i10 == 0) {
                            r.b(obj);
                            InterfaceC0881g interfaceC0881g = (InterfaceC0881g) this.f23389r;
                            List list = (List) this.f23390s;
                            ArrayList arrayList = new ArrayList(AbstractC1444s.u(list, 10));
                            Iterator it = list.iterator();
                            while (it.hasNext()) {
                                arrayList.add(((B3.a) it.next()).g());
                            }
                            d dVar = new d((InterfaceC0880f[]) AbstractC1444s.r0(arrayList).toArray(new InterfaceC0880f[0]));
                            this.f23388q = 1;
                            if (AbstractC0882h.t(interfaceC0881g, dVar, this) == objE) {
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

                    @Override // p219v8.q
                    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
                    public final Object e(InterfaceC0881g interfaceC0881g, Object obj, p129m8.e eVar) {
                        C0609c c0609c = new C0609c(eVar);
                        c0609c.f23389r = interfaceC0881g;
                        c0609c.f23390s = obj;
                        return c0609c.invokeSuspend(A.f21846a);
                    }
                }

                /* JADX INFO: renamed from: o2.b$a$a$c$d */
                public static final class d implements InterfaceC0880f {

                    /* JADX INFO: renamed from: q, reason: collision with root package name */
                    final /* synthetic */ InterfaceC0880f[] f23391q;

                    /* JADX INFO: renamed from: o2.b$a$a$c$d$a, reason: collision with other inner class name */
                    public static final class C0610a implements p219v8.a {

                        /* JADX INFO: renamed from: q, reason: collision with root package name */
                        final /* synthetic */ InterfaceC0880f[] f23392q;

                        public C0610a(InterfaceC0880f[] interfaceC0880fArr) {
                            this.f23392q = interfaceC0880fArr;
                        }

                        @Override // p219v8.a
                        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                        public final Object[] invoke() {
                            return new Boolean[this.f23392q.length];
                        }
                    }

                    /* JADX INFO: renamed from: o2.b$a$a$c$d$b, reason: collision with other inner class name */
                    public static final class C0611b extends l implements q {

                        /* JADX INFO: renamed from: q, reason: collision with root package name */
                        int f23393q;

                        /* JADX INFO: renamed from: r, reason: collision with root package name */
                        private /* synthetic */ Object f23394r;

                        /* JADX INFO: renamed from: s, reason: collision with root package name */
                        /* synthetic */ Object f23395s;

                        public C0611b(p129m8.e eVar) {
                            super(3, eVar);
                        }

                        @Override // kotlin.coroutines.jvm.internal.a
                        public final Object invokeSuspend(Object obj) {
                            Object objE = p139n8.b.e();
                            int i10 = this.f23393q;
                            if (i10 == 0) {
                                r.b(obj);
                                InterfaceC0881g interfaceC0881g = (InterfaceC0881g) this.f23394r;
                                Boolean[] boolArr = (Boolean[]) ((Object[]) this.f23395s);
                                int length = boolArr.length;
                                int i11 = 0;
                                while (true) {
                                    if (i11 >= length) {
                                        i11 = -1;
                                        break;
                                    }
                                    if (boolArr[i11].booleanValue()) {
                                        break;
                                    }
                                    i11++;
                                }
                                Integer numC = kotlin.coroutines.jvm.internal.b.c(i11);
                                this.f23393q = 1;
                                if (interfaceC0881g.b(numC, this) == objE) {
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

                        @Override // p219v8.q
                        /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
                        public final Object e(InterfaceC0881g interfaceC0881g, Object[] objArr, p129m8.e eVar) {
                            C0611b c0611b = new C0611b(eVar);
                            c0611b.f23394r = interfaceC0881g;
                            c0611b.f23395s = objArr;
                            return c0611b.invokeSuspend(A.f21846a);
                        }
                    }

                    public d(InterfaceC0880f[] interfaceC0880fArr) {
                        this.f23391q = interfaceC0880fArr;
                    }

                    @Override // I8.InterfaceC0880f
                    public Object a(InterfaceC0881g interfaceC0881g, p129m8.e eVar) {
                        InterfaceC0880f[] interfaceC0880fArr = this.f23391q;
                        Object objA = J8.l.a(interfaceC0881g, interfaceC0880fArr, new C0610a(interfaceC0880fArr), new C0611b(null), eVar);
                        return objA == p139n8.b.e() ? objA : A.f21846a;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                c(p173r2.c cVar, RecyclerView recyclerView, p129m8.e eVar) {
                    super(2, eVar);
                    this.f23381r = cVar;
                    this.f23382s = recyclerView;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final p129m8.e create(Object obj, p129m8.e eVar) {
                    return new c(this.f23381r, this.f23382s, eVar);
                }

                @Override // p219v8.p
                public final Object invoke(L l9, p129m8.e eVar) {
                    return ((c) create(l9, eVar)).invokeSuspend(A.f21846a);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    Object objE = p139n8.b.e();
                    int i10 = this.f23380q;
                    if (i10 == 0) {
                        r.b(obj);
                        InterfaceC0880f interfaceC0880fN = AbstractC0882h.N(this.f23381r.v(), new C0609c(null));
                        C0608b c0608b = new C0608b(this.f23382s);
                        this.f23380q = 1;
                        if (interfaceC0880fN.a(c0608b, this) == objE) {
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

            /* JADX INFO: renamed from: o2.b$a$a$d */
            static final class d extends l implements p {

                /* JADX INFO: renamed from: q, reason: collision with root package name */
                int f23396q;

                /* JADX INFO: renamed from: r, reason: collision with root package name */
                final /* synthetic */ p173r2.c f23397r;

                /* JADX INFO: renamed from: s, reason: collision with root package name */
                final /* synthetic */ E f23398s;

                /* JADX INFO: renamed from: t, reason: collision with root package name */
                final /* synthetic */ View f23399t;

                /* JADX INFO: renamed from: o2.b$a$a$d$a, reason: collision with other inner class name */
                static final class C0612a implements InterfaceC0881g {

                    /* JADX INFO: renamed from: q, reason: collision with root package name */
                    final /* synthetic */ E f23400q;

                    /* JADX INFO: renamed from: r, reason: collision with root package name */
                    final /* synthetic */ View f23401r;

                    /* JADX INFO: renamed from: s, reason: collision with root package name */
                    final /* synthetic */ p173r2.c f23402s;

                    /* JADX INFO: renamed from: o2.b$a$a$d$a$a, reason: collision with other inner class name */
                    /* synthetic */ class C0613a extends kotlin.jvm.internal.l implements p219v8.a {
                        C0613a(Object obj) {
                            super(0, obj, p173r2.c.class, "onDialogDismissed", "onDialogDismissed()V", 0);
                        }

                        @Override // p219v8.a
                        public /* bridge */ /* synthetic */ Object invoke() {
                            m21invoke();
                            return A.f21846a;
                        }

                        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
                        public final void m21invoke() {
                            ((p173r2.c) this.receiver).D();
                        }
                    }

                    C0612a(E e10, View view, p173r2.c cVar) {
                        this.f23400q = e10;
                        this.f23401r = view;
                        this.f23402s = cVar;
                    }

                    @Override // I8.InterfaceC0881g
                    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                    public final Object b(p124m3.a aVar, p129m8.e eVar) {
                        Dialog dialogE;
                        Dialog dialog = (Dialog) this.f23400q.f22779q;
                        if (dialog != null) {
                            dialog.dismiss();
                        }
                        E e10 = this.f23400q;
                        if (aVar != null) {
                            b bVar = b.f23350a;
                            Context context = this.f23401r.getContext();
                            n.g(context, "getContext(...)");
                            dialogE = bVar.e(context, aVar, new C0613a(this.f23402s));
                        } else {
                            dialogE = null;
                        }
                        e10.f22779q = dialogE;
                        return A.f21846a;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                d(p173r2.c cVar, E e10, View view, p129m8.e eVar) {
                    super(2, eVar);
                    this.f23397r = cVar;
                    this.f23398s = e10;
                    this.f23399t = view;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final p129m8.e create(Object obj, p129m8.e eVar) {
                    return new d(this.f23397r, this.f23398s, this.f23399t, eVar);
                }

                @Override // p219v8.p
                public final Object invoke(L l9, p129m8.e eVar) {
                    return ((d) create(l9, eVar)).invokeSuspend(A.f21846a);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    Object objE = p139n8.b.e();
                    int i10 = this.f23396q;
                    if (i10 == 0) {
                        r.b(obj);
                        InterfaceC0880f interfaceC0880fO = AbstractC0882h.o(this.f23397r.t());
                        C0612a c0612a = new C0612a(this.f23398s, this.f23399t, this.f23397r);
                        this.f23396q = 1;
                        if (interfaceC0880fO.a(c0612a, this) == objE) {
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

            /* JADX INFO: renamed from: o2.b$a$a$e */
            static final class e extends l implements p {

                /* JADX INFO: renamed from: q, reason: collision with root package name */
                int f23403q;

                /* JADX INFO: renamed from: r, reason: collision with root package name */
                final /* synthetic */ p173r2.c f23404r;

                /* JADX INFO: renamed from: s, reason: collision with root package name */
                final /* synthetic */ View f23405s;

                /* JADX INFO: renamed from: o2.b$a$a$e$a, reason: collision with other inner class name */
                static final class C0614a implements InterfaceC0881g {

                    /* JADX INFO: renamed from: q, reason: collision with root package name */
                    final /* synthetic */ View f23406q;

                    /* JADX INFO: renamed from: r, reason: collision with root package name */
                    final /* synthetic */ p173r2.c f23407r;

                    C0614a(View view, p173r2.c cVar) {
                        this.f23406q = view;
                        this.f23407r = cVar;
                    }

                    @Override // I8.InterfaceC0881g
                    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                    public final Object b(Intent intent, p129m8.e eVar) {
                        if (intent != null) {
                            this.f23406q.getContext().startActivity(intent);
                            this.f23407r.C();
                        }
                        return A.f21846a;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                e(p173r2.c cVar, View view, p129m8.e eVar) {
                    super(2, eVar);
                    this.f23404r = cVar;
                    this.f23405s = view;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final p129m8.e create(Object obj, p129m8.e eVar) {
                    return new e(this.f23404r, this.f23405s, eVar);
                }

                @Override // p219v8.p
                public final Object invoke(L l9, p129m8.e eVar) {
                    return ((e) create(l9, eVar)).invokeSuspend(A.f21846a);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    Object objE = p139n8.b.e();
                    int i10 = this.f23403q;
                    if (i10 == 0) {
                        r.b(obj);
                        O oR = this.f23404r.r();
                        C0614a c0614a = new C0614a(this.f23405s, this.f23404r);
                        this.f23403q = 1;
                        if (oR.a(c0614a, this) == objE) {
                            return objE;
                        }
                    } else {
                        if (i10 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        r.b(obj);
                    }
                    throw new f();
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0599a(p173r2.c cVar, p133n2.b bVar, p254z3.a aVar, RecyclerView recyclerView, E e10, View view, p129m8.e eVar) {
                super(2, eVar);
                this.f23361s = cVar;
                this.f23362t = bVar;
                this.f23363u = aVar;
                this.f23364v = recyclerView;
                this.f23365w = e10;
                this.f23366x = view;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final p129m8.e create(Object obj, p129m8.e eVar) {
                C0599a c0599a = new C0599a(this.f23361s, this.f23362t, this.f23363u, this.f23364v, this.f23365w, this.f23366x, eVar);
                c0599a.f23360r = obj;
                return c0599a;
            }

            @Override // p219v8.p
            public final Object invoke(L l9, p129m8.e eVar) {
                return ((C0599a) create(l9, eVar)).invokeSuspend(A.f21846a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                p139n8.b.e();
                if (this.f23359q != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                r.b(obj);
                L l9 = (L) this.f23360r;
                AbstractC0816i.d(l9, null, null, new C0600a(this.f23361s, this.f23362t, null), 3, null);
                AbstractC0816i.d(l9, null, null, new C0605b(this.f23361s, this.f23363u, null), 3, null);
                AbstractC0816i.d(l9, null, null, new c(this.f23361s, this.f23364v, null), 3, null);
                AbstractC0816i.d(l9, null, null, new d(this.f23361s, this.f23365w, this.f23366x, null), 3, null);
                AbstractC0816i.d(l9, null, null, new e(this.f23361s, this.f23366x, null), 3, null);
                return A.f21846a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(InterfaceC1163x interfaceC1163x, c cVar, p133n2.b bVar, p254z3.a aVar, RecyclerView recyclerView, E e10, View view, e eVar) {
            super(2, eVar);
            this.f23352r = interfaceC1163x;
            this.f23353s = cVar;
            this.f23354t = bVar;
            this.f23355u = aVar;
            this.f23356v = recyclerView;
            this.f23357w = e10;
            this.f23358x = view;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final e create(Object obj, e eVar) {
            return new a(this.f23352r, this.f23353s, this.f23354t, this.f23355u, this.f23356v, this.f23357w, this.f23358x, eVar);
        }

        @Override // p219v8.p
        public final Object invoke(L l9, e eVar) {
            return ((a) create(l9, eVar)).invokeSuspend(A.f21846a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objE = p139n8.b.e();
            int i10 = this.f23351q;
            if (i10 == 0) {
                r.b(obj);
                InterfaceC1163x interfaceC1163x = this.f23352r;
                AbstractC1157q.b bVar = AbstractC1157q.b.STARTED;
                C0599a c0599a = new C0599a(this.f23353s, this.f23354t, this.f23355u, this.f23356v, this.f23357w, this.f23358x, null);
                this.f23351q = 1;
                if (N.b(interfaceC1163x, bVar, c0599a, this) == objE) {
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

    /* JADX INFO: renamed from: o2.b$b, reason: collision with other inner class name */
    public static final class C0615b extends C1069a {
        C0615b() {
        }

        @Override // androidx.core.view.C1069a
        public boolean onRequestSendAccessibilityEvent(ViewGroup host, View child, AccessibilityEvent event) {
            n.h(host, "host");
            n.h(child, "child");
            n.h(event, "event");
            if (event.getEventType() != 8) {
                child.setContentDescription(null);
            }
            return super.onRequestSendAccessibilityEvent(host, child, event);
        }
    }

    private b() {
    }

    public static final void c(View view, c viewModel, InterfaceC1163x lifecycleOwner) {
        n.h(view, "view");
        n.h(viewModel, "viewModel");
        n.h(lifecycleOwner, "lifecycleOwner");
        View viewRequireViewById = view.requireViewById(R.id.slot_tabs);
        n.g(viewRequireViewById, "requireViewById(...)");
        RecyclerView recyclerView = (RecyclerView) viewRequireViewById;
        View viewRequireViewById2 = view.requireViewById(R.id.affordances);
        n.g(viewRequireViewById2, "requireViewById(...)");
        RecyclerView recyclerView2 = (RecyclerView) viewRequireViewById2;
        p133n2.b bVar = new p133n2.b();
        recyclerView.setAdapter(bVar);
        recyclerView.setLayoutManager(new LinearLayoutManager(view.getContext(), 0, false));
        recyclerView.addItemDecoration(new p023c2.a(12));
        H.g0(recyclerView, new C0615b());
        p254z3.a aVar = new p254z3.a(R.layout.keyguard_quick_affordance, lifecycleOwner, null, null, new p() { // from class: o2.a
            @Override // p219v8.p
            public final Object invoke(Object obj, Object obj2) {
                return b.d((View) obj, (p144o3.a) obj2);
            }
        }, 12, null);
        recyclerView2.setAdapter(aVar);
        recyclerView2.setLayoutManager(new LinearLayoutManager(view.getContext(), 0, false));
        recyclerView2.addItemDecoration(new p023c2.a(8));
        AbstractC0816i.d(AbstractC1164y.a(lifecycleOwner), null, null, new a(lifecycleOwner, viewModel, bVar, aVar, recyclerView2, new E(), view, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final A d(View foregroundView, p144o3.a gridIcon) {
        n.h(foregroundView, "foregroundView");
        n.h(gridIcon, "gridIcon");
        ImageView imageView = foregroundView instanceof ImageView ? (ImageView) foregroundView : null;
        if (imageView != null) {
            p134n3.b.f23260a.a(imageView, gridIcon);
        }
        return A.f21846a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Dialog e(Context context, p124m3.a aVar, p219v8.a aVar2) {
        return p114l3.c.d(p114l3.c.f22930a, context, aVar, aVar2, 0, 0, 24, null);
    }
}
