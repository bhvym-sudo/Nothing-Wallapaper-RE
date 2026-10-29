package p162q1;

import android.util.Log;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.internal.AbstractC1457h;
import kotlin.jvm.internal.n;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final C0635a f23877e = new C0635a(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final Map f23878f = new HashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f23879a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final File f23880b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Lock f23881c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private FileChannel f23882d;

    /* JADX INFO: renamed from: q1.a$a, reason: collision with other inner class name */
    public static final class C0635a {
        public /* synthetic */ C0635a(AbstractC1457h abstractC1457h) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final Lock b(String str) {
            Lock lock;
            synchronized (a.f23878f) {
                try {
                    Map map = a.f23878f;
                    Object reentrantLock = map.get(str);
                    if (reentrantLock == null) {
                        reentrantLock = new ReentrantLock();
                        map.put(str, reentrantLock);
                    }
                    lock = (Lock) reentrantLock;
                } catch (Throwable th) {
                    throw th;
                }
            }
            return lock;
        }

        private C0635a() {
        }
    }

    public a(String name, File file, boolean z9) {
        File file2;
        n.h(name, "name");
        this.f23879a = z9;
        if (file != null) {
            file2 = new File(file, name + ".lck");
        } else {
            file2 = null;
        }
        this.f23880b = file2;
        this.f23881c = f23877e.b(name);
    }

    public static /* synthetic */ void c(a aVar, boolean z9, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z9 = aVar.f23879a;
        }
        aVar.b(z9);
    }

    public final void b(boolean z9) {
        this.f23881c.lock();
        if (z9) {
            try {
                File file = this.f23880b;
                if (file == null) {
                    throw new IOException("No lock directory was provided.");
                }
                File parentFile = file.getParentFile();
                if (parentFile != null) {
                    parentFile.mkdirs();
                }
                FileChannel channel = new FileOutputStream(this.f23880b).getChannel();
                channel.lock();
                this.f23882d = channel;
            } catch (IOException e10) {
                this.f23882d = null;
                Log.w("SupportSQLiteLock", "Unable to grab file lock.", e10);
            }
        }
    }

    public final void d() {
        try {
            FileChannel fileChannel = this.f23882d;
            if (fileChannel != null) {
                fileChannel.close();
            }
        } catch (IOException unused) {
        }
        this.f23881c.unlock();
    }
}
