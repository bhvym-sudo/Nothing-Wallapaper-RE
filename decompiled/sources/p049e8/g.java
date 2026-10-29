package p049e8;

import android.content.Context;
import android.os.Process;
import android.os.VibrationEffect;
import android.os.Vibrator;
import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;
import p039d8.b;
import p039d8.c;
import p039d8.d;

/* JADX INFO: loaded from: classes2.dex */
public class g implements b {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static int f20225h = -1;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static int f20226i = -1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Vibrator f20227a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Context f20228b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Class f20229c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f20230d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f20232f;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private AtomicInteger f20231e = new AtomicInteger();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f20233g = 255;

    public g(Context context) {
        this.f20228b = context;
        this.f20227a = (Vibrator) context.getSystemService("vibrator");
        try {
            this.f20229c = Class.forName("richtap.os.PhonyVibrationEffect");
        } catch (ClassNotFoundException unused) {
            this.f20229c = null;
            d.a.c("RichTapPerformer", "failed to reflect class: \"richtap.os.PhonyVibrationEffect\"!");
        }
        if (this.f20229c == null) {
            try {
                this.f20229c = Class.forName("android.os.RichTapVibrationEffect");
            } catch (ClassNotFoundException unused2) {
                this.f20229c = null;
                d.a.c("RichTapPerformer", "failed to reflect class: \"android.os.RichTapVibrationEffect\"!");
            }
        }
        if (this.f20229c == null) {
            try {
                this.f20229c = Class.forName("android.os.VibrationEffect");
            } catch (ClassNotFoundException unused3) {
                d.a.c("RichTapPerformer", "failed to reflect class: \"android.os.VibrationEffect\"!");
            }
        }
        g();
    }

    private void e(int i10, int i11, int i12) {
        if (f20225h <= 0) {
            d.a.b("RichTapPerformer", "applyPatternHeParam, CORE_MAJOR_VERSION:" + f20225h);
            return;
        }
        try {
            d.a.c("RichTapPerformer", "applyPatternHeParam, interval:" + i10 + ", amplitude:" + i11 + ",freq:" + i12);
            Class cls = this.f20229c;
            Class cls2 = Integer.TYPE;
            this.f20227a.vibrate((VibrationEffect) cls.getMethod("createPatternHeParameter", cls2, cls2, cls2).invoke(null, Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(i12)));
        } catch (Throwable th) {
            th.printStackTrace();
            d.a.d("RichTapPerformer", "The system doesn't integrate RichTap software");
        }
    }

    public static boolean f() {
        Class<?> cls;
        try {
            try {
                cls = Class.forName("richtap.os.PhonyVibrationEffect");
            } catch (ClassNotFoundException unused) {
                d.a.c("RichTapPerformer", "failed to reflect class: \"richtap.os.PhonyVibrationEffect\"!");
                cls = null;
            }
            if (cls == null) {
                try {
                    cls = Class.forName("android.os.RichTapVibrationEffect");
                } catch (ClassNotFoundException unused2) {
                    d.a.c("RichTapPerformer", "failed to reflect class: \"android.os.RichTapVibrationEffect\"!");
                    cls = null;
                }
            }
            if (cls == null) {
                try {
                    cls = Class.forName("android.os.VibrationEffect");
                } catch (ClassNotFoundException unused3) {
                    d.a.c("RichTapPerformer", "failed to reflect class: \"android.os.VibrationEffect\"!");
                }
            }
            return 2 != ((Integer) cls.getMethod("checkIfRichTapSupport", new Class[0]).invoke(null, new Object[0])).intValue();
        } catch (Throwable th) {
            th.printStackTrace();
            return false;
        }
    }

    private void g() {
        try {
            if (this.f20228b != null && this.f20227a != null) {
                int iIntValue = ((Integer) this.f20229c.getMethod("checkIfRichTapSupport", new Class[0]).invoke(null, new Object[0])).intValue();
                d.a.a("RichTapPerformer", "getRichTapCoreMajorVersion check framework RichTap version:" + iIntValue);
                if (1 == iIntValue) {
                    return;
                }
                StringBuilder sb = new StringBuilder();
                sb.append("clientCode:");
                sb.append((16711680 & iIntValue) >> 16);
                sb.append(" majorVersion:");
                int i10 = (65280 & iIntValue) >> 8;
                sb.append(i10);
                sb.append(" minorVersion:");
                int i11 = iIntValue & 255;
                sb.append(i11);
                d.a.a("RichTapPerformer", sb.toString());
                f20225h = i10;
                f20226i = i11;
                return;
            }
            d.a.b("RichTapPerformer", "getRichTapCoreMajorVersion mContext or mVibrator null");
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    @Override // p049e8.b
    public void a(String str) {
        int i10;
        int iMyPid;
        int iIncrementAndGet;
        String str2 = this.f20230d;
        int[] iArrA = str2 != null ? c.a(str2) : null;
        int i11 = f20225h;
        if (i11 <= 0) {
            d.a.b("RichTapPerformer", "start(), mRichTapCoreMajorVersion:" + f20225h);
            return;
        }
        if (23 >= i11) {
            str = b.g(str, true);
            i10 = 1;
        } else {
            i10 = 2;
        }
        String str3 = str;
        if (iArrA == null || 2 != iArrA.length) {
            iMyPid = Process.myPid();
            iIncrementAndGet = this.f20231e.incrementAndGet() % SubsamplingScaleImageView.TILE_SIZE_AUTO;
        } else {
            iMyPid = iArrA[0];
            iIncrementAndGet = iArrA[1];
        }
        int[] iArrJ = b.j(str3, i10, f20225h, f20226i, iMyPid, iIncrementAndGet, this.f20232f);
        try {
            d.a.a("RichTapPerformer", "start() mGain:" + this.f20233g + " raw data:" + Arrays.toString(iArrJ));
            Class cls = this.f20229c;
            Class cls2 = Integer.TYPE;
            this.f20227a.vibrate((VibrationEffect) cls.getMethod("createPatternHeWithParam", int[].class, cls2, cls2, cls2, cls2).invoke(null, iArrJ, 1, 0, Integer.valueOf(this.f20233g), 0));
        } catch (Throwable th) {
            d.a.d("RichTapPerformer", "The system doesn't integrate richTap software");
            th.printStackTrace();
        }
    }

    @Override // p049e8.b
    public void c(String str) {
        d.a.a("RichTapPerformer", "setSenderIdKey:" + str);
        this.f20230d = str;
    }

    @Override // p049e8.b
    public int d() {
        return f20225h;
    }

    @Override // p049e8.b
    public void stop() {
        d.a.a("RichTapPerformer", "stop()");
        e(0, 0, 0);
    }
}
