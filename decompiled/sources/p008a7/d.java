package p008a7;

import F8.AbstractC0812g;
import F8.AbstractC0816i;
import F8.C0803b0;
import F8.C0834r0;
import F8.I;
import F8.InterfaceC0846x0;
import F8.L;
import F8.W;
import I8.O;
import android.app.Application;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Point;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.widget.Toast;
import androidx.lifecycle.AbstractC1142b;
import androidx.lifecycle.Q;
import androidx.lifecycle.b0;
import com.bumptech.glide.Glide;
import com.bumptech.glide.request.FutureTarget;
import com.nothing.wallpaper.R;
import com.nothing.wallpaper.db.CreativeWallpaper;
import com.nothing.wallpaper.db.WallpaperDatabase;
import com.nothing.wallpaper.picker.creative.model.Prompt;
import com.nothing.wallpaper.picker.creative.model.PromptCategory;
import com.nothing.wallpaper.picker.creative.model.Wallpaper;
import java.io.EOFException;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC1457h;
import p079h8.A;
import p079h8.r;
import p089i8.AbstractC1444s;
import p219v8.p;

/* JADX INFO: loaded from: classes2.dex */
public final class d extends AbstractC1142b {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final b f9853v = new b(null);

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static final int f9854w = 10;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private static final int f9855x = 3;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Application f9856c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Q f9857d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final p079h8.h f9858e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final p079h8.h f9859f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final p079h8.h f9860g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final O f9861h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final O f9862i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final O f9863j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final O f9864k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private InterfaceC0846x0 f9865l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private FutureTarget f9866m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private long f9867n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f9868o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private long f9869p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private volatile boolean f9870q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private volatile Point f9871r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private volatile int f9872s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f9873t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private InterfaceC0846x0 f9874u;

    static final class a extends kotlin.coroutines.jvm.internal.l implements p {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f9875q;

        a(p129m8.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final p129m8.e create(Object obj, p129m8.e eVar) {
            return d.this.new a(eVar);
        }

        @Override // p219v8.p
        public final Object invoke(L l9, p129m8.e eVar) {
            return ((a) create(l9, eVar)).invokeSuspend(A.f21846a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            p139n8.b.e();
            if (this.f9875q != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            r.b(obj);
            d.this.U(new X6.d.a(new Exception(c.f9877q.c())));
            return A.f21846a;
        }
    }

    public static final class b {
        public /* synthetic */ b(AbstractC1457h abstractC1457h) {
            this();
        }

        public final boolean a(List list) {
            kotlin.jvm.internal.n.h(list, "list");
            if (list.size() > b()) {
                com.nothing.wallpaper.common.log.c.d("NtCreativeViewModel", "checkMaxCountLimit removed last");
                if (AbstractC1444s.G(list) != null) {
                    return true;
                }
            }
            return false;
        }

        public final int b() {
            return d.f9854w;
        }

        public final boolean c(Exception exc) {
            String message;
            return (exc == null || (message = exc.getMessage()) == null || !E8.i.Q(message, "SocketTimeoutException", true)) ? false : true;
        }

        public final boolean d(Exception exc) {
            String message;
            return (exc instanceof EOFException) && (message = ((EOFException) exc).getMessage()) != null && E8.i.K(message, "End of input at line 1 column 1 path", true);
        }

        /* JADX WARN: Code duplicated, block: B:19:0x003d  */
        /* JADX WARN: Code duplicated, block: B:9:0x001b  */
        public final void e(X6.b result) {
            int i10;
            int i11;
            kotlin.jvm.internal.n.h(result, "result");
            if (result instanceof X6.b.C0322b) {
                List listA = ((X6.b.C0322b) result).a();
                if (listA != null) {
                    i10 = 1;
                    if (!listA.isEmpty()) {
                        i10 = 0;
                    }
                } else {
                    i10 = 0;
                }
            } else if (result instanceof X6.b.a) {
                X6.b.a aVar = (X6.b.a) result;
                if (c(aVar.a())) {
                    i11 = 2;
                } else if (d(aVar.a())) {
                    i11 = 3;
                } else {
                    i10 = 4;
                }
                i10 = i11;
            } else {
                i10 = 4;
            }
            R7.d.f7114r.c(i10);
        }

        private b() {
        }
    }

    public static abstract class c implements Parcelable {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public static final a f9877q = new a(null);

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private static final String f9878r = "Generate failed, canceled!";

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        private static final String f9879s = "Generate failed, occur error!";

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private static final String f9880t = "Generate failed, always repeat!";

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        private static final String f9881u = "Generate failed, download image failed!";

        public static final class a {
            public /* synthetic */ a(AbstractC1457h abstractC1457h) {
                this();
            }

            public final String a() {
                return c.f9878r;
            }

            public final String b() {
                return c.f9881u;
            }

            public final String c() {
                return c.f9879s;
            }

            public final String d() {
                return c.f9880t;
            }

            private a() {
            }
        }

        public static final class b extends c {
            public static final Parcelable.Creator<b> CREATOR = new a();

            /* JADX INFO: renamed from: v, reason: collision with root package name */
            private final X6.d f9882v;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final b createFromParcel(Parcel parcel) {
                    kotlin.jvm.internal.n.h(parcel, "parcel");
                    return new b((X6.d) parcel.readParcelable(b.class.getClassLoader()));
                }

                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                public final b[] newArray(int i10) {
                    return new b[i10];
                }
            }

            public b(X6.d dVar) {
                super(null);
                this.f9882v = dVar;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final X6.d e() {
                return this.f9882v;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof b) && kotlin.jvm.internal.n.d(this.f9882v, ((b) obj).f9882v);
            }

            public int hashCode() {
                X6.d dVar = this.f9882v;
                if (dVar == null) {
                    return 0;
                }
                return dVar.hashCode();
            }

            @Override // a7.d.c
            public String toString() {
                return "GenerateWallpaperComplete(result=" + this.f9882v + ")";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i10) {
                kotlin.jvm.internal.n.h(dest, "dest");
                dest.writeParcelable(this.f9882v, i10);
            }
        }

        /* JADX INFO: renamed from: a7.d$c$c, reason: collision with other inner class name */
        public static final class C0354c extends c {

            /* JADX INFO: renamed from: v, reason: collision with root package name */
            public static final C0354c f9883v = new C0354c();
            public static final Parcelable.Creator<C0354c> CREATOR = new a();

            /* JADX INFO: renamed from: a7.d$c$c$a */
            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final C0354c createFromParcel(Parcel parcel) {
                    kotlin.jvm.internal.n.h(parcel, "parcel");
                    parcel.readInt();
                    return C0354c.f9883v;
                }

                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                public final C0354c[] newArray(int i10) {
                    return new C0354c[i10];
                }
            }

            private C0354c() {
                super(null);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i10) {
                kotlin.jvm.internal.n.h(dest, "dest");
                dest.writeInt(1);
            }
        }

        /* JADX INFO: renamed from: a7.d$c$d, reason: collision with other inner class name */
        public static final class C0355d extends c {

            /* JADX INFO: renamed from: v, reason: collision with root package name */
            public static final C0355d f9884v = new C0355d();
            public static final Parcelable.Creator<C0355d> CREATOR = new a();

            /* JADX INFO: renamed from: a7.d$c$d$a */
            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final C0355d createFromParcel(Parcel parcel) {
                    kotlin.jvm.internal.n.h(parcel, "parcel");
                    parcel.readInt();
                    return C0355d.f9884v;
                }

                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                public final C0355d[] newArray(int i10) {
                    return new C0355d[i10];
                }
            }

            private C0355d() {
                super(null);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i10) {
                kotlin.jvm.internal.n.h(dest, "dest");
                dest.writeInt(1);
            }
        }

