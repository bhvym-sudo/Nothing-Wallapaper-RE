package p226w5;

import E5.f;
import F8.W;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.pm.ApplicationInfo;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import kotlin.coroutines.jvm.internal.d;
import kotlin.jvm.internal.AbstractC1457h;
import kotlin.jvm.internal.n;
import org.json.JSONObject;
import p079h8.q;
import p079h8.r;
import p129m8.e;

/* JADX INFO: loaded from: classes.dex */
public final class g implements o {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final a f29546f = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f29547a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f29548b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f29549c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f29550d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f29551e;

    public static final class a {
        public /* synthetic */ a(AbstractC1457h abstractC1457h) {
            this();
        }

        private a() {
        }
    }

    public static final class b extends ContextWrapper {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Context f29552a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final ApplicationInfo f29553b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Context f29554c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Context context, ApplicationInfo pkgInfo, Context sourceContext) {
            super(context);
            n.h(context, "context");
            n.h(pkgInfo, "pkgInfo");
            n.h(sourceContext, "sourceContext");
            this.f29552a = context;
            this.f29553b = pkgInfo;
            this.f29554c = sourceContext;
        }

        @Override // android.content.ContextWrapper, android.content.Context
        public ClassLoader getClassLoader() {
            ClassLoader classLoaderA;
            E5.b bVar = E5.b.f1285a;
            String sourceDir = this.f29553b.sourceDir;
            n.g(sourceDir, "sourceDir");
            String packageName = this.f29554c.getPackageName();
            n.g(packageName, "getPackageName(...)");
            ClassLoader classLoaderA2 = bVar.a(sourceDir, packageName);
            if (classLoaderA2 != null) {
                return classLoaderA2;
            }
            synchronized (bVar.b()) {
                String sourceDir2 = this.f29553b.sourceDir;
                n.g(sourceDir2, "sourceDir");
                String packageName2 = this.f29554c.getPackageName();
                n.g(packageName2, "getPackageName(...)");
                classLoaderA = bVar.a(sourceDir2, packageName2);
                if (classLoaderA == null) {
                    String sourceDir3 = this.f29553b.sourceDir;
                    n.g(sourceDir3, "sourceDir");
                    String nativeLibraryDir = this.f29553b.nativeLibraryDir;
                    n.g(nativeLibraryDir, "nativeLibraryDir");
                    ClassLoader classLoader = this.f29552a.getClassLoader();
                    n.g(classLoader, "getClassLoader(...)");
                    classLoaderA = new E5.a(sourceDir3, nativeLibraryDir, classLoader);
                    String sourceDir4 = this.f29553b.sourceDir;
                    n.g(sourceDir4, "sourceDir");
                    String packageName3 = this.f29554c.getPackageName();
                    n.g(packageName3, "getPackageName(...)");
                    bVar.c(sourceDir4, packageName3, classLoaderA);
                }
            }
            return classLoaderA;
        }

        @Override // android.content.ContextWrapper, android.content.Context
        public String getPackageName() {
            String packageName = this.f29554c.getPackageName();
            n.g(packageName, "getPackageName(...)");
            return packageName;
        }

        @Override // android.content.ContextWrapper, android.content.Context
        public Resources getResources() {
            Resources resources = this.f29554c.getResources();
            n.g(resources, "getResources(...)");
            return resources;
        }

        @Override // android.content.ContextWrapper, android.content.Context
        public Resources.Theme getTheme() {
            Resources.Theme theme = this.f29554c.getTheme();
            n.g(theme, "getTheme(...)");
            return theme;
        }

