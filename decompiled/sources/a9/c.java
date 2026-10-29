package a9;

import P8.z;
import android.util.Log;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.jvm.internal.n;
import p089i8.N;

/* JADX INFO: loaded from: classes2.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c f9966a = new c();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final CopyOnWriteArraySet f9967b = new CopyOnWriteArraySet();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Map f9968c;

    static {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Package r9 = z.class.getPackage();
        String name = r9 != null ? r9.getName() : null;
        if (name != null) {
            linkedHashMap.put(name, "OkHttp");
        }
        String name2 = z.class.getName();
        n.g(name2, "OkHttpClient::class.java.name");
        linkedHashMap.put(name2, "okhttp.OkHttpClient");
        String name3 = X8.e.class.getName();
        n.g(name3, "Http2::class.java.name");
        linkedHashMap.put(name3, "okhttp.Http2");
        String name4 = T8.e.class.getName();
        n.g(name4, "TaskRunner::class.java.name");
        linkedHashMap.put(name4, "okhttp.TaskRunner");
        linkedHashMap.put("okhttp3.mockwebserver.MockWebServer", "okhttp.MockWebServer");
        f9968c = N.p(linkedHashMap);
    }

    private c() {
    }

    private final void c(String str, String str2) {
        Level level;
        Logger logger = Logger.getLogger(str);
        if (f9967b.add(logger)) {
            logger.setUseParentHandlers(false);
            if (Log.isLoggable(str2, 3)) {
                level = Level.FINE;
            } else {
                level = Log.isLoggable(str2, 4) ? Level.INFO : Level.WARNING;
            }
            logger.setLevel(level);
            logger.addHandler(d.f9969a);
        }
    }

    private final String d(String str) {
        String str2 = (String) f9968c.get(str);
        return str2 == null ? E8.i.Q0(str, 23) : str2;
    }

    public final void a(String loggerName, int i10, String message, Throwable th) {
        int iMin;
        n.h(loggerName, "loggerName");
        n.h(message, "message");
        String strD = d(loggerName);
        if (Log.isLoggable(strD, i10)) {
            if (th != null) {
                message = message + '\n' + Log.getStackTraceString(th);
            }
            String str = message;
            int length = str.length();
            int i11 = 0;
            while (i11 < length) {
                int iC0 = E8.i.c0(str, '\n', i11, false, 4, null);
                if (iC0 == -1) {
                    iC0 = length;
                }
                while (true) {
                    iMin = Math.min(iC0, i11 + 4000);
                    String strSubstring = str.substring(i11, iMin);
                    n.g(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                    Log.println(i10, strD, strSubstring);
                    if (iMin >= iC0) {
                        break;
                    } else {
                        i11 = iMin;
                    }
                }
                i11 = iMin + 1;
            }
        }
    }

    public final void b() {
        for (Map.Entry entry : f9968c.entrySet()) {
            c((String) entry.getKey(), (String) entry.getValue());
        }
    }
}
