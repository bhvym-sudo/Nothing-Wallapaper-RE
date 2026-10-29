package com.nothing.blurwallpaper;

import F8.AbstractC0816i;
import F8.C0803b0;
import F8.InterfaceC0846x0;
import F8.L;
import F8.M;
import F8.W;
import I8.A;
import I8.AbstractC0882h;
import I8.InterfaceC0880f;
import I8.InterfaceC0881g;
import I8.Q;
import android.app.KeyguardManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Point;
import android.os.RemoteCallback;
import androidx.lifecycle.AbstractC1157q;
import androidx.lifecycle.AbstractC1164y;
import androidx.lifecycle.InterfaceC1148h;
import androidx.lifecycle.InterfaceC1163x;
import androidx.lifecycle.N;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.nothing.blurwallpaper.e;
import java.lang.reflect.Type;
import java.util.List;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.AbstractC1457h;
import kotlin.jvm.internal.n;
import p079h8.o;
import p079h8.q;
import p079h8.r;
import p129m8.j;
import p166q5.v;
import p219v8.p;

/* JADX INFO: loaded from: classes.dex */
public final class e implements InterfaceC1148h {

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public static final a f17773B = new a(null);

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private final SharedPreferences.OnSharedPreferenceChangeListener f17774A;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final Context f17775q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final com.nothing.blurwallpaper.a f17776r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final com.nothing.blurwallpaper.a.InterfaceC0469a f17777s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final boolean f17778t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private InterfaceC1163x f17779u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private SharedPreferences f17780v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private InterfaceC0846x0 f17781w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private InterfaceC0846x0 f17782x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private boolean f17783y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private final A f17784z;

    public static final class a {
        public /* synthetic */ a(AbstractC1457h abstractC1457h) {
            this();
        }

        private a() {
        }
    }

    static final class b extends l implements p {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f17785q;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        final /* synthetic */ String f17787s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ String f17788t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(String str, String str2, p129m8.e eVar) {
            super(2, eVar);
            this.f17787s = str;
            this.f17788t = str2;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final p129m8.e create(Object obj, p129m8.e eVar) {
            return e.this.new b(this.f17787s, this.f17788t, eVar);
        }

