package p167q6;

import android.content.Context;
import android.os.VibrationAttributes;
import android.os.VibrationEffect;
import android.os.Vibrator;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import kotlin.jvm.internal.n;

/* JADX INFO: loaded from: classes2.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f25110a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ExecutorService f25111b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Vibrator f25112c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f25113d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final VibrationAttributes f25114e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final VibrationEffect f25115f;

    public f(Context context) {
        n.h(context, "context");
        this.f25110a = context;
        this.f25111b = Executors.newSingleThreadExecutor();
        Vibrator vibrator = (Vibrator) context.getSystemService(Vibrator.class);
        this.f25112c = vibrator;
        this.f25113d = vibrator != null ? vibrator.hasVibrator() : false;
        VibrationAttributes vibrationAttributesCreateForUsage = VibrationAttributes.createForUsage(18);
        n.g(vibrationAttributesCreateForUsage, "createForUsage(...)");
        this.f25114e = vibrationAttributesCreateForUsage;
        VibrationEffect vibrationEffectCreatePredefined = VibrationEffect.createPredefined(0);
        n.g(vibrationEffectCreatePredefined, "createPredefined(...)");
        this.f25115f = vibrationEffectCreatePredefined;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(f fVar) {
        Vibrator vibrator = fVar.f25112c;
        if (vibrator != null) {
            vibrator.vibrate(fVar.f25115f, fVar.f25114e);
        }
    }

    public final void b() {
        if (this.f25113d) {
            this.f25111b.execute(new Runnable() { // from class: q6.e
                @Override // java.lang.Runnable
                public final void run() {
                    f.c(this.f25109q);
                }
            });
        }
    }
}
