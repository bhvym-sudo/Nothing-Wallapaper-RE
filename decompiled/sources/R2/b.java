package R2;

import F8.AbstractC0812g;
import F8.I;
import F8.L;
import H8.t;
import I8.AbstractC0882h;
import I8.InterfaceC0880f;
import I8.InterfaceC0881g;
import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.database.ContentObserver;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.Log;
import java.io.IOException;
import java.net.URISyntaxException;
import java.util.List;
import kotlin.jvm.internal.AbstractC1457h;
import p079h8.A;
import p089i8.AbstractC1444s;

/* JADX INFO: loaded from: classes.dex */
public final class b implements R2.a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f6991c = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f6992a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final I f6993b;

    public static final class a {
        public /* synthetic */ a(AbstractC1457h abstractC1457h) {
            this();
        }

        private a() {
        }
    }

    /* JADX INFO: renamed from: R2.b$b, reason: collision with other inner class name */
    static final class C0253b extends kotlin.coroutines.jvm.internal.l implements p219v8.p {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f6994q;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        final /* synthetic */ String f6996s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0253b(String str, p129m8.e eVar) {
            super(2, eVar);
            this.f6996s = str;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final p129m8.e create(Object obj, p129m8.e eVar) {
            return b.this.new C0253b(this.f6996s, eVar);
        }

        @Override // p219v8.p
        public final Object invoke(L l9, p129m8.e eVar) {
            return ((C0253b) create(l9, eVar)).invokeSuspend(A.f21846a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            p139n8.b.e();
            if (this.f6994q != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p079h8.r.b(obj);
            return kotlin.coroutines.jvm.internal.b.c(b.this.f6992a.getContentResolver().delete(R2.d.b.C0257b.f7069a.a(), "slot_id", new String[]{this.f6996s}));
        }
    }

    static final class c extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        /* synthetic */ Object f6997q;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        int f6999s;

        c(p129m8.e eVar) {
            super(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f6997q = obj;
            this.f6999s |= Integer.MIN_VALUE;
            return b.this.i(0, 0, this);
        }
    }

    static final class d extends kotlin.coroutines.jvm.internal.l implements p219v8.p {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f7000q;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        final /* synthetic */ int f7002s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ int f7003t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(int i10, int i11, p129m8.e eVar) {
            super(2, eVar);
            this.f7002s = i10;
            this.f7003t = i11;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final p129m8.e create(Object obj, p129m8.e eVar) {
            return b.this.new d(this.f7002s, this.f7003t, eVar);
        }

        @Override // p219v8.p
        public final Object invoke(L l9, p129m8.e eVar) {
            return ((d) create(l9, eVar)).invokeSuspend(A.f21846a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            p139n8.b.e();
            if (this.f7000q != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p079h8.r.b(obj);
            Drawable drawable = b.this.f6992a.getPackageManager().getResourcesForApplication("com.android.systemui").getDrawable(this.f7002s, b.this.f6992a.getTheme());
            drawable.setTint(this.f7003t);
            return drawable;
        }
    }

    static final class e extends kotlin.coroutines.jvm.internal.l implements p219v8.p {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f7004q;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        final /* synthetic */ String f7006s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ String f7007t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(String str, String str2, p129m8.e eVar) {
            super(2, eVar);
            this.f7006s = str;
            this.f7007t = str2;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final p129m8.e create(Object obj, p129m8.e eVar) {
            return b.this.new e(this.f7006s, this.f7007t, eVar);
        }

        @Override // p219v8.p
        public final Object invoke(L l9, p129m8.e eVar) {
            return ((e) create(l9, eVar)).invokeSuspend(A.f21846a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            p139n8.b.e();
            if (this.f7004q != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p079h8.r.b(obj);
            ContentResolver contentResolver = b.this.f6992a.getContentResolver();
            Uri uriA = R2.d.b.C0257b.f7069a.a();
            ContentValues contentValues = new ContentValues();
            String str = this.f7006s;
            String str2 = this.f7007t;
            contentValues.put("slot_id", str);
            contentValues.put("affordance_id", str2);
            A a10 = A.f21846a;
            return contentResolver.insert(uriA, contentValues);
        }
    }

    public static final class f implements InterfaceC0880f {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        final /* synthetic */ InterfaceC0880f f7008q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ b f7009r;

        public static final class a implements InterfaceC0881g {

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            final /* synthetic */ InterfaceC0881g f7010q;

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            final /* synthetic */ b f7011r;

            /* JADX INFO: renamed from: R2.b$f$a$a, reason: collision with other inner class name */
            public static final class C0254a extends kotlin.coroutines.jvm.internal.d {

                /* JADX INFO: renamed from: q, reason: collision with root package name */
                /* synthetic */ Object f7012q;

                /* JADX INFO: renamed from: r, reason: collision with root package name */
                int f7013r;

                /* JADX INFO: renamed from: s, reason: collision with root package name */
                Object f7014s;

                public C0254a(p129m8.e eVar) {
                    super(eVar);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    this.f7012q = obj;
                    this.f7013r |= Integer.MIN_VALUE;
                    return a.this.b(null, this);
                }
            }

            public a(InterfaceC0881g interfaceC0881g, b bVar) {
                this.f7010q = interfaceC0881g;
                this.f7011r = bVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            /* JADX WARN: Code restructure failed: missing block: B:21:0x005c, code lost:
            
                if (r6.b(r8, r0) == r1) goto L22;
             */
            @Override // I8.InterfaceC0881g
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object b(java.lang.Object r7, p129m8.e r8) {
                /*
                    r6 = this;
                    boolean r0 = r8 instanceof R2.b.f.a.C0254a
                    if (r0 == 0) goto L13
                    r0 = r8
                    R2.b$f$a$a r0 = (R2.b.f.a.C0254a) r0
                    int r1 = r0.f7013r
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f7013r = r1
                    goto L18
                L13:
                    R2.b$f$a$a r0 = new R2.b$f$a$a
                    r0.<init>(r8)
                L18:
                    java.lang.Object r8 = r0.f7012q
                    java.lang.Object r1 = p139n8.b.e()
                    int r2 = r0.f7013r
                    r3 = 2
                    r4 = 1
                    if (r2 == 0) goto L3c
                    if (r2 == r4) goto L34
                    if (r2 != r3) goto L2c
                    p079h8.r.b(r8)
                    goto L5f
                L2c:
                    java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                    java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                    r6.<init>(r7)
                    throw r6
                L34:
                    java.lang.Object r6 = r0.f7014s
                    I8.g r6 = (I8.InterfaceC0881g) r6
                    p079h8.r.b(r8)
                    goto L53
                L3c:
                    p079h8.r.b(r8)
                    I8.g r8 = r6.f7010q
                    h8.A r7 = (p079h8.A) r7
                    R2.b r6 = r6.f7011r
                    r0.f7014s = r8
                    r0.f7013r = r4
                    java.lang.Object r6 = r6.n(r0)
                    if (r6 != r1) goto L50
                    goto L5e
                L50:
                    r5 = r8
                    r8 = r6
                    r6 = r5
                L53:
                    r7 = 0
                    r0.f7014s = r7
                    r0.f7013r = r3
                    java.lang.Object r6 = r6.b(r8, r0)
                    if (r6 != r1) goto L5f
                L5e:
                    return r1
                L5f:
                    h8.A r6 = p079h8.A.f21846a
                    return r6
                */
                throw new UnsupportedOperationException("Method not decompiled: R2.b.f.a.b(java.lang.Object, m8.e):java.lang.Object");
            }
        }

        public f(InterfaceC0880f interfaceC0880f, b bVar) {
            this.f7008q = interfaceC0880f;
            this.f7009r = bVar;
        }

        @Override // I8.InterfaceC0880f
        public Object a(InterfaceC0881g interfaceC0881g, p129m8.e eVar) {
            Object objA = this.f7008q.a(new a(interfaceC0881g, this.f7009r), eVar);
            return objA == p139n8.b.e() ? objA : A.f21846a;
        }
    }

    public static final class g implements InterfaceC0880f {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        final /* synthetic */ InterfaceC0880f f7016q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ b f7017r;

        public static final class a implements InterfaceC0881g {

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            final /* synthetic */ InterfaceC0881g f7018q;

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            final /* synthetic */ b f7019r;

            /* JADX INFO: renamed from: R2.b$g$a$a, reason: collision with other inner class name */
            public static final class C0255a extends kotlin.coroutines.jvm.internal.d {

                /* JADX INFO: renamed from: q, reason: collision with root package name */
                /* synthetic */ Object f7020q;

                /* JADX INFO: renamed from: r, reason: collision with root package name */
                int f7021r;

                /* JADX INFO: renamed from: s, reason: collision with root package name */
                Object f7022s;

                public C0255a(p129m8.e eVar) {
                    super(eVar);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    this.f7020q = obj;
                    this.f7021r |= Integer.MIN_VALUE;
                    return a.this.b(null, this);
                }
            }

            public a(InterfaceC0881g interfaceC0881g, b bVar) {
                this.f7018q = interfaceC0881g;
                this.f7019r = bVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            /* JADX WARN: Code restructure failed: missing block: B:21:0x005c, code lost:
            
                if (r6.b(r8, r0) == r1) goto L22;
             */
            @Override // I8.InterfaceC0881g
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object b(java.lang.Object r7, p129m8.e r8) {
                /*
                    r6 = this;
                    boolean r0 = r8 instanceof R2.b.g.a.C0255a
                    if (r0 == 0) goto L13
                    r0 = r8
                    R2.b$g$a$a r0 = (R2.b.g.a.C0255a) r0
                    int r1 = r0.f7021r
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f7021r = r1
                    goto L18
                L13:
                    R2.b$g$a$a r0 = new R2.b$g$a$a
                    r0.<init>(r8)
                L18:
                    java.lang.Object r8 = r0.f7020q
                    java.lang.Object r1 = p139n8.b.e()
                    int r2 = r0.f7021r
                    r3 = 2
                    r4 = 1
                    if (r2 == 0) goto L3c
                    if (r2 == r4) goto L34
                    if (r2 != r3) goto L2c
                    p079h8.r.b(r8)
                    goto L5f
                L2c:
                    java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                    java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                    r6.<init>(r7)
                    throw r6
                L34:
                    java.lang.Object r6 = r0.f7022s
                    I8.g r6 = (I8.InterfaceC0881g) r6
                    p079h8.r.b(r8)
                    goto L53
                L3c:
                    p079h8.r.b(r8)
                    I8.g r8 = r6.f7018q
                    h8.A r7 = (p079h8.A) r7
                    R2.b r6 = r6.f7019r
                    r0.f7022s = r8
                    r0.f7021r = r4
                    java.lang.Object r6 = r6.j(r0)
                    if (r6 != r1) goto L50
                    goto L5e
                L50:
                    r5 = r8
                    r8 = r6
                    r6 = r5
                L53:
                    r7 = 0
                    r0.f7022s = r7
                    r0.f7021r = r3
                    java.lang.Object r6 = r6.b(r8, r0)
                    if (r6 != r1) goto L5f
                L5e:
                    return r1
                L5f:
                    h8.A r6 = p079h8.A.f21846a
                    return r6
                */
                throw new UnsupportedOperationException("Method not decompiled: R2.b.g.a.b(java.lang.Object, m8.e):java.lang.Object");
            }
        }

        public g(InterfaceC0880f interfaceC0880f, b bVar) {
            this.f7016q = interfaceC0880f;
            this.f7017r = bVar;
        }

        @Override // I8.InterfaceC0880f
        public Object a(InterfaceC0881g interfaceC0881g, p129m8.e eVar) {
            Object objA = this.f7016q.a(new a(interfaceC0881g, this.f7017r), eVar);
            return objA == p139n8.b.e() ? objA : A.f21846a;
        }
    }

    public static final class h implements InterfaceC0880f {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        final /* synthetic */ InterfaceC0880f f7024q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ b f7025r;

        public static final class a implements InterfaceC0881g {

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            final /* synthetic */ InterfaceC0881g f7026q;

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            final /* synthetic */ b f7027r;

            /* JADX INFO: renamed from: R2.b$h$a$a, reason: collision with other inner class name */
            public static final class C0256a extends kotlin.coroutines.jvm.internal.d {

                /* JADX INFO: renamed from: q, reason: collision with root package name */
                /* synthetic */ Object f7028q;

                /* JADX INFO: renamed from: r, reason: collision with root package name */
                int f7029r;

                /* JADX INFO: renamed from: s, reason: collision with root package name */
                Object f7030s;

                public C0256a(p129m8.e eVar) {
                    super(eVar);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    this.f7028q = obj;
                    this.f7029r |= Integer.MIN_VALUE;
                    return a.this.b(null, this);
                }
            }

            public a(InterfaceC0881g interfaceC0881g, b bVar) {
                this.f7026q = interfaceC0881g;
                this.f7027r = bVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            /* JADX WARN: Code restructure failed: missing block: B:21:0x005c, code lost:
            
                if (r6.b(r8, r0) == r1) goto L22;
             */
            @Override // I8.InterfaceC0881g
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object b(java.lang.Object r7, p129m8.e r8) {
                /*
                    r6 = this;
                    boolean r0 = r8 instanceof R2.b.h.a.C0256a
                    if (r0 == 0) goto L13
                    r0 = r8
                    R2.b$h$a$a r0 = (R2.b.h.a.C0256a) r0
                    int r1 = r0.f7029r
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f7029r = r1
                    goto L18
                L13:
                    R2.b$h$a$a r0 = new R2.b$h$a$a
                    r0.<init>(r8)
                L18:
                    java.lang.Object r8 = r0.f7028q
                    java.lang.Object r1 = p139n8.b.e()
                    int r2 = r0.f7029r
                    r3 = 2
                    r4 = 1
                    if (r2 == 0) goto L3c
                    if (r2 == r4) goto L34
                    if (r2 != r3) goto L2c
                    p079h8.r.b(r8)
                    goto L5f
                L2c:
                    java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                    java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                    r6.<init>(r7)
                    throw r6
                L34:
                    java.lang.Object r6 = r0.f7030s
                    I8.g r6 = (I8.InterfaceC0881g) r6
                    p079h8.r.b(r8)
                    goto L53
                L3c:
                    p079h8.r.b(r8)
                    I8.g r8 = r6.f7026q
                    h8.A r7 = (p079h8.A) r7
                    R2.b r6 = r6.f7027r
                    r0.f7030s = r8
                    r0.f7029r = r4
                    java.lang.Object r6 = r6.a(r0)
                    if (r6 != r1) goto L50
                    goto L5e
                L50:
                    r5 = r8
                    r8 = r6
                    r6 = r5
                L53:
                    r7 = 0
                    r0.f7030s = r7
                    r0.f7029r = r3
                    java.lang.Object r6 = r6.b(r8, r0)
                    if (r6 != r1) goto L5f
                L5e:
                    return r1
                L5f:
                    h8.A r6 = p079h8.A.f21846a
                    return r6
                */
                throw new UnsupportedOperationException("Method not decompiled: R2.b.h.a.b(java.lang.Object, m8.e):java.lang.Object");
            }
        }

        public h(InterfaceC0880f interfaceC0880f, b bVar) {
            this.f7024q = interfaceC0880f;
            this.f7025r = bVar;
        }

        @Override // I8.InterfaceC0880f
        public Object a(InterfaceC0881g interfaceC0881g, p129m8.e eVar) {
            Object objA = this.f7024q.a(new a(interfaceC0881g, this.f7025r), eVar);
            return objA == p139n8.b.e() ? objA : A.f21846a;
        }
    }

    static final class i extends kotlin.coroutines.jvm.internal.l implements p219v8.p {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f7032q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private /* synthetic */ Object f7033r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ Uri f7035t;

        public static final class a extends ContentObserver {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ t f7036a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(t tVar) {
                super(null);
                this.f7036a = tVar;
            }

            @Override // android.database.ContentObserver
            public void onChange(boolean z9) {
                this.f7036a.p(A.f21846a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(Uri uri, p129m8.e eVar) {
            super(2, eVar);
            this.f7035t = uri;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final A v(b bVar, a aVar) {
            bVar.f6992a.getContentResolver().unregisterContentObserver(aVar);
            return A.f21846a;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final p129m8.e create(Object obj, p129m8.e eVar) {
            i iVar = b.this.new i(this.f7035t, eVar);
            iVar.f7033r = obj;
            return iVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objE = p139n8.b.e();
            int i10 = this.f7032q;
            if (i10 == 0) {
                p079h8.r.b(obj);
                t tVar = (t) this.f7033r;
                final a aVar = new a(tVar);
                b.this.f6992a.getContentResolver().registerContentObserver(this.f7035t, true, aVar);
                final b bVar = b.this;
                p219v8.a aVar2 = new p219v8.a() { // from class: R2.c
                    @Override // p219v8.a
                    public final Object invoke() {
                        return b.i.v(bVar, aVar);
                    }
                };
                this.f7032q = 1;
                if (H8.r.a(tVar, aVar2, this) == objE) {
                    return objE;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                p079h8.r.b(obj);
            }
            return A.f21846a;
        }

        @Override // p219v8.p
        /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
        public final Object invoke(t tVar, p129m8.e eVar) {
            return ((i) create(tVar, eVar)).invokeSuspend(A.f21846a);
        }
    }

    static final class j extends kotlin.coroutines.jvm.internal.l implements p219v8.p {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f7037q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private /* synthetic */ Object f7038r;

        j(p129m8.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final p129m8.e create(Object obj, p129m8.e eVar) {
            j jVar = new j(eVar);
            jVar.f7038r = obj;
            return jVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objE = p139n8.b.e();
            int i10 = this.f7037q;
            if (i10 == 0) {
                p079h8.r.b(obj);
                InterfaceC0881g interfaceC0881g = (InterfaceC0881g) this.f7038r;
                A a10 = A.f21846a;
                this.f7037q = 1;
                if (interfaceC0881g.b(a10, this) == objE) {
                    return objE;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                p079h8.r.b(obj);
            }
            return A.f21846a;
        }

        @Override // p219v8.p
        /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC0881g interfaceC0881g, p129m8.e eVar) {
            return ((j) create(interfaceC0881g, eVar)).invokeSuspend(A.f21846a);
        }
    }

    static final class k extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        /* synthetic */ Object f7039q;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        int f7041s;

        k(p129m8.e eVar) {
            super(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f7039q = obj;
            this.f7041s |= Integer.MIN_VALUE;
            return b.this.n(this);
        }
    }

    static final class l extends kotlin.coroutines.jvm.internal.l implements p219v8.p {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f7042q;

        l(p129m8.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final p129m8.e create(Object obj, p129m8.e eVar) {
            return b.this.new l(eVar);
        }

        @Override // p219v8.p
        public final Object invoke(L l9, p129m8.e eVar) {
            return ((l) create(l9, eVar)).invokeSuspend(A.f21846a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) throws IOException {
            p139n8.b.e();
            if (this.f7042q != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p079h8.r.b(obj);
            Cursor cursorQuery = b.this.f6992a.getContentResolver().query(R2.d.b.a.f7067a.a(), null, null, null, null);
            if (cursorQuery == null) {
                return null;
            }
            b bVar = b.this;
            try {
                List listC = AbstractC1444s.c();
                int columnIndex = cursorQuery.getColumnIndex("id");
                int columnIndex2 = cursorQuery.getColumnIndex("name");
                int columnIndex3 = cursorQuery.getColumnIndex("icon");
                int columnIndex4 = cursorQuery.getColumnIndex("is_enabled");
                int columnIndex5 = cursorQuery.getColumnIndex("enablement_explanation");
                int columnIndex6 = cursorQuery.getColumnIndex("enablement_action_text");
                int columnIndex7 = cursorQuery.getColumnIndex("enablement_action_intent");
                int columnIndex8 = cursorQuery.getColumnIndex("configure_intent");
                if (columnIndex != -1 && columnIndex2 != -1 && columnIndex3 != -1 && columnIndex4 != -1 && columnIndex5 != -1 && columnIndex6 != -1 && columnIndex7 != -1 && columnIndex8 != -1) {
                    while (cursorQuery.moveToNext()) {
                        String string = cursorQuery.getString(columnIndex);
                        kotlin.jvm.internal.n.e(string);
                        String string2 = cursorQuery.getString(columnIndex2);
                        kotlin.jvm.internal.n.g(string2, "getString(...)");
                        int i10 = cursorQuery.getInt(columnIndex3);
                        boolean z9 = cursorQuery.getInt(columnIndex4) == 1;
                        String string3 = cursorQuery.getString(columnIndex5);
                        String string4 = cursorQuery.getString(columnIndex6);
                        String string5 = cursorQuery.getString(columnIndex7);
                        Intent intentO = string5 != null ? bVar.o(string5, string) : null;
                        String string6 = cursorQuery.getString(columnIndex8);
                        listC.add(new R2.a.C0252a(string, string2, i10, z9, string3, string4, intentO, string6 != null ? bVar.o(string6, string) : null));
                    }
                }
                List listA = AbstractC1444s.a(listC);
                p189s8.b.a(cursorQuery, null);
                return listA;
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    p189s8.b.a(cursorQuery, th);
                    throw th2;
                }
            }
        }
    }

    static final class m extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        /* synthetic */ Object f7044q;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        int f7046s;

        m(p129m8.e eVar) {
            super(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f7044q = obj;
            this.f7046s |= Integer.MIN_VALUE;
            return b.this.c(this);
        }
    }

    static final class n extends kotlin.coroutines.jvm.internal.l implements p219v8.p {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f7047q;

        n(p129m8.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final p129m8.e create(Object obj, p129m8.e eVar) {
            return b.this.new n(eVar);
        }

        @Override // p219v8.p
        public final Object invoke(L l9, p129m8.e eVar) {
            return ((n) create(l9, eVar)).invokeSuspend(A.f21846a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) throws IOException {
            p139n8.b.e();
            if (this.f7047q != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p079h8.r.b(obj);
            Cursor cursorQuery = b.this.f6992a.getContentResolver().query(R2.d.a.f7063a.a(), null, null, null, null);
            if (cursorQuery == null) {
                return null;
            }
            try {
                List listC = AbstractC1444s.c();
                int columnIndex = cursorQuery.getColumnIndex("name");
                int columnIndex2 = cursorQuery.getColumnIndex("value");
                if (columnIndex != -1 && columnIndex2 != -1) {
                    while (cursorQuery.moveToNext()) {
                        String string = cursorQuery.getString(columnIndex);
                        kotlin.jvm.internal.n.g(string, "getString(...)");
                        boolean z9 = true;
                        if (cursorQuery.getInt(columnIndex2) != 1) {
                            z9 = false;
                        }
                        listC.add(new R2.a.b(string, z9));
                    }
                }
                List listA = AbstractC1444s.a(listC);
                p189s8.b.a(cursorQuery, null);
                return listA;
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    p189s8.b.a(cursorQuery, th);
                    throw th2;
                }
            }
        }
    }

    static final class o extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        /* synthetic */ Object f7049q;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        int f7051s;

        o(p129m8.e eVar) {
            super(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f7049q = obj;
            this.f7051s |= Integer.MIN_VALUE;
            return b.this.j(this);
        }
    }

    static final class p extends kotlin.coroutines.jvm.internal.l implements p219v8.p {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f7052q;

        p(p129m8.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final p129m8.e create(Object obj, p129m8.e eVar) {
            return b.this.new p(eVar);
        }

        @Override // p219v8.p
        public final Object invoke(L l9, p129m8.e eVar) {
            return ((p) create(l9, eVar)).invokeSuspend(A.f21846a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) throws IOException {
            p139n8.b.e();
            if (this.f7052q != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p079h8.r.b(obj);
            Cursor cursorQuery = b.this.f6992a.getContentResolver().query(R2.d.b.C0257b.f7069a.a(), null, null, null, null);
            if (cursorQuery == null) {
                return null;
            }
            try {
                List listC = AbstractC1444s.c();
                int columnIndex = cursorQuery.getColumnIndex("slot_id");
                int columnIndex2 = cursorQuery.getColumnIndex("affordance_id");
                int columnIndex3 = cursorQuery.getColumnIndex("affordance_name");
                if (columnIndex != -1 && columnIndex2 != -1 && columnIndex3 != -1) {
                    while (cursorQuery.moveToNext()) {
                        String string = cursorQuery.getString(columnIndex);
                        kotlin.jvm.internal.n.g(string, "getString(...)");
                        String string2 = cursorQuery.getString(columnIndex2);
                        kotlin.jvm.internal.n.g(string2, "getString(...)");
                        String string3 = cursorQuery.getString(columnIndex3);
                        kotlin.jvm.internal.n.g(string3, "getString(...)");
                        listC.add(new R2.a.c(string, string2, string3));
                    }
                }
                List listA = AbstractC1444s.a(listC);
                p189s8.b.a(cursorQuery, null);
                return listA;
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    p189s8.b.a(cursorQuery, th);
                    throw th2;
                }
            }
        }
    }

    static final class q extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        /* synthetic */ Object f7054q;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        int f7056s;

        q(p129m8.e eVar) {
            super(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f7054q = obj;
            this.f7056s |= Integer.MIN_VALUE;
            return b.this.a(this);
        }
    }

    static final class r extends kotlin.coroutines.jvm.internal.l implements p219v8.p {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f7057q;

        r(p129m8.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final p129m8.e create(Object obj, p129m8.e eVar) {
            return b.this.new r(eVar);
        }

        @Override // p219v8.p
        public final Object invoke(L l9, p129m8.e eVar) {
            return ((r) create(l9, eVar)).invokeSuspend(A.f21846a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) throws IOException {
            p139n8.b.e();
            if (this.f7057q != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p079h8.r.b(obj);
            Cursor cursorQuery = b.this.f6992a.getContentResolver().query(R2.d.b.c.f7071a.a(), null, null, null, null);
            if (cursorQuery == null) {
                return null;
            }
            try {
                List listC = AbstractC1444s.c();
                int columnIndex = cursorQuery.getColumnIndex("id");
                int columnIndex2 = cursorQuery.getColumnIndex("capacity");
                if (columnIndex != -1 && columnIndex2 != -1) {
                    while (cursorQuery.moveToNext()) {
                        String string = cursorQuery.getString(columnIndex);
                        kotlin.jvm.internal.n.g(string, "getString(...)");
                        listC.add(new R2.a.d(string, cursorQuery.getInt(columnIndex2)));
                    }
                }
                List listA = AbstractC1444s.a(listC);
                p189s8.b.a(cursorQuery, null);
                return listA;
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    p189s8.b.a(cursorQuery, th);
                    throw th2;
                }
            }
        }
    }

    public b(Context context, I backgroundDispatcher) {
        kotlin.jvm.internal.n.h(context, "context");
        kotlin.jvm.internal.n.h(backgroundDispatcher, "backgroundDispatcher");
        this.f6992a = context;
        this.f6993b = backgroundDispatcher;
    }

    private final InterfaceC0880f m(Uri uri) {
        return AbstractC0882h.D(AbstractC0882h.I(AbstractC0882h.e(new i(uri, null)), new j(null)), this.f6993b);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Intent o(String str, String str2) {
        try {
            return Intent.parseUri(str, 1);
        } catch (URISyntaxException unused) {
            Log.w("CustomizationProviderClient", "Cannot parse Uri into Intent for affordance with ID \"" + str2 + "\"!");
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // R2.a
    public Object a(p129m8.e eVar) {
        q qVar;
        if (eVar instanceof q) {
            qVar = (q) eVar;
            int i10 = qVar.f7056s;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                qVar.f7056s = i10 - Integer.MIN_VALUE;
            } else {
                qVar = new q(eVar);
            }
        } else {
            qVar = new q(eVar);
        }
        Object objG = qVar.f7054q;
        Object objE = p139n8.b.e();
        int i11 = qVar.f7056s;
        if (i11 == 0) {
            p079h8.r.b(objG);
            I i12 = this.f6993b;
            r rVar = new r(null);
            qVar.f7056s = 1;
            objG = AbstractC0812g.g(i12, rVar, qVar);
            if (objG == objE) {
                return objE;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p079h8.r.b(objG);
        }
        List list = (List) objG;
        return list == null ? AbstractC1444s.l() : list;
    }

    @Override // R2.a
    public InterfaceC0880f b() {
        return new f(m(R2.d.b.a.f7067a.a()), this);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // R2.a
    public Object c(p129m8.e eVar) {
        m mVar;
        if (eVar instanceof m) {
            mVar = (m) eVar;
            int i10 = mVar.f7046s;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                mVar.f7046s = i10 - Integer.MIN_VALUE;
            } else {
                mVar = new m(eVar);
            }
        } else {
            mVar = new m(eVar);
        }
        Object objG = mVar.f7044q;
        Object objE = p139n8.b.e();
        int i11 = mVar.f7046s;
        if (i11 == 0) {
            p079h8.r.b(objG);
            I i12 = this.f6993b;
            n nVar = new n(null);
            mVar.f7046s = 1;
            objG = AbstractC0812g.g(i12, nVar, mVar);
            if (objG == objE) {
                return objE;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p079h8.r.b(objG);
        }
        List list = (List) objG;
        return list == null ? AbstractC1444s.l() : list;
    }

    @Override // R2.a
    public InterfaceC0880f d() {
        return new h(m(R2.d.b.c.f7071a.a()), this);
    }

    @Override // R2.a
    public Object e(String str, String str2, p129m8.e eVar) {
        Object objG = AbstractC0812g.g(this.f6993b, new e(str, str2, null), eVar);
        return objG == p139n8.b.e() ? objG : A.f21846a;
    }

    @Override // R2.a
    public Object f(String str, p129m8.e eVar) {
        Object objG = AbstractC0812g.g(this.f6993b, new C0253b(str, null), eVar);
        return objG == p139n8.b.e() ? objG : A.f21846a;
    }

    @Override // R2.a
    public InterfaceC0880f h() {
        return new g(m(R2.d.b.C0257b.f7069a.a()), this);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // R2.a
    public Object i(int i10, int i11, p129m8.e eVar) {
        c cVar;
        if (eVar instanceof c) {
            cVar = (c) eVar;
            int i12 = cVar.f6999s;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                cVar.f6999s = i12 - Integer.MIN_VALUE;
            } else {
                cVar = new c(eVar);
            }
        } else {
            cVar = new c(eVar);
        }
        Object objG = cVar.f6997q;
        Object objE = p139n8.b.e();
        int i13 = cVar.f6999s;
        if (i13 == 0) {
            p079h8.r.b(objG);
            I i14 = this.f6993b;
            d dVar = new d(i10, i11, null);
            cVar.f6999s = 1;
            objG = AbstractC0812g.g(i14, dVar, cVar);
            if (objG == objE) {
                return objE;
            }
        } else {
            if (i13 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p079h8.r.b(objG);
        }
        kotlin.jvm.internal.n.g(objG, "withContext(...)");
        return objG;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // R2.a
    public Object j(p129m8.e eVar) {
        o oVar;
        if (eVar instanceof o) {
            oVar = (o) eVar;
            int i10 = oVar.f7051s;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                oVar.f7051s = i10 - Integer.MIN_VALUE;
            } else {
                oVar = new o(eVar);
            }
        } else {
            oVar = new o(eVar);
        }
        Object objG = oVar.f7049q;
        Object objE = p139n8.b.e();
        int i11 = oVar.f7051s;
        if (i11 == 0) {
            p079h8.r.b(objG);
            I i12 = this.f6993b;
            p pVar = new p(null);
            oVar.f7051s = 1;
            objG = AbstractC0812g.g(i12, pVar, oVar);
            if (objG == objE) {
                return objE;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p079h8.r.b(objG);
        }
        List list = (List) objG;
        return list == null ? AbstractC1444s.l() : list;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object n(p129m8.e eVar) {
        k kVar;
        if (eVar instanceof k) {
            kVar = (k) eVar;
            int i10 = kVar.f7041s;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                kVar.f7041s = i10 - Integer.MIN_VALUE;
            } else {
                kVar = new k(eVar);
            }
        } else {
            kVar = new k(eVar);
        }
        Object objG = kVar.f7039q;
        Object objE = p139n8.b.e();
        int i11 = kVar.f7041s;
        if (i11 == 0) {
            p079h8.r.b(objG);
            I i12 = this.f6993b;
            l lVar = new l(null);
            kVar.f7041s = 1;
            objG = AbstractC0812g.g(i12, lVar, kVar);
            if (objG == objE) {
                return objE;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p079h8.r.b(objG);
        }
        List list = (List) objG;
        return list == null ? AbstractC1444s.l() : list;
    }
}
