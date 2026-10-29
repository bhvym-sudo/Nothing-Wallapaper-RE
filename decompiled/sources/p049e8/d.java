package p049e8;

import android.os.Process;
import android.os.SystemClock;
import android.util.Log;
import p009a8.c;
import p029c8.a;

/* JADX INFO: loaded from: classes2.dex */
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f20202a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f20203b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f20204c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f20205d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f20206e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f20207f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public a f20208g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f20209h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f20210i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public float f20211j = 1.0f;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public String f20212k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public String f20213l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f20214m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f20215n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public String f20216o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f20217p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f20218q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public String f20219r;

    private boolean c(int i10) {
        return i10 >= 0 && i10 <= 9;
    }

    public static boolean d(c cVar) {
        return c.b(cVar);
    }

    private boolean f(int i10, int i11) {
        if (!c(i10) || !c(i11)) {
            return false;
        }
        switch (i10) {
            case 0:
                return i11 == 0 || 2 == i11 || 1 == i11 || 3 == i11;
            case 1:
                return 1 == i11;
            case 2:
                return 2 == i11;
            case 3:
                return i11 == 0 || 2 == i11 || 1 == i11 || 3 == i11 || 4 == i11 || 5 == i11;
            case 4:
                return 2 == i11 || i11 == 0 || 1 == i11 || 4 == i11 || 5 == i11;
            case 5:
                return 2 == i11 || i11 == 0 || 1 == i11 || 5 == i11 || 6 == i11 || 8 == i11;
            case 6:
            case 7:
                return 2 == i11 || i11 == 0 || 1 == i11 || 6 == i11 || 8 == i11 || 7 == i11 || 9 == i11;
            case 8:
                return 2 == i11 || i11 == 0 || 1 == i11 || 4 == i11 || 5 == i11 || 8 == i11;
            case 9:
                return 2 == i11 || i11 == 0 || 1 == i11 || 6 == i11 || 7 == i11 || 9 == i11;
            default:
                return false;
        }
    }

    public int a() {
        a aVar = this.f20208g;
        if (aVar == null) {
            return -1;
        }
        int iA = aVar.a();
        a aVar2 = this.f20208g;
        if (2 == iA) {
            return aVar2.f15244b.size();
        }
        if (1 == aVar2.a()) {
            return 1;
        }
        Log.w("CurrentPlayingInfo", "getPatternCount(), invalid HE version!");
        return -1;
    }

    public void b(int i10, int i11) {
        String str;
        Log.d("CurrentPlayingInfo", "changePlayerStatus, from:" + this.f20210i + ",to:" + i10 + ", code:" + i11);
        if (!f(this.f20210i, i10)) {
            str = "changePlayerStatus, invalid transition, from " + this.f20210i + " to " + i10;
        } else {
            if (i10 != this.f20210i || i11 == 0) {
                this.f20210i = i10;
                return;
            }
            str = "changePlayerStatus, needn't update";
        }
        Log.w("CurrentPlayingInfo", str);
    }

    public int e() {
        return this.f20210i;
    }

    public void g() {
        String str = this.f20213l;
        if (str != null && str.length() != 0) {
            p039d8.c.c(this.f20213l);
        }
        String str2 = Process.myTid() + "," + SystemClock.elapsedRealtime();
        this.f20213l = str2;
        p039d8.c.b(str2);
    }

    public void h() {
        Log.d("CurrentPlayingInfo", "reset!");
        this.f20202a = null;
        this.f20203b = 0L;
        this.f20204c = 0;
        this.f20205d = 255;
        this.f20206e = 0;
        this.f20207f = 0;
        this.f20208g = null;
        this.f20209h = 0;
        this.f20210i = 0;
        this.f20211j = 1.0f;
        this.f20212k = null;
        this.f20214m = 0;
        this.f20216o = null;
        this.f20217p = 0;
        this.f20218q = 0;
        this.f20219r = null;
        String str = this.f20213l;
        if (str != null && str.length() != 0) {
            p039d8.c.c(this.f20213l);
        }
        this.f20213l = null;
    }

    public String toString() {
        return "CurrentPlayingHeInfo{mHeString='" + this.f20202a + "', mStartTime=" + this.f20203b + ", mLoop=" + this.f20204c + ", mAmplitude=" + this.f20205d + ", mFreq=" + this.f20206e + ", mHeRoot=" + this.f20208g + ", mSyncCallback=" + ((Object) null) + ", mStartPosition=" + this.f20209h + ", mStatus:" + this.f20210i + ", mSpeedMultiple:" + this.f20211j + '}';
    }
}