        public static final class e extends c {

            /* JADX INFO: renamed from: v, reason: collision with root package name */
            public static final e f9885v = new e();
            public static final Parcelable.Creator<e> CREATOR = new a();

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final e createFromParcel(Parcel parcel) {
                    kotlin.jvm.internal.n.h(parcel, "parcel");
                    parcel.readInt();
                    return e.f9885v;
                }

                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                public final e[] newArray(int i10) {
                    return new e[i10];
                }
            }

            private e() {
                super(null);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i10) {
                kotlin.jvm.internal.n.h(dest, "dest");
                dest.writeInt(1);
            }
        }

        public static final class f extends c {
            public static final Parcelable.Creator<f> CREATOR = new a();

            /* JADX INFO: renamed from: v, reason: collision with root package name */
            private final X6.b f9886v;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final f createFromParcel(Parcel parcel) {
                    kotlin.jvm.internal.n.h(parcel, "parcel");
                    return new f((X6.b) parcel.readParcelable(f.class.getClassLoader()));
                }

                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                public final f[] newArray(int i10) {
                    return new f[i10];
                }
            }

            public f(X6.b bVar) {
                super(null);
                this.f9886v = bVar;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final X6.b e() {
                return this.f9886v;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof f) && kotlin.jvm.internal.n.d(this.f9886v, ((f) obj).f9886v);
            }

            public int hashCode() {
                X6.b bVar = this.f9886v;
                if (bVar == null) {
                    return 0;
                }
                return bVar.hashCode();
            }

