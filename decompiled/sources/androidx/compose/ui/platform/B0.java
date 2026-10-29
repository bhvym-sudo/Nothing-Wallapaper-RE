package androidx.compose.ui.platform;

import F8.AbstractC0816i;
import F8.InterfaceC0846x0;
import I8.AbstractC0882h;
import I8.InterfaceC0881g;
import android.content.ContentResolver;
import android.content.Context;
import android.database.ContentObserver;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.provider.Settings;
import android.view.View;
import android.view.ViewParent;
import androidx.lifecycle.AbstractC1157q;
import androidx.lifecycle.InterfaceC1160u;
import androidx.lifecycle.InterfaceC1163x;
import java.util.LinkedHashMap;
import java.util.Map;
import p170r.AbstractC1700q;
import p170r.C1695n0;
import p170r.InterfaceC1669a0;

/* JADX INFO: loaded from: classes.dex */
public abstract class B0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Map f11632a = new LinkedHashMap();

    public static final class a implements View.OnAttachStateChangeListener {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        final /* synthetic */ View f11633q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ p170r.A0 f11634r;

        a(View view, p170r.A0 a10) {
            this.f11633q = view;
            this.f11634r = a10;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            this.f11633q.removeOnAttachStateChangeListener(this);
            this.f11634r.X();
        }
    }

    public static final class b implements InterfaceC1160u {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        final /* synthetic */ F8.L f11635q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ C1695n0 f11636r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        final /* synthetic */ p170r.A0 f11637s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ kotlin.jvm.internal.E f11638t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        final /* synthetic */ View f11639u;

        public /* synthetic */ class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f11640a;

            static {
                int[] iArr = new int[AbstractC1157q.a.values().length];
                try {
                    iArr[AbstractC1157q.a.ON_CREATE.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[AbstractC1157q.a.ON_START.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[AbstractC1157q.a.ON_STOP.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[AbstractC1157q.a.ON_DESTROY.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[AbstractC1157q.a.ON_PAUSE.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr[AbstractC1157q.a.ON_RESUME.ordinal()] = 6;
                } catch (NoSuchFieldError unused6) {
                }
                try {
                    iArr[AbstractC1157q.a.ON_ANY.ordinal()] = 7;
                } catch (NoSuchFieldError unused7) {
                }
                f11640a = iArr;
            }
        }

        /* JADX INFO: renamed from: androidx.compose.ui.platform.B0$b$b, reason: collision with other inner class name */
        static final class C0370b extends kotlin.coroutines.jvm.internal.l implements p219v8.p {

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            int f11641q;

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            private /* synthetic */ Object f11642r;

            /* JADX INFO: renamed from: s, reason: collision with root package name */
            final /* synthetic */ kotlin.jvm.internal.E f11643s;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            final /* synthetic */ p170r.A0 f11644t;

            /* JADX INFO: renamed from: u, reason: collision with root package name */
            final /* synthetic */ InterfaceC1163x f11645u;

            /* JADX INFO: renamed from: v, reason: collision with root package name */
            final /* synthetic */ b f11646v;

            /* JADX INFO: renamed from: w, reason: collision with root package name */
            final /* synthetic */ View f11647w;

            /* JADX INFO: renamed from: androidx.compose.ui.platform.B0$b$b$a */
            static final class a extends kotlin.coroutines.jvm.internal.l implements p219v8.p {

                /* JADX INFO: renamed from: q, reason: collision with root package name */
                int f11648q;

                /* JADX INFO: renamed from: r, reason: collision with root package name */
                final /* synthetic */ I8.O f11649r;

                /* JADX INFO: renamed from: s, reason: collision with root package name */
                final /* synthetic */ C1040a0 f11650s;

                /* JADX INFO: renamed from: androidx.compose.ui.platform.B0$b$b$a$a, reason: collision with other inner class name */
                static final class C0371a implements InterfaceC0881g {

                    /* JADX INFO: renamed from: q, reason: collision with root package name */
                    final /* synthetic */ C1040a0 f11651q;

                    C0371a(C1040a0 c1040a0) {
                        this.f11651q = c1040a0;
                    }

                    public final Object a(float f10, p129m8.e eVar) {
                        this.f11651q.c(f10);
                        return p079h8.A.f21846a;
                    }

                    @Override // I8.InterfaceC0881g
                    public /* bridge */ /* synthetic */ Object b(Object obj, p129m8.e eVar) {
                        return a(((Number) obj).floatValue(), eVar);
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                a(I8.O o9, C1040a0 c1040a0, p129m8.e eVar) {
                    super(2, eVar);
                    this.f11649r = o9;
                    this.f11650s = c1040a0;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final p129m8.e create(Object obj, p129m8.e eVar) {
                    return new a(this.f11649r, this.f11650s, eVar);
                }

                @Override // p219v8.p
                public final Object invoke(F8.L l9, p129m8.e eVar) {
                    return ((a) create(l9, eVar)).invokeSuspend(p079h8.A.f21846a);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    Object objE = p139n8.b.e();
                    int i10 = this.f11648q;
                    if (i10 == 0) {
                        p079h8.r.b(obj);
                        I8.O o9 = this.f11649r;
                        C0371a c0371a = new C0371a(this.f11650s);
                        this.f11648q = 1;
                        if (o9.a(c0371a, this) == objE) {
                            return objE;
                        }
                    } else {
                        if (i10 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        p079h8.r.b(obj);
                    }
                    throw new p079h8.f();
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0370b(kotlin.jvm.internal.E e10, p170r.A0 a10, InterfaceC1163x interfaceC1163x, b bVar, View view, p129m8.e eVar) {
                super(2, eVar);
                this.f11643s = e10;
                this.f11644t = a10;
                this.f11645u = interfaceC1163x;
                this.f11646v = bVar;
                this.f11647w = view;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final p129m8.e create(Object obj, p129m8.e eVar) {
                C0370b c0370b = new C0370b(this.f11643s, this.f11644t, this.f11645u, this.f11646v, this.f11647w, eVar);
                c0370b.f11642r = obj;
                return c0370b;
            }

            @Override // p219v8.p
            public final Object invoke(F8.L l9, p129m8.e eVar) {
                return ((C0370b) create(l9, eVar)).invokeSuspend(p079h8.A.f21846a);
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r1v0, types: [int] */
            /* JADX WARN: Type inference failed for: r1v1 */
            /* JADX WARN: Type inference failed for: r1v11, types: [F8.x0] */
            /* JADX WARN: Type inference failed for: r1v14 */
            /* JADX WARN: Type inference failed for: r1v15 */
            /* JADX WARN: Type inference failed for: r1v16 */
            /* JADX WARN: Type inference failed for: r1v2, types: [F8.x0] */
            /* JADX WARN: Type inference failed for: r1v3 */
            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) throws Throwable {
                Throwable th;
                ?? r9;
                InterfaceC0846x0 interfaceC0846x0D;
                Object objE = p139n8.b.e();
                ?? r10 = this.f11641q;
                try {
                    if (r10 == 0) {
                        p079h8.r.b(obj);
                        F8.L l9 = (F8.L) this.f11642r;
                        try {
                            C1040a0 c1040a0 = (C1040a0) this.f11643s.f22779q;
                            if (c1040a0 != null) {
                                I8.O oE = B0.e(this.f11647w.getContext().getApplicationContext());
                                c1040a0.c(((Number) oE.getValue()).floatValue());
                                interfaceC0846x0D = AbstractC0816i.d(l9, null, null, new a(oE, c1040a0, null), 3, null);
                            } else {
                                interfaceC0846x0D = null;
                            }
                            p170r.A0 a10 = this.f11644t;
                            this.f11642r = interfaceC0846x0D;
                            this.f11641q = 1;
                            r10 = interfaceC0846x0D;
                            if (a10.y0(this) == objE) {
                                return objE;
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            r9 = 0;
                            if (r9 != 0) {
                                InterfaceC0846x0.a.a(r9, null, 1, null);
                            }
                            this.f11645u.getLifecycle().d(this.f11646v);
                            throw th;
                        }
                    } else {
                        if (r10 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        InterfaceC0846x0 interfaceC0846x0 = (InterfaceC0846x0) this.f11642r;
                        p079h8.r.b(obj);
                        r10 = interfaceC0846x0;
                    }
                    if (r10 != 0) {
                        InterfaceC0846x0.a.a(r10, null, 1, null);
                    }
                    this.f11645u.getLifecycle().d(this.f11646v);
                    return p079h8.A.f21846a;
                } catch (Throwable th3) {
                    th = th3;
                    r9 = r10;
                }
            }
        }

        b(F8.L l9, C1695n0 c1695n0, p170r.A0 a10, kotlin.jvm.internal.E e10, View view) {
            this.f11635q = l9;
            this.f11636r = c1695n0;
            this.f11637s = a10;
            this.f11638t = e10;
            this.f11639u = view;
        }

        @Override // androidx.lifecycle.InterfaceC1160u
        public void onStateChanged(InterfaceC1163x interfaceC1163x, AbstractC1157q.a aVar) {
            int i10 = a.f11640a[aVar.ordinal()];
            if (i10 == 1) {
                AbstractC0816i.d(this.f11635q, null, F8.N.UNDISPATCHED, new C0370b(this.f11638t, this.f11637s, interfaceC1163x, this, this.f11639u, null), 1, null);
                return;
            }
            if (i10 == 2) {
                C1695n0 c1695n0 = this.f11636r;
                if (c1695n0 != null) {
                    c1695n0.d();
                }
                this.f11637s.x0();
                return;
            }
            if (i10 == 3) {
                this.f11637s.k0();
            } else {
                if (i10 != 4) {
                    return;
                }
                this.f11637s.X();
            }
        }
    }

    static final class c extends kotlin.coroutines.jvm.internal.l implements p219v8.p {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        Object f11652q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f11653r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        private /* synthetic */ Object f11654s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ ContentResolver f11655t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        final /* synthetic */ Uri f11656u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        final /* synthetic */ d f11657v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        final /* synthetic */ H8.g f11658w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        final /* synthetic */ Context f11659x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(ContentResolver contentResolver, Uri uri, d dVar, H8.g gVar, Context context, p129m8.e eVar) {
            super(2, eVar);
            this.f11655t = contentResolver;
            this.f11656u = uri;
            this.f11657v = dVar;
            this.f11658w = gVar;
            this.f11659x = context;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final p129m8.e create(Object obj, p129m8.e eVar) {
            c cVar = new c(this.f11655t, this.f11656u, this.f11657v, this.f11658w, this.f11659x, eVar);
            cVar.f11654s = obj;
            return cVar;
        }

        /* JADX WARN: Code duplicated, block: B:20:0x0054  */
        /* JADX WARN: Code duplicated, block: B:21:0x0055  */
        /* JADX WARN: Code duplicated, block: B:24:0x0060 A[Catch: all -> 0x001b, TRY_LEAVE, TryCatch #0 {all -> 0x001b, blocks: (B:7:0x0016, B:18:0x0048, B:22:0x0058, B:24:0x0060, B:14:0x002d, B:17:0x0042), top: B:31:0x0008 }] */
        /* JADX WARN: Code duplicated, block: B:27:0x0082  */
        /* JADX WARN: Code restructure failed: missing block: B:25:0x007f, code lost:
        
            if (r4.b(r9, r8) == r0) goto L26;
         */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x007f -> B:8:0x0019). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r9) {
            /*
                r8 = this;
                java.lang.Object r0 = p139n8.b.e()
                int r1 = r8.f11653r
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L31
                if (r1 == r3) goto L25
                if (r1 != r2) goto L1d
                java.lang.Object r1 = r8.f11652q
                H8.i r1 = (H8.i) r1
                java.lang.Object r4 = r8.f11654s
                I8.g r4 = (I8.InterfaceC0881g) r4
                p079h8.r.b(r9)     // Catch: java.lang.Throwable -> L1b
            L19:
                r9 = r4
                goto L48
            L1b:
                r9 = move-exception
                goto L8c
            L1d:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r9)
                throw r8
            L25:
                java.lang.Object r1 = r8.f11652q
                H8.i r1 = (H8.i) r1
                java.lang.Object r4 = r8.f11654s
                I8.g r4 = (I8.InterfaceC0881g) r4
                p079h8.r.b(r9)     // Catch: java.lang.Throwable -> L1b
                goto L58
            L31:
                p079h8.r.b(r9)
                java.lang.Object r9 = r8.f11654s
                I8.g r9 = (I8.InterfaceC0881g) r9
                android.content.ContentResolver r1 = r8.f11655t
                android.net.Uri r4 = r8.f11656u
                r5 = 0
                androidx.compose.ui.platform.B0$d r6 = r8.f11657v
                r1.registerContentObserver(r4, r5, r6)
                H8.g r1 = r8.f11658w     // Catch: java.lang.Throwable -> L1b
                H8.i r1 = r1.iterator()     // Catch: java.lang.Throwable -> L1b
            L48:
                r8.f11654s = r9     // Catch: java.lang.Throwable -> L1b
                r8.f11652q = r1     // Catch: java.lang.Throwable -> L1b
                r8.f11653r = r3     // Catch: java.lang.Throwable -> L1b
                java.lang.Object r4 = r1.a(r8)     // Catch: java.lang.Throwable -> L1b
                if (r4 != r0) goto L55
                goto L81
            L55:
                r7 = r4
                r4 = r9
                r9 = r7
            L58:
                java.lang.Boolean r9 = (java.lang.Boolean) r9     // Catch: java.lang.Throwable -> L1b
                boolean r9 = r9.booleanValue()     // Catch: java.lang.Throwable -> L1b
                if (r9 == 0) goto L82
                r1.next()     // Catch: java.lang.Throwable -> L1b
                android.content.Context r9 = r8.f11659x     // Catch: java.lang.Throwable -> L1b
                android.content.ContentResolver r9 = r9.getContentResolver()     // Catch: java.lang.Throwable -> L1b
                java.lang.String r5 = "animator_duration_scale"
                r6 = 1065353216(0x3f800000, float:1.0)
                float r9 = android.provider.Settings.Global.getFloat(r9, r5, r6)     // Catch: java.lang.Throwable -> L1b
                java.lang.Float r9 = kotlin.coroutines.jvm.internal.b.b(r9)     // Catch: java.lang.Throwable -> L1b
                r8.f11654s = r4     // Catch: java.lang.Throwable -> L1b
                r8.f11652q = r1     // Catch: java.lang.Throwable -> L1b
                r8.f11653r = r2     // Catch: java.lang.Throwable -> L1b
                java.lang.Object r9 = r4.b(r9, r8)     // Catch: java.lang.Throwable -> L1b
                if (r9 != r0) goto L19
            L81:
                return r0
            L82:
                android.content.ContentResolver r9 = r8.f11655t
                androidx.compose.ui.platform.B0$d r8 = r8.f11657v
                r9.unregisterContentObserver(r8)
                h8.A r8 = p079h8.A.f21846a
                return r8
            L8c:
                android.content.ContentResolver r0 = r8.f11655t
                androidx.compose.ui.platform.B0$d r8 = r8.f11657v
                r0.unregisterContentObserver(r8)
                throw r9
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.B0.c.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // p219v8.p
        /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC0881g interfaceC0881g, p129m8.e eVar) {
            return ((c) create(interfaceC0881g, eVar)).invokeSuspend(p079h8.A.f21846a);
        }
    }

    public static final class d extends ContentObserver {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ H8.g f11660a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(H8.g gVar, Handler handler) {
            super(handler);
            this.f11660a = gVar;
        }

        @Override // android.database.ContentObserver
        public void onChange(boolean z9, Uri uri) {
            this.f11660a.p(p079h8.A.f21846a);
        }
    }

    public static final p170r.A0 b(View view, p129m8.i iVar, AbstractC1157q abstractC1157q) {
        C1695n0 c1695n0;
        if (iVar.b(p129m8.f.f23250l) == null || iVar.b(InterfaceC1669a0.f25429n) == null) {
            iVar = D.f11685C.a().z(iVar);
        }
        InterfaceC1669a0 interfaceC1669a0 = (InterfaceC1669a0) iVar.b(InterfaceC1669a0.f25429n);
        if (interfaceC1669a0 != null) {
            C1695n0 c1695n1 = new C1695n0(interfaceC1669a0);
            c1695n1.c();
            c1695n0 = c1695n1;
        } else {
            c1695n0 = null;
        }
        kotlin.jvm.internal.E e10 = new kotlin.jvm.internal.E();
        p129m8.i c1040a0 = (C.f) iVar.b(C.f.f461a);
        if (c1040a0 == null) {
            c1040a0 = new C1040a0();
            e10.f22779q = c1040a0;
        }
        p129m8.i iVarZ = iVar.z(c1695n0 != null ? c1695n0 : p129m8.j.f23252q).z(c1040a0);
        p170r.A0 a10 = new p170r.A0(iVarZ);
        a10.k0();
        F8.L lA = F8.M.a(iVarZ);
        if (abstractC1157q == null) {
            InterfaceC1163x interfaceC1163xA = androidx.lifecycle.g0.a(view);
            abstractC1157q = interfaceC1163xA != null ? interfaceC1163xA.getLifecycle() : null;
        }
        if (abstractC1157q != null) {
            view.addOnAttachStateChangeListener(new a(view, a10));
            abstractC1157q.a(new b(lA, c1695n0, a10, e10, view));
            return a10;
        }
        T.a.c("ViewTreeLifecycleOwner not found from " + view);
        throw new p079h8.f();
    }

    public static /* synthetic */ p170r.A0 c(View view, p129m8.i iVar, AbstractC1157q abstractC1157q, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            iVar = p129m8.j.f23252q;
        }
        if ((i10 & 2) != 0) {
            abstractC1157q = null;
        }
        return b(view, iVar, abstractC1157q);
    }

    public static final AbstractC1700q d(View view) {
        AbstractC1700q abstractC1700qF = f(view);
        if (abstractC1700qF != null) {
            return abstractC1700qF;
        }
        for (ViewParent parent = view.getParent(); abstractC1700qF == null && (parent instanceof View); parent = parent.getParent()) {
            abstractC1700qF = f((View) parent);
        }
        return abstractC1700qF;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final I8.O e(Context context) {
        I8.O o9;
        Map map = f11632a;
        synchronized (map) {
            try {
                Object objK = map.get(context);
                if (objK == null) {
                    ContentResolver contentResolver = context.getContentResolver();
                    Uri uriFor = Settings.Global.getUriFor("animator_duration_scale");
                    H8.g gVarB = H8.j.b(-1, null, null, 6, null);
                    objK = AbstractC0882h.K(AbstractC0882h.A(new c(contentResolver, uriFor, new d(gVarB, p231x0.g.a(Looper.getMainLooper())), gVarB, context, null)), F8.M.b(), I8.K.a.b(I8.K.f3174a, 0L, 0L, 3, null), Float.valueOf(Settings.Global.getFloat(context.getContentResolver(), "animator_duration_scale", 1.0f)));
                    map.put(context, objK);
                }
                o9 = (I8.O) objK;
            } catch (Throwable th) {
                throw th;
            }
        }
        return o9;
    }

    public static final AbstractC1700q f(View view) {
        Object tag = view.getTag(C.g.f469G);
        if (tag instanceof AbstractC1700q) {
            return (AbstractC1700q) tag;
        }
        return null;
    }

    private static final View g(View view) {
        Object parent = view.getParent();
        while (parent instanceof View) {
            View view2 = (View) parent;
            if (view2.getId() == 16908290) {
                break;
            }
            parent = view2.getParent();
            view = view2;
        }
        return view;
    }

    public static final p170r.A0 h(View view) {
        if (!view.isAttachedToWindow()) {
            T.a.b("Cannot locate windowRecomposer; View " + view + " is not attached to a window");
        }
        View viewG = g(view);
        AbstractC1700q abstractC1700qF = f(viewG);
        if (abstractC1700qF == null) {
            return A0.f11512a.a(viewG);
        }
        if (abstractC1700qF instanceof p170r.A0) {
            return (p170r.A0) abstractC1700qF;
        }
        throw new IllegalStateException("root viewTreeParentCompositionContext is not a Recomposer");
    }

    public static final void i(View view, AbstractC1700q abstractC1700q) {
        view.setTag(C.g.f469G, abstractC1700q);
    }
}
