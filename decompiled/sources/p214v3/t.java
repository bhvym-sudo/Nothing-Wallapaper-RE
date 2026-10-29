package p214v3;

import F8.AbstractC0816i;
import F8.L;
import I8.InterfaceC0880f;
import I8.InterfaceC0881g;
import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.lifecycle.AbstractC1157q;
import androidx.lifecycle.AbstractC1164y;
import androidx.lifecycle.InterfaceC1163x;
import androidx.lifecycle.N;
import com.nothing.wallpaper.R;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.n;
import p079h8.A;
import p079h8.r;
import p139n8.b;
import p219v8.p;
import p234x3.e;

/* JADX INFO: loaded from: classes.dex */
public final class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final t f28407a = new t();

    static final class a extends l implements p {

        /* JADX INFO: renamed from: A, reason: collision with root package name */
        final /* synthetic */ boolean f28408A;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f28409q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ InterfaceC1163x f28410r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        final /* synthetic */ e f28411s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ View f28412t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        final /* synthetic */ int f28413u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        final /* synthetic */ int f28414v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        final /* synthetic */ View f28415w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        final /* synthetic */ View f28416x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        final /* synthetic */ View f28417y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        final /* synthetic */ ImageView f28418z;

        /* JADX INFO: renamed from: v3.t$a$a, reason: collision with other inner class name */
        static final class C0710a extends l implements p {

            /* JADX INFO: renamed from: A, reason: collision with root package name */
            final /* synthetic */ boolean f28419A;

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            int f28420q;

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            private /* synthetic */ Object f28421r;

            /* JADX INFO: renamed from: s, reason: collision with root package name */
            final /* synthetic */ p234x3.e f28422s;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            final /* synthetic */ View f28423t;

            /* JADX INFO: renamed from: u, reason: collision with root package name */
            final /* synthetic */ int f28424u;

            /* JADX INFO: renamed from: v, reason: collision with root package name */
            final /* synthetic */ int f28425v;

            /* JADX INFO: renamed from: w, reason: collision with root package name */
            final /* synthetic */ View f28426w;

            /* JADX INFO: renamed from: x, reason: collision with root package name */
            final /* synthetic */ View f28427x;

            /* JADX INFO: renamed from: y, reason: collision with root package name */
            final /* synthetic */ View f28428y;

            /* JADX INFO: renamed from: z, reason: collision with root package name */
            final /* synthetic */ ImageView f28429z;

            /* JADX INFO: renamed from: v3.t$a$a$a, reason: collision with other inner class name */
            static final class C0711a extends l implements p {

                /* JADX INFO: renamed from: q, reason: collision with root package name */
                int f28430q;

                /* JADX INFO: renamed from: r, reason: collision with root package name */
                final /* synthetic */ p234x3.e f28431r;

                /* JADX INFO: renamed from: s, reason: collision with root package name */
                final /* synthetic */ View f28432s;

                /* JADX INFO: renamed from: v3.t$a$a$a$a, reason: collision with other inner class name */
                static final class C0712a implements InterfaceC0881g {

                    /* JADX INFO: renamed from: q, reason: collision with root package name */
                    final /* synthetic */ View f28433q;

                    C0712a(View view) {
                        this.f28433q = view;
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final A f(p219v8.a aVar, View view) {
                        aVar.invoke();
                        return A.f21846a;
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final void i(p219v8.l lVar, View view) {
                        lVar.f(view);
                    }

                    @Override // I8.InterfaceC0881g
                    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
                    public final Object b(final p219v8.a aVar, p129m8.e eVar) {
                        View view = this.f28433q;
                        final p219v8.l lVar = aVar != null ? new p219v8.l() { // from class: v3.r
                            @Override // p219v8.l
                            public final Object f(Object obj) {
                                return t.a.C0710a.C0711a.C0712a.f(aVar, (View) obj);
                            }
                        } : null;
                        view.setOnClickListener(lVar != null ? new View.OnClickListener() { // from class: v3.s
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view2) {
                                t.a.C0710a.C0711a.C0712a.i(lVar, view2);
                            }
                        } : null);
                        return A.f21846a;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0711a(p234x3.e eVar, View view, p129m8.e eVar2) {
                    super(2, eVar2);
                    this.f28431r = eVar;
                    this.f28432s = view;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final p129m8.e create(Object obj, p129m8.e eVar) {
                    return new C0711a(this.f28431r, this.f28432s, eVar);
                }

                @Override // p219v8.p
                public final Object invoke(L l9, p129m8.e eVar) {
                    return ((C0711a) create(l9, eVar)).invokeSuspend(A.f21846a);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    Object objE = p139n8.b.e();
                    int i10 = this.f28430q;
                    if (i10 == 0) {
                        r.b(obj);
                        InterfaceC0880f interfaceC0880fA = this.f28431r.a();
                        C0712a c0712a = new C0712a(this.f28432s);
                        this.f28430q = 1;
                        if (interfaceC0880fA.a(c0712a, this) == objE) {
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

            /* JADX INFO: renamed from: v3.t$a$a$b */
            static final class b extends l implements p {

                /* JADX INFO: renamed from: q, reason: collision with root package name */
                int f28434q;

                /* JADX INFO: renamed from: r, reason: collision with root package name */
                final /* synthetic */ p234x3.e f28435r;

                /* JADX INFO: renamed from: s, reason: collision with root package name */
                final /* synthetic */ View f28436s;

                /* JADX INFO: renamed from: t, reason: collision with root package name */
                final /* synthetic */ int f28437t;

                /* JADX INFO: renamed from: u, reason: collision with root package name */
                final /* synthetic */ int f28438u;

                /* JADX INFO: renamed from: v3.t$a$a$b$a, reason: collision with other inner class name */
                static final class C0713a implements InterfaceC0881g {

                    /* JADX INFO: renamed from: q, reason: collision with root package name */
                    final /* synthetic */ View f28439q;

                    /* JADX INFO: renamed from: r, reason: collision with root package name */
                    final /* synthetic */ int f28440r;

                    /* JADX INFO: renamed from: s, reason: collision with root package name */
                    final /* synthetic */ int f28441s;

                    /* JADX INFO: renamed from: t, reason: collision with root package name */
                    final /* synthetic */ kotlin.jvm.internal.A f28442t;

                    C0713a(View view, int i10, int i11, kotlin.jvm.internal.A a10) {
                        this.f28439q = view;
                        this.f28440r = i10;
                        this.f28441s = i11;
                        this.f28442t = a10;
                    }

                    public final Object a(boolean z9, p129m8.e eVar) {
                        t.f28407a.l(this.f28439q, z9 ? this.f28440r : this.f28441s, !this.f28442t.f22775q);
                        this.f28442t.f22775q = false;
                        return A.f21846a;
                    }

                    @Override // I8.InterfaceC0881g
                    public /* bridge */ /* synthetic */ Object b(Object obj, p129m8.e eVar) {
                        return a(((Boolean) obj).booleanValue(), eVar);
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                b(p234x3.e eVar, View view, int i10, int i11, p129m8.e eVar2) {
                    super(2, eVar2);
                    this.f28435r = eVar;
                    this.f28436s = view;
                    this.f28437t = i10;
                    this.f28438u = i11;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final p129m8.e create(Object obj, p129m8.e eVar) {
                    return new b(this.f28435r, this.f28436s, this.f28437t, this.f28438u, eVar);
                }

                @Override // p219v8.p
                public final Object invoke(L l9, p129m8.e eVar) {
                    return ((b) create(l9, eVar)).invokeSuspend(A.f21846a);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    Object objE = p139n8.b.e();
                    int i10 = this.f28434q;
                    if (i10 == 0) {
                        r.b(obj);
                        kotlin.jvm.internal.A a10 = new kotlin.jvm.internal.A();
                        a10.f22775q = true;
                        InterfaceC0880f interfaceC0880fD = this.f28435r.d();
                        C0713a c0713a = new C0713a(this.f28436s, this.f28437t, this.f28438u, a10);
                        this.f28434q = 1;
                        if (interfaceC0880fD.a(c0713a, this) == objE) {
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

            /* JADX INFO: renamed from: v3.t$a$a$c */
            static final class c extends l implements p {

                /* JADX INFO: renamed from: q, reason: collision with root package name */
                int f28443q;

                /* JADX INFO: renamed from: r, reason: collision with root package name */
                final /* synthetic */ p234x3.e f28444r;

                /* JADX INFO: renamed from: s, reason: collision with root package name */
                final /* synthetic */ View f28445s;

                /* JADX INFO: renamed from: v3.t$a$a$c$a, reason: collision with other inner class name */
                static final class C0714a implements InterfaceC0881g {

                    /* JADX INFO: renamed from: q, reason: collision with root package name */
                    final /* synthetic */ kotlin.jvm.internal.A f28446q;

                    /* JADX INFO: renamed from: r, reason: collision with root package name */
                    final /* synthetic */ View f28447r;

                    C0714a(kotlin.jvm.internal.A a10, View view) {
                        this.f28446q = a10;
                        this.f28447r = view;
                    }

                    public final Object a(boolean z9, p129m8.e eVar) {
                        if (this.f28446q.f22775q) {
                            this.f28447r.setVisibility(z9 ? 0 : 8);
                        } else {
                            t.f28407a.g(this.f28447r, z9);
                        }
                        this.f28446q.f22775q = false;
                        return A.f21846a;
                    }

                    @Override // I8.InterfaceC0881g
                    public /* bridge */ /* synthetic */ Object b(Object obj, p129m8.e eVar) {
                        return a(((Boolean) obj).booleanValue(), eVar);
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                c(p234x3.e eVar, View view, p129m8.e eVar2) {
                    super(2, eVar2);
                    this.f28444r = eVar;
                    this.f28445s = view;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final p129m8.e create(Object obj, p129m8.e eVar) {
                    return new c(this.f28444r, this.f28445s, eVar);
                }

                @Override // p219v8.p
                public final Object invoke(L l9, p129m8.e eVar) {
                    return ((c) create(l9, eVar)).invokeSuspend(A.f21846a);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    Object objE = p139n8.b.e();
                    int i10 = this.f28443q;
                    if (i10 == 0) {
                        r.b(obj);
                        kotlin.jvm.internal.A a10 = new kotlin.jvm.internal.A();
                        a10.f22775q = true;
                        InterfaceC0880f interfaceC0880fF = this.f28444r.f();
                        C0714a c0714a = new C0714a(a10, this.f28445s);
                        this.f28443q = 1;
                        if (interfaceC0880fF.a(c0714a, this) == objE) {
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

            /* JADX INFO: renamed from: v3.t$a$a$d */
            static final class d extends l implements p {

                /* JADX INFO: renamed from: q, reason: collision with root package name */
                int f28448q;

                /* JADX INFO: renamed from: r, reason: collision with root package name */
                final /* synthetic */ p234x3.e f28449r;

                /* JADX INFO: renamed from: s, reason: collision with root package name */
                final /* synthetic */ View f28450s;

                /* JADX INFO: renamed from: v3.t$a$a$d$a, reason: collision with other inner class name */
                static final class C0715a implements InterfaceC0881g {

                    /* JADX INFO: renamed from: q, reason: collision with root package name */
                    final /* synthetic */ kotlin.jvm.internal.A f28451q;

                    /* JADX INFO: renamed from: r, reason: collision with root package name */
                    final /* synthetic */ View f28452r;

                    C0715a(kotlin.jvm.internal.A a10, View view) {
                        this.f28451q = a10;
                        this.f28452r = view;
                    }

                    public final Object a(boolean z9, p129m8.e eVar) {
                        if (this.f28451q.f22775q) {
                            this.f28452r.setVisibility(z9 ? 0 : 8);
                        } else {
                            t.f28407a.g(this.f28452r, z9);
                        }
                        this.f28451q.f22775q = false;
                        t.f28407a.g(this.f28452r, z9);
                        return A.f21846a;
                    }

                    @Override // I8.InterfaceC0881g
                    public /* bridge */ /* synthetic */ Object b(Object obj, p129m8.e eVar) {
                        return a(((Boolean) obj).booleanValue(), eVar);
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                d(p234x3.e eVar, View view, p129m8.e eVar2) {
                    super(2, eVar2);
                    this.f28449r = eVar;
                    this.f28450s = view;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final p129m8.e create(Object obj, p129m8.e eVar) {
                    return new d(this.f28449r, this.f28450s, eVar);
                }

                @Override // p219v8.p
                public final Object invoke(L l9, p129m8.e eVar) {
                    return ((d) create(l9, eVar)).invokeSuspend(A.f21846a);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    Object objE = p139n8.b.e();
                    int i10 = this.f28448q;
                    if (i10 == 0) {
                        r.b(obj);
                        kotlin.jvm.internal.A a10 = new kotlin.jvm.internal.A();
                        a10.f22775q = true;
                        InterfaceC0880f interfaceC0880fG = this.f28449r.g();
                        C0715a c0715a = new C0715a(a10, this.f28450s);
                        this.f28448q = 1;
                        if (interfaceC0880fG.a(c0715a, this) == objE) {
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

            /* JADX INFO: renamed from: v3.t$a$a$e */
            static final class e extends l implements p {

                /* JADX INFO: renamed from: q, reason: collision with root package name */
                int f28453q;

                /* JADX INFO: renamed from: r, reason: collision with root package name */
                final /* synthetic */ p234x3.e f28454r;

                /* JADX INFO: renamed from: s, reason: collision with root package name */
                final /* synthetic */ View f28455s;

                /* JADX INFO: renamed from: v3.t$a$a$e$a, reason: collision with other inner class name */
                static final class C0716a implements InterfaceC0881g {

                    /* JADX INFO: renamed from: q, reason: collision with root package name */
                    final /* synthetic */ View f28456q;

                    C0716a(View view) {
                        this.f28456q = view;
                    }

                    public final Object a(boolean z9, p129m8.e eVar) {
                        t.f28407a.g(this.f28456q, z9);
                        return A.f21846a;
                    }

                    @Override // I8.InterfaceC0881g
                    public /* bridge */ /* synthetic */ Object b(Object obj, p129m8.e eVar) {
                        return a(((Boolean) obj).booleanValue(), eVar);
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                e(p234x3.e eVar, View view, p129m8.e eVar2) {
                    super(2, eVar2);
                    this.f28454r = eVar;
                    this.f28455s = view;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final p129m8.e create(Object obj, p129m8.e eVar) {
                    return new e(this.f28454r, this.f28455s, eVar);
                }

                @Override // p219v8.p
                public final Object invoke(L l9, p129m8.e eVar) {
                    return ((e) create(l9, eVar)).invokeSuspend(A.f21846a);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    Object objE = p139n8.b.e();
                    int i10 = this.f28453q;
                    if (i10 == 0) {
                        r.b(obj);
                        InterfaceC0880f interfaceC0880fE = this.f28454r.e();
                        C0716a c0716a = new C0716a(this.f28455s);
                        this.f28453q = 1;
                        if (interfaceC0880fE.a(c0716a, this) == objE) {
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

            /* JADX INFO: renamed from: v3.t$a$a$f */
            static final class f extends l implements p {

                /* JADX INFO: renamed from: q, reason: collision with root package name */
                int f28457q;

                /* JADX INFO: renamed from: r, reason: collision with root package name */
                final /* synthetic */ p234x3.e f28458r;

                /* JADX INFO: renamed from: s, reason: collision with root package name */
                final /* synthetic */ ImageView f28459s;

                /* JADX INFO: renamed from: t, reason: collision with root package name */
                final /* synthetic */ boolean f28460t;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                f(p234x3.e eVar, ImageView imageView, boolean z9, p129m8.e eVar2) {
                    super(2, eVar2);
                    this.f28458r = eVar;
                    this.f28459s = imageView;
                    this.f28460t = z9;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final p129m8.e create(Object obj, p129m8.e eVar) {
                    return new f(this.f28458r, this.f28459s, this.f28460t, eVar);
                }

                @Override // p219v8.p
                public final Object invoke(L l9, p129m8.e eVar) {
                    return ((f) create(l9, eVar)).invokeSuspend(A.f21846a);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    Object objE = p139n8.b.e();
                    int i10 = this.f28457q;
                    if (i10 == 0) {
                        r.b(obj);
                        p219v8.l lVarC = this.f28458r.c();
                        this.f28457q = 1;
                        obj = lVarC.f(this);
                        if (obj == objE) {
                            return objE;
                        }
                    } else {
                        if (i10 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        r.b(obj);
                    }
                    Bitmap bitmap = (Bitmap) obj;
                    if (!n.d(this.f28459s.getTag(), bitmap)) {
                        this.f28459s.setTag(bitmap);
                        if (bitmap != null) {
                            this.f28459s.setImageBitmap(bitmap);
                            if (this.f28460t) {
                                t.f28407a.i(this.f28459s);
                            } else {
                                this.f28459s.setVisibility(0);
                            }
                        } else if (this.f28460t) {
                            t.f28407a.j(this.f28459s);
                        } else {
                            this.f28459s.setVisibility(8);
                        }
                    }
                    return A.f21846a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0710a(p234x3.e eVar, View view, int i10, int i11, View view2, View view3, View view4, ImageView imageView, boolean z9, p129m8.e eVar2) {
                super(2, eVar2);
                this.f28422s = eVar;
                this.f28423t = view;
                this.f28424u = i10;
                this.f28425v = i11;
                this.f28426w = view2;
                this.f28427x = view3;
                this.f28428y = view4;
                this.f28429z = imageView;
                this.f28419A = z9;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final p129m8.e create(Object obj, p129m8.e eVar) {
                C0710a c0710a = new C0710a(this.f28422s, this.f28423t, this.f28424u, this.f28425v, this.f28426w, this.f28427x, this.f28428y, this.f28429z, this.f28419A, eVar);
                c0710a.f28421r = obj;
                return c0710a;
            }

            @Override // p219v8.p
            public final Object invoke(L l9, p129m8.e eVar) {
                return ((C0710a) create(l9, eVar)).invokeSuspend(A.f21846a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                p139n8.b.e();
                if (this.f28420q != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                r.b(obj);
                L l9 = (L) this.f28421r;
                AbstractC0816i.d(l9, null, null, new C0711a(this.f28422s, this.f28423t, null), 3, null);
                AbstractC0816i.d(l9, null, null, new b(this.f28422s, this.f28423t, this.f28424u, this.f28425v, null), 3, null);
                AbstractC0816i.d(l9, null, null, new c(this.f28422s, this.f28426w, null), 3, null);
                AbstractC0816i.d(l9, null, null, new d(this.f28422s, this.f28427x, null), 3, null);
                AbstractC0816i.d(l9, null, null, new e(this.f28422s, this.f28428y, null), 3, null);
                AbstractC0816i.d(l9, null, null, new f(this.f28422s, this.f28429z, this.f28419A, null), 3, null);
                return A.f21846a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(InterfaceC1163x interfaceC1163x, e eVar, View view, int i10, int i11, View view2, View view3, View view4, ImageView imageView, boolean z9, p129m8.e eVar2) {
            super(2, eVar2);
            this.f28410r = interfaceC1163x;
            this.f28411s = eVar;
            this.f28412t = view;
            this.f28413u = i10;
            this.f28414v = i11;
            this.f28415w = view2;
            this.f28416x = view3;
            this.f28417y = view4;
            this.f28418z = imageView;
            this.f28408A = z9;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final p129m8.e create(Object obj, p129m8.e eVar) {
            return new a(this.f28410r, this.f28411s, this.f28412t, this.f28413u, this.f28414v, this.f28415w, this.f28416x, this.f28417y, this.f28418z, this.f28408A, eVar);
        }

        @Override // p219v8.p
        public final Object invoke(L l9, p129m8.e eVar) {
            return ((a) create(l9, eVar)).invokeSuspend(A.f21846a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objE = b.e();
            int i10 = this.f28409q;
            if (i10 == 0) {
                r.b(obj);
                InterfaceC1163x interfaceC1163x = this.f28410r;
                AbstractC1157q.b bVar = AbstractC1157q.b.STARTED;
                C0710a c0710a = new C0710a(this.f28411s, this.f28412t, this.f28413u, this.f28414v, this.f28415w, this.f28416x, this.f28417y, this.f28418z, this.f28408A, null);
                this.f28409q = 1;
                if (N.b(interfaceC1163x, bVar, c0710a, this) == objE) {
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

    private t() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void g(View view, boolean z9) {
        if (z9) {
            i(view);
        } else {
            j(view);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void i(View view) {
        if (view.getVisibility() == 0) {
            return;
        }
        view.setAlpha(0.0f);
        view.setVisibility(0);
        view.animate().alpha(1.0f).start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void j(final View view) {
        if (view.getVisibility() == 0) {
            view.animate().alpha(0.0f).withEndAction(new Runnable() { // from class: v3.q
                @Override // java.lang.Runnable
                public final void run() {
                    t.k(view);
                }
            }).start();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void k(View view) {
        view.setVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void l(final View view, int i10, boolean z9) {
        if (!z9) {
            n(view, i10);
            return;
        }
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(view.getWidth(), i10);
        valueAnimatorOfInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: v3.p
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                t.m(view, valueAnimator);
            }
        });
        valueAnimatorOfInt.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void m(View view, ValueAnimator it) {
        n.h(it, "it");
        Object animatedValue = it.getAnimatedValue();
        n.f(animatedValue, "null cannot be cast to non-null type kotlin.Int");
        n(view, ((Integer) animatedValue).intValue());
    }

    private static final void n(View view, int i10) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        layoutParams.width = i10;
        view.setLayoutParams(layoutParams);
    }

    public final void h(View view, e viewModel, InterfaceC1163x lifecycleOwner, int i10, int i11, boolean z9) {
        n.h(view, "view");
        n.h(viewModel, "viewModel");
        n.h(lifecycleOwner, "lifecycleOwner");
        View viewRequireViewById = view.requireViewById(R.id.selection_border);
        n.g(viewRequireViewById, "requireViewById(...)");
        View viewRequireViewById2 = view.requireViewById(R.id.selection_icon);
        n.g(viewRequireViewById2, "requireViewById(...)");
        View viewRequireViewById3 = view.requireViewById(R.id.progress_indicator);
        n.g(viewRequireViewById3, "requireViewById(...)");
        View viewRequireViewById4 = view.requireViewById(R.id.thumbnail);
        n.g(viewRequireViewById4, "requireViewById(...)");
        ImageView imageView = (ImageView) viewRequireViewById4;
        View viewRequireViewById5 = view.requireViewById(R.id.placeholder);
        n.g(viewRequireViewById5, "requireViewById(...)");
        ((ImageView) viewRequireViewById5).setBackgroundColor(viewModel.b());
        AbstractC0816i.d(AbstractC1164y.a(lifecycleOwner), null, null, new a(lifecycleOwner, viewModel, view, i11, i10, viewRequireViewById, viewRequireViewById2, viewRequireViewById3, imageView, z9, null), 3, null);
    }
}
