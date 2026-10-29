package com.nothing.wallpaper.common.log;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.util.Log;
import android.util.Pair;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import p087i6.f;

/* JADX INFO: loaded from: classes2.dex */
public final class FileLog {
    private static final boolean ENABLED = true;
    private static String FILE_NAME_PREFIX = "log-";
    public static final int LOG_DAYS = 4;
    private static final long MAX_LOG_FILE_SIZE = 16777216;
    private static final int MAX_LOG_KEEP_TIME_HOUR = 168;
    private static String sProcess;
    private static final DateFormat DATE_FORMAT = DateFormat.getDateTimeInstance(3, 3);
    private static Handler sHandler = null;
    private static File sLogsDirectory = null;

    private static class a implements Handler.Callback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f18433a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private PrintWriter f18434b;

        private void a() {
            PrintWriter printWriter = this.f18434b;
            if (printWriter != null) {
                printWriter.close();
                this.f18434b = null;
            }
        }

        private void b(int i10, long j9) {
            synchronized (FileLog.DATE_FORMAT) {
                try {
                    Handler handler = FileLog.sHandler;
                    if (handler != null) {
                        handler.removeMessages(i10);
                        handler.sendEmptyMessageDelayed(i10, j9);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) throws Throwable {
            if (FileLog.sLogsDirectory != null) {
                int i10 = message.what;
                boolean z9 = false;
                z9 = false;
                z9 = false;
                if (i10 != 1) {
                    if (i10 == 2) {
                        a();
                        return FileLog.ENABLED;
                    }
                    if (i10 != 3) {
                        return FileLog.ENABLED;
                    }
                    a();
                    Pair pair = (Pair) message.obj;
                    if (pair.first != null) {
                        for (int i11 = 0; i11 < 4; i11++) {
                            FileLog.dumpFile((PrintWriter) pair.first, FileLog.FILE_NAME_PREFIX + i11);
                        }
                    }
                    ((CountDownLatch) pair.second).countDown();
                    return FileLog.ENABLED;
                }
                Calendar calendar = Calendar.getInstance();
                String str = FileLog.FILE_NAME_PREFIX + (calendar.get(6) % 4);
                if (!str.equals(this.f18433a)) {
                    a();
                }
                try {
                    if (this.f18434b == null) {
                        this.f18433a = str;
                        File file = new File(FileLog.sLogsDirectory, str);
                        if (file.exists()) {
                            Calendar calendar2 = Calendar.getInstance();
                            calendar2.setTimeInMillis(file.lastModified());
                            calendar2.add(10, 168);
                            if (calendar.before(calendar2) && file.length() < FileLog.MAX_LOG_FILE_SIZE) {
                                z9 = true;
                            }
                        }
                        this.f18434b = new PrintWriter(new FileWriter(file, z9));
                    }
                    this.f18434b.println((String) message.obj);
                    this.f18434b.flush();
                    b(2, 5000L);
                } catch (Exception e10) {
                    Log.e("FileLog", "Error writing logs to file", e10);
                    a();
                }
            }
            return FileLog.ENABLED;
        }

        private a() {
            this.f18433a = null;
            this.f18434b = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void dumpFile(PrintWriter printWriter, String str) throws Throwable {
        File file = new File(sLogsDirectory, str);
        if (!file.exists()) {
            return;
        }
        BufferedReader bufferedReader = null;
        try {
            BufferedReader bufferedReader2 = new BufferedReader(new FileReader(file));
            try {
                printWriter.println();
                printWriter.println("--- logfile: " + str + " ---");
                while (true) {
                    String line = bufferedReader2.readLine();
                    if (line == null) {
                        f.a(bufferedReader2);
                        return;
                    }
                    printWriter.println(line);
                }
            } catch (Exception unused) {
                bufferedReader = bufferedReader2;
                f.a(bufferedReader);
            } catch (Throwable th) {
                th = th;
                bufferedReader = bufferedReader2;
                f.a(bufferedReader);
                throw th;
            }
        } catch (Exception unused2) {
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public static boolean flushAll(PrintWriter printWriter) throws InterruptedException {
        CountDownLatch countDownLatch = new CountDownLatch(1);
        Message.obtain(getHandler(), 3, Pair.create(printWriter, countDownLatch)).sendToTarget();
        countDownLatch.await(2L, TimeUnit.SECONDS);
        if (countDownLatch.getCount() == 0) {
            return ENABLED;
        }
        return false;
    }

    static Handler getHandler() {
        synchronized (DATE_FORMAT) {
            try {
                if (sHandler == null) {
                    sHandler = new Handler(com.nothing.wallpaper.common.log.a.a("file-logger"), new a());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return sHandler;
    }

    public static File[] getLogFiles() {
        try {
            flushAll(null);
        } catch (InterruptedException unused) {
        }
        File[] fileArr = new File[4];
        for (int i10 = 0; i10 < 4; i10++) {
            fileArr[i10] = new File(sLogsDirectory, FILE_NAME_PREFIX + i10);
        }
        return fileArr;
    }

    public static void i(String str, String str2, Exception exc) {
        Log.i(str, str2, exc);
        print(str, str2, exc);
    }

    public static void print(String str, String str2) {
        print(str, str2, null);
    }

    public static void setDir(File file, String str) {
        String str2;
        synchronized (DATE_FORMAT) {
            try {
                if (sHandler != null && !file.equals(sLogsDirectory)) {
                    ((HandlerThread) sHandler.getLooper().getThread()).quit();
                    sHandler = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        sLogsDirectory = file;
        sProcess = str;
        StringBuilder sb = new StringBuilder();
        sb.append(FILE_NAME_PREFIX);
        if (sProcess == null) {
            str2 = "";
        } else {
            str2 = sProcess + "-";
        }
        sb.append(str2);
        FILE_NAME_PREFIX = sb.toString();
    }

    public static void w(String str, String str2, Exception exc) {
        Log.w(str, str2, exc);
        print(str, str2, exc);
    }

    public static void d(String str, String str2, Exception exc) {
        Log.d(str, str2, exc);
        print(str, str2, exc);
    }

    public static void e(String str, String str2, Exception exc) {
        Log.e(str, str2, exc);
        print(str, str2, exc);
    }

    public static void print(String str, String str2, Exception exc) {
        String str3 = String.format("%s %s %s", DATE_FORMAT.format(new Date()), str, str2);
        if (exc != null) {
            str3 = str3 + "\n" + Log.getStackTraceString(exc);
        }
        Message.obtain(getHandler(), 1, str3).sendToTarget();
    }

    public static void i(String str, String str2) {
        Log.i(str, str2);
        print(str, str2);
    }

    public static void w(String str, String str2) {
        Log.w(str, str2);
        print(str, str2);
    }

    public static void d(String str, String str2) {
        Log.d(str, str2);
        print(str, str2);
    }

    public static void e(String str, String str2) {
        Log.e(str, str2);
        print(str, str2);
    }
}
