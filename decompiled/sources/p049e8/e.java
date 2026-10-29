package p049e8;

import android.os.VibrationEffect;
import android.os.Vibrator;
import java.util.ArrayList;
import p039d8.b;
import p039d8.d;

/* JADX INFO: loaded from: classes2.dex */
public class e implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    Vibrator f20220a;

    public e(Vibrator vibrator) {
        if (vibrator == null) {
            d.a.b("GooglePerformer", "GooglePerformer(Vibrator), vibrator == null");
        } else {
            this.f20220a = vibrator;
        }
    }

    @Override // p049e8.b
    public void a(String str) {
        try {
            String strG = b.g(str, true);
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            b.i(strG, arrayList, arrayList2);
            if (arrayList.size() != 0 && arrayList.size() == arrayList2.size()) {
                d.a.a("GooglePerformer", "timings:" + arrayList.toString() + ",amplitudes:" + arrayList2.toString());
                long[] jArr = new long[arrayList.size()];
                int[] iArr = new int[arrayList2.size()];
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    jArr[i10] = ((Long) arrayList.get(i10)).longValue();
                    iArr[i10] = ((Integer) arrayList2.get(i10)).intValue();
                }
                this.f20220a.vibrate(VibrationEffect.createWaveform(jArr, iArr, -1));
                return;
            }
            d.a.b("GooglePerformer", "start(String), invalid timings and amplitudes!");
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    @Override // p049e8.b
    public void stop() {
        Vibrator vibrator = this.f20220a;
        if (vibrator == null) {
            d.a.b("GooglePerformer", "stop(), null == mVibrator!");
        } else {
            vibrator.cancel();
        }
    }
}
