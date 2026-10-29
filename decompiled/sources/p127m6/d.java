package p127m6;

import android.graphics.Bitmap;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedHashSet;
import java.util.function.Predicate;
import kotlin.jvm.internal.AbstractC1457h;
import kotlin.jvm.internal.n;
import p087i6.r;
import p089i8.AbstractC1444s;
import p219v8.l;

/* JADX INFO: loaded from: classes2.dex */
public final class d implements p127m6.a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final b f23235e = new b(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f23236a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f23237b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f23238c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final LinkedHashSet f23239d;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f23240a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final long f23241b;

        public a(String name, long j9) {
            n.h(name, "name");
            this.f23240a = name;
            this.f23241b = j9;
        }

        public final long a() {
            return this.f23241b;
        }

        public final String b() {
            return this.f23240a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return n.d(this.f23240a, aVar.f23240a) && this.f23241b == aVar.f23241b;
        }

        public int hashCode() {
            return (this.f23240a.hashCode() * 31) + Long.hashCode(this.f23241b);
        }

        public String toString() {
            return "CacheFile(name=" + this.f23240a + ", lastModified=" + this.f23241b + ")";
        }
    }

    public static final class b {
        public /* synthetic */ b(AbstractC1457h abstractC1457h) {
            this();
        }

        public final d a(String cacheDirectory, int i10) {
            n.h(cacheDirectory, "cacheDirectory");
            if (i10 <= 0) {
                throw new IllegalArgumentException("maxFileCount <= 0");
            }
            if (cacheDirectory.length() == 0) {
                throw new IllegalArgumentException("cacheDirectory is null");
            }
            File file = new File(cacheDirectory);
            if (!file.exists()) {
                file.mkdirs();
            }
            return new d(cacheDirectory, i10, null);
        }

        private b() {
        }
    }

    public static final class c implements Comparator {
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return p109k8.a.d(Long.valueOf(((a) obj).a()), Long.valueOf(((a) obj2).a()));
        }
    }

    public /* synthetic */ d(String str, int i10, AbstractC1457h abstractC1457h) {
        this(str, i10);
    }

    private final void g(Closeable closeable) {
        try {
            closeable.close();
        } catch (Exception e10) {
            com.nothing.wallpaper.common.log.c.f(this.f23238c, "closeQuietly exception:" + e10.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean h(String str, a aVar) {
        return n.d(aVar.b(), str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean i(l lVar, Object obj) {
        return ((Boolean) lVar.f(obj)).booleanValue();
    }

    private final String j(String str) {
        String strB = r.b(str);
        return strB == null ? str : strB;
    }

    private final void k() {
        File file = new File(this.f23236a);
        if (file.exists()) {
            ArrayList arrayList = new ArrayList();
            File[] fileArrListFiles = file.listFiles();
            if (fileArrListFiles != null) {
                for (File file2 : fileArrListFiles) {
                    String name = file2.getName();
                    n.g(name, "getName(...)");
                    arrayList.add(new a(name, file2.lastModified()));
                }
            }
            this.f23239d.addAll(AbstractC1444s.m0(arrayList, new c()));
        }
    }

    @Override // p127m6.a
    public synchronized void a(int i10) {
        while (this.f23239d.size() > i10) {
            try {
                a aVar = (a) AbstractC1444s.R(this.f23239d);
                File file = new File(this.f23236a, aVar.b());
                if (file.exists()) {
                    file.delete();
                    com.nothing.wallpaper.common.log.c.d(this.f23238c, "deleteBeyond file:" + aVar.b());
                }
                this.f23239d.remove(aVar);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p127m6.a
    public int b() {
        return this.f23239d.size();
    }

    @Override // p127m6.a
    public synchronized void c(String key) {
        n.h(key, "key");
        final String strJ = j(key);
        File file = new File(this.f23236a, strJ);
        if (file.exists() && file.delete()) {
            LinkedHashSet linkedHashSet = this.f23239d;
            final l lVar = new l() { // from class: m6.b
                @Override // p219v8.l
                public final Object f(Object obj) {
                    return Boolean.valueOf(d.h(strJ, (d.a) obj));
                }
            };
            linkedHashSet.removeIf(new Predicate() { // from class: m6.c
                @Override // java.util.function.Predicate
                public final boolean test(Object obj) {
                    return d.i(lVar, obj);
                }
            });
            com.nothing.wallpaper.common.log.c.d(this.f23238c, "delete file:" + file.getName());
        }
    }

    @Override // p127m6.a
    public synchronized boolean d(String key, Bitmap bitmap) {
        boolean zCompress;
        try {
            n.h(key, "key");
            n.h(bitmap, "bitmap");
            String strJ = j(key);
            File file = new File(this.f23236a, strJ);
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            try {
                zCompress = bitmap.compress(Bitmap.CompressFormat.PNG, 100, fileOutputStream);
                g(fileOutputStream);
                if (zCompress) {
                    this.f23239d.add(new a(strJ, file.lastModified()));
                } else {
                    if (file.exists()) {
                        file.delete();
                    }
                    com.nothing.wallpaper.common.log.c.f(this.f23238c, "Failed to save bitmap to disk!!");
                }
                a(this.f23237b);
            } catch (Throwable th) {
                g(fileOutputStream);
                throw th;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return zCompress;
    }

    @Override // p127m6.a
    public String get(String key) {
        n.h(key, "key");
        File file = new File(this.f23236a, j(key));
        if (file.exists()) {
            return file.getAbsolutePath();
        }
        return null;
    }

    private d(String str, int i10) {
        this.f23236a = str;
        this.f23237b = i10;
        this.f23238c = "DiskRUFileCache";
        this.f23239d = new LinkedHashSet();
        k();
    }
}
