package A6;

import C6.i;
import F8.AbstractC0814h;
import F8.AbstractC0816i;
import F8.C0803b0;
import F8.C0826n;
import F8.C0834r0;
import F8.InterfaceC0822l;
import F8.L;
import F8.M;
import F8.T0;
import F8.Y0;
import android.app.WallpaperColors;
import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.util.LruCache;
import android.util.Size;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;
import kotlin.coroutines.jvm.internal.h;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.AbstractC1457h;
import kotlin.jvm.internal.n;
import org.json.JSONArray;
import p079h8.A;
import p079h8.AbstractC1388c;
import p079h8.o;
import p079h8.q;
import p079h8.r;
import p079h8.u;
import p087i6.g;
import p219v8.p;

/* JADX INFO: loaded from: classes2.dex */
public final class c implements AutoCloseable {

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public static final a f255D = new a(null);

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private static final Uri f256E = Uri.parse("content://com.nothing.blurwallpaper.AtmosphereProvider");

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private File f257A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private boolean f258B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private boolean f259C;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final Context f260q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final p167q6.b f261r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final L f262s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final Context f263t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final Map f264u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final int f265v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private p107k6.a f266w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private final LruCache f267x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private String f268y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private File f269z;

    public static final class a {
        public /* synthetic */ a(AbstractC1457h abstractC1457h) {
            this();
        }

        private a() {
        }
    }

    public static final class b extends LruCache {
        b(int i10) {
            super(i10);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.util.LruCache
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void entryRemoved(boolean z9, p117l6.a aVar, File file, File file2) {
            if (!z9 || file == null) {
                c.this.f261r.a("entryRemoved: file=" + (aVar != null ? aVar.b() : null) + ", evicted=" + z9);
                return;
            }
            c.this.f261r.a("entryRemoved: delete file=" + (aVar != null ? aVar.b() : null) + ".");
            file.delete();
        }
    }

    /* JADX INFO: renamed from: A6.c$c, reason: collision with other inner class name */
    static final class C0012c extends l implements p {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f271q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ Bundle f272r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        final /* synthetic */ c f273s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ StringBuilder f274t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        final /* synthetic */ long f275u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        final /* synthetic */ File f276v;

        /* JADX INFO: renamed from: A6.c$c$a */
        static final class a extends l implements p {

            /* JADX INFO: renamed from: A, reason: collision with root package name */
            final /* synthetic */ File f277A;

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            Object f278q;

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            Object f279r;

            /* JADX INFO: renamed from: s, reason: collision with root package name */
            Object f280s;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            Object f281t;

            /* JADX INFO: renamed from: u, reason: collision with root package name */
            long f282u;

            /* JADX INFO: renamed from: v, reason: collision with root package name */
            int f283v;

            /* JADX INFO: renamed from: w, reason: collision with root package name */
            final /* synthetic */ Bundle f284w;

            /* JADX INFO: renamed from: x, reason: collision with root package name */
            final /* synthetic */ c f285x;

            /* JADX INFO: renamed from: y, reason: collision with root package name */
            final /* synthetic */ StringBuilder f286y;

            /* JADX INFO: renamed from: z, reason: collision with root package name */
            final /* synthetic */ long f287z;

            /* JADX INFO: renamed from: A6.c$c$a$a, reason: collision with other inner class name */
            public static final class BinderC0013a extends g.a {

                /* JADX INFO: renamed from: q, reason: collision with root package name */
                final /* synthetic */ c f288q;

                /* JADX INFO: renamed from: r, reason: collision with root package name */
                final /* synthetic */ File f289r;

                /* JADX INFO: renamed from: s, reason: collision with root package name */
                final /* synthetic */ InterfaceC0822l f290s;

                BinderC0013a(c cVar, File file, InterfaceC0822l interfaceC0822l) {
                    this.f288q = cVar;
                    this.f289r = file;
                    this.f290s = interfaceC0822l;
                }

