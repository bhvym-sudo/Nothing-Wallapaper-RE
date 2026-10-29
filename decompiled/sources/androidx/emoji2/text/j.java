package androidx.emoji2.text;

import android.content.Context;
import android.content.pm.PackageManager;
import android.database.ContentObserver;
import android.graphics.Typeface;
import android.os.Handler;
import java.nio.ByteBuffer;
import java.util.concurrent.Executor;
import java.util.concurrent.ThreadPoolExecutor;

/* JADX INFO: loaded from: classes.dex */
public class j extends e.c {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final a f12817k = new a();

    public static class a {
        public Typeface a(Context context, y0.g.b bVar) {
            return p241y0.g.a(context, null, new y0.g.b[]{bVar});
        }

        public y0.g.a b(Context context, p241y0.e eVar) {
            return p241y0.g.b(context, null, eVar);
        }

        public void c(Context context, ContentObserver contentObserver) {
            context.getContentResolver().unregisterContentObserver(contentObserver);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static class b implements e.h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Context f12818a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final p241y0.e f12819b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final a f12820c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final Object f12821d = new Object();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private Handler f12822e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private Executor f12823f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private ThreadPoolExecutor f12824g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        e.i f12825h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private ContentObserver f12826i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private Runnable f12827j;

        b(Context context, p241y0.e eVar, a aVar) {
            B0.i.f(context, "Context cannot be null");
            B0.i.f(eVar, "FontRequest cannot be null");
            this.f12818a = context.getApplicationContext();
            this.f12819b = eVar;
            this.f12820c = aVar;
        }

        private void b() {
            synchronized (this.f12821d) {
                try {
                    this.f12825h = null;
                    ContentObserver contentObserver = this.f12826i;
                    if (contentObserver != null) {
                        this.f12820c.c(this.f12818a, contentObserver);
                        this.f12826i = null;
                    }
                    Handler handler = this.f12822e;
                    if (handler != null) {
                        handler.removeCallbacks(this.f12827j);
                    }
                    this.f12822e = null;
                    ThreadPoolExecutor threadPoolExecutor = this.f12824g;
                    if (threadPoolExecutor != null) {
                        threadPoolExecutor.shutdown();
                    }
                    this.f12823f = null;
                    this.f12824g = null;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        private y0.g.b e() {
            try {
                y0.g.a aVarB = this.f12820c.b(this.f12818a, this.f12819b);
                if (aVarB.e() == 0) {
                    y0.g.b[] bVarArrC = aVarB.c();
                    if (bVarArrC == null || bVarArrC.length == 0) {
                        throw new RuntimeException("fetchFonts failed (empty result)");
                    }
                    return bVarArrC[0];
                }
                throw new RuntimeException("fetchFonts failed (" + aVarB.e() + ")");
            } catch (PackageManager.NameNotFoundException e10) {
                throw new RuntimeException("provider not found", e10);
            }
        }

        @Override // androidx.emoji2.text.e.h
        public void a(e.i iVar) {
            B0.i.f(iVar, "LoaderCallback cannot be null");
            synchronized (this.f12821d) {
                this.f12825h = iVar;
            }
            d();
        }

        void c() {
            synchronized (this.f12821d) {
                try {
                    if (this.f12825h == null) {
                        return;
                    }
                    try {
                        y0.g.b bVarE = e();
                        int iB = bVarE.b();
                        if (iB == 2) {
                            synchronized (this.f12821d) {
                            }
                        }
                        if (iB != 0) {
                            throw new RuntimeException("fetchFonts result is not OK. (" + iB + ")");
                        }
                        try {
                            p231x0.k.a("EmojiCompat.FontRequestEmojiCompatConfig.buildTypeface");
                            Typeface typefaceA = this.f12820c.a(this.f12818a, bVarE);
                            ByteBuffer byteBufferA = p191t0.h.a(this.f12818a, null, bVarE.d());
                            if (byteBufferA == null || typefaceA == null) {
                                throw new RuntimeException("Unable to open file.");
                            }
                            m mVarB = m.b(typefaceA, byteBufferA);
                            p231x0.k.b();
                            synchronized (this.f12821d) {
                                try {
                                    e.i iVar = this.f12825h;
                                    if (iVar != null) {
                                        iVar.b(mVarB);
                                    }
                                } catch (Throwable th) {
                                    throw th;
                                }
                            }
                            b();
                        } catch (Throwable th2) {
                            p231x0.k.b();
                            throw th2;
                        }
                    } catch (Throwable th3) {
                        synchronized (this.f12821d) {
                            try {
                                e.i iVar2 = this.f12825h;
                                if (iVar2 != null) {
                                    iVar2.a(th3);
                                }
                                b();
                            } catch (Throwable th4) {
                                throw th4;
                            }
                        }
                    }
                } catch (Throwable th5) {
                    throw th5;
                }
            }
        }

        void d() {
            synchronized (this.f12821d) {
                try {
                    if (this.f12825h == null) {
                        return;
                    }
                    if (this.f12823f == null) {
                        ThreadPoolExecutor threadPoolExecutorB = androidx.emoji2.text.b.b("emojiCompat");
                        this.f12824g = threadPoolExecutorB;
                        this.f12823f = threadPoolExecutorB;
                    }
                    this.f12823f.execute(new Runnable() { // from class: androidx.emoji2.text.k
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f12828q.c();
                        }
                    });
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        public void f(Executor executor) {
            synchronized (this.f12821d) {
                this.f12823f = executor;
            }
        }
    }

    public j(Context context, p241y0.e eVar) {
        super(new b(context, eVar, f12817k));
    }

    public j c(Executor executor) {
        ((b) a()).f(executor);
        return this;
    }
}