            @Override // a7.d.c
            public String toString() {
                return "LoadPromptsComplete(result=" + this.f9886v + ")";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i10) {
                kotlin.jvm.internal.n.h(dest, "dest");
                dest.writeParcelable(this.f9886v, i10);
            }
        }

        public static final class g extends c {

            /* JADX INFO: renamed from: v, reason: collision with root package name */
            public static final g f9887v = new g();
            public static final Parcelable.Creator<g> CREATOR = new a();

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final g createFromParcel(Parcel parcel) {
                    kotlin.jvm.internal.n.h(parcel, "parcel");
                    parcel.readInt();
                    return g.f9887v;
                }

                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                public final g[] newArray(int i10) {
                    return new g[i10];
                }
            }

            private g() {
                super(null);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i10) {
                kotlin.jvm.internal.n.h(dest, "dest");
                dest.writeInt(1);
            }
        }

        public static final class h extends c {

            /* JADX INFO: renamed from: v, reason: collision with root package name */
            public static final h f9888v = new h();
            public static final Parcelable.Creator<h> CREATOR = new a();

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final h createFromParcel(Parcel parcel) {
                    kotlin.jvm.internal.n.h(parcel, "parcel");
                    parcel.readInt();
                    return h.f9888v;
                }

                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                public final h[] newArray(int i10) {
                    return new h[i10];
                }
            }

            private h() {
                super(null);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i10) {
                kotlin.jvm.internal.n.h(dest, "dest");
                dest.writeInt(1);
            }
        }

        public static final class i extends c {

            /* JADX INFO: renamed from: v, reason: collision with root package name */
            public static final i f9889v = new i();
            public static final Parcelable.Creator<i> CREATOR = new a();

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final i createFromParcel(Parcel parcel) {
                    kotlin.jvm.internal.n.h(parcel, "parcel");
                    parcel.readInt();
                    return i.f9889v;
                }

                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                public final i[] newArray(int i10) {
                    return new i[i10];
                }
            }

            private i() {
                super(null);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i10) {
                kotlin.jvm.internal.n.h(dest, "dest");
                dest.writeInt(1);
            }
        }

        public /* synthetic */ c(AbstractC1457h abstractC1457h) {
            this();
        }

        public String toString() {
            String simpleName = getClass().getSimpleName();
            kotlin.jvm.internal.n.g(simpleName, "getSimpleName(...)");
            return simpleName;
        }

        private c() {
        }
    }

    /* JADX INFO: renamed from: a7.d$d, reason: collision with other inner class name */
    static final class C0356d extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        Object f9890q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        Object f9891r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        Object f9892s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        /* synthetic */ Object f9893t;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        int f9895v;

        C0356d(p129m8.e eVar) {
            super(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f9893t = obj;
            this.f9895v |= Integer.MIN_VALUE;
            return d.this.G(null, this);
        }
    }

    static final class e extends kotlin.coroutines.jvm.internal.l implements p {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f9896q;

        e(p129m8.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final p129m8.e create(Object obj, p129m8.e eVar) {
            return d.this.new e(eVar);
        }

        @Override // p219v8.p
        public final Object invoke(L l9, p129m8.e eVar) {
            return ((e) create(l9, eVar)).invokeSuspend(A.f21846a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            p139n8.b.e();
            if (this.f9896q != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            r.b(obj);
            d.this.U(new X6.d.a(new Exception(c.f9877q.a())));
            return A.f21846a;
        }
    }

    static final class f extends kotlin.coroutines.jvm.internal.l implements p {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f9898q;

        static final class a extends kotlin.coroutines.jvm.internal.l implements p {

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            int f9900q;

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            final /* synthetic */ d f9901r;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(d dVar, p129m8.e eVar) {
                super(2, eVar);
                this.f9901r = dVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final p129m8.e create(Object obj, p129m8.e eVar) {
                return new a(this.f9901r, eVar);
            }

            @Override // p219v8.p
            public final Object invoke(L l9, p129m8.e eVar) {
                return ((a) create(l9, eVar)).invokeSuspend(A.f21846a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                p139n8.b.e();
                if (this.f9900q != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                r.b(obj);
                this.f9901r.O();
                return A.f21846a;
            }
        }

        f(p129m8.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final p129m8.e create(Object obj, p129m8.e eVar) {
            return d.this.new f(eVar);
        }

        @Override // p219v8.p
        public final Object invoke(L l9, p129m8.e eVar) {
            return ((f) create(l9, eVar)).invokeSuspend(A.f21846a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:19:0x0053, code lost:
        
            if (F8.AbstractC0812g.g(r6, r1, r5) == r0) goto L20;
         */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r6) {
            /*
                r5 = this;
                java.lang.Object r0 = p139n8.b.e()
                int r1 = r5.f9898q
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L1e
                if (r1 == r3) goto L1a
                if (r1 != r2) goto L12
                p079h8.r.b(r6)
                goto L56
            L12:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r6)
                throw r5
            L1a:
                p079h8.r.b(r6)
                goto L41
            L1e:
                p079h8.r.b(r6)
                a7.d r6 = p008a7.d.this
                com.bumptech.glide.request.FutureTarget r6 = p008a7.d.r(r6)
                if (r6 == 0) goto L30
                boolean r6 = r6.cancel(r3)
                kotlin.coroutines.jvm.internal.b.a(r6)
            L30:
                a7.d r6 = p008a7.d.this
                F8.x0 r6 = p008a7.d.t(r6)
                if (r6 == 0) goto L41
                r5.f9898q = r3
                java.lang.Object r6 = F8.A0.g(r6, r5)
                if (r6 != r0) goto L41
                goto L55
            L41:
                F8.I r6 = F8.C0803b0.b()
                a7.d$f$a r1 = new a7.d$f$a
                a7.d r3 = p008a7.d.this
                r4 = 0
                r1.<init>(r3, r4)
                r5.f9898q = r2
                java.lang.Object r5 = F8.AbstractC0812g.g(r6, r1, r5)
                if (r5 != r0) goto L56
            L55:
                return r0
            L56:
                h8.A r5 = p079h8.A.f21846a
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: a7.d.f.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    static final class g extends kotlin.coroutines.jvm.internal.l implements p {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f9902q;

        static final class a extends kotlin.coroutines.jvm.internal.l implements p {

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            int f9904q;

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            final /* synthetic */ d f9905r;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(d dVar, p129m8.e eVar) {
                super(2, eVar);
                this.f9905r = dVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final p129m8.e create(Object obj, p129m8.e eVar) {
                return new a(this.f9905r, eVar);
            }

            @Override // p219v8.p
            public final Object invoke(L l9, p129m8.e eVar) {
                return ((a) create(l9, eVar)).invokeSuspend(A.f21846a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                p139n8.b.e();
                if (this.f9904q != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                r.b(obj);
                this.f9905r.m0().c();
                this.f9905r.J();
                this.f9905r.Y().e();
                return A.f21846a;
            }
        }

        g(p129m8.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final p129m8.e create(Object obj, p129m8.e eVar) {
            return d.this.new g(eVar);
        }

        @Override // p219v8.p
        public final Object invoke(L l9, p129m8.e eVar) {
            return ((g) create(l9, eVar)).invokeSuspend(A.f21846a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objE = p139n8.b.e();
            int i10 = this.f9902q;
            if (i10 == 0) {
                r.b(obj);
                I iB = C0803b0.b();
                a aVar = new a(d.this, null);
                this.f9902q = 1;
                if (AbstractC0812g.g(iB, aVar, this) == objE) {
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

    static final class h extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        Object f9906q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        Object f9907r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        /* synthetic */ Object f9908s;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        int f9910u;

        h(p129m8.e eVar) {
            super(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f9908s = obj;
            this.f9910u |= Integer.MIN_VALUE;
            return d.this.N(null, this);
        }
    }

    static final class i extends kotlin.coroutines.jvm.internal.l implements p {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f9911q;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        final /* synthetic */ c f9913s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ Prompt f9914t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        final /* synthetic */ Prompt f9915u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        final /* synthetic */ boolean f9916v;

        static final class a extends kotlin.coroutines.jvm.internal.l implements p {

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            int f9917q;

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            final /* synthetic */ d f9918r;

            /* JADX INFO: renamed from: s, reason: collision with root package name */
            final /* synthetic */ Prompt f9919s;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            final /* synthetic */ Prompt f9920t;

            /* JADX INFO: renamed from: u, reason: collision with root package name */
            final /* synthetic */ boolean f9921u;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(d dVar, Prompt prompt, Prompt prompt2, boolean z9, p129m8.e eVar) {
                super(2, eVar);
                this.f9918r = dVar;
                this.f9919s = prompt;
                this.f9920t = prompt2;
                this.f9921u = z9;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final p129m8.e create(Object obj, p129m8.e eVar) {
                return new a(this.f9918r, this.f9919s, this.f9920t, this.f9921u, eVar);
            }

            @Override // p219v8.p
            public final Object invoke(L l9, p129m8.e eVar) {
                return ((a) create(l9, eVar)).invokeSuspend(A.f21846a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object objE = p139n8.b.e();
                int i10 = this.f9917q;
                if (i10 == 0) {
                    r.b(obj);
                    this.f9918r.f9870q = true;
                    d dVar = this.f9918r;
                    Prompt prompt = this.f9919s;
                    Prompt prompt2 = this.f9920t;
                    int iZ = dVar.Z(prompt, prompt2, this.f9921u);
                    this.f9917q = 1;
                    if (dVar.X(prompt, prompt2, iZ, this) == objE) {
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
        i(c cVar, Prompt prompt, Prompt prompt2, boolean z9, p129m8.e eVar) {
            super(2, eVar);
            this.f9913s = cVar;
            this.f9914t = prompt;
            this.f9915u = prompt2;
            this.f9916v = z9;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final p129m8.e create(Object obj, p129m8.e eVar) {
            return d.this.new i(this.f9913s, this.f9914t, this.f9915u, this.f9916v, eVar);
        }

        @Override // p219v8.p
        public final Object invoke(L l9, p129m8.e eVar) {
            return ((i) create(l9, eVar)).invokeSuspend(A.f21846a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objE = p139n8.b.e();
            int i10 = this.f9911q;
            if (i10 == 0) {
                r.b(obj);
                if (p087i6.m.a(d.this.f9856c)) {
                    d.this.T(this.f9913s);
                    I iB = C0803b0.b();
                    a aVar = new a(d.this, this.f9914t, this.f9915u, this.f9916v, null);
                    this.f9911q = 1;
                    if (AbstractC0812g.g(iB, aVar, this) == objE) {
                        return objE;
                    }
                } else {
                    d.this.T(c.C0354c.f9883v);
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

    static final class j extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        Object f9922q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        Object f9923r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        Object f9924s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        Object f9925t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        int f9926u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        boolean f9927v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        /* synthetic */ Object f9928w;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        int f9930y;

        j(p129m8.e eVar) {
            super(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f9928w = obj;
            this.f9930y |= Integer.MIN_VALUE;
            return d.this.X(null, null, 0, this);
        }
    }

    static final class k extends kotlin.coroutines.jvm.internal.l implements p {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f9931q;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        final /* synthetic */ boolean f9933s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ String f9934t;

        static final class a extends kotlin.coroutines.jvm.internal.l implements p {

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            int f9935q;

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            final /* synthetic */ d f9936r;

            /* JADX INFO: renamed from: s, reason: collision with root package name */
            final /* synthetic */ boolean f9937s;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            final /* synthetic */ String f9938t;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(d dVar, boolean z9, String str, p129m8.e eVar) {
                super(2, eVar);
                this.f9936r = dVar;
                this.f9937s = z9;
                this.f9938t = str;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final p129m8.e create(Object obj, p129m8.e eVar) {
                return new a(this.f9936r, this.f9937s, this.f9938t, eVar);
            }

            @Override // p219v8.p
            public final Object invoke(L l9, p129m8.e eVar) {
                return ((a) create(l9, eVar)).invokeSuspend(A.f21846a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object objE = p139n8.b.e();
                int i10 = this.f9935q;
                if (i10 == 0) {
                    r.b(obj);
                    V6.a aVarM0 = this.f9936r.m0();
                    Application application = this.f9936r.f9856c;
                    boolean z9 = this.f9937s;
                    String str = this.f9938t;
                    this.f9935q = 1;
                    obj = aVarM0.h(application, z9, str, this);
                    if (obj == objE) {
                        return objE;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    r.b(obj);
                }
                X6.b bVar = (X6.b) obj;
                this.f9936r.D0(bVar);
                this.f9936r.T(new c.f(bVar));
                return A.f21846a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        k(boolean z9, String str, p129m8.e eVar) {
            super(2, eVar);
            this.f9933s = z9;
            this.f9934t = str;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final p129m8.e create(Object obj, p129m8.e eVar) {
            return d.this.new k(this.f9933s, this.f9934t, eVar);
        }

        @Override // p219v8.p
        public final Object invoke(L l9, p129m8.e eVar) {
            return ((k) create(l9, eVar)).invokeSuspend(A.f21846a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objE = p139n8.b.e();
            int i10 = this.f9931q;
            if (i10 == 0) {
                r.b(obj);
                if (p087i6.m.a(d.this.f9856c)) {
                    d.this.T(c.h.f9888v);
                    I iB = C0803b0.b();
                    a aVar = new a(d.this, this.f9933s, this.f9934t, null);
                    this.f9931q = 1;
                    if (AbstractC0812g.g(iB, aVar, this) == objE) {
                        return objE;
                    }
                } else {
                    d.this.T(c.g.f9887v);
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

    static final class l extends kotlin.coroutines.jvm.internal.l implements p {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f9939q;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        final /* synthetic */ String f9941s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        l(String str, p129m8.e eVar) {
            super(2, eVar);
            this.f9941s = str;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final p129m8.e create(Object obj, p129m8.e eVar) {
            return d.this.new l(this.f9941s, eVar);
        }

        @Override // p219v8.p
        public final Object invoke(L l9, p129m8.e eVar) {
            return ((l) create(l9, eVar)).invokeSuspend(A.f21846a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objE = p139n8.b.e();
            int i10 = this.f9939q;
            if (i10 == 0) {
                r.b(obj);
                CreativeWallpaper creativeWallpaperL = d.this.m0().l(this.f9941s);
                J6.i.a aVar = J6.i.f3591F;
                Prompt promptE0 = d.this.e0();
                String promptWordEn = promptE0 != null ? promptE0.getPromptWordEn() : null;
                Prompt promptD0 = d.this.d0();
                String strD = aVar.d(promptWordEn, promptD0 != null ? promptD0.getPromptWordEn() : null, creativeWallpaperL != null ? kotlin.coroutines.jvm.internal.b.d(creativeWallpaperL.getImageId()) : null);
                String strG = d.this.Y().g(this.f9941s);
                if (strG == null) {
                    d.this.Y().l(d.this.f9856c, this.f9941s);
                    strG = d.this.Y().g(this.f9941s);
                }
                Bitmap bitmapDecodeFile = strG != null ? BitmapFactory.decodeFile(strG) : null;
                if (bitmapDecodeFile == null) {
                    com.nothing.wallpaper.common.log.c.f("NtCreativeViewModel", "onWallpaperDownload failed, bitmap is null");
                } else {
                    boolean z9 = p087i6.i.a(d.this.f9856c, aVar.e(), strD) != null;
                    if (!z9 && creativeWallpaperL != null) {
                        R7.d.f7114r.d(creativeWallpaperL.getImageId());
                    }
                    p087i6.i.b(d.this.f9856c, aVar.e(), bitmapDecodeFile, strD);
                    d dVar = d.this;
                    this.f9939q = 1;
                    if (dVar.I0(z9, this) == objE) {
                        return objE;
                    }
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

    static final class m extends kotlin.coroutines.jvm.internal.l implements p {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f9942q;

        m(p129m8.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final p129m8.e create(Object obj, p129m8.e eVar) {
            return d.this.new m(eVar);
        }

        @Override // p219v8.p
        public final Object invoke(L l9, p129m8.e eVar) {
            return ((m) create(l9, eVar)).invokeSuspend(A.f21846a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            p139n8.b.e();
            if (this.f9942q != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            r.b(obj);
            if (p087i6.m.a(d.this.f9856c)) {
                d.this.T(new c.f(d.this.k0()));
            } else {
                d.this.T(c.g.f9887v);
            }
            return A.f21846a;
        }
    }

    static final class n extends kotlin.coroutines.jvm.internal.l implements p {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f9944q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ Wallpaper f9945r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        final /* synthetic */ d f9946s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        n(Wallpaper wallpaper, d dVar, p129m8.e eVar) {
            super(2, eVar);
            this.f9945r = wallpaper;
            this.f9946s = dVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final p129m8.e create(Object obj, p129m8.e eVar) {
            return new n(this.f9945r, this.f9946s, eVar);
        }

        @Override // p219v8.p
        public final Object invoke(L l9, p129m8.e eVar) {
            return ((n) create(l9, eVar)).invokeSuspend(A.f21846a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            String promptWordEn;
            String promptWordForLocale;
            String promptWordEn2;
            String promptWordForLocale2;
            p139n8.b.e();
            if (this.f9944q != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            r.b(obj);
            com.nothing.wallpaper.common.log.c.d("NtCreativeViewModel", "saveGeneratedRecords " + this.f9945r);
            String link = this.f9945r.getLink();
            String strG = this.f9946s.Y().g(link);
            if (strG == null || strG.length() == 0) {
                this.f9946s.Y().l(this.f9946s.f9856c, link);
                strG = this.f9946s.Y().g(link);
            }
            String str = strG;
            if (str != null) {
                Wallpaper wallpaper = this.f9945r;
                d dVar = this.f9946s;
                long id = wallpaper.getId();
                Prompt promptE0 = dVar.e0();
                if (promptE0 == null || (promptWordEn = promptE0.getPromptWordEn()) == null) {
                    promptWordEn = "";
                }
                Prompt promptE1 = dVar.e0();
                if (promptE1 == null || (promptWordForLocale = promptE1.getPromptWordForLocale()) == null) {
                    promptWordForLocale = "";
                }
                Prompt promptD0 = dVar.d0();
                if (promptD0 == null || (promptWordEn2 = promptD0.getPromptWordEn()) == null) {
                    promptWordEn2 = "";
                }
                Prompt promptD1 = dVar.d0();
                if (promptD1 == null || (promptWordForLocale2 = promptD1.getPromptWordForLocale()) == null) {
                    promptWordForLocale2 = "";
                }
                kotlin.coroutines.jvm.internal.b.a(dVar.m0().r(new CreativeWallpaper(id, link, str, promptWordEn, promptWordForLocale, promptWordEn2, promptWordForLocale2, System.currentTimeMillis())));
            }
            if (this.f9946s.e0() != null && this.f9946s.d0() != null) {
                V6.a aVarM0 = this.f9946s.m0();
                Prompt promptE2 = this.f9946s.e0();
                kotlin.jvm.internal.n.e(promptE2);
                Prompt promptD2 = this.f9946s.d0();
                kotlin.jvm.internal.n.e(promptD2);
                aVarM0.t(promptE2, promptD2, this.f9946s.f9871r.x);
            }
            return A.f21846a;
        }
    }

    static final class o extends kotlin.coroutines.jvm.internal.l implements p {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f9947q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ boolean f9948r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        final /* synthetic */ d f9949s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        o(boolean z9, d dVar, p129m8.e eVar) {
            super(2, eVar);
            this.f9948r = z9;
            this.f9949s = dVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final p129m8.e create(Object obj, p129m8.e eVar) {
            return new o(this.f9948r, this.f9949s, eVar);
        }

        @Override // p219v8.p
        public final Object invoke(L l9, p129m8.e eVar) {
            return ((o) create(l9, eVar)).invokeSuspend(A.f21846a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            p139n8.b.e();
            if (this.f9947q != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            r.b(obj);
            CharSequence text = this.f9948r ? this.f9949s.f9856c.getText(R.string.nt_already_saved) : this.f9949s.f9856c.getString(R.string.nt_saved_to, "Pictures/Wallpaper Studio");
            kotlin.jvm.internal.n.e(text);
            Toast.makeText(this.f9949s.f9856c, text, 0).show();
            return A.f21846a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(Application context, Q savedStateHandle) {
        super(context);
        kotlin.jvm.internal.n.h(context, "context");
        kotlin.jvm.internal.n.h(savedStateHandle, "savedStateHandle");
        this.f9856c = context;
        this.f9857d = savedStateHandle;
        this.f9858e = p079h8.i.b(new p219v8.a() { // from class: a7.a
            @Override // p219v8.a
            public final Object invoke() {
                return d.y0(this.f9851q);
            }
        });
        this.f9859f = p079h8.i.b(new p219v8.a() { // from class: a7.b
            @Override // p219v8.a
            public final Object invoke() {
                return d.R();
            }
        });
        this.f9860g = p079h8.i.b(new p219v8.a() { // from class: a7.c
            @Override // p219v8.a
            public final Object invoke() {
                return d.L0(this.f9852q);
            }
        });
        O oE = savedStateHandle.e("key_ui_state", c.h.f9888v);
        this.f9861h = oE;
        this.f9862i = savedStateHandle.e("key_selected_style_position", 0);
        this.f9863j = savedStateHandle.e("key_selected_subject_position", 0);
        this.f9864k = savedStateHandle.e("key_selected_wallpaper_position", 0);
        this.f9871r = new Point();
        com.nothing.wallpaper.common.log.c.d("NtCreativeViewModel", "init last state:" + oE);
        if (kotlin.jvm.internal.n.d(oE.getValue(), c.e.f9885v)) {
            AbstractC0816i.d(b0.a(this), null, null, new a(null), 3, null);
        }
    }

    private final void B0(Prompt prompt) {
        this.f9857d.i("key_last_style_prompt", prompt);
    }

    private final void C0(Prompt prompt) {
        this.f9857d.i("key_last_subject_prompt", prompt);
    }

    private final void D(X6.d.b bVar) {
        if (u0(bVar)) {
            List list = (List) this.f9857d.d("key_history_invalid_wallpapers");
            if (list != null) {
                list.add(0, AbstractC1444s.S(bVar.a()));
                return;
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(0, AbstractC1444s.S(bVar.a()));
            this.f9857d.i("key_history_invalid_wallpapers", arrayList);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void D0(X6.b bVar) {
        this.f9857d.i("key_prompts", bVar);
    }

    private final void E(X6.d.b bVar) {
        if (u0(bVar)) {
            List list = (List) this.f9857d.d("key_history_wallpapers");
            if (list != null) {
                list.add(0, AbstractC1444s.S(bVar.a()));
                return;
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(0, AbstractC1444s.S(bVar.a()));
            this.f9857d.i("key_history_wallpapers", arrayList);
        }
    }

    private final void F(X6.d dVar) {
        com.nothing.wallpaper.common.log.c.d("NtCreativeViewModel", "attemptEmitWallpaperData " + this.f9870q);
        if (this.f9870q) {
            this.f9870q = false;
            U(dVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object G(X6.d.b bVar, p129m8.e eVar) {
        C0356d c0356d;
        Bitmap bitmapS;
        String link;
        if (eVar instanceof C0356d) {
            c0356d = (C0356d) eVar;
            int i10 = c0356d.f9895v;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c0356d.f9895v = i10 - Integer.MIN_VALUE;
            } else {
                c0356d = new C0356d(eVar);
            }
        } else {
            c0356d = new C0356d(eVar);
        }
        Object obj = c0356d.f9893t;
        Object objE = p139n8.b.e();
        int i11 = c0356d.f9895v;
        if (i11 == 0) {
            r.b(obj);
            com.nothing.wallpaper.common.log.c.d("NtCreativeViewModel", "attemptLoadImageToDisk");
            this.f9873t = 0;
            Wallpaper wallpaper = (Wallpaper) AbstractC1444s.U(bVar.a());
            bitmapS = null;
            link = wallpaper != null ? wallpaper.getLink() : null;
            if (link != null && link.length() != 0) {
            }
            return A.f21846a;
        }
        if (i11 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        Bitmap bitmap = (Bitmap) c0356d.f9892s;
        link = (String) c0356d.f9891r;
        d dVar = (d) c0356d.f9890q;
        r.b(obj);
        bitmapS = bitmap;
        this = dVar;
        while (bitmapS == null && this.f9873t < f9855x) {
            InterfaceC0846x0 interfaceC0846x0 = this.f9865l;
            if (interfaceC0846x0 != null && interfaceC0846x0.a()) {
                bitmapS = this.S(this.f9856c, link);
                this.f9873t++;
                if (bitmapS == null) {
                    if (!p087i6.m.a(this.f9856c)) {
                        com.nothing.wallpaper.common.log.c.k("NtCreativeViewModel", "attemptLoadImageToDisk failed, network is not available!");
                        break;
                    }
                    c0356d.f9890q = this;
                    c0356d.f9891r = link;
                    c0356d.f9892s = bitmapS;
                    c0356d.f9895v = 1;
                    if (W.b(500L, c0356d) == objE) {
                        return objE;
                    }
                }
            } else {
                break;
            }
        }
        InterfaceC0846x0 interfaceC0846x1 = this.f9865l;
        if (interfaceC0846x1 != null && interfaceC0846x1.a()) {
            if (bitmapS == null) {
                com.nothing.wallpaper.common.log.c.f("NtCreativeViewModel", "attemptLoadImageToDisk failed, image is null!");
            } else {
                com.nothing.wallpaper.common.log.c.d("NtCreativeViewModel", "attemptLoadImageToDisk, put to cache.");
                kotlin.coroutines.jvm.internal.b.a(this.Y().k(link, bitmapS));
            }
        }
        return A.f21846a;
    }

    private final void G0(X6.d.b bVar) {
        this.f9857d.i("key_wait_to_emit_wallpaper", bVar);
    }

    public static /* synthetic */ void I(d dVar, boolean z9, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z9 = true;
        }
        dVar.H(z9);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object I0(boolean z9, p129m8.e eVar) {
        Object objG = AbstractC0812g.g(C0803b0.c(), new o(z9, this, null), eVar);
        return objG == p139n8.b.e() ? objG : A.f21846a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void J() {
        List list = (List) this.f9857d.d("key_history_wallpapers");
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                P(((Wallpaper) it.next()).getLink());
            }
        }
        List list2 = (List) this.f9857d.d("key_history_invalid_wallpapers");
        if (list2 != null) {
            Iterator it2 = list2.iterator();
            while (it2.hasNext()) {
                P(((Wallpaper) it2.next()).getLink());
            }
        }
    }

    private final void J0() {
        U(new X6.d.a(new Exception(c.f9877q.d())));
        this.f9868o = 0;
        this.f9869p = 0L;
        this.f9870q = false;
    }

    private final void K0(X6.d dVar) {
        int i10;
        if (dVar instanceof X6.d.b) {
            if (u0((X6.d.b) dVar)) {
                R7.d dVar2 = R7.d.f7114r;
                Prompt promptE0 = e0();
                long promptWordId = promptE0 != null ? promptE0.getPromptWordId() : 0L;
                Prompt promptD0 = d0();
                dVar2.b(4, promptWordId, promptD0 != null ? promptD0.getPromptWordId() : 0L);
                return;
            }
            R7.d dVar3 = R7.d.f7114r;
            Prompt promptE1 = e0();
            long promptWordId2 = promptE1 != null ? promptE1.getPromptWordId() : 0L;
            Prompt promptD1 = d0();
            dVar3.a(promptWordId2, promptD1 != null ? promptD1.getPromptWordId() : 0L, 3);
            return;
        }
        if (dVar instanceof X6.d.a) {
            X6.d.a aVar = (X6.d.a) dVar;
            String message = aVar.a().getMessage();
            c.a aVar2 = c.f9877q;
            if (kotlin.jvm.internal.n.d(message, aVar2.a())) {
                i10 = 1;
            } else if (kotlin.jvm.internal.n.d(message, aVar2.d())) {
                i10 = 2;
            } else if (kotlin.jvm.internal.n.d(message, aVar2.b())) {
                i10 = 7;
            } else {
                i10 = kotlin.jvm.internal.n.d(message, aVar2.c()) ? -1 : 5;
            }
            b bVar = f9853v;
            if (bVar.c(aVar.a())) {
                i10 = 6;
            } else if (bVar.d(aVar.a())) {
                i10 = 8;
            }
            int i11 = i10;
            if (i11 != -1) {
                R7.d dVar4 = R7.d.f7114r;
                Prompt promptE2 = e0();
                long promptWordId3 = promptE2 != null ? promptE2.getPromptWordId() : 0L;
                Prompt promptD2 = d0();
                dVar4.a(promptWordId3, promptD2 != null ? promptD2.getPromptWordId() : 0L, i11);
            }
        }
    }

    private final boolean L(Wallpaper wallpaper) {
        return m0().k(wallpaper.getId()) != null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String L0(d dVar) {
        return p087i6.e.g(dVar.f9856c);
    }

    private final void M(X6.d.b bVar) {
        if (u0(bVar) || e0() == null || d0() == null) {
            return;
        }
        V6.a aVarM0 = m0();
        Prompt promptE0 = e0();
        kotlin.jvm.internal.n.e(promptE0);
        Prompt promptD0 = d0();
        kotlin.jvm.internal.n.e(promptD0);
        aVarM0.q(promptE0, promptD0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object N(X6.d dVar, p129m8.e eVar) {
        h hVar;
        if (eVar instanceof h) {
            hVar = (h) eVar;
            int i10 = hVar.f9910u;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                hVar.f9910u = i10 - Integer.MIN_VALUE;
            } else {
                hVar = new h(eVar);
            }
        } else {
            hVar = new h(eVar);
        }
        Object obj = hVar.f9908s;
        Object objE = p139n8.b.e();
        int i11 = hVar.f9910u;
        if (i11 == 0) {
            r.b(obj);
            long jUptimeMillis = SystemClock.uptimeMillis() - this.f9867n;
            if (jUptimeMillis < 3000) {
                int iNextInt = new SecureRandom().nextInt((int) (7000 - jUptimeMillis));
                if (((long) iNextInt) + jUptimeMillis < 3000) {
                    iNextInt += 3000;
                    com.nothing.wallpaper.common.log.c.d("NtCreativeViewModel", "checkSpendTime spendTime:" + jUptimeMillis + " waitTime:" + iNextInt);
                }
                hVar.f9906q = this;
                hVar.f9907r = dVar;
                hVar.f9910u = 1;
                if (W.b(iNextInt, hVar) == objE) {
                    return objE;
                }
            } else {
                F(dVar);
            }
            return A.f21846a;
        }
        if (i11 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        dVar = (X6.d) hVar.f9907r;
        this = (d) hVar.f9906q;
        r.b(obj);
        this.F(dVar);
        return A.f21846a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void O() {
        List listA;
        Wallpaper wallpaper;
        X6.d.b bVarR0 = r0();
        if (bVarR0 != null && (listA = bVarR0.a()) != null && (wallpaper = (Wallpaper) AbstractC1444s.U(listA)) != null) {
            com.nothing.wallpaper.common.log.c.o("NtCreativeViewModel", "checkWaitToEmitWallpaper delete " + Y().g(wallpaper.getLink()));
            Y().d(wallpaper.getLink());
        }
        G0(null);
    }

    private final void P(String str) {
        if (m0().l(str) == null) {
            Y().d(str);
            com.nothing.wallpaper.common.log.c.o("NtCreativeViewModel", "Delete useless image cache file. " + Y().h());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final U6.e R() {
        return U6.e.f7982c.b();
    }

    private final Bitmap S(Context context, String str) {
        Bitmap bitmap;
        if (str == null || str.length() == 0) {
            return null;
        }
        try {
            FutureTarget<Bitmap> futureTargetSubmit = Glide.with(context).asBitmap().load(str).submit(Integer.MIN_VALUE, Integer.MIN_VALUE);
            this.f9866m = futureTargetSubmit;
            bitmap = futureTargetSubmit != null ? futureTargetSubmit.get() : null;
        } catch (Exception e10) {
            com.nothing.wallpaper.common.log.c.f("NtCreativeViewModel", "downloadWallpaper failed, count:" + this.f9873t + " msg:" + e10.getMessage());
        }
        this.f9866m = null;
        return bitmap;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void T(c cVar) {
        this.f9857d.i("key_ui_state", cVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void U(X6.d dVar) {
        String link;
        if (kotlin.jvm.internal.n.d(r0(), dVar)) {
            G0(null);
            com.nothing.wallpaper.common.log.c.d("NtCreativeViewModel", "emitWallpaperData waitToEmitWallpaper set to null");
        }
        if (!p087i6.m.a(this.f9856c)) {
            com.nothing.wallpaper.common.log.c.k("NtCreativeViewModel", "emitWallpaperData no network");
            if (dVar instanceof X6.d.b) {
                D((X6.d.b) dVar);
            }
            T(c.C0354c.f9883v);
            R7.d dVar2 = R7.d.f7114r;
            Prompt promptE0 = e0();
            long promptWordId = promptE0 != null ? promptE0.getPromptWordId() : 0L;
            Prompt promptD0 = d0();
            dVar2.a(promptWordId, promptD0 != null ? promptD0.getPromptWordId() : 0L, 4);
            return;
        }
        if (dVar instanceof X6.d.b) {
            X6.d.b bVar = (X6.d.b) dVar;
            if (u0(bVar)) {
                Wallpaper wallpaper = (Wallpaper) AbstractC1444s.U(bVar.a());
                boolean z9 = false;
                if (wallpaper != null && (link = wallpaper.getLink()) != null) {
                    String strG = Y().g(link);
                    z9 = !(strG == null || strG.length() == 0);
                }
                if (z9) {
                    E(bVar);
                    T(new c.b(dVar));
                    K0(dVar);
                    return;
                } else {
                    D(bVar);
                    X6.d.a aVar = new X6.d.a(new Exception(c.f9877q.b()));
                    T(new c.b(aVar));
                    K0(aVar);
                    return;
                }
            }
        }
        T(new c.b(dVar));
        K0(dVar);
    }

    private final void V(Prompt prompt, Prompt prompt2, c cVar, boolean z9) {
        InterfaceC0846x0 interfaceC0846x0;
        com.nothing.wallpaper.common.log.c.d("NtCreativeViewModel", "generateWallpaper");
        if (this.f9870q || !((interfaceC0846x0 = this.f9865l) == null || interfaceC0846x0.O0())) {
            com.nothing.wallpaper.common.log.c.o("NtCreativeViewModel", "generateWallpaper already started!");
            return;
        }
        this.f9868o = 0;
        this.f9869p = 0L;
        this.f9867n = SystemClock.uptimeMillis();
        B0(prompt2);
        C0(prompt);
        this.f9865l = AbstractC0816i.d(b0.a(this), null, null, new i(cVar, prompt, prompt2, z9, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:48:0x0182  */
    /* JADX WARN: Code duplicated, block: B:49:0x018b  */
    /* JADX WARN: Code duplicated, block: B:54:0x01a6  */
    /* JADX WARN: Code duplicated, block: B:63:0x01c0  */
    /* JADX WARN: Code duplicated, block: B:66:0x01c8  */
    /* JADX WARN: Code duplicated, block: B:68:0x01cc  */
    /* JADX WARN: Code duplicated, block: B:71:0x01e4  */
    /* JADX WARN: Code duplicated, block: B:73:0x01ec A[PHI: r0 r1 r6
      0x01ec: PHI (r0v11 X6.d) = (r0v7 X6.d), (r0v13 X6.d) binds: [B:67:0x01ca, B:72:0x01e5] A[DONT_GENERATE, DONT_INLINE]
      0x01ec: PHI (r1v10 java.lang.Object) = (r1v7 java.lang.Object), (r1v12 java.lang.Object) binds: [B:67:0x01ca, B:72:0x01e5] A[DONT_GENERATE, DONT_INLINE]
      0x01ec: PHI (r6v15 a7.d) = (r6v12 a7.d), (r6v16 a7.d) binds: [B:67:0x01ca, B:72:0x01e5] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:78:0x0201  */
    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x019e, code lost:
    
        if (r6.X(r9, r4, r7, r8) == r2) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x01fb, code lost:
    
        if (r6.N(r0, r8) == r2) goto L75;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object X(com.nothing.wallpaper.picker.creative.model.Prompt r20, com.nothing.wallpaper.picker.creative.model.Prompt r21, int r22, p129m8.e r23) {
        /*
            Method dump skipped, instruction units count: 516
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p008a7.d.X(com.nothing.wallpaper.picker.creative.model.Prompt, com.nothing.wallpaper.picker.creative.model.Prompt, int, m8.e):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final U6.e Y() {
        return (U6.e) this.f9859f.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int Z(Prompt prompt, Prompt prompt2, boolean z9) {
        com.nothing.wallpaper.common.log.c.d("NtCreativeViewModel", "getGenerateIndex updateRequestIndex:" + z9);
        if (z9) {
            m0().q(prompt, prompt2);
        }
        Point pointN = m0().n(prompt, prompt2);
        this.f9871r.set(pointN.x, pointN.y);
        return pointN.y;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Prompt d0() {
        return (Prompt) this.f9857d.d("key_last_style_prompt");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Prompt e0() {
        return (Prompt) this.f9857d.d("key_last_subject_prompt");
    }

    public static /* synthetic */ void i0(d dVar, boolean z9, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z9 = false;
        }
        dVar.h0(z9, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final X6.b k0() {
        return (X6.b) this.f9857d.d("key_prompts");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final V6.a m0() {
        return (V6.a) this.f9858e.getValue();
    }

    private final String q0() {
        return (String) this.f9860g.getValue();
    }

    private final X6.d.b r0() {
        return (X6.d.b) this.f9857d.d("key_wait_to_emit_wallpaper");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final V6.a y0(d dVar) {
        V6.a.C0296a c0296a = V6.a.f8200e;
        WallpaperDatabase.a aVar = WallpaperDatabase.f18441p;
        return c0296a.a(aVar.b(dVar.f9856c).D(), aVar.b(dVar.f9856c).E(), new com.nothing.wallpaper.picker.creative.network.a(dVar.f9856c));
    }

    public final void A0(Wallpaper wallpaper) {
        kotlin.jvm.internal.n.h(wallpaper, "wallpaper");
        AbstractC0816i.d(b0.a(this), C0803b0.b(), null, new n(wallpaper, this, null), 2, null);
    }

    public final void E0(int i10) {
        this.f9857d.i("key_selected_style_position", Integer.valueOf(i10));
    }

    public final void F0(int i10) {
        this.f9857d.i("key_selected_subject_position", Integer.valueOf(i10));
    }

    public final void H(boolean z9) {
        com.nothing.wallpaper.common.log.c.k("NtCreativeViewModel", "cancelGenerateWallpaper " + this.f9870q);
        boolean z10 = this.f9870q;
        this.f9870q = false;
        if (z9 & z10) {
            AbstractC0816i.d(b0.a(this), null, null, new e(null), 3, null);
        }
        AbstractC0816i.d(b0.a(this), null, null, new f(null), 3, null);
    }

    public final void H0(int i10) {
        this.f9857d.i("key_selected_wallpaper_position", Integer.valueOf(i10));
    }

    public final void K() {
        AbstractC0816i.d(C0834r0.f1894q, null, null, new g(null), 3, null);
    }

    public final void Q() {
        List list = (List) this.f9857d.d("key_history_wallpapers");
        if (list != null) {
            list.clear();
        }
    }

    public final void W(Prompt prompt, Prompt prompt2, boolean z9) {
        if (prompt == null || prompt2 == null) {
            return;
        }
        V(prompt, prompt2, c.e.f9885v, z9);
    }

    public final List a0() {
        List arrayList = (List) this.f9857d.d("key_history_wallpapers");
        if (arrayList == null) {
            arrayList = new ArrayList();
        }
        int size = arrayList.size();
        int i10 = f9854w;
        if (size > i10) {
            return AbstractC1444s.o0(arrayList, i10);
        }
        ArrayList arrayList2 = new ArrayList();
        arrayList2.addAll(arrayList);
        return arrayList2;
    }

    public final Prompt b0() {
        return d0();
    }

    public final Prompt c0() {
        return e0();
    }

    @Override // androidx.lifecycle.a0
    protected void d() {
        super.d();
        K();
    }

    public final List f0() {
        X6.b bVarK0 = k0();
        if (bVarK0 == null || !(bVarK0 instanceof X6.b.C0322b)) {
            return null;
        }
        for (PromptCategory promptCategory : ((X6.b.C0322b) bVarK0).a()) {
            if (X6.a.a(promptCategory)) {
                return promptCategory.getPrompts();
            }
        }
        return null;
    }

    public final List g0() {
        X6.b bVarK0 = k0();
        if (bVarK0 == null || !(bVarK0 instanceof X6.b.C0322b)) {
            return null;
        }
        for (PromptCategory promptCategory : ((X6.b.C0322b) bVarK0).a()) {
            if (X6.a.b(promptCategory)) {
                return promptCategory.getPrompts();
            }
        }
        return null;
    }

    public final void h0(boolean z9, String language) {
        kotlin.jvm.internal.n.h(language, "language");
        com.nothing.wallpaper.common.log.c.d("NtCreativeViewModel", "getPromptList " + z9);
        AbstractC0816i.d(b0.a(this), null, null, new k(z9, language, null), 3, null);
    }

    public final void j0(String language) {
        kotlin.jvm.internal.n.h(language, "language");
        com.nothing.wallpaper.common.log.c.d("NtCreativeViewModel", "getPromptListForInit uiState:" + this.f9861h.getValue());
        if (kotlin.jvm.internal.n.d(this.f9861h.getValue(), c.h.f9888v)) {
            i0(this, false, language, 1, null);
        }
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0021  */
    public final String l0() {
        String promptWordEn;
        Prompt promptE0 = e0();
        String promptWordEn2 = null;
        String promptWordForLocale = promptE0 != null ? promptE0.getPromptWordForLocale() : null;
        if (promptWordForLocale == null || promptWordForLocale.length() == 0) {
            Prompt promptE1 = e0();
            if (promptE1 != null) {
                promptWordEn = promptE1.getPromptWordEn();
            } else {
                promptWordEn = null;
            }
        } else {
            Prompt promptE2 = e0();
            if (promptE2 != null) {
                promptWordEn = promptE2.getPromptWordForLocale();
            } else {
                promptWordEn = null;
            }
        }
        Prompt promptD0 = d0();
        String promptWordForLocale2 = promptD0 != null ? promptD0.getPromptWordForLocale() : null;
        if (promptWordForLocale2 == null || promptWordForLocale2.length() == 0) {
            Prompt promptD1 = d0();
            if (promptD1 != null) {
                promptWordEn2 = promptD1.getPromptWordEn();
            }
        } else {
            Prompt promptD2 = d0();
            if (promptD2 != null) {
                promptWordEn2 = promptD2.getPromptWordForLocale();
            }
        }
        return promptWordEn + " + " + promptWordEn2;
    }

    public final O n0() {
        return this.f9862i;
    }

    public final O o0() {
        return this.f9863j;
    }

    public final O p0() {
        return this.f9861h;
    }

    public final J6.i s0(Wallpaper wallpaper) {
        kotlin.jvm.internal.n.h(wallpaper, "wallpaper");
        CreativeWallpaper creativeWallpaperK = m0().k(wallpaper.getId());
        if (creativeWallpaperK == null) {
            return null;
        }
        String string = this.f9856c.getResources().getString(R.string.nt_ai_wallpaper_title);
        kotlin.jvm.internal.n.g(string, "getString(...)");
        String strValueOf = String.valueOf(creativeWallpaperK.getImageId());
        J6.i.a aVar = J6.i.f3591F;
        return new J6.i(strValueOf, aVar.a(this.f9856c), creativeWallpaperK.getFilePath(), string, aVar.f(creativeWallpaperK), wallpaper.getLink());
    }

    public final O t0() {
        return this.f9864k;
    }

    public final boolean u0(X6.d.b bVar) {
        List listA;
        Wallpaper wallpaper;
        String link;
        return (bVar == null || (listA = bVar.a()) == null || !(listA.isEmpty() ^ true) || (wallpaper = (Wallpaper) AbstractC1444s.U(bVar.a())) == null || (link = wallpaper.getLink()) == null || link.length() <= 0) ? false : true;
    }

    public final void v0(String imageUrl) {
        kotlin.jvm.internal.n.h(imageUrl, "imageUrl");
        if (e0() == null || d0() == null) {
            return;
        }
        InterfaceC0846x0 interfaceC0846x0 = this.f9874u;
        if (interfaceC0846x0 == null || interfaceC0846x0.O0()) {
            this.f9874u = AbstractC0816i.d(b0.a(this), C0803b0.b(), null, new l(imageUrl, null), 2, null);
        } else {
            com.nothing.wallpaper.common.log.c.o("NtCreativeViewModel", "onWallpaperDownload already downloading!");
        }
    }

    public final void w0(Prompt subjectPrompt, Prompt stylePrompt, boolean z9) {
        kotlin.jvm.internal.n.h(subjectPrompt, "subjectPrompt");
        kotlin.jvm.internal.n.h(stylePrompt, "stylePrompt");
        V(subjectPrompt, stylePrompt, c.C0355d.f9884v, z9);
    }

    public final void x0() {
        com.nothing.wallpaper.common.log.c.d("NtCreativeViewModel", "regenerateWallpaper");
        if (e0() == null || d0() == null) {
            return;
        }
        W(e0(), d0(), false);
        R7.d dVar = R7.d.f7114r;
        Prompt promptE0 = e0();
        long promptWordId = promptE0 != null ? promptE0.getPromptWordId() : 0L;
        Prompt promptD0 = d0();
        dVar.b(2, promptWordId, promptD0 != null ? promptD0.getPromptWordId() : 0L);
    }

    public final void z0() {
        com.nothing.wallpaper.common.log.c.k("NtCreativeViewModel", "restorePromptUiState");
        AbstractC0816i.d(b0.a(this), null, null, new m(null), 3, null);
    }
}