                @Override // p087i6.g
                public void P(boolean z9) {
                    Object objA;
                    this.f288q.f257A = this.f289r;
                    if (!this.f290s.a()) {
                        this.f288q.f261r.a("blur done but cancel.");
                        return;
                    }
                    this.f288q.f261r.a("blur done.");
                    InterfaceC0822l interfaceC0822l = this.f290s;
                    if (z9) {
                        q.a aVar = q.f21862r;
                        objA = Boolean.TRUE;
                    } else {
                        q.a aVar2 = q.f21862r;
                        objA = r.a(new Exception("blur done failed."));
                    }
                    interfaceC0822l.resumeWith(q.b(objA));
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(Bundle bundle, c cVar, StringBuilder sb, long j9, File file, p129m8.e eVar) {
                super(2, eVar);
                this.f284w = bundle;
                this.f285x = cVar;
                this.f286y = sb;
                this.f287z = j9;
                this.f277A = file;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final p129m8.e create(Object obj, p129m8.e eVar) {
                return new a(this.f284w, this.f285x, this.f286y, this.f287z, this.f277A, eVar);
            }

            @Override // p219v8.p
            public final Object invoke(L l9, p129m8.e eVar) {
                return ((a) create(l9, eVar)).invokeSuspend(A.f21846a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object objC;
                Object objE = p139n8.b.e();
                int i10 = this.f283v;
                if (i10 != 0) {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    r.b(obj);
                    return obj;
                }
                r.b(obj);
                Bundle bundle = this.f284w;
                c cVar = this.f285x;
                StringBuilder sb = this.f286y;
                long j9 = this.f287z;
                File file = this.f277A;
                this.f278q = bundle;
                this.f279r = cVar;
                this.f280s = sb;
                this.f281t = file;
                this.f282u = j9;
                this.f283v = 1;
                C0826n c0826n = new C0826n(p139n8.b.c(this), 1);
                c0826n.G();
                bundle.putBinder("blur_messenger", new BinderC0013a(cVar, file, c0826n));
                try {
                    objC = kotlin.coroutines.jvm.internal.b.c(cVar.f260q.getContentResolver().update(c.f256E, new ContentValues(), bundle));
                } catch (IllegalArgumentException e10) {
                    cVar.f261r.e("update exception:" + e10.getMessage());
                    objC = A.f21846a;
                }
                sb.append("result " + objC + ", consume " + (System.currentTimeMillis() - j9));
                p167q6.b bVar = cVar.f261r;
                String string = sb.toString();
                n.g(string, "toString(...)");
                bVar.d(string);
                Object objA = c0826n.A();
                if (objA == p139n8.b.e()) {
                    h.c(this);
                }
                return objA == objE ? objE : objA;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0012c(Bundle bundle, c cVar, StringBuilder sb, long j9, File file, p129m8.e eVar) {
            super(2, eVar);
            this.f272r = bundle;
            this.f273s = cVar;
            this.f274t = sb;
            this.f275u = j9;
            this.f276v = file;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final p129m8.e create(Object obj, p129m8.e eVar) {
            return new C0012c(this.f272r, this.f273s, this.f274t, this.f275u, this.f276v, eVar);
        }

        @Override // p219v8.p
        public final Object invoke(L l9, p129m8.e eVar) {
            return ((C0012c) create(l9, eVar)).invokeSuspend(A.f21846a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            boolean zBooleanValue;
            Object objE = p139n8.b.e();
            int i10 = this.f271q;
            if (i10 == 0) {
                r.b(obj);
                a aVar = new a(this.f272r, this.f273s, this.f274t, this.f275u, this.f276v, null);
                this.f271q = 1;
                obj = Y0.c(5000L, aVar, this);
                if (obj == objE) {
                    return objE;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                r.b(obj);
            }
            Boolean bool = (Boolean) obj;
            if (bool != null) {
                zBooleanValue = bool.booleanValue();
            } else {
                StringBuilder sb = this.f274t;
                c cVar = this.f273s;
                sb.append("timeout from blur done.");
                p167q6.b bVar = cVar.f261r;
                String string = sb.toString();
                n.g(string, "toString(...)");
                bVar.e(string);
                zBooleanValue = false;
            }
            return kotlin.coroutines.jvm.internal.b.a(zBooleanValue);
        }
    }

    static final class d extends l implements p {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f291q;

        d(p129m8.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final p129m8.e create(Object obj, p129m8.e eVar) {
            return c.this.new d(eVar);
        }

        @Override // p219v8.p
        public final Object invoke(L l9, p129m8.e eVar) {
            return ((d) create(l9, eVar)).invokeSuspend(A.f21846a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            p139n8.b.e();
            if (this.f291q != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            r.b(obj);
            try {
                ContentResolver contentResolver = c.this.f260q.getContentResolver();
                Uri uri = c.f256E;
                ContentValues contentValues = new ContentValues();
                String str = c.this.f268y;
                if (str == null) {
                    n.r("groupField");
                    str = null;
                }
                contentValues.put("clean_preview", str);
                A a10 = A.f21846a;
                contentResolver.update(uri, contentValues, null);
            } catch (IllegalArgumentException e10) {
                c.this.f261r.e("update exception:" + e10.getMessage());
            }
            return A.f21846a;
        }
    }

    static final class e extends l implements p {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f293q;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        final /* synthetic */ String f295s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ u f296t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        final /* synthetic */ long f297u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(String str, u uVar, long j9, p129m8.e eVar) {
            super(2, eVar);
            this.f295s = str;
            this.f296t = uVar;
            this.f297u = j9;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final p129m8.e create(Object obj, p129m8.e eVar) {
            return c.this.new e(this.f295s, this.f296t, this.f297u, eVar);
        }

        @Override // p219v8.p
        public final Object invoke(L l9, p129m8.e eVar) {
            return ((e) create(l9, eVar)).invokeSuspend(A.f21846a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            p139n8.b.e();
            if (this.f293q != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            r.b(obj);
            c.this.f261r.a("start save bitmap " + this.f295s + ".");
            c.this.B0((i) this.f296t.f(), (File) this.f296t.e());
            c.this.f261r.a("end save bitmap " + this.f295s + ", consume " + (System.currentTimeMillis() - this.f297u) + ".");
            c cVar = c.this;
            String str = this.f295s;
            synchronized (cVar) {
                cVar.f264u.remove(str);
                cVar.f261r.a("save bitmap " + str + " job finished, notifyAll.");
                cVar.notifyAll();
            }
            return A.f21846a;
        }
    }

    public c(Context context) {
        n.h(context, "context");
        this.f260q = context;
        this.f261r = new p167q6.b("BlurImageUtil");
        this.f262s = M.a(T0.b(null, 1, null).z(C0803b0.b()));
        Context contextCreateDeviceProtectedStorageContext = context.createDeviceProtectedStorageContext();
        n.g(contextCreateDeviceProtectedStorageContext, "createDeviceProtectedStorageContext(...)");
        this.f263t = contextCreateDeviceProtectedStorageContext;
        this.f264u = new LinkedHashMap();
        this.f265v = 6;
        this.f267x = new b(6);
    }

    private final void A0() {
        if (this.f268y == null || !this.f258B) {
            return;
        }
        this.f261r.a("notifyCleanPreview");
        this.f258B = false;
        AbstractC0816i.d(C0834r0.f1894q, null, null, new d(null), 3, null);
    }

    private final void B() {
        if (this.f259C) {
            throw new IllegalArgumentException("BlurHelper is closed!");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void B0(i iVar, File file) throws Throwable {
        Throwable th;
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(file), 8192);
        try {
            p107k6.a aVar = this.f266w;
            p107k6.a aVar2 = null;
            th = null;
            if (aVar == null) {
                n.r("bitmapPool");
                aVar = null;
            }
            o oVarA = G6.b.a(iVar, aVar);
            Bitmap bitmap = (Bitmap) oVarA.a();
            boolean zBooleanValue = ((Boolean) oVarA.b()).booleanValue();
            try {
                bitmap.compress(Bitmap.CompressFormat.PNG, 100, bufferedOutputStream);
                if (zBooleanValue) {
                    p107k6.a aVar3 = this.f266w;
                    if (aVar3 == null) {
                        n.r("bitmapPool");
                        aVar3 = null;
                    }
                    aVar3.m(bitmap);
                }
                try {
                    bufferedOutputStream.close();
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (Throwable th3) {
                if (zBooleanValue) {
                    p107k6.a aVar4 = this.f266w;
                    if (aVar4 == null) {
                        n.r("bitmapPool");
                    } else {
                        aVar2 = aVar4;
                    }
                    aVar2.m(bitmap);
                }
                throw th3;
            }
        } catch (Throwable th4) {
            try {
                bufferedOutputStream.close();
            } catch (Throwable th5) {
                AbstractC1388c.a(th4, th5);
            }
            th = th4;
        }
        if (th != null) {
            throw th;
        }
    }

    private final void K(File file, long j9) {
        File fileY = Y();
        if (fileY.exists()) {
            File[] fileArrListFiles = fileY.listFiles();
            int i10 = 0;
            int length = fileArrListFiles != null ? fileArrListFiles.length : 0;
            if (fileArrListFiles != null) {
                int i11 = 0;
                for (File file2 : fileArrListFiles) {
                    try {
                        BasicFileAttributes attributes = Files.readAttributes(file2.toPath(), (Class<BasicFileAttributes>) BasicFileAttributes.class, new LinkOption[0]);
                        n.g(attributes, "readAttributes(...)");
                        long j10 = attributes.creationTime().to(TimeUnit.MILLISECONDS);
                        if (!n.d(file2, file) && j10 < j9) {
                            i11++;
                            file2.delete();
                            this.f261r.c("file " + file2.getName() + " create time < " + j9 + ", delete.");
                        }
                    } catch (IOException unused) {
                        this.f261r.e("get file " + file2.getName() + " create time failed.");
                    }
                }
                i10 = i11;
            }
            this.f261r.d("deleteFiles: total count " + length + ", delete files " + i10 + ", keep " + file);
        }
    }

    private final File Q(p117l6.a aVar) {
        File fileY = Y();
        if (!fileY.exists()) {
            fileY.mkdirs();
        }
        return new File(fileY, aVar.b());
    }

    private final String U(File file) {
        String path = file.getPath();
        n.g(path, "getPath(...)");
        return path;
    }

    private final File Y() {
        return new File(G6.c.g(this.f263t), "blur");
    }

    private final p117l6.a q0(String str, String str2) {
        if (str == null) {
            str = "ORIGIN";
        }
        String str3 = this.f268y;
        if (str3 == null) {
            n.r("groupField");
            str3 = null;
        }
        return new p117l6.a(str, str2, str3);
    }

    public final void G(boolean z9, long j9) {
        if (this.f268y == null) {
            if (z9) {
                return;
            }
            this.f261r.d("tryClean delete all.");
            K(null, j9);
            return;
        }
        File file = z9 ? this.f269z : null;
        this.f261r.d("tryClean, keep " + file + ".");
        K(file, j9);
    }

    public final void I() {
        File file;
        if (this.f268y == null || (file = this.f269z) == null) {
            return;
        }
        file.delete();
    }

    public final synchronized Map I0(Map originBitmaps, boolean z9) {
        LinkedHashMap linkedHashMap;
        try {
            n.h(originBitmaps, "originBitmaps");
            B();
            if (this.f266w == null) {
                Iterator it = originBitmaps.values().iterator();
                if (!it.hasNext()) {
                    throw new NoSuchElementException();
                }
                i iVar = (i) it.next();
                int iMax = Math.max(iVar.b().getHeight(), iVar.b().getWidth());
                while (it.hasNext()) {
                    i iVar2 = (i) it.next();
                    int iMax2 = Math.max(iVar2.b().getHeight(), iVar2.b().getWidth());
                    if (iMax < iMax2) {
                        iMax = iMax2;
                    }
                }
                this.f266w = new p107k6.a(new Size(iMax, iMax), 3, "BlurImageUtil");
            }
            long jCurrentTimeMillis = System.currentTimeMillis();
            linkedHashMap = new LinkedHashMap();
            ArrayList<u> arrayList = new ArrayList(originBitmaps.size());
            long j9 = jCurrentTimeMillis;
            for (Map.Entry entry : originBitmaps.entrySet()) {
                p117l6.a aVarQ0 = q0(((C6.e) entry.getKey()).a(), String.valueOf(j9));
                arrayList.add(new u(aVarQ0, Q(aVarQ0), entry.getValue()));
                j9 = 1 + j9;
            }
            for (u uVar : arrayList) {
                linkedHashMap.put(((p117l6.a) uVar.d()).a(), U((File) uVar.e()));
                this.f267x.put(uVar.d(), uVar.e());
                if (z9) {
                    String path = ((File) uVar.e()).getPath();
                    this.f264u.put(path, AbstractC0816i.b(this.f262s, C0803b0.b(), null, new e(path, uVar, jCurrentTimeMillis, null), 2, null));
                }
            }
            this.f261r.a("savePreview for " + originBitmaps + " consume " + (System.currentTimeMillis() - jCurrentTimeMillis));
        } catch (Throwable th) {
            throw th;
        }
        return linkedHashMap;
    }

    public final void O0(String group) {
        n.h(group, "group");
        B();
        this.f268y = group;
    }

    public final void P0(String path) {
        n.h(path, "path");
        File file = new File(path);
        if (!file.exists()) {
            this.f261r.e("setGroupByPath for " + path + ",but the file didn't exists.");
            return;
        }
        p117l6.a.C0583a c0583a = p117l6.a.f22963e;
        String name = file.getName();
        n.g(name, "getName(...)");
        this.f268y = c0583a.a(name).c();
        this.f269z = file;
        this.f261r.d("setGroupByPath for " + path + " success.");
    }

    public final String b0() {
        String str = this.f268y;
        if (str == null) {
            return null;
        }
        if (str != null) {
            return str;
        }
        n.r("groupField");
        return null;
    }

    @Override // java.lang.AutoCloseable
    public synchronized void close() {
        File file;
        try {
            p107k6.a aVar = null;
            M.d(this.f262s, null, 1, null);
            this.f267x.evictAll();
            if (this.f257A != null && (file = this.f269z) != null) {
                file.delete();
            }
            A0();
            p107k6.a aVar2 = this.f266w;
            if (aVar2 != null) {
                if (aVar2 == null) {
                    n.r("bitmapPool");
                } else {
                    aVar = aVar2;
                }
                aVar.d();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized boolean t0(String key, WallpaperColors colors) throws Throwable {
        Throwable th;
        try {
            try {
                n.h(key, "key");
                n.h(colors, "colors");
                B();
                long jCurrentTimeMillis = System.currentTimeMillis();
                StringBuilder sb = new StringBuilder("notifyBlurDone: " + key + ".");
                p117l6.a.C0583a c0583a = p117l6.a.f22963e;
                String name = new File(key).getName();
                n.g(name, "getName(...)");
                p117l6.a aVarA = c0583a.a(name);
                while (this.f264u.containsKey(key)) {
                    try {
                        this.f261r.d("notifyBlurDone: wait for " + key + " job finished.");
                        wait();
                    } catch (Throwable th2) {
                        th = th2;
                    }
                }
                File file = (File) this.f267x.remove(aVarA);
                if (file == null) {
                    this.f261r.e("notifyBlurDone: didn't find file in cache.");
                    return false;
                }
                this.f261r.d("notifyBlurDone usedFile:" + file);
                Bundle bundle = new Bundle();
                sb.append("send type IN_USE.");
                bundle.putString("final_uri", key);
                bundle.putParcelable("final_colors", colors);
                return ((Boolean) AbstractC0814h.b(null, new C0012c(bundle, this, sb, jCurrentTimeMillis, file, null), 1, null)).booleanValue();
            } catch (Throwable th3) {
                th = th3;
                th = th;
            }
        } catch (Throwable th4) {
            th = th4;
            th = th;
        }
        throw th;
    }

    public final synchronized Map w0(Map effectBitmaps, Map previewBitmaps) {
        Map mapI0;
        Object objValueOf;
        try {
            n.h(effectBitmaps, "effectBitmaps");
            n.h(previewBitmaps, "previewBitmaps");
            B();
            this.f257A = null;
            long jCurrentTimeMillis = System.currentTimeMillis();
            StringBuilder sb = new StringBuilder("notifyBlur preview effects=" + previewBitmaps.keySet() + ".");
            mapI0 = I0(effectBitmaps, true);
            Bundle bundle = new Bundle();
            sb.append("send type PREVIEW, ");
            JSONArray jSONArray = new JSONArray();
            for (Map.Entry entry : previewBitmaps.entrySet()) {
                String str = (String) mapI0.get(((C6.e) entry.getKey()).a());
                jSONArray.put(str);
                bundle.putBinder(str, new p097j6.c((Bitmap) entry.getValue()));
            }
            bundle.putString("preview_uris", jSONArray.toString());
            try {
                objValueOf = Integer.valueOf(this.f260q.getContentResolver().update(f256E, new ContentValues(), bundle));
            } catch (IllegalArgumentException e10) {
                this.f261r.e("update exception:" + e10.getMessage());
                objValueOf = A.f21846a;
            }
            sb.append("result " + objValueOf + ", consume " + (System.currentTimeMillis() - jCurrentTimeMillis));
            p167q6.b bVar = this.f261r;
            String string = sb.toString();
            n.g(string, "toString(...)");
            bVar.a(string);
            this.f258B = true;
        } catch (Throwable th) {
            throw th;
        }
        return mapI0;
    }
}
