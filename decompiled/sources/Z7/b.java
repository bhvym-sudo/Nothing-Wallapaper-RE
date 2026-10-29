package Z7;

import android.content.Context;
import android.os.Vibrator;
import java.io.File;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import p039d8.d;
import p049e8.f;

/* JADX INFO: loaded from: classes2.dex */
public class b extends p039d8.a {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static b f9502j;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Context f9503c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Vibrator f9504d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Z7.a f9506f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private f f9507g;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f9505e = -1;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f9508h = -1;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private ExecutorService f9509i = Executors.newSingleThreadExecutor();

    class a implements Runnable {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        final /* synthetic */ String f9510q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ int f9511r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        final /* synthetic */ int f9512s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ int f9513t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        final /* synthetic */ int f9514u;

        a(String str, int i10, int i11, int i12, int i13, p059f8.a aVar) {
            this.f9510q = str;
            this.f9511r = i10;
            this.f9512s = i11;
            this.f9513t = i12;
            this.f9514u = i13;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                if (32 <= b.this.f9508h && 2 == b.this.f9505e) {
                    b.this.f9507g.a(this.f9510q, this.f9511r, this.f9512s, this.f9513t, this.f9514u, null);
                    return;
                }
                b.this.f9506f.b();
                b.this.f9506f.d(this.f9510q, this.f9513t, this.f9514u, this.f9511r, this.f9512s, null);
                b.this.f9506f.c();
                b.this.f9506f.start();
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    private b() {
    }

    public static b e() {
        if (f9502j == null) {
            synchronized (b.class) {
                try {
                    if (f9502j == null) {
                        f9502j = new b();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f9502j;
    }

    public int f() {
        return Z7.a.h(this.f9503c);
    }

    public b g(Context context) {
        if (context == null) {
            throw new IllegalArgumentException("context shouldn't be null");
        }
        try {
            Z7.a aVar = this.f9506f;
            if (aVar != null) {
                aVar.a();
                this.f9506f = null;
            }
            f fVar = this.f9507g;
            if (fVar != null) {
                fVar.b();
            }
            Context applicationContext = context.getApplicationContext();
            this.f9503c = applicationContext;
            if (applicationContext == null) {
                d.a.d("RichTapUtils", "fail to get application context!");
                this.f9503c = context;
            }
            this.f9504d = (Vibrator) this.f9503c.getSystemService("vibrator");
            this.f9508h = f();
            int i10 = 2;
            if (!Z7.a.i(2)) {
                i10 = 1;
                if (Z7.a.i(1)) {
                    this.f9506f = Z7.a.g(this.f9503c, 1);
                } else {
                    this.f9506f = Z7.a.g(this.f9503c, 0);
                    this.f9505e = 0;
                }
                d.a.c("RichTapUtils", "init , sdk version:" + p039d8.a.f19742b + " versionCode:" + p039d8.a.f19741a + ", RichTap Core Major Version:" + this.f9508h);
                return f9502j;
            }
            int i11 = this.f9508h;
            if (32 <= i11) {
                this.f9507g = new f(this.f9503c, i11);
            } else {
                this.f9506f = Z7.a.g(this.f9503c, 2);
            }
            this.f9505e = i10;
        } catch (Throwable th) {
            th.printStackTrace();
        }
        d.a.c("RichTapUtils", "init , sdk version:" + p039d8.a.f19742b + " versionCode:" + p039d8.a.f19741a + ", RichTap Core Major Version:" + this.f9508h);
        return f9502j;
    }

    public boolean h() {
        return Z7.a.i(2) || Z7.a.i(1);
    }

    public void i(File file, int i10) {
        j(file, i10, 0, 255, 0);
    }

    public void j(File file, int i10, int i11, int i12, int i13) {
        k(d.a(file), i10, i11, i12, i13);
    }

    public void k(String str, int i10, int i11, int i12, int i13) {
        l(str, i10, i11, i12, i13, null);
    }

    public void l(String str, int i10, int i11, int i12, int i13, p059f8.a aVar) {
        if (str == null || str.isEmpty()) {
            throw new IllegalArgumentException("Wrong parameter {string: " + str + "} is null!");
        }
        StringBuilder sb = new StringBuilder();
        sb.append("playHaptic: loop:");
        sb.append(i10);
        sb.append(",interval:");
        sb.append(i11);
        sb.append(",amplitude:");
        sb.append(i12);
        sb.append(",freq:");
        sb.append(i13);
        sb.append(",callback is null:");
        sb.append(aVar == null);
        d.a.a("RichTapUtils", sb.toString());
        this.f9509i.execute(new a(str, i10, i11, i12, i13, aVar));
    }

    public void m(File file, int i10) {
        i(file, i10 - 1);
    }
}
