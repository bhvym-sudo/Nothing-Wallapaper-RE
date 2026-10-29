package p064g3;

import C6.e;
import C6.g;
import android.app.Activity;
import android.app.WallpaperColors;
import android.app.WallpaperInfo;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/* JADX INFO: loaded from: classes.dex */
public abstract class x implements Parcelable {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    protected static final ExecutorService f21235v = Executors.newCachedThreadPool();

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    protected a f21236q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private PriorityQueue f21237r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private g f21238s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    protected boolean f21239t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private boolean f21240u;

    public x() {
        this.f21236q = new a();
        this.f21237r = new PriorityQueue();
        this.f21239t = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ a u(Context context) {
        synchronized (this) {
            try {
                if (this.f21236q.b() != null && this.f21236q.a().intValue() != 0) {
                    return this.f21236q;
                }
                Bitmap bitmapK = o(context).k(context);
                if (bitmapK == null) {
                    return new a(new WallpaperColors(Color.valueOf(0), null, null), 0);
                }
                a aVar = new a(WallpaperColors.fromBitmap(bitmapK));
                this.f21236q = aVar;
                return aVar;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public Future b(Context context) {
        if (this.f21236q.b() != null && this.f21236q.a().intValue() != 0) {
            return CompletableFuture.completedFuture(this.f21236q);
        }
        final Context applicationContext = context.getApplicationContext();
        return f21235v.submit(new Callable() { // from class: g3.w
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f21233a.u(applicationContext);
            }
        });
    }

    public String c(Context context) {
        return null;
    }

    public abstract com.android.wallpaper.asset.a d(Context context);

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public abstract List e(Context context);

    public int f() {
        return 1;
    }

    public abstract String g(Context context);

    public String j(Context context) {
        return null;
    }

    public g k() {
        return this.f21238s;
    }

    public String l() {
        if (this.f21237r.isEmpty()) {
            return null;
        }
        Iterator it = this.f21237r.iterator();
        String str = "";
        while (it.hasNext()) {
            if (!str.isEmpty()) {
                str = str + ",";
            }
            str = str + it.next();
        }
        return str;
    }

    public Drawable m(Context context) {
        return null;
    }

    public String n(Context context) {
        if (r() == null) {
            return null;
        }
        return g(context) + "-" + r();
    }

    public abstract com.android.wallpaper.asset.a o(Context context);

    public String p(Context context) {
        return null;
    }

    public WallpaperInfo q() {
        return null;
    }

    public String r() {
        return null;
    }

    public boolean s() {
        return this.f21240u;
    }

    public boolean t() {
        return this.f21239t;
    }

    public void v(g gVar) {
        this.f21238s = gVar;
        if (gVar == null || gVar.e() == null) {
            return;
        }
        this.f21240u = this.f21238s.e().b() instanceof e.b;
    }

    public void w(boolean z9) {
        this.f21239t = z9;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeParcelable(this.f21236q.b(), i10);
        parcel.writeInt(this.f21236q.a().intValue());
        g gVar = this.f21238s;
        parcel.writeString(gVar == null ? null : gVar.c());
        parcel.writeBoolean(this.f21239t);
        parcel.writeBoolean(this.f21240u);
    }

    public abstract void x(Activity activity, j jVar, int i10, boolean z9);

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private WallpaperColors f21241a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Integer f21242b;

        public a() {
            this.f21242b = 0;
        }

        public Integer a() {
            return this.f21242b;
        }

        public WallpaperColors b() {
            return this.f21241a;
        }

        public a(WallpaperColors wallpaperColors) {
            this.f21242b = 0;
            this.f21241a = wallpaperColors;
            if (wallpaperColors != null) {
                this.f21242b = Integer.valueOf(wallpaperColors.getPrimaryColor().toArgb());
            }
        }

        public a(WallpaperColors wallpaperColors, Integer num) {
            this.f21241a = wallpaperColors;
            this.f21242b = num;
        }
    }

    protected x(Parcel parcel) {
        this.f21236q = new a();
        this.f21237r = new PriorityQueue();
        this.f21239t = true;
        this.f21236q = new a((WallpaperColors) parcel.readParcelable(WallpaperColors.class.getClassLoader()), Integer.valueOf(parcel.readInt()));
        this.f21238s = g.f648e.a(parcel.readString());
        this.f21239t = parcel.readBoolean();
        this.f21240u = parcel.readBoolean();
    }
}
