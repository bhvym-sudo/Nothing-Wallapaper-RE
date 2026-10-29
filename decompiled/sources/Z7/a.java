package Z7;

import android.content.Context;
import android.os.Vibrator;
import p039d8.d;
import p049e8.c;
import p049e8.e;
import p049e8.g;

/* JADX INFO: loaded from: classes2.dex */
public class a implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f9498a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Vibrator f9499b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private c f9500c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private g f9501d;

    private a(Context context, int i10) {
        this.f9498a = context.getApplicationContext();
        this.f9499b = (Vibrator) context.getSystemService("vibrator");
        g gVar = new g(this.f9498a);
        this.f9501d = gVar;
        if (i10 == 0) {
            this.f9500c = new a(new e(this.f9499b));
        } else if (i10 != 2) {
            d.a.d("RichTapPlayer", "unknown player type:" + i10);
        } else {
            this.f9500c = new a(gVar);
        }
        d.f19746b = this.f9498a;
    }

    public static a g(Context context, int i10) {
        if (context == null) {
            d.a.b("RichTapPlayer", "context == null");
            return null;
        }
        if (i(i10)) {
            return new a(context, i10);
        }
        d.a.b("RichTapPlayer", "specified player type not available!");
        return null;
    }

    public static int h(Context context) {
        try {
            if (context != null) {
                return new g(context).d();
            }
            d.a.b("RichTapPlayer", "getRichTapCoreMajorVersion, null == context");
            return -1;
        } catch (Throwable th) {
            th.printStackTrace();
            return -1;
        }
    }

    public static boolean i(int i10) {
        if (i10 == 0) {
            return true;
        }
        if (i10 != 2) {
            return false;
        }
        try {
            return g.f();
        } catch (Throwable th) {
            th.printStackTrace();
            return false;
        }
    }

    @Override // p049e8.c
    public void a() {
        c cVar = this.f9500c;
        if (cVar != null) {
            cVar.a();
        }
        this.f9500c = null;
    }

    @Override // p049e8.c
    public void b() {
        c cVar = this.f9500c;
        if (cVar == null) {
            d.a.b("RichTapPlayer", "null == mPlayer!");
        } else {
            cVar.b();
        }
    }

    @Override // p049e8.c
    public void c() {
        c cVar = this.f9500c;
        if (cVar == null) {
            d.a.b("RichTapPlayer", "null == mPlayer!");
        } else {
            cVar.c();
        }
    }

    @Override // p049e8.c
    public void d(String str, int i10, int i11, int i12, int i13, p059f8.a aVar) {
        c cVar = this.f9500c;
        if (cVar == null) {
            d.a.b("RichTapPlayer", "null == mPlayer!");
        } else {
            cVar.d(str, i10, i11, i12, i13, aVar);
        }
    }

    @Override // p049e8.c
    public boolean e() {
        c cVar = this.f9500c;
        if (cVar != null) {
            return cVar.e();
        }
        d.a.b("RichTapPlayer", "null == mPlayer!");
        return false;
    }

    @Override // p049e8.c
    public void start() {
        c cVar = this.f9500c;
        if (cVar == null) {
            d.a.b("RichTapPlayer", "null == mPlayer!");
        } else {
            cVar.start();
        }
    }

    @Override // p049e8.c
    public void stop() {
        c cVar = this.f9500c;
        if (cVar == null) {
            d.a.b("RichTapPlayer", "null == mPlayer!");
        } else {
            cVar.stop();
        }
    }

    private a(p049e8.b bVar) {
        this.f9500c = c.f(bVar);
    }
}
