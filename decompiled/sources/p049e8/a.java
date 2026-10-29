package p049e8;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: classes2.dex */
public class a implements p049e8.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ExecutorService f20190a = Executors.newFixedThreadPool(1);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final p049e8.d f20191b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final p049e8.b f20192c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final HandlerThread f20193d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final d f20194e;

    /* JADX INFO: renamed from: e8.a$a, reason: collision with other inner class name */
    class RunnableC0530a implements Runnable {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        String f20195q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f20196r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        int f20197s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        int f20198t;

        RunnableC0530a(String str, int i10, int i11, int i12) {
            this.f20195q = str;
            this.f20196r = i10;
            this.f20197s = i11;
            this.f20198t = i12;
        }

        @Override // java.lang.Runnable
        public void run() {
            a.this.f20192c.a(p039d8.b.f(this.f20195q, this.f20196r, this.f20197s, this.f20198t));
        }
    }

    private class b implements Handler.Callback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f20200a;

        private b() {
            this.f20200a = 0;
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            p049e8.d dVar;
            StringBuilder sb;
            d dVar2;
            Message messageObtainMessage;
            d dVar3;
            Message messageObtainMessage2;
            p049e8.d dVar4;
            int i10;
            d dVar5;
            try {
                d8.d.a.a("Customizable-Player", "msg what:" + message.what + ", arg:" + message.arg1 + ",mStatus:" + a.this.f20191b.e());
                int i11 = message.what;
                if (i11 != 1020) {
                    if (i11 != 1099) {
                        switch (i11) {
                            case 1001:
                                if (a.this.f20191b.f20214m == 0) {
                                    a.this.f20191b.f20203b = SystemClock.elapsedRealtime();
                                }
                                if (a.this.f20191b.f20219r == null || "".equals(a.this.f20191b.f20219r)) {
                                    int i12 = ((p029c8.c) a.this.f20191b.f20208g.f15244b.get(a.this.f20191b.f20214m)).f15248a - a.this.f20191b.f20218q;
                                    a.this.f20191b.f20218q = ((p029c8.c) a.this.f20191b.f20208g.f15244b.get(a.this.f20191b.f20214m)).f15248a;
                                    a.this.f20191b.f20215n = ((p029c8.c) a.this.f20191b.f20208g.f15244b.get(a.this.f20191b.f20214m)).a();
                                    a.this.f20191b.f20216o = p039d8.b.d((p029c8.c) a.this.f20191b.f20208g.f15244b.get(a.this.f20191b.f20214m), true);
                                    a.this.f20191b.getClass();
                                    d8.d.a.a("Customizable-Player", "will play pattern after waitTime :" + i12);
                                    a.this.f20194e.b(a.this.f20194e.obtainMessage(1002), i12, true);
                                } else {
                                    d8.d.a.a("Customizable-Player", "mRemainderHEString:" + a.this.f20191b.f20219r);
                                    a.this.f20191b.f20218q = a.this.f20191b.f20209h;
                                    a.this.f20191b.f20214m = a.this.f20191b.f20208g.d(a.this.f20191b.f20209h);
                                    a.this.f20191b.f20216o = p039d8.b.t(a.this.f20191b.f20202a, a.this.f20191b.f20209h);
                                    a.this.f20191b.f20215n = p039d8.b.o(a.this.f20191b.f20216o, 2);
                                    d8.d.a.a("Customizable-Player", "MSG_CHECK_NEXT_PATTERN resume paused pattern,  mCurrentPatternIndex:" + a.this.f20191b.f20214m + ",mCurrentPatternString:" + a.this.f20191b.f20216o);
                                    a.this.f20191b.f20219r = null;
                                    dVar2 = a.this.f20194e;
                                    messageObtainMessage = a.this.f20194e.obtainMessage(1002);
                                    dVar2.b(messageObtainMessage, 0, true);
                                }
                                break;
                            case 1002:
                                d8.d.a.a("Customizable-Player", "MSG_PLAY_PATTERN mFreq" + a.this.f20191b.f20206e + ",mAmplitude:" + a.this.f20191b.f20205d + "mCurrentPlayingInfo.mCurrentPatternIndex:" + a.this.f20191b.f20214m);
                                if (6 == a.this.f20191b.e()) {
                                    a.this.f20190a.execute(a.this.new RunnableC0530a(a.this.f20191b.f20216o + "", a.this.f20191b.f20205d, a.this.f20191b.f20206e, a.this.f20192c.d()));
                                    if (a.this.f20191b.f20214m + 1 > a.this.f20191b.a() - 1) {
                                        p049e8.d dVar6 = a.this.f20191b;
                                        int i13 = dVar6.f20217p + 1;
                                        dVar6.f20217p = i13;
                                        if (i13 >= a.this.f20191b.f20204c) {
                                            dVar3 = a.this.f20194e;
                                            messageObtainMessage2 = a.this.f20194e.obtainMessage(1099);
                                            dVar4 = a.this.f20191b;
                                        } else {
                                            dVar3 = a.this.f20194e;
                                            messageObtainMessage2 = a.this.f20194e.obtainMessage(1007);
                                            dVar4 = a.this.f20191b;
                                        }
                                        i10 = dVar4.f20215n;
                                        dVar3.b(messageObtainMessage2, i10, true);
                                    } else {
                                        a.this.f20191b.f20214m++;
                                        dVar2 = a.this.f20194e;
                                        dVar5 = a.this.f20194e;
                                        messageObtainMessage = dVar5.obtainMessage(1001);
                                        dVar2.b(messageObtainMessage, 0, true);
                                    }
                                } else {
                                    sb = new StringBuilder();
                                    sb.append("ignore MSG_PLAY_PATTERN as status:");
                                    sb.append(a.this.f20191b.e());
                                    d8.d.a.a("Customizable-Player", sb.toString());
                                }
                                break;
                            case 1003:
                                a.this.f20192c.stop();
                                break;
                            default:
                                switch (i11) {
                                    case 1005:
                                        this.f20200a = 0;
                                        d8.d.a.a("Customizable-Player", "MSG_START mStartPosition:" + a.this.f20191b.f20209h + ", lastMediaPosition:" + this.f20200a);
                                        if (a.this.f20191b.f20209h >= 0 && a.this.f20191b.f20209h <= a.this.f20191b.f20208g.c()) {
                                            d8.d.a.a("Customizable-Player", "MSG_START will generate remainder and partial pattern!");
                                            a.this.f20191b.f20219r = p039d8.b.n(a.this.f20191b.f20202a, a.this.f20191b.f20209h);
                                            if (a.this.f20191b.f20219r == null) {
                                                d8.d.a.a("Customizable-Player", "null == mCurrentPlayingInfo.mRemainderHEString");
                                                p049e8.d dVar7 = a.this.f20191b;
                                                int i14 = dVar7.f20217p + 1;
                                                dVar7.f20217p = i14;
                                                if (i14 >= a.this.f20191b.f20204c) {
                                                    d8.d.a.a("Customizable-Player", "last loop finished!");
                                                    dVar2 = a.this.f20194e;
                                                    messageObtainMessage = a.this.f20194e.obtainMessage(1099);
                                                } else {
                                                    a.this.f20191b.b(6, 0);
                                                    dVar2 = a.this.f20194e;
                                                    messageObtainMessage = a.this.f20194e.obtainMessage(1007);
                                                }
                                            }
                                            dVar2.b(messageObtainMessage, 0, true);
                                        }
                                        a.this.f20191b.f20203b = SystemClock.elapsedRealtime();
                                        a.this.f20191b.b(6, 0);
                                        dVar2 = a.this.f20194e;
                                        dVar5 = a.this.f20194e;
                                        messageObtainMessage = dVar5.obtainMessage(1001);
                                        dVar2.b(messageObtainMessage, 0, true);
                                        break;
                                    case 1006:
                                        a.this.f20191b.getClass();
                                        long jElapsedRealtime = SystemClock.elapsedRealtime() - a.this.f20191b.f20203b;
                                        if (jElapsedRealtime >= 0) {
                                            p049e8.d dVar8 = a.this.f20191b;
                                            dVar8.f20209h = (int) (((long) dVar8.f20209h) + jElapsedRealtime);
                                            d8.d.a.a("Customizable-Player", "MSG_PAUSE mStartPosition:" + a.this.f20191b.f20209h);
                                            a.this.f20191b.b(7, 0);
                                        } else {
                                            d8.d.a.b("Customizable-Player", "pause delta < 0");
                                            a.this.f20191b.f20209h = 0;
                                            a.this.f20191b.b(2, 0);
                                        }
                                        break;
                                    case 1007:
                                        a.this.f20191b.f20209h = 0;
                                        a.this.f20191b.f20214m = 0;
                                        a.this.f20191b.f20218q = 0;
                                        this.f20200a = 0;
                                        dVar3 = a.this.f20194e;
                                        messageObtainMessage2 = a.this.f20194e.obtainMessage(1001);
                                        i10 = a.this.f20191b.f20207f;
                                        dVar3.b(messageObtainMessage2, i10, true);
                                        break;
                                    case 1008:
                                        a.this.f20191b.f20209h = message.arg1;
                                        this.f20200a = 0;
                                        if (6 == a.this.f20191b.e()) {
                                            a.this.f20194e.b(a.this.f20194e.obtainMessage(1005), 0, true);
                                        } else {
                                            d8.d.a.c("Customizable-Player", "MSG_SEEK status:" + a.this.f20191b.e());
                                        }
                                        dVar = a.this.f20191b;
                                        dVar.getClass();
                                        break;
                                }
                                break;
                        }
                    } else {
                        a.this.f20191b.f20209h = 0;
                        a.this.f20191b.f20214m = 0;
                        a.this.f20191b.f20217p = 0;
                        a.this.f20191b.f20218q = 0;
                        this.f20200a = 0;
                        a.this.f20191b.b(9, 0);
                    }
                } else if (6 != a.this.f20191b.e()) {
                    sb = new StringBuilder();
                    sb.append("ignore MSG_SYNC_WITH_MEDIA as status:");
                    sb.append(a.this.f20191b.e());
                    d8.d.a.a("Customizable-Player", sb.toString());
                } else if (a.this.f20191b.f20214m <= a.this.f20191b.a() - 1) {
                    dVar = a.this.f20191b;
                    dVar.getClass();
                }
            } catch (Throwable th) {
                d8.d.a.b("Customizable-Player", "checking it！！！");
                th.printStackTrace();
            }
            return false;
        }
    }

    private static class d extends Handler {
        d(Looper looper, Handler.Callback callback) {
            super(looper, callback);
        }

        public void a() {
            removeMessages(1005);
            removeMessages(1006);
            removeMessages(1008);
            removeMessages(1099);
            removeMessages(1007);
            removeMessages(1003);
            removeMessages(1001);
            removeMessages(1020);
            removeMessages(1002);
        }

        public boolean b(Message message, int i10, boolean z9) {
            if (z9) {
                a();
            }
            return sendMessageDelayed(message, i10);
        }
    }

    public a(p049e8.b bVar) {
        p049e8.d dVar = new p049e8.d();
        this.f20191b = dVar;
        d8.d.a.c("Customizable-Player", "initialize!");
        if (bVar == null) {
            d8.d.a.b("Customizable-Player", "CustomizableHapticPlayer() null == performer");
            dVar.b(2, 0);
        }
        this.f20192c = bVar;
        HandlerThread handlerThread = new HandlerThread("Customizable-Player");
        this.f20193d = handlerThread;
        handlerThread.start();
        this.f20194e = new d(handlerThread.getLooper(), new b());
    }

    @Override // p049e8.c
    public void a() {
        d8.d.a.c("Customizable-Player", " released!");
        if (e()) {
            d dVar = this.f20194e;
            dVar.b(dVar.obtainMessage(1003), 0, true);
        }
        this.f20191b.h();
        this.f20191b.b(1, 0);
        HandlerThread handlerThread = this.f20193d;
        if (handlerThread != null) {
            handlerThread.quit();
        }
        ExecutorService executorService = this.f20190a;
        if (executorService != null) {
            executorService.shutdown();
        }
    }

    @Override // p049e8.c
    public void b() {
        if (e()) {
            d dVar = this.f20194e;
            dVar.b(dVar.obtainMessage(1003), 0, true);
        }
        this.f20191b.h();
        this.f20191b.b(0, 0);
    }

    @Override // p049e8.c
    public void c() throws Throwable {
        if (3 != this.f20191b.e() && 8 != this.f20191b.e()) {
            d8.d.a.d("Customizable-Player", "call prepare() in invalid status:" + this.f20191b.e() + ", do nothing!");
            return;
        }
        if (1 == p039d8.b.q(this.f20191b.f20202a)) {
            p049e8.d dVar = this.f20191b;
            dVar.f20202a = p039d8.b.e(dVar.f20202a);
        }
        p049e8.d dVar2 = this.f20191b;
        String str = dVar2.f20202a;
        dVar2.f20212k = str;
        p029c8.a aVarP = p039d8.b.p(str);
        if (!p049e8.d.d(aVarP)) {
            d8.d.a.b("Customizable-Player", "prepare error, invalid HE");
            this.f20191b.h();
            this.f20191b.b(2, 4097);
            return;
        }
        p049e8.d dVar3 = this.f20191b;
        dVar3.f20208g = aVarP;
        dVar3.g();
        this.f20192c.c(this.f20191b.f20213l);
        this.f20192c.b(255);
        this.f20191b.b(5, 0);
        p039d8.d.b("prepared.he", this.f20191b.f20202a);
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0047 A[PHI: r4
      0x0047: PHI (r4v8 int) = (r4v1 int), (r4v2 int) binds: [B:12:0x0045, B:15:0x004c] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // p049e8.c
    public void d(String str, int i10, int i11, int i12, int i13, p059f8.a aVar) {
        if (this.f20191b.e() != 0) {
            d8.d.a.d("Customizable-Player", "setDataSource in invalid status:" + this.f20191b.e() + ",do nothing!");
            return;
        }
        this.f20191b.h();
        p049e8.d dVar = this.f20191b;
        dVar.f20202a = str;
        dVar.f20205d = i10;
        dVar.f20206e = i11;
        if (i10 > 511) {
            dVar.f20205d = 511;
        } else if (i10 < 0) {
            dVar.f20205d = 0;
        }
        int i14 = 100;
        if (i11 > 100) {
            dVar.f20206e = i14;
        } else {
            i14 = -100;
            if (i11 < -100) {
                dVar.f20206e = i14;
            }
        }
        if (i12 >= 0) {
            dVar.f20204c = i12 + 1;
        } else {
            dVar.f20204c = -1 == i12 ? SubsamplingScaleImageView.TILE_SIZE_AUTO : 1;
        }
        if (i13 >= 0) {
            dVar.f20207f = i13;
        }
        d8.d.a.a("Customizable-Player", "will change to initialized!");
        this.f20191b.b(3, 0);
    }

    @Override // p049e8.c
    public boolean e() {
        return 6 == this.f20191b.e();
    }

    @Override // p049e8.c
    public void start() {
        if (5 != this.f20191b.e() && 7 != this.f20191b.e() && 9 != this.f20191b.e()) {
            d8.d.a.d("Customizable-Player", "call start() in invalid status:" + this.f20191b.e() + ", do nothing!");
            return;
        }
        d8.d.a.a("Customizable-Player", "  start() in, mCurrentHePausePosition:" + this.f20191b.f20209h);
        if (9 == this.f20191b.e()) {
            d8.d.a.a("Customizable-Player", "  start() return, already COMPLETED, start from 0");
            this.f20191b.f20209h = 0;
        }
        d dVar = this.f20194e;
        dVar.b(dVar.obtainMessage(1005), 0, true);
        this.f20191b.b(6, 0);
    }

    @Override // p049e8.c
    public void stop() {
        if (6 == this.f20191b.e() || 7 == this.f20191b.e() || 9 == this.f20191b.e()) {
            d dVar = this.f20194e;
            dVar.b(dVar.obtainMessage(1003), 0, true);
            this.f20191b.h();
            this.f20191b.b(8, 0);
            return;
        }
        d8.d.a.d("Customizable-Player", "call stop() in invalid status:" + this.f20191b.e() + ", do nothing!");
    }
}