        @Override // android.content.ContextWrapper, android.content.Context
        public boolean isRestricted() {
            return this.f29554c.isRestricted();
        }
    }

    static final class c extends d {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        Object f29555q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        Object f29556r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        Object f29557s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        Object f29558t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        /* synthetic */ Object f29559u;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        int f29561w;

        c(e eVar) {
            super(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f29559u = obj;
            this.f29561w |= Integer.MIN_VALUE;
            return g.this.b(null, null, null, null, null, null, this);
        }
    }

    public g(JSONObject jSONObject) {
        this.f29548b = jSONObject != null ? ((Number) p206u5.c.c(jSONObject, "layout_id", -1)).intValue() : -1;
        this.f29549c = jSONObject != null ? p206u5.c.e(jSONObject, "package_name") : null;
        this.f29550d = jSONObject != null ? p206u5.c.e(jSONObject, "authority") : null;
        this.f29551e = jSONObject != null ? p206u5.c.e(jSONObject, "grant_authority") : null;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0077  */
    private final Context e(Context context) {
        Object objB;
        b bVar;
        G5.c.f1948a.h("Host", "getRemoteContext packageName = " + this.f29549c);
        if (n.d(context.getPackageName(), this.f29549c)) {
            return context;
        }
        try {
            q.a aVar = q.f21862r;
            if (this.f29549c != null) {
                ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(this.f29549c, 9216);
                n.g(applicationInfo, "getApplicationInfo(...)");
                Object objB2 = f.a(context).a("createApplicationContext", ApplicationInfo.class, Integer.TYPE).b(context, applicationInfo, 4);
                Context context2 = objB2 instanceof Context ? (Context) objB2 : null;
                if (context2 == null) {
                    G5.c.d("Host", "ConfigParser createApplicationContext fail, inflateContext == null");
                }
                if (context2 != null) {
                    bVar = new b(context, applicationInfo, context2);
                } else {
                    bVar = null;
                }
            } else {
                bVar = null;
            }
            objB = q.b(bVar);
        } catch (Throwable th) {
            q.a aVar2 = q.f21862r;
            objB = q.b(r.a(th));
        }
        return (Context) (q.f(objB) ? null : objB);
    }

    @Override // p226w5.o
    public Object a(Context context, View view, ViewGroup viewGroup, f fVar, p216v5.a aVar, n nVar, e eVar) {
        return o.a.a(this, context, view, viewGroup, fVar, aVar, nVar, eVar);
    }

    /* JADX WARN: Code duplicated, block: B:22:0x007a  */
    /* JADX WARN: Code duplicated, block: B:23:0x007f  */
    /* JADX WARN: Code duplicated, block: B:26:0x009e  */
    /* JADX WARN: Code duplicated, block: B:29:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:31:0x00b7 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // p226w5.o
    public Object b(Context context, View view, ViewGroup viewGroup, f fVar, p216v5.a aVar, n nVar, e eVar) {
        c cVar;
        Context context2;
        String packageName;
        Context context3;
        if (eVar instanceof c) {
            cVar = (c) eVar;
            int i10 = cVar.f29561w;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                cVar.f29561w = i10 - Integer.MIN_VALUE;
            } else {
                cVar = new c(eVar);
            }
        } else {
            cVar = new c(eVar);
        }
        Object obj = cVar.f29559u;
        Object objE = p139n8.b.e();
        int i11 = cVar.f29561w;
        if (i11 == 0) {
            r.b(obj);
            Context contextE = e(context);
            this.f29547a = contextE;
            if (contextE == null) {
                G5.c.f1948a.l("CardConfigParser", "remoteContext is null, delay 200ms to retry");
                cVar.f29555q = this;
                cVar.f29556r = context;
                cVar.f29557s = viewGroup;
                cVar.f29558t = fVar;
                cVar.f29561w = 1;
                if (W.b(200L, cVar) == objE) {
                    return objE;
                }
            }
            G5.c cVar2 = G5.c.f1948a;
            int i12 = this.f29548b;
            context2 = this.f29547a;
            if (context2 != null) {
                packageName = context2.getPackageName();
            } else {
                packageName = null;
            }
            cVar2.h("CardConfigParser", "Inflate layout begin, layoutId = " + i12 + ", targetContext pkg = " + packageName);
            if (fVar != null) {
                fVar.a(this.f29547a);
            }
            context3 = this.f29547a;
            if (context3 != null) {
                return LayoutInflater.from(context).cloneInContext(context3).inflate(this.f29548b, viewGroup, false);
            }
            return null;
        }
        if (i11 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        fVar = (f) cVar.f29558t;
        viewGroup = (ViewGroup) cVar.f29557s;
        context = (Context) cVar.f29556r;
        this = (g) cVar.f29555q;
        r.b(obj);
        this.f29547a = this.e(context);
        G5.c cVar3 = G5.c.f1948a;
        int i13 = this.f29548b;
        context2 = this.f29547a;
        if (context2 != null) {
            packageName = context2.getPackageName();
        } else {
            packageName = null;
        }
        cVar3.h("CardConfigParser", "Inflate layout begin, layoutId = " + i13 + ", targetContext pkg = " + packageName);
        if (fVar != null) {
            fVar.a(this.f29547a);
        }
        context3 = this.f29547a;
        if (context3 != null) {
            return LayoutInflater.from(context).cloneInContext(context3).inflate(this.f29548b, viewGroup, false);
        }
        return null;
    }

    public final String c() {
        return this.f29550d;
    }

    public final String d() {
        return this.f29551e;
    }
}
