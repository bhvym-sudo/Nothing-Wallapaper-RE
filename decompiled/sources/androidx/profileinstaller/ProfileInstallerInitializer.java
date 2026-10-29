package androidx.profileinstaller;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import androidx.profileinstaller.ProfileInstallerInitializer;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public class ProfileInstallerInitializer implements p172r1.a {

    private static class a {
        public static Handler a(Looper looper) {
            return Handler.createAsync(looper);
        }
    }

    public static class b {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void h(final Context context) {
        new ThreadPoolExecutor(0, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue()).execute(new Runnable() { // from class: e1.f
            @Override // java.lang.Runnable
            public final void run() {
                androidx.profileinstaller.f.h(context);
            }
        });
    }

    @Override // p172r1.a
    public List a() {
        return Collections.EMPTY_LIST;
    }

    @Override // p172r1.a
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public b b(Context context) {
        final Context applicationContext = context.getApplicationContext();
        Choreographer.getInstance().postFrameCallback(new Choreographer.FrameCallback() { // from class: e1.d
            @Override // android.view.Choreographer.FrameCallback
            public final void doFrame(long j9) {
                this.f19779q.g(applicationContext);
            }
        });
        return new b();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void g(final Context context) {
        a.a(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: e1.e
            @Override // java.lang.Runnable
            public final void run() {
                ProfileInstallerInitializer.h(context);
            }
        }, new Random().nextInt(Math.max(1000, 1)) + 5000);
    }
}