        @Override // p219v8.p
        public final Object invoke(L l9, p129m8.e eVar) {
            return ((b) create(l9, eVar)).invokeSuspend(p079h8.A.f21846a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            p139n8.b.e();
            if (this.f17785q != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            r.b(obj);
            e.this.B(this.f17787s, this.f17788t, false);
            return p079h8.A.f21846a;
        }
    }

    public static final class c extends l implements p {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f17789q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ InterfaceC1163x f17790r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        final /* synthetic */ AbstractC1157q.b f17791s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ InterfaceC0880f f17792t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        final /* synthetic */ e f17793u;

        public static final class a extends l implements p {

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            int f17794q;

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            final /* synthetic */ InterfaceC0880f f17795r;

            /* JADX INFO: renamed from: s, reason: collision with root package name */
            final /* synthetic */ e f17796s;

            /* JADX INFO: renamed from: com.nothing.blurwallpaper.e$c$a$a, reason: collision with other inner class name */
            public static final class C0473a implements InterfaceC0881g {

                /* JADX INFO: renamed from: q, reason: collision with root package name */
                final /* synthetic */ e f17797q;

                public C0473a(e eVar) {
                    this.f17797q = eVar;
                }

                @Override // I8.InterfaceC0881g
                public final Object b(Object obj, p129m8.e eVar) {
                    this.f17797q.w().A(((Boolean) obj).booleanValue());
                    return p079h8.A.f21846a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(InterfaceC0880f interfaceC0880f, p129m8.e eVar, e eVar2) {
                super(2, eVar);
                this.f17795r = interfaceC0880f;
                this.f17796s = eVar2;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final p129m8.e create(Object obj, p129m8.e eVar) {
                return new a(this.f17795r, eVar, this.f17796s);
            }

            @Override // p219v8.p
            public final Object invoke(L l9, p129m8.e eVar) {
                return ((a) create(l9, eVar)).invokeSuspend(p079h8.A.f21846a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object objE = p139n8.b.e();
                int i10 = this.f17794q;
                if (i10 == 0) {
                    r.b(obj);
                    InterfaceC0880f interfaceC0880f = this.f17795r;
                    C0473a c0473a = new C0473a(this.f17796s);
                    this.f17794q = 1;
                    if (interfaceC0880f.a(c0473a, this) == objE) {
                        return objE;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    r.b(obj);
                }
                return p079h8.A.f21846a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(InterfaceC1163x interfaceC1163x, AbstractC1157q.b bVar, InterfaceC0880f interfaceC0880f, p129m8.e eVar, e eVar2) {
            super(2, eVar);
            this.f17790r = interfaceC1163x;
            this.f17791s = bVar;
            this.f17792t = interfaceC0880f;
            this.f17793u = eVar2;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final p129m8.e create(Object obj, p129m8.e eVar) {
            return new c(this.f17790r, this.f17791s, this.f17792t, eVar, this.f17793u);
        }

        @Override // p219v8.p
        public final Object invoke(L l9, p129m8.e eVar) {
            return ((c) create(l9, eVar)).invokeSuspend(p079h8.A.f21846a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objE = p139n8.b.e();
            int i10 = this.f17789q;
            if (i10 == 0) {
                r.b(obj);
                AbstractC1157q lifecycle = this.f17790r.getLifecycle();
                AbstractC1157q.b bVar = this.f17791s;
                a aVar = new a(this.f17792t, null, this.f17793u);
                this.f17789q = 1;
                if (N.a(lifecycle, bVar, aVar, this) == objE) {
                    return objE;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                r.b(obj);
            }
            return p079h8.A.f21846a;
        }
    }

    static final class d extends l implements p {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f17798q;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        final /* synthetic */ boolean f17800s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(boolean z9, p129m8.e eVar) {
            super(2, eVar);
            this.f17800s = z9;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final p129m8.e create(Object obj, p129m8.e eVar) {
            return e.this.new d(this.f17800s, eVar);
        }

        @Override // p219v8.p
        public final Object invoke(L l9, p129m8.e eVar) {
            return ((d) create(l9, eVar)).invokeSuspend(p079h8.A.f21846a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            p139n8.b.e();
            if (this.f17798q != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            r.b(obj);
            SharedPreferences sharedPreferencesD = v.f25076a.d(e.this.t());
            String string = sharedPreferencesD.getString("final_image_path", null);
            String string2 = sharedPreferencesD.getString("final_vertex_infos", null);
            if (string != null && string2 != null) {
                e.this.B(string, string2, this.f17800s);
            }
            return p079h8.A.f21846a;
        }
    }

    /* JADX INFO: renamed from: com.nothing.blurwallpaper.e$e, reason: collision with other inner class name */
    public static final class C0474e extends TypeToken<List<? extends VertexInfo>> {
        C0474e() {
        }
    }

    static final class f extends l implements p {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f17801q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private /* synthetic */ Object f17802r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ String f17804t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        final /* synthetic */ boolean f17805u;

        static final class a implements InterfaceC0881g {

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            final /* synthetic */ String f17806q;

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            final /* synthetic */ e f17807r;

            /* JADX INFO: renamed from: s, reason: collision with root package name */
            final /* synthetic */ L f17808s;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            final /* synthetic */ boolean f17809t;

            a(String str, e eVar, L l9, boolean z9) {
                this.f17806q = str;
                this.f17807r = eVar;
                this.f17808s = l9;
                this.f17809t = z9;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final p079h8.A f(final e eVar, o oVar, boolean z9, final int i10, final int i11, final byte[] bitmapArray) {
                n.h(bitmapArray, "bitmapArray");
                eVar.u().setValue(Boolean.TRUE);
                final List list = (List) oVar.d();
                eVar.s().c(new p219v8.a() { // from class: com.nothing.blurwallpaper.g
                    @Override // p219v8.a
                    public final Object invoke() {
                        return e.f.a.i(eVar, i10, i11, bitmapArray, list);
                    }
                });
                if (!z9) {
                    eVar.u().setValue(Boolean.FALSE);
                }
                return p079h8.A.f21846a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final p079h8.A i(e eVar, int i10, int i11, byte[] bArr, List list) {
                com.nothing.wallpaper.common.log.c.k("BLUR-RenderController", "loadCustomForPreview set image and vertex.");
                eVar.w().C(0, i10, i11, bArr);
                eVar.w().J(list);
                return p079h8.A.f21846a;
            }

            @Override // I8.InterfaceC0881g
            /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
            public final Object b(final o oVar, p129m8.e eVar) {
                Object objB;
                com.nothing.wallpaper.common.log.c.k("BLUR-RenderController", "loadCustomForPreview: " + this.f17806q + ", reqSize=" + this.f17807r.x());
                final e eVar2 = this.f17807r;
                String str = this.f17806q;
                final boolean z9 = this.f17809t;
                try {
                    q.a aVar = q.f21862r;
                    p166q5.n.f25056a.r(eVar2.t(), str, eVar2.x(), new p219v8.q() { // from class: com.nothing.blurwallpaper.f
                        @Override // p219v8.q
                        public final Object e(Object obj, Object obj2, Object obj3) {
                            return e.f.a.f(eVar2, oVar, z9, ((Integer) obj).intValue(), ((Integer) obj2).intValue(), (byte[]) obj3);
                        }
                    });
                    objB = q.b(p079h8.A.f21846a);
                } catch (Throwable th) {
                    q.a aVar2 = q.f21862r;
                    objB = q.b(r.a(th));
                }
                Throwable thD = q.d(objB);
                if (thD != null) {
                    com.nothing.wallpaper.common.log.c.g("BLUR-RenderController", "loadCustomForPreview: onFailure", thD);
                }
                M.d(this.f17808s, null, 1, null);
                return p079h8.A.f21846a;
            }
        }

        public static final class b implements InterfaceC0880f {

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            final /* synthetic */ InterfaceC0880f f17810q;

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            final /* synthetic */ String f17811r;

            public static final class a implements InterfaceC0881g {

                /* JADX INFO: renamed from: q, reason: collision with root package name */
                final /* synthetic */ InterfaceC0881g f17812q;

                /* JADX INFO: renamed from: r, reason: collision with root package name */
                final /* synthetic */ String f17813r;

                /* JADX INFO: renamed from: com.nothing.blurwallpaper.e$f$b$a$a, reason: collision with other inner class name */
                public static final class C0475a extends kotlin.coroutines.jvm.internal.d {

                    /* JADX INFO: renamed from: q, reason: collision with root package name */
                    /* synthetic */ Object f17814q;

                    /* JADX INFO: renamed from: r, reason: collision with root package name */
                    int f17815r;

                    public C0475a(p129m8.e eVar) {
                        super(eVar);
                    }

                    @Override // kotlin.coroutines.jvm.internal.a
                    public final Object invokeSuspend(Object obj) {
                        this.f17814q = obj;
                        this.f17815r |= Integer.MIN_VALUE;
                        return a.this.b(null, this);
                    }
                }

                public a(InterfaceC0881g interfaceC0881g, String str) {
                    this.f17812q = interfaceC0881g;
                    this.f17813r = str;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                @Override // I8.InterfaceC0881g
                public final Object b(Object obj, p129m8.e eVar) {
                    C0475a c0475a;
                    if (eVar instanceof C0475a) {
                        c0475a = (C0475a) eVar;
                        int i10 = c0475a.f17815r;
                        if ((i10 & Integer.MIN_VALUE) != 0) {
                            c0475a.f17815r = i10 - Integer.MIN_VALUE;
                        } else {
                            c0475a = new C0475a(eVar);
                        }
                    } else {
                        c0475a = new C0475a(eVar);
                    }
                    Object obj2 = c0475a.f17814q;
                    Object objE = p139n8.b.e();
                    int i11 = c0475a.f17815r;
                    if (i11 == 0) {
                        r.b(obj2);
                        InterfaceC0881g interfaceC0881g = this.f17812q;
                        if (n.d(this.f17813r, ((o) obj).c())) {
                            c0475a.f17815r = 1;
                            if (interfaceC0881g.b(obj, c0475a) == objE) {
                                return objE;
                            }
                        }
                    } else {
                        if (i11 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        r.b(obj2);
                    }
                    return p079h8.A.f21846a;
                }
            }

            public b(InterfaceC0880f interfaceC0880f, String str) {
                this.f17810q = interfaceC0880f;
                this.f17811r = str;
            }

            @Override // I8.InterfaceC0880f
            public Object a(InterfaceC0881g interfaceC0881g, p129m8.e eVar) {
                Object objA = this.f17810q.a(new a(interfaceC0881g, this.f17811r), eVar);
                return objA == p139n8.b.e() ? objA : p079h8.A.f21846a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(String str, boolean z9, p129m8.e eVar) {
            super(2, eVar);
            this.f17804t = str;
            this.f17805u = z9;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final p129m8.e create(Object obj, p129m8.e eVar) {
            f fVar = e.this.new f(this.f17804t, this.f17805u, eVar);
            fVar.f17802r = obj;
            return fVar;
        }

        @Override // p219v8.p
        public final Object invoke(L l9, p129m8.e eVar) {
            return ((f) create(l9, eVar)).invokeSuspend(p079h8.A.f21846a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objE = p139n8.b.e();
            int i10 = this.f17801q;
            if (i10 == 0) {
                r.b(obj);
                L l9 = (L) this.f17802r;
                b bVar = new b(com.nothing.blurwallpaper.c.f17732v.b(e.this.t(), p117l6.a.f22963e.c(this.f17804t)).h(), this.f17804t);
                a aVar = new a(this.f17804t, e.this, l9, this.f17805u);
                this.f17801q = 1;
                if (bVar.a(aVar, this) == objE) {
                    return objE;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                r.b(obj);
            }
            return p079h8.A.f21846a;
        }
    }

    public static final class g extends TypeToken<List<? extends VertexInfo>> {
        g() {
        }
    }

    static final class h extends l implements p {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f17817q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private /* synthetic */ Object f17818r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ boolean f17820t;

        static final class a extends l implements p {

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            int f17821q;

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            final /* synthetic */ e f17822r;

            /* JADX INFO: renamed from: s, reason: collision with root package name */
            final /* synthetic */ boolean f17823s;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(e eVar, boolean z9, p129m8.e eVar2) {
                super(2, eVar2);
                this.f17822r = eVar;
                this.f17823s = z9;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final p129m8.e create(Object obj, p129m8.e eVar) {
                return new a(this.f17822r, this.f17823s, eVar);
            }

            @Override // p219v8.p
            public final Object invoke(L l9, p129m8.e eVar) {
                return ((a) create(l9, eVar)).invokeSuspend(p079h8.A.f21846a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                p139n8.b.e();
                if (this.f17821q != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                r.b(obj);
                this.f17822r.H(this.f17823s);
                return p079h8.A.f21846a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(boolean z9, p129m8.e eVar) {
            super(2, eVar);
            this.f17820t = z9;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final p129m8.e create(Object obj, p129m8.e eVar) {
            h hVar = e.this.new h(this.f17820t, eVar);
            hVar.f17818r = obj;
            return hVar;
        }

        @Override // p219v8.p
        public final Object invoke(L l9, p129m8.e eVar) {
            return ((h) create(l9, eVar)).invokeSuspend(p079h8.A.f21846a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            p139n8.b.e();
            if (this.f17817q != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            r.b(obj);
            L l9 = (L) this.f17818r;
            SharedPreferences sharedPreferences = e.this.f17780v;
            String string = sharedPreferences != null ? sharedPreferences.getString("final_image_path", null) : null;
            SharedPreferences sharedPreferences2 = e.this.f17780v;
            String string2 = sharedPreferences2 != null ? sharedPreferences2.getString("final_vertex_infos", null) : null;
            com.nothing.wallpaper.common.log.c.d("BLUR-RenderController", "loadWallpaper: fileImagePath=" + string + ", finalVertexInfos=" + string2);
            if (string == null || string.length() == 0 || string2 == null || string2.length() == 0) {
                InterfaceC0846x0 interfaceC0846x0 = e.this.f17782x;
                if (interfaceC0846x0 != null) {
                    InterfaceC0846x0.a.a(interfaceC0846x0, null, 1, null);
                }
                e eVar = e.this;
                eVar.f17782x = AbstractC0816i.d(l9, null, null, new a(eVar, this.f17820t, null), 3, null);
            } else {
                e.this.B(string, string2, this.f17820t);
            }
            return p079h8.A.f21846a;
        }
    }

    static final class i extends l implements p {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f17824q;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        final /* synthetic */ boolean f17826s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(boolean z9, p129m8.e eVar) {
            super(2, eVar);
            this.f17826s = z9;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final p129m8.e create(Object obj, p129m8.e eVar) {
            return e.this.new i(this.f17826s, eVar);
        }

        @Override // p219v8.p
        public final Object invoke(L l9, p129m8.e eVar) {
            return ((i) create(l9, eVar)).invokeSuspend(p079h8.A.f21846a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objE = p139n8.b.e();
            int i10 = this.f17824q;
            if (i10 == 0) {
                r.b(obj);
                this.f17824q = 1;
                if (W.b(500L, this) == objE) {
                    return objE;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                r.b(obj);
            }
            if (!e.this.A()) {
                com.nothing.wallpaper.common.log.c.o("BLUR-RenderController", "Not receive NT onCommand in 500 ms, load final wallpaper");
                e.this.M(this.f17826s);
            }
            return p079h8.A.f21846a;
        }
    }

    public e(Context context, com.nothing.blurwallpaper.a renderer, com.nothing.blurwallpaper.a.InterfaceC0469a callbacks, boolean z9) {
        n.h(context, "context");
        n.h(renderer, "renderer");
        n.h(callbacks, "callbacks");
        this.f17775q = context;
        this.f17776r = renderer;
        this.f17777s = callbacks;
        this.f17778t = z9;
        this.f17784z = Q.a(Boolean.TRUE);
        renderer.A(((Boolean) com.nothing.wallpaper.common.log.c.f18435a.i().getValue()).booleanValue());
        this.f17774A = new SharedPreferences.OnSharedPreferenceChangeListener() { // from class: q5.z
            @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
            public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
                e.r(this.f25088a, sharedPreferences, str);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void B(String str, String str2, final boolean z9) {
        Object objB;
        try {
            q.a aVar = q.f21862r;
            boolean z10 = this.f17778t && !v() && y();
            com.nothing.wallpaper.common.log.c.k("BLUR-RenderController", "loadCustomForFinal isPreview=" + this.f17778t + " imageFilePath=" + str + ", vertexInfos=" + str2 + ", isLockScreen=" + z9 + ", reqSize=" + x() + ", noNeedImage=" + z10);
            Type type = new C0474e().getType();
            n.g(type, "getType(...)");
            Object objFromJson = new Gson().fromJson(str2, type);
            n.g(objFromJson, "fromJson(...)");
            final List list = (List) objFromJson;
            if (z10) {
                this.f17777s.c(new p219v8.a() { // from class: q5.x
                    @Override // p219v8.a
                    public final Object invoke() {
                        return e.D(this.f25083q, list);
                    }
                });
                if (!z9) {
                    this.f17784z.setValue(Boolean.FALSE);
                }
            } else {
                p166q5.n.f25056a.o(this.f17775q, str, x(), new p219v8.q() { // from class: q5.y
                    @Override // p219v8.q
                    public final Object e(Object obj, Object obj2, Object obj3) {
                        return e.E(this.f25085q, z9, list, ((Integer) obj).intValue(), ((Integer) obj2).intValue(), (byte[]) obj3);
                    }
                });
            }
            objB = q.b(p079h8.A.f21846a);
        } catch (Throwable th) {
            q.a aVar2 = q.f21862r;
            objB = q.b(r.a(th));
        }
        Throwable thD = q.d(objB);
        if (thD != null) {
            com.nothing.wallpaper.common.log.c.g("BLUR-RenderController", "loadCustomForFinal: onFailure", thD);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p079h8.A D(e eVar, List list) {
        com.nothing.wallpaper.common.log.c.k("BLUR-RenderController", "loadCustomFinal.noNeedImage set image and vertex..");
        eVar.f17776r.C(0, 1, 1, new byte[1]);
        eVar.f17776r.J(list);
        return p079h8.A.f21846a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p079h8.A E(final e eVar, boolean z9, final List list, final int i10, final int i11, final byte[] bitmapArray) {
        n.h(bitmapArray, "bitmapArray");
        eVar.f17784z.setValue(Boolean.TRUE);
        eVar.f17777s.c(new p219v8.a() { // from class: q5.A
            @Override // p219v8.a
            public final Object invoke() {
                return e.F(this.f25015q, i10, i11, bitmapArray, list);
            }
        });
        if (!z9) {
            eVar.f17784z.setValue(Boolean.FALSE);
        }
        return p079h8.A.f21846a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p079h8.A F(e eVar, int i10, int i11, byte[] bArr, List list) {
        com.nothing.wallpaper.common.log.c.k("BLUR-RenderController", "loadCustomFinal set image and vertex.");
        eVar.f17776r.C(0, i10, i11, bArr);
        eVar.f17776r.J(list);
        return p079h8.A.f21846a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void H(final boolean z9) {
        com.nothing.wallpaper.common.log.c.k("BLUR-RenderController", "loadDefault isPreview=" + this.f17778t + " isLockScreen=" + z9);
        p166q5.n nVar = p166q5.n.f25056a;
        final int iL = nVar.l();
        nVar.q(this.f17775q, iL, x(), new p219v8.q() { // from class: q5.B
            @Override // p219v8.q
            public final Object e(Object obj, Object obj2, Object obj3) {
                return e.I(this.f25020q, z9, iL, ((Integer) obj).intValue(), ((Integer) obj2).intValue(), (byte[]) obj3);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p079h8.A I(final e eVar, final boolean z9, int i10, final int i11, final int i12, final byte[] bitmapArray) {
        n.h(bitmapArray, "bitmapArray");
        final SharedPreferences sharedPreferencesD = v.f25076a.d(eVar.f17775q);
        String string = sharedPreferencesD.getString("default_vertex_infos", null);
        final p219v8.l lVar = new p219v8.l() { // from class: q5.C
            @Override // p219v8.l
            public final Object f(Object obj) {
                return e.J(this.f25023q, z9, i11, i12, bitmapArray, (List) obj);
            }
        };
        if (string != null) {
            Type type = new g().getType();
            n.g(type, "getType(...)");
            Object objFromJson = new Gson().fromJson(string, type);
            n.g(objFromJson, "fromJson(...)");
            lVar.f(objFromJson);
        } else {
            p166q5.n.f25056a.u(eVar.f17775q, i10, new p() { // from class: q5.D
                @Override // p219v8.p
                public final Object invoke(Object obj, Object obj2) {
                    return e.L(sharedPreferencesD, lVar, (List) obj, (List) obj2);
                }
            });
        }
        return p079h8.A.f21846a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p079h8.A J(final e eVar, boolean z9, final int i10, final int i11, final byte[] bArr, final List list) {
        n.h(list, "list");
        InterfaceC0846x0 interfaceC0846x0 = eVar.f17782x;
        if (interfaceC0846x0 != null && interfaceC0846x0.a()) {
            eVar.f17784z.setValue(Boolean.TRUE);
            eVar.f17777s.c(new p219v8.a() { // from class: q5.E
                @Override // p219v8.a
                public final Object invoke() {
                    return e.K(this.f25030q, i10, i11, bArr, list);
                }
            });
            if (!z9) {
                eVar.f17784z.setValue(Boolean.FALSE);
            }
        }
        return p079h8.A.f21846a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p079h8.A K(e eVar, int i10, int i11, byte[] bArr, List list) {
        com.nothing.wallpaper.common.log.c.k("BLUR-RenderController", "loadDefault set image and vertex.");
        eVar.f17776r.C(0, i10, i11, bArr);
        eVar.f17776r.J(list);
        return p079h8.A.f21846a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p079h8.A L(SharedPreferences sharedPreferences, p219v8.l lVar, List swatchList, List vertexInfos) {
        n.h(swatchList, "swatchList");
        n.h(vertexInfos, "vertexInfos");
        SharedPreferences.Editor editorEdit = sharedPreferences.edit();
        SharedPreferences.Editor editorEdit2 = sharedPreferences.edit();
        editorEdit2.putString("default_vertex_infos", new Gson().toJson(vertexInfos));
        editorEdit2.apply();
        editorEdit.apply();
        lVar.f(vertexInfos);
        return p079h8.A.f21846a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void M(boolean z9) {
        InterfaceC1163x interfaceC1163x = this.f17779u;
        if (interfaceC1163x == null) {
            n.r("owner");
            interfaceC1163x = null;
        }
        AbstractC0816i.d(AbstractC1164y.a(interfaceC1163x), C0803b0.b(), null, new h(z9, null), 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void r(e eVar, SharedPreferences sharedPreferences, String str) {
        com.nothing.wallpaper.common.log.c.k("BLUR-RenderController", "onSharedPreferenceChanged: key=" + str + ", value=" + sharedPreferences.getString(str, null));
        if (!n.d(str, "final_vertex_infos")) {
            if (!n.d(str, "final_colors") || eVar.f17778t) {
                return;
            }
            eVar.f17777s.notifyColorsChanged();
            return;
        }
        String string = sharedPreferences.getString("final_image_path", null);
        String string2 = sharedPreferences.getString("final_vertex_infos", null);
        if (string == null || string2 == null) {
            return;
        }
        InterfaceC0846x0 interfaceC0846x0 = eVar.f17782x;
        if (interfaceC0846x0 != null) {
            InterfaceC0846x0.a.a(interfaceC0846x0, null, 1, null);
        }
        InterfaceC1163x interfaceC1163x = eVar.f17779u;
        if (interfaceC1163x == null) {
            n.r("owner");
            interfaceC1163x = null;
        }
        AbstractC0816i.d(AbstractC1164y.a(interfaceC1163x), C0803b0.b(), null, eVar.new b(string, string2, null), 2, null);
    }

    private final void z() {
        this.f17776r.E(30, 14, 0.14f, 1.0f, 185, 0);
        InterfaceC0880f interfaceC0880fQ = AbstractC0882h.q(com.nothing.wallpaper.common.log.c.f18435a.i(), 1);
        InterfaceC1163x interfaceC1163x = this.f17779u;
        if (interfaceC1163x == null) {
            n.r("owner");
            interfaceC1163x = null;
        }
        InterfaceC1163x interfaceC1163x2 = interfaceC1163x;
        AbstractC1157q.b bVar = AbstractC1157q.b.STARTED;
        AbstractC0816i.d(AbstractC1164y.a(interfaceC1163x2), j.f23252q, null, new c(interfaceC1163x2, bVar, interfaceC0880fQ, null, this), 2, null);
    }

    public final boolean A() {
        return this.f17783y;
    }

    public final void C(boolean z9) {
        InterfaceC1163x interfaceC1163x = this.f17779u;
        if (interfaceC1163x == null) {
            n.r("owner");
            interfaceC1163x = null;
        }
        AbstractC0816i.d(AbstractC1164y.a(interfaceC1163x), C0803b0.b(), null, new d(z9, null), 2, null);
    }

    public final void G(String imageFilePath, boolean z9) {
        n.h(imageFilePath, "imageFilePath");
        InterfaceC0846x0 interfaceC0846x0 = this.f17781w;
        if (interfaceC0846x0 != null) {
            InterfaceC0846x0.a.a(interfaceC0846x0, null, 1, null);
        }
        InterfaceC1163x interfaceC1163x = this.f17779u;
        if (interfaceC1163x == null) {
            n.r("owner");
            interfaceC1163x = null;
        }
        this.f17781w = AbstractC0816i.d(AbstractC1164y.a(interfaceC1163x), C0803b0.b(), null, new f(imageFilePath, z9, null), 2, null);
    }

    public final void N(RemoteCallback remoteCallback) {
        this.f17776r.B(remoteCallback);
    }

    public final void O(boolean z9) {
        this.f17783y = z9;
    }

    public final void P(boolean z9) {
        this.f17776r.F(z9);
    }

    public final void Q(Point point) {
        n.h(point, "<set-?>");
        this.f17776r.H(point);
    }

    public final void R(boolean z9) {
        this.f17776r.I(z9);
    }

    @Override // androidx.lifecycle.InterfaceC1148h
    public void g(InterfaceC1163x owner) {
        n.h(owner, "owner");
        this.f17779u = owner;
        super.g(owner);
        z();
        this.f17780v = v.f25076a.d(this.f17775q);
        Object systemService = this.f17775q.getSystemService("keyguard");
        n.f(systemService, "null cannot be cast to non-null type android.app.KeyguardManager");
        boolean zIsKeyguardLocked = ((KeyguardManager) systemService).isKeyguardLocked();
        this.f17784z.setValue(Boolean.valueOf(zIsKeyguardLocked));
        com.nothing.wallpaper.common.log.c.d("BLUR-RenderController", "onCreate: isPreview=" + this.f17778t + ", isKeyguardUnLocked=" + zIsKeyguardLocked);
        if (this.f17778t) {
            AbstractC0816i.d(AbstractC1164y.a(owner), C0803b0.b(), null, new i(zIsKeyguardLocked, null), 2, null);
            return;
        }
        SharedPreferences sharedPreferences = this.f17780v;
        if (sharedPreferences != null) {
            sharedPreferences.registerOnSharedPreferenceChangeListener(this.f17774A);
        }
        M(zIsKeyguardLocked);
    }

    @Override // androidx.lifecycle.InterfaceC1148h
    public void onDestroy(InterfaceC1163x owner) {
        n.h(owner, "owner");
        super.onDestroy(owner);
        SharedPreferences sharedPreferences = this.f17780v;
        if (sharedPreferences != null) {
            sharedPreferences.unregisterOnSharedPreferenceChangeListener(this.f17774A);
        }
    }

    public final com.nothing.blurwallpaper.a.InterfaceC0469a s() {
        return this.f17777s;
    }

    public final Context t() {
        return this.f17775q;
    }

    public final A u() {
        return this.f17784z;
    }

    public final boolean v() {
        return this.f17776r.r();
    }

    public final com.nothing.blurwallpaper.a w() {
        return this.f17776r;
    }

    public final Point x() {
        return this.f17776r.s();
    }

    public final boolean y() {
        return this.f17776r.t();
    }
}
