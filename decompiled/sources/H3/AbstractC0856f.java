package H3;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.util.Log;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: H3.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0856f {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static Handler f2472d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static HandlerThread f2473e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final SimpleDateFormat f2469a = new SimpleDateFormat("EEE MMM dd HH:mm:ss.SSS z yyyy", Locale.US);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Object f2470b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final long f2471c = TimeUnit.MILLISECONDS.convert(2, TimeUnit.MINUTES);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final Runnable f2474f = new a();

    /* JADX INFO: renamed from: H3.f$a */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (AbstractC0856f.f2473e == null || !AbstractC0856f.f2473e.isAlive()) {
                return;
            }
            if (!AbstractC0856f.f2473e.quitSafely()) {
                Log.e("DiskBasedLogger", "Unable to quit disk-based logger HandlerThread");
            }
            AbstractC0856f.f2473e = null;
            AbstractC0856f.f2472d = null;
        }
    }

    public static /* synthetic */ void a(Context context, String str, String str2) {
        File file = new File(context.getFilesDir(), "logs.txt");
        String str3 = f2469a.format(Calendar.getInstance().getTime()) + "/E " + str + ": " + str2 + "\n";
        synchronized (f2470b) {
            try {
                FileOutputStream fileOutputStreamOpenFileOutput = context.openFileOutput(file.getName(), 32768);
                fileOutputStreamOpenFileOutput.write(str3.getBytes(StandardCharsets.UTF_8));
                fileOutputStreamOpenFileOutput.close();
            } catch (IOException e10) {
                Log.e("DiskBasedLogger", "Unable to close output stream for disk-based log buffer", e10);
            }
        }
    }

    public static void e(final String str, final String str2, final Context context) {
        Log.e(str, str2);
        String str3 = Build.TYPE;
        if (str3.equals("eng") || str3.equals("userdebug")) {
            Handler handlerF = f();
            if (handlerF == null) {
                Log.e("DiskBasedLogger", "Something went wrong creating the logger thread handler, quitting this logging operation");
            } else {
                handlerF.post(new Runnable() { // from class: H3.e
                    @Override // java.lang.Runnable
                    public final void run() {
                        AbstractC0856f.a(context, str, str2);
                    }
                });
            }
        }
    }

    private static Handler f() {
        Handler handler;
        synchronized (f2470b) {
            try {
                if (f2473e == null) {
                    g();
                    f2472d = new Handler(f2473e.getLooper());
                } else {
                    f2472d.removeCallbacks(f2474f);
                }
                f2472d.postDelayed(f2474f, f2471c);
                handler = f2472d;
            } catch (Throwable th) {
                throw th;
            }
        }
        return handler;
    }

    private static void g() {
        HandlerThread handlerThread = new HandlerThread("DiskBasedLoggerThread", 10);
        f2473e = handlerThread;
        handlerThread.start();
    }
}
